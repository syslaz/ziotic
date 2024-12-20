/* Class248_Sub14_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub22 extends Node_Sub14 {
    static int[] anIntArray9384 = new int[8];
    static int anInt9385;
    static int anInt9386;
    private int anInt9387;
    private int anInt9388;
    static int anInt9389;
    static int anInt9390;
    static int anInt9391;
    private int anInt9392 = 0;
    static int anInt9393;

    final void method2263(int i) {
        s_Sub3.method3164(true);
        anInt9385++;
        if (i != 8351)
            anInt9387 = 80;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_0_) {
        anInt9393++;
        int i_1_ = i_0_;
        while_167_:
        do {
            do {
                if ((i_1_ ^ 0xffffffff) != -1) {
                    if ((i_1_ ^ 0xffffffff) != -2) {
                        if ((i_1_ ^ 0xffffffff) == -4)
                            break;
                        break while_167_;
                    }
                } else {
                    anInt9392 = class248_sub9.readUnsignedByte((byte) 127);
                    break while_167_;
                }
                anInt9388 = class248_sub9.readUnsignedByte((byte) 100);
                break while_167_;
            } while (false);
            anInt9387 = class248_sub9.readUnsignedByte((byte) -96);
        } while (false);
        if (i != -61)
            method2263(-47);
    }

    public Node_Sub14_Sub22() {
        super(0, true);
        anInt9387 = 1;
        anInt9388 = 0;
    }

    static final void method2341(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        Node_Sub19.anInt7038 = i_6_;
        if (i_3_ != 1)
            anIntArray9384 = null;
        Class262.anInt2979 = i_2_;
        Node_Sub8_Sub12.anInt9008 = i_4_;
        Class38.anInt414 = i;
        Class282_Sub19.anInt7786 = i_5_;
        Class114.anInt1423 = i_7_;
        anInt9386++;
    }

    public static void method2342(byte i) {
        anIntArray9384 = null;
        if (i != 117)
            anIntArray9384 = null;
    }

    final int[] method2264(byte i, int i_8_) {
        anInt9391++;
        if (i != -40)
            method2263(-82);
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_8_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int i_9_ = Node_Sub14_Sub3.anIntArray9184[i_8_];
            int i_10_ = i_9_ - 2048 >> -2110381023;
            for (int i_11_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
                int i_12_ = Node_Sub8_Sub3.anIntArray8921[i_11_];
                int i_13_ = i_12_ - 2048 >> 644019041;
                int i_14_;
                if (anInt9392 == 0)
                    i_14_ = anInt9387 * (i_12_ - i_9_);
                else {
                    int i_15_ = i_13_ * i_13_ + i_10_ * i_10_ >> -565676532;
                    i_14_ = (int) (Math.sqrt((double) ((float) i_15_ / 4096.0F)) * 4096.0);
                    i_14_ = (int) ((double) (anInt9387 * i_14_) * 3.141592653589793);
                }
                i_14_ -= i_14_ & ~0xfff;
                if ((anInt9388 ^ 0xffffffff) != -1) {
                    if (anInt9388 == 2) {
                        i_14_ -= 2048;
                        if (i_14_ < 0)
                            i_14_ = -i_14_;
                        i_14_ = 2048 + -i_14_ << -596449055;
                    }
                } else
                    i_14_ = (Class264.anIntArray2992[i_14_ >> 1971601156 & 0xff] - -4096) >> 1242848737;
                is[i_11_] = i_14_;
            }
        }
        return is;
    }

    static final int method2343(int i) {
        anInt9390++;
        int i_16_ = Class90.aClass276_1119.method2854(4);
        if ((i_16_ ^ 0xffffffff) > (Class347.aClass276Array4131.length - 1 ^ 0xffffffff))
            Class90.aClass276_1119 = Class347.aClass276Array4131[i_16_ + 1];
        if (i >= -31)
            anIntArray9384 = null;
        return 100;
    }

    static final void method2344(int i) {
        if (i == 4096) {
            anInt9389++;
            if (((Class174) Node_Sub14_Sub15.aClass174_9328).aBoolean2039 && ((WorldAddress) Class307.aWorldAddress_3551).worldId != -1)
                Node_Sub14_Sub17.method2327((byte) -95, ((WorldAddress) Class307.aWorldAddress_3551).address, ((WorldAddress) Class307.aWorldAddress_3551).worldId);
        }
    }
}
