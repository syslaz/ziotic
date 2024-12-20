/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class189 implements Interface14 {
    static int anInt5060;
    static IncommingOpcode aIncommingOpcode_5061 = new IncommingOpcode(12, 3);
    float[] aFloatArray5062;
    private Class351 aClass351_5063;
    private ha_Sub1 aHa_Sub1_5064;
    int anInt5065;
    static int anInt5066;
    int[] anIntArray5067;
    static int anInt5068;
    static int anInt5069;
    int anInt5070;
    static int anInt5071;
    static int anInt5072;

    public final void method38(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
        anInt5072++;
        Class346_Sub7_Sub1_Sub2.method3593(!bool_5_ ? null : ((ha_Sub1) aHa_Sub1_5064).aFloatArray5584, i_1_, (((Node_Sub40) ((ha_Sub1) aHa_Sub1_5064).aClass248_Sub40_5544).anIntArray7283), i_2_, i, !bool_5_ ? null : ((Class189) this).aFloatArray5062, i_0_, i_4_, 0, ((Class189) this).anInt5070, (((Node_Sub40) ((ha_Sub1) aHa_Sub1_5064).aClass248_Sub40_5544).anInt7281), i_3_, bool ? ((Class189) this).anIntArray5067 : null);
    }

    static final void method1637(int i, Entity entity, byte i_6_, int i_7_, int i_8_) {
        anInt5069++;
        Class281 class281 = entity.method3642(0);
        if (i_6_ >= -1)
            anInt5066 = 8;
        int i_9_ = ((((Entity) entity).anInt10427 + -(((Class109) ((Entity) entity).aClass109_10471).anInt1378)) & 0x3fff);
        if (i_8_ == -1) {
            if ((i_9_ ^ 0xffffffff) == -1 && (((Entity) entity).anInt10409) <= 25) {
                if (!(((Entity) entity).aBoolean10491) || !class281.method2909((((Entity) entity).anInt10434), -29592)) {
                    ((Entity) entity).anInt10434 = class281.method2910(false);
                    ((Entity) entity).aBoolean10491 = (((Entity) entity).anInt10434) != -1;
                }
            } else {
                if (i_7_ < 0 && (((Class281) class281).anInt3272 ^ 0xffffffff) != 0) {
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3272;
                    ((Entity) entity).aBoolean10491 = false;
                } else if ((i_7_ ^ 0xffffffff) < -1 && ((Class281) class281).anInt3266 != -1)
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3266;
                else
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3275;
                ((Entity) entity).aBoolean10491 = false;
            }
        } else if ((((Entity) entity).faceEntity) != -1 && (i_9_ >= 10240 || i_9_ <= 2048)) {
            int i_10_ = 0x3fff & (Class19.anIntArray300[i] + -((Class109) (((Entity) entity).aClass109_10471)).anInt1378);
            ((Entity) entity).aBoolean10491 = false;
            if (i_8_ == 2 && (((Class281) class281).anInt3262 ^ 0xffffffff) != 0) {
                if (i_10_ > 2048 && i_10_ <= 6144 && (((Class281) class281).anInt3294 ^ 0xffffffff) != 0)
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3294;
                else if ((i_10_ ^ 0xffffffff) > -10241 || (i_10_ ^ 0xffffffff) <= -14337 || ((Class281) class281).anInt3278 == -1) {
                    if ((i_10_ ^ 0xffffffff) < -6145 && i_10_ < 10240 && (((Class281) class281).anInt3265 ^ 0xffffffff) != 0)
                        ((Entity) entity).anInt10434 = ((Class281) class281).anInt3265;
                    else
                        ((Entity) entity).anInt10434 = ((Class281) class281).anInt3262;
                } else
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3278;
            } else if (i_8_ == 0 && (((Class281) class281).anInt3276 ^ 0xffffffff) != 0) {
                if ((i_10_ ^ 0xffffffff) < -2049 && i_10_ <= 6144 && ((Class281) class281).anInt3310 != -1)
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3310;
                else if ((i_10_ ^ 0xffffffff) <= -10241 && i_10_ < 14336 && ((Class281) class281).anInt3264 != -1)
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3264;
                else if (i_10_ > 6144 && i_10_ < 10240 && ((((Class281) class281).anInt3316 ^ 0xffffffff) != 0))
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3316;
                else
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3276;
            } else if ((i_10_ ^ 0xffffffff) >= -2049 || (i_10_ ^ 0xffffffff) < -6145 || ((Class281) class281).anInt3313 == -1) {
                if ((i_10_ ^ 0xffffffff) <= -10241 && (i_10_ ^ 0xffffffff) > -14337 && (((Class281) class281).anInt3270 ^ 0xffffffff) != 0)
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3270;
                else if (i_10_ > 6144 && (i_10_ ^ 0xffffffff) > -10241 && ((((Class281) class281).anInt3300 ^ 0xffffffff) != 0))
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3300;
                else
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3275;
            } else
                ((Entity) entity).anInt10434 = ((Class281) class281).anInt3313;
        } else if ((i_9_ ^ 0xffffffff) != -1 || (((Entity) entity).anInt10409) > 25) {
            if ((i_8_ ^ 0xffffffff) == -3 && ((Class281) class281).anInt3262 != -1) {
                if ((i_7_ ^ 0xffffffff) <= -1 || ((Class281) class281).anInt3296 == -1) {
                    if ((i_7_ ^ 0xffffffff) < -1 && ((Class281) class281).anInt3274 != -1)
                        ((Entity) entity).anInt10434 = ((Class281) class281).anInt3274;
                    else
                        ((Entity) entity).anInt10434 = ((Class281) class281).anInt3262;
                } else
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3296;
            } else if (i_8_ == 0 && ((Class281) class281).anInt3276 != -1) {
                if (i_7_ >= 0 || ((Class281) class281).anInt3267 == -1) {
                    if ((i_7_ ^ 0xffffffff) >= -1 || ((Class281) class281).anInt3281 == -1)
                        ((Entity) entity).anInt10434 = ((Class281) class281).anInt3276;
                    else
                        ((Entity) entity).anInt10434 = ((Class281) class281).anInt3281;
                } else
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3267;
            } else if (i_7_ >= 0 || (((Class281) class281).anInt3263 ^ 0xffffffff) == 0) {
                if ((i_7_ ^ 0xffffffff) >= -1 || ((Class281) class281).anInt3317 == -1)
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3275;
                else
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3317;
            } else
                ((Entity) entity).anInt10434 = ((Class281) class281).anInt3263;
            ((Entity) entity).aBoolean10491 = false;
        } else {
            if ((i_8_ ^ 0xffffffff) != -3 || (((Class281) class281).anInt3262 ^ 0xffffffff) == 0) {
                if ((i_8_ ^ 0xffffffff) != -1 || ((Class281) class281).anInt3276 == -1)
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3275;
                else
                    ((Entity) entity).anInt10434 = ((Class281) class281).anInt3276;
            } else
                ((Entity) entity).anInt10434 = ((Class281) class281).anInt3262;
            ((Entity) entity).aBoolean10491 = false;
        }
    }

    static final void method1638(int i) {
        Class380.aClass278_4645.method2869(i);
        anInt5068++;
    }

    public static void method1639(byte i) {
        aIncommingOpcode_5061 = null;
        if (i != -44)
            method1637(113, null, (byte) 71, -37, 112);
    }

    public final void method39(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool, boolean bool_16_) {
        anInt5071++;
        Class346_Sub7_Sub1_Sub2.method3593(bool_16_ ? ((Class189) this).aFloatArray5062 : null, i_12_, ((Class189) this).anIntArray5067, i_13_, i, bool_16_ ? ((ha_Sub1) aHa_Sub1_5064).aFloatArray5584 : null, i_11_, i_15_, 0, (((Node_Sub40) ((ha_Sub1) aHa_Sub1_5064).aClass248_Sub40_5544).anInt7281), ((Class189) this).anInt5070, i_14_, bool ? (((Node_Sub40) ((ha_Sub1) aHa_Sub1_5064).aClass248_Sub40_5544).anIntArray7283) : null);
    }

    static final void method1640(int i) {
        Class268.aClass177Array3120 = null;
        int i_17_ = -42 / ((-64 - i) / 47);
        anInt5060++;
    }

    Class189(ha_Sub1 var_ha_Sub1, Class129 class129, Class351 class351) {
        aHa_Sub1_5064 = var_ha_Sub1;
        if (!(class129 instanceof Class129_Sub3_Sub1)) {
            if (class129 instanceof Class129_Sub3_Sub2) {
                Class129_Sub3_Sub2 class129_sub3_sub2 = (Class129_Sub3_Sub2) class129;
                ((Class189) this).anInt5065 = ((Class129_Sub3) class129_sub3_sub2).anInt8569;
                ((Class189) this).anIntArray5067 = ((Class129_Sub3_Sub2) class129_sub3_sub2).anIntArray9989;
                ((Class189) this).anInt5070 = ((Class129_Sub3) class129_sub3_sub2).anInt8548;
            } else
                throw new RuntimeException();
        } else {
            Class129_Sub3_Sub1 class129_sub3_sub1 = (Class129_Sub3_Sub1) class129;
            ((Class189) this).anInt5065 = ((Class129_Sub3) class129_sub3_sub1).anInt8569;
            ((Class189) this).anIntArray5067 = ((Class129_Sub3_Sub1) class129_sub3_sub1).anIntArray9988;
            ((Class189) this).anInt5070 = ((Class129_Sub3) class129_sub3_sub1).anInt8548;
        }
        if (class351 != null) {
            aClass351_5063 = class351;
            if ((((Class351) aClass351_5063).anInt4733 != ((Class189) this).anInt5070) || (((Class351) aClass351_5063).anInt4737 != ((Class189) this).anInt5065))
                throw new RuntimeException();
            ((Class189) this).aFloatArray5062 = ((Class351) aClass351_5063).aFloatArray4735;
        }
    }
}
