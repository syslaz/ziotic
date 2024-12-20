/* Class346_Sub7_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub7_Sub2_Sub2 extends Animable {
    private int anInt10321;
    private int anInt10322;
    static int anInt10323;
    static int anInt10324;
    private int anInt10325;
    private int anInt10326 = 0;
    private double aDouble10327;
    private int anInt10328;
    private double aDouble10329;
    int anInt10330;
    private boolean aBoolean10331;
    static int anInt10332;
    static int anInt10333;
    int anInt10334;
    static int anInt10335;
    static int anInt10336;
    static int anInt10337;
    private double aDouble10338;
    private int anInt10339 = 0;
    static int anInt10340;
    static int anInt10341;
    static int anInt10342;
    private double aDouble10343;
    static int anInt10344;
    private int anInt10345;
    static int anInt10346;
    private boolean aBoolean10347;
    private Class182 aClass182_10348;
    int anInt10349;
    private Class346_Sub8 aClass346_Sub8_10350;
    static int anInt10351;
    private double aDouble10352;
    static Class186 aClass186_10353;
    static int anInt10354;
    static int anInt10355;
    static int anInt10356;
    static int anInt10357;
    private int anInt10358;
    static int anInt10359;
    static int anInt10360;
    private boolean aBoolean10361;
    private int anInt10362;
    static int anInt10363;
    private int anInt10364;
    private double aDouble10365;
    private int anInt10366;
    static int anInt10367;
    int anInt10368;
    private int anInt10369;
    static int anInt10370;
    private double aDouble10371;
    private int anInt10372;
    private double aDouble10373;

    final int method3580(int i) {
        anInt10370++;
        if (i != -32768)
            aDouble10329 = -2.0481417294365354;
        return anInt10339;
    }

    final boolean method3579(ha var_ha, int i, int i_0_, byte i_1_) {
        if (i_1_ != 103)
            finalize();
        anInt10333++;
        return false;
    }

    final int method3567(byte i) {
        anInt10336++;
        if (i < 81)
            method3613(null, null, (byte) 76);
        return anInt10328;
    }

    final void method3573(ha var_ha, byte i) {
        anInt10356++;
        Class162 class162 = method3608(var_ha, 0, false);
        if (class162 != null) {
            Viewport viewport = var_ha.o();
            viewport.method1861(anInt10372);
            viewport.method1858(anInt10345);
            viewport.method1862((int) aDouble10329, (int) aDouble10343, (int) aDouble10365);
            anInt10339 = class162.fa();
            anInt10328 = class162.ma();
            method3612(var_ha, -96, class162, viewport);
            if (i <= 121)
                aDouble10373 = -1.0411594145769523;
        }
    }

    final void method3607(int i) {
        if (aClass346_Sub8_10350 != null)
            aClass346_Sub8_10350.method3706();
        if (i != 0)
            anInt10345 = 124;
        anInt10360++;
    }

    final void updateCoordinateBounds(byte i) {
        ((Animable) this).y1 = ((Animable) this).y2 = (short) (int) (aDouble10365 / 512.0);
        ((Animable) this).x1 = ((Animable) this).x2 = (short) (int) (aDouble10329 / 512.0);
        if (i < -125)
            anInt10346++;
    }

    private final Class162 method3608(ha var_ha, int i, boolean bool) {
        anInt10354++;
        Class51 class51 = Class279_Sub2.aClass151_7577.method1353(anInt10325, -1);
        if (bool != false)
            method3580(-75);
        return class51.method409(var_ha, i, 0, anInt10364, anInt10326, Class235.aClass356_2617, anInt10366);
    }

    final void method3609(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt10357++;
        if (!aBoolean10347) {
            double d = (double) (-((Interactable) this).x + i);
            double d_6_ = (double) (-((Interactable) this).y + i_2_);
            double d_7_ = Math.sqrt(d_6_ * d_6_ + d * d);
            aDouble10329 = ((double) ((Interactable) this).x + d * (double) anInt10322 / d_7_);
            aDouble10365 = ((double) ((Interactable) this).y + d_6_ * (double) anInt10322 / d_7_);
            if (!aBoolean10361)
                aDouble10343 = (double) ((Interactable) this).anInt8317;
            else
                aDouble10343 = (double) (Class353.method3753((int) aDouble10365, (int) aDouble10329, 127, (((Interactable) this).plane)) - anInt10321);
        }
        double d = (double) (1 + (((Class346_Sub7_Sub2_Sub2) this).anInt10330 + -i_5_));
        aDouble10338 = ((double) i_2_ - aDouble10365) / d;
        aDouble10373 = (-aDouble10329 + (double) i) / d;
        aDouble10352 = Math.sqrt(aDouble10373 * aDouble10373 + aDouble10338 * aDouble10338);
        if ((anInt10369 ^ 0xffffffff) != i_3_) {
            if (!aBoolean10347)
                aDouble10327 = (-aDouble10352 * Math.tan(0.02454369 * (double) anInt10369));
            aDouble10371 = 2.0 * (-(d * aDouble10327) + ((double) i_4_ - aDouble10343)) / (d * d);
        } else
            aDouble10327 = (-aDouble10343 + (double) i_4_) / d;
    }

    final void method3610(boolean bool) {
        if (bool != true)
            aBoolean10347 = false;
        anInt10359++;
        if (!aBoolean10347) {
            if ((anInt10362 ^ 0xffffffff) != -1) {
                Entity entity = null;
                if ((anInt10362 ^ 0xffffffff) <= -1) {
                    int i = anInt10362 + -1;
                    Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i, (byte) 31));
                    if (class248_sub10 != null)
                        entity = (((Node_Sub10) class248_sub10).aNPC_6946);
                } else {
                    int i = -1 + -anInt10362;
                    if (i != Class282_Sub29.anInt7896)
                        entity = (Node_Sub32.aPlayerArray7197[i]);
                    else
                        entity = Class347.myPlayer;
                }
                if (entity != null) {
                    ((Interactable) this).y = ((Interactable) entity).y;
                    ((Interactable) this).x = ((Interactable) entity).x;
                    ((Interactable) this).anInt8317 = Class353.method3753((((Interactable) entity).y), (((Interactable) entity).x), -70, (((Interactable) this).plane)) + -anInt10321;
                    if (anInt10358 >= 0) {
                        Class281 class281 = entity.method3642(0);
                        int i = 0;
                        int i_8_ = 0;
                        if (((Class281) class281).anIntArrayArray3291 != null && (((Class281) class281).anIntArrayArray3291[anInt10358]) != null) {
                            i_8_ += (((Class281) class281).anIntArrayArray3291[anInt10358][2]);
                            i += (((Class281) class281).anIntArrayArray3291[anInt10358][0]);
                        }
                        if (((Class281) class281).anIntArrayArray3308 != null && (((Class281) class281).anIntArrayArray3308[anInt10358]) != null) {
                            i_8_ += (((Class281) class281).anIntArrayArray3308[anInt10358][2]);
                            i += (((Class281) class281).anIntArrayArray3308[anInt10358][0]);
                        }
                        if ((i ^ 0xffffffff) != -1 || i_8_ != 0) {
                            int i_9_ = ((Entity) entity).aClass109_10471.method759((byte) -74);
                            int i_10_ = i_9_;
                            if ((((Entity) entity).anIntArray10425 != null) && (((Entity) entity).anIntArray10425[anInt10358]) != -1)
                                i_10_ = (((Entity) entity).anIntArray10425[anInt10358]);
                            int i_11_ = 0x3fff & i_10_ - i_9_;
                            int i_12_ = Node_Sub9_Sub1.anIntArray9106[i_11_];
                            int i_13_ = Node_Sub9_Sub1.anIntArray9109[i_11_];
                            int i_14_ = i_13_ * i + i_8_ * i_12_ >> 1293964366;
                            i_8_ = i_8_ * i_13_ + -(i_12_ * i) >> 1323230382;
                            i = i_14_;
                            ((Interactable) this).y += i_8_;
                            ((Interactable) this).x += i;
                        }
                    }
                }
            }
        }
    }

    final boolean method3568(int i) {
        int i_15_ = -88 % ((i - 53) / 45);
        anInt10337++;
        return false;
    }

    static final void method3611(ha var_ha, int i) {
        anInt10363++;
        if ((Class338.anInt3939 != (((Interactable) Class347.myPlayer).plane)) && Class311.aClass137ArrayArrayArray3620 != null) {
            if (Node_Sub14_Sub32.method2369(var_ha, (byte) -98, (((Interactable) Class347.myPlayer).plane)))
                Class338.anInt3939 = ((Interactable) Class347.myPlayer).plane;
            if (i != -1445596343)
                aClass186_10353 = null;
        }
    }

    final Class346_Sub10 method3578(int i, ha var_ha) {
        anInt10341++;
        Class162 class162 = method3608(var_ha, 2048, false);
        if (i != -1)
            method3610(true);
        if (class162 == null)
            return null;
        Viewport viewport = var_ha.o();
        viewport.method1861(anInt10372);
        viewport.method1858(anInt10345);
        viewport.method1862((int) aDouble10329, (int) aDouble10343, (int) aDouble10365);
        method3612(var_ha, -121, class162, viewport);
        Class346_Sub10 class346_sub10 = Class282_Sub21.method3013(false, (byte) 124, 1);
        if (!Class357.aBoolean4416)
            class162.method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), 0);
        else
            class162.method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), ObjectDefinition.anInt3100, 0);
        if (aClass346_Sub8_10350 != null) {
            Class338 class338 = aClass346_Sub8_10350.method3714();
            if (!Class357.aBoolean4416)
                var_ha.a(class338);
            else
                var_ha.a(class338, ObjectDefinition.anInt3100);
        }
        aBoolean10331 = class162.F();
        anInt10339 = class162.fa();
        anInt10328 = class162.ma();
        return class346_sub10;
    }

    final boolean method3563(boolean bool) {
        if (bool != false)
            method3577(-86);
        anInt10351++;
        return aBoolean10331;
    }

    private final void method3612(ha var_ha, int i, Class162 class162, Viewport viewport) {
        class162.method1442(viewport);
        anInt10355++;
        Class40[] class40s = class162.method1431();
        if (i > -77)
            method3607(-3);
        Class124[] class124s = class162.method1426();
        if ((aClass346_Sub8_10350 == null || ((Class346_Sub8) aClass346_Sub8_10350).aBoolean8330) && (class40s != null || class124s != null))
            aClass346_Sub8_10350 = Class346_Sub8.method3716(Node_Sub18.anInt7027, true);
        if (aClass346_Sub8_10350 != null) {
            aClass346_Sub8_10350.method3712(var_ha, (long) Node_Sub18.anInt7027, class40s, class124s, false);
            aClass346_Sub8_10350.method3703(((Interactable) this).plane, ((Animable) this).x1, ((Animable) this).x2, ((Animable) this).y1, ((Animable) this).y2);
        }
    }

    Class346_Sub7_Sub2_Sub2(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, boolean bool, int i_28_) {
        super(i_16_, i_17_, i_18_, -i_20_ + Class353.method3753(i_19_, i_18_, -13, i_16_), i_19_, i_18_ >> -1445596343, i_18_ >> 449308041, i_19_ >> -1002856759, i_19_ >> 1146608297, false, (byte) 0);
        aBoolean10331 = false;
        anInt10328 = 0;
        aBoolean10347 = false;
        anInt10364 = 0;
        anInt10366 = -1;
        anInt10321 = i_20_;
        ((Class346_Sub7_Sub2_Sub2) this).anInt10330 = i_22_;
        aBoolean10347 = false;
        anInt10325 = i;
        ((Class346_Sub7_Sub2_Sub2) this).anInt10368 = i_21_;
        anInt10362 = i_25_;
        anInt10322 = i_24_;
        ((Class346_Sub7_Sub2_Sub2) this).anInt10349 = i_26_;
        aBoolean10361 = bool;
        ((Class346_Sub7_Sub2_Sub2) this).anInt10334 = i_27_;
        anInt10358 = i_28_;
        anInt10369 = i_23_;
        int i_29_ = (((Class51) Class279_Sub2.aClass151_7577.method1353(anInt10325, -1)).anInt690);
        if (i_29_ == -1)
            aClass182_10348 = null;
        else
            aClass182_10348 = Class235.aClass356_2617.method3790((byte) -90, i_29_);
    }

    final void method3577(int i) {
        anInt10340++;
        if (i == 131072)
            throw new IllegalStateException();
    }

    static final void method3613(long[] ls, int[] is, byte i) {
        anInt10324++;
        if (i != -123)
            aClass186_10353 = null;
        Class298.method3170(ls, ls.length - 1, -25186, is, 0);
    }

    final void method3614(int i, int i_30_) {
        aBoolean10347 = true;
        aDouble10365 += (double) i_30_ * aDouble10338;
        anInt10342++;
        aDouble10329 += (double) i_30_ * aDouble10373;
        if (aBoolean10361)
            aDouble10343 = (double) (Class353.method3753((int) aDouble10365, (int) aDouble10329, 126, (((Interactable) this).plane)) - anInt10321);
        else if (anInt10369 != -1) {
            aDouble10343 += (aDouble10327 * (double) i_30_ + aDouble10371 * 0.5 * (double) i_30_ * (double) i_30_);
            aDouble10327 += (double) i_30_ * aDouble10371;
        } else
            aDouble10343 += aDouble10327 * (double) i_30_;
        anInt10345 = (int) (2607.5945876176133 * Math.atan2(aDouble10373, aDouble10338)) + 8192 & 0x3fff;
        anInt10372 = 0x3fff & (int) (Math.atan2(aDouble10327, aDouble10352) * 2607.5945876176133);
        if (i < 111)
            anInt10321 = -99;
        if (aClass182_10348 != null) {
            anInt10364 += i_30_;
            while ((anInt10364 ^ 0xffffffff) < (((Class182) aClass182_10348).anIntArray2113[anInt10326] ^ 0xffffffff)) {
                anInt10364 -= ((Class182) aClass182_10348).anIntArray2113[anInt10326];
                anInt10326++;
                if ((anInt10326 ^ 0xffffffff) <= (((Class182) aClass182_10348).anIntArray2117.length ^ 0xffffffff)) {
                    anInt10326 -= ((Class182) aClass182_10348).anInt2130;
                    if ((anInt10326 ^ 0xffffffff) > -1 || ((anInt10326 ^ 0xffffffff) <= ((((Class182) aClass182_10348).anIntArray2117).length ^ 0xffffffff)))
                        anInt10326 = 0;
                }
                anInt10366 = 1 + anInt10326;
                if ((anInt10366 ^ 0xffffffff) <= (((Class182) aClass182_10348).anIntArray2117.length ^ 0xffffffff)) {
                    anInt10366 -= ((Class182) aClass182_10348).anInt2130;
                    if ((anInt10366 ^ 0xffffffff) > -1 || (((Class182) aClass182_10348).anIntArray2117.length <= anInt10366))
                        anInt10366 = -1;
                }
            }
        }
    }

    final boolean method3574(byte i) {
        anInt10332++;
        int i_31_ = -74 / ((i - 14) / 57);
        return false;
    }

    protected final void finalize() {
        if (aClass346_Sub8_10350 != null)
            aClass346_Sub8_10350.method3706();
        anInt10323++;
    }

    final void method3572(Interactable interactable, ha var_ha, int i, int i_32_, int i_33_, boolean bool, int i_34_) {
        anInt10344++;
        if (i_32_ < 109)
            anInt10358 = -81;
        throw new IllegalStateException();
    }

    final Class38 method3575(byte i, ha var_ha) {
        anInt10367++;
        if (i >= -86)
            anInt10372 = -85;
        return null;
    }

    public static void method3615(int i) {
        if (i == -1)
            aClass186_10353 = null;
    }
}
