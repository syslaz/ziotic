/* Class342 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class342 {
    static int anInt3983;
    static int anInt3984;
    static int anInt3985;
    static int anInt3986;
    static int anInt3987;
    private Class381 aClass381_3988;
    static int anInt3989;
    static int anInt3990;
    private Class278 aClass278_3991 = new Class278(64);
    static int anInt3992;
    static int anInt3993;
    private boolean aBoolean3994;
    static int anInt3995;
    static int anInt3996;
    static int anInt3997;
    static int anInt3998;
    Class381 aClass381_3999;
    int anInt4000;
    int anInt4001;
    static int anInt4002;
    static Class200 aClass200_4003 = new Class200(1);
    Class278 aClass278_4004 = new Class278(50);
    Class219 aClass219_4005 = new Class219(250);
    static int[] anIntArray4006;
    static int[] anIntArray4007;
    static boolean aBoolean4008 = false;
    static int[] anIntArray4009;
    static Class200 aClass200_4010;
    static int[] anIntArray4011;
    private Class72 aClass72_4012 = new Class72();
    static String[] aStringArray4013;
    private Class240 aClass240_4014;
    private String[] aStringArray4015;
    static int anInt4016 = 50;
    static int[] anIntArray4017;
    int anInt4018;
    static int[] anIntArray4019;
    private String[] aStringArray4020;

    static final int method3481(int i) {
        anInt3987++;
        if (i != 50)
            method3489((byte) 54, null);
        synchronized (Node_Sub14_Sub2.aClass278_9175) {
            return Node_Sub14_Sub2.aClass278_9175.method2875(false);
        }
    }

    final Class321 method3482(byte i, int i_0_) {
        if (i < 64)
            return null;
        anInt3984++;
        Class321 class321;
        synchronized (aClass278_3991) {
            class321 = (Class321) aClass278_3991.method2863(4, (long) i_0_);
        }
        if (class321 != null)
            return class321;
        byte[] is;
        synchronized (aClass381_3988) {
            is = aClass381_3988.method3922((byte) 124, Class185.method1622(i_0_, -110), Class1.method169(i_0_, (byte) 95));
        }
        class321 = new Class321();
        ((Class321) class321).aClass342_3714 = this;
        ((Class321) class321).anInt3751 = i_0_;
        ((Class321) class321).aStringArray3704 = (new String[]{null, null, Class41.aClass41_473.method301(((Class342) this).anInt4001, (byte) -108), null, null});
        ((Class321) class321).aStringArray3701 = (new String[]{null, null, null, null, Class41.aClass41_474.method301(((Class342) this).anInt4001, (byte) -108)});
        if (is != null)
            class321.method3329((byte) -33, new ByteStream(is));
        class321.method3331(-122);
        if ((((Class321) class321).anInt3747 ^ 0xffffffff) != 0)
            class321.method3336((byte) 113, method3482((byte) 112, ((Class321) class321).anInt3732), method3482((byte) 105, ((Class321) class321).anInt3747));
        if (((Class321) class321).anInt3775 != -1)
            class321.method3339(method3482((byte) 115, ((Class321) class321).anInt3775), 0, method3482((byte) 113, ((Class321) class321).anInt3759));
        if (((Class321) class321).anInt3735 != -1)
            class321.method3330((byte) 120, method3482((byte) 93, ((Class321) class321).anInt3773), method3482((byte) 76, ((Class321) class321).anInt3735));
        if (!aBoolean3994 && ((Class321) class321).aBoolean3738) {
            ((Class321) class321).aString3702 = Class41.aClass41_470.method301(((Class342) this).anInt4001, (byte) -108);
            ((Class321) class321).anIntArray3761 = null;
            ((Class321) class321).anInt3723 = 0;
            ((Class321) class321).aStringArray3704 = aStringArray4015;
            ((Class321) class321).aStringArray3701 = aStringArray4020;
            ((Class321) class321).aBoolean3754 = false;
            if (((Class321) class321).aClass65_3767 != null) {
                boolean bool = false;
                for (Node node = ((Class321) class321).aClass65_3767.method510(true); node != null; node = ((Class321) class321).aClass65_3767.method512(false)) {
                    Class210 class210 = aClass240_4014.method1923(-6119, (int) (((Node) node).id));
                    if (((Class210) class210).aBoolean2432)
                        node.remove(true);
                    else
                        bool = true;
                }
                if (!bool)
                    ((Class321) class321).aClass65_3767 = null;
            }
        }
        synchronized (aClass278_3991) {
            aClass278_3991.method2867((byte) 0, (long) i_0_, class321);
        }
        return class321;
    }

    final void method3483(int i) {
        anInt3995++;
        synchronized (((Class342) this).aClass278_4004) {
            ((Class342) this).aClass278_4004.method2872((byte) -78);
        }
        if (i > -63)
            anInt4016 = -123;
    }

    final Class129 method3484(int i, int i_1_, int i_2_, ha var_ha, int i_3_, int i_4_, int i_5_, Class332 class332) {
        if (i >= -51)
            method3490(-41, -36);
        ((Class72) aClass72_4012).anInt4877 = i_5_;
        ((Class72) aClass72_4012).anInt4875 = i_2_;
        ((Class72) aClass72_4012).anInt4874 = i_4_;
        anInt3993++;
        ((Class72) aClass72_4012).anInt4878 = i_1_;
        ((Class72) aClass72_4012).anInt4872 = ((ha) var_ha).anInt1418;
        ((Class72) aClass72_4012).anInt4881 = i_3_;
        ((Class72) aClass72_4012).aBoolean4882 = class332 != null;
        return ((Class129) ((Class342) this).aClass219_4005.method1761((byte) 5, aClass72_4012));
    }

    final void method3485(byte i) {
        synchronized (aClass278_3991) {
            aClass278_3991.method2869(0);
        }
        anInt3998++;
        synchronized (((Class342) this).aClass278_4004) {
            ((Class342) this).aClass278_4004.method2869(0);
            if (i < 36)
                method3485((byte) -22);
        }
        synchronized (((Class342) this).aClass219_4005) {
            ((Class342) this).aClass219_4005.method1752(-28524);
        }
    }

    final Class129 method3486(boolean bool, Class332 class332, ha var_ha, boolean bool_6_, int i, ha var_ha_7_, int i_8_, int i_9_, int i_10_, Class48 class48, int i_11_, int i_12_) {
        anInt3985++;
        Class129 class129 = method3484(-98, i, i_11_, var_ha, i_9_, i_12_, i_10_, class332);
        if (class129 != null)
            return class129;
        Class321 class321 = method3482((byte) 112, i_11_);
        if (i_12_ > 1 && ((Class321) class321).anIntArray3774 != null) {
            int i_13_ = -1;
            for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -11; i_14_++) {
                if (((Class321) class321).anIntArray3779[i_14_] <= i_12_ && (((Class321) class321).anIntArray3779[i_14_] ^ 0xffffffff) != -1)
                    i_13_ = ((Class321) class321).anIntArray3774[i_14_];
            }
            if (i_13_ != -1)
                class321 = method3482((byte) 87, i_13_);
        }
        int[] is = class321.method3326(var_ha_7_, i_10_, class48, i_12_, var_ha, i, class332, bool_6_, 49, i_9_);
        if (is == null)
            return null;
        if (i_8_ < 30)
            ((Class342) this).anInt4001 = 66;
        Class129 class129_15_;
        if (!bool)
            class129_15_ = var_ha.method813(32, (byte) 99, 36, is, 0, 36);
        else
            class129_15_ = var_ha_7_.method813(32, (byte) 99, 36, is, 0, 36);
        if (!bool) {
            Class72 class72 = new Class72();
            ((Class72) class72).aBoolean4882 = class332 != null;
            ((Class72) class72).anInt4872 = ((ha) var_ha).anInt1418;
            ((Class72) class72).anInt4877 = i_10_;
            ((Class72) class72).anInt4878 = i;
            ((Class72) class72).anInt4881 = i_9_;
            ((Class72) class72).anInt4874 = i_12_;
            ((Class72) class72).anInt4875 = i_11_;
            ((Class342) this).aClass219_4005.method1764((byte) 3, class129_15_, class72);
        }
        return class129_15_;
    }

    final void method3487(int i, int i_16_) {
        anInt3990++;
        synchronized (aClass278_3991) {
            aClass278_3991.method2864(i, -15782);
        }
        synchronized (((Class342) this).aClass278_4004) {
            ((Class342) this).aClass278_4004.method2864(i, -15782);
            if (i_16_ >= -100)
                aStringArray4020 = null;
        }
        synchronized (((Class342) this).aClass219_4005) {
            ((Class342) this).aClass219_4005.method1755(i, 8192);
        }
    }

    final void method3488(int i) {
        anInt4002++;
        synchronized (aClass278_3991) {
            aClass278_3991.method2872((byte) -78);
        }
        synchronized (((Class342) this).aClass278_4004) {
            ((Class342) this).aClass278_4004.method2872((byte) -78);
        }
        synchronized (((Class342) this).aClass219_4005) {
            ((Class342) this).aClass219_4005.method1754((byte) -126);
        }
        if (i != 11813)
            method3488(-13);
    }

    static final Class297_Sub1 method3489(byte i, ByteStream class248_sub9) {
        anInt3986++;
        Class297 class297 = Class282_Sub26.method3028((byte) 53, class248_sub9);
        if (i <= 66)
            aClass200_4010 = null;
        int i_17_ = class248_sub9.method2190(20198);
        return new Class297_Sub1(((Class297) class297).anInt5020, ((Class297) class297).aClass186_5016, ((Class297) class297).aClass272_5011, ((Class297) class297).anInt5012, ((Class297) class297).anInt5014, i_17_);
    }

    static final int method3490(int i, int i_18_) {
        if (Class250.aByteArrayArray2822 != null)
            return Class250.aByteArrayArray2822[i][i_18_] & 0xff;
        return 0;
    }

    public static void method3491(byte i) {
        aClass200_4010 = null;
        anIntArray4009 = null;
        anIntArray4007 = null;
        int i_19_ = 24 % ((i - -56) / 39);
        anIntArray4011 = null;
        aClass200_4003 = null;
        anIntArray4017 = null;
        anIntArray4019 = null;
        anIntArray4006 = null;
        aStringArray4013 = null;
    }

    final void method3492(byte i) {
        if (i != 103)
            aClass278_3991 = null;
        anInt3989++;
        synchronized (((Class342) this).aClass219_4005) {
            ((Class342) this).aClass219_4005.method1754((byte) -128);
        }
    }

    final void method3493(int i, int i_20_) {
        ((Class342) this).anInt4018 = i_20_;
        anInt3997++;
        synchronized (((Class342) this).aClass278_4004) {
            ((Class342) this).aClass278_4004.method2872((byte) -78);
        }
        if (i != 36)
            method3488(124);
    }

    final void method3494(int i, boolean bool) {
        anInt3992++;
        if (bool == !aBoolean3994) {
            aBoolean3994 = bool;
            method3488(11813);
            if (i != 0)
                aBoolean3994 = true;
        }
    }

    Class342(Class215 class215, int i, boolean bool, Class240 class240, Class381 class381, Class381 class381_21_) {
        ((Class342) this).aClass381_3999 = class381_21_;
        aBoolean3994 = bool;
        aClass381_3988 = class381;
        ((Class342) this).anInt4001 = i;
        aClass240_4014 = class240;
        if (aClass381_3988 == null)
            ((Class342) this).anInt4000 = 0;
        else {
            int i_22_ = aClass381_3988.method3902(0) - 1;
            ((Class342) this).anInt4000 = aClass381_3988.method3899(i_22_, 0) + 256 * i_22_;
        }
        aStringArray4015 = (new String[]{null, null, Class41.aClass41_473.method301(((Class342) this).anInt4001, (byte) -108), null, null});
        aStringArray4020 = (new String[]{null, null, null, null, Class41.aClass41_474.method301(((Class342) this).anInt4001, (byte) -108)});
    }

    static {
        anIntArray4007 = new int[anInt4016];
        anIntArray4011 = new int[anInt4016];
        aStringArray4013 = new String[anInt4016];
        anIntArray4009 = new int[anInt4016];
        anIntArray4019 = new int[anInt4016];
        anIntArray4017 = new int[anInt4016];
        anIntArray4006 = new int[anInt4016];
    }
}
