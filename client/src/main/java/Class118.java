/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class118 {
    static int anInt1480;
    static int anInt1481;
    static int anInt1482 = 0;
    static Class128 aClass128_1483;
    static boolean aBoolean1484 = false;

    static final void method1110(int i, String[] strings) {
        anInt1480++;
        if (i >= 108) {
            if (strings.length <= 1) {
                aa.aString104 += (String) strings[0];
                Node_Sub19.anInt7040 += strings[0].length();
            } else {
                for (int i_0_ = 0; i_0_ < strings.length; i_0_++) {
                    if (!strings[i_0_].startsWith("pause")) {
                        aa.aString104 = strings[i_0_];
                        IncommingOpcode.method1106(1354797057, false);
                    } else {
                        int i_1_ = 5;
                        try {
                            i_1_ = Integer.parseInt(strings[i_0_].substring(6));
                        } catch (Exception exception) {
                            /* empty */
                        }
                        Class106.method750(("Pausing for " + i_1_ + " seconds..."), (byte) 125);
                        Class188.aStringArray2190 = strings;
                        Class131.anInt1603 = i_0_ - -1;
                        Node_Sub14_Sub5.aLong9205 = (long) (i_1_ * 1000) + method1112(116);
                        break;
                    }
                }
            }
        }
    }

    public static void method1111(int i) {
        aClass128_1483 = null;
        if (i != 20079)
            aBoolean1484 = true;
    }

    static final synchronized long method1112(int i) {
        anInt1481++;
        if (i != 116)
            method1111(109);
        long l = System.currentTimeMillis();
        if (l < Node_Sub14_Sub1.aLong9169)
            Class186.aLong2166 += -l + Node_Sub14_Sub1.aLong9169;
        Node_Sub14_Sub1.aLong9169 = l;
        return Class186.aLong2166 + l;
    }

    static {
        aClass128_1483 = new Class128(6, 2);
    }
}
