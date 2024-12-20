/* Class346_Sub7_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub7_Sub2_Sub1 extends Animable implements Interface16 {
    static int anInt9992;
    private boolean aBoolean9993;
    static int anInt9994;
    static int anInt9995;
    static int anInt9996;
    static int anInt9997;
    private boolean aBoolean9998;
    static int anInt9999;
    static int anInt10000;
    private r aR10001;
    static int anInt10002;
    static int anInt10003;
    static int anInt10004;
    private short aShort10005;
    static int anInt10006;
    static int anInt10007;
    private byte aByte10008;
    private byte aByte10009;
    static int anInt10010;
    static int anInt10011;
    Class162 aClass162_10012;
    static int anInt10013;
    private boolean aBoolean10014;
    static int anInt10015;
    static int anInt10016;
    static int anInt10017;
    private Class38 aClass38_10018;
    static int anInt10019;
    static int anInt10020;
    static int anInt10021;
    static int anInt10022;
    private boolean aBoolean10023;
    static float aFloat10024;

    final Class38 method3575(byte i, ha var_ha) {
        anInt9992++;
        if (aClass38_10018 == null)
            aClass38_10018 = Class282_Sub11.method2965(((Interactable) this).y, ((Interactable) this).x, ((Interactable) this).anInt8317, 544, method3606(var_ha, 0, -84));
        if (i > -86)
            aBoolean10014 = true;
        return aClass38_10018;
    }

    public final boolean method45(int i) {
        if (i != -28823)
            return false;
        anInt10002++;
        return aBoolean10014;
    }

    private final Class101 method3603(int i, boolean bool, ha var_ha, int i_0_) {
        anInt10022++;
        ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -95, aShort10005 & 0xffff);
        s var_s;
        s var_s_1_;
        if (!aBoolean9998) {
            if ((((Interactable) this).aByte8322 ^ 0xffffffff) > -4)
                var_s_1_ = (Node_Sub14_Sub29.aSArray9471[1 + ((Interactable) this).aByte8322]);
            else
                var_s_1_ = null;
            var_s = (Node_Sub14_Sub29.aSArray9471[((Interactable) this).aByte8322]);
        } else {
            var_s = (Node_Sub14_Sub12_Sub1.aSArray10306[((Interactable) this).aByte8322]);
            var_s_1_ = Node_Sub14_Sub29.aSArray9471[0];
        }
        int i_2_ = 110 / ((i_0_ - 61) / 39);
        return (class266.method2785(aByte10008 == 11 ? (int) (aByte10009 + 4) : aByte10009, bool, null, i, ((Interactable) this).anInt8317, var_ha, (byte) 85, ((Interactable) this).y, (aByte10008 ^ 0xffffffff) != -12 ? aByte10008 : 10, ((Interactable) this).x, var_s, var_s_1_));
    }

    final int method3580(int i) {
        if (i != -32768)
            return -116;
        anInt10017++;
        if (((Class346_Sub7_Sub2_Sub1) this).aClass162_10012 == null)
            return 0;
        return ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.fa();
    }

    final boolean method3563(boolean bool) {
        anInt10007++;
        if (((Class346_Sub7_Sub2_Sub1) this).aClass162_10012 != null)
            return ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.F();
        if (bool != false)
            aR10001 = null;
        return false;
    }

    final boolean method3579(ha var_ha, int i, int i_3_, byte i_4_) {
        anInt10004++;
        if (i_4_ != 103)
            method3568(9);
        Class162 class162 = method3606(var_ha, 131072, i_4_ ^ ~0x7d);
        if (class162 != null) {
            Viewport viewport = var_ha.o();
            viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
            if (Class357.aBoolean4416)
                return class162.method1420(i_3_, i, viewport, false, 0, ObjectDefinition.anInt3100);
            return class162.method1437(i_3_, i, viewport, false, 0);
        }
        return false;
    }

    public final void method44(boolean bool) {
        anInt9997++;
        if (bool == true) {
            if (((Class346_Sub7_Sub2_Sub1) this).aClass162_10012 != null)
                ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.method1435();
        }
    }

    static final void method3604(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
        anInt10013++;
        int i_10_ = 0;
        int i_11_ = i;
        int i_12_ = i_9_ * i_9_;
        int i_13_ = i * i;
        int i_14_ = i_13_ << -730325919;
        int i_15_ = i_12_ << -160968671;
        if (i_7_ >= -96)
            method3604(117, -23, -38, -38, -48, 125);
        int i_16_ = i << 1943058401;
        int i_17_ = i_14_ + i_12_ * (1 - i_16_);
        int i_18_ = -(i_15_ * (i_16_ + -1)) + i_13_;
        int i_19_ = i_12_ << 1054547906;
        int i_20_ = i_13_ << -1913487454;
        int i_21_ = i_14_ * (3 + (i_10_ << -2090336095));
        int i_22_ = i_15_ * ((i_11_ << -887558047) - 3);
        int i_23_ = i_20_ * (i_10_ + 1);
        int i_24_ = i_19_ * (-1 + i_11_);
        Class149.method1331(i_6_, -81, -i_9_ + i_8_, Class156.anIntArrayArray1867[i_5_], i_9_ + i_8_);
        while (i_11_ > 0) {
            if (i_17_ < 0) {
                while ((i_17_ ^ 0xffffffff) > -1) {
                    i_18_ += i_23_;
                    i_17_ += i_21_;
                    i_10_++;
                    i_23_ += i_20_;
                    i_21_ += i_20_;
                }
            }
            if (i_18_ < 0) {
                i_18_ += i_23_;
                i_17_ += i_21_;
                i_21_ += i_20_;
                i_23_ += i_20_;
                i_10_++;
            }
            i_18_ += -i_22_;
            i_17_ += -i_24_;
            i_11_--;
            i_24_ -= i_19_;
            i_22_ -= i_19_;
            int i_25_ = i_5_ + -i_11_;
            int i_26_ = i_11_ + i_5_;
            int i_27_ = i_10_ + i_8_;
            int i_28_ = -i_10_ + i_8_;
            Class149.method1331(i_6_, -126, i_28_, Class156.anIntArrayArray1867[i_25_], i_27_);
            Class149.method1331(i_6_, -89, i_28_, Class156.anIntArrayArray1867[i_26_], i_27_);
        }
    }

    public final int method46(byte i) {
        anInt9995++;
        int i_29_ = 109 / ((-57 - i) / 53);
        return aByte10008;
    }

    public final int method40(byte i) {
        if (i < 63)
            method46((byte) -54);
        anInt10020++;
        return aShort10005 & 0xffff;
    }

    final boolean method3568(int i) {
        int i_30_ = -75 / ((53 - i) / 45);
        anInt9994++;
        return aBoolean9993;
    }

    final void method3572(Interactable interactable, ha var_ha, int i, int i_31_, int i_32_, boolean bool, int i_33_) {
        if (i_31_ < 109)
            aBoolean10014 = true;
        if (interactable instanceof Class346_Sub7_Sub5_Sub1) {
            Class346_Sub7_Sub5_Sub1 class346_sub7_sub5_sub1 = (Class346_Sub7_Sub5_Sub1) interactable;
            if (((Class346_Sub7_Sub2_Sub1) this).aClass162_10012 != null && (((Class346_Sub7_Sub5_Sub1) class346_sub7_sub5_sub1).aClass162_10054) != null)
                ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.method1428((((Class346_Sub7_Sub5_Sub1) class346_sub7_sub5_sub1).aClass162_10054), i, i_33_, i_32_, bool);
        } else if (interactable instanceof Class346_Sub7_Sub2_Sub1) {
            Class346_Sub7_Sub2_Sub1 class346_sub7_sub2_sub1_34_ = (Class346_Sub7_Sub2_Sub1) interactable;
            if (((Class346_Sub7_Sub2_Sub1) this).aClass162_10012 != null && (((Class346_Sub7_Sub2_Sub1) class346_sub7_sub2_sub1_34_).aClass162_10012) != null)
                ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.method1428((((Class346_Sub7_Sub2_Sub1) class346_sub7_sub2_sub1_34_).aClass162_10012), i, i_33_, i_32_, bool);
        }
        anInt10010++;
    }

    final int method3605(int i) {
        if (i != -13876)
            aBoolean9993 = true;
        anInt10003++;
        if (((Class346_Sub7_Sub2_Sub1) this).aClass162_10012 == null)
            return 15;
        return ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.na() / 4;
    }

    final void method3577(int i) {
        if (i != 131072)
            aByte10008 = (byte) -3;
        aBoolean9993 = false;
        anInt9999++;
        if (((Class346_Sub7_Sub2_Sub1) this).aClass162_10012 != null)
            ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.s(((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.ua() & ~0x10000);
    }

    public final int method43(byte i) {
        anInt9996++;
        if (i != -111)
            return -9;
        return aByte10009;
    }

    public final void method41(int i, ha var_ha) {
        anInt10016++;
        Object object = null;
        if (i != 6120)
            method3578(-125, null);
        r var_r;
        if (aR10001 == null && aBoolean10014) {
            Class101 class101 = method3603(262144, true, var_ha, 100);
            var_r = class101 != null ? ((Class101) class101).aR1289 : null;
        } else {
            var_r = aR10001;
            aR10001 = null;
        }
        if (var_r != null)
            Class334.method3417(var_r, ((Interactable) this).aByte8322, ((Interactable) this).x, ((Interactable) this).y, null);
    }

    final boolean method3574(byte i) {
        anInt10011++;
        int i_35_ = -71 / ((14 - i) / 57);
        if (((Class346_Sub7_Sub2_Sub1) this).aClass162_10012 != null) {
            if (((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.r())
                return false;
            return true;
        }
        return true;
    }

    final int method3567(byte i) {
        anInt10019++;
        if (i <= 81)
            aBoolean10014 = false;
        if (((Class346_Sub7_Sub2_Sub1) this).aClass162_10012 != null)
            return ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.ma();
        return 0;
    }

    Class346_Sub7_Sub2_Sub1(ha var_ha, ObjectDefinition class266, int i, int i_36_, int i_37_, int i_38_, int i_39_, boolean bool, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, boolean bool_46_) {
        super(i, i_36_, i_37_, i_38_, i_39_, i_40_, i_41_, i_42_, i_43_, (((ObjectDefinition) class266).anInt3032 ^ 0xffffffff) == -2, Node_Sub38.method2597(i_45_, i_44_, (byte) 55));
        aBoolean9993 = bool_46_;
        ((Interactable) this).aByte8322 = (byte) i_36_;
        aBoolean9998 = bool;
        aBoolean10023 = (((ObjectDefinition) class266).anInt3105 ^ 0xffffffff) != -1 && !bool;
        aShort10005 = (short) ((ObjectDefinition) class266).anInt3043;
        aByte10009 = (byte) i_45_;
        aByte10008 = (byte) i_44_;
        aBoolean10014 = (var_ha.s() && ((ObjectDefinition) class266).aBoolean3085 && !aBoolean9998 && ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342.method2976(true) != 0);
        int i_47_ = 2048;
        if (aBoolean9993)
            i_47_ |= 0x10000;
        Class101 class101 = method3603(i_47_, aBoolean10014, var_ha, 100);
        if (class101 != null) {
            aR10001 = ((Class101) class101).aR1289;
            ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012 = ((Class101) class101).aClass162_1283;
            if (aBoolean9993)
                ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012 = ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.method1436((byte) 0, i_47_, false);
        }
    }

    public final void method42(boolean bool, ha var_ha) {
        anInt10006++;
        Object object = null;
        r var_r;
        if (aR10001 == null && aBoolean10014) {
            Class101 class101 = method3603(262144, true, var_ha, 5);
            var_r = class101 != null ? ((Class101) class101).aR1289 : null;
        } else {
            var_r = aR10001;
            aR10001 = null;
        }
        if (var_r != null)
            Class340_Sub6.method3460(var_r, ((Interactable) this).aByte8322, ((Interactable) this).x, ((Interactable) this).y, null);
        if (bool != true)
            method3577(-67);
    }

    final void method3573(ha var_ha, byte i) {
        if (i < 121)
            method3604(124, -54, 114, 103, -122, 127);
        anInt10000++;
    }

    private final Class162 method3606(ha var_ha, int i, int i_48_) {
        int i_49_ = 95 / ((i_48_ - 33) / 35);
        anInt10015++;
        if (((Class346_Sub7_Sub2_Sub1) this).aClass162_10012 != null && (var_ha.b(((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.ua(), i) ^ 0xffffffff) == -1)
            return ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012;
        Class101 class101 = method3603(i, false, var_ha, 104);
        if (class101 == null)
            return null;
        return ((Class101) class101).aClass162_1283;
    }

    final Class346_Sub10 method3578(int i, ha var_ha) {
        anInt10021++;
        if (((Class346_Sub7_Sub2_Sub1) this).aClass162_10012 == null)
            return null;
        Viewport viewport = var_ha.o();
        viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
        Class346_Sub10 class346_sub10 = Class282_Sub21.method3013(aBoolean10023, (byte) 120, 1);
        if (i != -1)
            method3577(80);
        if (Class357.aBoolean4416)
            ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.method1441(viewport, ((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0], ObjectDefinition.anInt3100, 0);
        else
            ((Class346_Sub7_Sub2_Sub1) this).aClass162_10012.method1440(viewport, ((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0], 0);
        return class346_sub10;
    }
}
