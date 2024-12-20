/* VorbisComment - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class VorbisComment extends SimplePeer {
    protected final native void clear();

    private final native void init();

    public VorbisComment() {
        init();
        if (this.a())
            throw new IllegalStateException();
    }
}
