/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;

final class Class158 {
    static Class346_Sub8[] aClass346_Sub8Array1877;
    static int anInt1878;
    static int anInt1879;
    static int anInt1880;
    static Applet anApplet1881;
    static int anInt1882;
    static OutgoingOpcode aOutgoingOpcode_1883 = new OutgoingOpcode(70, -1);
    static Class381 aClass381_1884;

    static final void method1393(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        if (i != ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7332.method2993(true) && i_3_ != 0 && Class282_Sub4.anInt7624 < 50 && (i_4_ ^ 0xffffffff) != 0)
            Class67.aClass42Array902[Class282_Sub4.anInt7624++] = new Class42((byte) 1, i_4_, i_3_, i_1_, i_5_, i_2_, i_0_, null);
        anInt1879++;
    }

    static final int method1394(int i, int i_6_, int i_7_, boolean bool) {
        anInt1880++;
        int i_8_ = i_6_ / i_7_;
        int i_9_ = -1 + i_7_ & i_6_;
        int i_10_ = i / i_7_;
        int i_11_ = i & -1 + i_7_;
        if (bool != false)
            return 28;
        int i_12_ = Class80.method581(i_8_, true, i_10_);
        int i_13_ = Class80.method581(1 + i_8_, true, i_10_);
        int i_14_ = Class80.method581(i_8_, true, 1 + i_10_);
        int i_15_ = Class80.method581(i_8_ - -1, true, i_10_ - -1);
        int i_16_ = Node_Sub8_Sub6.method2057((byte) -88, i_7_, i_13_, i_9_, i_12_);
        int i_17_ = Node_Sub8_Sub6.method2057((byte) -115, i_7_, i_15_, i_9_, i_14_);
        return Node_Sub8_Sub6.method2057((byte) -81, i_7_, i_17_, i_11_, i_16_);
    }

    public static void method1395(int i) {
        anApplet1881 = null;
        if (i != 29142)
            aClass381_1884 = null;
        aOutgoingOpcode_1883 = null;
        aClass381_1884 = null;
        aClass346_Sub8Array1877 = null;
    }

