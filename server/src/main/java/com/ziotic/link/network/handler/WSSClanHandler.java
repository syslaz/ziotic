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
package com.ziotic.link.network.handler;

import java.io.IOException;

import com.ziotic.Static;
import com.ziotic.content.cc.Clan;
import com.ziotic.content.cc.ClanManager;
import com.ziotic.link.WorldServerSession;
import com.ziotic.network.Frame;
import com.ziotic.network.FrameBuilder;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;
import org.apache.mina.core.session.IoSession;

/**
 * @author Lazaro
 */
public class WSSClanHandler extends WSSFrameHandler {
    private static final Logger logger = Logging.log();

    @Override
    public void handleFrame(WorldServerSession world, IoSession session, Frame frame) {
        try {
            switch (frame.getOpcode()) {
                case 6: // Load clan
                    loadClan(world, frame);
                    break;
                case 7: // Join clan
                    joinClan(world, frame);
                    break;
                case 8: // Leave clan
                    leaveClan(world, frame);
                    break;
                case 9: // Save clan
                    saveClan(world, frame);
                    break;
                case 10: // Send message
                    sendMessage(world, frame);
                    break;
                case 11: // Kick player
                    kickPlayer(world, frame);
                    break;
            }
        } catch (Exception e) {
            logger.error("Error handling clan frame [" + frame.toString() + "]", e);
        }
    }

    private void kickPlayer(WorldServerSession world, Frame frame) {
        String name = frame.readString();

        Static.currentLink().kickPlayerFromClan(name);
    }

    private void sendMessage(WorldServerSession world, Frame frame) {
        String sender = frame.readString();
        int rights = frame.readUnsigned();
        String owner = frame.readString();
        String message = frame.readString();

        Static.currentLink().sendCCMessage(sender, rights, owner, message);
    }

    private void saveClan(WorldServerSession world, Frame frame) throws IOException {
        byte[] clanData = new byte[frame.remaining()];
        frame.read(clanData);
        Clan clan = new Clan();
        clan.load(clanData);
        ClanManager.saveClan2(clan);
    }

    private void leaveClan(WorldServerSession world, Frame frame) {
        String name = frame.readString();
        String owner = frame.readString();

        ClanManager.unregisterPlayer(name, owner);
    }

    private void joinClan(WorldServerSession world, Frame frame) {
        String name = frame.readString();
        String owner = frame.readString();
        int resp = ClanManager.attemptJoinChannel(name, owner);
        FrameBuilder fb = new FrameBuilder(7, Frame.FrameType.VAR_BYTE, 64);
        fb.writeString(name);
        fb.writeByte(resp);
        IoSession session = world.getSession();
        if (session != null) {
            session.write(fb.toFrame());
        }
    }

    private void loadClan(WorldServerSession world, Frame frame) {
        String name = frame.readString();
        String owner = frame.readString();
        Clan clan = new Clan(owner);
        boolean resp = Static.currentLink().getDBLoader().loadClan(owner, clan);
        FrameBuilder fb = new FrameBuilder(6, Frame.FrameType.VAR_BYTE, 1024);
        fb.writeString(name);
        if (resp) {
            fb.writeByte(1);
            fb.write(clan.toByteArray());
        } else {
            fb.writeByte(0);
        }
        IoSession session = world.getSession();
        if (session != null) {
            session.write(fb.toFrame());
        }
    }
}
