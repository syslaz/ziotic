/* Class248_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub23 extends Node {
    int anInt7083 = 2147483647;
    int anInt7084 = 2147483647;
    int anInt7085;
    static int anInt7086;
    int anInt7087;
    Node_Sub35 aClass248_Sub35_7088;
    static int anInt7089;
    int anInt7090 = -2147483648;
    int anInt7091;
    int anInt7092;
    static float aFloat7093;
    int anInt7094;
    static int[] anIntArray7095 = new int[13];
    static int anInt7096;
    static int anInt7097;

    static final void method2538(byte i, double d) {
        Class333.aViewport_3895.method1868(Node_Sub14_Sub30.aViewport_9479);
        if (i >= -48)
            anIntArray7095 = null;
        anInt7086++;
        Class333.aViewport_3895.method1862(0, 0, (int) d);
        Class301.aHa4933.a(Class333.aViewport_3895);
    }

    static final void method2539(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt7096++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_2_, i_3_ + -874773694, 10);
        class248_sub8_sub10.method2084(i_3_ ^ ~0x4847);
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8981 = i;
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983 = i_0_;
        if (i_3_ != -18978)
            anIntArray7095 = null;
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976 = i_1_;
    }

    public static void method2540(byte i) {
        if (i != -19)
            anIntArray7095 = null;
        anIntArray7095 = null;
    }

    final boolean method2541(int i, int i_4_, int i_5_) {
        anInt7097++;
        if (i_5_ <= 18)
            return false;
        if (((Node_Sub23) this).anInt7083 <= i && (i ^ 0xffffffff) >= (((Node_Sub23) this).anInt7087 ^ 0xffffffff) && i_4_ >= ((Node_Sub23) this).anInt7084 && ((Node_Sub23) this).anInt7090 >= i_4_)
            return true;
        if (((Node_Sub23) this).anInt7092 <= i && ((((Node_Sub23) this).anInt7091 ^ 0xffffffff) <= (i ^ 0xffffffff)) && (i_4_ ^ 0xffffffff) <= (((Node_Sub23) this).anInt7085 ^ 0xffffffff) && ((Node_Sub23) this).anInt7094 >= i_4_)
            return true;
        return false;
    }

    Node_Sub23(Node_Sub35 class248_sub35) {
        ((Node_Sub23) this).anInt7087 = -2147483648;
        ((Node_Sub23) this).anInt7085 = 2147483647;
        ((Node_Sub23) this).anInt7091 = -2147483648;
        ((Node_Sub23) this).anInt7092 = 2147483647;
        ((Node_Sub23) this).anInt7094 = -2147483648;
        ((Node_Sub23) this).aClass248_Sub35_7088 = class248_sub35;
    }
}
