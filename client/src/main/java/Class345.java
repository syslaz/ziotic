/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

class Class345 {
    int[] anIntArray4089;
    static int anInt4090;
    static int anInt4091;
    private Node_Sub15 aClass248_Sub15_4092;
    static Class344[] aClass344Array4093;
    private long aLong4094;
    static int anInt4095;
    static int anInt4096;
    private boolean aBoolean4097;
    private int anInt4098 = 32;
    static int anInt4099;
    static int anInt4100;
    static int anInt4101;
    static int anInt4102;
    static int anInt4103;
    static int anInt4104;
    static boolean aBoolean4105 = false;
    private int anInt4106;
    int anInt4107;
    private long aLong4108;
    private int anInt4109;
    static int anInt4110;
    private int anInt4111;
    private Node_Sub15[] aClass248_Sub15Array4112;
    static int anInt4113;
    private Node_Sub15[] aClass248_Sub15Array4114;
    private boolean aBoolean4115;
    private long aLong4116;
    private int anInt4117;
    int anInt4118;
    private int anInt4119;

    private final void method3521(int i, byte i_0_) {
        if (i_0_ == 40) {
            anInt4106 -= i;
            anInt4110++;
            if ((anInt4106 ^ 0xffffffff) > -1)
                anInt4106 = 0;
            if (aClass248_Sub15_4092 != null)
                aClass248_Sub15_4092.method2404(i);
        }
    }

    void method3522() throws Exception {
        anInt4102++;
    }

    int method3523() throws Exception {
        anInt4113++;
        return ((Class345) this).anInt4107;
    }

    final synchronized void method3524(int i) {
        anInt4101++;
        if (i > 116) {
            aBoolean4115 = true;
            try {
                method3522();
            } catch (Exception exception) {
                method3531();
                aLong4108 = Class118.method1112(116) - -2000L;
            }
        }
    }

