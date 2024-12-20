/* Class248_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

final class Node_Sub2_Sub3 extends Node_Sub2 {
    static int anInt8847;
    private float aFloat8848;
    private int anInt8849;
    static byte[][] aByteArrayArray8850;
    private int anInt8851;
    static int anInt8852;
    private String aString8853;
    static int anInt8854 = 0;
    static int anInt8855;
    static int anInt8856;
    static int anInt8857;
    private float aFloat8858;
    private String aString8859;
    static int anInt8860;
    static Class360 aClass360_8861;
    static float aFloat8862;
    private String aString8863;

    final String method1994(byte i) {
        if (i >= -29)
            aByteArrayArray8850 = null;
        anInt8852++;
        return aString8863;
    }

    final float method1995(int i) {
        anInt8857++;
        if (i != 0)
            return -0.24812438F;
        return aFloat8858;
    }

    final void method1982(byte i) {
        anInt8847++;
        if (i >= -81)
            anInt8854 = 101;
    }

    Node_Sub2_Sub3(OggStreamState oggstreamstate) {
        super(oggstreamstate);
    }

    public static void method1996(int i) {
        aClass360_8861 = null;
        aByteArrayArray8850 = null;
        if (i != -15626)
            aFloat8862 = 0.2581241F;
    }

    final void method1981(OggPacket oggpacket, boolean bool) {
        anInt8856++;
        if (((Node_Sub2) this).anInt6825 <= 0 || "SUB".equals(aString8853)) {
            ByteStream class248_sub9 = new ByteStream(oggpacket.getData());
            if (bool != false)
                aString8853 = null;
            int i = class248_sub9.readUnsignedByte((byte) -125);
            if (((Node_Sub2) this).anInt6825 > 8) {
                if (i == 0) {
                    long l = class248_sub9.method2218((byte) 13);
                    long l_0_ = class248_sub9.method2218((byte) 13);
                    long l_1_ = class248_sub9.method2218((byte) 13);
                    if ((l ^ 0xffffffffffffffffL) > -1L || (l_0_ ^ 0xffffffffffffffffL) > -1L || l_1_ < 0L || (l ^ 0xffffffffffffffffL) > (l_1_ ^ 0xffffffffffffffffL))
                        throw new IllegalStateException();
                    aFloat8848 = (float) ((long) anInt8849 * l) / (float) anInt8851;
                    aFloat8858 = ((float) ((long) anInt8849 * (l_0_ + l)) / (float) anInt8851);
                    int i_2_ = class248_sub9.readLEInt((byte) -127);
                    if (i_2_ < 0 || ((i_2_ ^ 0xffffffff) < ((-((ByteStream) class248_sub9).offset + (((ByteStream) class248_sub9).buffer).length) ^ 0xffffffff)))
                        throw new IllegalStateException();
                    aString8863 = Class142.method1291((((ByteStream) class248_sub9).buffer), i_2_, (((ByteStream) class248_sub9).offset), 102);
                }
                if ((0x80 | i) != 0)
                    return;
            } else {
                if (((0x80 | i) ^ 0xffffffff) == -1)
                    throw new IllegalStateException();
                if (((Node_Sub2) this).anInt6825 == 0) {
                    ((ByteStream) class248_sub9).offset += 23;
                    anInt8851 = class248_sub9.readLEInt((byte) -127);
                    anInt8849 = class248_sub9.readLEInt((byte) -127);
                    if (anInt8851 == 0 || anInt8849 == 0)
                        throw new IllegalStateException();
                    ByteStream class248_sub9_3_ = new ByteStream(16);
                    class248_sub9.method2189(((ByteStream) class248_sub9_3_).buffer, 0, 16, 122);
                    aString8859 = class248_sub9_3_.readString(15598);
                    ((ByteStream) class248_sub9_3_).offset = 0;
                    class248_sub9.method2189(((ByteStream) class248_sub9_3_).buffer, 0, 16, 80);
                    aString8853 = class248_sub9_3_.readString(15598);
                }
            }
        }
    }

    final float method1997(byte i) {
        anInt8860++;
        if (i <= 48)
            return -0.81959575F;
        return aFloat8848;
    }

    final String method1998(boolean bool) {
        if (bool != false)
            aFloat8862 = 0.5894859F;
        anInt8855++;
        return aString8859;
    }
}
