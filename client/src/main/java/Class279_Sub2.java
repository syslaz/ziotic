/* Class279_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class279_Sub2 extends Class279 {
    static int anInt7569;
    static int anInt7570;
    private byte[] aByteArray7571;
    static Node_Sub8_Sub2[] aClass248_Sub8_Sub2Array7572;
    private int anInt7573;
    private int anInt7574;
    static int anInt7575;
    private int anInt7576;
    static Class151 aClass151_7577;
    private int anInt7578;
    static int anInt7579;
    static int anInt7580;
    static int anInt7581 = 1407;
    static int anInt7582;
    private int anInt7583;
    static int anInt7584;
    private int anInt7585;
    static int anInt7586;
    static int anInt7587;
    private int anInt7588;
    private int anInt7589;

    void method2893(byte i, int i_0_, byte i_1_) {
        anInt7570++;
        if (i_1_ != -111)
            method2898(69);
        aByteArray7571[i_0_] = i;
    }

    static final void method2894(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        anInt7569++;
        int i_9_ = 0;
        int i_10_ = i_8_;
        int i_11_ = 0;
        int i_12_ = i_4_ - i_5_;
        int i_13_ = -i_5_ + i_8_;
        int i_14_ = i_4_ * i_4_;
        int i_15_ = i_8_ * i_8_;
        if (i_7_ != -5411)
            method2897((byte) -9, -123L);
        int i_16_ = i_12_ * i_12_;
        int i_17_ = i_13_ * i_13_;
        int i_18_ = i_15_ << -747288095;
        int i_19_ = i_14_ << -1117772927;
        int i_20_ = i_17_ << -1978739103;
        int i_21_ = i_16_ << 411735233;
        int i_22_ = i_8_ << -121905055;
        int i_23_ = i_13_ << 317613025;
        int i_24_ = i_18_ + (1 + -i_22_) * i_14_;
        int i_25_ = i_15_ + -((-1 + i_22_) * i_19_);
        int i_26_ = (1 + -i_23_) * i_16_ + i_20_;
        int i_27_ = -((i_23_ - 1) * i_21_) + i_17_;
        int i_28_ = i_14_ << 1157669122;
        int i_29_ = i_15_ << 833898882;
        int i_30_ = i_16_ << -1014792478;
        int i_31_ = i_17_ << 1397289058;
        int i_32_ = i_18_ * 3;
        int i_33_ = (i_22_ - 3) * i_19_;
        int i_34_ = i_20_ * 3;
        int i_35_ = i_21_ * (-3 + i_23_);
        int i_36_ = i_29_;
        int i_37_ = (-1 + i_8_) * i_28_;
        int i_38_ = i_31_;
        if (i_2_ >= Class181.anInt2099 && i_2_ <= aa_Sub3.anInt5270) {
            int[] is = Class156.anIntArrayArray1867[i_2_];
            int i_39_ = Class49.method389(Class289.anInt3399, i_7_ + 5467, Class302.anInt3500, -i_4_ + i_6_);
            int i_40_ = Class49.method389(Class289.anInt3399, 108, Class302.anInt3500, i_6_ - -i_4_);
            int i_41_ = Class49.method389(Class289.anInt3399, i_7_ + 5438, Class302.anInt3500, -i_12_ + i_6_);
            int i_42_ = Class49.method389(Class289.anInt3399, 54, Class302.anInt3500, i_12_ + i_6_);
            Class149.method1331(i_3_, i_7_ ^ 0x1569, i_39_, is, i_41_);
            Class149.method1331(i, i_7_ ^ 0x156f, i_41_, is, i_42_);
            Class149.method1331(i_3_, -69, i_42_, is, i_40_);
        }
        int i_43_ = (i_13_ + -1) * i_30_;
        while (i_10_ > 0) {
            boolean bool = (i_10_ ^ 0xffffffff) >= (i_13_ ^ 0xffffffff);
            if (bool) {
                if (i_26_ < 0) {
                    while (i_26_ < 0) {
                        i_26_ += i_34_;
                        i_27_ += i_38_;
                        i_11_++;
                        i_34_ += i_31_;
                        i_38_ += i_31_;
                    }
                }
                if (i_27_ < 0) {
                    i_27_ += i_38_;
                    i_26_ += i_34_;
                    i_11_++;
                    i_34_ += i_31_;
                    i_38_ += i_31_;
                }
                i_27_ += -i_35_;
                i_26_ += -i_43_;
                i_35_ -= i_30_;
                i_43_ -= i_30_;
            }
            if (i_24_ < 0) {
                while ((i_24_ ^ 0xffffffff) > -1) {
                    i_25_ += i_36_;
                    i_24_ += i_32_;
                    i_32_ += i_29_;
                    i_36_ += i_29_;
                    i_9_++;
                }
            }
            if ((i_25_ ^ 0xffffffff) > -1) {
                i_25_ += i_36_;
                i_24_ += i_32_;
                i_36_ += i_29_;
                i_9_++;
                i_32_ += i_29_;
            }
            i_24_ += -i_37_;
            i_25_ += -i_33_;
            i_33_ -= i_28_;
            i_10_--;
            i_37_ -= i_28_;
            int i_44_ = -i_10_ + i_2_;
            int i_45_ = i_2_ - -i_10_;
            if ((Class181.anInt2099 ^ 0xffffffff) >= (i_45_ ^ 0xffffffff) && (aa_Sub3.anInt5270 ^ 0xffffffff) <= (i_44_ ^ 0xffffffff)) {
                int i_46_ = Class49.method389(Class289.anInt3399, 61, Class302.anInt3500, i_6_ + i_9_);
                int i_47_ = Class49.method389(Class289.anInt3399, 57, Class302.anInt3500, -i_9_ + i_6_);
                if (bool) {
                    int i_48_ = Class49.method389(Class289.anInt3399, 41, Class302.anInt3500, i_6_ - -i_11_);
                    int i_49_ = Class49.method389(Class289.anInt3399, i_7_ + 5429, Class302.anInt3500, -i_11_ + i_6_);
                    if ((Class181.anInt2099 ^ 0xffffffff) >= (i_44_ ^ 0xffffffff)) {
                        int[] is = Class156.anIntArrayArray1867[i_44_];
                        Class149.method1331(i_3_, -96, i_47_, is, i_49_);
                        Class149.method1331(i, i_7_ ^ 0x154a, i_49_, is, i_48_);
                        Class149.method1331(i_3_, -96, i_48_, is, i_46_);
                    }
                    if (i_45_ <= aa_Sub3.anInt5270) {
                        int[] is = Class156.anIntArrayArray1867[i_45_];
                        Class149.method1331(i_3_, -109, i_47_, is, i_49_);
                        Class149.method1331(i, -60, i_49_, is, i_48_);
                        Class149.method1331(i_3_, -66, i_48_, is, i_46_);
                    }
                } else {
                    if (Class181.anInt2099 <= i_44_)
                        Class149.method1331(i_3_, -93, i_47_, (Class156.anIntArrayArray1867[i_44_]), i_46_);
                    if ((aa_Sub3.anInt5270 ^ 0xffffffff) <= (i_45_ ^ 0xffffffff))
                        Class149.method1331(i_3_, i_7_ ^ 0x1577, i_47_, (Class156.anIntArrayArray1867[i_45_]), i_46_);
                }
            }
        }
    }

    final void method2884(int i) {
        anInt7589 >>= 4;
        if (i != 28926)
            anInt7588 = -1;
        anInt7576 = anInt7588;
        anInt7586++;
        if ((anInt7589 ^ 0xffffffff) <= -1) {
            if ((anInt7589 ^ 0xffffffff) < -256)
                anInt7589 = 255;
        } else
            anInt7589 = 0;
        method2893((byte) anInt7589, anInt7578++, (byte) -111);
        anInt7589 = 0;
    }

    static final int method2895(int i, byte i_50_, int i_51_, boolean bool) {
        anInt7579++;
        Node_Sub33 class248_sub33 = IOException_Sub1.method127(bool, i, (byte) -60);
        if (class248_sub33 == null)
            return -1;
        if (i_50_ > -53)
            method2894(117, 95, 7, 93, -39, 35, 118, 48);
        if ((i_51_ ^ 0xffffffff) > -1 || (i_51_ >= ((Node_Sub33) class248_sub33).anIntArray7202.length))
            return -1;
        return ((Node_Sub33) class248_sub33).anIntArray7202[i_51_];
    }

    final void method2879(int i) {
        anInt7589 = 0;
        int i_52_ = -29 % ((i - 22) / 45);
        anInt7575++;
        anInt7578 = 0;
    }

    static final void method2896(byte i) {
        anInt7584++;
        if (Class347.aClass276Array4131 == null) {
            Class347.aClass276Array4131 = Class276.method2856(93);
            Class90.aClass276_1119 = Class347.aClass276Array4131[0];
            Node_Sub33.aLong7200 = Class118.method1112(116);
        }
        if (Class282_Sub11.aClass74_7702 == null)
            Class149.method1333(1);
        int i_53_ = -101 / ((-39 - i) / 39);
        Class276 class276 = Class90.aClass276_1119;
        int i_54_ = Class282_Sub9.method2959(27933);
        if (Class90.aClass276_1119 == class276) {
            Node_Sub8_Sub19.aString9086 = ((Class276) Class90.aClass276_1119).aClass41_3174.method301(Class191.anInt4822, (byte) -108);
            if (((Class276) Class90.aClass276_1119).aBoolean3184)
                Class7.anInt171 = (((Class276) Class90.aClass276_1119).anInt3182 + (i_54_ * (-((Class276) Class90.aClass276_1119).anInt3182 + ((Class276) Class90.aClass276_1119).anInt3181) / 100));
            if (((Class276) Class90.aClass276_1119).aBoolean3178)
                Node_Sub8_Sub19.aString9086 += Class7.anInt171 + "%";
        } else if (Class276.aClass276_3205 == Class90.aClass276_1119) {
            Class282_Sub11.aClass74_7702 = null;
            Node_Sub14_Sub15.method2318(3, -21035);
        } else {
            Node_Sub8_Sub19.aString9086 = ((Class276) class276).aClass41_3186.method301(Class191.anInt4822, (byte) -108);
            Class7.anInt171 = ((Class276) class276).anInt3181;
            if (((Class276) Class90.aClass276_1119).aBoolean3178)
                Node_Sub8_Sub19.aString9086 += ((Class276) class276).anInt3181 + "%";
            if (((Class276) Class90.aClass276_1119).aBoolean3184 || ((Class276) class276).aBoolean3184)
                Node_Sub33.aLong7200 = Class118.method1112(116);
        }
        if (Class282_Sub11.aClass74_7702 != null) {
            Class282_Sub11.aClass74_7702.method553((Node_Sub8_Sub19.aString9086), Class7.anInt171, Class90.aClass276_1119, Node_Sub33.aLong7200, -1484216776);
            if (Class346_Sub1.anInterface17Array8250 != null) {
                for (int i_55_ = Class231.anInt2608 - -1; i_55_ < Class346_Sub1.anInterface17Array8250.length; i_55_++) {
                    if ((Class346_Sub1.anInterface17Array8250[i_55_].method52(26583) ^ 0xffffffff) <= -101 && Class231.anInt2608 == i_55_ + -1 && (Class273.anInt5008 ^ 0xffffffff) <= -2 && Class282_Sub11.aClass74_7702.method552((byte) 102)) {
                        try {
                            Class346_Sub1.anInterface17Array8250[i_55_].method51((byte) -2);
                        } catch (Exception exception) {
                            Class346_Sub1.anInterface17Array8250 = null;
                            break;
                        }
                        Class282_Sub11.aClass74_7702.method547(Class346_Sub1.anInterface17Array8250[i_55_], true);
                        Class231.anInt2608++;
                        if ((Class231.anInt2608 >= (Class346_Sub1.anInterface17Array8250.length + -1)) && (Class346_Sub1.anInterface17Array8250.length ^ 0xffffffff) < -2)
                            Class231.anInt2608 = (Class90.aClass319_1181.method3316((byte) 81) ? 0 : -1);
                    }
                }
            }
        }
    }

    static final void method2897(byte i, long l) {
        if (i != -124)
            aClass151_7577 = null;
        anInt7582++;
        if ((l ^ 0xffffffffffffffffL) < -1L) {
            if ((l % 10L ^ 0xffffffffffffffffL) != -1L)
                Class24.method239((byte) 92, l);
            else {
                Class24.method239((byte) 85, -1L + l);
                Class24.method239((byte) 112, 1L);
            }
        }
    }

    public static void method2898(int i) {
        if (i != 27966)
            aClass151_7577 = null;
        aClass248_Sub8_Sub2Array7572 = null;
        aClass151_7577 = null;
    }

    final void method2885(int i, int i_56_, int i_57_) {
        if ((i_57_ ^ 0xffffffff) == -1) {
            anInt7574 = -(i_56_ < 0 ? -i_56_ : i_56_) + anInt7585;
            anInt7574 = anInt7574 * anInt7574 >> 1222771340;
            anInt7573 = 4096;
            anInt7589 = anInt7574;
        } else {
            anInt7573 = anInt7574 * anInt7583 >> 835837740;
            if ((anInt7573 ^ 0xffffffff) <= -1) {
                if (anInt7573 > 4096)
                    anInt7573 = 4096;
            } else
                anInt7573 = 0;
            anInt7574 = anInt7585 - ((i_56_ ^ 0xffffffff) > -1 ? -i_56_ : i_56_);
            anInt7574 = anInt7574 * anInt7574 >> 1435468908;
            anInt7574 = anInt7573 * anInt7574 >> 3004332;
            anInt7589 += anInt7574 * anInt7576 >> 967627500;
            anInt7576 = anInt7588 * anInt7576 >> -2088373812;
        }
        anInt7580++;
        if (i != -256)
            method2897((byte) -119, 87L);
    }

    Class279_Sub2(int i, int i_58_, int i_59_, int i_60_, int i_61_, float f, float f_62_, float f_63_) {
        super(i, i_58_, i_59_, i_60_, i_61_);
        anInt7585 = (int) (4096.0F * f_62_);
        anInt7583 = (int) (f_63_ * 4096.0F);
        anInt7576 = anInt7588 = (int) (4096.0 * Math.pow(0.5, (double) -f));
    }

    static {
        aClass248_Sub8_Sub2Array7572 = new Node_Sub8_Sub2[14];
    }
}
