/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

abstract class Class301 implements Interface10 {
    Class381 aClass381_4926;
    static int anInt4927;
    static int anInt4928;
    private int anInt4929;
    static int anInt4930;
    static int anInt4931;
    Class225 aClass225_4932;
    static ha aHa4933;
    private Class48 aClass48_4934;
    static int anInt4935;
    static int anInt4936;
    private Class381 aClass381_4937;
    private long aLong4938;
    static int anInt4939;

    public boolean method33(int i) {
        anInt4935++;
        if (i != 5618)
            ((Class301) this).aClass225_4932 = null;
        boolean bool = true;
        if (!((Class301) this).aClass381_4926.method3920(((Class225) ((Class301) this).aClass225_4932).anInt5001, -77))
            bool = false;
        if (!aClass381_4937.method3920((((Class225) ((Class301) this).aClass225_4932).anInt5001), 126))
            bool = false;
        return bool;
    }

    abstract void method3182(int i, int i_0_, int i_1_, boolean bool);

    public static void method3183(boolean bool) {
        aHa4933 = null;
        if (bool != true)
            method3183(false);
    }

    final int method3184(byte i) {
        anInt4928++;
        int i_2_ = Class282_Sub11.aClass74_7702.method545((byte) 43);
        int i_3_ = i_2_ * 100;
        if (anInt4929 == i_2_ && i_2_ != 0) {
            int i_4_ = Class282_Sub11.aClass74_7702.method551((byte) -56);
            if (i_2_ < i_4_) {
                long l = (aLong4938 - Class282_Sub11.aClass74_7702.method549((byte) -83));
                if ((l ^ 0xffffffffffffffffL) < -1L) {
                    long l_5_ = (long) (-i_2_ + i_4_) * (l * 10000L / (long) i_2_);
                    long l_6_ = 10000L * (Class118.method1112(116) + -aLong4938);
                    if (l_6_ >= l_5_)
                        i_3_ = 100 * i_4_;
                    else
                        i_3_ = (int) ((100L * ((long) (i_4_ + -i_2_) * l_6_) / l_5_) + (long) (100 * i_2_));
                }
            }
        } else {
            anInt4929 = i_2_;
            aLong4938 = Class118.method1112(116);
        }
        if (i != -36)
            aClass48_4934 = null;
        return i_3_;
    }

    public void method34(byte i) {
        anInt4939++;
        if (i <= 34)
            method3182(-115, -57, -24, false);
        Class285 class285 = Class116_Sub1.method1102(aClass381_4937, 13580, (((Class225) ((Class301) this).aClass225_4932).anInt5001));
        aClass48_4934 = Class287.aHa3381.a(class285, Class157.method1391((((Class301) this).aClass381_4926), (((Class225) (((Class301) this).aClass225_4932)).anInt5001)), true);
    }

    abstract void method3185(int i, int i_7_, boolean bool, int i_8_);

    static final void method3186(File file, String string, byte i) {
        IOException_Sub1.aHashtable84.put(string, file);
        anInt4936++;
        if (i != 20)
            aHa4933 = null;
    }

    Class301(Class381 class381, Class381 class381_9_, Class225 class225) {
        ((Class301) this).aClass225_4932 = class225;
        aClass381_4937 = class381_9_;
        ((Class301) this).aClass381_4926 = class381;
    }

    static final void method3187(byte i) {
        anInt4927++;
        Class104.method745();
        int i_10_ = -94 % ((41 - i) / 62);
    }

    public final void method32(boolean bool, byte i) {
        if (i < -60) {
            anInt4930++;
            int i_11_ = ((((Class225) ((Class301) this).aClass225_4932).aClass186_4993.method1628(((Class225) ((Class301) this).aClass225_4932).anInt5000, 0, Class226_Sub1.anInt6661)) - -((Class225) ((Class301) this).aClass225_4932).anInt4992);
            int i_12_ = ((((Class225) ((Class301) this).aClass225_4932).aClass272_4994.method2838((byte) -7, s_Sub2.anInt7946, ((Class225) ((Class301) this).aClass225_4932).anInt5002)) + ((Class225) ((Class301) this).aClass225_4932).anInt4999);
            method3185(i_12_, -119, bool, i_11_);
            method3182(i_11_, 2, i_12_, bool);
            String string = Class282_Sub11.aClass74_7702.method555((byte) 21);
            if (-aLong4938 + Class118.method1112(116) > 10000L)
                string += " (" + Class282_Sub11.aClass74_7702.method544(255).method2854(4) + ")";
            aClass48_4934.method354(i_11_ + (((Class225) ((Class301) this).aClass225_4932).anInt5000) / 2, -124, string, 4 + ((((Class225) ((Class301) this).aClass225_4932).anInt5002 / 2) + i_12_ + (((Class225) ((Class301) this).aClass225_4932).anInt4997)), ((Class225) ((Class301) this).aClass225_4932).anInt4995, -1);
        }
    }
}
