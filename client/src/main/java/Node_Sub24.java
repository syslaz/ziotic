/* Class248_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.hardware_info.HardwareInfo;

final class Node_Sub24 extends Node {
    static int anInt7098;
    private int anInt7099;
    private int anInt7100;
    private int anInt7101;
    static int anInt7102;
    private int anInt7103;
    static int anInt7104;
    private int anInt7105;
    private boolean aBoolean7106;
    static int anInt7107;
    private String aString7108;
    private String aString7109;
    private int anInt7110;
    private int anInt7111;
    private int anInt7112;
    private int anInt7113;
    private int anInt7114;
    static int anInt7115;
    private String aString7116;
    private boolean aBoolean7117;
    private int anInt7118;
    private int anInt7119;
    private int anInt7120;
    private String aString7121;
    static IncommingOpcode aIncommingOpcode_7122 = new IncommingOpcode(92, 5);
    private int anInt7123;
    static int[] anIntArray7124 = new int[3];
    static int anInt7125 = 2;
    int anInt7126;

    static final float method2542(float f, int i) {
        int i_0_ = -22 / ((8 - i) / 33);
        anInt7104++;
        return f * f * f * (10.0F + f * (-15.0F + 6.0F * f));
    }

    final void method2543(ByteStream class248_sub9, int i) {
        class248_sub9.writeByte(-50, 5);
        anInt7102++;
        class248_sub9.writeByte(-111, anInt7105);
        class248_sub9.writeByte(-127, !aBoolean7117 ? 0 : 1);
        class248_sub9.writeByte(-98, anInt7112);
        class248_sub9.writeByte(-113, anInt7113);
        class248_sub9.writeByte(-38, anInt7123);
        class248_sub9.writeByte(-124, anInt7100);
        class248_sub9.writeByte(-73, anInt7114);
        class248_sub9.writeByte(-113, aBoolean7106 ? 1 : 0);
        class248_sub9.writeShort(1182, anInt7118);
        class248_sub9.writeByte(-118, anInt7120);
        class248_sub9.method2185((byte) -56, ((Node_Sub24) this).anInt7126);
        class248_sub9.writeShort(1182, anInt7111);
        class248_sub9.writeByte(-61, anInt7101);
        class248_sub9.writeByte(-108, anInt7103);
        class248_sub9.writeByte(-55, anInt7119);
        class248_sub9.method2220(true, aString7108);
        class248_sub9.method2220(true, aString7109);
        class248_sub9.method2220(true, aString7121);
        class248_sub9.method2220(true, aString7116);
        class248_sub9.writeByte(-105, anInt7099);
        if (i >= -46)
            method2546(-32);
        class248_sub9.writeShort(1182, anInt7110);
    }

    private final void method2544(int i) {
        if ((aString7108.length() ^ 0xffffffff) < -41)
            aString7108 = aString7108.substring(0, 40);
        anInt7115++;
        if ((aString7109.length() ^ 0xffffffff) < -41)
            aString7109 = aString7109.substring(0, 40);
        if ((aString7121.length() ^ 0xffffffff) < -11)
            aString7121 = aString7121.substring(0, 10);
        if (aString7116.length() > 10)
            aString7116 = aString7116.substring(0, 10);
        if (i != 0)
            method2545(98);
    }

    final int method2545(int i) {
        anInt7107++;
        int i_1_ = 23;
        i_1_ += Class273.method2839(2, aString7108);
        if (i < 71)
            method2546(-118);
        i_1_ += Class273.method2839(2, aString7109);
        i_1_ += Class273.method2839(2, aString7121);
        i_1_ += Class273.method2839(2, aString7116);
        return i_1_;
    }

    public static void method2546(int i) {
        anIntArray7124 = null;
        if (i != 3)
            anIntArray7124 = null;
        aIncommingOpcode_7122 = null;
    }

    static final void method2547(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        Class363.method3820((byte) 0, i_2_);
        anInt7098++;
        int i_8_ = 0;
        int i_9_ = -i_5_ + i_2_;
        if ((i_9_ ^ 0xffffffff) > -1)
            i_9_ = 0;
        if (i_4_ == 2) {
            int i_10_ = i_2_;
            int i_11_ = -i_2_;
            int i_12_ = i_9_;
            int i_13_ = -i_9_;
            int i_14_ = -1;
            if ((Class181.anInt2099 ^ 0xffffffff) >= (i_3_ ^ 0xffffffff) && (aa_Sub3.anInt5270 ^ 0xffffffff) <= (i_3_ ^ 0xffffffff)) {
                int[] is = Class156.anIntArrayArray1867[i_3_];
                int i_15_ = Class49.method389(Class289.anInt3399, i_4_ + 62, Class302.anInt3500, -i_2_ + i_6_);
                int i_16_ = Class49.method389(Class289.anInt3399, i_4_ + 65, Class302.anInt3500, i_6_ - -i_2_);
                int i_17_ = Class49.method389(Class289.anInt3399, i_4_ + 35, Class302.anInt3500, -i_9_ + i_6_);
                int i_18_ = Class49.method389(Class289.anInt3399, i_4_ ^ 0x5b, Class302.anInt3500, i_9_ + i_6_);
                Class149.method1331(i, -123, i_15_, is, i_17_);
                Class149.method1331(i_7_, -79, i_17_, is, i_18_);
                Class149.method1331(i, -60, i_18_, is, i_16_);
            }
            int i_19_ = -1;
            while ((i_8_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff)) {
                i_19_ += 2;
                i_14_ += 2;
                i_11_ += i_14_;
                i_13_ += i_19_;
                if ((i_13_ ^ 0xffffffff) <= -1 && (i_12_ ^ 0xffffffff) <= -2) {
                    i_12_--;
                    Class11.anIntArray247[i_12_] = i_8_;
                    i_13_ -= i_12_ << -1725960831;
                }
                i_8_++;
                if ((i_11_ ^ 0xffffffff) <= -1) {
                    i_10_--;
                    i_11_ -= i_10_ << -889391231;
                    int i_20_ = -i_10_ + i_3_;
                    int i_21_ = i_3_ + i_10_;
                    if ((i_21_ ^ 0xffffffff) <= (Class181.anInt2099 ^ 0xffffffff) && aa_Sub3.anInt5270 >= i_20_) {
                        if ((i_9_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff)) {
                            int i_22_ = Class49.method389(Class289.anInt3399, 20, Class302.anInt3500, i_6_ + i_8_);
                            int i_23_ = Class49.method389(Class289.anInt3399, i_4_ ^ 0x64, Class302.anInt3500, -i_8_ + i_6_);
                            if (aa_Sub3.anInt5270 >= i_21_)
                                Class149.method1331(i, -83, i_23_, (Class156.anIntArrayArray1867[i_21_]), i_22_);
                            if (i_20_ >= Class181.anInt2099)
                                Class149.method1331(i, i_4_ + -86, i_23_, (Class156.anIntArrayArray1867[i_20_]), i_22_);
                        } else {
                            int i_24_ = Class11.anIntArray247[i_10_];
                            int i_25_ = Class49.method389(Class289.anInt3399, 78, Class302.anInt3500, i_8_ + i_6_);
                            int i_26_ = Class49.method389(Class289.anInt3399, 58, Class302.anInt3500, -i_8_ + i_6_);
                            int i_27_ = Class49.method389(Class289.anInt3399, 64, Class302.anInt3500, i_24_ + i_6_);
                            int i_28_ = Class49.method389(Class289.anInt3399, 33, Class302.anInt3500, -i_24_ + i_6_);
                            if (i_21_ <= aa_Sub3.anInt5270) {
                                int[] is = Class156.anIntArrayArray1867[i_21_];
                                Class149.method1331(i, i_4_ + -53, i_26_, is, i_28_);
                                Class149.method1331(i_7_, -56, i_28_, is, i_27_);
                                Class149.method1331(i, i_4_ ^ ~0x4a, i_27_, is, i_25_);
                            }
                            if (i_20_ >= Class181.anInt2099) {
                                int[] is = Class156.anIntArrayArray1867[i_20_];
                                Class149.method1331(i, -110, i_26_, is, i_28_);
                                Class149.method1331(i_7_, i_4_ ^ ~0x60, i_28_, is, i_27_);
                                Class149.method1331(i, i_4_ ^ ~0x47, i_27_, is, i_25_);
                            }
                        }
                    }
                }
                int i_29_ = -i_8_ + i_3_;
                int i_30_ = i_8_ + i_3_;
                if ((i_30_ ^ 0xffffffff) <= (Class181.anInt2099 ^ 0xffffffff) && aa_Sub3.anInt5270 >= i_29_) {
                    int i_31_ = i_6_ + i_10_;
                    int i_32_ = -i_10_ + i_6_;
                    if (i_31_ >= Class302.anInt3500 && ((Class289.anInt3399 ^ 0xffffffff) <= (i_32_ ^ 0xffffffff))) {
                        i_31_ = Class49.method389(Class289.anInt3399, i_4_ ^ 0xf, Class302.anInt3500, i_31_);
                        i_32_ = Class49.method389(Class289.anInt3399, 111, Class302.anInt3500, i_32_);
                        if (i_9_ <= i_8_) {
                            if (i_30_ <= aa_Sub3.anInt5270)
                                Class149.method1331(i, -104, i_32_, (Class156.anIntArrayArray1867[i_30_]), i_31_);
                            if (i_29_ >= Class181.anInt2099)
                                Class149.method1331(i, i_4_ ^ ~0x51, i_32_, (Class156.anIntArrayArray1867[i_29_]), i_31_);
                        } else {
                            int i_33_ = ((i_12_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff) ? Class11.anIntArray247[i_8_] : i_12_);
                            int i_34_ = Class49.method389(Class289.anInt3399, i_4_ + 12, Class302.anInt3500, i_6_ + i_33_);
                            int i_35_ = Class49.method389(Class289.anInt3399, i_4_ + 8, Class302.anInt3500, i_6_ + -i_33_);
                            if (i_30_ <= aa_Sub3.anInt5270) {
                                int[] is = Class156.anIntArrayArray1867[i_30_];
                                Class149.method1331(i, -64, i_32_, is, i_35_);
                                Class149.method1331(i_7_, i_4_ + -98, i_35_, is, i_34_);
                                Class149.method1331(i, -108, i_34_, is, i_31_);
                            }
                            if (i_29_ >= Class181.anInt2099) {
                                int[] is = Class156.anIntArrayArray1867[i_29_];
                                Class149.method1331(i, -118, i_32_, is, i_35_);
                                Class149.method1331(i_7_, -113, i_35_, is, i_34_);
                                Class149.method1331(i, -122, i_34_, is, i_31_);
                            }
                        }
                    }
                }
            }
        }
    }

    public Node_Sub24() {
        /* empty */
    }

    Node_Sub24(boolean bool, Class174 class174) {
        if (bool) {
            if (Class174.aString2044.startsWith("win"))
                anInt7105 = 1;
            else if (!Class174.aString2044.startsWith("mac")) {
                if (Class174.aString2044.startsWith("linux"))
                    anInt7105 = 3;
                else
                    anInt7105 = 4;
            } else
                anInt7105 = 2;
            if (Class174.aString2028.startsWith("amd64") || Class174.aString2028.startsWith("x86_64"))
                aBoolean7117 = true;
            else
                aBoolean7117 = false;
            if ((anInt7105 ^ 0xffffffff) != -2) {
                if (anInt7105 == 2) {
                    if (Class174.aString2045.indexOf("10.4") == -1) {
                        if ((Class174.aString2045.indexOf("10.5") ^ 0xffffffff) != 0)
                            anInt7112 = 21;
                        else if (Class174.aString2045.indexOf("10.6") != -1)
                            anInt7112 = 22;
                    } else
                        anInt7112 = 20;
                }
            } else if (Class174.aString2045.indexOf("4.0") != -1)
                anInt7112 = 1;
            else if ((Class174.aString2045.indexOf("4.1") ^ 0xffffffff) == 0) {
                if ((Class174.aString2045.indexOf("4.9") ^ 0xffffffff) != 0)
                    anInt7112 = 3;
                else if ((Class174.aString2045.indexOf("5.0") ^ 0xffffffff) != 0)
                    anInt7112 = 4;
                else if (Class174.aString2045.indexOf("5.1") == -1) {
                    if (Class174.aString2045.indexOf("6.0") == -1) {
                        if (Class174.aString2045.indexOf("6.1") != -1)
                            anInt7112 = 7;
                    } else
                        anInt7112 = 6;
                } else
                    anInt7112 = 5;
            } else
                anInt7112 = 2;
            if (Class174.aString2046.toLowerCase().indexOf("sun") != -1)
                anInt7113 = 1;
            else if (Class174.aString2046.toLowerCase().indexOf("microsoft") == -1) {
                if ((Class174.aString2046.toLowerCase().indexOf("apple") ^ 0xffffffff) == 0)
                    anInt7113 = 4;
                else
                    anInt7113 = 3;
            } else
                anInt7113 = 2;
            int i = 2;
            int i_36_ = 0;
            try {
                while (Class174.aString2026.length() > i) {
                    int i_37_ = Class174.aString2026.charAt(i);
                    if (i_37_ < 48 || i_37_ > 57)
                        break;
                    i++;
                    i_36_ = -48 - (-i_37_ - 10 * i_36_);
                }
            } catch (Exception exception) {
                /* empty */
            }
            anInt7123 = i_36_;
            i = 1 + Class174.aString2026.indexOf('.', 2);
            i_36_ = 0;
            try {
                while (Class174.aString2026.length() > i) {
                    int i_38_ = Class174.aString2026.charAt(i);
                    if (i_38_ < 48 || i_38_ > 57)
                        break;
                    i++;
                    i_36_ = i_36_ * 10 - -i_38_ - 48;
                }
            } catch (Exception exception) {
                /* empty */
            }
            anInt7100 = i_36_;
            i_36_ = 0;
            i = 1 + Class174.aString2026.indexOf('_', 4);
            try {
                for (/**/; ((Class174.aString2026.length() ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
                    int i_39_ = Class174.aString2026.charAt(i);
                    if (i_39_ < 48 || (i_39_ ^ 0xffffffff) < -58)
                        break;
                    i_36_ = -48 + (i_39_ + 10 * i_36_);
                }
            } catch (Exception exception) {
                /* empty */
            }
            if ((anInt7123 ^ 0xffffffff) < -4)
                anInt7120 = Class121.anInt1513;
            else
                anInt7120 = 0;
            anInt7118 = Class75.anInt977;
            anInt7114 = i_36_;
            if (((Class174) class174).aBoolean2039)
                aBoolean7106 = false;
            else
                aBoolean7106 = true;
            try {
                int[] is = HardwareInfo.getCPUInfo();
                if (is != null && (is.length ^ 0xffffffff) == -8) {
                    anInt7103 = is[4];
                    anInt7111 = is[2];
                    anInt7101 = is[3];
                    ((Node_Sub24) this).anInt7126 = is[6];
                    anInt7119 = is[5];
                }
            } catch (Throwable throwable) {
                ((Node_Sub24) this).anInt7126 = 0;
            }
        }
        if (aString7108 == null)
            aString7108 = "";
        if (aString7121 == null)
            aString7121 = "";
        if (aString7116 == null)
            aString7116 = "";
        if (aString7109 == null)
            aString7109 = "";
        method2544(0);
    }
}
