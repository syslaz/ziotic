package com.ziotic.logic.utility;

import com.ziotic.logic.Node;

/**
 * @author Lazaro
 */
public interface DoubleNodeRunnable<T1 extends Node, T2 extends Node> {
    public void run(T1 node1, T2 node2);
}
