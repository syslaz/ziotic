/* OggPage - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggPage extends SimplePeer {
    public final native int getVersion();

    public final native int getCompletedPackets();

    public final native boolean isBOS();

    public final native boolean isEOS();

    public final native long getGranulePos();

    public final native boolean isContinued();

    public final native long getPageNumber();

    protected final native void clear();

    public final native int getSerialNumber();
}
