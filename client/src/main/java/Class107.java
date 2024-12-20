/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class107 {
    static int anInt1350;
    int anInt1351;
    boolean aBoolean1352;
    static int anInt1353;
    int anInt1354;
    static Class14 aClass14_1355 = new Class14();
    int anInt1356;
    static Class381 aClass381_1357;

    static final boolean method751(int i, int i_0_, int i_1_) {
        anInt1350++;
        if ((i & i_1_ ^ 0xffffffff) != -1 | Class282_Sub11.method2962(127, i_0_, i) || Class219.method1759(i_0_, i, 0))
            return true;
        if ((i_0_ & 0x37 ^ 0xffffffff) != -1 || !Class136_Sub2.method1256(i, 80, i_0_))
            return false;
        return true;
    }

    static final boolean method752(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt1353++;
        if ((i_4_ & r.aByteArrayArrayArray9033[0][i][i_3_] ^ 0xffffffff) != -1)
            return true;
        if ((r.aByteArrayArrayArray9033[i_5_][i][i_3_] & 0x10) != 0)
            return false;
        if ((Class327.method3366(i_5_, false, i_3_, i) ^ 0xffffffff) == (i_2_ ^ 0xffffffff))
            return true;
        return false;
    }

    public static void method753(boolean bool) {
        if (bool != true)
            method753(true);
        aClass14_1355 = null;
        aClass381_1357 = null;
    }

    public Class107() {
        /* empty */
    }
}
