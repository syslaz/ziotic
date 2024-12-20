/* Class248_Sub8_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub7 extends Node_Sub8 {
    static int anInt8954;
    static int anInt8955;
    private Class65 aClass65_8956;
    static int anInt8957;
    static Class27 aClass27_8958 = new Class27(true);
    static int anInt8959;
    static int anInt8960;
    static int anInt8961;

    public Node_Sub8_Sub7() {
        /* empty */
    }

    final void method2064(int i, ByteStream class248_sub9) {
        anInt8957++;
        for (; ; ) {
            int i_0_ = class248_sub9.readUnsignedByte((byte) 77);
            if (i_0_ == 0)
                break;
            method2066(0, class248_sub9, i_0_);
        }
        if (i != -2)
            method2068(-110, -58, -26);
    }

    static final void method2065(byte i) {
        anInt8961++;
        int i_1_ = 0;
        int i_2_ = 0;
        int i_3_ = 91 / ((1 - i) / 54);
        for (/**/; (i_2_ ^ 0xffffffff) > (Node_Sub8_Sub4.anInt8360 ^ 0xffffffff); i_2_++) {
            for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (Node_Sub22.anInt7074 ^ 0xffffffff); i_4_++) {
                if (Class346_Sub10.method3720(i_1_, i_4_, true, i_2_, (Class311.aClass137ArrayArrayArray3620), 0))
                    i_1_++;
                if (i_1_ >= 512)
                    return;
            }
        }
    }

    private final void method2066(int i, ByteStream class248_sub9, int i_5_) {
        anInt8959++;
        if (i == 0) {
            if (i_5_ == 249) {
                int i_6_ = class248_sub9.readUnsignedByte((byte) -46);
                if (aClass65_8956 == null) {
                    int i_7_ = Class136_Sub4.method1269(i_6_, (byte) -128);
                    aClass65_8956 = new Class65(i_7_);
                }
                for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_8_++) {
                    boolean bool = ((class248_sub9.readUnsignedByte((byte) -74) ^ 0xffffffff) == -2);
                    int i_9_ = class248_sub9.method2221(255);
                    Node node;
                    if (!bool)
                        node = new Node_Sub37(class248_sub9.readInt(false));
                    else
                        node = new Node_Sub32(class248_sub9.readString(15598));
                    aClass65_8956.method509(-1, node, (long) i_9_);
                }
            }
        }
    }

    final String method2067(int i, byte i_10_, String string) {
        anInt8960++;
        if (aClass65_8956 == null)
            return string;
        if (i_10_ >= -47)
            aClass27_8958 = null;
        Node_Sub32 class248_sub32 = (Node_Sub32) aClass65_8956.method501((long) i, (byte) 31);
        if (class248_sub32 == null)
            return string;
        return ((Node_Sub32) class248_sub32).aString7195;
    }

    static final void method2068(int i, int i_11_, int i_12_) {
        Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_11_][i_12_];
        if (class137 != null) {
            aa_Sub2.method164(((Class137) class137).aClass346_Sub7_Sub1_1644);
            aa_Sub2.method164(((Class137) class137).aClass346_Sub7_Sub1_1642);
            if (((Class137) class137).aClass346_Sub7_Sub1_1644 != null)
                ((Class137) class137).aClass346_Sub7_Sub1_1644 = null;
            if (((Class137) class137).aClass346_Sub7_Sub1_1642 != null)
                ((Class137) class137).aClass346_Sub7_Sub1_1642 = null;
        }
    }

    static final void method2069(int i) {
        if (i != -15074)
            method2068(-109, 61, -5);
        Node_Sub14_Sub15.method2318(11, i + -5961);
        anInt8954++;
        Class375.method3879(i ^ 0x3a9f);
        System.gc();
    }

    public static void method2070(boolean bool) {
        if (bool != false)
            aClass27_8958 = null;
        aClass27_8958 = null;
    }

    final int method2071(int i, int i_13_, int i_14_) {
        anInt8955++;
        if (aClass65_8956 == null)
            return i;
        Node_Sub37 class248_sub37 = ((Node_Sub37) aClass65_8956.method501((long) i_14_, (byte) 31));
        if (i_13_ != 0)
            method2066(-59, null, 85);
        if (class248_sub37 == null)
            return i;
        return ((Node_Sub37) class248_sub37).anInt7261;
    }
}
