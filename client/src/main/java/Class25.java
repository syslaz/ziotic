/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class25 {
    private int[] anIntArray331;
    static int anInt332;
    static int anInt333;
    static int anInt334;
    static int anInt335;
    private byte[] aByteArray336;
    static int anInt337 = 0;
    static int anInt338 = 0;
    static int anInt339;
    public static int anInt340;
    private int[] anIntArray341;
    static Class17 aClass17_342 = new Class17();
    static OutgoingOpcode aOutgoingOpcode_343 = new OutgoingOpcode(20, 8);
    static int anInt344 = 4;
    static Animable[] aAnimableArray345;

    static final void method240(ObjectDefinition class266, int i, int i_0_, int i_1_, int i_2_) {
        if (i_2_ != 24)
            method240(null, 102, -15, -47, 126);
        anInt334++;
        for (Node_Sub51 class248_sub51 = (Node_Sub51) Class144.aClass293_1702.method3119(2); class248_sub51 != null; class248_sub51 = (Node_Sub51) Class144.aClass293_1702.method3107(i_2_ ^ ~0x66)) {
            if (((Node_Sub51) class248_sub51).anInt7479 == i && (((Node_Sub51) class248_sub51).anInt7466 == i_1_ << 1777133545) && (((Node_Sub51) class248_sub51).anInt7461 == i_0_ << -1870648311) && (((ObjectDefinition) (((Node_Sub51) class248_sub51).aClass266_7456)).anInt3043 == ((ObjectDefinition) class266).anInt3043)) {
                if (((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 != null) {
                    Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460);
                    ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 = null;
                }
                if (((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454 != null) {
                    Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454);
                    ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454 = null;
                }
                class248_sub51.remove(true);
                break;
            }
        }
    }

    public static void method241(boolean bool) {
        aClass17_342 = null;
        aAnimableArray345 = null;
        if (bool != true)
            anInt337 = -35;
        aOutgoingOpcode_343 = null;
    }

    static final void method242(Entity entity, int i, int i_3_, int i_4_, int i_5_, int i_6_, Entity entity_7_, int i_8_, boolean bool, int i_9_) {
        anInt339++;
        int i_10_ = entity.method3640((byte) 83);
        if ((i_10_ ^ 0xffffffff) != 0) {
            Object object = null;
            Class129 class129 = ((Class129) Class142.aClass278_1675.method2863(4, (long) i_10_));
            if (class129 == null) {
                Class157[] class157s = Class157.method1392(Class290.aClass381_3417, i_10_, 0);
                if (class157s == null)
                    return;
                class129 = Class287.aHa3381.a(class157s[0], true);
                Class142.aClass278_1675.method2867((byte) 0, (long) i_10_, class129);
            }
            Node_Sub14_Sub31.method2366(0, i_3_ >> 1435143393, i, ((Interactable) entity_7_).plane, i_9_, ((Interactable) entity_7_).x, ((Interactable) entity_7_).y, i_8_ >> -87812127, 0, entity_7_.method3632(-1) * 256);
            int i_11_ = -18 + Class303.anIntArray3527[0] + i_5_;
            int i_12_ = -54 + i_6_ + (Class303.anIntArray3527[1] - 16);
            i_11_ += i_4_ / 4 * 18;
            i_12_ += i_4_ % 4 * 18;
            class129.method1168(i_11_, i_12_);
            if (entity_7_ == entity)
                Class287.aHa3381.method812(18, -256, 18, 113, -1 + i_12_, i_11_ - 1);
            Class210.method1724(18 + i_11_, i_11_ + -1, (byte) -95, 18 + i_12_, i_12_ - 1);
            Class346_Sub2 class346_sub2 = Class101.method715(bool);
            ((Class346_Sub2) class346_sub2).anInt8260 = 16 + i_11_;
            ((Class346_Sub2) class346_sub2).anInt8263 = i_12_;
            ((Class346_Sub2) class346_sub2).anInt8255 = i_12_ - -16;
            ((Class346_Sub2) class346_sub2).anInt8256 = i_11_;
            ((Class346_Sub2) class346_sub2).aEntity_8258 = entity;
            Node_Sub8_Sub14_Sub1.aClass360_10291.method3811(class346_sub2, 0);
        }
    }

    final int method243(byte i, int i_13_, byte[] is, byte[] is_14_, int i_15_, int i_16_) {
        anInt333++;
        if (i != -124)
            method242(null, -103, -120, 4, 108, 24, null, -104, true, 121);
        int i_17_ = 0;
        i_16_ += i_13_;
        int i_18_ = i_15_ << -920309853;
        for (/**/; (i_16_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
            int i_19_ = is_14_[i_13_] & 0xff;
            int i_20_ = anIntArray331[i_19_];
            int i_21_ = aByteArray336[i_19_];
            if (i_21_ == 0)
                throw new RuntimeException("No codeword for data value " + i_19_);
            int i_22_ = i_18_ >> -1723054237;
            int i_23_ = i_18_ & 0x7;
            i_17_ &= -i_23_ >> 1751816703;
            int i_24_ = (-1 + i_21_ + i_23_ >> -124944381) + i_22_;
            i_18_ += i_21_;
            i_23_ += 24;
            is[i_22_] = (byte) (i_17_ = Class358.retrieveLooksSettings(i_17_, i_20_ >>> i_23_));
            if ((i_24_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff)) {
                i_23_ -= 8;
                i_22_++;
                is[i_22_] = (byte) (i_17_ = i_20_ >>> i_23_);
                if (i_24_ > i_22_) {
                    i_23_ -= 8;
                    i_22_++;
                    is[i_22_] = (byte) (i_17_ = i_20_ >>> i_23_);
                    if ((i_22_ ^ 0xffffffff) > (i_24_ ^ 0xffffffff)) {
                        i_23_ -= 8;
                        i_22_++;
                        is[i_22_] = (byte) (i_17_ = i_20_ >>> i_23_);
                        if ((i_24_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff)) {
                            i_22_++;
                            i_23_ -= 8;
                            is[i_22_] = (byte) (i_17_ = i_20_ << -i_23_);
                        }
                    }
                }
            }
        }
        return (7 + i_18_ >> -1229890589) - i_15_;
    }

    final int method244(int i, int i_25_, byte[] is, int i_26_, byte[] is_27_, int i_28_) {
        anInt335++;
        if (i_28_ == 0)
            return 0;
        i_28_ += i_25_;
        int i_29_ = 0;
        if (i != -87812127)
            return 61;
        int i_30_ = i_26_;
        for (; ; ) {
            byte i_31_ = is[i_30_];
            if (i_31_ < 0)
                i_29_ = anIntArray341[i_29_];
            else
                i_29_++;
            int i_32_;
            if (((i_32_ = anIntArray341[i_29_]) ^ 0xffffffff) > -1) {
                is_27_[i_25_++] = (byte) (i_32_ ^ 0xffffffff);
                if (i_28_ <= i_25_)
                    break;
                i_29_ = 0;
            }
            if ((i_31_ & 0x40 ^ 0xffffffff) == -1)
                i_29_++;
            else
                i_29_ = anIntArray341[i_29_];
            if ((i_32_ = anIntArray341[i_29_]) < 0) {
                is_27_[i_25_++] = (byte) (i_32_ ^ 0xffffffff);
                if (i_25_ >= i_28_)
                    break;
                i_29_ = 0;
            }
            if ((0x20 & i_31_ ^ 0xffffffff) != -1)
                i_29_ = anIntArray341[i_29_];
            else
                i_29_++;
            if ((i_32_ = anIntArray341[i_29_]) < 0) {
                is_27_[i_25_++] = (byte) (i_32_ ^ 0xffffffff);
                if (i_25_ >= i_28_)
                    break;
                i_29_ = 0;
            }
            if ((0x10 & i_31_) == 0)
                i_29_++;
            else
                i_29_ = anIntArray341[i_29_];
            if ((i_32_ = anIntArray341[i_29_]) < 0) {
                is_27_[i_25_++] = (byte) (i_32_ ^ 0xffffffff);
                if (i_25_ >= i_28_)
                    break;
                i_29_ = 0;
            }
            if ((0x8 & i_31_) != 0)
                i_29_ = anIntArray341[i_29_];
            else
                i_29_++;
            if (((i_32_ = anIntArray341[i_29_]) ^ 0xffffffff) > -1) {
                is_27_[i_25_++] = (byte) (i_32_ ^ 0xffffffff);
                if ((i_25_ ^ 0xffffffff) <= (i_28_ ^ 0xffffffff))
                    break;
                i_29_ = 0;
            }
            if ((0x4 & i_31_ ^ 0xffffffff) == -1)
                i_29_++;
            else
                i_29_ = anIntArray341[i_29_];
            if (((i_32_ = anIntArray341[i_29_]) ^ 0xffffffff) > -1) {
                is_27_[i_25_++] = (byte) (i_32_ ^ 0xffffffff);
                if (i_28_ <= i_25_)
                    break;
                i_29_ = 0;
            }
            if ((i_31_ & 0x2) == 0)
                i_29_++;
            else
                i_29_ = anIntArray341[i_29_];
            if ((i_32_ = anIntArray341[i_29_]) < 0) {
                is_27_[i_25_++] = (byte) (i_32_ ^ 0xffffffff);
                if (i_25_ >= i_28_)
                    break;
                i_29_ = 0;
            }
            if ((i_31_ & 0x1 ^ 0xffffffff) != -1)
                i_29_ = anIntArray341[i_29_];
            else
                i_29_++;
            if (((i_32_ = anIntArray341[i_29_]) ^ 0xffffffff) > -1) {
                is_27_[i_25_++] = (byte) (i_32_ ^ 0xffffffff);
                if ((i_25_ ^ 0xffffffff) <= (i_28_ ^ 0xffffffff))
                    break;
                i_29_ = 0;
            }
            i_30_++;
        }
        return i_30_ - (-1 + i_26_);
    }

    Class25(byte[] is) {
        int i = is.length;
        anIntArray331 = new int[i];
        aByteArray336 = is;
        anIntArray341 = new int[8];
        int[] is_33_ = new int[33];
        int i_34_ = 0;
        for (int i_35_ = 0; i > i_35_; i_35_++) {
            int i_36_ = is[i_35_];
            if (i_36_ != 0) {
                int i_37_ = 1 << 32 + -i_36_;
                int i_38_ = is_33_[i_36_];
                anIntArray331[i_35_] = i_38_;
                int i_39_;
                if ((i_37_ & i_38_ ^ 0xffffffff) == -1) {
                    for (int i_40_ = i_36_ - 1; i_40_ >= 1; i_40_--) {
                        int i_41_ = is_33_[i_40_];
                        if ((i_41_ ^ 0xffffffff) != (i_38_ ^ 0xffffffff))
                            break;
                        int i_42_ = 1 << 32 - i_40_;
                        if ((i_41_ & i_42_) == 0)
                            is_33_[i_40_] = Class358.retrieveLooksSettings(i_41_, i_42_);
                        else {
                            is_33_[i_40_] = is_33_[-1 + i_40_];
                            break;
                        }
                    }
                    i_39_ = i_37_ | i_38_;
                } else
                    i_39_ = is_33_[i_36_ - 1];
                is_33_[i_36_] = i_39_;
                for (int i_43_ = i_36_ - -1; (i_43_ ^ 0xffffffff) >= -33; i_43_++) {
                    if ((is_33_[i_43_] ^ 0xffffffff) == (i_38_ ^ 0xffffffff))
                        is_33_[i_43_] = i_39_;
                }
                int i_44_ = 0;
                for (int i_45_ = 0; (i_36_ ^ 0xffffffff) < (i_45_ ^ 0xffffffff); i_45_++) {
                    int i_46_ = -2147483648 >>> i_45_;
                    if ((i_38_ & i_46_ ^ 0xffffffff) == -1)
                        i_44_++;
                    else {
                        if (anIntArray341[i_44_] == 0)
                            anIntArray341[i_44_] = i_34_;
                        i_44_ = anIntArray341[i_44_];
                    }
                    if (i_44_ >= anIntArray341.length) {
                        int[] is_47_ = new int[2 * anIntArray341.length];
                        for (int i_48_ = 0; ((anIntArray341.length ^ 0xffffffff) < (i_48_ ^ 0xffffffff)); i_48_++)
                            is_47_[i_48_] = anIntArray341[i_48_];
                        anIntArray341 = is_47_;
                    }
                    i_46_ >>>= 1;
                }
                anIntArray341[i_44_] = i_35_ ^ 0xffffffff;
                if ((i_44_ ^ 0xffffffff) <= (i_34_ ^ 0xffffffff))
                    i_34_ = 1 + i_44_;
            }
        }
    }
}
