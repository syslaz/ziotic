/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class16 {
    static int anInt284;
    static int anInt285;
    static int anInt286;

    static final int method220(int i) {
        anInt285++;
        if (i != -101)
            return -42;
        return Class282_Sub11.anInt7706;
    }

    static final synchronized void method221(int i, byte[] is) {
        anInt284++;
        if (i != -20465)
            method220(-94);
        if ((is.length ^ 0xffffffff) == -101 && (r_Sub2.anInt10276 ^ 0xffffffff) > -1001)
            Class136_Sub2.aByteArrayArray8389[r_Sub2.anInt10276++] = is;
        else if (is.length == 5000 && Class182.anInt2100 < 250)
            ObjectDefinition.aByteArrayArray3083[Class182.anInt2100++] = is;
        else if (is.length == 30000 && Class6.anInt157 < 50)
            Class290.aByteArrayArray3420[Class6.anInt157++] = is;
        else if (Class50.aByteArrayArrayArray663 != null) {
            for (int i_0_ = 0; ((Node_Sub35.anIntArray7250.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
                if (((is.length ^ 0xffffffff) == (Node_Sub35.anIntArray7250[i_0_] ^ 0xffffffff)) && (Class162.anIntArray1906[i_0_] < Class50.aByteArrayArrayArray663[i_0_].length)) {
                    Class50.aByteArrayArrayArray663[i_0_][Class162.anIntArray1906[i_0_]++] = is;
                    break;
                }
            }
        }
    }

    static final synchronized byte[] method222(int i, int i_1_) {
        if (i_1_ != -1)
            method221(47, null);
        anInt286++;
        if (i == 100 && (r_Sub2.anInt10276 ^ 0xffffffff) < -1) {
            byte[] is = Class136_Sub2.aByteArrayArray8389[--r_Sub2.anInt10276];
            Class136_Sub2.aByteArrayArray8389[r_Sub2.anInt10276] = null;
            return is;
        }
        if ((i ^ 0xffffffff) == -5001 && Class182.anInt2100 > 0) {
            byte[] is = ObjectDefinition.aByteArrayArray3083[--Class182.anInt2100];
            ObjectDefinition.aByteArrayArray3083[Class182.anInt2100] = null;
            return is;
        }
        if ((i ^ 0xffffffff) == -30001 && (Class6.anInt157 ^ 0xffffffff) < -1) {
            byte[] is = Class290.aByteArrayArray3420[--Class6.anInt157];
            Class290.aByteArrayArray3420[Class6.anInt157] = null;
            return is;
        }
        if (Class50.aByteArrayArrayArray663 != null) {
            for (int i_2_ = 0; i_2_ < Node_Sub35.anIntArray7250.length; i_2_++) {
                if (((Node_Sub35.anIntArray7250[i_2_] ^ 0xffffffff) == (i ^ 0xffffffff)) && Class162.anIntArray1906[i_2_] > 0) {
                    byte[] is = (Class50.aByteArrayArrayArray663[i_2_][--Class162.anIntArray1906[i_2_]]);
                    Class50.aByteArrayArrayArray663[i_2_][Class162.anIntArray1906[i_2_]] = null;
                    return is;
                }
            }
        }
        return new byte[i];
    }
}
