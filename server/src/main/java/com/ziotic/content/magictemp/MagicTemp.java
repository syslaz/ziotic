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
package com.ziotic.content.magictemp;

import com.ziotic.Static;
import com.ziotic.engine.tick.Tick;
import com.ziotic.logic.map.Tile;
import com.ziotic.logic.mask.Graphic;
import com.ziotic.logic.mask.Mask;
import com.ziotic.logic.player.Player;

/**
 * @author Lazaro
 *
 */
public class MagicTemp {
    public static boolean teleport(final Player player, final Tile location, int delay, int startAnim, final int endAnim, Graphic startGraphic, final Graphic endGraphic, final int exp, boolean lever) {
        if (player.isTeleporting()) {
            return false;
        }
        if (player.teleBlocked) {
            Static.proto.sendMessage(player, "You are teleblocked!");
            return false;
        }
        if (player.getLocation().wildernessLevel() > 20 && !lever) {
            Static.proto.sendMessage(player, "You cannot teleport in over 20 wilderness.");
            return false;
        }

//        player.resetEvents();

        if(startAnim != Mask.MASK_NULL) player.doAnimation(startAnim);
        if(startGraphic != null) player.doGraphics(startGraphic);

        player.registerTick(new Tick("teleport", delay) {
            @Override
            public boolean execute() {
                player.setTeleportDestination(location);
                if(endAnim != Mask.MASK_NULL) player.doAnimation(endAnim);
                if(endGraphic != null) player.doGraphics(endGraphic);
                return false;
            }
        });
        return true;
    }
}
