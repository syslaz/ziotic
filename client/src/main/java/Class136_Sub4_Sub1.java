/* Class136_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class136_Sub4_Sub1 extends Class136_Sub4 {
    int anInt9964;
    static char[] aCharArray9965 = {'[', ']', '#'};
    int anInt9966;
    float aFloat9967;
    boolean aBoolean9968;
    float aFloat9969;
    static int anInt9970;

    Class136_Sub4_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_0_, int i_1_, int i_2_, int[] is) {
        super(var_ha_Sub2, 3553, 6408, i_1_, i_2_);
        ((Class136_Sub4_Sub1) this).anInt9964 = i;
        ((Class136_Sub4_Sub1) this).anInt9966 = i_0_;
        this.method1262((byte) -60, i, 0, i_0_, 0, true, is, 0, 0);
        ((Class136_Sub4_Sub1) this).aFloat9967 = (float) i_0_ / (float) i_2_;
        ((Class136_Sub4_Sub1) this).aFloat9969 = (float) i / (float) i_1_;
        ((Class136_Sub4_Sub1) this).aBoolean9968 = false;
        this.method1266((byte) -60, false, false);
    }

    Class136_Sub4_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool) {
        super(var_ha_Sub2, i, i_3_, i_4_, i_5_, i_6_);
        if (((Class136) this).anInt4770 != 34037) {
            ((Class136_Sub4_Sub1) this).aBoolean9968 = true;
            ((Class136_Sub4_Sub1) this).aFloat9969 = ((Class136_Sub4_Sub1) this).aFloat9967 = 1.0F;
        } else {
            ((Class136_Sub4_Sub1) this).aFloat9969 = (float) i_5_;
            ((Class136_Sub4_Sub1) this).aFloat9967 = (float) i_6_;
            ((Class136_Sub4_Sub1) this).aBoolean9968 = false;
        }
        ((Class136_Sub4_Sub1) this).anInt9964 = i_5_;
        ((Class136_Sub4_Sub1) this).anInt9966 = i_6_;
    }

    Class136_Sub4_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_7_, int i_8_, int i_9_, int i_10_) {
        super(var_ha_Sub2, 3553, i, i_9_, i_10_);
        ((Class136_Sub4_Sub1) this).aFloat9969 = (float) i_7_ / (float) i_9_;
        ((Class136_Sub4_Sub1) this).aFloat9967 = (float) i_8_ / (float) i_10_;
        ((Class136_Sub4_Sub1) this).aBoolean9968 = false;
        ((Class136_Sub4_Sub1) this).anInt9966 = i_8_;
        ((Class136_Sub4_Sub1) this).anInt9964 = i_7_;
        this.method1266((byte) -60, false, false);
    }

    Class136_Sub4_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_11_, int i_12_, int i_13_, int i_14_, byte[] is, int i_15_) {
        super(var_ha_Sub2, 3553, i, i_13_, i_14_);
        ((Class136_Sub4_Sub1) this).anInt9964 = i_11_;
        ((Class136_Sub4_Sub1) this).anInt9966 = i_12_;
        this.method1268(is, i_15_, 0, 0, 0, 0, true, i_12_, 66, i_11_);
        ((Class136_Sub4_Sub1) this).aFloat9967 = (float) i_12_ / (float) i_14_;
        ((Class136_Sub4_Sub1) this).aBoolean9968 = false;
        ((Class136_Sub4_Sub1) this).aFloat9969 = (float) i_11_ / (float) i_13_;
        this.method1266((byte) -60, false, false);
    }

    Class136_Sub4_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_16_, int i_17_, boolean bool, int[] is, int i_18_, int i_19_) {
        super(var_ha_Sub2, i, 6408, i_16_, i_17_, bool, is, i_18_, i_19_, true);
        ((Class136_Sub4_Sub1) this).anInt9964 = i_16_;
        ((Class136_Sub4_Sub1) this).anInt9966 = i_17_;
        if ((((Class136) this).anInt4770 ^ 0xffffffff) == -34038) {
            ((Class136_Sub4_Sub1) this).aFloat9969 = (float) i_16_;
            ((Class136_Sub4_Sub1) this).aFloat9967 = (float) i_17_;
            ((Class136_Sub4_Sub1) this).aBoolean9968 = false;
        } else {
            ((Class136_Sub4_Sub1) this).aBoolean9968 = true;
            ((Class136_Sub4_Sub1) this).aFloat9969 = ((Class136_Sub4_Sub1) this).aFloat9967 = 1.0F;
        }
    }

    public static void method1271(boolean bool) {
        if (bool == true)
            aCharArray9965 = null;
    }

    Class136_Sub4_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_20_, int i_21_, int i_22_, boolean bool, byte[] is, int i_23_) {
        super(var_ha_Sub2, i, i_20_, i_21_, i_22_, bool, is, i_23_, true);
        if (((Class136) this).anInt4770 == 34037) {
            ((Class136_Sub4_Sub1) this).aBoolean9968 = false;
            ((Class136_Sub4_Sub1) this).aFloat9969 = (float) i_21_;
            ((Class136_Sub4_Sub1) this).aFloat9967 = (float) i_22_;
        } else {
            ((Class136_Sub4_Sub1) this).aFloat9969 = ((Class136_Sub4_Sub1) this).aFloat9967 = 1.0F;
            ((Class136_Sub4_Sub1) this).aBoolean9968 = true;
        }
        ((Class136_Sub4_Sub1) this).anInt9966 = i_22_;
        ((Class136_Sub4_Sub1) this).anInt9964 = i_21_;
    }

    Class136_Sub4_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_24_, int i_25_, int i_26_) {
        super(var_ha_Sub2, i, i_24_, i_25_, i_26_);
        ((Class136_Sub4_Sub1) this).anInt9966 = i_26_;
        ((Class136_Sub4_Sub1) this).anInt9964 = i_25_;
        if (((Class136) this).anInt4770 != 34037) {
            ((Class136_Sub4_Sub1) this).aBoolean9968 = true;
            ((Class136_Sub4_Sub1) this).aFloat9969 = ((Class136_Sub4_Sub1) this).aFloat9967 = 1.0F;
        } else {
            ((Class136_Sub4_Sub1) this).aFloat9967 = (float) i_26_;
            ((Class136_Sub4_Sub1) this).aBoolean9968 = false;
            ((Class136_Sub4_Sub1) this).aFloat9969 = (float) i_25_;
        }
    }

    Class136_Sub4_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, boolean bool) {
        super(var_ha_Sub2, 3553, i, i_27_, i_30_, i_31_);
        ((Class136_Sub4_Sub1) this).anInt9966 = i_29_;
        ((Class136_Sub4_Sub1) this).aFloat9969 = (float) i_28_ / (float) i_30_;
        ((Class136_Sub4_Sub1) this).aBoolean9968 = false;
        ((Class136_Sub4_Sub1) this).aFloat9967 = (float) i_29_ / (float) i_31_;
        ((Class136_Sub4_Sub1) this).anInt9964 = i_28_;
        this.method1266((byte) -60, false, false);
    }
}
