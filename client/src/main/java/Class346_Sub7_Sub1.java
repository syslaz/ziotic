/* Class346_Sub7_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class346_Sub7_Sub1 extends Interactable {
    short aShort9901;
    static int anInt9902;
    static int[] anIntArray9903;
    static int anInt9904;
    static int anInt9905;
    static int anInt9906;
    static int anInt9907 = 0;
    static int anInt9908;
    static int anInt9909;
    short aShort9910;
    static int anInt9911;
    static int cameraPosX;
    static int[] anIntArray9913;
    static int anInt9914;

    final void method3572(Interactable interactable, ha var_ha, int i, int i_0_, int i_1_, boolean bool, int i_2_) {
        anInt9905++;
        if (i_0_ <= 109)
            ((Class346_Sub7_Sub1) this).aShort9901 = (short) 101;
        throw new IllegalStateException();
    }

    public static void method3582(int i) {
        anIntArray9903 = null;
        anIntArray9913 = null;
        if (i != 16)
            cameraPosX = 105;
    }

    final boolean getSomeBoolean(int i) {
        if (i > -100)
            anInt9908 = 11;
        anInt9911++;
        return (RSInterface2.aBooleanArrayArray4314[(Node_Sub47.anInt7416 + (-Class286.anInt3375 + (((Interactable) this).x >> Class96.anInt1249)))][Node_Sub47.anInt7416 + ((((Interactable) this).y >> Class96.anInt1249) - Class152.anInt1808)]);
    }

    final boolean method3576(ha var_ha, byte i) {
        if (i != 35)
            return true;
        anInt9906++;
        return (Class256.method2747(((Interactable) this).y >> Class96.anInt1249, this.method3580(-32768), ((Interactable) this).aByte8322, ((Interactable) this).x >> Class96.anInt1249, 100));
    }

    final void method3577(int i) {
        anInt9904++;
        if (i == 131072)
            throw new IllegalStateException();
    }

    static final void method3583(String string, int i, boolean bool) {
        string = string.toLowerCase();
        anInt9902++;
        short[] is = new short[16];
        int i_3_ = 0;
        int i_4_ = bool ? 32768 : 0;
        int i_5_ = (i_4_ - -(bool ? ((Class152) Class44_Sub1.aClass152_5288).anInt1813 : ((Class152) Class44_Sub1.aClass152_5288).anInt1816));
        for (int i_6_ = i_4_; i_6_ < i_5_; i_6_++) {
            Node_Sub8_Sub20 class248_sub8_sub20 = Class44_Sub1.aClass152_5288.method1356(true, i_6_);
            if (((Node_Sub8_Sub20) class248_sub8_sub20).aBoolean9104 && class248_sub8_sub20.method2155(false).toLowerCase().indexOf(string) != -1) {
                if ((i_3_ ^ 0xffffffff) <= -51) {
                    Class346_Sub7_Sub2_Sub4.anInt10111 = -1;
                    Class19.aShortArray305 = null;
                    return;
                }
                if (i_3_ >= is.length) {
                    short[] is_7_ = new short[is.length * 2];
                    for (int i_8_ = 0; i_3_ > i_8_; i_8_++)
                        is_7_[i_8_] = is[i_8_];
                    is = is_7_;
                }
                is[i_3_++] = (short) i_6_;
            }
        }
        if (i != 2)
            method3583(null, 79, false);
        Class346_Sub7_Sub2_Sub4.anInt10111 = i_3_;
        Class19.aShortArray305 = is;
        Node_Sub21.anInt7054 = 0;
        String[] strings = new String[Class346_Sub7_Sub2_Sub4.anInt10111];
        for (int i_9_ = 0; Class346_Sub7_Sub2_Sub4.anInt10111 > i_9_; i_9_++)
            strings[i_9_] = Class44_Sub1.aClass152_5288.method1356(true, is[i_9_]).method2155(false);
        Class340_Sub9.method3469(strings, Class19.aShortArray305, -90);
    }

    final boolean method3568(int i) {
        int i_10_ = -78 % ((53 - i) / 45);
        anInt9914++;
        return false;
    }

    static final Class346_Sub7_Sub4 method3584(int i, int i_11_, int i_12_) {
        Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_11_][i_12_];
        if (class137 == null || ((Class137) class137).aClass346_Sub7_Sub4_1645 == null)
            return null;
        return ((Class137) class137).aClass346_Sub7_Sub4_1645;
    }

    final int method3566(Node_Sub42[] class248_sub42s, byte i) {
        if (i != -58)
            return 89;
        anInt9909++;
        return this.method3581(class248_sub42s, (((Interactable) this).x >> Class96.anInt1249), (byte) 85, (((Interactable) this).y >> Class96.anInt1249));
    }

    Class346_Sub7_Sub1(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
        ((Class346_Sub7_Sub1) this).aShort9901 = (short) i_18_;
        ((Interactable) this).y = i_14_;
        ((Interactable) this).aByte8322 = (byte) i_16_;
        ((Class346_Sub7_Sub1) this).aShort9910 = (short) i_17_;
        ((Interactable) this).x = i;
        ((Interactable) this).anInt8317 = i_13_;
        ((Interactable) this).plane = (byte) i_15_;
    }

    static {
        anIntArray9903 = new int[13];
        anIntArray9913 = new int[2];
    }
}
