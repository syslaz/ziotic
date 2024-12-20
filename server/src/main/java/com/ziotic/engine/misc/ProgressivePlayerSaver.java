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

import java.util.LinkedList;
import java.util.List;

import com.ziotic.Static;
import com.ziotic.link.WorldClientSession;
import com.ziotic.logic.player.Player;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

/**
 * @author Lazaro
 */
public class ProgressivePlayerSaver implements Runnable {
    private static final Logger logger = Logging.log();

    private Thread thread;

    public ProgressivePlayerSaver() {
        thread = new Thread(this, "auto-save");
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
    }

    @Override
    public void run() {
        WorldClientSession session = null;
        while (true) {
            try {
                session = Static.world.getWCSPool().acquire();

                List<Player> cachedPlayerList = new LinkedList<Player>(Static.world.getPlayers());
                for (Player player : cachedPlayerList) {
                    if (player != null && player.isConnected() && !player.isOnLogin()) {
                        if (!session.savePlayerDetails(player)) {
                            logger.warn("Failed to auto-save player [name=" + player.getName() + "]!");
                        }
                    }
                }
            } catch (Exception e) {
                logger.error("Error caught in player saver!", e);
            } finally {
                if (session != null) {
                    Static.world.getWCSPool().release(session);
                    session = null;
                }

                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
