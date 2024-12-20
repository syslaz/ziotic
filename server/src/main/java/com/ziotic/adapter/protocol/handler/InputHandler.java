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
public class InputHandler extends PlayerFrameHandler {
    @Override
    public void handleFrame(Player player, IoSession session, Frame frame) {
        switch (frame.getOpcode()) {
            case 54:
                handleTextInput(player, frame);
                break;
            case 51:
                handleAmountInput(player, frame);
                break;
        }
    }

    private void handleAmountInput(Player player, Frame frame) {
        if (!player.getAttributes().isSet("inputId")) {
            return;
        }

        int input = frame.readInt();
        int inputId = player.getAttributes().getInt("inputId");

        Static.callScript("inputs.handleInput", player, inputId, input);

        player.getAttributes().unSet("inputId");
    }

    private void handleTextInput(Player player, Frame frame) {
        if (!player.getAttributes().isSet("inputId")) {
            return;
        }

        String input = frame.readString();
        int inputId = player.getAttributes().getInt("inputId");

        Static.callScript("inputs.handleInput", player, inputId, input);

        player.getAttributes().unSet("inputId");
    }
}
