/* Class138 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.zip.Inflater;

final class Class138 {
    private Inflater anInflater1652;
    static int anInt1653;
    static int anInt1654;
    static int anInt1655;

    static final void method1274(boolean bool, int i, int i_0_, int i_1_, int i_2_) {
        Node_Sub8_Sub15.method2130((byte) -114);
        anInt1655++;
        Class81_Sub1.aLong8423 = 0L;
        if (i_2_ == -1) {
            int i_3_ = Class346_Sub7_Sub3.method3672((byte) -112);
            if ((i ^ 0xffffffff) == -4 || i_3_ == 3)
                bool = true;
            if (!Class287.aHa3381.m())
                bool = true;
            Class346_Sub7_Sub4_Sub1.method3682(108, i_3_, i_0_, i_1_, bool, i);
        }
    }

    final byte[] method1275(byte[] is, int i) {
        anInt1654++;
        if (i != -18)
            anInflater1652 = null;
        ByteStream class248_sub9 = new ByteStream(is);
        ((ByteStream) class248_sub9).offset = -4 + is.length;
        int i_4_ = class248_sub9.readLEInt((byte) -127);
        ((ByteStream) class248_sub9).offset = 0;
        byte[] is_5_ = new byte[i_4_];
        method1276(class248_sub9, is_5_, i + 134);
        return is_5_;
    }

    public Class138() {
        this(-1, 1000000, 1000000);
    }

    final void method1276(ByteStream class248_sub9, byte[] is, int i) {
        anInt1653++;
        if (((((ByteStream) class248_sub9).buffer[((ByteStream) class248_sub9).offset]) ^ 0xffffffff) != -32 || ((((ByteStream) class248_sub9).buffer[1 + ((ByteStream) class248_sub9).offset]) ^ 0xffffffff) != 116)
            throw new RuntimeException("Invalid GZIP header!");
        if (anInflater1652 == null)
            anInflater1652 = new Inflater(true);
        try {
            anInflater1652.setInput(((ByteStream) class248_sub9).buffer, 10 + ((ByteStream) class248_sub9).offset, (-18 + -((ByteStream) class248_sub9).offset + ((ByteStream) class248_sub9).buffer.length));
            anInflater1652.inflate(is);
            if (i != 116)
                anInflater1652 = null;
        } catch (Exception exception) {
            anInflater1652.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        anInflater1652.reset();
    }

    private Class138(int i, int i_6_, int i_7_) {
        /* empty */
    }
}
