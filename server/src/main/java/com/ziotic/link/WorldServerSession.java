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
package com.ziotic.link;

import java.util.ArrayList;
import java.util.List;

import com.ziotic.Static;
import com.ziotic.logic.player.RemotePlayer;
import com.ziotic.utility.Destroyable;

import org.apache.mina.core.session.IoSession;

/**
 * @author Lazaro
 */
public class WorldServerSession implements Destroyable {
    private int id;
    private int serverType;
    private String address;
    private List<IoSession> sessions = new ArrayList<IoSession>();
    private int currentSession = 0;
    private List<RemotePlayer> players = new ArrayList<RemotePlayer>();
    private List<RemotePlayer> lobbyPlayers = new ArrayList<RemotePlayer>();

    public WorldServerSession(int id, int serverType, String address) {
        this.id = id;
        this.serverType = serverType;
        this.address = address;

        switch (serverType) {
            case 0:
                players = new ArrayList<RemotePlayer>();
                break;
            case 1:
                lobbyPlayers = new ArrayList<RemotePlayer>();
                break;
            case 2:
                players = new ArrayList<RemotePlayer>();
                lobbyPlayers = new ArrayList<RemotePlayer>();
                break;
        }
    }

    public void registerSession(IoSession session) {
        sessions.add(session);
    }

    public void removeSession(IoSession session) {
        sessions.remove(session);
    }

    public IoSession getSession() {
        IoSession session;
        try {
            session = sessions.get(currentSession);
        } catch (Exception e) {
            return null;
        }
        currentSession++;
        if (currentSession >= sessions.size()) {
            currentSession = 0;
        }
        return session;
    }

    public boolean isOnline() {
        return sessions.size() > 0;
    }

    public int getId() {
        return id;
    }

    public int getServerType() {
        return serverType;
    }

    public boolean isLobby() {
        return serverType == 1;
    }

    public void destroy() {
        Static.currentLink().removeWorld(this);
    }

    @Override
    public String toString() {
        return "id=" + id + ", type=" + serverType;
    }

    public String getAddress() {
        return address;
    }

    public List<RemotePlayer> getPlayers() {
        return players;
    }

    public List<RemotePlayer> getLobbyPlayers() {
        return lobbyPlayers;
    }

    public void registerPlayer(RemotePlayer player) {
        if (player.inGame()) {
            synchronized (players) {
                players.add(player);
            }
        } else {
            synchronized (lobbyPlayers) {
                lobbyPlayers.add(player);
            }
        }
    }

    public void unregisterPlayer(RemotePlayer player) {
        if (player.inGame()) {
            synchronized (players) {
                players.remove(player);
            }
        } else {
            synchronized (lobbyPlayers) {
                lobbyPlayers.remove(player);
            }
        }
    }
}
