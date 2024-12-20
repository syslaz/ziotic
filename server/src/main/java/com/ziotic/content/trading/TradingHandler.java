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
package com.ziotic.content.trading;

import com.ziotic.content.handler.ActionHandlerSystem;
import com.ziotic.content.handler.ButtonHandler;
import com.ziotic.logic.player.Player;

/**
 * @author Maxime
 */
public class TradingHandler implements ButtonHandler {

    /**
     * @see com.ziotic.content.handler.ActionHandler#load(com.ziotic.content.handler.ActionHandlerSystem)
     */
    @Override
    public void load(ActionHandlerSystem system) throws Exception {
        // TODO Auto-generated method stub
        system.registerButtonHandler(new int[]{334, 335, 336}, this);
    }

    @Override
    public boolean explicitlyForMembers() {
        return false;
    }

    /**
     * @see com.ziotic.content.handler.ButtonHandler#handleButton(com.ziotic.logic.player.Player, int, int, int, int, int)
     */
    @Override
    public void handleButton(Player player, int opcode, int interfaceId, int b, int b2, int b3) {
        switch (interfaceId) {
            case 334:
                TradingManager.handleTradeScreenOptions(player, opcode, interfaceId, b, b2, b3);
                break;
            case 335:
                TradingManager.handleTradeScreenOptions(player, opcode, interfaceId, b, b2, b3);
                break;
            case 336:
                TradingManager.handleInventoryOptions(player, opcode, b2);
                break;
        }
    }
}
