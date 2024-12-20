/* Class360 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class360 {
    static int anInt4438;
    static int anInt4439;
    static int anInt4440;
    static int anInt4441;
    static int anInt4442;
    private Class346 aClass346_4443 = new Class346();
    static int anInt4444;
    static int anInt4445;
    static int anInt4446;
    static byte[][] aByteArrayArray4447;
    private Class346 aClass346_4448;
    static int anInt4449;

    final int method3807(byte i) {
        anInt4449++;
        int i_0_ = 0;
        if (i != 4)
            method3812(true);
        for (Class346 class346 = ((Class346) aClass346_4443).aClass346_4121; class346 != aClass346_4443; class346 = ((Class346) class346).aClass346_4121)
            i_0_++;
        return i_0_;
    }

    public static void method3808(byte i) {
        if (i == 116)
            aByteArrayArray4447 = null;
    }

    final Class346 method3809(int i) {
        anInt4438++;
        Class346 class346 = aClass346_4448;
        if (class346 == aClass346_4443) {
            aClass346_4448 = null;
            return null;
        }
        if (i != -24951)
            method3807((byte) 25);
        aClass346_4448 = ((Class346) class346).aClass346_4121;
        return class346;
    }

    final Class346 method3810(boolean bool) {
        anInt4441++;
        Class346 class346 = ((Class346) aClass346_4443).aClass346_4125;
        if (bool != true)
            method3814(true);
        if (aClass346_4443 == class346) {
            aClass346_4448 = null;
            return null;
        }
        aClass346_4448 = ((Class346) class346).aClass346_4125;
        return class346;
    }

    final void method3811(Class346 class346, int i) {
        if (((Class346) class346).aClass346_4125 != null)
            class346.method3538(-127);
        anInt4439++;
        ((Class346) class346).aClass346_4121 = aClass346_4443;
        if (i != 0)
            aByteArrayArray4447 = null;
        ((Class346) class346).aClass346_4125 = ((Class346) aClass346_4443).aClass346_4125;
        ((Class346) ((Class346) class346).aClass346_4125).aClass346_4121 = class346;
        ((Class346) ((Class346) class346).aClass346_4121).aClass346_4125 = class346;
    }

    final boolean method3812(boolean bool) {
        if (bool != false)
            anInt4446 = 116;
        anInt4444++;
        if (((Class346) aClass346_4443).aClass346_4121 != aClass346_4443)
            return false;
        return true;
    }

    final void method3813(int i) {
        anInt4440++;
        for (; ; ) {
            Class346 class346 = ((Class346) aClass346_4443).aClass346_4121;
            if (class346 == aClass346_4443)
                break;
            class346.method3538(-120);
        }
        if (i != 0)
            method3811(null, -69);
        aClass346_4448 = null;
    }

    final Class346 method3814(boolean bool) {
        anInt4442++;
        if (bool != false)
            method3815((byte) -18);
        Class346 class346 = ((Class346) aClass346_4443).aClass346_4121;
        if (class346 == aClass346_4443)
            return null;
        class346.method3538(-123);
        return class346;
    }

    final Class346 method3815(byte i) {
        anInt4445++;
        if (i < 2)
            return null;
        Class346 class346 = ((Class346) aClass346_4443).aClass346_4121;
        if (aClass346_4443 == class346) {
            aClass346_4448 = null;
            return null;
        }
        aClass346_4448 = ((Class346) class346).aClass346_4121;
        return class346;
    }

    public Class360() {
        ((Class346) aClass346_4443).aClass346_4121 = aClass346_4443;
        ((Class346) aClass346_4443).aClass346_4125 = aClass346_4443;
    }
}
