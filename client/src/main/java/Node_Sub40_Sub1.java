/* Class248_Sub40_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.math.BigInteger;

final class Node_Sub40_Sub1 extends Node_Sub40 implements ImageProducer {
    private ImageConsumer anImageConsumer9758;
    static int anInt9759;
    static int anInt9760;
    private Canvas aCanvas9761;
    static int anInt9762;
    static int anInt9763;
    static int anInt9764;
    static int anInt9765;
    static int anInt9766;
    static int anInt9767;
    private ColorModel aColorModel9768;
    static int anInt9769;
    static int anInt9770;
    private Image anImage9771;
    static int anInt9772;
    static BigInteger aBigInteger9773 = (new BigInteger("85b99b9961461c31e448da113d63c964118d217139c602e1f59172935b96885ec454c3916e3d23a7b92fe44b14ab9b7e9c1c92dac03e029e93325c561985f403", 16));

    public final void startProduction(ImageConsumer imageconsumer) {
        addConsumer(imageconsumer);
        anInt9766++;
    }

    static final void method2615(int i, int i_0_, int i_1_, ha var_ha, int i_2_, int i_3_, int i_4_, int i_5_) {
        Class301.aHa4933 = var_ha;
        anInt9760++;
        Node_Sub14_Sub30.aViewport_9479 = Class301.aHa4933.e();
        Class333.aViewport_3895 = Class301.aHa4933.e();
        Node_Sub11.aViewport_6952 = Class301.aHa4933.e();
        Node_Sub15_Sub4.anInt9694 = 1;
        Node_Sub14_Sub18.anInt9352 = 0;
        Class81.anInt4905 = i_0_;
        Class282_Sub26.anInt7860 = i_5_;
        Node_Sub8_Sub1.anInt8908 = i_3_;
        Class358.anInt4422 = 0;
        Class316_Sub2_Sub1.anInterface14_9870 = null;
        Class86.anInt1064 = i;
        if (i_1_ > 101)
            Node_Sub8_Sub1.method2027(27424, i_4_, i_2_);
    }

    public final synchronized boolean isConsumer(ImageConsumer imageconsumer) {
        anInt9763++;
        if (anImageConsumer9758 != imageconsumer)
            return false;
        return true;
    }

    final void method2611(Canvas canvas, int i, int i_6_, int i_7_) {
        aCanvas9761 = canvas;
        ((Node_Sub40) this).anInt7284 = i;
        anInt9759++;
        ((Node_Sub40) this).anInt7281 = i_6_;
        ((Node_Sub40) this).anIntArray7283 = new int[(((Node_Sub40) this).anInt7284 * ((Node_Sub40) this).anInt7281)];
        aColorModel9768 = new DirectColorModel(32, 16711680, 65280, 255);
        anImage9771 = aCanvas9761.createImage(this);
        method2617((byte) 126);
        aCanvas9761.prepareImage(anImage9771, aCanvas9761);
        method2617((byte) 110);
        aCanvas9761.prepareImage(anImage9771, aCanvas9761);
        method2617((byte) 115);
        aCanvas9761.prepareImage(anImage9771, aCanvas9761);
        if (i_7_ != 2)
            method2615(98, -93, -20, null, -47, -1, 70, -74);
    }

    public final void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
        anInt9764++;
    }

    private final synchronized void method2616(int i, int i_8_, int i_9_, int i_10_, int i_11_) {
        anInt9770++;
        if (anImageConsumer9758 != null) {
            anImageConsumer9758.setPixels(i_8_, i_10_, i_9_, i, aColorModel9768, ((Node_Sub40) this).anIntArray7283, ((Node_Sub40) this).anInt7281 * i_10_ - -i_8_, ((Node_Sub40) this).anInt7281);
            anImageConsumer9758.imageComplete(2);
            if (i_11_ < 29)
                anImage9771 = null;
        }
    }

    final void method2612(int i, boolean bool, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, Graphics graphics) {
        anInt9772++;
        method2616(i, i_12_, i_15_, i_16_, 91);
        if (bool != false)
            method2616(107, -94, 53, -89, 19);
        Shape shape = graphics.getClip();
        graphics.clipRect(i_14_, i_13_, i_15_, i);
        graphics.drawImage(anImage9771, i_14_ - i_12_, i_13_ - i_16_, aCanvas9761);
        graphics.setClip(shape);
    }

    public final synchronized void addConsumer(ImageConsumer imageconsumer) {
        anImageConsumer9758 = imageconsumer;
        anInt9762++;
        imageconsumer.setDimensions(((Node_Sub40) this).anInt7281, ((Node_Sub40) this).anInt7284);
        imageconsumer.setProperties(null);
        imageconsumer.setColorModel(aColorModel9768);
        imageconsumer.setHints(14);
    }

    public final synchronized void removeConsumer(ImageConsumer imageconsumer) {
        anInt9769++;
        if (imageconsumer == anImageConsumer9758)
            anImageConsumer9758 = null;
    }

    private final synchronized void method2617(byte i) {
        anInt9765++;
        if (anImageConsumer9758 != null) {
            if (i <= 107)
                method2612(-72, true, 84, -87, 9, 34, 118, null);
            anImageConsumer9758.setPixels(0, 0, ((Node_Sub40) this).anInt7281, ((Node_Sub40) this).anInt7284, aColorModel9768, (((Node_Sub40) this).anIntArray7283), 0, ((Node_Sub40) this).anInt7281);
            anImageConsumer9758.imageComplete(2);
        }
    }

    public static void method2618(int i) {
        aBigInteger9773 = null;
        if (i != -31835)
            method2615(34, 84, -23, null, 34, -1, 53, 122);
    }
}
