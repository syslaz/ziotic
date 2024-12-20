/* VorbisBlock - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisBlock extends SimplePeer {
    protected final native void clear();

    private final native void init(DSPState dspstate);

    public VorbisBlock(DSPState dspstate) {
        init(dspstate);
        if (this.a())
            throw new IllegalStateException();
    }

    public final native int synthesis(OggPacket oggpacket);
}
