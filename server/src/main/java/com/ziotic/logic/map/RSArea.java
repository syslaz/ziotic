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

public class RSArea implements Area {

    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;
    private RSArea[] exclude;
    private RSArea[] include;

    public static RSArea forBounds(int startX, int startY, int endX, int endY) {
        return new RSArea(startX, startY, endX, endY);
    }

    @Override
    public boolean inArea(Tile tile) {
        if (exclude != null) {
            for (RSArea area : exclude) {
                if (area.inArea(tile)) {
                    return false;
                }
            }
        }
        if (include != null) {
            for (RSArea area : include) {
                if (area.inArea(tile))
                    return true;
            }
        }
        return startX <= tile.getX() && endX >= tile.getX() && tile.getY() >= startY && tile.getY() <= endY;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

    public RSArea exclude(RSArea area) {
        try {
            if (exclude == null) {
                exclude = new RSArea[1];
            } else {
                RSArea[] previous = exclude;
                exclude = new RSArea[exclude.length + 1];
                System.arraycopy(previous, 0, exclude, 0, exclude.length - 1);
            }
            exclude[exclude.length - 1] = area;
            return this;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public RSArea include(RSArea area) {
        try {
            if (include == null) {
                include = new RSArea[1];
            } else {
                RSArea[] previous = include;
                include = new RSArea[include.length + 1];
                System.arraycopy(previous, 0, include, 0, include.length - 1);
            }
            include[include.length - 1] = area;
            return this;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private RSArea(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }
}
