/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38 {
    int anInt411;
    int anInt412;
    int anInt413;
    static int anInt414;
    int anInt415;
    int anInt416;
    static int anInt417;
    static int anInt418;
    static int anInt419;
    int anInt420;
    static int anInt421;
    private int anInt422;
    private int anInt423;
    private int anInt424;
    private int anInt425;

    static final int method285(byte i, int i_0_) {
        if (i != 38)
            anInt414 = 96;
        anInt418++;
        return (0x3fdb0 & i_0_) >> -213890613;
    }

    final boolean method286(int i, byte i_1_, int i_2_, int i_3_) {
        anInt421++;
        if (((Class38) this).anInt412 > i_3_ || (((Class38) this).anInt415 ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
            return false;
        if ((i ^ 0xffffffff) > (((Class38) this).anInt420 ^ 0xffffffff) || (i ^ 0xffffffff) < (((Class38) this).anInt416 ^ 0xffffffff))
            return false;
        int i_4_ = 96 / ((-2 - i_1_) / 41);
        if ((((Class38) this).anInt413 ^ 0xffffffff) < (i_2_ ^ 0xffffffff) || (((Class38) this).anInt411 ^ 0xffffffff) > (i_2_ ^ 0xffffffff))
            return false;
        int i_5_ = -anInt424 + i_3_;
        int i_6_ = i_2_ + -anInt423;
        if (i_5_ * i_5_ + i_6_ * i_6_ >= anInt422)
            return false;
        return true;
    }

    final void method287(int i, byte i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
        anInt424 = i_14_;
        anInt425 = i;
        anInt423 = i_15_;
        anInt422 = i_12_ * i_12_;
        anInt417++;
        if (i_7_ == 47) {
            ((Class38) this).anInt420 = i_13_ + anInt425;
            ((Class38) this).anInt413 = anInt423 + i_16_;
            ((Class38) this).anInt412 = i_8_ + anInt424;
            ((Class38) this).anInt411 = i_9_ + anInt423;
            ((Class38) this).anInt415 = anInt424 - -i_11_;
            ((Class38) this).anInt416 = anInt425 - -i_10_;
        }
    }

    static final Class381 method288(boolean bool, int i, byte i_17_, int i_18_) {
        if (i_17_ != -128)
            method285((byte) -85, -86);
        anInt419++;
        Class209 class209 = null;
        if (Class95.aClass46_1231 != null)
            class209 = new Class209(i_18_, Class95.aClass46_1231, Class96.aClass46Array1242[i_18_], 1000000);
        Class210.aClass330_Sub1Array2435[i_18_] = Class156.aClass290_1861.method3096(Class238_Sub2.aClass209_6732, i_18_, class209, false);
        Class210.aClass330_Sub1Array2435[i_18_].method3384(105);
        return new Class381(Class210.aClass330_Sub1Array2435[i_18_], bool, i);
    }

    Class38(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
        anInt424 = i;
        anInt422 = i_21_ * i_21_;
        anInt423 = i_20_;
        anInt425 = i_19_;
        ((Class38) this).anInt411 = anInt423 + i_27_;
        ((Class38) this).anInt416 = i_25_ + anInt425;
        ((Class38) this).anInt420 = anInt425 - -i_24_;
        ((Class38) this).anInt412 = anInt424 - -i_22_;
        ((Class38) this).anInt413 = i_26_ + anInt423;
        ((Class38) this).anInt415 = i_23_ + anInt424;
    }
}
