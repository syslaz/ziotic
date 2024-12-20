/* Class346_Sub7_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class346_Sub7_Sub5 extends Interactable {
    static int anInt9953;
    static int anInt9954;
    short aShort9955;
    static int anInt9956;
    static short[][] aShortArrayArray9957;
    static int anInt9958 = 0;
    static Class65 aClass65_9959 = new Class65(64);
    static int anInt9960;
    static int anInt9961;
    static int anInt9962;
    static int anInt9963;

    public static void method3689(byte i) {
        if (i < 82)
            anInt9960 = 71;
        aClass65_9959 = null;
        aShortArrayArray9957 = null;
    }

    static final boolean method3690(int i, int i_0_, int i_1_) {
        anInt9956++;
        if (i != 23606)
            method3689((byte) -40);
        if ((i_1_ & 0x34) == 0)
            return false;
        return true;
    }

    final boolean method3576(ha var_ha, byte i) {
        anInt9961++;
        if (i != 35)
            anInt9958 = 125;
        return Class167.method1542(false, ((Interactable) this).aByte8322, (((Interactable) this).y >> Class96.anInt1249), this, (((Interactable) this).x >> Class96.anInt1249));
    }

    static final void method3691(int i) {
        anInt9953++;
        if (Node_Sub14_Sub39.anIntArray9600 == null) {
            Node_Sub14_Sub39.anIntArray9600 = new int[65536];
            double d = 0.7 + (-0.015 + 0.03 * Math.random());
            if (i != -6747)
                anInt9963 = -116;
            for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -65537; i_2_++) {
                double d_3_ = ((double) ((i_2_ & 0xfda5) >> -195838006) / 64.0 + 0.0078125);
                double d_4_ = (double) ((i_2_ & 0x3ad) >> -262321945) / 8.0 + 0.0625;
                double d_5_ = (double) (i_2_ & 0x7f) / 128.0;
                double d_6_ = d_5_;
                double d_7_ = d_5_;
                double d_8_ = d_5_;
                if (d_4_ != 0.0) {
                    double d_9_;
                    if (d_5_ < 0.5)
                        d_9_ = (d_4_ + 1.0) * d_5_;
                    else
                        d_9_ = -(d_5_ * d_4_) + (d_5_ + d_4_);
                    double d_10_ = 2.0 * d_5_ - d_9_;
                    double d_11_ = 0.3333333333333333 + d_3_;
                    if (d_11_ > 1.0)
                        d_11_--;
                    double d_12_ = d_3_;
                    double d_13_ = -0.3333333333333333 + d_3_;
                    if (!(6.0 * d_11_ < 1.0)) {
                        if (2.0 * d_11_ < 1.0)
                            d_6_ = d_9_;
                        else if (3.0 * d_11_ < 2.0)
                            d_6_ = 6.0 * ((-d_11_ + 0.6666666666666666) * (d_9_ - d_10_)) + d_10_;
                        else
                            d_6_ = d_10_;
                    } else
                        d_6_ = 6.0 * (d_9_ - d_10_) * d_11_ + d_10_;
                    if (d_13_ < 0.0)
                        d_13_++;
                    if (6.0 * d_12_ < 1.0)
                        d_7_ = d_10_ + 6.0 * (-d_10_ + d_9_) * d_12_;
                    else if (d_12_ * 2.0 < 1.0)
                        d_7_ = d_9_;
                    else if (!(d_12_ * 3.0 < 2.0))
                        d_7_ = d_10_;
                    else
                        d_7_ = d_10_ + ((-d_10_ + d_9_) * (-d_12_ + 0.6666666666666666) * 6.0);
                    if (d_13_ * 6.0 < 1.0)
                        d_8_ = d_10_ + 6.0 * (-d_10_ + d_9_) * d_13_;
                    else if (d_13_ * 2.0 < 1.0)
                        d_8_ = d_9_;
                    else if (!(d_13_ * 3.0 < 2.0))
                        d_8_ = d_10_;
                    else
                        d_8_ = 6.0 * ((d_9_ - d_10_) * (-d_13_ + 0.6666666666666666)) + d_10_;
                }
                d_6_ = Math.pow(d_6_, d);
                d_7_ = Math.pow(d_7_, d);
                d_8_ = Math.pow(d_8_, d);
                int i_14_ = (int) (d_6_ * 256.0);
                int i_15_ = (int) (d_7_ * 256.0);
                int i_16_ = (int) (d_8_ * 256.0);
                int i_17_ = (i_14_ << 195454448) + (i_15_ << -430165272) + i_16_;
                Node_Sub14_Sub39.anIntArray9600[i_2_] = i_17_;
            }
        }
    }

    final int method3566(Node_Sub42[] class248_sub42s, byte i) {
        if (i != -58)
            return 78;
        anInt9962++;
        int i_18_ = ((Interactable) this).x >> Class96.anInt1249;
        int i_19_ = ((Interactable) this).y >> Class96.anInt1249;
        int i_20_ = 0;
        if (Class286.anInt3375 != i_18_) {
            if (Class286.anInt3375 < i_18_)
                i_20_ += 2;
        } else
            i_20_++;
        if ((i_19_ ^ 0xffffffff) != (Class152.anInt1808 ^ 0xffffffff)) {
            if ((i_19_ ^ 0xffffffff) > (Class152.anInt1808 ^ 0xffffffff))
                i_20_ += 6;
        } else
            i_20_ += 3;
        int i_21_ = Class50.anIntArray662[i_20_];
        if ((i_21_ & ((Class346_Sub7_Sub5) this).aShort9955 ^ 0xffffffff) != -1)
            return this.method3581(class248_sub42s, i_18_, (byte) 85, i_19_);
        if ((((Class346_Sub7_Sub5) this).aShort9955 ^ 0xffffffff) == -2 && (i_18_ ^ 0xffffffff) < -1)
            return this.method3581(class248_sub42s, -1 + i_18_, (byte) 85, i_19_);
        if (((Class346_Sub7_Sub5) this).aShort9955 == 4 && i_18_ <= Class225_Sub1.anInt8454)
            return this.method3581(class248_sub42s, 1 + i_18_, (byte) 85, i_19_);
        if (((Class346_Sub7_Sub5) this).aShort9955 == 8 && i_19_ > 0)
            return this.method3581(class248_sub42s, i_18_, (byte) 85, i_19_ + -1);
        if (((Class346_Sub7_Sub5) this).aShort9955 == 2 && (Class89.anInt1106 ^ 0xffffffff) <= (i_19_ ^ 0xffffffff))
            return this.method3581(class248_sub42s, i_18_, (byte) 85, 1 + i_19_);
        if ((((Class346_Sub7_Sub5) this).aShort9955 ^ 0xffffffff) == -17 && i_18_ > 0 && (Class89.anInt1106 ^ 0xffffffff) <= (i_19_ ^ 0xffffffff))
            return this.method3581(class248_sub42s, i_18_ - 1, (byte) 85, i_19_ - -1);
        if ((((Class346_Sub7_Sub5) this).aShort9955 ^ 0xffffffff) == -33 && (Class225_Sub1.anInt8454 ^ 0xffffffff) <= (i_18_ ^ 0xffffffff) && (i_19_ ^ 0xffffffff) >= (Class89.anInt1106 ^ 0xffffffff))
            return this.method3581(class248_sub42s, i_18_ - -1, (byte) 85, i_19_ - -1);
        if ((((Class346_Sub7_Sub5) this).aShort9955 ^ 0xffffffff) == -129 && (i_18_ ^ 0xffffffff) < -1 && (i_19_ ^ 0xffffffff) < -1)
            return this.method3581(class248_sub42s, i_18_ + -1, (byte) 85, i_19_ + -1);
        if ((((Class346_Sub7_Sub5) this).aShort9955 ^ 0xffffffff) == -65 && i_18_ <= Class225_Sub1.anInt8454 && (i_19_ ^ 0xffffffff) < -1)
            return this.method3581(class248_sub42s, 1 + i_18_, (byte) 85, i_19_ + -1);
        throw new RuntimeException("");
    }

    Class346_Sub7_Sub5(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
        ((Class346_Sub7_Sub5) this).aShort9955 = (short) i_26_;
        ((Interactable) this).aByte8322 = (byte) i_25_;
        ((Interactable) this).x = i;
        ((Interactable) this).plane = (byte) i_24_;
        ((Interactable) this).y = i_23_;
        ((Interactable) this).anInt8317 = i_22_;
    }

    final boolean getSomeBoolean(int i) {
        anInt9954++;
        if (i > -100)
            return true;
        return (RSInterface2.aBooleanArrayArray4314[Node_Sub47.anInt7416 + ((((Interactable) this).x >> Class96.anInt1249) + -Class286.anInt3375)][(Node_Sub47.anInt7416 + (((Interactable) this).y >> Class96.anInt1249) - Class152.anInt1808)]);
    }
}
