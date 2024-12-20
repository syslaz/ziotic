package com.ziotic.updater.client;

/**
 * @author Lazaro
 */
public interface ByteStream {
    int getPosition();

    byte[] getBuffer();
}
