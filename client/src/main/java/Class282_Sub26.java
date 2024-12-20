/* Class282_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub26 extends Class282 {
    static int anInt7858;
    static int anInt7859;
    static int anInt7860;
    static int anInt7861;
    static int anInt7862;
    static int anInt7863;
    static int anInt7864;
    static int anInt7865;
    static int anInt7866;

    Class282_Sub26(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final void method2918(byte i) {
        if (i != 98)
            method2917(-114, 111);
        anInt7864++;
        if (((Class282) this).aClass248_Sub45_3321.method2644(0))
            ((Class282) this).anInt3320 = 0;
        if (((Class282) this).anInt3320 != 1 && (((Class282) this).anInt3320 ^ 0xffffffff) != -1)
            ((Class282) this).anInt3320 = method2919(false);
    }

    static final Class297 method3028(byte i, ByteStream class248_sub9) {
        anInt7861++;
        if (i != 53)
            anInt7860 = 94;
        int i_0_ = class248_sub9.readShort(-1);
        Class186 class186 = (Class136_Sub2.method1259(-1)[class248_sub9.readUnsignedByte((byte) 79)]);
        Class272 class272 = (Class359.method3805(i ^ ~0x3275)[class248_sub9.readUnsignedByte((byte) -116)]);
        int i_1_ = class248_sub9.readUnsignedShort((byte) -10);
        int i_2_ = class248_sub9.readUnsignedShort((byte) -10);
        return new Class297(i_0_, class186, class272, i_1_, i_2_);
    }

    Class282_Sub26(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    final int method2919(boolean bool) {
        anInt7862++;
        if (bool != false)
            method2919(true);
        return 1;
    }

    final boolean method3029(int i) {
        if (i != 260)
            return false;
        anInt7859++;
        if (((Class282) this).aClass248_Sub45_3321.method2644(0))
            return false;
        return true;
    }

    final void method2922(boolean bool, int i) {
        if (bool != true)
            anInt7860 = -103;
        ((Class282) this).anInt3320 = i;
        anInt7866++;
    }

    static final void method3030(byte i, RSInterface2 class354) {
        if (i == -24) {
            anInt7865++;
            if (((RSInterface2) class354).anInt4284 == 5 && ((RSInterface2) class354).id != -1)
                Class84.method598((byte) -117, class354, Class287.aHa3381);
        }
    }

    final int method3031(boolean bool) {
        anInt7863++;
        if (bool != true)
            return -71;
        return ((Class282) this).anInt3320;
    }

    final int method2917(int i, int i_3_) {
        anInt7858++;
        if (((Class282) this).aClass248_Sub45_3321.method2644(i))
            return 3;
        return 1;
    }
}
