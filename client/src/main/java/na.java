/* na - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class na extends aa implements Interface8 {
    long nativeid;

    private final native void ma(oa var_oa, ya var_ya, int i, int i_0_, int[] is, int[] is_1_);

    public final native void w(boolean bool);

    na(oa var_oa, ya var_ya, int i, int i_2_, int[] is, int[] is_3_) {
        ma(var_oa, var_ya, i, i_2_, is, is_3_);
    }

    protected final void finalize() {
        if (((na) this).nativeid != 0L)
            Class123.method1136(this, (byte) 85);
    }
}
