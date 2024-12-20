/* Class346_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class346_Sub5_Sub2 extends Class346_Sub5 {
    static IncommingOpcode aIncommingOpcode_9887 = new IncommingOpcode(88, 4);
    byte aByte9888 = 5;
    static ISAACCypher aISAACCypher_9889;
    static int anInt9890;
    int anInt9891;
    static int anInt9892;
    static int anInt9893;
    int anInt9894;
    int anInt9895;
    int anInt9896;
    int anInt9897;
    boolean aBoolean9898;
    int anInt9899;
    static IncommingOpcode aIncommingOpcode_9900 = new IncommingOpcode(14, 6);

    public static void method3551(int i) {
        aISAACCypher_9889 = null;
        aIncommingOpcode_9900 = null;
        if (i != -4400)
            aISAACCypher_9889 = null;
        aIncommingOpcode_9887 = null;
    }

    static final boolean method3552(int i, byte i_0_, int i_1_) {
        anInt9890++;
        if (i_0_ < 67)
            method3551(105);
        if ((0x400 & i_1_ ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    static final boolean method3553(String string, byte i) {
        anInt9892++;
        if (i >= -123)
            return false;
        return IOException_Sub1.aHashtable84.containsKey(string);
    }

    public Class346_Sub5_Sub2() {
        /* empty */
    }
}
