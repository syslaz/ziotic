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
package com.ziotic.logic.utility;

import com.ziotic.Constants;
import com.ziotic.Static;
import com.ziotic.content.grotto.ClanWars;
import com.ziotic.logic.item.EquipmentDefinition;
import com.ziotic.logic.item.PossesedItem;
import com.ziotic.logic.player.DisplayMode;
import com.ziotic.logic.player.Player;

/**
 * @author Lazaro
 */
public class GameInterfaces {

    public static GameInterface WILDY_SIGN = new GameInterface(381, new int[]{40, 7}, null, null, true);


    public static GameInterface EQUIPMENT_SCREEN_INVENTORY = new GameInterface(670, new int[]{197, 84}, new NodeRunnable<Player>() {
        @Override
        public void run(Player player) {
            Static.proto.sendAccessMask(player, 0, 27, 670, 0, 65, 1538);
            player.getInventory().refresh();
        }
    });

    public static GameInterface EQUIPMENT_SCREEN = new GameInterface(667, null, new NodeRunnable<Player>() {
        @Override
        public void run(Player player) {
            if (!player.getAttributes().is("banking")) {
                if (player.getDisplayMode() == DisplayMode.FIXED) {
                    Static.proto.sendInterface(player, 667, 548, 18, false);
                    Static.proto.sendCloseInterface(player, 548, 18);
                } else {
                    Static.proto.sendInterface(player, 667, 746, 9, false);
                    Static.proto.sendCloseInterface(player, 746, 9);
                }

                Static.proto.sendConfig(player, 1583, 511305630);
                Static.proto.sendConfig(player, 1248, 134217728);

                Static.proto.sendInterfaceConfig(player, 95, 0);

                Static.proto.sendInterfaceScript(player, 3336);
            }
            Static.proto.sendConfig(player, 638, 786432);
            Static.proto.sendAccessMask(player, 0, 13, 667, 7, 65, 1538);
            Static.proto.sendInterfaceVariable(player, 199, -1);
            Static.proto.sendInterface(player, EQUIPMENT_SCREEN_INVENTORY);
        }
    }, new NodeRunnable<Player>() {
        @Override
        public void run(Player player) {
            if (player.getAttributes().is("banking")) {
                Static.proto.sendConfig(player, 1583, 511305630);
                Static.proto.sendConfig(player, 1248, 134217728);

                Static.proto.sendInterfaceConfig(player, 95, 0);

                Static.proto.sendInterfaceScript(player, 3336);

                player.getAttributes().unSet("withdrawingAsNote");
                player.getAttributes().unSet("banking");
            }
        }
    }, new NodeRunnable<Player>() {
        @Override
        public void run(Player player) {
            PossesedItem weapon = player.getEquipment().get(Constants.Equipment.WEAPON_SLOT);
            Static.proto.sendInterfaceVariable(player, 779, weapon != null ? weapon.getDefinition().renderId : 1426);
            double[] bonuses = player.getBonuses();
            for (int i = 0; i < 11; i++) {
                Static.proto.sendString(player, 667, 30 + i, EquipmentDefinition.BONUS_NAMES[i] + ": " + (bonuses[i] >= 0 ? "+" : "") + ((int) bonuses[i]));
            }
            for (int i = 11; i < 14; i++) {
                Static.proto.sendString(player, 667, 30 + i, EquipmentDefinition.BONUS_NAMES[i] + ": " + (bonuses[i] >= 0 ? "+" : "") + ((int) bonuses[i]) + "%");
            }
            for (int i = 14; i < 17; i++) {
                Static.proto.sendString(player, 667, 30 + i, EquipmentDefinition.BONUS_NAMES[i] + ": " + (bonuses[i] >= 0 ? "+" : "") + ((int) bonuses[i]));
            }
            Static.proto.sendString(player, 667, 47, EquipmentDefinition.BONUS_NAMES[17] + ": " + (bonuses[17] >= 0 ? "+" : "") + ((int) bonuses[17]) + "%");
        }
    }
    );
    public static final GameInterface BANK_SCREEN = new GameInterface(762, null, new NodeRunnable<Player>() {
        @Override
        public void run(Player player) {
            Static.proto.sendConfig(player, 638, 262144);
            Static.proto.sendConfig(player, 1249, player.getAttributes().getInt("withdrawX"));
            Static.proto.sendConfig(player, 563, 4194304);

            Static.proto.sendInterfaceScript(player, 1451);

            Static.proto.sendInterfaceVariable(player, 169, 1);
            Static.proto.sendInterfaceVariable(player, 199, -1);

            Static.proto.sendAccessMask(player, 0, 516, 762, 93, 40, 1278);
            Static.proto.sendAccessMask(player, 0, 13, 667, 7, 65, 1538);

            Static.proto.sendInterface(player, BANK_SCREEN_INVENTORY);
            Static.proto.sendString(player, 762, 45, "Bank of Ziotic");
            player.getBank().refresh();
            player.getAttributes().set("banking", true);
        }
    }, new NodeRunnable<Player>() {
        @Override
        public void run(Player player) {
            Static.proto.sendConfig(player, 1583, 511305630);
            Static.proto.sendConfig(player, 1248, 134217728);

            Static.proto.sendInterfaceConfig(player, 95, 0);

            Static.proto.sendInterfaceScript(player, 3336);

            player.getAttributes().unSet("withdrawingAsNote");
            player.getAttributes().unSet("banking");
        }
    }
    );
    public static final GameInterface BANK_SCREEN_INVENTORY = new GameInterface(763, new int[]{197, 84}, new NodeRunnable<Player>() {
        public void run(Player player) {
            Static.proto.sendAccessMask(player, 0, 27, 763, 0, 36, 1918);
            Static.proto.sendAccessMask(player, 0, 27, 763, 2, 65, 1538);
            player.getInventory().refresh();
        }
    });

    public static final GameInterface SETUP_SCREEN = new GameInterface(791, null, new NodeRunnable<Player>() {
        @Override
        public void run(Player player) {
            Static.proto.sendConfig(player, 1305, 0);
            Static.proto.sendInterface(player, SETUP_SCREEN_INVENTORY);
        }
    }, new NodeRunnable<Player>() {
        @Override
        public void run(Player player) {
            ClanWars.end(player);
        }
    }
    );

    public static final GameInterface SETUP_SCREEN_INVENTORY = new GameInterface(792, new int[]{197, 84}, new NodeRunnable<Player>() {
        public void run(Player player) {
        }
    });
}
