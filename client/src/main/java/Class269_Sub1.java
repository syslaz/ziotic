/* Class269_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.event.*;

final class Class269_Sub1 extends Class269 implements MouseListener, MouseMotionListener, MouseWheelListener {
    private int anInt7516;
    private int anInt7517;
    private Class293 aClass293_7518 = new Class293();
    private int anInt7519;
    private int anInt7520;
    private int anInt7521;
    private Class293 aClass293_7522 = new Class293();
    private int anInt7523;
    private Component aComponent7524;
    private boolean aBoolean7525;

    final synchronized void method2815(int i) {
        anInt7519 = anInt7521;
        anInt7516 = anInt7523;
        anInt7517 = anInt7520;
        Class293 class293 = aClass293_7518;
        aClass293_7518 = aClass293_7522;
        aClass293_7522 = class293;
        if (i != -6928)
            anInt7519 = 74;
        aClass293_7522.method3121(10);
    }

    public final synchronized void mouseEntered(MouseEvent mouseevent) {
        method2821(mouseevent.getX(), mouseevent.getY(), (byte) -123);
    }

    public final synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
        int i = mousewheelevent.getX();
        int i_0_ = mousewheelevent.getY();
        int i_1_ = mousewheelevent.getWheelRotation();
        method2822(i, (byte) -118, 6, i_1_, i_0_);
        mousewheelevent.consume();
    }

    private final int method2818(MouseEvent mouseevent, int i) {
        if (mouseevent.getButton() == 1) {
            if (mouseevent.isMetaDown())
                return 4;
            return 1;
        }
        if (mouseevent.getButton() == 2)
            return 2;
        if (i != 4)
            return -35;
        if (mouseevent.getButton() == 3)
            return 4;
        return 0;
    }

    public final synchronized void mousePressed(MouseEvent mouseevent) {
        int i = method2818(mouseevent, 4);
        if (i == 1)
            method2822(mouseevent.getX(), (byte) 105, 0, mouseevent.getClickCount(), mouseevent.getY());
        else if (i != 4) {
            if (i == 2)
                method2822(mouseevent.getX(), (byte) -110, 1, mouseevent.getClickCount(), mouseevent.getY());
        } else
            method2822(mouseevent.getX(), (byte) 57, 2, mouseevent.getClickCount(), mouseevent.getY());
        anInt7523 |= i;
        if (mouseevent.isPopupTrigger())
            mouseevent.consume();
    }

    final int method2817(byte i) {
        if (i > -48)
            return 64;
        return anInt7519;
    }

    final Node_Sub39 method2810(byte i) {
        if (i <= 125)
            method2814((byte) -109);
        return (Node_Sub39) aClass293_7518.method3108(false);
    }

    private final void method2819(int i) {
        if (null != aComponent7524) {
            aComponent7524.removeMouseWheelListener(this);
            aComponent7524.removeMouseMotionListener(this);
            aComponent7524.removeMouseListener(this);
            aClass293_7522 = null;
            aClass293_7518 = null;
            if (i == 32693) {
                anInt7521 = anInt7520 = anInt7523 = 0;
                anInt7519 = anInt7517 = anInt7516 = 0;
                aComponent7524 = null;
            }
        }
    }

    public final synchronized void mouseReleased(MouseEvent mouseevent) {
        int i = method2818(mouseevent, 4);
        if ((i & anInt7523) == 0)
            i = anInt7523;
        if (-1 != (0x1 & i ^ 0xffffffff))
            method2822(mouseevent.getX(), (byte) 22, 3, mouseevent.getClickCount(), mouseevent.getY());
        if ((i & 0x4 ^ 0xffffffff) != -1)
            method2822(mouseevent.getX(), (byte) 100, 5, mouseevent.getClickCount(), mouseevent.getY());
        if ((0x2 & i) != 0)
            method2822(mouseevent.getX(), (byte) -108, 4, mouseevent.getClickCount(), mouseevent.getY());
        anInt7523 &= i ^ 0xffffffff;
        if (mouseevent.isPopupTrigger())
            mouseevent.consume();
    }

    public final synchronized void mouseMoved(MouseEvent mouseevent) {
        method2821(mouseevent.getX(), mouseevent.getY(), (byte) -127);
    }

    private final void method2820(Component component, int i) {
        if (i != -12969)
            anInt7521 = -106;
        method2819(32693);
        aComponent7524 = component;
        aComponent7524.addMouseListener(this);
        aComponent7524.addMouseMotionListener(this);
        aComponent7524.addMouseWheelListener(this);
    }

    final boolean method2814(byte i) {
        if (i <= 49)
            return true;
        return (0x1 & anInt7516) != 0;
    }

    public final synchronized void mouseDragged(MouseEvent mouseevent) {
        method2821(mouseevent.getX(), mouseevent.getY(), (byte) -125);
    }

    private final void method2821(int i, int i_2_, byte i_3_) {
        anInt7520 = i_2_;
        anInt7521 = i;
        if (i_3_ <= -111) {
            if (aBoolean7525)
                method2822(i, (byte) 124, -1, 0, i_2_);
        }
    }

    private final void method2822(int i, byte i_4_, int i_5_, int i_6_, int i_7_) {
        Node_Sub39_Sub1 class248_sub39_sub1 = new Node_Sub39_Sub1();
        ((Node_Sub39_Sub1) class248_sub39_sub1).anInt9740 = i;
        ((Node_Sub39_Sub1) class248_sub39_sub1).anInt9743 = i_5_;
        ((Node_Sub39_Sub1) class248_sub39_sub1).anInt9739 = i_7_;
        ((Node_Sub39_Sub1) class248_sub39_sub1).aLong9742 = Class118.method1112(116);
        int i_8_ = 3 / ((-45 - i_4_) / 56);
        ((Node_Sub39_Sub1) class248_sub39_sub1).anInt9741 = i_6_;
        aClass293_7522.method3109(class248_sub39_sub1, -97);
    }

    public final synchronized void mouseExited(MouseEvent mouseevent) {
        method2821(mouseevent.getX(), mouseevent.getY(), (byte) -125);
    }

    final void method2806(byte i) {
        int i_9_ = -119 / ((-18 - i) / 38);
        method2819(32693);
    }

    final boolean method2813(boolean bool) {
        if (bool)
            method2817((byte) 110);
        return 0 != (anInt7516 & 0x2);
    }

    final boolean method2811(boolean bool) {
        if (bool)
            aBoolean7525 = true;
        return 0 != (0x4 & anInt7516);
    }

    final int method2809(int i) {
        if (i <= 38)
            aClass293_7518 = null;
        return anInt7517;
    }

    public final synchronized void mouseClicked(MouseEvent mouseevent) {
        if (mouseevent.isPopupTrigger())
            mouseevent.consume();
    }

    Class269_Sub1(Component component, boolean bool) {
        method2820(component, -12969);
        aBoolean7525 = bool;
    }
}
