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

import java.util.HashMap;
import java.util.Map;

import com.ziotic.logic.player.Player;

/**
 * @author Lazaro
 */
public class BankContainer extends ItemContainer {
    private Map<PossesedItem, Integer> tabMap = new HashMap<PossesedItem, Integer>();
    private short[] tabSizes = new short[9];

    public BankContainer(Player player) {
        super(player, BankManager.BANK_SIZE, ItemContainer.StackType.FORCE_STACK);
        addListener(BankListener.INSTANCE);
    }

    public int getTab(PossesedItem item) {
        Integer tab = tabMap.get(item);
        if (tab != null) {
            return tab;
        }
        return 0;
    }

    public void setTab(PossesedItem item, int tab) {
        if (tab != 0) {
            Integer oldTab = tabMap.put(item, tab);
            if (oldTab != null) {
                tabSizes[oldTab]--;
            } else {
                tabSizes[0]++;
            }
            tabSizes[tab]++;
        } else {
            unsetTab(item);
        }
    }

    public int unsetTab(PossesedItem item) {
        Integer tab = tabMap.remove(item);
        if (tab != null) {
            tabSizes[tab]--;
            tabSizes[0]--;
            return tab;
        }
        return 0;
    }

    public int getTabSize(int tab) {
        if (tab == 0) {
            return size() - tabSizes[0];
        }
        return tabSizes[tab];
    }

    public Map<PossesedItem, Integer> getTabMap() {
        return tabMap;
    }
}
