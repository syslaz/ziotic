/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class303 {
    int anInt3508;
    static int anInt3509;
    static int anInt3510;
    int anInt3511 = 0;
    int anInt3512;
    private boolean aBoolean3513 = false;
    int anInt3514;
    private int anInt3515;
    long aLong3516;
    static int anInt3517;
    static int anInt3518;
    int anInt3519;
    int anInt3520;
    int anInt3521;
    static Class381 aClass381_3522;
    int anInt3523;
    static int anInt3524;
    int anInt3525 = 0;
    int anInt3526;
    static int[] anIntArray3527 = new int[3];
    int anInt3528;

    public static void method3201(boolean bool) {
        if (bool != false)
            aClass381_3522 = null;
        anIntArray3527 = null;
        aClass381_3522 = null;
    }

    final void method3202(ByteStream class248_sub9, int i) {
        if (i != -1)
            ((Class303) this).anInt3521 = -113;
        anInt3517++;
        for (; ; ) {
            int i_0_ = class248_sub9.readUnsignedByte((byte) -109);
            if ((i_0_ ^ 0xffffffff) == -1)
                break;
            method3206(i_0_, i ^ ~0x1, class248_sub9);
        }
    }

    final void method3203(int i) {
        ((Class303) this).anInt3521 = Node_Sub9_Sub1.anIntArray9109[anInt3515 << -402788797];
        anInt3509++;
        long l = (long) ((Class303) this).anInt3519;
        long l_1_ = (long) ((Class303) this).anInt3512;
        long l_2_ = (long) ((Class303) this).anInt3523;
        if (i != 14143)
            method3205(-95);
        ((Class303) this).anInt3514 = (int) Math.sqrt((double) (l * l + (l_1_ * l_1_ + l_2_ * l_2_)));
        if ((((Class303) this).anInt3528 ^ 0xffffffff) == -1)
            ((Class303) this).anInt3528 = 1;
        if (((Class303) this).anInt3508 != 0) {
            if (((Class303) this).anInt3508 != 1) {
                if ((((Class303) this).anInt3508 ^ 0xffffffff) == -3)
                    ((Class303) this).aLong3516 = (long) (8 * ((Class303) this).anInt3514 / ((Class303) this).anInt3528);
            } else {
                ((Class303) this).aLong3516 = (long) (8 * ((Class303) this).anInt3514 / ((Class303) this).anInt3528);
                ((Class303) this).aLong3516 *= ((Class303) this).aLong3516;
            }
        } else
            ((Class303) this).aLong3516 = 2147483647L;
        if (aBoolean3513)
            ((Class303) this).anInt3514 *= -1;
    }

    static final boolean method3204(String string, int i) {
        if (i != 10)
            aClass381_3522 = null;
        anInt3510++;
        return Class162.method1434(string, 48, true, 10);
    }

    static final void method3205(int i) {
        for (Node_Sub22 class248_sub22 = ((Node_Sub22) Node_Sub14_Sub35.aClass65_9540.method510(true)); class248_sub22 != null; class248_sub22 = ((Node_Sub22) Node_Sub14_Sub35.aClass65_9540.method512(false)))
            Class282_Sub4.method2933(i ^ 0x7218, (((Node_Sub22) class248_sub22).anInt7080));
        if (i != 20502)
            method3205(-95);
        anInt3518++;
    }

    private final void method3206(int i, int i_3_, ByteStream class248_sub9) {
        if (i_3_ == i)
            anInt3515 = class248_sub9.readShort(-1);
        else if ((i ^ 0xffffffff) != -3) {
            if (i == 3) {
                ((Class303) this).anInt3519 = class248_sub9.readInt(false);
                ((Class303) this).anInt3512 = class248_sub9.readInt(false);
                ((Class303) this).anInt3523 = class248_sub9.readInt(false);
            } else if (i == 4) {
                ((Class303) this).anInt3508 = class248_sub9.readUnsignedByte((byte) -16);
                ((Class303) this).anInt3528 = class248_sub9.readInt(false);
            } else if (i == 6)
                ((Class303) this).anInt3520 = class248_sub9.readUnsignedByte((byte) 93);
            else if ((i ^ 0xffffffff) == -9)
                ((Class303) this).anInt3525 = 1;
            else if ((i ^ 0xffffffff) == -10)
                ((Class303) this).anInt3511 = 1;
            else if (i == 10)
                aBoolean3513 = true;
        } else
            class248_sub9.readUnsignedByte((byte) -93);
        anInt3524++;
    }

    public Class303() {
        /* empty */
    }
}
