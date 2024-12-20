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
import com.ziotic.logic.player.Player;
import com.ziotic.network.Frame;
import com.ziotic.network.handler.PlayerFrameHandler;
import com.ziotic.utility.Text;

import org.apache.mina.core.session.IoSession;

/**
 * @author Lazaro
 */
public class FriendHandler extends PlayerFrameHandler {
    @Override
    public void handleFrame(Player player, IoSession session, Frame frame) {
        switch (frame.getOpcode()) {
            case 9:
                String name = frame.readString();
                player.getFriends().addFriend(name);
                break;
            case 15:
                name = frame.readString();
                player.getFriends().removeFriend(name);
                break;
            case 76:
                if (player.isMuted()) {
                    if (player.inGame())
                        Static.proto.sendMessage(player, "You are muted. To appeal your mute go to the Ziotic forums.");
                    break;
                }
                String recipient = frame.readString();
                int length = frame.readSmart();
                byte[] textBuffer = new byte[frame.getLength() - frame.getPosition()];
                frame.read(textBuffer);
                String message = Text.optimizeText(Text.decompressHuffman(textBuffer, length));
                player.getFriends().sendPM(recipient, message);
                break;
            case 55:
                name = frame.readString();
                frame.readUnsigned();
                player.getFriends().addIgnore(name);
                break;
            case 85:
                name = frame.readString();
                player.getFriends().removeIgnore(name);
                break;
        }
    }
}
