/* Class248_Sub14_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub19 extends Node_Sub14 {
    static int anInt9355;
    static int anInt9356;
    static int anInt9357;
    static int anInt9358;
    static int anInt9359;
    static int anInt9360;
    private int anInt9361 = 1;
    static int anInt9362;
    static int anInt9363;
    private int anInt9364 = 1;

    final void method2269(ByteStream class248_sub9, byte i, int i_0_) {
        if (i != -61)
            method2336((byte) -76, 22);
        anInt9355++;
        int i_1_ = i_0_;
        while_137_:
        do {
            do {
                if ((i_1_ ^ 0xffffffff) != -1) {
                    if (i_1_ != 1) {
                        if ((i_1_ ^ 0xffffffff) == -3)
                            break;
                        break while_137_;
                    }
                } else {
                    anInt9364 = class248_sub9.readUnsignedByte((byte) 78);
                    return;
                }
                anInt9361 = class248_sub9.readUnsignedByte((byte) -80);
                return;
            } while (false);
            ((Node_Sub14) this).aBoolean6988 = (class248_sub9.readUnsignedByte((byte) -104) ^ 0xffffffff) == -2;
        } while (false);
    }

    static final void method2332(boolean bool, long l) {
        anInt9363++;
        int i = Class61.anInt831;
        int i_2_ = Node_Sub32.anInt7198;
        if ((Class82.anInt1027 ^ 0xffffffff) != (i ^ 0xffffffff)) {
            int i_3_ = i - Class82.anInt1027;
            int i_4_ = (int) ((long) i_3_ * l / 320L);
            if ((i_3_ ^ 0xffffffff) >= -1) {
                if (i_4_ == 0)
                    i_4_ = -1;
                else if (i_4_ < i_3_)
                    i_4_ = i_3_;
            } else if (i_4_ != 0) {
                if ((i_4_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
                    i_4_ = i_3_;
            } else
                i_4_ = 1;
            Class82.anInt1027 += i_4_;
        }
        Node_Sub8_Sub13.aFloat9030 += Class325.aFloat3829 * (float) l / 40.0F * 8.0F;
        Class282_Sub7.aFloat7661 += 8.0F * ((float) l * Class192.aFloat2216 / 40.0F);
        if ((Class189.anInt5066 ^ 0xffffffff) != (i_2_ ^ 0xffffffff)) {
            int i_5_ = -Class189.anInt5066 + i_2_;
            int i_6_ = (int) ((long) i_5_ * l / 320L);
            if ((i_5_ ^ 0xffffffff) < -1) {
                if (i_6_ != 0) {
                    if (i_5_ < i_6_)
                        i_6_ = i_5_;
                } else
                    i_6_ = 1;
            } else if (i_6_ == 0)
                i_6_ = -1;
            else if (i_6_ < i_5_)
                i_6_ = i_5_;
            Class189.anInt5066 += i_6_;
        }
        if (bool == false)
            Class315.method3280(98);
    }

    static final Node_Sub35 method2333(byte i) {
        anInt9362++;
        if (Class116.aClass293_1443 == null || Class19.aClass251_299 == null)
            return null;
        Class19.aClass251_299.method2711(-2, Class116.aClass293_1443);
        if (i >= -66)
            return null;
        Node_Sub35 class248_sub35 = (Node_Sub35) Class19.aClass251_299.method2714(true);
        if (class248_sub35 == null)
            return null;
        Class56 class56 = Class116.aClass257_1436.method2750((byte) 59, ((Node_Sub35) class248_sub35).anInt7243);
        if (class56 == null || !((Class56) class56).aBoolean738 || !class56.method449((byte) -14, Class116.anInterface3_1438))
            return Class351.method3742((byte) -24);
        return class248_sub35;
    }

    public Node_Sub14_Sub19() {
        super(1, false);
    }

    static final int[] method2334(int i, float f, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, int i_11_) {
        anInt9360++;
        int[] is = new int[i_11_];
        int i_12_ = 39 % ((i - -43) / 59);
        Node_Sub14_Sub1 class248_sub14_sub1 = new Node_Sub14_Sub1();
        ((Node_Sub14_Sub1) class248_sub14_sub1).anInt9165 = (int) (4096.0F * f);
        ((Node_Sub14_Sub1) class248_sub14_sub1).anInt9171 = i_8_;
        ((Node_Sub14_Sub1) class248_sub14_sub1).anInt9170 = i_10_;
        ((Node_Sub14_Sub1) class248_sub14_sub1).anInt9162 = i_7_;
        ((Node_Sub14_Sub1) class248_sub14_sub1).anInt9163 = i_9_;
        ((Node_Sub14_Sub1) class248_sub14_sub1).aBoolean9159 = bool;
        class248_sub14_sub1.method2263(8351);
        Class68.method521(1, false, i_11_);
        class248_sub14_sub1.method2275((byte) 117, 0, is);
        return is;
    }

    final int[] method2264(byte i, int i_13_) {
        anInt9356++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_13_, true);
        if (i != -40)
            return null;
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int i_14_ = anInt9361 + (anInt9361 - -1);
            int i_15_ = 65536 / i_14_;
            int i_16_ = anInt9364 + anInt9364 + 1;
            int i_17_ = 65536 / i_16_;
            int[][] is_18_ = new int[i_14_][];
            for (int i_19_ = i_13_ + -anInt9361; (anInt9361 + i_13_ ^ 0xffffffff) <= (i_19_ ^ 0xffffffff); i_19_++) {
                int[] is_20_ = this.method2265((byte) 64, za_Sub1.anInt9802 & i_19_, 0);
                int[] is_21_ = new int[Class185.anInt2164];
                int i_22_ = 0;
                for (int i_23_ = -anInt9364; anInt9364 >= i_23_; i_23_++)
                    i_22_ += is_20_[i_23_ & Class226_Sub2.anInt6664];
                int i_24_ = 0;
                while ((Class185.anInt2164 ^ 0xffffffff) < (i_24_ ^ 0xffffffff)) {
                    is_21_[i_24_] = i_17_ * i_22_ >> -272938416;
                    i_22_ -= is_20_[i_24_ - anInt9364 & Class226_Sub2.anInt6664];
                    i_24_++;
                    i_22_ += (is_20_[i_24_ - -anInt9364 & Class226_Sub2.anInt6664]);
                }
                is_18_[i_19_ + anInt9361 + -i_13_] = is_21_;
            }
            for (int i_25_ = 0; i_25_ < Class185.anInt2164; i_25_++) {
                int i_26_ = 0;
                for (int i_27_ = 0; i_14_ > i_27_; i_27_++)
                    i_26_ += is_18_[i_27_][i_25_];
                is[i_25_] = i_15_ * i_26_ >> 1526200240;
            }
        }
        return is;
    }

    static final void method2335(boolean bool, NPC NPC) {
        anInt9358++;
        for (Node_Sub51 class248_sub51 = (Node_Sub51) Class333.aClass293_3901.method3119(2); class248_sub51 != null; class248_sub51 = (Node_Sub51) Class333.aClass293_3901.method3107(-128)) {
            if ((((Node_Sub51) class248_sub51).aNPC_7459) == NPC) {
                if (((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 != null) {
                    Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460);
                    ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 = null;
                }
                class248_sub51.remove(true);
                return;
            }
        }
        if (bool == false) {
            /* empty */
        }
    }

    static final boolean method2336(byte i, int i_28_) {
        anInt9359++;
        if (i <= 111)
            return false;
        if ((i_28_ ^ 0xffffffff) != -1 && i_28_ != 2)
            return false;
        return true;
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9357++;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int i_29_ = anInt9361 + anInt9361 + 1;
            int i_30_ = 65536 / i_29_;
            int i_31_ = 1 + (anInt9364 + anInt9364);
            int i_32_ = 65536 / i_31_;
            int[][][] is_33_ = new int[i_29_][][];
            for (int i_34_ = i - anInt9361; (i_34_ ^ 0xffffffff) >= (anInt9361 + i ^ 0xffffffff); i_34_++) {
                int[][] is_35_ = this.method2267(i_34_ & za_Sub1.anInt9802, 0, 65535);
                int[][] is_36_ = new int[3][Class185.anInt2164];
                int i_37_ = 0;
                int i_38_ = 0;
                int i_39_ = 0;
                int[] is_40_ = is_35_[0];
                int[] is_41_ = is_35_[1];
                int[] is_42_ = is_35_[2];
                for (int i_43_ = -anInt9364; anInt9364 >= i_43_; i_43_++) {
                    int i_44_ = Class226_Sub2.anInt6664 & i_43_;
                    i_38_ += is_41_[i_44_];
                    i_39_ += is_42_[i_44_];
                    i_37_ += is_40_[i_44_];
                }
                int[] is_45_ = is_36_[0];
                int[] is_46_ = is_36_[1];
                int[] is_47_ = is_36_[2];
                int i_48_ = 0;
                while ((i_48_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff)) {
                    is_45_[i_48_] = i_32_ * i_37_ >> 462196880;
                    is_46_[i_48_] = i_38_ * i_32_ >> 942650032;
                    is_47_[i_48_] = i_32_ * i_39_ >> 512436432;
                    int i_49_ = -anInt9364 + i_48_ & Class226_Sub2.anInt6664;
                    i_39_ -= is_42_[i_49_];
                    i_48_++;
                    i_38_ -= is_41_[i_49_];
                    i_37_ -= is_40_[i_49_];
                    i_49_ = Class226_Sub2.anInt6664 & i_48_ - -anInt9364;
                    i_38_ += is_41_[i_49_];
                    i_39_ += is_42_[i_49_];
                    i_37_ += is_40_[i_49_];
                }
                is_33_[-i + anInt9361 + i_34_] = is_36_;
            }
            int[] is_50_ = is[0];
            int[] is_51_ = is[1];
            int[] is_52_ = is[2];
            for (int i_53_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_53_ ^ 0xffffffff); i_53_++) {
                int i_54_ = 0;
                int i_55_ = 0;
                int i_56_ = 0;
                for (int i_57_ = 0; (i_29_ ^ 0xffffffff) < (i_57_ ^ 0xffffffff); i_57_++) {
                    int[][] is_58_ = is_33_[i_57_];
                    i_56_ += is_58_[2][i_53_];
                    i_54_ += is_58_[0][i_53_];
                    i_55_ += is_58_[1][i_53_];
                }
                is_50_[i_53_] = i_54_ * i_30_ >> 1428832624;
                is_51_[i_53_] = i_30_ * i_55_ >> 1907202864;
                is_52_[i_53_] = i_56_ * i_30_ >> 1714694704;
            }
        }
        if (bool != true)
            method2334(-68, -1.2303699F, -75, -29, -46, -13, false, -109);
        return is;
    }
}
