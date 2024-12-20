/* Class346_Sub7_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class346_Sub7_Sub4_Sub1 extends Class346_Sub7_Sub4 implements Interface16 {
    static int anInt10057;
    static int anInt10058;
    private short aShort10059;
    static int anInt10060;
    static int anInt10061;
    static int anInt10062;
    static int anInt10063;
    static int anInt10064;
    static int anInt10065;
    static int anInt10066;
    private boolean aBoolean10067;
    private boolean aBoolean10068;
    static int anInt10069;
    static int anInt10070;
    static int anInt10071;
    static int anInt10072;
    private Class38 aClass38_10073;
    static int anInt10074;
    private byte aByte10075;
    static int anInt10076;
    private boolean aBoolean10077;
    static int anInt10078;
    private Class162 aClass162_10079;
    static int anInt10080;
    static int anInt10081;
    private boolean aBoolean10082;
    static int anInt10083;
    static int anInt10084;
    private r aR10085;
    static int anInt10086;
    static IncommingOpcode aIncommingOpcode_10087 = new IncommingOpcode(66, 6);
    static int anInt10088;
    static int anInt10089;
    static int anInt10090;
    static int[] anIntArray10091 = null;
    static int anInt10092 = 1;

    public final boolean method45(int i) {
        if (i != -28823)
            return true;
        anInt10063++;
        return aBoolean10068;
    }

    public static void method3680(int i) {
        if (i < 28)
            anInt10092 = 106;
        aIncommingOpcode_10087 = null;
        anIntArray10091 = null;
    }

    final int method3580(int i) {
        if (i != -32768)
            anIntArray10091 = null;
        anInt10081++;
        if (aClass162_10079 != null)
            return aClass162_10079.fa();
        return 0;
    }

    static final void method3681(byte i, int i_0_, int i_1_) {
        anInt10088++;
        if (i < 52)
            method3683(null, null, (byte) 53);
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_1_, -874792672, 5);
        class248_sub8_sub10.method2084(614);
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983 = i_0_;
    }

    final boolean method3579(ha var_ha, int i, int i_2_, byte i_3_) {
        anInt10080++;
        if (i_3_ != 103)
            aBoolean10082 = true;
        Class162 class162 = method3684(var_ha, (byte) 101, 131072);
        if (class162 != null) {
            Viewport viewport = var_ha.o();
            viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
            if (Class357.aBoolean4416)
                return class162.method1420(i_2_, i, viewport, false, 0, ObjectDefinition.anInt3100);
            return class162.method1437(i_2_, i, viewport, false, 0);
        }
        return false;
    }

    static final void method3682(int i, int i_4_, int i_5_, int i_6_, boolean bool, int i_7_) {
        anInt10090++;
        if (Node_Sub48.aFrame7432 != null && (i_7_ != 3 || (i_6_ ^ 0xffffffff) != (za.anInt7491 ^ 0xffffffff) || Class25.anInt332 != i_5_)) {
            Class222.method1768(Node_Sub14_Sub15.aClass174_9328, Node_Sub48.aFrame7432, -2);
            Node_Sub48.aFrame7432 = null;
        }
        if (i < 32)
            method3682(-38, 113, 27, 61, false, 86);
        if ((i_7_ ^ 0xffffffff) == -4 && Node_Sub48.aFrame7432 == null) {
            Node_Sub48.aFrame7432 = Class346_Sub5_Sub1.method3550(i_6_, -1, 0, 0, (Node_Sub14_Sub15.aClass174_9328), i_5_);
            if (Node_Sub48.aFrame7432 != null) {
                za.anInt7491 = i_6_;
                Class25.anInt332 = i_5_;
                Class293.method3113(17458);
            }
        }
        if (i_7_ == 3 && Node_Sub48.aFrame7432 == null)
            method3682(107, i_4_, -1, -1, true, ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub1_7346.method2925(true));
        else {
            java.awt.Container container;
            if (Node_Sub48.aFrame7432 != null) {
                Class279_Sub1_Sub2.anInt9824 = i_6_;
                Class223.anInt5196 = i_5_;
                container = Node_Sub48.aFrame7432;
            } else if (Class300.aFrame3494 != null) {
                Insets insets = Class300.aFrame3494.getInsets();
                Class279_Sub1_Sub2.anInt9824 = Class300.aFrame3494.getSize().width + (-insets.right + -insets.left);
                Class223.anInt5196 = (Class300.aFrame3494.getSize().height - insets.top + -insets.bottom);
                container = Class300.aFrame3494;
            } else {
                if (Class158.anApplet1881 != null)
                    container = Class158.anApplet1881;
                else
                    container = Class54_Sub1.anApplet_Sub1_5332;
                Class279_Sub1_Sub2.anInt9824 = container.getSize().width;
                Class223.anInt5196 = container.getSize().height;
            }
            if (i_7_ != 1)
                Class32.method274(true);
            else {
                Class323.anInt3791 = (-Class226_Sub1.anInt6661 + Class279_Sub1_Sub2.anInt9824) / 2;
                Class146.anInt1724 = Class226_Sub1.anInt6661;
                Class282_Sub20.anInt7800 = s_Sub2.anInt7946;
                Class346_Sub10.anInt8351 = 0;
            }
            if (Class18.aClass339_295 != s_Sub2.aClass339_7951) {
                if ((Class146.anInt1724 ^ 0xffffffff) > -1025 && (Class282_Sub20.anInt7800 ^ 0xffffffff) > -769) {
                    /* empty */
                }
            }
            if (!bool) {
                Class297_Sub1.aCanvas8478.setSize(Class146.anInt1724, Class282_Sub20.anInt7800);
                if (!Node_Sub8_Sub6.aBoolean8949)
                    Class287.aHa3381.b(Class297_Sub1.aCanvas8478, Class146.anInt1724, Class282_Sub20.anInt7800);
                else
                    Class238_Sub2.method1893(false, Class297_Sub1.aCanvas8478);
                if (Class300.aFrame3494 != container)
                    Class297_Sub1.aCanvas8478.setLocation(Class323.anInt3791, (Class346_Sub10.anInt8351));
                else {
                    Insets insets = Class300.aFrame3494.getInsets();
                    Class297_Sub1.aCanvas8478.setLocation(insets.left + Class323.anInt3791, insets.top + Class346_Sub10.anInt8351);
                }
            } else
                Class141.method1284((byte) 104);
            if (i_7_ < 2)
                Class235.aBoolean2621 = false;
            else
                Class235.aBoolean2621 = true;
            if (Class179.anInt2084 != -1)
                Node_Sub14_Sub38.method2392(true, -57);
            if (Class289.aClass111_3398 != null && Class45.method328((byte) 13, Class273.anInt5008))
                Class101.method716((byte) -118);
            for (int i_8_ = 0; i_8_ < 100; i_8_++)
                Class359.aBooleanArray4435[i_8_] = true;
            Class156.aBoolean1849 = true;
        }
    }

    static final void method3683(d var_d, Class381 class381, byte i) {
        Class61.aD824 = var_d;
        anInt10066++;
        if (i > 11)
            Node_Sub14_Sub4.aClass381_9195 = class381;
    }

    final int method3567(byte i) {
        anInt10074++;
        if (i <= 81)
            return 60;
        if (aClass162_10079 == null)
            return 0;
        return aClass162_10079.ma();
    }

    Class346_Sub7_Sub4_Sub1(ha var_ha, ObjectDefinition class266, int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_, boolean bool_14_) {
        super(i_10_, i_11_, i_12_, i, i_9_, ((ObjectDefinition) class266).anInt3052);
        aBoolean10082 = bool;
        aByte10075 = (byte) i_13_;
        ((Interactable) this).y = i_12_;
        ((Interactable) this).x = i_10_;
        aBoolean10077 = bool_14_;
        aShort10059 = (short) ((ObjectDefinition) class266).anInt3043;
        aBoolean10067 = ((ObjectDefinition) class266).anInt3105 != 0 && !bool;
        aBoolean10068 = (var_ha.s() && ((ObjectDefinition) class266).aBoolean3085 && !aBoolean10082 && (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342.method2976(true) ^ 0xffffffff) != -1);
        int i_15_ = 2048;
        if (aBoolean10077)
            i_15_ |= 0x10000;
        Class101 class101 = method3685(i_15_, aBoolean10068, var_ha, -24018);
        if (class101 != null) {
            aR10085 = ((Class101) class101).aR1289;
            aClass162_10079 = ((Class101) class101).aClass162_1283;
            if (aBoolean10077)
                aClass162_10079 = aClass162_10079.method1436((byte) 0, i_15_, false);
        }
    }

    public final void method42(boolean bool, ha var_ha) {
        anInt10064++;
        if (bool == true) {
            Object object = null;
            r var_r;
            if (aR10085 == null && aBoolean10068) {
                Class101 class101 = method3685(262144, true, var_ha, -24018);
                var_r = class101 == null ? null : ((Class101) class101).aR1289;
            } else {
                var_r = aR10085;
                aR10085 = null;
            }
            if (var_r != null)
                Class340_Sub6.method3460(var_r, ((Interactable) this).aByte8322, ((Interactable) this).x, ((Interactable) this).y, null);
        }
    }

    final boolean method3563(boolean bool) {
        anInt10060++;
        if (bool != false)
            return true;
        if (aClass162_10079 == null)
            return false;
        return aClass162_10079.F();
    }

    final boolean method3568(int i) {
        anInt10078++;
        int i_16_ = 102 % ((i - 53) / 45);
        return aBoolean10077;
    }

    final void method3573(ha var_ha, byte i) {
        if (i <= 121)
            aShort10059 = (short) 125;
        anInt10058++;
    }

    public final void method41(int i, ha var_ha) {
        anInt10089++;
        if (i == 6120) {
            Object object = null;
            r var_r;
            if (aR10085 == null && aBoolean10068) {
                Class101 class101 = method3685(262144, true, var_ha, i + -30138);
                var_r = class101 == null ? null : ((Class101) class101).aR1289;
            } else {
                var_r = aR10085;
                aR10085 = null;
            }
            if (var_r != null)
                Class334.method3417(var_r, ((Interactable) this).aByte8322, ((Interactable) this).x, ((Interactable) this).y, null);
        }
    }

    private final Class162 method3684(ha var_ha, byte i, int i_17_) {
        anInt10057++;
        if (i <= 94)
            return null;
        if (aClass162_10079 != null && var_ha.b(aClass162_10079.ua(), i_17_) == 0)
            return aClass162_10079;
        Class101 class101 = method3685(i_17_, false, var_ha, -24018);
        if (class101 != null)
            return ((Class101) class101).aClass162_1283;
        return null;
    }

    final void method3572(Interactable interactable, ha var_ha, int i, int i_18_, int i_19_, boolean bool, int i_20_) {
        if (i_18_ < 109)
            method40((byte) 106);
        if (interactable instanceof Class346_Sub7_Sub4_Sub1) {
            Class346_Sub7_Sub4_Sub1 class346_sub7_sub4_sub1_21_ = (Class346_Sub7_Sub4_Sub1) interactable;
            if (aClass162_10079 != null && class346_sub7_sub4_sub1_21_.aClass162_10079 != null)
                aClass162_10079.method1428((class346_sub7_sub4_sub1_21_.aClass162_10079), i, i_20_, i_19_, bool);
        }
        anInt10062++;
    }

    public final int method43(byte i) {
        anInt10084++;
        if (i != -111)
            aClass162_10079 = null;
        return aByte10075;
    }

    public final int method40(byte i) {
        anInt10070++;
        if (i < 63)
            method3572(null, null, 40, -57, -47, true, 27);
        return aShort10059 & 0xffff;
    }

    public final int method46(byte i) {
        int i_22_ = -97 % ((-57 - i) / 53);
        anInt10065++;
        return 22;
    }

    final Class346_Sub10 method3578(int i, ha var_ha) {
        anInt10069++;
        if (aClass162_10079 == null)
            return null;
        if (i != -1)
            aIncommingOpcode_10087 = null;
        Viewport viewport = var_ha.o();
        viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
        Class346_Sub10 class346_sub10 = Class282_Sub21.method3013(aBoolean10067, (byte) 127, 1);
        if (Class357.aBoolean4416)
            aClass162_10079.method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), ObjectDefinition.anInt3100, 0);
        else
            aClass162_10079.method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), 0);
        return class346_sub10;
    }

    private final Class101 method3685(int i, boolean bool, ha var_ha, int i_23_) {
        anInt10061++;
        if (i_23_ != -24018)
            aR10085 = null;
        ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -45, 0xffff & aShort10059);
        s var_s;
        s var_s_24_;
        if (!aBoolean10082) {
            if (((Interactable) this).aByte8322 < 3)
                var_s = (Node_Sub14_Sub29.aSArray9471[1 + ((Interactable) this).aByte8322]);
            else
                var_s = null;
            var_s_24_ = (Node_Sub14_Sub29.aSArray9471[((Interactable) this).aByte8322]);
        } else {
            var_s = Node_Sub14_Sub29.aSArray9471[0];
            var_s_24_ = (Node_Sub14_Sub12_Sub1.aSArray10306[((Interactable) this).aByte8322]);
        }
        return class266.method2785(aByte10075, bool, null, i, ((Interactable) this).anInt8317, var_ha, (byte) -38, ((Interactable) this).y, 22, ((Interactable) this).x, var_s_24_, var_s);
    }

    final void method3577(int i) {
        anInt10072++;
        aBoolean10077 = false;
        if (aClass162_10079 != null)
            aClass162_10079.s(~0x10000 & aClass162_10079.ua());
        if (i != 131072)
            method3682(-118, -2, 96, 95, true, 9);
    }

    final boolean method3574(byte i) {
        anInt10083++;
        int i_25_ = -28 / ((14 - i) / 57);
        if (aClass162_10079 == null)
            return true;
        if (aClass162_10079.r())
            return false;
        return true;
    }

    final Class38 method3575(byte i, ha var_ha) {
        if (i >= -86)
            method40((byte) -45);
        anInt10086++;
        if (aClass38_10073 == null)
            aClass38_10073 = Class282_Sub11.method2965(((Interactable) this).y, ((Interactable) this).x, ((Interactable) this).anInt8317, 544, method3684(var_ha, (byte) 104, 0));
        return aClass38_10073;
    }

    public final void method44(boolean bool) {
        anInt10071++;
        if (bool == true) {
            if (aClass162_10079 != null)
                aClass162_10079.method1435();
        }
    }
}
