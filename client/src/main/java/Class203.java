/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.awt.*;

final class Class203 {
    int anInt2303 = 0;
    static Class381 aClass381_2304;
    int anInt2305 = 0;
    int anInt2306;
    static int anInt2307;
    static int anInt2308;
    Runnable aRunnable2309;
    boolean aBoolean2310 = false;
    int anInt2311 = 0;
    int anInt2312;
    static int anInt2313;
    static int anInt2314;
    boolean aBoolean2315;
    boolean aBoolean2316;
    private ha_Sub1 aHa_Sub1_2317;
    Class238_Sub1 aClass238_Sub1_2318;
    Class162_Sub3 aClass162_Sub3_2319;
    Class162_Sub3 aClass162_Sub3_2320;
    int[] anIntArray2321;
    int[] anIntArray2322;
    int anInt2323;
    int[] anIntArray2324;
    Class162_Sub3 aClass162_Sub3_2325;
    int[] anIntArray2326;
    int[] anIntArray2327;
    int[] anIntArray2328;
    int[] anIntArray2329;
    float[] aFloatArray2330;
    int[] anIntArray2331;
    Class162_Sub3 aClass162_Sub3_2332;
    Class162_Sub3 aClass162_Sub3_2333;
    int[] anIntArray2334;
    int[] anIntArray2335;
    int[] anIntArray2336;
    int[] anIntArray2337;
    Class162_Sub3 aClass162_Sub3_2338;
    Class162_Sub3 aClass162_Sub3_2339;
    int[] anIntArray2340;
    int[] anIntArray2341;
    int[] anIntArray2342;
    int[] anIntArray2343;
    Class162_Sub3 aClass162_Sub3_2344;
    Class244 aClass244_2345;
    int anInt2346;
    int anInt2347;
    int[] anIntArray2348;
    int[] anIntArray2349;
    int[] anIntArray2350;
    int[] anIntArray2351;
    static int anInt2352;
    Class162_Sub3 aClass162_Sub3_2353;
    Class162_Sub3 aClass162_Sub3_2354;
    int[] anIntArray2355;

    static final Node_Sub8_Sub10 method1684(int i) {
        anInt2313++;
        if (i != 31638)
            method1686((byte) -83);
        Node_Sub8_Sub10 class248_sub8_sub10 = (Node_Sub8_Sub10) Class241.aClass64_2691.method492(896);
        if (class248_sub8_sub10 != null) {
            class248_sub8_sub10.remove(true);
            class248_sub8_sub10.method2021((byte) -26);
            return class248_sub8_sub10;
        }
        do {
            class248_sub8_sub10 = (Node_Sub8_Sub10) Class321.aClass64_3739.method492(896);
            if (class248_sub8_sub10 == null)
                return null;
            if (class248_sub8_sub10.method2082(true) > Class118.method1112(116))
                return null;
            class248_sub8_sub10.remove(true);
            class248_sub8_sub10.method2021((byte) -26);
        } while ((((Node_Sub8) class248_sub8_sub10).aLong6870 & ~0x7fffffffffffffffL) == 0L);
        return class248_sub8_sub10;
    }

    static final ha method1685(byte i, Class381 class381, d var_d, Canvas canvas, int i_0_) {
        anInt2307++;
        if (!Node_Sub42_Sub1.method2629(-51))
            throw new RuntimeException("");
        if (!Class111.method776(-99, "jaggl"))
            throw new RuntimeException("");
        OpenGL opengl = new OpenGL();
        long l = opengl.init(canvas, 8, 8, 8, 24, 0, i_0_);
        if ((l ^ 0xffffffffffffffffL) == -1L)
            throw new RuntimeException("");
        if (i != -104)
            aClass381_2304 = null;
        ha_Sub3_Sub1 var_ha_Sub3_Sub1 = new ha_Sub3_Sub1(opengl, canvas, l, var_d, class381, i_0_);
        var_ha_Sub3_Sub1.method988(false);
        return var_ha_Sub3_Sub1;
    }