    static final void method1396(Class182 class182, int i, Interactable interactable, boolean bool) {
        anInt1878++;
        if ((Class282_Sub4.anInt7624 ^ 0xffffffff) > -51 && (class182 != null && ((Class182) class182).anIntArrayArray2131 != null && ((i ^ 0xffffffff) > (((Class182) class182).anIntArrayArray2131.length ^ 0xffffffff)) && ((Class182) class182).anIntArrayArray2131[i] != null)) {
            int i_18_ = ((Class182) class182).anIntArrayArray2131[i][0];
            if (bool != true)
                method1394(-118, -101, -123, false);
            int i_19_ = i_18_ >> -2079202008;
            int i_20_ = 0x7 & i_18_ >> 444400069;
            if (((Class182) class182).anIntArrayArray2131[i].length > 1) {
                int i_21_ = (int) (Math.random() * (double) (((Class182) class182).anIntArrayArray2131[i]).length);
                if (i_21_ > 0)
                    i_19_ = ((Class182) class182).anIntArrayArray2131[i][i_21_];
            }
            int i_22_ = i_18_ & 0x1f;
            int i_23_ = 256;
            if (((Class182) class182).anIntArray2109 != null && ((Class182) class182).anIntArray2118 != null)
                i_23_ = (((Class182) class182).anIntArray2109[i] + (int) (Math.random() * (double) (-(((Class182) class182).anIntArray2109[i]) + (((Class182) class182).anIntArray2118[i]))));
            int i_24_ = (((Class182) class182).anIntArray2129 == null ? 255 : ((Class182) class182).anIntArray2129[i]);
            if ((i_22_ ^ 0xffffffff) == -1) {
                if (interactable == Class347.myPlayer) {
                    if (!((Class182) class182).aBoolean2135)
                        Node_Sub42_Sub1.method2630(i_23_, (byte) -106, i_19_, 0, i_24_, i_20_);
                    else
                        Node_Sub39_Sub2.method2609(!bool, i_24_, i_20_, i_19_, i_23_, false, 0);
                }
            } else if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7325.method2993(bool) != 0) {
                int i_25_ = (((Interactable) interactable).x - 256 >> -1330516215);
                int i_26_ = (((Interactable) interactable).y - 256 >> -1828538711);
                int i_27_ = ((interactable == Class347.myPlayer) ? 0 : (i_22_ + (i_25_ << -922730960) + (((Interactable) interactable).plane << -482420456) + (i_26_ << -385893720)));
                Class67.aClass42Array902[Class282_Sub4.anInt7624++] = new Class42((((Class182) class182).aBoolean2135 ? (byte) 2 : (byte) 1), i_19_, i_20_, 0, i_24_, i_27_, i_23_, interactable);
            }
        }
    }

    static final void method1397(int i) {
        anInt1882++;
        if ((Class271.anInt3142 ^ 0xffffffff) != 0 && (Class133.anInt5045 ^ 0xffffffff) != 0) {
            int i_28_ = (Class114.anInt1425 + (Class361.anInt4453 * (-Class114.anInt1425 + Class304.anInt3531) >> -479047024));
            Class361.anInt4453 += i_28_;
            if ((Class361.anInt4453 ^ 0xffffffff) > -65536) {
                Class177.aBoolean2066 = false;
                Class346_Sub7_Sub4_Sub2.aBoolean10186 = false;
            } else {
                Class361.anInt4453 = 65535;
                if (!Class177.aBoolean2066)
                    Class346_Sub7_Sub4_Sub2.aBoolean10186 = true;
                else
                    Class346_Sub7_Sub4_Sub2.aBoolean10186 = false;
                Class177.aBoolean2066 = true;
            }
            float f = (float) Class361.anInt4453 / 65535.0F;
            float[] fs = new float[3];
            int i_29_ = 2 * Class346_Sub7_Sub2_Sub4.anInt10104;
            for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > -4; i_30_++) {
                int i_31_ = ((Class59.anIntArrayArrayArray808[Class271.anInt3142][i_29_][i_30_]) * 3);
                int i_32_ = ((Class59.anIntArrayArrayArray808[Class271.anInt3142][i_29_ - -1][i_30_]) * 3);
                int i_33_ = (((Class59.anIntArrayArrayArray808[Class271.anInt3142][2 + i_29_][i_30_]) - ((Class59.anIntArrayArrayArray808[Class271.anInt3142][3 + i_29_][i_30_]) - (Class59.anIntArrayArrayArray808[Class271.anInt3142][2 + i_29_][i_30_]))) * 3);
                int i_34_ = (Class59.anIntArrayArrayArray808[Class271.anInt3142][i_29_][i_30_]);
                int i_35_ = i_32_ + -i_31_;
                int i_36_ = i_33_ + (-(i_32_ * 2) + i_31_);
                int i_37_ = ((Class59.anIntArrayArrayArray808[Class271.anInt3142][i_29_ - -2][i_30_]) - i_34_ - -i_32_ - i_33_);
                fs[i_30_] = (((float) i_35_ + ((float) i_36_ + f * (float) i_37_) * f) * f + (float) i_34_);
            }
            InputStream_Sub1.cameraPosY = (int) fs[1] * -1;
            Class316_Sub1_Sub2.cameraPosZ = -(512 * Class368.baseY) + (int) fs[2];
            Class346_Sub7_Sub1.cameraPosX = -(Class67.baseX * 512) + (int) fs[0];
            float[] fs_38_ = new float[3];
            int i_39_ = 2 * Class37.anInt409;
            for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > -4; i_40_++) {
                int i_41_ = 3 * (Class59.anIntArrayArrayArray808[Class133.anInt5045][i_39_][i_40_]);
                int i_42_ = ((Class59.anIntArrayArrayArray808[Class133.anInt5045][1 + i_39_][i_40_]) * 3);
                int i_43_ = 3 * (-(Class59.anIntArrayArrayArray808[Class133.anInt5045][i_39_ + 3][i_40_]) + (Class59.anIntArrayArrayArray808[Class133.anInt5045][i_39_ + 2][i_40_]) + (Class59.anIntArrayArrayArray808[Class133.anInt5045][i_39_ - -2][i_40_]));
                int i_44_ = (Class59.anIntArrayArrayArray808[Class133.anInt5045][i_39_][i_40_]);
                int i_45_ = i_42_ + -i_41_;
                int i_46_ = i_43_ + i_41_ + -(i_42_ * 2);
                int i_47_ = ((Class59.anIntArrayArrayArray808[Class133.anInt5045][i_39_ + 2][i_40_]) + -i_44_ - -i_42_ - i_43_);
                fs_38_[i_40_] = (float) i_44_ + f * (f * ((float) i_47_ * f + (float) i_46_) + (float) i_45_);
            }
            float f_48_ = -fs[0] + fs_38_[0];
            float f_49_ = (-fs[1] + fs_38_[1]) * -1.0F;
            float f_50_ = fs_38_[2] - fs[2];
            double d = Math.sqrt((double) (f_48_ * f_48_ + f_50_ * f_50_));
            Class127.cameraPitch = (int) (Math.atan2((double) f_49_, d) * 2607.5945876176133) & 0x3fff;
            Class301_Sub3_Sub1.cameraYaw = 0x3fff & (int) (2607.5945876176133 * -Math.atan2((double) f_48_, (double) f_50_));
            Class346_Sub5_Sub1.anInt9886 = ((Class59.anIntArrayArrayArray808[Class271.anInt3142][i_29_][3]) - -(((Class59.anIntArrayArrayArray808[Class271.anInt3142][i_29_ + i][3]) + -(Class59.anIntArrayArrayArray808[Class271.anInt3142][i_29_][3])) * Class361.anInt4453 >> 93518768));
        }
    }
}
