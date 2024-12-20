/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class269 {
    static int anInt3128;
    static int anInt3129;
    static IncommingOpcode aIncommingOpcode_3130 = new IncommingOpcode(55, 3);
    static IncommingOpcode aIncommingOpcode_3131 = new IncommingOpcode(8, 6);
    static int anInt3132;
    static int anInt3133;

    abstract void method2806(byte i);

    static final void method2807(int i, int i_0_, int i_1_, int i_2_) {
        i_2_ = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7344.method2993(true) * i_2_ >> 1026401928;
        anInt3129++;
        if (i != -1 || ha_Sub3_Sub1.aBoolean8709) {
            if ((i ^ 0xffffffff) != 0 && (i != Node_Sub8_Sub3.anInt8927 || !Class310.method3243(-105)) && i_2_ != 0 && !ha_Sub3_Sub1.aBoolean8709) {
                Class229.method1829(i, 0, i_0_, Class116_Sub1.aClass381_6281, false, i_2_, -114);
                Class253_Sub1.method2728(false);
            }
        } else
            Node_Sub21.method2527(1);
        if (i != Node_Sub8_Sub3.anInt8927)
            Class280.aClass248_Sub15_Sub1_3261 = null;
        Node_Sub8_Sub3.anInt8927 = i;
        if (i_1_ >= -83)
            aIncommingOpcode_3131 = null;
    }

    final boolean method2808(int i) {
        if (i > -127)
            method2808(33);
        anInt3132++;
        if (!method2814((byte) 102) && !method2813(false) && !method2811(false))
            return false;
        return true;
    }

    abstract int method2809(int i);

    abstract Node_Sub39 method2810(byte i);

    abstract boolean method2811(boolean bool);

    public static void method2812(int i) {
        aIncommingOpcode_3131 = null;
        aIncommingOpcode_3130 = null;
        if (i != 3161)
            method2816(90, -65, false, null, null);
    }

    abstract boolean method2813(boolean bool);

    abstract boolean method2814(byte i);

    abstract void method2815(int i);

    public Class269() {
        /* empty */
    }

    static final void method2816(int i, int i_3_, boolean bool, int[] is, Object[] objects) {
        if (i_3_ < i) {
            int i_4_ = (i + i_3_) / 2;
            int i_5_ = i_3_;
            int i_6_ = is[i_4_];
            is[i_4_] = is[i];
            is[i] = i_6_;
            Object object = objects[i_4_];
            objects[i_4_] = objects[i];
            objects[i] = object;
            int i_7_ = (i_6_ ^ 0xffffffff) == -2147483648 ? 0 : 1;
            for (int i_8_ = i_3_; (i_8_ ^ 0xffffffff) > (i ^ 0xffffffff); i_8_++) {
                if ((is[i_8_] ^ 0xffffffff) > ((i_8_ & i_7_) + i_6_ ^ 0xffffffff)) {
                    int i_9_ = is[i_8_];
                    is[i_8_] = is[i_5_];
                    is[i_5_] = i_9_;
                    Object object_10_ = objects[i_8_];
                    objects[i_8_] = objects[i_5_];
                    objects[i_5_++] = object_10_;
                }
            }
            is[i] = is[i_5_];
            is[i_5_] = i_6_;
            objects[i] = objects[i_5_];
            objects[i_5_] = object;
            method2816(i_5_ + -1, i_3_, true, is, objects);
            method2816(i, 1 + i_5_, bool, is, objects);
        }
        anInt3128++;
        if (bool != true)
            method2812(-59);
    }

    abstract int method2817(byte i);
}
