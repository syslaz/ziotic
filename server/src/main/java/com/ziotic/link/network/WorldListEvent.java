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

import com.ziotic.Static;
import com.ziotic.engine.event.RecurringEvent;
import com.ziotic.link.WorldServerSession;
import com.ziotic.network.Frame;

import org.apache.mina.core.session.IoSession;

public class WorldListEvent extends RecurringEvent {
    public WorldListEvent() {
        super(1000, ExecutorType.SERVICE_WORKER);
    }

    @Override
    public void run() {
        Frame frame = Static.proto.generateWorldList();
        for (WorldServerSession w : Static.currentLink().getLobbies()) {
            IoSession session = w.getSession();
            if (session != null) {
                session.write(frame);
            }
        }
        for (WorldServerSession w : Static.currentLink().getGames()) {
            if (w.getServerType() == 2) {
                IoSession session = w.getSession();
                if (session != null) {
                    session.write(frame);
                }
            }
        }
    }
}
