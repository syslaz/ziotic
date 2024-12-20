/* h - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class h extends Class48 implements Interface8 {
    long nativeid;

    private final native void NA(char c, int i, int i_0_, int i_1_, boolean bool, aa var_aa, int i_2_, int i_3_);

    public final native void w(boolean bool);

    h(oa var_oa, ya var_ya, Class285 class285, Class157[] class157s, Class129[] class129s) {
        super(var_oa, class285);
        byte[][] is = new byte[class157s.length][];
        int[] is_4_ = new int[class157s.length];
        int[] is_5_ = new int[class157s.length];
        int[] is_6_ = new int[class157s.length];
        int[] is_7_ = new int[class157s.length];
        for (int i = 0; i < class157s.length; i++) {
            is[i] = ((Class157) class157s[i]).aByteArray1868;
            is_4_[i] = ((Class157) class157s[i]).anInt1873;
            is_5_[i] = ((Class157) class157s[i]).anInt1874;
            is_6_[i] = ((Class157) class157s[i]).anInt1869;
            is_7_[i] = ((Class157) class157s[i]).anInt1876;
        }
        JA(var_oa, var_ya, is, is_4_, is_5_, is_6_, is_7_);
    }

    protected final void finalize() {
        if (((h) this).nativeid != 0L)
            Class123.method1136(this, (byte) 121);
    }

    final void method359(char c, int i, int i_8_, int i_9_, boolean bool, aa var_aa, int i_10_, int i_11_) {
        NA(c, i, i_8_, i_9_, bool, var_aa, i_10_, i_11_);
    }

    private final native void JA(oa var_oa, ya var_ya, byte[][] is, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_);

    final native void fa(char c, int i, int i_16_, int i_17_, boolean bool);
}
