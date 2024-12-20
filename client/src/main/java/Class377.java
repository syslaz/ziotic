/* Class377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class377 {
    static int anInt4617;
    int anInt4618;
    int anInt4619;
    int anInt4620;
    static Class208 aClass208_4621 = new Class208(9, 2);
    static int anInt4622;
    static Class243 aClass243_4623;
    static int anInt4624;
    static int anInt4625;
    int anInt4626;
    static OutgoingOpcode aOutgoingOpcode_4627 = new OutgoingOpcode(40, 2);
    static int anInt4628 = 0;
    static int[] anIntArray4629 = new int[1000];

    static final void method3883(int i, byte i_0_) {
        anInt4625++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i, -874792672, 10);
        if (i_0_ <= 92)
            method3883(81, (byte) -11);
        class248_sub8_sub10.method2076(-117);
    }

    static final void method3884(boolean bool) {
        anInt4617++;
        if (Node_Sub48.aFrame7432 == null) {
            int i = Class323.anInt3791;
            int i_1_ = Class346_Sub10.anInt8351;
            int i_2_ = Class279_Sub1_Sub2.anInt9824 + -Class146.anInt1724 + -i;
            int i_3_ = -i_1_ + (Class223.anInt5196 - Class282_Sub20.anInt7800);
            if (bool != false)
                method3883(-60, (byte) -100);
            do {
                if (i > 0 || (i_2_ ^ 0xffffffff) < -1 || (i_1_ ^ 0xffffffff) < -1 || (i_3_ ^ 0xffffffff) < -1) {
                    try {
                        java.awt.Container container;
                        if (Class300.aFrame3494 != null)
                            container = Class300.aFrame3494;
                        else if (Class158.anApplet1881 != null)
                            container = Class158.anApplet1881;
                        else
                            container = Class54_Sub1.anApplet_Sub1_5332;
                        int i_4_ = 0;
                        int i_5_ = 0;
                        if (Class300.aFrame3494 == container) {
                            Insets insets = Class300.aFrame3494.getInsets();
                            i_5_ = insets.top;
                            i_4_ = insets.left;
                        }
                        Graphics graphics = container.getGraphics();
                        graphics.setColor(Color.black);
                        if (i > 0)
                            graphics.fillRect(i_4_, i_5_, i, Class223.anInt5196);
                        if ((i_1_ ^ 0xffffffff) < -1)
                            graphics.fillRect(i_4_, i_5_, Class279_Sub1_Sub2.anInt9824, i_1_);
                        if (i_2_ > 0)
                            graphics.fillRect((Class279_Sub1_Sub2.anInt9824 + (i_4_ + -i_2_)), i_5_, i_2_, Class223.anInt5196);
                        if (i_3_ <= 0)
                            break;
                        graphics.fillRect(i_4_, i_5_ + (Class223.anInt5196 + -i_3_), Class279_Sub1_Sub2.anInt9824, i_3_);
                    } catch (Exception exception) {
                        break;
                    }
                    break;
                }
            } while (false);
        }
    }

    static final int method3885(int i, boolean bool, int i_6_, String string) {
        if (i_6_ != 25744)
            method3887(-28, 116, 11, (byte) 45, 125);
        anInt4622++;
        if (i < 2 || i > 36)
            throw new IllegalArgumentException("Invalid radix:" + i);
        boolean bool_7_ = false;
        boolean bool_8_ = false;
        int i_9_ = 0;
        int i_10_ = string.length();
        for (int i_11_ = 0; (i_10_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
            int i_12_ = string.charAt(i_11_);
            if ((i_11_ ^ 0xffffffff) == -1) {
                if (i_12_ == 45) {
                    bool_7_ = true;
                    continue;
                }
                if ((i_12_ ^ 0xffffffff) == -44 && bool)
                    continue;
            }
            if ((i_12_ ^ 0xffffffff) > -49 || i_12_ > 57) {
                if (i_12_ >= 65 && i_12_ <= 90)
                    i_12_ -= 55;
                else if (i_12_ >= 97 && (i_12_ ^ 0xffffffff) >= -123)
                    i_12_ -= 87;
                else
                    throw new NumberFormatException();
            } else
                i_12_ -= 48;
            if ((i_12_ ^ 0xffffffff) <= (i ^ 0xffffffff))
                throw new NumberFormatException();
            if (bool_7_)
                i_12_ = -i_12_;
            int i_13_ = i_12_ + i_9_ * i;
            if ((i_13_ / i ^ 0xffffffff) != (i_9_ ^ 0xffffffff))
                throw new NumberFormatException();
            i_9_ = i_13_;
            bool_8_ = true;
        }
        if (!bool_8_)
            throw new NumberFormatException();
        return i_9_;
    }

    public static void method3886(int i) {
        anIntArray4629 = null;
        aClass243_4623 = null;
        aOutgoingOpcode_4627 = null;
        aClass208_4621 = null;
        if (i >= -65)
            aClass243_4623 = null;
    }

    public Class377() {
        /* empty */
    }

    static final void method3887(int i, int i_14_, int i_15_, byte i_16_, int i_17_) {
        anInt4624++;
        float f = (float) Class116.anInt1457 / (float) Class116.anInt1465;
        int i_18_ = i_14_;
        int i_19_ = i;
        if (!(f < 1.0F))
            i_18_ = (int) ((float) i / f);
        else
            i_19_ = (int) (f * (float) i_14_);
        i_15_ -= (i + -i_19_) / 2;
        i_17_ -= (-i_18_ + i_14_) / 2;
        if (i_16_ <= -125) {
            Class59.anInt810 = -1;
            Class261.anInt2972 = Class116.anInt1457 + -(i_15_ * Class116.anInt1457 / i_19_);
            Node_Sub14_Sub30.anInt9478 = Class116.anInt1465 * i_17_ / i_18_;
            ha_Sub2.anInt5704 = -1;
            Class296.method3132((byte) -7);
        }
    }
}
