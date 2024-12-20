/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.image.PixelGrabber;

final class Class243 {
    private int anInt2703;
    private int[] anIntArray2704 = new int[4];
    private static int anInt2705 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".length();
    private int[] anIntArray2706;
    private boolean aBoolean2707 = false;
    private static int[] anIntArray2708 = new int[256];
    private Class129[] aClass129Array2709;
    private int anInt2710;

    final int method1935() {
        return anInt2710;
    }

    final int method1936() {
        return anInt2703 - 1;
    }

    final int method1937(String string) {
        int i = 0;
        for (int i_0_ = 0; i_0_ < string.length(); i_0_++) {
            int i_1_ = anIntArray2708[string.charAt(i_0_)];
            i += anIntArray2706[i_1_];
        }
        return i;
    }

    private final void method1938(ha var_ha, String string, int[] is, int i, int i_2_, int i_3_, boolean bool) {
        if (i_3_ == 0)
            bool = false;
        i_3_ |= ~0xffffff;
        for (int i_4_ = 0; i_4_ < string.length(); i_4_++) {
            int i_5_ = anIntArray2708[string.charAt(i_4_)];
            if (bool)
                aClass129Array2709[i_5_].method1178(i + 1, i_2_ + 1, 0, -16777216, 1);
            aClass129Array2709[i_5_].method1178(i, i_2_, 0, i_3_, 1);
            i += anIntArray2706[i_5_];
        }
    }

    final void method1939(ha var_ha, String string, int i, int i_6_, int i_7_, boolean bool) {
        int i_8_ = method1937(string) / 2;
        var_ha.K(anIntArray2704);
        if (i - i_8_ <= anIntArray2704[2] && i + i_8_ >= anIntArray2704[0] && i_6_ - anInt2710 <= anIntArray2704[3] && i_6_ + anInt2703 >= anIntArray2704[1])
            method1938(var_ha, string, anIntArray2704, i - i_8_, i_6_, i_7_, bool);
    }

    private final void method1940(ha var_ha, Font font, FontMetrics fontmetrics, char c, int i, boolean bool) {
        int i_9_ = fontmetrics.charWidth(c);
        int i_10_ = i_9_;
        if (bool) {
            try {
                if (c == '/')
                    bool = false;
                if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W')
                    i_9_++;
            } catch (Exception exception) {
                /* empty */
            }
        }
        int i_11_ = fontmetrics.getMaxAscent();
        int i_12_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
        int i_13_ = fontmetrics.getHeight();
        Image image = Class297_Sub1.aCanvas8478.createImage(i_9_, i_12_);
        Graphics graphics = image.getGraphics();
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, i_9_, i_12_);
        graphics.setColor(Color.white);
        graphics.setFont(font);
        graphics.drawString(String.valueOf(c), 0, i_11_);
        if (bool)
            graphics.drawString(String.valueOf(c), 1, i_11_);
        int[] is = new int[i_9_ * i_12_];
        PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_9_, i_12_, is, 0, i_9_);
        try {
            pixelgrabber.grabPixels();
        } catch (Exception exception) {
            /* empty */
        }
        image.flush();
        Object object = null;
        int i_14_ = 0;
        while_166_:
        for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
            for (int i_16_ = 0; i_16_ < i_9_; i_16_++) {
                int i_17_ = is[i_16_ + i_15_ * i_9_];
                if ((i_17_ & 0xffffff) != 0) {
                    i_14_ = i_15_;
                    break while_166_;
                }
            }
        }
        for (int i_18_ = 0; i_18_ < is.length; i_18_++) {
            if ((is[i_18_] & 0xffffff) == 0)
                is[i_18_] = 0;
        }
        anInt2710 = i_11_ - i_14_;
        anInt2703 = i_13_;
        anIntArray2706[i] = i_10_;
        aClass129Array2709[i] = var_ha.method813(i_12_, (byte) 99, i_9_, is, 0, i_9_);
    }

    public static void method1941() {
        anIntArray2708 = null;
    }

    Class243(ha var_ha, int i, boolean bool, Component component) {
        aBoolean2707 = false;
        aClass129Array2709 = new Class129[256];
        anIntArray2706 = new int[256];
        Font font = new Font("Helvetica", bool ? 1 : 0, i);
        FontMetrics fontmetrics = component.getFontMetrics(font);
        for (int i_19_ = 0; i_19_ < anInt2705; i_19_++)
            method1940(var_ha, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_19_), i_19_, false);
        if (bool && aBoolean2707) {
            aBoolean2707 = false;
            font = new Font("Helvetica", 0, i);
            fontmetrics = component.getFontMetrics(font);
            for (int i_20_ = 0; i_20_ < anInt2705; i_20_++)
                method1940(var_ha, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_20_), i_20_, false);
            if (!aBoolean2707) {
                aBoolean2707 = false;
                for (int i_21_ = 0; i_21_ < anInt2705; i_21_++)
                    method1940(var_ha, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_21_), i_21_, true);
            }
        }
    }

    static {
        for (int i = 0; i < 256; i++) {
            int i_22_ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".indexOf(i);
            if (i_22_ == -1)
                i_22_ = 74;
            anIntArray2708[i] = i_22_;
        }
    }
}
