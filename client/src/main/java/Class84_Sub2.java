/* Class84_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class84_Sub2 extends Class84 {
    static Class278 aClass278_5381 = new Class278(64);
    static int anInt5382;
    private Class357 aClass357_5383;
    private boolean aBoolean5384 = false;
    static int anInt5385;
    static int cameraMovementY;
    static int anInt5387;
    static int anInt5388;
    static int anInt5389;
    static int anInt5390;

    final void method597(boolean bool) {
        anInt5387++;
        if (!aBoolean5384)
            ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 5890);
        else {
            aClass357_5383.method3795((byte) 58, '\001');
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            ((Class84) this).aHa_Sub2_1036.method889(-2, null);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        }
        ((Class84) this).aHa_Sub2_1036.method858(-25, 8448, 8448);
        aBoolean5384 = bool;
    }

    final boolean method600(int i) {
        if (i != -16777216)
            aClass357_5383 = null;
        anInt5382++;
        return true;
    }

    final void method603(byte i, int i_0_, Class136 class136) {
        anInt5388++;
        ((Class84) this).aHa_Sub2_1036.method889(-2, class136);
        ((Class84) this).aHa_Sub2_1036.method881((byte) 114, i_0_);
        if (i < 53)
            cameraMovementY = 7;
    }

    final void method599(byte i, boolean bool) {
        anInt5385++;
        if (i > -123)
            method607(-29);
        ((Class84) this).aHa_Sub2_1036.method858(120, 7681, 8448);
    }

    final void method601(int i, int i_1_, int i_2_) {
        anInt5390++;
        int i_3_ = 111 % ((i_2_ - 74) / 36);
    }

    final void method602(boolean bool, byte i) {
        if (i >= 1) {
            anInt5389++;
            Class136_Sub3 class136_sub3 = ((Class84) this).aHa_Sub2_1036.method875(1);
            if (aClass357_5383 != null && class136_sub3 != null && bool) {
                aClass357_5383.method3795((byte) 106, '\0');
                ((Class84) this).aHa_Sub2_1036.method880(true, 1);
                ((Class84) this).aHa_Sub2_1036.method889(-2, class136_sub3);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aClass238_Sub3_5835.method1911(9), 0);
                OpenGL.glMatrixMode(5888);
                ((Class84) this).aHa_Sub2_1036.method880(true, 0);
                aBoolean5384 = true;
            } else
                ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 34168);
        }
    }

    public static void method607(int i) {
        aClass278_5381 = null;
        if (i != 34166)
            cameraMovementY = 127;
    }

    Class84_Sub2(ha_Sub2 var_ha_Sub2) {
        super(var_ha_Sub2);
        if (((ha_Sub2) var_ha_Sub2).aBoolean5883) {
            aClass357_5383 = new Class357(var_ha_Sub2, 2);
            aClass357_5383.method3794(-126, 0);
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            ((Class84) this).aHa_Sub2_1036.method858(120, 7681, 34165);
            ((Class84) this).aHa_Sub2_1036.method911(770, 34168, 2, (byte) 4);
            ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
            aClass357_5383.method3797((byte) 26);
            aClass357_5383.method3794(-100, 1);
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            ((Class84) this).aHa_Sub2_1036.method858(123, 8448, 8448);
            ((Class84) this).aHa_Sub2_1036.method911(770, 34166, 2, (byte) 4);
            ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
            aClass357_5383.method3797((byte) 26);
        }
    }
}
