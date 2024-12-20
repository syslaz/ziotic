/* Class362 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class362 {
    private static short[] aShortArray4456;
    short[] aShortArray4457;
    boolean aBoolean4458;
    private static byte[] aByteArray4459;
    int anInt4460 = 0;
    private static short[] aShortArray4461;
    short[] aShortArray4462;
    private static short[] aShortArray4463 = new short[500];
    private static short[] aShortArray4464;
    private static short[] aShortArray4465;
    short[] aShortArray4466;
    short[] aShortArray4467;
    boolean aBoolean4468;
    boolean aBoolean4469;
    byte[] aByteArray4470;
    Node_Sub19 aClass248_Sub19_4471;
    short[] aShortArray4472;

    public static void method3819() {
        aShortArray4463 = null;
        aShortArray4461 = null;
        aShortArray4456 = null;
        aShortArray4465 = null;
        aShortArray4464 = null;
        aByteArray4459 = null;
    }

    Class362(byte[] is, Node_Sub19 class248_sub19) {
        ((Class362) this).aBoolean4458 = false;
        ((Class362) this).aBoolean4468 = false;
        ((Class362) this).aBoolean4469 = false;
        ((Class362) this).aClass248_Sub19_4471 = null;
        ((Class362) this).aClass248_Sub19_4471 = class248_sub19;
        try {
            ByteStream class248_sub9 = new ByteStream(is);
            ByteStream class248_sub9_0_ = new ByteStream(is);
            class248_sub9.readUnsignedByte((byte) 109);
            ((ByteStream) class248_sub9).offset += 2;
            int i = class248_sub9.readUnsignedByte((byte) -104);
            int i_1_ = 0;
            int i_2_ = -1;
            int i_3_ = -1;
            ((ByteStream) class248_sub9_0_).offset = ((ByteStream) class248_sub9).offset + i;
            for (int i_4_ = 0; i_4_ < i; i_4_++) {
                int i_5_ = (((Node_Sub19) ((Class362) this).aClass248_Sub19_4471).anIntArray7043[i_4_]);
                if (i_5_ == 0)
                    i_2_ = i_4_;
                int i_6_ = class248_sub9.readUnsignedByte((byte) -116);
                if (i_6_ > 0) {
                    if (i_5_ == 0)
                        i_3_ = i_4_;
                    aShortArray4463[i_1_] = (short) i_4_;
                    short i_7_ = 0;
                    if (i_5_ == 3 || i_5_ == 10)
                        i_7_ = (short) 128;
                    if ((i_6_ & 0x1) != 0)
                        aShortArray4461[i_1_] = (short) class248_sub9_0_.method2210((byte) 106);
                    else
                        aShortArray4461[i_1_] = i_7_;
                    if ((i_6_ & 0x2) != 0)
                        aShortArray4456[i_1_] = (short) class248_sub9_0_.method2210((byte) 107);
                    else
                        aShortArray4456[i_1_] = i_7_;
                    if ((i_6_ & 0x4) != 0)
                        aShortArray4465[i_1_] = (short) class248_sub9_0_.method2210((byte) 119);
                    else
                        aShortArray4465[i_1_] = i_7_;
                    aByteArray4459[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
                    if (i_5_ == 2 || i_5_ == 9) {
                        aShortArray4461[i_1_] = (short) (aShortArray4461[i_1_] << 2 & 0x3fff);
                        aShortArray4456[i_1_] = (short) (aShortArray4456[i_1_] << 2 & 0x3fff);
                        aShortArray4465[i_1_] = (short) (aShortArray4465[i_1_] << 2 & 0x3fff);
                    }
                    aShortArray4464[i_1_] = (short) -1;
                    if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
                        if (i_2_ > i_3_) {
                            aShortArray4464[i_1_] = (short) i_2_;
                            i_3_ = i_2_;
                        }
                    } else if (i_5_ == 5)
                        ((Class362) this).aBoolean4458 = true;
                    else if (i_5_ == 7)
                        ((Class362) this).aBoolean4468 = true;
                    else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8)
                        ((Class362) this).aBoolean4469 = true;
                    i_1_++;
                }
            }
            if (((ByteStream) class248_sub9_0_).offset != is.length)
                throw new RuntimeException();
            ((Class362) this).anInt4460 = i_1_;
            ((Class362) this).aShortArray4457 = new short[i_1_];
            ((Class362) this).aShortArray4472 = new short[i_1_];
            ((Class362) this).aShortArray4467 = new short[i_1_];
            ((Class362) this).aShortArray4466 = new short[i_1_];
            ((Class362) this).aShortArray4462 = new short[i_1_];
            ((Class362) this).aByteArray4470 = new byte[i_1_];
            for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
                ((Class362) this).aShortArray4457[i_8_] = aShortArray4463[i_8_];
                ((Class362) this).aShortArray4472[i_8_] = aShortArray4461[i_8_];
                ((Class362) this).aShortArray4467[i_8_] = aShortArray4456[i_8_];
                ((Class362) this).aShortArray4466[i_8_] = aShortArray4465[i_8_];
                ((Class362) this).aShortArray4462[i_8_] = aShortArray4464[i_8_];
                ((Class362) this).aByteArray4470[i_8_] = aByteArray4459[i_8_];
            }
        } catch (Exception exception) {
            ((Class362) this).anInt4460 = 0;
            ((Class362) this).aBoolean4458 = false;
            ((Class362) this).aBoolean4468 = false;
        }
    }

    static {
        aByteArray4459 = new byte[500];
        aShortArray4464 = new short[500];
        aShortArray4465 = new short[500];
        aShortArray4456 = new short[500];
        aShortArray4461 = new short[500];
    }
}
