/* Class252 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.io.FileOutputStream;

final class Class252 {
    static int anInt2837;
    static float[] aFloatArray2838 = new float[16384];
    static float[] aFloatArray2839 = new float[16384];
    static FileOutputStream aFileOutputStream2840;
    static boolean aBoolean2841;
    static IncommingOpcode aIncommingOpcode_2842;
    static int anInt2843;
    static int[] anIntArray2844;

    public static void method2716(int i) {
        aFloatArray2839 = null;
        if (i == 0) {
            aFileOutputStream2840 = null;
            aIncommingOpcode_2842 = null;
            anIntArray2844 = null;
            aFloatArray2838 = null;
        }
    }

    static final ha method2717(d var_d, boolean bool, int i, Canvas canvas) {
        if (bool != false)
            method2717(null, true, -20, null);
        anInt2837++;
        return new ha_Sub2(canvas, var_d, i);
    }

    static {
        double d = 3.834951969714103E-4;
        for (int i = 0; (i ^ 0xffffffff) > -16385; i++) {
            aFloatArray2839[i] = (float) Math.sin(d * (double) i);
            aFloatArray2838[i] = (float) Math.cos(d * (double) i);
        }
        aBoolean2841 = false;
        aIncommingOpcode_2842 = new IncommingOpcode(93, 10);
        anInt2843 = 0;
        anIntArray2844 = new int[]{32, 39, 44, 47};
    }
}
