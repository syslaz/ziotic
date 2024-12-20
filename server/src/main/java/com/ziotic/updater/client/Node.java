package com.ziotic.updater.client;

/**
 * @author Lazaro
 */
public interface Node {
    long getId();

    Node getNext();

    Node getPrev();
}
