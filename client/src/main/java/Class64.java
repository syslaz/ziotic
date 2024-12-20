/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

final class Class64 {
    Node_Sub8 aClass248_Sub8_856 = new Node_Sub8();
    static int anInt857;
    static OutgoingOpcode aOutgoingOpcode_858;
    static int anInt859;
    static int anInt860;
    static int anInt861;
    static int anInt862;
    static int anInt863;
    static int anInt864;
    static int anInt865 = -1;
    static int anInt866;
    static int anInt867;
    static int anInt868 = -1;
    static Class147_Sub1[] aClass147_Sub1Array869 = new Class147_Sub1[0];
    static int anInt870;
    static String aString871;
    static int anInt872;
    private Node_Sub8 aClass248_Sub8_873;
    static String aString874;

    static final Class162 method489(int i, Class162 class162, int i_0_, ha var_ha, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Class182 class182, byte i_8_, int i_9_) {
        anInt860++;
        if (i_8_ >= -51)
            aClass147_Sub1Array869 = null;
        if (class162 == null)
            return null;
        int i_10_ = 2055;
        if (class182 != null) {
            i_10_ |= class182.method1610((byte) -48, false, i_3_, -1);
            i_10_ &= ~0x200;
        }
        long l = ((long) (i_0_ + (i_5_ << 2131002608) - -(i_6_ << 1913555512)) - -((long) i_7_ << 1207472544) + ((long) i_9_ << -618520464));
        Class162 class162_11_;
        synchronized (Class340.aClass278_3953) {
            class162_11_ = (Class162) Class340.aClass278_3953.method2863(4, l);
        }
        if (class162_11_ == null || (var_ha.b(class162_11_.ua(), i_10_) ^ 0xffffffff) != -1) {
            if (class162_11_ != null)
                i_10_ = var_ha.c(i_10_, class162_11_.ua());
            int i_12_;
            if ((i_0_ ^ 0xffffffff) != -2) {
                if ((i_0_ ^ 0xffffffff) == -3)
                    i_12_ = 12;
                else if ((i_0_ ^ 0xffffffff) == -4)
                    i_12_ = 15;
                else if ((i_0_ ^ 0xffffffff) == -5)
                    i_12_ = 18;
                else
                    i_12_ = 21;
            } else
                i_12_ = 9;
            int i_13_ = 3;
            int[] is = {64, 96, 128};
            Class343 class343 = new Class343(1 + i_12_ * i_13_, -i_12_ + 2 * i_13_ * i_12_, 0);
            int i_14_ = class343.method3499(1, 0, 0, 0);
            int[][] is_15_ = new int[i_13_][i_12_];
            for (int i_16_ = 0; i_13_ > i_16_; i_16_++) {
                int i_17_ = is[i_16_];
                int i_18_ = is[i_16_];
                for (int i_19_ = 0; i_19_ < i_12_; i_19_++) {
                    int i_20_ = (i_19_ << 654484846) / i_12_;
                    int i_21_ = (i_17_ * Node_Sub9_Sub1.anIntArray9106[i_20_] >> -1399903314);
                    int i_22_ = (i_18_ * Node_Sub9_Sub1.anIntArray9109[i_20_] >> 204541454);
                    is_15_[i_16_][i_19_] = class343.method3499(1, i_21_, i_22_, 0);
                }
            }
            for (int i_23_ = 0; (i_13_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++) {
                int i_24_ = (128 + i_23_ * 256) / i_13_;
                int i_25_ = 256 - i_24_;
                byte i_26_ = (byte) (i_24_ * i_6_ + i_5_ * i_25_ >> 1860578792);
                short i_27_ = (short) (((((i_9_ & 0x380) * i_24_ + (0x380 & i_7_) * i_25_) & 0x38000) + (0xfc0000 & (i_25_ * (0xfc00 & i_7_) + (0xfc00 & i_9_) * i_24_)) + (0x7f00 & ((i_9_ & 0x7f) * i_24_ + (i_7_ & 0x7f) * i_25_))) >> -1232019608);
                for (int i_28_ = 0; (i_12_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
                    if (i_23_ != 0) {
                        class343.method3495((byte) -85, (byte) -1, i_26_, (byte) 1, (short) -1, (is_15_[-1 + i_23_][(i_28_ - -1) % i_12_]), i_27_, is_15_[i_23_][(1 + i_28_) % i_12_], is_15_[i_23_ + -1][i_28_]);
                        class343.method3495((byte) -85, (byte) -1, i_26_, (byte) 1, (short) -1, is_15_[i_23_][(1 + i_28_) % i_12_], i_27_, is_15_[i_23_][i_28_], is_15_[-1 + i_23_][i_28_]);
                    } else
                        class343.method3495((byte) -85, (byte) -1, i_26_, (byte) 1, (short) -1, is_15_[0][(i_28_ + 1) % i_12_], i_27_, is_15_[0][i_28_], i_14_);
                }
            }
            class162_11_ = var_ha.a(class343, i_10_, Class7.anInt161, 64, 768);
            synchronized (Class340.aClass278_3953) {
                Class340.aClass278_3953.method2867((byte) 0, l, class162_11_);
            }
        }
        int i_29_ = class162.V();
        int i_30_ = class162.RA();
        int i_31_ = class162.HA();
        int i_32_ = class162.G();
        Node_Sub8_Sub2 class248_sub8_sub2 = null;
        if (class182 != null) {
            i_3_ = ((Class182) class182).anIntArray2117[i_3_];
            class248_sub8_sub2 = Class235.aClass356_2617.method3788(-21, i_3_ >> 1028474736);
            i_3_ &= 0xffff;
        }
        if (class248_sub8_sub2 == null) {
            class162_11_ = class162_11_.method1436((byte) 3, i_10_, true);
            class162_11_.O(i_30_ - i_29_ >> 1942771393, 128, i_32_ - i_31_ >> -1136941887);
            class162_11_.H(i_29_ - -i_30_ >> 1641175169, 0, i_32_ + i_31_ >> 71462689);
        } else {
            class162_11_ = class162_11_.method1436((byte) 3, i_10_, true);
            class162_11_.O(i_30_ + -i_29_ >> -1993297567, 128, i_32_ - i_31_ >> -812585407);
            class162_11_.H(i_29_ + i_30_ >> -1389373983, 0, i_32_ + i_31_ >> -720260191);
            class162_11_.method1419(class248_sub8_sub2, (byte) -117, i_3_);
        }
        if ((i_2_ ^ 0xffffffff) != -1)
            class162_11_.FA(i_2_);
        if (i != 0)
            class162_11_.VA(i);
        if ((i_1_ ^ 0xffffffff) != -1)
            class162_11_.H(0, i_1_, 0);
        return class162_11_;
    }

    final Node_Sub8 method490(boolean bool) {
        anInt862++;
        Node_Sub8 class248_sub8 = aClass248_Sub8_873;
        if (((Class64) this).aClass248_Sub8_856 == class248_sub8) {
            aClass248_Sub8_873 = null;
            return null;
        }
        aClass248_Sub8_873 = ((Node_Sub8) class248_sub8).aClass248_Sub8_6871;
        if (bool != true)
            return null;
        return class248_sub8;
    }

    final void method491(Node_Sub8 class248_sub8, int i) {
        if (((Node_Sub8) class248_sub8).aClass248_Sub8_6867 != null)
            class248_sub8.method2021((byte) -26);
        anInt859++;
        ((Node_Sub8) class248_sub8).aClass248_Sub8_6867 = (((Node_Sub8) ((Class64) this).aClass248_Sub8_856).aClass248_Sub8_6867);
        if (i > -105)
            method497(48);
        ((Node_Sub8) class248_sub8).aClass248_Sub8_6871 = ((Class64) this).aClass248_Sub8_856;
        ((Node_Sub8) ((Node_Sub8) class248_sub8).aClass248_Sub8_6867).aClass248_Sub8_6871 = class248_sub8;
        ((Node_Sub8) ((Node_Sub8) class248_sub8).aClass248_Sub8_6871).aClass248_Sub8_6867 = class248_sub8;
    }

    final Node_Sub8 method492(int i) {
        anInt864++;
        Node_Sub8 class248_sub8 = (((Node_Sub8) ((Class64) this).aClass248_Sub8_856).aClass248_Sub8_6871);
        if (((Class64) this).aClass248_Sub8_856 == class248_sub8) {
            aClass248_Sub8_873 = null;
            return null;
        }
        aClass248_Sub8_873 = ((Node_Sub8) class248_sub8).aClass248_Sub8_6871;
        if (i != 896)
            return null;
        return class248_sub8;
    }

    static final boolean method493(byte i, int i_33_, int i_34_) {
        int i_35_ = -46 % ((i - -60) / 60);
        anInt857++;
        if (!((i_34_ & 0x70000) != 0 | Class315.method3281(i_34_, i_33_, 3828)) && !Node_Sub14.method2270(i_34_, i_33_, (byte) 8))
            return false;
        return true;
    }

    final int method494(int i) {
        anInt872++;
        if (i <= 17)
            method499((byte) 63, 6, -46, 125, 116);
        int i_36_ = 0;
        Node_Sub8 class248_sub8 = (((Node_Sub8) ((Class64) this).aClass248_Sub8_856).aClass248_Sub8_6871);
        while (class248_sub8 != ((Class64) this).aClass248_Sub8_856) {
            class248_sub8 = ((Node_Sub8) class248_sub8).aClass248_Sub8_6871;
            i_36_++;
        }
        return i_36_;
    }

    static final void method495(int i, int i_37_, byte i_38_) {
        anInt863++;
        ha_Sub2.anInt5704 = -Class116.anInt1469 + i;
        Class59.anInt810 = -Class116.anInt1468 + i_37_;
        if (i_38_ != -87)
            method500(-53);
    }

    final void method496(byte i) {
        anInt866++;
        if (i == -74) {
            for (; ; ) {
                Node_Sub8 class248_sub8 = (((Node_Sub8) ((Class64) this).aClass248_Sub8_856).aClass248_Sub8_6871);
                if (((Class64) this).aClass248_Sub8_856 == class248_sub8)
                    break;
                class248_sub8.method2021((byte) -26);
            }
            aClass248_Sub8_873 = null;
        }
    }

    final Node_Sub8 method497(int i) {
        anInt861++;
        Node_Sub8 class248_sub8 = (((Node_Sub8) ((Class64) this).aClass248_Sub8_856).aClass248_Sub8_6871);
        if (((Class64) this).aClass248_Sub8_856 == class248_sub8)
            return null;
        if (i != 896)
            return null;
        class248_sub8.method2021((byte) -26);
        return class248_sub8;
    }

    static final void method498(byte i, int i_39_, boolean bool) {
        if (bool) {
            Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, Class346_Sub5_Sub2.aISAACCypher_9889, Class54_Sub1.aOutgoingOpcode_5330);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, i_39_);
            Class226_Sub3.method1814(class248_sub36, 0);
        } else
            Class47.method351(Class175.aClass58_2053, i_39_, -1);
        anInt867++;
        if (i >= -19)
            anInt868 = 114;
    }

    static final void method499(byte i, int i_40_, int i_41_, int i_42_, int i_43_) {
        Class360.anInt4446 = i_42_;
        Node_Sub42.anInt7292 = i_43_;
        if (i == 41) {
            anInt870++;
            Class102.anInt1307 = i_40_;
            Class84_Sub9.anInt5498 = i_41_;
        }
    }

    public static void method500(int i) {
        aOutgoingOpcode_858 = null;
        aClass147_Sub1Array869 = null;
        aString871 = null;
        if (i != -1)
            method498((byte) 20, 71, true);
        aString874 = null;
    }

    public Class64() {
        ((Node_Sub8) ((Class64) this).aClass248_Sub8_856).aClass248_Sub8_6867 = ((Class64) this).aClass248_Sub8_856;
        ((Node_Sub8) ((Class64) this).aClass248_Sub8_856).aClass248_Sub8_6871 = ((Class64) this).aClass248_Sub8_856;
    }

    static {
        aOutgoingOpcode_858 = new OutgoingOpcode(16, 12);
        String string = "Unknown";
        try {
            string = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        aString871 = string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        aString874 = string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        string.toLowerCase();
        string = "~/";
        try {
            string = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        new File(string);
    }
}
