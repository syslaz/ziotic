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
package com.ziotic.engine.misc;

import com.ziotic.Static;
import com.ziotic.engine.event.RecurringEvent;
import com.ziotic.link.WorldClientSession;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

public class LocalPlayerListSynchronizer extends RecurringEvent {
    private static final Logger log = Logging.log();

    public LocalPlayerListSynchronizer() {
        super(15000, ExecutorType.SERVICE_WORKER);
    }

    @Override
    public void run() {
        WorldClientSession session = Static.world.getWCSPool().acquire();
        try {
            session.synchronizeLocalPlayerList();
        } catch (Exception e) {
            log.error("Exception caught on player list synchronize!", e);
        }
        Static.world.getWCSPool().release(session);
    }
}
