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
package com.ziotic.link.network;

import java.util.HashMap;
import java.util.Map;

import com.ziotic.link.network.handler.WSSClanHandler;
import com.ziotic.link.network.handler.WSSFriendHandler;
import com.ziotic.link.network.handler.WSSMuteHandler;
import com.ziotic.link.network.handler.WSSPlayerHandler;
import com.ziotic.network.FrameHandler;
import com.ziotic.utility.Logging;
import com.ziotic.utility.Mapper;

import org.apache.log4j.Logger;

/**
 * @author Lazaro
 */
public class WSSFrameHandlerMap implements Mapper<Integer, FrameHandler> {
    private static final Logger logger = Logging.log();

    private Map<Integer, FrameHandler> handlers = null;

    @Override
    public Map<Integer, FrameHandler> map() {
        handlers = new HashMap<Integer, FrameHandler>();

        bind(new WSSPlayerHandler(), 1, 2, 3, 4, 12);
        bind(new WSSFriendHandler(), 5);
        bind(new WSSClanHandler(), 6, 7, 8, 9, 10, 11);
        bind(new WSSMuteHandler(), 20);

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
