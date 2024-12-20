/* Class262 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class262 {
    static Interface19[] anInterface19Array2974 = new Interface19[128];
    static int anInt2975;
    static int anInt2976;
    static int anInt2977 = 0;
    static int anInt2978;
    static int anInt2979;
    static boolean[][] aBooleanArrayArray2980 = {{true, true, true, true, true, true, true, true, true, true, true, true, true}, {true, true, true, false, false, false, true, true, false, false, false, false, true}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, true, false, false, false, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {false, true, true, true, true, true, true, true, false, false, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, true, true, false, false, false, false, false, false, false, true, true, false}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13]};

    static final void method2767(int i, int i_0_, int i_1_) {
        if (Class332.anInt3883 != 0) {
            if ((i_0_ ^ 0xffffffff) <= -1)
                Node_Sub8_Sub3.anIntArray8924[i_0_] = i;
            else {
                for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -17; i_2_++)
                    Node_Sub8_Sub3.anIntArray8924[i_2_] = i;
            }
        }
        if (i_1_ != 2)
            anInterface19Array2974 = null;
        anInt2975++;
        Class161.aClass248_Sub15_Sub1_1895.method2422((byte) -119, i_0_, i);
    }

    public static void method2768(int i) {
        aBooleanArrayArray2980 = null;
        anInterface19Array2974 = null;
        if (i != 3)
            method2770(true, (byte) -47);
    }

    static final void method2769(int i, Color color, byte i_3_, Color color_4_, String string, Color color_5_) {
        anInt2976++;
        try {
            Graphics graphics = Class297_Sub1.aCanvas8478.getGraphics();
            if (Class275_Sub2.aFont8603 == null)
                Class275_Sub2.aFont8603 = new Font("Helvetica", 1, 13);
            if (color_5_ == null)
                color_5_ = new Color(140, 17, 17);
            if (color == null)
                color = new Color(140, 17, 17);
            if (color_4_ == null)
                color_4_ = new Color(255, 255, 255);
            try {
                int i_6_ = -25 / ((i_3_ - 32) / 53);
                if (Class211.anImage2448 == null)
                    Class211.anImage2448 = Class297_Sub1.aCanvas8478.createImage((Class146.anInt1724), (Class282_Sub20.anInt7800));
                Graphics graphics_7_ = Class211.anImage2448.getGraphics();
                graphics_7_.setColor(Color.black);
                graphics_7_.fillRect(0, 0, Class146.anInt1724, Class282_Sub20.anInt7800);
                int i_8_ = Class146.anInt1724 / 2 - 152;
                int i_9_ = Class282_Sub20.anInt7800 / 2 + -18;
                graphics_7_.setColor(color);
                graphics_7_.drawRect(i_8_, i_9_, 303, 33);
                graphics_7_.setColor(color_5_);
                graphics_7_.fillRect(i_8_ - -2, 2 + i_9_, 3 * i, 30);
                graphics_7_.setColor(Color.black);
                graphics_7_.drawRect(i_8_ + 1, 1 + i_9_, 301, 31);
                graphics_7_.fillRect(3 * i + (i_8_ - -2), 2 + i_9_, -(3 * i) + 300, 30);
                graphics_7_.setFont(Class275_Sub2.aFont8603);
                graphics_7_.setColor(color_4_);
                graphics_7_.drawString(string, i_8_ + (304 - 6 * string.length()) / 2, i_9_ - -22);
                if (Class316_Sub1_Sub2.aString9860 != null) {
                    graphics_7_.setFont(Class275_Sub2.aFont8603);
                    graphics_7_.setColor(color_4_);
                    graphics_7_.drawString(Class316_Sub1_Sub2.aString9860, (Class146.anInt1724 / 2 + -(Class316_Sub1_Sub2.aString9860.length() * 6 / 2)), -26 + Class282_Sub20.anInt7800 / 2);
                }
                graphics.drawImage(Class211.anImage2448, 0, 0, null);
            } catch (Exception exception) {
                graphics.setColor(Color.black);
                graphics.fillRect(0, 0, Class146.anInt1724, Class282_Sub20.anInt7800);
                int i_10_ = -152 + Class146.anInt1724 / 2;
                int i_11_ = -18 + Class282_Sub20.anInt7800 / 2;
                graphics.setColor(color);
                graphics.drawRect(i_10_, i_11_, 303, 33);
                graphics.setColor(color_5_);
                graphics.fillRect(i_10_ - -2, 2 + i_11_, i * 3, 30);
                graphics.setColor(Color.black);
                graphics.drawRect(i_10_ - -1, i_11_ - -1, 301, 31);
                graphics.fillRect(3 * i + (2 + i_10_), i_11_ - -2, -(3 * i) + 300, 30);
                graphics.setFont(Class275_Sub2.aFont8603);
                graphics.setColor(color_4_);
                if (Class316_Sub1_Sub2.aString9860 != null) {
                    graphics.setFont(Class275_Sub2.aFont8603);
                    graphics.setColor(color_4_);
                    graphics.drawString(Class316_Sub1_Sub2.aString9860, (Class146.anInt1724 / 2 - 6 * Class316_Sub1_Sub2.aString9860.length() / 2), Class282_Sub20.anInt7800 / 2 + -26);
                }
                graphics.drawString(string, i_10_ + (-(6 * string.length()) + 304) / 2, 22 + i_11_);
            }
        } catch (Exception exception) {
            Class297_Sub1.aCanvas8478.repaint();
        }
    }

    static final void method2770(boolean bool, byte i) {
        if (bool && Class116.aClass248_Sub8_Sub1_1434 != null)
            Node_Sub11_Sub1.anInt9135 = (((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).anInt8895);
        else
            Node_Sub11_Sub1.anInt9135 = -1;
        anInt2978++;
        WorldAddress.aClass354_1193 = null;
        Class102.aClass293_1308 = null;
        Node_Sub14_Sub5.anInt9208 = 0;
        if (i <= -122) {
            Class116.aClass248_Sub8_Sub1_1434 = null;
            Class116.method1078();
            Class116.aClass293_1443.method3121(10);
            Node_Sub15_Sub4.aClass243_9698 = null;
            Class340_Sub8.aClass243_8196 = null;
            Node_Sub14_Sub17.aClass243_9341 = null;
            Node_Sub8_Sub10.aClass243_8978 = null;
            Class377.aClass243_4623 = null;
            ha_Sub2.anInt5704 = -1;
            Class238_Sub3.aClass243_6774 = null;
            Class102.aClass243_1310 = null;
            Class198.aClass243_2267 = null;
            Class366.aClass129_4491 = null;
            Class59.anInt810 = -1;
            Class116.aClass380_1444 = null;
            if (Class116.aClass257_1436 != null) {
                Class116.aClass257_1436.method2755(0);
                Class116.aClass257_1436.method2751(128, (byte) -90, 64);
            }
            if (Class116.aClass39_1435 != null)
                Class116.aClass39_1435.method290(1, 64, 64);
            if (Class116.aClass368_1437 != null)
                Class116.aClass368_1437.method3842(64, true);
            Class229.aClass331_2582.method3396(64, -886);
        }
    }
}
