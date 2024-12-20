package com.ziotic.updater.client;

/**
 * @author Lazaro
 */
public interface Client {
    int getLastPacketSize();

    int getBaseX();

    int getBaseY();

    Player[] getPlayers();

    int getCameraX();

    int getCameraY();

    int getCameraZ();

    int getCameraPitch();

    int getCameraYaw();

    int getCameraMovementX();

    int getCameraMovementY();

    int getCameraMovementZ();
}
