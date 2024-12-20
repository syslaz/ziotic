/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class165 implements Interface11 {
    String aString4957;
    static int anInt4958;
    int anInt4959;
    int anInt4960;
    int anInt4961;
    Class272 aClass272_4962;
    int anInt4963;
    int anInt4964;
    int anInt4965;
    static Object anObject4966;
    Class186 aClass186_4967;
    int anInt4968;
    static int anInt4969;
    int anInt4970;
    int anInt4971;
    int anInt4972;

    public static void method1532(boolean bool) {
        if (bool == true)
            anObject4966 = null;
    }

    static final byte[] method1533(byte[] is, int i) {
        anInt4958++;
        ByteStream class248_sub9 = new ByteStream(is);
        if (i != 22047)
            method1533(null, -109);
        int i_0_ = class248_sub9.readUnsignedByte((byte) 100);
        int i_1_ = class248_sub9.readInt(false);
        if ((i_1_ ^ 0xffffffff) > -1 || ((Class272.anInt3169 ^ 0xffffffff) != -1 && (Class272.anInt3169 ^ 0xffffffff) > (i_1_ ^ 0xffffffff)))
            throw new RuntimeException();
        if ((i_0_ ^ 0xffffffff) != -1) {
            int i_2_ = class248_sub9.readInt(false);
            if (i_2_ < 0 || ((Class272.anInt3169 ^ 0xffffffff) != -1 && (Class272.anInt3169 ^ 0xffffffff) > (i_2_ ^ 0xffffffff)))
                throw new RuntimeException();
            byte[] is_3_ = new byte[i_2_];
            if ((i_0_ ^ 0xffffffff) != -2) {
                synchronized (Node_Sub2_Sub2.aClass138_8842) {
                    Node_Sub2_Sub2.aClass138_8842.method1276(class248_sub9, is_3_, 116);
                }
            } else
                Class306.method3221(is_3_, i_2_, is, i_1_, 9);
            return is_3_;
        }
        byte[] is_4_ = new byte[i_1_];
        class248_sub9.method2189(is_4_, 0, i_1_, i + -21966);
        return is_4_;
    }

    public final Class208 method35(byte i) {
        anInt4969++;
        if (i != 62)
            return null;
        return Class276.aClass208_3207;
    }

    Class165(String string, Class186 class186, Class272 class272, int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
        ((Class165) this).aClass186_4967 = class186;
        ((Class165) this).anInt4964 = i_10_;
        ((Class165) this).anInt4968 = i_7_;
        ((Class165) this).aClass272_4962 = class272;
        ((Class165) this).anInt4965 = i;
        ((Class165) this).anInt4971 = i_8_;
        ((Class165) this).anInt4961 = i_9_;
        ((Class165) this).anInt4960 = i_12_;
        ((Class165) this).anInt4970 = i_5_;
        ((Class165) this).anInt4959 = i_13_;
        ((Class165) this).aString4957 = string;
        ((Class165) this).anInt4963 = i_6_;
        ((Class165) this).anInt4972 = i_11_;
    }
}
