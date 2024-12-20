/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.io.OutputStream;

final class Class126 implements Runnable {
    static int anInt1547;
    private int anInt1548;
    static int anInt1549;
    private int anInt1550 = 0;
    private int anInt1551 = 0;
    static int anInt1552;
    static int anInt1553;
    private Thread aThread1554;
    static int anInt1555;
    private IOException anIOException1556;
    private byte[] aByteArray1557;
    static int anInt1558;
    private OutputStream anOutputStream1559;
    static int anInt1560;

    static final void method1149(byte[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt1547++;
        if (i < i_3_) {
            i_1_ = -i + i_3_ >> 1766327330;
            i_0_ += i;
            while ((--i_1_ ^ 0xffffffff) <= -1) {
                is[i_0_++] = (byte) 1;
                is[i_0_++] = (byte) 1;
                is[i_0_++] = (byte) 1;
                is[i_0_++] = (byte) 1;
            }
            i_1_ = -i + i_3_ & 0x3;
            while (--i_1_ >= 0)
                is[i_0_++] = (byte) 1;
            if (i_2_ != 14286)
                method1154((byte) -75, null, 16, 79, 71, 79, 76);
        }
    }

    public final void run() {
        anInt1552++;
        for (; ; ) {
            int i;
            synchronized (this) {
                for (; ; ) {
                    if (anIOException1556 != null)
                        return;
                    if (anInt1551 <= anInt1550)
                        i = -anInt1551 + anInt1550;
                    else
                        i = anInt1550 + -anInt1551 + anInt1548;
                    if (i > 0)
                        break;
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            try {
                if (i + anInt1551 <= anInt1548)
                    anOutputStream1559.write(aByteArray1557, anInt1551, i);
                else {
                    int i_4_ = -anInt1551 + anInt1548;
                    anOutputStream1559.write(aByteArray1557, anInt1551, i_4_);
                    anOutputStream1559.write(aByteArray1557, 0, -i_4_ + i);
                }
            } catch (IOException ioexception) {
                synchronized (this) {
                    anIOException1556 = ioexception;
                    break;
                }
            }
            synchronized (this) {
                anInt1551 = (i + anInt1551) % anInt1548;
            }
        }
    }

    final void method1150(int i) {
        anOutputStream1559 = new OutputStream_Sub1();
        anInt1555++;
        if (i != -19694)
            anOutputStream1559 = null;
    }

    static final void method1151(int i, boolean bool) {
        if (Class282_Sub11.aClass74_7702 == null)
            Class149.method1333(1);
        anInt1558++;
        if (i == -3740) {
            if (bool)
                Class282_Sub11.aClass74_7702.method554((byte) 43);
        }
    }

    final void method1152(int i, int i_5_, int i_6_, byte[] is) throws IOException {
        if (i != 8716)
            aByteArray1557 = null;
        anInt1553++;
        if ((i_6_ ^ 0xffffffff) > -1 || (i_5_ ^ 0xffffffff) > -1 || is.length < i_5_ - -i_6_)
            throw new IOException();
        synchronized (this) {
            if (anIOException1556 != null)
                throw new IOException(anIOException1556.toString());
            int i_7_;
            if ((anInt1550 ^ 0xffffffff) > (anInt1551 ^ 0xffffffff))
                i_7_ = -anInt1550 + (anInt1551 + -1);
            else
                i_7_ = anInt1551 + (-anInt1550 + anInt1548 - 1);
            if ((i_6_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff))
                throw new IOException("");
            if ((anInt1550 - -i_6_ ^ 0xffffffff) < (anInt1548 ^ 0xffffffff)) {
                int i_8_ = anInt1548 - anInt1550;
                Class159.method1402(is, i_5_, aByteArray1557, anInt1550, i_8_);
                Class159.method1402(is, i_5_ + i_8_, aByteArray1557, 0, -i_8_ + i_6_);
            } else
                Class159.method1402(is, i_5_, aByteArray1557, anInt1550, i_6_);
            anInt1550 = (anInt1550 + i_6_) % anInt1548;
            this.notifyAll();
        }
    }

    static final int method1153(int i) {
        int i_9_ = -1;
        for (int i_10_ = 0; i_10_ < Viewport.anInt2651 - 1; i_10_++) {
            if (i < (Class270.anIntArray3138[i_10_] + Class349_Sub2.anIntArray4721[i_10_])) {
                i_9_ = i_10_;
                break;
            }
        }
        if (i_9_ == -1)
            i_9_ = Viewport.anInt2651 - 1;
        return i_9_;
    }

    static final void method1154(byte i, ha var_ha, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
        if ((Class112.aClass129_5206 == null || Class282_Sub25.aClass129_7852 == null || Class316_Sub1_Sub2.aClass129_9857 == null) && Class290.aClass381_3417.method3920(Class349_Sub2.anInt4726, 127) && Class290.aClass381_3417.method3920(PacketStream.anInt9126, -106) && Class290.aClass381_3417.method3920(Node_Sub15_Sub4.anInt9702, -66)) {
            Class157 class157 = Class157.method1379(Class290.aClass381_3417, PacketStream.anInt9126, 0);
            Class282_Sub25.aClass129_7852 = var_ha.a(class157, true);
            class157.method1389();
            Class282_Sub6.aClass129_7652 = var_ha.a(class157, true);
            Class112.aClass129_5206 = var_ha.a(Class157.method1379(Class290.aClass381_3417, Class349_Sub2.anInt4726, 0), true);
            Class157 class157_16_ = Class157.method1379(Class290.aClass381_3417, Node_Sub15_Sub4.anInt9702, 0);
            Class316_Sub1_Sub2.aClass129_9857 = var_ha.a(class157_16_, true);
            class157_16_.method1389();
            Class87.aClass129_1085 = var_ha.a(class157_16_, true);
        }
        anInt1560++;
        if (Class112.aClass129_5206 != null && Class282_Sub25.aClass129_7852 != null && Class316_Sub1_Sub2.aClass129_9857 != null) {
            int i_17_ = ((i_12_ - 2 * Class316_Sub1_Sub2.aClass129_9857.method1175()) / Class112.aClass129_5206.method1175());
            for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
                Class112.aClass129_5206.method1168((Class316_Sub1_Sub2.aClass129_9857.method1175() + i_15_ - -(Class112.aClass129_5206.method1175() * i_18_)), -Class112.aClass129_5206.method1176() + (i_14_ + i_11_));
            int i_19_ = ((-i_13_ + (i_14_ + -Class316_Sub1_Sub2.aClass129_9857.method1176())) / Class282_Sub25.aClass129_7852.method1176());
            for (int i_20_ = 0; i_19_ > i_20_; i_20_++) {
                Class282_Sub25.aClass129_7852.method1168(i_15_, i_11_ - -i_13_ - -(i_20_ * Class282_Sub25.aClass129_7852.method1176()));
                Class282_Sub6.aClass129_7652.method1168(i_12_ + i_15_ - Class282_Sub6.aClass129_7652.method1175(), (Class282_Sub25.aClass129_7852.method1176() * i_20_ + i_11_ + i_13_));
            }
            Class316_Sub1_Sub2.aClass129_9857.method1168(i_15_, i_11_ - (-i_14_ - -Class316_Sub1_Sub2.aClass129_9857.method1176()));
            Class87.aClass129_1085.method1168(i_12_ + (i_15_ + -Class316_Sub1_Sub2.aClass129_9857.method1175()), -Class316_Sub1_Sub2.aClass129_9857.method1176() + (i_11_ - -i_14_));
        }
        if (i != 85)
            method1149(null, 88, 58, -8, -94, -26);
    }

    final void method1155(boolean bool) {
        anInt1549++;
        synchronized (this) {
            if (anIOException1556 == null)
                anIOException1556 = new IOException("");
            if (bool != true)
                method1153(36);
            this.notifyAll();
        }
        try {
            aThread1554.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
    }

    Class126(OutputStream outputstream, int i) {
        anOutputStream1559 = outputstream;
        anInt1548 = i + 1;
        aByteArray1557 = new byte[anInt1548];
        aThread1554 = new Thread(this);
        aThread1554.setDaemon(true);
        aThread1554.start();
    }
}
