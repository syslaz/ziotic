/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class300 {
    static Frame aFrame3494;
    static IncommingOpcode aIncommingOpcode_3495;
    static int anInt3496 = 0;
    static int anInt3497;
    static Node_Sub8_Sub11 aClass248_Sub8_Sub11_3498;

    public static void method3180(int i) {
        if (i != 63)
            anInt3496 = -79;
        aIncommingOpcode_3495 = null;
        aClass248_Sub8_Sub11_3498 = null;
        aFrame3494 = null;
    }

    static final boolean method3181(int i, int i_0_, int i_1_, byte[] is, int i_2_, int i_3_) {
        anInt3497++;
        boolean bool = true;
        ByteStream class248_sub9 = new ByteStream(is);
        int i_4_ = 111 / ((-16 - i_2_) / 42);
        int i_5_ = -1;
        for (; ; ) {
            int i_6_ = class248_sub9.method2191(34);
            if ((i_6_ ^ 0xffffffff) == -1)
                break;
            i_5_ += i_6_;
            int i_7_ = 0;
            boolean bool_8_ = false;
            for (; ; ) {
                if (bool_8_) {
                    int i_9_ = class248_sub9.readSmart((byte) 22);
                    if (i_9_ == 0)
                        break;
                    class248_sub9.readUnsignedByte((byte) 91);
                } else {
                    int i_10_ = class248_sub9.readSmart((byte) 22);
                    if ((i_10_ ^ 0xffffffff) == -1)
                        break;
                    i_7_ += -1 + i_10_;
                    int i_11_ = i_7_ & 0x3f;
                    int i_12_ = (0xfc0 & i_7_) >> -2075862298;
                    int i_13_ = class248_sub9.readUnsignedByte((byte) -34) >> -1559907134;
                    int i_14_ = i_0_ + i_12_;
                    int i_15_ = i_1_ + i_11_;
                    if ((i_14_ ^ 0xffffffff) < -1 && (i_15_ ^ 0xffffffff) < -1 && (i_14_ ^ 0xffffffff) > (i + -1 ^ 0xffffffff) && i_15_ < i_3_ + -1) {
                        ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -29, i_5_);
                        if ((i_13_ ^ 0xffffffff) != -23 || ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub16_7349.method2988(true) != 0 || ((((ObjectDefinition) class266).anInt3105 ^ 0xffffffff) != -1) || ((ObjectDefinition) class266).anInt3093 == 1 || ((ObjectDefinition) class266).aBoolean3091) {
                            if (!class266.method2796((byte) 127)) {
                                bool = false;
                                Class36.anInt405++;
                            }
                            bool_8_ = true;
                        }
                    }
                }
            }
        }
        return bool;
    }

    static {
        aIncommingOpcode_3495 = new IncommingOpcode(42, 0);
    }
}
