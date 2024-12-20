/* Class248_Sub15_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub15_Sub4 extends Node_Sub15 {
    static int anInt9694;
    static int anInt9695;
    static int anInt9696;
    static int anInt9697;
    static Class243 aClass243_9698;
    static int anInt9699;
    static int anInt9700;
    Class293 aClass293_9701 = new Class293();
    static int anInt9702;
    static int anInt9703;
    static int anInt9704;
    private Node_Sub15_Sub1 aClass248_Sub15_Sub1_9705;
    static int anInt9706;
    Node_Sub15_Sub3 aClass248_Sub15_Sub3_9707 = new Node_Sub15_Sub3();

    static final boolean method2491(int i, int i_0_) {
        anInt9696++;
        if (i > -23)
            aClass243_9698 = null;
        if (i_0_ == 59 || (i_0_ ^ 0xffffffff) == -7 || i_0_ == 18 || i_0_ == 11 || (i_0_ ^ 0xffffffff) == -48)
            return true;
        if ((i_0_ ^ 0xffffffff) == -10 || (i_0_ ^ 0xffffffff) == -1003)
            return true;
        return false;
    }

    final int method2405() {
        anInt9706++;
        return 0;
    }

    final Node_Sub15 method2401() {
        anInt9704++;
        Node_Sub26 class248_sub26 = ((Node_Sub26) ((Node_Sub15_Sub4) this).aClass293_9701.method3119(2));
        if (class248_sub26 == null)
            return null;
        if (((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135 != null)
            return ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135;
        return method2399();
    }

    public static void method2492(byte i) {
        aClass243_9698 = null;
        if (i != -114)
            aClass243_9698 = null;
    }

    final void method2400(int[] is, int i, int i_1_) {
        anInt9695++;
        ((Node_Sub15_Sub4) this).aClass248_Sub15_Sub3_9707.method2400(is, i, i_1_);
        while_178_:
        for (Node_Sub26 class248_sub26 = ((Node_Sub26) ((Node_Sub15_Sub4) this).aClass293_9701.method3119(2)); class248_sub26 != null; class248_sub26 = (Node_Sub26) ((Node_Sub15_Sub4) this).aClass293_9701.method3107(-128)) {
            if (!aClass248_Sub15_Sub1_9705.method2437(class248_sub26, 98)) {
                int i_2_ = i;
                int i_3_ = i_1_;
                while (((Node_Sub26) class248_sub26).anInt7138 < i_3_) {
                    method2494(((Node_Sub26) class248_sub26).anInt7138, class248_sub26, (byte) 95, i_3_ + i_2_, i_2_, is);
                    i_3_ -= ((Node_Sub26) class248_sub26).anInt7138;
                    i_2_ += ((Node_Sub26) class248_sub26).anInt7138;
                    if (aClass248_Sub15_Sub1_9705.method2408(class248_sub26, is, i_2_, 2, i_3_))
                        continue while_178_;
                }
                method2494(i_3_, class248_sub26, (byte) 73, i_2_ - -i_3_, i_2_, is);
                ((Node_Sub26) class248_sub26).anInt7138 -= i_3_;
            }
        }
    }

    final void method2404(int i) {
        anInt9703++;
        ((Node_Sub15_Sub4) this).aClass248_Sub15_Sub3_9707.method2404(i);
        while_180_:
        for (Node_Sub26 class248_sub26 = ((Node_Sub26) ((Node_Sub15_Sub4) this).aClass293_9701.method3119(2)); class248_sub26 != null; class248_sub26 = (Node_Sub26) ((Node_Sub15_Sub4) this).aClass293_9701.method3107(-127)) {
            if (!aClass248_Sub15_Sub1_9705.method2437(class248_sub26, 93)) {
                int i_4_ = i;
                while (((Node_Sub26) class248_sub26).anInt7138 < i_4_) {
                    method2493((byte) -98, ((Node_Sub26) class248_sub26).anInt7138, class248_sub26);
                    i_4_ -= ((Node_Sub26) class248_sub26).anInt7138;
                    if (aClass248_Sub15_Sub1_9705.method2408(class248_sub26, null, 0, 2, i_4_))
                        continue while_180_;
                }
                method2493((byte) -92, i_4_, class248_sub26);
                ((Node_Sub26) class248_sub26).anInt7138 -= i_4_;
            }
        }
    }

    private final void method2493(byte i, int i_5_, Node_Sub26 class248_sub26) {
        if (i > -66)
            method2399();
        anInt9700++;
        if ((0x4 & (((Node_Sub15_Sub1) aClass248_Sub15_Sub1_9705).anIntArray9637[((Node_Sub26) class248_sub26).anInt7139])) != 0 && ((((Node_Sub26) class248_sub26).anInt7130 ^ 0xffffffff) > -1)) {
            int i_6_ = ((((Node_Sub15_Sub1) aClass248_Sub15_Sub1_9705).anIntArray9650[((Node_Sub26) class248_sub26).anInt7139]) / Class54.anInt728);
            int i_7_ = ((-((Node_Sub26) class248_sub26).anInt7147 + (i_6_ + 1048575)) / i_6_);
            ((Node_Sub26) class248_sub26).anInt7147 = (((Node_Sub26) class248_sub26).anInt7147 + i_6_ * i_5_ & 0xfffff);
            if ((i_7_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff)) {
                if (((((Node_Sub15_Sub1) aClass248_Sub15_Sub1_9705).anIntArray9627[((Node_Sub26) class248_sub26).anInt7139]) ^ 0xffffffff) != -1) {
                    ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135 = (Node_Sub15_Sub2.method2452((((Node_Sub26) class248_sub26).aClass248_Sub31_Sub1_7129), ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2470(), 0, ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2456()));
                    aClass248_Sub15_Sub1_9705.method2434(class248_sub26, (byte) -62, ((((Node_Sub50) (((Node_Sub26) class248_sub26).aClass248_Sub50_7148)).aShortArray7446[((Node_Sub26) class248_sub26).anInt7133]) ^ 0xffffffff) > -1);
                } else
                    ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135 = (Node_Sub15_Sub2.method2452((((Node_Sub26) class248_sub26).aClass248_Sub31_Sub1_7129), ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2470(), ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2475(), ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2456()));
                if (((((Node_Sub50) ((Node_Sub26) class248_sub26).aClass248_Sub50_7148).aShortArray7446[((Node_Sub26) class248_sub26).anInt7133]) ^ 0xffffffff) > -1)
                    ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2463(-1);
                i_5_ = ((Node_Sub26) class248_sub26).anInt7147 / i_6_;
            }
        }
        ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2404(i_5_);
    }

    private final void method2494(int i, Node_Sub26 class248_sub26, byte i_8_, int i_9_, int i_10_, int[] is) {
        if (i_8_ < 33)
            method2404(-25);
        anInt9697++;
        if ((0x4 & (((Node_Sub15_Sub1) aClass248_Sub15_Sub1_9705).anIntArray9637[((Node_Sub26) class248_sub26).anInt7139]) ^ 0xffffffff) != -1 && ((((Node_Sub26) class248_sub26).anInt7130 ^ 0xffffffff) > -1)) {
            int i_11_ = ((((Node_Sub15_Sub1) aClass248_Sub15_Sub1_9705).anIntArray9650[((Node_Sub26) class248_sub26).anInt7139]) / Class54.anInt728);
            for (; ; ) {
                int i_12_ = ((-((Node_Sub26) class248_sub26).anInt7147 + (i_11_ + 1048575)) / i_11_);
                if (i_12_ > i)
                    break;
                ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2400(is, i_10_, i_12_);
                i -= i_12_;
                i_10_ += i_12_;
                ((Node_Sub26) class248_sub26).anInt7147 += -1048576 + i_12_ * i_11_;
                int i_13_ = Class54.anInt728 / 100;
                int i_14_ = 262144 / i_11_;
                if ((i_14_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff))
                    i_13_ = i_14_;
                Node_Sub15_Sub2 class248_sub15_sub2 = (((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135);
                if ((((Node_Sub15_Sub1) aClass248_Sub15_Sub1_9705).anIntArray9627[((Node_Sub26) class248_sub26).anInt7139]) != 0) {
                    ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135 = (Node_Sub15_Sub2.method2452((((Node_Sub26) class248_sub26).aClass248_Sub31_Sub1_7129), class248_sub15_sub2.method2470(), 0, class248_sub15_sub2.method2456()));
                    aClass248_Sub15_Sub1_9705.method2434(class248_sub26, (byte) 113, ((((Node_Sub50) (((Node_Sub26) class248_sub26).aClass248_Sub50_7148)).aShortArray7446[((Node_Sub26) class248_sub26).anInt7133]) ^ 0xffffffff) > -1);
                    ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2450(i_13_, class248_sub15_sub2.method2475());
                } else
                    ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135 = (Node_Sub15_Sub2.method2452((((Node_Sub26) class248_sub26).aClass248_Sub31_Sub1_7129), class248_sub15_sub2.method2470(), class248_sub15_sub2.method2475(), class248_sub15_sub2.method2456()));
                if ((((Node_Sub50) ((Node_Sub26) class248_sub26).aClass248_Sub50_7148).aShortArray7446[((Node_Sub26) class248_sub26).anInt7133]) < 0)
                    ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2463(-1);
                class248_sub15_sub2.method2480(i_13_);
                class248_sub15_sub2.method2400(is, i_10_, i_9_ - i_10_);
                if (class248_sub15_sub2.method2464())
                    ((Node_Sub15_Sub4) this).aClass248_Sub15_Sub3_9707.method2485(class248_sub15_sub2);
            }
            ((Node_Sub26) class248_sub26).anInt7147 += i * i_11_;
        }
        ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135.method2400(is, i_10_, i);
    }

    final Node_Sub15 method2399() {
        anInt9699++;
        Node_Sub26 class248_sub26;
        do {
            class248_sub26 = (Node_Sub26) ((Node_Sub15_Sub4) this).aClass293_9701.method3107(-127);
            if (class248_sub26 == null)
                return null;
        } while (((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135 == null);
        return ((Node_Sub26) class248_sub26).aClass248_Sub15_Sub2_7135;
    }

    Node_Sub15_Sub4(Node_Sub15_Sub1 class248_sub15_sub1) {
        aClass248_Sub15_Sub1_9705 = class248_sub15_sub1;
    }
}
