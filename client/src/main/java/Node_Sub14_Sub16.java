/* Class248_Sub14_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub16 extends Node_Sub14 {
    static int anInt9329;
    static int anInt9330;
    static int anInt9331;
    static int anInt9332;
    static Class65 aClass65_9333;
    static int anInt9334;
    private Class54[] aClass54Array9335;
    static int anInt9336;
    static int[] anIntArray9337 = new int[25];
    static Class34 aClass34_9338;

    private final void method2321(byte i, int[][] is) {
        anInt9331++;
        int i_0_ = Class185.anInt2164;
        int i_1_ = Class250.anInt2819;
        if (i <= 97)
            aClass65_9333 = null;
        Class346_Sub7_Sub2_Sub4.method3624(4, is);
        Class178.method1594(false, 0, 0, Class226_Sub2.anInt6664, za_Sub1.anInt9802);
        if (aClass54Array9335 != null) {
            for (int i_2_ = 0; i_2_ < aClass54Array9335.length; i_2_++) {
                Class54 class54 = aClass54Array9335[i_2_];
                int i_3_ = ((Class54) class54).anInt724;
                int i_4_ = ((Class54) class54).anInt723;
                if ((i_3_ ^ 0xffffffff) > -1) {
                    if ((i_4_ ^ 0xffffffff) <= -1)
                        class54.method425(87, i_1_, i_0_);
                } else if (i_4_ < 0)
                    class54.method429(i_0_, (byte) -72, i_1_);
                else
                    class54.method427(i_0_, 2, i_1_);
            }
        }
    }

    public Node_Sub14_Sub16() {
        super(0, true);
    }

    public static void method2322(byte i) {
        if (i <= -110) {
            aClass34_9338 = null;
            anIntArray9337 = null;
            aClass65_9333 = null;
        }
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_5_) {
        if (i_5_ == 0) {
            aClass54Array9335 = new Class54[class248_sub9.readUnsignedByte((byte) -69)];
            while_105_:
            for (int i_6_ = 0; aClass54Array9335.length > i_6_; i_6_++) {
                int i_7_ = class248_sub9.readUnsignedByte((byte) 107);
                int i_8_ = i_7_;
                while_103_:
                do {
                    do {
                        if (i_8_ != 0) {
                            if ((i_8_ ^ 0xffffffff) != -2) {
                                if ((i_8_ ^ 0xffffffff) != -3) {
                                    if (i_8_ != 3)
                                        continue while_105_;
                                } else
                                    break;
                                break while_103_;
                            }
                        } else {
                            aClass54Array9335[i_6_] = Class340_Sub3.method3452(126, class248_sub9);
                            continue while_105_;
                        }
                        aClass54Array9335[i_6_] = Class298.method3168(class248_sub9, -124);
                        continue while_105_;
                    } while (false);
                    aClass54Array9335[i_6_] = Class227.method1824((byte) -100, class248_sub9);
                    continue while_105_;
                } while (false);
                aClass54Array9335[i_6_] = Node_Sub2_Sub4.method2001(-126, class248_sub9);
            }
        } else if (i_5_ == 1)
            ((Node_Sub14) this).aBoolean6988 = class248_sub9.readUnsignedByte((byte) -81) == 1;
        if (i != -61)
            method2322((byte) -61);
        anInt9329++;
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9334++;
        if (bool != true)
            anInt9330 = 76;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int i_9_ = Class185.anInt2164;
            int i_10_ = Class250.anInt2819;
            int[][] is_11_ = new int[i_10_][i_9_];
            int[][][] is_12_ = ((Node_Sub14) this).aClass367_6981.method3832(-23295);
            method2321((byte) 114, is_11_);
            for (int i_13_ = 0; Class250.anInt2819 > i_13_; i_13_++) {
                int[] is_14_ = is_11_[i_13_];
                int[][] is_15_ = is_12_[i_13_];
                int[] is_16_ = is_15_[0];
                int[] is_17_ = is_15_[1];
                int[] is_18_ = is_15_[2];
                for (int i_19_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++) {
                    int i_20_ = is_14_[i_19_];
                    is_18_[i_19_] = Class112.method794(i_20_ << -1433475964, 4080);
                    is_17_[i_19_] = Class112.method794(4080, i_20_ >> -2132639388);
                    is_16_[i_19_] = Class112.method794(i_20_, 16711680) >> -216494004;
                }
            }
        }
        return is;
    }

    static final byte[] method2323(int i, byte[] is, byte i_21_) {
        int i_22_ = -126 / ((-11 - i_21_) / 39);
        anInt9336++;
        byte[] is_23_ = new byte[i];
        Class159.method1402(is, 0, is_23_, 0, i);
        return is_23_;
    }

    final int[] method2264(byte i, int i_24_) {
        anInt9332++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_24_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564)
            method2321((byte) 106, ((Node_Sub14) this).aClass227_6993.method1819((byte) -105));
        if (i != -40)
            anIntArray9337 = null;
        return is;
    }

    static {
        aClass65_9333 = new Class65(16);
        aClass34_9338 = new Class34();
    }
}
