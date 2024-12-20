/* Class249_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

final class Class249_Sub2 extends Class249 implements Interface6 {
    static int anInt4795;
    static int anInt4796;
    private int anInt4797;
    static int anInt4798;
    static int anInt4799;
    static Class182[] aClass182Array4800 = new Class182[14];
    static int anInt4801;
    static int anInt4802;
    static int anInt4803;
    static int anInt4804;
    static int[] anIntArray4805;

    Class249_Sub2(ha_Sub2 var_ha_Sub2, int i, Buffer buffer, int i_0_, boolean bool) {
        super(var_ha_Sub2, 34962, buffer, i_0_, bool);
        anInt4797 = i;
    }

    public final void method19(byte i, int i_1_, int i_2_, byte[] is) {
        this.method2697(i_1_, is, 0);
        anInt4796++;
        if (i != 77)
            anInt4804 = 97;
        anInt4797 = i_2_;
    }

    public static void method2702(int i) {
        aClass182Array4800 = null;
        anIntArray4805 = null;
        int i_3_ = -77 % ((11 - i) / 37);
    }

    static final boolean method2703(int i, int i_4_, int i_5_) {
        if (i_5_ != 0)
            return true;
        anInt4799++;
        if ((i_4_ & 0x800) == 0)
            return false;
        return true;
    }

    public final int method20(byte i) {
        anInt4802++;
        int i_6_ = -57 % ((i - 61) / 42);
        return ((Class249) this).anInt2804;
    }

    Class249_Sub2(ha_Sub2 var_ha_Sub2, int i, byte[] is, int i_7_, boolean bool) {
        super(var_ha_Sub2, 34962, is, i_7_, bool);
        anInt4797 = i;
    }

    final void method2695(byte i) {
        int i_8_ = -9 / ((-2 - i) / 59);
        ((Class249) this).aHa_Sub2_2816.method842(-4593, this);
        anInt4801++;
    }

    public final long method22(int i) {
        anInt4798++;
        if (i != 9889)
            anInt4797 = -92;
        return 0L;
    }

    static final int method2704(byte i) {
        if (i <= 21)
            aClass182Array4800 = null;
        anInt4803++;
        boolean bool = false;
        boolean bool_9_ = false;
        boolean bool_10_ = false;
        if (((Class174) Node_Sub14_Sub15.aClass174_9328).aBoolean2039 && !(((Class174) Node_Sub14_Sub15.aClass174_9328).aBoolean2047)) {
            bool = true;
            if (((((Node_Sub24) InputStream_Sub2.aClass248_Sub24_78).anInt7126) ^ 0xffffffff) > -513 && (((Node_Sub24) InputStream_Sub2.aClass248_Sub24_78).anInt7126) != 0)
                bool = false;
            if (!Class174.aString2044.startsWith("win"))
                bool_9_ = true;
            else {
                bool_10_ = true;
                bool_9_ = true;
            }
        }
        if (RSInterface2.aBoolean4368)
            bool_9_ = false;
        if (Class316_Sub1_Sub2.aBoolean9864)
            bool = false;
        if (Class199.aBoolean2286)
            bool_10_ = false;
        if (!bool && !bool_9_ && !bool_10_)
            return Node_Sub51.method2682((byte) 62);
        int i_11_ = -1;
        int i_12_ = -1;
        if (bool) {
            try {
                i_11_ = Class330.method3378(2, true, 1000);
            } catch (Exception exception) {
                /* empty */
            }
        }
        int i_13_ = -1;
        do {
            if (bool_10_) {
                try {
                    i_13_ = Class330.method3378(3, true, 1000);
                    if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) == 3) {
                        Class167 class167 = Class287.aHa3381.c();
                        long l = (((Class167) class167).aLong1957 & 0xffffffffffffL);
                        int i_14_ = ((Class167) class167).anInt1953;
                        if ((i_14_ ^ 0xffffffff) != -4319) {
                            if ((i_14_ ^ 0xffffffff) != -4099)
                                break;
                        } else {
                            bool_9_ = bool_9_ & l >= 64425238954L;
                            break;
                        }
                        bool_9_ = bool_9_ & ((l ^ 0xffffffffffffffffL) <= -60129613780L);
                    }
                } catch (Exception exception) {
                    /* empty */
                }
            }
        } while (false);
        if (bool_9_) {
            try {
                i_12_ = Class330.method3378(1, true, 1000);
            } catch (Exception exception) {
                /* empty */
            }
        }
        if (i_11_ == -1 && (i_12_ ^ 0xffffffff) == 0 && i_13_ == -1)
            return Node_Sub51.method2682((byte) 62);
        i_12_ *= 1.1F;
        i_13_ *= 1.1F;
        if ((i_13_ ^ 0xffffffff) <= (i_11_ ^ 0xffffffff) || (i_12_ ^ 0xffffffff) <= (i_11_ ^ 0xffffffff)) {
            if ((i_13_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff))
                return Class282_Sub27.method3036(i_12_, 1, (byte) 103);
            return Class282_Sub27.method3036(i_13_, 3, (byte) 101);
        }
        return Node_Sub8_Sub17.method2140(0, i_11_);
    }

    public final int method21(int i) {
        anInt4795++;
        if (i != 26249)
            aClass182Array4800 = null;
        return anInt4797;
    }

    static {
        new Class58("", 73);
    }
}
