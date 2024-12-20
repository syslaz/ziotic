/* Class248_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub20 extends Node {
    static int anInt7044;
    static Class240 aClass240_7045;
    byte[] aByteArray7046;
    static int anInt7047;
    static int anInt7048;
    static int anInt7049;

    static final void method2521(byte i) {
        anInt7044++;
        int i_0_ = 0;
        if ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub11_7347.method2963(true) ^ 0xffffffff) == -2) {
            i_0_ |= 0x1;
            i_0_ |= 0x10;
            i_0_ |= 0x20;
            i_0_ |= 0x2;
            i_0_ |= 0x4;
        }
        if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub29_7313.method3047(true) == 0)
            i_0_ |= 0x40;
        Class232.method1842(91, i_0_);
        Class346_Sub7_Sub4_Sub2.aClass368_10161.method3840(i_0_, 84);
        Class283.aClass342_3343.method3493(36, i_0_);
        Class148.aClass119_5096.method1119(5, i_0_);
        Class279_Sub2.aClass151_7577.method1352(i_0_, -1);
        Class261.method2766(i_0_, 127);
        if (i <= 77)
            aClass240_7045 = null;
        Node_Sub19.method2519(-15286, i_0_);
        IncommingOpcode.method1108(123, i_0_);
        Node_Sub39_Sub2.method2608(-194034494, i_0_);
        Node_Sub14_Sub32.method2371((byte) 122);
    }

    static final void method2522(int i, byte[] is, byte[] is_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        anInt7047++;
        int i_8_ = -(i_6_ >> -850363774);
        i_6_ = -(i_6_ & 0x3);
        if (i_4_ > 100) {
            for (int i_9_ = -i; i_9_ < 0; i_9_++) {
                for (int i_10_ = i_8_; i_10_ < 0; i_10_++) {
                    is[i_5_++] += -is_1_[i_2_++];
                    is[i_5_++] += -is_1_[i_2_++];
                    is[i_5_++] += -is_1_[i_2_++];
                    is[i_5_++] += -is_1_[i_2_++];
                }
                for (int i_11_ = i_6_; (i_11_ ^ 0xffffffff) > -1; i_11_++)
                    is[i_5_++] += -is_1_[i_2_++];
                i_5_ += i_7_;
                i_2_ += i_3_;
            }
        }
    }

    static final void method2523(RSInterface2 class354, byte i, boolean bool, int i_12_, int i_13_) {
        anInt7049++;
        int i_14_ = ((RSInterface2) class354).anInt4332;
        if ((((RSInterface2) class354).aByte4241 ^ 0xffffffff) == -1)
            ((RSInterface2) class354).anInt4332 = ((RSInterface2) class354).anInt4306;
        else if (((RSInterface2) class354).aByte4241 == 1)
            ((RSInterface2) class354).anInt4332 = i_12_ - ((RSInterface2) class354).anInt4306;
        else if (((RSInterface2) class354).aByte4241 == 2)
            ((RSInterface2) class354).anInt4332 = i_12_ * ((RSInterface2) class354).anInt4306 >> -651945938;
        int i_15_ = ((RSInterface2) class354).anInt4223;
        if (((RSInterface2) class354).aByte4302 != 0) {
            if (((RSInterface2) class354).aByte4302 != 1) {
                if (((RSInterface2) class354).aByte4302 == 2)
                    ((RSInterface2) class354).anInt4223 = (((RSInterface2) class354).anInt4218 * i_13_ >> -536824690);
            } else
                ((RSInterface2) class354).anInt4223 = -((RSInterface2) class354).anInt4218 + i_13_;
        } else
            ((RSInterface2) class354).anInt4223 = ((RSInterface2) class354).anInt4218;
        if ((((RSInterface2) class354).aByte4241 ^ 0xffffffff) == -5)
            ((RSInterface2) class354).anInt4332 = (((RSInterface2) class354).anInt4206 * ((RSInterface2) class354).anInt4223 / ((RSInterface2) class354).anInt4216);
        if (((RSInterface2) class354).aByte4302 == 4)
            ((RSInterface2) class354).anInt4223 = (((RSInterface2) class354).anInt4332 * ((RSInterface2) class354).anInt4216 / ((RSInterface2) class354).anInt4206);
        if (Class332.aBoolean3874 && ((((Node_Sub48) client.method113(class354)).anInt7424 ^ 0xffffffff) != -1 || ((RSInterface2) class354).anInt4284 == 0)) {
            if (((RSInterface2) class354).anInt4223 >= 5 || ((RSInterface2) class354).anInt4332 >= 5) {
                if ((((RSInterface2) class354).anInt4223 ^ 0xffffffff) >= -1)
                    ((RSInterface2) class354).anInt4223 = 5;
                if ((((RSInterface2) class354).anInt4332 ^ 0xffffffff) >= -1)
                    ((RSInterface2) class354).anInt4332 = 5;
            } else {
                ((RSInterface2) class354).anInt4223 = 5;
                ((RSInterface2) class354).anInt4332 = 5;
            }
        }
        if ((Class249.anInt2809 ^ 0xffffffff) == (((RSInterface2) class354).anInt4205 ^ 0xffffffff))
            Class341.aClass354_3973 = class354;
        if (i != 13)
            method2523(null, (byte) -98, false, -127, -24);
        if (bool && ((RSInterface2) class354).anObjectArray4233 != null && ((i_14_ ^ 0xffffffff) != (((RSInterface2) class354).anInt4332 ^ 0xffffffff) || ((((RSInterface2) class354).anInt4223 ^ 0xffffffff) != (i_15_ ^ 0xffffffff)))) {
            RSInterface class248_sub6 = new RSInterface();
            ((RSInterface) class248_sub6).rsInter = class354;
            ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4233;
            Class176.aClass293_2065.method3109(class248_sub6, -104);
        }
    }

    static final void method2524(boolean bool) {
        if (Class270.anInt3134 == 1 || Class270.anInt3134 == 3 || (Class270.anInt3134 != Class267.anInt4919 && (Class270.anInt3134 == 0 || (Class267.anInt4919 ^ 0xffffffff) == -1))) {
            Node_Sub8_Sub16_Sub1.anInt10303 = 0;
            Class28.anInt4892 = 0;
            Class253_Sub1.aClass65_7514.method504(-1);
        }
        if (bool == false) {
            anInt7048++;
            Class267.anInt4919 = Class270.anInt3134;
        }
    }

    public static void method2525(int i) {
        if (i != 1)
            aClass240_7045 = null;
        aClass240_7045 = null;
    }

    Node_Sub20(byte[] is) {
        ((Node_Sub20) this).aByteArray7046 = is;
    }
}
