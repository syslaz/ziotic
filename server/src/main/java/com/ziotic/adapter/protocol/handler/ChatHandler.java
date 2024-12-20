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
import com.ziotic.content.cc.ClanManager;
import com.ziotic.logic.mask.Chat;
import com.ziotic.logic.player.Player;
import com.ziotic.network.Frame;
import com.ziotic.network.handler.PlayerFrameHandler;
import com.ziotic.utility.Text;

import org.apache.mina.core.session.IoSession;

/**
 * @author Lazaro
 */
public class ChatHandler extends PlayerFrameHandler {
    @Override
    public void handleFrame(Player player, IoSession session, Frame frame) {
        switch (frame.getOpcode()) {
            case 56:
                handleChat(player, frame);
                break;
            case 30:
                handleMessageSetting(player, frame);
                break;
        }

        player.preventFrameSpam(frame.getOpcode());
    }

    private void handleMessageSetting(Player player, Frame frame) {
        int type = frame.readUnsigned();

        player.getAttributes().set("msgType", type);
    }

    private void handleChat(Player player, Frame frame) {
        int color = frame.readUnsigned();
        int effect = frame.readUnsigned();
        int length = frame.readSmart();
        byte[] textBuffer = new byte[frame.getLength() - frame.getPosition()];
        frame.read(textBuffer);
        if (player.isMuted()) {
            Static.proto.sendMessage(player, "You are muted. To appeal your mute go to the Ziotic forums.");
            return;
        }
        String text = Text.decompressHuffman(textBuffer, length);
        int msgType = player.getAttributes().getInt("msgType");
        if (msgType == 1 && player.getClan() != null) {
            ClanManager.sendMessage(player, Text.optimizeText(text));
        } else {
            Chat chat = new Chat(Text.optimizeText(text), color, effect);
            Player[] playerArray = Static.world.getLocalPlayers(player.getLocation());
            for (int i = 0; i < playerArray.length; i++) {
                if (playerArray[i] == null)
                    continue;
                Static.proto.sendPublicChat(playerArray[i], player, chat);
            }
        }
    }
}
