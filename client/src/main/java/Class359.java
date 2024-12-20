/* Class359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class359 {
    private ha_Sub2 aHa_Sub2_4425;
    private d aD4426;
    static int anInt4427;
    static int anInt4428;
    static int anInt4429;
    static Class215 aClass215_4430;
    static int anInt4431;
    private Class278 aClass278_4432 = new Class278(256);
    static int anInt4433 = -1;
    static int anInt4434;
    static boolean[] aBooleanArray4435;
    static int anInt4436;
    static boolean aBoolean4437;

    final void method3802(byte i) {
        aClass278_4432.method2872((byte) -78);
        anInt4434++;
        if (i > -121)
            method3803((byte) -90);
    }

    public static void method3803(byte i) {
        aBooleanArray4435 = null;
        if (i != -41)
            method3805(-63);
        aClass215_4430 = null;
    }

    final Class136_Sub4 method3804(int i, int i_0_) {
        anInt4428++;
        Object object = aClass278_4432.method2863(4, (long) i_0_);
        if (object != null)
            return (Class136_Sub4) object;
        if (!aD4426.method23(i_0_, -32345))
            return null;
        if (i < 57)
            return null;
        Class312 class312 = aD4426.method25(i_0_, (byte) 124);
        int i_1_ = (!((Class312) class312).aBoolean3636 ? ((ha_Sub2) aHa_Sub2_4425).anInt5790 : 64);
        Class136_Sub4 class136_sub4;
        if (!((Class312) class312).aBoolean3626 || !aHa_Sub2_4425.q()) {
            int[] is;
            if ((((Class312) class312).anInt3629 ^ 0xffffffff) != -3 && Class324.method3359(((Class312) class312).aByte3624, (byte) -14))
                is = aD4426.method24(-118, i_1_, 0.7F, true, i_0_, i_1_);
            else
                is = aD4426.method27(false, (byte) -77, i_1_, i_1_, 0.7F, i_0_);
            class136_sub4 = new Class136_Sub4(aHa_Sub2_4425, 3553, 6408, i_1_, i_1_, ((Class312) class312).aByte3623 != 0, is, 0, 0, false);
        } else {
            float[] fs = aD4426.method28(i_1_, false, i_1_, i_0_, 0.7F, -2202);
            class136_sub4 = new Class136_Sub4(aHa_Sub2_4425, 3553, 34842, i_1_, i_1_, ((Class312) class312).aByte3623 != 0, fs, 6408);
        }
        class136_sub4.method1266((byte) -60, ((Class312) class312).aBoolean3639, ((Class312) class312).aBoolean3632);
        aClass278_4432.method2867((byte) 0, (long) i_0_, class136_sub4);
        return class136_sub4;
    }

    static final Class272[] method3805(int i) {
        anInt4429++;
        if (i != -12865)
            method3805(68);
        return new Class272[]{NPC.aClass272_10616, Node_Sub5.aClass272_6839, Class346_Sub1.aClass272_8251};
    }

    final void method3806(int i) {
        if (i >= -127)
            method3803((byte) -36);
        anInt4431++;
        aClass278_4432.method2864(5, -15782);
    }

    Class359(ha_Sub2 var_ha_Sub2, d var_d) {
        aHa_Sub2_4425 = var_ha_Sub2;
        aD4426 = var_d;
    }

    static {
        aClass215_4430 = new Class215("stellardawn", 1);
        aBooleanArray4435 = new boolean[100];
        aBoolean4437 = false;
    }
}
