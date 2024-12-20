/* Class344 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class344 {
    private Class360 aClass360_4077 = new Class360();
    static int anInt4078;
    static int anInt4079;
    String aString4080;
    static int anInt4081;
    static Class208 aClass208_4082 = new Class208(0, 1);
    static int anInt4083;
    static int anInt4084;
    static int anInt4085;
    private Class288 aClass288_4086;
    private volatile int anInt4087;
    static int anInt4088;

    final void method3513(int i, Class346_Sub4 class346_sub4) {
        synchronized (aClass360_4077) {
            if (i != -1)
                aClass288_4086 = null;
            aClass360_4077.method3811(class346_sub4, 0);
            anInt4087++;
        }
        anInt4084++;
        if (aClass288_4086 != null) {
            synchronized (aClass288_4086) {
                aClass288_4086.notify();
            }
        }
    }

    final boolean method3514(byte i) {
        if (i > -58)
            return false;
        anInt4083++;
        if ((anInt4087 ^ 0xffffffff) != -1)
            return false;
        return true;
    }

    final void method3515(boolean bool, Interactable interactable) {
        ((Interactable) interactable).aBoolean8318 = bool;
        anInt4085++;
        synchronized (aClass360_4077) {
            aClass360_4077.method3811(interactable, 0);
            anInt4087++;
        }
        if (aClass288_4086 != null) {
            synchronized (aClass288_4086) {
                aClass288_4086.notify();
            }
        }
    }

    Class344(String string) {
        ((Class344) this).aString4080 = string;
    }

    final void method3516(Interactable interactable, byte i) {
        ((Interactable) interactable).aBoolean8318 = true;
        anInt4088++;
        int i_0_ = 0 % ((-31 - i) / 39);
        synchronized (aClass360_4077) {
            aClass360_4077.method3811(interactable, 0);
            anInt4087++;
        }
        if (aClass288_4086 != null) {
            synchronized (aClass288_4086) {
                aClass288_4086.notify();
            }
        }
    }

    final Class346 method3517(int i) {
        anInt4078++;
        Object object = null;
        int i_1_ = 14 % ((i - -15) / 50);
        Class346 class346;
        synchronized (aClass360_4077) {
            class346 = aClass360_4077.method3815((byte) 8);
            class346.method3538(-123);
            anInt4087--;
        }
        return class346;
    }

    public static void method3518(int i) {
        aClass208_4082 = null;
        if (i > -93)
            method3518(-11);
    }

    final void method3519(Class288 class288, boolean bool) {
        aClass288_4086 = class288;
        if (bool != true)
            anInt4087 = -34;
        anInt4081++;
    }

    static final boolean method3520(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, int i_7_, int i_8_) {
        anInt4079++;
        int i_9_ = (((Entity) Class347.myPlayer).posQueueX[0]);
        int i_10_ = (((Entity) Class347.myPlayer).posQueueY[0]);
        if ((i_9_ ^ 0xffffffff) > -1 || (i_9_ ^ 0xffffffff) <= (Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) || (i_10_ ^ 0xffffffff) > -1 || (i_10_ ^ 0xffffffff) <= (Node_Sub22.anInt7074 ^ 0xffffffff))
            return false;
        if (i_7_ < 0 || (i_7_ ^ 0xffffffff) <= (Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) || (i_2_ ^ 0xffffffff) > -1 || (Node_Sub22.anInt7074 ^ 0xffffffff) >= (i_2_ ^ 0xffffffff))
            return false;
        int i_11_ = (Node_Sub8_Sub18.method2144(i_4_, i_9_, (Class182.aClass164Array2114[((Interactable) Class347.myPlayer).plane]), i_10_, Class347.myPlayer.method3632(i_8_), Class115.anIntArray4954, bool, i_6_, i, 28002, i_2_, i_3_, Class193.anIntArray2218, i_7_, i_5_));
        if ((i_11_ ^ 0xffffffff) > -2)
            return false;
        Applet_Sub1.anInt44 = Class115.anIntArray4954[i_11_ + -1];
        Class72.anInt4876 = Class193.anIntArray2218[-1 + i_11_];
        Class381.aBoolean4681 = false;
        Class96.method704(false);
        return true;
    }
}
