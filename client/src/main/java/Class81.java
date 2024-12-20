/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class81 implements Interface10 {
    static int anInt4903;
    static int anInt4904;
    static int anInt4905;
    static int anInt4906;
    static Class181 aClass181_4907;
    static int anInt4908 = -1;
    private Class381 aClass381_4909;
    Class129 aClass129_4910;
    Class297 aClass297_4911;
    static int anInt4912;
    static int anInt4913;
    static int anInt4914;

    public void method32(boolean bool, byte i) {
        if (i <= -60) {
            anInt4912++;
            if (bool) {
                int i_0_ = ((((Class297) ((Class81) this).aClass297_4911).aClass186_5016.method1628(((Class81) this).aClass129_4910.method1169(), 0, Class226_Sub1.anInt6661)) - -(((Class297) ((Class81) this).aClass297_4911).anInt5012));
                int i_1_ = ((((Class297) ((Class81) this).aClass297_4911).aClass272_5011.method2838((byte) 98, s_Sub2.anInt7946, ((Class81) this).aClass129_4910.method1181())) + (((Class297) ((Class81) this).aClass297_4911).anInt5014));
                ((Class81) this).aClass129_4910.method1168(i_0_, i_1_);
            }
        }
    }

    public final void method34(byte i) {
        ((Class81) this).aClass129_4910 = Node_Sub8_Sub3.method2043((((Class297) ((Class81) this).aClass297_4911).anInt5020), aClass381_4909, true);
        if (i < 34)
            anInt4908 = -55;
        anInt4906++;
    }

    static final void method585(int i, int i_2_, int i_3_) {
        if (i > -82)
            method586((byte) -93);
        anInt4903++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(0, -874792672, 15);
        class248_sub8_sub10.method2084(614);
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976 = i_3_;
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983 = i_2_;
    }

    Class81(Class381 class381, Class297 class297) {
        ((Class81) this).aClass297_4911 = class297;
        aClass381_4909 = class381;
    }

    public final boolean method33(int i) {
        if (i != 5618)
            return true;
        anInt4904++;
        return aClass381_4909.method3920((((Class297) ((Class81) this).aClass297_4911).anInt5020), 107);
    }

    static final int method586(byte i) {
        anInt4914++;
        int i_4_ = 124 / ((i - 23) / 62);
        if ((double) Class116.aFloat1448 == 3.0)
            return 37;
        if ((double) Class116.aFloat1448 == 4.0)
            return 50;
        if ((double) Class116.aFloat1448 == 6.0)
            return 75;
        if ((double) Class116.aFloat1448 == 8.0)
            return 100;
        return 200;
    }

    public static void method587(int i) {
        aClass181_4907 = null;
        if (i != -29864)
            method585(19, 2, -51);
    }

    static {
        aClass181_4907 = new Class181();
    }
}
