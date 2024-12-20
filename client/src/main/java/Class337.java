/* Class337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.image.PixelGrabber;

final class Class337 {
    static int anInt3924;
    Interface18_Impl1 anInterface18_Impl1_3925;
    static int anInt3926;
    boolean aBoolean3927;
    boolean aBoolean3928;
    static int anInt3929;
    static int anInt3930;
    static int anInt3931;
    static Class17 aClass17_3932 = new Class17();
    static int anInt3933;
    static boolean aBoolean3934 = false;
    Interface18_Impl1 anInterface18_Impl1_3935;

    static final Class129 method3419(int i, byte[] is) {
        if (i >= -38)
            method3421((byte) 103, -9, 116, 65, -114, 20, 111);
        anInt3924++;
        if (is == null)
            throw new RuntimeException("");
        for (; ; ) {
            try {
                Image image = Toolkit.getDefaultToolkit().createImage(is);
                MediaTracker mediatracker = new MediaTracker(Node_Sub8_Sub16_Sub1.aClient10301);
                mediatracker.addImage(image, 0);
                mediatracker.waitForAll();
                int i_0_ = image.getWidth(Node_Sub8_Sub16_Sub1.aClient10301);
                int i_1_ = image.getHeight(Node_Sub8_Sub16_Sub1.aClient10301);
                if (mediatracker.isErrorAny() || (i_0_ ^ 0xffffffff) > -1 || (i_1_ ^ 0xffffffff) > -1)
                    throw new RuntimeException("");
                int[] is_2_ = new int[i_0_ * i_1_];
                PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_0_, i_1_, is_2_, 0, i_0_);
                pixelgrabber.grabPixels();
                return Class287.aHa3381.method813(i_1_, (byte) 99, i_0_, is_2_, 0, i_0_);
            } catch (InterruptedException interruptedexception) {
                /* empty */
            }
        }
    }

    static final int method3420(int i) {
        anInt3929++;
        if (i == (Node_Sub15_Sub4.anInt9694 ^ 0xffffffff))
            return Class267.anInt4920;
        return 0;
    }

    static final Class316 method3421(byte i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        anInt3930++;
        if (i != -121)
            aBoolean3934 = true;
        long l = (32147369L * (long) i_7_ ^ (986053L * (long) i_4_ ^ ((long) i_5_ * 475427L ^ (67481L * (long) i_8_ ^ 97549L * (long) i_3_))) ^ 76724863L * (long) i_6_);
        Class316 class316 = (Class316) Class192.aClass278_2204.method2863(4, l);
        if (class316 != null)
            return class316;
        class316 = Class282_Sub25.aHa7855.d(i_8_, i_3_, i_5_, i_4_, i_7_, i_6_);
        Class192.aClass278_2204.method2867((byte) 0, l, class316);
        return class316;
    }

    public static void method3422(byte i) {
        aClass17_3932 = null;
        int i_9_ = 44 % ((i - 67) / 54);
    }

    final void method3423(boolean bool) {
        if (bool != true)
            method3420(18);
        anInt3933++;
        if (((Class337) this).anInterface18_Impl1_3925 != null)
            ((Class337) this).anInterface18_Impl1_3925.method3(false);
        ((Class337) this).aBoolean3927 = false;
    }

    final boolean method3424(int i) {
        if (i != 29782)
            return true;
        anInt3931++;
        if (!((Class337) this).aBoolean3927 || ((Class337) this).aBoolean3928)
            return false;
        return true;
    }

    Class337(boolean bool) {
        ((Class337) this).aBoolean3928 = bool;
    }
}
