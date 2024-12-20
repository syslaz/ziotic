/* Class279_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class279_Sub2_Sub2 extends Class279_Sub2 {
    static int anInt9834;
    private byte[] aByteArray9835;
    static int anInt9836;
    static int anInt9837;
    static int anInt9838 = 4;
    static int anInt9839;
    static int anInt9840;

    static final void method2903(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        anInt9840++;
        Node_Sub30 class248_sub30 = null;
        for (Node_Sub30 class248_sub30_7_ = (Node_Sub30) Class225_Sub2.aClass293_8466.method3119(2); class248_sub30_7_ != null; class248_sub30_7_ = (Node_Sub30) Class225_Sub2.aClass293_8466.method3107(-128)) {
            if (((i_3_ ^ 0xffffffff) == (((Node_Sub30) class248_sub30_7_).anInt7184 ^ 0xffffffff)) && (((Node_Sub30) class248_sub30_7_).anInt7187 ^ 0xffffffff) == (i ^ 0xffffffff) && ((Node_Sub30) class248_sub30_7_).anInt7190 == i_5_ && i_0_ == ((Node_Sub30) class248_sub30_7_).anInt7185) {
                class248_sub30 = class248_sub30_7_;
                break;
            }
        }
        if (class248_sub30 == null) {
            class248_sub30 = new Node_Sub30();
            ((Node_Sub30) class248_sub30).anInt7187 = i;
            ((Node_Sub30) class248_sub30).anInt7185 = i_0_;
            ((Node_Sub30) class248_sub30).anInt7190 = i_5_;
            ((Node_Sub30) class248_sub30).anInt7184 = i_3_;
            if ((i ^ 0xffffffff) <= -1 && i_5_ >= 0 && Node_Sub8_Sub4.anInt8360 > i && (i_5_ ^ 0xffffffff) > (Node_Sub22.anInt7074 ^ 0xffffffff))
                Class124.method1140(class248_sub30, false);
            Class225_Sub2.aClass293_8466.method3109(class248_sub30, -121);
        }
        ((Node_Sub30) class248_sub30).aBoolean7180 = true;
        ((Node_Sub30) class248_sub30).anInt7181 = i_1_;
        ((Node_Sub30) class248_sub30).anInt7186 = i_4_;
        ((Node_Sub30) class248_sub30).aBoolean7189 = false;
        if (i_6_ <= 59)
            anInt9838 = -125;
        ((Node_Sub30) class248_sub30).anInt7176 = i_2_;
    }

    final void method2893(byte i, int i_8_, byte i_9_) {
        if (i_9_ == -111) {
            anInt9836++;
            int i_10_ = i_8_ * 2;
            int i_11_ = 0xff & i;
            aByteArray9835[i_10_++] = (byte) -1;
            aByteArray9835[i_10_] = (byte) (i_11_ * 3 >> -139962011);
        }
    }

    static final void method2904(int i, Class21 class21, byte i_12_, int i_13_, int i_14_, int i_15_) {
        if (i_12_ != 48)
            method2904(74, null, (byte) 107, -118, 30, 51);
        anInt9837++;
        if ((i ^ 0xffffffff) <= -2 && (i_15_ ^ 0xffffffff) <= -2 && i <= -2 + Node_Sub8_Sub4.anInt8360 && ((-2 + Node_Sub22.anInt7074 ^ 0xffffffff) <= (i_15_ ^ 0xffffffff))) {
            if (Class311.aClass137ArrayArrayArray3620 != null) {
                Interface16 interface16 = Class73.aClass310_Sub1_941.method3259(false, i, i_15_, i_14_, i_13_);
                if (interface16 != null) {
                    if (interface16 instanceof Class346_Sub7_Sub2_Sub4)
                        ((Class346_Sub7_Sub2_Sub4) interface16).method3623(class21, i_12_ + -48);
                    else if (!(interface16 instanceof Class346_Sub7_Sub4_Sub2)) {
                        if (!(interface16 instanceof Class346_Sub7_Sub5_Sub2)) {
                            if (interface16 instanceof Class346_Sub7_Sub1_Sub2)
                                ((Class346_Sub7_Sub1_Sub2) interface16).method3595((byte) -124, class21);
                        } else
                            ((Class346_Sub7_Sub5_Sub2) interface16).method3700((byte) 123, class21);
                    } else
                        ((Class346_Sub7_Sub4_Sub2) interface16).method3686(class21, (byte) -127);
                }
            }
        }
    }

    final byte[] method2905(int i, byte i_16_, int i_17_, int i_18_) {
        aByteArray9835 = new byte[i * (i_18_ * i_17_) * 2];
        anInt9834++;
        this.method2883(i, i_18_, i_17_, 0);
        if (i_16_ < 111)
            aByteArray9835 = null;
        return aByteArray9835;
    }

    static final Node_Sub15_Sub1 method2906(byte i, Node_Sub15_Sub1 class248_sub15_sub1) {
        anInt9839++;
        Node_Sub15_Sub1 class248_sub15_sub1_19_ = (class248_sub15_sub1 != null ? new Node_Sub15_Sub1(class248_sub15_sub1) : new Node_Sub15_Sub1());
        if (i > -84)
            anInt9838 = -57;
        class248_sub15_sub1_19_.method2438(9, (byte) -90, 128);
        return class248_sub15_sub1_19_;
    }

    public Class279_Sub2_Sub2() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
