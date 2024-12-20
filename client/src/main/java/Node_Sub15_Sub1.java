/* Class248_Sub15_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub15_Sub1 extends Node_Sub15 {
    static int anInt9602;
    private int[] anIntArray9603;
    static int anInt9604;
    static int anInt9605;
    static int anInt9606;
    private int[] anIntArray9607;
    static int anInt9608;
    static int anInt9609;
    static int anInt9610;
    static int anInt9611;
    private int[] anIntArray9612;
    static int anInt9613;
    static int anInt9614;
    static int anInt9615;
    static int anInt9616;
    private Class134 aClass134_9617;
    private Node_Sub26[][] aClass248_Sub26ArrayArray9618;
    static int anInt9619;
    static int anInt9620;
    private int anInt9621;
    private int[] anIntArray9622;
    private Node_Sub26[][] aClass248_Sub26ArrayArray9623;
    static int anInt9624;
    private int[] anIntArray9625;
    static int anInt9626;
    int[] anIntArray9627;
    private int[] anIntArray9628;
    static PacketStream aClass248_Sub9_Sub2_9629 = new PacketStream(7500);
    static int anInt9630;
    static int anInt9631;
    static int anInt9632;
    static int anInt9633;
    static int anInt9634;
    static int anInt9635;
    private int anInt9636;
    int[] anIntArray9637;
    static int anInt9638;
    private int[] anIntArray9639;
    static int anInt9640;
    static int anInt9641;
    static int anInt9642;
    static int anInt9643;
    static int anInt9644;
    static int anInt9645;
    static int anInt9646;
    private int[] anIntArray9647;
    private int[] anIntArray9648;
    private int[] anIntArray9649;
    int[] anIntArray9650;
    static int anInt9651;
    static int anInt9652;
    static int anInt9653;
    static int anInt9654;
    static int anInt9655;
    static int anInt9656;
    private Class65 aClass65_9657;
    static int anInt9658;
    private int[] anIntArray9659;
    static int anInt9660;
    static int anInt9661;
    static int anInt9662;
    private int[] anIntArray9663;
    private int[] anIntArray9664;
    private int anInt9665;
    private boolean aBoolean9666;
    private Node_Sub15_Sub4 aClass248_Sub15_Sub4_9667;
    private long aLong9668;
    private int anInt9669;
    static int anInt9670;
    private long aLong9671;
    private Node_Sub44 aClass248_Sub44_9672;
    private int anInt9673;
    private boolean aBoolean9674;

    public static void method2406(int i) {
        if (i != -20927)
            aClass248_Sub9_Sub2_9629 = null;
        aClass248_Sub9_Sub2_9629 = null;
    }

    final synchronized void method2400(int[] is, int i, int i_0_) {
        if (aClass134_9617.method1228()) {
            int i_1_ = (((Class134) aClass134_9617).anInt1630 * anInt9636 / Class54.anInt728);
            do {
                long l = (long) i_0_ * (long) i_1_ + aLong9668;
                if ((aLong9671 - l ^ 0xffffffffffffffffL) <= -1L) {
                    aLong9668 = l;
                    break;
                }
                int i_2_ = (int) ((-1L + (long) i_1_ + (-aLong9668 + aLong9671)) / (long) i_1_);
                aLong9668 += (long) i_2_ * (long) i_1_;
                aClass248_Sub15_Sub4_9667.method2400(is, i, i_2_);
                i += i_2_;
                i_0_ -= i_2_;
                method2417(-6442);
            } while (aClass134_9617.method1228());
        }
        anInt9635++;
        aClass248_Sub15_Sub4_9667.method2400(is, i, i_0_);
    }

    private final void method2407(int i, byte i_3_) {
        for (Node_Sub26 class248_sub26 = ((Node_Sub26) ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass293_9701.method3119(2)); class248_sub26 != null; class248_sub26 = ((Node_Sub26) ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass293_9701.method3107(-128))) {
            if ((i ^ 0xffffffff) > -1 || i == ((Node_Sub26) class248_sub26).anInt7139) {
                if (((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135 != null) {
                    ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2480(Class54.anInt728 / 100);
                    if (((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2464())
                        ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass248_Sub15_Sub3_9707.method2485(((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135);
                    class248_sub26.method2551(32021);
                }
                if ((((Node_Sub26) class248_sub26).anInt7130 ^ 0xffffffff) > -1)
                    aClass248_Sub26ArrayArray9618[((Node_Sub26) class248_sub26).anInt7139][((Node_Sub26) class248_sub26).anInt7133] = null;
                class248_sub26.remove(true);
            }
        }
        anInt9608++;
        if (i_3_ <= 19)
            aClass248_Sub26ArrayArray9618 = null;
    }

    final boolean method2408(Node_Sub26 class248_sub26, int[] is, int i, int i_4_, int i_5_) {
        anInt9660++;
        ((Node_Sub26) class248_sub26).anInt7138 = Class54.anInt728 / 100;
        if ((((Node_Sub26) class248_sub26).anInt7130 ^ 0xffffffff) <= -1 && ((((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135 == null) || ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2467())) {
            class248_sub26.method2551(32021);
            class248_sub26.remove(true);
            if ((((Node_Sub26) class248_sub26).anInt7145 ^ 0xffffffff) < -1 && (class248_sub26 == (aClass248_Sub26ArrayArray9623[((Node_Sub26) class248_sub26).anInt7139][((Node_Sub26) class248_sub26).anInt7145])))
                aClass248_Sub26ArrayArray9623[((Node_Sub26) class248_sub26).anInt7139][((Node_Sub26) class248_sub26).anInt7145] = null;
            return true;
        }
        int i_6_ = ((Node_Sub26) class248_sub26).anInt7144;
        if (i_4_ != 2)
            method2413(true, 28);
        if (i_6_ > 0) {
            i_6_ -= (int) (16.0 * Math.pow(2.0, ((double) (anIntArray9659[(((Node_Sub26) class248_sub26).anInt7139)]) * 4.921259842519685E-4)) + 0.5);
            if (i_6_ < 0)
                i_6_ = 0;
            ((Node_Sub26) class248_sub26).anInt7144 = i_6_;
        }
        ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2454(method2440(class248_sub26, -1580988089));
        Class341 class341 = ((Node_Sub26) class248_sub26).aClass341_7141;
        boolean bool = false;
        ((Node_Sub26) class248_sub26).anInt7146++;
        ((Node_Sub26) class248_sub26).anInt7143 += ((Class341) class341).anInt3974;
        double d = ((double) ((((Node_Sub26) class248_sub26).anInt7133 + -60 << -4876792) - -((((Node_Sub26) class248_sub26).anInt7144 * ((Node_Sub26) class248_sub26).anInt7140) >> -449296596)) * 5.086263020833333E-6);
        if (((Class341) class341).anInt3976 > 0) {
            if (((Class341) class341).anInt3972 <= 0)
                ((Node_Sub26) class248_sub26).anInt7134 += 128;
            else
                ((Node_Sub26) class248_sub26).anInt7134 += (int) (0.5 + (128.0 * Math.pow(2.0, (double) (((Class341) class341).anInt3972) * d)));
            if (((((Node_Sub26) class248_sub26).anInt7134 * ((Class341) class341).anInt3976) ^ 0xffffffff) <= -819201)
                bool = true;
        }
        if (((Class341) class341).aByteArray3977 != null) {
            if ((((Class341) class341).anInt3982 ^ 0xffffffff) >= -1)
                ((Node_Sub26) class248_sub26).anInt7142 += 128;
            else
                ((Node_Sub26) class248_sub26).anInt7142 += (int) (128.0 * Math.pow(2.0, d * (double) (((Class341) class341).anInt3982)) + 0.5);
            for (/**/; (((-2 + ((Class341) class341).aByteArray3977.length ^ 0xffffffff) < (((Node_Sub26) class248_sub26).anInt7136 ^ 0xffffffff)) && (((Node_Sub26) class248_sub26).anInt7142 > ((((Class341) class341).aByteArray3977[((Node_Sub26) class248_sub26).anInt7136 - -2]) & 0xff) << 2027564104)); ((Node_Sub26) class248_sub26).anInt7136 += 2) {
                /* empty */
            }
            if ((((Node_Sub26) class248_sub26).anInt7136 == -2 + ((Class341) class341).aByteArray3977.length) && ((((Class341) class341).aByteArray3977[((Node_Sub26) class248_sub26).anInt7136 + 1]) ^ 0xffffffff) == -1)
                bool = true;
        }
        if ((((Node_Sub26) class248_sub26).anInt7130 ^ 0xffffffff) <= -1 && ((Class341) class341).aByteArray3969 != null && (0x1 & (((Node_Sub15_Sub1) this).anIntArray9637[((Node_Sub26) class248_sub26).anInt7139])) == 0 && ((((Node_Sub26) class248_sub26).anInt7145 ^ 0xffffffff) > -1 || ((aClass248_Sub26ArrayArray9623[((Node_Sub26) class248_sub26).anInt7139][((Node_Sub26) class248_sub26).anInt7145]) != class248_sub26))) {
            if (((Class341) class341).anInt3981 <= 0)
                ((Node_Sub26) class248_sub26).anInt7130 += 128;
            else
                ((Node_Sub26) class248_sub26).anInt7130 += (int) (0.5 + (128.0 * Math.pow(2.0, d * (double) (((Class341) class341).anInt3981))));
            for (/**/; (((((Node_Sub26) class248_sub26).anInt7137 ^ 0xffffffff) > (((Class341) class341).aByteArray3969.length - 2 ^ 0xffffffff)) && (((Node_Sub26) class248_sub26).anInt7130 > (0xff00 & ((((Class341) class341).aByteArray3969[((Node_Sub26) class248_sub26).anInt7137 + 2]) << -1142036472)))); ((Node_Sub26) class248_sub26).anInt7137 += 2) {
                /* empty */
            }
            if ((((Node_Sub26) class248_sub26).anInt7137 ^ 0xffffffff) == (-2 + ((Class341) class341).aByteArray3969.length ^ 0xffffffff))
                bool = true;
        }
        if (bool) {
            ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2480(((Node_Sub26) class248_sub26).anInt7138);
            if (is != null)
                ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2400(is, i, i_5_);
            else
                ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2404(i_5_);
            if (((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2464())
                ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass248_Sub15_Sub3_9707.method2485(((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135);
            class248_sub26.method2551(32021);
            if ((((Node_Sub26) class248_sub26).anInt7130 ^ 0xffffffff) <= -1) {
                class248_sub26.remove(true);
                if (((Node_Sub26) class248_sub26).anInt7145 > 0 && ((aClass248_Sub26ArrayArray9623[((Node_Sub26) class248_sub26).anInt7139][((Node_Sub26) class248_sub26).anInt7145]) == class248_sub26))
                    aClass248_Sub26ArrayArray9623[((Node_Sub26) class248_sub26).anInt7139][((Node_Sub26) class248_sub26).anInt7145] = null;
            }
            return true;
        }
        ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2461(((Node_Sub26) class248_sub26).anInt7138, method2419(-332, class248_sub26), method2428(3161, class248_sub26));
        return false;
    }

    private final void method2409(int i, int i_7_) {
        anInt9626++;
        int i_8_ = 0xf0 & i;
        if (i_7_ != -16643)
            method2426(true, false, null, -83L, (byte) -40);
        if ((i_8_ ^ 0xffffffff) == -129) {
            int i_9_ = i & 0xf;
            int i_10_ = (0x7f44 & i) >> 1618751368;
            int i_11_ = (i & 0x7fdd91) >> -1385079504;
            method2435(i_11_, (byte) -56, i_9_, i_10_);
        } else if (i_8_ == 144) {
            int i_12_ = 0xf & i;
            int i_13_ = i >> 716670792 & 0x7f;
            int i_14_ = (i & 0x7f6843) >> 1224088944;
            if (i_14_ <= 0)
                method2435(64, (byte) -108, i_12_, i_13_);
            else
                method2429(i_12_, i_13_, -1, i_14_);
        } else if (i_8_ == 160) {
            int i_15_ = i & 0xf;
            int i_16_ = 0x7f & i >> -1083557912;
            int i_17_ = 0x7f & i >> -961046288;
            method2412(i_16_, i_15_, (byte) 113, i_17_);
        } else if (i_8_ == 176) {
            int i_18_ = 0xf & i;
            int i_19_ = (i & 0x7fff) >> -1157044184;
            int i_20_ = 0x7f & i >> 1022617488;
            if ((i_19_ ^ 0xffffffff) == -1)
                anIntArray9628[i_18_] = ((i_20_ << -906873426) + Class112.method794(anIntArray9628[i_18_], -2080769));
            if ((i_19_ ^ 0xffffffff) == -33)
                anIntArray9628[i_18_] = ((i_20_ << -905883193) + Class112.method794(-16257, anIntArray9628[i_18_]));
            if (i_19_ == 1)
                anIntArray9612[i_18_] = (Class112.method794(anIntArray9612[i_18_], -16257) - -(i_20_ << -1693724377));
            if (i_19_ == 33)
                anIntArray9612[i_18_] = i_20_ + Class112.method794(-128, anIntArray9612[i_18_]);
            if ((i_19_ ^ 0xffffffff) == -6)
                anIntArray9659[i_18_] = ((i_20_ << 302678023) + Class112.method794(-16257, anIntArray9659[i_18_]));
            if (i_19_ == 37)
                anIntArray9659[i_18_] = Class112.method794(-128, anIntArray9659[i_18_]) - -i_20_;
            if (i_19_ == 7)
                anIntArray9664[i_18_] = ((i_20_ << 1372906823) + Class112.method794(anIntArray9664[i_18_], -16257));
            if ((i_19_ ^ 0xffffffff) == -40)
                anIntArray9664[i_18_] = Class112.method794(-128, anIntArray9664[i_18_]) + i_20_;
            if ((i_19_ ^ 0xffffffff) == -11)
                anIntArray9603[i_18_] = ((i_20_ << -1815432953) + Class112.method794(-16257, anIntArray9603[i_18_]));
            if ((i_19_ ^ 0xffffffff) == -43)
                anIntArray9603[i_18_] = Class112.method794(anIntArray9603[i_18_], -128) - -i_20_;
            if ((i_19_ ^ 0xffffffff) == -12)
                anIntArray9648[i_18_] = ((i_20_ << -1621889913) + Class112.method794(anIntArray9648[i_18_], -16257));
            if (i_19_ == 43)
                anIntArray9648[i_18_] = i_20_ + Class112.method794(-128, anIntArray9648[i_18_]);
            if ((i_19_ ^ 0xffffffff) == -65) {
                if (i_20_ >= 64)
                    ((Node_Sub15_Sub1) this).anIntArray9637[i_18_] = Class358.retrieveLooksSettings((((Node_Sub15_Sub1) this).anIntArray9637[i_18_]), 1);
                else
                    ((Node_Sub15_Sub1) this).anIntArray9637[i_18_] = Class112.method794((((Node_Sub15_Sub1) this).anIntArray9637[i_18_]), -2);
            }
            if ((i_19_ ^ 0xffffffff) == -66) {
                if ((i_20_ ^ 0xffffffff) <= -65)
                    ((Node_Sub15_Sub1) this).anIntArray9637[i_18_] = Class358.retrieveLooksSettings((((Node_Sub15_Sub1) this).anIntArray9637[i_18_]), 2);
                else {
                    method2421(-49, i_18_);
                    ((Node_Sub15_Sub1) this).anIntArray9637[i_18_] = Class112.method794((((Node_Sub15_Sub1) this).anIntArray9637[i_18_]), -3);
                }
            }
            if ((i_19_ ^ 0xffffffff) == -100)
                anIntArray9639[i_18_] = (Class112.method794(anIntArray9639[i_18_], 127) - -(i_20_ << 1943200807));
            if ((i_19_ ^ 0xffffffff) == -99)
                anIntArray9639[i_18_] = i_20_ + Class112.method794(16256, anIntArray9639[i_18_]);
            if ((i_19_ ^ 0xffffffff) == -102)
                anIntArray9639[i_18_] = ((i_20_ << 1075228583) + Class112.method794(127, anIntArray9639[i_18_]) + 16384);
            if (i_19_ == 100)
                anIntArray9639[i_18_] = i_20_ + (Class112.method794(16256, anIntArray9639[i_18_]) + 16384);
            if ((i_19_ ^ 0xffffffff) == -121)
                method2407(i_18_, (byte) 107);
            if (i_19_ == 121)
                method2425(i_7_ + 16539, i_18_);
            if ((i_19_ ^ 0xffffffff) == -124)
                method2423(i_18_, false);
            if ((i_19_ ^ 0xffffffff) == -7) {
                int i_21_ = anIntArray9639[i_18_];
                if ((i_21_ ^ 0xffffffff) == -16385)
                    anIntArray9663[i_18_] = ((i_20_ << -1718438809) + Class112.method794(-16257, anIntArray9663[i_18_]));
            }
            if ((i_19_ ^ 0xffffffff) == -39) {
                int i_22_ = anIntArray9639[i_18_];
                if (i_22_ == 16384)
                    anIntArray9663[i_18_] = i_20_ + Class112.method794(-128, anIntArray9663[i_18_]);
            }
            if ((i_19_ ^ 0xffffffff) == -17)
                ((Node_Sub15_Sub1) this).anIntArray9627[i_18_] = Class112.method794((((Node_Sub15_Sub1) this).anIntArray9627[i_18_]), -16257) + (i_20_ << -347232985);
            if ((i_19_ ^ 0xffffffff) == -49)
                ((Node_Sub15_Sub1) this).anIntArray9627[i_18_] = (Class112.method794(-128, (((Node_Sub15_Sub1) this).anIntArray9627[i_18_])) - -i_20_);
            if ((i_19_ ^ 0xffffffff) == -82) {
                if ((i_20_ ^ 0xffffffff) > -65) {
                    method2441(i_18_, -25385);
                    ((Node_Sub15_Sub1) this).anIntArray9637[i_18_] = Class112.method794((((Node_Sub15_Sub1) this).anIntArray9637[i_18_]), -5);
                } else
                    ((Node_Sub15_Sub1) this).anIntArray9637[i_18_] = Class358.retrieveLooksSettings((((Node_Sub15_Sub1) this).anIntArray9637[i_18_]), 4);
            }
            if ((i_19_ ^ 0xffffffff) == -18)
                method2424(16292, ((~0x3f80 & anIntArray9622[i_18_]) - -(i_20_ << -1241979769)), i_18_);
            if ((i_19_ ^ 0xffffffff) == -50)
                method2424(16292, i_20_ + (~0x7f & anIntArray9622[i_18_]), i_18_);
        } else if (i_8_ == 192) {
            int i_23_ = i & 0xf;
            int i_24_ = (0x7f0b & i) >> 408208104;
            method2432(i_24_ + anIntArray9628[i_23_], i_23_, 7);
        } else if (i_8_ == 208) {
            int i_25_ = 0xf & i;
            int i_26_ = i >> -513417528 & 0x7f;
            method2427(i_25_, i_26_, i_7_ ^ ~0x4179);
        } else if ((i_8_ ^ 0xffffffff) == -225) {
            int i_27_ = i & 0xf;
            int i_28_ = (i >> -1750987831 & 0x3f80) - -((0x7f02 & i) >> -221928408);
            method2439(17102, i_27_, i_28_);
        } else {
            i_8_ = 0xff & i;
            if (i_8_ == 255)
                method2436(true, -1580988089);
        }
    }

    final synchronized void method2410(int i) {
        for (Node_Sub50 class248_sub50 = (Node_Sub50) aClass65_9657.method510(true); class248_sub50 != null; class248_sub50 = (Node_Sub50) aClass65_9657.method512(false))
            class248_sub50.remove(true);
        if (i != 12865)
            method2408(null, null, -19, -81, 46);
        anInt9631++;
    }

    private final synchronized void method2411(boolean bool, boolean bool_29_, byte i, Node_Sub44 class248_sub44) {
        method2431((byte) 66, bool);
        anInt9614++;
        aClass134_9617.method1222(((Node_Sub44) class248_sub44).aByteArray7311);
        aBoolean9666 = bool_29_;
        aLong9668 = 0L;
        int i_30_ = aClass134_9617.method1229();
        for (int i_31_ = 0; i_30_ > i_31_; i_31_++) {
            aClass134_9617.method1236(i_31_);
            aClass134_9617.method1231(i_31_);
            aClass134_9617.method1226(i_31_);
        }
        if (i > 7) {
            anInt9669 = aClass134_9617.method1225();
            anInt9665 = ((Class134) aClass134_9617).anIntArray1625[anInt9669];
            aLong9671 = aClass134_9617.method1227(anInt9665);
        }
    }

    private final void method2412(int i, int i_32_, byte i_33_, int i_34_) {
        if (i_33_ <= 99)
            method2421(-97, 56);
        anInt9604++;
    }

    final synchronized Node_Sub15 method2401() {
        anInt9613++;
        return aClass248_Sub15_Sub4_9667;
    }

    final synchronized void method2413(boolean bool, int i) {
        if (bool != true)
            aLong9668 = -114L;
        anInt9621 = i;
        anInt9634++;
    }

    private final void method2414(int i, long l) {
        anInt9632++;
        if (i != -207861557)
            anInt9669 = -28;
        while ((l ^ 0xffffffffffffffffL) <= (aLong9671 ^ 0xffffffffffffffffL)) {
            int i_35_ = anInt9669;
            int i_36_ = anInt9665;
            long l_37_ = aLong9671;
            while ((anInt9665 ^ 0xffffffff) == (i_36_ ^ 0xffffffff)) {
                while ((((Class134) aClass134_9617).anIntArray1625[i_35_] ^ 0xffffffff) == (i_36_ ^ 0xffffffff)) {
                    aClass134_9617.method1236(i_35_);
                    int i_38_ = aClass134_9617.method1224(i_35_);
                    if ((i_38_ ^ 0xffffffff) == -2) {
                        aClass134_9617.method1234();
                        aClass134_9617.method1226(i_35_);
                        if (aClass134_9617.method1233()) {
                            if (aBoolean9666 && (i_36_ ^ 0xffffffff) != -1)
                                aClass134_9617.method1232(l_37_);
                            else {
                                method2436(true, -1580988089);
                                aClass134_9617.method1237();
                                return;
                            }
                        }
                        break;
                    }
                    if ((0x80 & i_38_ ^ 0xffffffff) != -1 && (0xf0 & i_38_ ^ 0xffffffff) != -145)
                        method2409(i_38_, -16643);
                    aClass134_9617.method1231(i_35_);
                    aClass134_9617.method1226(i_35_);
                }
                aLong9668 = l_37_;
                i_35_ = aClass134_9617.method1225();
                i_36_ = ((Class134) aClass134_9617).anIntArray1625[i_35_];
                l_37_ = aClass134_9617.method1227(i_36_);
            }
            anInt9669 = i_35_;
            aLong9671 = l_37_;
            anInt9665 = i_36_;
        }
    }

    final synchronized boolean method2415(int i) {
        anInt9655++;
        if (i != 100)
            anIntArray9647 = null;
        return aClass134_9617.method1228();
    }

    final synchronized void method2416(int i, Node_Sub44 class248_sub44, boolean bool) {
        method2411(true, bool, (byte) 95, class248_sub44);
        anInt9651++;
        if (i != -16257)
            method2417(23);
    }

    private final void method2417(int i) {
        if (i == -6442) {
            anInt9620++;
            int i_39_ = anInt9669;
            int i_40_ = anInt9665;
            long l = aLong9671;
            if (aClass248_Sub44_9672 != null && (anInt9673 ^ 0xffffffff) == (i_40_ ^ 0xffffffff)) {
                method2411(aBoolean9674, aBoolean9666, (byte) 106, aClass248_Sub44_9672);
                method2417(-6442);
            } else {
                while (anInt9665 == i_40_) {
                    while ((((Class134) aClass134_9617).anIntArray1625[i_39_] ^ 0xffffffff) == (i_40_ ^ 0xffffffff)) {
                        aClass134_9617.method1236(i_39_);
                        int i_41_ = aClass134_9617.method1224(i_39_);
                        if (i_41_ == 1) {
                            aClass134_9617.method1234();
                            aClass134_9617.method1226(i_39_);
                            if (aClass134_9617.method1233()) {
                                if (aClass248_Sub44_9672 != null) {
                                    method2416(-16257, aClass248_Sub44_9672, aBoolean9666);
                                    method2417(-6442);
                                    return;
                                }
                                if (aBoolean9666 && (i_40_ ^ 0xffffffff) != -1)
                                    aClass134_9617.method1232(l);
                                else {
                                    method2436(true, -1580988089);
                                    aClass134_9617.method1237();
                                    return;
                                }
                            }
                            break;
                        }
                        if ((i_41_ & 0x80) != 0)
                            method2409(i_41_, -16643);
                        aClass134_9617.method1231(i_39_);
                        aClass134_9617.method1226(i_39_);
                    }
                    i_39_ = aClass134_9617.method1225();
                    i_40_ = ((Class134) aClass134_9617).anIntArray1625[i_39_];
                    l = aClass134_9617.method1227(i_40_);
                }
                anInt9665 = i_40_;
                anInt9669 = i_39_;
                aLong9671 = l;
                if (aClass248_Sub44_9672 != null && (anInt9673 ^ 0xffffffff) > (i_40_ ^ 0xffffffff)) {
                    anInt9665 = anInt9673;
                    anInt9669 = -1;
                    aLong9671 = aClass134_9617.method1227(anInt9665);
                }
            }
        }
    }

    final int method2418(boolean bool) {
        anInt9609++;
        if (bool != true)
            method2421(105, -94);
        return anInt9621;
    }

    private final int method2419(int i, Node_Sub26 class248_sub26) {
        anInt9611++;
        if ((anIntArray9647[((Node_Sub26) class248_sub26).anInt7139] ^ 0xffffffff) == -1)
            return 0;
        Class341 class341 = ((Node_Sub26) class248_sub26).aClass341_7141;
        int i_42_ = (4096 + ((anIntArray9664[((Node_Sub26) class248_sub26).anInt7139]) * (anIntArray9648[((Node_Sub26) class248_sub26).anInt7139])) >> -572300307);
        if (i != -332)
            return 117;
        i_42_ = i_42_ * i_42_ - -16384 >> 699049423;
        i_42_ = (16384 + i_42_ * ((Node_Sub26) class248_sub26).anInt7132 >> -1174186097);
        i_42_ = anInt9621 * i_42_ + 128 >> -195434200;
        i_42_ = i_42_ * anIntArray9647[(((Node_Sub26) class248_sub26).anInt7139)] + 128 >> 1403336;
        if (((Class341) class341).anInt3976 > 0)
            i_42_ = (int) (0.5 + (Math.pow(0.5, (1.953125E-5 * (double) ((Node_Sub26) class248_sub26).anInt7134 * (double) (((Class341) class341).anInt3976))) * (double) i_42_));
        if (((Class341) class341).aByteArray3977 != null) {
            int i_43_ = ((Node_Sub26) class248_sub26).anInt7142;
            int i_44_ = (((Class341) class341).aByteArray3977[((Node_Sub26) class248_sub26).anInt7136 - -1]);
            if (((Node_Sub26) class248_sub26).anInt7136 < ((Class341) class341).aByteArray3977.length + -2) {
                int i_45_ = (((((Class341) class341).aByteArray3977[((Node_Sub26) class248_sub26).anInt7136]) << 757888232) & 0xff00);
                int i_46_ = ((0xff & (((Class341) class341).aByteArray3977[2 + ((Node_Sub26) class248_sub26).anInt7136])) << -1684858584);
                i_44_ += (-i_44_ + (((Class341) class341).aByteArray3977[(((Node_Sub26) class248_sub26).anInt7136 - -3)])) * (-i_45_ + i_43_) / (i_46_ - i_45_);
            }
            i_42_ = i_42_ * i_44_ + 32 >> -1553561946;
        }
        if ((((Node_Sub26) class248_sub26).anInt7130 ^ 0xffffffff) < -1 && ((Class341) class341).aByteArray3969 != null) {
            int i_47_ = ((Node_Sub26) class248_sub26).anInt7130;
            int i_48_ = (((Class341) class341).aByteArray3969[((Node_Sub26) class248_sub26).anInt7137 - -1]);
            if (((Class341) class341).aByteArray3969.length + -2 > ((Node_Sub26) class248_sub26).anInt7137) {
                int i_49_ = (((((Class341) class341).aByteArray3969[((Node_Sub26) class248_sub26).anInt7137]) & 0xff) << -768168056);
                int i_50_ = (0xff00 & ((((Class341) class341).aByteArray3969[((Node_Sub26) class248_sub26).anInt7137 + 2]) << -1164321432));
                i_48_ += ((-i_49_ + i_47_) * ((((Class341) class341).aByteArray3969[((Node_Sub26) class248_sub26).anInt7137 + 3]) - i_48_) / (-i_49_ + i_50_));
            }
            i_42_ = i_48_ * i_42_ + 32 >> -430389754;
        }
        return i_42_;
    }

    final synchronized void method2420(int i) {
        method2431((byte) 83, true);
        if (i != 2064)
            aClass248_Sub15_Sub4_9667 = null;
        anInt9670++;
    }

    private final void method2421(int i, int i_51_) {
        anInt9619++;
        if (i >= -25)
            method2408(null, null, -104, -44, 105);
        if ((((Node_Sub15_Sub1) this).anIntArray9637[i_51_] & 0x2) != 0) {
            for (Node_Sub26 class248_sub26 = ((Node_Sub26) ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass293_9701.method3119(2)); class248_sub26 != null; class248_sub26 = ((Node_Sub26) ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass293_9701.method3107(-127))) {
                if (i_51_ == ((Node_Sub26) class248_sub26).anInt7139 && (aClass248_Sub26ArrayArray9618[i_51_][((Node_Sub26) class248_sub26).anInt7133]) == null && (((Node_Sub26) class248_sub26).anInt7130 ^ 0xffffffff) > -1)
                    ((Node_Sub26) class248_sub26).anInt7130 = 0;
            }
        }
    }

    final synchronized void method2422(byte i, int i_52_, int i_53_) {
        anInt9630++;
        if (i != -119)
            anIntArray9603 = null;
        if (i_52_ >= 0)
            anIntArray9647[i_52_] = i_53_;
        else {
            for (int i_54_ = 0; (i_54_ ^ 0xffffffff) > -17; i_54_++)
                anIntArray9647[i_54_] = i_53_;
        }
    }

    private final void method2423(int i, boolean bool) {
        if (bool != false)
            anInt9636 = 81;
        for (Node_Sub26 class248_sub26 = ((Node_Sub26) ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass293_9701.method3119(2)); class248_sub26 != null; class248_sub26 = ((Node_Sub26) ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass293_9701.method3107(-127))) {
            if ((i < 0 || i == ((Node_Sub26) class248_sub26).anInt7139) && ((Node_Sub26) class248_sub26).anInt7130 < 0) {
                aClass248_Sub26ArrayArray9618[((Node_Sub26) class248_sub26).anInt7139][((Node_Sub26) class248_sub26).anInt7133] = null;
                ((Node_Sub26) class248_sub26).anInt7130 = 0;
            }
        }
        anInt9654++;
    }

    private final void method2424(int i, int i_55_, int i_56_) {
        if (i != 16292)
            method2414(60, -59L);
        anIntArray9622[i_56_] = i_55_;
        anInt9610++;
        ((Node_Sub15_Sub1) this).anIntArray9650[i_56_] = (int) (2097152.0 * Math.pow(2.0, (double) i_55_ * 5.4931640625E-4) + 0.5);
    }

    private final void method2425(int i, int i_57_) {
        anInt9656++;
        if ((i_57_ ^ 0xffffffff) > -1) {
            for (i_57_ = 0; (i_57_ ^ 0xffffffff) > -17; i_57_++)
                method2425(-93, i_57_);
        } else {
            anIntArray9664[i_57_] = 12800;
            anIntArray9603[i_57_] = 8192;
            anIntArray9648[i_57_] = 16383;
            if (i > -87)
                method2440(null, -70);
            anIntArray9625[i_57_] = 8192;
            anIntArray9612[i_57_] = 0;
            anIntArray9659[i_57_] = 8192;
            method2421(-79, i_57_);
            method2441(i_57_, -25385);
            ((Node_Sub15_Sub1) this).anIntArray9637[i_57_] = 0;
            anIntArray9639[i_57_] = 32767;
            anIntArray9663[i_57_] = 256;
            ((Node_Sub15_Sub1) this).anIntArray9627[i_57_] = 0;
            method2424(16292, 8192, i_57_);
        }
    }

    final synchronized void method2426(boolean bool, boolean bool_58_, Node_Sub44 class248_sub44, long l, byte i) {
        method2411(bool_58_, bool, (byte) 14, class248_sub44);
        if (i != 28)
            method2425(101, 77);
        anInt9638++;
        method2414(i ^ ~0xc63b728, l * (long) ((Class134) aClass134_9617).anInt1630);
    }

    private final void method2427(int i, int i_59_, int i_60_) {
        anInt9606++;
        int i_61_ = -14 % ((55 - i_60_) / 63);
    }

    final synchronized int method2405() {
        anInt9662++;
        return 0;
    }

    private final int method2428(int i, Node_Sub26 class248_sub26) {
        anInt9661++;
        int i_62_ = anIntArray9603[((Node_Sub26) class248_sub26).anInt7139];
        if (i != 3161)
            method2430((byte) 81);
        if (i_62_ >= 8192)
            return (16384 - (32 + ((-i_62_ + 16384) * (-((Node_Sub26) class248_sub26).anInt7131 + 128)) >> -1250635642));
        return (32 + i_62_ * ((Node_Sub26) class248_sub26).anInt7131 >> 1197894022);
    }

    private final void method2429(int i, int i_63_, int i_64_, int i_65_) {
        method2435(64, (byte) -78, i, i_63_);
        anInt9640++;
        if ((((Node_Sub15_Sub1) this).anIntArray9637[i] & 0x2 ^ 0xffffffff) != -1) {
            for (Node_Sub26 class248_sub26 = ((Node_Sub26) ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass293_9701.method3110(0)); class248_sub26 != null; class248_sub26 = ((Node_Sub26) ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass293_9701.method3120(i_64_ + 17834))) {
                if (((i ^ 0xffffffff) == (((Node_Sub26) class248_sub26).anInt7139 ^ 0xffffffff)) && (((Node_Sub26) class248_sub26).anInt7130 ^ 0xffffffff) > -1) {
                    aClass248_Sub26ArrayArray9618[i][((Node_Sub26) class248_sub26).anInt7133] = null;
                    aClass248_Sub26ArrayArray9618[i][i_63_] = class248_sub26;
                    int i_66_ = (((((Node_Sub26) class248_sub26).anInt7140 * ((Node_Sub26) class248_sub26).anInt7144) >> 190498956) + ((Node_Sub26) class248_sub26).anInt7128);
                    ((Node_Sub26) class248_sub26).anInt7128 += (i_63_ - ((Node_Sub26) class248_sub26).anInt7133 << -824245304);
                    ((Node_Sub26) class248_sub26).anInt7133 = i_63_;
                    ((Node_Sub26) class248_sub26).anInt7144 = 4096;
                    ((Node_Sub26) class248_sub26).anInt7140 = i_66_ - ((Node_Sub26) class248_sub26).anInt7128;
                    return;
                }
            }
        }
        Node_Sub50 class248_sub50 = ((Node_Sub50) aClass65_9657.method501((long) anIntArray9607[i], (byte) 31));
        if (class248_sub50 != null) {
            Node_Sub31_Sub1 class248_sub31_sub1 = (((Node_Sub50) class248_sub50).aClass248_Sub31_Sub1Array7449[i_63_]);
            if (class248_sub31_sub1 != null) {
                Node_Sub26 class248_sub26 = new Node_Sub26();
                ((Node_Sub26) class248_sub26).aClass248_Sub31_Sub1_7129 = class248_sub31_sub1;
                ((Node_Sub26) class248_sub26).anInt7139 = i;
                ((Node_Sub26) class248_sub26).aClass248_Sub50_7148 = class248_sub50;
                ((Node_Sub26) class248_sub26).aClass341_7141 = (((Node_Sub50) class248_sub50).aClass341Array7445[i_63_]);
                ((Node_Sub26) class248_sub26).anInt7145 = ((Node_Sub50) class248_sub50).aByteArray7450[i_63_];
                ((Node_Sub26) class248_sub26).anInt7133 = i_63_;
                ((Node_Sub26) class248_sub26).anInt7132 = ((((Node_Sub50) class248_sub50).anInt7448 * (i_65_ * (i_65_ * (((Node_Sub50) class248_sub50).aByteArray7452[i_63_])))) - -1024 >> -207861557);
                ((Node_Sub26) class248_sub26).anInt7131 = (((Node_Sub50) class248_sub50).aByteArray7451[i_63_] & 0xff);
                ((Node_Sub26) class248_sub26).anInt7128 = (-(0x7fff & (((Node_Sub50) class248_sub50).aShortArray7446[i_63_])) + (i_63_ << 506106632));
                ((Node_Sub26) class248_sub26).anInt7134 = 0;
                ((Node_Sub26) class248_sub26).anInt7137 = 0;
                ((Node_Sub26) class248_sub26).anInt7130 = i_64_;
                ((Node_Sub26) class248_sub26).anInt7136 = 0;
                ((Node_Sub26) class248_sub26).anInt7142 = 0;
                if (((Node_Sub15_Sub1) this).anIntArray9627[i] == 0)
                    ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135 = (Node_Sub15_Sub2.method2452(class248_sub31_sub1, method2440(class248_sub26, -1580988089), method2419(-332, class248_sub26), method2428(3161, class248_sub26)));
                else {
                    ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135 = (Node_Sub15_Sub2.method2452(class248_sub31_sub1, method2440(class248_sub26, i_64_ ^ 0x5e3bf6b8), 0, method2428(i_64_ ^ ~0xc59, class248_sub26)));
                    method2434(class248_sub26, (byte) 106, ((((Node_Sub50) class248_sub50).aShortArray7446[i_63_]) ^ 0xffffffff) > -1);
                }
                if (((Node_Sub50) class248_sub50).aShortArray7446[i_63_] < 0)
                    ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2463(-1);
                if (((Node_Sub26) class248_sub26).anInt7145 >= 0) {
                    Node_Sub26 class248_sub26_67_ = (aClass248_Sub26ArrayArray9623[i][((Node_Sub26) class248_sub26).anInt7145]);
                    if (class248_sub26_67_ != null && (((Node_Sub26) class248_sub26_67_).anInt7130 ^ 0xffffffff) > -1) {
                        aClass248_Sub26ArrayArray9618[i][((Node_Sub26) class248_sub26_67_).anInt7133] = null;
                        ((Node_Sub26) class248_sub26_67_).anInt7130 = 0;
                    }
                    aClass248_Sub26ArrayArray9623[i][((Node_Sub26) class248_sub26).anInt7145] = class248_sub26;
                }
                ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass293_9701.method3109(class248_sub26, -118);
                aClass248_Sub26ArrayArray9618[i][i_63_] = class248_sub26;
            }
        }
    }

    final synchronized void method2430(byte i) {
        for (Node_Sub50 class248_sub50 = (Node_Sub50) aClass65_9657.method510(true); class248_sub50 != null; class248_sub50 = (Node_Sub50) aClass65_9657.method512(false))
            class248_sub50.method2679(1);
        if (i != -91)
            anIntArray9664 = null;
        anInt9616++;
    }

    final synchronized Node_Sub15 method2399() {
        anInt9645++;
        return null;
    }

    private final synchronized void method2431(byte i, boolean bool) {
        aClass134_9617.method1237();
        anInt9653++;
        aClass248_Sub44_9672 = null;
        if (i <= 18)
            aClass248_Sub26ArrayArray9623 = null;
        method2436(bool, -1580988089);
    }

    private final void method2432(int i, int i_68_, int i_69_) {
        if (i_69_ != 7)
            method2432(6, -98, -103);
        if ((i ^ 0xffffffff) != (anIntArray9607[i_68_] ^ 0xffffffff)) {
            anIntArray9607[i_68_] = i;
            for (int i_70_ = 0; (i_70_ ^ 0xffffffff) > -129; i_70_++)
                aClass248_Sub26ArrayArray9623[i_68_][i_70_] = null;
        }
        anInt9644++;
    }

    final synchronized boolean method2433(int i, Node_Sub44 class248_sub44, Class154 class154, int i_71_, Class381 class381) {
        class248_sub44.method2639();
        anInt9641++;
        boolean bool = true;
        if (i != -28410)
            anIntArray9649 = null;
        int[] is = null;
        if ((i_71_ ^ 0xffffffff) < -1)
            is = new int[]{i_71_};
        for (Node_Sub20 class248_sub20 = (Node_Sub20) ((Node_Sub44) class248_sub44).aClass65_7310.method510(true); class248_sub20 != null; class248_sub20 = (Node_Sub20) ((Node_Sub44) class248_sub44).aClass65_7310.method512(false)) {
            int i_72_ = (int) ((Node) class248_sub20).id;
            Node_Sub50 class248_sub50 = ((Node_Sub50) aClass65_9657.method501((long) i_72_, (byte) 31));
            if (class248_sub50 == null) {
                class248_sub50 = Class271.method2834(i_72_, class381, 82);
                if (class248_sub50 == null) {
                    bool = false;
                    continue;
                }
                aClass65_9657.method509(-1, class248_sub50, (long) i_72_);
            }
            if (!class248_sub50.method2681(is, (((Node_Sub20) class248_sub20).aByteArray7046), true, class154))
                bool = false;
        }
        if (bool)
            class248_sub44.method2641();
        return bool;
    }

    final void method2434(Node_Sub26 class248_sub26, byte i, boolean bool) {
        int i_73_ = -79 % ((i - 58) / 48);
        anInt9602++;
        int i_74_ = (((Node_Sub31_Sub1) (((Node_Sub26) class248_sub26).aClass248_Sub31_Sub1_7129)).aByteArray9734).length;
        int i_75_;
        if (bool && (((Node_Sub31_Sub1) (((Node_Sub26) class248_sub26).aClass248_Sub31_Sub1_7129)).aBoolean9735)) {
            int i_76_ = (i_74_ + i_74_ - (((Node_Sub31_Sub1) (((Node_Sub26) class248_sub26).aClass248_Sub31_Sub1_7129)).anInt9738));
            i_75_ = (int) ((long) (((Node_Sub15_Sub1) this).anIntArray9627[(((Node_Sub26) class248_sub26).anInt7139)]) * (long) i_76_ >> -918780922);
            i_74_ <<= 8;
            if (i_74_ <= i_75_) {
                ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2465(true);
                i_75_ = i_74_ + i_74_ + -1 - i_75_;
            }
        } else
            i_75_ = (int) ((long) i_74_ * (long) (((Node_Sub15_Sub1) this).anIntArray9627[((Node_Sub26) class248_sub26).anInt7139]) >> 120635078);
        ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2453(i_75_);
    }

    private final void method2435(int i, byte i_77_, int i_78_, int i_79_) {
        if (i_77_ <= -32) {
            anInt9642++;
            Node_Sub26 class248_sub26 = aClass248_Sub26ArrayArray9618[i_78_][i_79_];
            if (class248_sub26 != null) {
                aClass248_Sub26ArrayArray9618[i_78_][i_79_] = null;
                if ((((Node_Sub15_Sub1) this).anIntArray9637[i_78_] & 0x2) == 0)
                    ((Node_Sub26) class248_sub26).anInt7130 = 0;
                else {
                    for (Node_Sub26 class248_sub26_80_ = (Node_Sub26) ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass293_9701.method3119(2); class248_sub26_80_ != null; class248_sub26_80_ = (Node_Sub26) ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass293_9701.method3107(-128)) {
                        if ((((Node_Sub26) class248_sub26_80_).anInt7139 == ((Node_Sub26) class248_sub26).anInt7139) && (((Node_Sub26) class248_sub26_80_).anInt7130 ^ 0xffffffff) > -1 && class248_sub26 != class248_sub26_80_) {
                            ((Node_Sub26) class248_sub26).anInt7130 = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    private final void method2436(boolean bool, int i) {
        anInt9658++;
        if (bool)
            method2407(-1, (byte) 99);
        else
            method2423(-1, false);
        method2425(i + 1580987966, -1);
        if (i != -1580988089)
            method2439(-78, 0, 5);
        for (int i_81_ = 0; i_81_ < 16; i_81_++)
            anIntArray9607[i_81_] = anIntArray9649[i_81_];
        for (int i_82_ = 0; i_82_ < 16; i_82_++)
            anIntArray9628[i_82_] = Class112.method794(anIntArray9649[i_82_], -128);
    }

    final synchronized void method2404(int i) {
        anInt9605++;
        if (aClass134_9617.method1228()) {
            int i_83_ = (anInt9636 * ((Class134) aClass134_9617).anInt1630 / Class54.anInt728);
            do {
                long l = (long) i * (long) i_83_ + aLong9668;
                if ((aLong9671 + -l ^ 0xffffffffffffffffL) <= -1L) {
                    aLong9668 = l;
                    break;
                }
                int i_84_ = (int) (((long) i_83_ + (aLong9671 + (-aLong9668 - 1L))) / (long) i_83_);
                aLong9668 += (long) i_83_ * (long) i_84_;
                aClass248_Sub15_Sub4_9667.method2404(i_84_);
                i -= i_84_;
                method2417(-6442);
            } while (aClass134_9617.method1228());
        }
        aClass248_Sub15_Sub4_9667.method2404(i);
    }

    final boolean method2437(Node_Sub26 class248_sub26, int i) {
        anInt9615++;
        if (((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135 == null) {
            if (((Node_Sub26) class248_sub26).anInt7130 >= 0) {
                class248_sub26.remove(true);
                if (((Node_Sub26) class248_sub26).anInt7145 > 0 && (class248_sub26 == (aClass248_Sub26ArrayArray9623[((Node_Sub26) class248_sub26).anInt7139][((Node_Sub26) class248_sub26).anInt7145])))
                    aClass248_Sub26ArrayArray9623[((Node_Sub26) class248_sub26).anInt7139][((Node_Sub26) class248_sub26).anInt7145] = null;
            }
            return true;
        }
        int i_85_ = 80 % ((i - 37) / 50);
        return false;
    }

    final synchronized void method2438(int i, byte i_86_, int i_87_) {
        anInt9624++;
        method2442(i_87_, (byte) 60, i);
        if (i_86_ >= -69)
            anInt9636 = -13;
    }

    private final void method2439(int i, int i_88_, int i_89_) {
        anIntArray9625[i_88_] = i_89_;
        if (i != 17102)
            method2418(false);
        anInt9646++;
    }

    private final int method2440(Node_Sub26 class248_sub26, int i) {
        if (i != -1580988089)
            return -30;
        anInt9643++;
        int i_90_ = (((Node_Sub26) class248_sub26).anInt7128 - -((((Node_Sub26) class248_sub26).anInt7140 * ((Node_Sub26) class248_sub26).anInt7144) >> -347018740));
        i_90_ += (((-8192 + (anIntArray9625[((Node_Sub26) class248_sub26).anInt7139])) * anIntArray9663[((Node_Sub26) class248_sub26).anInt7139]) >> -826072852);
        Class341 class341 = ((Node_Sub26) class248_sub26).aClass341_7141;
        if (((Class341) class341).anInt3974 > 0 && ((((Class341) class341).anInt3979 ^ 0xffffffff) < -1 || (anIntArray9612[((Node_Sub26) class248_sub26).anInt7139] > 0))) {
            int i_91_ = ((Class341) class341).anInt3979 << -239464958;
            int i_92_ = ((Class341) class341).anInt3975 << -2023382783;
            if ((i_92_ ^ 0xffffffff) < (((Node_Sub26) class248_sub26).anInt7146 ^ 0xffffffff))
                i_91_ = (((Node_Sub26) class248_sub26).anInt7146 * i_91_ / i_92_);
            i_91_ += (anIntArray9612[((Node_Sub26) class248_sub26).anInt7139] >> -1580988089);
            double d = Math.sin(0.01227184630308513 * (double) (0x1ff & (((Node_Sub26) class248_sub26).anInt7143)));
            i_90_ += (int) (d * (double) i_91_);
        }
        int i_93_ = (int) (0.5 + ((double) (((Node_Sub31_Sub1) (((Node_Sub26) class248_sub26).aClass248_Sub31_Sub1_7129)).anInt9736 * 256) * Math.pow(2.0, (double) i_90_ * 3.255208333333333E-4) / (double) Class54.anInt728));
        if ((i_93_ ^ 0xffffffff) > -2)
            return 1;
        return i_93_;
    }

    private final void method2441(int i, int i_94_) {
        anInt9652++;
        if (i_94_ == -25385) {
            if ((0x4 & ((Node_Sub15_Sub1) this).anIntArray9637[i] ^ 0xffffffff) != -1) {
                for (Node_Sub26 class248_sub26 = ((Node_Sub26) ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass293_9701.method3119(2)); class248_sub26 != null; class248_sub26 = ((Node_Sub26) ((Node_Sub15_Sub4) aClass248_Sub15_Sub4_9667).aClass293_9701.method3107(i_94_ ^ 0x6357))) {
                    if (i == ((Node_Sub26) class248_sub26).anInt7139)
                        ((Node_Sub26) class248_sub26).anInt7147 = 0;
                }
            }
        }
    }

    private final void method2442(int i, byte i_95_, int i_96_) {
        anInt9633++;
        anIntArray9649[i_96_] = i;
        if (i_95_ <= 3)
            anInt9665 = -22;
        anIntArray9628[i_96_] = Class112.method794(i, -128);
        method2432(i, i_96_, 7);
    }

    public Node_Sub15_Sub1() {
        anIntArray9607 = new int[16];
        aClass248_Sub26ArrayArray9618 = new Node_Sub26[16][128];
        aClass248_Sub26ArrayArray9623 = new Node_Sub26[16][128];
        anIntArray9639 = new int[16];
        ((Node_Sub15_Sub1) this).anIntArray9637 = new int[16];
        anIntArray9612 = new int[16];
        anIntArray9603 = new int[16];
        anInt9621 = 256;
        anIntArray9647 = new int[16];
        anIntArray9648 = new int[16];
        anIntArray9628 = new int[16];
        anIntArray9622 = new int[16];
        anInt9636 = 1000000;
        anIntArray9649 = new int[16];
        ((Node_Sub15_Sub1) this).anIntArray9650 = new int[16];
        ((Node_Sub15_Sub1) this).anIntArray9627 = new int[16];
        anIntArray9659 = new int[16];
        anIntArray9625 = new int[16];
        anIntArray9663 = new int[16];
        anIntArray9664 = new int[16];
        aClass134_9617 = new Class134();
        aClass248_Sub15_Sub4_9667 = new Node_Sub15_Sub4(this);
        aClass65_9657 = new Class65(128);
        method2422((byte) -119, -1, 256);
        method2436(true, -1580988089);
    }

    Node_Sub15_Sub1(Node_Sub15_Sub1 class248_sub15_sub1_97_) {
        anIntArray9607 = new int[16];
        aClass248_Sub26ArrayArray9618 = new Node_Sub26[16][128];
        aClass248_Sub26ArrayArray9623 = new Node_Sub26[16][128];
        anIntArray9639 = new int[16];
        ((Node_Sub15_Sub1) this).anIntArray9637 = new int[16];
        anIntArray9612 = new int[16];
        anIntArray9603 = new int[16];
        anInt9621 = 256;
        anIntArray9647 = new int[16];
        anIntArray9648 = new int[16];
        anIntArray9628 = new int[16];
        anIntArray9622 = new int[16];
        anInt9636 = 1000000;
        anIntArray9649 = new int[16];
        ((Node_Sub15_Sub1) this).anIntArray9650 = new int[16];
        ((Node_Sub15_Sub1) this).anIntArray9627 = new int[16];
        anIntArray9659 = new int[16];
        anIntArray9625 = new int[16];
        anIntArray9663 = new int[16];
        anIntArray9664 = new int[16];
        aClass134_9617 = new Class134();
        aClass248_Sub15_Sub4_9667 = new Node_Sub15_Sub4(this);
        aClass65_9657 = class248_sub15_sub1_97_.aClass65_9657;
        method2422((byte) -119, -1, 256);
        method2436(true, -1580988089);
    }
}