    private final void method3525(int[] is, int i) {
        int i_1_ = i;
        if (Class225_Sub3.aBoolean8472)
            i_1_ <<= 1;
        Class159.method1401(is, 0, i_1_);
        anInt4106 -= i;
        if (aClass248_Sub15_4092 != null && anInt4106 <= 0) {
            anInt4106 += Class54.anInt728 >> 4;
            Class307.method3223(aClass248_Sub15_4092, (byte) -86);
            method3534(aClass248_Sub15_4092, (byte) -117, aClass248_Sub15_4092.method2402());
            int i_2_ = 0;
            int i_3_ = 255;
            int i_4_ = 7;
            while_213_:
            while (i_3_ != 0) {
                int i_5_;
                int i_6_;
                if (i_4_ < 0) {
                    i_5_ = i_4_ & 0x3;
                    i_6_ = -(i_4_ >> 2);
                } else {
                    i_5_ = i_4_;
                    i_6_ = 0;
                }
                for (int i_7_ = i_3_ >>> i_5_ & 0x11111111; i_7_ != 0; i_7_ >>>= 4) {
                    if ((i_7_ & 0x1) != 0) {
                        i_3_ &= 1 << i_5_ ^ 0xffffffff;
                        Node_Sub15 class248_sub15 = null;
                        Node_Sub15 class248_sub15_8_ = aClass248_Sub15Array4112[i_5_];
                        while (class248_sub15_8_ != null) {
                            Node_Sub31 class248_sub31 = (((Node_Sub15) class248_sub15_8_).aClass248_Sub31_6996);
                            if (class248_sub31 != null && (((Node_Sub31) class248_sub31).anInt7194 > i_6_)) {
                                i_3_ |= 1 << i_5_;
                                class248_sub15 = class248_sub15_8_;
                                class248_sub15_8_ = (((Node_Sub15) class248_sub15_8_).aClass248_Sub15_6995);
                            } else {
                                ((Node_Sub15) class248_sub15_8_).aBoolean6997 = true;
                                int i_9_ = class248_sub15_8_.method2405();
                                i_2_ += i_9_;
                                if (class248_sub31 != null)
                                    ((Node_Sub31) class248_sub31).anInt7194 += i_9_;
                                if (i_2_ >= anInt4098)
                                    break while_213_;
                                Node_Sub15 class248_sub15_10_ = class248_sub15_8_.method2401();
                                if (class248_sub15_10_ != null) {
                                    int i_11_ = (((Node_Sub15) class248_sub15_8_).anInt6994);
                                    for (/**/; class248_sub15_10_ != null; class248_sub15_10_ = class248_sub15_8_.method2399())
                                        method3534(class248_sub15_10_, (byte) -87, (i_11_ * class248_sub15_10_.method2402() >> 8));
                                }
                                Node_Sub15 class248_sub15_12_ = (((Node_Sub15) class248_sub15_8_).aClass248_Sub15_6995);
                                ((Node_Sub15) class248_sub15_8_).aClass248_Sub15_6995 = null;
                                if (class248_sub15 == null)
                                    aClass248_Sub15Array4112[i_5_] = class248_sub15_12_;
                                else
                                    ((Node_Sub15) class248_sub15).aClass248_Sub15_6995 = class248_sub15_12_;
                                if (class248_sub15_12_ == null)
                                    aClass248_Sub15Array4114[i_5_] = class248_sub15;
                                class248_sub15_8_ = class248_sub15_12_;
                            }
                        }
                    }
                    i_5_ += 4;
                    i_6_++;
                }
                i_4_--;
            }
            for (int i_13_ = 0; i_13_ < 8; i_13_++) {
                Node_Sub15 class248_sub15 = aClass248_Sub15Array4112[i_13_];
                aClass248_Sub15Array4112[i_13_] = aClass248_Sub15Array4114[i_13_] = null;
                Node_Sub15 class248_sub15_14_;
                for (/**/; class248_sub15 != null; class248_sub15 = class248_sub15_14_) {
                    class248_sub15_14_ = (((Node_Sub15) class248_sub15).aClass248_Sub15_6995);
                    ((Node_Sub15) class248_sub15).aClass248_Sub15_6995 = null;
                }
            }
        }
        if (anInt4106 < 0)
            anInt4106 = 0;
        if (aClass248_Sub15_4092 != null)
            aClass248_Sub15_4092.method2400(is, 0, i);
        aLong4094 = Class118.method1112(116);
    }

    void method3526(Component component) throws Exception {
        anInt4104++;
    }

    final synchronized void method3527(int i) {
        if (Node_Sub14_Sub26.aClass258_9432 != null) {
            boolean bool = true;
            for (int i_15_ = 0; i_15_ < 2; i_15_++) {
                if ((((Class258) Node_Sub14_Sub26.aClass258_9432).aClass345Array2948[i_15_]) == this)
                    ((Class258) Node_Sub14_Sub26.aClass258_9432).aClass345Array2948[i_15_] = null;
                if ((((Class258) Node_Sub14_Sub26.aClass258_9432).aClass345Array2948[i_15_]) != null)
                    bool = false;
            }
            if (bool) {
                ((Class258) Node_Sub14_Sub26.aClass258_9432).aBoolean2952 = true;
                while (((Class258) Node_Sub14_Sub26.aClass258_9432).aBoolean2947)
                    Class279_Sub2.method2897((byte) -124, 50L);
                Node_Sub14_Sub26.aClass258_9432 = null;
            }
        }
        anInt4100++;
        method3531();
        aBoolean4097 = true;
        if (i > -97)
            method3525(null, -27);
        ((Class345) this).anIntArray4089 = null;
    }

    void method3528(int i) throws Exception {
        anInt4091++;
    }

