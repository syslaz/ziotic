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
package com.ziotic.logic.player;

import com.ziotic.utility.Text;

public class RemotePlayer implements PlayerType {
    private String name;
    private String protocolName;
    private int world;
    private boolean lobby;

    private String clanOwner = null;

    public RemotePlayer(String name, int world, boolean lobby) {
        this.name = Text.formatNameForDisplay(name);
        this.protocolName = name;
        this.world = world;
        this.lobby = lobby;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getProtocolName() {
        return protocolName;
    }

    @Override
    public int getWorld() {
        return world;
    }

    @Override
    public boolean inGame() {
        return !lobby;
    }

    @Override
    public boolean inLobby() {
        return lobby;
    }

    public String getClanOwner() {
        return clanOwner;
    }

    public void setClanOwner(String clanOwner) {
        this.clanOwner = clanOwner;
    }

    @Override
    public String toString() {
        return "name=" + protocolName + ", world=" + world + ", lobby=" + lobby;
    }
}
