/* Class248_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

abstract class Node_Sub2 extends Node {
    OggStreamState anOggStreamState6820;
    static int anInt6821;
    static IncommingOpcode aIncommingOpcode_6822 = new IncommingOpcode(110, 7);
    static int anInt6823;
    static boolean aBoolean6824;
    int anInt6825;

    final void method1978(OggPacket oggpacket, int i) {
        anInt6821++;
        method1981(oggpacket, false);
        if (i < 97)
            aIncommingOpcode_6822 = null;
        ((Node_Sub2) this).anInt6825++;
    }

    public static void method1979(int i) {
        if (i >= -74)
            method1979(-105);
        aIncommingOpcode_6822 = null;
    }

    static final String method1980(int i, int i_0_, ByteStream class248_sub9) {
        anInt6823++;
        try {
            int i_1_ = class248_sub9.readSmart((byte) 22);
            if ((i ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
                i_1_ = i;
            byte[] is = new byte[i_1_];
            ((ByteStream) class248_sub9).offset += (Class335.aClass25_3909.method244(-87812127, i_0_, ((ByteStream) class248_sub9).buffer, ((ByteStream) class248_sub9).offset, is, i_1_));
            String string = Class112_Sub1.method799(0, i_1_, is, -55);
            return string;
        } catch (Exception exception) {
            return "Cabbage";
        }
    }

    abstract void method1981(OggPacket oggpacket, boolean bool);

    abstract void method1982(byte i);

    Node_Sub2(OggStreamState oggstreamstate) {
        ((Node_Sub2) this).anOggStreamState6820 = oggstreamstate;
    }

    static {
        new Class58("", 76);
        aBoolean6824 = false;
    }
}
