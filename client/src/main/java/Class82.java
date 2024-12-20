/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class82 {
    static int anInt1019;
    static int anInt1020;
    static int anInt1021;
    private Class65 aClass65_1022;
    private Node aNode_1023;
    static IncommingOpcode aIncommingOpcode_1024 = new IncommingOpcode(35, -2);
    static int anInt1025;
    private int anInt1026 = 0;
    static int anInt1027;
    static double aDouble1028;
    static int anInt1029;
    static int anInt1030;

    final Node method590(int i) {
        anInt1021++;
        if ((anInt1026 ^ 0xffffffff) < -1 && (((Class65) aClass65_1022).aNodeArray886[anInt1026 + -1] != aNode_1023)) {
            Node node = aNode_1023;
            aNode_1023 = ((Node) node).prev;
            return node;
        }
        if (i != 20322)
            anInt1029 = 21;
        while ((((Class65) aClass65_1022).anInt895 ^ 0xffffffff) < (anInt1026 ^ 0xffffffff)) {
            Node node = (((Node) (((Class65) aClass65_1022).aNodeArray886[anInt1026++])).prev);
            if (node != (((Class65) aClass65_1022).aNodeArray886[-1 + anInt1026])) {
                aNode_1023 = ((Node) node).prev;
                return node;
            }
        }
        return null;
    }

    final Node method591(byte i) {
        anInt1020++;
        int i_0_ = 127 / ((20 - i) / 38);
        anInt1026 = 0;
        return method590(20322);
    }

    static final boolean method592(int i, int i_1_) {
        if (i_1_ > -17)
            anInt1027 = -44;
        anInt1019++;
        if ((i ^ 0xffffffff) != -22 && i != 46 && (i ^ 0xffffffff) != -10 && i != 44 && (i ^ 0xffffffff) != -61 && i != 22 && (i ^ 0xffffffff) != -26)
            return false;
        return true;
    }

    public static void method593(int i) {
        if (i != -1)
            method592(-74, -7);
        aIncommingOpcode_1024 = null;
    }

    static final byte[] method594(int i, int i_2_, byte[] is, int i_3_) {
        if (i_2_ != 20569)
            return null;
        anInt1025++;
        byte[] is_4_ = new byte[i];
        Class159.method1402(is, i_3_, is_4_, 0, i);
        return is_4_;
    }

    public Class82() {
        /* empty */
    }

    Class82(Class65 class65) {
        aClass65_1022 = class65;
    }
}
