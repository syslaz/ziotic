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

import com.ziotic.content.cc.Clan.Rank;
import com.ziotic.content.cc.ClanManager;
import com.ziotic.logic.player.Player;
import com.ziotic.network.Frame;
import com.ziotic.network.handler.PlayerFrameHandler;

import org.apache.mina.core.session.IoSession;

/**
 * @author Lazaro
 */
public class ClanHandler extends PlayerFrameHandler {
    @Override
    public void handleFrame(Player player, IoSession session, Frame frame) {
        switch (frame.getOpcode()) {
            case 18: // Join/Leave clan
                joinOrLeaveClan(player, frame);
                break;
            case 39: // Kick player from clan
                kickPlayer(player, frame);
                break;
            case 25: // Rank player in clan
                rankPlayer(player, frame);
                break;
        }
    }

    private void joinOrLeaveClan(Player player, Frame frame) {
        if (frame.remaining() >= 1) {
            String owner = frame.readString();

            ClanManager.joinChannel(player, owner);
        } else {
            ClanManager.leaveChannel(player);
        }
    }

    private void kickPlayer(Player player, Frame frame) {
        String name = frame.readString();

        ClanManager.kickPlayer(player, name);
    }

    private void rankPlayer(Player player, Frame frame) {
        String name = frame.readString();
        int rank = frame.readUnsigned();

        if (rank > 6) {
            return;
        }

        ClanManager.rankPlayer(player, name, Rank.forValue(rank));
    }
}
