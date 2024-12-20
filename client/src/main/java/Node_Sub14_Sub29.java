/* Class248_Sub14_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub29 extends Node_Sub14 {
    private int anInt9462;
    private int anInt9463 = 0;
    static int anInt9464;
    private int anInt9465 = 20;
    static IncommingOpcode aIncommingOpcode_9466 = new IncommingOpcode(34, 3);
    static int anInt9467;
    static int anInt9468;
    static boolean aBoolean9469 = false;
    private int anInt9470;
    static s[] aSArray9471;

    public Node_Sub14_Sub29() {
        super(0, true);
        anInt9462 = 1365;
        anInt9470 = 0;
    }

    final int[] method2264(byte i, int i_0_) {
        anInt9467++;
        if (i != -40)
            aIncommingOpcode_9466 = null;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_0_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff); i_1_++) {
                int i_2_ = ((Node_Sub8_Sub3.anIntArray8921[i_1_] << 221015052) / anInt9462 + anInt9463);
                int i_3_ = ((Node_Sub14_Sub3.anIntArray9184[i_0_] << -1951179220) / anInt9462 - -anInt9470);
                int i_4_ = i_2_;
                int i_5_ = i_3_;
                int i_6_ = i_2_;
                int i_7_ = i_3_;
                int i_8_ = i_2_ * i_2_ >> 1155313452;
                int i_9_ = i_3_ * i_3_ >> -1127057460;
                int i_10_;
                for (i_10_ = 0; (i_9_ + i_8_ ^ 0xffffffff) > -16385 && i_10_ < anInt9465; i_9_ = i_7_ * i_7_ >> 1180248812) {
                    i_7_ = i_5_ + (i_7_ * i_6_ >> 584329868) * 2;
                    i_6_ = i_4_ + (-i_9_ + i_8_);
                    i_10_++;
                    i_8_ = i_6_ * i_6_ >> -870544628;
                }
                is[i_1_] = (-1 + anInt9465 <= i_10_ ? 0 : (i_10_ << -583985684) / anInt9465);
            }
        }
        return is;
    }

    public static void method2361(int i) {
        aIncommingOpcode_9466 = null;
        if (i != 0)
            method2361(-80);
        aSArray9471 = null;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_11_) {
        anInt9464++;
        int i_12_ = i_11_;
        while_189_:
        do {
            while_188_:
            do {
                do {
                    if ((i_12_ ^ 0xffffffff) != -1) {
                        if ((i_12_ ^ 0xffffffff) != -2) {
                            if ((i_12_ ^ 0xffffffff) != -3) {
                                if (i_12_ != 3)
                                    break while_189_;
                            } else
                                break;
                            break while_188_;
                        }
                    } else {
                        anInt9462 = class248_sub9.readShort(-1);
                        break while_189_;
                    }
                    anInt9465 = class248_sub9.readShort(-1);
                    break while_189_;
                } while (false);
                anInt9463 = class248_sub9.readShort(-1);
                break while_189_;
            } while (false);
            anInt9470 = class248_sub9.readShort(-1);
        } while (false);
        if (i != -61)
            method2269(null, (byte) 113, 100);
    }
}
