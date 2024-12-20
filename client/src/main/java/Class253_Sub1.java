/* Class253_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

final class Class253_Sub1 extends Class253 implements KeyListener, FocusListener {
    static int anInt7492;
    static int anInt7493;
    static int anInt7494;
    static int anInt7495;
    static int anInt7496;
    static int anInt7497;
    static int anInt7498;
    static int anInt7499;
    static int anInt7500;
    static int anInt7501;
    static OutgoingOpcode aOutgoingOpcode_7502 = new OutgoingOpcode(30, 1);
    static int anInt7503;
    static int anInt7504;
    private Class293 aClass293_7505 = new Class293();
    static int anInt7506;
    static int anInt7507;
    static int anInt7508;
    private Class293 aClass293_7509 = new Class293();
    static int anInt7510;
    private boolean[] aBooleanArray7511 = new boolean[112];
    static Class168 aClass168_7512 = new Class168(9, 0, 4, 1);
    private Component aComponent7513;
    static Class65 aClass65_7514 = new Class65(64);
    static IncommingOpcode aIncommingOpcode_7515 = new IncommingOpcode(23, 7);

    public final synchronized void keyReleased(KeyEvent keyevent) {
        anInt7503++;
        method2729(keyevent, 1, false);
    }

    final synchronized void method2718(byte i) {
        anInt7501++;
        aClass293_7505.method3121(10);
        if (i != -92)
            method2718((byte) -65);
        for (Node_Sub25 class248_sub25 = (Node_Sub25) aClass293_7509.method3108(false); class248_sub25 != null; class248_sub25 = (Node_Sub25) aClass293_7509.method3108(false)) {
            ((Node_Sub25) class248_sub25).anInt5166 = method2730(true);
            if (((Node_Sub25) class248_sub25).anInt5159 != 0) {
                if ((((Node_Sub25) class248_sub25).anInt5159 ^ 0xffffffff) != -2) {
                    if ((((Node_Sub25) class248_sub25).anInt5159 ^ 0xffffffff) != 0) {
                        if ((((Node_Sub25) class248_sub25).anInt5159 ^ 0xffffffff) == -4)
                            aClass293_7505.method3109(class248_sub25, -93);
                    } else {
                        for (int i_0_ = 0; i_0_ < 112; i_0_++) {
                            if (aBooleanArray7511[i_0_]) {
                                Node_Sub25 class248_sub25_1_ = new Node_Sub25();
                                ((Node_Sub25) class248_sub25_1_).anInt5166 = (((Node_Sub25) class248_sub25).anInt5166);
                                ((Node_Sub25) class248_sub25_1_).anInt5159 = 1;
                                ((Node_Sub25) class248_sub25_1_).anInt5165 = i_0_;
                                ((Node_Sub25) class248_sub25_1_).aLong5164 = (((Node_Sub25) class248_sub25).aLong5164);
                                ((Node_Sub25) class248_sub25_1_).aChar5162 = '\0';
                                aClass293_7505.method3109(class248_sub25_1_, i ^ 0x29);
                                aBooleanArray7511[i_0_] = false;
                            }
                        }
                    }
                } else if (aBooleanArray7511[((Node_Sub25) class248_sub25).anInt5165]) {
                    aClass293_7505.method3109(class248_sub25, i ^ 0x3a);
                    aBooleanArray7511[(((Node_Sub25) class248_sub25).anInt5165)] = false;
                }
            } else {
                if (!aBooleanArray7511[((Node_Sub25) class248_sub25).anInt5165]) {
                    Node_Sub25 class248_sub25_2_ = new Node_Sub25();
                    ((Node_Sub25) class248_sub25_2_).aLong5164 = ((Node_Sub25) class248_sub25).aLong5164;
                    ((Node_Sub25) class248_sub25_2_).anInt5159 = 0;
                    ((Node_Sub25) class248_sub25_2_).aChar5162 = '\0';
                    ((Node_Sub25) class248_sub25_2_).anInt5165 = ((Node_Sub25) class248_sub25).anInt5165;
                    ((Node_Sub25) class248_sub25_2_).anInt5166 = ((Node_Sub25) class248_sub25).anInt5166;
                    aClass293_7505.method3109(class248_sub25_2_, i + -16);
                    aBooleanArray7511[(((Node_Sub25) class248_sub25).anInt5165)] = true;
                }
                ((Node_Sub25) class248_sub25).anInt5159 = 2;
                aClass293_7505.method3109(class248_sub25, -91);
            }
        }
    }

    private final void method2724(int i, Component component) {
        anInt7496++;
        method2725(-128);
        aComponent7513 = component;
        Method method = Class174.aMethod2029;
        if (method != null) {
            try {
                method.invoke(aComponent7513, new Object[]{Boolean.FALSE});
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        aComponent7513.addKeyListener(this);
        aComponent7513.addFocusListener(this);
        if (i != -6159)
            method2727(-89, false, 54);
    }

    private final void method2725(int i) {
        anInt7498++;
        if (aComponent7513 != null) {
            aComponent7513.removeKeyListener(this);
            aComponent7513.removeFocusListener(this);
            aComponent7513 = null;
            for (int i_3_ = 0; i_3_ < 112; i_3_++)
                aBooleanArray7511[i_3_] = false;
            int i_4_ = -62 % ((-67 - i) / 52);
            aClass293_7505.method3121(10);
            aClass293_7509.method3121(10);
        }
    }

    final void method2719(int i) {
        if (i == -1) {
            anInt7492++;
            method2725(i ^ ~0x7f);
        }
    }

    public static void method2726(int i) {
        if (i != -9959)
            aClass168_7512 = null;
        aOutgoingOpcode_7502 = null;
        aIncommingOpcode_7515 = null;
        aClass168_7512 = null;
        aClass65_7514 = null;
    }

    public final synchronized void keyTyped(KeyEvent keyevent) {
        anInt7506++;
        char c = keyevent.getKeyChar();
        if ((c ^ 0xffffffff) != -1 && Applet_Sub1.method101(c, -90)) {
            method2731(c, 3, 0, -1);
            keyevent.consume();
        }
    }

    static final boolean method2727(int i, boolean bool, int i_5_) {
        if (bool != false)
            return false;
        anInt7495++;
        if ((0x8000 & i ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    final boolean method2722(boolean bool, int i) {
        anInt7493++;
        if ((i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) <= -113)
            return false;
        if (bool != true)
            return true;
        return aBooleanArray7511[i];
    }

    public final void focusGained(FocusEvent focusevent) {
        anInt7494++;
    }

    static final void method2728(boolean bool) {
        anInt7508++;
        Class262.method2767(255, -1, 2);
        if (bool != false)
            method2727(-91, false, 116);
    }

    private final void method2729(KeyEvent keyevent, int i, boolean bool) {
        anInt7499++;
        int i_6_ = keyevent.getKeyCode();
        if (i_6_ != 0) {
            if ((i_6_ ^ 0xffffffff) > -1 || ((Class282_Sub27.anIntArray7877.length ^ 0xffffffff) >= (i_6_ ^ 0xffffffff)))
                i_6_ = 0;
            else {
                i_6_ = Class282_Sub27.anIntArray7877[i_6_];
                if (i == 0 && (i_6_ & 0x80) != 0)
                    i_6_ = 0;
                else
                    i_6_ &= ~0x80;
            }
        } else
            i_6_ = 0;
        if ((i_6_ ^ 0xffffffff) != -1 && bool == false) {
            method2731('\0', i, 0, i_6_);
            keyevent.consume();
        }
    }

    final Interface19 method2723(int i) {
        if (i != 20175)
            aClass65_7514 = null;
        anInt7500++;
        return (Interface19) aClass293_7505.method3108(false);
    }

    public final synchronized void focusLost(FocusEvent focusevent) {
        anInt7510++;
        method2731('\0', -1, 0, 0);
    }

    private final int method2730(boolean bool) {
        anInt7497++;
        int i = 0;
        if (aBooleanArray7511[81])
            i |= 0x1;
        if (bool != true)
            return -37;
        if (aBooleanArray7511[82])
            i |= 0x4;
        if (aBooleanArray7511[86])
            i |= 0x2;
        return i;
    }

    private final void method2731(char c, int i, int i_7_, int i_8_) {
        anInt7504++;
        Node_Sub25 class248_sub25 = new Node_Sub25();
        ((Node_Sub25) class248_sub25).anInt5165 = i_8_;
        ((Node_Sub25) class248_sub25).anInt5159 = i;
        if (i_7_ != 0)
            keyReleased(null);
        ((Node_Sub25) class248_sub25).aChar5162 = c;
        ((Node_Sub25) class248_sub25).aLong5164 = Class118.method1112(116);
        aClass293_7509.method3109(class248_sub25, -128);
    }

    public final synchronized void keyPressed(KeyEvent keyevent) {
        method2729(keyevent, 0, false);
        anInt7507++;
    }

    Class253_Sub1(Component component) {
        Node_Sub8_Sub10.method2080(-94);
        method2724(-6159, component);
    }
}
