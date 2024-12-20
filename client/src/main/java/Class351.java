/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.net.URL;

final class Class351 implements Interface2 {
    static int anInt4730;
    static int anInt4731;
    static int anInt4732;
    int anInt4733;
    static IncommingOpcode aIncommingOpcode_4734 = new IncommingOpcode(101, 4);
    float[] aFloatArray4735;
    static int anInt4736;
    int anInt4737;

    static final Node_Sub35 method3742(byte i) {
        anInt4732++;
        if (Class116.aClass293_1443 == null || Class19.aClass251_299 == null)
            return null;
        if (i != -24)
            anInt4736 = -10;
        for (Node_Sub35 class248_sub35 = ((Node_Sub35) Class19.aClass251_299.method2715((byte) -123)); class248_sub35 != null; class248_sub35 = (Node_Sub35) Class19.aClass251_299.method2715((byte) -120)) {
            Class56 class56 = Class116.aClass257_1436.method2750((byte) 81, (((Node_Sub35) class248_sub35).anInt7243));
            if (class56 != null && ((Class56) class56).aBoolean738 && class56.method449((byte) -14, Class116.anInterface3_1438))
                return class248_sub35;
        }
        return null;
    }

    static final boolean method3743(byte i, int i_0_, int i_1_) {
        anInt4731++;
        int i_2_ = 14 / ((i - 73) / 36);
        if ((0x84080 & i_1_) == 0)
            return false;
        return true;
    }

    static final Class322 method3744(int i, Class174 class174, String string, byte i_3_) {
        anInt4730++;
        if (i == 0)
            return class174.method1573(string, -12903);
        if (i == 1) {
            try {
                Class78.method569("openjs", 82, new Object[]{new URL(Class158.anApplet1881.getCodeBase(), string).toString()}, Class158.anApplet1881);
                Class322 class322 = new Class322();
                class322.anInt3788 = 1;
                return class322;
            } catch (Throwable throwable) {
                Class322 class322 = new Class322();
                class322.anInt3788 = 2;
                return class322;
            }
        }
        int i_4_ = -112 % ((i_3_ - -62) / 58);
        if (i == 2) {
            try {
                //Class158.anApplet1881.getAppletContext().showDocument(new URL(Class158.anApplet1881.getCodeBase(), string), "_blank");
                Class322 class322 = new Class322();
                class322.anInt3788 = 1;
                return class322;
            } catch (Exception exception) {
                Class322 class322 = new Class322();
                class322.anInt3788 = 2;
                return class322;
            }
        }
        if (i == 3) {
            try {
                Class78.method571("loggedout", -8364, Class158.anApplet1881);
            } catch (Throwable throwable) {
                /* empty */
            }
            try {
                Class158.anApplet1881.getAppletContext().showDocument(new URL(Class158.anApplet1881.getCodeBase(), string), "_top");
                Class322 class322 = new Class322();
                class322.anInt3788 = 1;
                return class322;
            } catch (Exception exception) {
                Class322 class322 = new Class322();
                class322.anInt3788 = 2;
                return class322;
            }
        }
        throw new IllegalArgumentException();
    }

    static final void method3745(int i, int i_5_, int i_6_) {
        Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_5_][i_6_];
        if (class137 != null) {
            aa_Sub2.method164(((Class137) class137).aClass346_Sub7_Sub4_1645);
            if (((Class137) class137).aClass346_Sub7_Sub4_1645 != null)
                ((Class137) class137).aClass346_Sub7_Sub4_1645 = null;
        }
    }

    public static void method3746(int i) {
        aIncommingOpcode_4734 = null;
        if (i != 1)
            method3744(-11, null, null, (byte) 119);
    }

    static final boolean method3747(Interactable interactable, boolean bool, byte[][][] is, int i, byte i_7_) {
        if (!Node_Sub8_Sub20.aBoolean9094)
            return false;
        int i_8_ = ((Interactable) interactable).x >> Class96.anInt1249;
        int i_9_ = i_8_;
        int i_10_ = ((Interactable) interactable).y >> Class96.anInt1249;
        int i_11_ = i_10_;
        if (interactable instanceof Animable) {
            i_9_ = (((Animable) (Animable) interactable).x2);
            i_11_ = (((Animable) (Animable) interactable).y2);
            i_8_ = (((Animable) (Animable) interactable).x1);
            i_10_ = (((Animable) (Animable) interactable).y1);
        }
        for (int i_12_ = i_8_; i_12_ <= i_9_; i_12_++) {
            for (int i_13_ = i_10_; i_13_ <= i_11_; i_13_++) {
                if ((((Interactable) interactable).aByte8322 < Class111_Sub1.anInt5531) && i_12_ >= Node_Sub14.anInt6982 && i_12_ < Class269.anInt3133 && i_13_ >= Animable.anInt9925 && i_13_ < Class57.anInt791) {
                    if ((is != null && ((Interactable) interactable).plane >= i && (is[((Interactable) interactable).plane][i_12_][i_13_]) == i_7_) || !interactable.getSomeBoolean(-107) || interactable.method3576(r.aHa9032, (byte) 35)) {
                        if (!bool && i_12_ >= Class286.anInt3375 - 16 && i_12_ <= Class286.anInt3375 + 16 && i_13_ >= Class152.anInt1808 - 16 && i_13_ <= Class152.anInt1808 + 16) {
                            if (Class252.aBoolean2841) {
                                Class345.aClass344Array4093[Class34.anInt394++].method3516(interactable, (byte) -104);
                                Class34.anInt394 %= Viewport.anInt2651;
                            } else
                                interactable.method3573(r.aHa9032, (byte) 125);
                        }
                    } else
                        return false;
                }
            }
        }
        return true;
    }

    Class351(int i, int i_14_) {
        ((Class351) this).aFloatArray4735 = new float[i * i_14_];
        ((Class351) this).anInt4733 = i;
        ((Class351) this).anInt4737 = i_14_;
    }
}
