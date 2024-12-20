/* OutputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.io.OutputStream;

final class OutputStream_Sub1 extends OutputStream {
    static Class14 aClass14_86 = new Class14();
    static int anInt87;
    static int anInt88;
    static IncommingOpcode aIncommingOpcode_89 = new IncommingOpcode(76, 10);
    static int anInt90;

    public final void write(int i) throws IOException {
        anInt90++;
        throw new IOException();
    }

    static final void method129(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
        anInt87++;
        if ((aa_Sub3.anInt5270 ^ 0xffffffff) <= (i_3_ ^ 0xffffffff) && (Class181.anInt2099 ^ 0xffffffff) >= (i_4_ ^ 0xffffffff)) {
            boolean bool;
            if (Class302.anInt3500 > i_1_) {
                i_1_ = Class302.anInt3500;
                bool = false;
            } else if (Class289.anInt3399 < i_1_) {
                i_1_ = Class289.anInt3399;
                bool = false;
            } else
                bool = true;
            boolean bool_5_;
            if (Class302.anInt3500 <= i_2_) {
                if (Class289.anInt3399 >= i_2_)
                    bool_5_ = true;
                else {
                    i_2_ = Class289.anInt3399;
                    bool_5_ = false;
                }
            } else {
                bool_5_ = false;
                i_2_ = Class302.anInt3500;
            }
            if (Class181.anInt2099 > i_3_)
                i_3_ = Class181.anInt2099;
            else
                Class149.method1331(i, -128, i_1_, Class156.anIntArrayArray1867[i_3_++], i_2_);
            if ((i_4_ ^ 0xffffffff) < (aa_Sub3.anInt5270 ^ 0xffffffff))
                i_4_ = aa_Sub3.anInt5270;
            else
                Class149.method1331(i, -114, i_1_, Class156.anIntArrayArray1867[i_4_--], i_2_);
            if (bool && bool_5_) {
                for (int i_6_ = i_3_; i_4_ >= i_6_; i_6_++) {
                    int[] is = Class156.anIntArrayArray1867[i_6_];
                    is[i_1_] = is[i_2_] = i;
                }
            } else if (!bool) {
                if (bool_5_) {
                    for (int i_7_ = i_3_; (i_4_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff); i_7_++)
                        Class156.anIntArrayArray1867[i_7_][i_2_] = i;
                }
            } else {
                for (int i_8_ = i_3_; i_8_ <= i_4_; i_8_++)
                    Class156.anIntArrayArray1867[i_8_][i_1_] = i;
            }
        }
        if (i_0_ <= 116)
            method130((byte) -34);
    }

    public static void method130(byte i) {
        aClass14_86 = null;
        if (i > 72)
            aIncommingOpcode_89 = null;
    }
}
