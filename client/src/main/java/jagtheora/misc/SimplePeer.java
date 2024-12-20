/* SimplePeer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.misc;

public abstract class SimplePeer {
    private long peer;

    public final boolean a() {
        if ((peer ^ 0xffffffffffffffffL) != -1L)
            return false;
        return true;
    }

    private static final native void init();

    private final void setPeer(long l) {
        peer = l;
    }

    protected final void finalize() throws Throwable {
        if (!a())
            b();
        super.finalize();
    }

    protected abstract void clear();

    public final void b() {
        if (!a())
            clear();
    }

    static {
        init();
    }
}
