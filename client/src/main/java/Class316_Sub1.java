/* Class316_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class316_Sub1 extends Class316 {
    static int anInt8044;
    static Class14 aClass14_8045 = new Class14();
    static int anInt8046;
    static int anInt8047;
    static int anInt8048;
    static IncommingOpcode aIncommingOpcode_8049 = new IncommingOpcode(28, 1);
    static long aLong8050;

    public static void method3287(int i) {
        aClass14_8045 = null;
        aIncommingOpcode_8049 = null;
        int i_0_ = 118 % ((-40 - i) / 36);
    }

    static final void method3288(int i, int i_1_, int i_2_, byte i_3_, int i_4_) {
        if (i_3_ >= -108)
            method3288(-47, -74, 10, (byte) 66, -113);
        anInt8048++;
        if (i_1_ >= Class302.anInt3500 && Class289.anInt3399 >= i_1_) {
            i_4_ = Class49.method389(aa_Sub3.anInt5270, 82, Class181.anInt2099, i_4_);
            i = Class49.method389(aa_Sub3.anInt5270, 4, Class181.anInt2099, i);
            Class185_Sub1.method1625(i, i_1_, i_2_, 6, i_4_);
        }
    }

    static final void method3289(byte i) {
        int i_5_ = -18 % ((16 - i) / 36);
        anInt8046++;
        Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2234(true);
        int i_6_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 8);
        if ((Class28.anInt4892 ^ 0xffffffff) < (i_6_ ^ 0xffffffff)) {
            for (int i_7_ = i_6_; Class28.anInt4892 > i_7_; i_7_++)
                Class131.anIntArray1596[Class120.anInt1511++] = Class346_Sub7_Sub2_Sub3.anIntArray10381[i_7_];
        }
        if (i_6_ > Class28.anInt4892)
            throw new RuntimeException("gnpov1");
        Class28.anInt4892 = 0;
        for (int i_8_ = 0; (i_6_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
            int i_9_ = Class346_Sub7_Sub2_Sub3.anIntArray10381[i_8_];
            NPC NPC = (((Node_Sub10) (Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_9_, (byte) 31)).aNPC_6946);
            int i_10_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 1);
            if ((i_10_ ^ 0xffffffff) == -1) {
                Class346_Sub7_Sub2_Sub3.anIntArray10381[Class28.anInt4892++] = i_9_;
                ((Entity) NPC).anInt10452 = Class22.anInt319;
            } else {
                int i_11_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 2);
                if (i_11_ == 0) {
                    Class346_Sub7_Sub2_Sub3.anIntArray10381[Class28.anInt4892++] = i_9_;
                    ((Entity) NPC).anInt10452 = Class22.anInt319;
                    Node_Sub14_Sub2.anIntArray9177[Class282_Sub2.anInt7611++] = i_9_;
                } else if (i_11_ == 1) {
                    Class346_Sub7_Sub2_Sub3.anIntArray10381[Class28.anInt4892++] = i_9_;
                    ((Entity) NPC).anInt10452 = Class22.anInt319;
                    int i_12_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 3);
                    NPC.method3671(1, (byte) -76, i_12_);
                    int i_13_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 1);
                    if (i_13_ == 1)
                        Node_Sub14_Sub2.anIntArray9177[Class282_Sub2.anInt7611++] = i_9_;
                } else if ((i_11_ ^ 0xffffffff) == -3) {
                    Class346_Sub7_Sub2_Sub3.anIntArray10381[Class28.anInt4892++] = i_9_;
                    ((Entity) NPC).anInt10452 = Class22.anInt319;
                    if ((Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 1) ^ 0xffffffff) == -2) {
                        int i_14_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 3);
                        NPC.method3671(2, (byte) -85, i_14_);
                        int i_15_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 3);
                        NPC.method3671(2, (byte) -96, i_15_);
                    } else {
                        int i_16_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 3);
                        NPC.method3671(0, (byte) -82, i_16_);
                    }
                    int i_17_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 1);
                    if ((i_17_ ^ 0xffffffff) == -2)
                        Node_Sub14_Sub2.anIntArray9177[Class282_Sub2.anInt7611++] = i_9_;
                } else if ((i_11_ ^ 0xffffffff) == -4)
                    Class131.anIntArray1596[Class120.anInt1511++] = i_9_;
            }
        }
    }

    static final void method3290(int i, int i_18_) {
        synchronized (Class340.aClass278_3953) {
            Class340.aClass278_3953.method2864(i, -15782);
        }
        anInt8047++;
        if (i_18_ > -119)
            aClass14_8045 = null;
    }

    static int method3291(int i, int i_19_) {
        return i ^ i_19_;
    }

    static final boolean method3292(int i, int i_20_, int i_21_) {
        anInt8044++;
        if (i != -7113)
            aClass14_8045 = null;
        if (!(Class193.method1656(i_20_, i_21_, 102) | (i_21_ & 0x70000 ^ 0xffffffff) != -1) && !Node_Sub14.method2270(i_21_, i_20_, (byte) 8))
            return false;
        return true;
    }

    abstract Class136_Sub3 method3293(boolean bool);
}
