/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.datatransfer.Clipboard;
import java.util.Date;

final class Class106 {
    static Clipboard aClipboard1346;
    static int anInt1347;
    static int anInt1348;
    static int anInt1349;

    public static void method747(int i) {
        aClipboard1346 = null;
        if (i != -3602)
            aClipboard1346 = null;
    }

    static final void method748(int i, int i_0_, int i_1_, int i_2_, boolean bool, byte i_3_) {
        if ((i ^ 0xffffffff) > -2)
            i = 1;
        anInt1348++;
        if ((i_1_ ^ 0xffffffff) > -2)
            i_1_ = 1;
        int i_4_ = i_1_ + -334;
        if (i_3_ != -72)
            method750(null, (byte) 67);
        if (i_4_ >= 0) {
            if (i_4_ > 100)
                i_4_ = 100;
        } else
            i_4_ = 0;
        int i_5_ = ((-Class310.aShort3598 + Class226_Sub3.aShort6674) * i_4_ / 100 + Class310.aShort3598);
        if (Class352.aShort4182 <= i_5_) {
            if (i_5_ > Class135.aShort1635)
                i_5_ = Class135.aShort1635;
        } else
            i_5_ = Class352.aShort4182;
        int i_6_ = 512 * i_1_ * i_5_ / (i * 334);
        if ((i_6_ ^ 0xffffffff) <= (Class65.aShort885 ^ 0xffffffff)) {
            if (i_6_ > Node_Sub8_Sub18.aShort9073) {
                i_6_ = Node_Sub8_Sub18.aShort9073;
                i_5_ = i * i_6_ * 334 / (i_1_ * 512);
                if (Class352.aShort4182 > i_5_) {
                    i_5_ = Class352.aShort4182;
                    int i_7_ = 334 * (i_6_ * i) / (i_5_ * 512);
                    int i_8_ = (i_1_ + -i_7_) / 2;
                    if (bool) {
                        Class287.aHa3381.la();
                        Class287.aHa3381.method820(i, 24, i_8_, i_0_, i_2_, -16777216);
                        Class287.aHa3381.method820(i, i_3_ + 162, i_8_, i_1_ + (i_0_ + -i_8_), i_2_, -16777216);
                    }
                    i_0_ += i_8_;
                    i_1_ -= i_8_ * 2;
                }
            }
        } else {
            i_6_ = Class65.aShort885;
            i_5_ = i_6_ * (i * 334) / (i_1_ * 512);
            if (i_5_ > Class135.aShort1635) {
                i_5_ = Class135.aShort1635;
                int i_9_ = i_5_ * i_1_ * 512 / (i_6_ * 334);
                int i_10_ = (i + -i_9_) / 2;
                if (bool) {
                    Class287.aHa3381.la();
                    Class287.aHa3381.method820(i_10_, i_3_ + 140, i_1_, i_0_, i_2_, -16777216);
                    Class287.aHa3381.method820(i_10_, i_3_ + 177, i_1_, i_0_, i + (i_2_ - i_10_), -16777216);
                }
                i_2_ += i_10_;
                i -= i_10_ * 2;
            }
        }
        Class317.anInt3666 = (short) i;
        Class155.anInt1830 = (short) i_1_;
        Class282_Sub17.anInt7769 = i_2_;
        Class25.anInt337 = i_1_ * i_5_ / 334;
        Class237.anInt2637 = i_0_;
    }

    static final void method749(boolean bool, boolean bool_11_, boolean bool_12_, Node_Sub12 class248_sub12) {
        anInt1349++;
        int i = ((Node_Sub12) class248_sub12).anInt6964;
        int i_13_ = (int) ((Node) class248_sub12).id;
        class248_sub12.remove(!bool);
        if (bool_12_)
            Class136_Sub2.method1257(-118, i);
        Class84_Sub9.method631(i, 28986);
        if (bool == false) {
            RSInterface2 class354 = Class276.method2853(65535, i_13_);
            if (class354 != null)
                Class376.method3882(class354, 2260);
            Class147_Sub1.method1320(-107);
            if (!bool_11_ && Class179.anInt2084 != -1)
                Class293.method3116(1, Class179.anInt2084, (byte) 126);
            Class82 class82 = new Class82(Class109.aClass65_1375);
            for (Node_Sub12 class248_sub12_14_ = (Node_Sub12) class82.method591((byte) -46); class248_sub12_14_ != null; class248_sub12_14_ = (Node_Sub12) class82.method590(20322)) {
                if (!class248_sub12_14_.hasNext((byte) 78)) {
                    class248_sub12_14_ = (Node_Sub12) class82.method591((byte) 59);
                    if (class248_sub12_14_ == null)
                        break;
                }
                if ((((Node_Sub12) class248_sub12_14_).anInt6960 ^ 0xffffffff) == -4) {
                    int i_15_ = (int) ((Node) class248_sub12_14_).id;
                    if ((i_15_ >>> 204877808 ^ 0xffffffff) == (i ^ 0xffffffff))
                        method749(false, bool_11_, true, class248_sub12_14_);
                }
            }
        }
    }

    static final void method750(String string, byte i) {
        anInt1347++;
        if (Class162.aStringArray1909 == null)
            za_Sub2.method2694((byte) 23);
        Class290.aCalendar3413.setTime(new Date(Class118.method1112(116)));
        if (i <= 73)
            aClipboard1346 = null;
        int i_16_ = Class290.aCalendar3413.get(11);
        int i_17_ = Class290.aCalendar3413.get(12);
        int i_18_ = Class290.aCalendar3413.get(13);
        String string_19_ = (Integer.toString(i_16_ / 10) + i_16_ % 10 + ":" + i_17_ / 10 + i_17_ % 10 + ":" + i_18_ / 10 + i_18_ % 10);
        String[] strings = Class80.method583(123, string, '\n');
        for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (strings.length ^ 0xffffffff); i_20_++) {
            for (int i_21_ = Class291.anInt4742; (i_21_ ^ 0xffffffff) < -1; i_21_--)
                Class162.aStringArray1909[i_21_] = Class162.aStringArray1909[-1 + i_21_];
            Class162.aStringArray1909[0] = string_19_ + ": " + strings[i_20_];
            if (Class252.aFileOutputStream2840 != null) {
                try {
                    Class252.aFileOutputStream2840.write(InputStream_Sub2.method126(true, (Class162.aStringArray1909[0]) + "\n"));
                } catch (java.io.IOException ioexception) {
                    /* empty */
                }
            }
            if ((Class291.anInt4742 ^ 0xffffffff) > (Class162.aStringArray1909.length - 1 ^ 0xffffffff)) {
                Class291.anInt4742++;
                if ((Class32.anInt387 ^ 0xffffffff) < -1)
                    Class32.anInt387++;
            }
        }
    }
}
