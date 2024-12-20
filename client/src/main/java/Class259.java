/* Class259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

final class Class259 {
    static int anInt2956;
    static int anInt2957;
    private Class278 aClass278_2958 = new Class278(128);
    static int anInt2959;
    static int anInt2960;
    private Class381 aClass381_2961;
    static int anInt2962;

    final Class218 method2758(int i, byte i_0_) {
        if (i_0_ >= -52)
            method2762(88, -84, 71, -47, -44, (byte) -2);
        anInt2960++;
        Class218 class218;
        synchronized (aClass278_2958) {
            class218 = (Class218) aClass278_2958.method2863(4, (long) i);
        }
        if (class218 != null)
            return class218;
        byte[] is = aClass381_2961.method3922((byte) 120, Class208.method1711(i, (byte) -86), Class226_Sub2_Sub1.method1811(i, (byte) -112));
        class218 = new Class218();
        if (is != null)
            class218.method1747(88, new ByteStream(is));
        synchronized (aClass278_2958) {
            aClass278_2958.method2867((byte) 0, (long) i, class218);
        }
        return class218;
    }

    static final void method2759(byte i) {
        anInt2962++;
        if (Node_Sub42_Sub1.anInt9782 != 0) {
            try {
                if (++Class215.anInt2476 > 2000) {
                    if (Class289.aClass111_3398 != null) {
                        Class289.aClass111_3398.method774(-1);
                        Class289.aClass111_3398 = null;
                    }
                    if ((Class367.anInt4509 ^ 0xffffffff) > -3) {
                        Class86_Sub1.lobbyAddress.method679((byte) -89);
                        Class215.anInt2476 = 0;
                        Class367.anInt4509++;
                        Node_Sub42_Sub1.anInt9782 = 1;
                    } else {
                        Node_Sub42_Sub1.anInt9782 = 0;
                        Node_Sub4.anInt6833 = -5;
                        return;
                    }
                }
                if (i == -33) {
                    if (Node_Sub42_Sub1.anInt9782 == 1) {
                        Class13.aClass322_255 = (Class86_Sub1.lobbyAddress.method680(43594, Node_Sub14_Sub15.aClass174_9328));
                        Node_Sub42_Sub1.anInt9782 = 2;
                    }
                    if (Node_Sub42_Sub1.anInt9782 == 2) {
                        if ((Class13.aClass322_255.anInt3788 ^ 0xffffffff) == -3)
                            throw new IOException();
                        if ((Class13.aClass322_255.anInt3788 ^ 0xffffffff) != -2)
                            return;
                        Class289.aClass111_3398 = Class94.method693(7500, (byte) -113, (Socket) (Class13.aClass322_255.anObject3787));
                        Class13.aClass322_255 = null;
                        Class285.method3074(7388);
                        Node_Sub42_Sub1.anInt9782 = 4;
                    }
                    if ((Node_Sub42_Sub1.anInt9782 ^ 0xffffffff) == -5) {
                        if (Class289.aClass111_3398.method772(1, 1)) {
                            Class289.aClass111_3398.method780((((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).buffer), 1, -125, 0);
                            int i_1_ = ((((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).buffer[0]) & 0xff);
                            Node_Sub4.anInt6833 = i_1_;
                            Node_Sub42_Sub1.anInt9782 = 0;
                            Class289.aClass111_3398.method774(-1);
                            Class289.aClass111_3398 = null;
                        }
                    }
                }
            } catch (IOException ioexception) {
                if (Class289.aClass111_3398 != null) {
                    Class289.aClass111_3398.method774(-1);
                    Class289.aClass111_3398 = null;
                }
                if (Class367.anInt4509 >= 2) {
                    Node_Sub42_Sub1.anInt9782 = 0;
                    Node_Sub4.anInt6833 = -4;
                } else {
                    Class86_Sub1.lobbyAddress.method679((byte) -65);
                    Class367.anInt4509++;
                    Node_Sub42_Sub1.anInt9782 = 1;
                    Class215.anInt2476 = 0;
                }
            }
        }
    }

    static final void method2760(int i, int i_2_) {
        Class114.anIntArray1426 = new int[i_2_];
        Class208.anIntArray2403 = new int[i_2_];
        anInt2959++;
        s_Sub3.anIntArray8013 = new int[i_2_];
        Class340_Sub7.anIntArray8163 = new int[i_2_];
        if (i != 255)
            method2759((byte) -106);
        Class346_Sub7_Sub3_Sub1.anIntArray10513 = new int[i_2_];
    }

    static final Class115 method2761(ByteStream class248_sub9, boolean bool) {
        anInt2957++;
        int i = class248_sub9.readInt(bool);
        return new Class115(i);
    }

    static final void method2762(int i, int i_3_, int i_4_, int i_5_, int i_6_, byte i_7_) {
        anInt2956++;
        for (int i_8_ = i_3_; (i_8_ ^ 0xffffffff) >= (i_4_ ^ 0xffffffff); i_8_++)
            Class149.method1331(i_5_, -99, i_6_, Class156.anIntArrayArray1867[i_8_], i);
        if (i_7_ < -40) {
            /* empty */
        }
    }

    Class259(Class215 class215, int i, Class381 class381) {
        aClass381_2961 = class381;
        if (aClass381_2961 != null) {
            int i_9_ = -1 + aClass381_2961.method3902(0);
            aClass381_2961.method3899(i_9_, 0);
        }
    }
}
