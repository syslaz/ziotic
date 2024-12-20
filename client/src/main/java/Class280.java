/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class280 {
    static Class278 aClass278_3258 = new Class278(4);
    static int anInt3259;
    static int anInt3260;
    static Node_Sub15_Sub1 aClass248_Sub15_Sub1_3261;

    public final String toString() {
        anInt3260++;
        throw new IllegalStateException();
    }

    public Class280() {
        /* empty */
    }

    public static void method2907(int i) {
        aClass278_3258 = null;
        aClass248_Sub15_Sub1_3261 = null;
        if (i < 20)
            aClass248_Sub15_Sub1_3261 = null;
    }

    static final long method2908(Interface16 interface16, int i, int i_0_, int i_1_) {
        anInt3259++;
        long l = 4194304L;
        if (i_0_ != 778239700)
            method2907(22);
        long l_2_ = -9223372036854775808L;
        ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -43, interface16.method40((byte) 109));
        long l_3_ = (long) (0x40000000 | (interface16.method46((byte) -112) << -418874674 | (i_1_ | i << 1590105383) | interface16.method43((byte) -111) << 778239700));
        if ((((ObjectDefinition) class266).anInt3105 ^ 0xffffffff) == -1)
            l_3_ |= l_2_;
        if ((((ObjectDefinition) class266).anInt3032 ^ 0xffffffff) == -2)
            l_3_ |= l;
        l_3_ |= (long) interface16.method40((byte) 96) << 664616736;
        return l_3_;
    }
}
