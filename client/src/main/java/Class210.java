/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class210 {
    static int anInt2424;
    String aString2425;
    static int anInt2426;
    static int[] anIntArray2427 = new int[1];
    static Class31 aClass31_2428;
    static int anInt2429;
    int anInt2430;
    private char aChar2431;
    boolean aBoolean2432 = true;
    static int anInt2433;
    static int anInt2434;
    static Class330_Sub1[] aClass330_Sub1Array2435 = new Class330_Sub1[37];

    final boolean method1721(int i) {
        if (i != 2147483647)
            return false;
        anInt2429++;
        if (aChar2431 != 's')
            return false;
        return true;
    }

    static final int method1722(int i, int i_0_, int i_1_) {
        anInt2433++;
        if (i_1_ != -15800)
            aClass31_2428 = null;
        int i_2_ = i_0_ - -(i * 57);
        i_2_ = i_2_ << -321186707 ^ i_2_;
        int i_3_ = (0x7fffffff & 1376312589 + i_2_ * (i_2_ * (i_2_ * 15731) - -789221));
        return i_3_ >> -1509433517 & 0xff;
    }

    final void method1723(ByteStream class248_sub9, boolean bool) {
        for (; ; ) {
            int i = class248_sub9.readUnsignedByte((byte) -87);
            if ((i ^ 0xffffffff) == -1)
                break;
            method1726(-82, i, class248_sub9);
        }
        if (bool != true)
            anIntArray2427 = null;
        anInt2426++;
    }

    static final void method1724(int i, int i_4_, byte i_5_, int i_6_, int i_7_) {
        anInt2424++;
        if (Node_Sub15_Sub4.anInt9694 == 1) {
            int i_8_ = i_4_ / Class81.anInt4905;
            int i_9_ = i / Class81.anInt4905;
            if (i_5_ > -36)
                method1725((byte) 39);
            int i_10_ = i_7_ / Class282_Sub26.anInt7860;
            int i_11_ = i_6_ / Class282_Sub26.anInt7860;
            if ((i_8_ ^ 0xffffffff) > (Class70.anInt927 ^ 0xffffffff) && (i_9_ ^ 0xffffffff) <= -1 && (Class108.anInt1363 ^ 0xffffffff) < (i_10_ ^ 0xffffffff) && (i_11_ ^ 0xffffffff) <= -1) {
                if (Class108.anInt1363 <= i_11_)
                    i_11_ = -1 + Class108.anInt1363;
                if ((i_10_ ^ 0xffffffff) > -1)
                    i_10_ = 0;
                if (Class70.anInt927 <= i_9_)
                    i_9_ = Class70.anInt927 - 1;
                if ((i_8_ ^ 0xffffffff) > -1)
                    i_8_ = 0;
                for (int i_12_ = i_10_; (i_12_ ^ 0xffffffff) >= (i_11_ ^ 0xffffffff); i_12_++) {
                    int i_13_ = ((Class346_Sub7_Sub1_Sub2.method3594(Class108.anInt1363, -429911713, i_12_ + Node_Sub14_Sub18.anInt9352)) * Class70.anInt927);
                    for (int i_14_ = i_8_; (i_14_ ^ 0xffffffff) >= (i_9_ ^ 0xffffffff); i_14_++) {
                        int i_15_ = ((Class346_Sub7_Sub1_Sub2.method3594(Class70.anInt927, -429911713, i_14_ + Class358.anInt4422)) + i_13_);
                        Class341.anIntArray3970[i_15_] = Class346_Sub7_Sub4_Sub1.anInt10092;
                    }
                }
            }
        }
    }

    public static void method1725(byte i) {
        aClass330_Sub1Array2435 = null;
        anIntArray2427 = null;
        aClass31_2428 = null;
        if (i != 21)
            method1722(-19, 59, 70);
    }

    public Class210() {
        /* empty */
    }

    private final void method1726(int i, int i_16_, ByteStream class248_sub9) {
        if ((i_16_ ^ 0xffffffff) != -2) {
            if (i_16_ != 2) {
                if ((i_16_ ^ 0xffffffff) == -5)
                    ((Class210) this).aBoolean2432 = false;
                else if (i_16_ == 5)
                    ((Class210) this).aString2425 = class248_sub9.readString(15598);
            } else
                ((Class210) this).anInt2430 = class248_sub9.readInt(false);
        } else
            aChar2431 = Class226.method1802((byte) -71, class248_sub9.readByte(117));
        anInt2434++;
        if (i >= -63)
            method1724(-46, 102, (byte) -11, -30, -91);
    }

    static {
        aClass31_2428 = new Class31();
    }
}
