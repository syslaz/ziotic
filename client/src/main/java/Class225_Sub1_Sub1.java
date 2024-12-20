/* Class225_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class225_Sub1_Sub1 extends Class225_Sub1 {
    static int anInt9977;
    static IncommingOpcode aIncommingOpcode_9978 = new IncommingOpcode(13, 7);
    static int anInt9979;
    static int anInt9980;
    static int anInt9981;
    static Class278 aClass278_9982 = new Class278(64);
    static int anInt9983;
    static int anInt9984 = 0;
    static IncommingOpcode aIncommingOpcode_9985 = new IncommingOpcode(73, 3);
    static Class9[] aClass9Array9986;
    int anInt9987;

    Class225_Sub1_Sub1(Class186 class186, Class272 class272, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
        super(class186, class272, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_);
        ((Class225_Sub1_Sub1) this).anInt9987 = i_12_;
    }

    static final int method1790(String string, int i, int i_13_, String string_14_) {
        anInt9980++;
        int i_15_ = string.length();
        int i_16_ = string_14_.length();
        int i_17_ = 0;
        int i_18_ = 0;
        char c = '\0';
        char c_19_ = '\0';
        while_143_:
        do {
            char c_20_;
            char c_21_;
            for (; ; ) {
                if ((i_15_ ^ 0xffffffff) >= (i_17_ + -c ^ 0xffffffff) && (-c_19_ + i_18_ ^ 0xffffffff) <= (i_16_ ^ 0xffffffff))
                    break while_143_;
                if ((i_15_ ^ 0xffffffff) >= (-c + i_17_ ^ 0xffffffff))
                    return -1;
                if (i_16_ <= -c_19_ + i_18_)
                    return 1;
                if (c == 0)
                    c_20_ = string.charAt(i_17_++);
                else {
                    c_20_ = c;
                    boolean bool = false;
                }
                if (c_19_ != 0) {
                    c_21_ = c_19_;
                    boolean bool = false;
                } else
                    c_21_ = string_14_.charAt(i_18_++);
                c = Class205.method1699(true, c_20_);
                c_19_ = Class205.method1699(true, c_21_);
                c_20_ = ha_Sub3.method1016(c_20_, 0, i);
                c_21_ = ha_Sub3.method1016(c_21_, 0, i);
                if (c_21_ != c_20_ && ((Character.toUpperCase(c_20_) ^ 0xffffffff) != (Character.toUpperCase(c_21_) ^ 0xffffffff))) {
                    c_20_ = Character.toLowerCase(c_20_);
                    c_21_ = Character.toLowerCase(c_21_);
                    if ((c_20_ ^ 0xffffffff) != (c_21_ ^ 0xffffffff))
                        break;
                }
            }
            return (Class74.method550(i, c_20_, (byte) -119) + -Class74.method550(i, c_21_, (byte) 15));
        } while (false);
        int i_22_ = Math.min(i_15_, i_16_);
        for (int i_23_ = i_13_; i_23_ < i_22_; i_23_++) {
            if (i != 2)
                i_17_ = i_18_ = i_23_;
            else {
                i_17_ = -1 + (i_15_ + -i_23_);
                i_18_ = -i_23_ + (i_16_ - 1);
            }
            char c_24_ = string.charAt(i_17_);
            char c_25_ = string_14_.charAt(i_18_);
            if (c_24_ != c_25_ && ((Character.toUpperCase(c_24_) ^ 0xffffffff) != (Character.toUpperCase(c_25_) ^ 0xffffffff))) {
                c_24_ = Character.toLowerCase(c_24_);
                c_25_ = Character.toLowerCase(c_25_);
                if ((c_25_ ^ 0xffffffff) != (c_24_ ^ 0xffffffff))
                    return (Class74.method550(i, c_24_, (byte) -123) + -Class74.method550(i, c_25_, (byte) -119));
            }
        }
        int i_26_ = i_15_ + -i_16_;
        if ((i_26_ ^ 0xffffffff) != -1)
            return i_26_;
        for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff); i_27_++) {
            char c_28_ = string.charAt(i_27_);
            char c_29_ = string_14_.charAt(i_27_);
            if ((c_29_ ^ 0xffffffff) != (c_28_ ^ 0xffffffff))
                return (Class74.method550(i, c_28_, (byte) -118) + -Class74.method550(i, c_29_, (byte) -120));
        }
        return 0;
    }

    public static void method1791(int i) {
        aIncommingOpcode_9985 = null;
        aClass278_9982 = null;
        aIncommingOpcode_9978 = null;
        aClass9Array9986 = null;
        if (i != 0)
            method1791(-30);
    }

    public final Class208 method35(byte i) {
        anInt9977++;
        if (i != 62)
            return null;
        return Class377.aClass208_4621;
    }

    static final void method1792(int i) {
        Class316_Sub2_Sub1.anInterface14_9870 = null;
        Class301.aHa4933 = null;
        Node_Sub14_Sub30.aViewport_9479 = null;
        Class225_Sub1.anInt8451 = -1;
        Class333.aViewport_3895 = null;
        Node_Sub15_Sub4.anInt9694 = -1;
        if (i == 0) {
            Class2.anInt118 = -1;
            Node_Sub11.aViewport_6952 = null;
            s_Sub2.anInt7955 = -1;
            anInt9981++;
            Class183.anInterface14Array2136 = null;
            Class341.anIntArray3970 = null;
            Node_Sub8_Sub7.aClass27_8958.method254(28);
        }
    }
}
