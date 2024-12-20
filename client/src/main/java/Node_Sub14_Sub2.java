/* Class248_Sub14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub2 extends Node_Sub14 {
    static int anInt9174;
    static Class278 aClass278_9175 = new Class278(260);
    static int anInt9176;
    static int[] anIntArray9177 = new int[250];

    static final void method2282(boolean bool, int i) {
        if (bool != false)
            anIntArray9177 = null;
        anInt9176++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i, -874792672, 8);
        class248_sub8_sub10.method2076(-87);
    }

    public static void method2283(int i) {
        aClass278_9175 = null;
        if (i == 0)
            anIntArray9177 = null;
    }

    final int[] method2264(byte i, int i_0_) {
        anInt9174++;
        if (i != -40)
            method2283(75);
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_0_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int[][] is_1_ = this.method2267(i_0_, 0, 65535);
            int[] is_2_ = is_1_[0];
            int[] is_3_ = is_1_[1];
            int[] is_4_ = is_1_[2];
            for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff); i_5_++)
                is[i_5_] = (is_4_[i_5_] + (is_3_[i_5_] + is_2_[i_5_])) / 3;
        }
        return is;
    }

    public Node_Sub14_Sub2() {
        super(1, true);
    }
}
