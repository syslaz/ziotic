/* Class299 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class299 {
    static int anInt3482;
    private Class278 aClass278_3483 = new Class278(256);
    static int anInt3484;
    private d aD3485;
    static int anInt3486;
    static int anInt3487;
    static int anInt3488;
    private ha_Sub3 aHa_Sub3_3489;
    static int anInt3490;
    static RSInterface2 aClass354_3491 = null;
    static Class208 aClass208_3492 = new Class208(1, 2);
    static int anInt3493;

    static final void method3171(double d, boolean bool) {
        if (Class218.aDouble2506 != d) {
            for (int i = 0; i < 256; i++) {
                int i_0_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
                Class40.anIntArray459[i] = (i_0_ ^ 0xffffffff) >= -256 ? i_0_ : 255;
            }
            Class218.aDouble2506 = d;
        }
        if (bool != false)
            method3171(-1.0597081502259316, true);
        anInt3488++;
    }

    public static void method3172(int i) {
        aClass208_3492 = null;
        aClass354_3491 = null;
        if (i != 29281)
            aClass208_3492 = null;
    }

    static final int method3173(byte i, boolean bool, boolean bool_1_, int i_2_, int i_3_) {
        if (i <= 121)
            aClass208_3492 = null;
        anInt3490++;
        Node_Sub33 class248_sub33 = IOException_Sub1.method127(bool_1_, i_2_, (byte) -60);
        if (class248_sub33 == null)
            return 0;
        int i_4_ = 0;
        for (int i_5_ = 0; ((((Node_Sub33) class248_sub33).anIntArray7202.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++) {
            if (((Node_Sub33) class248_sub33).anIntArray7202[i_5_] >= 0 && (((Node_Sub33) class248_sub33).anIntArray7202[i_5_] < ((Class342) Class283.aClass342_3343).anInt4000)) {
                Class321 class321 = Class283.aClass342_3343.method3482((byte) 117, (((Node_Sub33) class248_sub33).anIntArray7202[i_5_]));
                int i_6_ = class321.method3341((((Class210) Node_Sub20.aClass240_7045.method1923(-6119, i_3_)).anInt2430), -1, i_3_);
                if (!bool)
                    i_4_ += i_6_;
                else
                    i_4_ += (((Node_Sub33) class248_sub33).anIntArray7204[i_5_]) * i_6_;
            }
        }
        return i_4_;
    }

    static final boolean method3174(int i, byte i_7_) {
        int i_8_ = 73 % ((56 - i_7_) / 53);
        anInt3482++;
        if (i != 3 && (i ^ 0xffffffff) != -8 && i != 10)
            return false;
        return true;
    }

    static final boolean method3175(Animable animable, boolean bool) {
        boolean bool_9_ = Class177.aSArray2070 == Node_Sub14_Sub12_Sub1.aSArray10306;
        int i = 0;
        short i_10_ = 0;
        byte i_11_ = 0;
        animable.updateCoordinateBounds((byte) -127);
        if (((Animable) animable).x1 < 0 || ((Animable) animable).y1 < 0 || (((Animable) animable).x2 >= Class225_Sub1.anInt8454) || (((Animable) animable).y2 >= Class89.anInt1106))
            return false;
        short i_12_ = 0;
        for (int i_13_ = ((Animable) animable).x1; i_13_ <= ((Animable) animable).x2; i_13_++) {
            for (int i_14_ = ((Animable) animable).y1; i_14_ <= ((Animable) animable).y2; i_14_++) {
                Class137 class137 = Class296.method3130((((Interactable) animable).plane), i_13_, i_14_);
                if (class137 != null) {
                    Class49 class49 = Class164.method1530(31296, animable);
                    Class49 class49_15_ = ((Class137) class137).aClass49_1649;
                    if (class49_15_ == null)
                        ((Class137) class137).aClass49_1649 = class49;
                    else {
                        for (/**/; ((Class49) class49_15_).aClass49_660 != null; class49_15_ = ((Class49) class49_15_).aClass49_660) {
                            /* empty */
                        }
                        ((Class49) class49_15_).aClass49_660 = class49;
                    }
                    if (bool_9_ && (Class340_Sub8.anIntArrayArray8187[i_13_][i_14_] & ~0xffffff) != 0) {
                        i = Class340_Sub8.anIntArrayArray8187[i_13_][i_14_];
                        i_10_ = (Class346_Sub7_Sub5.aShortArrayArray9957[i_13_][i_14_]);
                        i_11_ = Class250.aByteArrayArray2822[i_13_][i_14_];
                    }
                    if (!bool && (((Class137) class137).aClass346_Sub7_Sub4_1645 != null) && (((Class346_Sub7_Sub4) ((Class137) class137).aClass346_Sub7_Sub4_1645).aShort9947) > i_12_)
                        i_12_ = (((Class346_Sub7_Sub4) ((Class137) class137).aClass346_Sub7_Sub4_1645).aShort9947);
                }
            }
        }
        if (bool_9_ && (i & ~0xffffff) != 0) {
            for (int i_16_ = ((Animable) animable).x1; i_16_ <= ((Animable) animable).x2; i_16_++) {
                for (int i_17_ = (((Animable) animable).y1); (i_17_ <= ((Animable) animable).y2); i_17_++) {
                    if ((Class340_Sub8.anIntArrayArray8187[i_16_][i_17_] & ~0xffffff) == 0) {
                        Class340_Sub8.anIntArrayArray8187[i_16_][i_17_] = i;
                        Class346_Sub7_Sub5.aShortArrayArray9957[i_16_][i_17_] = i_10_;
                        Class250.aByteArrayArray2822[i_16_][i_17_] = i_11_;
                    }
                }
            }
        }
        if (bool)
            Class25.aAnimableArray345[Node_Sub14_Sub36.anInt9552++] = animable;
        else {
            int i_18_ = ((Class177.aSArray2070 == Node_Sub14_Sub12_Sub1.aSArray10306) ? 1 : 0);
            if (animable.method3574((byte) 114)) {
                if (animable.method3563(false)) {
                    ((Interactable) animable).aInteractable_8320 = Node_Sub12.aInteractableArray6965[i_18_];
                    Node_Sub12.aInteractableArray6965[i_18_] = animable;
                } else {
                    ((Interactable) animable).aInteractable_8320 = Class144.aInteractableArray1704[i_18_];
                    Class144.aInteractableArray1704[i_18_] = animable;
                    Node_Sub30.aBoolean7192 = true;
                }
            } else {
                ((Interactable) animable).aInteractable_8320 = Class273.aInteractableArray5007[i_18_];
                Class273.aInteractableArray5007[i_18_] = animable;
            }
        }
        if (bool)
            ((Interactable) animable).anInt8317 -= i_12_;
        return true;
    }

    static final boolean method3176(int i, int i_19_, int i_20_) {
        if (i_19_ != 0)
            aClass354_3491 = null;
        anInt3484++;
        if (i_20_ >= 1000 && i < 1000)
            return true;
        if (i_20_ < 1000 && i < 1000) {
            if (Class82.method592(i, -22))
                return true;
            if (Class82.method592(i_20_, -102))
                return false;
            return true;
        }
        if ((i_20_ ^ 0xffffffff) <= -1001 && i >= 1000)
            return true;
        return false;
    }

    final Interface21_Impl2 method3177(int i, byte i_21_) {
        anInt3493++;
        Object object = aClass278_3483.method2863(4, (long) i);
        if (object != null)
            return (Interface21_Impl2) object;
        if (!aD3485.method23(i, -32345))
            return null;
        Class312 class312 = aD3485.method25(i, (byte) 125);
        int i_22_ = (((Class312) class312).aBoolean3636 ? 64 : ((ha_Sub3) aHa_Sub3_3489).anInt6153);
        Interface21_Impl2 interface21_impl2;
        if (!((Class312) class312).aBoolean3626 || !aHa_Sub3_3489.q()) {
            int[] is;
            if ((((Class312) class312).anInt3629 ^ 0xffffffff) != -3 && Class324.method3359(((Class312) class312).aByte3624, (byte) -14))
                is = aD3485.method24(-119, i_22_, 0.7F, true, i, i_22_);
            else
                is = aD3485.method27(false, (byte) 115, i_22_, i_22_, 0.7F, i);
            interface21_impl2 = aHa_Sub3_3489.method1033(i_22_, is, (byte) -54, (((Class312) class312).aByte3623 ^ 0xffffffff) != -1, i_22_);
        } else {
            float[] fs = aD3485.method28(i_22_, false, i_22_, i, 0.7F, -2202);
            interface21_impl2 = aHa_Sub3_3489.method932(fs, i_22_, ((Class312) class312).aByte3623 != 0, Class120.aClass264_1508, -117, i_22_);
        }
        interface21_impl2.method70(1645, ((Class312) class312).aBoolean3639, ((Class312) class312).aBoolean3632);
        if (i_21_ != -125)
            aD3485 = null;
        aClass278_3483.method2867((byte) 0, (long) i, interface21_impl2);
        return interface21_impl2;
    }

    Class299(ha_Sub3 var_ha_Sub3, d var_d) {
        aHa_Sub3_3489 = var_ha_Sub3;
        aD3485 = var_d;
    }

    final void method3178(int i) {
        aClass278_3483.method2864(i, i ^ ~0x3da0);
        anInt3486++;
    }

    final void method3179(int i) {
        anInt3487++;
        if (i != 1000)
            method3172(82);
        aClass278_3483.method2872((byte) -78);
    }
}
