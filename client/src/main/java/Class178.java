/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class178 {
    int anInt2075;
    static int anInt2076;
    int anInt2077;
    int anInt2078;
    int anInt2079;
    static int anInt2080;
    static int anInt2081;

    final Class178 method1592(int i, int i_0_) {
        if (i_0_ >= -84)
            ((Class178) this).anInt2075 = -63;
        anInt2081++;
        return new Class178(((Class178) this).anInt2078, i, ((Class178) this).anInt2079, ((Class178) this).anInt2077);
    }

    static final void method1593(byte i) {
        for (Node_Sub8_Sub5 class248_sub8_sub5 = (Node_Sub8_Sub5) Class363.aClass64_4478.method492(896); class248_sub8_sub5 != null; class248_sub8_sub5 = ((Node_Sub8_Sub5) Class363.aClass64_4478.method490(true))) {
            if ((((Node_Sub8_Sub5) class248_sub8_sub5).anInt8937 ^ 0xffffffff) < -2) {
                ((Node_Sub8_Sub5) class248_sub8_sub5).anInt8937 = 0;
                Class304.aClass278_3529.method2867((byte) 0, ((Node_Sub8_Sub11) (Node_Sub8_Sub11) (((Node_Sub8) ((Class64) (((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936)).aClass248_Sub8_856).aClass248_Sub8_6871)).aLong8994, class248_sub8_sub5);
                ((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936.method496((byte) -74);
            }
        }
        anInt2076++;
        Class379.anInt4638 = 0;
        Class113.anInt1402 = 0;
        Class358.aClass293_4424.method3121(10);
        Class14.aClass65_267.method504(-1);
        Class363.aClass64_4478.method496((byte) -74);
        if (i <= -115)
            Class145.aBoolean1721 = false;
    }

    static final void method1594(boolean bool, int i, int i_1_, int i_2_, int i_3_) {
        anInt2080++;
        Class181.anInt2099 = i;
        aa_Sub3.anInt5270 = i_3_;
        if (bool == false) {
            Class289.anInt3399 = i_2_;
            Class302.anInt3500 = i_1_;
        }
    }

    Class178(int i, int i_4_, int i_5_, int i_6_) {
        ((Class178) this).anInt2079 = i_5_;
        ((Class178) this).anInt2077 = i_6_;
        ((Class178) this).anInt2075 = i_4_;
        ((Class178) this).anInt2078 = i;
    }
}
