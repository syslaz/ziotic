/* Class248_Sub8_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub5 extends Node_Sub8 {
    static Class381 aClass381_8928;
    static int anInt8929;
    static int anInt8930 = 0;
    static int anInt8931;
    static int[][] mapXTEAKeys;
    static int anInt8933;
    String aString8934;
    static int anInt8935;
    Class64 aClass64_8936;
    int anInt8937;

    public static void method2049(boolean bool) {
        if (bool != false)
            anInt8930 = 24;
        mapXTEAKeys = null;
        aClass381_8928 = null;
    }

    final boolean method2050(Node_Sub8_Sub11 class248_sub8_sub11, byte i) {
        anInt8933++;
        if (i != 86)
            ((Node_Sub8_Sub5) this).anInt8937 = -3;
        class248_sub8_sub11.method2021((byte) -26);
        boolean bool = true;
        for (Node_Sub8_Sub11 class248_sub8_sub11_0_ = (Node_Sub8_Sub11) ((Node_Sub8_Sub5) this).aClass64_8936.method492(i ^ 0x3d6); class248_sub8_sub11_0_ != null; class248_sub8_sub11_0_ = (Node_Sub8_Sub11) ((Node_Sub8_Sub5) this).aClass64_8936.method490(true)) {
            if (Class299.method3176(((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999, 0, ((Node_Sub8_Sub11) class248_sub8_sub11_0_).anInt8999)) {
                Node_Sub14_Sub12.method2307(class248_sub8_sub11_0_, (byte) -49, class248_sub8_sub11);
                ((Node_Sub8_Sub5) this).anInt8937++;
                if (bool)
                    return false;
                return true;
            }
            bool = false;
        }
        ((Node_Sub8_Sub5) this).aClass64_8936.method491(class248_sub8_sub11, -126);
        ((Node_Sub8_Sub5) this).anInt8937++;
        return bool;
    }

    final int method2051(int i) {
        if (i < 105)
            method2050(null, (byte) 58);
        anInt8935++;
        if ((((Node_Sub8) ((Class64) (((Node_Sub8_Sub5) this).aClass64_8936)).aClass248_Sub8_856).aClass248_Sub8_6871) != (((Class64) ((Node_Sub8_Sub5) this).aClass64_8936).aClass248_Sub8_856))
            return (((Node_Sub8_Sub11) (Node_Sub8_Sub11) ((Node_Sub8) (((Class64) ((Node_Sub8_Sub5) this).aClass64_8936).aClass248_Sub8_856)).aClass248_Sub8_6871).anInt8999);
        return -1;
    }

    Node_Sub8_Sub5(String string) {
        ((Node_Sub8_Sub5) this).aString8934 = string;
        ((Node_Sub8_Sub5) this).aClass64_8936 = new Class64();
    }

    final boolean method2052(Node_Sub8_Sub11 class248_sub8_sub11, int i) {
        anInt8931++;
        if (i != 0)
            aClass381_8928 = null;
        int i_1_ = method2051(i + 123);
        class248_sub8_sub11.method2021((byte) -26);
        ((Node_Sub8_Sub5) this).anInt8937--;
        if ((((Node_Sub8_Sub5) this).anInt8937 ^ 0xffffffff) != -1) {
            if (i_1_ == method2051(i ^ 0x7a))
                return false;
            return true;
        }
        this.remove(true);
        this.method2021((byte) -26);
        Class113.anInt1402--;
        Class304.aClass278_3529.method2867((byte) 0, ((Node_Sub8_Sub11) class248_sub8_sub11).aLong8994, this);
        return false;
    }

    static final void method2053(RSInterface2 class354, int i) {
        if (i == -1) {
            anInt8929++;
            RSInterface2 class354_2_ = Class141.method1283(false, class354);
            int i_3_;
            int i_4_;
            if (class354_2_ != null) {
                i_3_ = ((RSInterface2) class354_2_).anInt4332;
                i_4_ = ((RSInterface2) class354_2_).anInt4223;
            } else {
                i_3_ = Class146.anInt1724;
                i_4_ = Class282_Sub20.anInt7800;
            }
            Node_Sub20.method2523(class354, (byte) 13, false, i_3_, i_4_);
            Class340_Sub5.method3454(class354, i_3_, i_4_, -49);
        }
    }
}
