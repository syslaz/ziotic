/* Class248_Sub8_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub11 extends Node_Sub8 {
    int anInt8987;
    String aString8988;
    static int anInt8989 = 0;
    static long[] aLongArray8990;
    boolean aBoolean8991;
    static boolean aBoolean8992 = false;
    static int[] anIntArray8993;
    long aLong8994;
    boolean aBoolean8995;
    String aString8996;
    static int anInt8997;
    int anInt8998;
    int anInt8999;
    static int[] anIntArray9000 = new int[5];
    String aString9001;
    static int anInt9002;
    int anInt9003;
    int anInt9004;
    boolean aBoolean9005;
    long aLong9006;

    static final void method2085(int i, int i_0_, float[] fs, int i_1_, float f, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, float[] fs_7_) {
        i_0_ -= i_2_;
        anInt8997++;
        i_4_ -= i_5_;
        i_3_ -= i_6_;
        float f_8_ = (fs_7_[1] * (float) i_0_ + (float) i_4_ * fs_7_[0] + (float) i_3_ * fs_7_[2]);
        float f_9_ = ((float) i_3_ * fs_7_[5] + (fs_7_[4] * (float) i_0_ + (float) i_4_ * fs_7_[3]));
        float f_10_ = (fs_7_[7] * (float) i_0_ + (float) i_4_ * fs_7_[6] + fs_7_[i_1_] * (float) i_3_);
        float f_11_ = (float) Math.sqrt((double) (f_9_ * f_9_ + f_8_ * f_8_ + f_10_ * f_10_));
        float f_12_ = 0.5F + ((float) Math.atan2((double) f_8_, (double) f_10_) / 6.2831855F);
        float f_13_ = ((float) Math.asin((double) (f_9_ / f_11_)) / 3.1415927F + 0.5F + f);
        if (i != 1) {
            if (i != 2) {
                if ((i ^ 0xffffffff) == -4) {
                    float f_14_ = f_12_;
                    f_12_ = f_13_;
                    f_13_ = -f_14_;
                }
            } else {
                f_13_ = -f_13_;
                f_12_ = -f_12_;
            }
        } else {
            float f_15_ = f_12_;
            f_12_ = -f_13_;
            f_13_ = f_15_;
        }
        fs[1] = f_13_;
        fs[0] = f_12_;
    }

    public static void method2086(int i) {
        anIntArray8993 = null;
        aLongArray8990 = null;
        if (i != -16334)
            method2085(-7, -112, null, 14, 0.023782212F, -114, 115, 59, -4, 32, null);
        anIntArray9000 = null;
    }

    static final String method2087(int i, int i_16_, long l) {
        Class99.method712(l, -8474);
        anInt9002++;
        int i_17_ = Node_Sub8_Sub9.aCalendar8968.get(5);
        int i_18_ = 1 + Node_Sub8_Sub9.aCalendar8968.get(2);
        if (i >= -98)
            method2085(78, -12, null, -58, 0.71233284F, -117, -73, -87, 1, 61, null);
        int i_19_ = Node_Sub8_Sub9.aCalendar8968.get(1);
        int i_20_ = Node_Sub8_Sub9.aCalendar8968.get(11);
        int i_21_ = Node_Sub8_Sub9.aCalendar8968.get(12);
        return (Integer.toString(i_17_ / 10) + i_17_ % 10 + "/" + i_18_ / 10 + i_18_ % 10 + "/" + i_19_ % 100 / 10 + i_19_ % 10 + " " + i_20_ / 10 + i_20_ % 10 + ":" + i_21_ / 10 + i_21_ % 10);
    }

    Node_Sub8_Sub11(String string, String string_22_, int i, int i_23_, int i_24_, long l, int i_25_, int i_26_, boolean bool, boolean bool_27_, long l_28_, boolean bool_29_) {
        ((Node_Sub8_Sub11) this).anInt9003 = i_24_;
        ((Node_Sub8_Sub11) this).aBoolean8995 = bool_27_;
        ((Node_Sub8_Sub11) this).aLong9006 = l;
        ((Node_Sub8_Sub11) this).aLong8994 = l_28_;
        ((Node_Sub8_Sub11) this).aBoolean8991 = bool_29_;
        ((Node_Sub8_Sub11) this).aString8996 = string;
        ((Node_Sub8_Sub11) this).aBoolean9005 = bool;
        ((Node_Sub8_Sub11) this).aString9001 = string_22_;
        ((Node_Sub8_Sub11) this).anInt8999 = i_23_;
        ((Node_Sub8_Sub11) this).anInt8987 = i_26_;
        ((Node_Sub8_Sub11) this).anInt8998 = i_25_;
        ((Node_Sub8_Sub11) this).anInt9004 = i;
    }

    static {
        anIntArray8993 = new int[1];
        aLongArray8990 = new long[32];
    }
}
