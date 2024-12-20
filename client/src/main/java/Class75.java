/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class75 {
    static int anInt972;
    int[] anIntArray973;
    int[] anIntArray974;
    static int[] anIntArray975;
    int[] anIntArray976;
    static int anInt977;
    static boolean aBoolean978 = false;
    float[][] aFloatArrayArray979;

    static final void method557(boolean bool, int i) {
        if (i != 4734)
            aBoolean978 = true;
        Node_Sub11.aViewport_6952.method1868(Class301.aHa4933.t());
        anInt972++;
        int[] is = Class301.aHa4933.Y();
        Class102.anInt1302 = is[3];
        ObjectDefinition.anInt3017 = is[1];
        Node_Sub8_Sub19.anInt9080 = is[2];
        Class376.anInt4948 = is[0];
        if (!bool) {
            Class301.aHa4933.DA(Class127.anInt1564, Node_Sub14_Sub21.anInt9382, Class282_Sub21.anInt7815, Node_Sub14_Sub35.anInt9541);
            Node_Sub23.method2538((byte) -115, Class237.aDouble2638);
        } else {
            Class301.aHa4933.DA(Class136_Sub1.anInt8383, Class346_Sub10.anInt8357, Class258.anInt2953, Class346_Sub7_Sub5.anInt9960);
            Node_Sub23.method2538((byte) -94, Class82.aDouble1028);
        }
    }

    public static void method558(byte i) {
        anIntArray975 = null;
        if (i != -125)
            anInt977 = -61;
    }

    Class75(int[] is, int[] is_0_, int[] is_1_, float[][] fs) {
        ((Class75) this).anIntArray973 = is_0_;
        ((Class75) this).aFloatArrayArray979 = fs;
        ((Class75) this).anIntArray974 = is;
        ((Class75) this).anIntArray976 = is_1_;
    }

    static {
        anInt977 = 64;
    }
}
