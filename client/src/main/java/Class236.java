/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class236 {
    int anInt2622 = 2;
    int anInt2623 = -1;
    boolean aBoolean2624;
    static int anInt2625;
    int anInt2626;
    int anInt2627 = 64;
    int anInt2628 = 1;
    static int anInt2629;
    static int anInt2630;
    boolean aBoolean2631 = false;
    static String[][] aStringArrayArray2632 = {{"M1", "M2", "S1", "F"}, {"M1", "M2", "M3", "S1", "S2", "F"}, {"M1", "M2", "M3", "M4", "S1", "S2", "S3", "F"}};

    private final void method1849(ByteStream class248_sub9, byte i, int i_0_, int i_1_) {
        if ((i_0_ ^ 0xffffffff) == -2) {
            ((Class236) this).anInt2623 = class248_sub9.readShort(-1);
            if ((((Class236) this).anInt2623 ^ 0xffffffff) == -65536)
                ((Class236) this).anInt2623 = -1;
        } else if ((i_0_ ^ 0xffffffff) != -3) {
            if ((i_0_ ^ 0xffffffff) != -4) {
                if (i_0_ != 4) {
                    if ((i_0_ ^ 0xffffffff) != -6) {
                        if ((i_0_ ^ 0xffffffff) != -7) {
                            if (i_0_ == 7)
                                ((Class236) this).aBoolean2631 = true;
                        } else
                            ((Class236) this).aBoolean2624 = true;
                    } else
                        ((Class236) this).anInt2628 = class248_sub9.readUnsignedByte((byte) 126);
                } else
                    ((Class236) this).anInt2622 = class248_sub9.readUnsignedByte((byte) 85);
            } else
                class248_sub9.readByte(123);
        } else {
            ((Class236) this).anInt2627 = 1 + class248_sub9.readShort(-1);
            ((Class236) this).anInt2626 = 1 + class248_sub9.readShort(-1);
        }
        if (i > -86)
            ((Class236) this).anInt2622 = -88;
        anInt2630++;
    }

    final void method1850(ByteStream class248_sub9, int i, int i_2_) {
        if (i_2_ == 0) {
            anInt2625++;
            for (; ; ) {
                int i_3_ = class248_sub9.readUnsignedByte((byte) 82);
                if (i_3_ == 0)
                    break;
                method1849(class248_sub9, (byte) -92, i_3_, i);
            }
        }
    }

    public static void method1851(int i) {
        aStringArrayArray2632 = null;
        if (i != -2)
            method1851(119);
    }

    public Class236() {
        ((Class236) this).aBoolean2624 = false;
        ((Class236) this).anInt2626 = 64;
    }
}
