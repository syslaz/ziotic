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
package com.ziotic.logic.npc.misc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ziotic.Static;
import com.ziotic.engine.tick.Tick;
import com.ziotic.logic.Entity;
import com.ziotic.logic.World;
import com.ziotic.logic.map.Tile;
import com.ziotic.logic.npc.NPC;
import com.ziotic.logic.npc.NPCSpawn;

/**
 *
 * @author 'Mystic Flow
 */
public class FishingSpotNPC extends NPC {

    public static void load() throws IOException {
        List<FishingSpotNPC> spots = Static.xml.readObject(Static.parseString("%WORK_DIR%/npcs/fishing_spots.xml"));
        for (FishingSpotNPC spot : spots) { // XXX I don't think I designed this very good .
            List<Tile> tiles = new ArrayList<Tile>();
            for (Tile tile : spot.tiles) {
                tiles.add(Tile.locate(tile.getX(), tile.getY(), tile.getZ()));
            }
            Static.world.register(new FishingSpotNPC(spot.getSpawn(), tiles.toArray(new Tile[0])));

            tiles.clear();
            tiles = null;
            spot.tiles = null;
        }
    }

    public FishingSpotNPC(NPCSpawn spawn, Tile[] tiles) {
        super(spawn);
        this.tiles = tiles;
    }

    private int nextMove;
    private Tile[] tiles;

    @Override
    public void subPreProcess() {
        if (tiles == null || tiles.length == 0) // SHOULD NOT HAPPEN
            return;
        nextMove++;
        // 1 minute + a random 2 minutes?
        if (nextMove >= 100 + World.getRandom(200)) {
            nextMove = 0;
            Tile nextTile = tiles[World.getRandom(tiles.length)];
            if (tiles.length > 1) // prevent deadlock's
                while (nextTile == getLocation())
                    nextTile = tiles[World.getRandom(tiles.length)];
            setTeleportDestination(nextTile);
            Iterator<Entity> it = getPathProcessor().getHookedEntities().iterator();
            while (it.hasNext()) {
                Entity fishingPlayer = it.next();
                if (fishingPlayer != null) {
                    Tick tick = fishingPlayer.retrieveTick("fishing_tick");
                    if (tick != null)
                        tick.stop();
                    it.remove();
                }
            }
        }
    }

}
