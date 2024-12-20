/* Class209 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Date;

final class Class209 {
    static int anInt2409;
    static int anInt2410;
    static int anInt2411;
    private int anInt2412 = 65000;
    static int anInt2413;
    static int anInt2414;
    static int anInt2415;
    private int anInt2416;
    static int anInt2417;
    static int anInt2418;
    private Class46 aClass46_2419 = null;
    static int anInt2420;
    private Class46 aClass46_2421 = null;
    static OutgoingOpcode aOutgoingOpcode_2422 = new OutgoingOpcode(3, 3);
    static byte[] aByteArray2423 = new byte[2048];

    static final void method1713(int i) {
        anInt2415++;
        Class18.method226(-116);
        Node_Sub37.method2594(-25926);
        if (i > -94)
            aByteArray2423 = null;
    }

    final boolean method1714(int i, byte[] is, int i_0_, int i_1_) {
        if (i_1_ != -27945)
            return true;
        anInt2411++;
        synchronized (aClass46_2421) {
            if (i < 0 || anInt2412 < i)
                throw new IllegalArgumentException();
            boolean bool = method1720(127, is, i_0_, i, true);
            if (!bool)
                bool = method1720(i_1_ ^ ~0x6d5f, is, i_0_, i, false);
            return bool;
        }
    }

    static final String method1715(int i, long l) {
        Class290.aCalendar3413.setTime(new Date(l));
        anInt2420++;
        int i_2_ = Class290.aCalendar3413.get(7);
        int i_3_ = Class290.aCalendar3413.get(5);
        int i_4_ = Class290.aCalendar3413.get(2);
        int i_5_ = Class290.aCalendar3413.get(i);
        int i_6_ = Class290.aCalendar3413.get(11);
        int i_7_ = Class290.aCalendar3413.get(12);
        int i_8_ = Class290.aCalendar3413.get(13);
        return (za_Sub1.aStringArray9800[-1 + i_2_] + ", " + i_3_ / 10 + i_3_ % 10 + "-" + Class327.aStringArray3835[i_4_] + "-" + i_5_ + " " + i_6_ / 10 + i_6_ % 10 + ":" + i_7_ / 10 + i_7_ % 10 + ":" + i_8_ / 10 + i_8_ % 10 + " GMT");
    }

    static final boolean method1716(int i, byte i_9_, int i_10_) {
        anInt2417++;
        int i_11_ = 3 % ((i_9_ - -6) / 49);
        if (!(Class9.method196(16, i_10_, i) | (i & 0x60000) != 0) && !Node_Sub14_Sub10.method2301(i_10_, i, (byte) -74))
            return false;
        return true;
    }

    static final boolean method1717(int i, int i_12_, int i_13_) {
        anInt2410++;
        if (i_12_ < 0 || (i_13_ ^ 0xffffffff) > -1 || (i_12_ ^ 0xffffffff) <= (r.aByteArrayArrayArray9033[1].length ^ 0xffffffff) || ((r.aByteArrayArrayArray9033[1][i_12_].length ^ 0xffffffff) >= (i_13_ ^ 0xffffffff)))
            return false;
        if ((r.aByteArrayArrayArray9033[1][i_12_][i_13_] & 0x2 ^ 0xffffffff) != -1)
            return true;
        if (i != -10387)
            aByteArray2423 = null;
        return false;
    }

    public final String toString() {
        anInt2418++;
        return "Cache:" + anInt2416;
    }

    public static void method1718(int i) {
        if (i < 109)
            aByteArray2423 = null;
        aByteArray2423 = null;
        aOutgoingOpcode_2422 = null;
    }

    final byte[] method1719(int i, int i_14_) {
        anInt2409++;
        synchronized (aClass46_2421) {
            try {
                if ((aClass46_2419.method336(0) ^ 0xffffffffffffffffL) > ((long) (6 + i_14_ * 6) ^ 0xffffffffffffffffL))
                    return null;
                aClass46_2419.method334((byte) -66, (long) (6 * i_14_));
                aClass46_2419.method337(6, Class162_Sub1.aByteArray6356, 0, false);
                int i_15_ = ((Class162_Sub1.aByteArray6356[0] << 745774800 & 0xff0000) - -((Class162_Sub1.aByteArray6356[1] & 0xff) << -529401368) - -(0xff & Class162_Sub1.aByteArray6356[2]));
                if (i <= 57)
                    method1718(122);
                int i_16_ = ((0xff & Class162_Sub1.aByteArray6356[5]) + ((0xff & Class162_Sub1.aByteArray6356[4]) << -1521524664) + ((0xff & Class162_Sub1.aByteArray6356[3]) << -693246768));
                if ((i_15_ ^ 0xffffffff) > -1 || (anInt2412 ^ 0xffffffff) > (i_15_ ^ 0xffffffff))
                    return null;
                if ((i_16_ ^ 0xffffffff) >= -1 || (long) i_16_ > aClass46_2421.method336(0) / 520L)
                    return null;
                byte[] is = new byte[i_15_];
                int i_17_ = 0;
                int i_18_ = 0;
                while (i_15_ > i_17_) {
                    if (i_16_ == 0)
                        return null;
                    aClass46_2421.method334((byte) -66, (long) (520 * i_16_));
                    int i_19_ = -i_17_ + i_15_;
                    if (i_19_ > 512)
                        i_19_ = 512;
                    aClass46_2421.method337(8 + i_19_, Class162_Sub1.aByteArray6356, 0, false);
                    int i_20_ = (((Class162_Sub1.aByteArray6356[0] & 0xff) << -72636856) - -(Class162_Sub1.aByteArray6356[1] & 0xff));
                    int i_21_ = (((Class162_Sub1.aByteArray6356[2] & 0xff) << -1223557592) - -(Class162_Sub1.aByteArray6356[3] & 0xff));
                    int i_22_ = ((Class162_Sub1.aByteArray6356[5] << 1669562408 & 0xff00) + ((0xff0000 & Class162_Sub1.aByteArray6356[4] << 1585064720) - -(0xff & Class162_Sub1.aByteArray6356[6])));
                    int i_23_ = 0xff & Class162_Sub1.aByteArray6356[7];
                    if ((i_14_ ^ 0xffffffff) != (i_20_ ^ 0xffffffff) || (i_21_ ^ 0xffffffff) != (i_18_ ^ 0xffffffff) || (i_23_ ^ 0xffffffff) != (anInt2416 ^ 0xffffffff))
                        return null;
                    if ((i_22_ ^ 0xffffffff) > -1 || (long) i_22_ > aClass46_2421.method336(0) / 520L)
                        return null;
                    i_16_ = i_22_;
                    i_18_++;
                    for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff); i_24_++)
                        is[i_17_++] = Class162_Sub1.aByteArray6356[i_24_ - -8];
                }
                return is;
            } catch (java.io.IOException ioexception) {
                return null;
            }
        }
    }

    private final boolean method1720(int i, byte[] is, int i_25_, int i_26_, boolean bool) {
        anInt2414++;
        synchronized (aClass46_2421) {
            try {
                int i_27_;
                if (!bool) {
                    i_27_ = (int) ((aClass46_2421.method336(0) + 519L) / 520L);
                    if ((i_27_ ^ 0xffffffff) == -1)
                        i_27_ = 1;
                } else {
                    if ((long) (6 + 6 * i_25_) > aClass46_2419.method336(0))
                        return false;
                    aClass46_2419.method334((byte) -66, (long) (i_25_ * 6));
                    aClass46_2419.method337(6, Class162_Sub1.aByteArray6356, 0, false);
                    i_27_ = ((Class162_Sub1.aByteArray6356[5] & 0xff) + ((Class162_Sub1.aByteArray6356[3] << -1573861296 & 0xff0000) - -((Class162_Sub1.aByteArray6356[4] & 0xff) << 773481288)));
                    if (i_27_ <= 0 || aClass46_2421.method336(0) / 520L < (long) i_27_)
                        return false;
                }
                Class162_Sub1.aByteArray6356[5] = (byte) i_27_;
                Class162_Sub1.aByteArray6356[3] = (byte) (i_27_ >> 813397392);
                Class162_Sub1.aByteArray6356[1] = (byte) (i_26_ >> 1227735016);
                Class162_Sub1.aByteArray6356[2] = (byte) i_26_;
                Class162_Sub1.aByteArray6356[0] = (byte) (i_26_ >> -963114736);
                Class162_Sub1.aByteArray6356[4] = (byte) (i_27_ >> 1548845416);
                aClass46_2419.method334((byte) -66, (long) (i_25_ * 6));
                aClass46_2419.method335(false, 6, Class162_Sub1.aByteArray6356, 0);
                if (i < 113)
                    anInt2416 = -57;
                int i_28_ = 0;
                int i_29_ = 0;
                while (i_26_ > i_28_) {
                    int i_30_ = 0;
                    if (bool) {
                        aClass46_2421.method334((byte) -66, (long) (520 * i_27_));
                        try {
                            aClass46_2421.method337(8, (Class162_Sub1.aByteArray6356), 0, false);
                        } catch (java.io.EOFException eofexception) {
                            break;
                        }
                        int i_31_ = ((0xff & Class162_Sub1.aByteArray6356[1]) + ((0xff & Class162_Sub1.aByteArray6356[0]) << 231908744));
                        int i_32_ = ((0xff & Class162_Sub1.aByteArray6356[3]) + ((Class162_Sub1.aByteArray6356[2] & 0xff) << -1944908728));
                        i_30_ = ((0xff & Class162_Sub1.aByteArray6356[6]) + ((0xff & Class162_Sub1.aByteArray6356[5]) << 1258789768) + ((0xff & Class162_Sub1.aByteArray6356[4]) << -1230664400));
                        int i_33_ = 0xff & Class162_Sub1.aByteArray6356[7];
                        if ((i_25_ ^ 0xffffffff) != (i_31_ ^ 0xffffffff) || (i_32_ ^ 0xffffffff) != (i_29_ ^ 0xffffffff) || (i_33_ ^ 0xffffffff) != (anInt2416 ^ 0xffffffff))
                            return false;
                        if (i_30_ < 0 || ((aClass46_2421.method336(0) / 520L ^ 0xffffffffffffffffL) > ((long) i_30_ ^ 0xffffffffffffffffL)))
                            return false;
                    }
                    if (i_30_ == 0) {
                        i_30_ = (int) ((aClass46_2421.method336(0) + 519L) / 520L);
                        bool = false;
                        if ((i_30_ ^ 0xffffffff) == -1)
                            i_30_++;
                        if (i_30_ == i_27_)
                            i_30_++;
                    }
                    Class162_Sub1.aByteArray6356[1] = (byte) i_25_;
                    Class162_Sub1.aByteArray6356[0] = (byte) (i_25_ >> -652818424);
                    if (-i_28_ + i_26_ <= 512)
                        i_30_ = 0;
                    Class162_Sub1.aByteArray6356[3] = (byte) i_29_;
                    Class162_Sub1.aByteArray6356[2] = (byte) (i_29_ >> -1072576344);
                    Class162_Sub1.aByteArray6356[5] = (byte) (i_30_ >> -1930393656);
                    Class162_Sub1.aByteArray6356[4] = (byte) (i_30_ >> -706681392);
                    Class162_Sub1.aByteArray6356[7] = (byte) anInt2416;
                    Class162_Sub1.aByteArray6356[6] = (byte) i_30_;
                    aClass46_2421.method334((byte) -66, (long) (i_27_ * 520));
                    aClass46_2421.method335(false, 8, Class162_Sub1.aByteArray6356, 0);
                    int i_34_ = -i_28_ + i_26_;
                    if (i_34_ > 512)
                        i_34_ = 512;
                    aClass46_2421.method335(false, i_34_, is, i_28_);
                    i_28_ += i_34_;
                    i_29_++;
                    i_27_ = i_30_;
                }
                return true;
            } catch (java.io.IOException ioexception) {
                return false;
            }
        }
    }

    Class209(int i, Class46 class46, Class46 class46_35_, int i_36_) {
        anInt2412 = i_36_;
        anInt2416 = i;
        aClass46_2419 = class46_35_;
        aClass46_2421 = class46;
    }
}
