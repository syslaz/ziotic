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

import com.ziotic.logic.dialogue.Conversation;
import com.ziotic.logic.player.Player;
import com.ziotic.network.Frame;
import com.ziotic.network.handler.PlayerFrameHandler;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;
import org.apache.mina.core.session.IoSession;

/**
 * @author Lazaro
 */
public class DialogueHandler extends PlayerFrameHandler {
    private static final Logger logger = Logging.log();

    @Override
    public void handleFrame(Player player, IoSession session, Frame frame) {
        int interfaceSet = frame.readInt();
        int interfaceId = interfaceSet >> 16;
        int buttonId = interfaceSet & 0xffff;
        int buttonId2 = frame.readUnsignedLEShortA();
        if (buttonId2 == 65535) {
            buttonId2 = 0;
        }

        Conversation conversation = player.getCurrentConversation();
        if (conversation != null) {
            switch (interfaceId) {
                case 64:
                case 65:
                case 66:
                case 67:
                case 241:
                case 242:
                case 243:
                case 244:
                    conversation.handle(-1);
                    break;
                case 228:
                case 232:
                case 233:
                case 229:
                case 230:
                case 234:
                    conversation.handle(buttonId - 2);
                    break;
                default:
                    logger.debug("Unhandled interface [id=" + interfaceId + ", button=" + buttonId + ", button2=" + buttonId2 + "]");
                    break;
            }
        }
    }
}
