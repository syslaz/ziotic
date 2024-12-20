/* Class248_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub13 extends Node {
    Class293 aClass293_6966 = new Class293();
    static Class381 aClass381_6967;
    static int anInt6968;
    static OutgoingOpcode aOutgoingOpcode_6969 = new OutgoingOpcode(15, -1);
    static int anInt6970;
    static boolean aBoolean6971;
    static Class278 aClass278_6972 = new Class278(8);
    static int anInt6973;

    public static void method2259(int i) {
        aClass278_6972 = null;
        aClass381_6967 = null;
        int i_0_ = 97 % ((i - -20) / 36);
        aOutgoingOpcode_6969 = null;
    }

    static final int method2260(int i, int i_1_, int i_2_) {
        if (i != 27908)
            return 37;
        anInt6968++;
        if (i_2_ > i_1_) {
            int i_3_ = i_1_;
            i_1_ = i_2_;
            i_2_ = i_3_;
        }
        int i_4_;
        for (/**/; (i_2_ ^ 0xffffffff) != -1; i_2_ = i_4_) {
            i_4_ = i_1_ % i_2_;
            i_1_ = i_2_;
        }
        return i_1_;
    }

    static final void method2261(int i) {
        if (i != 7951)
            method2262(null, false, false);
        anInt6970++;
        for (Node_Sub30 class248_sub30 = (Node_Sub30) Class225_Sub2.aClass293_8466.method3119(2); class248_sub30 != null; class248_sub30 = (Node_Sub30) Class225_Sub2.aClass293_8466.method3107(-127)) {
            if (!((Node_Sub30) class248_sub30).aBoolean7189) {
                ((Node_Sub30) class248_sub30).aBoolean7180 = true;
                if (((((Node_Sub30) class248_sub30).anInt7187 ^ 0xffffffff) <= -1) && ((Node_Sub30) class248_sub30).anInt7190 >= 0 && (Node_Sub8_Sub4.anInt8360 > ((Node_Sub30) class248_sub30).anInt7187) && (Node_Sub22.anInt7074 > ((Node_Sub30) class248_sub30).anInt7190))
                    Class124.method1140(class248_sub30, false);
            } else
                class248_sub30.remove(true);
        }
        for (Node_Sub30 class248_sub30 = ((Node_Sub30) IOException_Sub1.aClass293_82.method3119(i + -7949)); class248_sub30 != null; class248_sub30 = (Node_Sub30) IOException_Sub1.aClass293_82.method3107(-128)) {
            if (((Node_Sub30) class248_sub30).aBoolean7189)
                class248_sub30.remove(true);
            else
                ((Node_Sub30) class248_sub30).aBoolean7180 = true;
        }
    }

    static final void method2262(Interactable interactable, boolean bool, boolean bool_5_) {
        ((Interactable) interactable).aBoolean8310 = bool_5_;
        if (Class252.aBoolean2841) {
            if (bool)
                Class345.aClass344Array4093[Class345.aClass344Array4093.length - 1].method3515(false, interactable);
            else {
                int i = Class126.method1153(((Interactable) interactable).anInt8307);
                int i_6_ = (Class121.anIntArray1514[2] * interactable.method3567((byte) 100) / ((Interactable) interactable).anInt8316);
                int i_7_ = Class126.method1153((((Interactable) interactable).anInt8307) - i_6_);
                int i_8_ = Class126.method1153((((Interactable) interactable).anInt8307) + i_6_);
                if (i_7_ == i_8_)
                    Class345.aClass344Array4093[i].method3515(false, interactable);
                else if (i_8_ - i_7_ == 1)
                    Class345.aClass344Array4093[Viewport.anInt2651 + i_7_].method3515(false, interactable);
                else
                    Class345.aClass344Array4093[Class345.aClass344Array4093.length - 1].method3515(false, interactable);
            }
        } else
            Node_Sub29.method2559(interactable, Class206.aClass248_Sub42Array4986);
    }

    public Node_Sub13() {
        /* empty */
    }
}
