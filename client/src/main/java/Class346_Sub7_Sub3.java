/* Class346_Sub7_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class346_Sub7_Sub3 extends Interactable {
    static int anInt9932;
    static OutgoingOpcode aOutgoingOpcode_9933 = new OutgoingOpcode(1, 7);
    static int anInt9934;
    static int anInt9935;
    static int anInt9936;
    static int anInt9937;
    static int anInt9938;
    static int anInt9939;
    static int anInt9940;
    static boolean aBoolean9941 = false;
    static IncommingOpcode aIncommingOpcode_9942 = new IncommingOpcode(29, 8);
    static int[] anIntArray9943 = new int[8];
    static IncommingOpcode aIncommingOpcode_9944 = new IncommingOpcode(118, -2);

    static final int method3672(byte i) {
        anInt9934++;
        if (Node_Sub48.aFrame7432 != null)
            return 3;
        if (i != -112)
            method3672((byte) 21);
        if (Class235.aBoolean2621)
            return 2;
        return 1;
    }

    Class346_Sub7_Sub3(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        ((Interactable) this).aByte8322 = (byte) i_3_;
        ((Interactable) this).anInt8317 = i_0_;
        ((Interactable) this).plane = (byte) i_2_;
        ((Interactable) this).y = i_1_;
        ((Interactable) this).x = i;
    }

    public static void method3673(int i) {
        aOutgoingOpcode_9933 = null;
        aIncommingOpcode_9942 = null;
        aIncommingOpcode_9944 = null;
        if (i != 3)
            method3673(-66);
        anIntArray9943 = null;
    }

    final boolean method3568(int i) {
        anInt9940++;
        int i_4_ = -31 / ((i - 53) / 45);
        return false;
    }

    final void method3577(int i) {
        anInt9938++;
        if (i != 131072)
            getSomeBoolean(-57);
        throw new IllegalStateException();
    }

    final boolean getSomeBoolean(int i) {
        if (i > -100)
            aIncommingOpcode_9944 = null;
        anInt9939++;
        return (RSInterface2.aBooleanArrayArray4314[Node_Sub47.anInt7416 + ((((Interactable) this).x >> Class96.anInt1249) + -Class286.anInt3375)][((((Interactable) this).y >> Class96.anInt1249) + (-Class152.anInt1808 - -Node_Sub47.anInt7416))]);
    }

    final void method3572(Interactable interactable, ha var_ha, int i, int i_5_, int i_6_, boolean bool, int i_7_) {
        if (i_5_ <= 109)
            method3568(-61);
        anInt9932++;
        throw new IllegalStateException();
    }

    final boolean method3576(ha var_ha, byte i) {
        anInt9936++;
        Class49 class49 = Class316_Sub2.method3300(((Interactable) this).plane, (((Interactable) this).x >> Class96.anInt1249), (((Interactable) this).y >> Class96.anInt1249));
        if (i != 35)
            aBoolean9941 = true;
        if (class49 == null || !((Animable) ((Class49) class49).aAnimable_656).aBoolean9927)
            return Class249.method2696((byte) -111, ((Interactable) this).plane, (((Interactable) this).x >> Class96.anInt1249), (((Interactable) this).y >> Class96.anInt1249));
        return Class256.method2747((((Interactable) this).y >> Class96.anInt1249), (((Class49) class49).aAnimable_656.method3580(i + -32803) - -this.method3580(-32768)), ((Interactable) this).plane, (((Interactable) this).x >> Class96.anInt1249), i ^ 0x47);
    }

    final int method3566(Node_Sub42[] class248_sub42s, byte i) {
        anInt9937++;
        if (i != -58)
            method3568(-21);
        return this.method3581(class248_sub42s, (((Interactable) this).x >> Class96.anInt1249), (byte) 85, (((Interactable) this).y >> Class96.anInt1249));
    }
}