    final synchronized void method3529(int i) {
        anInt4096++;
        if (!aBoolean4097) {
            long l = Class118.method1112(i ^ 0x74);
            try {
                if ((l ^ 0xffffffffffffffffL) < (6000L + aLong4094 ^ 0xffffffffffffffffL))
                    aLong4094 = l + -6000L;
                for (/**/; aLong4094 - -5000L < l; l = Class118.method1112(116)) {
                    method3521(256, (byte) 40);
                    aLong4094 += (long) (256000 / Class54.anInt728);
                }
            } catch (Exception exception) {
                aLong4094 = l;
            }
            if (((Class345) this).anIntArray4089 != null) {
                try {
                    if (aLong4108 != (long) i) {
                        if (l < aLong4108)
                            return;
                        method3528(((Class345) this).anInt4107);
                        aBoolean4115 = true;
                        aLong4108 = 0L;
                    }
                    int i_16_ = method3523();
                    if ((anInt4119 - i_16_ ^ 0xffffffff) < (anInt4117 ^ 0xffffffff))
                        anInt4117 = -i_16_ + anInt4119;
                    int i_17_ = anInt4111 + ((Class345) this).anInt4118;
                    if (i_17_ - -256 > 16384)
                        i_17_ = 16128;
                    if (256 + i_17_ > ((Class345) this).anInt4107) {
                        ((Class345) this).anInt4107 += 1024;
                        if (((Class345) this).anInt4107 > 16384)
                            ((Class345) this).anInt4107 = 16384;
                        method3531();
                        i_16_ = 0;
                        method3528(((Class345) this).anInt4107);
                        aBoolean4115 = true;
                        if ((256 + i_17_ ^ 0xffffffff) < (((Class345) this).anInt4107 ^ 0xffffffff)) {
                            i_17_ = -256 + ((Class345) this).anInt4107;
                            anInt4111 = i_17_ - ((Class345) this).anInt4118;
                        }
                    }
                    while (i_16_ < i_17_) {
                        method3525(((Class345) this).anIntArray4089, 256);
                        i_16_ += 256;
                        method3533();
                    }
                    if (aLong4116 < l) {
                        if (aBoolean4115)
                            aBoolean4115 = false;
                        else {
                            if (anInt4117 == 0 && (anInt4109 ^ 0xffffffff) == -1) {
                                method3531();
                                aLong4108 = 2000L + l;
                                return;
                            }
                            anInt4111 = Math.min(anInt4109, anInt4117);
                            anInt4109 = anInt4117;
                        }
                        aLong4116 = 2000L + l;
                        anInt4117 = 0;
                    }
                    anInt4119 = i_16_;
                } catch (Exception exception) {
                    method3531();
                    aLong4108 = l - -2000L;
                }
            }
        }
    }

    final synchronized void method3530(Node_Sub15 class248_sub15, int i) {
        anInt4103++;
        if (i >= 64)
            aClass248_Sub15_4092 = class248_sub15;
    }

    void method3531() {
        anInt4090++;
    }

    public static void method3532(byte i) {
        if (i != -29)
            aBoolean4105 = true;
        aClass344Array4093 = null;
    }

    void method3533() throws Exception {
        anInt4095++;
    }

    private final void method3534(Node_Sub15 class248_sub15, byte i, int i_18_) {
        anInt4099++;
        int i_19_ = i_18_ >> 1289102437;
        Node_Sub15 class248_sub15_20_ = aClass248_Sub15Array4114[i_19_];
        if (class248_sub15_20_ == null)
            aClass248_Sub15Array4112[i_19_] = class248_sub15;
        else
            ((Node_Sub15) class248_sub15_20_).aClass248_Sub15_6995 = class248_sub15;
        aClass248_Sub15Array4114[i_19_] = class248_sub15;
        if (i <= -68)
            ((Node_Sub15) class248_sub15).anInt6994 = i_18_;
    }

    public Class345() {
        aBoolean4097 = false;
        aLong4094 = Class118.method1112(116);
        aClass248_Sub15Array4114 = new Node_Sub15[8];
        aClass248_Sub15Array4112 = new Node_Sub15[8];
        aLong4108 = 0L;
        aLong4116 = 0L;
        aBoolean4115 = true;
        anInt4106 = 0;
        anInt4117 = 0;
        anInt4119 = 0;
        anInt4109 = 0;
    }
}
