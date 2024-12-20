package com.ziotic.updater.util;

/**
 * @author Lazaro
 */
public interface Transformer extends NodeVisitor {
    public void transform(ClassCollection cc);

    public boolean finished();

    public boolean forceFinish();

    public void onFinish();
}
