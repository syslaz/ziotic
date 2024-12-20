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
package com.ziotic.network.handler;

import java.util.Map;

import com.ziotic.Static;
import com.ziotic.adapter.protocol.FrameHandlerMapperAdapter;
import com.ziotic.link.network.WSSFrameHandlerMap;
import com.ziotic.network.Frame;
import com.ziotic.network.FrameHandler;
import com.ziotic.utility.Logging;
import com.ziotic.utility.Mapper;

import org.apache.log4j.Logger;

/**
 * @author Lazaro
 */
public class FrameHandlerManager {
    private static Logger logger = Logging.log();

    private FrameHandler[] frameHandlers = new FrameHandler[Frame.MAX_OPCODE + 1];

    public FrameHandlerManager() {
        Mapper<Integer, FrameHandler> mapper = Static.isLink() ? new WSSFrameHandlerMap() : new FrameHandlerMapperAdapter();
        Map<Integer, FrameHandler> handlerMap = mapper.map();
        for (Map.Entry<Integer, FrameHandler> handler : handlerMap.entrySet()) {
            frameHandlers[handler.getKey()] = handler.getValue();
        }
        logger.info("Loaded " + handlerMap.size() + " frame(s)");
    }

    public FrameHandler getHandler(int opcode) {
        FrameHandler handler = frameHandlers[opcode];
        if (handler == null) {
            handler = frameHandlers[opcode] = new DebugFrameHandler();
        }
        return handler;
    }
}
