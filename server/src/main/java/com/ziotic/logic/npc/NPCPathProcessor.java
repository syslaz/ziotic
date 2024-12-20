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
package com.ziotic.logic.npc;

import com.ziotic.logic.map.Directions;
import com.ziotic.logic.map.Directions.NormalDirection;
import com.ziotic.logic.map.PathProcessor;
import com.ziotic.logic.map.Tile;

/**
 * @author Lazaro
 */
public class NPCPathProcessor extends PathProcessor {
    private NPC npc;

    public NPCPathProcessor(NPC npc) {
        super(npc);
        this.npc = npc;
    }

    @Override
    protected NormalDirection next() {
        /**
         * Check if we are walking.
         */
        if (moving()) {
            /**
             * Get the first waypoint from the buffer.
             */
            Tile nextPoint = buffer.peek();
            /**
             * Check if we are already on this tile.
             */
            if (npc.getLocation().equals(nextPoint)) {
                /**
                 * Remove the current waypoint and get the next one.
                 */
                buffer.next();
                nextPoint = buffer.peek();
            }
            /**
             * Check if there is a next step.
             */
            if (nextPoint == null) {
                /**
                 * Stop walking.
                 */
                reset();
                return null;
            }
            /**
             * Calculate the directions of the next waypoint.
             */
            NormalDirection direction = Directions.directionFor(npc.getLocation(), nextPoint);
            /**
             * We want to move.
             */
            if (direction != null) {

                if (!npc.getLocation().canMove(direction, npc.getSize(), false)) {
                    reset();
                    return null;
                }

                /**
                 * Calculate the next tile.
                 */
                Tile next = npc.getLocation().translate(Directions.DIRECTION_DELTA_X[direction.intValue()], Directions.DIRECTION_DELTA_Y[direction.intValue()], 0);

                /**
                 * Check that the NPC will stay within range.
                 */
                int range = npc.getSpawn().range;
                if (!next.withinRange(npc.getSpawn().location, range) && range != -1) {
                    npc.getCombat().stop(true);
                    return null;
                }

                /**
                 * Set the tile and return the directions.
                 */
                npc.setLocation(next);
                npc.updateCoverage(next);

                updateHistory(next);

                return direction;
            }
        }
        return null;
    }

    @Override
    public void process() {
        Tile oldLocation = npc.getLocation(); // Save the old location.
        if (npc.getTeleportDestination() != null) { // Check if we are teleporting.
            npc.setLocation(npc.getTeleportDestination()); // Set the new location.
            npc.updateCoverage(npc.getTeleportDestination()); // Set the new tile coverage
            npc.setTeleportDestination(null); // Reset the teleport variables.
            npc.setTeleporting(true); // Flag the teleport.
            reset();
        } else if (moving() && !npc.getCombat().isFrozen()) { // Check if we are moving.
            Directions.Direction direction = next(); // Calculate the first direction, for walking.
            Directions.Direction secondDirection = null;
            if (moveSpeed == MOVE_SPEED_RUN) { // Check if we are running.
                npc.getDirections().setDirection(direction); // Set the previous direction for logic reasons
                updateCoordinateFuture(); // Update the coordinate future

                secondDirection = next(); // Calculate the second direction, for running.
            }

            npc.getDirections().setDirection(direction); // Set the final direction.
            npc.getDirections().setSecondDirection(secondDirection);
        }
        npc.setPreviousLocation(oldLocation);
        updateCoordinateFuture();
    }
}
