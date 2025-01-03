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
package com.ziotic.adapter.protocol.handler;

import com.ziotic.Static;
import com.ziotic.logic.item.GroundItem;
import com.ziotic.logic.map.CoordinateFuture;
import com.ziotic.logic.map.PathProcessor;
import com.ziotic.logic.map.Tile;
import com.ziotic.logic.map.pf.astar.AStarPathFinder;
import com.ziotic.logic.player.Player;
import com.ziotic.network.Frame;
import com.ziotic.network.handler.PlayerFrameHandler;

import org.apache.mina.core.session.IoSession;

/**
 * @author Lazaro
 */
public class PickupItemHandler extends PlayerFrameHandler {
    @Override
    public void handleFrame(final Player player, IoSession session, Frame frame) {
        boolean ctrl = frame.readUnsignedA() == 1;
        int x = frame.readUnsignedShort();
        int y = frame.readUnsignedLEShort();
        final int id = frame.readUnsignedLEShort();

        if (player.getPathProcessor().getMoveSpeed() == PathProcessor.MOVE_SPEED_WALK) {
            return;
        }

        Static.proto.sendCloseInterface(player);

        final Tile loc = Tile.locate(x, y, player.getZ());
        final int dx = Math.abs(player.getLocation().getX() - x);
        final int dy = Math.abs(player.getLocation().getY() - y);
        player.getCombat().stop(false);
        if (player.getLocation().distance(loc) > 1) {
            if (!player.getCombat().isFrozen()) {
                Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        pickupItem(player, id, loc);
                    }
                };
                Static.world.submitPath(new AStarPathFinder(), player, x, y, null, ctrl ? PathProcessor.MOVE_SPEED_RUN : PathProcessor.MOVE_SPEED_ANY, false, null);
                player.getPathProcessor().setCoordinateFuture(new CoordinateFuture(player, r));
            } else {
                player.sendMessage("A magical force stops you from moving.");
                player.faceDirection(Tile.locate(x, y, player.getZ()));
            }
        } else if ((dx == 1 && dy == 0) || (dx == 0 && dy == 1)) {
            if (player.getCombat().isFrozen()) {
                pickupItem(player, id, loc);
                player.faceDirection(Tile.locate(x, y, player.getZ()));
            } else {
                Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        pickupItem(player, id, loc);
                    }
                };
                Static.world.submitPath(new AStarPathFinder(), player, x, y, null, ctrl ? PathProcessor.MOVE_SPEED_RUN : PathProcessor.MOVE_SPEED_ANY, false, null);
                player.getPathProcessor().setCoordinateFuture(new CoordinateFuture(player, r));
            }
        } else {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    pickupItem(player, id, loc);
                }
            };
            Static.world.submitPath(new AStarPathFinder(), player, x, y, null, ctrl ? PathProcessor.MOVE_SPEED_RUN : PathProcessor.MOVE_SPEED_ANY, false, null);
            player.getPathProcessor().setCoordinateFuture(new CoordinateFuture(player, r));
        }
    }

    private void pickupItem(Player player, int id, Tile loc) {
        player.resetEvents();

        GroundItem item = Static.world.getGroundItemManager().get(id, loc);
        if (item != null) {
            if (player.getInventory().add(item.getId(), item.getDefinition().isStackable() ? item.getAmount() : 1)) {
                Static.world.getGroundItemManager().remove(item);
            }
        }
    }
}
