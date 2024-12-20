/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class Class46 {
    private int anInt577 = 0;
    static int anInt578;
    private int anInt579;
    static int anInt580;
    static int anInt581;
    private Class45 aClass45_582;
    static Class5 aClass5_583;
    private long aLong584 = -1L;
    static int anInt585;
    private long aLong586;
    static int anInt587;
    private byte[] aByteArray588;
    static int anInt589;
    static int anInt590;
    private long aLong591;
    private byte[] aByteArray592;
    static int anInt593;
    private long aLong594;
    static int anInt595 = -1;
    private long aLong596 = -1L;
    private long aLong597;
    static int anInt598;
    static int anInt599;
    static Class269 aClass269_600;

    private final File method330(int i) {
        if (i != 1)
            return null;
        anInt598++;
        return aClass45_582.method324(true);
    }

    private final void method331(int i) throws IOException {
        anInt589++;
        anInt579 = 0;
        if (aLong597 != aLong594) {
            aClass45_582.method329(aLong594, (byte) 103);
            aLong597 = aLong594;
        }
        aLong584 = aLong594;
        if (i != -17212)
            anInt577 = -123;
        while (aByteArray588.length > anInt579) {
            int i_0_ = aByteArray588.length - anInt579;
            if (i_0_ > 200000000)
                i_0_ = 200000000;
            int i_1_ = aClass45_582.method322(anInt579, i_0_, (byte) 120, aByteArray588);
            if (i_1_ == -1)
                break;
            anInt579 += i_1_;
            aLong597 += (long) i_1_;
        }
    }

    public static void method332(byte i) {
        aClass269_600 = null;
        aClass5_583 = null;
        if (i != 94)
            aClass269_600 = null;
    }

    private final void method333(byte i) throws IOException {
        anInt593++;
        if ((aLong596 ^ 0xffffffffffffffffL) != 0L) {
            if (aLong596 != aLong597) {
                aClass45_582.method329(aLong596, (byte) 103);
                aLong597 = aLong596;
            }
            aClass45_582.method327(3874, 0, anInt577, aByteArray592);
            aLong597 += (long) anInt577;
            if (aLong597 > aLong591)
                aLong591 = aLong597;
            long l = -1L;
            long l_2_ = -1L;
            if (aLong584 > aLong596 || aLong596 >= aLong584 + (long) anInt579) {
                if ((aLong596 ^ 0xffffffffffffffffL) >= (aLong584 ^ 0xffffffffffffffffL) && ((aLong584 ^ 0xffffffffffffffffL) > (aLong596 - -(long) anInt577 ^ 0xffffffffffffffffL)))
                    l = aLong584;
            } else
                l = aLong596;
            if ((long) anInt577 + aLong596 <= aLong584 || aLong596 + (long) anInt577 > aLong584 + (long) anInt579) {
                if (((aLong584 - -(long) anInt579 ^ 0xffffffffffffffffL) < (aLong596 ^ 0xffffffffffffffffL)) && (aLong596 - -(long) anInt577 >= (long) anInt579 + aLong584))
                    l_2_ = aLong584 + (long) anInt579;
            } else
                l_2_ = (long) anInt577 + aLong596;
            if ((l ^ 0xffffffffffffffffL) < 0L && (l ^ 0xffffffffffffffffL) > (l_2_ ^ 0xffffffffffffffffL)) {
                int i_3_ = (int) (-l + l_2_);
                Class159.method1402(aByteArray592, (int) (l - aLong596), aByteArray588, (int) (l + -aLong584), i_3_);
            }
            aLong596 = -1L;
            anInt577 = 0;
        }
        if (i <= 125)
            method336(104);
    }

    final void method334(byte i, long l) throws IOException {
        anInt581++;
        if (i == -66) {
            if ((l ^ 0xffffffffffffffffL) > -1L)
                throw new IOException("Invalid seek to " + l + " in file " + method330(1));
            aLong594 = l;
        }
    }

    final void method335(boolean bool, int i, byte[] is, int i_4_) throws IOException {
        anInt580++;
        if (bool != false)
            aByteArray588 = null;
        try {
            if ((aLong594 - -(long) i ^ 0xffffffffffffffffL) < (aLong586 ^ 0xffffffffffffffffL))
                aLong586 = (long) i + aLong594;
            if ((aLong596 ^ 0xffffffffffffffffL) != 0L && ((aLong596 ^ 0xffffffffffffffffL) < (aLong594 ^ 0xffffffffffffffffL) || aLong594 > (long) anInt577 + aLong596))
                method333((byte) 126);
            if ((aLong596 ^ 0xffffffffffffffffL) != 0L && ((long) i + aLong594 > (long) aByteArray592.length + aLong596)) {
                int i_5_ = (int) (aLong596 + (-aLong594 + (long) aByteArray592.length));
                Class159.method1402(is, i_4_, aByteArray592, (int) (-aLong596 + aLong594), i_5_);
                i -= i_5_;
                i_4_ += i_5_;
                aLong594 += (long) i_5_;
                anInt577 = aByteArray592.length;
                method333((byte) 126);
            }
            if (aByteArray592.length < i) {
                if (aLong594 != aLong597) {
                    aClass45_582.method329(aLong594, (byte) 103);
                    aLong597 = aLong594;
                }
                aClass45_582.method327(3874, i_4_, i, is);
                aLong597 += (long) i;
                if ((aLong597 ^ 0xffffffffffffffffL) < (aLong591 ^ 0xffffffffffffffffL))
                    aLong591 = aLong597;
                long l = -1L;
                if (aLong584 > aLong594 || (long) anInt579 + aLong584 <= aLong594) {
                    if (((aLong594 ^ 0xffffffffffffffffL) >= (aLong584 ^ 0xffffffffffffffffL)) && ((aLong584 ^ 0xffffffffffffffffL) > (aLong594 - -(long) i ^ 0xffffffffffffffffL)))
                        l = aLong584;
                } else
                    l = aLong594;
                long l_6_ = -1L;
                if (aLong584 >= aLong594 - -(long) i || (((long) i + aLong594 ^ 0xffffffffffffffffL) < ((long) anInt579 + aLong584 ^ 0xffffffffffffffffL))) {
                    if ((long) anInt579 + aLong584 > aLong594 && ((aLong584 + (long) anInt579 ^ 0xffffffffffffffffL) >= (aLong594 - -(long) i ^ 0xffffffffffffffffL)))
                        l_6_ = aLong584 - -(long) anInt579;
                } else
                    l_6_ = aLong594 - -(long) i;
                if (l > -1L && l < l_6_) {
                    int i_7_ = (int) (-l + l_6_);
                    Class159.method1402(is, (int) (-aLong594 + (long) i_4_ - -l), aByteArray588, (int) (l - aLong584), i_7_);
                }
                aLong594 += (long) i;
            } else if (i > 0) {
                if (aLong596 == -1L)
                    aLong596 = aLong594;
                Class159.method1402(is, i_4_, aByteArray592, (int) (-aLong596 + aLong594), i);
                aLong594 += (long) i;
                if ((long) anInt577 < -aLong596 + aLong594)
                    anInt577 = (int) (-aLong596 + aLong594);
            }
        } catch (IOException ioexception) {
            aLong597 = -1L;
            throw ioexception;
        }
    }

    final long method336(int i) {
        if (i != 0)
            method336(-21);
        anInt585++;
        return aLong586;
    }

    final void method337(int i, byte[] is, int i_8_, boolean bool) throws IOException {
        if (bool == false) {
            anInt578++;
            try {
                if (i + i_8_ > is.length)
                    throw new ArrayIndexOutOfBoundsException(-is.length + (i + i_8_));
                if ((aLong596 ^ 0xffffffffffffffffL) != 0L && aLong596 <= aLong594 && (((long) anInt577 + aLong596 ^ 0xffffffffffffffffL) <= ((long) i + aLong594 ^ 0xffffffffffffffffL))) {
                    Class159.method1402(aByteArray592, (int) (-aLong596 + aLong594), is, i_8_, i);
                    aLong594 += (long) i;
                    return;
                }
                long l = aLong594;
                int i_9_ = i_8_;
                int i_10_ = i;
                if ((aLong594 ^ 0xffffffffffffffffL) <= (aLong584 ^ 0xffffffffffffffffL) && aLong594 < (long) anInt579 + aLong584) {
                    int i_11_ = (int) ((long) anInt579 + (-aLong594 + aLong584));
                    if (i_11_ > i)
                        i_11_ = i;
                    Class159.method1402(aByteArray588, (int) (aLong594 - aLong584), is, i_8_, i_11_);
                    aLong594 += (long) i_11_;
                    i -= i_11_;
                    i_8_ += i_11_;
                }
                if ((i ^ 0xffffffff) < (aByteArray588.length ^ 0xffffffff)) {
                    aClass45_582.method329(aLong594, (byte) 103);
                    aLong597 = aLong594;
                    while ((i ^ 0xffffffff) < -1) {
                        int i_12_ = aClass45_582.method322(i_8_, i, (byte) 120, is);
                        if ((i_12_ ^ 0xffffffff) == 0)
                            break;
                        i -= i_12_;
                        i_8_ += i_12_;
                        aLong597 += (long) i_12_;
                        aLong594 += (long) i_12_;
                    }
                } else if (i > 0) {
                    method331(-17212);
                    int i_13_ = i;
                    if (anInt579 < i_13_)
                        i_13_ = anInt579;
                    Class159.method1402(aByteArray588, 0, is, i_8_, i_13_);
                    aLong594 += (long) i_13_;
                    i_8_ += i_13_;
                    i -= i_13_;
                }
                if ((aLong596 ^ 0xffffffffffffffffL) != 0L) {
                    if (aLong594 < aLong596 && i > 0) {
                        int i_14_ = i_8_ - -(int) (-aLong594 + aLong596);
                        if ((i_14_ ^ 0xffffffff) < (i_8_ - -i ^ 0xffffffff))
                            i_14_ = i_8_ + i;
                        while ((i_8_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff)) {
                            is[i_8_++] = (byte) 0;
                            i--;
                            aLong594++;
                        }
                    }
                    long l_15_ = -1L;
                    if (aLong596 >= l && (long) i_10_ + l > aLong596)
                        l_15_ = aLong596;
                    else if (((l ^ 0xffffffffffffffffL) <= (aLong596 ^ 0xffffffffffffffffL)) && aLong596 + (long) anInt577 > l)
                        l_15_ = l;
                    long l_16_ = -1L;
                    if ((l ^ 0xffffffffffffffffL) > ((long) anInt577 + aLong596 ^ 0xffffffffffffffffL) && aLong596 + (long) anInt577 <= (long) i_10_ + l)
                        l_16_ = (long) anInt577 + aLong596;
                    else if ((long) i_10_ + l > aLong596 && (((long) anInt577 + aLong596 ^ 0xffffffffffffffffL) <= ((long) i_10_ + l ^ 0xffffffffffffffffL)))
                        l_16_ = (long) i_10_ + l;
                    if (l_15_ > -1L && l_16_ > l_15_) {
                        int i_17_ = (int) (l_16_ + -l_15_);
                        Class159.method1402(aByteArray592, (int) (-aLong596 + l_15_), is, i_9_ - -(int) (-l + l_15_), i_17_);
                        if (l_16_ > aLong594) {
                            i -= l_16_ - aLong594;
                            aLong594 = l_16_;
                        }
                    }
                }
            } catch (IOException ioexception) {
                aLong597 = -1L;
                throw ioexception;
            }
            if (i > 0)
                throw new EOFException();
        }
    }

    final void method338(boolean bool, byte[] is) throws IOException {
        method337(is.length, is, 0, bool);
        anInt590++;
    }

    final void method339(int i) throws IOException {
        anInt587++;
        int i_18_ = 32 % ((-43 - i) / 55);
        method333((byte) 127);
        aClass45_582.method323(-123);
    }

    Class46(Class45 class45, int i, int i_19_) throws IOException {
        aClass45_582 = class45;
        aLong586 = aLong591 = class45.method321(0);
        aByteArray592 = new byte[i_19_];
        aLong594 = 0L;
        aByteArray588 = new byte[i];
    }

    static {
        aClass5_583 = new Class5();
    }
}
