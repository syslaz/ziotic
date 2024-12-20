/* j - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class j extends Class129 implements Interface8 {
    long nativeid;

    private final native void b(long l, float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, int i, int i_5_, int i_6_, int i_7_);

    final void method1167(float f, float f_8_, float f_9_, float f_10_, float f_11_, float f_12_, int i, int i_13_, int i_14_, int i_15_) {
        b(((j) this).nativeid, f, f_8_, f_9_, f_10_, f_11_, f_12_, i, i_13_, i_14_, i_15_);
    }

    final void method1183(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
        RA(((j) this).nativeid, i, i_16_, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_);
    }

    private final native void A(long l, int i, int i_23_, int i_24_, int i_25_);

    private final native int M(long l);

    final void method1174(float f, float f_26_, float f_27_, float f_28_, float f_29_, float f_30_, int i, aa var_aa, int i_31_, int i_32_) {
        UA(((j) this).nativeid, f, f_26_, f_27_, f_28_, f_29_, f_30_, i, ((na) (na) var_aa).nativeid, i_31_, i_32_);
    }

    final int method1176() {
        return I(((j) this).nativeid);
    }

    private final native int JA(long l);

    final void method1177(int i, int i_33_, int i_34_) {
        N(((j) this).nativeid, i, i_33_, i_34_);
    }

    private final native void R(long l, boolean bool);

    private final native void RA(long l, int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_);

    public final void w(boolean bool) {
        R(((j) this).nativeid, bool);
    }

    private final native void ua(oa var_oa, int[] is, int i, int i_42_, int i_43_, int i_44_, boolean bool);

    private final native void EA(oa var_oa, int i, int i_45_);

    private final native void YA(long l, int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_);

    private final native void CA(long l, int[] is);

    final void method1165(int i, int i_51_, int i_52_, int i_53_) {
        A(((j) this).nativeid, i, i_51_, i_52_, i_53_);
    }

    final void method1178(int i, int i_54_, int i_55_, int i_56_, int i_57_) {
        W(((j) this).nativeid, i, i_54_, i_55_, i_56_, i_57_);
    }

    private final native int I(long l);

    private final native void P(long l, int i, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_);

    final void method1164(int i, int i_64_, aa var_aa, int i_65_, int i_66_) {
        V(((j) this).nativeid, i, i_64_, ((na) (na) var_aa).nativeid, i_65_, i_66_);
    }

    final void method1180(int i, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_) {
        P(((j) this).nativeid, i, i_67_, i_68_, i_69_, i_70_, i_71_, i_72_);
    }

    final void method1179(int[] is) {
        CA(((j) this).nativeid, is);
    }

    private final native void UA(long l, float f, float f_73_, float f_74_, float f_75_, float f_76_, float f_77_, int i, long l_78_, int i_79_, int i_80_);

    private final native void W(long l, int i, int i_81_, int i_82_, int i_83_, int i_84_);

    private final native void V(long l, int i, int i_85_, long l_86_, int i_87_, int i_88_);

    private final native void h(oa var_oa, int i, int i_89_, int i_90_, int i_91_, boolean bool);

    private final native void N(long l, int i, int i_92_, int i_93_);

    final int method1175() {
        return M(((j) this).nativeid);
    }

    private final native int wa(long l);

    j(oa var_oa, int i, int i_94_) {
        EA(var_oa, i, i_94_);
    }

    j(oa var_oa, int[] is, int i, int i_95_, int i_96_, int i_97_, boolean bool) {
        ua(var_oa, is, i, i_95_, i_96_, i_97_, bool);
    }

    final int method1181() {
        return JA(((j) this).nativeid);
    }

    private final native void ma(oa var_oa, int[] is, byte[] is_98_, byte[] is_99_, int i, int i_100_, int i_101_, int i_102_);

    final int method1169() {
        return wa(((j) this).nativeid);
    }

    protected final void finalize() {
        if (((j) this).nativeid != 0L)
            Class123.method1136(this, (byte) -87);
    }

    j(oa var_oa, int[] is, byte[] is_103_, byte[] is_104_, int i, int i_105_, int i_106_, int i_107_) {
        ma(var_oa, is, is_103_, is_104_, i, i_105_, i_106_, i_107_);
    }

    j(oa var_oa, int i, int i_108_, int i_109_, int i_110_, boolean bool) {
        h(var_oa, i, i_108_, i_109_, i_110_, bool);
    }

    final void method1184(int i, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_) {
        YA(((j) this).nativeid, i, i_111_, i_112_, i_113_, i_114_, i_115_);
    }
}
