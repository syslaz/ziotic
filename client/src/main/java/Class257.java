/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class257 {
    static int anInt2935;
    Class381 aClass381_2936;
    private Class381 aClass381_2937;
    static int anInt2938;
    static int anInt2939;
    static int anInt2940;
    static int anInt2941 = 1401;
    static int anInt2942;
    static int anInt2943;
    private Class278 aClass278_2944 = new Class278(128);
    Class278 aClass278_2945 = new Class278(64);

    final Class56 method2750(byte i, int i_0_) {
        anInt2939++;
        Class56 class56;
        synchronized (aClass278_2944) {
            class56 = (Class56) aClass278_2944.method2863(4, (long) i_0_);
        }
        if (class56 != null)
            return class56;
        if (i <= 22)
            method2754((byte) -68);
        byte[] is;
        synchronized (aClass381_2937) {
            is = aClass381_2937.method3922((byte) 124, 36, i_0_);
        }
        class56 = new Class56();
        ((Class56) class56).aClass257_745 = this;
        ((Class56) class56).anInt758 = i_0_;
        if (is != null)
            class56.method450((byte) 101, new ByteStream(is));
        class56.method445((byte) 87);
        synchronized (aClass278_2944) {
            aClass278_2944.method2867((byte) 0, (long) i_0_, class56);
        }
        return class56;
    }

    final void method2751(int i, byte i_1_, int i_2_) {
        anInt2940++;
        aClass278_2944 = new Class278(i);
        if (i_1_ > -76)
            anInt2941 = -114;
        ((Class257) this).aClass278_2945 = new Class278(i_2_);
    }

    static final void method2752(int i, Player player, byte i_3_, int[] is) {
        anInt2942++;
        if ((((Entity) player).anIntArray10414) != null) {
            boolean bool = true;
            for (int i_4_ = 0; ((i_4_ ^ 0xffffffff) > ((((Entity) player).anIntArray10414).length ^ 0xffffffff)); i_4_++) {
                if ((((Entity) player).anIntArray10414[i_4_]) != is[i_4_]) {
                    bool = false;
                    break;
                }
            }
            if (bool && (((Entity) player).anInt10444) != -1) {
                Class182 class182 = (Class235.aClass356_2617.method3790((byte) -90, ((Entity) player).anInt10444));
                int i_5_ = ((Class182) class182).anInt2102;
                if ((i_5_ ^ 0xffffffff) == -2) {
                    ((Entity) player).anInt10466 = 0;
                    ((Entity) player).anInt10424 = i;
                    ((Entity) player).anInt10419 = 0;
                    ((Entity) player).anInt10407 = 1;
                    ((Entity) player).anInt10420 = 0;
                    if (!((Entity) player).aBoolean10439)
                        Class158.method1396(class182, (((Entity) player).anInt10420), player, true);
                }
                if ((i_5_ ^ 0xffffffff) == -3)
                    ((Entity) player).anInt10419 = 0;
            }
        }
        boolean bool = true;
        if (i_3_ > 35) {
            for (int i_6_ = 0; is.length > i_6_; i_6_++) {
                if ((is[i_6_] ^ 0xffffffff) != 0)
                    bool = false;
                if ((((Entity) player).anIntArray10414) == null || (((Entity) player).anIntArray10414[i_6_] == -1) || (((((Class182) Class235.aClass356_2617.method3790((byte) -90, is[i_6_])).anInt2101) ^ 0xffffffff) <= (((Class182) (Class235.aClass356_2617.method3790((byte) -90, (((Entity) player).anIntArray10414[i_6_])))).anInt2101 ^ 0xffffffff))) {
                    ((Entity) player).anInt10424 = i;
                    ((Entity) player).anIntArray10414 = is;
                    break;
                }
            }
            if (bool) {
                ((Entity) player).anIntArray10414 = is;
                ((Entity) player).anInt10424 = i;
            }
        }
    }

    final void method2753(int i, int i_7_) {
        synchronized (aClass278_2944) {
            aClass278_2944.method2864(i_7_, -15782);
        }
        anInt2938++;
        if (i > -30)
            anInt2941 = -17;
        synchronized (((Class257) this).aClass278_2945) {
            ((Class257) this).aClass278_2945.method2864(i_7_, -15782);
        }
    }

    final void method2754(byte i) {
        anInt2935++;
        synchronized (aClass278_2944) {
            aClass278_2944.method2869(0);
            if (i != -68)
                method2750((byte) 60, 13);
        }
        synchronized (((Class257) this).aClass278_2945) {
            ((Class257) this).aClass278_2945.method2869(0);
        }
    }

    final void method2755(int i) {
        synchronized (aClass278_2944) {
            aClass278_2944.method2872((byte) -78);
            if (i != 0)
                aClass278_2944 = null;
        }
        anInt2943++;
        synchronized (((Class257) this).aClass278_2945) {
            ((Class257) this).aClass278_2945.method2872((byte) -78);
        }
    }

    Class257(Class215 class215, int i, Class381 class381, Class381 class381_8_) {
        ((Class257) this).aClass381_2936 = class381_8_;
        aClass381_2937 = class381;
        aClass381_2937.method3899(36, 0);
    }
}
