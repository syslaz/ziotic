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

import com.ziotic.Static;
import com.ziotic.logic.player.Player;
import com.ziotic.network.Frame;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

/**
 * @author Lazaro
 */
public class FrameWorker implements Runnable {
    private static final Logger logger = Logging.log();
    /* (non-Javadoc)
      * @see java.lang.Runnable#run()
      */

    @Override
    public void run() {
        try {
            if (Static.isGame()) {
                for (Object playerObj : Static.world.getPlayers().toArray()) {
                    if (playerObj != null) handlePlayer((Player) playerObj);
                }
            }
            if (Static.isLobby()) {
                for (Object playerObj : Static.world.getLobbyPlayers().toArray()) {
                    if (playerObj != null) handlePlayer((Player) playerObj);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handlePlayer(Player player) {
        boolean[] frameFlag = player.getFrameHistory();
        if (player.isConnected() && !player.getFrameQueue().isEmpty()) {
            for (Frame f = player.getFrameQueue().poll(); f != null; f = player.getFrameQueue().poll()) {
                int opcode = f.getOpcode();
                if (frameFlag[opcode]) {
                    continue;
                }

                try {
                    Static.frameManager.getHandler(opcode).handleFrame(player.getSession(), f);
                } catch (Exception e) {
                    logger.error("Error handling frame [opcode:" + f.getOpcode() + "]", e);
                }
            }
        }
    }
}
