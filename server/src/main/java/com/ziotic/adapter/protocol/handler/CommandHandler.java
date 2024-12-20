package com.ziotic.adapter.protocol.handler;

import com.ziotic.Static;
import com.ziotic.logic.player.Player;
import com.ziotic.network.Frame;
import com.ziotic.network.handler.PlayerFrameHandler;
import org.apache.mina.core.session.IoSession;

/**
 * @author Lazaro
 */
public class CommandHandler extends PlayerFrameHandler {
    @Override
    public void handleFrame(Player player, IoSession session, Frame frame) {
        frame.readUnsigned();
        frame.readUnsigned();
        String commandQuery = frame.readString();
        String cmd = commandQuery.split(" ")[0].toLowerCase();
        int stringOffset = commandQuery.indexOf(" ");
        String string = commandQuery.substring(stringOffset + 1);
        String[] args = null;
        if (commandQuery.contains(" ")) {
            args = commandQuery.substring(commandQuery.indexOf(" ")).trim().split(" ");
        }
        Static.callScript("commands.handleCommand", player, commandQuery, cmd, args, string);
    }
}
