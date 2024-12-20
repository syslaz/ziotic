/* DSPState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class DSPState extends SimplePeer {
    public final native void read(int i);

    private final native void init(VorbisInfo vorbisinfo);

    public final native double granuleTime();

    public DSPState(VorbisInfo vorbisinfo) {
        init(vorbisinfo);
        if (this.a())
            throw new IllegalStateException();
    }

    public final native void blockIn(VorbisBlock vorbisblock);

    protected final native void clear();

    public final native float[][] pcmOut(int i);
}
