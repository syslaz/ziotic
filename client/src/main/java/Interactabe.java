/* Class346_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

abstract class Interactable extends Class346 {
    int anInt8307;
    static int anInt8308;
    int y;
    boolean aBoolean8310 = false;
    static int anInt8311;
    int x;
    static int anInt8313;
    int anInt8314;
    byte plane;
    int anInt8316;
    int anInt8317;
    boolean aBoolean8318;
    static int anInt8319;
    Interactable aInteractable_8320;
    static IncommingOpcode aIncommingOpcode_8321 = new IncommingOpcode(0, 4);
    byte aByte8322;
    static Class128 aClass128_8323 = new Class128(10, 7);
    static Class58 aClass58_8324 = new Class58("", 11);
    static int anInt8325;

    abstract boolean method3563(boolean bool);

    static final void method3564(int i, int i_0_, int i_1_, boolean bool, int i_2_) {
        if (bool == false) {
            anInt8313++;
            for (int i_3_ = 0; Node_Sub14.anInt6990 > i_3_; i_3_++) {
                Rectangle rectangle = Node_Sub2_Sub1.aRectangleArray8834[i_3_];
                if (i_0_ < rectangle.x - -rectangle.width && (rectangle.x ^ 0xffffffff) > (i_1_ + i_0_ ^ 0xffffffff) && (i ^ 0xffffffff) > (rectangle.height + rectangle.y ^ 0xffffffff) && rectangle.y < i_2_ + i)
                    Class143.aBooleanArray1678[i_3_] = true;
            }
            Class210.method1724(i_0_ + i_1_, i_0_, (byte) -126, i + i_2_, i);
        }
    }

    static final int method3565(byte i) {
        anInt8319++;
        ha var_ha = Class287.aHa3381;
        boolean bool = false;
        if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) != 0) {
            Canvas canvas = new Canvas();
            canvas.setSize(100, 100);
            var_ha = Class32.method272(0, 0, 0, null, null, canvas);
            bool = true;
        }
        long l = Class118.method1112(116);
        for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -10001; i_4_++)
            var_ha.a(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        int i_5_ = (int) (Class118.method1112(116) + -l);
        var_ha.method820(100, 11, 100, 0, 0, -16777216);
        if (bool)
            var_ha.method819(91);
        int i_6_ = -17 % ((-5 - i) / 61);
        return i_5_;
    }

    abstract int method3566(Node_Sub42[] class248_sub42s, byte i);

    abstract int method3567(byte i);

    abstract boolean method3568(int i);

    abstract boolean getSomeBoolean(int i);

    int method3570(int i) {
        anInt8308++;
        if (i > 0)
            return 55;
        return 0;
    }

    public static void method3571(byte i) {
        aIncommingOpcode_8321 = null;
        aClass128_8323 = null;
        aClass58_8324 = null;
        if (i >= -3)
            anInt8325 = 59;
    }

    abstract void method3572(Interactable interactable_7_, ha var_ha, int i, int i_8_, int i_9_, boolean bool, int i_10_);

    abstract void method3573(ha var_ha, byte i);

    abstract boolean method3574(byte i);

    abstract Class38 method3575(byte i, ha var_ha);

    abstract boolean method3576(ha var_ha, byte i);

    abstract void method3577(int i);

    public Interactable() {
        /* empty */
    }

    abstract Class346_Sub10 method3578(int i, ha var_ha);

    abstract boolean method3579(ha var_ha, int i, int i_11_, byte i_12_);

    abstract int method3580(int i);

    final int method3581(Node_Sub42[] class248_sub42s, int i, byte i_13_, int i_14_) {
        anInt8311++;
        long l = (Class286.aLongArrayArrayArray3380[((Interactable) this).plane][i][i_14_]);
        long l_15_ = 0L;
        int i_16_ = 0;
        for (/**/; l_15_ <= 48L; l_15_ += 16L) {
            int i_17_ = (int) (l >> (int) l_15_ & 0xffffL);
            if (i_17_ <= 0)
                break;
            class248_sub42s[i_16_++] = (((Class156) Class340.aClass156Array3963[i_17_ - 1]).aClass248_Sub42_1853);
        }
        if (i_13_ != 85)
            method3565((byte) -22);
        for (int i_18_ = i_16_; (i_18_ ^ 0xffffffff) > -5; i_18_++)
            class248_sub42s[i_18_] = null;
        return i_16_;
    }
}
