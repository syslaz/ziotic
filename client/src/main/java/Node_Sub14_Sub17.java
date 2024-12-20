/* Class248_Sub14_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.net.URL;

final class Node_Sub14_Sub17 extends Node_Sub14 {
    static int anInt9339;
    private boolean aBoolean9340;
    static Class243 aClass243_9341;
    static int anInt9342;
    private int anInt9343 = 4096;
    static int anInt9344;
    static int anInt9345;
    static int anInt9346;

    final int[][] method2271(int i, boolean bool) {
        anInt9339++;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int[] is_0_ = this.method2265((byte) 64, za_Sub1.anInt9802 & i + -1, 0);
            int[] is_1_ = this.method2265((byte) 64, i, 0);
            int[] is_2_ = this.method2265((byte) 64, za_Sub1.anInt9802 & 1 + i, 0);
            int[] is_3_ = is[0];
            int[] is_4_ = is[1];
            int[] is_5_ = is[2];
            for (int i_6_ = 0; Class185.anInt2164 > i_6_; i_6_++) {
                int i_7_ = (is_2_[i_6_] + -is_0_[i_6_]) * anInt9343;
                int i_8_ = ((-is_1_[-1 + i_6_ & Class226_Sub2.anInt6664] + is_1_[1 + i_6_ & Class226_Sub2.anInt6664]) * anInt9343);
                int i_9_ = i_8_ >> 1555470220;
                int i_10_ = i_7_ >> -1484886004;
                int i_11_ = i_9_ * i_9_ >> 957200780;
                int i_12_ = i_10_ * i_10_ >> 1350069324;
                int i_13_ = (int) (Math.sqrt((double) ((float) (4096 + i_12_ + i_11_) / 4096.0F)) * 4096.0);
                int i_14_;
                int i_15_;
                int i_16_;
                if (i_13_ != 0) {
                    i_14_ = i_8_ / i_13_;
                    i_15_ = 16777216 / i_13_;
                    i_16_ = i_7_ / i_13_;
                } else {
                    i_14_ = 0;
                    i_15_ = 0;
                    i_16_ = 0;
                }
                if (aBoolean9340) {
                    i_14_ = 2048 - -(i_14_ >> 2146284609);
                    i_16_ = 2048 + (i_16_ >> 2102868513);
                    i_15_ = 2048 - -(i_15_ >> 2129692545);
                }
                is_3_[i_6_] = i_14_;
                is_4_[i_6_] = i_16_;
                is_5_[i_6_] = i_15_;
            }
        }
        if (bool != true)
            aBoolean9340 = false;
        return is;
    }

    static final int method2324(boolean bool, byte i) {
        anInt9346++;
        int i_17_ = -20 % ((i - -16) / 52);
        if (Class346_Sub7_Sub4_Sub1.anIntArray10091 == null)
            return 0;
        if (!bool && Class268.aClass177Array3120 != null)
            return 2 * Class346_Sub7_Sub4_Sub1.anIntArray10091.length;
        int i_18_ = 0;
        for (int i_19_ = 0; Class346_Sub7_Sub4_Sub1.anIntArray10091.length > i_19_; i_19_++) {
            int i_20_ = Class346_Sub7_Sub4_Sub1.anIntArray10091[i_19_];
            if (Class41.aClass381_531.method3920(i_20_, 96))
                i_18_++;
            if (Node_Sub14_Sub34.aClass381_9524.method3920(i_20_, 62))
                i_18_++;
        }
        return i_18_;
    }

    public static void method2325(int i) {
        aClass243_9341 = null;
        if (i > -91)
            aClass243_9341 = null;
    }

    static final Node_Sub36 method2326(int i, byte i_21_, int i_22_, int i_23_) {
        anInt9345++;
        Node_Sub36 class248_sub36 = null;
        if ((i ^ 0xffffffff) == -1) {
            class248_sub36 = Class346_Sub1.method3540(1, Class346_Sub5_Sub2.aISAACCypher_9889, Class311.aOutgoingOpcode_3614);
            Class187.anInt2171++;
        }
        if ((i ^ 0xffffffff) == -2) {
            class248_sub36 = Class346_Sub1.method3540(i_21_ ^ 0x1b, Class346_Sub5_Sub2.aISAACCypher_9889, Class301_Sub3.aOutgoingOpcode_8443);
            Node_Sub28.anInt7163++;
        }
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(Class368.baseY + i_22_, i_21_ + 36);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteS((byte) 109, !Class353.aClass253_4192.method2722(true, 82) ? 0 : 1);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(Class67.baseX + i_23_, i_21_ + 93);
        Applet_Sub1.anInt44 = i_23_;
        Class72.anInt4876 = i_22_;
        Class381.aBoolean4681 = false;
        if (i_21_ != 26)
            return null;
        Class96.method704(false);
        return class248_sub36;
    }

    static final boolean method2327(byte i, String string, int i_24_) {
        anInt9344++;
        if (((Class174) Node_Sub14_Sub15.aClass174_9328).aBoolean2039) {
            Class346_Sub7_Sub2_Sub4.aWorldAddress_10119 = new WorldAddress();
            ((WorldAddress) Class346_Sub7_Sub2_Sub4.aWorldAddress_10119).address = string;
            ((WorldAddress) Class346_Sub7_Sub2_Sub4.aWorldAddress_10119).worldId = i_24_;
            if (s_Sub2.aClass339_7951 != Class18.aClass339_295) {
                ((WorldAddress) Class346_Sub7_Sub2_Sub4.aWorldAddress_10119).port1 = 40000 + ((WorldAddress) (Class346_Sub7_Sub2_Sub4.aWorldAddress_10119)).worldId;
                ((WorldAddress) Class346_Sub7_Sub2_Sub4.aWorldAddress_10119).port2 = 50000 + ((WorldAddress) (Class346_Sub7_Sub2_Sub4.aWorldAddress_10119)).worldId;
            }
            for (int i_25_ = 0; ((i_25_ ^ 0xffffffff) > (Class64.aClass147_Sub1Array869.length ^ 0xffffffff)); i_25_++) {
                if (((((Class147_Sub1) Class64.aClass147_Sub1Array869[i_25_]).anInt6285) ^ 0xffffffff) == (i_24_ ^ 0xffffffff))
                    Class20.anInt309 = (((Class147) Class64.aClass147_Sub1Array869[i_25_]).anInt1733);
            }
            return true;
        }
        int i_26_ = -124 / ((i - 19) / 55);
        String string_27_ = "";
        if (Class18.aClass339_295 != s_Sub2.aClass339_7951)
            string_27_ = ":" + (7000 + i_24_);
        String string_28_ = "";
        if (Class84_Sub8.aString5473 != null)
            string_28_ = "/p=" + Class84_Sub8.aString5473;
        String string_29_ = ("http://" + string + string_27_ + "/l=" + Class191.anInt4822 + "/a=" + Node_Sub8_Sub5.anInt8930 + string_28_ + "/j" + (!Class176.aBoolean2058 ? "0" : "1") + ",o" + (Class346_Sub7_Sub3.aBoolean9941 ? "1" : "0") + ",a2");
        try {
            Node_Sub8_Sub16_Sub1.aClient10301.getAppletContext().showDocument(new URL(string_29_), "_self");
        } catch (Exception exception) {
            return false;
        }
        return true;
    }

    public Node_Sub14_Sub17() {
        super(1, false);
        aBoolean9340 = true;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_30_) {
        if (i != -61)
            method2269(null, (byte) -16, 34);
        int i_31_ = i_30_;
        do {
            if (i_31_ != 0) {
                if (i_31_ != 1)
                    break;
            } else {
                anInt9343 = class248_sub9.readShort(i + 60);
                break;
            }
            aBoolean9340 = class248_sub9.readUnsignedByte((byte) -37) == 1;
        } while (false);
        anInt9342++;
    }
}
