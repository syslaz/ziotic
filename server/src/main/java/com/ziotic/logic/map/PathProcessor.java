/*
 * Copyright (c) 2024 Lazaro Brito
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.ziotic.logic.map;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.ziotic.Static;
import com.ziotic.logic.Entity;
import com.ziotic.logic.map.Directions.NormalDirection;
import com.ziotic.logic.npc.NPC;
import com.ziotic.logic.object.GameObject;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

/**
 * @author Lazaro
 */
public abstract class PathProcessor {
    private static final Logger logger = Logging.log();

    public static final int MAX_SIZE = 255;
    public static final int MOVE_SPEED_ANY = 0, MOVE_SPEED_RUN = 1, MOVE_SPEED_WALK = 2;

    private Entity entity;

    protected PathBuffer buffer = new PathBuffer();
    protected CoordinateFuture coordinateFuture = null;
    protected int moveSpeed = MOVE_SPEED_ANY;

    public PathRequest pathRequest = null;

    private Tile[] history = new Tile[16];

    private Set<Entity> hooked = new HashSet<Entity>();

    public PathProcessor(Entity entity) {
        this.entity = entity;
    }

    public PathBuffer getBuffer() {
        return buffer;
    }

    public void add(final Tile tile) {
        buffer.add(tile);
    }

    public void add(final List<Tile> path) {
        for (Tile tile : path) {
            buffer.add(tile);
        }
    }

    public void add(final Tile[] path) {
        for (Tile tile : path) {
            buffer.add(tile);
        }
    }

    public void hookEntity(Entity entity) {
        hooked.add(entity);
    }

    public void unhookEntity(Entity entity) {
        hooked.remove(entity);
    }

    public boolean isHooked(Entity entity) {
        return hooked.contains(entity);
    }

    public boolean moving() {
        return buffer.remaining() > 0;
    }

    public void reset() {
        reset(false);
    }

    public void reset(boolean nullCoordinateFuture) {
        buffer.clear();
        moveSpeed = MOVE_SPEED_ANY;
        if (nullCoordinateFuture) {
            coordinateFuture = null;
        }
    }

    public Tile getDestination() {
        if (buffer.remaining() <= 0) {
            return null;
        }
        return buffer.getLast();
    }

    public int size() {
        return buffer.remaining();
    }

    public int steps() {
        int dist = 0;
        Tile last = entity.getLocation();
        for (Tile tile : buffer) {
            dist += last.distance(tile);
            last = tile;
        }
        return dist;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public CoordinateFuture getCoordinateFuture() {
        return coordinateFuture;
    }

    public void setCoordinateFuture(CoordinateFuture coordinateFuture) {
        this.coordinateFuture = coordinateFuture;
    }

    public void updateCoordinateFuture() {
        if (coordinateFuture != null && coordinateFuture.isReady()) { // Check if there is a coordinate future.
            if (coordinateFuture.update()) { // Update the coordinate future, and check if we should remove it.
                coordinateFuture = null; // Remove the coordinate future.
            }
        }
    }

    public Tile[] getHistory() {
        return history;
    }

    public void updateHistory(final Tile tile) {
        for (int i = history.length - 2; i >= 0; i--) {
            history[i + 1] = history[i];
        }
        history[0] = tile;

        if (moving()) {
            for (final Entity e : hooked) {
                if (entity.getIndex() > e.getIndex()) {
                    e.getPathProcessor().add(history[1]);
                } else {
                    //if(!e.getPathProcessor().moving()) {
                    //e.getPathProcessor().add(Tile.PLACE_HOLDER);
                    //}
                    e.getPathProcessor().add(history[1]);
                }
            }
        }
    }

    public Tile[] getHistorySince(Tile tile) {
        for (int i = history.length - 1; i >= 0; i--) {
            Tile t2 = history[i];
            if (tile.equals(t2)) {
                Tile[] partialHistory = new Tile[i];
                for (int i2 = partialHistory.length - 1; i2 >= 0; i2--) {
                    partialHistory[i2] = history[i - i2/* - 1*/];
                }
                return partialHistory;
            }
        }
        return null;
    }

    public void processPathRequest() {
        if (pathRequest != null) {
            final PathRequest request = pathRequest;

            final Tile destination = Tile.locate(request.x, request.y, entity.getZ());
            if (destination.equals(getDestination())) {
                return;
            }
            Runnable r = new Runnable() {
                public void run() {
                    Tile base = entity.getLocation();
                    int srcX = base.getLocalX();
                    int srcY = base.getLocalY();
                    int destX = destination.getLocalX(base);
                    int destY = destination.getLocalY(base);

                    int type = -2;
                    int direction = 0;
                    int sizeX = 0;
                    int sizeY = 0;
                    int walkToData = 0;

                    boolean walkingToObject = false;

                    if (request.target instanceof GameObject) {
                        walkingToObject = true;

                        GameObject obj = (GameObject) request.target;
                        if (obj != null && (obj.getType() == 10 || obj.getType() == 11 || obj.getType() == 22)) {
                            type = -1;
                            sizeX = obj.getSizeX();
                            sizeY = obj.getSizeY();
                            walkToData = obj.getDefinition().walkToData;
                            if (obj.getDirection() != 0)
                                walkToData = (walkToData << obj.getDirection() & 0xf) + (walkToData >> 4 - obj.getDirection());
                        } else {
                            type = obj.getType();
                            direction = obj.getDirection();
                        }
                    } else if (request.target instanceof Entity) {
                        type = -1;
                        sizeX = 1;
                        sizeY = 1;
                        walkToData = 0x80000000;
                    }

                    final LinkedList<Tile> path = request.pathFinder.findPath(entity.getLocation(), srcX, srcY, destX, destY, true, type, direction, sizeX, sizeY, walkToData, !entity.isClipping(), entity.getSize());
                    if(request.pathFinder.isSuccessful()) {
                        if (!request.automated) entity.resetEvents(false);

                        if (request.future != null) {
                            request.future.run();
                        }

                        if (coordinateFuture != null) coordinateFuture.setReady(true);

                        moveSpeed = request.moveSpeed;
                    }
                    if (path != null) {
                        if (request.pathFinder.movedNear() && (!(request.target instanceof NPC) || !((NPC) request.target).getDefinition().name.equalsIgnoreCase("Banker") || path.getLast().distance(request.target.getLocation()) > 2)) {
                            if (coordinateFuture != null) coordinateFuture.setFail(true);
                        }

                        add(path);
                    } else if (coordinateFuture != null) {
                        coordinateFuture.faceDestination();
                        if (request.pathFinder.isSuccessful() && (!walkingToObject || !request.pathFinder.movedNear())) {
                            try {
                                coordinateFuture.getFuture().run();
                            } catch (Exception e) {
                                logger.error("Error executing coordinate future!", e);
                            }
                        } else {
                            coordinateFuture.notifyFail();
                        }
                        coordinateFuture = null;
                    }
                }
            };
            Static.engine.dispatchToMapWorker(r);

            pathRequest = null;
        }
    }

    protected abstract NormalDirection next();

    public abstract void process();

    public Set<Entity> getHookedEntities() {
        return hooked;
    }
}
