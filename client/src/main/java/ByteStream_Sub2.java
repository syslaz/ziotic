/* Class248_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class PacketStream extends ByteStream {
    static int anInt9110;
    static int anInt9111;
    static int anInt9112;
    static int anInt9113;
    static IncommingOpcode aIncommingOpcode_9114 = new IncommingOpcode(107, 6);
    static int anInt9115;
    static int anInt9116;
    private int anInt9117;
    static int anInt9118;
    static int anInt9119;
    static int anInt9120;
    static Class278 aClass278_9121 = new Class278(128, 4);
    static int anInt9122;
    static IncommingOpcode aIncommingOpcode_9123 = new IncommingOpcode(57, 6);
    static Class200 aClass200_9124 = new Class200(2);
    private ISAACCypher aISAACCypher_9125;
    static int anInt9126;

    final void method2227(byte i, int[] is) {
        aISAACCypher_9125 = new ISAACCypher(is);
        if (i > 89)
            anInt9120++;
    }

    final int method2228(boolean bool, int i) {
        if (bool != false)
            method2228(true, -34);
        anInt9113++;
        return -anInt9117 + i * 8;
    }

    final void writeOpcode(boolean bool, int i) {
        if (bool != false)
            method2231(-91);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (aISAACCypher_9125.nextInt((byte) -128) + i);
        anInt9115++;
    }

    final int readOpcode(int i) {
        anInt9122++;
        int i_0_ = (((((ByteStream) this).buffer[((ByteStream) this).offset++]) + -aISAACCypher_9125.nextInt((byte) -124)) & 0xff);
        if (i > -50)
            method2227((byte) -8, null);
        if ((i_0_ ^ 0xffffffff) > -129)
            return i_0_;
        return ((((((ByteStream) this).buffer[((ByteStream) this).offset++]) - aISAACCypher_9125.nextInt((byte) -125)) & 0xff) + (i_0_ - 128 << 635334920));
    }

    public static void method2231(int i) {
        if (i == 128) {
            aIncommingOpcode_9114 = null;
            aClass278_9121 = null;
            aIncommingOpcode_9123 = null;
            aClass200_9124 = null;
        }
    }

    final void method2232(int i, byte[] is, byte i_1_, int i_2_) {
        anInt9112++;
        int i_3_ = 0;
        int i_4_ = -50 % ((-8 - i_1_) / 47);
        for (/**/; i > i_3_; i_3_++)
            is[i_3_ + i_2_] = (byte) ((((ByteStream) this).buffer[((ByteStream) this).offset++]) + -aISAACCypher_9125.nextInt((byte) -122));
    }

    final void method2233(int i) {
        ((ByteStream) this).offset = (7 + anInt9117) / 8;
        if (i > -33)
            aClass278_9121 = null;
        anInt9119++;
    }

    final void method2234(boolean bool) {
        anInt9117 = ((ByteStream) this).offset * 8;
        if (bool == true)
            anInt9111++;
    }

    final boolean method2235(int i) {
        anInt9118++;
        if (i != 1682588262)
            return true;
        int i_5_ = (((((ByteStream) this).buffer[((ByteStream) this).offset]) - aISAACCypher_9125.peekInt((byte) 126)) & 0xff);
        if ((i_5_ ^ 0xffffffff) > -129)
            return false;
        return true;
    }

    final void method2236(ISAACCypher ISAACCypher, int i) {
        if (i == 8) {
            anInt9110++;
            aISAACCypher_9125 = ISAACCypher;
        }
    }

    final int readBits(int i, int i_6_) {
        anInt9116++;
        int i_7_ = anInt9117 >> -1263863901;
        int i_8_ = -(anInt9117 & 0x7) + 8;
        int i_9_ = 0;
        if (i != 2059)
            return 119;
        anInt9117 += i_6_;
        for (/**/; i_8_ < i_6_; i_8_ = 8) {
            i_9_ += ((Class150.anIntArray1758[i_8_] & ((ByteStream) this).buffer[i_7_++]) << i_6_ - i_8_);
            i_6_ -= i_8_;
        }
        if (i_8_ == i_6_)
            i_9_ += (((ByteStream) this).buffer[i_7_] & Class150.anIntArray1758[i_8_]);
        else
            i_9_ += (((ByteStream) this).buffer[i_7_] >> -i_6_ + i_8_ & Class150.anIntArray1758[i_6_]);
        return i_9_;
    }

    PacketStream(int i) {
        super(i);
    }
}
