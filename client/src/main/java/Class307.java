/* Class307 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class307 {
    static WorldAddress aWorldAddress_3551;
    private Class381 aClass381_3552;
    static int anInt3553;
    static int anInt3554;
    static int anInt3555;
    private Class278 aClass278_3556 = new Class278(64);
    static int anInt3557;
    private static short[] aShortArray3558 = {6798, 8741, 25238, 4626, 4550};
    private static short[] aShortArray3559 = {-1, -1, -1, -1, -1};
    static int anInt3560;
    static int anInt3561;
    static int anInt3562;
    static int anInt3563;
    static short[][] aShortArrayArray3564;
    static int anInt3565;
    private static short[] aShortArray3566 = {-10304, 9104, 25485, 4620, 4540};
    static int anInt3567;

    final void method3222(int i) {
        synchronized (aClass278_3556) {
            aClass278_3556.method2869(0);
        }
        anInt3563++;
        int i_0_ = -17 / ((-80 - i) / 41);
    }

    static final void method3223(Node_Sub15 class248_sub15, byte i) {
        if (((Node_Sub15) class248_sub15).aClass248_Sub31_6996 != null)
            ((Node_Sub31) ((Node_Sub15) class248_sub15).aClass248_Sub31_6996).anInt7194 = 0;
        ((Node_Sub15) class248_sub15).aBoolean6997 = false;
        anInt3555++;
        if (i < -83) {
            for (Node_Sub15 class248_sub15_1_ = class248_sub15.method2401(); class248_sub15_1_ != null; class248_sub15_1_ = class248_sub15.method2399())
                method3223(class248_sub15_1_, (byte) -106);
        }
    }

    final void method3224(int i, byte i_2_) {
        if (i_2_ != 42)
            aShortArrayArray3564 = null;
        synchronized (aClass278_3556) {
            aClass278_3556.method2864(i, -15782);
        }
        anInt3554++;
    }

    static final String[] method3225(int i, String[] strings) {
        if (i != -28574)
            method3229(77);
        anInt3561++;
        String[] strings_3_ = new String[5];
        for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -6; i_4_++) {
            strings_3_[i_4_] = String.valueOf(i_4_) + ": ";
            if (strings != null && strings[i_4_] != null)
                strings_3_[i_4_] = strings_3_[i_4_] + strings[i_4_];
        }
        return strings_3_;
    }

    static final void method3226(byte i, ha var_ha) {
        anInt3553++;
        Class168.aClass48_1968 = Node_Sub25.method2548(Class293.anInt3438, var_ha, (byte) 58, true);
        s_Sub2.aClass285_7962 = Class128.method1160(var_ha, Class293.anInt3438, 27198);
        if (i > -90)
            method3225(-15, null);
        Canvas_Sub1.aClass48_71 = Node_Sub25.method2548(Class214.anInt2474, var_ha, (byte) 58, true);
        Node_Sub14_Sub31.aClass285_9492 = Class128.method1160(var_ha, Class214.anInt2474, 27198);
        Node_Sub14_Sub27.aClass48_9449 = Node_Sub25.method2548(Class340.anInt3961, var_ha, (byte) 58, true);
        Class264.aClass285_2996 = Class128.method1160(var_ha, Class340.anInt3961, 27198);
    }

    public static void method3227(int i) {
        aShortArray3566 = null;
        aShortArray3559 = null;
        aShortArrayArray3564 = null;
        if (i < -114) {
            aShortArray3558 = null;
            aWorldAddress_3551 = null;
        }
    }

    final void method3228(int i) {
        if (i != -1)
            aShortArrayArray3564 = null;
        synchronized (aClass278_3556) {
            aClass278_3556.method2872((byte) -78);
        }
        anInt3562++;
    }

    static final void method3229(int i) {
        anInt3560++;
        Class141.aClass278_5052.method2872((byte) -78);
        Node_Sub14_Sub24.aClass278_9410.method2872((byte) -78);
        if (i >= 27) {
            Class347.aClass278_4144.method2872((byte) -78);
            Class280.aClass278_3258.method2872((byte) -78);
        }
    }

    Class307(Class215 class215, int i, Class381 class381) {
        aClass381_3552 = class381;
        if (aClass381_3552 != null)
            aClass381_3552.method3899(35, 0);
    }

    final Class198 method3230(int i, int i_5_) {
        anInt3567++;
        Class198 class198;
        synchronized (aClass278_3556) {
            class198 = (Class198) aClass278_3556.method2863(4, (long) i_5_);
        }
        if (class198 != null)
            return class198;
        byte[] is;
        synchronized (aClass381_3552) {
            is = aClass381_3552.method3922((byte) 119, i, i_5_);
        }
        class198 = new Class198();
        if (is != null)
            class198.method1676((byte) 64, new ByteStream(is));
        class198.method1673(i + -29);
        synchronized (aClass278_3556) {
            aClass278_3556.method2867((byte) 0, (long) i_5_, class198);
        }
        return class198;
    }

    static {
        aShortArrayArray3564 = new short[][]{aShortArray3558, aShortArray3566, aShortArray3559};
    }
}
