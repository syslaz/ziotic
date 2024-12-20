/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class205 {
    static int anInt2381;
    static int anInt2382;
    static Class381 aClass381_2383;
    static Node_Sub29 aClass248_Sub29_2384 = new Node_Sub29(0, 0);
    static int anInt2385;
    static IncommingOpcode aIncommingOpcode_2386;
    static int anInt2387 = -1;
    static short[][] aShortArrayArray2388;
    static int anInt2389 = 328;

    abstract byte[] method1693(int i, int i_0_, int i_1_);

    static final void method1694(int i, boolean bool, int i_2_, int i_3_, boolean bool_4_, int i_5_, int i_6_) {
        anInt2385++;
        if (i_5_ > i_6_) {
            int i_7_ = (i_6_ + i_5_) / 2;
            int i_8_ = i_6_;
            Class147_Sub1 class147_sub1 = Class64.aClass147_Sub1Array869[i_7_];
            Class64.aClass147_Sub1Array869[i_7_] = Class64.aClass147_Sub1Array869[i_5_];
            Class64.aClass147_Sub1Array869[i_5_] = class147_sub1;
            for (int i_9_ = i_6_; (i_9_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_9_++) {
                if (Class67.method520(bool_4_, bool, class147_sub1, i, (byte) 121, Class64.aClass147_Sub1Array869[i_9_], i_2_) <= 0) {
                    Class147_Sub1 class147_sub1_10_ = Class64.aClass147_Sub1Array869[i_9_];
                    Class64.aClass147_Sub1Array869[i_9_] = Class64.aClass147_Sub1Array869[i_8_];
                    Class64.aClass147_Sub1Array869[i_8_++] = class147_sub1_10_;
                }
            }
            Class64.aClass147_Sub1Array869[i_5_] = Class64.aClass147_Sub1Array869[i_8_];
            Class64.aClass147_Sub1Array869[i_8_] = class147_sub1;
            method1694(i, bool, i_2_, 69, bool_4_, -1 + i_8_, i_6_);
            method1694(i, bool, i_2_, 69, bool_4_, i_5_, 1 + i_8_);
        }
        if (i_3_ != 69)
            method1699(true, '\ufff0');
    }

    static final boolean method1695(int i, Class339 class339) {
        anInt2382++;
        if (i >= -113)
            method1694(-87, false, 113, 32, false, 104, -43);
        if (class339 != Class187.aClass339_2177 && class339 != RSInterface2.aClass339_4311 && Class346_Sub7_Sub1_Sub1.aClass339_10136 != class339 && Class256.aClass339_2930 != class339)
            return false;
        return true;
    }

    public static void method1696(int i) {
        aClass248_Sub29_2384 = null;
        aIncommingOpcode_2386 = null;
        if (i != 2)
            aIncommingOpcode_2386 = null;
        aShortArrayArray2388 = null;
        aClass381_2383 = null;
    }

    abstract byte[] method1697(int i);

    abstract void method1698(byte i, byte[] is);

    static final char method1699(boolean bool, char c) {
        anInt2381++;
        if ((c ^ 0xffffffff) == -199)
            return 'E';
        if (bool != true)
            method1699(true, '\uffac');
        if (c == 230)
            return 'e';
        if ((c ^ 0xffffffff) == -224)
            return 's';
        if ((c ^ 0xffffffff) == -339)
            return 'E';
        if (c == 339)
            return 'e';
        return '\0';
    }

    static {
        aIncommingOpcode_2386 = new IncommingOpcode(25, -1);
    }
}
