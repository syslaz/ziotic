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

import java.util.LinkedHashSet;
import java.util.Set;

import com.ziotic.engine.tick.Tick;
import com.ziotic.logic.map.Coverage;
import com.ziotic.logic.map.Tile;
import com.ziotic.logic.map.event.NPCTileEventListener;
import com.ziotic.logic.map.event.PlayerTileEventListener;
import com.ziotic.logic.npc.NPC;
import com.ziotic.logic.npc.NPC.MovementType;
import com.ziotic.logic.npc.NPCDefinition;
import com.ziotic.logic.player.Player;
import com.ziotic.utility.Destroyable;

public class AggressionHandler implements NPCTileEventListener, PlayerTileEventListener, Destroyable {

    private Coverage coverage;
    private NPC owner;
    private Set<Tile> listeners = new LinkedHashSet<Tile>();

    public AggressionHandler(NPC owner) {
        this.owner = owner;
        NPCDefinition def = owner.getDefinition();
        Tile center = owner.getCoverage().center();
        this.coverage = new Coverage(center.translate(-def.aggressiveRange, -def.aggressiveRange, center.getZ()), def.aggressiveRange * 2);
    }

    public void register() {
        Tile[][] tiles = coverage.tiles();
        for (int x = 0; x < tiles.length; x++) {
            for (int y = 0; y < tiles[x].length; y++) {
                register(tiles[x][y]);
            }
        }
    }

    public void unregister() {
        for (Tile t : listeners) {
            unregister(t);
        }
        owner = null;
    }

    @Override
    public void onPlayerEvent(Player player, Tile tile) {
        if (owner == null) {
            unregister(tile);
            return;
        }
        Tick t = owner.retrieveTick("CombatTick");
        if (owner.getCombat().scheduledAction != null && t != null) {
            if (owner.getCombat().scheduledAction.victim == player)
                return;
            else if (owner.getCombat().isAttacking())
                return;

        }
        if (t == null) {
            owner.getCombat().createNewCombatAction(owner, player);
        } else if (/*!t.running() || */owner.getCombat().scheduledAction == null) {
            owner.getCombat().createNewCombatAction(owner, player);
        } else if (!owner.getCombat().isAttacking() && owner.getMovementType() == MovementType.RANDOM) {
            owner.getCombat().createNewCombatAction(owner, player);
        } else if(!t.running()) {
            owner.getCombat().createNewCombatAction(owner, player);
        }
    }

    @Override
    public void onNPCEvent(NPC npc, Tile tile) {
    }

    @Override
    public void onRegister(Tile tile) {
        if (tile.containsPlayers()) {
            for (Player player : tile.getPlayers()) {
                if (player != null) {
                    onPlayerEvent(player, tile);
                }
            }
        }
    }

    @Override
    public void destroy() {
        unregister();
    }

    private void register(Tile tile) {
        tile.registerEventListener(this);
        listeners.add(tile);
    }

    private void unregister(Tile tile) {
        tile.unregisterEventListener(this);
    }

}
