/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class67 {
    static RSInterface2[] aClass354Array898;
    static int anInt899;
    static int anInt900;
    static int[] anIntArray901;
    static Class42[] aClass42Array902 = new Class42[50];
    static int baseX;

    static final void method518(boolean bool) {
        if (bool) {
            Class311.aClass137ArrayArrayArray3620 = Class333.aClass137ArrayArrayArray3898;
            Class177.aSArray2070 = Node_Sub14_Sub12_Sub1.aSArray10306;
        } else {
            Class311.aClass137ArrayArrayArray3620 = Class85.aClass137ArrayArrayArray1047;
            Class177.aSArray2070 = Node_Sub14_Sub29.aSArray9471;
        }
        Class111_Sub1.anInt5531 = Class311.aClass137ArrayArrayArray3620.length;
    }

    public static void method519(boolean bool) {
        aClass42Array902 = null;
        if (bool != true)
            method520(true, false, null, -57, (byte) -52, null, 96);
        anIntArray901 = null;
        aClass354Array898 = null;
    }

    static final int method520(boolean bool, boolean bool_0_, Class147_Sub1 class147_sub1, int i, byte i_1_, Class147_Sub1 class147_sub1_2_, int i_3_) {
        anInt899++;
        int i_4_ = Class253.method2721(class147_sub1, -18646, class147_sub1_2_, bool_0_, i);
        if ((i_4_ ^ 0xffffffff) != -1) {
            if (bool_0_)
                return -i_4_;
            return i_4_;
        }
        if ((i_3_ ^ 0xffffffff) == 0)
            return 0;
        int i_5_ = Class253.method2721(class147_sub1, -18646, class147_sub1_2_, bool, i_3_);
        if (i_1_ < 92)
            anInt900 = 40;
        if (!bool)
            return i_5_;
        return -i_5_;
    }
}
