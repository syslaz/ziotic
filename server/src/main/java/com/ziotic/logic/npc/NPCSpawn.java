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

import java.io.ObjectStreamException;

import com.ziotic.logic.map.Directions.NormalDirection;
import com.ziotic.logic.map.Tile;

/**
 * @author Lazaro
 */
public class NPCSpawn {
    public int id;
    public Tile location;
    public NormalDirection direction = null;
    public int range = 0;
    public boolean respawns = true;

    public NPCSpawn(int id, Tile location, NormalDirection direction, int range, boolean respawns) {
        this.id = id;
        this.location = location;
        this.direction = direction;
        this.range = range;
        this.respawns = respawns;
        if (this.direction == null) {
            this.direction = NormalDirection.NORTH;
        }
    }

    private Object readResolve() throws ObjectStreamException {
        location = location.translate(0, 0, 0);
        if (direction == null) {
            direction = NormalDirection.NORTH;
        }
        return this;
    }
}
