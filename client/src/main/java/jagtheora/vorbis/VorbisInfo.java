/* VorbisInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisInfo extends SimplePeer {
    public int channels;
    public int rate;

    public final native int headerIn(VorbisComment vorbiscomment, OggPacket oggpacket);

    private static final native void initFields();

    protected final native void clear();

    public VorbisInfo() {
        init();
        if (this.a())
            throw new IllegalStateException();
    }

    private final native void init();

    static {
        initFields();
    }
}
