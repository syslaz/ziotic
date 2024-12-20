/* Class54_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class54_Sub1 extends Class54 {
    static int anInt5320;
    static boolean aBoolean5321 = false;
    private int anInt5322;
    static int anInt5323;
    private int anInt5324;
    static int anInt5325;
    private int anInt5326;
    static int anInt5327;
    static int anInt5328;
    private int anInt5329;
    static OutgoingOpcode aOutgoingOpcode_5330;
    static int anInt5331;
    static Applet_Sub1 anApplet_Sub1_5332 = null;
    static byte aByte5333;

    final void method427(int i, int i_0_, int i_1_) {
        anInt5323++;
        int i_2_ = anInt5324 * i >> 1771158284;
        int i_3_ = anInt5322 * i >> 1815972012;
        int i_4_ = anInt5329 * i_1_ >> 1742368492;
        if (i_0_ != 2)
            method425(-114, 74, 14);
        int i_5_ = anInt5326 * i_1_ >> 110696428;
        Node_Sub25.method2549(((Class54) this).anInt723, i_3_, i_4_, i_5_, ((Class54) this).anInt726, i_2_, ((Class54) this).anInt724, 107);
    }

    final void method429(int i, byte i_6_, int i_7_) {
        anInt5320++;
        int i_8_ = anInt5324 * i >> -1334142292;
        int i_9_ = anInt5322 * i >> 202285868;
        if (i_6_ == -72) {
            int i_10_ = anInt5329 * i_7_ >> 1714643404;
            int i_11_ = i_7_ * anInt5326 >> -1914526644;
            Class340_Sub9.method3475(i_10_, (byte) 102, i_8_, i_9_, ((Class54) this).anInt724, i_11_);
        }
    }

    Class54_Sub1(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
        super(i_15_, i_16_, i_17_);
        anInt5326 = i_14_;
        anInt5329 = i_12_;
        anInt5324 = i;
        anInt5322 = i_13_;
    }

    static final boolean method431(String string, int i) {
        anInt5331++;
        if (i != -22534)
            method433(-58);
        return Class26.aHashtable355.containsKey(string);
    }

    final void method425(int i, int i_18_, int i_19_) {
        int i_20_ = 123 / ((-71 - i) / 53);
        anInt5325++;
    }

    static final void method432(int i) {
        anInt5327++;
        za_Sub1.aClass65_9797.method504(i + 28127);
        if (i == -28128)
            Node_Sub12.aClass65_6963.method504(-1);
    }

    public static void method433(int i) {
        aOutgoingOpcode_5330 = null;
        if (i != 3)
            aOutgoingOpcode_5330 = null;
    }

    static {
        aOutgoingOpcode_5330 = new OutgoingOpcode(47, 2);
    }
}
