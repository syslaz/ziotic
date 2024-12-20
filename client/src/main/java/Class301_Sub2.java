/* Class301_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class301_Sub2 extends Class301 {
    static int anInt8431;
    static Class58 aClass58_8432 = new Class58("", 15);
    static int anInt8433;
    static int anInt8434;
    static int anInt8435;

    final void method3185(int i, int i_0_, boolean bool, int i_1_) {
        if (i_0_ < -72) {
            Class287.aHa3381.c(i_1_ - 2, i, ((Class225) ((Class301) this).aClass225_4932).anInt5000 - -4, ((Class225) ((Class301) this).aClass225_4932).anInt5002 - -2, ((Class225_Sub2) (Class225_Sub2) ((Class301) this).aClass225_4932).anInt8463, 0);
            anInt8433++;
            Class287.aHa3381.c(-1 + i_1_, i - -1, (((Class225) ((Class301) this).aClass225_4932).anInt5000) - -2, (((Class225) ((Class301) this).aClass225_4932).anInt5002), 0, 0);
        }
    }

    Class301_Sub2(Class381 class381, Class381 class381_2_, Class225_Sub2 class225_sub2) {
        super(class381, class381_2_, (Class225) class225_sub2);
    }

    final void method3182(int i, int i_3_, int i_4_, boolean bool) {
        anInt8434++;
        int i_5_ = (this.method3184((byte) -36) * ((Class225) ((Class301) this).aClass225_4932).anInt5000 / 10000);
        Class287.aHa3381.aa(i, i_4_ - -2, i_5_, (((Class225) ((Class301) this).aClass225_4932).anInt5002) - 2, ((Class225_Sub2) (Class225_Sub2) ((Class301) this).aClass225_4932).anInt8464, 0);
        Class287.aHa3381.aa(i_5_ + i, i_3_ + i_4_, ((Class225) ((Class301) this).aClass225_4932).anInt5000 - i_5_, ((Class225) ((Class301) this).aClass225_4932).anInt5002 - 2, 0, 0);
    }

    public static void method3191(int i) {
        aClass58_8432 = null;
        if (i != -23738)
            anInt8435 = 63;
    }

    static final Class136_Sub4_Sub1 method3192(boolean bool, byte[] is, ha_Sub2 var_ha_Sub2, int i, int i_6_, int i_7_, int i_8_, int i_9_) {
        anInt8431++;
        if (i_9_ >= -17)
            method3191(63);
        if (!((ha_Sub2) var_ha_Sub2).aBoolean5913 && (!Class343.method3508(i_8_, -31218) || !Class343.method3508(i_7_, -31218))) {
            if (!((ha_Sub2) var_ha_Sub2).aBoolean5837)
                return (new Class136_Sub4_Sub1(var_ha_Sub2, i_6_, i_8_, i_7_, Class136_Sub4.method1269(i_8_, (byte) -128), Class136_Sub4.method1269(i_7_, (byte) -128), is, i));
            return new Class136_Sub4_Sub1(var_ha_Sub2, 34037, i_6_, i_8_, i_7_, bool, is, i);
        }
        return new Class136_Sub4_Sub1(var_ha_Sub2, 3553, i_6_, i_8_, i_7_, bool, is, i);
    }
}
