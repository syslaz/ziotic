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

import com.ziotic.adapter.protocol.ClientConfigurationAdapter;
import com.ziotic.io.XMLSession;
import com.ziotic.link.LinkServer;
import com.ziotic.utility.Configuration;
import com.ziotic.utility.Logging;
import com.ziotic.utility.StringParser;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author Lazaro
 */
public class Launcher {
  private static final Logger logger = Logging.log();

  public static void main(String[] args) {
    if (args.length < 2) {
      showHelp();
      return;
    }
    try {
      Static.parser = new StringParser();
      Static.parser.registerVariable("WORK_DIR", args[0]);
      Static.conf = new Configuration(Static.parseString(Constants.CONFIGURATION_FILE));
      Static.xml = new XMLSession();
      Static.xml.loadAliases(Static.parseString("%WORK_DIR%/aliases.xml"));
      PropertyConfigurator.configure(Static.conf.getString("logging_config_file"));
      String applicationSwitch = args[1].substring(1).trim();
      Static.parser.registerVariable("APP_TYPE", applicationSwitch);
      Static.parser.registerVariable("BASIC_APP_TYPE", applicationSwitch.equals("link") ? "link" : "game");
      Static.clientConf = new ClientConfigurationAdapter();
      logger.info("Ziotic is now loading");
      String[] trimmedArgs = new String[args.length - 2];
      for (int i = 0; i < trimmedArgs.length; i++) {
        trimmedArgs[i] = args[i + 2].trim();
      }
      Application app = null;
      if (applicationSwitch.equals("game")) {
        app = new GameServer();
      } else if (applicationSwitch.equals("lobby")) {
        app = new LobbyServer();
      } else if (applicationSwitch.equals("link")) {
        app = new LinkServer();
      }
      Static.app = app;
      if (app != null) {
        app.main(trimmedArgs);
      } else {
        logger.fatal("Invalid application swich set : \"" + applicationSwitch.trim() + "\"");
      }
      System.gc();
    } catch (Throwable e) {
      System.err.println();
      System.err.println("FATAL: Unable to initiate Ziotic!");
      e.printStackTrace();
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e1) {
      }
      System.exit(1);
    }
  }

  public static void showHelp() {
    System.out.println("USAGE: Launcher [working directory] [application switch]");
    System.out.println();
    System.out.println("APPLICATION SWITCHES: ");
    System.out.println("   Game Server (Handles in-game clients): -game");
    System.out.println("   Lobby Server (Handles lobby clients): -lobby");
    System.out.println("   Link Server (Handles inter-world communication): -link");
  }
}
