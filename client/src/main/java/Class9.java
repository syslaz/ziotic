/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class9 {
    static int anInt183;
    static int anInt184;
    static int anInt185;
    private Class298 aClass298_186;
    private Interface12 anInterface12_187;
    static Class9 aClass9_188 = new Class9(Class298.aClass298_3474);
    static int anInt189;
    static int anInt190;
    static int anInt191;
    static Class9 aClass9_192 = new Class9(Class298.aClass298_3479);
    private int js5intdata;
    static int anInt194;
    static int anInt195;
    static int anInt196;
    static Class9 aClass9_197 = new Class9(Class298.aClass298_3479);
    static int anInt198;
    static Class9 aClass9_199 = new Class9(Class298.aClass298_3479);
    static Class9 aClass9_200 = new Class9(Class298.aClass298_3479);
    static Class9 aClass9_201 = new Class9(Class298.aClass298_3479);
    static Class9 aClass9_202 = new Class9(Class298.aClass298_3479);
    static Class9 aClass9_203 = new Class9(Class298.aClass298_3479);
    static Class9 aClass9_204 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_205 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_206 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_207 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_208 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_209 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_210 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_211 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_212 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_213 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_214 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_215 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_216 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_217 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_218 = new Class9(Class298.aClass298_3477);
    static Class9 aClass9_219 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_220 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_221 = new Class9(Class298.aClass298_3474);
    static Class9 aClass9_222 = new Class9(Class298.aClass298_3478);
    static long[] aLongArray223;
    static int[] anIntArray224 = new int[25];
    static int anInt225;

    static final Class9[] method188(byte i) {
        if (i != -82)
            method188((byte) 1);
        anInt185++;
        return (new Class9[]{aClass9_188, aClass9_192, aClass9_197, aClass9_199, aClass9_200, aClass9_201, aClass9_202, aClass9_203, aClass9_204, aClass9_205, aClass9_206, aClass9_207, aClass9_208, aClass9_209, aClass9_210, aClass9_211, aClass9_212, aClass9_213, aClass9_214, aClass9_215, aClass9_216, aClass9_217, aClass9_218, aClass9_219, aClass9_220, aClass9_221, aClass9_222});
    }

    final void setjd5indata(int i, int i_0_) {
        anInt194++;
        if (i == 16837)
            js5intdata = i_0_;
    }

    final void method190(byte i, Interface12 interface12) {
        anInt196++;
        if (interface12.method37((byte) -126) != aClass298_186)
            throw new IllegalArgumentException();
        anInterface12_187 = interface12;
        if (i != -112)
            method191(83, -99, -21);
    }

    static final boolean method191(int i, int i_1_, int i_2_) {
        if (i_2_ != -17286)
            return true;
        anInt195++;
        if ((0x800 & i_1_) == 0)
            return false;
        return true;
    }

    static final void method192(int i, int i_3_, float[] fs, int i_4_, int i_5_, int i_6_, float f, float[] fs_7_, float f_8_, int i_9_, int i_10_, int i_11_) {
        i_3_ -= i_11_;
        i_10_ -= i_6_;
        i_5_ -= i_9_;
        anInt183++;
        float f_12_ = ((float) i_3_ * fs_7_[2] + ((float) i_10_ * fs_7_[1] + (float) i_5_ * fs_7_[0]));
        float f_13_ = (fs_7_[5] * (float) i_3_ + (fs_7_[4] * (float) i_10_ + fs_7_[3] * (float) i_5_));
        float f_14_ = ((float) i_5_ * fs_7_[6] + (float) i_10_ * fs_7_[7] + fs_7_[8] * (float) i_3_);
        float f_15_ = 0.5F + (float) Math.atan2((double) f_12_, (double) f_14_) / 6.2831855F;
        if (i < -102) {
            if (f_8_ != 1.0F)
                f_15_ *= f_8_;
            float f_16_ = f + (0.5F + f_13_);
            if ((i_4_ ^ 0xffffffff) == -2) {
                float f_17_ = f_15_;
                f_15_ = -f_16_;
                f_16_ = f_17_;
            } else if ((i_4_ ^ 0xffffffff) != -3) {
                if ((i_4_ ^ 0xffffffff) == -4) {
                    float f_18_ = f_15_;
                    f_15_ = f_16_;
                    f_16_ = -f_18_;
                }
            } else {
                f_16_ = -f_16_;
                f_15_ = -f_15_;
            }
            fs[0] = f_15_;
            fs[1] = f_16_;
        }
    }

    static final void method193(int i, int i_19_) {
        anInt198++;
        synchronized (Node_Sub14_Sub2.aClass278_9175) {
            Node_Sub14_Sub2.aClass278_9175.method2864(i_19_, -15782);
        }
        int i_20_ = 53 / ((-10 - i) / 32);
        synchronized (Node_Sub14_Sub15.aClass278_9325) {
            Node_Sub14_Sub15.aClass278_9325.method2864(i_19_, -15782);
        }
    }

    final int getjd5indata(int i) {
        if (i != 1)
            method197((byte) -124);
        anInt191++;
        return js5intdata;
    }

    public final String toString() {
        anInt189++;
        throw new IllegalStateException();
    }

    public static void method195(int i) {
        aClass9_197 = null;
        aClass9_217 = null;
        aClass9_208 = null;
        aClass9_199 = null;
        aClass9_200 = null;
        aClass9_192 = null;
        aClass9_216 = null;
        aClass9_219 = null;
        aClass9_222 = null;
        aClass9_221 = null;
        aClass9_202 = null;
        aClass9_188 = null;
        aLongArray223 = null;
        aClass9_218 = null;
        aClass9_214 = null;
        if (i != 6)
            method192(-96, -36, null, 96, 110, -121, 1.9650447F, null, 2.3062067F, 98, 89, 74);
        aClass9_203 = null;
        aClass9_213 = null;
        aClass9_211 = null;
        aClass9_220 = null;
        aClass9_212 = null;
        aClass9_201 = null;
        anIntArray224 = null;
        aClass9_206 = null;
        aClass9_215 = null;
        aClass9_209 = null;
        aClass9_207 = null;
        aClass9_204 = null;
        aClass9_210 = null;
        aClass9_205 = null;
    }

    static final boolean method196(int i, int i_21_, int i_22_) {
        if (i != 16)
            anInt225 = 4;
        anInt184++;
        if ((i_22_ & 0x10) == 0)
            return false;
        return true;
    }

    private Class9(Class298 class298) {
        aClass298_186 = class298;
        js5intdata = 1;
    }

    final Interface12 method197(byte i) {
        int i_23_ = -98 / ((i - -42) / 50);
        anInt190++;
        return anInterface12_187;
    }

    static {
        aLongArray223 = new long[100];
        anInt225 = 0;
    }
}
