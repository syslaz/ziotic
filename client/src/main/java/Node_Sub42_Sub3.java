/* Class248_Sub42_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub42_Sub3 extends Node_Sub42 {
    static int anInt9790;
    static int anInt9791;
    static IncommingOpcode aIncommingOpcode_9792;
    static int anInt9793;
    static boolean aBoolean9794 = false;
    static int anInt9795;

    public static void method2636(int i) {
        aIncommingOpcode_9792 = null;
        if (i >= -89)
            aBoolean9794 = true;
    }

    static final Class236 method2637(int i, int i_0_) {
        anInt9791++;
        Class236 class236 = ((Class236) Class225_Sub1_Sub1.aClass278_9982.method2863(4, (long) i_0_));
        if (class236 != null)
            return class236;
        byte[] is = Class122.aClass381_1519.method3922((byte) 114, i, i_0_);
        class236 = new Class236();
        if (is != null)
            class236.method1850(new ByteStream(is), i_0_, i);
        Class225_Sub1_Sub1.aClass278_9982.method2867((byte) 0, (long) i_0_, class236);
        return class236;
    }

    Node_Sub42_Sub3(int i, int i_1_, int i_2_, int i_3_, int i_4_, float f) {
        super(i, i_1_, i_2_, i_3_, i_4_, f);
    }

    final void method2622(int i, int i_5_, int i_6_, int i_7_) {
        ((Node_Sub42) this).anInt7296 = i_6_;
        ((Node_Sub42) this).anInt7291 = i_5_;
        ((Node_Sub42) this).anInt7298 = i;
        anInt9790++;
        if (i_7_ != -13470)
            aIncommingOpcode_9792 = null;
    }

    final void method2627(float f, int i) {
        if (i == 2683) {
            ((Node_Sub42) this).aFloat7300 = f;
            anInt9795++;
        }
    }

    static {
        aIncommingOpcode_9792 = new IncommingOpcode(83, 10);
    }
}
