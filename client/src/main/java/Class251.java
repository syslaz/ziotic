/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class251 {
    static Class181 aClass181_2829 = new Class181();
    private Class293 aClass293_2830;
    private Node aNode_2831;
    static int anInt2832;
    static int anInt2833;
    static int anInt2834;
    static int anInt2835;
    static IncommingOpcode aIncommingOpcode_2836 = new IncommingOpcode(48, -2);

    final void method2711(int i, Class293 class293) {
        aClass293_2830 = class293;
        if (i == -2)
            anInt2835++;
    }

    static final Class128[] method2712(int i) {
        int i_0_ = -83 % ((-68 - i) / 49);
        anInt2834++;
        return (new Class128[]{Class323.aClass128_3796, Node_Sub8_Sub4.aClass128_8371, Class113.aClass128_1401, Class142.aClass128_1671, Class261.aClass128_2969, Node_Sub14_Sub32.aClass128_9498, Class118.aClass128_1483, Class231.aClass128_2606, Class84_Sub9.aClass128_5503, Class129_Sub2.aClass128_8519, Interactable.aClass128_8323, Class44.aClass128_557, Class301_Sub3.aClass128_8448, Node_Sub8_Sub8.aClass128_8963, Class28.aClass128_4893});
    }

    public Class251() {
        /* empty */
    }

    public static void method2713(byte i) {
        aIncommingOpcode_2836 = null;
        int i_1_ = -108 % ((32 - i) / 35);
        aClass181_2829 = null;
    }

    final Node method2714(boolean bool) {
        anInt2833++;
        if (bool != true)
            aClass293_2830 = null;
        Node node = (((Node) ((Class293) aClass293_2830).aNode_3434).prev);
        if (((Class293) aClass293_2830).aNode_3434 == node) {
            aNode_2831 = null;
            return null;
        }
        aNode_2831 = ((Node) node).prev;
        return node;
    }

    final Node method2715(byte i) {
        if (i > -114)
            method2715((byte) 11);
        anInt2832++;
        Node node = aNode_2831;
        if (node == ((Class293) aClass293_2830).aNode_3434) {
            aNode_2831 = null;
            return null;
        }
        aNode_2831 = ((Node) node).prev;
        return node;
    }

    Class251(Class293 class293) {
        aClass293_2830 = class293;
    }
}
