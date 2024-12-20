/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class312 {
    boolean aBoolean3622;
    byte aByte3623;
    byte aByte3624;
    byte aByte3625;
    boolean aBoolean3626;
    static int anInt3627 = -1;
    static int anInt3628;
    int anInt3629;
    byte aByte3630;
    boolean aBoolean3631;
    boolean aBoolean3632;
    int anInt3633;
    short aShort3634;
    boolean aBoolean3635;
    boolean aBoolean3636;
    static RSInterface2 aClass354_3637 = null;
    boolean aBoolean3638;
    boolean aBoolean3639;
    static boolean aBoolean3640 = false;
    static long[] aLongArray3641;
    byte aByte3642;
    byte aByte3643;
    static int anInt3644 = -1;
    int anInt3645;
    byte aByte3646;

    static final void method3270(boolean bool, int i, int i_0_, int i_1_, int i_2_) {
        anInt3628++;
        if (bool == false) {
            int i_3_ = 0;
            int i_4_ = i;
            int i_5_ = -i;
            Class149.method1331(i_1_, -69, i_2_ + -i, Class156.anIntArrayArray1867[i_0_], i_2_ + i);
            int i_6_ = -1;
            while (i_3_ < i_4_) {
                i_6_ += 2;
                i_5_ += i_6_;
                i_3_++;
                if ((i_5_ ^ 0xffffffff) <= -1) {
                    i_4_--;
                    i_5_ -= i_4_ << -486750527;
                    int[] is = Class156.anIntArrayArray1867[i_0_ + i_4_];
                    int[] is_7_ = Class156.anIntArrayArray1867[-i_4_ + i_0_];
                    int i_8_ = i_3_ + i_2_;
                    int i_9_ = -i_3_ + i_2_;
                    Class149.method1331(i_1_, -98, i_9_, is, i_8_);
                    Class149.method1331(i_1_, -69, i_9_, is_7_, i_8_);
                }
                int i_10_ = i_2_ - -i_4_;
                int i_11_ = i_2_ + -i_4_;
                int[] is = Class156.anIntArrayArray1867[i_0_ + i_3_];
                int[] is_12_ = Class156.anIntArrayArray1867[i_0_ + -i_3_];
                Class149.method1331(i_1_, -60, i_11_, is, i_10_);
                Class149.method1331(i_1_, -62, i_11_, is_12_, i_10_);
            }
        }
    }

    public static void method3271(byte i) {
        aLongArray3641 = null;
        if (i == -67)
            aClass354_3637 = null;
    }

    public Class312() {
        /* empty */
    }
}
