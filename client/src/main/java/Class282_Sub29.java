/* Class282_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub29 extends Class282 {
    static int anInt7896 = -1;
    static int anInt7897;
    static int anInt7898;
    static int anInt7899;
    static int anInt7900;
    static int anInt7901;
    static int anInt7902;
    static int anInt7903;
    static int anInt7904;
    static int anInt7905;
    static int anInt7906;

    final int method2919(boolean bool) {
        if (bool != false)
            method3050(2);
        anInt7905++;
        return 1;
    }

    static final boolean method3045(int i, int i_0_, int i_1_) {
        anInt7902++;
        if (i != 3)
            method3046(null, (byte) -67);
        if ((0x8000 & i_0_) == 0)
            return false;
        return true;
    }

    Class282_Sub29(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    final void method2922(boolean bool, int i) {
        ((Class282) this).anInt3320 = i;
        if (bool != true)
            anInt7896 = -85;
        anInt7901++;
    }

    Class282_Sub29(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    static final Class273 method3046(ByteStream class248_sub9, byte i) {
        anInt7899++;
        int i_2_ = class248_sub9.readShort(-1);
        if (i >= -35)
            anInt7896 = -73;
        return new Class273(i_2_);
    }

    final int method3047(boolean bool) {
        anInt7897++;
        if (bool != true)
            anInt7896 = 67;
        return ((Class282) this).anInt3320;
    }

    static final boolean method3048(int i, int i_3_, byte i_4_) {
        anInt7904++;
        if (i_4_ > -5)
            anInt7896 = 1;
        if (!Class36.method282(5, i, i_3_) && !Class282_Sub20.method3005(i_3_, 192, i))
            return false;
        return true;
    }

    static final void method3049(int i, int i_5_) {
        anInt7898++;
        int i_6_ = -Class282_Sub2.anInt7609 + Node_Sub18.anInt7027;
        if (i_6_ >= 100) {
            Node_Sub45.anInt7343 = 1;
            Node_Sub14_Sub21.anInt9379 = Class359.anInt4436 = -1;
        } else {
            int i_7_ = (int) Node_Sub8_Sub13.aFloat9030;
            if ((Node_Sub14_Sub6.anInt9213 >> 1783299688 ^ 0xffffffff) < (i_7_ ^ 0xffffffff))
                i_7_ = Node_Sub14_Sub6.anInt9213 >> -744709400;
            if (Class160.aBooleanArray1890[4] && i_7_ < 128 + Class19.anIntArray301[4])
                i_7_ = 128 + Class19.anIntArray301[4];
            int i_8_ = 0x3fff & (int) Class282_Sub7.aFloat7661 - -Class86.anInt1066;
            Class171.method1550(true, Class189.anInt5066, i_7_, Class82.anInt1027, i, (i_7_ >> -1183859165) * 3 + 600 << -1690786526, Class353.method3753((((Interactable) (Class347.myPlayer)).y), (((Interactable) (Class347.myPlayer)).x), 126, Class177.anInt2074) - 200, i_8_);
            float f = -((float) ((-i_6_ + 100) * (-i_6_ + 100) * (-i_6_ + 100)) / 1000000.0F) + 1.0F;
            Class316_Sub1_Sub2.cameraPosZ = (int) ((float) Class170.anInt1982 + (float) (-Class170.anInt1982 + Class316_Sub1_Sub2.cameraPosZ) * f);
            Class127.cameraPitch = (int) ((float) Class263.anInt2984 + f * (float) (Class127.cameraPitch + -Class263.anInt2984));
            InputStream_Sub1.cameraPosY = (int) ((float) Class28.anInt4895 + f * (float) (InputStream_Sub1.cameraPosY - Class28.anInt4895));
            Class346_Sub7_Sub1.cameraPosX = (int) ((float) Class226_Sub1_Sub1.anInt8802 + f * (float) (-Class226_Sub1_Sub1.anInt8802 + Class346_Sub7_Sub1.cameraPosX));
            int i_9_ = Class301_Sub3_Sub1.cameraYaw + -s_Sub3.anInt8018;
            if (i_5_ >= -127)
                method3049(-54, -76);
            if ((i_9_ ^ 0xffffffff) < -8193)
                i_9_ -= 16384;
            else if ((i_9_ ^ 0xffffffff) > 8191)
                i_9_ += 16384;
            Class301_Sub3_Sub1.cameraYaw = (int) (f * (float) i_9_ + (float) s_Sub3.anInt8018);
            Class301_Sub3_Sub1.cameraYaw &= 0x3fff;
        }
    }

    final void method2918(byte i) {
        if (((Class282) this).aClass248_Sub45_3321.method2643(7108) != Class346_Sub7_Sub2_Sub3.aClass215_10385)
            ((Class282) this).anInt3320 = 1;
        else if (((Class282) this).aClass248_Sub45_3321.method2644(0))
            ((Class282) this).anInt3320 = 0;
        anInt7900++;
        if ((((Class282) this).anInt3320 ^ 0xffffffff) != -1 && ((Class282) this).anInt3320 != 1)
            ((Class282) this).anInt3320 = method2919(false);
        if (i != 98)
            anInt7896 = 52;
    }

    final boolean method3050(int i) {
        anInt7903++;
        if (((Class282) this).aClass248_Sub45_3321.method2643(i + 6848) == Class346_Sub7_Sub2_Sub3.aClass215_10385) {
            if (!((Class282) this).aClass248_Sub45_3321.method2644(i ^ 0x104))
                return true;
            return false;
        }
        if (i != 260)
            anInt7896 = 72;
        return false;
    }

    final int method2917(int i, int i_10_) {
        anInt7906++;
        if (((Class282) this).aClass248_Sub45_3321.method2643(7108) == Class346_Sub7_Sub2_Sub3.aClass215_10385) {
            if (((Class282) this).aClass248_Sub45_3321.method2644(0))
                return 3;
            if (i_10_ == 0 || ((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub25_7345.method3026(true) == 1)
                return 1;
            return 2;
        }
        if (i != 0)
            return 76;
        return 3;
    }
}
