/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class265 {
    private short[] aShortArray3000;
    static int anInt3001;
    private int[] anIntArray3002;
    private short[] aShortArray3003;
    static int anInt3004;
    static int anInt3005;
    private short[] aShortArray3006;
    static int anInt3007;
    private int[] anIntArray3008 = {-1, -1, -1, -1, -1};
    private short[] aShortArray3009;
    Class172 aClass172_3010;
    static int anInt3011;
    static int anInt3012;
    static int anInt3013;

    final boolean method2777(byte i) {
        anInt3011++;
        if (anIntArray3002 == null)
            return true;
        int i_0_ = 28 % ((53 - i) / 54);
        boolean bool = true;
        synchronized (((Class172) ((Class265) this).aClass172_3010).aClass381_1990) {
            for (int i_1_ = 0; (anIntArray3002.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
                if (!((Class172) ((Class265) this).aClass172_3010).aClass381_1990.method3915(54, 0, anIntArray3002[i_1_]))
                    bool = false;
            }
        }
        return bool;
    }

    final Class343 method2778(int i) {
        anInt3007++;
        Class343[] class343s = new Class343[5];
        int i_2_ = 0;
        synchronized (((Class172) ((Class265) this).aClass172_3010).aClass381_1990) {
            for (int i_3_ = 0; i_3_ < 5; i_3_++) {
                if (anIntArray3008[i_3_] != -1)
                    class343s[i_2_++] = OutgoingOpcode.method1513(0, (((Class172) (((Class265) this).aClass172_3010)).aClass381_1990), -106, anIntArray3008[i_3_]);
            }
        }
        for (int i_4_ = 0; i_4_ < 5; i_4_++) {
            if (class343s[i_4_] != null && (((Class343) class343s[i_4_]).anInt4053 ^ 0xffffffff) > -14)
                class343s[i_4_].method3497((byte) 1, 2);
        }
        Class343 class343 = new Class343(class343s, i_2_);
        if (i <= 60)
            aShortArray3009 = null;
        if (aShortArray3000 != null) {
            for (int i_5_ = 0; aShortArray3000.length > i_5_; i_5_++)
                class343.method3509(aShortArray3009[i_5_], (byte) -119, aShortArray3000[i_5_]);
        }
        if (aShortArray3003 != null) {
            for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (aShortArray3003.length ^ 0xffffffff); i_6_++)
                class343.method3511((byte) 124, aShortArray3003[i_6_], aShortArray3006[i_6_]);
        }
        return class343;
    }

    final void method2779(ByteStream class248_sub9, int i) {
        anInt3005++;
        if (i != -1)
            method2777((byte) 62);
        for (; ; ) {
            int i_7_ = class248_sub9.readUnsignedByte((byte) 105);
            if ((i_7_ ^ 0xffffffff) == -1)
                break;
            method2783(class248_sub9, i ^ 0x3c, i_7_);
        }
    }

    static final boolean method2780(int i, int i_8_, byte i_9_) {
        anInt3012++;
        int i_10_ = -96 / ((i_9_ - 73) / 52);
        if (!((0x70000 & i) != 0 | Class198.method1675(-117, i_8_, i)) && !Class52.method412(i, (byte) -35, i_8_))
            return false;
        return true;
    }

    final Class343 method2781(int i) {
        anInt3004++;
        if (anIntArray3002 == null)
            return null;
        Class343[] class343s = new Class343[anIntArray3002.length];
        synchronized (((Class172) ((Class265) this).aClass172_3010).aClass381_1990) {
            int i_11_ = 51 / ((15 - i) / 35);
            for (int i_12_ = 0; (anIntArray3002.length ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++)
                class343s[i_12_] = OutgoingOpcode.method1513(0, (((Class172) ((Class265) this).aClass172_3010).aClass381_1990), -106, anIntArray3002[i_12_]);
        }
        for (int i_13_ = 0; i_13_ < anIntArray3002.length; i_13_++) {
            if ((((Class343) class343s[i_13_]).anInt4053 ^ 0xffffffff) > -14)
                class343s[i_13_].method3497((byte) 1, 2);
        }
        Class343 class343;
        if (class343s.length != 1)
            class343 = new Class343(class343s, class343s.length);
        else
            class343 = class343s[0];
        if (class343 == null)
            return null;
        if (aShortArray3000 != null) {
            for (int i_14_ = 0; aShortArray3000.length > i_14_; i_14_++)
                class343.method3509(aShortArray3009[i_14_], (byte) -119, aShortArray3000[i_14_]);
        }
        if (aShortArray3003 != null) {
            for (int i_15_ = 0; aShortArray3003.length > i_15_; i_15_++)
                class343.method3511((byte) 116, aShortArray3003[i_15_], aShortArray3006[i_15_]);
        }
        return class343;
    }

    final boolean method2782(byte i) {
        anInt3001++;
        if (i != -123)
            method2780(47, 111, (byte) -25);
        boolean bool = true;
        synchronized (((Class172) ((Class265) this).aClass172_3010).aClass381_1990) {
            for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -6; i_16_++) {
                if ((anIntArray3008[i_16_] ^ 0xffffffff) != 0 && !((Class172) ((Class265) this).aClass172_3010).aClass381_1990.method3915(96, 0, anIntArray3008[i_16_]))
                    bool = false;
            }
        }
        return bool;
    }

    private final void method2783(ByteStream class248_sub9, int i, int i_17_) {
        anInt3013++;
        if ((i_17_ ^ 0xffffffff) == -2)
            class248_sub9.readUnsignedByte((byte) -73);
        else if ((i_17_ ^ 0xffffffff) == -3) {
            int i_18_ = class248_sub9.readUnsignedByte((byte) -85);
            anIntArray3002 = new int[i_18_];
            for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
                anIntArray3002[i_19_] = class248_sub9.readShort(-1);
        } else if (i_17_ != 3) {
            if ((i_17_ ^ 0xffffffff) != -41) {
                if ((i_17_ ^ 0xffffffff) == -42) {
                    int i_20_ = class248_sub9.readUnsignedByte((byte) 119);
                    aShortArray3006 = new short[i_20_];
                    aShortArray3003 = new short[i_20_];
                    for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
                        aShortArray3003[i_21_] = (short) class248_sub9.readShort(-1);
                        aShortArray3006[i_21_] = (short) class248_sub9.readShort(i + 60);
                    }
                } else if ((i_17_ ^ 0xffffffff) <= -61 && i_17_ < 70)
                    anIntArray3008[-60 + i_17_] = class248_sub9.readShort(-1);
            } else {
                int i_22_ = class248_sub9.readUnsignedByte((byte) 76);
                aShortArray3000 = new short[i_22_];
                aShortArray3009 = new short[i_22_];
                for (int i_23_ = 0; i_22_ > i_23_; i_23_++) {
                    aShortArray3000[i_23_] = (short) class248_sub9.readShort(-1);
                    aShortArray3009[i_23_] = (short) class248_sub9.readShort(-1);
                }
            }
        }
        if (i != -61)
            ((Class265) this).aClass172_3010 = null;
    }

    public Class265() {
        /* empty */
    }
}
