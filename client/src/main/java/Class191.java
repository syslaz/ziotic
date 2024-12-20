/* Class191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class191 implements Interface7 {
    static int anInt4822 = 0;
    static int anInt4823;
    static int anInt4824;

    static final void method1647(byte i) {
        if (i == 70) {
            anInt4824++;
            if (Class282_Sub11.aClass74_7702 != null)
                Class282_Sub11.aClass74_7702.method548(1);
            if (Node_Sub29.aThread7170 != null) {
                for (; ; ) {
                    try {
                        Node_Sub29.aThread7170.join();
                        break;
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
        }
    }

    public final String method29(int[] is, long l, int i, Class168 class168) {
        anInt4823++;
        if (class168 == Class279_Sub1_Sub1.aClass168_9812) {
            Class218 class218 = Class346_Sub7_Sub1_Sub2.aClass259_10206.method2758(is[0], (byte) -127);
            return class218.method1750(-128, (int) l);
        }
        if (i != -7751)
            anInt4822 = -78;
        if (class168 == Class181.aClass168_2098 || Class223.aClass168_5169 == class168) {
            Class321 class321 = Class283.aClass342_3343.method3482((byte) 106, (int) l);
            return ((Class321) class321).aString3702;
        }
        if (class168 == Class168.aClass168_1971 || Class87.aClass168_1084 == class168 || class168 == Node_Sub14_Sub35.aClass168_9537)
            return Class346_Sub7_Sub1_Sub2.aClass259_10206.method2758(is[0], (byte) -93).method1750(-125, (int) l);
        return null;
    }

    public Class191() {
        /* empty */
    }
}
