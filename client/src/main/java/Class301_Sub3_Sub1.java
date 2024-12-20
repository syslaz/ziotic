/* Class301_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class301_Sub3_Sub1 extends Class301_Sub3 {
    static int anInt9971;
    static int anInt9972;
    static int[] anIntArray9973 = new int[14];
    static Class131 aClass131_9974;
    static int cameraYaw;
    static int[][] anIntArrayArray9976 = new int[128][128];

    final void method3193(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        if (i == -3832) {
            anInt9972++;
            int i_4_ = ((Class301_Sub3) this).aClass129_8445.method1169();
            int i_5_ = (((Class225_Sub1_Sub1) (Class225_Sub1_Sub1) ((Class301) this).aClass225_4932).anInt9987 * Class340_Sub9.method3474(-16632) / 10 % i_4_);
            ((Class301_Sub3) this).aClass129_8445.method1182(i_5_ + i_3_ + -i_4_, i_0_, -i_5_ + i_2_ + i_4_, i_1_);
        }
    }

    static final void method3195(int i, int i_6_, int i_7_, boolean bool, byte i_8_, int i_9_, Class381 class381) {
        Class84_Sub9.aBoolean5496 = bool;
        NPC.aClass381_10591 = class381;
        Class341.aClass248_Sub15_Sub1_3980 = null;
        Class54_Sub1.anInt5328 = i_7_;
        Class278.anInt3236 = i_9_;
        Class113.anInt1399 = i;
        int i_10_ = -38 % ((i_8_ - 27) / 52);
        Node_Sub2_Sub2.anInt8839 = i_6_;
        anInt9971++;
        Class332.anInt3883 = 1;
    }

    Class301_Sub3_Sub1(Class381 class381, Class381 class381_11_, Class225_Sub1_Sub1 class225_sub1_sub1) {
        super(class381, class381_11_, (Class225_Sub1) class225_sub1_sub1);
    }

    public static void method3196(byte i) {
        if (i > 57) {
            aClass131_9974 = null;
            anIntArray9973 = null;
            anIntArrayArray9976 = null;
        }
    }

    static final void method3197(Interactable interactable, int i, int i_12_, int i_13_) {
        if (i_12_ < Class225_Sub1.anInt8454) {
            Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_12_ + 1][i_13_];
            if (class137 != null && ((Class137) class137).aClass346_Sub7_Sub4_1645 != null && ((Class137) class137).aClass346_Sub7_Sub4_1645.method3568(122))
                interactable.method3572((((Class137) class137).aClass346_Sub7_Sub4_1645), r.aHa9032, Class241.anInt2692, 126, 0, true, 0);
        }
        if (i_13_ < Class225_Sub1.anInt8454) {
            Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_12_][i_13_ + 1];
            if (class137 != null && ((Class137) class137).aClass346_Sub7_Sub4_1645 != null && ((Class137) class137).aClass346_Sub7_Sub4_1645.method3568(-94))
                interactable.method3572((((Class137) class137).aClass346_Sub7_Sub4_1645), r.aHa9032, 0, 113, Class241.anInt2692, true, 0);
        }
        if (i_12_ < Class225_Sub1.anInt8454 && i_13_ < Class89.anInt1106) {
            Class137 class137 = (Class311.aClass137ArrayArrayArray3620[i][i_12_ + 1][i_13_ + 1]);
            if (class137 != null && ((Class137) class137).aClass346_Sub7_Sub4_1645 != null && ((Class137) class137).aClass346_Sub7_Sub4_1645.method3568(-18))
                interactable.method3572((((Class137) class137).aClass346_Sub7_Sub4_1645), r.aHa9032, Class241.anInt2692, 127, Class241.anInt2692, true, 0);
        }
        if (i_12_ < Class225_Sub1.anInt8454 && i_13_ > 0) {
            Class137 class137 = (Class311.aClass137ArrayArrayArray3620[i][i_12_ + 1][i_13_ - 1]);
            if (class137 != null && ((Class137) class137).aClass346_Sub7_Sub4_1645 != null && ((Class137) class137).aClass346_Sub7_Sub4_1645.method3568(-119))
                interactable.method3572((((Class137) class137).aClass346_Sub7_Sub4_1645), r.aHa9032, Class241.anInt2692, 116, -Class241.anInt2692, true, 0);
        }
    }
}
