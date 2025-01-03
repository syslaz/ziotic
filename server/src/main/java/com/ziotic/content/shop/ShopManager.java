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
package com.ziotic.content.shop;

import java.util.HashMap;
import java.util.Map;

import com.ziotic.Static;
import com.ziotic.content.handler.ActionHandler;
import com.ziotic.content.handler.ActionHandlerSystem;
import com.ziotic.content.handler.ButtonHandler;
import com.ziotic.logic.player.Player;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

/**
 * @author Lazaro
 */
public class ShopManager implements ActionHandler, ButtonHandler {
    private static final Logger logger = Logging.log();

    private static Map<Integer, Shop> shops = new HashMap<Integer, Shop>();

    public static void openShop(Player player, int id) {
        Shop shop = shops.get(id);
        if (shop == null) {
            throw new RuntimeException("Invalid shop ID specified.");
        }
        shop.open(player);
    }

    @Override
    public void load(ActionHandlerSystem system) throws Exception {
        system.registerButtonHandler(new int[]{620, 621}, this);

        Map<Integer, ShopDefinition> shopDefs = Static.xml.readObject(Static.parseString("%WORK_DIR%/shops.xml"));
        for (Map.Entry<Integer, ShopDefinition> shopDef : shopDefs.entrySet()) {
            Shop shop = new Shop(shopDef.getKey(), shopDef.getValue().sampleStock, shopDef.getValue().stock, 39, shopDef.getValue().acceptedItems, shopDef.getValue().name);
            shops.put(shopDef.getKey(), shop);
            Static.engine.scheduleRecurringEvent(shop);
        }
        logger.info("Loaded " + shops.size() + " shops.");
    }

    @Override
    public boolean explicitlyForMembers() {
        return false;
    }

    @Override
    public void handleButton(Player player, int opcode, int interfaceId, int b, int b2, int b3) {
        switch (interfaceId) {
            case 621:
                switch (opcode) {
                    case 2: // Sell 1
                        player.getCurrentShop().sell(player, b2, 1);
                        break;
                    case 3: // Sell 5
                        player.getCurrentShop().sell(player, b2, 5);
                        break;
                    case 4: // Sell 10
                        player.getCurrentShop().sell(player, b2, 10);
                        break;
                    case 5: // Sell 50
                        player.getCurrentShop().sell(player, b2, 50);
                        break;
                }
                break;
            case 620:
                switch (b) {
                    case 26: // sample items
                        switch (opcode) {
                            case 1: // TODO - item info
                                player.getCurrentShop().info(player, b2 / 4, true);
                                break;
                            case 2: // Buy 1
                                player.getCurrentShop().buy(player, b2 / 4, 1, true);
                                break;
                            case 3: // Buy 5
                                player.getCurrentShop().buy(player, b2 / 4, 5, true);
                                break;
                            case 4: // Buy 10
                                player.getCurrentShop().buy(player, b2 / 4, 10, true);
                                break;
                            case 5: // Buy 50
                                player.getCurrentShop().buy(player, b2 / 4, 50, true);
                                break;
                            case 6: // Buy 500
                                player.getCurrentShop().buy(player, b2 / 4, 500, true);
                                break;
                            case 10:
                                player.getCurrentShop().examine(player, b2 / 4, true);
                                break;
                        }
                        break;
                    case 25: // main items
                        switch (opcode) {
                            case 1: // TODO - item info
                                player.getCurrentShop().info(player, b2 / 6, false);
                                break;
                            case 2: // Buy 1
                                player.getCurrentShop().buy(player, b2 / 6, 1, false);
                                break;
                            case 3: // Buy 5
                                player.getCurrentShop().buy(player, b2 / 6, 5, false);
                                break;
                            case 4: // Buy 10
                                player.getCurrentShop().buy(player, b2 / 6, 10, false);
                                break;
                            case 5: // Buy 50
                                player.getCurrentShop().buy(player, b2 / 6, 50, false);
                                break;
                            case 6: // Buy 500
                                player.getCurrentShop().buy(player, b2 / 6, 500, false);
                                break;
                            case 10:
                                player.getCurrentShop().examine(player, b2 / 6, false);
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
