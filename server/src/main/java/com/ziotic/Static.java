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
package com.ziotic;

import java.util.Random;

import com.ziotic.adapter.ClientConfiguration;
import com.ziotic.content.handler.ActionHandlerSystem;
import com.ziotic.engine.Engine;
import com.ziotic.io.XMLSession;
import com.ziotic.io.rs2cache.RS2Cache;
import com.ziotic.io.servercache.ServerCache;
import com.ziotic.link.LinkServer;
import com.ziotic.logic.World;
import com.ziotic.logic.map.MapXTEA;
import com.ziotic.network.Protocol;
import com.ziotic.network.handler.FrameHandlerManager;
import com.ziotic.utility.Attributes;
import com.ziotic.utility.Configuration;
import com.ziotic.utility.StringParser;
import com.ziotic.utility.script.JavaScriptManager;

/**
 * @author Lazaro
 */
public class Static {
    public static Application app = null;
    public static Application.AppType appType = null;
    public static StringParser parser = null;
    public static Configuration conf = null;
    public static JavaScriptManager js = null;
    public static Engine engine = null;
    public static FrameHandlerManager frameManager = null;
    public static World world = null;
    public static RS2Cache rs2Cache = null;
    public static ClientConfiguration clientConf = null;
    public static Protocol proto = null;
    public static Attributes atr = new Attributes();
    public static XMLSession xml = null;
    public static ActionHandlerSystem ahs = null;
    public static ServerCache serverCache = null;
    public static MapXTEA mapXTEA = null;
    public static final Random random = new Random();

    public static boolean isGame() {
        return appType == Application.AppType.GAME || appType == Application.AppType.GAME_AND_LOBBY;
    }

    public static boolean isLobby() {
        return appType == Application.AppType.LOBBY || appType == Application.AppType.GAME_AND_LOBBY;
    }

    public static boolean isLink() {
        return appType == Application.AppType.LINK;
    }

    @SuppressWarnings("unchecked")
    public static <T> T currentApp() {
        return (T) app;
    }

    public static LinkServer currentLink() {
        return currentApp();
    }

    @SuppressWarnings("unchecked")
    public static <T> T callScript(String call, Object... args) {
        return (T) js.call(call, args);
    }

    public static String parseString(String string) {
        return parser.parseString(string);
    }

    public static Protocol getProtocol() {
        return proto;
    }
}
