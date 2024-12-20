/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class179 {
    private Node_Sub8 aClass248_Sub8_2082;
    private int anInt2083;
    static volatile int anInt2084 = -1;
    static int anInt2085;
    private Node_Sub8[] aClass248_Sub8Array2086;
    static int anInt2087;
    static int anInt2088;
    private long aLong2089;
    static int anInt2090;

    final Node_Sub8 method1595(int i) {
        anInt2085++;
        if (aClass248_Sub8_2082 == null)
            return null;
        for (Node_Sub8 class248_sub8 = aClass248_Sub8Array2086[(int) ((long) (anInt2083 - 1) & aLong2089)]; aClass248_Sub8_2082 != class248_sub8; aClass248_Sub8_2082 = ((Node_Sub8) aClass248_Sub8_2082).aClass248_Sub8_6871) {
            if ((((Node_Sub8) aClass248_Sub8_2082).aLong6870 ^ 0xffffffffffffffffL) == (aLong2089 ^ 0xffffffffffffffffL)) {
                Node_Sub8 class248_sub8_0_ = aClass248_Sub8_2082;
                aClass248_Sub8_2082 = (((Node_Sub8) aClass248_Sub8_2082).aClass248_Sub8_6871);
                return class248_sub8_0_;
            }
        }
        aClass248_Sub8_2082 = null;
        if (i != 6594)
            aClass248_Sub8_2082 = null;
        return null;
    }

    final void method1596(Node_Sub8 class248_sub8, long l, boolean bool) {
        if (((Node_Sub8) class248_sub8).aClass248_Sub8_6867 != null)
            class248_sub8.method2021((byte) -26);
        anInt2088++;
        Node_Sub8 class248_sub8_1_ = aClass248_Sub8Array2086[(int) ((long) (anInt2083 + -1) & l)];
        ((Node_Sub8) class248_sub8).aClass248_Sub8_6867 = ((Node_Sub8) class248_sub8_1_).aClass248_Sub8_6867;
        ((Node_Sub8) class248_sub8).aClass248_Sub8_6871 = class248_sub8_1_;
        ((Node_Sub8) ((Node_Sub8) class248_sub8).aClass248_Sub8_6867).aClass248_Sub8_6871 = class248_sub8;
        ((Node_Sub8) class248_sub8).aLong6870 = l;
        ((Node_Sub8) ((Node_Sub8) class248_sub8).aClass248_Sub8_6871).aClass248_Sub8_6867 = class248_sub8;
        if (bool != false)
            anInt2084 = -91;
    }

    static final void method1597(byte i) {
        if (i <= -127) {
            Class241.aClass278_2688.method2872((byte) -78);
            anInt2087++;
        }
    }

    final Node_Sub8 method1598(long l, int i) {
        aLong2089 = l;
        if (i != 23574)
            return null;
        anInt2090++;
        Node_Sub8 class248_sub8 = aClass248_Sub8Array2086[(int) (l & (long) (anInt2083 - 1))];
        for (aClass248_Sub8_2082 = ((Node_Sub8) class248_sub8).aClass248_Sub8_6871; class248_sub8 != aClass248_Sub8_2082; aClass248_Sub8_2082 = ((Node_Sub8) aClass248_Sub8_2082).aClass248_Sub8_6871) {
            if (((Node_Sub8) aClass248_Sub8_2082).aLong6870 == l) {
                Node_Sub8 class248_sub8_2_ = aClass248_Sub8_2082;
                aClass248_Sub8_2082 = (((Node_Sub8) aClass248_Sub8_2082).aClass248_Sub8_6871);
                return class248_sub8_2_;
            }
        }
        aClass248_Sub8_2082 = null;
        return null;
    }

    Class179(int i) {
        aClass248_Sub8Array2086 = new Node_Sub8[i];
        anInt2083 = i;
        for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i ^ 0xffffffff); i_3_++) {
            Node_Sub8 class248_sub8 = aClass248_Sub8Array2086[i_3_] = new Node_Sub8();
            ((Node_Sub8) class248_sub8).aClass248_Sub8_6871 = class248_sub8;
            ((Node_Sub8) class248_sub8).aClass248_Sub8_6867 = class248_sub8;
        }
    }
}
