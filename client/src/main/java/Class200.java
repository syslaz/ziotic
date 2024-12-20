/* Class200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class200 {
    int anInt2287;
    static int anInt2288;
    static int[] anIntArray2289 = {28, 35, 40, 44};
    static boolean aBoolean2290 = false;
    static int anInt2291;

    static final void method1682(byte i) {
        if (i < -58) {
            for (int i_0_ = 0; (Class282_Sub2.anInt7611 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
                int i_1_ = Node_Sub14_Sub2.anIntArray9177[i_0_];
                NPC NPC = (((Node_Sub10) (Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_1_, (byte) 31)).aNPC_6946);
                int i_2_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -37);
                if ((i_2_ & 0x4) != 0)
                    i_2_ += Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -73) << -130689720;
                if ((i_2_ & 0x8000 ^ 0xffffffff) != -1)
                    i_2_ += Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 85) << 906885680;
                if ((i_2_ & 0x40) != 0) { //hit
                    int i_3_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
                    if (i_3_ > 0) {
                        for (int i_4_ = 0; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
                            int i_5_ = -1;
                            int i_6_ = -1;
                            int i_7_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readSmart((byte) 22);
                            int i_8_ = -1;
                            if (i_7_ != 32767) {
                                if ((i_7_ ^ 0xffffffff) != -32767)
                                    i_6_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readSmart((byte) 22);
                                else
                                    i_7_ = -1;
                            } else {
                                i_7_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readSmart((byte) 22);
                                i_6_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readSmart((byte) 22);
                                i_5_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readSmart((byte) 22);
                                i_8_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readSmart((byte) 22);
                            }
                            int i_9_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readSmart((byte) 22);
                            int i_10_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) -126);
                            NPC.method3643(i_5_, 47, i_6_, i_9_, Node_Sub18.anInt7027, i_7_, i_10_, i_8_);
                        }
                    }
                }
                if ((0x100 & i_2_ ^ 0xffffffff) != -1) {
                    int i_11_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 76);
                    int[] is = new int[i_11_];
                    int[] is_12_ = new int[i_11_];
                    int[] is_13_ = new int[i_11_];
                    for (int i_14_ = 0; i_11_ > i_14_; i_14_++) {
                        int i_15_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-126);
                        if ((i_15_ ^ 0xffffffff) == -65536)
                            i_15_ = -1;
                        is[i_14_] = i_15_;
                        is_12_[i_14_] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) 10);
                        is_13_[i_14_] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-112);
                    }
                    Class54.method430(is_12_, NPC, is_13_, 117, is);
                }
                if ((i_2_ & 0x400 ^ 0xffffffff) != -1) {//graphics2
                    int i_16_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
                    if ((i_16_ ^ 0xffffffff) == -65536)
                        i_16_ = -1;
                    int i_17_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt2(-1893167880);
                    int i_18_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
                    int i_19_ = i_18_ & 0x7;
                    int i_20_ = (i_18_ & 0x78) >> 564925443;
                    if (i_20_ == 15)
                        i_20_ = -1;
                    NPC.method3629(i_20_, i_16_, i_17_, 1, (byte) 109, i_19_);
                }
                if ((i_2_ & 0x1000) != 0) {
                    ((Entity) NPC).aByte10477 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByteA(-8996);
                    ((Entity) NPC).aByte10413 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByteC((byte) 105);
                    ((Entity) NPC).aByte10485 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByte(44);
                    ((Entity) NPC).aByte10450 = (byte) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 99);
                    ((Entity) NPC).anInt10479 = (Node_Sub18.anInt7027 + Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128));
                    ((Entity) NPC).anInt10421 = (Node_Sub18.anInt7027 - -Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128));
                }
                if ((i_2_ & 0x2000 ^ 0xffffffff) != -1) {
                    ((Entity) NPC).forceMovementX1 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByteA(-8996);
                    ((Entity) NPC).forceMovementY1 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByteC((byte) 91);
                    ((Entity) NPC).forceMovementX2 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByteS(-33);
                    ((Entity) NPC).forceMovementY2 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByte(97);
                    ((Entity) NPC).forceMovementSpeed1 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true) + Node_Sub18.anInt7027;
                    ((Entity) NPC).forceMovementSpeed2 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128) + Node_Sub18.anInt7027;
                    ((Entity) NPC).forceMovementDirection = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
                    ((Entity) NPC).forceMovementX1 += ((Entity) NPC).posQueueX[0];
                    ((Entity) NPC).anInt10505 = 0;
                    ((Entity) NPC).forceMovementY2 += ((Entity) NPC).posQueueY[0];
                    ((Entity) NPC).forceMovementX2 += ((Entity) NPC).posQueueX[0];
                    ((Entity) NPC).forceMovementY1 += ((Entity) NPC).posQueueY[0];
                    ((Entity) NPC).anInt10503 = 1;
                }
                if ((i_2_ & 0x8 ^ 0xffffffff) != -1) {//anim
                    int[] is = new int[4];
                    for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > -5; i_21_++) {
                        is[i_21_] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-113);
                        if (is[i_21_] == 65535)
                            is[i_21_] = -1;
                    }
                    int i_22_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) 85);
                    Class381.method3917((byte) 4, is, NPC, i_22_);
                }
                if ((0x20000 & i_2_) != 0) {
                    ((NPC) NPC).aString10604 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                    if ("".equals(((NPC) NPC).aString10604) || (((NPC) NPC).aString10604.equals(((Class255) (((NPC) NPC).aClass255_10614)).aString2915)))
                        ((NPC) NPC).aString10604 = ((Class255) (((NPC) NPC).aClass255_10614)).aString2915;
                }
                if ((i_2_ & 0x10 ^ 0xffffffff) != -1) {//transform npc?
                    if (((NPC) NPC).aClass255_10614.method2740((byte) -86))
                        Node_Sub14_Sub19.method2335(false, NPC);
                    NPC.method3670((byte) -92, (Class148.aClass119_5096.method1123(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1), 8881)));
                    NPC.setSize((byte) 106, ((Class255) (((NPC) NPC).aClass255_10614)).size);
                    ((Entity) NPC).anInt10480 = (((Class255) (((NPC) NPC).aClass255_10614)).anInt2910 << -1803938717);
                    if (((NPC) NPC).aClass255_10614.method2740((byte) -106))
                        Class353.method3755(NPC, 0, (((Entity) NPC).posQueueX[0]), null, (((Interactable) NPC).plane), (((Entity) NPC).posQueueY[0]), -652104791, null);
                }
                if ((i_2_ & 0x10000 ^ 0xffffffff) != -1) {     //graphics3
                    int i_23_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                    int i_24_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt2(-1893167880);
                    if (i_23_ == 65535)
                        i_23_ = -1;
                    int i_25_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
                    int i_26_ = 0x7 & i_25_;
                    int i_27_ = (i_25_ & 0x7c) >> -1170366717;
                    if (i_27_ == 15)
                        i_27_ = -1;
                    NPC.method3629(i_27_, i_23_, i_24_, 2, (byte) 118, i_26_);
                }
                if ((0x2 & i_2_ ^ 0xffffffff) != -1) {   //graphics1
                    int i_28_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-106);
                    if (i_28_ == 65535)
                        i_28_ = -1;
                    int i_29_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEInt_((byte) 0);
                    int i_30_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -42);
                    int i_31_ = 0x7 & i_30_;
                    int i_32_ = (0x7c & i_30_) >> 1553857571;
                    if ((i_32_ ^ 0xffffffff) == -16)
                        i_32_ = -1;
                    NPC.method3629(i_32_, i_28_, i_29_, 0, (byte) 116, i_31_);
                }
                if ((i_2_ & 0x200) != 0) {
                    int i_33_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-128);
                    ((Entity) NPC).anInt10412 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
                    ((Entity) NPC).anInt10449 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) 2);
                    ((Entity) NPC).anInt10440 = i_33_ & 0x7fff;
                    ((Entity) NPC).aBoolean10451 = (i_33_ & 0x8000 ^ 0xffffffff) != -1;
                    ((Entity) NPC).anInt10490 = (((Entity) NPC).anInt10412 + (((Entity) NPC).anInt10440 + Node_Sub18.anInt7027));
                }
                if ((i_2_ & 0x1 ^ 0xffffffff) != -1) {
                    ((NPC) NPC).anInt10594 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
                    ((NPC) NPC).anInt10602 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
                }
                if ((0x80000 & i_2_ ^ 0xffffffff) != -1) {
                    ((NPC) NPC).anInt10608 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-107);
                    if (((NPC) NPC).anInt10608 == 65535)
                        ((NPC) NPC).anInt10608 = ((Class255) (((NPC) NPC).aClass255_10614)).anInt2858;
                }
                if ((i_2_ & 0x4000) != 0) {
                    int i_34_ = (((Class255) (((NPC) NPC).aClass255_10614)).anIntArray2864).length;
                    int i_35_ = 0;
                    if (((Class255) (((NPC) NPC).aClass255_10614)).aShortArray2904 != null)
                        i_35_ = (((Class255) (((NPC) NPC).aClass255_10614)).aShortArray2904).length;
                    int i_36_ = 0;
                    if (((Class255) (((NPC) NPC).aClass255_10614)).aShortArray2898 != null)
                        i_36_ = (((Class255) (((NPC) NPC).aClass255_10614)).aShortArray2898).length;
                    int i_37_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -96);
                    if ((i_37_ & 0x1 ^ 0xffffffff) != -2) {
                        int[] is = null;
                        if ((i_37_ & 0x2 ^ 0xffffffff) == -3) {
                            is = new int[i_34_];
                            for (int i_38_ = 0; i_34_ > i_38_; i_38_++)
                                is[i_38_] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-123);
                        }
                        short[] is_39_ = null;
                        if ((0x4 & i_37_) == 4) {
                            is_39_ = new short[i_35_];
                            for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (i_35_ ^ 0xffffffff); i_40_++)
                                is_39_[i_40_] = (short) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
                        }
                        short[] is_41_ = null;
                        if ((i_37_ & 0x8) == 8) {
                            is_41_ = new short[i_36_];
                            for (int i_42_ = 0; i_36_ > i_42_; i_42_++)
                                is_41_[i_42_] = (short) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                        }
                        long l = ((long) ((NPC) NPC).anInt10599++ << -503760544 | (long) i_1_);
                        ((NPC) NPC).aClass122_10612 = new Class122(l, is, is_39_, is_41_);
                    } else
                        ((NPC) NPC).aClass122_10612 = null;
                }
                if ((i_2_ & 0x800) != 0) {
                    int i_43_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
                    int[] is = new int[i_43_];
                    int[] is_44_ = new int[i_43_];
                    for (int i_45_ = 0; i_43_ > i_45_; i_45_++) {
                        int i_46_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-96);
                        if ((i_46_ & 0xc000) == 49152) {
                            int i_47_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
                            is[i_45_] = Class358.retrieveLooksSettings(i_47_, i_46_ << -1254417456);
                        } else
                            is[i_45_] = i_46_;
                        is_44_[i_45_] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
                    }
                    NPC.method3638(is_44_, false, is);
                }
                if ((0x40000 & i_2_ ^ 0xffffffff) != -1) {
                    int i_48_ = (((Class255) (((NPC) NPC).aClass255_10614)).anIntArray2894).length;
                    int i_49_ = 0;
                    if (((Class255) (((NPC) NPC).aClass255_10614)).aShortArray2904 != null)
                        i_49_ = (((Class255) (((NPC) NPC).aClass255_10614)).aShortArray2904).length;
                    int i_50_ = 0;
                    if (((Class255) (((NPC) NPC).aClass255_10614)).aShortArray2898 != null)
                        i_49_ = (((Class255) (((NPC) NPC).aClass255_10614)).aShortArray2898).length;
                    int i_51_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
                    if ((0x1 & i_51_ ^ 0xffffffff) != -2) {
                        int[] is = null;
                        if ((0x2 & i_51_) == 2) {
                            is = new int[i_48_];
                            for (int i_52_ = 0; (i_48_ ^ 0xffffffff) < (i_52_ ^ 0xffffffff); i_52_++)
                                is[i_52_] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
                        }
                        short[] is_53_ = null;
                        if ((i_51_ & 0x4 ^ 0xffffffff) == -5) {
                            is_53_ = new short[i_49_];
                            for (int i_54_ = 0; (i_49_ ^ 0xffffffff) < (i_54_ ^ 0xffffffff); i_54_++)
                                is_53_[i_54_] = (short) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                        }
                        short[] is_55_ = null;
                        if ((i_51_ & 0x8) == 8) {
                            is_55_ = new short[i_50_];
                            for (int i_56_ = 0; i_50_ > i_56_; i_56_++)
                                is_55_[i_56_] = (short) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-108);
                        }
                        long l = ((long) ((NPC) NPC).anInt10595++ << -900171488 | (long) i_1_);
                        new Class122(l, is, is_53_, is_55_);
                    }
                }
                if ((i_2_ & 0x20 ^ 0xffffffff) != -1) { //faceentity
                    ((Entity) NPC).faceEntity = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-95);
                    if ((((Entity) NPC).faceEntity ^ 0xffffffff) == -65536)
                        ((Entity) NPC).faceEntity = -1;
                }
                if ((i_2_ & 0x80 ^ 0xffffffff) != -1) { //forcedchat
                    ((Entity) NPC).message = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                    ((Entity) NPC).anInt10481 = 100;
                }
            }
            anInt2291++;
        }
    }

    public final String toString() {
        anInt2288++;
        throw new IllegalStateException();
    }

    public static void method1683(int i) {
        if (i < 31)
            method1683(90);
        anIntArray2289 = null;
    }

    Class200(int i) {
        ((Class200) this).anInt2287 = i;
    }
}
