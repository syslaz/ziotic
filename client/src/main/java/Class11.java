/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11 {
    static int anInt237;
    static int anInt238;
    static int anInt239;
    private Class278 aClass278_240 = new Class278(16);
    static int anInt241;
    static int anInt242;
    static IncommingOpcode aIncommingOpcode_243 = new IncommingOpcode(30, -1);
    static int anInt244;
    private Class381 aClass381_245;
    static int anInt246;
    static int[] anIntArray247;

    static final boolean method201(int i) {
        anInt242++;
        if (i != -1)
            return false;
        if ((Class332.anInt3883 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    final void method202(int i, int i_0_) {
        synchronized (aClass278_240) {
            if (i_0_ != -1)
                return;
            aClass278_240.method2864(i, i_0_ + -15781);
        }
        anInt239++;
    }

    static final void method203(byte i) {
        synchronized (Node_Sub14_Sub2.aClass278_9175) {
            if (i != 17)
                anIntArray247 = null;
            Node_Sub14_Sub2.aClass278_9175.method2869(i + -17);
        }
        anInt241++;
        synchronized (Node_Sub14_Sub15.aClass278_9325) {
            Node_Sub14_Sub15.aClass278_9325.method2869(0);
        }
    }

    final Class184 method204(int i, int i_1_) {
        anInt237++;
        Class184 class184;
        synchronized (aClass278_240) {
            class184 = (Class184) aClass278_240.method2863(i + -4, (long) i_1_);
        }
        if (class184 != null)
            return class184;
        byte[] is;
        synchronized (aClass381_245) {
            is = aClass381_245.method3922((byte) 109, 30, i_1_);
        }
        class184 = new Class184();
        if (is != null)
            class184.method1617(new ByteStream(is), i + -9);
        if (i != 8)
            anIntArray247 = null;
        synchronized (aClass278_240) {
            aClass278_240.method2867((byte) 0, (long) i_1_, class184);
        }
        return class184;
    }

    final void method205(byte i) {
        synchronized (aClass278_240) {
            aClass278_240.method2869(0);
            if (i >= -50)
                method202(54, -117);
        }
        anInt246++;
    }

    final void method206(byte i) {
        anInt238++;
        synchronized (aClass278_240) {
            if (i != 109)
                aIncommingOpcode_243 = null;
            aClass278_240.method2872((byte) -78);
        }
    }

    Class11(Class215 class215, int i, Class381 class381) {
        aClass381_245 = class381;
        aClass381_245.method3899(30, 0);
    }

    public static void method207(int i) {
        if (i != -15046)
            aIncommingOpcode_243 = null;
        aIncommingOpcode_243 = null;
        anIntArray247 = null;
    }

    static final void method208(int i, String string, byte i_2_, boolean bool) {
        anInt244++;
        Class191.method1647((byte) 70);
        Class192.method1649((byte) 46);
        Class353.method3756(-121);
        Class219.method1753(bool, string, i, (byte) -119);
        Class189.method1640(102);
        Node_Sub39.method2603(0, Class287.aHa3381);
        Class307.method3226((byte) -93, Class287.aHa3381);
        Class349_Sub2.method3740(9749, Class290.aClass381_3417, Class287.aHa3381);
        Node_Sub1.method1974(5123);
        aa_Sub3.method165(Node_Sub14_Sub13.aClass129Array9290, -104);
        Class60.method472(-101);
        Node_Sub20.method2521((byte) 81);
        if ((Class273.anInt5008 ^ 0xffffffff) != -4) {
            if (Class273.anInt5008 != 7) {
                if ((Class273.anInt5008 ^ 0xffffffff) == -11)
                    Node_Sub14_Sub15.method2318(11, i_2_ ^ 0x5222);
                else if ((Class273.anInt5008 ^ 0xffffffff) == -2 || Class273.anInt5008 == 2)
                    Node_Sub39.method2602(-4);
            } else
                Node_Sub14_Sub15.method2318(8, -21035);
        } else
            Node_Sub14_Sub15.method2318(4, -21035);
        if (i_2_ != -9)
            anIntArray247 = null;
    }
}
