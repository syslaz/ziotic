/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class55 {
    int anInt729;
    static int[] anIntArray730 = {0, -1, 0, 1};
    static int anInt731;
    String aString732;
    static int anInt733 = -1;
    static int anInt734;
    static int anInt735;

    public static void method438(int i) {
        anIntArray730 = null;
        if (i != 64)
            anInt733 = -56;
    }

    static final void method439(Animable animable, boolean bool) {
        for (int i = ((Animable) animable).x1; i <= ((Animable) animable).x2; i++) {
            for (int i_0_ = ((Animable) animable).y1; i_0_ <= ((Animable) animable).y2; i_0_++) {
                Class137 class137 = (Class311.aClass137ArrayArrayArray3620[((Interactable) animable).plane][i][i_0_]);
                if (class137 != null) {
                    Class49 class49 = ((Class137) class137).aClass49_1649;
                    Class49 class49_1_ = null;
                    for (/**/; class49 != null; class49 = ((Class49) class49).aClass49_660) {
                        if (((Class49) class49).aAnimable_656 == animable) {
                            if (class49_1_ != null)
                                ((Class49) class49_1_).aClass49_660 = ((Class49) class49).aClass49_660;
                            else
                                ((Class137) class137).aClass49_1649 = ((Class49) class49).aClass49_660;
                            class49.method391(true);
                            break;
                        }
                        class49_1_ = class49;
                    }
                }
            }
        }
        if (!bool)
            aa_Sub2.method164(animable);
    }

    static final void method440(byte[][] is, int i, Class310_Sub1 class310_sub1) {
        anInt731++;
        int i_2_ = Class282_Sub7.aByteArrayArray7666.length;
        if (i > -85)
            method438(67);
        for (int i_3_ = 0; i_2_ > i_3_; i_3_++) {
            byte[] is_4_ = is[i_3_];
            if (is_4_ != null) {
                int i_5_ = (64 * (Node_Sub14_Sub36.anIntArray9544[i_3_] >> 2077037160) - Class67.baseX);
                int i_6_ = ((0xff & Node_Sub14_Sub36.anIntArray9544[i_3_]) * 64 - Class368.baseY);
                Node_Sub37.method2594(-25926);
                class310_sub1.method3262(Class182.aClass164Array2114, Class287.aHa3381, 54, is_4_, i_6_, i_5_);
            }
        }
    }

    static final boolean method441(boolean bool) {
        anInt734++;
        try {
            Class138 class138 = new Class138();
            byte[] is = class138.method1275(Class363.aByteArray4477, -18);
            Class337.method3419(-82, is);
            if (bool != true)
                method439(null, false);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    static final void method442(int i) {
        int i_7_ = 54 / ((83 - i) / 35);
        for (Node_Sub51 class248_sub51 = (Node_Sub51) Class144.aClass293_1702.method3119(2); class248_sub51 != null; class248_sub51 = (Node_Sub51) Class144.aClass293_1702.method3107(-127)) {
            if (((Node_Sub51) class248_sub51).aBoolean7458)
                class248_sub51.method2683(256);
        }
        anInt735++;
        for (Node_Sub51 class248_sub51 = (Node_Sub51) Class333.aClass293_3901.method3119(2); class248_sub51 != null; class248_sub51 = (Node_Sub51) Class333.aClass293_3901.method3107(-128)) {
            if (((Node_Sub51) class248_sub51).aBoolean7458)
                class248_sub51.method2683(256);
        }
    }
}
