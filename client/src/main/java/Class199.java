/* Class199 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class199 {
    private int anInt2268;
    private int anInt2269;
    private Class129 aClass129_2270;
    private int anInt2271;
    static int anInt2272;
    private Class104[] aClass104Array2273;
    private int anInt2274;
    static IncommingOpcode aIncommingOpcode_2275 = new IncommingOpcode(5, 4);
    private Class104[] aClass104Array2276;
    private int anInt2277;
    private int anInt2278 = -1;
    static int anInt2279;
    private int anInt2280;
    private Class104 aClass104_2281;
    static Class377[] aClass377Array2282;
    static OutgoingOpcode aOutgoingOpcode_2283 = new OutgoingOpcode(0, 4);
    private boolean aBoolean2284 = true;
    static int anInt2285;
    static boolean aBoolean2286 = false;

    final void method1678(byte i) {
        if (aClass104Array2276 != null) {
            for (int i_0_ = 0; i_0_ < aClass104Array2276.length; i_0_++)
                aClass104Array2276[i_0_].method742();
        }
        anInt2279++;
        aClass129_2270 = null;
        if (i != -21)
            aIncommingOpcode_2275 = null;
    }

    public static void method1679(int i) {
        if (i != 0)
            aClass377Array2282 = null;
        aClass377Array2282 = null;
        aOutgoingOpcode_2283 = null;
        aIncommingOpcode_2275 = null;
    }

    final boolean method1680(int i, int i_1_, ha var_ha) {
        if ((i_1_ ^ 0xffffffff) != (anInt2278 ^ 0xffffffff)) {
            anInt2278 = i_1_;
            int i_2_ = Class44_Sub1.method318(i + 27688, i_1_);
            if ((i_2_ ^ 0xffffffff) < -513)
                i_2_ = 512;
            if (i_2_ <= 0)
                i_2_ = 1;
            if (i_2_ != anInt2274) {
                aClass129_2270 = null;
                anInt2274 = i_2_;
            }
            if (aClass104Array2276 != null) {
                anInt2271 = 0;
                int[] is = new int[aClass104Array2276.length];
                for (int i_3_ = 0; ((aClass104Array2276.length ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
                    Class104 class104 = aClass104Array2276[i_3_];
                    if (class104.method741(anInt2269, anInt2268, anInt2277, anInt2278)) {
                        is[anInt2271] = ((Class104) class104).anInt1337;
                        aClass104Array2273[anInt2271++] = class104;
                    }
                }
                Class269.method2816(anInt2271 - 1, 0, true, is, aClass104Array2273);
            }
            aBoolean2284 = true;
        }
        anInt2285++;
        if (i != 2)
            method1679(-13);
        boolean bool = false;
        if (aBoolean2284) {
            aBoolean2284 = false;
            for (int i_4_ = anInt2271 + -1; i_4_ >= 0; i_4_--) {
                boolean bool_5_ = aClass104Array2273[i_4_].method736(var_ha, aClass104_2281);
                bool |= bool_5_;
                Class199 class199_6_ = this;
                class199_6_.aBoolean2284 = class199_6_.aBoolean2284 | !bool_5_;
            }
        }
        return bool;
    }

    final void method1681(int i, int i_7_, int i_8_, ha var_ha, int i_9_, byte i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
        i_9_ = 0x3fff & i_9_ + i_8_;
        anInt2272++;
        if (anInt2280 == -1 || anInt2274 == 0)
            var_ha.aa(i_7_, i_13_, i_14_, i_12_, i, 0);
        else {
            Class312 class312 = Class61.aD824.method25(anInt2280, (byte) 124);
            if (aClass129_2270 == null && Class61.aD824.method23(anInt2280, -32345)) {
                int[] is = ((((Class312) class312).anInt3629 ^ 0xffffffff) != -3 ? Class61.aD824.method24(-122, anInt2274, 0.7F, false, anInt2280, anInt2274) : Class61.aD824.method27(false, (byte) 71, anInt2274, anInt2274, 0.7F, anInt2280));
                aClass129_2270 = var_ha.method813(anInt2274, (byte) 99, anInt2274, is, 0, anInt2274);
            }
            if ((((Class312) class312).anInt3629 ^ 0xffffffff) == -3)
                var_ha.aa(i_7_, i_13_, i_14_, i_12_, i, 0);
            if (aClass129_2270 != null) {
                int i_15_ = ((Class312) class312).anInt3629 != 2 ? 0 : 1;
                int i_16_ = i_11_ * i_12_ / -4096;
                int i_17_;
                for (i_17_ = i_12_ * i_9_ / 4096 + (i_14_ + -i_12_) / 2; i_12_ < i_17_; i_17_ -= i_12_) {
                    /* empty */
                }
                for (/**/; (i_12_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_16_ -= i_12_) {
                    /* empty */
                }
                for (/**/; (i_17_ ^ 0xffffffff) > -1; i_17_ += i_12_) {
                    /* empty */
                }
                for (/**/; (i_16_ ^ 0xffffffff) > -1; i_16_ += i_12_) {
                    /* empty */
                }
                for (int i_18_ = -i_12_ + i_17_; (i_14_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_ += i_12_) {
                    for (int i_19_ = i_16_ + -i_12_; (i_12_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_ += i_12_)
                        aClass129_2270.method1166(i_7_ + i_18_, i_13_ + i_19_, i_12_, i_12_, 1, 0, i_15_);
                }
            }
        }
        int i_20_ = 41 / ((-64 - i_10_) / 47);
        for (int i_21_ = -1 + anInt2271; (i_21_ ^ 0xffffffff) <= -1; i_21_--)
            aClass104Array2273[i_21_].method743(var_ha, i_7_, i_13_, i_14_, i_12_, i_11_, i_9_);
    }

    Class199(int i, Class104[] class104s, int i_22_, int i_23_, int i_24_, int i_25_) {
        anInt2269 = i_23_;
        anInt2268 = i_24_;
        aClass104Array2276 = class104s;
        anInt2280 = i;
        anInt2277 = i_25_;
        if (class104s != null) {
            aClass104Array2273 = new Class104[class104s.length];
            aClass104_2281 = i_22_ < 0 ? null : class104s[i_22_];
        } else {
            aClass104Array2273 = null;
            aClass104_2281 = null;
        }
    }
}
