/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class104 {
    private static int[] anIntArray1325 = new int[4];
    private int anInt1326;
    private int anInt1327;
    private int anInt1328;
    private int anInt1329;
    private int anInt1330;
    private int anInt1331;
    private boolean aBoolean1332;
    private static Class129 aClass129_1333;
    private static Class129 aClass129_1334;
    private int anInt1335;
    private static Class162 aClass162_1336;
    int anInt1337;
    private int anInt1338;
    private int anInt1339;
    private Class129 aClass129_1340;
    private int anInt1341;
    private int anInt1342;

    public static void method735() {
        aClass162_1336 = null;
        aClass129_1333 = null;
        aClass129_1334 = null;
        anIntArray1325 = null;
    }

    final boolean method736(ha var_ha, Class104 class104_0_) {
        if (aClass129_1340 == null && !method737(var_ha, class104_0_))
            return false;
        return true;
    }

    private final boolean method737(ha var_ha, Class104 class104_1_) {
        if (aClass129_1340 == null) {
            if (anInt1327 == 0) {
                if (Class61.aD824.method23(anInt1330, -32345)) {
                    int[] is = Class61.aD824.method27(false, (byte) 94, anInt1331, anInt1331, 0.7F, anInt1330);
                    aClass129_1340 = var_ha.method813(anInt1331, (byte) 99, anInt1331, is, 0, anInt1331);
                }
            } else if (anInt1327 == 2)
                method740(var_ha, class104_1_);
            else if (anInt1327 == 1)
                method739(var_ha, class104_1_);
        }
        if (aClass129_1340 == null)
            return false;
        return true;
    }

    private static final void method738(ha var_ha) {
        if (aClass129_1334 == null) {
            int[] is = new int[16384];
            int[] is_2_ = new int[16384];
            for (int i = 0; i < 64; i++) {
                int i_3_ = 64 - i;
                i_3_ *= i_3_;
                int i_4_ = 128 - i - 1;
                int i_5_ = i * 128;
                int i_6_ = i_4_ * 128;
                for (int i_7_ = 0; i_7_ < 64; i_7_++) {
                    int i_8_ = 64 - i_7_;
                    i_8_ *= i_8_;
                    int i_9_ = 128 - i_7_ - 1;
                    int i_10_ = 256 - (i_8_ + i_3_ << 8) / 4096;
                    i_10_ = i_10_ * 16 * 192 / 1536;
                    if (i_10_ < 0)
                        i_10_ = 0;
                    else if (i_10_ > 255)
                        i_10_ = 255;
                    int i_11_ = i_10_ / 2;
                    is_2_[i_5_ + i_7_] = is_2_[i_5_ + i_9_] = is_2_[i_6_ + i_7_] = is_2_[i_6_ + i_9_] = ~0xffffff | i_10_ << 16;
                    is[i_5_ + i_7_] = is[i_5_ + i_9_] = is[i_6_ + i_7_] = is[i_6_ + i_9_] = 127 - i_11_ << 24 | 0xffffff;
                }
            }
            aClass129_1334 = var_ha.method813(128, (byte) 99, 128, is_2_, 0, 128);
            aClass129_1333 = var_ha.method813(128, (byte) 99, 128, is, 0, 128);
        }
    }

    private final void method739(ha var_ha, Class104 class104_12_) {
        method744(var_ha);
        method738(var_ha);
        var_ha.K(anIntArray1325);
        var_ha.KA(0, 0, anInt1331, anInt1331);
        var_ha.ya();
        var_ha.aa(0, 0, anInt1331, anInt1331, ~0xffffff | anInt1329, 0);
        int i = 0;
        int i_13_ = 0;
        int i_14_ = 256;
        if (class104_12_ != null) {
            if (class104_12_.aBoolean1332) {
                i = -class104_12_.anInt1328;
                i_13_ = -class104_12_.anInt1342;
                i_14_ = -class104_12_.anInt1335;
            } else {
                i = class104_12_.anInt1328 - anInt1328;
                i_13_ = class104_12_.anInt1342 - anInt1342;
                i_14_ = class104_12_.anInt1335 - anInt1335;
            }
        }
        if (anInt1341 != 0) {
            int i_15_ = Node_Sub9_Sub1.anIntArray9106[anInt1341];
            int i_16_ = Node_Sub9_Sub1.anIntArray9109[anInt1341];
            int i_17_ = i_13_ * i_16_ - i_14_ * i_15_ >> 14;
            i_14_ = i_13_ * i_15_ + i_14_ * i_16_ >> 14;
            i_13_ = i_17_;
        }
        if (anInt1326 != 0) {
            int i_18_ = Node_Sub9_Sub1.anIntArray9106[anInt1326];
            int i_19_ = Node_Sub9_Sub1.anIntArray9109[anInt1326];
            int i_20_ = i_14_ * i_18_ + i * i_19_ >> 14;
            i_14_ = i_14_ * i_19_ - i * i_18_ >> 14;
            i = i_20_;
        }
        Class162 class162 = aClass162_1336.method1436((byte) 0, 51200, true);
        class162.aa((short) 0, (short) anInt1330);
        var_ha.xa(1.0F);
        var_ha.ZA(16777215, 1.0F, 1.0F, (float) i, (float) i_13_, (float) i_14_);
        int i_21_ = 1024 * anInt1331 / (class162.RA() - class162.V());
        if (anInt1329 != 0)
            i_21_ = i_21_ * 13 / 16;
        var_ha.DA(anInt1331 / 2, anInt1331 / 2, i_21_, i_21_);
        var_ha.a(var_ha.e());
        Viewport viewport = var_ha.e();
        viewport.method1859(0, 0, var_ha.i() - class162.HA());
        class162.method1441(viewport, null, 1024, 1);
        int i_22_ = anInt1331 * 13 / 16;
        int i_23_ = (anInt1331 - i_22_) / 2;
        aClass129_1333.method1166(i_23_, i_23_, i_22_, i_22_, 0, ~0xffffff | anInt1329, 1);
        aClass129_1340 = var_ha.a(0, 0, anInt1331, anInt1331, true);
        var_ha.ya();
        var_ha.aa(0, 0, anInt1331, anInt1331, 0, 0);
        aClass129_1334.method1166(0, 0, anInt1331, anInt1331, 1, 0, 0);
        aClass129_1340.method1177(0, 0, 0);
        var_ha.KA(anIntArray1325[0], anIntArray1325[1], anIntArray1325[2], anIntArray1325[3]);
    }

    private final void method740(ha var_ha, Class104 class104_24_) {
        Class343 class343 = OutgoingOpcode.method1513(0, Node_Sub14_Sub4.aClass381_9195, -106, anInt1330);
        if (class343 != null) {
            var_ha.K(anIntArray1325);
            var_ha.KA(0, 0, anInt1331, anInt1331);
            var_ha.aa(0, 0, anInt1331, anInt1331, 0, 0);
            int i = 0;
            int i_25_ = 0;
            int i_26_ = 256;
            if (class104_24_ != null) {
                if (class104_24_.aBoolean1332) {
                    i = -class104_24_.anInt1328;
                    i_25_ = -class104_24_.anInt1342;
                    i_26_ = -class104_24_.anInt1335;
                } else {
                    i = anInt1328 - class104_24_.anInt1328;
                    i_25_ = anInt1342 - class104_24_.anInt1342;
                    i_26_ = anInt1335 - class104_24_.anInt1335;
                }
            }
            if (anInt1341 != 0) {
                int i_27_ = -anInt1341 & 0x3fff;
                int i_28_ = Node_Sub9_Sub1.anIntArray9106[i_27_];
                int i_29_ = Node_Sub9_Sub1.anIntArray9109[i_27_];
                int i_30_ = i_25_ * i_29_ - i_26_ * i_28_ >> 14;
                i_26_ = i_25_ * i_28_ + i_26_ * i_29_ >> 14;
                i_25_ = i_30_;
            }
            if (anInt1326 != 0) {
                int i_31_ = -anInt1326 & 0x3fff;
                int i_32_ = Node_Sub9_Sub1.anIntArray9106[i_31_];
                int i_33_ = Node_Sub9_Sub1.anIntArray9109[i_31_];
                int i_34_ = i_26_ * i_32_ + i * i_33_ >> 14;
                i_26_ = i_26_ * i_33_ - i * i_32_ >> 14;
                i = i_34_;
            }
            var_ha.xa(1.0F);
            var_ha.ZA(16777215, 1.0F, 1.0F, (float) i, (float) i_25_, (float) i_26_);
            Class162 class162 = var_ha.a(class343, 2048, 0, 64, 768);
            int i_35_ = class162.RA() - class162.V();
            int i_36_ = class162.EA() - class162.fa();
            int i_37_ = class162.V() + i_35_ / 2;
            int i_38_ = class162.fa() + i_36_ / 2;
            int i_39_ = i_35_ > i_36_ ? i_35_ : i_36_;
            var_ha.DA(i_37_, i_38_, i_39_, i_39_);
            var_ha.a(var_ha.e());
            Viewport viewport = var_ha.o();
            viewport.method1859(0, 0, var_ha.i() - class162.HA());
            class162.method1441(viewport, null, var_ha.i(), 1);
            aClass129_1340 = var_ha.a(0, 0, anInt1331, anInt1331, true);
            aClass129_1340.method1177(0, 0, 3);
            var_ha.KA(anIntArray1325[0], anIntArray1325[1], anIntArray1325[2], anIntArray1325[3]);
        }
    }

    final boolean method741(int i, int i_40_, int i_41_, int i_42_) {
        int i_43_;
        int i_44_;
        int i_45_;
        if (!aBoolean1332) {
            i_43_ = anInt1328 - i;
            i_44_ = anInt1342 - i_40_;
            i_45_ = anInt1335 - i_41_;
            ((Class104) this).anInt1337 = (int) Math.sqrt((double) (i_43_ * i_43_ + i_44_ * i_44_ + i_45_ * i_45_));
            if (((Class104) this).anInt1337 == 0)
                ((Class104) this).anInt1337 = 1;
            i_43_ = (i_43_ << 8) / ((Class104) this).anInt1337;
            i_44_ = (i_44_ << 8) / ((Class104) this).anInt1337;
            i_45_ = (i_45_ << 8) / ((Class104) this).anInt1337;
        } else {
            ((Class104) this).anInt1337 = 1073741823;
            i_43_ = anInt1328;
            i_44_ = anInt1342;
            i_45_ = anInt1335;
        }
        int i_46_ = (int) (Math.sqrt((double) (i_43_ * i_43_ + i_44_ * i_44_ + i_45_ * i_45_)) * 256.0);
        if (i_46_ > 128) {
            i_43_ = (i_43_ << 16) / i_46_;
            i_44_ = (i_44_ << 16) / i_46_;
            i_45_ = (i_45_ << 16) / i_46_;
            anInt1338 = anInt1339 * i_42_ / (aBoolean1332 ? 1024 : ((Class104) this).anInt1337);
        } else
            anInt1338 = 0;
        if (anInt1338 < 8) {
            aClass129_1340 = null;
            return false;
        }
        int i_47_ = Class136_Sub4.method1269(anInt1338, (byte) -128);
        if (i_47_ > i_42_)
            i_47_ = Class44_Sub1.method318(27690, i_42_);
        if (i_47_ > 512)
            i_47_ = 512;
        if (i_47_ != anInt1331)
            anInt1331 = i_47_;
        anInt1341 = (int) (Math.asin((double) ((float) i_44_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
        anInt1326 = (int) (Math.atan2((double) i_43_, (double) -i_45_) * 2607.5945876176133) & 0x3fff;
        aClass129_1340 = null;
        return true;
    }

    final void method742() {
        aClass129_1340 = null;
    }

    final void method743(ha var_ha, int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_) {
        if (aClass129_1340 != null) {
            int i_53_ = anInt1341 - i_51_ & 0x3fff;
            int i_54_ = anInt1326 - i_52_ & 0x3fff;
            if (i_54_ > 8192)
                i_54_ -= 16384;
            if (i_53_ > 8192)
                i_53_ -= 16384;
            int i_55_ = i_53_ * i_50_ / 4096 + (i_50_ - anInt1338) / 2;
            int i_56_ = i_54_ * i_50_ / -4096 + (i_49_ - anInt1338) / 2;
            if (i_55_ < i_50_ && i_55_ + anInt1338 > 0 && i_56_ < i_49_ && i_56_ + anInt1338 > 0)
                aClass129_1340.method1185(i_56_ + i, i_55_ + i_48_, anInt1338, anInt1338);
        }
    }

    private static final void method744(ha var_ha) {
        if (aClass162_1336 == null) {
            Class343 class343 = new Class343(580, 1104, 1);
            class343.method3503((short) 1024, (short) 32767, true, (byte) 0, (short) 1024, (short) 0, (short) 1024, (short) 0, (byte) 0, (byte) 0);
            class343.method3499(1, 0, 0, 128);
            class343.method3499(1, 0, 0, -128);
            for (int i = 0; i <= 24; i++) {
                int i_57_ = i * 8192 / 24;
                int i_58_ = Node_Sub9_Sub1.anIntArray9106[i_57_];
                int i_59_ = Node_Sub9_Sub1.anIntArray9109[i_57_];
                for (int i_60_ = 1; i_60_ < 24; i_60_++) {
                    int i_61_ = i_60_ * 8192 / 24;
                    int i_62_ = Node_Sub9_Sub1.anIntArray9109[i_61_] >> 7;
                    int i_63_ = (Node_Sub9_Sub1.anIntArray9106[i_61_] * i_58_ >> 21);
                    int i_64_ = (Node_Sub9_Sub1.anIntArray9106[i_61_] * i_59_ >> 21);
                    class343.method3499(1, i_64_, -i_63_, i_62_);
                }
                if (i > 0) {
                    int i_65_ = i * 23 + 2;
                    int i_66_ = i_65_ - 23;
                    class343.method3495((byte) -85, (byte) 0, (byte) 0, (byte) 0, (short) 0, i_66_, (short) 127, i_65_, 0);
                    for (int i_67_ = 1; i_67_ < 23; i_67_++) {
                        int i_68_ = i_66_ + 1;
                        int i_69_ = i_65_ + 1;
                        class343.method3495((byte) -85, (byte) 0, (byte) 0, (byte) 0, (short) 0, i_68_, (short) 127, i_65_, i_66_);
                        class343.method3495((byte) -85, (byte) 0, (byte) 0, (byte) 0, (short) 0, i_69_, (short) 127, i_65_, i_68_);
                        i_66_ = i_68_;
                        i_65_ = i_69_;
                    }
                    class343.method3495((byte) -85, (byte) 0, (byte) 0, (byte) 0, (short) 0, i_66_, (short) 127, 1, i_65_);
                }
            }
            ((Class343) class343).anInt4075 = ((Class343) class343).anInt4063;
            ((Class343) class343).anIntArray4030 = null;
            ((Class343) class343).anIntArray4057 = null;
            ((Class343) class343).aByteArray4072 = null;
            aClass162_1336 = var_ha.a(class343, 51200, 33, 64, 768);
        }
    }

    static final void method745() {
        aClass162_1336 = null;
        aClass129_1334 = null;
    }

    Class104(int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, boolean bool) {
        anInt1328 = i_71_;
        anInt1342 = i_72_;
        anInt1335 = i_73_;
        aBoolean1332 = bool;
        anInt1330 = i_70_;
        anInt1329 = i_75_;
        anInt1339 = i_74_;
        anInt1327 = i;
    }
}
