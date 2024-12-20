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
package com.ziotic.logic.utility;

import com.ziotic.logic.player.DisplayMode;
import com.ziotic.logic.player.Player;

/**
 * @author Lazaro
 */
public class GameInterface {
    public static final int[] DEFAULT_POS = new int[]{18, 9};
    public static final int[] DEFAULT_INV_POS = new int[]{197, 84};

    public static final int getDefaultPos(DisplayMode displayMode) {
        return DEFAULT_POS[displayMode == DisplayMode.FIXED ? 0 : 1];
    }

    private NodeRunnable<Player> close;
    private int id;
    private int[] pos;
    private NodeRunnable<Player> show;
    private NodeRunnable<Player> update;
    private boolean isWalkable = false;

    public GameInterface(int id) {
        this(id, null);
    }

    public GameInterface(int id, NodeRunnable<Player> show) {
        this(id, null, show);
    }

    public GameInterface(int id, int[] pos, NodeRunnable<Player> show) {
        this(id, pos, show, null);
    }

    public GameInterface(int id, int[] pos, NodeRunnable<Player> show, NodeRunnable<Player> close) {
        this(id, pos, show, close, null);
    }

    public GameInterface(int id, int[] pos, NodeRunnable<Player> show, NodeRunnable<Player> close, boolean isWalkable) {
        this(id, pos, show, close, null);
        this.isWalkable = isWalkable;
    }

    public GameInterface(int id, int[] pos, NodeRunnable<Player> show, NodeRunnable<Player> close, NodeRunnable<Player> update) {
        this.id = id;
        this.pos = pos;
        this.show = show;
        this.close = close;
        this.update = update;

        if (this.pos == null) {
            this.pos = DEFAULT_POS;
        }
    }

    public int getId() {
        return id;
    }

    public int getPos(DisplayMode displayMode) {
        return pos[displayMode == DisplayMode.FIXED ? 0 : 1];
    }

    public void show(Player player) {
        if (show != null) {
            show.run(player);
        }
        update(player);
    }

    public void close(Player player) {
        if (close != null) {
            close.run(player);
        }
    }

    public void update(Player player) {
        if (update != null) {
            update.run(player);
        }
    }

    public void setWalkable(boolean isWalkable) {
        this.isWalkable = isWalkable;
    }

    public boolean isWalkable() {
        return isWalkable;
    }
}
