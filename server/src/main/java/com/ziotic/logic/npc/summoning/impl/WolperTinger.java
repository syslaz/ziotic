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
package com.ziotic.logic.npc.summoning.impl;

import com.ziotic.Static;
import com.ziotic.logic.npc.summoning.Familiar;
import com.ziotic.logic.npc.summoning.FamiliarSpecial;
import com.ziotic.logic.player.Levels;
import com.ziotic.logic.player.Player;

/**
 *
 * @author 'Mystic Flow
 * @author Maxi
 */
public class WolperTinger extends Familiar {

    public WolperTinger(Player owner) {
        super(owner);
    }

    @Override
    public int getMinutes() {
        return 62;
    }

    @Override
    public String getSpecialAttackDescription() {
        return "Gives you a +7 Magic boost";
    }

    @Override
    protected boolean performSpecial(FamiliarSpecial type, Object context) {
        int newLevel = owner.getLevels().getCurrentLevel(Levels.MAGIC) + 7;
        if (newLevel > owner.getLevels().getLevel(Levels.MAGIC) + 7)
            newLevel = owner.getLevels().getLevel(Levels.MAGIC) + 7;
        owner.doGraphics(2011);
        owner.getLevels().setCurrentLevel(Levels.MAGIC, newLevel);
        Static.proto.sendLevel(owner, Levels.MAGIC);
        return true;
    }

    @Override
    public int specialCost() {
        return 20;
    }

    @Override
    public FamiliarSpecial specialType() {
        return FamiliarSpecial.CLICK;
    }

}
