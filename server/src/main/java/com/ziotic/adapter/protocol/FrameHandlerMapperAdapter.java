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
package com.ziotic.adapter.protocol;

import java.util.HashMap;
import java.util.Map;

import com.ziotic.adapter.protocol.handler.*;
import com.ziotic.network.FrameHandler;
import com.ziotic.network.handler.SilentFrameHandler;
import com.ziotic.utility.Logging;
import com.ziotic.utility.Mapper;

import org.apache.log4j.Logger;

/**
 * @author Lazaro
 */
public class FrameHandlerMapperAdapter implements Mapper<Integer, FrameHandler> {
    private static final Logger logger = Logging.log();

    private Map<Integer, FrameHandler> handlers = null;

    @Override
    public Map<Integer, FrameHandler> map() {
        handlers = new HashMap<Integer, FrameHandler>();

        bind(new SilentFrameHandler(), 31, 4, 66, 26, 58, 63, 53, 40);
        // 58, 63, 53, 40 - sent on login
        // 49 - click
        // 4 - focus
        // 31 - mouse move
        // 66 - type
        // 26 - ??

        bind(new ClickHandler(), 49);
        bind(new ButtonHandler(1), 43);
        bind(new ButtonHandler(2), 13);
        bind(new ButtonHandler(3), 62);
        bind(new ButtonHandler(4), 71);
        bind(new ButtonHandler(5), 64);
        bind(new ButtonHandler(6), 41);
        bind(new ButtonHandler(7), 67);
        bind(new ButtonHandler(8), 6);
        bind(new ButtonHandler(9), 20);
        bind(new ButtonHandler(10), 27);

        bind(new ChatHandler(), 56, 30);
        bind(new ClanHandler(), 18, 39, 25);
        bind(new CloseInterfaceHandler(), 50);
        bind(new CommandHandler(), 28);
        bind(new FriendHandler(), 9, 15, 55, 85, 76);
        bind(new InputHandler(), 51, 54);
        bind(new ItemSwitchHandler(), 72);
        bind(new NPCOptionHandler(), 34, 48, 77, 3);
        bind(new ObjectOptionHandler(), 5, 12);
        bind(new PickupItemHandler(), 17);
        bind(new PlayerOptionHandler(), 32, 19, 59, 7);
        bind(new ScreenSetHandler(), 35);
        bind(new WalkingHandler(), 69, 45);
        bind(new PingHandler(), 83);
        bind(new WorldListHandler(), 84);
        bind(new DialogueHandler(), 2);
        bind(new ItemOnItemHandler(), 42);
        bind(new MagicOnPlayerHandler(), 68);
        bind(new ObjectExamineHandler(), 38);
        bind(new GroundItemOptionHandler(), 37);
        bind(new ItemOnObjectHandler(), 36);
        bind(new MagicOnNpcHandler(), 23);

        return handlers;
    }

    private void bind(FrameHandler handler, int... opcodes) {
        for (int op : opcodes) {
            if (handlers.put(op, handler) != null) {
                logger.warn("Ambiguous frame handler opcode : " + op);
            }
        }
    }
}
