/* Class248_Sub8_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub17 extends Node_Sub8 {
    int anInt9054;
    static boolean aBoolean9055 = false;
    static int anInt9056;
    static float aFloat9057;
    int anInt9058;
    int anInt9059;
    Class303 aClass303_9060;
    Class124 aClass124_9061;
    static int anInt9062;
    static int anInt9063;
    int anInt9064;
    int anInt9065;

    static final int method2140(int i, int i_0_) {
        anInt9063++;
        int i_1_;
        if (i_0_ > 12000) {
            i_1_ = 4;
            Class311.method3265((byte) -95);
        } else if ((i_0_ ^ 0xffffffff) >= -5001) {
            if (i_0_ > 2000) {
                i_1_ = 2;
                Class238_Sub2.method1888((byte) -126);
            } else {
                Node.method1968(1, true);
                i_1_ = 1;
            }
        } else {
            Node_Sub14_Sub12_Sub1.method2310(i);
            i_1_ = 3;
        }
        if (i != 0)
            return 48;
        if ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) ^ 0xffffffff) != -3) {
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322), (byte) -71, 2);
            Node_Sub15_Sub5.method2495(false, i ^ 0x3f, 2);
        }
        Class293.method3113(17458);
        return i_1_;
    }

    static final int method2141(int i) {
        anInt9056++;
        if (Class74.anInt962 == 0) {
            Class9.aClass9_192.method190((byte) -112, new Class66("jaclib"));
            if ((Class9.aClass9_192.method197((byte) 86).method36(i + -20701) ^ 0xffffffff) != -101)
                return 1;
            if (!((Class66) Class9.aClass9_192.method197((byte) -117)).method515(-92))
                Node_Sub8_Sub16_Sub1.aClient10301.method98(7);
            Class74.anInt962 = 1;
        }
        if ((Class74.anInt962 ^ 0xffffffff) == -2) {
            Class225_Sub1_Sub1.aClass9Array9986 = Class9.method188((byte) -82);
            Class9.aClass9_188.method190((byte) -112, new Class71(Class182.aClass381_2103));
            Class9.aClass9_197.method190((byte) -112, new Class66("jaggl"));
            Class9.aClass9_199.method190((byte) -112, new Class66("jagdx"));
            Class9.aClass9_200.method190((byte) -112, new Class66("jagmisc"));
            Class9.aClass9_201.method190((byte) -112, new Class66("sw3d"));
            Class9.aClass9_202.method190((byte) -112, new Class66("hw3d"));
            Class9.aClass9_203.method190((byte) -112, new Class66("jagtheora"));
            Class9.aClass9_204.method190((byte) -112, new Class71(Node_Sub3.aClass381_6826));
            Class9.aClass9_205.method190((byte) -112, new Class71(Class107.aClass381_1357));
            Class9.aClass9_206.method190((byte) -112, new Class71(Class237.aClass381_2644));
            Class9.aClass9_207.method190((byte) -112, new Class71(Class94.aClass381_1222));
            Class9.aClass9_208.method190((byte) -112, new Class71(Node_Sub2_Sub4.aClass381_8879));
            Class9.aClass9_209.method190((byte) -112, new Class71(Class346_Sub5.aClass381_8280));
            Class9.aClass9_210.method190((byte) -112, new Class71(Class4.aClass381_137));
            Class9.aClass9_211.method190((byte) -112, new Class71(Class282_Sub8.aClass381_7670));
            Class9.aClass9_212.method190((byte) -112, new Class71(Class206.aClass381_4980));
            Class9.aClass9_213.method190((byte) -112, new Class71(Node_Sub39.aClass381_7278));
            Class9.aClass9_214.method190((byte) -112, new Class71(Node_Sub25.aClass381_5156));
            Class9.aClass9_215.method190((byte) -112, new Class71(Class355.aClass381_4381));
            Class9.aClass9_216.method190((byte) -112, new Class71(Class327.aClass381_3836));
            Class9.aClass9_217.method190((byte) -112, new Class71(Class205.aClass381_2383));
            Class9.aClass9_218.method190((byte) -112, new Class133(Class374.aClass381_4595, "huffman"));
            Class9.aClass9_219.method190((byte) -112, new Class71(Class139.aClass381_1660));
            Class9.aClass9_220.method190((byte) -112, new Class71(Class246.aClass381_2778));
            Class9.aClass9_221.method190((byte) -112, new Class71(Class168.aClass381_1972));
            Class9.aClass9_222.method190((byte) -112, new Class141((Class282_Sub14.aClass381_7724), "details"));
            for (int i_2_ = 0; i_2_ < Class225_Sub1_Sub1.aClass9Array9986.length; i_2_++) {
                if (Class225_Sub1_Sub1.aClass9Array9986[i_2_].method197((byte) 81) == null)
                    throw new RuntimeException();
            }
            int i_3_ = 0;
            Class9[] class9s = Class225_Sub1_Sub1.aClass9Array9986;
            for (int i_4_ = 0; class9s.length > i_4_; i_4_++) {
                Class9 class9 = class9s[i_4_];
                int js5data = class9.getjd5indata(1);
                int i2 = class9.method197((byte) -116).method36(i + -20701);
                i_3_ += i2 * js5data / 100;
            }
            Class74.anInt962 = 2;
            Class282_Sub10.anInt7696 = i_3_;
        }
        if (Class225_Sub1_Sub1.aClass9Array9986 == null)
            return 100;
        int i_7_ = 0;
        int i_8_ = i;
        boolean bool = true;
        Class9[] class9s = Class225_Sub1_Sub1.aClass9Array9986;
        for (int i_9_ = 0; i_9_ < class9s.length; i_9_++) {
            Class9 class9 = class9s[i_9_];
            int i_10_ = class9.getjd5indata(i ^ 0x1);
            int i_11_ = class9.method197((byte) 10).method36(i + -20701);
            i_7_ += i_10_;
            i_8_ += i_11_ * i_10_ / 100;
            if (i_11_ < 100)
                bool = false;
        }
        if (bool) {
            if (!((Class66) Class9.aClass9_200.method197((byte) -109)).method515(-78))
                Node_Sub8_Sub16_Sub1.aClient10301.method97((byte) -127);
            if (!((Class66) Class9.aClass9_203.method197((byte) 88)).method515(-58))
                Class279_Sub1_Sub2.aBoolean9825 = Node_Sub8_Sub16_Sub1.aClient10301.method89(122);
            Class225_Sub1_Sub1.aClass9Array9986 = null;
        }
        i_7_ -= Class282_Sub10.anInt7696;
        i_8_ -= Class282_Sub10.anInt7696;
        int i_12_ = i_7_ > 0 ? 100 * i_8_ / i_7_ : 100;
        if (!bool && (i_12_ ^ 0xffffffff) < -100)
            i_12_ = 99;
        return i_12_;
    }

    final void method2142(int i) {
        ((Node_Sub8_Sub17) this).anInt9058 = (((Class124) ((Node_Sub8_Sub17) this).aClass124_9061).anInt1542);
        ((Node_Sub8_Sub17) this).anInt9064 = (((Class124) ((Node_Sub8_Sub17) this).aClass124_9061).anInt1536);
        if (i != 25201)
            ((Node_Sub8_Sub17) this).aClass124_9061 = null;
        anInt9062++;
        ((Node_Sub8_Sub17) this).anInt9065 = (((Class124) ((Node_Sub8_Sub17) this).aClass124_9061).anInt1535);
        if ((((Class124) ((Node_Sub8_Sub17) this).aClass124_9061).aViewport_1533) != null)
            ((Class124) ((Node_Sub8_Sub17) this).aClass124_9061).aViewport_1533.method1870((((Class303) ((Node_Sub8_Sub17) this).aClass303_9060).anInt3519), (((Class303) ((Node_Sub8_Sub17) this).aClass303_9060).anInt3512), (((Class303) ((Node_Sub8_Sub17) this).aClass303_9060).anInt3523), Class282_Sub3.anIntArray7622);
        ((Node_Sub8_Sub17) this).anInt9059 = Class282_Sub3.anIntArray7622[0];
        ((Node_Sub8_Sub17) this).anInt9054 = Class282_Sub3.anIntArray7622[2];
    }

    Node_Sub8_Sub17(Class124 class124, Class346_Sub8 class346_sub8) {
        ((Node_Sub8_Sub17) this).aClass124_9061 = class124;
        ((Node_Sub8_Sub17) this).aClass303_9060 = ((Node_Sub8_Sub17) this).aClass124_9061.method1142(0);
        method2142(25201);
    }
}
