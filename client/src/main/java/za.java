/* za - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class za extends Node {
    static int anInt7484;
    static int anInt7485;
    static int anInt7486;
    static Class79 aClass79_7487 = new Class79("LIVE", 0);
    static int anInt7488;
    static int[] anIntArray7489 = new int[1000];
    static int anInt7490;
    static int anInt7491;

    static final Class method2685(String string, byte i) throws ClassNotFoundException {
        anInt7486++;
        if (string.equals("B"))
            return Byte.TYPE;
        if (string.equals("I"))
            return Integer.TYPE;
        if (string.equals("S"))
            return Short.TYPE;
        if (string.equals("J"))
            return Long.TYPE;
        if (string.equals("Z"))
            return Boolean.TYPE;
        if (i >= -119)
            return null;
        if (string.equals("F"))
            return Float.TYPE;
        if (string.equals("D"))
            return Double.TYPE;
        if (string.equals("C"))
            return Character.TYPE;
        return Class.forName(string);
    }

    public za() {
        /* empty */
    }

    public static void method2686(int i) {
        aClass79_7487 = null;
        if (i <= 96)
            method2688(-45, 101, -43, -19, 61, 87, -81, -27, -78, -126);
        anIntArray7489 = null;
    }

    static final void method2687(int i, int i_0_, String string, int i_1_, String string_2_, boolean bool, boolean bool_3_) {
        if (i_1_ < 87)
            anIntArray7489 = null;
        ((Class381) Class4.aClass381_137).anInt4675 = 1;
        anInt7485++;
        string_2_ = string_2_.toLowerCase();
        short[] is = new short[16];
        int i_4_ = -1;
        String string_5_ = null;
        if (i_0_ != -1) {
            Class210 class210 = Node_Sub20.aClass240_7045.method1923(-6119, i_0_);
            if (class210 == null || !bool == class210.method1721(2147483647))
                return;
            if (class210.method1721(2147483647))
                string_5_ = ((Class210) class210).aString2425;
            else
                i_4_ = ((Class210) class210).anInt2430;
        }
        int i_6_ = 0;
        for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > (((Class342) Class283.aClass342_3343).anInt4000 ^ 0xffffffff)); i_7_++) {
            Class321 class321 = Class283.aClass342_3343.method3482((byte) 78, i_7_);
            if ((!bool_3_ || ((Class321) class321).aBoolean3754) && (((Class321) class321).anInt3747 ^ 0xffffffff) == 0 && (((Class321) class321).anInt3775 ^ 0xffffffff) == 0 && (((Class321) class321).anInt3768 ^ 0xffffffff) == -1 && ((Class321) class321).aString3702.toLowerCase().indexOf(string_2_) != -1) {
                if (i_0_ != -1) {
                    if (bool) {
                        if (!string.equals(class321.method3338(string_5_, i_0_, 5)))
                            continue;
                    } else if (class321.method3341(i_4_, -1, i_0_) != i)
                        continue;
                }
                if (i_6_ >= 250) {
                    Class19.aShortArray305 = null;
                    Class346_Sub7_Sub2_Sub4.anInt10111 = -1;
                    return;
                }
                if (i_6_ >= is.length) {
                    short[] is_8_ = new short[is.length * 2];
                    for (int i_9_ = 0; i_6_ > i_9_; i_9_++)
                        is_8_[i_9_] = is[i_9_];
                    is = is_8_;
                }
                is[i_6_++] = (short) i_7_;
            }
        }
        Class19.aShortArray305 = is;
        Class346_Sub7_Sub2_Sub4.anInt10111 = i_6_;
        Node_Sub21.anInt7054 = 0;
        String[] strings = new String[Class346_Sub7_Sub2_Sub4.anInt10111];
        for (int i_10_ = 0; ((Class346_Sub7_Sub2_Sub4.anInt10111 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++)
            strings[i_10_] = (((Class321) Class283.aClass342_3343.method3482((byte) 101, is[i_10_])).aString3702);
        Class340_Sub9.method3469(strings, Class19.aShortArray305, -113);
        Class4.aClass381_137.method3912(0);
        ((Class381) Class4.aClass381_137).anInt4675 = 2;
    }

    static final void method2688(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
        if (i_15_ >= Class302.anInt3500 && Class289.anInt3399 >= i_15_ && i_14_ >= Class302.anInt3500 && (i_14_ ^ 0xffffffff) >= (Class289.anInt3399 ^ 0xffffffff) && (Class302.anInt3500 ^ 0xffffffff) >= (i_17_ ^ 0xffffffff) && (i_17_ ^ 0xffffffff) >= (Class289.anInt3399 ^ 0xffffffff) && (i_16_ ^ 0xffffffff) <= (Class302.anInt3500 ^ 0xffffffff) && (i_16_ ^ 0xffffffff) >= (Class289.anInt3399 ^ 0xffffffff) && Class181.anInt2099 <= i_18_ && (aa_Sub3.anInt5270 ^ 0xffffffff) <= (i_18_ ^ 0xffffffff) && (i_13_ ^ 0xffffffff) <= (Class181.anInt2099 ^ 0xffffffff) && (i_13_ ^ 0xffffffff) >= (aa_Sub3.anInt5270 ^ 0xffffffff) && (i ^ 0xffffffff) <= (Class181.anInt2099 ^ 0xffffffff) && aa_Sub3.anInt5270 >= i && Class181.anInt2099 <= i_12_ && i_12_ <= aa_Sub3.anInt5270)
            Class184.method1619(i_16_, i_14_, -4, i_13_, i_19_, i_15_, i_12_, i_17_, i_18_, i);
        else
            Node_Sub14_Sub7.method2294(i_12_, i_13_, i_18_, i_17_, i_14_, i_19_, i_16_, i_15_, (byte) 100, i);
        anInt7488++;
        if (i_11_ != 7000)
            method2688(-54, -27, -65, -106, -66, 74, 8, -117, 60, -33);
    }
}
