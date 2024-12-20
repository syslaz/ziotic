/* Class282_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub25 extends Class282 {
    static int anInt7845;
    static int anInt7846;
    static int anInt7847;
    static IncommingOpcode aIncommingOpcode_7848 = new IncommingOpcode(103, 0);
    static int anInt7849;
    static int anInt7850;
    static int anInt7851;
    static Class129 aClass129_7852;
    static OutgoingOpcode aOutgoingOpcode_7853 = new OutgoingOpcode(9, -1);
    static int anInt7854;
    static ha aHa7855;
    static int anInt7856;
    static int anInt7857;

    final void method2918(byte i) {
        anInt7845++;
        if (((Class282) this).aClass248_Sub45_3321.method2643(7108) == Class346_Sub7_Sub2_Sub3.aClass215_10385) {
            if (((Class282) this).aClass248_Sub45_3321.method2644(0))
                ((Class282) this).anInt3320 = 0;
        } else
            ((Class282) this).anInt3320 = 1;
        if ((((Class282) this).anInt3320 ^ 0xffffffff) != -1 && ((Class282) this).anInt3320 != 1)
            ((Class282) this).anInt3320 = method2919(false);
        if (i != 98)
            method3024(-30);
    }

    Class282_Sub25(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final int method2919(boolean bool) {
        anInt7846++;
        if (bool != false)
            aOutgoingOpcode_7853 = null;
        return 1;
    }

    static final void method3022(int i, int i_0_, boolean bool, int i_1_) {
        i <<= 3;
        i_0_ <<= 3;
        anInt7849++;
        i_1_ <<= 3;
        Node_Sub8_Sub13.aFloat9030 = (float) i_0_;
        if ((Node_Sub45.anInt7343 ^ 0xffffffff) == -3) {
            Class346_Sub5_Sub1.anInt9886 = i_1_;
            Class301_Sub3_Sub1.cameraYaw = i;
            Class127.cameraPitch = i_0_;
        }
        Class282_Sub7.aFloat7661 = (float) i;
        Class315.method3280(-47);
        Class207.aBoolean2398 = true;
        if (bool != false)
            method3027(65, 6);
    }

    public static void method3023(boolean bool) {
        if (bool != false)
            method3022(65, -123, true, -44);
        aHa7855 = null;
        aIncommingOpcode_7848 = null;
        aOutgoingOpcode_7853 = null;
        aClass129_7852 = null;
    }

    final boolean method3024(int i) {
        anInt7850++;
        if (((Class282) this).aClass248_Sub45_3321.method2644(0))
            return false;
        if (i != 260)
            aOutgoingOpcode_7853 = null;
        if (((Class282) this).aClass248_Sub45_3321.method2643(7108) == Class346_Sub7_Sub2_Sub3.aClass215_10385)
            return true;
        return false;
    }

    static final void method3025(ByteStream class248_sub9, int i) {
        anInt7851++;
        if (i != -1)
            method3023(false);
        for (int i_2_ = 0; i_2_ < Class41.anInt533; i_2_++) {
            int i_3_ = class248_sub9.readSmart((byte) 22);
            int i_4_ = class248_sub9.readShort(-1);
            if ((i_4_ ^ 0xffffffff) == -65536)
                i_4_ = -1;
            if (Class84_Sub3.aClass147_Sub1Array5399[i_3_] != null)
                ((Class147) Class84_Sub3.aClass147_Sub1Array5399[i_3_]).anInt1742 = i_4_;
        }
    }

    final int method2917(int i, int i_5_) {
        anInt7847++;
        if (((Class282) this).aClass248_Sub45_3321.method2644(i))
            return 3;
        if (((Class282) this).aClass248_Sub45_3321.method2643(i + 7108) == Class346_Sub7_Sub2_Sub3.aClass215_10385) {
            if ((i_5_ ^ 0xffffffff) == -1) {
                if (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub28_7329.method3040(true) == 1)
                    return 2;
                if (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub29_7313.method3047(true) == 1)
                    return 2;
                if (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub23_7360.method3018(true) > 0)
                    return 2;
            }
            return 1;
        }
        return 3;
    }

    final void method2922(boolean bool, int i) {
        anInt7854++;
        if (bool != true)
            aIncommingOpcode_7848 = null;
        ((Class282) this).anInt3320 = i;
    }

    final int method3026(boolean bool) {
        if (bool != true)
            return 21;
        anInt7857++;
        return ((Class282) this).anInt3320;
    }

    Class282_Sub25(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    static final Class243 method3027(int i, int i_6_) {
        anInt7856++;
        if ((i ^ 0xffffffff) == -1) {
            if ((double) Class116.aFloat1447 == 3.0)
                return Node_Sub14_Sub17.aClass243_9341;
            if ((double) Class116.aFloat1447 == 4.0)
                return Class198.aClass243_2267;
            if ((double) Class116.aFloat1447 == 6.0)
                return Class377.aClass243_4623;
            if ((double) Class116.aFloat1447 >= 8.0)
                return Class102.aClass243_1310;
        } else if (i != 1) {
            if (i == 2) {
                if ((double) Class116.aFloat1447 == 3.0)
                    return Node_Sub15_Sub4.aClass243_9698;
                if ((double) Class116.aFloat1447 == 4.0)
                    return Class340_Sub8.aClass243_8196;
                if ((double) Class116.aFloat1447 == 6.0)
                    return Class238_Sub3.aClass243_6774;
                if ((double) Class116.aFloat1447 >= 8.0)
                    return Node_Sub8_Sub10.aClass243_8978;
            }
        } else {
            if ((double) Class116.aFloat1447 == 3.0)
                return Class377.aClass243_4623;
            if ((double) Class116.aFloat1447 == 4.0)
                return Class102.aClass243_1310;
            if ((double) Class116.aFloat1447 == 6.0)
                return Node_Sub15_Sub4.aClass243_9698;
            if ((double) Class116.aFloat1447 >= 8.0)
                return Class340_Sub8.aClass243_8196;
        }
        int i_7_ = 4 / ((i_6_ - -12) / 32);
        return null;
    }
}
