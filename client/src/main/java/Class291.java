/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class291 implements Interface3 {
    static int anInt4738;
    static int anInt4739;
    private Class65 aClass65_4740 = new Class65(128);
    static int anInt4741;
    static int anInt4742 = 0;
    static Node_Sub8_Sub2[] aClass248_Sub8_Sub2Array4743 = new Node_Sub8_Sub2[14];
    static int anInt4744;
    static int anInt4745;
    private int[] configValueArray = new int[((Class378) Class282_Sub23.aClass378_7835).anInt4636];
    static int anInt4747;
    static int anInt4748;
    int[] anIntArray4749 = new int[((Class378) Class282_Sub23.aClass378_7835).anInt4636];
    static int anInt4750;
    static int anInt4751;
    static IncommingOpcode aIncommingOpcode_4752 = new IncommingOpcode(51, 16);

    final void method3098(int i) {
        if (i == -12777) {
            for (int i_0_ = 0; ((((Class378) Class282_Sub23.aClass378_7835).anInt4636 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
                Class180 class180 = Class282_Sub23.aClass378_7835.method3890(i_0_, (byte) -53);
                if (class180 != null && (((Class180) class180).anInt2091 ^ 0xffffffff) == -1) {
                    configValueArray[i_0_] = 0;
                    ((Class291) this).anIntArray4749[i_0_] = 0;
                }
            }
            anInt4741++;
            aClass65_4740 = new Class65(128);
        }
    }

    final int method3099(int i, boolean bool) {
        anInt4747++;
        if (i <= 113)
            method3104((byte) -6, null, 119, 57);
        long l = Class118.method1112(116);
        for (Node_Sub4 class248_sub4 = (bool ? (Node_Sub4) aClass65_4740.method510(true) : (Node_Sub4) aClass65_4740.method512(false)); class248_sub4 != null; class248_sub4 = (Node_Sub4) aClass65_4740.method512(false)) {
            if ((0x3fffffffffffffffL & ((Node_Sub4) class248_sub4).aLong6831) < l) {
                if ((((Node_Sub4) class248_sub4).aLong6831 & 0x4000000000000000L) != 0L) {
                    int i_1_ = (int) ((Node) class248_sub4).id;
                    ((Class291) this).anIntArray4749[i_1_] = configValueArray[i_1_];
                    class248_sub4.remove(true);
                    return i_1_;
                }
                class248_sub4.remove(true);
            }
        }
        return -1;
    }

    final void method3100(int i, int i_2_, byte i_3_) {
        anInt4751++;
        Class250 class250 = Class229.aClass331_2582.method3394(i_3_ ^ ~0x17, i_2_);
        int i_4_ = ((Class250) class250).anInt2821;
        if (i_3_ != 98)
            method3102(8, -13, 9);
        int i_5_ = ((Class250) class250).anInt2820;
        int i_6_ = ((Class250) class250).anInt2828;
        int i_7_ = Class346_Sub7_Sub3_Sub1.anIntArray10523[-i_5_ + i_6_];
        if (i < 0 || i > i_7_)
            i = 0;
        i_7_ <<= i_5_;
        method3103(i_7_ & i << i_5_ | (i_7_ ^ 0xffffffff) & (((Class291) this).anIntArray4749[i_4_]), i_4_, 0);
    }

    public static void method3101(int i) {
        if (i != -1)
            method3104((byte) -50, null, 100, -80);
        aIncommingOpcode_4752 = null;
        aClass248_Sub8_Sub2Array4743 = null;
    }

    final void method3102(int i, int configId, int value) {
        configValueArray[configId] = value;
        int i_10_ = -40 % ((i - -74) / 37);
        anInt4748++;
        Node_Sub4 class248_sub4 = (Node_Sub4) aClass65_4740.method501((long) configId, (byte) 31);
        if (class248_sub4 == null) {
            class248_sub4 = new Node_Sub4(4611686018427387905L);
            aClass65_4740.method509(-1, class248_sub4, (long) configId);
        } else if ((((Node_Sub4) class248_sub4).aLong6831 ^ 0xffffffffffffffffL) != -4611686018427387906L)
            ((Node_Sub4) class248_sub4).aLong6831 = 0x4000000000000000L | 500L + Class118.method1112(116);
    }

    final void method3103(int i, int i_11_, int i_12_) {
        if (i_12_ != 0)
            method3100(-83, -6, (byte) -98);
        anInt4744++;
        ((Class291) this).anIntArray4749[i_11_] = i;
        Node_Sub4 class248_sub4 = (Node_Sub4) aClass65_4740.method501((long) i_11_, (byte) 31);
        if (class248_sub4 == null) {
            class248_sub4 = new Node_Sub4(Class118.method1112(116) + 500L);
            aClass65_4740.method509(-1, class248_sub4, (long) i_11_);
        } else
            ((Node_Sub4) class248_sub4).aLong6831 = 500L + Class118.method1112(116);
    }

    public final int method10(int i, byte i_13_) {
        anInt4739++;
        Class250 class250 = Class229.aClass331_2582.method3394(-97, i);
        if (i_13_ > -85)
            return -29;
        int i_14_ = ((Class250) class250).anInt2821;
        int i_15_ = ((Class250) class250).anInt2820;
        int i_16_ = ((Class250) class250).anInt2828;
        int i_17_ = Class346_Sub7_Sub3_Sub1.anIntArray10523[-i_15_ + i_16_];
        return i_17_ & ((Class291) this).anIntArray4749[i_14_] >> i_15_;
    }

    public final int method11(int i, byte i_18_) {
        if (i_18_ < 35)
            configValueArray = null;
        anInt4738++;
        return ((Class291) this).anIntArray4749[i];
    }

    static final void method3104(byte i, Node_Sub8_Sub5 class248_sub8_sub5, int i_19_, int i_20_) {
        anInt4750++;
        if (Class145.aBoolean1721) {
            int i_21_ = -64 % ((27 - i) / 63);
            int i_22_ = 0;
            for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) ((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936.method492(896)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) ((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936.method490(true))) {
                int i_23_ = Class284.method3061(-38, class248_sub8_sub11);
                if (i_22_ < i_23_)
                    i_22_ = i_23_;
            }
            i_22_ += 8;
            Class155.anInt1837 = ((Class240.aBoolean2682 ? 26 : 22) + 16 * ((Node_Sub8_Sub5) class248_sub8_sub5).anInt8937);
            int i_24_ = (16 * ((Node_Sub8_Sub5) class248_sub8_sub5).anInt8937 - -21);
            int i_25_ = Class239.anInt2654 - -Class346_Sub2.anInt8261;
            if ((Class146.anInt1724 ^ 0xffffffff) > (i_25_ + i_22_ ^ 0xffffffff))
                i_25_ = Class239.anInt2654 + -i_22_;
            if ((i_25_ ^ 0xffffffff) > -1)
                i_25_ = 0;
            int i_26_ = Class240.aBoolean2682 ? 33 : 31;
            int i_27_ = 13 + -i_26_ + i_20_;
            if ((i_27_ - -i_24_ ^ 0xffffffff) < (Class282_Sub20.anInt7800 ^ 0xffffffff))
                i_27_ = Class282_Sub20.anInt7800 + -i_24_;
            if (i_27_ < 0)
                i_27_ = 0;
            Class203.anInt2314 = i_25_;
            Class276.aClass248_Sub8_Sub5_3209 = class248_sub8_sub5;
            Class54_Sub3.anInt5344 = i_27_;
            Class316_Sub2.anInt8053 = i_22_;
        }
    }

    final void method3105(int i, int i_28_, int i_29_) {
        int i_30_ = 33 / ((i_28_ - 65) / 39);
        anInt4745++;
        Class250 class250 = Class229.aClass331_2582.method3394(-116, i);
        int i_31_ = ((Class250) class250).anInt2821;
        int i_32_ = ((Class250) class250).anInt2820;
        int i_33_ = ((Class250) class250).anInt2828;
        int i_34_ = Class346_Sub7_Sub3_Sub1.anIntArray10523[i_33_ + -i_32_];
        if (i_29_ < 0 || i_29_ > i_34_)
            i_29_ = 0;
        i_34_ <<= i_32_;
        method3102(74, i_31_, (i_29_ << i_32_ & i_34_ | configValueArray[i_31_] & (i_34_ ^ 0xffffffff)));
    }

    public Class291() {
        /* empty */
    }
}
