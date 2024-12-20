/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class325 {
    static int anInt3826;
    static int anInt3827;
    static int anInt3828;
    static float aFloat3829 = 0.0F;
    static int loginInterfaceRemoval;
    static boolean aBoolean3831 = false;
    static boolean[] aBooleanArray3832 = new boolean[8];

    static final void method3360(aa var_aa, int i, Class129 class129, int i_0_, int i_1_, int i_2_, int i_3_, RSInterface2 class354) {
        anInt3827++;
        if (class129 != null) {
            int i_4_;
            if (Node_Sub45.anInt7343 != 4)
                i_4_ = 0x3fff & (Class346_Sub7_Sub5.anInt9958 + (int) Class282_Sub7.aFloat7661);
            else
                i_4_ = 0x3fff & (int) Class282_Sub7.aFloat7661;
            int i_5_ = 10 + Math.max(((RSInterface2) class354).anInt4332 / 2, ((RSInterface2) class354).anInt4223 / 2);
            int i_6_ = i_1_ * i_1_ + i_0_ * i_0_;
            if (i_6_ <= i_5_ * i_5_) {
                int i_7_ = Node_Sub9_Sub1.anIntArray9106[i_4_];
                int i_8_ = 36 / ((40 - i_2_) / 32);
                int i_9_ = Node_Sub9_Sub1.anIntArray9109[i_4_];
                if (Node_Sub45.anInt7343 != 4) {
                    i_7_ = i_7_ * 256 / (Class252.anInt2843 - -256);
                    i_9_ = i_9_ * 256 / (256 + Class252.anInt2843);
                }
                int i_10_ = i_0_ * i_7_ - -(i_1_ * i_9_) >> -1758705490;
                int i_11_ = -(i_1_ * i_7_) + i_9_ * i_0_ >> -602891826;
                class129.method1164((i_10_ + i + (((RSInterface2) class354).anInt4332 / 2 + -(class129.method1169() / 2))), (-i_11_ + ((RSInterface2) class354).anInt4223 / 2 + (i_3_ + -(class129.method1181() / 2))), var_aa, i, i_3_);
            }
        }
    }

    public static void method3361(byte i) {
        if (i <= 40)
            method3360(null, 110, null, 27, 75, 117, -99, null);
        aBooleanArray3832 = null;
    }

    static final void method3362(boolean bool, byte i) {
        anInt3826++;
        int i_12_ = Node_Sub14_Sub16.anInt9330;
        int i_13_ = Class272.anInt3164;
        if (bool && Class357.aBoolean4416) {
            i_12_ <<= 1;
            i_13_ = -i_12_;
        }
        int i_14_ = -76 % ((i - 27) / 54);
        Class287.aHa3381.f(i_13_, i_12_);
    }
}
