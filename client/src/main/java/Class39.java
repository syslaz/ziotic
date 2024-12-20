/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class39 {
    static int anInt426;
    static int anInt427;
    static int anInt428;
    private Class381 aClass381_429;
    static int anInt430;
    static IncommingOpcode aIncommingOpcode_431;
    static int anInt432;
    static int anInt433;
    private Class278 aClass278_434 = new Class278(64);
    static int[] anIntArray435 = new int[3];
    Class381 aClass381_436;
    static int anInt437;
    Class278 aClass278_438 = new Class278(64);

    static final void method289(int i, byte[] is) {
        anInt430++;
        if (i > 115) {
            ByteStream class248_sub9 = new ByteStream(is);
            for (; ; ) {
                int i_0_ = class248_sub9.readUnsignedByte((byte) 83);
                if (i_0_ == 0)
                    break;
                if ((i_0_ ^ 0xffffffff) == -2) {
                    int[] is_1_ = Class282_Sub28.anIntArray7887 = new int[6];
                    is_1_[0] = class248_sub9.readShort(-1);
                    is_1_[1] = class248_sub9.readShort(-1);
                    is_1_[2] = class248_sub9.readShort(-1);
                    is_1_[3] = class248_sub9.readShort(-1);
                    is_1_[4] = class248_sub9.readShort(-1);
                    is_1_[5] = class248_sub9.readShort(-1);
                } else if ((i_0_ ^ 0xffffffff) != -5) {
                    if (i_0_ == 5) {
                        int i_2_ = class248_sub9.readUnsignedByte((byte) 79);
                        Class282_Sub23.anIntArray7830 = new int[i_2_];
                        for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
                            Class282_Sub23.anIntArray7830[i_3_] = class248_sub9.readShort(-1);
                            if ((Class282_Sub23.anIntArray7830[i_3_] ^ 0xffffffff) == -65536)
                                Class282_Sub23.anIntArray7830[i_3_] = -1;
                        }
                    }
                } else {
                    int i_4_ = class248_sub9.readUnsignedByte((byte) 108);
                    client.anIntArray5241 = new int[i_4_];
                    for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
                        client.anIntArray5241[i_5_] = class248_sub9.readShort(-1);
                        if ((client.anIntArray5241[i_5_] ^ 0xffffffff) == -65536)
                            client.anIntArray5241[i_5_] = -1;
                    }
                }
            }
        }
    }

    final void method290(int i, int i_6_, int i_7_) {
        if (i != 1)
            anInt427 = -100;
        anInt426++;
        aClass278_434 = new Class278(i_7_);
        ((Class39) this).aClass278_438 = new Class278(i_6_);
    }

    final void method291(int i) {
        synchronized (aClass278_434) {
            aClass278_434.method2872((byte) -78);
        }
        anInt428++;
        synchronized (((Class39) this).aClass278_438) {
            if (i != 3)
                method290(-99, -39, 9);
            ((Class39) this).aClass278_438.method2872((byte) -78);
        }
    }

    final void method292(byte i) {
        if (i != -64)
            method293(-60, -11);
        synchronized (aClass278_434) {
            aClass278_434.method2869(0);
        }
        anInt437++;
        synchronized (((Class39) this).aClass278_438) {
            ((Class39) this).aClass278_438.method2869(0);
        }
    }

    final Class61 method293(int i, int i_8_) {
        anInt432++;
        Class61 class61;
        synchronized (aClass278_434) {
            class61 = (Class61) aClass278_434.method2863(4, (long) i);
        }
        if (class61 != null)
            return class61;
        byte[] is;
        synchronized (aClass381_429) {
            is = aClass381_429.method3922((byte) 120, 34, i);
        }
        class61 = new Class61();
        ((Class61) class61).aClass39_823 = this;
        if (is != null)
            class61.method477(new ByteStream(is), (byte) -124);
        synchronized (aClass278_434) {
            aClass278_434.method2867((byte) 0, (long) i, class61);
            if (i_8_ < 101)
                aIncommingOpcode_431 = null;
        }
        return class61;
    }

    public static void method294(byte i) {
        if (i >= -30)
            method289(-26, null);
        anIntArray435 = null;
        aIncommingOpcode_431 = null;
    }

    final void method295(int i, int i_9_) {
        synchronized (aClass278_434) {
            aClass278_434.method2864(i, -15782);
            if (i_9_ != 2)
                aIncommingOpcode_431 = null;
        }
        anInt433++;
        synchronized (((Class39) this).aClass278_438) {
            ((Class39) this).aClass278_438.method2864(i, -15782);
        }
    }

    Class39(Class215 class215, int i, Class381 class381, Class381 class381_10_) {
        ((Class39) this).aClass381_436 = class381_10_;
        aClass381_429 = class381;
        aClass381_429.method3899(34, 0);
    }

    static {
        aIncommingOpcode_431 = new IncommingOpcode(9, 2);
    }
}
