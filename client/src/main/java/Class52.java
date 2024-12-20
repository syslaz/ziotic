/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class52 {
    int anInt701;
    int anInt702 = -1;
    static int anInt703;
    static int anInt704;
    int[] anIntArray705;
    static int anInt706;
    static int anInt707;
    static int anInt708;
    static Class179 aClass179_709 = new Class179(8);

    public static void method411(int i) {
        if (i != -21322)
            aClass179_709 = null;
        aClass179_709 = null;
    }

    static final boolean method412(int i, byte i_0_, int i_1_) {
        anInt704++;
        if (i_0_ != -35)
            method414((byte) -20, null);
        return ((Class198.method1675(-107, i_1_, i) | Class346_Sub7_Sub2_Sub3.method3621((byte) -28, i_1_, i) | Class346_Sub7_Sub5.method3690(i_0_ ^ ~0x5c14, i_1_, i)) & ByteStream.method2172(i, true, i_1_));
    }

    static final void method413(boolean bool, ha var_ha) {
        anInt708++;
        if (bool != false)
            method411(-116);
        if (Class240.aBoolean2682)
            Class86_Sub1.method657(false, var_ha);
        else
            Class227.method1821(var_ha, (byte) -59);
    }

    static final Class225_Sub3 method414(byte i, ByteStream class248_sub9) {
        anInt706++;
        Class225 class225 = Class358.method3798(117, class248_sub9);
        if (i <= 51)
            method411(81);
        int i_2_ = class248_sub9.readInt(false);
        int i_3_ = class248_sub9.readInt(false);
        int i_4_ = class248_sub9.readShort(-1);
        return new Class225_Sub3(((Class225) class225).aClass186_4993, ((Class225) class225).aClass272_4994, ((Class225) class225).anInt4992, ((Class225) class225).anInt4999, ((Class225) class225).anInt5000, ((Class225) class225).anInt5002, ((Class225) class225).anInt4997, ((Class225) class225).anInt5001, ((Class225) class225).anInt4995, i_2_, i_3_, i_4_);
    }

    private final void method415(int i, ByteStream class248_sub9, boolean bool) {
        if (bool != true)
            aClass179_709 = null;
        anInt707++;
        if (i != 1) {
            if ((i ^ 0xffffffff) == -3) {
                ((Class52) this).anIntArray705 = new int[class248_sub9.readUnsignedByte((byte) -15)];
                for (int i_5_ = 0; ((i_5_ ^ 0xffffffff) > (((Class52) this).anIntArray705.length ^ 0xffffffff)); i_5_++)
                    ((Class52) this).anIntArray705[i_5_] = class248_sub9.readShort(-1);
            } else if (i == 3)
                ((Class52) this).anInt702 = class248_sub9.readUnsignedByte((byte) 94);
        } else
            ((Class52) this).anInt701 = class248_sub9.readShort(-1);
    }

    public Class52() {
        ((Class52) this).anInt701 = -1;
    }

    final void method416(int i, ByteStream class248_sub9) {
        for (; ; ) {
            int i_6_ = class248_sub9.readUnsignedByte((byte) -22);
            if (i_6_ == 0)
                break;
            method415(i_6_, class248_sub9, true);
        }
        anInt703++;
        if (i != -5224)
            method416(97, null);
    }
}
