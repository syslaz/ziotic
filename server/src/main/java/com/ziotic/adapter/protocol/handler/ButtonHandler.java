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

import org.apache.mina.core.session.IoSession;

/**
 * @author Lazaro
 */
public class ButtonHandler extends PlayerFrameHandler {
    private int opcode;

    public ButtonHandler(int opcode) {
        this.opcode = opcode;
    }

    @Override
    public void handleFrame(Player player, IoSession session, Frame frame) {
        int interfaceSet = frame.readInt();
        int interfaceId = interfaceSet >> 16;
        int b = interfaceSet & 0xff;
        int b2 = frame.readUnsignedShortA();
        int b3 = frame.readUnsignedShortA();
        if (b2 == 65535) {
            b2 = 0;
        }
        if (b3 == 65535) {
            b3 = 0;
        }
        if (!Static.ahs.handleButton(player, opcode, interfaceId, b, b2, b3)) {
            Static.callScript("buttons.handleButton", player, opcode, interfaceId, b, b2, b3);
        }
        // player.preventFrameSpam(frame.getOpcode());
    }
}
