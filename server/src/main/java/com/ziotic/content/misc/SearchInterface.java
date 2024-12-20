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
package com.ziotic.content.misc;

import com.ziotic.Static;
import com.ziotic.engine.tick.Tick;
import com.ziotic.logic.player.Player;
import com.ziotic.logic.utility.GameInterface;

public class SearchInterface {

    public static final void searchInterface(final Player player, final int startId, final int length, int interval) {
        player.registerTick(new Tick("SearchInterface", interval) {
            int id = startId;
            int max = startId + length;

            @Override
            public boolean execute() {
                Static.proto.sendInterface(player, new GameInterface(id++));
                if (id > max)
                    return false;
                return true;
            }
        });
    }

    public static final void searchInterface(final Player player, final int startId, final int length) {
        searchInterface(player, startId, length, 2);
    }

}
