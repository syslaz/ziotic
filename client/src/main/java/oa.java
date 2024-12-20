/* oa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Method;

final class oa extends ha implements Interface8 {
    private boolean aBoolean4841 = false;
    private ya aYa4842;
    private Class293 aClass293_4843;
    long nativeid = 0L;
    private static int[] anIntArray4844 = new int[Math.max(Math.max(104, 20), 24573)];
    private static byte[] aByteArray4845;
    static int[] anIntArray4846 = anIntArray4844;
    private static int[] anIntArray4847;
    private Viewport aViewport_4848;
    private static short[] aShortArray4849 = new short[8191];
    private static int[] anIntArray4850;
    private static int[] anIntArray4851;
    private Class65 aClass65_4852;
    private int anInt4853;
    private Viewport aViewport_4854;
    private static float[] aFloatArray4855;
    private static float[] aFloatArray4856;
    private static int[] anIntArray4857;
    private p aP4858;
    static int[] anIntArray4859;
    private int anInt4860;
    private a[] anAArray4861;
    private boolean aBoolean4862;
    int anInt4863;

    final native void xa(float f);

    final boolean d() {
        return true;
    }

    final boolean a() {
        return false;
    }

    private final native void d(int i);

    public final native void w(boolean bool);

    final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
        wa(i, i_0_, i_1_, i_2_, i_3_, i_4_);
    }

    final void a(int i, int i_5_, int i_6_, int i_7_) {
        /* empty */
    }

    final native void F(int i, int i_8_);

    private final native void va(za var_za);

    final aa a(int i, int i_9_, int[] is, int[] is_10_) {
        return new na(this, aYa4842, i, i_9_, is, is_10_);
    }

    private final native void ma(long l);

    final native void DA(int i, int i_11_, int i_12_, int i_13_);

    final Viewport o() {
        return aViewport_4848;
    }

    final native void T(int i, int i_14_, int i_15_, int i_16_);

    final native void P(int i, int i_17_, int i_18_, int i_19_, int i_20_);

    final Class129 a(int[] is, int i, int i_21_, int i_22_, int i_23_, boolean bool) {
        return new j(this, is, i, i_21_, i_22_, i_23_, false);
    }

    final native void U(int i, int i_24_, int i_25_, int i_26_, int i_27_);

    final boolean l() {
        return true;
    }

    final boolean n() {
        return true;
    }

    final void h(int i) {
        anAArray4861[i].method141();
    }

    final Interface14 a(Interface13 interface13, Interface2 interface2) {
        return new wa(this, (j) interface13, (xa) interface2);
    }

    final Class162 a(Class343 class343, int i, int i_28_, int i_29_, int i_30_) {
        return new i(this, aYa4842, class343, i, i_28_, i_29_, i_30_);
    }

    final void a(int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
        /* empty */
    }

    public oa(Canvas canvas, d var_d, int i, int i_43_) {
        super(var_d);
        aClass293_4843 = new Class293();
        anInt4853 = 4096;
        anInt4860 = 4096;
        aClass65_4852 = new Class65(4);
        aBoolean4862 = false;
        do {
            try {
                if (!Class111.method776(118, "sw3d"))
                    throw new RuntimeException("");
                Class123.method1134(-1);
                MA(((ha) this).aD1414, 0, 0);
                Class48.method361(false, true, true);
                aBoolean4862 = true;
                aViewport_4848 = new ja();
                a(new ja());
                c((int) 1);
                h(0);
                if (canvas == null)
                    break;
                a(canvas, i, i_43_);
                a(canvas);
            } catch (Throwable throwable) {
                this.method819(119);
                throw new RuntimeException();
            }
            break;
        } while (false);
    }

    final void a(Class338 class338, int i) {
        a(class338, false);
        C().method139(this, anIntArray4851, anIntArray4850, anIntArray4847, aShortArray4849, ((Class338) class338).aClass26_3941.method245(0));
    }

    final native int M();

    protected final synchronized void finalize() {
        this.method819(121);
        if (((oa) this).nativeid != 0L)
            Class123.method1136(this, (byte) -106);
    }

    final void u() {
        /* empty */
    }

    final int c(int i, int i_44_) {
        return i | i_44_;
    }

    final native void la();

    private final native void N(int i, int[] is, float[] fs);

    final native void Q(int i, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, byte[] is, int i_50_, int i_51_);

    final native void KA(int i, int i_52_, int i_53_, int i_54_);

    final Class48 a(Class285 class285, Class157[] class157s, boolean bool) {
        int[] is = new int[class157s.length];
        int[] is_55_ = new int[class157s.length];
        boolean bool_56_ = false;
        for (int i = 0; i < class157s.length; i++) {
            is[i] = ((Class157) class157s[i]).anInt1873;
            is_55_[i] = ((Class157) class157s[i]).anInt1874;
            if (((Class157) class157s[i]).aByteArray1875 != null)
                bool_56_ = true;
        }
        if (bool) {
            if (bool_56_)
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            return new h(this, aYa4842, class285, class157s, null);
        }
        if (bool_56_)
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        return new n(this, aYa4842, class285, class157s, null);
    }

    private final native void FA();

    final native int XA();

    final native void X(int i);

    final native int I();

    final void b(Canvas canvas, int i, int i_57_) {
        p var_p = (p) aClass65_4852.method501((long) canvas.hashCode(), (byte) 31);
        var_p.method2587(canvas, i, i_57_);
        if (canvas != null && canvas == ((p) aP4858).aCanvas4866)
            a(canvas);
    }

    private final native void n(long l, long l_58_);

    final void a(int i, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_) {
        /* empty */
    }

    private final void a(Class338 class338, boolean bool) {
        int i = 0;
        int i_67_ = 0;
        int i_68_ = 0;
        int i_69_ = 0;
        int i_70_ = 0;
        for (Class346_Sub5_Sub2 class346_sub5_sub2 = ((Class346_Sub5_Sub2) ((Class338) class338).aClass26_3941.method246((byte) 118)); class346_sub5_sub2 != null; class346_sub5_sub2 = ((Class346_Sub5_Sub2) ((Class338) class338).aClass26_3941.method247(-126))) {
            anIntArray4851[i++] = ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9894;
            anIntArray4851[i++] = ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9891;
            anIntArray4851[i++] = ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9895;
            anIntArray4850[i_67_++] = ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9897;
            aShortArray4849[i_69_++] = (short) ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9899;
            anIntArray4847[i_68_++] = ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9896;
            if (bool)
                aByteArray4845[i_70_++] = ((Class346_Sub5_Sub2) class346_sub5_sub2).aByte9888;
        }
    }

    final void h() {
        /* empty */
    }

    private final native void t(p var_p);

    private final boolean c(short i) {
        synchronized (this) {
            Class312 class312 = ((ha) this).aD1414.method25(i, (byte) 127);
            if (class312 == null)
                return false;
            AA(i, ((Class312) class312).aShort3634, ((Class312) class312).anInt3629, ((Class312) class312).aByte3624, ((Class312) class312).aByte3646, ((Class312) class312).anInt3645, ((Class312) class312).aBoolean3636, ((Class312) class312).aByte3630, ((Class312) class312).aByte3625, ((Class312) class312).aByte3643, ((Class312) class312).aByte3642, ((Class312) class312).aBoolean3622, ((Class312) class312).aBoolean3631, ((Class312) class312).aBoolean3638, ((Class312) class312).aBoolean3632, ((Class312) class312).aBoolean3639, ((Class312) class312).aByte3623, ((Class312) class312).aBoolean3626, ((Class312) class312).aBoolean3635, ((Class312) class312).anInt3633);
        }
        return true;
    }

    final Viewport t() {
        return aViewport_4854;
    }

    final Class167 c() {
        return new Class167(0, "SSE", 1, "CPU", 0L);
    }

    final void a(boolean bool) {
        /* empty */
    }

    final Interface2 a(int i, int i_71_) {
        return new xa(i, i_71_);
    }

    final native void pa();

    final void c(int i) {
        ((oa) this).anInt4863 = i;
        anAArray4861 = new a[((oa) this).anInt4863];
        for (int i_72_ = 0; i_72_ < ((oa) this).anInt4863; i_72_++)
            anAArray4861[i_72_] = new a(this, anInt4860, anInt4853);
    }

    final Class316 d(int i, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_) {
        return null;
    }

    final void z() {
        a(((p) aP4858).aCanvas4866);
    }

    final void c(int i, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_) {
        U(i, i_78_, i_79_, i_81_, i_82_);
        U(i, i_78_ + i_80_ - 1, i_79_, i_81_, i_82_);
        P(i, i_78_ + 1, i_80_ - 1, i_81_, i_82_);
        P(i + i_79_ - 1, i_78_ + 1, i_80_ - 1, i_81_, i_82_);
    }

    private final native void wa(int i, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_);

    final native void aa(int i, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_);

    final void a(Class338 class338) {
        if (((Class338) class338).aClass26_3941.method245(0) != 0) {
            a(class338, false);
            C().method139(this, anIntArray4851, anIntArray4850, anIntArray4847, aShortArray4849, ((Class338) class338).aClass26_3941.method245(0));
        }
    }

    final a C() {
        for (int i = 0; i < ((oa) this).anInt4863; i++) {
            if (((a) anAArray4861[i]).aRunnable4834 == Thread.currentThread())
                return anAArray4861[i];
        }
        return null;
    }

    final void a(Canvas canvas) {
        if (canvas != null) {
            p var_p = (p) aClass65_4852.method501((long) canvas.hashCode(), (byte) 31);
            aP4858 = var_p;
            t(var_p);
        } else {
            aP4858 = null;
            t(null);
        }
    }

    final void w() {
        /* empty */
    }

    private final native void AA(short i, short i_93_, int i_94_, byte i_95_, byte i_96_, int i_97_, boolean bool, byte i_98_, byte i_99_, byte i_100_, byte i_101_, boolean bool_102_, boolean bool_103_, boolean bool_104_, boolean bool_105_, boolean bool_106_, byte i_107_, boolean bool_108_, boolean bool_109_, int i_110_);

    private final native void CA(short i, int[] is, short i_111_, int i_112_, byte i_113_, byte i_114_, int i_115_, boolean bool, byte i_116_, byte i_117_, byte i_118_, byte i_119_, boolean bool_120_, boolean bool_121_, boolean bool_122_, boolean bool_123_, boolean bool_124_, byte i_125_, boolean bool_126_, boolean bool_127_, int i_128_);

    final boolean m() {
        return true;
    }

    final void a(Viewport viewport) {
        aViewport_4854 = viewport;
        ma(((ja) (ja) viewport).nativeid);
    }

    final void e(int i, int i_129_) throws Exception_Sub1 {
        if (aP4858 == null)
            throw new IllegalStateException("off");
        aP4858.method2586(i, i_129_);
    }

    final native void HA(int i, int i_130_, int i_131_, int i_132_, int[] is);

    final boolean s() {
        return true;
    }

    final Class316 a(Class316 class316, Class316 class316_133_, float f, Class316 class316_134_) {
        return null;
    }

    final native void da(int i, int i_135_, int i_136_, int[] is);

    final void a(Canvas canvas, int i, int i_137_) {
        p var_p = (p) aClass65_4852.method501((long) canvas.hashCode(), (byte) 31);
        if (var_p == null) {
            try {
                Class var_class = Class.forName("java.awt.Canvas");
                Method method = var_class.getMethod("setIgnoreRepaint", new Class[]{Boolean.TYPE});
                method.invoke(canvas, new Object[]{Boolean.TRUE});
            } catch (Exception exception) {
                /* empty */
            }
            var_p = new p(this, canvas, i, i_137_);
            aClass65_4852.method509(-1, var_p, (long) canvas.hashCode());
        } else if (((p) var_p).anInt4868 != i || ((p) var_p).anInt4865 != i_137_)
            var_p.method2587(canvas, i, i_137_);
    }

    final za a(int i) {
        ya var_ya = new ya(this, i);
        aClass293_4843.method3109(var_ya, -126);
        return var_ya;
    }

    final native void f(int i, int i_138_);

    final s a(int i, int i_139_, int[][] is, int[][] is_140_, int i_141_, int i_142_, int i_143_) {
        return new t(this, aYa4842, i, i_139_, is, is_140_, i_141_, i_142_, i_143_);
    }

    final void a(int i, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, aa var_aa, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_) {
        /* empty */
    }

    private final Object OA() {
        return new ba(this);
    }

    final void a(float f, float f_154_, float f_155_) {
        /* empty */
    }

    final boolean y() {
        return false;
    }

    final boolean b() {
        return true;
    }

    final native int r(int i, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_);

    private final native void Z(int i, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, aa var_aa, int i_167_, int i_168_);

    final boolean q() {
        return false;
    }

    final void x() {
        /* empty */
    }

    final native void ya();

    final native void EA(int i, int i_169_, int i_170_, int i_171_);

    private final boolean WA(short i) {
        synchronized (((ha) this).aD1414) {
            if (!((ha) this).aD1414.method23(i, -32345))
                return false;
            Class312 class312 = ((ha) this).aD1414.method25(i, (byte) 124);
            if (class312 == null)
                return false;
            int[] is;
            if (((Class312) class312).anInt3629 != 2)
                is = ((ha) this).aD1414.method24(-128, 128, 0.7F, true, i, 128);
            else
                is = ((ha) this).aD1414.method27(true, (byte) -80, 128, 128, 0.7F, i);
            CA(i, is, ((Class312) class312).aShort3634, ((Class312) class312).anInt3629, ((Class312) class312).aByte3624, ((Class312) class312).aByte3646, ((Class312) class312).anInt3645, ((Class312) class312).aBoolean3636, ((Class312) class312).aByte3630, ((Class312) class312).aByte3625, ((Class312) class312).aByte3643, ((Class312) class312).aByte3642, ((Class312) class312).aBoolean3622, ((Class312) class312).aBoolean3631, ((Class312) class312).aBoolean3638, ((Class312) class312).aBoolean3632, ((Class312) class312).aBoolean3639, ((Class312) class312).aByte3623, ((Class312) class312).aBoolean3626, ((Class312) class312).aBoolean3635, ((Class312) class312).anInt3633);
        }
        return true;
    }

    final void a(int i, Node_Sub42[] class248_sub42s) {
        int i_172_ = 0;
        for (int i_173_ = 0; i_173_ < i; i_173_++) {
            anIntArray4857[i_172_++] = class248_sub42s[i_173_].method2620(107);
            anIntArray4857[i_172_++] = class248_sub42s[i_173_].method2624(-22096);
            anIntArray4857[i_172_++] = class248_sub42s[i_173_].method2625((byte) -110);
            anIntArray4857[i_172_++] = class248_sub42s[i_173_].method2628(-114);
            aFloatArray4856[i_173_] = class248_sub42s[i_173_].method2621((byte) 110);
            anIntArray4857[i_172_++] = class248_sub42s[i_173_].method2626(false);
        }
        N(i, anIntArray4857, aFloatArray4856);
    }

    final void a(Rectangle[] rectangles, int i, int i_174_, int i_175_) throws Exception_Sub1 {
        if (aP4858 == null)
            throw new IllegalStateException("off");
        aP4858.method2583(rectangles, i, i_174_, i_175_);
    }

    final Class129 a(int i, int i_176_, int i_177_, int i_178_, boolean bool) {
        return new j(this, i, i_176_, i_177_, i_178_, !bool);
    }

    final void a(Interface14 interface14) {
        wa var_wa = (wa) interface14;
        n(((j) ((wa) var_wa).aJ5075).nativeid, ((xa) ((wa) var_wa).aXa5074).nativeid);
    }

    final boolean f() {
        return true;
    }

    final void e(int i) {
        anAArray4861[i].method133();
    }

    final int b(int i, int i_179_) {
        int i_180_ = i & 0xfffff;
        int i_181_ = i_179_ & 0xfffff;
        return i_180_ & i_181_ ^ i_181_;
    }

    final native void ra(int i, int i_182_, int i_183_, int i_184_);

    private final native void MA(d var_d, int i, int i_185_);

    private final void g() {
        System.gc();
        System.runFinalization();
        Class123.method1133(false);
    }

    final void a(Class316 class316) {
        /* empty */
    }

    final void p() {
        if (!aBoolean4841) {
            anAArray4861 = null;
            aP4858 = null;
            aYa4842 = null;
            aViewport_4848 = null;
            aClass65_4852.method504(-1);
            for (ya var_ya = (ya) aClass293_4843.method3119(2); var_ya != null; var_ya = (ya) aClass293_4843.method3107(-127))
                var_ya.ga();
            aClass293_4843.method3121(10);
            FA();
            if (aBoolean4862) {
                Class48.method372(false, true, (byte) 119);
                aBoolean4862 = false;
            }
            g();
            Class123.method1135(-26583);
            aBoolean4841 = true;
        }
    }

    final Class129 a(Class157 class157, boolean bool) {
        j var_j = new j(this, ((Class157) class157).anIntArray1872, ((Class157) class157).aByteArray1868, ((Class157) class157).aByteArray1875, 0, ((Class157) class157).anInt1873, ((Class157) class157).anInt1873, ((Class157) class157).anInt1874);
        var_j.method1165(((Class157) class157).anInt1869, ((Class157) class157).anInt1876, ((Class157) class157).anInt1871, ((Class157) class157).anInt1870);
        return var_j;
    }

    final boolean j() {
        return true;
    }

    final void a(int[] is) {
        Dimension dimension = ((p) aP4858).aCanvas4866.getSize();
        is[0] = dimension.width;
        is[1] = dimension.height;
    }

    final void b(boolean bool) {
        /* empty */
    }

    final Node_Sub42 a(int i, int i_186_, int i_187_, int i_188_, int i_189_, float f) {
        return new Node_Sub42_Sub1(i, i_186_, i_187_, i_188_, i_189_, f);
    }

    final Class129 a(int i, int i_190_, boolean bool) {
        return new j(this, i, i_190_);
    }

    final native void H(int i, int i_191_, int i_192_, int[] is);

    final void a(za var_za) {
        aYa4842 = (ya) var_za;
        va(var_za);
    }

    final native void GA(int i);

    final void a(int i, int i_193_, int i_194_, int i_195_, int i_196_, int i_197_, aa var_aa, int i_198_, int i_199_) {
        Z(i, i_193_, i_194_, i_195_, i_196_, i_197_, var_aa, i_198_, i_199_);
    }

    final Viewport e() {
        return new ja();
    }

    final native int[] na(int i, int i_200_, int i_201_, int i_202_);

    final void j(int i) {
        Class123.method1133(false);
        d(i);
        for (ya var_ya = (ya) aClass293_4843.method3119(2); var_ya != null; var_ya = (ya) aClass293_4843.method3107(-127))
            var_ya.r();
    }

    final native void L(int i, int i_203_, int i_204_);

    final boolean v() {
        return true;
    }

    final void g(int i) {
        anInt4860 = anInt4853 = i;
        if (((oa) this).anInt4863 > 1)
            throw new IllegalStateException("No MT");
        c(((oa) this).anInt4863);
        h(0);
    }

    final native int E();

    final void k() {
        /* empty */
    }

    final native void ZA(int i, float f, float f_205_, float f_206_, float f_207_, float f_208_);

    final native int[] Y();

    final native int JA(int i, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_);

    final void b(Canvas canvas) {
        if (((p) aP4858).aCanvas4866 == canvas)
            a((Canvas) null);
        p var_p = (p) aClass65_4852.method501((long) canvas.hashCode(), (byte) 31);
        if (var_p != null) {
            var_p.remove(true);
            var_p.method2585();
        }
    }

    final void a(int i, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_, int i_219_) {
        C().method140(this, i, i_214_, i_215_, i_216_, i_217_, i_218_, i_219_);
    }

    final native void C(boolean bool);

    final native void za(int i, int i_220_, int i_221_, int i_222_, int i_223_);

    final boolean A() {
        return false;
    }

    final native int i();

    final native void K(int[] is);

    final native void A(int i, aa var_aa, int i_224_, int i_225_);

    final int r() {
        return 4;
    }

    final Interface13 d(int i, int i_226_) {
        return a(i, i_226_, false);
    }

    final native void b(int i, int i_227_, int i_228_, int i_229_, double d);

    final void b(int i) {
        throw new IllegalStateException();
    }

    static {
        anIntArray4847 = new int[8191];
        aByteArray4845 = new byte[8191];
        anIntArray4851 = anIntArray4844;
        anIntArray4857 = anIntArray4844;
        aFloatArray4855 = new float[20];
        aFloatArray4856 = aFloatArray4855;
        anIntArray4859 = new int[6];
        anIntArray4850 = new int[8191];
    }
}
