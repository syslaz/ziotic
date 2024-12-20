/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class313 {
    private int anInt3647;
    private Class204[] aClass204Array3648;
    private int anInt3649;

    static final Class313 method3272(Class381 class381, int i, int i_0_) {
        byte[] is = class381.method3922((byte) 125, i, i_0_);
        if (is == null)
            return null;
        return new Class313(new ByteStream(is));
    }

    final Node_Sub31_Sub1 method3273() {
        byte[] is = method3275();
        return new Node_Sub31_Sub1(22050, is, 22050 * anInt3649 / 1000, 22050 * anInt3647 / 1000);
    }

    final int method3274() {
        int i = 9999999;
        for (int i_1_ = 0; i_1_ < 10; i_1_++) {
            if (aClass204Array3648[i_1_] != null && ((Class204) aClass204Array3648[i_1_]).anInt2363 / 20 < i)
                i = ((Class204) aClass204Array3648[i_1_]).anInt2363 / 20;
        }
        if (anInt3649 < anInt3647 && anInt3649 / 20 < i)
            i = anInt3649 / 20;
        if (i == 9999999 || i == 0)
            return 0;
        for (int i_2_ = 0; i_2_ < 10; i_2_++) {
            if (aClass204Array3648[i_2_] != null)
                ((Class204) aClass204Array3648[i_2_]).anInt2363 -= i * 20;
        }
        if (anInt3649 < anInt3647) {
            anInt3649 -= i * 20;
            anInt3647 -= i * 20;
        }
        return i;
    }

    private final byte[] method3275() {
        int i = 0;
        for (int i_3_ = 0; i_3_ < 10; i_3_++) {
            if (aClass204Array3648[i_3_] != null && (((Class204) aClass204Array3648[i_3_]).anInt2361 + ((Class204) aClass204Array3648[i_3_]).anInt2363) > i)
                i = (((Class204) aClass204Array3648[i_3_]).anInt2361 + ((Class204) aClass204Array3648[i_3_]).anInt2363);
        }
        if (i == 0)
            return new byte[0];
        int i_4_ = 22050 * i / 1000;
        byte[] is = new byte[i_4_];
        for (int i_5_ = 0; i_5_ < 10; i_5_++) {
            if (aClass204Array3648[i_5_] != null) {
                int i_6_ = (((Class204) aClass204Array3648[i_5_]).anInt2361 * 22050 / 1000);
                int i_7_ = (((Class204) aClass204Array3648[i_5_]).anInt2363 * 22050 / 1000);
                int[] is_8_ = (aClass204Array3648[i_5_].method1690(i_6_, ((Class204) aClass204Array3648[i_5_]).anInt2361));
                for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
                    int i_10_ = is[i_9_ + i_7_] + (is_8_[i_9_] >> 8);
                    if ((i_10_ + 128 & ~0xff) != 0)
                        i_10_ = i_10_ >> 31 ^ 0x7f;
                    is[i_9_ + i_7_] = (byte) i_10_;
                }
            }
        }
        return is;
    }

    private Class313(ByteStream class248_sub9) {
        aClass204Array3648 = new Class204[10];
        for (int i = 0; i < 10; i++) {
            int i_11_ = class248_sub9.readUnsignedByte((byte) 80);
            if (i_11_ != 0) {
                ((ByteStream) class248_sub9).offset--;
                aClass204Array3648[i] = new Class204();
                aClass204Array3648[i].method1689(class248_sub9);
            }
        }
        anInt3649 = class248_sub9.readShort(-1);
        anInt3647 = class248_sub9.readShort(-1);
    }

    private Class313() {
        aClass204Array3648 = new Class204[10];
    }
}
