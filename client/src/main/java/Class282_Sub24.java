/* Class282_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub24 extends Class282 {
    static int anInt7836 = 0;
    static int anInt7837 = -1;
    static int anInt7838;
    static float aFloat7839;
    static int anInt7840;
    static int anInt7841;
    static int anInt7842;
    static int anInt7843;
    static int anInt7844;

    final int method3020(boolean bool) {
        anInt7843++;
        if (bool != true)
            anInt7837 = 91;
        return ((Class282) this).anInt3320;
    }

    static final void method3021(int i) {
        anInt7842++;
        if (Class179.anInt2084 != -1) {
            int i_0_ = Class46.aClass269_600.method2817((byte) -121);
            int i_1_ = Class46.aClass269_600.method2809(i ^ 0x49);
            Node_Sub39 class248_sub39 = (Node_Sub39) Class368.aClass293_4524.method3119(2);
            if (class248_sub39 != null) {
                i_0_ = class248_sub39.method2606(-15204);
                i_1_ = class248_sub39.method2601((byte) 121);
            }
            int i_2_ = i;
            int i_3_ = 0;
            if (Node_Sub8_Sub6.aBoolean8949) {
                i_2_ = Class337.method3420(i + -2);
                i_3_ = RSInterface2.method3770((byte) -42);
            }
            Class23.method235(i_0_, i_1_, i_2_, i_2_, i_3_, i_3_, i ^ ~0x11, i_2_ + i_0_, i_3_ + i_1_, Class146.anInt1724 + i_2_, Class282_Sub20.anInt7800 + i_3_, Class179.anInt2084);
            if (WorldAddress.aClass354_1193 != null)
                Class182.method1608((byte) 19, i_1_ - -i_3_, i_2_ + i_0_);
        }
    }

    final void method2922(boolean bool, int i) {
        ((Class282) this).anInt3320 = i;
        anInt7841++;
        if (bool != true)
            method2918((byte) -63);
    }

    final int method2917(int i, int i_4_) {
        if (i != 0)
            return -98;
        anInt7844++;
        return 1;
    }

    final void method2918(byte i) {
        if (i != 98)
            method2919(false);
        if ((((Class282) this).anInt3320 ^ 0xffffffff) > -1 || ((Class282) this).anInt3320 > 4)
            ((Class282) this).anInt3320 = method2919(false);
        anInt7840++;
    }

    Class282_Sub24(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    Class282_Sub24(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    final int method2919(boolean bool) {
        anInt7838++;
        if (bool != false)
            return 83;
        return 0;
    }
}
