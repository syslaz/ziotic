/* Class258 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class258 implements Runnable {
    static int anInt2946;
    volatile boolean aBoolean2947;
    volatile Class345[] aClass345Array2948 = new Class345[2];
    static int anInt2949;
    static OutgoingOpcode aOutgoingOpcode_2950 = new OutgoingOpcode(71, 8);
    static int anInt2951;
    volatile boolean aBoolean2952 = false;
    static int anInt2953;
    Class174 aClass174_2954;
    static float aFloat2955 = 0.25F;

    static final void method2756(int i, int i_0_, int i_1_, boolean bool) {
        anInt2951++;
        if (bool != false)
            method2756(-77, 90, 57, true);
        String string = ("tele " + i_1_ + "," + (i_0_ >> -361792666) + "," + (i >> -1287005754) + "," + (i_0_ & 0x3f) + "," + (0x3f & i));
        System.out.println(string);
        Node_Sub38.method2596(bool, true, false, string);
    }

    public static void method2757(int i) {
        aOutgoingOpcode_2950 = null;
        if (i != -3)
            method2757(126);
    }

    public final void run() {
        anInt2949++;
        ((Class258) this).aBoolean2947 = true;
        try {
            while (!((Class258) this).aBoolean2952) {
                for (int i = 0; (i ^ 0xffffffff) > -3; i++) {
                    Class345 class345 = ((Class258) this).aClass345Array2948[i];
                    if (class345 != null)
                        class345.method3529(0);
                }
                Class279_Sub2.method2897((byte) -124, 10L);
                Node_Sub18.method2511(((Class258) this).aClass174_2954, 0, null);
            }
        } catch (Exception exception) {
            Class282_Sub14.method2975(null, exception, 1);
        } finally {
            ((Class258) this).aBoolean2947 = false;
        }
    }

    Class258() {
        ((Class258) this).aBoolean2947 = false;
    }
}
