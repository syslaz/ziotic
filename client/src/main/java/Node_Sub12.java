/* Class248_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub12 extends Node {
    static int[][] anIntArrayArray6958 = new int[128][128];
    static float[] aFloatArray6959 = new float[4];
    int anInt6960;
    static int anInt6961;
    static int anInt6962;
    static Class65 aClass65_6963 = new Class65(8);
    int anInt6964;
    static Interactable[] aInteractableArray6965;

    static final String method2256(int i, String string, char c, String string_0_) {
        anInt6962++;
        int i_1_ = string.length();
        int i_2_ = 74 / ((-64 - i) / 40);
        int i_3_ = string_0_.length();
        int i_4_ = i_1_;
        int i_5_ = i_3_ - 1;
        if ((i_5_ ^ 0xffffffff) != -1) {
            int i_6_ = 0;
            for (; ; ) {
                i_6_ = string.indexOf(c, i_6_);
                if (i_6_ < 0)
                    break;
                i_6_++;
                i_4_ += i_5_;
            }
        }
        StringBuffer stringbuffer = new StringBuffer(i_4_);
        int i_7_ = 0;
        for (; ; ) {
            int i_8_ = string.indexOf(c, i_7_);
            if ((i_8_ ^ 0xffffffff) > -1)
                break;
            stringbuffer.append(string.substring(i_7_, i_8_));
            i_7_ = 1 + i_8_;
            stringbuffer.append(string_0_);
        }
        stringbuffer.append(string.substring(i_7_));
        return stringbuffer.toString();
    }

    public static void method2257(int i) {
        aFloatArray6959 = null;
        aClass65_6963 = null;
        if (i < -116) {
            aInteractableArray6965 = null;
            anIntArrayArray6958 = null;
        }
    }

    static final void method2258(boolean bool) {
        anInt6961++;
        Class67.aClass354Array898 = null;
        if (Node_Sub8_Sub6.aBoolean8949 && Class346_Sub7_Sub3.method3672((byte) -112) != 1)
            Node_Sub8_Sub9.method2074(0, (((Class273.anInt5008 ^ 0xffffffff) == -4) || (Class273.anInt5008 ^ 0xffffffff) == -8), 0, -124, Class102.method722(bool), Class370.method3854(-2));
        int i = 0;
        if (bool == false) {
            int i_9_ = 0;
            if (Node_Sub8_Sub6.aBoolean8949) {
                i = Class337.method3420(-2);
                i_9_ = RSInterface2.method3770((byte) -118);
            }
            Class310_Sub1.method3257(i, Class179.anInt2084, i_9_, 50, i_9_, i + Class146.anInt1724, i, -1, i_9_ + Class282_Sub20.anInt7800);
            if (Class67.aClass354Array898 != null) {
                Class225.method1787(i_9_ - -Class282_Sub20.anInt7800, Node_Sub8_Sub8.anInt8964, i_9_, Class239.anInt2675, true, Class67.aClass354Array898, 99, -1412584499, i, (((RSInterface2) Class312.aClass354_3637).anInt4339), Class146.anInt1724 + i);
                Class67.aClass354Array898 = null;
            }
        }
    }

    public Node_Sub12() {
        /* empty */
    }
}
