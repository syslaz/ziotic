/* Frame - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer {
    public int a;
    public int b;
    public int[] pixels;

    private static final native void init();

    protected final native void clear();

    public Frame(int i, int i_0_) {
        a = i;
        b = i_0_;
        pixels = new int[b * a];
    }

    static {
        init();
    }
}
