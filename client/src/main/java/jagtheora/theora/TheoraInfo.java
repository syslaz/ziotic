/* TheoraInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraInfo extends SimplePeer {
    public byte versionMajor;
    public int colourSpace;
    public int picY;
    public int picHeight;
    public int frameWidth;
    public int picX;
    public int picWidth;
    public int fpsDenominator;
    public int aspectDenominator;
    public int frameHeight;
    public int pixelFormat;
    public int aspectNumerator;
    public int fpsNumerator;
    public byte versionSubMinor;
    public byte versionMinor;

    private static final native void initFields();

    private final native void init();

    protected final native void clear();

    public TheoraInfo() {
        init();
        if (this.a())
            throw new IllegalStateException();
    }

    static {
        initFields();
    }
}
