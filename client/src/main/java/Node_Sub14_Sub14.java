/* Class248_Sub14_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub14 extends Node_Sub14 {
    static int anInt9303;
    static String[] aStringArray9304 = new String[8];
    static Class2[] aClass2Array9305;
    static String aString9306;
    static int anInt9307;

    final int[] method2264(byte i, int i_0_) {
        if (i != -40)
            method2315((byte) 108, null);
        anInt9303++;
        return Node_Sub8_Sub3.anIntArray8921;
    }

    public Node_Sub14_Sub14() {
        super(0, true);
    }

    static final Node_Sub14 method2315(byte i, ByteStream class248_sub9) {
        anInt9307++;
        class248_sub9.readUnsignedByte((byte) 99);
        int i_1_ = class248_sub9.readUnsignedByte((byte) -85);
        Node_Sub14 class248_sub14 = Node_Sub14_Sub7.method2295(128, i_1_);
        ((Node_Sub14) class248_sub14).anInt6989 = class248_sub9.readUnsignedByte((byte) 72);
        int i_2_ = class248_sub9.readUnsignedByte((byte) -95);
        if (i < 98)
            return null;
        for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
            int i_4_ = class248_sub9.readUnsignedByte((byte) 108);
            class248_sub14.method2269(class248_sub9, (byte) -61, i_4_);
        }
        class248_sub14.method2263(8351);
        return class248_sub14;
    }

    public static void method2316(int i) {
        if (i == 0) {
            aString9306 = null;
            aStringArray9304 = null;
            aClass2Array9305 = null;
        }
    }
}
