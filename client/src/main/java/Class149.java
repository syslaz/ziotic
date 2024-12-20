/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class149 {
    Node_Sub8_Sub18 aClass248_Sub8_Sub18_1743;
    String[] aStringArray1744;
    static OutgoingOpcode aOutgoingOpcode_1745 = new OutgoingOpcode(41, 8);
    static int anInt1746;
    static int anInt1747;
    int[] anIntArray1748;
    int anInt1749 = -1;
    static int anInt1750;

    static final void method1331(int i, int i_0_, int i_1_, int[] is, int i_2_) {
        anInt1746++;
        i_1_--;
        if (i_0_ <= -47) {
            int i_3_ = -7 + --i_2_;
            while (i_1_ < i_3_) {
                is[++i_1_] = i;
                is[++i_1_] = i;
                is[++i_1_] = i;
                is[++i_1_] = i;
                is[++i_1_] = i;
                is[++i_1_] = i;
                is[++i_1_] = i;
                is[++i_1_] = i;
            }
            while (i_2_ > i_1_)
                is[++i_1_] = i;
        }
    }

    static final int method1332(int i, int i_4_, byte i_5_) {
        anInt1747++;
        int i_6_ = 1;
        int i_7_ = 113 / ((23 - i_5_) / 52);
        for (/**/; (i_4_ ^ 0xffffffff) < -2; i_4_ >>= 1) {
            if ((i_4_ & 0x1 ^ 0xffffffff) != -1)
                i_6_ *= i;
            i *= i;
        }
        if (i_4_ == 1)
            return i_6_ * i;
        return i_6_;
    }

    static final void method1333(int i) {
        anInt1750++;
        if (Class90.aClass276_1119 != null) {
            Class282_Sub11.aClass74_7702 = new Class74();
            if (i != 1)
                method1333(64);
            Class282_Sub11.aClass74_7702.method553(((Class276) Class90.aClass276_1119).aClass41_3174.method301(Class191.anInt4822, (byte) -108), ((Class276) Class90.aClass276_1119).anInt3182, Class90.aClass276_1119, Node_Sub33.aLong7200, -1484216776);
            Node_Sub29.aThread7170 = new Thread(Class282_Sub11.aClass74_7702, "");
            Node_Sub29.aThread7170.start();
        }
    }

    public static void method1334(int i) {
        aOutgoingOpcode_1745 = null;
        if (i != 1)
            method1333(52);
    }
}
