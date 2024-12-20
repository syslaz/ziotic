/* TheoraComment - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraComment extends SimplePeer {
    private final native void init();

    protected final native void clear();

    public TheoraComment() {
        init();
        if (this.a())
            throw new IllegalStateException();
    }
}
