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
package com.ziotic.content.combat.actions;

import com.ziotic.content.combat.Combat.ActionType;
import com.ziotic.content.combat.CombatAction;
import com.ziotic.content.combat.Magic;
import com.ziotic.content.combat.definitions.SpellDefinition;
import com.ziotic.logic.Entity;
import com.ziotic.logic.player.Player;

public class PlayerMagicAction extends CombatAction {

    public SpellDefinition queuedSpell;
    public SpellDefinition currentSpell;

    public PlayerMagicAction(Entity attacker, Entity victim, boolean recurring,
                             int attackDelay, int spellDelay, SpellDefinition currentSpell) {
        super(attacker, victim, recurring, attackDelay, spellDelay);
        this.currentSpell = currentSpell;
        type = ActionType.MAGIC;
    }

    @Override
    public boolean executeAction() {
        return Magic.castSpell((Player) attacker, victim, type, currentSpell);
    }

    public void queueSpell(SpellDefinition queuedSpell) {
        this.queuedSpell = queuedSpell;
    }

}
