/* Class357 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class357 {
    static int anInt4406;
    static int anInt4407;
    private int anInt4408;
    static int anInt4409;
    static int anInt4410;
    static IncommingOpcode aIncommingOpcode_4411;
    static int anInt4412;
    static int anInt4413;
    static int anInt4414;
    static char[] aCharArray4415 = {'\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178'};
    static boolean aBoolean4416;
    static int[] anIntArray4417;

    public static void method3791(int i) {
        anIntArray4417 = null;
        if (i == 8218) {
            aIncommingOpcode_4411 = null;
            aCharArray4415 = null;
        }
    }

    static final String method3792(int i, int[] is) {
        anInt4413++;
        StringBuffer stringbuffer = new StringBuffer();
        int i_0_ = Class46.anInt599;
        for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
            Class198 class198 = Class276.aClass307_3208.method3230(35, is[i_1_]);
            if ((((Class198) class198).anInt2257 ^ 0xffffffff) != 0) {
                Class129 class129 = ((Class129) (Node_Sub13.aClass278_6972.method2863(i + -22, (long) ((Class198) class198).anInt2257)));
                if (class129 == null) {
                    Class157 class157 = Class157.method1379(Class290.aClass381_3417, ((Class198) class198).anInt2257, 0);
                    if (class157 != null) {
                        class129 = Class287.aHa3381.a(class157, true);
                        Node_Sub13.aClass278_6972.method2867((byte) 0, (long) ((Class198) class198).anInt2257, class129);
                    }
                }
                if (class129 != null) {
                    Node_Sub14_Sub11.aClass129Array9254[i_0_] = class129;
                    stringbuffer.append(" <img=").append(i_0_).append(">");
                    i_0_++;
                }
            }
        }
        if (i != 26)
            aIncommingOpcode_4411 = null;
        return stringbuffer.toString();
    }

    static final Node_Sub15_Sub1 method3793(int i) {
        anInt4407++;
        if (i != 352)
            anInt4410 = -99;
        return Class161.aClass248_Sub15_Sub1_1895;
    }

    Class357(ha_Sub2 var_ha_Sub2, int i) {
        anInt4408 = OpenGL.glGenLists(i);
    }

    final void method3794(int i, int i_2_) {
        anInt4412++;
        OpenGL.glNewList(i_2_ + anInt4408, 4864);
        if (i > -84)
            method3793(82);
    }

    final void method3795(byte i, char c) {
        OpenGL.glCallList(anInt4408 + c);
        anInt4409++;
        if (i <= 40)
            method3796(-44, 123, -127);
    }

    static final void method3796(int i, int i_3_, int i_4_) {
        anInt4406++;
        int i_5_ = (Class264.aClass285_2996.method3068(i_3_ + -5967, Class41.aClass41_490.method301(Class191.anInt4822, (byte) -108)));
        int i_6_;
        if (!Class342.aBoolean4008) {
            for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3119(2)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3107(i_3_ ^ ~0x1731))) {
                int i_7_ = Class284.method3061(-74, class248_sub8_sub11);
                if (i_7_ > i_5_)
                    i_5_ = i_7_;
            }
            Class198.anInt2264 = (!Class240.aBoolean2682 ? 22 : 26) + Class379.anInt4638 * 16;
            i_6_ = Class379.anInt4638 * 16 + 21;
            i_5_ += 8;
        } else {
            for (Node_Sub8_Sub5 class248_sub8_sub5 = ((Node_Sub8_Sub5) Class363.aClass64_4478.method492(896)); class248_sub8_sub5 != null; class248_sub8_sub5 = ((Node_Sub8_Sub5) Class363.aClass64_4478.method490(true))) {
                int i_8_;
                if ((((Node_Sub8_Sub5) class248_sub8_sub5).anInt8937 ^ 0xffffffff) != -2)
                    i_8_ = Node_Sub36.method2592(-28046, class248_sub8_sub5);
                else
                    i_8_ = Class284.method3061(-82, ((Node_Sub8_Sub11) (((Node_Sub8) (((Class64) (((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936)).aClass248_Sub8_856)).aClass248_Sub8_6871)));
                if ((i_8_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff))
                    i_5_ = i_8_;
            }
            i_6_ = 16 * Class113.anInt1402 + 21;
            Class198.anInt2264 = 16 * Class113.anInt1402 - -(!Class240.aBoolean2682 ? 22 : 26);
            i_5_ += 8;
        }
        int i_9_ = i - i_5_ / 2;
        if ((i_5_ + i_9_ ^ 0xffffffff) < (Class146.anInt1724 ^ 0xffffffff))
            i_9_ = Class146.anInt1724 - i_5_;
        if (i_9_ < 0)
            i_9_ = 0;
        int i_10_ = i_4_;
        if (i_10_ - -i_6_ > Class282_Sub20.anInt7800)
            i_10_ = Class282_Sub20.anInt7800 + -i_6_;
        if (i_3_ == 5966) {
            if ((i_10_ ^ 0xffffffff) > -1)
                i_10_ = 0;
            Class239.anInt2654 = i_9_;
            Class145.aBoolean1721 = true;
            Class346_Sub10.anInt8354 = i_10_;
            Class346_Sub2.anInt8261 = i_5_;
        }
    }

    final void method3797(byte i) {
        OpenGL.glEndList();
        if (i == 26)
            anInt4414++;
    }

    static {
        aIncommingOpcode_4411 = new IncommingOpcode(74, 6);
        aBoolean4416 = false;
    }
}
