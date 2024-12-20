/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class77 implements Runnable {
    static int anInt985;
    static int anInt986;
    private Class64 aClass64_987 = new Class64();
    static boolean[] aBooleanArray988;
    static int anInt989;
    static int anInt990;
    static int anInt991;
    static int anInt992;
    private Thread aThread993;
    private boolean aBoolean994 = false;
    static int anInt995;
    static int anInt996;
    int anInt997 = 0;
    static int anInt998 = 0;

    final Node_Sub8_Sub13_Sub2 method562(int i, Class209 class209, int i_0_, byte[] is) {
        anInt995++;
        Node_Sub8_Sub13_Sub2 class248_sub8_sub13_sub2 = new Node_Sub8_Sub13_Sub2();
        ((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).aByteArray10253 = is;
        ((Node_Sub8) class248_sub8_sub13_sub2).aLong6870 = (long) i;
        ((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).anInt10256 = 2;
        if (i_0_ != 1)
            ((Class77) this).anInt997 = -5;
        ((Node_Sub8_Sub13) class248_sub8_sub13_sub2).aBoolean9027 = false;
        ((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).aClass209_10254 = class209;
        method567(-127, class248_sub8_sub13_sub2);
        return class248_sub8_sub13_sub2;
    }

    static final Class136_Sub4_Sub1 method563(int i, int i_1_, int i_2_, boolean bool, int[] is, int i_3_, int i_4_, ha_Sub2 var_ha_Sub2) {
        if (i_2_ < 70)
            return null;
        anInt991++;
        if (((ha_Sub2) var_ha_Sub2).aBoolean5913 || (Class343.method3508(i_4_, -31218) && Class343.method3508(i, -31218)))
            return new Class136_Sub4_Sub1(var_ha_Sub2, 3553, i_4_, i, bool, is, i_1_, i_3_);
        if (((ha_Sub2) var_ha_Sub2).aBoolean5837)
            return new Class136_Sub4_Sub1(var_ha_Sub2, 34037, i_4_, i, bool, is, i_1_, i_3_);
        return new Class136_Sub4_Sub1(var_ha_Sub2, i_4_, i, Class136_Sub4.method1269(i_4_, (byte) -128), Class136_Sub4.method1269(i, (byte) -128), is);
    }

    final Node_Sub8_Sub13_Sub2 method564(Class209 class209, int i, int i_5_) {
        anInt986++;
        if (i != -3)
            aBooleanArray988 = null;
        Node_Sub8_Sub13_Sub2 class248_sub8_sub13_sub2 = new Node_Sub8_Sub13_Sub2();
        ((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).anInt10256 = 1;
        synchronized (aClass64_987) {
            for (Node_Sub8_Sub13_Sub2 class248_sub8_sub13_sub2_6_ = (Node_Sub8_Sub13_Sub2) aClass64_987.method492(896); class248_sub8_sub13_sub2_6_ != null; class248_sub8_sub13_sub2_6_ = ((Node_Sub8_Sub13_Sub2) aClass64_987.method490(true))) {
                if ((((long) i_5_ ^ 0xffffffffffffffffL) == ((((Node_Sub8) class248_sub8_sub13_sub2_6_).aLong6870) ^ 0xffffffffffffffffL)) && (((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2_6_).aClass209_10254 == class209) && ((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2_6_).anInt10256 == 2) {
                    ((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).aByteArray10253 = ((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2_6_).aByteArray10253;
                    ((Node_Sub8_Sub13) class248_sub8_sub13_sub2).aBoolean9024 = false;
                    return class248_sub8_sub13_sub2;
                }
            }
        }
        ((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).aByteArray10253 = class209.method1719(59, i_5_);
        ((Node_Sub8_Sub13) class248_sub8_sub13_sub2).aBoolean9027 = true;
        ((Node_Sub8_Sub13) class248_sub8_sub13_sub2).aBoolean9024 = false;
        return class248_sub8_sub13_sub2;
    }

    final void method565(int i) {
        aBoolean994 = true;
        anInt990++;
        synchronized (aClass64_987) {
            aClass64_987.notifyAll();
        }
        try {
            aThread993.join();
            int i_7_ = 38 / ((i - 11) / 37);
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
        aThread993 = null;
    }

    public static void method566(int i) {
        aBooleanArray988 = null;
        if (i <= 56)
            method563(62, 92, 11, true, null, 11, -110, null);
    }

    private final void method567(int i, Node_Sub8_Sub13_Sub2 class248_sub8_sub13_sub2) {
        synchronized (aClass64_987) {
            aClass64_987.method491(class248_sub8_sub13_sub2, -106);
            ((Class77) this).anInt997++;
            aClass64_987.notifyAll();
            int i_8_ = -115 % ((i - -84) / 42);
        }
        anInt992++;
    }

    public final void run() {
        anInt996++;
        while (!aBoolean994) {
            Node_Sub8_Sub13_Sub2 class248_sub8_sub13_sub2;
            synchronized (aClass64_987) {
                class248_sub8_sub13_sub2 = (Node_Sub8_Sub13_Sub2) aClass64_987.method497(896);
                if (class248_sub8_sub13_sub2 != null)
                    ((Class77) this).anInt997--;
                else {
                    try {
                        aClass64_987.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                    continue;
                }
            }
            try {
                if (((((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).anInt10256) ^ 0xffffffff) == -3)
                    ((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).aClass209_10254.method1714((((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).aByteArray10253).length, (((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).aByteArray10253), (int) (((Node_Sub8) class248_sub8_sub13_sub2).aLong6870), -27945);
                else if ((((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).anInt10256) == 3)
                    ((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).aByteArray10253 = (((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).aClass209_10254.method1719(123, (int) (((Node_Sub8) class248_sub8_sub13_sub2).aLong6870)));
            } catch (Exception exception) {
                Class282_Sub14.method2975(null, exception, 1);
            }
            ((Node_Sub8_Sub13) class248_sub8_sub13_sub2).aBoolean9024 = false;
        }
    }

    final Node_Sub8_Sub13_Sub2 method568(byte i, int i_9_, Class209 class209) {
        if (i != 127)
            return null;
        anInt989++;
        Node_Sub8_Sub13_Sub2 class248_sub8_sub13_sub2 = new Node_Sub8_Sub13_Sub2();
        ((Node_Sub8) class248_sub8_sub13_sub2).aLong6870 = (long) i_9_;
        ((Node_Sub8_Sub13) class248_sub8_sub13_sub2).aBoolean9027 = false;
        ((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).aClass209_10254 = class209;
        ((Node_Sub8_Sub13_Sub2) class248_sub8_sub13_sub2).anInt10256 = 3;
        method567(i + -18, class248_sub8_sub13_sub2);
        return class248_sub8_sub13_sub2;
    }

    Class77(Class174 class174) {
        Class322 class322 = class174.method1576(this, 5, 0);
        while ((class322.anInt3788 ^ 0xffffffff) == -1)
            Class279_Sub2.method2897((byte) -124, 10L);
        if ((class322.anInt3788 ^ 0xffffffff) == -3)
            throw new RuntimeException();
        aThread993 = (Thread) class322.anObject3787;
    }
}
