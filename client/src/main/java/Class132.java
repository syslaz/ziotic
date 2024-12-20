/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class132 {
    short aShort1606;
    int anInt1607;
    short aShort1608;
    static Class160 aClass160_1609;
    short aShort1610;
    int anInt1611;
    boolean aBoolean1612;
    static int anInt1613;
    static int lastLoggedInDate;
    static int anInt1615;
    byte aByte1616;
    int anInt1617;
    static String[] aStringArray1618 = new String[200];
    int anInt1619;
    int anInt1620;
    static Class343[] aClass343Array1621 = new Class343[4];
    static float aFloat1622;

    static final void method1216(boolean bool, int i, int i_0_, int i_1_, int i_2_, Class381 class381) {
        Node_Sub11_Sub1.method2252(108, i_0_, i_1_, class381, i_2_, bool, 0L);
        anInt1615++;
        if (i <= 58)
            aStringArray1618 = null;
    }

    public static void method1217(byte i) {
        aClass343Array1621 = null;
        if (i != -63)
            aClass160_1609 = null;
        aClass160_1609 = null;
        aStringArray1618 = null;
    }

    static final void method1218(int i, byte i_3_, int i_4_, int i_5_, aa var_aa, int i_6_, RSInterface2 class354, long l, int i_7_) {
        anInt1613++;
        if (i_3_ >= -64)
            method1217((byte) -99);
        int i_8_ = i_5_ * i_5_ + i_4_ * i_4_;
        if (l >= (long) i_8_) {
            int i_9_ = Math.min(((RSInterface2) class354).anInt4332 / 2, ((RSInterface2) class354).anInt4223 / 2);
            if ((i_8_ ^ 0xffffffff) < (i_9_ * i_9_ ^ 0xffffffff)) {
                i_9_ -= 10;
                int i_10_;
                if ((Node_Sub45.anInt7343 ^ 0xffffffff) == -5)
                    i_10_ = 0x3fff & (int) Class282_Sub7.aFloat7661;
                else
                    i_10_ = 0x3fff & ((int) Class282_Sub7.aFloat7661 + Class346_Sub7_Sub5.anInt9958);
                int i_11_ = Node_Sub9_Sub1.anIntArray9106[i_10_];
                int i_12_ = Node_Sub9_Sub1.anIntArray9109[i_10_];
                if ((Node_Sub45.anInt7343 ^ 0xffffffff) != -5) {
                    i_11_ = i_11_ * 256 / (Class252.anInt2843 + 256);
                    i_12_ = i_12_ * 256 / (256 + Class252.anInt2843);
                }
                int i_13_ = i_5_ * i_12_ + i_4_ * i_11_ >> 1402338830;
                int i_14_ = -(i_11_ * i_5_) + i_4_ * i_12_ >> -1394845810;
                double d = Math.atan2((double) i_13_, (double) i_14_);
                int i_15_ = (int) ((double) i_9_ * Math.sin(d));
                int i_16_ = (int) (Math.cos(d) * (double) i_9_);
                Class167.aClass129Array1958[i_7_].method1162(((float) ((RSInterface2) class354).anInt4332 / 2.0F + (float) i + (float) i_15_), ((float) i_6_ + (float) ((RSInterface2) class354).anInt4223 / 2.0F - (float) i_16_), 4096, (int) (-d / 6.283185307179586 * 65535.0));
            } else
                Class325.method3360(var_aa, i, Class240.aClass129Array2676[i_7_], i_4_, i_5_, -27, i_6_, class354);
        }
    }

    Class132(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, boolean bool, boolean bool_25_, int i_26_) {
        ((Class132) this).aShort1608 = (short) i_22_;
        ((Class132) this).aShort1606 = (short) i_21_;
        ((Class132) this).aShort1610 = (short) i_20_;
        ((Class132) this).aByte1616 = (byte) i_24_;
        ((Class132) this).aBoolean1612 = bool_25_;
        ((Class132) this).anInt1620 = i_19_;
        ((Class132) this).anInt1611 = i_26_;
        ((Class132) this).anInt1607 = i_17_;
        ((Class132) this).anInt1619 = i;
        ((Class132) this).anInt1617 = i_18_;
    }
}
