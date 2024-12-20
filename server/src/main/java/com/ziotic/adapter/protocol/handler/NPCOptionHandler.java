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
import com.ziotic.logic.dialogue.Conversation;
import com.ziotic.logic.map.CoordinateFuture;
import com.ziotic.logic.map.PathProcessor;
import com.ziotic.logic.map.pf.astar.AStarPathFinder;
import com.ziotic.logic.npc.NPC;
import com.ziotic.logic.player.Player;
import com.ziotic.network.Frame;
import com.ziotic.network.handler.PlayerFrameHandler;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;
import org.apache.mina.core.session.IoSession;

/**
 * @author Lazaro
 */
public class NPCOptionHandler extends PlayerFrameHandler {
    @SuppressWarnings("unused")
    private static final Logger logger = Logging.log();

    @Override
    public void handleFrame(final Player player, IoSession session, Frame frame) {
        final int index;
        final int npcIndex;
        final boolean ctrl;

        switch (frame.getOpcode()) {
            case 34:
                index = 0;
                ctrl = frame.readUnsignedA() == 1;
                npcIndex = frame.readUnsignedLEShortA();
                break;
            case 48:
                index = 1;
                npcIndex = frame.readUnsignedLEShortA();
                ctrl = frame.readUnsignedA() == 1;
                break;
            case 77:
                index = 2;
                ctrl = frame.readUnsignedC() == 1;
                npcIndex = frame.readUnsignedShortA();
                break;
            case 3:
                index = 3;
                ctrl = frame.readUnsignedC() == 1;
                npcIndex = frame.readUnsignedShortA();
                break;
            default:
                return;
        }
        final NPC npc = Static.world.getNPCs().get(npcIndex);
        System.out.println("loc x: " + npc.getLocation().getX() + " y: " + npc.getLocation().getY() + " size: " + npc.getSize());
        if (npc == null || !npc.isVisible()) {
            return;
        }

        if (player.getPathProcessor().getMoveSpeed() == PathProcessor.MOVE_SPEED_WALK) {
            return;
        }

        if (index == 0) {
            //player.getCombat().initiate(npc);
            player.getCombat().createNewCombatAction(player, npc, false, -1, -1);
            //Static.callScript("specialattacks.doProjectile", player, player, npc, player.getLocation(), npc.getLocation());
        } else {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    Runnable r2 = new Runnable() {
                        @Override
                        public void run() {
                            switch (index) {
                                case 1:
                                    if (npc.getDefinition().dialogue != null) {
                                        new Conversation(npc.getDefinition().dialogue, player, npc).init();
                                    } else {
                                        Static.ahs.handleNPCOption(player, npc, index);
                                        //logger.debug("Unhandled NPC dialogue [npc=" + npc.getId() + "]");
                                    }
                                    break;
                                case 2:
                                    if (!Static.ahs.handleNPCOption(player, npc, index)) {
                                        Static.callScript("npcs.handleNPCOption2", player, npc.getId(), npc);
                                    }
                                    break;
                                case 3:
                                    if (!Static.ahs.handleNPCOption(player, npc, index)) {
                                        Static.callScript("npcs.handleNPCOption3", player, npc.getId(), npc);
                                    }
                                    break;
                            }
                        }
                    };
                    CoordinateFuture cF = new CoordinateFuture(player, npc, r2);
                    player.getPathProcessor().setCoordinateFuture(cF);
                    player.getPathProcessor().updateCoordinateFuture();
                    if (player.getPathProcessor().getCoordinateFuture() != null) {
                        Static.world.submitPath(new AStarPathFinder(), player, npc.getX(), npc.getY(), npc, ctrl ? PathProcessor.MOVE_SPEED_RUN : PathProcessor.MOVE_SPEED_ANY, false, null);
                        player.getPathProcessor().setCoordinateFuture(cF);
                    }
                }
            };
            Static.engine.dispatchToMapWorker(r);
        }
    }
}
