/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class141 implements Interface12 {
    static int anInt5047;
    static int anInt5048;
    static int anInt5049;
    static int anInt5050;
    static int anInt5051;
    static Class278 aClass278_5052 = new Class278(3000000, 200);
    static int anInt5053;
    static int anInt5054;
    private Class381 aClass381_5055;
    private String aString5056;
    static boolean aBoolean5057 = false;
    static float aFloat5058 = 1.0F;
    static boolean aBoolean5059 = false;

    static final RSInterface2 method1283(boolean bool, RSInterface2 class354) {
        anInt5047++;
        if (((RSInterface2) class354).anInt4300 != -1)
            return Class276.method2853(65535, ((RSInterface2) class354).anInt4300);
        if (bool != false)
            return null;
        int i = ((RSInterface2) class354).interfaceValues >>> -1220351344;
        Class82 class82 = new Class82(Class109.aClass65_1375);
        for (Node_Sub12 class248_sub12 = (Node_Sub12) class82.method591((byte) -91); class248_sub12 != null; class248_sub12 = (Node_Sub12) class82.method590(20322)) {
            if (((Node_Sub12) class248_sub12).anInt6964 == i)
                return Class276.method2853(65535, (int) (((Node) class248_sub12).id));
        }
        return null;
    }

    static final void method1284(byte i) {
        anInt5048++;
        if (!Class287.aHa3381.j())
            Node_Sub15_Sub5.method2495(false, 63, ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub15_7358.method2984(true));
        else {
            Class287.aHa3381.b(Class297_Sub1.aCanvas8478);
            Class353.method3756(-125);
            if (!Node_Sub8_Sub6.aBoolean8949) {
                Dimension dimension = Class297_Sub1.aCanvas8478.getSize();
                Class287.aHa3381.a(Class297_Sub1.aCanvas8478, dimension.width, dimension.height);
            } else
                Node_Sub14_Sub7.method2293(1, Class297_Sub1.aCanvas8478);
            Class287.aHa3381.a(Class297_Sub1.aCanvas8478);
        }
        Class60.method472(-101);
        Node_Sub30.aBoolean7192 = true;
        if (i < 98)
            method1283(true, null);
    }

    static final void method1285(byte i) {
        if (!Class145.aBoolean1721)
            Class342.aBoolean4008 = (((Class205.anInt2387 ^ 0xffffffff) != 0 && Class205.anInt2387 <= Class379.anInt4638) || ((!Class240.aBoolean2682 ? 22 : 26) + 16 * Class379.anInt4638) > Class282_Sub20.anInt7800);
        anInt5053++;
        Class226_Sub1.aClass293_6659.method3121(10);
        Class14.aClass293_269.method3121(10);
        for (Node_Sub8_Sub11 class248_sub8_sub11 = (Node_Sub8_Sub11) Class358.aClass293_4424.method3119(2); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3107(-128))) {
            int i_0_ = ((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999;
            if (i_0_ < 1000) {
                class248_sub8_sub11.remove(true);
                if (i_0_ != 21 && i_0_ != 46 && (i_0_ ^ 0xffffffff) != -10 && i_0_ != 44 && (i_0_ ^ 0xffffffff) != -61 && i_0_ != 22 && i_0_ != 25)
                    Class226_Sub1.aClass293_6659.method3109(class248_sub8_sub11, -99);
                else
                    Class14.aClass293_269.method3109(class248_sub8_sub11, -102);
            }
        }
        Class226_Sub1.aClass293_6659.method3114(Class358.aClass293_4424, -2);
        Class14.aClass293_269.method3114(Class358.aClass293_4424, -2);
        if ((Class379.anInt4638 ^ 0xffffffff) >= -2) {
            Class300.aClass248_Sub8_Sub11_3498 = null;
            Node_Sub14_Sub32.aClass248_Sub8_Sub11_9503 = null;
        } else {
            if (Class44_Sub1.aBoolean5292 && Class353.aClass253_4192.method2722(true, 81) && (Class379.anInt4638 ^ 0xffffffff) < -3)
                Class300.aClass248_Sub8_Sub11_3498 = ((Node_Sub8_Sub11) (((Node) ((Node) (((Class293) Class358.aClass293_4424).aNode_3434)).next).next));
            else
                Class300.aClass248_Sub8_Sub11_3498 = ((Node_Sub8_Sub11) ((Node) (((Class293) Class358.aClass293_4424).aNode_3434)).next);
            Node_Sub14_Sub32.aClass248_Sub8_Sub11_9503 = ((Node_Sub8_Sub11) ((Node) (((Class293) Class358.aClass293_4424).aNode_3434)).next);
        }
        if (i >= -14)
            method1285((byte) 58);
        int i_1_ = -1;
        Node_Sub39 class248_sub39 = (Node_Sub39) Class368.aClass293_4524.method3119(2);
        if (class248_sub39 != null)
            i_1_ = class248_sub39.method2604(-128);
        if (Class145.aBoolean1721) {
            if (i_1_ == -1) {
                int i_2_ = Class46.aClass269_600.method2817((byte) -73);
                int i_3_ = Class46.aClass269_600.method2809(117);
                boolean bool = false;
                if (Class276.aClass248_Sub8_Sub5_3209 != null) {
                    if (i_2_ >= -10 + Class203.anInt2314 && (i_2_ ^ 0xffffffff) >= ((Class316_Sub2.anInt8053 + Class203.anInt2314 - -10) ^ 0xffffffff) && i_3_ >= Class54_Sub3.anInt5344 + -10 && ((i_3_ ^ 0xffffffff) >= (Class155.anInt1837 + (Class54_Sub3.anInt5344 + 10) ^ 0xffffffff)))
                        bool = true;
                    else
                        Class279_Sub1.method2886(false);
                }
                if (!bool) {
                    if (i_2_ < Class239.anInt2654 + -10 || i_2_ > (10 + Class346_Sub2.anInt8261 + Class239.anInt2654) || ((Class346_Sub10.anInt8354 + -10 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) || i_3_ > (Class198.anInt2264 + Class346_Sub10.anInt8354 - -10))
                        Class295.method3128(-1877);
                    else if (Class342.aBoolean4008) {
                        int i_4_ = -1;
                        int i_5_ = -1;
                        for (int i_6_ = 0; ((Class113.anInt1402 ^ 0xffffffff) < (i_6_ ^ 0xffffffff)); i_6_++) {
                            if (!Class240.aBoolean2682) {
                                int i_7_ = (Class346_Sub10.anInt8354 - -31 + 16 * i_6_);
                                if (i_7_ - 13 < i_3_ && (i_3_ ^ 0xffffffff) > (i_7_ - -3 ^ 0xffffffff)) {
                                    i_5_ = -13 + i_7_;
                                    i_4_ = i_6_;
                                    break;
                                }
                            } else {
                                int i_8_ = (Class346_Sub10.anInt8354 - (-33 - i_6_ * 16));
                                if ((i_3_ ^ 0xffffffff) < (-13 + i_8_ ^ 0xffffffff) && ((i_8_ + 4 ^ 0xffffffff) < (i_3_ ^ 0xffffffff))) {
                                    i_5_ = i_8_ + -13;
                                    i_4_ = i_6_;
                                    break;
                                }
                            }
                        }
                        if ((i_4_ ^ 0xffffffff) != 0) {
                            int i_9_ = 0;
                            Class50 class50 = new Class50(Class363.aClass64_4478);
                            for (Node_Sub8_Sub5 class248_sub8_sub5 = ((Node_Sub8_Sub5) class50.method400((byte) 47)); class248_sub8_sub5 != null; class248_sub8_sub5 = ((Node_Sub8_Sub5) class50.method398(false))) {
                                if ((i_4_ ^ 0xffffffff) == (i_9_ ^ 0xffffffff)) {
                                    if (((Node_Sub8_Sub5) class248_sub8_sub5).anInt8937 > 1)
                                        Class291.method3104((byte) 114, class248_sub8_sub5, i_3_, i_5_);
                                    break;
                                }
                                i_9_++;
                            }
                        }
                    }
                }
            }
            if ((i_1_ ^ 0xffffffff) == -1) {
                int i_10_ = class248_sub39.method2606(-15204);
                int i_11_ = class248_sub39.method2601((byte) -102);
                if (Class276.aClass248_Sub8_Sub5_3209 == null || Class203.anInt2314 > i_10_ || (Class203.anInt2314 - -Class316_Sub2.anInt8053 ^ 0xffffffff) > (i_10_ ^ 0xffffffff) || (i_11_ ^ 0xffffffff) > (Class54_Sub3.anInt5344 ^ 0xffffffff) || ((i_11_ ^ 0xffffffff) < (Class155.anInt1837 + Class54_Sub3.anInt5344 ^ 0xffffffff))) {
                    if ((i_10_ ^ 0xffffffff) <= (Class239.anInt2654 ^ 0xffffffff) && (Class346_Sub2.anInt8261 + Class239.anInt2654 ^ 0xffffffff) <= (i_10_ ^ 0xffffffff) && ((Class346_Sub10.anInt8354 ^ 0xffffffff) >= (i_11_ ^ 0xffffffff)) && (Class346_Sub10.anInt8354 + Class198.anInt2264 >= i_11_)) {
                        if (!Class342.aBoolean4008) {
                            int i_12_ = -1;
                            for (int i_13_ = 0; i_13_ < Class379.anInt4638; i_13_++) {
                                if (!Class240.aBoolean2682) {
                                    int i_14_ = (Class346_Sub10.anInt8354 + (31 + (-1 + Class379.anInt4638 - i_13_) * 16));
                                    if (-13 + i_14_ < i_11_ && ((i_14_ + 3 ^ 0xffffffff) < (i_11_ ^ 0xffffffff)))
                                        i_12_ = i_13_;
                                } else {
                                    int i_15_ = (33 + Class346_Sub10.anInt8354 + ((-i_13_ + (-1 + Class379.anInt4638)) * 16));
                                    if ((i_11_ ^ 0xffffffff) < (-13 + i_15_ ^ 0xffffffff) && ((i_15_ - -4 ^ 0xffffffff) < (i_11_ ^ 0xffffffff)))
                                        i_12_ = i_13_;
                                }
                            }
                            if ((i_12_ ^ 0xffffffff) != 0) {
                                int i_16_ = 0;
                                Class251 class251 = new Class251(Class358.aClass293_4424);
                                for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) class251.method2714(true)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) class251.method2715((byte) -119))) {
                                    if (i_16_ == i_12_) {
                                        Class340_Sub2.method3450(false, i_11_, i_10_, class248_sub8_sub11);
                                        break;
                                    }
                                    i_16_++;
                                }
                            }
                            Class295.method3128(-1877);
                        } else {
                            int i_17_ = -1;
                            for (int i_18_ = 0; ((i_18_ ^ 0xffffffff) > (Class113.anInt1402 ^ 0xffffffff)); i_18_++) {
                                if (!Class240.aBoolean2682) {
                                    int i_19_ = (i_18_ * 16 + (31 + Class346_Sub10.anInt8354));
                                    if (i_19_ - 13 < i_11_ && 3 + i_19_ > i_11_) {
                                        i_17_ = i_18_;
                                        break;
                                    }
                                } else {
                                    int i_20_ = (i_18_ * 16 + Class346_Sub10.anInt8354 + 33);
                                    if (-13 + i_20_ < i_11_ && ((i_11_ ^ 0xffffffff) > (4 + i_20_ ^ 0xffffffff))) {
                                        i_17_ = i_18_;
                                        break;
                                    }
                                }
                            }
                            if ((i_17_ ^ 0xffffffff) != 0) {
                                int i_21_ = 0;
                                Class50 class50 = new Class50(Class363.aClass64_4478);
                                for (Node_Sub8_Sub5 class248_sub8_sub5 = ((Node_Sub8_Sub5) class50.method400((byte) 47)); class248_sub8_sub5 != null; class248_sub8_sub5 = ((Node_Sub8_Sub5) class50.method398(false))) {
                                    if (i_17_ == i_21_) {
                                        Class340_Sub2.method3450(false, i_11_, i_10_, ((Node_Sub8_Sub11) (((Node_Sub8) (((Class64) (((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936)).aClass248_Sub8_856)).aClass248_Sub8_6871)));
                                        Class295.method3128(-1877);
                                        break;
                                    }
                                    i_21_++;
                                }
                            }
                        }
                    }
                } else {
                    int i_22_ = -1;
                    for (int i_23_ = 0; (((Node_Sub8_Sub5) Class276.aClass248_Sub8_Sub5_3209).anInt8937 > i_23_); i_23_++) {
                        if (Class240.aBoolean2682) {
                            int i_24_ = 16 * i_23_ + Class54_Sub3.anInt5344 - -33;
                            if ((-13 + i_24_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff) && i_11_ < 4 + i_24_)
                                i_22_ = i_23_;
                        } else {
                            int i_25_ = 31 + (Class54_Sub3.anInt5344 + 16 * i_23_);
                            if (i_25_ - 13 < i_11_ && (i_11_ ^ 0xffffffff) > (3 + i_25_ ^ 0xffffffff))
                                i_22_ = i_23_;
                        }
                    }
                    if (i_22_ != -1) {
                        int i_26_ = 0;
                        Class50 class50 = new Class50(((Node_Sub8_Sub5) Class276.aClass248_Sub8_Sub5_3209).aClass64_8936);
                        for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) class50.method400((byte) 47)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) class50.method398(false))) {
                            if (i_26_ == i_22_) {
                                Class340_Sub2.method3450(false, i_11_, i_10_, class248_sub8_sub11);
                                break;
                            }
                            i_26_++;
                        }
                    }
                    Class295.method3128(-1877);
                }
            }
        } else {
            if ((i_1_ ^ 0xffffffff) == -1 && (((Class282_Sub27.anInt7878 ^ 0xffffffff) == -2 && (Class379.anInt4638 ^ 0xffffffff) < -3) || Class211.method1729(-555)))
                i_1_ = 2;
            if ((i_1_ ^ 0xffffffff) == -3 && Class379.anInt4638 > 0 && class248_sub39 != null) {
                if (Class371.aClass354_4564 == null && Class282_Sub12.anInt7715 == 0)
                    Class357.method3796(class248_sub39.method2606(-15204), 5966, class248_sub39.method2601((byte) -7));
                else
                    Class279_Sub1.anInt7561 = 2;
            }
            if (i_1_ == 0) {
                if (Class300.aClass248_Sub8_Sub11_3498 == null) {
                    if (Class115.aBoolean4952)
                        Class1.method168((byte) -119);
                } else
                    Class184.method1618((byte) 117);
            }
            if (Class371.aClass354_4564 == null && (Class282_Sub12.anInt7715 ^ 0xffffffff) == -1) {
                Class279_Sub1.anInt7561 = 0;
                Class323.aClass248_Sub8_Sub11_3804 = null;
            }
        }
    }

    static final boolean method1286(int i, int i_27_, byte i_28_) {
        if (i_28_ != -124)
            aFloat5058 = 2.2983282F;
        anInt5054++;
        if ((0x400 & i_27_ ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    public static void method1287(byte i) {
        aClass278_5052 = null;
        int i_29_ = -80 % ((i - -30) / 34);
    }

    public final int method36(int i) {
        anInt5051++;
        if (i != -20701)
            return 64;
        if (aClass381_5055.method3931(aString5056, true))
            return 100;
        return aClass381_5055.method3916(-34, aString5056);
    }

    public final Class298 method37(byte i) {
        if (i > -120)
            aFloat5058 = 0.96468645F;
        anInt5050++;
        return Class298.aClass298_3478;
    }

    static final boolean method1288(int i, int i_30_, int i_31_, int i_32_) {
        Node_Sub48.aViewport_7431.method1865(i_30_, i, i_31_, Node_Sub2_Sub4.anIntArray8881);
        anInt5049++;
        if (i_32_ != -12825)
            method1286(-120, -67, (byte) -10);
        int i_33_ = Node_Sub2_Sub4.anIntArray8881[2];
        if ((i_33_ ^ 0xffffffff) > -51)
            return false;
        Node_Sub2_Sub4.anIntArray8881[1] = (Node_Sub2_Sub4.anIntArray8881[1] * Class146.anInt1728 / i_33_) + Node_Sub14_Sub10.anInt9249;
        Node_Sub2_Sub4.anIntArray8881[0] = Class162_Sub2.anInt6470 - -(Node_Sub2_Sub4.anIntArray8881[0] * Class226_Sub2_Sub1.anInt8808 / i_33_);
        Node_Sub2_Sub4.anIntArray8881[2] = i_33_;
        return true;
    }

    Class141(Class381 class381, String string) {
        aString5056 = string;
        aClass381_5055 = class381;
    }
}
