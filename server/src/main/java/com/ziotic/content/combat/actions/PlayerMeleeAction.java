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

import java.awt.*;

import com.ziotic.Static;
import com.ziotic.content.combat.Combat.ActionType;
import com.ziotic.content.combat.CombatAction;
import com.ziotic.logic.Entity;
import com.ziotic.logic.item.EquipmentDefinition;
import com.ziotic.logic.item.PossesedItem;
import com.ziotic.logic.map.Directions;
import com.ziotic.logic.map.Directions.NormalDirection;
import com.ziotic.logic.npc.NPC;
import com.ziotic.logic.npc.NPCDefinition;
import com.ziotic.logic.player.Player;

public class PlayerMeleeAction extends CombatAction {

    public PlayerMeleeAction(Entity attacker, Entity victim, boolean recurring,
                             int attackDelay, int spellDelay) {
        super(attacker, victim, recurring, attackDelay, spellDelay);
        type = ActionType.MELEE;
    }

    @Override
    public boolean executeAction() {
        Player attacker = (Player) this.attacker;
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
        PossesedItem attack = attacker.getEquipment().get(EquipmentDefinition.SLOT_WEAPON);
        int attackAnim;
        EquipmentDefinition wepDef = null;
        if (attack == null)
            attackAnim = EquipmentDefinition.DEFAULT_ANIMATIONS.attackAnimations[attacker.getCombat().weapon.index];
        else {
            wepDef = attack.getDefinition().getEquipmentDefinition();
            attackAnim = wepDef.getEquipmentAnimations().attackAnimations[attacker.getCombat().weapon.index];
        }
        boolean special = false;
        if (attack != null && attack.getDefinition().weaponSpecial && attacker.getCombat().specialOn) {
            attacker.getCombat().specialOn = false;
            Static.proto.sendConfig(attacker, 301, 0);
            special = true;
        }
        NormalDirection direction = Directions.directionFor(new Point(attacker.getX(), attacker.getY()), new Point(victim.getX(), victim.getY()));
        if (direction != null) {
            if (attacker.getLocation().canMove(direction, attacker.getSize(), false)) {
                if ((!special || !Static.<Boolean>callScript("specialattacks.handleSpecial", attacker, victim, attacker.getCombat(), attack, type, defenceAnim))) {
                    victim.getCombat().executeAnimation(defenceAnim, 0, false, false);
                    attacker.getCombat().executeAnimation(attackAnim, 0, true, false);
                    attacker.getCombat().hit(victim, type, false, 1.0, 1.0, null, 1, null, new int[]{20}, new int[]{0});
                }
                return true;
            } else
                return false;
        } else
            return false;
    }

}
