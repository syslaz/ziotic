/* OggSyncState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggSyncState extends SimplePeer {
    public final native boolean write(byte[] is, int i);

    protected final native void clear();

    public OggSyncState() {
        init();
        if (this.a())
            throw new IllegalStateException();
    }

    private final native void init();

    public final native boolean reset();

    public final native long pageSeek(OggPage oggpage);

    public final native int pageOut(OggPage oggpage);
}
