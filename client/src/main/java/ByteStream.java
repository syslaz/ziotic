/* Class248_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;

class ByteStream extends Node {
    static int anInt6875;
    static int anInt6876;
    static int anInt6877;
    static int anInt6878;
    static String aString6879;
    static int anInt6880;
    static int anInt6881;
    static int anInt6882;
    static int anInt6883;
    static int anInt6884;
    byte[] buffer;
    static long aLong6886 = 20000000L;
    static int anInt6887;
    static int anInt6888;
    static int anInt6889;
    static int anInt6890;
    static int anInt6891;
    static int anInt6892;
    static int anInt6893;
    static int anInt6894;
    static int anInt6895;
    static int anInt6896;
    static int anInt6897;
    static int anInt6898;
    static int anInt6899;
    static int anInt6900;
    static int anInt6901;
    static int anInt6902;
    static int anInt6903;
    static int anInt6904;
    int offset;
    static int anInt6906;
    static int anInt6907;
    static int anInt6908;
    static int anInt6909;
    static int anInt6910;
    static int anInt6911;
    static int anInt6912;
    static int anInt6913;
    static int anInt6914;
    static int anInt6915;
    static int anInt6916;
    static int anInt6917;
    static int anInt6918;
    static int anInt6919;
    static int anInt6920;
    static int anInt6921;
    static int anInt6922;
    static int anInt6923;
    static int anInt6924;
    static int anInt6925;
    static int anInt6926;
    static int anInt6927;
    static int anInt6928;
    static int anInt6929;
    static int anInt6930;
    static int anInt6931;
    static int anInt6932;
    static int anInt6933;
    static int anInt6934;
    static int anInt6935;
    static int anInt6936;
    static int anInt6937;
    static int anInt6938;
    static int anInt6939;
    static int anInt6940;
    static int anInt6941;
    static int anInt6942;
    static int anInt6943;
    static int anInt6944;
    static int anInt6945;

    final byte readByteC(byte i) {
        anInt6932++;
        if (i <= 90)
            aLong6886 = 100L;
        return (byte) -(((ByteStream) this).buffer[((ByteStream) this).offset++]);
    }

    final int method2157(byte i) {
        int i_0_ = -67 % ((i - 47) / 62);
        ((ByteStream) this).offset += 3;
        anInt6877++;
        return ((0xff & (((ByteStream) this).buffer[((ByteStream) this).offset - 2])) + (((((ByteStream) this).buffer[((ByteStream) this).offset - 3]) & 0xff) << 1557826832) + (0xff00 & (((ByteStream) this).buffer[-1 + ((ByteStream) this).offset]) << 1056245160));
    }

    final void method2158(int i, int i_1_) {
        anInt6880++;
        if (i >= 0 && i < 128)
            writeByte(-67, i);
        else if (i_1_ == 1182187312) {
            if (i >= 0 && (i ^ 0xffffffff) > -32769)
                writeShort(1182, i + 32768);
            else
                throw new IllegalArgumentException();
        }
    }

    final int readUnsignedShort(byte i) {
        anInt6921++;
        ((ByteStream) this).offset += 2;
        int i_2_ = (((0xff & (((ByteStream) this).buffer[((ByteStream) this).offset - 2])) << 8) - -((((ByteStream) this).buffer[-1 + ((ByteStream) this).offset]) & 0xff));
        if (i_2_ > 32767)
            i_2_ -= 65536;
        if (i != -10)
            readShortA(112);
        return i_2_;
    }

    final void writeLEShortA(int i, int i_3_) {
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (128 + i);
        anInt6914++;
        if (i_3_ != -231665880)
            ((ByteStream) this).offset = -23;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i >> -231665880);
    }

    final void method2161(int i, int i_4_) {
        ((ByteStream) this).buffer[-i + ((ByteStream) this).offset - 4] = (byte) (i >> -1786960680);
        anInt6940++;
        ((ByteStream) this).buffer[-3 + (-i + ((ByteStream) this).offset)] = (byte) (i >> 566984176);
        ((ByteStream) this).buffer[-2 + (((ByteStream) this).offset + -i)] = (byte) (i >> -2069575864);
        ((ByteStream) this).buffer[-1 + ((ByteStream) this).offset - i] = (byte) i;
        if (i_4_ != -2069575864)
            writeLong(-124, 66L);
    }

    final void method2162(long l, int i, int i_5_) {
        i--;
        int i_6_ = -63 / ((6 - i_5_) / 58);
        anInt6922++;
        if (i < 0 || (i ^ 0xffffffff) < -8)
            throw new IllegalArgumentException();
        for (int i_7_ = i * 8; i_7_ >= 0; i_7_ -= 8)
            ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (int) (l >> i_7_);
    }

    final long method2163(int i, int i_8_) {
        anInt6936++;
        if (--i < 0 || (i ^ 0xffffffff) < -8)
            throw new IllegalArgumentException();
        if (i_8_ != 255)
            return -72L;
        int i_9_ = 8 * i;
        long l = 0L;
        for (/**/; i_9_ >= 0; i_9_ -= 8)
            l |= ((long) (((ByteStream) this).buffer[((ByteStream) this).offset++]) & 0xffL) << i_9_;
        return l;
    }

    final int method2164(int i) {
        anInt6943++;
        int i_10_ = (((ByteStream) this).buffer[((ByteStream) this).offset++]);
        if (i != -125749561)
            return -8;
        int i_11_ = 0;
        for (/**/; (i_10_ ^ 0xffffffff) > -1; i_10_ = (((ByteStream) this).buffer[((ByteStream) this).offset++]))
            i_11_ = (i_11_ | 0x7f & i_10_) << -125749561;
        return i_11_ | i_10_;
    }

    final int readInt1(byte i) {
        ((ByteStream) this).offset += 4;
        anInt6935++;
        if (i >= -25)
            return 20;
        return (((0xff & (((ByteStream) this).buffer[-1 + ((ByteStream) this).offset])) << -460789616) + (((0xff & (((ByteStream) this).buffer[((ByteStream) this).offset - 2])) << 443764440) + (((((ByteStream) this).buffer[((ByteStream) this).offset - 4]) & 0xff) << -1107435448) - -((((ByteStream) this).buffer[((ByteStream) this).offset - 3]) & 0xff)));
    }

    final void writeLEInt(byte i, int i_12_) {
        anInt6937++;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) i_12_;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_12_ >> 1881764744);
        if (i <= 103)
            aString6879 = null;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_12_ >> 1242116272);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_12_ >> 2127818264);
    }

    final void method2167(int i, int[] is, boolean bool, int i_13_) {
        if (bool != false)
            aLong6886 = 104L;
        anInt6876++;
        int i_14_ = ((ByteStream) this).offset;
        ((ByteStream) this).offset = i_13_;
        int i_15_ = (-i_13_ + i) / 8;
        for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_16_++) {
            int i_17_ = readInt(false);
            int i_18_ = readInt(false);
            int i_19_ = -957401312;
            int i_20_ = -1640531527;
            int i_21_ = 32;
            while ((i_21_-- ^ 0xffffffff) < -1) {
                i_18_ -= (i_17_ + (i_17_ >>> 1359682725 ^ i_17_ << 121505636) ^ i_19_ + is[i_19_ >>> 514276811 & 0x61200003]);
                i_19_ -= i_20_;
                i_17_ -= is[i_19_ & 0x3] + i_19_ ^ ((i_18_ >>> -276279867 ^ i_18_ << -1061281308) + i_18_);
            }
            ((ByteStream) this).offset -= 8;
            writeInt(27695, i_17_);
            writeInt(27695, i_18_);
        }
        ((ByteStream) this).offset = i_14_;
    }

    final void writeShortA(int i, int i_22_) {
        anInt6925++;
        if (i_22_ < 39)
            writeInt2((byte) 92, -92);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i >> 275591304);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i - -128);
    }

    final void writeLEShort(boolean bool, int i) {
        if (bool != true)
            aString6879 = null;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) i;
        anInt6939++;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i >> -1081622744);
    }

    final int readUnsignedLEShortA(int i) {
        anInt6933++;
        ((ByteStream) this).offset += 2;
        if (i != 128)
            ((ByteStream) this).offset = -108;
        return (((((ByteStream) this).buffer[((ByteStream) this).offset + -1]) << 1565340936 & 0xff00) + (0xff & (((ByteStream) this).buffer[((ByteStream) this).offset - 2]) - 128));
    }

    final int readUnsignedByteA(byte i) {
        anInt6906++;
        if (i != -45)
            ((ByteStream) this).offset = -104;
        return ((((ByteStream) this).buffer[((ByteStream) this).offset++]) - 128 & 0xff);
    }

    static final boolean method2172(int i, boolean bool, int i_23_) {
        if (bool != true)
            aLong6886 = -127L;
        anInt6918++;
        if ((i & 0x800) == 0)
            return false;
        return true;
    }

    final void writeByteC(int i, byte i_24_) {
        anInt6945++;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) -i;
        if (i_24_ <= 87)
            ((ByteStream) this).offset = -35;
    }

    public static void method2174(int i) {
        aString6879 = null;
        if (i != 255)
            aLong6886 = -16L;
    }

    final void writeInt2(byte i, int i_25_) {
        if (i >= -124)
            writeInt2((byte) 21, -58);
        anInt6910++;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_25_ >> -256254128);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_25_ >> -770936808);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) i_25_;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_25_ >> -388132536);
    }

    final void writeByteA(int i, byte i_26_) {
        if (i_26_ <= 94)
            method2167(-86, null, false, 100);
        anInt6902++;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i + 128);
    }

    final void writeLEInt_(int i, int i_27_) {
        anInt6919++;
        if (i_27_ <= -91) {
            ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) i;
            ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i >> -683442648);
            ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i >> 2076962928);
            ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i >> 1043493848);
        }
    }

    final int readSmart(byte i) {
        anInt6897++;
        int i_28_ = 0xff & (((ByteStream) this).buffer[((ByteStream) this).offset]);
        if (i != 22)
            return -8;
        if (i_28_ >= 128)
            return readShort(i + -23) + -32768;
        return readUnsignedByte((byte) -22);
    }

    final int readUnsignedByteC(boolean bool) {
        anInt6912++;
        if (bool != true)
            ((ByteStream) this).buffer = null;
        return (-(((ByteStream) this).buffer[((ByteStream) this).offset++]) & 0xff);
    }

    final void method2180(byte i, int i_29_) {
        anInt6909++;
        if (i != -64)
            ((ByteStream) this).buffer = null;
        if ((~0x7f & i_29_ ^ 0xffffffff) != -1) {
            if ((i_29_ & ~0x3fff) != 0) {
                if ((i_29_ & ~0x1fffff ^ 0xffffffff) != -1) {
                    if ((i_29_ & ~0xfffffff ^ 0xffffffff) != -1)
                        writeByte(-58, i_29_ >>> 1865086108 | 0x80);
                    writeByte(i ^ 0xa, i_29_ >>> 1220263029 | 0x80);
                }
                writeByte(-48, 0x80 | i_29_ >>> 2027625294);
            }
            writeByte(-33, (i_29_ | 0x4027) >>> 1616516327);
        }
        writeByte(-102, 0x7f & i_29_);
    }

    final String readString(int i) {
        anInt6878++;
        int i_30_ = ((ByteStream) this).offset;
        if (i != 15598)
            method2206(107, -86);
        while ((((ByteStream) this).buffer[((ByteStream) this).offset++]) != 0) {
            /* empty */
        }
        int i_31_ = -i_30_ + ((ByteStream) this).offset - 1;
        if (i_31_ == 0)
            return "";
        return Class112_Sub1.method799(i_30_, i_31_, ((ByteStream) this).buffer, -80);
    }

    final String method2182(int i) {
        anInt6920++;
        if (i >= -78)
            aString6879 = null;
        if ((((ByteStream) this).buffer[((ByteStream) this).offset]) == 0) {
            ((ByteStream) this).offset++;
            return null;
        }
        return readString(15598);
    }

    final void method2183(String string, byte i) {
        anInt6915++;
        int i_32_ = string.indexOf('\0');
        if (i_32_ >= 0)
            throw new IllegalArgumentException("NUL character at " + i_32_ + " - cannot pjstr");
        ((ByteStream) this).offset += RuntimeException_Sub1.method3941(0, (((ByteStream) this).buffer), 122, string, string.length(), (((ByteStream) this).offset));
        if (i <= -62)
            ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) 0;
    }

    final void method2184(int[] is, int i, byte i_33_, int i_34_) {
        anInt6887++;
        int i_35_ = ((ByteStream) this).offset;
        ((ByteStream) this).offset = i_34_;
        int i_36_ = (-i_34_ + i) / 8;
        if (i_33_ != 112)
            method2189(null, -96, 3, 62);
        for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
            int i_38_ = readInt(false);
            int i_39_ = readInt(false);
            int i_40_ = 0;
            int i_41_ = -1640531527;
            int i_42_ = 32;
            while ((i_42_-- ^ 0xffffffff) < -1) {
                i_38_ += (i_39_ + (i_39_ >>> 1042834501 ^ i_39_ << 730216452) ^ i_40_ - -is[0x3 & i_40_]);
                i_40_ += i_41_;
                i_39_ += ((i_38_ >>> -1516429851 ^ i_38_ << 1772924964) - -i_38_ ^ i_40_ + is[(i_40_ & 0x189d) >>> -1518901717]);
            }
            ((ByteStream) this).offset -= 8;
            writeInt(27695, i_38_);
            writeInt(27695, i_39_);
        }
        ((ByteStream) this).offset = i_35_;
    }

    final void method2185(byte i, int i_43_) {
        anInt6928++;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_43_ >> -1381094160);
        if (i == -56) {
            ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_43_ >> -1762403992);
            ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) i_43_;
        }
    }

    final void writeInt(int i, int i_44_) {
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_44_ >> 1775302488);
        anInt6882++;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_44_ >> -1692859536);
        if (i != 27695)
            method2210((byte) 110);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_44_ >> -1340701240);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) i_44_;
    }

    final int readInt(boolean bool) {
        anInt6898++;
        if (bool != false)
            readUnsignedShort((byte) -22);
        ((ByteStream) this).offset += 4;
        return (((((ByteStream) this).buffer[((ByteStream) this).offset + -1]) & 0xff) + (((0xff & (((ByteStream) this).buffer[((ByteStream) this).offset - 2])) << 555790408) + ((~0xffffff & ((((ByteStream) this).buffer[-4 + ((ByteStream) this).offset]) << -32909864)) - -(((((ByteStream) this).buffer[-3 + ((ByteStream) this).offset]) & 0xff) << 37506064))));
    }

    final int readLEInt(byte i) {
        ((ByteStream) this).offset += 4;
        if (i != -127)
            return -36;
        anInt6941++;
        return ((0xff00 & (((ByteStream) this).buffer[-3 + ((ByteStream) this).offset]) << -1314174520) + (~0xffffff & (((ByteStream) this).buffer[((ByteStream) this).offset + -1]) << 737286936) + ((((((ByteStream) this).buffer[-2 + ((ByteStream) this).offset]) & 0xff) << -664018864) - -(0xff & (((ByteStream) this).buffer[((ByteStream) this).offset - 4]))));
    }

    final void method2189(byte[] is, int i, int i_45_, int i_46_) {
        for (int i_47_ = i; (i_45_ + i ^ 0xffffffff) < (i_47_ ^ 0xffffffff); i_47_++)
            is[i_47_] = (((ByteStream) this).buffer[((ByteStream) this).offset++]);
        if (i_46_ <= 77)
            ((ByteStream) this).offset = 47;
        anInt6938++;
    }

    final int method2190(int i) {
        anInt6893++;
        ((ByteStream) this).offset += 3;
        int i_48_ = ((0xff & (((ByteStream) this).buffer[((ByteStream) this).offset + -1])) + (((0xff & (((ByteStream) this).buffer[-3 + ((ByteStream) this).offset])) << 1314538480) - -((0xff & (((ByteStream) this).buffer[-2 + ((ByteStream) this).offset])) << -1465798296)));
        if ((i_48_ ^ 0xffffffff) < -8388608)
            i_48_ -= 16777216;
        if (i != 20198)
            writeByteS((byte) 32, -38);
        return i_48_;
    }

    final int method2191(int i) {
        anInt6942++;
        int i_49_ = -34 % ((-64 - i) / 51);
        int i_50_ = 0;
        int i_51_ = readSmart((byte) 22);
        while ((i_51_ ^ 0xffffffff) == -32768) {
            i_51_ = readSmart((byte) 22);
            i_50_ += 32767;
        }
        i_50_ += i_51_;
        return i_50_;
    }

    final void writeInt1(int i, byte i_52_) {
        anInt6891++;
        if (i_52_ != -64)
            method2182(72);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i >> 437181992);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) i;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i >> -1402209896);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i >> -2097352112);
    }

    final int readLEInt_(byte i) {
        anInt6904++;
        if (i != 0)
            aLong6886 = -95L;
        ((ByteStream) this).offset += 4;
        return (((((ByteStream) this).buffer[((ByteStream) this).offset + -4]) & 0xff) + (((((ByteStream) this).buffer[-1 + ((ByteStream) this).offset]) & 0xff) << 1297157848) + ((0xff & (((ByteStream) this).buffer[((ByteStream) this).offset - 2])) << 665191824) - -((0xff & (((ByteStream) this).buffer[((ByteStream) this).offset + -3])) << -548058712));
    }

    final void method2194(BigInteger biginteger, BigInteger biginteger_53_, int i) {
        anInt6913++;
        int i_54_ = ((ByteStream) this).offset;
        ((ByteStream) this).offset = 0;
        byte[] is = new byte[i_54_];
        method2189(is, 0, i_54_, 127);
        BigInteger biginteger_55_ = new BigInteger(is);
        BigInteger biginteger_56_ = launch.rs ? biginteger_55_.modPow(biginteger, biginteger_53_) : biginteger_55_;
        byte[] is_57_ = biginteger_56_.toByteArray();
        if (i < 71)
            method2210((byte) -122);
        ((ByteStream) this).offset = 0;
        writeShort(1182, is_57_.length);
        method2215(0, (byte) -32, is_57_, is_57_.length);
    }

    final int readShort(int i) {
        ((ByteStream) this).offset += 2;
        anInt6917++;
        if (i != -1)
            writeByteS((byte) -17, -12);
        return ((0xff & (((ByteStream) this).buffer[-1 + ((ByteStream) this).offset])) + (0xff00 & (((ByteStream) this).buffer[((ByteStream) this).offset + -2]) << 1720299400));
    }

    final int method2196(int i, boolean bool) {
        anInt6944++;
        int i_58_ = ha.method809(-108, ((ByteStream) this).offset, i, ((ByteStream) this).buffer);
        writeInt(27695, i_58_);
        if (bool != false)
            ((ByteStream) this).buffer = null;
        return i_58_;
    }

    final int readUnsignedLEShort(boolean bool) {
        if (bool != true)
            return -43;
        ((ByteStream) this).offset += 2;
        anInt6892++;
        return (((0xff & (((ByteStream) this).buffer[-1 + ((ByteStream) this).offset])) << 1157853320) - -((((ByteStream) this).buffer[((ByteStream) this).offset - 2]) & 0xff));
    }

    final int readLEShortA(byte i) {
        anInt6895++;
        ((ByteStream) this).offset += 2;
        int i_59_ = ((0xff & (((ByteStream) this).buffer[-2 + ((ByteStream) this).offset]) - 128) + (((((ByteStream) this).buffer[((ByteStream) this).offset + -1]) & 0xff) << 123679240));
        if ((i_59_ ^ 0xffffffff) < -32768)
            i_59_ -= 65536;
        if (i != 97)
            return -45;
        return i_59_;
    }

    final byte readByte(int i) {
        if (i < 27)
            method2196(-102, false);
        anInt6901++;
        return (((ByteStream) this).buffer[((ByteStream) this).offset++]);
    }

    final void method2200(int i, byte[] is, boolean bool, int i_60_) {
        int i_61_ = i + i_60_ + -1;
        if (bool != false)
            method2161(-69, -45);
        for (/**/; (i_60_ ^ 0xffffffff) >= (i_61_ ^ 0xffffffff); i_61_--)
            is[i_61_] = (byte) ((((ByteStream) this).buffer[((ByteStream) this).offset++]) - 128);
        anInt6881++;
    }

    final void method2201(int i) {
        if (i != 16954)
            aString6879 = null;
        if (((ByteStream) this).buffer != null)
            Class16.method221(-20465, ((ByteStream) this).buffer);
        anInt6927++;
        ((ByteStream) this).buffer = null;
    }

    final void writeByteS(byte i, int i_62_) {
        anInt6926++;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (128 + -i_62_);
        if (i < 97)
            aString6879 = null;
    }

    final int readUnsignedByteS(byte i) {
        anInt6929++;
        int i_63_ = -56 / ((i - -63) / 51);
        return (-(((ByteStream) this).buffer[((ByteStream) this).offset++]) + 128 & 0xff);
    }

    final int readShortA(int i) {
        ((ByteStream) this).offset += 2;
        anInt6916++;
        if (i > -94)
            readByteC((byte) -122);
        return ((0xff & -128 + (((ByteStream) this).buffer[((ByteStream) this).offset + -1])) + ((((ByteStream) this).buffer[-2 + ((ByteStream) this).offset]) << 404065000 & 0xff00));
    }

    final int readLEShort(int i) {
        anInt6875++;
        ((ByteStream) this).offset += 2;
        if (i != 712071856)
            ((ByteStream) this).offset = -123;
        int i_64_ = (((0xff & (((ByteStream) this).buffer[-1 + ((ByteStream) this).offset])) << -1143176344) - -((((ByteStream) this).buffer[-2 + ((ByteStream) this).offset]) & 0xff));
        if ((i_64_ ^ 0xffffffff) < -32768)
            i_64_ -= 65536;
        return i_64_;
    }

    ByteStream(int i) {
        ((ByteStream) this).offset = 0;
        ((ByteStream) this).buffer = Class16.method222(i, -1);
    }

    final void method2206(int i, int i_65_) {
        ((ByteStream) this).buffer[i_65_ + ((ByteStream) this).offset + -i] = (byte) (i >> 1470018472);
        anInt6908++;
        ((ByteStream) this).buffer[-1 + (-i + ((ByteStream) this).offset)] = (byte) i;
    }

    final void writeLEShort_(int i, int i_66_) {
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) i;
        int i_67_ = 17 / ((i_66_ - -38) / 55);
        anInt6931++;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i >> 1153610312);
    }

    final long readLong(int i) {
        anInt6896++;
        long l = 0xffffffffL & (long) readInt(false);
        long l_68_ = 0xffffffffL & (long) readInt(false);
        if (i != 1237129056)
            readUnsignedByteS((byte) -79);
        return l_68_ + (l << 1237129056);
    }

    final int readUnsignedByte(byte i) {
        anInt6890++;
        int i_69_ = -57 / ((27 - i) / 42);
        return ((((ByteStream) this).buffer[((ByteStream) this).offset++]) & 0xff);
    }

    final int method2210(byte i) {
        anInt6888++;
        int i_70_ = ((((ByteStream) this).buffer[((ByteStream) this).offset]) & 0xff);
        int i_71_ = -89 % ((40 - i) / 57);
        if (i_70_ >= 128)
            return -49152 + readShort(-1);
        return -64 + readUnsignedByte((byte) 124);
    }

    final void writeByte(int i, int i_72_) {
        anInt6923++;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) i_72_;
        if (i > -19)
            method2223(-17);
    }

    final String readJagString2(int i) {
        anInt6907++;
        byte i_73_ = (((ByteStream) this).buffer[((ByteStream) this).offset++]);
        if ((i_73_ ^ 0xffffffff) != -1)
            throw new IllegalStateException("Bad version number in gjstr2");
        int i_74_ = ((ByteStream) this).offset;
        if (i > -72)
            return null;
        while ((((ByteStream) this).buffer[((ByteStream) this).offset++]) != 0) {
            /* empty */
        }
        int i_75_ = -i_74_ + (((ByteStream) this).offset - 1);
        if (i_75_ == 0)
            return "";
        return Class112_Sub1.method799(i_74_, i_75_, ((ByteStream) this).buffer, -95);
    }

    final byte readByteS(int i) {
        if (i > -29)
            method2189(null, 69, 110, -20);
        anInt6903++;
        return (byte) (-(((ByteStream) this).buffer[((ByteStream) this).offset++]) + 128);
    }

    final int readInt2(int i) {
        if (i != -1893167880)
            ((ByteStream) this).offset = 15;
        ((ByteStream) this).offset += 4;
        anInt6911++;
        return ((0xff00 & (((ByteStream) this).buffer[((ByteStream) this).offset - 1]) << 489099496) + (((0xff & (((ByteStream) this).buffer[-3 + ((ByteStream) this).offset])) << -1893167880) - -((((ByteStream) this).buffer[((ByteStream) this).offset - 4]) << 1182187312 & 0xff0000)) - -((((ByteStream) this).buffer[-2 + ((ByteStream) this).offset]) & 0xff));
    }

    final void method2215(int i, byte i_76_, byte[] is, int i_77_) {
        for (int i_78_ = i; i_77_ + i > i_78_; i_78_++)
            ((ByteStream) this).buffer[((ByteStream) this).offset++] = is[i_78_];
        if (i_76_ == -32)
            anInt6884++;
    }

    final void method2216(int i, int i_79_) {
        ((ByteStream) this).buffer[-1 + (-i_79_ + ((ByteStream) this).offset)] = (byte) i_79_;
        if (i == -20198)
            anInt6889++;
    }

    final void writeLong(int i, long l) {
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (int) (l >> -1778185928);
        anInt6894++;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (int) (l >> 45238320);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (int) (l >> 1502406184);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (int) (l >> 1700177632);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (int) (l >> -1037234920);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (int) (l >> -1322114544);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (int) (l >> 1639070664);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (int) l;
        if (i != 14731)
            readInt(false);
    }

    final long method2218(byte i) {
        anInt6900++;
        long l = (long) readLEInt((byte) -127) & 0xffffffffL;
        if (i != 13)
            aString6879 = null;
        long l_80_ = (long) readLEInt((byte) -127) & 0xffffffffL;
        return l + (l_80_ << 1279820896);
    }

    final void writeShort(int i, int i_81_) {
        anInt6883++;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_81_ >> 1704979848);
        if (i == 1182)
            ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) i_81_;
    }

    final void method2220(boolean bool, String string) {
        anInt6899++;
        int i = string.indexOf('\0');
        if ((i ^ 0xffffffff) <= -1)
            throw new IllegalArgumentException("NUL character at " + i + " - cannot pjstr2");
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) 0;
        ((ByteStream) this).offset += RuntimeException_Sub1.method3941(0, (((ByteStream) this).buffer), 126, string, string.length(), (((ByteStream) this).offset));
        if (bool != true)
            readLEShort(-36);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) 0;
    }

    ByteStream(byte[] is) {
        ((ByteStream) this).buffer = is;
        ((ByteStream) this).offset = 0;
    }

    final int method2221(int i) {
        anInt6934++;
        if (i != 255)
            readByteS(-69);
        ((ByteStream) this).offset += 3;
        return ((((((ByteStream) this).buffer[((ByteStream) this).offset + -2]) & 0xff) << 962421384) + ((((((ByteStream) this).buffer[((ByteStream) this).offset + -3]) & 0xff) << -1515226000) - -(0xff & (((ByteStream) this).buffer[((ByteStream) this).offset - 1]))));
    }

    final byte readByteA(int i) {
        anInt6930++;
        if (i != -8996)
            readInt1((byte) -90);
        return (byte) (-128 + (((ByteStream) this).buffer[((ByteStream) this).offset++]));
    }

    final boolean method2223(int i) {
        anInt6924++;
        ((ByteStream) this).offset -= 4;
        int i_82_ = ha.method809(61, ((ByteStream) this).offset, i, ((ByteStream) this).buffer);
        int i_83_ = readInt(false);
        if ((i_83_ ^ 0xffffffff) == (i_82_ ^ 0xffffffff))
            return true;
        return false;
    }

    static {
        aString6879 = null;
    }
}
