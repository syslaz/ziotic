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

public class InventoryHandler implements ButtonHandler {

    @Override
    public void load(ActionHandlerSystem system) throws Exception {
        system.registerButtonHandler(new int[]{149}, this);
    }

    @Override
    public boolean explicitlyForMembers() {
        return false;
    }

    @Override
    public void handleButton(final Player player, int opcode, int interfaceId, int b, final int b2, final int b3) {
        switch (opcode) {
            case 8: // drop
                PossesedItem item = player.getInventory().get(b2);
                if (item != null) {
                    int id = item.getId();
                    int amt = item.getAmount();
                    if (id == b3) {
                        if (player.getInventory().remove(id, amt, b2)) {
                            Static.world.getGroundItemManager().add(id, amt, player.getLocation(), player.getProtocolName(), false);
                        }
                    }
                }
                break;
            case 2: // wield
                final PossesedItem w = player.getInventory().get(b2);
                player.addSpecificProcess(new Runnable() {
                    public void run() {
                        Static.callScript("equipment.wieldEquipment", player, b3, b2);
                        player.getCombat().wieldEquipment(w);
                    }
                });
                break;
            case 10: // examine
                item = player.getInventory().get(b2);
                if (item != null) {
                    Static.proto.sendMessage(player, item.getDefinition().examine);
                }
                break;
            default:
                //Static.callScript("buttons.unhandledButton", player, opcode, interfaceId, b, b2, b3);
                break;
        }
    }
}
