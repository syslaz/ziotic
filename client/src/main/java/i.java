/* i - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class i extends Class162 implements Interface8 {
    private oa anOa4837;
    private ya aYa4838;
    Class124[] aClass124Array4839;
    long nativeid;
    Class40[] aClass40Array4840;

    final native void LA(int i);

    final native void FA(int i);

    final native int ma();

    final void method1428(Class162 class162, int i, int i_0_, int i_1_, boolean bool) {
        anOa4837.C().method142(this, class162, i, i_0_, i_1_, bool);
    }

    private final native void J(long l, int i, boolean bool);

    final void method1441(Viewport viewport, Class346_Sub9 class346_sub9, int i, int i_2_) {
        if (class346_sub9 == null)
            anOa4837.C().method147(this, viewport, null, i, i_2_);
        else {
            oa.anIntArray4859[5] = 0;
            anOa4837.C().method147(this, viewport, oa.anIntArray4859, i, i_2_);
            ((Class346_Sub9) class346_sub9).anInt8347 = oa.anIntArray4859[0];
            ((Class346_Sub9) class346_sub9).anInt8346 = oa.anIntArray4859[1];
            ((Class346_Sub9) class346_sub9).anInt8345 = oa.anIntArray4859[2];
            ((Class346_Sub9) class346_sub9).anInt8343 = oa.anIntArray4859[3];
            ((Class346_Sub9) class346_sub9).anInt8344 = oa.anIntArray4859[4];
            ((Class346_Sub9) class346_sub9).aBoolean8342 = oa.anIntArray4859[5] != 0;
        }
    }

    final boolean method1420(int i, int i_3_, Viewport viewport, boolean bool, int i_4_, int i_5_) {
        return anOa4837.C().method144(this, i, i_3_, viewport, bool, i_5_);
    }

    final native int HA();

    private final native void l(long l, int i, int[] is, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool);

    final boolean method1422() {
        return true;
    }

    final native void a(int i);

    final native void aa(short i, short i_10_);

    final native void ZA(i var_i_11_, i var_i_12_, int i, boolean bool, boolean bool_13_);

    final native int V();

    final void method1438(int i, int[] is, int i_14_, int i_15_, int i_16_, int i_17_, boolean bool) {
        l(((i) this).nativeid, i, is, i_14_, i_15_, i_16_, i_17_, bool);
    }

    final void method1427() {
        if (((oa) anOa4837).anInt4863 > 1) {
            synchronized (this) {
                while (((Class162) this).aBoolean1907) {
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
                ((Class162) this).aBoolean1907 = true;
            }
        }
    }

    final native int WA();

    public final native void w(boolean bool);

    final native r ba(r var_r);

    final native boolean NA();

    final void method1433(int i, int i_18_, int i_19_, int i_20_) {
        /* empty */
    }

    final native void O(int i, int i_21_, int i_22_);

    final native void P(int i, int i_23_, int i_24_, int i_25_);

    final native void p(int i, int i_26_, s var_s, s var_s_27_, int i_28_, int i_29_, int i_30_);

    final boolean method1437(int i, int i_31_, Viewport viewport, boolean bool, int i_32_) {
        return anOa4837.C().method148(this, i, i_31_, viewport, bool);
    }

    final native void VA(int i);

    final native int ua();

    final native void ia(short i, short i_33_);

    protected final void finalize() {
        if (((i) this).nativeid != 0L)
            Class123.method1136(this, (byte) 43);
    }

    final native void s(int i);

    final void method1442(Viewport viewport) {
        method1445(oa.anIntArray4846, viewport);
        int i = 0;
        if (((i) this).aClass40Array4840 != null) {
            for (int i_34_ = 0; i_34_ < ((i) this).aClass40Array4840.length; i_34_++) {
                Class40 class40 = ((i) this).aClass40Array4840[i_34_];
                ((Class40) class40).anInt447 = oa.anIntArray4846[i++];
                ((Class40) class40).anInt458 = oa.anIntArray4846[i++];
                ((Class40) class40).anInt457 = oa.anIntArray4846[i++];
                ((Class40) class40).anInt453 = oa.anIntArray4846[i++];
                ((Class40) class40).anInt452 = oa.anIntArray4846[i++];
                ((Class40) class40).anInt440 = oa.anIntArray4846[i++];
                ((Class40) class40).anInt439 = oa.anIntArray4846[i++];
                ((Class40) class40).anInt441 = oa.anIntArray4846[i++];
                ((Class40) class40).anInt455 = oa.anIntArray4846[i++];
            }
        }
        if (((i) this).aClass124Array4839 != null) {
            for (int i_35_ = 0; i_35_ < ((i) this).aClass124Array4839.length; i_35_++) {
                Class124 class124 = ((i) this).aClass124Array4839[i_35_];
                Class124 class124_36_ = class124;
                if (((Class124) class124).aClass124_1531 != null)
                    class124_36_ = ((Class124) class124).aClass124_1531;
                if (((Class124) class124).aViewport_1533 != null)
                    ((Class124) class124).aViewport_1533.method1868(viewport);
                else
                    ((Class124) class124).aViewport_1533 = viewport.method1863();
                ((Class124) class124_36_).anInt1536 = oa.anIntArray4846[i++];
                ((Class124) class124_36_).anInt1535 = oa.anIntArray4846[i++];
                ((Class124) class124_36_).anInt1542 = oa.anIntArray4846[i++];
            }
        }
    }

    final native void H(int i, int i_37_, int i_38_);

    private final native void R(oa var_oa, ya var_ya, int i, int i_39_, int[] is, int[] is_40_, int[] is_41_, int[] is_42_, short[] is_43_, int i_44_, short[] is_45_, short[] is_46_, short[] is_47_, byte[] is_48_, byte[] is_49_, byte[] is_50_, byte[] is_51_, short[] is_52_, short[] is_53_, int[] is_54_, byte i_55_, short[] is_56_, int i_57_, byte[] is_58_, short[] is_59_, short[] is_60_, short[] is_61_, int[] is_62_, int[] is_63_, int[] is_64_, byte[] is_65_, byte[] is_66_, int[] is_67_, int[] is_68_, int[] is_69_, int[] is_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int[] is_77_);

    final native void I(int i, int[] is, int i_78_, int i_79_, int i_80_, boolean bool, int i_81_, int[] is_82_);

    private final void method1445(int[] is, Viewport viewport) {
        anOa4837.C().method134(this, is, viewport);
    }

    final Class40[] method1431() {
        return ((i) this).aClass40Array4840;
    }

    private final native void oa(oa var_oa);

    final native void k(int i);

    final native int G();

    final native int EA();

    final native int da();

    final void method1435() {
        /* empty */
    }

    final native int fa();

    final native void C(int i);

    final native void v();

    final Class124[] method1426() {
        return ((i) this).aClass124Array4839;
    }

    final native boolean r();

    final void method1440(Viewport viewport, Class346_Sub9 class346_sub9, int i) {
        if (class346_sub9 == null)
            anOa4837.C().method135(this, viewport, null, i);
        else {
            oa.anIntArray4859[5] = 0;
            anOa4837.C().method135(this, viewport, oa.anIntArray4859, i);
            ((Class346_Sub9) class346_sub9).anInt8347 = oa.anIntArray4859[0];
            ((Class346_Sub9) class346_sub9).anInt8346 = oa.anIntArray4859[1];
            ((Class346_Sub9) class346_sub9).anInt8345 = oa.anIntArray4859[2];
            ((Class346_Sub9) class346_sub9).anInt8343 = oa.anIntArray4859[3];
            ((Class346_Sub9) class346_sub9).anInt8344 = oa.anIntArray4859[4];
            ((Class346_Sub9) class346_sub9).aBoolean8342 = oa.anIntArray4859[5] != 0;
        }
    }

    final void method1443(Viewport viewport, int i, boolean bool) {
        J(((ja) (ja) viewport).nativeid, i, bool);
    }

    final native int na();

    final native int RA();

    final Class162 method1436(byte i, int i_83_, boolean bool) {
        return anOa4837.C().method137(this, i, i_83_, bool);
    }

    final void method1425() {
        if (((oa) anOa4837).anInt4863 > 1) {
            synchronized (this) {
                ((Class162) this).aBoolean1907 = false;
                this.notifyAll();
            }
        }
    }

    final native boolean F();

    final native void wa();

    i(oa var_oa, ya var_ya, Class343 class343, int i, int i_84_, int i_85_, int i_86_) {
        anOa4837 = var_oa;
        aYa4838 = var_ya;
        ((i) this).aClass40Array4840 = ((Class343) class343).aClass40Array4045;
        ((i) this).aClass124Array4839 = ((Class343) class343).aClass124Array4060;
        int i_87_ = (((Class343) class343).aClass40Array4045 == null ? 0 : ((Class343) class343).aClass40Array4045.length);
        int i_88_ = (((Class343) class343).aClass124Array4060 == null ? 0 : ((Class343) class343).aClass124Array4060.length);
        int i_89_ = 0;
        int[] is = new int[i_87_ * 3 + i_88_];
        for (int i_90_ = 0; i_90_ < i_87_; i_90_++) {
            is[i_89_++] = ((Class40) ((i) this).aClass40Array4840[i_90_]).anInt446;
            is[i_89_++] = ((Class40) ((i) this).aClass40Array4840[i_90_]).anInt451;
            is[i_89_++] = ((Class40) ((i) this).aClass40Array4840[i_90_]).anInt456;
        }
        for (int i_91_ = 0; i_91_ < i_88_; i_91_++)
            is[i_89_++] = ((Class124) ((i) this).aClass124Array4839[i_91_]).anInt1529;
        int i_92_ = (((Class343) class343).aClass178Array4048 == null ? 0 : ((Class343) class343).aClass178Array4048.length);
        int[] is_93_ = new int[i_92_ * 8];
        int i_94_ = 0;
        for (int i_95_ = 0; i_95_ < i_92_; i_95_++) {
            Class178 class178 = ((Class343) class343).aClass178Array4048[i_95_];
            Class236 class236 = Node_Sub42_Sub3.method2637(0, ((Class178) class178).anInt2078);
            is_93_[i_94_++] = ((Class178) class178).anInt2075;
            is_93_[i_94_++] = ((Class236) class236).anInt2627;
            is_93_[i_94_++] = ((Class236) class236).anInt2626;
            is_93_[i_94_++] = ((Class236) class236).anInt2623;
            is_93_[i_94_++] = ((Class236) class236).anInt2628;
            is_93_[i_94_++] = ((Class236) class236).anInt2622;
            is_93_[i_94_++] = ((Class236) class236).aBoolean2631 ? -1 : 0;
        }
        for (int i_96_ = 0; i_96_ < i_92_; i_96_++) {
            Class178 class178 = ((Class343) class343).aClass178Array4048[i_96_];
            is_93_[i_94_++] = ((Class178) class178).anInt2079;
        }
        R(anOa4837, aYa4838, ((Class343) class343).anInt4063, ((Class343) class343).anInt4075, ((Class343) class343).anIntArray4027, ((Class343) class343).anIntArray4069, ((Class343) class343).anIntArray4040, ((Class343) class343).anIntArray4057, ((Class343) class343).aShortArray4038, ((Class343) class343).anInt4028, ((Class343) class343).aShortArray4046, ((Class343) class343).aShortArray4024, ((Class343) class343).aShortArray4073, ((Class343) class343).aByteArray4076, ((Class343) class343).aByteArray4072, ((Class343) class343).aByteArray4061, ((Class343) class343).aByteArray4026, ((Class343) class343).aShortArray4054, ((Class343) class343).aShortArray4056, ((Class343) class343).anIntArray4030, ((Class343) class343).aByte4036, ((Class343) class343).aShortArray4064, ((Class343) class343).anInt4039, ((Class343) class343).aByteArray4033, ((Class343) class343).aShortArray4047, ((Class343) class343).aShortArray4049, ((Class343) class343).aShortArray4070, ((Class343) class343).anIntArray4058, ((Class343) class343).anIntArray4029, ((Class343) class343).anIntArray4021, ((Class343) class343).aByteArray4055, ((Class343) class343).aByteArray4042, ((Class343) class343).anIntArray4041, ((Class343) class343).anIntArray4032, ((Class343) class343).anIntArray4034, is, i_87_, i_88_, i, i_84_, i_85_, i_86_, is_93_);
    }

    i(oa var_oa) {
        anOa4837 = var_oa;
        aYa4838 = null;
        oa(var_oa);
    }
}
