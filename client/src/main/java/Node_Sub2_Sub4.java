/* Class248_Sub2_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

final class Node_Sub2_Sub4 extends Node_Sub2 {
    static int anInt8864;
    private VorbisComment aVorbisComment8865;
    static int anInt8866;
    private Node_Sub15_Sub5 aClass248_Sub15_Sub5_8867;
    static int anInt8868;
    static int anInt8869 = -1;
    static int anInt8870;
    private Class317 aClass317_8871;
    static int anInt8872;
    private int anInt8873;
    private DSPState aDSPState8874;
    static IncommingOpcode aIncommingOpcode_8875 = new IncommingOpcode(108, 6);
    private double aDouble8876;
    static int anInt8877;
    private VorbisBlock aVorbisBlock8878;
    static Class381 aClass381_8879;
    static float aFloat8880;
    static int[] anIntArray8881 = new int[3];
    static int anInt8882;
    private VorbisInfo aVorbisInfo8883 = new VorbisInfo();

    static final boolean method1999(int i, int i_0_, byte i_1_) {
        if (i_1_ < 75)
            return true;
        anInt8877++;
        if ((i_0_ & 0x180 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    final double method2000(int i) {
        anInt8870++;
        if (i != 3)
            method2002((byte) 14);
        double d = aDouble8876;
        if (aClass248_Sub15_Sub5_8867 != null) {
            d = aClass248_Sub15_Sub5_8867.method2499(false);
            if (d < 0.0)
                d = aDouble8876;
        }
        return d - (double) (256.0F / (float) Class54.anInt728);
    }

    static final Class54_Sub1 method2001(int i, ByteStream class248_sub9) {
        anInt8882++;
        if (i > -118)
            return null;
        return new Class54_Sub1(class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.method2221(255), class248_sub9.method2221(255), class248_sub9.readUnsignedByte((byte) -114));
    }

    final void method1981(OggPacket oggpacket, boolean bool) {
        anInt8868++;
        if ((((Node_Sub2) this).anInt6825 ^ 0xffffffff) > -4) {
            int i = aVorbisInfo8883.headerIn(aVorbisComment8865, oggpacket);
            if (i < 0)
                throw new IllegalStateException(String.valueOf(i));
            if ((((Node_Sub2) this).anInt6825 ^ 0xffffffff) == -3) {
                if ((aVorbisInfo8883.channels ^ 0xffffffff) < -3 || aVorbisInfo8883.channels < 1)
                    throw new RuntimeException(String.valueOf(aVorbisInfo8883.channels));
                aDSPState8874 = new DSPState(aVorbisInfo8883);
                aVorbisBlock8878 = new VorbisBlock(aDSPState8874);
                aClass317_8871 = new Class317(aVorbisInfo8883.rate, Class54.anInt728);
                aClass248_Sub15_Sub5_8867 = new Node_Sub15_Sub5(aVorbisInfo8883.channels);
            }
        } else {
            if (aVorbisBlock8878.synthesis(oggpacket) == 0)
                aDSPState8874.blockIn(aVorbisBlock8878);
            float[][] fs = aDSPState8874.pcmOut(aVorbisInfo8883.channels);
            aDouble8876 = aDSPState8874.granuleTime();
            if (aDouble8876 == -1.0)
                aDouble8876 = (double) ((float) anInt8873 / (float) aVorbisInfo8883.rate);
            aDSPState8874.read(fs[0].length);
            anInt8873 += fs[0].length;
            Node_Sub8_Sub15 class248_sub8_sub15 = aClass248_Sub15_Sub5_8867.method2505(fs[0].length, aDouble8876, (byte) 113);
            Class340_Sub6.method3461((byte) -110, fs, (((Node_Sub8_Sub15) class248_sub8_sub15).aShortArrayArray9047));
            for (int i = 0; i < aVorbisInfo8883.channels; i++)
                ((Node_Sub8_Sub15) class248_sub8_sub15).aShortArrayArray9047[i] = aClass317_8871.method3305((((Node_Sub8_Sub15) class248_sub8_sub15).aShortArrayArray9047[i]), -109);
            aClass248_Sub15_Sub5_8867.method2504((byte) 90, class248_sub8_sub15);
        }
        if (bool != false)
            method2003((byte) -33);
    }

    final int method2002(byte i) {
        anInt8866++;
        int i_2_ = -72 / ((-35 - i) / 50);
        if (aClass248_Sub15_Sub5_8867 == null)
            return 0;
        return aClass248_Sub15_Sub5_8867.method2497(-101);
    }

    final void method1982(byte i) {
        anInt8872++;
        if (aVorbisBlock8878 != null)
            aVorbisBlock8878.b();
        if (aDSPState8874 != null)
            aDSPState8874.b();
        aVorbisComment8865.b();
        aVorbisInfo8883.b();
        if (i >= -81)
            aVorbisComment8865 = null;
        if (aClass248_Sub15_Sub5_8867 != null)
            aClass248_Sub15_Sub5_8867.method2506((byte) 120);
    }

    final Node_Sub15_Sub5 method2003(byte i) {
        if (i != 81)
            method2004(-36);
        anInt8864++;
        return aClass248_Sub15_Sub5_8867;
    }

    public static void method2004(int i) {
        aClass381_8879 = null;
        anIntArray8881 = null;
        aIncommingOpcode_8875 = null;
        if (i != -26000)
            anIntArray8881 = null;
    }

    Node_Sub2_Sub4(OggStreamState oggstreamstate) {
        super(oggstreamstate);
        aVorbisComment8865 = new VorbisComment();
    }
}
