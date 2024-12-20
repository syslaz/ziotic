/* ha_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;

import java.awt.*;

final class ha_Sub3_Sub1 extends ha_Sub3 {
    static int anInt8654;
    static int anInt8655;
    static int anInt8656;
    static int anInt8657;
    static int anInt8658;
    static int anInt8659;
    static int anInt8660;
    static int anInt8661;
    static int anInt8662;
    static int anInt8663;
    static int anInt8664;
    static int anInt8665;
    private OpenGL anOpenGL8666;
    static int anInt8667;
    static int anInt8668;
    static int anInt8669;
    static int anInt8670;
    static int anInt8671;
    static int anInt8672;
    static int anInt8673;
    static int anInt8674;
    static int anInt8675;
    static int anInt8676;
    static int anInt8677;
    static int anInt8678;
    static int anInt8679;
    static int anInt8680;
    static int anInt8681;
    static int anInt8682;
    static int anInt8683;
    static int anInt8684;
    static int anInt8685;
    static int anInt8686;
    static int anInt8687;
    static int anInt8688;
    static int anInt8689;
    static int anInt8690;
    static int anInt8691;
    static int anInt8692;
    static int anInt8693;
    static int anInt8694;
    static int anInt8695;
    static int anInt8696;
    static int anInt8697;
    static int anInt8698;
    static int anInt8699;
    static int anInt8700;
    static int anInt8701;
    static int anInt8702;
    static int anInt8703;
    static int anInt8704;
    static int anInt8705;
    static int anInt8706;
    static int anInt8707;
    static int anInt8708;
    static boolean aBoolean8709 = false;
    static int anInt8710;
    static int anInt8711;
    static int anInt8712;
    static int anInt8713;
    static int anInt8714;
    static int anInt8715;
    static int anInt8716;
    static int anInt8717;
    static boolean aBoolean8718 = false;
    static int anInt8719;
    static int anInt8720;
    static int anInt8721;
    private Class293 aClass293_8722 = new Class293();
    static int anInt8723;
    static int anInt8724;
    static int anInt8725;
    static int anInt8726;
    static int anInt8727;
    static int anInt8728;
    static int anInt8729;
    static int anInt8730;
    static int anInt8731;
    static int anInt8732;
    static int anInt8733;
    static int anInt8734;
    static int anInt8735;
    static int anInt8736;
    private Class293 aClass293_8737 = new Class293();
    static int anInt8738;
    static int anInt8739;
    private Class293 aClass293_8740 = new Class293();
    static int anInt8741;
    static int anInt8742;
    static int anInt8743;
    static int anInt8744;
    private Class293 aClass293_8745 = new Class293();
    private Class293 aClass293_8746 = new Class293();
    private Class293 aClass293_8747 = new Class293();
    private Class293 aClass293_8748 = new Class293();
    private boolean aBoolean8749;
    MapBuffer aMapBuffer8750;
    private boolean aBoolean8751;
    private Class275_Sub1[] aClass275_Sub1Array8752 = new Class275_Sub1[16];
    private boolean aBoolean8753;
    private boolean aBoolean8754;
    private boolean aBoolean8755;
    private long aLong8756;
    private int anInt8757;
    MapBuffer aMapBuffer8758;
    int anInt8759;
    boolean aBoolean8760;
    boolean aBoolean8761;
    boolean aBoolean8762;
    private int anInt8763;
    boolean aBoolean8764;
    private String aString8765;
    private boolean aBoolean8766;
    int[] anIntArray8767;
    private boolean aBoolean8768;
    private int anInt8769;
    private String aString8770;

    final boolean q() {
        anInt8659++;
        return false;
    }

    final boolean method1044(Class228 class228, Class264 class264, int i) {
        if (i != 14)
            aBoolean8749 = true;
        anInt8679++;
        return true;
    }

    final synchronized void method1055(int i, int i_0_, int i_1_) {
        anInt8710++;
        Node_Sub37 class248_sub37 = new Node_Sub37(i_0_);
        if (i != 16384)
            method940((byte) 114);
        ((Node) class248_sub37).id = (long) i_1_;
        aClass293_8740.method3109(class248_sub37, -123);
    }

    final void ya() {
        this.method950((byte) 36, true);
        anInt8665++;
        OpenGL.glClear(256);
    }

    final void b(int i, int i_2_, int i_3_, int i_4_, double d) {
        anInt8670++;
    }

    final void method928(Canvas canvas, int i, Object object) {
        if (i != -1)
            aString8765 = null;
        anInt8660++;
        Long var_long = (Long) object;
        if (!anOpenGL8666.setSurface(var_long.longValue()))
            throw new RuntimeException();
    }

    final boolean method933(int i, Class228 class228, Class264 class264) {
        if (i != -3119)
            I();
        anInt8669++;
        return true;
    }

    final int[] na(int i, int i_5_, int i_6_, int i_7_) {
        anInt8668++;
        int[] is = new int[i_6_ * i_7_];
        for (int i_8_ = 0; i_7_ > i_8_; i_8_++)
            OpenGL.glReadPixelsi(i, -i_5_ + (((ha_Sub3) this).anInt5955 - i_8_ - 1), i_6_, 1, 32993, ((ha_Sub3_Sub1) this).anInt8759, is, i_6_ * i_8_);
        return is;
    }

    final void method954(byte i) {
        anInt8724++;
        Class211.aFloatArray2449[0] = ((float) Class112.method794(((ha_Sub3) this).anInt6204, 16711680) / 1.671168E7F);
        Class211.aFloatArray2449[3] = (float) (((ha_Sub3) this).anInt6204 >>> -1405104456) / 255.0F;
        Class211.aFloatArray2449[1] = ((float) Class112.method794(65280, ((ha_Sub3) this).anInt6204) / 65280.0F);
        Class211.aFloatArray2449[2] = ((float) Class112.method794(((ha_Sub3) this).anInt6204, 255) / 255.0F);
        OpenGL.glTexEnvfv(8960, 8705, Class211.aFloatArray2449, 0);
        if (i > -91)
            method997((byte) 92);
    }

    final void method1013(int i) {
        for (int i_9_ = ((ha_Sub3) this).anInt6236 - 1; (i_9_ ^ 0xffffffff) <= -1; i_9_--) {
            OpenGL.glActiveTexture(i_9_ + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        anInt8664++;
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        if (i <= 77)
            aBoolean8718 = false;
        OpenGL.glAlphaFunc(516, 0.0F);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] fs = {0.0F, 0.0F, 0.0F, 1.0F};
        for (int i_10_ = 0; i_10_ < 8; i_10_++) {
            int i_11_ = i_10_ + 16384;
            OpenGL.glLightfv(i_11_, 4608, fs, 0);
            OpenGL.glLightf(i_11_, 4615, 0.0F);
            OpenGL.glLightf(i_11_, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        anOpenGL8666.setSwapInterval(0);
        super.method1013(89);
    }

    final synchronized void j(int i) {
        anInt8687++;
        i &= 0x7fffffff;
        int i_12_ = 0;
        while (!aClass293_8737.method3115(false)) {
            Node_Sub37 class248_sub37 = (Node_Sub37) aClass293_8737.method3108(false);
            Class316_Sub1_Sub2.anIntArray9861[i_12_++] = (int) ((Node) class248_sub37).id;
            ((ha_Sub3) this).anInt6143 -= ((Node_Sub37) class248_sub37).anInt7261;
            if (i_12_ == 1000) {
                OpenGL.glDeleteBuffersARB(i_12_, Class316_Sub1_Sub2.anIntArray9861, 0);
                i_12_ = 0;
            }
        }
        if (i_12_ > 0) {
            OpenGL.glDeleteBuffersARB(i_12_, Class316_Sub1_Sub2.anIntArray9861, 0);
            i_12_ = 0;
        }
        while (!aClass293_8740.method3115(false)) {
            Node_Sub37 class248_sub37 = (Node_Sub37) aClass293_8740.method3108(false);
            Class316_Sub1_Sub2.anIntArray9861[i_12_++] = (int) ((Node) class248_sub37).id;
            ((ha_Sub3) this).anInt6140 -= ((Node_Sub37) class248_sub37).anInt7261;
            if (i_12_ == 1000) {
                OpenGL.glDeleteTextures(i_12_, Class316_Sub1_Sub2.anIntArray9861, 0);
                i_12_ = 0;
            }
        }
        if ((i_12_ ^ 0xffffffff) < -1) {
            OpenGL.glDeleteTextures(i_12_, Class316_Sub1_Sub2.anIntArray9861, 0);
            i_12_ = 0;
        }
        while (!aClass293_8745.method3115(false)) {
            Node_Sub37 class248_sub37 = (Node_Sub37) aClass293_8745.method3108(false);
            Class316_Sub1_Sub2.anIntArray9861[i_12_++] = ((Node_Sub37) class248_sub37).anInt7261;
            if (i_12_ == 1000) {
                OpenGL.glDeleteFramebuffersEXT(i_12_, (Class316_Sub1_Sub2.anIntArray9861), 0);
                i_12_ = 0;
            }
        }
        if ((i_12_ ^ 0xffffffff) < -1) {
            OpenGL.glDeleteFramebuffersEXT(i_12_, Class316_Sub1_Sub2.anIntArray9861, 0);
            i_12_ = 0;
        }
        while (!aClass293_8746.method3115(false)) {
            Node_Sub37 class248_sub37 = (Node_Sub37) aClass293_8746.method3108(false);
            Class316_Sub1_Sub2.anIntArray9861[i_12_++] = (int) ((Node) class248_sub37).id;
            ((ha_Sub3) this).anInt6139 -= ((Node_Sub37) class248_sub37).anInt7261;
            if (i_12_ == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(i_12_, (Class316_Sub1_Sub2.anIntArray9861), 0);
                i_12_ = 0;
            }
        }
        if ((i_12_ ^ 0xffffffff) < -1) {
            OpenGL.glDeleteRenderbuffersEXT(i_12_, Class316_Sub1_Sub2.anIntArray9861, 0);
            boolean bool = false;
        }
        while (!aClass293_8722.method3115(false)) {
            Node_Sub37 class248_sub37 = (Node_Sub37) aClass293_8722.method3108(false);
            OpenGL.glDeleteLists((int) ((Node) class248_sub37).id, ((Node_Sub37) class248_sub37).anInt7261);
        }
        while (!aClass293_8747.method3115(false)) {
            Node node = aClass293_8747.method3108(false);
            OpenGL.glDeleteProgramARB((int) ((Node) node).id);
        }
        while (!aClass293_8748.method3115(false)) {
            Node node = aClass293_8748.method3108(false);
            OpenGL.glDeleteObjectARB(((Node) node).id);
        }
        while (!aClass293_8722.method3115(false)) {
            Node_Sub37 class248_sub37 = (Node_Sub37) aClass293_8722.method3108(false);
            OpenGL.glDeleteLists((int) ((Node) class248_sub37).id, ((Node_Sub37) class248_sub37).anInt7261);
        }
        if (this.E() > 100663296 && Class118.method1112(116) > 60000L + aLong8756) {
            System.gc();
            aLong8756 = Class118.method1112(116);
        }
        super.j(i);
    }

    final void z() {
        anInt8712++;
    }

    final void method943(int i) {
        if (((ha_Sub3) this).aBoolean6211)
            OpenGL.glEnable(2929);
        else
            OpenGL.glDisable(2929);
        anInt8686++;
        if (i != 5481)
            aClass293_8740 = null;
    }

    final Interface13 d(int i, int i_13_) {
        anInt8680++;
        return null;
    }

    final void method1049(boolean bool) {
        anInt8711++;
        if (bool != true)
            a(0.59782726F, 0.6627364F, -0.16631359F);
        method1059(false);
    }

    final void a(boolean bool) {
        anInt8736++;
    }

    final void a(Rectangle[] rectangles, int i, int i_14_, int i_15_) throws Exception_Sub1 {
        anInt8698++;
        e(i_14_, i_15_);
    }

    final void method1041(int i) {
        anInt8677++;
        ((ha_Sub3) this).aFloat6190 = (float) (-((ha_Sub3) this).anInt6223 + ((ha_Sub3) this).anInt6164);
        ((ha_Sub3) this).aFloat6171 = ((float) -((ha_Sub3) this).anInt6158 + ((ha_Sub3) this).aFloat6190);
        if ((float) ((ha_Sub3) this).anInt6173 > ((ha_Sub3) this).aFloat6171)
            ((ha_Sub3) this).aFloat6171 = (float) ((ha_Sub3) this).anInt6173;
        OpenGL.glFogf(2915, ((ha_Sub3) this).aFloat6171);
        if (i != 16)
            aClass293_8746 = null;
        OpenGL.glFogf(2916, ((ha_Sub3) this).aFloat6190);
        Class211.aFloatArray2449[0] = ((float) Class112.method794(((ha_Sub3) this).anInt6214, 16711680) / 1.671168E7F);
        Class211.aFloatArray2449[1] = ((float) Class112.method794(65280, ((ha_Sub3) this).anInt6214) / 65280.0F);
        Class211.aFloatArray2449[2] = ((float) Class112.method794(((ha_Sub3) this).anInt6214, 255) / 255.0F);
        OpenGL.glFogfv(2918, Class211.aFloatArray2449, 0);
    }

    final void method1026(int i) {
        anInt8727++;
        int i_16_ = -33 % ((-51 - i) / 62);
        if (((ha_Sub3) this).aBoolean6276)
            OpenGL.glEnable(3089);
        else
            OpenGL.glDisable(3089);
    }

    final void method1000(boolean bool, int i) {
        if (bool)
            OpenGL.glEnable(32925);
        else
            OpenGL.glDisable(32925);
        anInt8693++;
        if (i > -115)
            q();
    }

    final void F(int i, int i_17_) {
        anInt8744++;
    }

    final void e(int i, int i_18_) throws Exception_Sub1 {
        anOpenGL8666.swapBuffers();
        anInt8684++;
    }

    final int I() {
        anInt8695++;
        return anInt8769;
    }

    final void method997(byte i) {
        Class211.aFloatArray2449[1] = ((ha_Sub3) this).aFloat6244 * ((ha_Sub3) this).aFloat6224;
        Class211.aFloatArray2449[0] = ((ha_Sub3) this).aFloat6244 * ((ha_Sub3) this).aFloat6185;
        anInt8694++;
        Class211.aFloatArray2449[2] = ((ha_Sub3) this).aFloat6244 * ((ha_Sub3) this).aFloat6202;
        Class211.aFloatArray2449[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, Class211.aFloatArray2449, 0);
        Class211.aFloatArray2449[0] = -((ha_Sub3) this).aFloat6249 * ((ha_Sub3) this).aFloat6185;
        Class211.aFloatArray2449[3] = 1.0F;
        if (i <= -92) {
            Class211.aFloatArray2449[2] = -((ha_Sub3) this).aFloat6249 * ((ha_Sub3) this).aFloat6202;
            Class211.aFloatArray2449[1] = ((ha_Sub3) this).aFloat6224 * -((ha_Sub3) this).aFloat6249;
            OpenGL.glLightfv(16385, 4609, Class211.aFloatArray2449, 0);
        }
    }

    final void method940(byte i) {
        anInt8654++;
        int i_19_ = -126 % ((i - 40) / 63);
        if (!((ha_Sub3) this).aBoolean6186) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
    }

    final Interface21_Impl2 method944(int i, int i_20_, boolean bool, Class264 class264, int i_21_, int i_22_, byte i_23_, float[] fs) {
        int i_24_ = 113 / ((i_23_ - -41) / 52);
        anInt8734++;
        if (aBoolean8766 || (Class343.method3508(i_22_, -31218) && Class343.method3508(i, -31218)))
            return new Class112_Sub1(this, class264, i_22_, i, bool, fs, i_21_, i_20_);
        if (aBoolean8768)
            return new Class112_Sub4(this, class264, i_22_, i, fs, i_21_, i_20_);
        Class112_Sub1 class112_sub1 = new Class112_Sub1(this, class264, Class228.aClass228_2577, Class136_Sub4.method1269(i_22_, (byte) -128), Class136_Sub4.method1269(i, (byte) -128));
        class112_sub1.method797(6408, fs, class264, i, 0, 0, i_21_, i_22_, i_20_);
        return class112_sub1;
    }

    final void u() {
        anInt8681++;
    }

    final Class185 method1005(byte i, Class194[] class194s) {
        anInt8731++;
        int i_25_ = 35 % ((i - -66) / 53);
        return new Class185_Sub1(class194s);
    }

    final void method1045(byte i) {
        if (i > -15)
            aBoolean8754 = false;
        anInt8713++;
    }

    final Object method1023(byte i, Canvas canvas) {
        if (i != 3)
            ((ha_Sub3_Sub1) this).aMapBuffer8758 = null;
        anInt8657++;
        long l = anOpenGL8666.prepareSurface(canvas);
        if ((l ^ 0xffffffffffffffffL) == 0L)
            throw new RuntimeException();
        return new Long(l);
    }

    final void method930(boolean bool, int i, int i_26_, Class280 class280) {
        if (i_26_ == 0) {
            OpenGL.glTexEnvi(8960, i + 34184, Class348.method3734(class280, i_26_ ^ ~0x3736));
            anInt8690++;
            OpenGL.glTexEnvi(8960, i + 34200, bool ? 771 : 770);
        }
    }

    final void method1006(Interface18_Impl2 interface18_impl2, Class14 class14, int i, int i_27_, int i_28_, int i_29_, int i_30_) {
        anInt8743++;
        if (i_30_ != -229)
            method944(-108, 4, false, null, -5, 63, (byte) -92, null);
        int i_31_;
        int i_32_;
        if (class14 != Class107.aClass14_1355) {
            if (Class214.aClass14_2470 == class14) {
                i_32_ = 3;
                i_31_ = 1 + i;
            } else if (class14 == OutputStream_Sub1.aClass14_86) {
                i_32_ = 4;
                i_31_ = 3 * i;
            } else if (Class14.aClass14_264 != class14) {
                if (class14 != Class58.aClass14_5079) {
                    i_32_ = 0;
                    i_31_ = i;
                } else {
                    i_31_ = i - -2;
                    i_32_ = 5;
                }
            } else {
                i_32_ = 6;
                i_31_ = i + 2;
            }
        } else {
            i_31_ = 2 * i;
            i_32_ = 1;
        }
        Class228 class228 = interface18_impl2.method49((byte) 81);
        Class275_Sub2 class275_sub2 = (Class275_Sub2) interface18_impl2;
        class275_sub2.method2846((byte) -67);
        OpenGL.glDrawElements(i_32_, i_31_, Class355.method3782(5126, class228), (class275_sub2.method2842((byte) -110) - -(long) (((Class228) class228).anInt2570 * i_27_)));
    }

    final synchronized void method1056(int i, int i_33_, int i_34_) {
        anInt8701++;
        Node_Sub37 class248_sub37 = new Node_Sub37(i_33_);
        ((Node) class248_sub37).id = (long) i;
        if (i_34_ != 0)
            method1049(false);
        aClass293_8737.method3109(class248_sub37, -109);
    }

    final Class167 c() {
        anInt8715++;
        int i = -1;
        if ((aString8770.indexOf("nvidia") ^ 0xffffffff) == 0) {
            if ((aString8770.indexOf("intel") ^ 0xffffffff) == 0) {
                if ((aString8770.indexOf("ati") ^ 0xffffffff) != 0)
                    i = 4098;
            } else
                i = 32902;
        } else
            i = 4318;
        return new Class167(i, "OpenGL", anInt8763, aString8765, 0L);
    }

    final void method1039(byte i) {
        anInt8685++;
        OpenGL.glActiveTexture(33984 - -((ha_Sub3) this).anInt6207);
        if (i != -13)
            method1048(false);
    }

    final void method969(int i) {
        OpenGL.glViewport(((ha_Sub3) this).anInt6225, ((ha_Sub3) this).anInt6250, ((ha_Sub3) this).anInt5986, ((ha_Sub3) this).anInt5955);
        anInt8732++;
        if (i != 26588)
            method971((byte) -84);
    }

    final void method1001(Canvas canvas, byte i, Object object) {
        if (i <= 33)
            method1017(102, 5, null, true, false);
        anInt8707++;
        Long var_long = (Long) object;
        anOpenGL8666.releaseSurface(canvas, var_long.longValue());
    }

    final void method1015(byte i) {
        if (i != 107)
            ((ha_Sub3_Sub1) this).anInt8759 = 21;
        anInt8674++;
        aBoolean8755 = false;
        method1059(false);
    }

    final void method931(int i, int i_35_, Interface18_Impl1 interface18_impl1) {
        aClass275_Sub1Array8752[i] = (Class275_Sub1) interface18_impl1;
        if (i_35_ != 8)
            c();
        anInt8714++;
    }

    final Class316 a(Class316 class316, Class316 class316_36_, float f, Class316 class316_37_) {
        anInt8682++;
        if (f < 0.5F)
            return class316;
        return class316_36_;
    }

    final Interface18_Impl2 method924(int i, boolean bool) {
        anInt8697++;
        if (i != -23469)
            return null;
        return new Class275_Sub2(this, Class228.aClass228_2574, bool);
    }

    final void method1048(boolean bool) {
        OpenGL.glScissor(((ha_Sub3) this).anInt6208 + ((ha_Sub3) this).anInt6225, -((ha_Sub3) this).anInt6154 + (((ha_Sub3) this).anInt6250 - -((ha_Sub3) this).anInt5955), ((ha_Sub3) this).anInt6167 + -((ha_Sub3) this).anInt6208, -((ha_Sub3) this).anInt6217 + ((ha_Sub3) this).anInt6154);
        if (bool == true)
            anInt8672++;
    }

    final void w() {
        OpenGL.glFinish();
        anInt8689++;
    }

    final void method975(int i) {
        OpenGL.glDepthMask(((ha_Sub3) this).aBoolean6188 && ((ha_Sub3) this).aBoolean6219);
        anInt8730++;
        if (i > -57)
            method975(26);
    }

    final void method982(int i) {
        int i_38_ = 66 / ((i - -35) / 49);
        anInt8667++;
        OpenGL.glMatrixMode(5890);
        if (((ha_Sub3) this).aClass34Array6216[((ha_Sub3) this).anInt6207] != Class341.aClass34_3971)
            OpenGL.glLoadMatrixf((((ha_Sub3) this).aClass238_Sub2Array6169[((ha_Sub3) this).anInt6207].method1901((byte) -110, Class327.aFloatArray3837)), 0);
        else
            OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    final void k() {
        anInt8719++;
    }

    final void method1021(byte i, int i_39_) {
        anInt8673++;
        if (i != -109)
            y();
    }

    final Interface21_Impl2 method956(int i, int[] is, int i_40_, boolean bool, int i_41_, int i_42_, int i_43_) {
        anInt8658++;
        if (i_43_ >= -29)
            return null;
        if (aBoolean8766 || (Class343.method3508(i_40_, -31218) && Class343.method3508(i_42_, -31218)))
            return new Class112_Sub1(this, i_40_, i_42_, bool, is, i, i_41_);
        if (!aBoolean8768) {
            Class112_Sub1 class112_sub1 = new Class112_Sub1(this, Class120.aClass264_1508, Class228.aClass228_2573, Class136_Sub4.method1269(i_40_, (byte) -128), Class136_Sub4.method1269(i_42_, (byte) -128));
            class112_sub1.method65(0, i_41_, 0, i, i_40_, is, i_42_, (byte) 74);
            return class112_sub1;
        }
        return new Class112_Sub4(this, i_40_, i_42_, is, i, i_41_);
    }

    final void method934(Class14 class14, int i, int i_44_, int i_45_) {
        anInt8706++;
        if (i_45_ != 0)
            method1017(4, 19, null, true, true);
        int i_46_;
        int i_47_;
        if (class14 == Class107.aClass14_1355) {
            i_47_ = 2 * i;
            i_46_ = 1;
        } else if (class14 != Class214.aClass14_2470) {
            if (OutputStream_Sub1.aClass14_86 == class14) {
                i_46_ = 4;
                i_47_ = i * 3;
            } else if (class14 != Class14.aClass14_264) {
                if (Class58.aClass14_5079 == class14) {
                    i_46_ = 5;
                    i_47_ = 2 + i;
                } else {
                    i_46_ = 0;
                    i_47_ = i;
                }
            } else {
                i_46_ = 6;
                i_47_ = i + 2;
            }
        } else {
            i_46_ = 3;
            i_47_ = i - -1;
        }
        OpenGL.glDrawArrays(i_46_, i_44_, i_47_);
    }

    final void a(int i, int i_48_, int i_49_, int i_50_) {
        anInt8741++;
    }

    final void GA(int i) {
        OpenGL.glClearColor((float) (i & 0xff0000) / 1.671168E7F, (float) (0xff00 & i) / 65280.0F, (float) (i & 0xff) / 255.0F, (float) (i >>> 950089848) / 255.0F);
        anInt8655++;
        OpenGL.glClear(16384);
    }

    final synchronized void method1057(int i, boolean bool) {
        anInt8738++;
        if (bool != true)
            aBoolean8766 = true;
        Node node = new Node();
        ((Node) node).id = (long) i;
        aClass293_8747.method3109(node, -110);
    }

    final float method959(int i) {
        if (i > -37)
            method1001(null, (byte) -110, null);
        anInt8663++;
        return 0.0F;
    }

    final void method939(int i) {
        this.method1003(22551);
        anInt8728++;
        int i_51_;
        for (i_51_ = 0; (i_51_ ^ 0xffffffff) > (((ha_Sub3) this).anInt6189 ^ 0xffffffff); i_51_++) {
            Node_Sub42 class248_sub42 = ((ha_Sub3) this).aClass248_Sub42Array6165[i_51_];
            int i_52_ = class248_sub42.method2626(false);
            int i_53_ = 16386 + i_51_;
            float f = class248_sub42.method2621((byte) 110) / 255.0F;
            Class211.aFloatArray2449[0] = (float) class248_sub42.method2620(Class316_Sub1.method3291(i, 97));
            Class211.aFloatArray2449[1] = (float) class248_sub42.method2624(-22096);
            Class211.aFloatArray2449[2] = (float) class248_sub42.method2625((byte) -79);
            Class211.aFloatArray2449[3] = 1.0F;
            OpenGL.glLightfv(i_53_, 4611, Class211.aFloatArray2449, 0);
            Class211.aFloatArray2449[0] = f * (float) Class112.method794(i_52_ >> -1601996368, 255);
            Class211.aFloatArray2449[1] = f * (float) (Class112.method794(i_52_, 65421) >> 2058230408);
            Class211.aFloatArray2449[2] = (float) Class112.method794(i_52_, 255) * f;
            Class211.aFloatArray2449[3] = 1.0F;
            OpenGL.glLightfv(i_53_, 4609, Class211.aFloatArray2449, 0);
            OpenGL.glLightf(i_53_, 4617, 1.0F / (float) (class248_sub42.method2628(-15) * class248_sub42.method2628(-53)));
            OpenGL.glEnable(i_53_);
        }
        for (/**/; (((ha_Sub3) this).anInt6227 ^ 0xffffffff) < (i_51_ ^ 0xffffffff); i_51_++)
            OpenGL.glDisable(i_51_ + 16386);
        super.method939(i);
    }

    final void method937(byte i) {
        OpenGL.glMatrixMode(5889);
        anInt8671++;
        if (i >= 104) {
            OpenGL.glLoadMatrixf(((ha_Sub3) this).aFloatArray6229, 0);
            OpenGL.glMatrixMode(5888);
        }
    }

    final void method1051(byte i) {
        OpenGL.glTexEnvi(8960, 34162, Class282_Sub6.method2945(122, (((ha_Sub3) this).aClass5Array6248[(((ha_Sub3) this).anInt6207)])));
        if (i >= 113)
            anInt8708++;
    }

    final void method947(boolean bool) {
        if (bool != true)
            method1032(8);
        if (((ha_Sub3) this).aBoolean6198)
            OpenGL.glEnable(3042);
        else
            OpenGL.glDisable(3042);
        anInt8717++;
    }

    final Interface21_Impl2 method967(int i, Class264 class264, int i_54_, int i_55_, Class228 class228) {
        if (i_54_ > -60)
            method1030(-127);
        anInt8742++;
        if (aBoolean8766 || (Class343.method3508(i_55_, -31218) && Class343.method3508(i, -31218)))
            return new Class112_Sub1(this, class264, class228, i_55_, i);
        if (!aBoolean8768)
            return new Class112_Sub1(this, class264, class228, Class136_Sub4.method1269(i_55_, (byte) -128), Class136_Sub4.method1269(i, (byte) -128));
        return new Class112_Sub4(this, class264, class228, i_55_, i);
    }

    final Interface18_Impl1 method1010(int i, boolean bool) {
        if (i < 32)
            ((ha_Sub3_Sub1) this).aBoolean8762 = true;
        anInt8703++;
        return new Class275_Sub1(this, bool);
    }

    final Interface21_Impl3 method938(byte i, boolean bool, int[][] is, int i_56_) {
        anInt8733++;
        if (i >= -97)
            method1005((byte) 55, null);
        return new Class112_Sub3(this, i_56_, bool, is);
    }

    final void p() {
        super.p();
        anInt8692++;
        if (anOpenGL8666 != null) {
            anOpenGL8666.a();
            anOpenGL8666.release();
            anOpenGL8666 = null;
        }
    }

    final void method921(boolean bool) {
        if (bool == true) {
            anInt8725++;
            if (((ha_Sub3) this).aBoolean6209 && ((ha_Sub3) this).aBoolean6235 && (((ha_Sub3) this).anInt6158 ^ 0xffffffff) <= -1)
                OpenGL.glEnable(2912);
            else
                OpenGL.glDisable(2912);
        }
    }

    final synchronized void method1058(byte i, long l) {
        if (i > -53)
            method997((byte) 30);
        anInt8696++;
        Node node = new Node();
        ((Node) node).id = l;
        aClass293_8748.method3109(node, -90);
    }

    final Interface21_Impl1 method1011(int i, int i_57_, byte[] is, Class264 class264, int i_58_, int i_59_) {
        if (i != 22302)
            a(true);
        anInt8723++;
        return new Class112_Sub2(this, class264, i_58_, i_59_, i_57_, is);
    }

    final void method999(int i, Class181 class181) {
        if (i > 107) {
            if (Class221.aClass181_2533 != class181) {
                int i_60_ = Class136_Sub3.method1260(84, class181);
                OpenGL.glTexGeni(8192, 9472, i_60_);
                OpenGL.glEnable(3168);
                OpenGL.glTexGeni(8193, 9472, i_60_);
                OpenGL.glEnable(3169);
                OpenGL.glTexGeni(8194, 9472, i_60_);
                OpenGL.glEnable(3170);
            } else {
                OpenGL.glDisable(3168);
                OpenGL.glDisable(3169);
                OpenGL.glDisable(3170);
            }
            anInt8739++;
        }
    }

    final void a(float f, float f_61_, float f_62_) {
        anInt8662++;
    }

    final void method1007(Object object, Canvas canvas, int i) {
        anInt8702++;
        Long var_long = (Long) object;
        anOpenGL8666.surfaceResized(var_long.longValue());
        int i_63_ = 69 / ((57 - i) / 58);
    }

    final void a(Interface14 interface14) {
        anInt8691++;
    }

    final void h() {
        anInt8721++;
        if ((((ha_Sub3) this).anInt5986 ^ 0xffffffff) < -1 || ((ha_Sub3) this).anInt5955 > 0) {
            int i = ((ha_Sub3) this).anInt6208;
            int i_64_ = ((ha_Sub3) this).anInt6167;
            int i_65_ = ((ha_Sub3) this).anInt6217;
            int i_66_ = ((ha_Sub3) this).anInt6154;
            this.la();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method998(-23496);
            this.method994(11073, false);
            this.method923(false, -8043);
            this.method1029(false, 23394);
            this.method950((byte) 36, false);
            this.method929(null, -8423);
            this.method962(-2, 78, false, false);
            this.method993((byte) 126, 1);
            this.method942(-129, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, ((ha_Sub3) this).anInt5986, ((ha_Sub3) this).anInt5955, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.KA(i, i_65_, i_64_, i_66_);
        }
    }

    final void method1038(boolean bool) {
        anInt8656++;
        if (Class337.aClass17_3932 != ((ha_Sub3) this).aClass17_6194) {
            if (((ha_Sub3) this).aClass17_6194 == Class330.aClass17_3854)
                OpenGL.glBlendFunc(1, 1);
            else if (Node_Sub9_Sub1.aClass17_9105 == ((ha_Sub3) this).aClass17_6194)
                OpenGL.glBlendFunc(774, 1);
        } else
            OpenGL.glBlendFunc(770, 771);
        if (bool != false)
            aBoolean8718 = true;
    }

    ha_Sub3_Sub1(OpenGL opengl, Canvas canvas, long l, d var_d, Class381 class381, int i) {
        super(canvas, new Long(l), var_d, class381, i, 1);
        ((ha_Sub3_Sub1) this).aMapBuffer8750 = new MapBuffer();
        ((ha_Sub3_Sub1) this).aMapBuffer8758 = new MapBuffer();
        anInt8769 = 0;
        try {
            anOpenGL8666 = opengl;
            anOpenGL8666.b();
            aString8770 = OpenGL.glGetString(7936).toLowerCase();
            aString8765 = OpenGL.glGetString(7937).toLowerCase();
            if ((aString8770.indexOf("microsoft") ^ 0xffffffff) != 0 || (aString8770.indexOf("brian paul") ^ 0xffffffff) != 0 || (aString8770.indexOf("mesa") ^ 0xffffffff) != 0)
                throw new RuntimeException("");
            String string = OpenGL.glGetString(7938);
            String[] strings = Class80.method583(94, string.replace('.', ' '), ' ');
            if ((strings.length ^ 0xffffffff) <= -3) {
                try {
                    int i_67_ = Class282_Sub21.method3012((byte) -119, strings[0]);
                    int i_68_ = Class282_Sub21.method3012((byte) -110, strings[1]);
                    anInt8763 = i_68_ + 10 * i_67_;
                } catch (NumberFormatException numberformatexception) {
                    throw new RuntimeException("");
                }
            } else
                throw new RuntimeException("");
            if (anInt8763 < 12)
                throw new RuntimeException("");
            if (!anOpenGL8666.a("GL_ARB_multitexture"))
                throw new RuntimeException("");
            if (!anOpenGL8666.a("GL_ARB_texture_env_combine"))
                throw new RuntimeException("");
            int[] is = new int[1];
            OpenGL.glGetIntegerv(34018, is, 0);
            ((ha_Sub3) this).anInt6236 = is[0];
            if ((((ha_Sub3) this).anInt6236 ^ 0xffffffff) > -3)
                throw new RuntimeException("");
            ((ha_Sub3) this).anInt6192 = 8;
            ((ha_Sub3_Sub1) this).aBoolean8760 = anOpenGL8666.a("GL_ARB_vertex_buffer_object");
            ((ha_Sub3) this).aBoolean6177 = anOpenGL8666.a("GL_ARB_multisample");
            aBoolean8768 = anOpenGL8666.a("GL_ARB_texture_rectangle");
            ((ha_Sub3) this).aBoolean6239 = anOpenGL8666.a("GL_ARB_texture_cube_map");
            aBoolean8766 = anOpenGL8666.a("GL_ARB_texture_non_power_of_two");
            ((ha_Sub3) this).aBoolean6233 = anOpenGL8666.a("GL_EXT_texture3D");
            ((ha_Sub3_Sub1) this).aBoolean8764 = anOpenGL8666.a("GL_ARB_vertex_shader");
            ((ha_Sub3_Sub1) this).aBoolean8762 = anOpenGL8666.a("GL_ARB_vertex_program");
            ((ha_Sub3_Sub1) this).aBoolean8761 = anOpenGL8666.a("GL_ARB_fragment_shader");
            anOpenGL8666.a("GL_ARB_fragment_program");
            ((ha_Sub3_Sub1) this).anIntArray8767 = new int[((ha_Sub3) this).anInt6236];
            ((ha_Sub3_Sub1) this).anInt8759 = !Stream.b() ? 5121 : 33639;
            if (aString8765.indexOf("radeon") != -1) {
                int i_69_ = 0;
                boolean bool = false;
                boolean bool_70_ = false;
                String[] strings_71_ = Class80.method583(31, aString8765.replace('/', ' '), ' ');
                for (int i_72_ = 0; strings_71_.length > i_72_; i_72_++) {
                    String string_73_ = strings_71_[i_72_];
                    try {
                        if (string_73_.length() > 0) {
                            if ((string_73_.charAt(0) ^ 0xffffffff) == -121 && string_73_.length() >= 3 && Class303.method3204(string_73_.substring(1, 3), 10)) {
                                string_73_ = string_73_.substring(1);
                                bool_70_ = true;
                            }
                            if (string_73_.equals("hd"))
                                bool = true;
                            else {
                                if (string_73_.startsWith("hd")) {
                                    bool = true;
                                    string_73_ = string_73_.substring(2);
                                }
                                if (string_73_.length() >= 4 && (Class303.method3204(string_73_.substring(0, 4), 10))) {
                                    i_69_ = (Class282_Sub21.method3012((byte) -109, string_73_.substring(0, 4)));
                                    break;
                                }
                            }
                        }
                    } catch (Exception exception) {
                        /* empty */
                    }
                }
                if (!bool_70_ && !bool) {
                    if (i_69_ >= 7000 && (i_69_ ^ 0xffffffff) >= -9251)
                        ((ha_Sub3) this).aBoolean6233 = false;
                    if ((i_69_ ^ 0xffffffff) <= -7001 && (i_69_ ^ 0xffffffff) >= -8000)
                        ((ha_Sub3_Sub1) this).aBoolean8760 = false;
                }
                aBoolean8768 &= anOpenGL8666.a("GL_ARB_half_float_pixel");
            }
            aString8770.indexOf("intel");
            if (((ha_Sub3_Sub1) this).aBoolean8760) {
                try {
                    int[] is_74_ = new int[1];
                    OpenGL.glGenBuffersARB(1, is_74_, 0);
                } catch (Throwable throwable) {
                    throw new RuntimeException("");
                }
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.method819(104);
            throw new RuntimeException("");
        }
    }

    final void method971(byte i) {
        anInt8705++;
        if (((ha_Sub3) this).aBoolean6252 && !((ha_Sub3) this).aBoolean6222)
            OpenGL.glEnable(2896);
        else
            OpenGL.glDisable(2896);
        if (i < 102)
            aClass275_Sub1Array8752 = null;
    }

    final Interface2 a(int i, int i_75_) {
        anInt8678++;
        return null;
    }

    final void method1017(int i, int i_76_, Class280 class280, boolean bool, boolean bool_77_) {
        OpenGL.glTexEnvi(8960, 34176 - -i_76_, Class348.method3734(class280, i ^ 0x1425));
        if (i != -8980)
            method1039((byte) -2);
        anInt8716++;
        if (!bool_77_)
            OpenGL.glTexEnvi(8960, i_76_ + 34192, bool ? 769 : 768);
        else
            OpenGL.glTexEnvi(8960, 34192 + i_76_, !bool ? 770 : 771);
    }

    final void method960(boolean bool) {
        if (bool != true)
            aBoolean8753 = false;
        Class211.aFloatArray2449[1] = ((ha_Sub3) this).aFloat6170 * ((ha_Sub3) this).aFloat6224;
        Class211.aFloatArray2449[0] = ((ha_Sub3) this).aFloat6185 * ((ha_Sub3) this).aFloat6170;
        anInt8720++;
        Class211.aFloatArray2449[3] = 1.0F;
        Class211.aFloatArray2449[2] = ((ha_Sub3) this).aFloat6202 * ((ha_Sub3) this).aFloat6170;
        OpenGL.glLightModelfv(2899, Class211.aFloatArray2449, 0);
    }

    final void method1032(int i) {
        anInt8729++;
        int i_78_ = ((ha_Sub3_Sub1) this).anIntArray8767[((ha_Sub3) this).anInt6207];
        if (i_78_ != 0) {
            ((ha_Sub3_Sub1) this).anIntArray8767[((ha_Sub3) this).anInt6207] = 0;
            OpenGL.glBindTexture(i_78_, 0);
            OpenGL.glDisable(i_78_);
        }
        if (i <= 91)
            method954((byte) 47);
    }

    final Class340 method941(int i, int i_79_) {
        if (i_79_ != 6)
            return null;
        anInt8675++;
        int i_80_ = i;
        while_132_:
        do {
            do {
                if ((i_80_ ^ 0xffffffff) != -4) {
                    if ((i_80_ ^ 0xffffffff) != -5) {
                        if (i_80_ == 8)
                            break;
                        break while_132_;
                    }
                } else
                    return new Class340_Sub7(this, ((ha_Sub3) this).aClass381_6108);
                return new Class340_Sub9(this, ((ha_Sub3) this).aClass381_6108, ((ha_Sub3) this).aClass370_6127);
            } while (false);
            return new Class340_Sub8(this, ((ha_Sub3) this).aClass381_6108, ((ha_Sub3) this).aClass370_6127);
        } while (false);
        return super.method941(i, 6);
    }

    final boolean y() {
        anInt8726++;
        return false;
    }

    final void method1004(Class185 class185, byte i) {
        anInt8704++;
        Class194[] class194s = ((Class185_Sub1) (Class185_Sub1) class185).aClass194Array6650;
        int i_81_ = 0;
        boolean bool = false;
        if (i != -15)
            aBoolean8755 = false;
        boolean bool_82_ = false;
        boolean bool_83_ = false;
        for (int i_84_ = 0; (i_84_ ^ 0xffffffff) > (class194s.length ^ 0xffffffff); i_84_++) {
            Class194 class194 = class194s[i_84_];
            Class275_Sub1 class275_sub1 = aClass275_Sub1Array8752[i_84_];
            int i_85_ = 0;
            int i_86_ = class275_sub1.method2851((byte) -109);
            long l = class275_sub1.method2842((byte) -110);
            class275_sub1.method2846((byte) -67);
            for (int i_87_ = 0; ((class194.method1659((byte) -98) ^ 0xffffffff) < (i_87_ ^ 0xffffffff)); i_87_++) {
                Class89 class89 = class194.method1661(i ^ 0x6086, i_87_);
                if (Class89.aClass89_1097 == class89) {
                    bool_83_ = true;
                    OpenGL.glVertexPointer(3, 5126, i_86_, (long) i_85_ + l);
                } else if (Class89.aClass89_1098 == class89) {
                    bool_82_ = true;
                    OpenGL.glNormalPointer(5126, i_86_, (long) i_85_ + l);
                } else if (Class89.aClass89_1099 != class89) {
                    if (Class89.aClass89_1100 == class89) {
                        OpenGL.glClientActiveTexture(i_81_++ + 33984);
                        OpenGL.glTexCoordPointer(1, 5126, i_86_, l + (long) i_85_);
                    } else if (Class89.aClass89_1101 != class89) {
                        if (Class89.aClass89_1102 == class89) {
                            OpenGL.glClientActiveTexture(i_81_++ + 33984);
                            OpenGL.glTexCoordPointer(3, 5126, i_86_, (long) i_85_ + l);
                        } else if (class89 == Class89.aClass89_1103) {
                            OpenGL.glClientActiveTexture(33984 - -i_81_++);
                            OpenGL.glTexCoordPointer(4, 5126, i_86_, l + (long) i_85_);
                        }
                    } else {
                        OpenGL.glClientActiveTexture(i_81_++ + 33984);
                        OpenGL.glTexCoordPointer(2, 5126, i_86_, (long) i_85_ + l);
                    }
                } else {
                    OpenGL.glColorPointer(4, 5121, i_86_, (long) i_85_ + l);
                    bool = true;
                }
                i_85_ += ((Class89) class89).anInt1093;
            }
        }
        if (bool_83_ != aBoolean8754) {
            if (bool_83_)
                OpenGL.glEnableClientState(32884);
            else
                OpenGL.glDisableClientState(32884);
            aBoolean8754 = bool_83_;
        }
        if (!aBoolean8751 == bool_82_) {
            if (bool_82_)
                OpenGL.glEnableClientState(32885);
            else
                OpenGL.glDisableClientState(32885);
            aBoolean8751 = bool_82_;
        }
        if (aBoolean8753 != bool) {
            if (bool)
                OpenGL.glEnableClientState(32886);
            else
                OpenGL.glDisableClientState(32886);
            aBoolean8753 = bool;
        }
        if (i_81_ <= anInt8757) {
            if ((i_81_ ^ 0xffffffff) > (anInt8757 ^ 0xffffffff)) {
                for (int i_88_ = i_81_; i_88_ < anInt8757; i_88_++) {
                    OpenGL.glClientActiveTexture(i_88_ + 33984);
                    OpenGL.glDisableClientState(32888);
                }
                anInt8757 = i_81_;
            }
        } else {
            for (int i_89_ = anInt8757; (i_81_ ^ 0xffffffff) < (i_89_ ^ 0xffffffff); i_89_++) {
                OpenGL.glClientActiveTexture(i_89_ + 33984);
                OpenGL.glEnableClientState(32888);
            }
            anInt8757 = i_81_;
        }
    }

    final void method1030(int i) {
        anInt8699++;
        int i_90_ = 41 % ((i - 35) / 36);
        if (!((ha_Sub3) this).aBoolean6226)
            OpenGL.glDisable(3008);
        else
            OpenGL.glEnable(3008);
    }

    final Interface14 a(Interface13 interface13, Interface2 interface2) {
        anInt8676++;
        return null;
    }

    final Interface21_Impl2 method996(int i, boolean bool, int i_91_, int i_92_, byte[] is, Class264 class264, int i_93_, int i_94_) {
        anInt8661++;
        if (i_94_ >= -91)
            return null;
        if (!aBoolean8766 && (!Class343.method3508(i_91_, -31218) || !Class343.method3508(i_93_, -31218))) {
            if (aBoolean8768)
                return new Class112_Sub4(this, class264, i_91_, i_93_, is, i_92_, i);
            Class112_Sub1 class112_sub1 = new Class112_Sub1(this, class264, Class228.aClass228_2573, Class136_Sub4.method1269(i_91_, (byte) -128), Class136_Sub4.method1269(i_93_, (byte) -128));
            class112_sub1.method68(i, class264, i_91_, (byte) -118, i_92_, 0, i_93_, 0, is);
            return class112_sub1;
        }
        return new Class112_Sub1(this, class264, i_91_, i_93_, bool, is, i_92_, i);
    }

    final void method965(byte i) {
        anInt8735++;
        OpenGL.glLightfv(16384, 4611, ((ha_Sub3) this).aFloatArray6182, 0);
        OpenGL.glLightfv(16385, 4611, ((ha_Sub3) this).aFloatArray6195, 0);
        if (i != -124)
            aClass275_Sub1Array8752 = null;
    }

    private final void method1059(boolean bool) {
        anInt8700++;
        if (aBoolean8749)
            OpenGL.glPopMatrix();
        if (bool != false)
            aBoolean8753 = false;
        if (!((ha_Sub3) this).aClass31_6234.method268((byte) 0)) {
            if (((ha_Sub3) this).aBoolean6138) {
                OpenGL.glLoadIdentity();
                aBoolean8749 = false;
            } else {
                OpenGL.glLoadMatrixf(((ha_Sub3) this).aClass238_Sub2_6141.method1901((byte) 89, Class327.aFloatArray3837), 0);
                aBoolean8749 = false;
            }
        } else {
            if (!aBoolean8755) {
                OpenGL.glLoadMatrixf(((ha_Sub3) this).aClass238_Sub2_6149.method1901((byte) -119, Class327.aFloatArray3837), 0);
                aBoolean8755 = true;
                method965((byte) -124);
                method939(0);
            }
            if (((ha_Sub3) this).aBoolean6138)
                aBoolean8749 = false;
            else {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(((ha_Sub3) this).aClass238_Sub2_6141.method1901((byte) -125, Class327.aFloatArray3837), 0);
                aBoolean8749 = true;
            }
        }
    }

    final void method1037(boolean bool) {
        if (bool != false)
            j(-93);
        anInt8688++;
        OpenGL.glTexEnvi(8960, 34161, Class282_Sub6.method2945(122, (((ha_Sub3) this).aClass5Array6179[(((ha_Sub3) this).anInt6207)])));
    }
}
