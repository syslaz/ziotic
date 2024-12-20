/* Class358 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class358 {
    static int anInt4418;
    static int anInt4419;
    static int anInt4420;
    static IncommingOpcode aIncommingOpcode_4421 = new IncommingOpcode(17, -1);
    static int anInt4422;
    static int anInt4423;
    static Class293 aClass293_4424 = new Class293();

    static final Class225 method3798(int i, ByteStream class248_sub9) {
        anInt4419++;
        Class186 class186 = (Class136_Sub2.method1259(-1)[class248_sub9.readUnsignedByte((byte) -16)]);
        Class272 class272 = Class359.method3805(-12865)[class248_sub9.readUnsignedByte((byte) 72)];
        int i_0_ = class248_sub9.readUnsignedShort((byte) -10);
        int i_1_ = class248_sub9.readUnsignedShort((byte) -10);
        int i_2_ = class248_sub9.readShort(-1);
        int i_3_ = class248_sub9.readShort(-1);
        int i_4_ = class248_sub9.readUnsignedShort((byte) -10);
        int i_5_ = class248_sub9.readInt(false);
        if (i < 80)
            aIncommingOpcode_4421 = null;
        int i_6_ = class248_sub9.readInt(false);
        return new Class225(class186, class272, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
    }

    static int retrieveLooksSettings(int baseValue, int someButtonValue) {
        return baseValue | someButtonValue;
    }

    static final boolean method3800(int i, int i_8_, boolean bool, int i_9_, int i_10_, int i_11_) {
        if (bool != false)
            anInt4422 = 20;
        anInt4420++;
        for (int i_12_ = i_10_; i >= i_12_; i_12_++) {
            for (int i_13_ = i_8_; (i_9_ ^ 0xffffffff) <= (i_13_ ^ 0xffffffff); i_13_++) {
                if (i_11_ == Class27.anIntArrayArray361[i_12_][i_13_] && Class334.anIntArrayArray3903[i_12_][i_13_] <= 1)
                    return true;
            }
        }
        return false;
    }

    public static void method3801(int i) {
        aClass293_4424 = null;
        aIncommingOpcode_4421 = null;
        if (i != 17)
            method3801(-100);
    }
}
