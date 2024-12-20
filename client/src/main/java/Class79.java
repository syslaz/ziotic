/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class79 {
    static int anInt999;
    static int anInt1000;
    static int anInt1001;
    static int anInt1002;
    static Class168 aClass168_1003 = new Class168(4, 1, 1, 1);
    static int anInt1004;
    static int anInt1005;
    int anInt1006;
    static int anInt1007;

    static final boolean method572(int i, int i_0_, int i_1_) {
        if (i_0_ != 55)
            return false;
        anInt1002++;
        if (!Class230.method1835(i_1_, i, 22926))
            return false;
        if ((0x9000 & i_1_) != 0 | Class351.method3743((byte) -73, i, i_1_) | Class282_Sub27.method3033(i_1_, i, false))
            return true;
        return (((0x2000 & i_1_) != 0 | RSInterface2.method3766(i_0_ + -123, i_1_, i) | Class282_Sub18.method2996(i, 4, i_1_)) & (0x37 & i) == 0);
    }

    public static void method573(int i) {
        aClass168_1003 = null;
        if (i <= 34)
            method573(-96);
    }

    static final void method574(Node_Sub8 class248_sub8, Node_Sub8 class248_sub8_2_, byte i) {
        if (((Node_Sub8) class248_sub8_2_).aClass248_Sub8_6867 != null)
            class248_sub8_2_.method2021((byte) -26);
        anInt1000++;
        ((Node_Sub8) class248_sub8_2_).aClass248_Sub8_6871 = ((Node_Sub8) class248_sub8).aClass248_Sub8_6871;
        ((Node_Sub8) class248_sub8_2_).aClass248_Sub8_6867 = class248_sub8;
        ((Node_Sub8) (((Node_Sub8) class248_sub8_2_).aClass248_Sub8_6867)).aClass248_Sub8_6871 = class248_sub8_2_;
        if (i <= -87)
            ((Node_Sub8) (((Node_Sub8) class248_sub8_2_).aClass248_Sub8_6871)).aClass248_Sub8_6867 = class248_sub8_2_;
    }

    static final int method575(byte i, boolean bool, int i_3_) {
        anInt1004++;
        if (bool)
            return 0;
        Node_Sub33 class248_sub33 = IOException_Sub1.method127(bool, i_3_, (byte) -60);
        if (class248_sub33 == null)
            return (((Node_Sub8_Sub3) r_Sub2.aClass315_10275.method3282(i_3_, -4)).anInt8923);
        int i_4_ = 0;
        for (int i_5_ = 0; ((((Node_Sub33) class248_sub33).anIntArray7202.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++) {
            if ((((Node_Sub33) class248_sub33).anIntArray7202[i_5_] ^ 0xffffffff) == 0)
                i_4_++;
        }
        if (i < 55)
            aClass168_1003 = null;
        i_4_ += ((((Node_Sub8_Sub3) r_Sub2.aClass315_10275.method3282(i_3_, -4)).anInt8923) + -((Node_Sub33) class248_sub33).anIntArray7202.length);
        return i_4_;
    }

    public final String toString() {
        anInt1007++;
        throw new IllegalStateException();
    }

    static final void method576(byte i, Class346 class346, Class346 class346_6_) {
        anInt1001++;
        if (((Class346) class346_6_).aClass346_4125 != null)
            class346_6_.method3538(-125);
        ((Class346) class346_6_).aClass346_4121 = class346;
        if (i > -86)
            aClass168_1003 = null;
        ((Class346) class346_6_).aClass346_4125 = ((Class346) class346).aClass346_4125;
        ((Class346) ((Class346) class346_6_).aClass346_4125).aClass346_4121 = class346_6_;
        ((Class346) ((Class346) class346_6_).aClass346_4121).aClass346_4125 = class346_6_;
    }

    static final Class162 method577(int i, ha var_ha, byte i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
        anInt999++;
        if (i_7_ != 63)
            method575((byte) -96, true, 39);
        long l = (long) i_9_;
        Class162 class162 = (Class162) Class380.aClass278_4645.method2863(4, l);
        int i_12_ = 2055;
        if (class162 == null) {
            Class343 class343 = OutgoingOpcode.method1513(0, Node_Sub14_Sub9.aClass381_9245, i_7_ + -169, i_9_);
            if (class343 == null)
                return null;
            if (((Class343) class343).anInt4053 < 13)
                class343.method3497((byte) 1, 2);
            class162 = var_ha.a(class343, i_12_, Class256.anInt2932, 64, 768);
            Class380.aClass278_4645.method2867((byte) 0, l, class162);
        }
        class162 = class162.method1436((byte) 2, i_12_, true);
        if ((i_11_ ^ 0xffffffff) != -1)
            class162.a(i_11_);
        if (i_8_ != 0)
            class162.FA(i_8_);
        if (i != 0)
            class162.VA(i);
        if (i_10_ != 0)
            class162.H(0, i_10_, 0);
        return class162;
    }

    final int method578(int i) {
        anInt1005++;
        if (i != -183)
            aClass168_1003 = null;
        return ((Class79) this).anInt1006;
    }

    Class79(String string, int i) {
        ((Class79) this).anInt1006 = i;
    }
}
