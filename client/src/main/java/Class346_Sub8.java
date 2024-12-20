/* Class346_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub8 extends Class346 {
    private Class360 aClass360_8326;
    int anInt8327 = 0;
    private long aLong8328;
    private long aLong8329;
    boolean aBoolean8330 = false;
    private static boolean[] aBooleanArray8331 = new boolean[32];
    private boolean aBoolean8332 = false;
    Class346_Sub5_Sub2_Sub1[] aClass346_Sub5_Sub2_Sub1Array8333;
    private static boolean[] aBooleanArray8334 = new boolean[8];
    private int anInt8335;
    Class293 aClass293_8336;
    private boolean aBoolean8337;
    Class338 aClass338_8338;
    private int anInt8339;
    int anInt8340;
    boolean aBoolean8341;

    public static void method3702() {
        aBooleanArray8331 = null;
        aBooleanArray8334 = null;
    }

    final void method3703(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        ((Class346_Sub8) this).anInt8340 = i;
    }

    private final void method3704(int i, boolean bool) {
        Node_Sub2_Sub3.aClass360_8861.method3811(this, 0);
        aLong8329 = (long) i;
        aLong8328 = (long) i;
        aBoolean8337 = true;
        ((Class346_Sub8) this).aBoolean8341 = bool;
    }

    private final void method3705(ha var_ha, Class40[] class40s, boolean bool) {
        for (int i = 0; i < 32; i++)
            aBooleanArray8331[i] = false;
        while_129_:
        for (Class346_Sub6 class346_sub6 = (Class346_Sub6) aClass360_8326.method3815((byte) 63); class346_sub6 != null; class346_sub6 = (Class346_Sub6) aClass360_8326.method3809(-24951)) {
            if (class40s != null) {
                for (int i = 0; i < class40s.length; i++) {
                    if ((((Class346_Sub6) class346_sub6).aClass40_8289 == class40s[i]) || (((Class346_Sub6) class346_sub6).aClass40_8289 == ((Class40) class40s[i]).aClass40_448)) {
                        aBooleanArray8331[i] = true;
                        class346_sub6.method3562((byte) 37);
                        ((Class346_Sub6) class346_sub6).aBoolean8286 = false;
                        continue while_129_;
                    }
                }
            }
            if (!bool) {
                if (((Class346_Sub6) class346_sub6).anInt8285 == 0) {
                    class346_sub6.method3538(-118);
                    anInt8335--;
                } else
                    ((Class346_Sub6) class346_sub6).aBoolean8286 = true;
            }
        }
        if (class40s != null) {
            for (int i = 0; i < class40s.length; i++) {
                if (i == 32 || anInt8335 == 32)
                    break;
                if (!aBooleanArray8331[i]) {
                    Class346_Sub6 class346_sub6 = new Class346_Sub6(var_ha, class40s[i], this, aLong8329);
                    aClass360_8326.method3811(class346_sub6, 0);
                    anInt8335++;
                    aBooleanArray8331[i] = true;
                }
            }
        }
    }

    final void method3706() {
        aBoolean8332 = true;
    }

    final void method3707(ha var_ha) {
        ((Class338) ((Class346_Sub8) this).aClass338_8338).aClass26_3941.method250(-10538);
        for (Class346_Sub6 class346_sub6 = (Class346_Sub6) aClass360_8326.method3815((byte) 84); class346_sub6 != null; class346_sub6 = (Class346_Sub6) aClass360_8326.method3809(-24951))
            class346_sub6.method3561(aLong8328, -31392, var_ha);
    }

    private final void method3708() {
        aBoolean8332 = false;
    }

    final boolean method3709(ha var_ha, long l) {
        if (aLong8329 != aLong8328)
            method3706();
        else
            method3708();
        if (l - aLong8329 > 750L) {
            method3715();
            return false;
        }
        int i = (int) (l - aLong8328);
        if (aBoolean8337) {
            for (Class346_Sub6 class346_sub6 = (Class346_Sub6) aClass360_8326.method3815((byte) 73); class346_sub6 != null; class346_sub6 = (Class346_Sub6) aClass360_8326.method3809(-24951)) {
                for (int i_4_ = 0; i_4_ < ((Class90) (((Class346_Sub6) class346_sub6).aClass90_8294)).anInt1169; i_4_++)
                    class346_sub6.method3560(1, !aBoolean8332, var_ha, true, l);
            }
            aBoolean8337 = false;
        }
        for (Class346_Sub6 class346_sub6 = (Class346_Sub6) aClass360_8326.method3815((byte) 54); class346_sub6 != null; class346_sub6 = (Class346_Sub6) aClass360_8326.method3809(-24951))
            class346_sub6.method3560(i, !aBoolean8332, var_ha, true, l);
        aLong8328 = l;
        return true;
    }

    private final void method3710(Class124[] class124s, boolean bool) {
        for (int i = 0; i < 8; i++)
            aBooleanArray8334[i] = false;
        while_131_:
        for (Node_Sub8_Sub17 class248_sub8_sub17 = ((Node_Sub8_Sub17) ((Class346_Sub8) this).aClass293_8336.method3119(2)); class248_sub8_sub17 != null; class248_sub8_sub17 = ((Node_Sub8_Sub17) ((Class346_Sub8) this).aClass293_8336.method3107(-127))) {
            if (class124s != null) {
                for (int i = 0; i < class124s.length; i++) {
                    if ((((Node_Sub8_Sub17) class248_sub8_sub17).aClass124_9061) == class124s[i] || ((((Node_Sub8_Sub17) class248_sub8_sub17).aClass124_9061) == ((Class124) class124s[i]).aClass124_1531)) {
                        aBooleanArray8334[i] = true;
                        class248_sub8_sub17.method2142(25201);
                        continue while_131_;
                    }
                }
            }
            if (!bool) {
                class248_sub8_sub17.remove(true);
                anInt8339--;
                if (class248_sub8_sub17.method2018((byte) 65)) {
                    class248_sub8_sub17.method2021((byte) -26);
                    Class101.anInt1292--;
                }
            }
        }
        if (class124s != null) {
            for (int i = 0; i < class124s.length; i++) {
                if (i == 8 || anInt8339 == 8)
                    break;
                if (!aBooleanArray8334[i]) {
                    Node_Sub8_Sub17 class248_sub8_sub17 = null;
                    if (((Class303) class124s[i].method1142(0)).anInt3520 == 1 && Class101.anInt1292 < 32) {
                        class248_sub8_sub17 = new Node_Sub8_Sub17(class124s[i], this);
                        Class52.aClass179_709.method1596(class248_sub8_sub17, (long) (((Class124) class124s[i]).anInt1537), false);
                        Class101.anInt1292++;
                    }
                    if (class248_sub8_sub17 == null)
                        class248_sub8_sub17 = new Node_Sub8_Sub17(class124s[i], this);
                    ((Class346_Sub8) this).aClass293_8336.method3109(class248_sub8_sub17, -115);
                    anInt8339++;
                    aBooleanArray8334[i] = true;
                }
            }
        }
    }

    final Class338 method3711() {
        ((Class338) ((Class346_Sub8) this).aClass338_8338).aClass26_3941.method250(-10538);
        for (int i = 0; i < (((Class346_Sub8) this).aClass346_Sub5_Sub2_Sub1Array8333).length; i++) {
            if ((((Class346_Sub8) this).aClass346_Sub5_Sub2_Sub1Array8333[i] != null) && ((Class346_Sub5_Sub2_Sub1) (((Class346_Sub8) this).aClass346_Sub5_Sub2_Sub1Array8333[i])).aClass346_Sub6_10315 != null)
                ((Class338) ((Class346_Sub8) this).aClass338_8338).aClass26_3941.method249(-39, (((Class346_Sub8) this).aClass346_Sub5_Sub2_Sub1Array8333[i]));
        }
        return ((Class346_Sub8) this).aClass338_8338;
    }

    final void method3712(ha var_ha, long l, Class40[] class40s, Class124[] class124s, boolean bool) {
        if (!((Class346_Sub8) this).aBoolean8330) {
            method3705(var_ha, class40s, bool);
            method3710(class124s, bool);
            aLong8329 = l;
        }
    }

    final void method3713() {
        aBoolean8337 = true;
    }

    final Class338 method3714() {
        return ((Class346_Sub8) this).aClass338_8338;
    }

    final void method3715() {
        ((Class346_Sub8) this).aBoolean8330 = true;
        for (Node_Sub8_Sub17 class248_sub8_sub17 = ((Node_Sub8_Sub17) ((Class346_Sub8) this).aClass293_8336.method3119(2)); class248_sub8_sub17 != null; class248_sub8_sub17 = ((Node_Sub8_Sub17) ((Class346_Sub8) this).aClass293_8336.method3107(-127))) {
            if (((Class303) (((Node_Sub8_Sub17) class248_sub8_sub17).aClass303_9060)).anInt3520 == 1)
                class248_sub8_sub17.method2021((byte) -26);
        }
        for (int i = 0; i < (((Class346_Sub8) this).aClass346_Sub5_Sub2_Sub1Array8333).length; i++) {
            if (((Class346_Sub8) this).aClass346_Sub5_Sub2_Sub1Array8333[i] != null) {
                ((Class346_Sub8) this).aClass346_Sub5_Sub2_Sub1Array8333[i].method3554();
                ((Class346_Sub8) this).aClass346_Sub5_Sub2_Sub1Array8333[i] = null;
            }
        }
        ((Class346_Sub8) this).anInt8327 = 0;
        aClass360_8326 = new Class360();
        anInt8335 = 0;
        ((Class346_Sub8) this).aClass293_8336 = new Class293();
        anInt8339 = 0;
        this.method3538(-127);
        Class158.aClass346_Sub8Array1877[Node_Sub29.anInt7168] = this;
        Node_Sub29.anInt7168 = (Node_Sub29.anInt7168 + 1 & Class186.anIntArray2168[Node_Sub2_Sub2.anInt8840]);
    }

    static final Class346_Sub8 method3716(int i, boolean bool) {
        if (Node_Sub29.anInt7168 != Node_Sub14_Sub15.anInt9323) {
            Class346_Sub8 class346_sub8 = (Class158.aClass346_Sub8Array1877[Node_Sub14_Sub15.anInt9323]);
            Node_Sub14_Sub15.anInt9323 = (Node_Sub14_Sub15.anInt9323 + 1 & Class186.anIntArray2168[Node_Sub2_Sub2.anInt8840]);
            class346_sub8.method3704(i, bool);
            return class346_sub8;
        }
        return new Class346_Sub8(i, bool);
    }

    final void method3717(long l) {
        aLong8329 = l;
    }

    private Class346_Sub8(int i, boolean bool) {
        aClass360_8326 = new Class360();
        anInt8335 = 0;
        ((Class346_Sub8) this).aClass293_8336 = new Class293();
        aBoolean8337 = false;
        anInt8339 = 0;
        ((Class346_Sub8) this).aBoolean8341 = false;
        ((Class346_Sub8) this).aClass338_8338 = new Class338();
        ((Class346_Sub8) this).aClass346_Sub5_Sub2_Sub1Array8333 = new Class346_Sub5_Sub2_Sub1[8192];
        method3704(i, bool);
    }
}
