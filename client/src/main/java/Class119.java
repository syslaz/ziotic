/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class119 {
    boolean aBoolean1485;
    static int anInt1486;
    static int anInt1487;
    static int anInt1488;
    Class215 aClass215_1489;
    static int anInt1490;
    static int anInt1491;
    private Class278 aClass278_1492 = new Class278(64);
    static int anInt1493;
    static int anInt1494;
    static int anInt1495;
    static int anInt1496;
    private Class381 aClass381_1497;
    static int anInt1498;
    static int anInt1499;
    static int anInt1500;
    Class381 aClass381_1501;
    Class278 aClass278_1502 = new Class278(50);
    Class278 aClass278_1503 = new Class278(5);
    int anInt1504;

    final void method1113(int i, boolean bool) {
        anInt1493++;
        if (!bool == ((Class119) this).aBoolean1485) {
            ((Class119) this).aBoolean1485 = bool;
            method1117((byte) -60);
            if (i != 3)
                method1121(-80);
        }
    }

    final void method1114(int i, int i_0_) {
        if (i != 1)
            aClass381_1497 = null;
        synchronized (aClass278_1492) {
            aClass278_1492.method2864(i_0_, -15782);
        }
        anInt1486++;
        synchronized (((Class119) this).aClass278_1502) {
            ((Class119) this).aClass278_1502.method2864(i_0_, -15782);
        }
        synchronized (((Class119) this).aClass278_1503) {
            ((Class119) this).aClass278_1503.method2864(i_0_, -15782);
        }
    }

    final void method1115(byte i) {
        anInt1500++;
        synchronized (aClass278_1492) {
            aClass278_1492.method2869(0);
        }
        synchronized (((Class119) this).aClass278_1502) {
            ((Class119) this).aClass278_1502.method2869(0);
        }
        if (i < 94)
            method1122((byte) 126);
        synchronized (((Class119) this).aClass278_1503) {
            ((Class119) this).aClass278_1503.method2869(0);
        }
    }

    static final void method1116(int i, boolean bool, int i_1_, int i_2_, Node_Sub15_Sub1 class248_sub15_sub1, Class381 class381, int i_3_) {
        anInt1488++;
        int i_4_ = -113 / ((-86 - i) / 32);
        Class132.method1216(bool, 106, i_3_, i_1_, i_2_, class381);
        Class341.aClass248_Sub15_Sub1_3980 = class248_sub15_sub1;
    }

    final void method1117(byte i) {
        anInt1499++;
        synchronized (aClass278_1492) {
            aClass278_1492.method2872((byte) -78);
        }
        synchronized (((Class119) this).aClass278_1502) {
            ((Class119) this).aClass278_1502.method2872((byte) -78);
        }
        synchronized (((Class119) this).aClass278_1503) {
            ((Class119) this).aClass278_1503.method2872((byte) -78);
            if (i >= -30)
                method1119(-72, -71);
        }
    }

    static final void method1118(int i) {
        if (i == 11473) {
            while ((Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2228(false, Class30.currentPacketSize) ^ 0xffffffff) <= -16) {
                int i_5_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 15);
                if ((i_5_ ^ 0xffffffff) == -32768)
                    break;
                boolean bool = false;
                Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_5_, (byte) 31));
                if (class248_sub10 == null) {
                    NPC NPC = new NPC();
                    ((Entity) NPC).anInt10484 = i_5_;
                    class248_sub10 = new Node_Sub10(NPC);
                    Class253_Sub1.aClass65_7514.method509(-1, class248_sub10, (long) i_5_);
                    bool = true;
                    Node_Sub30.aClass248_Sub10Array7182[Node_Sub8_Sub16_Sub1.anInt10303++] = class248_sub10;
                }
                NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                Class346_Sub7_Sub2_Sub3.anIntArray10381[Class28.anInt4892++] = i_5_;
                ((Entity) NPC).anInt10452 = Class22.anInt319;
                if (((NPC) NPC).aClass255_10614 != null && ((NPC) NPC).aClass255_10614.method2740((byte) -94))
                    Node_Sub14_Sub19.method2335(false, NPC);
                int i_6_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 1);
                if (i_6_ == 1)
                    Node_Sub14_Sub2.anIntArray9177[Class282_Sub2.anInt7611++] = i_5_;
                int i_7_ = ((4 + Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 3) & ~0x31fffff8) << 440078539);
                int i_8_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 2);
                NPC.method3670((byte) -80, (Class148.aClass119_5096.method1123(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 14), 8881)));
                int i_9_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 1);
                int i_10_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 5);
                if ((i_10_ ^ 0xffffffff) < -16)
                    i_10_ -= 32;
                int i_11_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 5);
                if ((i_11_ ^ 0xffffffff) < -16)
                    i_11_ -= 32;
                NPC.setSize((byte) 119, ((Class255) (((NPC) NPC).aClass255_10614)).size);
                ((Entity) NPC).anInt10480 = ((Class255) (((NPC) NPC).aClass255_10614)).anInt2910 << -1199226845;
                if (bool)
                    NPC.method3644((byte) -17, i_7_, true);
                NPC.method3666((i_9_ ^ 0xffffffff) == -2, i_11_ + (((Entity) Class347.myPlayer).posQueueX[0]), i_10_ + (((Entity) Class347.myPlayer).posQueueY[0]), NPC.method3632(-1), i_8_, 108);
                if (((NPC) NPC).aClass255_10614.method2740((byte) -87))
                    Class353.method3755(NPC, 0, (((Entity) NPC).posQueueX[0]), null, (((Interactable) NPC).plane), (((Entity) NPC).posQueueY[0]), -652104791, null);
            }
            anInt1494++;
            Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2233(-73);
        }
    }

    final void method1119(int i, int i_12_) {
        anInt1490++;
        ((Class119) this).anInt1504 = i_12_;
        synchronized (((Class119) this).aClass278_1502) {
            ((Class119) this).aClass278_1502.method2872((byte) -78);
        }
        synchronized (((Class119) this).aClass278_1503) {
            ((Class119) this).aClass278_1503.method2872((byte) -78);
            if (i != 5)
                method1118(-122);
        }
    }

    static final void method1120(String string, boolean bool) {
        if (bool == false) {
            anInt1495++;
            Class216.method1740(0, string, "", (byte) -15, "", "", 0);
        }
    }

    static final void method1121(int i) {
        if (i <= 26)
            method1121(38);
        anInt1487++;
        for (Node_Sub8_Sub8 class248_sub8_sub8 = (Node_Sub8_Sub8) Class198.aClass293_2259.method3119(2); class248_sub8_sub8 != null; class248_sub8_sub8 = ((Node_Sub8_Sub8) Class198.aClass293_2259.method3107(-127))) {
            Class346_Sub7_Sub2_Sub3 class346_sub7_sub2_sub3 = (((Node_Sub8_Sub8) class248_sub8_sub8).aClass346_Sub7_Sub2_Sub3_8962);
            if (((Class346_Sub7_Sub2_Sub3) class346_sub7_sub2_sub3).aBoolean10394) {
                class248_sub8_sub8.remove(true);
                class346_sub7_sub2_sub3.method3617(false);
            } else if (Node_Sub18.anInt7027 >= (((Class346_Sub7_Sub2_Sub3) class346_sub7_sub2_sub3).anInt10390)) {
                class346_sub7_sub2_sub3.method3616((byte) 0, Class77.anInt998);
                if (((Class346_Sub7_Sub2_Sub3) class346_sub7_sub2_sub3).aBoolean10394)
                    class248_sub8_sub8.remove(true);
                else
                    Class299.method3175(class346_sub7_sub2_sub3, true);
            }
        }
    }

    final void method1122(byte i) {
        synchronized (((Class119) this).aClass278_1502) {
            ((Class119) this).aClass278_1502.method2872((byte) -78);
        }
        anInt1496++;
        synchronized (((Class119) this).aClass278_1503) {
            ((Class119) this).aClass278_1503.method2872((byte) -78);
        }
        if (i > -116)
            aClass381_1497 = null;
    }

    final Class255 method1123(int i, int i_13_) {
        anInt1498++;
        Class255 class255;
        synchronized (aClass278_1492) {
            class255 = (Class255) aClass278_1492.method2863(4, (long) i);
        }
        if (class255 != null)
            return class255;
        byte[] is;
        synchronized (aClass381_1497) {
            is = aClass381_1497.method3922((byte) 119, Class305.method3211(82, i), Class340_Sub9.method3470(i_13_ + -8984, i));
        }
        class255 = new Class255();
        ((Class255) class255).anInt2914 = i;
        ((Class255) class255).aClass119_2924 = this;
        if (is != null)
            class255.method2736(new ByteStream(is), (byte) -54);
        class255.method2743(-65536);
        synchronized (aClass278_1492) {
            aClass278_1492.method2867((byte) 0, (long) i, class255);
        }
        if (i_13_ != 8881)
            method1115((byte) 50);
        return class255;
    }

    static final void method1124(int i) {
        if (i == -3) {
            anInt1491++;
            if (Class133.aClass322_5037 != null) {
                if (Class133.aClass322_5037.anInt3788 == 1)
                    Class133.aClass322_5037 = null;
                else if ((Class133.aClass322_5037.anInt3788 ^ 0xffffffff) == -3) {
                    Class351.method3744(2, Node_Sub14_Sub38.aClass174_9582, Class162_Sub2.aString6536, (byte) -128);
                    Class133.aClass322_5037 = null;
                }
            }
        }
    }

    Class119(Class215 class215, int i, boolean bool, Class381 class381, Class381 class381_14_) {
        ((Class119) this).aClass381_1501 = class381_14_;
        ((Class119) this).aBoolean1485 = bool;
        ((Class119) this).aClass215_1489 = class215;
        aClass381_1497 = class381;
        if (aClass381_1497 != null) {
            int i_15_ = aClass381_1497.method3902(0) - 1;
            aClass381_1497.method3899(i_15_, 0);
        }
    }
}
