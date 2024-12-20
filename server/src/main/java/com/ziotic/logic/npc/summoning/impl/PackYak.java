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

import com.ziotic.logic.item.PossesedItem;
import com.ziotic.logic.npc.summoning.BeastOfBurden;
import com.ziotic.logic.npc.summoning.FamiliarSpecial;
import com.ziotic.logic.player.Player;

/**
 *
 * @author 'Mystic Flow
 */
public class PackYak extends BeastOfBurden {

    public PackYak(Player owner) {
        super(owner);
    }

    @Override
    public int getMinutes() {
        return 58;
    }

    @Override
    public String getSpecialAttackDescription() {
        return "Use special move on an item in your inventory to send it to your bank";
    }



    @Override
    public int specialCost() {
        return 12;
    }

    @Override
    public int maxBurdenSlots() {
        return 30;
    }

    @Override
    protected boolean performSpecial(FamiliarSpecial type, Object context) {
        PossesedItem toBank = owner.getInventory().get((Integer) context);
        if (toBank != null) {
            boolean ok = owner.getBank().add(toBank);
            if (ok) {
                owner.sendMessage("The pack yak has sent an item to your bank.");
                owner.getInventory().remove(toBank, (Integer) context);
            }
            return ok;
        }
        owner.sendMessage("There is no item there!");
        return false;
    }

    @Override
    public FamiliarSpecial specialType() {
        return FamiliarSpecial.ITEM_TARGET;
    }

}
