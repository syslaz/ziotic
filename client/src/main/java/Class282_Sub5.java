/* Class282_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub5 extends Class282 {
    static Class323 aClass323_7634;
    static int anInt7635;
    static int anInt7636;
    static int anInt7637;
    static int anInt7638;
    static int anInt7639;
    static int anInt7640;
    static int anInt7641;

    final int method2917(int i, int i_0_) {
        anInt7637++;
        if (i != 0)
            method2939((byte) -23);
        return 1;
    }

    static final int method2938(int i, int i_1_, byte i_2_, int i_3_) {
        anInt7640++;
        int i_4_ = -i_1_ + 255;
        if (i_2_ <= 56)
            return 82;
        i_3_ = ((0xff00 & i_3_) * i_1_ & 0xff0000 | (i_3_ & 0xff00ff) * i_1_ & ~0xff00ff) >>> -31032088;
        return (((0xff0000 & (0xff00 & i) * i_4_ | ~0xff00ff & (0xff00ff & i) * i_4_) >>> -330578872) + i_3_);
    }

    final int method2919(boolean bool) {
        if (bool != false)
            return -85;
        anInt7639++;
        return 1;
    }

    public static void method2939(byte i) {
        int i_5_ = 65 / ((i - -20) / 60);
        aClass323_7634 = null;
    }

    final void method2918(byte i) {
        if (i == 98) {
            anInt7635++;
            if (((Class282) this).aClass248_Sub45_3321.method2643(7108) == Class359.aClass215_4430)
                ((Class282) this).anInt3320 = 2;
            if (((Class282) this).anInt3320 < 0 || ((Class282) this).anInt3320 > 2)
                ((Class282) this).anInt3320 = method2919(false);
        }
    }

    Class282_Sub5(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final int method2940(boolean bool) {
        if (bool != true)
            return 99;
        anInt7638++;
        return ((Class282) this).anInt3320;
    }

    static final void method2941(byte i, Class381 class381) {
        Class130.anInt1580 = 0;
        Class221.anInt2535 = 0;
        anInt7636++;
        Node_Sub2_Sub3.aClass360_8861 = new Class360();
        Class340.aClass346_Sub5_Sub2_Sub1Array3966 = new Class346_Sub5_Sub2_Sub1[1024];
        if (i != -43)
            aClass323_7634 = null;
        Class158.aClass346_Sub8Array1877 = (new Class346_Sub8
                [Class186.anIntArray2168[Node_Sub2_Sub2.anInt8840] + 1]);
        Node_Sub29.anInt7168 = 0;
        Node_Sub14_Sub15.anInt9323 = 0;
        Class36.method283(5, class381);
        Class282_Sub19.method2999(false, class381);
    }

    Class282_Sub5(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    final void method2922(boolean bool, int i) {
        ((Class282) this).anInt3320 = i;
        anInt7641++;
        if (bool != true)
            aClass323_7634 = null;
    }
}
