/* wa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wa implements Interface14 {
    private long aLong5073 = 0L;
    xa aXa5074;
    j aJ5075;

    public final void method39(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
        X(aLong5073, ((j) ((wa) this).aJ5075).nativeid, ((xa) ((wa) this).aXa5074).nativeid, i, i_0_, i_1_, i_2_, i_3_, i_4_, bool, bool_5_);
    }

    private final native void Z(long l, long l_6_, long l_7_, int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, boolean bool_13_);

    private final native void X(long l, long l_14_, long l_15_, int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, boolean bool, boolean bool_21_);

    public final void method38(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, boolean bool, boolean bool_27_) {
        Z(aLong5073, ((j) ((wa) this).aJ5075).nativeid, ((xa) ((wa) this).aXa5074).nativeid, i, i_22_, i_23_, i_24_, i_25_, i_26_, bool, bool_27_);
    }

    wa(oa var_oa, j var_j, xa var_xa) {
        aLong5073 = ((oa) var_oa).nativeid;
        ((wa) this).aJ5075 = var_j;
        ((wa) this).aXa5074 = var_xa;
    }
}
