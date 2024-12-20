/* Class340_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class340_Sub10 extends Class340 {
    static int anInt8216;
    static int anInt8217;
    static int anInt8218;
    static int anInt8219;
    static OutgoingOpcode aOutgoingOpcode_8220;
    static boolean aBoolean8221 = false;
    static int anInt8222;
    static int anInt8223;
    static int anInt8224;
    static int anInt8225 = 0;
    static int anInt8226;
    static IncommingOpcode aIncommingOpcode_8227;

    final void method3435(boolean bool, int i) {
        anInt8226++;
        if (i < 109)
            method3433(-7, 77, -81);
    }

    static final void method3476(RSInterface2 class354, int i, int i_0_, int i_1_, int i_2_, int i_3_, aa var_aa, int i_4_, ha var_ha) {
        anInt8217++;
        Class56 class56 = Node_Sub3.aClass257_6827.method2750((byte) 117, i_3_);
        int i_5_ = 97 / ((i_2_ - -46) / 52);
        if (class56 != null && ((Class56) class56).aBoolean771 && class56.method449((byte) -14, Node_Sub43.aClass291_7306)) {
            if (((Class56) class56).anIntArray754 != null) {
                int[] is = new int[((Class56) class56).anIntArray754.length];
                for (int i_6_ = 0; is.length / 2 > i_6_; i_6_++) {
                    int i_7_;
                    if ((Node_Sub45.anInt7343 ^ 0xffffffff) == -5)
                        i_7_ = (int) Class282_Sub7.aFloat7661 & 0x3fff;
                    else
                        i_7_ = 0x3fff & (Class346_Sub7_Sub5.anInt9958 + (int) Class282_Sub7.aFloat7661);
                    int i_8_ = Node_Sub9_Sub1.anIntArray9106[i_7_];
                    int i_9_ = Node_Sub9_Sub1.anIntArray9109[i_7_];
                    if (Node_Sub45.anInt7343 != 4) {
                        i_8_ = 256 * i_8_ / (Class252.anInt2843 - -256);
                        i_9_ = i_9_ * 256 / (256 + Class252.anInt2843);
                    }
                    is[2 * i_6_] = (((RSInterface2) class354).anInt4332 / 2 + i_1_ + ((i_9_ * (i_4_ - -((((Class56) class56).anIntArray754[2 * i_6_]) * 4)) + ((((Class56) class56).anIntArray754[1 + i_6_ * 2]) * 4 + i) * i_8_) >> -801891346));
                    is[2 * i_6_ + 1] = (-((-(((((Class56) class56).anIntArray754[2 * i_6_] * 4) + i_4_) * i_8_) + (4 * (((Class56) class56).anIntArray754[2 * i_6_ - -1]) + i) * i_9_) >> -1269223794) + (((RSInterface2) class354).anInt4223 / 2 + i_0_));
                }
                Class63.method483(var_ha, is, ((Class56) class56).anInt748, ((RSInterface2) class354).anIntArray4238, ((RSInterface2) class354).anIntArray4362);
                if ((((Class56) class56).anInt783 ^ 0xffffffff) >= -1) {
                    for (int i_10_ = 0; is.length / 2 + -1 > i_10_; i_10_++)
                        var_ha.a(is[2 * i_10_], is[1 + 2 * i_10_], is[2 * (i_10_ + 1)], is[3 + i_10_ * 2], (((Class56) class56).anIntArray750[0xff & (((Class56) class56).aByteArray761[i_10_])]), 1, var_aa, i_1_, i_0_);
                    var_ha.a(is[is.length - 2], is[-1 + is.length], is[0], is[1], (((Class56) class56).anIntArray750[(((Class56) class56).aByteArray761[(((Class56) class56).aByteArray761.length + -1)]) & 0xff]), 1, var_aa, i_1_, i_0_);
                } else {
                    for (int i_11_ = 0; ((is.length / 2 + -1 ^ 0xffffffff) < (i_11_ ^ 0xffffffff)); i_11_++) {
                        int i_12_ = is[2 * i_11_];
                        int i_13_ = is[i_11_ * 2 - -1];
                        int i_14_ = is[2 * i_11_ + 2];
                        int i_15_ = is[2 * (i_11_ - -1) + 1];
                        if (i_14_ >= i_12_) {
                            if (i_14_ == i_12_ && i_13_ > i_15_) {
                                int i_16_ = i_13_;
                                i_13_ = i_15_;
                                i_15_ = i_16_;
                            }
                        } else {
                            int i_17_ = i_12_;
                            i_12_ = i_14_;
                            int i_18_ = i_13_;
                            i_13_ = i_15_;
                            i_14_ = i_17_;
                            i_15_ = i_18_;
                        }
                        var_ha.a(i_12_, i_13_, i_14_, i_15_, (((Class56) class56).anIntArray750[(((Class56) class56).aByteArray761[i_11_] & 0xff)]), 1, var_aa, i_1_, i_0_, ((Class56) class56).anInt783, ((Class56) class56).anInt773, ((Class56) class56).anInt766);
                    }
                    int i_19_ = is[-2 + is.length];
                    int i_20_ = is[-1 + is.length];
                    int i_21_ = is[0];
                    int i_22_ = is[1];
                    if (i_21_ < i_19_) {
                        int i_23_ = i_19_;
                        int i_24_ = i_20_;
                        i_19_ = i_21_;
                        i_20_ = i_22_;
                        i_21_ = i_23_;
                        i_22_ = i_24_;
                    } else if (i_21_ == i_19_ && i_20_ > i_22_) {
                        int i_25_ = i_20_;
                        i_20_ = i_22_;
                        i_22_ = i_25_;
                    }
                    var_ha.a(i_19_, i_20_, i_21_, i_22_, (((Class56) class56).anIntArray750[(((Class56) class56).aByteArray761[-1 + (((Class56) class56).aByteArray761).length]) & 0xff]), 1, var_aa, i_1_, i_0_, ((Class56) class56).anInt783, ((Class56) class56).anInt773, ((Class56) class56).anInt766);
                }
            }
            Class129 class129 = null;
            if (((Class56) class56).anInt744 != -1) {
                class129 = class56.method452(false, var_ha, (byte) 72);
                if (class129 != null)
                    Class325.method3360(var_aa, i_1_, class129, i, i_4_, -110, i_0_, class354);
            }
            if (((Class56) class56).aString786 != null) {
                int i_26_ = 0;
                if (class129 != null)
                    i_26_ = class129.method1176();
                Class48 class48 = Class168.aClass48_1968;
                Class285 class285 = s_Sub2.aClass285_7962;
                if (((Class56) class56).anInt763 == 1) {
                    class285 = Node_Sub14_Sub31.aClass285_9492;
                    class48 = Canvas_Sub1.aClass48_71;
                }
                if ((((Class56) class56).anInt763 ^ 0xffffffff) == -3) {
                    class285 = Class264.aClass285_2996;
                    class48 = Node_Sub14_Sub27.aClass48_9449;
                }
                Class86.method645(class354, (byte) -65, i, ((Class56) class56).anInt779, class285, ((Class56) class56).aString786, i_0_, i_1_, i_4_, i_26_, class48, var_aa);
            }
        }
    }

    static final void method3477(int i, int i_27_) {
        anInt8218++;
        if (i > -24)
            aOutgoingOpcode_8220 = null;
        Class241.aClass278_2688.method2864(i_27_, -15782);
    }

    final void method3443(boolean bool, boolean bool_28_) {
        ((Class340) this).aHa_Sub3_3954.method920(0, bool);
        anInt8223++;
    }

    final void method3442(Interface21 interface21, int i, byte i_29_) {
        anInt8222++;
        if (i_29_ <= 68)
            aBoolean8221 = false;
        ((Class340) this).aHa_Sub3_3954.method929(interface21, -8423);
        ((Class340) this).aHa_Sub3_3954.method993((byte) 114, i);
    }

    final void method3441(boolean bool) {
        if (bool != true)
            method3435(false, -127);
        anInt8216++;
        ((Class340) this).aHa_Sub3_3954.method920(0, false);
    }

    public static void method3478(byte i) {
        if (i > -111)
            aIncommingOpcode_8227 = null;
        aOutgoingOpcode_8220 = null;
        aIncommingOpcode_8227 = null;
    }

    final void method3433(int i, int i_30_, int i_31_) {
        anInt8219++;
        if (i != -26427)
            aBoolean8221 = false;
    }

    final boolean method3432(int i) {
        anInt8224++;
        if (i != 4095)
            return true;
        return true;
    }

    Class340_Sub10(ha_Sub3 var_ha_Sub3) {
        super(var_ha_Sub3);
    }

    static {
        aOutgoingOpcode_8220 = new OutgoingOpcode(8, -1);
        aIncommingOpcode_8227 = new IncommingOpcode(62, 1);
    }
}
