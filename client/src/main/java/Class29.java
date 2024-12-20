/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class29 {
    long aLong368;
    static int anInt369;
    private ha_Sub2 aHa_Sub2_370;
    static IncommingOpcode aIncommingOpcode_371 = new IncommingOpcode(11, 7);
    static OutgoingOpcode aOutgoingOpcode_372 = new OutgoingOpcode(68, 11);

    protected final void finalize() throws Throwable {
        aHa_Sub2_370.method846(((Class29) this).aLong368, true);
        anInt369++;
        super.finalize();
    }

    public static void method260(int i) {
        aIncommingOpcode_371 = null;
        aOutgoingOpcode_372 = null;
        if (i != 68)
            aOutgoingOpcode_372 = null;
    }

    Class29(ha_Sub2 var_ha_Sub2, long l, int i) {
        ((Class29) this).aLong368 = l;
        aHa_Sub2_370 = var_ha_Sub2;
    }
}
