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

import java.awt.Point;

import com.ziotic.content.combat.Combat.ActionType;
import com.ziotic.content.combat.CombatAction;
import com.ziotic.logic.Entity;
import com.ziotic.logic.item.EquipmentDefinition;
import com.ziotic.logic.item.PossesedItem;
import com.ziotic.logic.map.Directions;
import com.ziotic.logic.map.Directions.NormalDirection;
import com.ziotic.logic.map.Tile;
import com.ziotic.logic.npc.NPC;
import com.ziotic.logic.npc.NPCDefinition;
import com.ziotic.logic.player.Player;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

public class NPCCombatAction extends CombatAction {

    private static final Logger LOGGER = Logging.log();

    public NPCCombatAction(NPC attacker, Entity victim,
            int attackDelay, ActionType type) {
        super(attacker, victim, true, attackDelay, attackDelay);
        this.type = type;
    }

    @Override
    public boolean executeAction() {
        NPC attacker = (NPC) this.attacker;
        switch (type) {
        case MELEE:
            LOGGER.info("executing melee action");
            boolean canAttack = false;
            Tile[][] tiles = attacker.getCoverage().tiles();
            for (int x = 0; x < tiles.length; x++) {
                for (int y = 0; y < tiles[x].length; y++) {
                    NormalDirection direction = Directions.directionFor(new Point(tiles[x][y].getX(), tiles[x][y].getY()), new Point(victim.getX(), victim.getY()));
                    if (direction != null)
                        if (tiles[x][y].canMove(direction, 1, true))
                            canAttack = true;
                }
            }
            if (canAttack) {
                int defenceAnim;
                if (victim instanceof Player) {
                    PossesedItem defence = ((Player) victim).getEquipment().get(EquipmentDefinition.SLOT_WEAPON);
                    PossesedItem shield = ((Player) victim).getEquipment().get(EquipmentDefinition.SLOT_SHIELD);
                    if (shield != null) {
                        String name = shield.getDefinition().name;
                        if (name.contains("shield")) {
                            defenceAnim = 1156;
                        } else if (name.contains("defender")) {
                            defenceAnim = 4177;
                        } else if (defence != null) {
                            defenceAnim = ((Player) victim).getEquipment().get(EquipmentDefinition.SLOT_WEAPON)
                                    .getDefinition().getEquipmentDefinition().getEquipmentAnimations().defendAnimation;
                        } else {
                            defenceAnim = EquipmentDefinition.DEFAULT_ANIMATIONS.defendAnimation;
                        }
                    } else if (defence != null) {
                        defenceAnim = ((Player) victim).getEquipment().get(EquipmentDefinition.SLOT_WEAPON)
                                .getDefinition().getEquipmentDefinition().getEquipmentAnimations().defendAnimation;
                    } else {
                        defenceAnim = EquipmentDefinition.DEFAULT_ANIMATIONS.defendAnimation;
                    }
                } else {
                    NPC npc = (NPC) victim;
                    NPCDefinition def = npc.getDefinition();
                    if (def != null) {
                        defenceAnim = def.defenceEmote;
                    } else {
                        defenceAnim = EquipmentDefinition.DEFAULT_ANIMATIONS.defendAnimation;
                    }
                }
                attacker.getCombat().executeAnimation(attacker.getDefinition().attackEmote, 0, true, false);
                victim.getCombat().executeAnimation(defenceAnim, 0, false, false);
                attacker.getCombat().hit(victim, type, false, 1, 1, null, 1, null, new int[] { 0 }, new int[] { 0 });
                return true;
            }
            return false;
        case MAGIC:
            return true;
        case RANGED:
            return true;
        }
        return false;
    }

}
