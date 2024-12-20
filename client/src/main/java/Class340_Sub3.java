/* Class340_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class340_Sub3 extends Class340 {
    static Class34 aClass34_8113 = new Class34();
    static int anInt8114;
    static Class381 aClass381_8115;
    static int anInt8116;
    static int anInt8117;
    static int anInt8118;
    static int anInt8119;
    static int anInt8120;
    static int anInt8121;

    final void method3442(Interface21 interface21, int i, byte i_0_) {
        ((Class340) this).aHa_Sub3_3954.method929(interface21, -8423);
        anInt8121++;
        if (i_0_ <= 68)
            method3435(true, 81);
        ((Class340) this).aHa_Sub3_3954.method993((byte) 118, i);
    }

    final void method3435(boolean bool, int i) {
        anInt8120++;
        if (i < 109)
            aClass34_8113 = null;
    }

    Class340_Sub3(ha_Sub3 var_ha_Sub3) {
        super(var_ha_Sub3);
    }

    final void method3433(int i, int i_1_, int i_2_) {
        if (i == -26427)
            anInt8114++;
    }

    final boolean method3432(int i) {
        if (i != 4095)
            method3442(null, 115, (byte) 3);
        anInt8116++;
        return false;
    }

    static final Class54_Sub4 method3452(int i, ByteStream class248_sub9) {
        int i_3_ = -20 % ((37 - i) / 46);
        anInt8117++;
        return new Class54_Sub4(class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.method2221(255), class248_sub9.readUnsignedByte((byte) 112));
    }

    final void method3441(boolean bool) {
        anInt8118++;
        if (bool != true)
            method3443(true, false);
    }

    public static void method3453(byte i) {
        aClass34_8113 = null;
        aClass381_8115 = null;
        if (i != -82)
            aClass34_8113 = null;
    }

    final void method3443(boolean bool, boolean bool_4_) {
        if (bool != true)
            method3441(false);
        anInt8119++;
    }
}
