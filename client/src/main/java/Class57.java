/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class57 {
    static int anInt787;
    static int anInt788;
    static int anInt789;
    static Class65 aClass65_790 = new Class65(32);
    static int anInt791;

    static final void method453(byte i, RSInterface2 class354) {
        if (i != -99)
            method453((byte) 124, null);
        anInt788++;
        if (Class205.anInt2389 == ((RSInterface2) class354).anInt4205) {
            if (((Player) Class347.myPlayer).aString10550 == null) {
                ((RSInterface2) class354).anInt4269 = 0;
                ((RSInterface2) class354).anInt4338 = 0;
            } else {
                ((RSInterface2) class354).anInt4328 = 150;
                ((RSInterface2) class354).anInt4209 = 0x7ff & (int) (256.0 * Math.sin((double) (Node_Sub18.anInt7027) / 40.0));
                ((RSInterface2) class354).anInt4269 = Class282_Sub29.anInt7896;
                ((RSInterface2) class354).anInt4222 = 5;
                ((RSInterface2) class354).anInt4338 = (Class282_Sub9.method2954((byte) 85, (((Player) Class347.myPlayer).aString10550)));
                ((RSInterface2) class354).anInt4282 = ((Entity) Class347.myPlayer).anInt10488;
                ((RSInterface2) class354).anInt4234 = 0;
                ((RSInterface2) class354).anInt4248 = ((Entity) Class347.myPlayer).anInt10434;
                ((RSInterface2) class354).anInt4237 = ((Entity) Class347.myPlayer).anInt10448;
                Class182 class182 = (((RSInterface2) class354).anInt4248 == -1 ? null : Class235.aClass356_2617.method3790((byte) -90, (((RSInterface2) class354).anInt4248)));
                if (class182 != null)
                    aa_Sub1.method157(class182, false, ((RSInterface2) class354).anInt4237);
            }
        }
    }

    static final float[] method454(float[] fs, byte i, int i_0_) {
        if (i != -122)
            method454(null, (byte) 10, -103);
        anInt789++;
        float[] fs_1_ = new float[i_0_];
        Class159.method1400(fs, 0, fs_1_, 0, i_0_);
        return fs_1_;
    }

    static final boolean method455(int i, int i_2_, int i_3_) {
        if (i_2_ != -19107)
            return false;
        anInt787++;
        if (!Class246.method1961(i, 0, i_3_) && !Class136_Sub2.method1256(i, i_2_ ^ ~0x4aec, i_3_))
            return false;
        return true;
    }

    public static void method456(int i) {
        if (i == 22580)
            aClass65_790 = null;
    }
}
