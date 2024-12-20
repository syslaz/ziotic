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
import com.ziotic.content.trading.TradingManager;
import com.ziotic.logic.item.ItemsOnDeathManager;
import com.ziotic.logic.map.PathProcessor;
import com.ziotic.logic.map.Tile;
import com.ziotic.logic.map.pf.astar.AStarPathFinder;
import com.ziotic.logic.player.Player;
import com.ziotic.network.Frame;
import com.ziotic.network.handler.PlayerFrameHandler;

import org.apache.mina.core.session.IoSession;

/**
 * @author Lazaro
 */
public class WalkingHandler extends PlayerFrameHandler {
    @Override
    public void handleFrame(Player player, IoSession session, Frame frame) {
        int y = frame.readUnsignedShortA();
        boolean ctrl = frame.readUnsignedS() == 1;
        int x = frame.readUnsignedShortA();

        if (player.getPathProcessor().getMoveSpeed() == PathProcessor.MOVE_SPEED_WALK) {
            return;
        }
        Static.ahs.handleWalk(player);
        Static.proto.sendCloseInterface(player);
        if (player.getCombat().isFrozen()) {
            Static.proto.sendMessage(player, "A magical force stops you from moving.");
            player.getCombat().stop(true);
            player.faceDirection(Tile.locate(x, y, player.getZ()));
            return;
        }
        TradingManager.handleWalking(player, player.getTradingManager().getOtherPlayer());
        ItemsOnDeathManager.handleWalking(player);
        player.getCombat().stop(true);
        player.getPathProcessor().setCoordinateFuture(null);
        Static.world.submitPath(new AStarPathFinder(), player, x, y, null, ctrl ? PathProcessor.MOVE_SPEED_RUN : PathProcessor.MOVE_SPEED_ANY, false, null);
        player.getPathProcessor().processPathRequest();
        player.preventFrameSpam(frame.getOpcode());
    }
}
