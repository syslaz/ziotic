/* Class248_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Node_Sub15 extends Node {
    int anInt6994;
    Node_Sub15 aClass248_Sub15_6995;
    Node_Sub31 aClass248_Sub31_6996;
    volatile boolean aBoolean6997 = true;

    abstract Node_Sub15 method2399();

    abstract void method2400(int[] is, int i, int i_0_);

    abstract Node_Sub15 method2401();

    int method2402() {
        return 255;
    }

    final void method2403(int[] is, int i, int i_1_) {
        if (((Node_Sub15) this).aBoolean6997)
            method2400(is, i, i_1_);
        else
            method2404(i_1_);
    }

    abstract void method2404(int i);

    public Node_Sub15() {
        /* empty */
    }

    abstract int method2405();
}
