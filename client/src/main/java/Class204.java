/* Class204 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Class204 {
    private int anInt2356 = 100;
    private int[] anIntArray2357;
    private int[] anIntArray2358 = new int[5];
    private static int[] anIntArray2359 = new int[32768];
    private Class277 aClass277_2360;
    int anInt2361 = 500;
    private Class277 aClass277_2362;
    int anInt2363;
    private Class277 aClass277_2364;
    private Class277 aClass277_2365;
    private static int[] anIntArray2366;
    private static int[] anIntArray2367;
    private Class277 aClass277_2368;
    private Class277 aClass277_2369;
    private int anInt2370 = 0;
    private Class277 aClass277_2371;
    private Class277 aClass277_2372;
    private Class277 aClass277_2373;
    private static int[] anIntArray2374;
    private Class369 aClass369_2375;
    private int[] anIntArray2376;
    private static int[] anIntArray2377;
    private static int[] anIntArray2378;
    private static int[] anIntArray2379;
    private static int[] anIntArray2380;

    final void method1689(ByteStream class248_sub9) {
        aClass277_2371 = new Class277();
        aClass277_2371.method2858(class248_sub9);
        aClass277_2369 = new Class277();
        aClass277_2369.method2858(class248_sub9);
        int i = class248_sub9.readUnsignedByte((byte) -29);
        if (i != 0) {
            ((ByteStream) class248_sub9).offset--;
            aClass277_2373 = new Class277();
            aClass277_2373.method2858(class248_sub9);
            aClass277_2362 = new Class277();
            aClass277_2362.method2858(class248_sub9);
        }
        i = class248_sub9.readUnsignedByte((byte) -95);
        if (i != 0) {
            ((ByteStream) class248_sub9).offset--;
            aClass277_2365 = new Class277();
            aClass277_2365.method2858(class248_sub9);
            aClass277_2372 = new Class277();
            aClass277_2372.method2858(class248_sub9);
        }
        i = class248_sub9.readUnsignedByte((byte) 105);
        if (i != 0) {
            ((ByteStream) class248_sub9).offset--;
            aClass277_2368 = new Class277();
            aClass277_2368.method2858(class248_sub9);
            aClass277_2364 = new Class277();
            aClass277_2364.method2858(class248_sub9);
        }
        for (int i_0_ = 0; i_0_ < 10; i_0_++) {
            int i_1_ = class248_sub9.readSmart((byte) 22);
            if (i_1_ == 0)
                break;
            anIntArray2376[i_0_] = i_1_;
            anIntArray2357[i_0_] = class248_sub9.method2210((byte) 98);
            anIntArray2358[i_0_] = class248_sub9.readSmart((byte) 22);
        }
        anInt2370 = class248_sub9.readSmart((byte) 22);
        anInt2356 = class248_sub9.readSmart((byte) 22);
        ((Class204) this).anInt2361 = class248_sub9.readShort(-1);
        ((Class204) this).anInt2363 = class248_sub9.readShort(-1);
        aClass369_2375 = new Class369();
        aClass277_2360 = new Class277();
        aClass369_2375.method3850(class248_sub9, aClass277_2360);
    }

    final int[] method1690(int i, int i_2_) {
        Class159.method1401(anIntArray2367, 0, i);
        if (i_2_ < 10)
            return anIntArray2367;
        double d = (double) i / ((double) i_2_ + 0.0);
        aClass277_2371.method2859();
        aClass277_2369.method2859();
        int i_3_ = 0;
        int i_4_ = 0;
        int i_5_ = 0;
        if (aClass277_2373 != null) {
            aClass277_2373.method2859();
            aClass277_2362.method2859();
            i_3_ = (int) ((double) (((Class277) aClass277_2373).anInt3213 - ((Class277) aClass277_2373).anInt3212) * 32.768 / d);
            i_4_ = (int) ((double) ((Class277) aClass277_2373).anInt3212 * 32.768 / d);
        }
        int i_6_ = 0;
        int i_7_ = 0;
        int i_8_ = 0;
        if (aClass277_2365 != null) {
            aClass277_2365.method2859();
            aClass277_2372.method2859();
            i_6_ = (int) ((double) (((Class277) aClass277_2365).anInt3213 - ((Class277) aClass277_2365).anInt3212) * 32.768 / d);
            i_7_ = (int) ((double) ((Class277) aClass277_2365).anInt3212 * 32.768 / d);
        }
        for (int i_9_ = 0; i_9_ < 5; i_9_++) {
            if (anIntArray2376[i_9_] != 0) {
                anIntArray2374[i_9_] = 0;
                anIntArray2380[i_9_] = (int) ((double) anIntArray2358[i_9_] * d);
                anIntArray2379[i_9_] = (anIntArray2376[i_9_] << 14) / 100;
                anIntArray2377[i_9_] = (int) ((double) (((Class277) aClass277_2371).anInt3213 - ((Class277) aClass277_2371).anInt3212) * 32.768 * Math.pow(1.0057929410678534, (double) anIntArray2357[i_9_]) / d);
                anIntArray2378[i_9_] = (int) ((double) ((Class277) aClass277_2371).anInt3212 * 32.768 / d);
            }
        }
        for (int i_10_ = 0; i_10_ < i; i_10_++) {
            int i_11_ = aClass277_2371.method2860(i);
            int i_12_ = aClass277_2369.method2860(i);
            if (aClass277_2373 != null) {
                int i_13_ = aClass277_2373.method2860(i);
                int i_14_ = aClass277_2362.method2860(i);
                i_11_ += method1691(i_5_, i_14_, ((Class277) aClass277_2373).anInt3210) >> 1;
                i_5_ += (i_13_ * i_3_ >> 16) + i_4_;
            }
            if (aClass277_2365 != null) {
                int i_15_ = aClass277_2365.method2860(i);
                int i_16_ = aClass277_2372.method2860(i);
                i_12_ = (i_12_ * ((method1691(i_8_, i_16_, ((Class277) aClass277_2365).anInt3210) >> 1) + 32768)) >> 15;
                i_8_ += (i_15_ * i_6_ >> 16) + i_7_;
            }
            for (int i_17_ = 0; i_17_ < 5; i_17_++) {
                if (anIntArray2376[i_17_] != 0) {
                    int i_18_ = i_10_ + anIntArray2380[i_17_];
                    if (i_18_ < i) {
                        anIntArray2367[i_18_] += method1691(anIntArray2374[i_17_], i_12_ * anIntArray2379[i_17_] >> 15, (((Class277) aClass277_2371).anInt3210));
                        anIntArray2374[i_17_] += ((i_11_ * anIntArray2377[i_17_] >> 16) + anIntArray2378[i_17_]);
                    }
                }
            }
        }
        if (aClass277_2368 != null) {
            aClass277_2368.method2859();
            aClass277_2364.method2859();
            int i_19_ = 0;
            boolean bool = false;
            boolean bool_20_ = true;
            for (int i_21_ = 0; i_21_ < i; i_21_++) {
                int i_22_ = aClass277_2368.method2860(i);
                int i_23_ = aClass277_2364.method2860(i);
                int i_24_;
                if (bool_20_)
                    i_24_ = (((Class277) aClass277_2368).anInt3212 + ((((Class277) aClass277_2368).anInt3213 - ((Class277) aClass277_2368).anInt3212) * i_22_ >> 8));
                else
                    i_24_ = (((Class277) aClass277_2368).anInt3212 + ((((Class277) aClass277_2368).anInt3213 - ((Class277) aClass277_2368).anInt3212) * i_23_ >> 8));
                i_19_ += 256;
                if (i_19_ >= i_24_) {
                    i_19_ = 0;
                    bool_20_ = !bool_20_;
                }
                if (bool_20_)
                    anIntArray2367[i_21_] = 0;
            }
        }
        if (anInt2370 > 0 && anInt2356 > 0) {
            int i_25_ = (int) ((double) anInt2370 * d);
            for (int i_26_ = i_25_; i_26_ < i; i_26_++)
                anIntArray2367[i_26_] += anIntArray2367[i_26_ - i_25_] * anInt2356 / 100;
        }
        if (((Class369) aClass369_2375).anIntArray4538[0] > 0 || ((Class369) aClass369_2375).anIntArray4538[1] > 0) {
            aClass277_2360.method2859();
            int i_27_ = aClass277_2360.method2860(i + 1);
            int i_28_ = aClass369_2375.method3848(0, (float) i_27_ / 65536.0F);
            int i_29_ = aClass369_2375.method3848(1, (float) i_27_ / 65536.0F);
            if (i >= i_28_ + i_29_) {
                int i_30_ = 0;
                int i_31_ = i_29_;
                if (i_31_ > i - i_28_)
                    i_31_ = i - i_28_;
                for (/**/; i_30_ < i_31_; i_30_++) {
                    int i_32_ = (int) (((long) anIntArray2367[i_30_ + i_28_] * (long) Class369.anInt4543) >> 16);
                    for (int i_33_ = 0; i_33_ < i_28_; i_33_++)
                        i_32_ += (int) (((long) (anIntArray2367[i_30_ + i_28_ - 1 - i_33_]) * (long) (Class369.anIntArrayArray4540[0][i_33_])) >> 16);
                    for (int i_34_ = 0; i_34_ < i_30_; i_34_++)
                        i_32_ -= (int) (((long) anIntArray2367[i_30_ - 1 - i_34_] * (long) (Class369.anIntArrayArray4540[1][i_34_])) >> 16);
                    anIntArray2367[i_30_] = i_32_;
                    i_27_ = aClass277_2360.method2860(i + 1);
                }
                i_31_ = 128;
                for (; ; ) {
                    if (i_31_ > i - i_28_)
                        i_31_ = i - i_28_;
                    for (/**/; i_30_ < i_31_; i_30_++) {
                        int i_35_ = (int) (((long) anIntArray2367[i_30_ + i_28_] * (long) Class369.anInt4543) >> 16);
                        for (int i_36_ = 0; i_36_ < i_28_; i_36_++)
                            i_35_ += (int) (((long) (anIntArray2367[i_30_ + i_28_ - 1 - i_36_]) * (long) (Class369.anIntArrayArray4540[0][i_36_])) >> 16);
                        for (int i_37_ = 0; i_37_ < i_29_; i_37_++)
                            i_35_ -= (int) (((long) (anIntArray2367[i_30_ - 1 - i_37_]) * (long) (Class369.anIntArrayArray4540[1][i_37_])) >> 16);
                        anIntArray2367[i_30_] = i_35_;
                        i_27_ = aClass277_2360.method2860(i + 1);
                    }
                    if (i_30_ >= i - i_28_)
                        break;
                    i_28_ = aClass369_2375.method3848(0, (float) i_27_ / 65536.0F);
                    i_29_ = aClass369_2375.method3848(1, (float) i_27_ / 65536.0F);
                    i_31_ += 128;
                }
                for (/**/; i_30_ < i; i_30_++) {
                    int i_38_ = 0;
                    for (int i_39_ = i_30_ + i_28_ - i; i_39_ < i_28_; i_39_++)
                        i_38_ += (int) (((long) (anIntArray2367[i_30_ + i_28_ - 1 - i_39_]) * (long) (Class369.anIntArrayArray4540[0][i_39_])) >> 16);
                    for (int i_40_ = 0; i_40_ < i_29_; i_40_++)
                        i_38_ -= (int) (((long) anIntArray2367[i_30_ - 1 - i_40_] * (long) (Class369.anIntArrayArray4540[1][i_40_])) >> 16);
                    anIntArray2367[i_30_] = i_38_;
                    i_27_ = aClass277_2360.method2860(i + 1);
                }
            }
        }
        for (int i_41_ = 0; i_41_ < i; i_41_++) {
            if (anIntArray2367[i_41_] < -32768)
                anIntArray2367[i_41_] = -32768;
            if (anIntArray2367[i_41_] > 32767)
                anIntArray2367[i_41_] = 32767;
        }
        return anIntArray2367;
    }

    private final int method1691(int i, int i_42_, int i_43_) {
        if (i_43_ == 1) {
            if ((i & 0x7fff) < 16384)
                return i_42_;
            return -i_42_;
        }
        if (i_43_ == 2)
            return anIntArray2366[i & 0x7fff] * i_42_ >> 14;
        if (i_43_ == 3)
            return ((i & 0x7fff) * i_42_ >> 14) - i_42_;
        if (i_43_ == 4)
            return anIntArray2359[i / 2607 & 0x7fff] * i_42_;
        return 0;
    }

    public static void method1692() {
        anIntArray2367 = null;
        anIntArray2359 = null;
        anIntArray2366 = null;
        anIntArray2374 = null;
        anIntArray2380 = null;
        anIntArray2379 = null;
        anIntArray2377 = null;
        anIntArray2378 = null;
    }

    public Class204() {
        anIntArray2357 = new int[5];
        ((Class204) this).anInt2363 = 0;
        anIntArray2376 = new int[5];
    }

    static {
        Random random = new Random(0L);
        for (int i = 0; i < 32768; i++)
            anIntArray2359[i] = (random.nextInt() & 0x2) - 1;
        anIntArray2366 = new int[32768];
        for (int i = 0; i < 32768; i++)
            anIntArray2366[i] = (int) (Math.sin((double) i / 5215.1903) * 16384.0);
        anIntArray2367 = new int[220500];
        anIntArray2374 = new int[5];
        anIntArray2377 = new int[5];
        anIntArray2378 = new int[5];
        anIntArray2379 = new int[5];
        anIntArray2380 = new int[5];
    }
}
