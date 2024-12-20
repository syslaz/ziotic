/* Class54_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class54_Sub2 extends Class54 {
    static String[] aStringArray5334 = new String[100];
    static int anInt5335;
    private int anInt5336;
    private int anInt5337;
    static int anInt5338;
    static int anInt5339;
    private int anInt5340;
    private int anInt5341;
    static int anInt5342;
    static long aLong5343 = 0L;

    final void method425(int i, int i_0_, int i_1_) {
        anInt5338++;
        int i_2_ = i_1_ * anInt5337 >> -1259998036;
        int i_3_ = -29 / ((-71 - i) / 53);
        int i_4_ = anInt5340 * i_1_ >> 482163980;
        int i_5_ = i_0_ * anInt5336 >> -565688564;
        int i_6_ = i_0_ * anInt5341 >> -407144276;
        Node_Sub35.method2588(i_2_, i_6_, ((Class54) this).anInt726, i_4_, i_5_, ((Class54) this).anInt723, 51);
    }

    final void method429(int i, byte i_7_, int i_8_) {
        anInt5335++;
        if (i_7_ != -72)
            anInt5341 = -74;
        int i_9_ = i * anInt5337 >> -1898310644;
        int i_10_ = i * anInt5340 >> -611068596;
        int i_11_ = anInt5336 * i_8_ >> 1470069548;
        int i_12_ = anInt5341 * i_8_ >> -1211683764;
        Player.method3661(i_12_, i_9_, (byte) -124, i_10_, i_11_, ((Class54) this).anInt724);
    }

    public static void method434(byte i) {
        aStringArray5334 = null;
        int i_13_ = 29 / ((-76 - i) / 33);
    }

    Class54_Sub2(int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
        super(i_17_, i_18_, i_19_);
        anInt5336 = i_14_;
        anInt5337 = i;
        anInt5341 = i_16_;
        anInt5340 = i_15_;
    }

    static final void method435(int i, int i_20_, int i_21_, int i_22_, int i_23_) {
        int i_24_ = 0;
        if (i_21_ > -32)
            aStringArray5334 = null;
        for (/**/; (i_24_ ^ 0xffffffff) > (Node_Sub14.anInt6990 ^ 0xffffffff); i_24_++) {
            Rectangle rectangle = Node_Sub2_Sub1.aRectangleArray8834[i_24_];
            if ((i_20_ ^ 0xffffffff) > (rectangle.x - -rectangle.width ^ 0xffffffff) && (rectangle.x ^ 0xffffffff) > (i_20_ + i_23_ ^ 0xffffffff) && ((rectangle.height + rectangle.y ^ 0xffffffff) < (i_22_ ^ 0xffffffff)) && i + i_22_ > rectangle.y)
                Class359.aBooleanArray4435[i_24_] = true;
        }
        anInt5339++;
        Class210.method1724(i_20_ - -i_23_, i_20_, (byte) -86, i + i_22_, i_22_);
    }

    final void method427(int i, int i_25_, int i_26_) {
        anInt5342++;
        int i_27_ = anInt5337 * i >> -215707956;
        int i_28_ = i * anInt5340 >> -141315572;
        int i_29_ = i_26_ * anInt5336 >> -591402036;
        if (i_25_ == 2) {
            int i_30_ = i_26_ * anInt5341 >> 1423387852;
            Class96.method702(i_28_, ((Class54) this).anInt726, i_27_, i_30_, ((Class54) this).anInt723, i_29_, ((Class54) this).anInt724, (byte) -47);
        }
    }
}
