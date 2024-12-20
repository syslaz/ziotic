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
package com.ziotic.content.combat.misc;

import java.util.HashMap;
import java.util.Iterator;

import com.ziotic.content.handler.ActionHandlerSystem;
import com.ziotic.content.handler.LogoutHandler;
import com.ziotic.engine.tick.Tick;
import com.ziotic.logic.player.Player;

public class SkullRegisterManager implements LogoutHandler {

    private Player player;

    private HashMap<Long, Player> victims = new HashMap<Long, Player>();
    private HashMap<Long, Player> attackedBy = new HashMap<Long, Player>();

    public SkullRegisterManager() {
    }

    public SkullRegisterManager(Player player) {
        this.player = player;
    }

    private void addVictim(Player victim) {
        victims.put(victim.getIdentifier(), victim);
        victim.skullRegisterManager.attackedBy.put(player.getIdentifier(), player);
    }

    public void onLogout() {
        Iterator<Player> it = victims.values().iterator();
        while (it.hasNext()) {
            Player player = it.next();
            if (player != null) {
                player.skullRegisterManager.attackedBy.remove(player.getIdentifier());
                player.skullRegisterManager.victims.remove(player.getIdentifier());
            }
        }
        victims.clear();
        attackedBy.clear();
    }

    public static void handleSkulling(final Player attacker, final Player victim) {
        if (shouldSkull(attacker, victim)) {
            Tick tick = new Tick("SkullTimer", 2000) {
                @Override
                public boolean execute() {
                    attacker.getItemsOnDeathManager().isSkulled(false);
                    attacker.getAppearance().setPKIcon(-1);
                    attacker.getAppearance().refresh();
                    return false;
                }
            };
            attacker.registerTick(tick);
            attacker.getAppearance().setPKIcon(0);
            attacker.getItemsOnDeathManager().isSkulled(true);
            attacker.getAppearance().refresh();
        }
    }

    private static boolean shouldSkull(Player attacker, Player victim) {
        SkullRegisterManager attackerR = attacker.skullRegisterManager;
        if (attackerR.attackedBy.containsKey(victim.getIdentifier())) {
            return false;
        } else if (attackerR.victims.containsKey(victim.getIdentifier())) {
            return false;
        } else {
            attackerR.addVictim(victim);
            return true;
        }
    }

    @Override
    public void load(ActionHandlerSystem system) throws Exception {
        system.registerLogoutHandler(this);
    }

    @Override
    public boolean explicitlyForMembers() {
        return false;
    }

    @Override
    public void onLogout(Player player, boolean lobby) {
        player.skullRegisterManager.onLogout();
    }

}
