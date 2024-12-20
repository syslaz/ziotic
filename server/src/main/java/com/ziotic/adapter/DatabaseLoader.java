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
package com.ziotic.adapter;

import com.ziotic.content.cc.Clan;
import com.ziotic.engine.login.LoginResponse;
import com.ziotic.logic.player.PlayerSave;

/**
 * @author Lazaro
 */
public interface DatabaseLoader {
    public void banIP(String ip);

    public boolean isBanned(String userName);

    public boolean isIPBanned(String ip);

    public LoginResponse loadPlayer(String userName, String password, PlayerSave player);

    public void savePlayer(String userName, boolean lobby, PlayerSave player);

    public void registerClan(String owner, String name);

    public boolean loadClan(String owner, Clan clan);

    public void saveClan(Clan clan);

    public void reload();
}
