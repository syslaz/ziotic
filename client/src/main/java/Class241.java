/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class241 {
    static int anInt2685;
    static int anInt2686 = 0;
    static int anInt2687;
    static Class278 aClass278_2688 = new Class278(20);
    static int anInt2689;
    static Class278 aClass278_2690 = new Class278(4);
    static Class64 aClass64_2691 = new Class64();
    static int anInt2692;
    static OutgoingOpcode aOutgoingOpcode_2693 = new OutgoingOpcode(64, 8);

    static final Node_Sub8_Sub18 method1926(byte i, byte[] is) {
        anInt2689++;
        Node_Sub8_Sub18 class248_sub8_sub18 = new Node_Sub8_Sub18();
        ByteStream class248_sub9 = new ByteStream(is);
        ((ByteStream) class248_sub9).offset = ((ByteStream) class248_sub9).buffer.length - 2;
        int i_0_ = class248_sub9.readShort(i ^ 0x2a);
        int i_1_ = -12 + (-i_0_ + (-2 + (((ByteStream) class248_sub9).buffer).length));
        ((ByteStream) class248_sub9).offset = i_1_;
        int i_2_ = class248_sub9.readInt(false);
        ((Node_Sub8_Sub18) class248_sub8_sub18).integerInstructionsAmount = class248_sub9.readShort(-1);
        ((Node_Sub8_Sub18) class248_sub8_sub18).stringInstructionsAmount = class248_sub9.readShort(-1);
        if (i != -43)
            return null;
        ((Node_Sub8_Sub18) class248_sub8_sub18).anInt9078 = class248_sub9.readShort(i ^ 0x2a);
        ((Node_Sub8_Sub18) class248_sub8_sub18).anInt9066 = class248_sub9.readShort(i + 42);
        int i_3_ = class248_sub9.readUnsignedByte((byte) 116);
        if ((i_3_ ^ 0xffffffff) < -1) {
            ((Node_Sub8_Sub18) class248_sub8_sub18).aClass65Array9069 = new Class65[i_3_];
            for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_4_++) {
                int i_5_ = class248_sub9.readShort(-1);
                Class65 class65 = new Class65(Class136_Sub4.method1269(i_5_, (byte) -128));
                ((Node_Sub8_Sub18) class248_sub8_sub18).aClass65Array9069[i_4_] = class65;
                while ((i_5_-- ^ 0xffffffff) < -1) {
                    int i_6_ = class248_sub9.readInt(false);
                    int i_7_ = class248_sub9.readInt(false);
                    class65.method509(-1, new Node_Sub37(i_7_), (long) i_6_);
                }
            }
        }
        ((ByteStream) class248_sub9).offset = 0;
        ((Node_Sub8_Sub18) class248_sub8_sub18).aString9067 = class248_sub9.method2182(i ^ 0x5a);
        ((Node_Sub8_Sub18) class248_sub8_sub18).anIntArray9068 = new int[i_2_];
        ((Node_Sub8_Sub18) class248_sub8_sub18).aStringArray9070 = new String[i_2_];
        ((Node_Sub8_Sub18) class248_sub8_sub18).opcodes = new int[i_2_];
        int i_8_ = 0;
        while (((ByteStream) class248_sub9).offset < i_1_) {
            int i_9_ = class248_sub9.readShort(i + 42);
            if (i_9_ == 3)
                ((Node_Sub8_Sub18) class248_sub8_sub18).aStringArray9070[i_8_] = class248_sub9.readString(Class316_Sub1.method3291(i, -15557)).intern();
            else if (i_9_ < 100 && (i_9_ ^ 0xffffffff) != -22 && (i_9_ ^ 0xffffffff) != -39 && i_9_ != 39)
                ((Node_Sub8_Sub18) class248_sub8_sub18).anIntArray9068[i_8_] = class248_sub9.readInt(false);
            else
                ((Node_Sub8_Sub18) class248_sub8_sub18).anIntArray9068[i_8_] = class248_sub9.readUnsignedByte((byte) -15);
            ((Node_Sub8_Sub18) class248_sub8_sub18).opcodes[i_8_++] = i_9_;
        }
        return class248_sub8_sub18;
    }

    static final boolean method1927(int i, int i_10_, int i_11_) {
        int i_12_ = 109 / ((i - 38) / 54);
        anInt2685++;
        if ((i_10_ & 0x20 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    static final void method1928(Interactable interactable, int i, int i_13_, int i_14_, int i_15_, int i_16_) {
        boolean bool = true;
        int i_17_ = i_13_;
        int i_18_ = i_13_ + i_15_;
        int i_19_ = i_14_ - 1;
        int i_20_ = i_14_ + i_16_;
        for (int i_21_ = i; i_21_ <= i + 1; i_21_++) {
            if (i_21_ != Class111_Sub1.anInt5531) {
                for (int i_22_ = i_17_; i_22_ <= i_18_; i_22_++) {
                    if (i_22_ >= 0 && i_22_ < Class225_Sub1.anInt8454) {
                        for (int i_23_ = i_19_; i_23_ <= i_20_; i_23_++) {
                            if (i_23_ >= 0 && i_23_ < Class89.anInt1106 && (!bool || i_22_ >= i_18_ || i_23_ >= i_20_ || i_23_ < i_14_ && i_22_ != i_13_)) {
                                Class137 class137 = (Class311.aClass137ArrayArrayArray3620[i_21_][i_22_][i_23_]);
                                if (class137 != null) {
                                    int i_24_ = (((Class177.aSArray2070[i_21_].method3145(i_22_, 83, i_23_) + (Class177.aSArray2070[i_21_].method3145(i_22_ + 1, 120, i_23_)) + (Class177.aSArray2070[i_21_].method3145(i_22_, 86, i_23_ + 1)) + (Class177.aSArray2070[i_21_].method3145(i_22_ + 1, 105, i_23_ + 1))) / 4) - (((Class177.aSArray2070[i].method3145(i_13_, 103, i_14_)) + (Class177.aSArray2070[i].method3145(i_13_ + 1, 126, i_14_)) + (Class177.aSArray2070[i].method3145(i_13_, 123, i_14_ + 1)) + (Class177.aSArray2070[i].method3145(i_13_ + 1, 99, i_14_ + 1))) / 4));
                                    Class346_Sub7_Sub5 class346_sub7_sub5 = (((Class137) class137).aClass346_Sub7_Sub5_1636);
                                    Class346_Sub7_Sub5 class346_sub7_sub5_25_ = (((Class137) class137).aClass346_Sub7_Sub5_1646);
                                    if (class346_sub7_sub5 != null && class346_sub7_sub5.method3568(115))
                                        interactable.method3572(class346_sub7_sub5, r.aHa9032, ((i_22_ - i_13_) * anInt2692 + ((1 - i_15_) * Class84_Sub9.anInt5495)), 115, ((i_23_ - i_14_) * anInt2692 + ((1 - i_16_) * Class84_Sub9.anInt5495)), bool, i_24_);
                                    if (class346_sub7_sub5_25_ != null && class346_sub7_sub5_25_.method3568(114))
                                        interactable.method3572(class346_sub7_sub5_25_, r.aHa9032, ((i_22_ - i_13_) * anInt2692 + ((1 - i_15_) * Class84_Sub9.anInt5495)), 112, ((i_23_ - i_14_) * anInt2692 + ((1 - i_16_) * Class84_Sub9.anInt5495)), bool, i_24_);
                                    for (Class49 class49 = (((Class137) class137).aClass49_1649); class49 != null; class49 = (((Class49) class49).aClass49_660)) {
                                        Animable animable = (((Class49) class49).aAnimable_656);
                                        if (animable != null && animable.method3568(110) && (i_22_ == (((Animable) animable).x1) || i_22_ == i_17_) && (i_23_ == (((Animable) animable).y1) || i_23_ == i_19_)) {
                                            int i_26_ = ((((Animable) animable).x2) - (((Animable) animable).x1) + 1);
                                            int i_27_ = ((((Animable) animable).y2) - (((Animable) animable).y1) + 1);
                                            interactable.method3572(animable, r.aHa9032, (((((Animable) animable).x1) - i_13_) * anInt2692 + ((i_26_ - i_15_) * (Class84_Sub9.anInt5495))), 113, (((((Animable) animable).y1) - i_14_) * anInt2692 + ((i_27_ - i_16_) * (Class84_Sub9.anInt5495))), bool, i_24_);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i_17_--;
                bool = false;
            }
        }
    }

    public static void method1929(int i) {
        aOutgoingOpcode_2693 = null;
        aClass64_2691 = null;
        aClass278_2688 = null;
        if (i >= -74)
            method1926((byte) -122, null);
        aClass278_2690 = null;
    }

    static final int method1930(int i, int i_28_) {
        anInt2687++;
        int i_29_ = 0;
        if (i <= 80)
            anInt2686 = 50;
        if (i_28_ < 0 || i_28_ >= 65536) {
            i_29_ += 16;
            i_28_ >>>= 16;
        }
        if (i_28_ >= 256) {
            i_28_ >>>= 8;
            i_29_ += 8;
        }
        if ((i_28_ ^ 0xffffffff) <= -17) {
            i_28_ >>>= 4;
            i_29_ += 4;
        }
        if ((i_28_ ^ 0xffffffff) <= -5) {
            i_29_ += 2;
            i_28_ >>>= 2;
        }
        if (i_28_ >= 1) {
            i_28_ >>>= 1;
            i_29_++;
        }
        return i_29_ + i_28_;
    }
}
