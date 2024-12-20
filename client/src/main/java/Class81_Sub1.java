/* Class81_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class81_Sub1 extends Class81 {
    static int anInt8419;
    private int anInt8420 = 0;
    static int[] anIntArray8421 = {1, 2, 4, 8};
    static int anInt8422;
    static long aLong8423 = 0L;

    Class81_Sub1(Class381 class381, Class297_Sub1 class297_sub1) {
        super(class381, (Class297) class297_sub1);
    }

    static final void method588(int i, Class229 class229, int i_0_, int i_1_) {
        anInt8419++;
        if (i_0_ == 4)
            Class122.aClass229ArrayArray1524[i][i_1_] = class229;
    }

    public final void method32(boolean bool, byte i) {
        anInt8422++;
        int i_2_ = ((((Class297) ((Class81) this).aClass297_4911).aClass186_5016.method1628(((Class81) this).aClass129_4910.method1169(), 0, Class226_Sub1.anInt6661)) + ((Class297) ((Class81) this).aClass297_4911).anInt5012);
        if (i < -60) {
            int i_3_ = ((((Class297) ((Class81) this).aClass297_4911).aClass272_5011.method2838((byte) -23, s_Sub2.anInt7946, ((Class81) this).aClass129_4910.method1181())) + ((Class297) ((Class81) this).aClass297_4911).anInt5014);
            ((Class81) this).aClass129_4910.method1162((float) (((Class81) this).aClass129_4910.method1169() / 2 + i_2_), (float) (((Class81) this).aClass129_4910.method1181() / 2 + i_3_), 4096, anInt8420);
            anInt8420 += ((Class297_Sub1) (Class297_Sub1) ((Class81) this).aClass297_4911).anInt8479;
        }
    }

    public static void method589(int i) {
        if (i != -30978)
            method589(-53);
        anIntArray8421 = null;
    }
}
