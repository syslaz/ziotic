/* Class301_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class301_Sub3 extends Class301 {
    private Class129 aClass129_8436;
    private Class129 aClass129_8437;
    private Class129 aClass129_8438;
    private Class129 aClass129_8439;
    static int anInt8440;
    static int anInt8441;
    static int anInt8442;
    static OutgoingOpcode aOutgoingOpcode_8443 = new OutgoingOpcode(45, 18);
    static int anInt8444;
    Class129 aClass129_8445;
    static OutgoingOpcode aOutgoingOpcode_8446 = new OutgoingOpcode(11, 2);
    private Class129 aClass129_8447;
    static Class128 aClass128_8448 = new Class128(12, 8);
    static int anInt8449;
    static IncommingOpcode aIncommingOpcode_8450 = new IncommingOpcode(80, 1);

    final void method3182(int i, int i_0_, int i_1_, boolean bool) {
        anInt8449++;
        int i_2_ = i + aClass129_8447.method1169();
        int i_3_ = i + (((Class225) ((Class301) this).aClass225_4932).anInt5000 - aClass129_8437.method1169());
        int i_4_ = aClass129_8436.method1181() + i_1_;
        int i_5_ = (i_1_ - -((Class225) ((Class301) this).aClass225_4932).anInt5002 - aClass129_8439.method1181());
        int i_6_ = i_3_ - i_2_;
        int i_7_ = -i_4_ + i_5_;
        int i_8_ = i_6_ * this.method3184((byte) -36) / 10000;
        int[] is = new int[4];
        Class287.aHa3381.K(is);
        Class287.aHa3381.KA(i_2_, i_4_, i_8_ + i_2_, i_5_);
        method3193(-3832, i_4_, i_7_, i_6_, i_2_);
        Class287.aHa3381.KA(i_2_ - -i_8_, i_4_, i_3_, i_5_);
        aClass129_8438.method1182(i_2_, i_4_, i_6_, i_7_);
        Class287.aHa3381.KA(is[0], is[1], is[i_0_], is[3]);
    }

    public final boolean method33(int i) {
        anInt8442++;
        if (!super.method33(i))
            return false;
        Class225_Sub1 class225_sub1 = (Class225_Sub1) ((Class301) this).aClass225_4932;
        if (!((Class301) this).aClass381_4926.method3920(((Class225_Sub1) class225_sub1).anInt8459, -62))
            return false;
        if (!((Class301) this).aClass381_4926.method3920(((Class225_Sub1) class225_sub1).anInt8461, 61))
            return false;
        if (!((Class301) this).aClass381_4926.method3920((((Class225_Sub1) class225_sub1).anInt8455), i + -5533))
            return false;
        if (!((Class301) this).aClass381_4926.method3920(((Class225_Sub1) class225_sub1).anInt8462, -98))
            return false;
        if (!((Class301) this).aClass381_4926.method3920((((Class225_Sub1) class225_sub1).anInt8453), i ^ 0x15ac))
            return false;
        if (!((Class301) this).aClass381_4926.method3920(((Class225_Sub1) class225_sub1).anInt8452, 94))
            return false;
        return true;
    }

    Class301_Sub3(Class381 class381, Class381 class381_9_, Class225_Sub1 class225_sub1) {
        super(class381, class381_9_, (Class225) class225_sub1);
    }

    void method3193(int i, int i_10_, int i_11_, int i_12_, int i_13_) {
        if (i == -3832) {
            ((Class301_Sub3) this).aClass129_8445.method1182(i_13_, i_10_, i_12_, i_11_);
            anInt8444++;
        }
    }

    final void method3185(int i, int i_14_, boolean bool, int i_15_) {
        if (bool) {
            int[] is = new int[4];
            Class287.aHa3381.K(is);
            Class287.aHa3381.KA(i_15_, i, i_15_ + (((Class225) ((Class301) this).aClass225_4932).anInt5000), (((Class225) ((Class301) this).aClass225_4932).anInt5002) + i);
            int i_16_ = aClass129_8447.method1169();
            int i_17_ = aClass129_8447.method1181();
            int i_18_ = aClass129_8437.method1169();
            int i_19_ = aClass129_8437.method1181();
            aClass129_8447.method1168(i_15_, i - -(((((Class225) (((Class301) this).aClass225_4932)).anInt5002) + -i_17_) / 2));
            aClass129_8437.method1168((((Class225) ((Class301) this).aClass225_4932).anInt5000 + (i_15_ - i_18_)), i - -((-i_19_ + (((Class225) ((Class301) this).aClass225_4932).anInt5002)) / 2));
            Class287.aHa3381.KA(i_15_, i, i_15_ - -(((Class225) ((Class301) this).aClass225_4932).anInt5000), i + aClass129_8436.method1181());
            aClass129_8436.method1182(i_16_ + i_15_, i, (-i_18_ + (((Class225) ((Class301) this).aClass225_4932).anInt5000 - i_16_)), ((Class225) ((Class301) this).aClass225_4932).anInt5002);
            int i_20_ = aClass129_8439.method1181();
            Class287.aHa3381.KA(i_15_, (i + ((Class225) ((Class301) this).aClass225_4932).anInt5002 - i_20_), (i_15_ + ((Class225) ((Class301) this).aClass225_4932).anInt5000), ((Class225) ((Class301) this).aClass225_4932).anInt5002 + i);
            aClass129_8439.method1182(i_16_ + i_15_, (-i_20_ + ((Class225) ((Class301) this).aClass225_4932).anInt5002 + i), (((Class225) ((Class301) this).aClass225_4932).anInt5000 + (-i_16_ - i_18_)), ((Class225) ((Class301) this).aClass225_4932).anInt5002);
            Class287.aHa3381.KA(is[0], is[1], is[2], is[3]);
        }
        if (i_14_ > -72)
            method34((byte) 31);
        anInt8441++;
    }

    public static void method3194(int i) {
        aIncommingOpcode_8450 = null;
        aOutgoingOpcode_8443 = null;
        aClass128_8448 = null;
        if (i != 0)
            aOutgoingOpcode_8446 = null;
        aOutgoingOpcode_8446 = null;
    }

    public final void method34(byte i) {
        anInt8440++;
        if (i < 34)
            aClass129_8437 = null;
        super.method34((byte) 72);
        Class225_Sub1 class225_sub1 = (Class225_Sub1) ((Class301) this).aClass225_4932;
        ((Class301_Sub3) this).aClass129_8445 = Node_Sub8_Sub3.method2043((((Class225_Sub1) class225_sub1).anInt8459), ((Class301) this).aClass381_4926, true);
        aClass129_8438 = Node_Sub8_Sub3.method2043((((Class225_Sub1) class225_sub1).anInt8461), ((Class301) this).aClass381_4926, true);
        aClass129_8447 = Node_Sub8_Sub3.method2043((((Class225_Sub1) class225_sub1).anInt8455), ((Class301) this).aClass381_4926, true);
        aClass129_8437 = Node_Sub8_Sub3.method2043((((Class225_Sub1) class225_sub1).anInt8462), ((Class301) this).aClass381_4926, true);
        aClass129_8436 = Node_Sub8_Sub3.method2043((((Class225_Sub1) class225_sub1).anInt8453), ((Class301) this).aClass381_4926, true);
        aClass129_8439 = Node_Sub8_Sub3.method2043((((Class225_Sub1) class225_sub1).anInt8452), ((Class301) this).aClass381_4926, true);
    }
}
