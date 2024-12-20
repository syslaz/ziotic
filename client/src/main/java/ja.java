/* ja - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ja extends Viewport implements Interface8 {
    long nativeid;

    private final native void m(long l, int i);

    private final native void u(long l);

    final void method1864(int i) {
        NA(((ja) this).nativeid, i);
    }

    private final native void NA(long l, int i);

    private final native void va(long l, int i, int i_0_, int i_1_, int[] is);

    final Viewport method1863() {
        ja var_ja_2_ = new ja();
        var_ja_2_.method1868(this);
        return var_ja_2_;
    }

    private final native void l(long l, long l_3_);

    final void method1861(int i) {
        VA(((ja) this).nativeid, i);
    }

    private final native void VA(long l, int i);

    private final native void XA(long l, int i, int i_4_, int i_5_, int[] is);

    final void method1865(int i, int i_6_, int i_7_, int[] is) {
        b(((ja) this).nativeid, i, i_6_, i_7_, is);
    }

    final void method1867(int[] is) {
        w(((ja) this).nativeid, is);
    }

    final void method1858(int i) {
        m(((ja) this).nativeid, i);
    }

    private final native void P(long l, int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_);

    final void method1868(Viewport viewport) {
        l(((ja) this).nativeid, ((ja) (ja) viewport).nativeid);
    }

    final void method1857(int i) {
        t(((ja) this).nativeid, i);
    }

    private final native void FA(long l, int i, int i_13_, int i_14_);

    public final void w(boolean bool) {
        AA(((ja) this).nativeid, bool);
    }

    final void method1869(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
        P(((ja) this).nativeid, i, i_15_, i_16_, i_17_, i_18_, i_19_);
    }

    final void method1872(int i) {
        za(((ja) this).nativeid, i);
    }

    private final native void b(long l, int i, int i_20_, int i_21_, int[] is);

    final void method1873(int i) {
        J(((ja) this).nativeid, i);
    }

    private final native void w(long l, int[] is);

    private final native void J(long l, int i);

    private final native void a(long l, int i, int i_22_, int i_23_);

    private final native void t(long l, int i);

    final void method1875(int i, int i_24_, int i_25_, int[] is) {
        va(((ja) this).nativeid, i, i_24_, i_25_, is);
    }

    private final native void la();

    ja() {
        la();
    }

    final void method1866() {
        u(((ja) this).nativeid);
    }

    protected final void finalize() {
        if (((ja) this).nativeid != 0L)
            Class123.method1136(this, (byte) -97);
    }

    private final native void za(long l, int i);

    final void method1859(int i, int i_26_, int i_27_) {
        FA(((ja) this).nativeid, i, i_26_, i_27_);
    }

    final void method1870(int i, int i_28_, int i_29_, int[] is) {
        XA(((ja) this).nativeid, i, i_28_, i_29_, is);
    }

    private final native void AA(long l, boolean bool);

    final void method1862(int i, int i_30_, int i_31_) {
        a(((ja) this).nativeid, i, i_30_, i_31_);
    }
}
