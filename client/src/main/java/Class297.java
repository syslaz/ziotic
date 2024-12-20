/* Class297 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class297 implements Interface11 {
    static int anInt5009;
    static int anInt5010;
    Class272 aClass272_5011;
    int anInt5012;
    static int anInt5013;
    int anInt5014;
    static int anInt5015;
    Class186 aClass186_5016;
    static int anInt5017;
    static int anInt5018;
    static int anInt5019;
    int anInt5020;

    public Class208 method35(byte i) {
        anInt5018++;
        if (i != 62)
            method3136(113, -127, -128);
        return Class94.aClass208_1224;
    }

    static final Class79[] method3134(byte i) {
        if (i != 114)
            anInt5010 = 30;
        anInt5013++;
        return new Class79[]{za.aClass79_7487, Class246.aClass79_2757, Class260.aClass79_2965};
    }

    Class297(int i, Class186 class186, Class272 class272, int i_0_, int i_1_) {
        ((Class297) this).aClass186_5016 = class186;
        ((Class297) this).anInt5012 = i_0_;
        ((Class297) this).anInt5020 = i;
        ((Class297) this).aClass272_5011 = class272;
        ((Class297) this).anInt5014 = i_1_;
    }

    static final void method3135(int i, int i_2_) {
        anInt5015++;
        if (i_2_ == -32204) {
            Node_Sub8_Sub10 class248_sub8_sub10 = method3136(i, -874792672, 9);
            class248_sub8_sub10.method2076(-60);
        }
    }

    static final Node_Sub8_Sub10 method3136(int i, int i_3_, int i_4_) {
        anInt5017++;
        if (i_3_ != -874792672)
            anInt5010 = 45;
        Node_Sub8_Sub10 class248_sub8_sub10 = ((Node_Sub8_Sub10) Node_Sub8.aClass65_6873.method501(((long) i | ((long) i_4_ << -874792672)), (byte) 31));
        if (class248_sub8_sub10 == null) {
            class248_sub8_sub10 = new Node_Sub8_Sub10(i_4_, i);
            Node_Sub8.aClass65_6873.method509(-1, class248_sub8_sub10, (((Node) class248_sub8_sub10).id));
        }
        return class248_sub8_sub10;
    }
}
