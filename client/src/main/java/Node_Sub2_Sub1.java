/* Class248_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.*;
import jagtheora.theora.Frame;

import java.awt.*;

final class Node_Sub2_Sub1 extends Node_Sub2 {
    static int anInt8811;
    private boolean aBoolean8812;
    private DecoderContext aDecoderContext8813;
    private boolean aBoolean8814;
    private Class129 aClass129_8815;
    static int anInt8816;
    static OutgoingOpcode aOutgoingOpcode_8817 = new OutgoingOpcode(67, 8);
    private double aDouble8818;
    private GranulePos aGranulePos8819;
    private Frame aFrame8820;
    private TheoraInfo aTheoraInfo8821;
    static int anInt8822;
    private boolean aBoolean8823;
    static int anInt8824;
    private TheoraComment aTheoraComment8825;
    static int anInt8826;
    static int anInt8827;
    static int anInt8828;
    private int anInt8829;
    static int anInt8830;
    private int anInt8831;
    private SetupInfo aSetupInfo8832 = new SetupInfo();
    static int anInt8833;
    static Rectangle[] aRectangleArray8834 = new Rectangle[100];
    static int anInt8835;
    static int anInt8836;
    private boolean aBoolean8837;
    private long aLong8838;

    static final void method1983(Class381 class381, Class381 class381_0_, int[] is, byte i) {
        Node_Sub14_Sub34.aClass381_9524 = class381;
        if (i != -109)
            aRectangleArray8834 = null;
        Class41.aClass381_531 = class381_0_;
        anInt8822++;
        if (is != null)
            Class346_Sub7_Sub4_Sub1.anIntArray10091 = is;
    }

    final float method1984(byte i) {
        anInt8828++;
        if (!aBoolean8814 || aTheoraInfo8821.a())
            return 0.0F;
        if (i != -19)
            method1985((byte) -121);
        return ((float) aTheoraInfo8821.fpsNumerator / (float) aTheoraInfo8821.fpsDenominator);
    }

    final double method1985(byte i) {
        anInt8827++;
        if (i != -121)
            return -0.3000760850863135;
        return aDouble8818;
    }

    public static void method1986(int i) {
        aOutgoingOpcode_8817 = null;
        if (i > -34)
            aOutgoingOpcode_8817 = null;
        aRectangleArray8834 = null;
    }

    Node_Sub2_Sub1(OggStreamState oggstreamstate) {
        super(oggstreamstate);
        aTheoraInfo8821 = new TheoraInfo();
        aTheoraComment8825 = new TheoraComment();
    }

    static final boolean method1987(int i, char c) {
        if (i != -23324)
            return true;
        anInt8816++;
        if (c != 160 && (c ^ 0xffffffff) != -33 && c != 95 && (c ^ 0xffffffff) != -46)
            return false;
        return true;
    }

    private final void method1988(int i, int i_1_) {
        anInt8835++;
        if (i != -1)
            method1982((byte) -127);
        anInt8829 = i_1_;
        if (aBoolean8814) {
            if (anInt8831 < anInt8829)
                anInt8829 = anInt8831;
            if ((anInt8829 ^ 0xffffffff) > -1)
                anInt8829 = 0;
            aDecoderContext8813.setPostProcessingLevel(anInt8829);
        }
    }

    final Class129 method1989(ha var_ha, byte i) {
        anInt8811++;
        if (aFrame8820 == null)
            return null;
        if (!aBoolean8823 && aClass129_8815 != null)
            return aClass129_8815;
        aClass129_8815 = var_ha.a(aFrame8820.pixels, 0, aFrame8820.a, aFrame8820.a, aFrame8820.b, false);
        aBoolean8823 = false;
        if (i <= 93)
            aBoolean8837 = true;
        return aClass129_8815;
    }

    final void method1982(byte i) {
        anInt8830++;
        if (aFrame8820 != null)
            aFrame8820.b();
        if (i >= -81)
            method1984((byte) 119);
        if (aDecoderContext8813 != null) {
            aDecoderContext8813.b();
            aDecoderContext8813 = null;
        }
        if (aGranulePos8819 != null) {
            aGranulePos8819.b();
            aGranulePos8819 = null;
        }
        aTheoraInfo8821.b();
        aTheoraComment8825.b();
        aSetupInfo8832.b();
    }

    final boolean method1990(byte i) {
        anInt8836++;
        if (i >= -37)
            aGranulePos8819 = null;
        return aBoolean8814;
    }

    final long method1991(int i) {
        if (i != 0)
            aBoolean8814 = false;
        anInt8833++;
        return aLong8838;
    }

    final void method1981(OggPacket oggpacket, boolean bool) {
        anInt8826++;
        if (bool == false) {
            if (aBoolean8814) {
                aLong8838 = Class118.method1112(116);
                int i = aDecoderContext8813.decodePacketIn(oggpacket, aGranulePos8819);
                if (i < 0)
                    throw new IllegalStateException(String.valueOf(i));
                aDecoderContext8813.granuleFrame(aGranulePos8819);
                aDouble8818 = aDecoderContext8813.granuleTime(aGranulePos8819);
                if (aBoolean8837) {
                    boolean bool_2_ = (oggpacket.isKeyFrame() ^ 0xffffffff) == -2;
                    if (bool_2_)
                        aBoolean8837 = false;
                    else
                        return;
                }
                if (!aBoolean8812 || oggpacket.isKeyFrame() == 1) {
                    if ((aDecoderContext8813.decodeFrame(aFrame8820) ^ 0xffffffff) != -1)
                        throw new IllegalStateException(String.valueOf(i));
                    aBoolean8823 = true;
                }
            } else {
                int i = aSetupInfo8832.decodeHeader(aTheoraInfo8821, aTheoraComment8825, oggpacket);
                if (i != 0) {
                    if ((i ^ 0xffffffff) > -1)
                        throw new IllegalStateException(String.valueOf(i));
                } else {
                    aBoolean8814 = true;
                    if ((aTheoraInfo8821.frameWidth ^ 0xffffffff) < -2049 || (aTheoraInfo8821.frameHeight ^ 0xffffffff) < -1025)
                        throw new IllegalStateException();
                    aDecoderContext8813 = new DecoderContext(aTheoraInfo8821, aSetupInfo8832);
                    aGranulePos8819 = new GranulePos();
                    aFrame8820 = new Frame(aTheoraInfo8821.frameWidth, aTheoraInfo8821.frameHeight);
                    anInt8831 = aDecoderContext8813.getMaxPostProcessingLevel();
                    method1988(-1, anInt8829);
                }
            }
        }
    }

    static {
        for (int i = 0; (i ^ 0xffffffff) > -101; i++)
            aRectangleArray8834[i] = new Rectangle();
    }
}
