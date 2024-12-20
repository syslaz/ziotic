/* Class248_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Node_Sub14 extends Node {
    static int anInt6974;
    static int anInt6975;
    static int anInt6976;
    static int anInt6977;
    static int anInt6978;
    static int anInt6979;
    static int anInt6980;
    Class367 aClass367_6981;
    static int anInt6982;
    static int anInt6983;
    Node_Sub14[] aClass248_Sub14Array6984;
    static short[] aShortArray6985 = new short[256];
    static int anInt6986;
    static int[] anIntArray6987;
    boolean aBoolean6988;
    int anInt6989;
    static int anInt6990 = 0;
    static int anInt6991;
    static int anInt6992;
    Class227 aClass227_6993;

    void method2263(int i) {
        if (i != 8351)
            method2264((byte) -4, -54);
        anInt6983++;
    }

    int[] method2264(byte i, int i_0_) {
        anInt6979++;
        if (i != -40)
            method2273(true);
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    final int[] method2265(byte i, int i_1_, int i_2_) {
        if (i != 64)
            method2272(121);
        anInt6975++;
        if (((Node_Sub14) ((Node_Sub14) this).aClass248_Sub14Array6984[i_2_]).aBoolean6988)
            return ((Node_Sub14) this).aClass248_Sub14Array6984[i_2_].method2264((byte) -40, i_1_);
        return (((Node_Sub14) this).aClass248_Sub14Array6984[i_2_].method2271(i_1_, true)[0]);
    }

    public static void method2266(int i) {
        aShortArray6985 = null;
        if (i != -11148)
            method2266(-62);
        anIntArray6987 = null;
    }

    final int[][] method2267(int i, int i_3_, int i_4_) {
        anInt6992++;
        if (i_4_ != 65535)
            ((Node_Sub14) this).aClass367_6981 = null;
        if (!((Node_Sub14) (((Node_Sub14) this).aClass248_Sub14Array6984[i_3_])).aBoolean6988)
            return ((Node_Sub14) this).aClass248_Sub14Array6984[i_3_].method2271(i, true);
        int[] is = ((Node_Sub14) this).aClass248_Sub14Array6984[i_3_].method2264((byte) -40, i);
        int[][] is_5_ = new int[3][];
        is_5_[2] = is;
        is_5_[1] = is;
        is_5_[0] = is;
        return is_5_;
    }

    void method2268(int i, byte i_6_, int i_7_) {
        anInt6978++;
        int i_8_ = ((((Node_Sub14) this).anInt6989 ^ 0xffffffff) != -256 ? ((Node_Sub14) this).anInt6989 : i_7_);
        if (((Node_Sub14) this).aBoolean6988)
            ((Node_Sub14) this).aClass227_6993 = new Class227(i_8_, i_7_, i);
        else
            ((Node_Sub14) this).aClass367_6981 = new Class367(i_8_, i_7_, i);
        int i_9_ = 115 / ((47 - i_6_) / 38);
    }

    void method2269(ByteStream class248_sub9, byte i, int i_10_) {
        if (i == -61)
            anInt6976++;
    }

    static final boolean method2270(int i, int i_11_, byte i_12_) {
        anInt6980++;
        if (i_12_ != 8)
            aShortArray6985 = null;
        return ((Class346_Sub7_Sub5_Sub2.method3698(i, i_11_, 33) | Class315.method3281(i, i_11_, i_12_ ^ 0xefc) | Class193.method1656(i_11_, i, 106)) & aa_Sub2.method162(102, i_11_, i));
    }

    int[][] method2271(int i, boolean bool) {
        anInt6991++;
        if (bool != true)
            aShortArray6985 = null;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    int method2272(int i) {
        anInt6974++;
        if (i <= 85)
            return 97;
        return -1;
    }

    void method2273(boolean bool) {
        anInt6977++;
        if (bool != true)
            method2267(-76, -69, -123);
        if (!((Node_Sub14) this).aBoolean6988) {
            ((Node_Sub14) this).aClass367_6981.method3833(-6948);
            ((Node_Sub14) this).aClass367_6981 = null;
        } else {
            ((Node_Sub14) this).aClass227_6993.method1820((byte) 125);
            ((Node_Sub14) this).aClass227_6993 = null;
        }
    }

    Node_Sub14(int i, boolean bool) {
        ((Node_Sub14) this).aClass248_Sub14Array6984 = new Node_Sub14[i];
        ((Node_Sub14) this).aBoolean6988 = bool;
    }

    int method2274(int i) {
        anInt6986++;
        if (i != -1)
            anInt6990 = -58;
        return -1;
    }

    static {
        anIntArray6987 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
    }
}
