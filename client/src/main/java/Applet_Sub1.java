/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {
    static int anInt6;
    static int anInt7;
    static int anInt8;
    static int anInt9;
    static int anInt10;
    static int anInt11;
    static int anInt12;
    static int anInt13;
    static int anInt14;
    static int anInt15;
    static int anInt16;
    static int anInt17;
    static int anInt18;
    static int anInt19;
    static int anInt20;
    static IncommingOpcode aIncommingOpcode_21 = new IncommingOpcode(82, 0);
    static int anInt22;
    static int anInt23;
    private boolean aBoolean24 = false;
    static int anInt25;
    static int anInt26;
    static int anInt27;
    static int anInt28;
    static int anInt29;
    static int anInt30;
    static int anInt31;
    static int anInt32;
    private boolean aBoolean33 = false;
    static int anInt34;
    static int anInt35;
    static int anInt36;
    static int anInt37;
    static int anInt38;
    static int anInt39;
    static int anInt40;
    static int anInt41;
    static OutgoingOpcode aOutgoingOpcode_42 = new OutgoingOpcode(74, 7);
    static IncommingOpcode aIncommingOpcode_43 = new IncommingOpcode(68, 6);
    static int anInt44 = -1;
    public static int anInt45;
    public static boolean aBoolean46;
    public static int anInt47;
    public static boolean aBoolean48;
    public static boolean aBoolean49;
    public static boolean aBoolean50;
    public static boolean aBoolean51;
    public static int anInt52;
    public static int anInt53;
    public static int anInt54;
    public static boolean aBoolean55;
    public static boolean aBoolean56;
    public static boolean aBoolean57;
    public static boolean aBoolean58;
    public static int anInt59;
    public static int anInt60;
    public static int anInt61;
    public static int anInt62;
    public static int anInt63;

    abstract void method83(boolean bool);

    public final void windowOpened(WindowEvent windowevent) {
        anInt32++;
    }

    final void method84(int i, String string, int i_0_, int i_1_, int i_2_, byte i_3_, int i_4_) {
        anInt25++;
        try {
            if (Class54_Sub1.anApplet_Sub1_5332 != null) {
                Node_Sub8_Sub4.anInt8372++;
                if ((Node_Sub8_Sub4.anInt8372 ^ 0xffffffff) <= -4)
                    method92(32673, "alreadyloaded");
                else
                    getAppletContext().showDocument(getDocumentBase(), "_self");
            } else {
                if (i_3_ != -24)
                    windowIconified(null);
                Class223.anInt5196 = Class282_Sub20.anInt7800 = i_2_;
                Class323.anInt3791 = 0;
                Class346_Sub10.anInt8351 = 0;
                s_Sub2.anInt7944 = i_0_;
                Class54_Sub1.anApplet_Sub1_5332 = this;
                Viewport.anApplet2646 = Class158.anApplet1881;
                Class279_Sub1_Sub2.anInt9824 = Class146.anInt1724 = i_1_;
                Class226_Sub3.aClass174_6670 = Node_Sub14_Sub15.aClass174_9328 = new Class174(i, string, i_4_, Class158.anApplet1881 != null);
                Class322 class322 = Node_Sub14_Sub15.aClass174_9328.method1576(this, 1, 0);
                while ((class322.anInt3788 ^ 0xffffffff) == -1)
                    Class279_Sub2.method2897((byte) -124, 10L);
            }
        } catch (Throwable throwable) {
            Class282_Sub14.method2975(null, throwable, 1);
            method92(i_3_ ^ ~0x7fb6, "crash");
        }
    }

    synchronized void method85(int i) {
        anInt26++;
        if (Class297_Sub1.aCanvas8478 != null) {
            Class297_Sub1.aCanvas8478.removeFocusListener(this);
            Class297_Sub1.aCanvas8478.getParent().setBackground(Color.black);
            Class297_Sub1.aCanvas8478.getParent().remove(Class297_Sub1.aCanvas8478);
        }
        Container container;
        if (Node_Sub48.aFrame7432 != null)
            container = Node_Sub48.aFrame7432;
        else if (Class300.aFrame3494 != null)
            container = Class300.aFrame3494;
        else if (Class158.anApplet1881 == null)
            container = Class54_Sub1.anApplet_Sub1_5332;
        else
            container = Class158.anApplet1881;
        container.setLayout(null);
        Class297_Sub1.aCanvas8478 = new Canvas_Sub1(this);
        container.add(Class297_Sub1.aCanvas8478);
        Class297_Sub1.aCanvas8478.setSize(Class146.anInt1724, Class282_Sub20.anInt7800);
        if (i == -6515) {
            Class297_Sub1.aCanvas8478.setVisible(true);
            if (container != Class300.aFrame3494)
                Class297_Sub1.aCanvas8478.setLocation(Class323.anInt3791, Class346_Sub10.anInt8351);
            else {
                Insets insets = Class300.aFrame3494.getInsets();
                Class297_Sub1.aCanvas8478.setLocation(insets.left + Class323.anInt3791, insets.top - -Class346_Sub10.anInt8351);
            }
            Class297_Sub1.aCanvas8478.addFocusListener(this);
            Class297_Sub1.aCanvas8478.requestFocus();
            Node_Sub14_Sub30.aBoolean9477 = true;
            Class172.aBoolean1997 = true;
            Class156.aBoolean1849 = true;
            Class375.aBoolean4603 = false;
            Class346_Sub7_Sub4_Sub2.aLong10167 = Class118.method1112(i + 6631);
        }
    }

    public final void windowDeactivated(WindowEvent windowevent) {
        anInt30++;
    }

    public final void stop() {
        anInt18++;
        if (this == Class54_Sub1.anApplet_Sub1_5332 && !Node_Sub14_Sub4.aBoolean9194)
            Class45.aLong573 = Class118.method1112(116) + 4000L;
    }

    public final void run() {
        anInt17++;
        do {
            try {
                if (Class174.aString2046 != null) {
                    String string = Class174.aString2046.toLowerCase();
                    if ((string.indexOf("sun") ^ 0xffffffff) == 0 && (string.indexOf("apple") ^ 0xffffffff) == 0) {
                        if ((string.indexOf("ibm") ^ 0xffffffff) != 0 && (Class174.aString2026 == null || Class174.aString2026.equals("1.4.2"))) {
                            method92(32673, "wrongjava");
                            break;
                        }
                    } else {
                        String string_5_ = Class174.aString2026;
                        if (string_5_.equals("1.1") || string_5_.startsWith("1.1.") || string_5_.equals("1.2") || string_5_.startsWith("1.2.")) {
                            method92(32673, "wrongjava");
                            break;
                        }
                    }
                }
                if (Class174.aString2026 != null && Class174.aString2026.startsWith("1.")) {
                    int i = 2;
                    int i_6_ = 0;
                    for (/**/; ((i ^ 0xffffffff) > (Class174.aString2026.length() ^ 0xffffffff)); i++) {
                        int i_7_ = Class174.aString2026.charAt(i);
                        if (i_7_ < 48 || (i_7_ ^ 0xffffffff) < -58)
                            break;
                        i_6_ = i_6_ * 10 - (-i_7_ + 48);
                    }
                    if ((i_6_ ^ 0xffffffff) <= -6)
                        Class340.aBoolean3964 = true;
                }
                Applet applet = Class54_Sub1.anApplet_Sub1_5332;
                if (Class158.anApplet1881 != null)
                    applet = Class158.anApplet1881;
                Method method = Class174.aMethod2043;
                if (method != null) {
                    try {
                        method.invoke(applet, new Object[]{Boolean.TRUE});
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                }
                Class282_Sub15.method2985(3);
                Class223.method1774(true);
                method85(-6515);
                method90(20);
                Class132.aClass160_1609 = Canvas_Sub1.method122((byte) 103);
                while (Class45.aLong573 == 0L || Class45.aLong573 > Class118.method1112(116)) {
                    Node_Sub14_Sub6.anInt9215 = Class132.aClass160_1609.method1408((byte) 87, ByteStream.aLong6886);
                    for (int i = 0; ((Node_Sub14_Sub6.anInt9215 ^ 0xffffffff) < (i ^ 0xffffffff)); i++)
                        method94(-2006);
                    method91((byte) -107);
                    Node_Sub18.method2511((Node_Sub14_Sub15.aClass174_9328), 0, Class297_Sub1.aCanvas8478);
                }
            } catch (ThreadDeath threaddeath) {
                throw threaddeath;
            } catch (Throwable throwable) {
                Class282_Sub14.method2975(method95(2), throwable, 1);
                method92(32673, "crash");
            } finally {
                method99(true, true);
            }
        } while (false);
    }

    final void method86(int i, String string, boolean bool, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
        try {
            s_Sub2.anInt7944 = i_9_;
            Class346_Sub10.anInt8351 = 0;
            Class223.anInt5196 = Class282_Sub20.anInt7800 = i_10_;
            Viewport.anApplet2646 = null;
            Class54_Sub1.anApplet_Sub1_5332 = this;
            Class323.anInt3791 = 0;
            Class279_Sub1_Sub2.anInt9824 = Class146.anInt1724 = i;
            Class300.aFrame3494 = new Frame();
            Class300.aFrame3494.setTitle("Jagex");
            Class300.aFrame3494.setResizable(true);
            Class300.aFrame3494.addWindowListener(this);
            Class300.aFrame3494.setVisible(true);
            Class300.aFrame3494.toFront();
            Insets insets = Class300.aFrame3494.getInsets();
            Class300.aFrame3494.setSize((Class279_Sub1_Sub2.anInt9824 - (-insets.left - insets.right)), (insets.top + Class223.anInt5196 + insets.bottom));
            if (i_12_ >= -106)
                return;
            Class226_Sub3.aClass174_6670 = Node_Sub14_Sub15.aClass174_9328 = new Class174(i_11_, string, i_8_, true);
            Class322 class322 = Node_Sub14_Sub15.aClass174_9328.method1576(this, 1, 0);
            while (class322.anInt3788 == 0)
                Class279_Sub2.method2897((byte) -124, 10L);
        } catch (Exception exception) {
            Class282_Sub14.method2975(null, exception, 1);
        }
        anInt8++;
    }

    abstract void method87(byte i);

    public final void windowDeiconified(WindowEvent windowevent) {
        anInt15++;
    }

    abstract void method88(int i);

    public abstract void init();

    public final void focusGained(FocusEvent focusevent) {
        anInt38++;
        Node_Sub14_Sub30.aBoolean9477 = true;
        Class156.aBoolean1849 = true;
    }

    public final URL getCodeBase() {
        anInt29++;
        if (Class300.aFrame3494 != null)
            return null;
        if (Class158.anApplet1881 != null && this != Class158.anApplet1881)
            return Class158.anApplet1881.getCodeBase();
        return super.getCodeBase();
    }

    public final void windowClosed(WindowEvent windowevent) {
        anInt27++;
    }

    final boolean method89(int i) {
        anInt35++;
        if (i <= 110)
            aBoolean33 = true;
        return Class111.method776(-104, "jagtheora");
    }

    public final void windowActivated(WindowEvent windowevent) {
        anInt36++;
    }

    abstract void method90(int i);

    private final void method91(byte i) {
        anInt40++;
        long l = Class118.method1112(116);
        long l_13_ = Class317.aLongArray3671[Class268.anInt3121];
        Class317.aLongArray3671[Class268.anInt3121] = l;
        if (l_13_ != 0L && (l_13_ ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
            int i_14_ = (int) (l - l_13_);
            Class17.anInt291 = (32000 + (i_14_ >> -415170431)) / i_14_;
        }
        Class268.anInt3121 = 0x1f & Class268.anInt3121 - -1;
        if ((RuntimeException_Sub1.anInt4707++ ^ 0xffffffff) < -51) {
            Class156.aBoolean1849 = true;
            RuntimeException_Sub1.anInt4707 -= 50;
            Class297_Sub1.aCanvas8478.setSize(Class146.anInt1724, Class282_Sub20.anInt7800);
            Class297_Sub1.aCanvas8478.setVisible(true);
            if (Class300.aFrame3494 == null || Node_Sub48.aFrame7432 != null)
                Class297_Sub1.aCanvas8478.setLocation(Class323.anInt3791, Class346_Sub10.anInt8351);
            else {
                Insets insets = Class300.aFrame3494.getInsets();
                Class297_Sub1.aCanvas8478.setLocation((Class323.anInt3791 + insets.left), (Class346_Sub10.anInt8351 + insets.top));
            }
        }
        method100((byte) 59);
        int i_15_ = -61 % ((49 - i) / 35);
    }

    public final AppletContext getAppletContext() {
        anInt23++;
        if (Class300.aFrame3494 != null)
            return null;
        if (Class158.anApplet1881 != null && Class158.anApplet1881 != this)
            return Class158.anApplet1881.getAppletContext();
        return super.getAppletContext();
    }

    final void method92(int i, String string) {
        anInt28++;
        if (!aBoolean24) {
            aBoolean24 = true;
            System.out.println("error_game_" + string);
            try {
                if (i != 32673)
                    method83(false);
                Class78.method571("loggedout", -8364, Class158.anApplet1881);
            } catch (Throwable throwable) {
                /* empty */
            }
            try {
                getAppletContext().showDocument(new URL(getCodeBase(), ("error_game_" + string + ".ws")), "_top");
            } catch (Exception exception) {
                /* empty */
            }
        }
    }

    final boolean method93(int i) {
        anInt37++;
        int i_16_ = 75 / ((i - -57) / 49);
        String string = getDocumentBase().getHost().toLowerCase();
        if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
            return true;
        if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
            return true;
        if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
            return true;
        if (string.endsWith("127.0.0.1"))
            return true;
        for (/**/; ((string.length() ^ 0xffffffff) < -1 && string.charAt(string.length() + -1) >= '0' && (string.charAt(string.length() - 1) ^ 0xffffffff) >= -58); string = string.substring(0, -1 + string.length())) {
            /* empty */
        }
        if (string.endsWith("192.168.1."))
            return true;
        //method92(32673, "invalidhost");
        //return false;
        return true;
    }

    private final void method94(int i) {
        anInt7++;
        long l = Class118.method1112(116);
        long l_17_ = Node_Sub8_Sub11.aLongArray8990[Class142.anInt1674];
        Node_Sub8_Sub11.aLongArray8990[Class142.anInt1674] = l;
        if (l_17_ != 0L && l_17_ < l) {
            /* empty */
        }
        if (i != -2006)
            method90(-125);
        Class142.anInt1674 = 0x1f & Class142.anInt1674 + 1;
        synchronized (this) {
            Class172.aBoolean1997 = Node_Sub14_Sub30.aBoolean9477;
        }
        method87((byte) -95);
    }

    public final void windowIconified(WindowEvent windowevent) {
        anInt16++;
    }

    String method95(int i) {
        anInt39++;
        int i_18_ = -38 / ((43 - i) / 32);
        return null;
    }

    public final synchronized void paint(Graphics graphics) {
        anInt10++;
        if (Class54_Sub1.anApplet_Sub1_5332 == this && !Node_Sub14_Sub4.aBoolean9194) {
            Class156.aBoolean1849 = true;
            if (Class340.aBoolean3964 && (Class118.method1112(116) - Class346_Sub7_Sub4_Sub2.aLong10167) > 1000L) {
                Rectangle rectangle = graphics.getClipBounds();
                if (rectangle == null || (((rectangle.width ^ 0xffffffff) <= (Class279_Sub1_Sub2.anInt9824 ^ 0xffffffff)) && rectangle.height >= Class223.anInt5196))
                    Class375.aBoolean4603 = true;
            }
        }
    }

    public static void method96(byte i) {
        aIncommingOpcode_43 = null;
        aOutgoingOpcode_42 = null;
        aIncommingOpcode_21 = null;
        if (i > -74)
            aIncommingOpcode_21 = null;
    }

    final boolean method97(byte i) {
        int i_19_ = 95 / ((-78 - i) / 37);
        anInt11++;
        return Class111.method776(111, "jagmisc");
    }

    final boolean method98(int i) {
        anInt9++;
        if (i != 7)
            return true;
        return Class111.method776(-112, "jaclib");
    }

    public final void focusLost(FocusEvent focusevent) {
        Node_Sub14_Sub30.aBoolean9477 = false;
        anInt41++;
    }

    public final void windowClosing(WindowEvent windowevent) {
        anInt19++;
        destroy();
    }

    public final void destroy() {
        anInt6++;
        if (Class54_Sub1.anApplet_Sub1_5332 == this && !Node_Sub14_Sub4.aBoolean9194) {
            Class45.aLong573 = Class118.method1112(116);
            Class279_Sub2.method2897((byte) -124, 5000L);
            Class226_Sub3.aClass174_6670 = null;
            method99(true, false);
        }
    }

    public final String getParameter(String string) {
        anInt20++;
        if (Class300.aFrame3494 != null)
            return null;
        if (Class158.anApplet1881 != null && Class158.anApplet1881 != this)
            return Class158.anApplet1881.getParameter(string);
        return super.getParameter(string);
    }

    public static final void provideLoaderApplet(Applet applet) {
        anInt12++;
        Class158.anApplet1881 = applet;
    }

    private final void method99(boolean bool, boolean bool_20_) {
        anInt31++;
        synchronized (this) {
            if (Node_Sub14_Sub4.aBoolean9194)
                return;
            Node_Sub14_Sub4.aBoolean9194 = bool;
        }
        System.out.println("Shutdown start - clean:" + bool_20_);
        if (Class158.anApplet1881 != null)
            Class158.anApplet1881.destroy();
        try {
            method83(false);
        } catch (Exception exception) {
            /* empty */
        }
        if (aBoolean33) {
            try {
                jagmisc.quit();
            } catch (Throwable throwable) {
                /* empty */
            }
            aBoolean33 = false;
        }
        Class123.method1132(true, 117);
        Class171.method1551(120);
        if (Class297_Sub1.aCanvas8478 != null) {
            try {
                Class297_Sub1.aCanvas8478.removeFocusListener(this);
                Class297_Sub1.aCanvas8478.getParent().remove(Class297_Sub1.aCanvas8478);
            } catch (Exception exception) {
                /* empty */
            }
        }
        if (Node_Sub14_Sub15.aClass174_9328 != null) {
            try {
                Node_Sub14_Sub15.aClass174_9328.method1568((byte) 127);
            } catch (Exception exception) {
                /* empty */
            }
        }
        method88(-15260);
        if (Class300.aFrame3494 != null) {
            Class300.aFrame3494.setVisible(false);
            Class300.aFrame3494.dispose();
            Class300.aFrame3494 = null;
        }
        System.out.println("Shutdown complete - clean:" + bool_20_);
    }

    public final URL getDocumentBase() {
        anInt13++;
        if (Class300.aFrame3494 != null)
            return null;
        if (Class158.anApplet1881 != null && Class158.anApplet1881 != this)
            return Class158.anApplet1881.getDocumentBase();
        return super.getDocumentBase();
    }

    abstract void method100(byte i);

    public final void update(Graphics graphics) {
        paint(graphics);
        anInt22++;
    }

    static final boolean method101(char c, int i) {
        anInt14++;
        if (c > 0 && (c ^ 0xffffffff) > -129 || (c ^ 0xffffffff) <= -161 && c <= 255)
            return true;
        if (c != 0) {
            char[] cs = Class357.aCharArray4415;
            for (int i_21_ = 0; (cs.length ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++) {
                int i_22_ = cs[i_21_];
                if ((c ^ 0xffffffff) == (i_22_ ^ 0xffffffff))
                    return true;
            }
        }
        if (i >= -44)
            return true;
        return false;
    }

    public final void start() {
        anInt34++;
        if (Class54_Sub1.anApplet_Sub1_5332 == this && !Node_Sub14_Sub4.aBoolean9194)
            Class45.aLong573 = 0L;
    }
}
