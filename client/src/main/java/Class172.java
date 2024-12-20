/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class172 {
    static int anInt1989;
    Class381 aClass381_1990;
    static int anInt1991;
    static int anInt1992;
    static int anInt1993;
    static int anInt1994;
    private Class381 aClass381_1995;
    static int[] anIntArray1996 = new int[128];
    static boolean aBoolean1997;
    static int anInt1998;
    private Class278 aClass278_1999 = new Class278(64);
    static OutgoingOpcode aOutgoingOpcode_2000;
    static int anInt2001;
    static Class381 aClass381_2002;

    final Class265 method1553(int i, int i_0_) {
        anInt1993++;
        Class265 class265;
        synchronized (aClass278_1999) {
            class265 = (Class265) aClass278_1999.method2863(4, (long) i_0_);
        }
        if (class265 != null)
            return class265;
        byte[] is;
        synchronized (aClass381_1995) {
            is = aClass381_1995.method3922((byte) 121, 3, i_0_);
        }
        class265 = new Class265();
        ((Class265) class265).aClass172_3010 = this;
        if (is != null)
            class265.method2779(new ByteStream(is), i + -1646);
        synchronized (aClass278_1999) {
            if (i != 1645)
                return null;
            aClass278_1999.method2867((byte) 0, (long) i_0_, class265);
        }
        return class265;
    }

    final void method1554(byte i) {
        if (i != -69)
            method1559((byte) -94);
        anInt1991++;
        synchronized (aClass278_1999) {
            aClass278_1999.method2872((byte) -78);
        }
    }

    final void method1555(int i) {
        anInt1992++;
        synchronized (aClass278_1999) {
            aClass278_1999.method2869(0);
        }
        if (i != -16976)
            ((Class172) this).aClass381_1990 = null;
    }

    public static void method1556(int i) {
        if (i <= 10)
            method1559((byte) 102);
        anIntArray1996 = null;
        aClass381_2002 = null;
        aOutgoingOpcode_2000 = null;
    }

    static final void method1557(int i, int i_1_, int i_2_, byte i_3_) {
        if (i_3_ != 28)
            aBoolean1997 = true;
        anInt1989++;
        int i_4_ = Class67.baseX + i;
        int i_5_ = Class368.baseY + i_2_;
        if (Class311.aClass137ArrayArrayArray3620 != null && (i ^ 0xffffffff) <= -1 && i_2_ >= 0 && i < Node_Sub8_Sub4.anInt8360 && (i_2_ ^ 0xffffffff) > (Node_Sub22.anInt7074 ^ 0xffffffff) && ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335.method2961(true) ^ 0xffffffff) != -1 || i_1_ == (((Interactable) Class347.myPlayer).plane))) {
            long l = (long) (i_4_ | (i_1_ << 72002620 | i_5_ << -598761266));
            Node_Sub13 class248_sub13 = ((Node_Sub13) Class346_Sub7_Sub5.aClass65_9959.method501(l, (byte) 31));
            if (class248_sub13 == null)
                Class346_Sub5_Sub1.method3548(i_1_, i, i_2_);
            else {
                Node_Sub28 class248_sub28 = (Node_Sub28) ((Node_Sub13) class248_sub13).aClass293_6966.method3119(2);
                if (class248_sub28 == null)
                    Class346_Sub5_Sub1.method3548(i_1_, i, i_2_);
                else {
                    Class346_Sub7_Sub3_Sub1 class346_sub7_sub3_sub1 = ((Class346_Sub7_Sub3_Sub1) Class346_Sub5_Sub1.method3548(i_1_, i, i_2_));
                    if (class346_sub7_sub3_sub1 != null)
                        ((Class346_Sub7_Sub3_Sub1) class346_sub7_sub3_sub1).anInt10519 = ((Class346_Sub7_Sub3_Sub1) class346_sub7_sub3_sub1).anInt10518 = -1;
                    else
                        class346_sub7_sub3_sub1 = (new Class346_Sub7_Sub3_Sub1(i << -1010852951, Class177.aSArray2070[i_1_].method3145(i, 76, i_2_), i_2_ << 2011916169, i_1_, i_1_));
                    ((Class346_Sub7_Sub3_Sub1) class346_sub7_sub3_sub1).anInt10514 = ((Node_Sub28) class248_sub28).anInt7161;
                    ((Class346_Sub7_Sub3_Sub1) class346_sub7_sub3_sub1).anInt10520 = ((Node_Sub28) class248_sub28).anInt7164;
                    while_127_:
                    do {
                        Node_Sub28 class248_sub28_6_;
                        do {
                            class248_sub28_6_ = ((Node_Sub28) ((Node_Sub13) class248_sub13).aClass293_6966.method3107(-127));
                            if (class248_sub28_6_ == null)
                                break while_127_;
                        }
                        while ((((Class346_Sub7_Sub3_Sub1) class346_sub7_sub3_sub1).anInt10520 ^ 0xffffffff) == ((((Node_Sub28) class248_sub28_6_).anInt7164) ^ 0xffffffff));
                        ((Class346_Sub7_Sub3_Sub1) class346_sub7_sub3_sub1).anInt10524 = ((Node_Sub28) class248_sub28_6_).anInt7161;
                        ((Class346_Sub7_Sub3_Sub1) class346_sub7_sub3_sub1).anInt10519 = ((Node_Sub28) class248_sub28_6_).anInt7164;
                        for (; ; ) {
                            Node_Sub28 class248_sub28_7_ = ((Node_Sub28) ((Node_Sub13) class248_sub13).aClass293_6966.method3107(-127));
                            if (class248_sub28_7_ == null)
                                break;
                            if ((((Class346_Sub7_Sub3_Sub1) class346_sub7_sub3_sub1).anInt10520 != (((Node_Sub28) class248_sub28_7_).anInt7164)) && (((((Node_Sub28) class248_sub28_7_).anInt7164) ^ 0xffffffff) != (((Class346_Sub7_Sub3_Sub1) class346_sub7_sub3_sub1).anInt10519 ^ 0xffffffff))) {
                                ((Class346_Sub7_Sub3_Sub1) class346_sub7_sub3_sub1).anInt10518 = (((Node_Sub28) class248_sub28_7_).anInt7164);
                                ((Class346_Sub7_Sub3_Sub1) class346_sub7_sub3_sub1).anInt10522 = (((Node_Sub28) class248_sub28_7_).anInt7161);
                            }
                        }
                    } while (false);
                    int i_8_ = Class353.method3753(256 + (i_2_ << 478158985), (i << 88481481) + 256, 36, i_1_);
                    ((Interactable) class346_sub7_sub3_sub1).anInt8317 = i_8_;
                    ((Interactable) class346_sub7_sub3_sub1).y = i_2_ << -641765463;
                    ((Interactable) class346_sub7_sub3_sub1).x = i << -832982519;
                    ((Class346_Sub7_Sub3_Sub1) class346_sub7_sub3_sub1).anInt10521 = 0;
                    ((Interactable) class346_sub7_sub3_sub1).aByte8322 = (byte) i_1_;
                    ((Interactable) class346_sub7_sub3_sub1).plane = (byte) i_1_;
                    if (Class209.method1717(-10387, i, i_2_))
                        ((Interactable) class346_sub7_sub3_sub1).aByte8322++;
                    Class167.method1541(i_1_, i, i_2_, i_8_, class346_sub7_sub3_sub1);
                }
            }
        }
    }

    final void method1558(int i, int i_9_) {
        anInt1994++;
        synchronized (aClass278_1999) {
            if (i != 122) {
                /* empty */
            } else
                aClass278_1999.method2864(i_9_, -15782);
        }
    }

    static final void method1559(byte i) {
        anInt1998++;
        Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290 = new RSInterface2[Class346_Sub2.aClass381_8257.method3902(0)][];
        Node_Sub46.aClass354ArrayArray7379 = new RSInterface2[Class346_Sub2.aClass381_8257.method3902(0)][];
        if (i <= 36)
            aClass381_2002 = null;
        Class77.aBooleanArray988 = new boolean[Class346_Sub2.aClass381_8257.method3902(0)];
    }

    Class172(Class215 class215, int i, Class381 class381, Class381 class381_10_) {
        ((Class172) this).aClass381_1990 = class381_10_;
        aClass381_1995 = class381;
        aClass381_1995.method3899(3, 0);
    }

    static {
        for (int i = 0; (anIntArray1996.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
            anIntArray1996[i] = -1;
        for (int i = 65; i <= 90; i++)
            anIntArray1996[i] = -65 + i;
        for (int i = 97; i <= 122; i++)
            anIntArray1996[i] = -97 + (i - -26);
        for (int i = 48; (i ^ 0xffffffff) >= -58; i++)
            anIntArray1996[i] = 52 + i + -48;
        anIntArray1996[42] = anIntArray1996[43] = 62;
        anIntArray1996[45] = anIntArray1996[47] = 63;
        aOutgoingOpcode_2000 = new OutgoingOpcode(21, 7);
        anInt2001 = -1;
    }
}
