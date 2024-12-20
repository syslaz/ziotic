/* Class248_Sub14_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub5 extends Node_Sub14 {
    static int anInt9199;
    static Viewport aViewport_9200;
    static IncommingOpcode aIncommingOpcode_9201 = new IncommingOpcode(50, -2);
    static int anInt9202;
    static int anInt9203;
    private int anInt9204 = 4096;
    static long aLong9205;
    static short aShort9206 = 320;
    static int anInt9207;
    static int anInt9208 = 0;
    static Class316 aClass316_9209;

    static final void method2288(boolean bool) {
        if (bool != true)
            method2289(-110, -113, null);
        anInt9202++;
        if ((Node_Sub11_Sub1.anInt9135 ^ 0xffffffff) != 0) {
            Class73.method541(-1, false, -2753, Node_Sub11_Sub1.anInt9135, -1);
            Node_Sub11_Sub1.anInt9135 = -1;
        }
    }

    static final void method2289(int i, int i_0_, String string) {
        if (i_0_ == 31663) {
            anInt9207++;
            Class216.method1740(0, string, "", (byte) -15, "", "", i);
        }
    }

    public Node_Sub14_Sub5() {
        super(1, true);
    }

    final int[] method2264(byte i, int i_1_) {
        anInt9199++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_1_, true);
        if (i != -40)
            aShort9206 = (short) -27;
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int[] is_2_ = this.method2265((byte) 64, i_1_ - 1 & za_Sub1.anInt9802, 0);
            int[] is_3_ = this.method2265((byte) 64, i_1_, 0);
            int[] is_4_ = this.method2265((byte) 64, 1 + i_1_ & za_Sub1.anInt9802, 0);
            for (int i_5_ = 0; Class185.anInt2164 > i_5_; i_5_++) {
                int i_6_ = anInt9204 * (is_4_[i_5_] + -is_2_[i_5_]);
                int i_7_ = (anInt9204 * (is_3_[Class226_Sub2.anInt6664 & 1 + i_5_] + -is_3_[-1 + i_5_ & Class226_Sub2.anInt6664]));
                int i_8_ = i_7_ >> -1097680596;
                int i_9_ = i_6_ >> 139554316;
                int i_10_ = i_8_ * i_8_ >> -9886836;
                int i_11_ = i_9_ * i_9_ >> 2121751116;
                int i_12_ = (int) (Math.sqrt((double) ((float) (4096 + (i_11_ + i_10_)) / 4096.0F)) * 4096.0);
                int i_13_ = i_12_ != 0 ? 16777216 / i_12_ : 0;
                is[i_5_] = -i_13_ + 4096;
            }
        }
        return is;
    }

    public static void method2290(int i) {
        aViewport_9200 = null;
        if (i == 19706) {
            aIncommingOpcode_9201 = null;
            aClass316_9209 = null;
        }
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_14_) {
        if (i_14_ == 0)
            anInt9204 = class248_sub9.readShort(-1);
        anInt9203++;
        if (i != -61)
            anInt9204 = -68;
    }
}
