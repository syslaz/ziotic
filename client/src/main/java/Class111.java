/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

abstract class Class111 {
    static int anInt1387;
    static int anInt1388;
    static int anInt1389;
    static IncommingOpcode aIncommingOpcode_1390 = new IncommingOpcode(84, 4);
    static int anInt1391;
    /*synthetic*/ static Class aClass1392;

    public static void method771(byte i) {
        int i_0_ = 19 % ((i - 41) / 47);
        aIncommingOpcode_1390 = null;
    }

    abstract boolean method772(int i, int i_1_) throws IOException;

    static final void method773(int i, boolean bool) {
        anInt1391++;
        if (bool) {
            if ((Class179.anInt2084 ^ 0xffffffff) != 0)
                Class136_Sub2.method1257(-19, Class179.anInt2084);
            for (Node_Sub12 class248_sub12 = (Node_Sub12) Class109.aClass65_1375.method510(true); class248_sub12 != null; class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method512(false))) {
                if (!class248_sub12.hasNext((byte) 78)) {
                    class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method510(true));
                    if (class248_sub12 == null)
                        break;
                }
                Class106.method749(false, false, true, class248_sub12);
            }
            Class179.anInt2084 = -1;
            Class109.aClass65_1375 = new Class65(8);
            Class172.method1559((byte) 44);
            Class179.anInt2084 = Class279_Sub2.anInt7587;
            Node_Sub14_Sub38.method2392(false, -84);
            Class60.method472(-101);
            Class47.method344(Class179.anInt2084);
        }
        Class337.aBoolean3934 = false;
        Class212.aString2453 = Node_Sub8.aString6862 = "";
        Class349_Sub2.method3739(0);
        Class136_Sub4.anInt8413 = -1;
        int i_2_ = 12 / ((i - 30) / 60);
        Node_Sub29.method2558((byte) -108, Node_Sub8_Sub20.anInt9102);
        Class347.myPlayer = new Player();
        ((Entity) Class347.myPlayer).posQueueX[0] = Node_Sub8_Sub4.anInt8360 / 2;
        ((Interactable) Class347.myPlayer).x = Node_Sub8_Sub4.anInt8360 * 512 / 2;
        ((Interactable) Class347.myPlayer).y = Node_Sub22.anInt7074 * 512 / 2;
        Class346_Sub7_Sub1.cameraPosX = Class316_Sub1_Sub2.cameraPosZ = 0;
        ((Entity) Class347.myPlayer).posQueueY[0] = Node_Sub22.anInt7074 / 2;
        if (Node_Sub45.anInt7343 == 2) {
            Class316_Sub1_Sub2.cameraPosZ = Class346_Sub5.anInt8283 << -1476389879;
            Class346_Sub7_Sub1.cameraPosX = Class301.anInt4931 << -15000151;
        } else
            Class158.method1397(2);
        Class332.method3400(1);
    }

    abstract void method774(int i);

    abstract void method775(int i, byte[] is, int i_3_, int i_4_) throws IOException;

    static final boolean method776(int i, String string) {
        anInt1389++;
        int i_5_ = 96 / ((i - 4) / 52);
        return (Node_Sub8_Sub13_Sub1.method2099(492219900, aClass1392 != null ? aClass1392 : (aClass1392 = method781("Class176")), string));
    }

    static final byte[] method777(int i, byte[] is) {
        anInt1388++;
        int i_6_ = is.length;
        byte[] is_7_ = new byte[i_6_];
        if (i > -106)
            method778((byte) -24);
        Class159.method1402(is, 0, is_7_, 0, i_6_);
        return is_7_;
    }

    static final void method778(byte i) {
        Node_Sub14_Sub12.anInt9268 = 0;
        anInt1387++;
        int i_8_ = (Class67.baseX + (((Interactable) Class347.myPlayer).x >> 537249545));
        int i_9_ = (((((Interactable) Class347.myPlayer).y) >> 1386849609) - -Class368.baseY);
        if (i_8_ >= 3053 && (i_8_ ^ 0xffffffff) >= -3157 && i_9_ >= 3056 && (i_9_ ^ 0xffffffff) >= -3137)
            Node_Sub14_Sub12.anInt9268 = 1;
        if (i != 88)
            method777(53, null);
        if ((i_8_ ^ 0xffffffff) <= -3073 && (i_8_ ^ 0xffffffff) >= -3119 && i_9_ >= 9492 && i_9_ <= 9535)
            Node_Sub14_Sub12.anInt9268 = 1;
        if ((Node_Sub14_Sub12.anInt9268 ^ 0xffffffff) == -2 && i_8_ >= 3139 && (i_8_ ^ 0xffffffff) >= -3200 && i_9_ >= 3008 && i_9_ <= 3062)
            Node_Sub14_Sub12.anInt9268 = 0;
    }

    abstract void method779(int i);

    public Class111() {
        /* empty */
    }

    abstract int method780(byte[] is, int i, int i_10_, int i_11_) throws IOException;

    /*synthetic*/
    static Class method781(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
