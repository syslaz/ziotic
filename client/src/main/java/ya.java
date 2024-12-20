/* ya - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ya extends za implements Interface8 {
    long nativeid;

    final native void ga();

    final native void r();

    ya(oa var_oa, int i) {
        aa(var_oa, i);
    }

    private final native void aa(oa var_oa, int i);

    protected final void finalize() {
        if (((ya) this).nativeid != 0L)
            Class123.method1136(this, (byte) 64);
    }

    public final native void w(boolean bool);
}