    public static void method1686(byte i) {
        if (i == -58)
            aClass381_2304 = null;
    }

    final void method1687(int i) {
        anInt2308++;
        if (i != 0)
            method1686((byte) 72);
        ((Class203) this).aClass244_2345 = new Class244(aHa_Sub1_2317, this);
    }

    final void method1688(int i, Runnable runnable) {
        anInt2352++;
        if (i != 8)
            method1685((byte) 5, null, null, null, -33);
        ((Class203) this).aRunnable2309 = runnable;
    }

    Class203(ha_Sub1 var_ha_Sub1) {
        ((Class203) this).anInt2306 = 0;
        ((Class203) this).aBoolean2316 = true;
        ((Class203) this).aClass238_Sub1_2318 = new Class238_Sub1();
        ((Class203) this).anIntArray2329 = new int[Class162_Sub3.anInt6617];
        ((Class203) this).anIntArray2324 = new int[64];
        ((Class203) this).aFloatArray2330 = new float[2];
        ((Class203) this).anIntArray2326 = new int[10];
        ((Class203) this).anIntArray2331 = new int[8];
        ((Class203) this).anIntArray2334 = new int[64];
        ((Class203) this).anIntArray2328 = new int[64];
        ((Class203) this).anIntArray2342 = new int[10000];
        ((Class203) this).anIntArray2336 = new int[64];
        ((Class203) this).anIntArray2335 = new int[10000];
        ((Class203) this).anIntArray2343 = new int[Class162_Sub3.anInt6617];
        ((Class203) this).anIntArray2327 = new int[Class162_Sub3.anInt6617];
        ((Class203) this).anIntArray2340 = new int[8];
        ((Class203) this).anIntArray2337 = new int[8];
        ((Class203) this).anIntArray2349 = new int[10];
        ((Class203) this).anIntArray2351 = new int[10];
        ((Class203) this).anIntArray2321 = new int[Class162_Sub3.anInt6617];
        ((Class203) this).anIntArray2348 = new int[Class162_Sub3.anInt6617];
        ((Class203) this).anIntArray2350 = new int[10];
        ((Class203) this).anIntArray2341 = new int[Class162_Sub3.anInt6617];
        ((Class203) this).anIntArray2355 = new int[Class162_Sub3.anInt6617];
        aHa_Sub1_2317 = var_ha_Sub1;
        ((Class203) this).anInt2312 = -255 + ((ha_Sub1) aHa_Sub1_2317).anInt5547;
        ((Class203) this).aClass244_2345 = new Class244(var_ha_Sub1, this);
        ((Class203) this).aClass162_Sub3_2354 = new Class162_Sub3(aHa_Sub1_2317);
        ((Class203) this).aClass162_Sub3_2333 = new Class162_Sub3(aHa_Sub1_2317);
        ((Class203) this).aClass162_Sub3_2319 = new Class162_Sub3(aHa_Sub1_2317);
        ((Class203) this).aClass162_Sub3_2320 = new Class162_Sub3(aHa_Sub1_2317);
        ((Class203) this).aClass162_Sub3_2325 = new Class162_Sub3(aHa_Sub1_2317);
        ((Class203) this).aClass162_Sub3_2353 = new Class162_Sub3(aHa_Sub1_2317);
        ((Class203) this).aClass162_Sub3_2339 = new Class162_Sub3(aHa_Sub1_2317);
        ((Class203) this).aClass162_Sub3_2344 = new Class162_Sub3(aHa_Sub1_2317);
        ((Class203) this).aClass162_Sub3_2332 = new Class162_Sub3(aHa_Sub1_2317);
        ((Class203) this).aClass162_Sub3_2338 = new Class162_Sub3(aHa_Sub1_2317);
        ((Class203) this).anIntArray2322 = new int[Class162_Sub3.anInt6620];
        for (int i = 0; (i ^ 0xffffffff) > (Class162_Sub3.anInt6620 ^ 0xffffffff); i++)
            ((Class203) this).anIntArray2322[i] = -1;
    }
}
