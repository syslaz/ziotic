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

import java.util.ArrayList;
import java.util.List;

import com.ziotic.Static;
import com.ziotic.logic.player.DisplayMode;
import com.ziotic.logic.player.Player;
import com.ziotic.logic.utility.GameInterface;
import com.ziotic.network.Frame;
import com.ziotic.network.handler.PlayerFrameHandler;

import org.apache.mina.core.session.IoSession;

/**
 * @author Lazaro
 */
public class ScreenSetHandler extends PlayerFrameHandler {
    @Override
    public void handleFrame(Player player, IoSession session, Frame frame) {
        int displayMode = frame.readUnsigned();
        int width = frame.readUnsignedShort();
        int height = frame.readUnsignedShort();
        frame.readUnsigned();

        if (player.isOnLogin()) {
            player.setDisplayMode(DisplayMode.forValue(displayMode));
            switch (player.getDisplayMode()) {
                case FIXED:
                    Static.proto.sendFixedScreen(player);
                    break;
                case RESIZABLE:
                case FULL_SCREEN:
                    Static.proto.sendResizableScreen(player);
                    break;
            }
            Static.proto.sendAccessMask(player, 65535, 65535, player.getDisplayMode() == DisplayMode.FIXED ? 548 : 746, player.getDisplayMode() == DisplayMode.FIXED ? 81 : 120, 0, 2).sendAccessMask(player, 65535, 65535, 884, 11, 0, 2).sendAccessMask(player, 65535, 65535, 884, 12, 0, 2).sendAccessMask(player, 65535, 65535, 884, 13, 0, 2).sendAccessMask(player, 65535, 65535, 884, 14, 0, 2);
            player.setOnLogin(false);

            Static.callScript("login.onLogin", player);
        } else {
            DisplayMode oldDisplayMode = player.getDisplayMode();
            player.setDisplayMode(DisplayMode.forValue(displayMode));
            if (!player.getDisplayMode().equals(oldDisplayMode)) {
                List<GameInterface> gameInterfaces = new ArrayList<GameInterface>(player.getCurrentInterfaces().values());
                for (GameInterface gameInterface : gameInterfaces) {
                    Static.proto.sendCloseInterface(player, gameInterface);
                }
                switch (player.getDisplayMode()) {
                    case FIXED:
                        Static.proto.switchToFixedScreen(player);
                        break;
                    case RESIZABLE:
                    case FULL_SCREEN:
                        Static.proto.switchToResizableScreen(player);
                        break;
                }
                for (GameInterface gameInterface : gameInterfaces) {
                    Static.proto.sendInterface(player, gameInterface);
                }
            }
        }
    }
}
