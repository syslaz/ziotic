/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

abstract class Class136 implements Interface5 {
    static int anInt4766;
    static int anInt4767;
    static int anInt4768;
    static int anInt4769;
    int anInt4770;
    static int anInt4771;
    private int anInt4772;
    static int anInt4773;
    static int anInt4774;
    private boolean aBoolean4775;
    static int anInt4776;
    static int anInt4777;
    static int anInt4778;
    ha_Sub2 aHa_Sub2_4779;
    private boolean aBoolean4780 = false;
    int anInt4781;
    static int anInt4782;
    static int anInt4783;
    static int anInt4784;
    int anInt4785;

    private final int method1240(int i) {
        if (i != 330)
            method1249(40);
        anInt4783++;
        int i_0_ = (((Class136) this).aHa_Sub2_4779.method898(((Class136) this).anInt4785, 6407) * anInt4772);
        if (aBoolean4775)
            return 4 * i_0_ / 3;
        return i_0_;
    }

    final int method1241(int i) {
        anInt4767++;
        if (i != 6598)
            ((Class136) this).aHa_Sub2_4779 = null;
        return ((Class136) this).anInt4781;
    }

    private final void method1242(int i, int i_1_) {
        anInt4774++;
        ((ha_Sub2) ((Class136) this).aHa_Sub2_4779).anInt5818 -= i_1_;
        if (i == 350)
            ((ha_Sub2) ((Class136) this).aHa_Sub2_4779).anInt5818 += method1240(330);
    }

    static final void method1243(int i, boolean bool) {
        Node_Sub37.method2594(i ^ 0xff9aba);
        anInt4782++;
        if (Class45.method328((byte) 13, Class273.anInt5008)) {
            Class173.anInt2014++;
            if ((Class173.anInt2014 ^ 0xffffffff) <= -51 || bool) {
                if (i != -16777216)
                    method1248((byte) -30, null);
                Class173.anInt2014 = 0;
                if (!Player.aBoolean10544 && Class289.aClass111_3398 != null) {
                    Class338.requestAttempts++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(i ^ ~0xfffffe, (Class346_Sub5_Sub2.aISAACCypher_9889), Class232.aOutgoingOpcode_2612);
                    Class226_Sub3.method1814(class248_sub36, i ^ ~0xffffff);
                    //System.out.println("OUT 83-1");
                    try {
                        Class285.method3074(7388);
                    } catch (java.io.IOException ioexception) {
                        Player.aBoolean10544 = true;
                    }
                }
                Node_Sub37.method2594(i ^ 0xff9aba);
            }
        }
    }

    private final void method1244(byte i) {
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        anInt4777++;
        if (!aBoolean4780) {
            OpenGL.glTexParameteri(((Class136) this).anInt4770, 10241, !aBoolean4775 ? 9728 : 9984);
            OpenGL.glTexParameteri(((Class136) this).anInt4770, 10240, 9728);
        } else {
            OpenGL.glTexParameteri(((Class136) this).anInt4770, 10241, !aBoolean4775 ? 9729 : 9987);
            OpenGL.glTexParameteri(((Class136) this).anInt4770, 10240, 9729);
        }
        int i_2_ = -98 / ((i - 71) / 46);
    }

    final void method1245(boolean bool, int i) {
        if (i != 31005)
            ((Class136) this).anInt4770 = -2;
        if (aBoolean4775 == !bool) {
            int i_3_ = method1240(330);
            aBoolean4775 = true;
            method1244((byte) 121);
            method1242(350, i_3_);
        }
        anInt4776++;
    }

    final void method1246(boolean bool, boolean bool_4_) {
        if (aBoolean4780 != bool_4_) {
            aBoolean4780 = bool_4_;
            method1244((byte) 125);
        }
        anInt4778++;
        if (bool != false)
            method1247((byte) 53);
    }

    final boolean method1247(byte i) {
        if (i != -70)
            return true;
        anInt4766++;
        if (((ha_Sub2) ((Class136) this).aHa_Sub2_4779).aBoolean5836) {
            int i_5_ = method1240(i ^ ~0x10f);
            ((Class136) this).aHa_Sub2_4779.method889(-2, this);
            OpenGL.glGenerateMipmapEXT(((Class136) this).anInt4770);
            aBoolean4775 = true;
            method1244((byte) -21);
            method1242(350, i_5_);
            return true;
        }
        return false;
    }

