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
import com.ziotic.logic.player.Player;

/**
 * @author Lazaro
 */
public class InventoryListener implements ItemListener {
    public static final InventoryListener INSTANCE = new InventoryListener();

    @Override
    public void event(ItemContainer container, ItemEventType type, int index) {
        switch (type) {
            case FULL:
                Static.proto.sendMessage(container.getPlayer(), "There is not enough space in your inventory.");
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
        Static.proto.sendItems(player, 93, false, container.array());
    }

    private void refresh(Player player, ItemContainer container, int index) {
        refresh(player, container); // TODO For now, as we don't have the single item update packet
    }
}
