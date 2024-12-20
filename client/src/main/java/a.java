/* a - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class a implements Interface8 {
    private i anI4825;
    private oa anOa4826;
    private i anI4827;
    private i anI4828;
    private i anI4829;
    private i anI4830;
    long nativeid;
    private i anI4831;
    private i anI4832;
    private i anI4833;
    Runnable aRunnable4834;
    private i anI4835;
    private i anI4836;

    private final native void r(long l, long l_0_, long l_1_, int i, int i_2_, int i_3_, boolean bool);

    protected final void finalize() {
        if (((a) this).nativeid != 0L)
            Class123.method1136(this, (byte) 83);
    }

    final void method133() {
        ((a) this).aRunnable4834 = null;
        method145();
    }

    final void method134(Class162 class162, int[] is, Viewport viewport) {
        e(((a) this).nativeid, ((i) (i) class162).nativeid, is, ((ja) (ja) viewport).nativeid);
    }

    final void method135(Class162 class162, Viewport viewport, int[] is, int i) {
        UA(((a) this).nativeid, ((i) (i) class162).nativeid, ((ja) (ja) viewport).nativeid, is, i);
    }

    final void method136(s var_s, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, boolean[][] bools) {
        ta(((a) this).nativeid, ((t) (t) var_s).nativeid, i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, bools);
    }

    final Class162 method137(i var_i, byte i, int i_10_, boolean bool) {
        i var_i_11_;
        i var_i_12_;
        if (i == 1) {
            var_i_11_ = anI4836;
            var_i_12_ = anI4831;
        } else if (i == 2) {
            var_i_11_ = anI4830;
            var_i_12_ = anI4835;
        } else if (i == 3) {
            var_i_11_ = anI4832;
            var_i_12_ = anI4829;
        } else if (i == 4) {
            var_i_11_ = anI4833;
            var_i_12_ = anI4827;
        } else if (i == 5) {
            var_i_11_ = anI4828;
            var_i_12_ = anI4825;
        } else
            var_i_12_ = var_i_11_ = new i(anOa4826);
        var_i.ZA(var_i_12_, var_i_11_, i_10_, i != 0, bool);
        ((i) var_i_12_).aClass40Array4840 = ((i) var_i).aClass40Array4840;
        ((i) var_i_12_).aClass124Array4839 = ((i) var_i).aClass124Array4839;
        return var_i_12_;
    }

    private final native void UA(long l, long l_13_, long l_14_, int[] is, int i);

    private final native void H(long l, long l_15_, int i, int i_16_);

    private final native void E(long l, boolean bool);

    private final void method138() {
        M(((a) this).nativeid);
    }

    private final native void e(long l, long l_17_, int[] is, long l_18_);

    private final native void ta(long l, long l_19_, int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, boolean[][] bools);

    final void method139(ha var_ha, int[] is, int[] is_26_, int[] is_27_, short[] is_28_, int i) {
        O(((a) this).nativeid, var_ha, is, is_26_, is_27_, is_28_, i);
    }

    final void method140(ha var_ha, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
        na(((a) this).nativeid, var_ha, i, i_29_, i_30_, i_31_, i_32_, i_33_, i_34_);
    }

    private final native void na(long l, ha var_ha, int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_);

    final void method141() {
        ((a) this).aRunnable4834 = Thread.currentThread();
        method138();
    }

    final void method142(Class162 class162, Class162 class162_41_, int i, int i_42_, int i_43_, boolean bool) {
        r(((a) this).nativeid, ((i) (i) class162).nativeid, ((i) (i) class162_41_).nativeid, i, i_42_, i_43_, bool);
    }

    private final native void HA(long l, ha var_ha, int i, int i_44_);

    private final native void O(long l, ha var_ha, int[] is, int[] is_45_, int[] is_46_, short[] is_47_, int i);

    final void method143(s var_s, int i, int i_48_) {
        H(((a) this).nativeid, ((t) (t) var_s).nativeid, i, i_48_);
    }

    final boolean method144(Class162 class162, int i, int i_49_, Viewport viewport, boolean bool, int i_50_) {
        return n(((a) this).nativeid, ((i) (i) class162).nativeid, i, i_49_, ((ja) (ja) viewport).nativeid, bool, i_50_);
    }

    private final native boolean n(long l, long l_51_, int i, int i_52_, long l_53_, boolean bool, int i_54_);

    private final void method145() {
        W(((a) this).nativeid);
    }

    private final native void f(long l, long l_55_, long l_56_, int[] is, int i, int i_57_);

    private final native void W(long l);

    final void method146(s var_s, int i, int i_58_, int i_59_) {
        Z(((a) this).nativeid, ((t) (t) var_s).nativeid, i, i_58_, i_59_);
    }

    private final native void M(long l);

    final void method147(Class162 class162, Viewport viewport, int[] is, int i, int i_60_) {
        f(((a) this).nativeid, ((i) (i) class162).nativeid, ((ja) (ja) viewport).nativeid, is, i, i_60_);
    }

    private final native void Z(long l, long l_61_, int i, int i_62_, int i_63_);

    public final void w(boolean bool) {
        E(((a) this).nativeid, bool);
    }

    private final native boolean R(long l, long l_64_, int i, int i_65_, long l_66_, boolean bool);

    final boolean method148(Class162 class162, int i, int i_67_, Viewport viewport, boolean bool) {
        return R(((a) this).nativeid, ((i) (i) class162).nativeid, i, i_67_, ((ja) (ja) viewport).nativeid, bool);
    }

    a(oa var_oa, int i, int i_68_) {
        anOa4826 = var_oa;
        anI4831 = new i(anOa4826);
        anI4835 = new i(anOa4826);
        anI4829 = new i(anOa4826);
        anI4827 = new i(anOa4826);
        anI4825 = new i(anOa4826);
        anI4836 = new i(anOa4826);
        anI4830 = new i(anOa4826);
        anI4832 = new i(anOa4826);
        anI4833 = new i(anOa4826);
        anI4828 = new i(anOa4826);
        HA(((a) this).nativeid, var_oa, i, i_68_);
    }
}
