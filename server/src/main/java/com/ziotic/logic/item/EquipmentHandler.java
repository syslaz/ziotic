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
package com.ziotic.logic.item;

import com.ziotic.Static;
import com.ziotic.content.handler.ActionHandlerSystem;
import com.ziotic.content.handler.ButtonHandler;
import com.ziotic.logic.player.Player;
import com.ziotic.logic.utility.GameInterfaces;

public class EquipmentHandler implements ButtonHandler {
    //private static final Logger logger = Logging.log();

    @Override
    public void load(ActionHandlerSystem system) throws Exception {
        system.registerButtonHandler(new int[]{387, 667, 670}, this);
    }

    @Override
    public boolean explicitlyForMembers() {
        return false;
    }

    @Override
    public void handleButton(final Player player, int opcode, int interfaceId, int b, final int b2, final int b3) {
        switch (interfaceId) {
            case 670:
                switch (opcode) {
                    case 1:
                        final PossesedItem w = player.getInventory().get(b2);
                        player.addSpecificProcess(new Runnable() {
                            public void run() {
                                Static.callScript("equipment.wieldEquipment", player, b3, b2);
                                player.getCombat().wieldEquipment(w);
                            }
                        });
                        break;
                    case 10:
                        ItemDefinition def = ItemDefinition.forId(b3);
                        Static.proto.sendMessage(player, def.examine);
                        break;
                    default:
                        Static.callScript("buttons.unhandledButton", player, opcode, interfaceId, b, b2, b3);
                        break;
                }
                break;
            case 667:
                switch (b) {
                    case 7:
                        switch (opcode) {
                            case 1:
                                Static.callScript("equipment.removeEquipment", player, b3);
                                break;
                            case 10:
                                ItemDefinition def = ItemDefinition.forId(b3);
                                Static.proto.sendMessage(player, def.examine);
                                break;
                            default:
                                Static.callScript("buttons.unhandledButton", player, opcode, interfaceId, b, b3, b2);
                                break;
                        }
                        break;
                    case 48:
                        player.clearCurrentInterfaces();
                        Static.proto.sendInterface(player, GameInterfaces.BANK_SCREEN);
                        break;
                    default:
                        Static.callScript("buttons.unhandledButton", player, opcode, interfaceId, b, b2, b3);
                        break;
                }
                break;
            case 387:
                switch (b) {
                    case 39: // Equipment stats
                        Static.proto.sendInterface(player, GameInterfaces.EQUIPMENT_SCREEN);
                        break;
                    case 42: // Price-checker
                        break;
                    case 45: // Items kept on death
                        break;
                    case 8:
                    case 11:
                    case 14:
                    case 38:
                    case 17:
                    case 20:
                    case 23:
                    case 26:
                    case 29:
                    case 32:
                    case 35:
                        switch (opcode) {
                            case 1:
                                Static.callScript("equipment.removeEquipment", player, b3);
                                break;
                            case 10:
                                ItemDefinition def = ItemDefinition.forId(b3);
                                Static.proto.sendMessage(player, def.examine);
                                break;
                            default:
                                Static.callScript("buttons.unhandledButton", player, opcode, interfaceId, b, b3, b2);
                                break;
                        }
                        break;
                    default:
                        Static.callScript("buttons.unhandledButton", player, opcode, interfaceId, b, b3, b2);
                        break;
                }
                break;
        }
    }
}
