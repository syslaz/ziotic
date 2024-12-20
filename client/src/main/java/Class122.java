/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class122 {
    int[] anIntArray1516;
    static Class58 aClass58_1517 = new Class58("", 16);
    short[] aShortArray1518;
    static Class381 aClass381_1519;
    short[] aShortArray1520;
    static int anInt1521;
    static int anInt1522;
    static int anInt1523;
    static Class229[][] aClass229ArrayArray1524;
    long aLong1525;

    static final int method1129(int i, byte i_0_) {
        if (i_0_ >= -64)
            return 23;
        anInt1523++;
        if ((i ^ 0xffffffff) == -6407)
            return 1;
        if (i == 6409)
            return 1;
        if ((i ^ 0xffffffff) != -32842) {
            if (i == 6410)
                return 2;
            if ((i ^ 0xffffffff) == -6408)
                return 3;
            if (i == 6408)
                return 4;
        } else
            return 1;
        throw new IllegalArgumentException("");
    }

    public static void method1130(int i) {
        aClass229ArrayArray1524 = null;
        aClass58_1517 = null;
        if (i != 0)
            aClass58_1517 = null;
        aClass381_1519 = null;
    }

    static final void method1131(int i, RSInterface2[] class354s, int i_1_) {
        anInt1522++;
        for (int i_2_ = 0; class354s.length > i_2_; i_2_++) {
            RSInterface2 class354 = class354s[i_2_];
            if (class354 != null) {
                if ((((RSInterface2) class354).anInt4284 ^ 0xffffffff) == -1) {
                    if (((RSInterface2) class354).aClass354Array4285 != null)
                        method1131(i, ((RSInterface2) class354).aClass354Array4285, i_1_);
                    Node_Sub12 class248_sub12 = ((Node_Sub12) (Class109.aClass65_1375.method501((long) ((RSInterface2) class354).interfaceValues, (byte) 31)));
                    if (class248_sub12 != null)
                        Class293.method3116(i_1_, (((Node_Sub12) class248_sub12).anInt6964), (byte) -89);
                }
                if (i_1_ == 0 && ((RSInterface2) class354).anObjectArray4229 != null) {
                    RSInterface class248_sub6 = new RSInterface();
                    ((RSInterface) class248_sub6).rsInter = class354;
                    ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4229;
                    Class47.executeScript(class248_sub6);
                }
                if (i_1_ == 1 && ((RSInterface2) class354).anObjectArray4265 != null) {
                    if ((((RSInterface2) class354).index ^ 0xffffffff) <= -1) {
                        RSInterface2 class354_3_ = Class276.method2853(65535, (((RSInterface2) class354).interfaceValues));
                        if (class354_3_ == null || (((RSInterface2) class354_3_).aClass354Array4285 == null) || (((((RSInterface2) class354_3_).aClass354Array4285).length ^ 0xffffffff) >= (((RSInterface2) class354).index ^ 0xffffffff)) || (((RSInterface2) class354_3_).aClass354Array4285[((RSInterface2) class354).index]) != class354)
                            continue;
                    }
                    RSInterface class248_sub6 = new RSInterface();
                    ((RSInterface) class248_sub6).rsInter = class354;
                    ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4265;
                    Class47.executeScript(class248_sub6);
                }
            }
        }
        if (i != 6409)
            aClass229ArrayArray1524 = null;
    }

    Class122(long l, int[] is, short[] is_4_, short[] is_5_) {
        ((Class122) this).aShortArray1520 = is_5_;
        ((Class122) this).aShortArray1518 = is_4_;
        ((Class122) this).aLong1525 = l;
        ((Class122) this).anIntArray1516 = is;
    }

    protected Class122() {
        /* empty */
    }
}
