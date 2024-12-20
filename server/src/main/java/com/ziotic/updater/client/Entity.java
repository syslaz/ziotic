package com.ziotic.updater.client;

/**
 * @author Lazaro
 */
public interface Entity extends Animable {
    int[] getPosQueueX();

    int[] getPosQueueY();

    String getChat();

    int getSize();
}
