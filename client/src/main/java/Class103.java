/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

final class Class103 implements Runnable {
    static int anInt1311;
    private int anInt1312;
    static int anInt1313;
    static int anInt1314;
    private IOException anIOException1315;
    private byte[] aByteArray1316;
    static int[] anIntArray1317;
    private int anInt1318 = 0;
    private Thread aThread1319;
    static int anInt1320;
    private int anInt1321 = 0;
    static int anInt1322;
    private InputStream anInputStream1323;
    static int anInt1324;

    static final void method729(int i, int i_0_, String string) {
        anInt1324++;
        Class245.anInt2745++;
        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(i_0_, Class346_Sub5_Sub2.aISAACCypher_9889, Class84_Sub7.aOutgoingOpcode_5465);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-55, i_0_ - -Class208.method1710(true, string));
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -85);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-66, i);
        Class226_Sub3.method1814(class248_sub36, 0);
    }

    public static void method730(int i) {
        if (i > -57)
            method729(63, 71, null);
        anIntArray1317 = null;
    }

    final void method731(int i) {
        if (i > -82)
            anInputStream1323 = null;
        anInt1320++;
        anInputStream1323 = new InputStream_Sub2();
    }

    final void method732(int i) {
        anInt1322++;
        if (i <= -96) {
            synchronized (this) {
                if (anIOException1315 == null)
                    anIOException1315 = new IOException("");
                this.notifyAll();
            }
            try {
                aThread1319.join();
            } catch (InterruptedException interruptedexception) {
                /* empty */
            }
        }
    }

    public final void run() {
        anInt1311++;
        for (; ; ) {
            int i;
            synchronized (this) {
                for (; ; ) {
                    if (anIOException1315 != null)
                        return;
                    if ((anInt1318 ^ 0xffffffff) == -1)
                        i = -anInt1321 + (anInt1312 - 1);
                    else if (anInt1318 < anInt1321)
                        i = anInt1312 + -anInt1321;
                    else
                        i = -1 + (-anInt1321 + anInt1318);
                    if (i > 0)
                        break;
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            int i_1_;
            try {
                i_1_ = anInputStream1323.read(aByteArray1316, anInt1321, i);
                if ((i_1_ ^ 0xffffffff) == 0)
                    throw new EOFException();
            } catch (IOException ioexception) {
                synchronized (this) {
                    anIOException1315 = ioexception;
                    break;
                }
            }
            synchronized (this) {
                anInt1321 = (anInt1321 + i_1_) % anInt1312;
            }
        }
    }

    final int method733(byte[] is, boolean bool, int i, int i_2_) throws IOException {
        if (bool != true)
            method730(79);
        anInt1314++;
        if (i < 0 || (i_2_ ^ 0xffffffff) > -1 || (i_2_ - -i ^ 0xffffffff) < (is.length ^ 0xffffffff))
            throw new IOException();
        synchronized (this) {
            int i_3_;
            if (anInt1321 >= anInt1318)
                i_3_ = anInt1321 + -anInt1318;
            else
                i_3_ = anInt1312 - (anInt1318 - anInt1321);
            if (i > i_3_)
                i = i_3_;
            if ((i ^ 0xffffffff) == -1 && anIOException1315 != null)
                throw new IOException(anIOException1315.toString());
            if (anInt1312 >= anInt1318 + i)
                Class159.method1402(aByteArray1316, anInt1318, is, i_2_, i);
            else {
                int i_4_ = -anInt1318 + anInt1312;
                Class159.method1402(aByteArray1316, anInt1318, is, i_2_, i_4_);
                Class159.method1402(aByteArray1316, 0, is, i_4_ + i_2_, i - i_4_);
            }
            anInt1318 = (i + anInt1318) % anInt1312;
            this.notifyAll();
            return i;
        }
    }

    final boolean method734(int i, int i_5_) throws IOException {
        anInt1313++;
        if (i <= (i_5_ ^ 0xffffffff) || (i_5_ ^ 0xffffffff) <= (anInt1312 ^ 0xffffffff))
            throw new IOException();
        synchronized (this) {
            int i_6_;
            if (anInt1321 < anInt1318)
                i_6_ = -anInt1318 + (anInt1312 - -anInt1321);
            else
                i_6_ = anInt1321 + -anInt1318;
            if (i_6_ < i_5_) {
                if (anIOException1315 != null)
                    throw new IOException(anIOException1315.toString());
                return false;
            }
            return true;
        }
    }

    Class103(InputStream inputstream, int i) {
        anInt1312 = 1 + i;
        anInputStream1323 = inputstream;
        aByteArray1316 = new byte[anInt1312];
        aThread1319 = new Thread(this);
        aThread1319.setDaemon(true);
        aThread1319.start();
    }
}
