/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class195 {
    static int anInt2230;
    int anInt2231;
    Interface11[] anInterface11Array2232;
    int anInt2233;
    static int anInt2234 = 0;
    static int anInt2235;

    final void method1666(byte i, ByteStream class248_sub9) {
        anInt2235++;
        ((Class195) this).anInt2231 = class248_sub9.method2221(255);
        ((Class195) this).anInt2233 = class248_sub9.readShort(-1);
        ((Class195) this).anInterface11Array2232 = new Interface11[class248_sub9.readUnsignedByte((byte) 112)];
        Class208[] class208s = Player.method3652(false);
        int i_0_ = 0;
        if (i != -29)
            ((Class195) this).anInt2233 = -94;
        for (/**/; ((i_0_ ^ 0xffffffff) > (((Class195) this).anInterface11Array2232.length ^ 0xffffffff)); i_0_++)
            ((Class195) this).anInterface11Array2232[i_0_] = method1667(0, class248_sub9, class208s[class248_sub9.readUnsignedByte((byte) -62)]);
    }

    private final Interface11 method1667(int i, ByteStream class248_sub9, Class208 class208) {
        anInt2230++;
        if (class208 == Class344.aClass208_4082)
            return Class259.method2761(class248_sub9, false);
        if (Class299.aClass208_3492 == class208)
            return Class282_Sub9.method2957((byte) 51, class248_sub9);
        if (Class87.aClass208_1082 == class208)
            return Class254.method2733(class248_sub9, -108);
        if (class208 == Class352.aClass208_4189)
            return Class342.method3489((byte) 76, class248_sub9);
        if (class208 == Class94.aClass208_1224)
            return Class282_Sub26.method3028((byte) 53, class248_sub9);
        if (class208 == Class160.aClass208_1887)
            return Class52.method414((byte) 72, class248_sub9);
        if (Class226_Sub1_Sub1.aClass208_8803 == class208)
            return NPC.method3662(class248_sub9, true);
        if (i != 0)
            method1667(-94, null, null);
        if (Class276.aClass208_3207 == class208)
            return Class323.method3350(class248_sub9, 8916);
        if (class208 == Class169.aClass208_1973)
            return Class282_Sub29.method3046(class248_sub9, (byte) -37);
        if (Class377.aClass208_4621 == class208)
            return Class227.method1822(class248_sub9, 28053);
        return null;
    }

    public Class195() {
        /* empty */
    }
}
