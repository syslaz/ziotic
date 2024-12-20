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
package com.ziotic.logic.object;

import com.ziotic.logic.Locatable;
import com.ziotic.logic.map.Tile;

/**
 * @author Lazaro
 */
public final class GameObject extends Locatable {
    private int id;
    private int type;
    private int direction;
    private int sizeX;
    private int sizeY;
    private boolean spawned;
    private boolean exists = true;

    public GameObject(int id, Tile loc, int type, int direction, int sizeX, int sizeY) {
        this(id, loc, type, direction, sizeX, sizeY, false);
    }

    public GameObject(int id, Tile loc, int type, int direction, int sizeX, int sizeY, boolean spawned) {
        this.id = id;
        this.type = type;
        this.direction = direction;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.spawned = spawned;
        setLocation(loc);
    }

    public ObjectDefinition getDefinition() {
        return ObjectDefinition.forId(id);
    }

    public int getId() {
        return id;
    }

    public int getDirection() {
        return direction;
    }

    public int getType() {
        return type;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public boolean isSpawned() {
        return spawned;
    }

    public boolean exists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
}
