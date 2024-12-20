/* Class84_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class84_Sub9 extends Class84 {
    static int anInt5487;
    static int anInt5488;
    static int anInt5489;
    static int anInt5490;
    static int[] anIntArray5491 = {2047, 16383, 65535};
    private Class183 aClass183_5492;
    static IncommingOpcode aIncommingOpcode_5493 = new IncommingOpcode(104, -2);
    static int anInt5494;
    static int anInt5495;
    static boolean aBoolean5496;
    private Class357 aClass357_5497;
    static int anInt5498;
    static int anInt5499;
    static int anInt5500;
    static int anInt5501;
    static int anInt5502;
    static Class128 aClass128_5503 = new Class128(8, -1);
    static int anInt5504;

    static final String method630(byte i, int i_0_, long l, int i_1_, boolean bool) {
        anInt5500++;
        char c = ',';
        char c_2_ = '.';
        if (i_1_ == 0) {
            c_2_ = ',';
            c = '.';
        }
        if (i_1_ == 2)
            c_2_ = '\u00a0';
        boolean bool_3_ = false;
        if ((l ^ 0xffffffffffffffffL) > -1L) {
            l = -l;
            bool_3_ = true;
        }
        StringBuffer stringbuffer = new StringBuffer(26);
        if ((i_0_ ^ 0xffffffff) < -1) {
            for (int i_4_ = 0; (i_0_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
                int i_5_ = (int) l;
                l /= 10L;
                stringbuffer.append((char) (i_5_ + 48 + -(10 * (int) l)));
            }
            stringbuffer.append(c);
        }
        int i_6_ = 0;
        if (i >= -5)
            anInt5495 = -44;
        for (; ; ) {
            int i_7_ = (int) l;
            l /= 10L;
            stringbuffer.append((char) (-((int) l * 10) + i_7_ + 48));
            if ((l ^ 0xffffffffffffffffL) == -1L)
                break;
            if (bool && (++i_6_ % 3 ^ 0xffffffff) == -1)
                stringbuffer.append(c_2_);
        }
        if (bool_3_)
            stringbuffer.append('-');
        return stringbuffer.reverse().toString();
    }

    static final void method631(int i, int i_8_) {
        for (Node node = Class318.aClass65_3682.method510(true); node != null; node = Class318.aClass65_3682.method512(false)) {
            if ((long) i == (((Node) node).id >> 453931632 & 0xffffL))
                node.remove(true);
        }
        if (i_8_ == 28986)
            anInt5489++;
    }

    final void method601(int i, int i_9_, int i_10_) {
        anInt5488++;
        float f = -5.0E-4F * (float) (1 + (0x3 & i));
        float f_11_ = 5.0E-4F * (float) (1 + (0x3 & i >> -623223677));
        float f_12_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean bool = (0x80 & i ^ 0xffffffff) != -1;
        ((Class84) this).aHa_Sub2_1036.method880(true, 1);
        if (!bool) {
            Class310_Sub1.aFloatArray8039[0] = 0.0F;
            Class310_Sub1.aFloatArray8039[1] = 0.0F;
            Class310_Sub1.aFloatArray8039[3] = 0.0F;
            Class310_Sub1.aFloatArray8039[2] = f_12_;
        } else {
            Class310_Sub1.aFloatArray8039[3] = 0.0F;
            Class310_Sub1.aFloatArray8039[1] = 0.0F;
            Class310_Sub1.aFloatArray8039[2] = 0.0F;
            Class310_Sub1.aFloatArray8039[0] = f_12_;
        }
        OpenGL.glTexGenfv(8192, 9474, Class310_Sub1.aFloatArray8039, 0);
        Class310_Sub1.aFloatArray8039[2] = 0.0F;
        Class310_Sub1.aFloatArray8039[3] = (f * (float) ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5800 % 1.0F);
        Class310_Sub1.aFloatArray8039[1] = f_12_;
        int i_13_ = -116 / ((74 - i_10_) / 36);
        Class310_Sub1.aFloatArray8039[0] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, Class310_Sub1.aFloatArray8039, 0);
        if (((Class183) aClass183_5492).aBoolean2144) {
            Class310_Sub1.aFloatArray8039[2] = 0.0F;
            Class310_Sub1.aFloatArray8039[0] = 0.0F;
            Class310_Sub1.aFloatArray8039[3] = ((float) ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5800 * f_11_ % 1.0F);
            Class310_Sub1.aFloatArray8039[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, Class310_Sub1.aFloatArray8039, 0);
        } else {
            int i_14_ = (int) (16.0F * ((float) (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5800) * f_11_));
            ((Class84) this).aHa_Sub2_1036.method889(-2, (((Class183) aClass183_5492).aClass136_Sub4Array2141[i_14_ % 16]));
        }
        ((Class84) this).aHa_Sub2_1036.method880(true, 0);
    }

    final void method597(boolean bool) {
        if (bool != false)
            anIntArray5491 = null;
        aClass357_5497.method3795((byte) 100, '\001');
        anInt5502++;
        ((Class84) this).aHa_Sub2_1036.method880(!bool, 1);
        ((Class84) this).aHa_Sub2_1036.method889(-2, null);
        ((Class84) this).aHa_Sub2_1036.method880(true, 0);
    }

    final void method603(byte i, int i_15_, Class136 class136) {
        anInt5501++;
        ((Class84) this).aHa_Sub2_1036.method889(-2, class136);
        ((Class84) this).aHa_Sub2_1036.method881((byte) 112, i_15_);
        if (i <= 53)
            anInt5504 = 73;
    }

    final boolean method600(int i) {
        anInt5494++;
        if (i != -16777216)
            method630((byte) 95, -21, 6L, -85, false);
        return true;
    }

    public static void method632(int i) {
        aIncommingOpcode_5493 = null;
        aClass128_5503 = null;
        if (i != -8554)
            aIncommingOpcode_5493 = null;
        anIntArray5491 = null;
    }

    Class84_Sub9(ha_Sub2 var_ha_Sub2, Class183 class183) {
        super(var_ha_Sub2);
        aClass183_5492 = class183;
        aClass357_5497 = new Class357(var_ha_Sub2, 2);
        aClass357_5497.method3794(-108, 0);
        ((Class84) this).aHa_Sub2_1036.method880(true, 1);
        if (((Class183) aClass183_5492).aBoolean2144) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        aClass357_5497.method3797((byte) 26);
        aClass357_5497.method3794(-88, 1);
        ((Class84) this).aHa_Sub2_1036.method880(true, 1);
        if (((Class183) aClass183_5492).aBoolean2144)
            OpenGL.glDisable(3170);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        aClass357_5497.method3797((byte) 26);
    }

    final void method599(byte i, boolean bool) {
        if (i >= -123)
            anInt5504 = -64;
        anInt5487++;
    }

    final void method602(boolean bool, byte i) {
        aClass357_5497.method3795((byte) 101, '\0');
        anInt5499++;
        if (i <= 1)
            method602(false, (byte) -59);
        if (((Class183) aClass183_5492).aBoolean2144) {
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            ((Class84) this).aHa_Sub2_1036.method889(-2, (((Class183) aClass183_5492).aClass136_Sub2_2142));
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        }
    }
}
