/* ba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ba extends r implements Interface8 {
    long nativeid;

    public final native void w(boolean bool);

    ba(oa var_oa) {
        /* empty */
    }

    protected final void finalize() {
        if (((ba) this).nativeid != 0L)
            Class123.method1136(this, (byte) 113);
    }
}
