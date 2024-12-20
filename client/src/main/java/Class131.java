/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class131 {
    private Class278 aClass278_1592 = new Class278(64);
    static int anInt1593;
    static int anInt1594;
    static int anInt1595;
    static int[] anIntArray1596;
    static int anInt1597;
    static int anInt1598;
    private Class381 aClass381_1599;
    static int anInt1600 = 0;
    static int anInt1601;
    static int anInt1602;
    static int anInt1603 = -1;
    static int anInt1604;
    static int[] anIntArray1605;

    static final int method1206(int i, int i_0_, int i_1_) {
        anInt1597++;
        if (i_0_ == -1)
            return 12345678;
        i_1_ = i_1_ * (i_0_ & 0x7f) >> -1932903897;
        if (i >= (i_1_ ^ 0xffffffff)) {
            if (i_1_ > 126)
                i_1_ = 126;
        } else
            i_1_ = 2;
        return (0xff80 & i_0_) - -i_1_;
    }

    static final void method1207(int i) {
        anInt1593++;
        Class192.aClass278_2204.method2872((byte) -78);
        if (i > -75)
            anInt1603 = -119;
    }

    static final void method1208(int i) {
        Class118.anInt1482 = i;
        for (int i_2_ = 0; i_2_ < Class225_Sub1.anInt8454; i_2_++) {
            for (int i_3_ = 0; i_3_ < Class89.anInt1106; i_3_++) {
                if (Class311.aClass137ArrayArrayArray3620[i][i_2_][i_3_] == null)
                    Class311.aClass137ArrayArrayArray3620[i][i_2_][i_3_] = new Class137(i);
            }
        }
    }

    public static void method1209(byte i) {
        if (i <= 41)
            anInt1603 = 124;
        anIntArray1596 = null;
        anIntArray1605 = null;
    }

    final void method1210(byte i) {
        synchronized (aClass278_1592) {
            if (i != -126)
                return;
            aClass278_1592.method2872((byte) -78);
        }
        anInt1604++;
    }

    static final void method1211(boolean bool, long l, long l_4_, boolean bool_5_, int i, int i_6_, boolean bool_7_, int i_8_, int i_9_, String string, byte i_10_, String string_11_, int i_12_) {
        anInt1594++;
        if (!Class145.aBoolean1721 && Class379.anInt4638 < 500) {
            i_9_ = (i_9_ ^ 0xffffffff) != 0 ? i_9_ : Class136_Sub4.anInt8413;
            Node_Sub8_Sub11 class248_sub8_sub11 = new Node_Sub8_Sub11(string, string_11_, i_9_, i_6_, i_8_, l_4_, i_12_, i, bool, bool_7_, l, bool_5_);
            if (i_10_ != 87)
                anInt1600 = -32;
            Canvas_Sub1.method123(class248_sub8_sub11, 73);
        }
    }

    final void method1212(int i, int i_13_) {
        anInt1602++;
        synchronized (aClass278_1592) {
            aClass278_1592.method2864(i_13_, -15782);
            if (i <= 108)
                method1212(-12, 93);
        }
    }

    final Class281 method1213(int i, int i_14_) {
        anInt1601++;
        Class281 class281;
        synchronized (aClass278_1592) {
            class281 = (Class281) aClass278_1592.method2863(i ^ ~0x4fb3, (long) i_14_);
        }
        if (class281 != null)
            return class281;
        byte[] is;
        synchronized (aClass381_1599) {
            if (i != -20408)
                aClass278_1592 = null;
            is = aClass381_1599.method3922((byte) 114, 32, i_14_);
        }
        class281 = new Class281();
        if (is != null)
            class281.method2913(new ByteStream(is), (byte) -25);
        synchronized (aClass278_1592) {
            aClass278_1592.method2867((byte) 0, (long) i_14_, class281);
        }
        return class281;
    }

    final void method1214(byte i) {
        anInt1595++;
        synchronized (aClass278_1592) {
            if (i <= 58) {
                /* empty */
            } else
                aClass278_1592.method2869(0);
        }
    }

    Class131(Class215 class215, int i, Class381 class381) {
        aClass381_1599 = class381;
        aClass381_1599.method3899(32, 0);
    }

    static final void method1215(int i) {
        Class338.anInt3939 = -1;
        anInt1598++;
        Class295.aClass129_3452 = null;
        if (i != -31736)
            anInt1600 = 110;
    }

    static {
        anIntArray1596 = new int[1000];
        anIntArray1605 = new int[]{4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
    }
}
