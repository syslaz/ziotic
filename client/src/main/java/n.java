/* n - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class n extends Class48 implements Interface8 {
    long nativeid;

    private final native void PA(char c, int i, int i_0_, int i_1_, boolean bool, aa var_aa, int i_2_, int i_3_);

    final void method359(char c, int i, int i_4_, int i_5_, boolean bool, aa var_aa, int i_6_, int i_7_) {
        PA(c, i, i_4_, i_5_, bool, var_aa, i_6_, i_7_);
    }

    n(oa var_oa, ya var_ya, Class285 class285, Class157[] class157s, Class129[] class129s) {
        super(var_oa, class285);
        byte[][] is = new byte[class157s.length][];
        int[] is_8_ = new int[class157s.length];
        int[] is_9_ = new int[class157s.length];
        int[] is_10_ = new int[class157s.length];
        int[] is_11_ = new int[class157s.length];
        for (int i = 0; i < class157s.length; i++) {
            is[i] = ((Class157) class157s[i]).aByteArray1868;
            is_8_[i] = ((Class157) class157s[i]).anInt1873;
            is_9_[i] = ((Class157) class157s[i]).anInt1874;
            is_10_[i] = ((Class157) class157s[i]).anInt1869;
            is_11_[i] = ((Class157) class157s[i]).anInt1876;
        }
        S(var_oa, var_ya, is, ((Class157) class157s[0]).anIntArray1872, is_8_, is_9_, is_10_, is_11_);
    }

    public final native void w(boolean bool);

    private final native void S(oa var_oa, ya var_ya, byte[][] is, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, int[] is_16_);

    final native void fa(char c, int i, int i_17_, int i_18_, boolean bool);

    protected final void finalize() {
        if (((n) this).nativeid != 0L)
            Class123.method1136(this, (byte) 63);
    }
}
