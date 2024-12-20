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
package com.ziotic.logic.mask;

/**
 * @author Lazaro
 */
public class Graphic implements Mask {
    private int id;
    private int settings;
    private int direction;

    public Graphic(int id) {
        this(id, 0, 0, 0, 0);
    }

    public Graphic(int id, int delay) {
        this(id, delay, 0, 0, 0);
    }

    public Graphic(int id, int delay, int height) {
        this(id, delay, height, 0, 0);
    }

    public Graphic(int id, int delay, int height, int direction) {
        this(id, delay, height, direction, 0);
    }

    public Graphic(int id, int delay, int height, int direction, int direction2) {
        this.id = id;
        this.settings = (height << 16) | delay;
        this.direction = (direction2 << 3) | direction;
    }

    public int getId() {
        return id;
    }

    public int getSettings() {
        return settings;
    }

    public int getDirection() {
        return direction;
    }
}
