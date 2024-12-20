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

import java.io.IOException;

import com.ziotic.link.WorldServerSession;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

/**
 * @author Lazaro
 */
public class LConnectionHandler extends IoHandlerAdapter {
    private static Logger logger = Logging.log();

    @Override
    public void sessionCreated(IoSession session) {
        logger.info("Channel connected <" + session.getRemoteAddress().toString() + ">");
    }

    @Override
    public void sessionClosed(IoSession session) {
        WorldServerSession world = (WorldServerSession) session.getAttribute("world");
        if (world != null) {
            world.removeSession(session);
            if (!world.isOnline()) {
                world.destroy();
            }
        }

        logger.info("Channel disconnected <" + session.getRemoteAddress().toString() + ">");
    }

    @Override
    public void sessionIdle(IoSession session, IdleStatus status) {
        session.close(false);
    }

    @Override
    public void exceptionCaught(IoSession session, Throwable cause) {
        if (!(cause instanceof IOException)) {
            logger.error("Exception caught in networking!", cause);
        } else {
            session.close(false);
        }
    }
}
