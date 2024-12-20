/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class289 {
    static Class111 aClass111_3398;
    static int anInt3399 = 100;
    static int anInt3400;
    static int anInt3401;
    static int anInt3402;

    public static void method3086(byte i) {
        aClass111_3398 = null;
        if (i != 86)
            anInt3399 = -75;
    }

    static final void method3087(int i, RSInterface2[] class354s, boolean bool, int i_0_, byte i_1_, int i_2_) {
        anInt3401++;
        for (int i_3_ = 0; (class354s.length ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
            RSInterface2 class354 = class354s[i_3_];
            if (class354 != null && (i ^ 0xffffffff) == (((RSInterface2) class354).anInt4300 ^ 0xffffffff)) {
                Node_Sub20.method2523(class354, (byte) 13, bool, i_0_, i_2_);
                Class340_Sub5.method3454(class354, i_0_, i_2_, i_1_ + -144);
                if (((((RSInterface2) class354).anInt4374 + -((RSInterface2) class354).anInt4332) ^ 0xffffffff) > (((RSInterface2) class354).anInt4261 ^ 0xffffffff))
                    ((RSInterface2) class354).anInt4261 = (-((RSInterface2) class354).anInt4332 + ((RSInterface2) class354).anInt4374);
                if ((((RSInterface2) class354).anInt4271 ^ 0xffffffff) < ((-((RSInterface2) class354).anInt4223 + ((RSInterface2) class354).anInt4345) ^ 0xffffffff))
                    ((RSInterface2) class354).anInt4271 = (-((RSInterface2) class354).anInt4223 + ((RSInterface2) class354).anInt4345);
                if (((RSInterface2) class354).anInt4261 < 0)
                    ((RSInterface2) class354).anInt4261 = 0;
                if ((((RSInterface2) class354).anInt4271 ^ 0xffffffff) > -1)
                    ((RSInterface2) class354).anInt4271 = 0;
                if ((((RSInterface2) class354).anInt4284 ^ 0xffffffff) == -1)
                    Class60.method471(bool, (byte) 100, class354);
            }
        }
        if (i_1_ != 90)
            method3086((byte) -33);
    }

    static final void method3088(int i) {
        anInt3400++;
        if (i == -24458) {
            int i_4_ = Class131.anInt1600;
            int[] is = Class271.anIntArray3156;
            for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_5_++) {
                Player player = (Node_Sub32.aPlayerArray7197[is[i_5_]]);
                if (player != null)
                    Node_Sub14_Sub39.method2398(256, player, player.method3632(-1));
            }
        }
    }

    static final int method3089(int i, byte i_6_, byte[] is) {
        if (i_6_ <= 81)
            method3086((byte) 29);
        anInt3402++;
        return ha.method809(104, i, 0, is);
    }
}
