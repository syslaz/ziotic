/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class109 {
    static int anInt1370;
    static Class381 aClass381_1371;
    private int anInt1372;
    static int anInt1373;
    static int anInt1374;
    static Class65 aClass65_1375 = new Class65(8);
    static int anInt1376;
    static int anInt1377;
    int anInt1378;
    static int anInt1379;
    static float aFloat1380;

    final int method759(byte i) {
        anInt1379++;
        if (i > -53)
            ((Class109) this).anInt1378 = -28;
        return 0x3fff & ((Class109) this).anInt1378;
    }

    public static void method760(int i) {
        if (i == -27121) {
            aClass381_1371 = null;
            aClass65_1375 = null;
        }
    }

    final void method761(int i, byte i_0_) {
        ((Class109) this).anInt1378 = i;
        anInt1374++;
        if (i_0_ != -109)
            method760(-45);
        anInt1372 = 0;
    }

    static final void method762(int i, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_) {
        Class149.method1331(i_1_, -79, i, Class156.anIntArrayArray1867[i_4_++], i_3_);
        anInt1376++;
        Class149.method1331(i_1_, -84, i, Class156.anIntArrayArray1867[i_2_--], i_3_);
        if (bool != true)
            method765(41, -115, 73, 81, -116, 126, 74);
        for (int i_5_ = i_4_; i_2_ >= i_5_; i_5_++) {
            int[] is = Class156.anIntArrayArray1867[i_5_];
            is[i] = is[i_3_] = i_1_;
        }
    }

    final void method763(byte i) {
        if (i <= 53)
            method760(-110);
        ((Class109) this).anInt1378 &= 0x3fff;
        anInt1370++;
    }

    final boolean method764(int i, int i_6_, int i_7_, int i_8_) {
        if (i != -11598)
            method765(30, -128, -5, -37, 124, 76, 127);
        anInt1377++;
        int i_9_ = anInt1372;
        if (i_7_ == ((Class109) this).anInt1378 && (anInt1372 ^ 0xffffffff) == -1)
            return false;
        boolean bool;
        if (anInt1372 != 0) {
            if ((anInt1372 ^ 0xffffffff) >= -1 || (i_7_ ^ 0xffffffff) >= (((Class109) this).anInt1378 ^ 0xffffffff)) {
                if (anInt1372 < 0 && i_7_ < ((Class109) this).anInt1378) {
                    int i_10_ = anInt1372 * anInt1372 / (2 * i_8_);
                    int i_11_ = ((Class109) this).anInt1378 - i_10_;
                    if ((i_11_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff) && (i_11_ ^ 0xffffffff) >= (((Class109) this).anInt1378 ^ 0xffffffff))
                        bool = true;
                    else
                        bool = false;
                } else
                    bool = false;
            } else {
                int i_12_ = anInt1372 * anInt1372 / (i_8_ * 2);
                int i_13_ = ((Class109) this).anInt1378 - -i_12_;
                if ((i_7_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff) && (i_13_ ^ 0xffffffff) <= (((Class109) this).anInt1378 ^ 0xffffffff))
                    bool = true;
                else
                    bool = false;
            }
        } else {
            if ((((Class109) this).anInt1378 < i_7_ && i_7_ <= i_8_ + ((Class109) this).anInt1378) || (((Class109) this).anInt1378 > i_7_ && ((i_7_ ^ 0xffffffff) <= (-i_8_ + ((Class109) this).anInt1378 ^ 0xffffffff)))) {
                ((Class109) this).anInt1378 = i_7_;
                return false;
            }
            bool = true;
        }
        if (!bool) {
            if (anInt1372 <= 0) {
                anInt1372 += i_8_;
                if (anInt1372 > 0)
                    anInt1372 = 0;
            } else {
                anInt1372 -= i_8_;
                if (anInt1372 < 0)
                    anInt1372 = 0;
            }
        } else {
            if (((Class109) this).anInt1378 >= i_7_) {
                anInt1372 -= i_8_;
                if (i_6_ != 0 && anInt1372 < -i_6_)
                    anInt1372 = -i_6_;
            } else {
                anInt1372 += i_8_;
                if ((i_6_ ^ 0xffffffff) != -1 && anInt1372 > i_6_)
                    anInt1372 = i_6_;
            }
            if (anInt1372 != i_9_) {
                int i_14_ = anInt1372 * anInt1372 / (2 * i_8_);
                if ((i_7_ ^ 0xffffffff) >= (((Class109) this).anInt1378 ^ 0xffffffff)) {
                    if (i_7_ < ((Class109) this).anInt1378 && -i_14_ + ((Class109) this).anInt1378 < i_7_)
                        anInt1372 = i_9_;
                } else if ((i_14_ + ((Class109) this).anInt1378 ^ 0xffffffff) < (i_7_ ^ 0xffffffff))
                    anInt1372 = i_9_;
            }
        }
        ((Class109) this).anInt1378 += anInt1372 - -i_9_ >> 2130120129;
        return bool;
    }

    public Class109() {
        /* empty */
    }

    static final void method765(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
        anInt1373++;
        int i_21_ = i_17_ - i_20_;
        int i_22_ = i_20_ + i_18_;
        if (i == 0) {
            for (int i_23_ = i_18_; i_23_ < i_22_; i_23_++)
                Class149.method1331(i_15_, -56, i_19_, Class156.anIntArrayArray1867[i_23_], i_16_);
            int i_24_ = i_16_ - i_20_;
            for (int i_25_ = i_17_; i_25_ > i_21_; i_25_--)
                Class149.method1331(i_15_, i + -59, i_19_, Class156.anIntArrayArray1867[i_25_], i_16_);
            int i_26_ = i_20_ + i_19_;
            for (int i_27_ = i_22_; (i_27_ ^ 0xffffffff) >= (i_21_ ^ 0xffffffff); i_27_++) {
                int[] is = Class156.anIntArrayArray1867[i_27_];
                Class149.method1331(i_15_, -115, i_19_, is, i_26_);
                Class149.method1331(i_15_, -81, i_24_, is, i_16_);
            }
        }
    }
}
