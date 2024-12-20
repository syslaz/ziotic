/* Class269_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class Class269_Sub2 extends Class269 implements MouseListener, MouseMotionListener {
    static int anInt7526;
    private Class293 aClass293_7527 = new Class293();
    static int anInt7528;
    static int anInt7529;
    static int anInt7530;
    static int anInt7531;
    static int anInt7532;
    static int anInt7533;
    static int anInt7534;
    private int anInt7535;
    static int anInt7536;
    static int anInt7537;
    static int anInt7538;
    static int anInt7539;
    static int anInt7540;
    static int anInt7541;
    private int anInt7542;
    static int[] anIntArray7543;
    static int anInt7544;
    static int anInt7545;
    static float[] aFloatArray7546 = new float[2];
    static int anInt7547;
    static int[] anIntArray7548 = new int[2048];
    private int anInt7549;
    static int anInt7550;
    private int anInt7551;
    static int anInt7552;
    private int anInt7553;
    static int anInt7554;
    private int anInt7555;
    private Class293 aClass293_7556 = new Class293();
    private Component aComponent7557;
    private boolean aBoolean7558;

    private final int method2823(byte i, MouseEvent mouseevent) {
        anInt7539++;
        int i_0_ = mouseevent.getModifiers();
        boolean bool = (0x10 & i_0_ ^ 0xffffffff) != -1;
        boolean bool_1_ = (0x8 & i_0_ ^ 0xffffffff) != -1;
        boolean bool_2_ = (i_0_ & 0x4) != 0;
        if (bool_1_ && (bool || bool_2_))
            bool_1_ = false;
        if (bool && bool_2_)
            return 4;
        if (bool)
            return 1;
        if (bool_1_)
            return 2;
        if (bool_2_)
            return 4;
        int i_3_ = 46 % ((i - 76) / 45);
        return 0;
    }

    public final synchronized void mouseMoved(MouseEvent mouseevent) {
        anInt7550++;
        method2828(-1, mouseevent.getX(), mouseevent.getY());
    }

    public final synchronized void mouseClicked(MouseEvent mouseevent) {
        if (mouseevent.isPopupTrigger())
            mouseevent.consume();
        anInt7541++;
    }

    final boolean method2811(boolean bool) {
        if (bool != false)
            aBoolean7558 = true;
        anInt7537++;
        if ((anInt7549 & 0x4 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    final synchronized void method2815(int i) {
        anInt7547++;
        anInt7549 = anInt7553;
        anInt7535 = anInt7551;
        if (i == -6928) {
            anInt7542 = anInt7555;
            Class293 class293 = aClass293_7527;
            aClass293_7527 = aClass293_7556;
            aClass293_7556 = class293;
            aClass293_7556.method3121(10);
        }
    }

    private final void method2824(int i) {
        anInt7531++;
        if (aComponent7557 != null) {
            aComponent7557.removeMouseMotionListener(this);
            aComponent7557.removeMouseListener(this);
            aClass293_7527 = null;
            aComponent7557 = null;
            anInt7551 = anInt7555 = anInt7553 = i;
            aClass293_7556 = null;
            anInt7535 = anInt7542 = anInt7549 = 0;
        }
    }

    final boolean method2813(boolean bool) {
        if (bool != false)
            method2824(88);
        anInt7544++;
        if ((anInt7549 & 0x2) == 0)
            return false;
        return true;
    }

    public final synchronized void mouseReleased(MouseEvent mouseevent) {
        anInt7536++;
        int i = method2823((byte) 121, mouseevent);
        if ((anInt7553 & i ^ 0xffffffff) == -1)
            i = anInt7553;
        if ((0x1 & i ^ 0xffffffff) != -1)
            method2825(mouseevent.getY(), 3, mouseevent.getX(), mouseevent.getClickCount(), false);
        if ((i & 0x4 ^ 0xffffffff) != -1)
            method2825(mouseevent.getY(), 5, mouseevent.getX(), mouseevent.getClickCount(), false);
        if ((0x2 & i) != 0)
            method2825(mouseevent.getY(), 4, mouseevent.getX(), mouseevent.getClickCount(), false);
        anInt7553 &= i ^ 0xffffffff;
        if (mouseevent.isPopupTrigger())
            mouseevent.consume();
    }

    public final synchronized void mousePressed(MouseEvent mouseevent) {
        anInt7545++;
        int i = method2823((byte) 123, mouseevent);
        if ((i ^ 0xffffffff) == -2)
            method2825(mouseevent.getY(), 0, mouseevent.getX(), mouseevent.getClickCount(), false);
        else if (i != 4) {
            if (i == 2)
                method2825(mouseevent.getY(), 1, mouseevent.getX(), mouseevent.getClickCount(), false);
        } else
            method2825(mouseevent.getY(), 2, mouseevent.getX(), mouseevent.getClickCount(), false);
        anInt7553 |= i;
        if (mouseevent.isPopupTrigger())
            mouseevent.consume();
    }

    private final void method2825(int i, int i_4_, int i_5_, int i_6_, boolean bool) {
        anInt7540++;
        Node_Sub39_Sub2 class248_sub39_sub2 = new Node_Sub39_Sub2();
        ((Node_Sub39_Sub2) class248_sub39_sub2).anInt9755 = i_5_;
        ((Node_Sub39_Sub2) class248_sub39_sub2).anInt9749 = i_4_;
        ((Node_Sub39_Sub2) class248_sub39_sub2).anInt9750 = i_6_;
        ((Node_Sub39_Sub2) class248_sub39_sub2).anInt9748 = i;
        if (bool != false)
            aBoolean7558 = true;
        ((Node_Sub39_Sub2) class248_sub39_sub2).aLong9745 = Class118.method1112(116);
        aClass293_7556.method3109(class248_sub39_sub2, -125);
    }

    public final synchronized void mouseExited(MouseEvent mouseevent) {
        method2828(-1, mouseevent.getX(), mouseevent.getY());
        anInt7530++;
    }

    public static void method2826(int i) {
        aFloatArray7546 = null;
        anIntArray7543 = null;
        if (i != -27364)
            aFloatArray7546 = null;
        anIntArray7548 = null;
    }

    public final synchronized void mouseEntered(MouseEvent mouseevent) {
        anInt7533++;
        method2828(-1, mouseevent.getX(), mouseevent.getY());
    }

    final Node_Sub39 method2810(byte i) {
        anInt7552++;
        if (i <= 125)
            anInt7551 = 120;
        return (Node_Sub39) aClass293_7527.method3108(false);
    }

    public final synchronized void mouseDragged(MouseEvent mouseevent) {
        anInt7532++;
        method2828(-1, mouseevent.getX(), mouseevent.getY());
    }

    final int method2817(byte i) {
        anInt7529++;
        if (i >= -48)
            aComponent7557 = null;
        return anInt7535;
    }

    final boolean method2814(byte i) {
        anInt7534++;
        if (i < 49)
            mouseDragged(null);
        if ((anInt7549 & 0x1) == 0)
            return false;
        return true;
    }

    private final void method2827(int i, Component component) {
        method2824(0);
        anInt7528++;
        aComponent7557 = component;
        if (i >= -20)
            mouseDragged(null);
        aComponent7557.addMouseListener(this);
        aComponent7557.addMouseMotionListener(this);
    }

    private final void method2828(int i, int i_7_, int i_8_) {
        if (i != -1)
            method2817((byte) 5);
        anInt7555 = i_8_;
        anInt7526++;
        anInt7551 = i_7_;
        if (aBoolean7558)
            method2825(i_8_, -1, i_7_, 0, false);
    }

    final int method2809(int i) {
        anInt7538++;
        if (i < 38)
            return -86;
        return anInt7542;
    }

    final void method2806(byte i) {
        anInt7554++;
        method2824(0);
        int i_9_ = 38 % ((-18 - i) / 38);
    }

    Class269_Sub2(Component component, boolean bool) {
        method2827(-48, component);
        aBoolean7558 = bool;
    }
}
