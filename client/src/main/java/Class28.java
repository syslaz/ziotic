/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class28 implements Interface10 {
    static int anInt4883;
    private Class308 aClass308_4884;
    static int anInt4885;
    static int anInt4886;
    static int anInt4887;
    static Node_Sub48 aClass248_Sub48_4888;
    static int[] anIntArray4889 = new int[14];
    private Class206 aClass206_4890;
    static int anInt4891;
    static int anInt4892 = 0;
    static Class128 aClass128_4893;
    static int[] anIntArray4894;
    static int anInt4895;

    public final void method32(boolean bool, byte i) {
        anInt4886++;
        Class311 class311 = aClass308_4884.method3231(119, ((Class206) aClass206_4890).anInt4982);
        if (i >= -60)
            anInt4895 = -55;
        if (class311 != null) {
            int i_0_ = ((((Class206) aClass206_4890).aClass186_4983.method1628(((Class206) aClass206_4890).anInt4973, 0, Class226_Sub1.anInt6661)) - -((Class206) aClass206_4890).anInt4990);
            int i_1_ = ((((Class206) aClass206_4890).aClass272_4984.method2838((byte) 126, s_Sub2.anInt7946, ((Class206) aClass206_4890).anInt4989)) + ((Class206) aClass206_4890).anInt4977);
            if (((Class206) aClass206_4890).aBoolean4978)
                Class287.aHa3381.c(i_0_, i_1_, ((Class206) aClass206_4890).anInt4973, ((Class206) aClass206_4890).anInt4989, ((Class206) aClass206_4890).anInt4991, 0);
            i_1_ += method259(Node_Sub14_Sub27.aClass48_9449, ((Class311) class311).aString3610, i_1_, 0, 5, i_0_) * 12;
            i_1_ += 8;
            if (((Class206) aClass206_4890).aBoolean4978)
                Class287.aHa3381.a(i_0_, i_1_, (-1 + ((Class206) aClass206_4890).anInt4973 + i_0_), i_1_, ((Class206) aClass206_4890).anInt4991, 0);
            i_1_ = ++i_1_ + 12 * method259(Node_Sub14_Sub27.aClass48_9449, ((Class311) class311).aString3619, i_1_, 0, 5, i_0_);
            i_1_ += 5;
            i_1_ += method259(Node_Sub14_Sub27.aClass48_9449, ((Class311) class311).aString3613, i_1_, 0, 5, i_0_) * 12;
        }
    }

    static final boolean method257(int i, int i_2_, int i_3_) {
        anInt4887++;
        if (i_3_ <= 35)
            return true;
        if (!((0x60000 & i ^ 0xffffffff) != -1 | Class143.method1296(i, -1, i_2_)) && !Class136_Sub2.method1256(i, 90, i_2_) && !Class48.method363(i, -1, i_2_))
            return false;
        return true;
    }

    public final boolean method33(int i) {
        if (i != 5618)
            return true;
        anInt4885++;
        return aClass308_4884.method3234(i + -32374);
    }

    public static void method258(byte i) {
        aClass248_Sub48_4888 = null;
        anIntArray4889 = null;
        aClass128_4893 = null;
        if (i >= 110)
            anIntArray4894 = null;
    }

    public final void method34(byte i) {
        anInt4891++;
        if (i <= 34)
            method259(null, null, -43, 36, -117, -108);
    }

    Class28(Class308 class308, Class206 class206) {
        aClass308_4884 = class308;
        aClass206_4890 = class206;
    }

    private final int method259(Class48 class48, String string, int i, int i_4_, int i_5_, int i_6_) {
        anInt4883++;
        if (i_4_ != 0)
            method257(112, -74, -12);
        return (class48.method370(i_5_ + i, 0, null, string, 0, null, ((Class206) aClass206_4890).anInt4974, i_5_ + i_6_, -(i_5_ * 2) + ((Class206) aClass206_4890).anInt4989, ((Class206) aClass206_4890).anInt4979, 0, 0, null, 0, 0, -(i_5_ * 2) + ((Class206) aClass206_4890).anInt4973));
    }

    static {
        aClass248_Sub48_4888 = new Node_Sub48(0, -1);
        aClass128_4893 = new Class128(14, 5);
        anIntArray4894 = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    }
}
