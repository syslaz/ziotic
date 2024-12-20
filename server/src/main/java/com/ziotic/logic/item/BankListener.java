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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ziotic.Static;
import com.ziotic.logic.player.Player;

/**
 * @author Lazaro
 */
public class BankListener implements ItemListener {
    public static final BankListener INSTANCE = new BankListener();

    @Override
    public void event(ItemContainer container, ItemEventType type, int index) {
        switch (type) {
            case FULL:
                Static.proto.sendMessage(container.getPlayer(), "There is not enough space in your bank.");
                break;
            case CHANGE:
                if (index == -1) {
                    // A complete refresh is required
                    refresh(container.getPlayer(), container);
                } else {
                    // Only update a single slot to save bandwidth
                    refresh(container.getPlayer(), container, index);
                }
                break;
        }
    }

    private void refresh(Player player, ItemContainer container) {
        reorder((BankContainer) container);
        BankManager.updateTabs(player);
        Static.proto.sendItems(player, 95, false, container.array());
        int size = container.size();
        Static.proto.sendInterfaceVariable(player, 1038, size > 68 ? 68 : size); // Total free items
        Static.proto.sendInterfaceVariable(player, 192, container.size()); // Total items
    }

    private void refresh(Player player, ItemContainer container, int index) {
        refresh(player, container); // TODO For now, as we don't have the single item update packet
    }

    private void reorder(BankContainer container) {
        List<PossesedItem> items = new ArrayList<PossesedItem>(container.size());
        int tab = 1;
        while (true) {
            for (Map.Entry<PossesedItem, Integer> item : container.getTabMap().entrySet()) {
                if (item.getValue() == tab) {
                    items.add(item.getKey());
                }
            }
            tab++;
            if (tab > 8) {
                for (PossesedItem item : container.array()) {
                    if (item != null && container.getTab(item) == 0) {
                        items.add(item);
                    }
                }
                break;
            }
        }
        container.clear(false);
        int i = 0;
        for (PossesedItem item : items) {
            container.set(item, i++);
        }
    }
}
