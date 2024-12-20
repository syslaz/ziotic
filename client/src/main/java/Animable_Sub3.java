/* Class346_Sub7_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub7_Sub2_Sub3 extends Animable {
    static int anInt10374;
    private int anInt10375;
    static int anInt10376;
    static int anInt10377;
    private boolean aBoolean10378;
    static int anInt10379;
    static int anInt10380;
    static int[] anIntArray10381 = new int[1024];
    private int anInt10382;
    private int anInt10383 = 0;
    static int anInt10384;
    static Class215 aClass215_10385 = new Class215("runescape", 0);
    private int anInt10386;
    static int anInt10387;
    private Class346_Sub8 aClass346_Sub8_10388;
    static int anInt10389;
    int anInt10390;
    private int anInt10391;
    static int anInt10392;
    static int anInt10393;
    boolean aBoolean10394;
    static Class264 aClass264_10395 = new Class264(2);
    static int anInt10396;
    static int anInt10397;
    private int anInt10398;
    static int anInt10399;
    static int anInt10400;
    private Class182 aClass182_10401;
    static int anInt10402;
    static int anInt10403;
    static int anInt10404;
    private int anInt10405;
    static int anInt10406;

    final void method3616(byte i, int i_0_) {
        anInt10380++;
        if (!((Class346_Sub7_Sub2_Sub3) this).aBoolean10394) {
            if (i != 0)
                anInt10386 = 16;
            anInt10405 += i_0_;
            while ((((Class182) aClass182_10401).anIntArray2113[anInt10375] ^ 0xffffffff) > (anInt10405 ^ 0xffffffff)) {
                anInt10405 -= ((Class182) aClass182_10401).anIntArray2113[anInt10375];
                anInt10375++;
                if (anInt10375 >= ((Class182) aClass182_10401).anIntArray2117.length) {
                    ((Class346_Sub7_Sub2_Sub3) this).aBoolean10394 = true;
                    break;
                }
            }
            if (!((Class346_Sub7_Sub2_Sub3) this).aBoolean10394)
                Class158.method1396(aClass182_10401, anInt10375, this, true);
        }
    }

    final Class346_Sub10 method3578(int i, ha var_ha) {
        anInt10387++;
        Class162 class162 = method3618((i != (anInt10386 ^ 0xffffffff) ? 5 : 0) | 0x800, var_ha, -1, anInt10391);
        if (class162 == null)
            return null;
        if (anInt10386 != 0)
            class162.a(2048 * anInt10386);
        Viewport viewport = var_ha.o();
        viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
        method3619(false, var_ha, viewport, class162);
        Class346_Sub10 class346_sub10 = Class282_Sub21.method3013(false, (byte) 116, 1);
        if (Class357.aBoolean4416)
            class162.method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), ObjectDefinition.anInt3100, 0);
        else
            class162.method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), 0);
        if (aClass346_Sub8_10388 != null) {
            Class338 class338 = aClass346_Sub8_10388.method3714();
            if (!Class357.aBoolean4416)
                var_ha.a(class338);
            else
                var_ha.a(class338, ObjectDefinition.anInt3100);
        }
        aBoolean10378 = class162.F();
        anInt10383 = class162.fa();
        anInt10382 = class162.ma();
        return class346_sub10;
    }

    final void method3617(boolean bool) {
        anInt10406++;
        if (bool == false) {
            if (aClass346_Sub8_10388 != null)
                aClass346_Sub8_10388.method3706();
        }
    }

    final boolean method3568(int i) {
        anInt10403++;
        int i_1_ = 1 / ((53 - i) / 45);
        return false;
    }

    private final Class162 method3618(int i, ha var_ha, int i_2_, int i_3_) {
        anInt10379++;
        Class51 class51 = Class279_Sub2.aClass151_7577.method1353(i_3_, i_2_);
        s var_s = (Node_Sub14_Sub29.aSArray9471[((Interactable) this).plane]);
        s var_s_4_ = ((((Interactable) this).aByte8322 ^ 0xffffffff) <= -4 ? null : (Node_Sub14_Sub29.aSArray9471[1 + ((Interactable) this).aByte8322]));
        if (((Class346_Sub7_Sub2_Sub3) this).aBoolean10394)
            return class51.method405(((Interactable) this).y, var_s_4_, i, Class235.aClass356_2617, -1, var_ha, var_s, -1, 0, ((Interactable) this).x, ((Interactable) this).anInt8317, true, true);
        return class51.method405(((Interactable) this).y, var_s_4_, i, Class235.aClass356_2617, anInt10375, var_ha, var_s, anInt10398, anInt10405, ((Interactable) this).x, ((Interactable) this).anInt8317, true, true);
    }

    private final void method3619(boolean bool, ha var_ha, Viewport viewport, Class162 class162) {
        anInt10384++;
        if (bool != false)
            anInt10391 = -96;
        class162.method1442(viewport);
        Class40[] class40s = class162.method1431();
        Class124[] class124s = class162.method1426();
        if ((aClass346_Sub8_10388 == null || ((Class346_Sub8) aClass346_Sub8_10388).aBoolean8330) && (class40s != null || class124s != null))
            aClass346_Sub8_10388 = Class346_Sub8.method3716(Node_Sub18.anInt7027, true);
        if (aClass346_Sub8_10388 != null) {
            aClass346_Sub8_10388.method3712(var_ha, (long) Node_Sub18.anInt7027, class40s, class124s, false);
            aClass346_Sub8_10388.method3703(((Interactable) this).plane, ((Animable) this).x1, ((Animable) this).x2, ((Animable) this).y1, ((Animable) this).y2);
        }
    }

    public static void method3620(byte i) {
        anIntArray10381 = null;
        aClass264_10395 = null;
        aClass215_10385 = null;
        if (i != 52)
            method3622(-10, 78, 5, (byte) 74);
    }

    final boolean method3563(boolean bool) {
        anInt10374++;
        if (bool != false)
            method3618(-29, null, -28, -38);
        return aBoolean10378;
    }

    final boolean method3574(byte i) {
        int i_5_ = -93 % ((14 - i) / 57);
        anInt10402++;
        return false;
    }

    final void method3573(ha var_ha, byte i) {
        anInt10389++;
        Class162 class162 = method3618(0, var_ha, -1, anInt10391);
        if (class162 != null) {
            Viewport viewport = var_ha.o();
            viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
            method3619(false, var_ha, viewport, class162);
        }
        if (i <= 121)
            aBoolean10378 = true;
    }

    Class346_Sub7_Sub2_Sub3(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
        super(i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, false, (byte) 0);
        anInt10375 = 0;
        anInt10386 = 0;
        aBoolean10378 = true;
        anInt10382 = 0;
        anInt10398 = -1;
        ((Class346_Sub7_Sub2_Sub3) this).aBoolean10394 = false;
        anInt10405 = 0;
        anInt10391 = i;
        anInt10386 = i_17_;
        ((Class346_Sub7_Sub2_Sub3) this).anInt10390 = i_7_ - -i_6_;
        Class51 class51 = Class279_Sub2.aClass151_7577.method1353(anInt10391, -1);
        int i_18_ = ((Class51) class51).anInt690;
        if (i_18_ != -1) {
            aClass182_10401 = Class235.aClass356_2617.method3790((byte) -90, i_18_);
            ((Class346_Sub7_Sub2_Sub3) this).aBoolean10394 = false;
        } else
            ((Class346_Sub7_Sub2_Sub3) this).aBoolean10394 = true;
        if ((((Class346_Sub7_Sub2_Sub3) this).anInt10390 ^ 0xffffffff) == (i_7_ ^ 0xffffffff))
            Class158.method1396(aClass182_10401, anInt10375, this, true);
    }

    protected final void finalize() {
        anInt10396++;
        if (aClass346_Sub8_10388 != null)
            aClass346_Sub8_10388.method3706();
    }

    final void method3572(Interactable interactable, ha var_ha, int i, int i_19_, int i_20_, boolean bool, int i_21_) {
        if (i_19_ >= 109) {
            anInt10377++;
            throw new IllegalStateException();
        }
    }

    final int method3567(byte i) {
        anInt10392++;
        if (i <= 81)
            anInt10391 = -36;
        return anInt10382;
    }

    final boolean method3579(ha var_ha, int i, int i_22_, byte i_23_) {
        anInt10376++;
        if (i_23_ != 103)
            return false;
        return false;
    }

    static final boolean method3621(byte i, int i_24_, int i_25_) {
        anInt10393++;
        if (i >= -24)
            anIntArray10381 = null;
        if ((0x22 & i_25_ ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    final int method3580(int i) {
        anInt10399++;
        if (i != -32768)
            aClass182_10401 = null;
        return anInt10383;
    }

    static final void method3622(int i, int i_26_, int i_27_, byte i_28_) {
        if (i_28_ != 50)
            method3622(82, -1, -64, (byte) 46);
        r.aByteArrayArrayArray9033 = new byte[i_27_][i][i_26_];
        anInt10404++;
    }

    final void method3577(int i) {
        anInt10400++;
        if (i != 131072)
            anInt10405 = -48;
        throw new IllegalStateException();
    }

    final Class38 method3575(byte i, ha var_ha) {
        if (i >= -86)
            return null;
        anInt10397++;
        return null;
    }
}
