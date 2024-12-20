/* Class282 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class282 {
    static int anInt3318;
    static int anInt3319 = -1;
    int anInt3320;
    Node_Sub45 aClass248_Sub45_3321;
    static int anInt3322;

    abstract int method2917(int i, int i_0_);

    abstract void method2918(byte i);

    abstract int method2919(boolean bool);

    static final void readMapRegionUpdate(int i) {
        Class270.anInt3134 = 0;
        anInt3322++;
        int partX = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
        int regionSize = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 120);
        boolean bool = ((Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45) ^ 0xffffffff) == -2);
        int partY = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(i + -1830088133);
        Node_Sub20.method2524(false);
        Class329.changeRegionSize(regionSize, true);
        int regionCount = ((Class30.currentPacketSize + -((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset) / 16);
        Node_Sub8_Sub5.mapXTEAKeys = new int[regionCount][4];
        int i_5_ = 0;
        if (i != 1830088036)
            anInt3319 = 22;
        for (/**/; i_5_ < regionCount; i_5_++) {
            for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -5; i_6_++)
                Node_Sub8_Sub5.mapXTEAKeys[i_5_][i_6_] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
        }
        Node_Sub39.anIntArray7280 = new int[regionCount];
        Class296.aByteArrayArray3456 = null;
        Node_Sub2_Sub3.aByteArrayArray8850 = new byte[regionCount][];
        Class282_Sub7.aByteArrayArray7666 = new byte[regionCount][];
        Class360.aByteArrayArray4447 = new byte[regionCount][];
        Class14.anIntArray263 = new int[regionCount];
        Node_Sub14_Sub36.anIntArray9544 = new int[regionCount];
        InputStream_Sub2.aByteArrayArray79 = new byte[regionCount][];
        Class346_Sub7_Sub4.anIntArray9951 = new int[regionCount];
        Class192.anIntArray2214 = new int[regionCount];
        Node_Sub14_Sub35.anIntArray9529 = null;
        regionCount = 0;
        for (int i_7_ = (partX + -(Node_Sub8_Sub4.anInt8360 >> 917894372)) / 8; ((Node_Sub8_Sub4.anInt8360 >> -242366652) + partX) / 8 >= i_7_; i_7_++) {
            for (int i_8_ = (partY - (Node_Sub22.anInt7074 >> -1780425116)) / 8; ((((Node_Sub22.anInt7074 >> 1830088036) + partY) / 8 ^ 0xffffffff) <= (i_8_ ^ 0xffffffff)); i_8_++) {
                Node_Sub14_Sub36.anIntArray9544[regionCount] = i_8_ + (i_7_ << 185909256);
                Node_Sub39.anIntArray7280[regionCount] = Class340_Sub6.aClass381_8158.method3927((byte) 92, "m" + i_7_ + "_" + i_8_);
                Class346_Sub7_Sub4.anIntArray9951[regionCount] = Class340_Sub6.aClass381_8158.method3927((byte) 50, "l" + i_7_ + "_" + i_8_);
                Class14.anIntArray263[regionCount] = Class340_Sub6.aClass381_8158.method3927((byte) 83, "um" + i_7_ + "_" + i_8_);
                Class192.anIntArray2214[regionCount] = Class340_Sub6.aClass381_8158.method3927((byte) 51, "ul" + i_7_ + "_" + i_8_);
                regionCount++;
            }
        }
        Class207.method1707(partX, bool, 11, partY, i + -1830088036);
    }

    final void method2921(int i, int i_9_) {
        anInt3318++;
        if (i_9_ != (method2917(0, i) ^ 0xffffffff))
            method2922(true, i);
    }

    Class282(Node_Sub45 class248_sub45) {
        ((Class282) this).aClass248_Sub45_3321 = class248_sub45;
        ((Class282) this).anInt3320 = method2919(false);
    }

    Class282(int i, Node_Sub45 class248_sub45) {
        ((Class282) this).anInt3320 = i;
        ((Class282) this).aClass248_Sub45_3321 = class248_sub45;
    }

    abstract void method2922(boolean bool, int i);
}
