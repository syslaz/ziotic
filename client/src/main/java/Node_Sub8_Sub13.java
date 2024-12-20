/* Class248_Sub8_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

abstract class Node_Sub8_Sub13 extends Node_Sub8 {
    volatile boolean aBoolean9024 = true;
    boolean aBoolean9025;
    static int anInt9026;
    boolean aBoolean9027;
    static int anInt9028;
    static int anInt9029;
    static float aFloat9030 = 1024.0F;

    static final Class345 method2094(int i, int i_0_, Component component, byte i_1_, Class174 class174) {
        anInt9029++;
        if (Class54.anInt728 == 0)
            throw new IllegalStateException();
        if (i < 0 || (i ^ 0xffffffff) <= -3)
            throw new IllegalArgumentException();
        if ((i_0_ ^ 0xffffffff) > -257)
            i_0_ = 256;
        try {
            Class345 class345 = (Class345) Class.forName("Class345_Sub1").newInstance();
            ((Class345) class345).anIntArray4089 = new int[(Class225_Sub3.aBoolean8472 ? 2 : 1) * 256];
            ((Class345) class345).anInt4118 = i_0_;
            class345.method3526(component);
            ((Class345) class345).anInt4107 = (~0x3ff & i_0_) - -1024;
            if (((Class345) class345).anInt4107 > 16384)
                ((Class345) class345).anInt4107 = 16384;
            class345.method3528(((Class345) class345).anInt4107);
            if ((Node_Sub25.anInt5158 ^ 0xffffffff) < -1 && Node_Sub14_Sub26.aClass258_9432 == null) {
                Node_Sub14_Sub26.aClass258_9432 = new Class258();
                ((Class258) Node_Sub14_Sub26.aClass258_9432).aClass174_2954 = class174;
                class174.method1576(Node_Sub14_Sub26.aClass258_9432, Node_Sub25.anInt5158, i_1_ ^ 0x1b);
            }
            if (Node_Sub14_Sub26.aClass258_9432 != null) {
                if ((((Class258) Node_Sub14_Sub26.aClass258_9432).aClass345Array2948[i]) != null)
                    throw new IllegalArgumentException();
                ((Class258) Node_Sub14_Sub26.aClass258_9432).aClass345Array2948[i] = class345;
            }
            return class345;
        } catch (Throwable throwable) {
            try {
                Class345_Sub2 class345_sub2 = new Class345_Sub2(class174, i);
                ((Class345) class345_sub2).anInt4118 = i_0_;
                ((Class345) class345_sub2).anIntArray4089 = new int[(Class225_Sub3.aBoolean8472 ? 2 : 1) * 256];
                class345_sub2.method3526(component);
                ((Class345) class345_sub2).anInt4107 = 16384;
                class345_sub2.method3528(((Class345) class345_sub2).anInt4107);
                if (i_1_ != 27)
                    return null;
                if (Node_Sub25.anInt5158 > 0 && Node_Sub14_Sub26.aClass258_9432 == null) {
                    Node_Sub14_Sub26.aClass258_9432 = new Class258();
                    ((Class258) Node_Sub14_Sub26.aClass258_9432).aClass174_2954 = class174;
                    class174.method1576(Node_Sub14_Sub26.aClass258_9432, Node_Sub25.anInt5158, 0);
                }
                if (Node_Sub14_Sub26.aClass258_9432 != null) {
                    if ((((Class258) Node_Sub14_Sub26.aClass258_9432).aClass345Array2948[i]) != null)
                        throw new IllegalArgumentException();
                    ((Class258) Node_Sub14_Sub26.aClass258_9432).aClass345Array2948[i] = class345_sub2;
                }
                return class345_sub2;
            } catch (Throwable throwable_2_) {
                return new Class345();
            }
        }
    }

    static final boolean method2095(int i) {
        anInt9026++;
        if ((Class273.anInt5008 ^ 0xffffffff) > -2)
            return false;
        int i_3_ = -102 % ((i - -3) / 56);
        return true;
    }

    abstract int method2096(int i);

    abstract byte[] method2097(int i);

    public Node_Sub8_Sub13() {
        /* empty */
    }

    static final String method2098(int i, int i_4_, boolean bool, int i_5_) {
        anInt9028++;
        if (i_4_ < 2 || (i_4_ ^ 0xffffffff) < -37)
            throw new IllegalArgumentException("Invalid radix:" + i_4_);
        if (i != 256)
            aFloat9030 = 0.06669602F;
        if (!bool || (i_5_ ^ 0xffffffff) > -1)
            return Integer.toString(i_5_, i_4_);
        int i_6_ = 2;
        for (int i_7_ = i_5_ / i_4_; (i_7_ ^ 0xffffffff) != -1; i_7_ /= i_4_)
            i_6_++;
        char[] cs = new char[i_6_];
        cs[0] = '+';
        for (int i_8_ = i_6_ + -1; (i_8_ ^ 0xffffffff) < -1; i_8_--) {
            int i_9_ = i_5_;
            i_5_ /= i_4_;
            int i_10_ = i_9_ + -(i_4_ * i_5_);
            if ((i_10_ ^ 0xffffffff) > -11)
                cs[i_8_] = (char) (48 + i_10_);
            else
                cs[i_8_] = (char) (87 + i_10_);
        }
        return new String(cs);
    }
}
