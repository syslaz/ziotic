/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class134 {
    private static byte[] aByteArray1623 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteStream aClass248_Sub9_1624;
    int[] anIntArray1625;
    private int[] anIntArray1626;
    private int[] anIntArray1627;
    private int anInt1628;
    private long aLong1629;
    int anInt1630;
    private int[] anIntArray1631;

    final void method1222(byte[] is) {
        ((ByteStream) aClass248_Sub9_1624).buffer = is;
        ((ByteStream) aClass248_Sub9_1624).offset = 10;
        int i = aClass248_Sub9_1624.readShort(-1);
        ((Class134) this).anInt1630 = aClass248_Sub9_1624.readShort(-1);
        anInt1628 = 500000;
        anIntArray1631 = new int[i];
        int i_0_ = 0;
        while (i_0_ < i) {
            int i_1_ = aClass248_Sub9_1624.readInt(false);
            int i_2_ = aClass248_Sub9_1624.readInt(false);
            if (i_1_ == 1297379947) {
                anIntArray1631[i_0_] = ((ByteStream) aClass248_Sub9_1624).offset;
                i_0_++;
            }
            ((ByteStream) aClass248_Sub9_1624).offset += i_2_;
        }
        aLong1629 = 0L;
        anIntArray1626 = new int[i];
        for (int i_3_ = 0; i_3_ < i; i_3_++)
            anIntArray1626[i_3_] = anIntArray1631[i_3_];
        ((Class134) this).anIntArray1625 = new int[i];
        anIntArray1627 = new int[i];
    }

    public static void method1223() {
        aByteArray1623 = null;
    }

    final int method1224(int i) {
        int i_4_ = method1230(i);
        return i_4_;
    }

    final int method1225() {
        int i = anIntArray1626.length;
        int i_5_ = -1;
        int i_6_ = 2147483647;
        for (int i_7_ = 0; i_7_ < i; i_7_++) {
            if (anIntArray1626[i_7_] >= 0 && ((Class134) this).anIntArray1625[i_7_] < i_6_) {
                i_5_ = i_7_;
                i_6_ = ((Class134) this).anIntArray1625[i_7_];
            }
        }
        return i_5_;
    }

    final void method1226(int i) {
        anIntArray1626[i] = ((ByteStream) aClass248_Sub9_1624).offset;
    }

    final long method1227(int i) {
        return aLong1629 + (long) i * (long) anInt1628;
    }

    final boolean method1228() {
        if (((ByteStream) aClass248_Sub9_1624).buffer == null)
            return false;
        return true;
    }

    final int method1229() {
        return anIntArray1626.length;
    }

    private final int method1230(int i) {
        int i_8_ = (((ByteStream) aClass248_Sub9_1624).buffer[((ByteStream) aClass248_Sub9_1624).offset]);
        if (i_8_ < 0) {
            i_8_ &= 0xff;
            anIntArray1627[i] = i_8_;
            ((ByteStream) aClass248_Sub9_1624).offset++;
        } else
            i_8_ = anIntArray1627[i];
        if (i_8_ == 240 || i_8_ == 247) {
            int i_9_ = aClass248_Sub9_1624.method2164(-125749561);
            if (i_8_ == 247 && i_9_ > 0) {
                int i_10_ = ((((ByteStream) aClass248_Sub9_1624).buffer[((ByteStream) aClass248_Sub9_1624).offset]) & 0xff);
                if (i_10_ >= 241 && i_10_ <= 243 || i_10_ == 246 || i_10_ == 248 || i_10_ >= 250 && i_10_ <= 252 || i_10_ == 254) {
                    ((ByteStream) aClass248_Sub9_1624).offset++;
                    anIntArray1627[i] = i_10_;
                    return method1235(i, i_10_);
                }
            }
            ((ByteStream) aClass248_Sub9_1624).offset += i_9_;
            return 0;
        }
        return method1235(i, i_8_);
    }

    final void method1231(int i) {
        int i_11_ = aClass248_Sub9_1624.method2164(-125749561);
        ((Class134) this).anIntArray1625[i] += i_11_;
    }

    final void method1232(long l) {
        aLong1629 = l;
        int i = anIntArray1626.length;
        for (int i_12_ = 0; i_12_ < i; i_12_++) {
            ((Class134) this).anIntArray1625[i_12_] = 0;
            anIntArray1627[i_12_] = 0;
            ((ByteStream) aClass248_Sub9_1624).offset = anIntArray1631[i_12_];
            method1231(i_12_);
            anIntArray1626[i_12_] = ((ByteStream) aClass248_Sub9_1624).offset;
        }
    }

    final boolean method1233() {
        int i = anIntArray1626.length;
        for (int i_13_ = 0; i_13_ < i; i_13_++) {
            if (anIntArray1626[i_13_] >= 0)
                return false;
        }
        return true;
    }

    final void method1234() {
        ((ByteStream) aClass248_Sub9_1624).offset = -1;
    }

    private final int method1235(int i, int i_14_) {
        if (i_14_ == 255) {
            int i_15_ = aClass248_Sub9_1624.readUnsignedByte((byte) 104);
            int i_16_ = aClass248_Sub9_1624.method2164(-125749561);
            if (i_15_ == 47) {
                ((ByteStream) aClass248_Sub9_1624).offset += i_16_;
                return 1;
            }
            if (i_15_ == 81) {
                int i_17_ = aClass248_Sub9_1624.method2221(255);
                i_16_ -= 3;
                int i_18_ = ((Class134) this).anIntArray1625[i];
                aLong1629 += (long) i_18_ * (long) (anInt1628 - i_17_);
                anInt1628 = i_17_;
                ((ByteStream) aClass248_Sub9_1624).offset += i_16_;
                return 2;
            }
            ((ByteStream) aClass248_Sub9_1624).offset += i_16_;
            return 3;
        }
        byte i_19_ = aByteArray1623[i_14_ - 128];
        int i_20_ = i_14_;
        if (i_19_ >= 1)
            i_20_ |= aClass248_Sub9_1624.readUnsignedByte((byte) 127) << 8;
        if (i_19_ >= 2)
            i_20_ |= aClass248_Sub9_1624.readUnsignedByte((byte) -87) << 16;
        return i_20_;
    }

    final void method1236(int i) {
        ((ByteStream) aClass248_Sub9_1624).offset = anIntArray1626[i];
    }

    final void method1237() {
        ((ByteStream) aClass248_Sub9_1624).buffer = null;
        anIntArray1631 = null;
        anIntArray1626 = null;
        ((Class134) this).anIntArray1625 = null;
        anIntArray1627 = null;
    }

    public Class134() {
        aClass248_Sub9_1624 = new ByteStream(null);
    }

    Class134(byte[] is) {
        aClass248_Sub9_1624 = new ByteStream(null);
        method1222(is);
    }
}
