/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class Class239 implements Runnable {
    private Socket aSocket2652;
    private int anInt2653 = 0;
    static int anInt2654;
    static int anInt2655;
    private byte[] aByteArray2656;
    static int anInt2657;
    private OutputStream anOutputStream2658;
    private InputStream anInputStream2659;
    static int anInt2660;
    static int anInt2661;
    private Class174 aClass174_2662;
    private Class322 aClass322_2663;
    static int anInt2664;
    private int anInt2665;
    static int anInt2666;
    private int anInt2667;
    static int anInt2668;
    private boolean aBoolean2669 = false;
    private boolean aBoolean2670;
    static int anInt2671;
    static int anInt2672;
    static int anInt2673;
    static int anInt2674;
    static int anInt2675;

    final void method1912(int i, byte[] is, int i_0_, int i_1_) throws IOException {
        anInt2657++;
        if (!aBoolean2670) {
            if (i != -5324)
                aBoolean2669 = false;
            if (aBoolean2669) {
                aBoolean2669 = false;
                throw new IOException();
            }
            if (aByteArray2656 == null)
                aByteArray2656 = new byte[anInt2665];
            synchronized (this) {
                for (int i_2_ = 0; (i_1_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
                    aByteArray2656[anInt2653] = is[i_0_ + i_2_];
                    anInt2653 = (1 + anInt2653) % anInt2665;
                    if (((-100 + anInt2665 + anInt2667) % anInt2665 ^ 0xffffffff) == (anInt2653 ^ 0xffffffff))
                        throw new IOException();
                }
                if (aClass322_2663 == null)
                    aClass322_2663 = aClass174_2662.method1576(this, 3, 0);
                this.notifyAll();
            }
        }
    }

    public final void run() {
        try {
            for (; ; ) {
                int i;
                int i_3_;
                synchronized (this) {
                    if (anInt2653 == anInt2667) {
                        if (aBoolean2670)
                            break;
                        try {
                            this.wait();
                        } catch (InterruptedException interruptedexception) {
                            /* empty */
                        }
                    }
                    i = anInt2667;
                    if (anInt2653 >= anInt2667)
                        i_3_ = anInt2653 - anInt2667;
                    else
                        i_3_ = -anInt2667 + anInt2665;
                }
                if ((i_3_ ^ 0xffffffff) < -1) {
                    try {
                        anOutputStream2658.write(aByteArray2656, i, i_3_);
                    } catch (IOException ioexception) {
                        aBoolean2669 = true;
                    }
                    anInt2667 = (anInt2667 + i_3_) % anInt2665;
                    try {
                        if ((anInt2653 ^ 0xffffffff) == (anInt2667 ^ 0xffffffff))
                            anOutputStream2658.flush();
                    } catch (IOException ioexception) {
                        aBoolean2669 = true;
                    }
                }
            }
            try {
                if (anInputStream2659 != null)
                    anInputStream2659.close();
                if (anOutputStream2658 != null)
                    anOutputStream2658.close();
                if (aSocket2652 != null)
                    aSocket2652.close();
            } catch (IOException ioexception) {
                /* empty */
            }
            aByteArray2656 = null;
        } catch (Exception exception) {
            Class282_Sub14.method2975(null, exception, 1);
        }
        anInt2672++;
    }

    static final void method1913(byte i, ByteStream class248_sub9) {
        anInt2666++;
        if (i != 61)
            method1913((byte) 59, null);
        byte[] is = new byte[24];
        if (Class250.aClass46_2824 != null) {
            try {
                Class250.aClass46_2824.method334((byte) -66, 0L);
                Class250.aClass46_2824.method338(false, is);
                int i_4_;
                for (i_4_ = 0; (i_4_ ^ 0xffffffff) > -25; i_4_++) {
                    if ((is[i_4_] ^ 0xffffffff) != -1)
                        break;
                }
                if ((i_4_ ^ 0xffffffff) <= -25)
                    throw new IOException();
            } catch (Exception exception) {
                for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -25; i_5_++)
                    is[i_5_] = (byte) -1;
            }
        }
        class248_sub9.method2215(0, (byte) -32, is, 24);
    }

    final void method1914(byte i) {
        anInt2660++;
        if (!aBoolean2670) {
            synchronized (this) {
                aBoolean2670 = true;
                this.notifyAll();
            }
            if (aClass322_2663 != null) {
                while (aClass322_2663.anInt3788 == 0)
                    Class279_Sub2.method2897((byte) -124, 1L);
                if (aClass322_2663.anInt3788 == 1) {
                    try {
                        ((Thread) aClass322_2663.anObject3787).join();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            if (i != -85)
                method1918(-36);
            aClass322_2663 = null;
        }
    }

    final void method1915(int i) throws IOException {
        anInt2661++;
        if (i == 0 && !aBoolean2670) {
            if (aBoolean2669) {
                aBoolean2669 = false;
                throw new IOException();
            }
        }
    }

    final void method1916(byte[] is, int i, int i_6_, byte i_7_) throws IOException {
        anInt2668++;
        if (!aBoolean2670) {
            int i_8_ = 97 / ((i_7_ - 5) / 43);
            while ((i ^ 0xffffffff) < -1) {
                int i_9_ = anInputStream2659.read(is, i_6_, i);
                if (i_9_ <= 0)
                    throw new EOFException();
                i -= i_9_;
                i_6_ += i_9_;
            }
        }
    }

    static final boolean method1917(int i, int i_10_) {
        if (i != 12459)
            anInt2675 = -35;
        anInt2664++;
        if ((i_10_ ^ 0xffffffff) != -4 && (i_10_ ^ 0xffffffff) != -6 && (i_10_ ^ 0xffffffff) != -7)
            return false;
        return true;
    }

    final void method1918(int i) {
        if (i != 0)
            finalize();
        anInt2673++;
        if (!aBoolean2670) {
            anInputStream2659 = new InputStream_Sub1();
            anOutputStream2658 = new OutputStream_Sub2();
        }
    }

    final int method1919(byte i) throws IOException {
        if (i < 66)
            anInputStream2659 = null;
        anInt2671++;
        if (aBoolean2670)
            return 0;
        return anInputStream2659.read();
    }

    protected final void finalize() {
        method1914((byte) -85);
        anInt2655++;
    }

    final int method1920(byte i) throws IOException {
        anInt2674++;
        if (aBoolean2670)
            return 0;
        int i_11_ = 53 / (i / 56);
        return anInputStream2659.available();
    }

    Class239(Socket socket, Class174 class174, int i) throws IOException {
        anInt2667 = 0;
        aBoolean2670 = false;
        aClass174_2662 = class174;
        aSocket2652 = socket;
        aSocket2652.setSoTimeout(30000);
        aSocket2652.setTcpNoDelay(true);
        anInputStream2659 = aSocket2652.getInputStream();
        anOutputStream2658 = aSocket2652.getOutputStream();
        anInt2665 = i;
    }
}
