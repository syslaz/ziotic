/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class184 {
    static int anInt2147;
    int anInt2148;
    static int anInt2149;
    int anInt2150;
    int anInt2151;
    static int anInt2152;
    static int anInt2153;
    boolean aBoolean2154;
    int anInt2155;
    int anInt2156 = 16777215;
    int anInt2157;
    static int anInt2158;
    int anInt2159;

    static final void method1616(byte i) {
        for (Node_Sub8_Sub5 class248_sub8_sub5 = (Node_Sub8_Sub5) Class363.aClass64_4478.method492(896); class248_sub8_sub5 != null; class248_sub8_sub5 = ((Node_Sub8_Sub5) Class363.aClass64_4478.method490(true))) {
            if ((((Node_Sub8_Sub5) class248_sub8_sub5).anInt8937 ^ 0xffffffff) < -2) {
                ((Node_Sub8_Sub5) class248_sub8_sub5).anInt8937 = 0;
                Class304.aClass278_3529.method2867((byte) 0, ((Node_Sub8_Sub11) (Node_Sub8_Sub11) (((Node_Sub8) ((Class64) (((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936)).aClass248_Sub8_856).aClass248_Sub8_6871)).aLong8994, class248_sub8_sub5);
                ((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936.method496((byte) -74);
            }
        }
        anInt2149++;
        Class379.anInt4638 = 0;
        Class113.anInt1402 = 0;
        if (i >= 52) {
            Class358.aClass293_4424.method3121(10);
            Class14.aClass65_267.method504(-1);
            Class363.aClass64_4478.method496((byte) -74);
            Canvas_Sub1.method123(Node_Sub48.aClass248_Sub8_Sub11_7428, 52);
        }
    }

    final void method1617(ByteStream class248_sub9, int i) {
        anInt2158++;
        if (i == -1) {
            for (; ; ) {
                int i_0_ = class248_sub9.readUnsignedByte((byte) -39);
                if ((i_0_ ^ 0xffffffff) == -1)
                    break;
                method1620(class248_sub9, -97, i_0_);
            }
        }
    }

    static final void method1618(byte i) {
        anInt2147++;
        Node_Sub39 class248_sub39 = (Node_Sub39) Class368.aClass293_4524.method3119(2);
        boolean bool = (Class371.aClass354_4564 != null || (Class282_Sub12.anInt7715 ^ 0xffffffff) < -1);
        int i_1_ = class248_sub39.method2606(-15204);
        int i_2_ = class248_sub39.method2601((byte) -125);
        if (bool)
            Class279_Sub1.anInt7561 = 1;
        if (i != 117)
            method1618((byte) 62);
        if (bool)
            Class323.aClass248_Sub8_Sub11_3804 = Class300.aClass248_Sub8_Sub11_3498;
        else
            Class340_Sub2.method3450(false, i_2_, i_1_, Class300.aClass248_Sub8_Sub11_3498);
    }

    static final void method1619(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
        if (i_7_ == i_3_ && i_5_ == i_10_ && i_9_ == i && i_11_ == i_8_)
            Class90.method671(i_10_, i, i_4_ ^ 0x5287, i_6_, i_8_, i_7_);
        else {
            int i_12_ = i_7_;
            int i_13_ = i_10_;
            int i_14_ = i_7_ * 3;
            int i_15_ = 3 * i_10_;
            int i_16_ = i_3_ * 3;
            int i_17_ = i_5_ * 3;
            int i_18_ = 3 * i_9_;
            int i_19_ = i_11_ * 3;
            int i_20_ = -i_18_ + i + i_16_ + -i_7_;
            int i_21_ = -i_10_ + (i_8_ + -i_19_) + i_17_;
            int i_22_ = -i_16_ + (i_18_ + -i_16_) + i_14_;
            int i_23_ = -i_17_ + (-i_17_ + i_19_ - -i_15_);
            int i_24_ = -i_14_ + i_16_;
            int i_25_ = i_17_ + -i_15_;
            for (int i_26_ = 128; i_26_ <= 4096; i_26_ += 128) {
                int i_27_ = i_26_ * i_26_ >> 1219915468;
                int i_28_ = i_27_ * i_26_ >> -236281268;
                int i_29_ = i_20_ * i_28_;
                int i_30_ = i_21_ * i_28_;
                int i_31_ = i_22_ * i_27_;
                int i_32_ = i_23_ * i_27_;
                int i_33_ = i_26_ * i_24_;
                int i_34_ = i_25_ * i_26_;
                int i_35_ = i_7_ + (i_33_ + (i_31_ + i_29_) >> 1497001356);
                int i_36_ = i_10_ + (i_30_ - (-i_32_ - i_34_) >> -53924820);
                Class90.method671(i_13_, i_35_, -21125, i_6_, i_36_, i_12_);
                i_12_ = i_35_;
                i_13_ = i_36_;
            }
        }
        if (i_4_ == -4)
            anInt2152++;
    }

    private final void method1620(ByteStream class248_sub9, int i, int i_37_) {
        if ((i_37_ ^ 0xffffffff) == -2)
            ((Class184) this).anInt2155 = class248_sub9.readShort(-1);
        else if ((i_37_ ^ 0xffffffff) == -3)
            ((Class184) this).aBoolean2154 = true;
        else if ((i_37_ ^ 0xffffffff) == -4) {
            ((Class184) this).anInt2148 = class248_sub9.readUnsignedShort((byte) -10);
            ((Class184) this).anInt2157 = class248_sub9.readUnsignedShort((byte) -10);
            ((Class184) this).anInt2151 = class248_sub9.readUnsignedShort((byte) -10);
        } else if (i_37_ != 4) {
            if (i_37_ == 5)
                ((Class184) this).anInt2150 = class248_sub9.readShort(-1);
            else if (i_37_ == 6)
                ((Class184) this).anInt2156 = class248_sub9.method2221(255);
        } else
            ((Class184) this).anInt2159 = class248_sub9.readUnsignedByte((byte) -87);
        if (i >= -66)
            ((Class184) this).aBoolean2154 = false;
        anInt2153++;
    }

    public Class184() {
        ((Class184) this).anInt2155 = 8;
    }
}
