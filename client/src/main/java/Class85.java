/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class85 {
    private Class381 aClass381_1037;
    static int anInt1038;
    static int anInt1039;
    private Class278 aClass278_1040 = new Class278(64);
    static int anInt1041;
    static int anInt1042;
    static OutgoingOpcode aOutgoingOpcode_1043 = new OutgoingOpcode(65, -1);
    static int anInt1044;
    Class381 aClass381_1045;
    static int anInt1046;
    static Class137[][][] aClass137ArrayArrayArray1047;
    static int anInt1048 = 0;
    Class278 aClass278_1049 = new Class278(2);

    final void method633(byte i, int i_0_) {
        anInt1039++;
        synchronized (aClass278_1040) {
            aClass278_1040.method2864(i_0_, -15782);
        }
        if (i >= 87) {
            synchronized (((Class85) this).aClass278_1049) {
                ((Class85) this).aClass278_1049.method2864(i_0_, -15782);
            }
        }
    }

    final Class237 method634(int i, int i_1_) {
        anInt1038++;
        Class237 class237;
        synchronized (aClass278_1040) {
            class237 = (Class237) aClass278_1040.method2863(4, (long) i);
        }
        if (class237 != null)
            return class237;
        byte[] is;
        synchronized (aClass381_1037) {
            is = aClass381_1037.method3922((byte) 127, i_1_, i);
        }
        class237 = new Class237();
        ((Class237) class237).aClass85_2640 = this;
        if (is != null)
            class237.method1855((byte) 97, new ByteStream(is));
        synchronized (aClass278_1040) {
            aClass278_1040.method2867((byte) 0, (long) i, class237);
        }
        return class237;
    }

    final void method635(int i) {
        synchronized (aClass278_1040) {
            aClass278_1040.method2872((byte) -78);
        }
        if (i == 64) {
            anInt1044++;
            synchronized (((Class85) this).aClass278_1049) {
                ((Class85) this).aClass278_1049.method2872((byte) -78);
            }
        }
    }

    public static void method636(int i) {
        if (i != -18039)
            anInt1048 = -80;
        aOutgoingOpcode_1043 = null;
        aClass137ArrayArrayArray1047 = null;
    }

    static final int method637(NPC NPC, byte i) {
        anInt1046++;
        Class255 class255 = (((NPC) NPC).aClass255_10614);
        if (((Class255) class255).anIntArray2923 != null) {
            class255 = class255.method2737((byte) 69, Node_Sub43.aClass291_7306);
            if (class255 == null)
                return -1;
        }
        int i_2_ = ((Class255) class255).anInt2880;
        if (i <= 82)
            return -18;
        Class281 class281 = NPC.method3642(0);
        if (((((Entity) NPC).anInt10434) ^ 0xffffffff) != 0 && !(((Entity) NPC).aBoolean10491)) {
            if ((((Entity) NPC).anInt10434) == ((Class281) class281).anInt3262 || ((((Class281) class281).anInt3265 ^ 0xffffffff) == (((Entity) NPC).anInt10434 ^ 0xffffffff)) || (((((Entity) NPC).anInt10434) ^ 0xffffffff) == (((Class281) class281).anInt3294 ^ 0xffffffff)) || (((Entity) NPC).anInt10434) == ((Class281) class281).anInt3278)
                i_2_ = ((Class255) class255).anInt2916;
            else if ((((Class281) class281).anInt3276 == ((Entity) NPC).anInt10434) || ((((Entity) NPC).anInt10434 ^ 0xffffffff) == (((Class281) class281).anInt3316 ^ 0xffffffff)) || (((Class281) class281).anInt3310 == ((Entity) NPC).anInt10434) || ((((Entity) NPC).anInt10434 ^ 0xffffffff) == (((Class281) class281).anInt3264 ^ 0xffffffff)))
                i_2_ = ((Class255) class255).anInt2926;
        } else
            i_2_ = ((Class255) class255).anInt2877;
        return i_2_;
    }

    final void method638(int i) {
        anInt1042++;
        synchronized (aClass278_1040) {
            aClass278_1040.method2869(0);
        }
        synchronized (((Class85) this).aClass278_1049) {
            ((Class85) this).aClass278_1049.method2869(i ^ i);
        }
    }

    static final boolean method639(int i, char c) {
        anInt1041++;
        if (Character.isISOControl(c))
            return false;
        if (Class136.method1250(65, c))
            return true;
        char[] cs = Class347.aCharArray4127;
        for (int i_3_ = 0; i_3_ < cs.length; i_3_++) {
            char c_4_ = cs[i_3_];
            if (c == c_4_)
                return true;
        }
        if (i != -32723)
            return true;
        char[] cs_5_ = Class136_Sub4_Sub1.aCharArray9965;
        for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (cs_5_.length ^ 0xffffffff); i_6_++) {
            char c_7_ = cs_5_[i_6_];
            if (c == c_7_)
                return true;
        }
        return false;
    }

    Class85(Class215 class215, int i, Class381 class381, Class381 class381_8_) {
        aClass381_1037 = class381;
        ((Class85) this).aClass381_1045 = class381_8_;
        aClass381_1037.method3899(33, 0);
    }
}
