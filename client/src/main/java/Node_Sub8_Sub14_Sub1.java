/* Class248_Sub8_Sub14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub14_Sub1 extends Node_Sub8_Sub14 {
    static int anInt10289;
    static RSInterface2[][] aClass354ArrayArray10290;
    static Class360 aClass360_10291 = new Class360();
    private Object anObject10292;
    static IncommingOpcode aIncommingOpcode_10293;
    static int anInt10294;
    static int anInt10295;

    final Object method2122(int i) {
        anInt10295++;
        if (i != -1)
            anObject10292 = null;
        return anObject10292;
    }

    final boolean method2126(byte i) {
        if (i >= -62)
            return true;
        anInt10294++;
        return false;
    }

    static final String method2127(int i, String string) {
        anInt10289++;
        int i_0_ = string.length();
        int i_1_ = 0;
        for (int i_2_ = 0; (i_0_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
            int i_3_ = string.charAt(i_2_);
            if (i_3_ == 60 || (i_3_ ^ 0xffffffff) == -63)
                i_1_ += 3;
        }
        StringBuffer stringbuffer = new StringBuffer(i_1_ + i_0_);
        if (i >= -12)
            return null;
        for (int i_4_ = 0; i_4_ < i_0_; i_4_++) {
            char c = string.charAt(i_4_);
            if ((c ^ 0xffffffff) != -61) {
                if ((c ^ 0xffffffff) != -63)
                    stringbuffer.append(c);
                else
                    stringbuffer.append("<gt>");
            } else
                stringbuffer.append("<lt>");
        }
        return stringbuffer.toString();
    }

    static final void method2128(int i, int i_5_) {
        r var_r = null;
        for (int i_6_ = i; i_6_ < i_5_; i_6_++) {
            s var_s = Node_Sub14_Sub29.aSArray9471[i_6_];
            if (var_s != null) {
                for (int i_7_ = 0; i_7_ < Class89.anInt1106; i_7_++) {
                    for (int i_8_ = 0; i_8_ < Class225_Sub1.anInt8454; i_8_++) {
                        var_r = var_s.fa(i_8_, i_7_, var_r);
                        if (var_r != null) {
                            int i_9_ = i_8_ << Class96.anInt1249;
                            int i_10_ = i_7_ << Class96.anInt1249;
                            for (int i_11_ = i_6_ - 1; i_11_ >= 0; i_11_--) {
                                s var_s_12_ = Node_Sub14_Sub29.aSArray9471[i_11_];
                                if (var_s_12_ != null) {
                                    int i_13_ = (var_s.method3145(i_8_, 98, i_7_) - var_s_12_.method3145(i_8_, 95, i_7_));
                                    int i_14_ = (var_s.method3145(i_8_ + 1, 74, i_7_) - var_s_12_.method3145(i_8_ + 1, 105, i_7_));
                                    int i_15_ = (var_s.method3145(i_8_ + 1, 90, i_7_ + 1) - var_s_12_.method3145(i_8_ + 1, 85, i_7_ + 1));
                                    int i_16_ = (var_s.method3145(i_8_, 115, i_7_ + 1) - var_s_12_.method3145(i_8_, 65, i_7_ + 1));
                                    var_s_12_.CA(var_r, i_9_, (i_13_ + i_14_ + i_15_ + i_16_) / 4, i_10_, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    Node_Sub8_Sub14_Sub1(Interface9 interface9, Object object, int i) {
        super(interface9, i);
        anObject10292 = object;
    }

    public static void method2129(int i) {
        if (i != 1)
            aClass354ArrayArray10290 = null;
        aClass360_10291 = null;
        aClass354ArrayArray10290 = null;
        aIncommingOpcode_10293 = null;
    }
}
