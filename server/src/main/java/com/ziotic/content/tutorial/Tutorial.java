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
package com.ziotic.content.tutorial;

import com.ziotic.Static;
import com.ziotic.logic.dialogue.Conversation;
import com.ziotic.logic.npc.NPC;
import com.ziotic.logic.player.Player;

/**
 * @author Lazaro
 */
public class Tutorial {
    public static final int RODDECK_ID = 8863;

    private static NPC roddeck = null;

    public static void onFirstLogin(Player player) {

        if (roddeck == null || !roddeck.isValid() || roddeck.isDestroyed()) {
            roddeck = Static.world.searchForNPCs(RODDECK_ID)[0];
        }
        new Conversation(Conversation.loadDialogue("npc/dialogue/tutorial"), player, roddeck).init();
    }
}
