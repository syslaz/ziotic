/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class254 implements Interface17 {
    static int anInt5121;
    static int anInt5122;
    static int anInt5123;
    static int anInt5124 = -2;
    private boolean aBoolean5125;
    static int anInt5126;
    static boolean aBoolean5127;
    private ha aHa5128;
    static int anInt5129;
    static int anInt5130;
    static int anInt5131;
    private Interface10[] anInterface10Array5132;
    static int anInt5133;
    private Class195 aClass195_5134;

    public final void method55(boolean bool, byte i) {
        bool = true;
        anInt5121++;
        int i_0_ = 2 / ((-24 - i) / 48);
        Interface10[] interface10s = anInterface10Array5132;
        for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (interface10s.length ^ 0xffffffff); i_1_++) {
            Interface10 interface10 = interface10s[i_1_];
            if (interface10 != null)
                interface10.method32(bool || aBoolean5125, (byte) -72);
        }
        aBoolean5125 = false;
    }

    public final void method51(byte i) {
        anInt5129++;
        if (aHa5128 != Class287.aHa3381) {
            aHa5128 = Class287.aHa3381;
            aBoolean5125 = true;
        }
        aHa5128.GA(0);
        if (i != -2)
            method51((byte) -17);
        Interface10[] interface10s = anInterface10Array5132;
        for (int i_2_ = 0; (interface10s.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
            Interface10 interface10 = interface10s[i_2_];
            if (interface10 != null)
                interface10.method34((byte) 39);
        }
    }

    public final int method52(int i) {
        anInt5122++;
        int i_3_ = 0;
        if (i != 26583)
            method54(-9);
        Interface10[] interface10s = anInterface10Array5132;
        for (int i_4_ = 0; (interface10s.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
            Interface10 interface10 = interface10s[i_4_];
            if (interface10 == null || interface10.method33(i ^ 0x7225))
                i_3_++;
        }
        return 100 * i_3_ / anInterface10Array5132.length;
    }

    static final float[] method2732(int i, int i_5_, int i_6_, int i_7_, float f, float f_8_, float f_9_, int i_10_) {
        anInt5126++;
        float[] fs = new float[9];
        float[] fs_11_ = new float[9];
        float f_12_ = (float) Math.cos((double) ((float) i_7_ * 0.024543693F));
        float f_13_ = (float) Math.sin((double) (0.024543693F * (float) i_7_));
        fs[3] = 0.0F;
        fs[4] = 1.0F;
        fs[7] = 0.0F;
        fs[8] = f_12_;
        fs[5] = 0.0F;
        fs[1] = 0.0F;
        fs[2] = f_13_;
        fs[6] = -f_13_;
        float f_14_ = -f_12_ + 1.0F;
        fs[0] = f_12_;
        float[] fs_15_ = new float[9];
        float f_16_ = 1.0F;
        f_12_ = (float) i_6_ / 32767.0F;
        if (i_5_ < 122)
            return null;
        float f_17_ = 0.0F;
        f_14_ = 1.0F - f_12_;
        f_13_ = -(float) Math.sqrt((double) (1.0F - f_12_ * f_12_));
        float f_18_ = (float) Math.sqrt((double) (i_10_ * i_10_ + i * i));
        if (f_18_ == 0.0F && f_12_ == 0.0F)
            fs_11_ = fs;
        else {
            if (f_18_ != 0.0F) {
                f_16_ = (float) -i_10_ / f_18_;
                f_17_ = (float) i / f_18_;
            }
            fs_15_[3] = -f_17_ * f_13_;
            fs_15_[4] = f_12_;
            fs_15_[1] = f_17_ * f_13_;
            fs_15_[6] = f_14_ * (f_16_ * f_17_);
            fs_15_[2] = f_16_ * f_17_ * f_14_;
            fs_15_[8] = f_12_ + f_17_ * f_17_ * f_14_;
            fs_15_[0] = f_12_ + f_16_ * f_16_ * f_14_;
            fs_15_[5] = f_16_ * f_13_;
            fs_15_[7] = f_13_ * -f_16_;
            fs_11_[0] = fs_15_[0] * fs[0] + fs[1] * fs_15_[3] + fs_15_[6] * fs[2];
            fs_11_[1] = fs_15_[7] * fs[2] + (fs[0] * fs_15_[1] + fs[1] * fs_15_[4]);
            fs_11_[3] = fs[5] * fs_15_[6] + (fs_15_[3] * fs[4] + fs[3] * fs_15_[0]);
            fs_11_[2] = fs_15_[5] * fs[1] + fs[0] * fs_15_[2] + fs[2] * fs_15_[8];
            fs_11_[4] = fs_15_[7] * fs[5] + (fs[4] * fs_15_[4] + fs[3] * fs_15_[1]);
            fs_11_[6] = fs_15_[6] * fs[8] + (fs_15_[3] * fs[7] + fs[6] * fs_15_[0]);
            fs_11_[5] = fs[5] * fs_15_[8] + (fs[3] * fs_15_[2] + fs_15_[5] * fs[4]);
            fs_11_[7] = fs_15_[1] * fs[6] + fs[7] * fs_15_[4] + fs_15_[7] * fs[8];
            fs_11_[8] = fs_15_[8] * fs[8] + (fs[7] * fs_15_[5] + fs[6] * fs_15_[2]);
        }
        fs_11_[4] *= f_8_;
        fs_11_[8] *= f_9_;
        fs_11_[3] *= f_8_;
        fs_11_[2] *= f;
        fs_11_[1] *= f;
        fs_11_[0] *= f;
        fs_11_[6] *= f_9_;
        fs_11_[7] *= f_9_;
        fs_11_[5] *= f_8_;
        return fs_11_;
    }

    public final int method53(int i) {
        anInt5131++;
        if (i != -11222)
            aHa5128 = null;
        return ((Class195) aClass195_5134).anInt2233;
    }

    public final void method54(int i) {
        if (i != 31639)
            anInt5124 = -42;
        anInt5130++;
    }

    public final boolean method56(long l, int i) {
        if (i != -3650)
            aBoolean5125 = false;
        anInt5123++;
        if ((Class118.method1112(116) ^ 0xffffffffffffffffL) > ((long) ((Class195) aClass195_5134).anInt2231 + l ^ 0xffffffffffffffffL))
            return false;
        return true;
    }

    Class254(Class195 class195, Class12 class12) {
        aClass195_5134 = class195;
        anInterface10Array5132 = (new Interface10
                [((Class195) aClass195_5134).anInterface11Array2232.length]);
        for (int i = 0; i < anInterface10Array5132.length; i++)
            anInterface10Array5132[i] = class12.method211((((Class195) aClass195_5134).anInterface11Array2232[i]), (byte) -57);
    }

    static final Class206 method2733(ByteStream class248_sub9, int i) {
        anInt5133++;
        int i_19_ = class248_sub9.readUnsignedByte((byte) -107);
        Class186 class186 = (Class136_Sub2.method1259(-1)[class248_sub9.readUnsignedByte((byte) 100)]);
        int i_20_ = 119 / ((i - -36) / 56);
        Class272 class272 = Class359.method3805(-12865)[class248_sub9.readUnsignedByte((byte) 73)];
        int i_21_ = class248_sub9.readUnsignedShort((byte) -10);
        int i_22_ = class248_sub9.readUnsignedShort((byte) -10);
        int i_23_ = class248_sub9.readShort(-1);
        int i_24_ = class248_sub9.readShort(-1);
        int i_25_ = class248_sub9.readInt(false);
        int i_26_ = class248_sub9.readInt(false);
        int i_27_ = class248_sub9.readInt(false);
        boolean bool = class248_sub9.readUnsignedByte((byte) -98) == 1;
        return new Class206(i_19_, class186, class272, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, i_27_, bool);
    }
}