    static final void method1248(byte i, ha var_ha) {
        anInt4784++;
        int i_6_ = 0;
        int i_7_ = 0;
        if (Node_Sub8_Sub6.aBoolean8949) {
            i_6_ = Class337.method3420(-2);
            i_7_ = RSInterface2.method3770((byte) -101);
        }
        var_ha.KA(i_6_, i_7_, Class146.anInt1724 - -i_6_, i_7_ + 350);
        var_ha.aa(i_6_, i_7_, Class146.anInt1724, 350, 0x332277 | Class65.anInt894 << -1810293000, 1);
        Class210.method1724(i_6_ + Class146.anInt1724, i_6_, (byte) -95, 350 + i_7_, i_7_);
        int i_8_ = 350 / Class83.anInt1031;
        if (Class291.anInt4742 > 0) {
            int i_9_ = -4 + (346 - Class83.anInt1031);
            int i_10_ = i_8_ * i_9_ / (-1 + Class291.anInt4742 + i_8_);
            int i_11_ = 4;
            if (Class291.anInt4742 > 1)
                i_11_ += ((-i_10_ + i_9_) * (-Class32.anInt387 + Class291.anInt4742 + -1) / (-1 + Class291.anInt4742));
            var_ha.aa(Class146.anInt1724 + (i_6_ + -16), i_11_ + i_7_, 12, i_10_, 0x332277 | Class65.anInt894 << -888097800, 2);
            for (int i_12_ = Class32.anInt387; (i_12_ < i_8_ + Class32.anInt387 && (i_12_ ^ 0xffffffff) > (Class291.anInt4742 ^ 0xffffffff)); i_12_++) {
                String[] strings = Class80.method583(-115, Class162.aStringArray1909[i_12_], '\010');
                int i_13_ = (-16 + (Class146.anInt1724 + -8)) / strings.length;
                for (int i_14_ = 0; strings.length > i_14_; i_14_++) {
                    int i_15_ = i_13_ * i_14_ + 8;
                    var_ha.KA(i_15_ + i_6_, i_7_, -8 + (i_13_ + i_6_ + i_15_), i_7_ - -350);
                    Canvas_Sub1.aClass48_71.method369(true, i_6_ + i_15_, Class282_Sub1.method2924(strings[i_14_], 88), (-Class128.anInt1567 + i_7_ + (350 - (2 + (((Class285) (Node_Sub14_Sub31.aClass285_9492)).anInt3368 + (Class83.anInt1031 * (i_12_ - Class32.anInt387)))))), -16777216, -1);
                }
            }
        }
        Class168.aClass48_1968.method376(-1, Class146.anInt1724 + (i_6_ + -25), -16777216, (byte) -108, i_7_ + 330, "Build: 640");
        var_ha.KA(i_6_, i_7_, i_6_ + Class146.anInt1724, 350 + i_7_);
        var_ha.method817(32, -Class128.anInt1567 + (i_7_ + 350), Class146.anInt1724, i_6_, -1);
        Node_Sub14_Sub27.aClass48_9449.method369(true, 10 + i_6_, "--> " + Class282_Sub1.method2924(aa.aString104, 82), 349 + i_7_ - ((Class285) Class264.aClass285_2996).anInt3368, -16777216, -1);
        if (i <= 18)
            method1250(-111, '\017');
        if (Class172.aBoolean1997) {
            int i_16_ = -1;
            if (Node_Sub18.anInt7027 % 30 > 15)
                i_16_ = 16777215;
            var_ha.method822(i_16_, 1, 12, 339 + (i_7_ + -((Class285) Class264.aClass285_2996).anInt3368), ((Class264.aClass285_2996.method3068(-1, "--> " + Class282_Sub1.method2924(aa.aString104, 74).substring(0, Node_Sub19.anInt7040))) + (i_6_ - -10)));
        }
    }

    final void method1249(int i) {
        int i_17_ = -36 % ((i - 43) / 36);
        anInt4771++;
        if ((((Class136) this).anInt4781 ^ 0xffffffff) < -1) {
            ((Class136) this).aHa_Sub2_4779.method896(((Class136) this).anInt4781, 0, method1240(330));
            ((Class136) this).anInt4781 = 0;
        }
    }

    protected final void finalize() throws Throwable {
        method1249(118);
        anInt4768++;
        super.finalize();
    }

    static final boolean method1250(int i, char c) {
        if (i != 65)
            method1248((byte) -22, null);
        anInt4773++;
        if (((c ^ 0xffffffff) > -49 || c > 57) && (c < 65 || c > 90) && (c < 97 || c > 122))
            return false;
        return true;
    }

    Class136(ha_Sub2 var_ha_Sub2, int i, int i_18_, int i_19_, boolean bool) {
        aBoolean4775 = bool;
        ((Class136) this).anInt4770 = i;
        ((Class136) this).aHa_Sub2_4779 = var_ha_Sub2;
        anInt4772 = i_19_;
        ((Class136) this).anInt4785 = i_18_;
        OpenGL.glGenTextures(1, Class282_Sub19.anIntArray7791, 0);
        ((Class136) this).anInt4781 = Class282_Sub19.anIntArray7791[0];
        method1242(350, 0);
    }

    public abstract void method18(byte i);
}
