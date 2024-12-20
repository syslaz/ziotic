/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class166 {
    static int anInt1945;
    static IncommingOpcode aIncommingOpcode_1946 = new IncommingOpcode(105, -2);
    static int anInt1947;
    static short[] aShortArray1948;
    static int anInt1949;
    static int anInt1950;

    static final void method1534(int i) {
        anInt1947++;
        int i_0_ = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7333.method2952(true);
        if (i == (i_0_ ^ 0xffffffff)) {
            Class283.aByteArrayArrayArray3338 = null;
            Class259.method2760(255, 0);
        } else if (i_0_ != 1) {
            Class381.method3910(i + 1, (byte) (0xff & Class54.anInt727 + -4));
            Class259.method2760(255, 2);
        } else {
            Class381.method3910(0, (byte) 0);
            Class259.method2760(255, 512);
            if (r.aByteArrayArrayArray9033 != null)
                Node_Sub8_Sub7.method2065((byte) 107);
        }
        Class10.anInt236 = Class177.anInt2074;
    }

    static final void method1535(int i, int i_1_, int i_2_, int i_3_, int i_4_, ha var_ha) {
        var_ha.KA(i_2_, i_3_, i + i_2_, i_3_ + i_4_);
        anInt1950++;
        var_ha.method820(i, 40, i_4_, i_3_, i_2_, -16777216);
        if (Node_Sub14_Sub5.anInt9208 >= 100) {
            float f = (float) Class116.anInt1457 / (float) Class116.anInt1465;
            int i_5_ = i;
            int i_6_ = i_4_;
            if (f < 1.0F)
                i_6_ = (int) (f * (float) i);
            else
                i_5_ = (int) ((float) i_4_ / f);
            i_2_ += (-i_5_ + i) / 2;
            i_3_ += (-i_6_ + i_4_) / 2;
            if (Class366.aClass129_4491 == null || ((Class366.aClass129_4491.method1175() ^ 0xffffffff) != (i ^ 0xffffffff)) || ((Class366.aClass129_4491.method1176() ^ 0xffffffff) != (i_4_ ^ 0xffffffff))) {
                Class116.method1093(Class116.anInt1468, Class116.anInt1469 - -Class116.anInt1457, Class116.anInt1465 + Class116.anInt1468, Class116.anInt1469, i_2_, i_3_, i_5_ + i_2_, i_6_ + i_3_);
                Class116.method1091(var_ha);
                Class366.aClass129_4491 = var_ha.a(i_2_, i_3_, i_5_, i_6_, false);
            }
            Class366.aClass129_4491.method1168(i_2_, i_3_);
            int i_7_ = i_5_ * Class36.anInt406 / Class116.anInt1465;
            int i_8_ = i_6_ * Class226.anInt2549 / Class116.anInt1457;
            int i_9_ = i_5_ * Class59.anInt818 / Class116.anInt1465 + i_2_;
            int i_10_ = (-i_8_ + (-(i_6_ * Class323.anInt3789 / Class116.anInt1457) + i_6_) + i_3_);
            int i_11_ = -1996554240;
            if (Class12.aClass215_249 == Class359.aClass215_4430)
                i_11_ = -1996488705;
            if (i_1_ == -24604) {
                var_ha.aa(i_9_, i_10_, i_7_, i_8_, i_11_, 1);
                var_ha.c(i_9_, i_10_, i_7_, i_8_, i_11_, 0);
                if (Node_Sub28.anInt7166 > 0) {
                    int i_12_;
                    if ((Class282_Sub1.anInt7595 ^ 0xffffffff) < -51)
                        i_12_ = -(Class282_Sub1.anInt7595 * 5) + 500;
                    else
                        i_12_ = 5 * Class282_Sub1.anInt7595;
                    for (Node_Sub35 class248_sub35 = ((Node_Sub35) Class116.aClass293_1443.method3119(2)); class248_sub35 != null; class248_sub35 = ((Node_Sub35) Class116.aClass293_1443.method3107(-127))) {
                        Class56 class56 = (Class116.aClass257_1436.method2750((byte) 26, ((Node_Sub35) class248_sub35).anInt7243));
                        if (Class84_Sub6.method617(class56, 2)) {
                            if ((((Node_Sub35) class248_sub35).anInt7243 ^ 0xffffffff) == (Class177.anInt2067 ^ 0xffffffff)) {
                                int i_13_ = ((((Node_Sub35) class248_sub35).anInt7252) * i_5_ / Class116.anInt1465 + i_2_);
                                int i_14_ = (((Class116.anInt1457 - (((Node_Sub35) class248_sub35).anInt7246)) * i_6_ / Class116.anInt1457) + i_3_);
                                var_ha.method820(4, 19, 4, i_14_ + -2, -2 + i_13_, (0xffff00 | i_12_ << 1116794936));
                            } else if (Class55.anInt733 != -1 && (((Class56) class56).anInt751 == Class55.anInt733)) {
                                int i_15_ = (i_2_ + ((((Node_Sub35) class248_sub35).anInt7252) * i_5_ / Class116.anInt1465));
                                int i_16_ = ((i_6_ * (-(((Node_Sub35) class248_sub35).anInt7246) + Class116.anInt1457) / Class116.anInt1457) + i_3_);
                                var_ha.method820(4, 67, 4, i_16_ - 2, -2 + i_15_, (0xffff00 | i_12_ << 732682168));
                            }
                        }
                    }
                }
            }
        }
    }

    public static void method1536(byte i) {
        aShortArray1948 = null;
        if (i < 114)
            anInt1949 = 35;
        aIncommingOpcode_1946 = null;
    }

    static final int method1537(byte i, ByteStream class248_sub9, String string) {
        anInt1945++;
        int i_17_ = ((ByteStream) class248_sub9).offset;
        byte[] is = InputStream_Sub2.method126(true, string);
        class248_sub9.method2158(is.length, 1182187312);
        ((ByteStream) class248_sub9).offset += (Class335.aClass25_3909.method243((byte) -124, 0, ((ByteStream) class248_sub9).buffer, is, ((ByteStream) class248_sub9).offset, is.length));
        if (i != -98)
            method1534(-107);
        return -i_17_ + ((ByteStream) class248_sub9).offset;
    }
}
