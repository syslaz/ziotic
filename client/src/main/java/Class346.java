/* Class346 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class346 {
    static boolean aBoolean4120;
    Class346 aClass346_4121;
    static int[] anIntArray4122 = new int[8];
    static int anInt4123;
    static int anInt4124;
    Class346 aClass346_4125;
    static boolean aBoolean4126 = false;

    static final void method3537(Node node, byte i, Node node_0_) {
        if (i < 41)
            aBoolean4120 = false;
        anInt4124++;
        if (((Node) node_0_).next != null)
            node_0_.remove(true);
        ((Node) node_0_).next = ((Node) node).next;
        ((Node) node_0_).prev = node;
        ((Node) ((Node) node_0_).next).prev = node_0_;
        ((Node) ((Node) node_0_).prev).next = node_0_;
    }

    final void method3538(int i) {
        if (i < -117) {
            anInt4123++;
            if (((Class346) this).aClass346_4125 != null) {
                ((Class346) ((Class346) this).aClass346_4125).aClass346_4121 = ((Class346) this).aClass346_4121;
                ((Class346) ((Class346) this).aClass346_4121).aClass346_4125 = ((Class346) this).aClass346_4125;
                ((Class346) this).aClass346_4121 = null;
                ((Class346) this).aClass346_4125 = null;
            }
        }
    }

    public static void method3539(int i) {
        anIntArray4122 = null;
        if (i != -7865)
            aBoolean4120 = false;
    }

    public Class346() {
        /* empty */
    }

    static {
        aBoolean4120 = true;
    }
}
