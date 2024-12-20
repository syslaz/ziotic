/* Class330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

abstract class Class330 {
    static int anInt3852;
    static int anInt3853;
    static Class17 aClass17_3854 = new Class17();
    static int anInt3855;
    static int anInt3856 = 0;

    public static void method3375(int i) {
        if (i > 46)
            aClass17_3854 = null;
    }

    abstract int method3376(int i, int i_0_);

    abstract void method3377(byte i, int i_1_);

    static final int method3378(int i, boolean bool, int i_2_) {
        anInt3852++;
        if (Class198.anInt2266 == -1)
            return 1;
        if (i != ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true)) {
            Class11.method208(i, Class41.aClass41_479.method301(Class191.anInt4822, (byte) -108), (byte) -9, true);
            if (i != ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true))
                return -1;
        }
        try {
            Dimension dimension = Class297_Sub1.aCanvas8478.getSize();
            Node_Sub19.method2518(Node_Sub14_Sub31.aClass285_9492, Canvas_Sub1.aClass48_71, Class287.aHa3381, (byte) -27, bool, Class41.aClass41_479.method301(Class191.anInt4822, (byte) -108));
            Class343 class343 = OutgoingOpcode.method1513(0, Node_Sub14_Sub9.aClass381_9245, -106, Class198.anInt2266);
            long l = Class118.method1112(116);
            Class287.aHa3381.la();
            Class272.aViewport_3166.method1859(0, Class84_Sub9.anInt5495, 0);
            Class287.aHa3381.a(Class272.aViewport_3166);
            Class287.aHa3381.DA(dimension.width / 2, dimension.height / 2, 512, 512);
            Class287.aHa3381.xa(1.0F);
            Class287.aHa3381.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            Class162 class162 = Class287.aHa3381.a(class343, 2048, 64, 64, 768);
            int i_3_ = 0;
            while_208_:
            for (int i_4_ = 0; i_4_ < 500; i_4_++) {
                Class287.aHa3381.GA(0);
                Class287.aHa3381.ya();
                for (int i_5_ = 15; i_5_ >= 0; i_5_--) {
                    for (int i_6_ = 0; i_5_ >= i_6_; i_6_++) {
                        Node_Sub14_Sub5.aViewport_9200.method1859((int) (((float) i_6_ - (float) i_5_ / 2.0F) * (float) Class241.anInt2692), 0, Class241.anInt2692 * (1 + i_5_));
                        class162.method1440(Node_Sub14_Sub5.aViewport_9200, null, 0);
                        i_3_++;
                        if ((-l + Class118.method1112(116) ^ 0xffffffffffffffffL) <= ((long) i_2_ ^ 0xffffffffffffffffL))
                            break while_208_;
                    }
                }
            }
            Class287.aHa3381.w();
            long l_7_ = (long) (i_3_ * 1000) / (Class118.method1112(116) + -l);
            Class287.aHa3381.GA(0);
            Class287.aHa3381.ya();
            return (int) l_7_;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return -1;
        }
    }

    abstract Class271 method3379(int i);

    abstract byte[] method3380(int i, int i_8_);

    public Class330() {
        /* empty */
    }

    static final int method3381(int i, int i_9_) {
        if (i_9_ != 10663)
            return -38;
        anInt3855++;
        return i >>> -640866168;
    }

    static final void method3382(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
        anInt3853++;
        if (i_10_ != 768)
            anInt3856 = 49;
        for (Class346_Sub1 class346_sub1 = ((Class346_Sub1) Class20.aClass360_308.method3815((byte) 108)); class346_sub1 != null; class346_sub1 = (Class346_Sub1) Class20.aClass360_308.method3809(-24951)) {
            if (Node_Sub18.anInt7027 >= ((Class346_Sub1) class346_sub1).anInt8246)
                class346_sub1.method3538(-122);
            else {
                Class216.method1742(((Class346_Sub1) class346_sub1).anInt8254, i_12_ >> -1144844767, i_11_ >> -2096018751, i, (((Class346_Sub1) class346_sub1).anInt8248 << 580037865) - -256, 2 * (((Class346_Sub1) class346_sub1).anInt8253), 256 + ((((Class346_Sub1) class346_sub1).anInt8249) << 1597627625), i_14_, (byte) -102);
                Node_Sub14_Sub27.aClass48_9449.method354(i_13_ - -Class303.anIntArray3527[0], 0, ((Class346_Sub1) class346_sub1).aString8243, Class303.anIntArray3527[1] + i_15_, ((Class346_Sub1) class346_sub1).anInt8244 | ~0xffffff, 0);
            }
        }
    }
}
