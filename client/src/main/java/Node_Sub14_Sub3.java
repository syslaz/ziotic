/* Class248_Sub14_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub3 extends Node_Sub14 {
    static int anInt9178;
    static IncommingOpcode aIncommingOpcode_9179;
    private int anInt9180 = 0;
    static int anInt9181;
    static int anInt9182 = 0;
    static Class381 aClass381_9183;
    static int[] anIntArray9184;
    private int anInt9185 = 4096;
    static Class129[] aClass129Array9186;

    public static void method2284(int i) {
        anIntArray9184 = null;
        aIncommingOpcode_9179 = null;
        aClass129Array9186 = null;
        if (i != 4521)
            aClass129Array9186 = null;
        aClass381_9183 = null;
    }

    final int[] method2264(byte i, int i_0_) {
        anInt9181++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_0_, true);
        if (i != -40)
            method2284(-64);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int[] is_1_ = this.method2265((byte) 64, i_0_, 0);
            for (int i_2_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
                int i_3_ = is_1_[i_2_];
                is[i_2_] = i_3_ < anInt9180 || i_3_ > anInt9185 ? 0 : 4096;
            }
        }
        return is;
    }

    public Node_Sub14_Sub3() {
        super(1, true);
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_4_) {
        int i_5_ = i_4_;
        do {
            if ((i_5_ ^ 0xffffffff) != -1) {
                if ((i_5_ ^ 0xffffffff) != -2)
                    break;
            } else {
                anInt9180 = class248_sub9.readShort(-1);
                break;
            }
            anInt9185 = class248_sub9.readShort(-1);
        } while (false);
        anInt9178++;
        if (i != -61)
            aClass129Array9186 = null;
    }

    static {
        aIncommingOpcode_9179 = new IncommingOpcode(94, -2);
    }
}
