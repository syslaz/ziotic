/* Class248_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

final class Node_Sub2_Sub2 extends Node_Sub2 {
    static int anInt8839;
    static int anInt8840 = 2;
    static int anInt8841;
    static Class138 aClass138_8842 = new Class138();
    static int anInt8843;
    static int anInt8844;
    static int anInt8845;
    static int anInt8846;

    public static void method1992(boolean bool) {
        aClass138_8842 = null;
        if (bool != false)
            aClass138_8842 = null;
    }

    static final void method1993(String string, int i) {
        anInt8844++;
        Node_Sub36 class248_sub36 = Class352.method3751(i);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-30, ((Class224) Class356.aClass224_4404).opcode);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, 0);
        int i_0_ = (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(i + 1182, 640);
        int[] is = Class112.method789((byte) -103, class248_sub36);
        int i_1_ = (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -111);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-24, Class191.anInt4822);
        ((ByteStream) ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257).offset += 7;
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2184(is, ((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset, (byte) 112, i_1_);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2206(((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset - i_0_, i + -2);
        Class226_Sub3.method1814(class248_sub36, 0);
        Class367.anInt4509 = i;
        Node_Sub4.anInt6833 = -3;
        Node_Sub42_Sub1.anInt9782 = 1;
        Class215.anInt2476 = 0;
    }

    final void method1981(OggPacket oggpacket, boolean bool) {
        anInt8846++;
        if (bool != false)
            anInt8840 = -122;
    }

    Node_Sub2_Sub2(OggStreamState oggstreamstate) {
        super(oggstreamstate);
    }

    final void method1982(byte i) {
        if (i >= -81)
            aClass138_8842 = null;
        anInt8841++;
    }
}
