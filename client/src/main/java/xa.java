/* xa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class xa implements Interface2, Interface8 {
    long nativeid = 0L;

    public final void w(boolean bool) {
        va(((xa) this).nativeid, bool);
    }

    private final native void va(long l, boolean bool);

    private final native void r(int i, int i_0_);

    protected final void finalize() {
        if (((xa) this).nativeid != 0L)
            Class123.method1136(this, (byte) 99);
    }

    xa(int i, int i_1_) {
        r(i, i_1_);
    }
}
