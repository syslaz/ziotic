/* Class333 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

import java.net.InetAddress;

final class Class333 implements Runnable {
    static int anInt3888;
    static int anInt3889;
    static int anInt3890;
    private Thread aThread3891;
    static int anInt3892;
    private Class293 aClass293_3893 = new Class293();
    static OutgoingOpcode aOutgoingOpcode_3894 = new OutgoingOpcode(33, 4);
    static Viewport aViewport_3895;
    static int anInt3896;
    static Node_Sub8_Sub1 aClass248_Sub8_Sub1_3897;
    static Class137[][][] aClass137ArrayArrayArray3898;
    static int anInt3899;
    static IncommingOpcode aIncommingOpcode_3900 = new IncommingOpcode(44, 2);
    static Class293 aClass293_3901 = new Class293();

    final void method3411(byte i) {
        anInt3888++;
        if (aThread3891 != null) {
            int i_0_ = 32 / ((-27 - i) / 35);
            method3415(2, new Node());
            try {
                aThread3891.join();
            } catch (InterruptedException interruptedexception) {
                /* empty */
            }
            aThread3891 = null;
        }
    }

    final Node_Sub43 method3412(String string, int i) {
        if (i != -23210)
            return null;
        anInt3890++;
        if (aThread3891 == null)
            throw new IllegalStateException("");
        if (string == null)
            throw new IllegalArgumentException("");
        Node_Sub43 class248_sub43 = new Node_Sub43(string);
        method3415(2, class248_sub43);
        return class248_sub43;
    }

    static final void method3413(int i, byte[] is, float f, int i_1_, float f_2_, byte i_3_, float f_4_, float f_5_, float f_6_, int i_7_, int i_8_, int i_9_, int i_10_, Class44 class44) {
        anInt3899++;
        int i_11_ = i_1_ * i_7_;
        float[] fs = new float[i_11_];
        for (int i_12_ = 0; i_12_ < i_8_; i_12_++) {
            int i_13_ = i_10_;
            class44.method316(fs, i_9_, f_2_ * 127.0F, (byte) -56, i_1_, f_4_ / (float) i_7_, i_7_, 0, f / (float) i_1_, f_6_ / (float) i, i);
            f_2_ *= f_5_;
            f_6_ *= 2.0F;
            for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
                is[i_13_] += fs[i_14_];
                i_13_++;
            }
            f_4_ *= 2.0F;
            f *= 2.0F;
        }
        int i_15_ = i_10_;
        int i_16_ = 0;
        if (i_3_ != -67)
            method3414(55);
        for (/**/; i_11_ > i_16_; i_16_++) {
            is[i_15_] = (byte) (127 + is[i_15_]);
            i_15_++;
        }
    }

    public static void method3414(int i) {
        if (i > -51)
            method3413(1, null, 0.99206257F, 39, -1.298694F, (byte) -31, -0.52409846F, -0.32472795F, -0.7783365F, -18, -14, -48, 83, null);
        aClass137ArrayArrayArray3898 = null;
        aClass293_3901 = null;
        aClass248_Sub8_Sub1_3897 = null;
        aIncommingOpcode_3900 = null;
        aViewport_3895 = null;
        aOutgoingOpcode_3894 = null;
    }

    private final void method3415(int i, Node node) {
        anInt3892++;
        synchronized (aClass293_3893) {
            aClass293_3893.method3109(node, -101);
            aClass293_3893.notify();
        }
        if (i != 2)
            method3414(-5);
    }

    public Class333() {
        aThread3891 = new Thread(this);
        aThread3891.setDaemon(true);
        aThread3891.start();
    }

    public final void run() {
        anInt3896++;
        for (; ; ) {
            Node_Sub43 class248_sub43;
            synchronized (aClass293_3893) {
                Node node;
                for (node = aClass293_3893.method3108(false); node == null; node = aClass293_3893.method3108(false)) {
                    try {
                        aClass293_3893.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
                if (!(node instanceof Node_Sub43))
                    break;
                class248_sub43 = (Node_Sub43) node;
            }
            int i;
            try {
                byte[] is = InetAddress.getByName(((Node_Sub43) class248_sub43).aString7308).getAddress();
                i = jagmisc.ping(is[0], is[1], is[2], is[3], 1000L);
            } catch (Throwable throwable) {
                i = 1000;
            }
            ((Node_Sub43) class248_sub43).anInt7305 = i;
        }
    }
}
