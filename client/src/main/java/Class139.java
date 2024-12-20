/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class139 {
    static int anInt1656;
    static IncommingOpcode aIncommingOpcode_1657 = new IncommingOpcode(4, 1);
    static int anInt1658;
    static int anInt1659;
    static Class381 aClass381_1660;

    public static void method1277(int i) {
        aClass381_1660 = null;
        aIncommingOpcode_1657 = null;
        if (i != 14205)
            method1278('}', -34);
    }

    static final int method1278(char c, int i) {
        if (i != 5041)
            aIncommingOpcode_1657 = null;
        anInt1658++;
        if (c >= 0 && (c ^ 0xffffffff) > (Class172.anIntArray1996.length ^ 0xffffffff))
            return Class172.anIntArray1996[c];
        return -1;
    }

    static final Node_Sub36 method1279(byte i) {
        anInt1659++;
        if ((Class377.anInt4628 ^ 0xffffffff) == -1)
            return new Node_Sub36();
        if (i != -62)
            return null;
        return Class279.aClass248_Sub36Array3243[--Class377.anInt4628];
    }

    static final int method1280(float f, float f_0_, float f_1_, byte i) {
        anInt1656++;
        float f_2_ = !(f < 0.0F) ? f : -f;
        float f_3_ = f_0_ < 0.0F ? -f_0_ : f_0_;
        if (i != 49)
            method1277(-27);
        float f_4_ = f_1_ < 0.0F ? -f_1_ : f_1_;
        if (f_3_ > f_2_ && f_3_ > f_4_) {
            if (!(f_0_ > 0.0F))
                return 1;
            return 0;
        }
        if (f_4_ > f_2_ && f_4_ > f_3_) {
            if (f_1_ > 0.0F)
                return 2;
            return 3;
        }
        if (!(f > 0.0F))
            return 5;
        return 4;
    }
}
