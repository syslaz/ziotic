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
package com.ziotic.adapter.protocol.handler;

import com.ziotic.Static;
import com.ziotic.logic.item.PossesedItem;
import com.ziotic.logic.npc.summoning.FamiliarSpecial;
import com.ziotic.logic.player.Player;
import com.ziotic.network.Frame;
import com.ziotic.network.handler.PlayerFrameHandler;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;
import org.apache.mina.core.session.IoSession;

public class ItemOnItemHandler extends PlayerFrameHandler {
    private static final Logger logger = Logging.log();

    @SuppressWarnings("unused")
    @Override
    public void handleFrame(Player player, IoSession session, Frame frame) {
        frame.getOpcode();
        int interfaceSet2 = frame.readInt();
        int index1 = frame.readLEShortA();
        int itemId2 = frame.readLEShortA();
        int interfaceSet1 = frame.readInt2();
        int index2 = frame.readShortA();
        int itemId1 = frame.readLEShort();

        int interfaceId1 = interfaceSet1 >> 16;
        int childId1 = interfaceSet1 & 0xffffffff;

        int interfaceId2 = interfaceSet2 >> 16;
        int childId2 = interfaceSet2 & 0xffffffff;

        if (interfaceId1 == 149 && interfaceId2 == 149) {
            PossesedItem item1 = player.getInventory().array()[index1];
            PossesedItem item2 = player.getInventory().array()[index2];
            if (item1.getId() == itemId1 && item2.getId() == itemId2) {
                if (!Static.ahs.handleItemOnItem(player, item1, index1, item2, index2)) {
                    Static.proto.sendMessage(player, "Nothing interesting happens.");
                }
            }
        } else if ((interfaceId1 == 747 || interfaceId1 == 662) && interfaceId2 == 149) {
            if (player.getFamiliar() != null) {
                player.getFamiliar().doSpecial(FamiliarSpecial.ITEM_TARGET, new Integer(index2));
            }
        } else
            logger.warn("Item on item performed with different interfaces! Please check which " + "interface is which and refactor this properly in " + "com.ziotic.adapter.protocol.handler.ItemOnItemHandler");
    }
}
