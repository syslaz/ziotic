/* Class161 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class161 {
    static int[] anIntArray1892 = new int[1];
    static int anInt1893;
    static IncommingOpcode aIncommingOpcode_1894 = new IncommingOpcode(26, 0);
    static Node_Sub15_Sub1 aClass248_Sub15_Sub1_1895;

    public static void method1415(byte i) {
        anIntArray1892 = null;
        if (i < -23) {
            aClass248_Sub15_Sub1_1895 = null;
            aIncommingOpcode_1894 = null;
        }
    }

    abstract long method1416(int i);

    public Class161() {
        /* empty */
    }

    static final boolean method1417(boolean bool, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        anInt1893++;
        if (!Class141.method1288(i_1_, i, i_7_, -12825))
            return false;
        i_7_ = Node_Sub2_Sub4.anIntArray8881[2];
        i_1_ = Node_Sub2_Sub4.anIntArray8881[1];
        i = Node_Sub2_Sub4.anIntArray8881[0];
        if (!Class141.method1288(i_5_, i_0_, i_6_, -12825))
            return false;
        i_6_ = Node_Sub2_Sub4.anIntArray8881[2];
        if (bool != false)
            method1417(false, 75, -56, -31, 27, -38, -1, -78, 93, 19);
        i_0_ = Node_Sub2_Sub4.anIntArray8881[0];
        i_5_ = Node_Sub2_Sub4.anIntArray8881[1];
        if (!Class141.method1288(i_3_, i_2_, i_4_, -12825))
            return false;
        i_4_ = Node_Sub2_Sub4.anIntArray8881[2];
        i_3_ = Node_Sub2_Sub4.anIntArray8881[1];
        i_2_ = Node_Sub2_Sub4.anIntArray8881[0];
        return aa_Sub1.method159(i_6_, i_5_, i, -13221, i_1_, i_3_, i_2_, i_0_, i_7_, i_4_);
    }
}
