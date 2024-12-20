/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class334 {
    static IncommingOpcode aIncommingOpcode_3902 = new IncommingOpcode(67, 12);
    static int[][] anIntArrayArray3903;
    static int anInt3904;
    static Class31 aClass31_3905 = new Class31();
    static int anInt3906;

    public static void method3416(byte i) {
        aIncommingOpcode_3902 = null;
        anIntArrayArray3903 = null;
        aClass31_3905 = null;
        if (i != -112)
            aClass31_3905 = null;
    }

    static final void method3417(r var_r, int i, int i_0_, int i_1_, boolean[] bools) {
        if (Class177.aSArray2070 != Node_Sub14_Sub12_Sub1.aSArray10306) {
            int i_2_ = Node_Sub14_Sub29.aSArray9471[i].method3150((byte) 100, i_0_, i_1_);
            for (int i_3_ = 0; i_3_ <= i; i_3_++) {
                if (bools == null || bools[i_3_]) {
                    s var_s = Node_Sub14_Sub29.aSArray9471[i_3_];
                    if (var_s != null)
                        var_s.wa(var_r, i_0_, i_2_ - var_s.method3150((byte) 100, i_0_, i_1_), i_1_, 0, false);
                }
            }
        }
    }
}
