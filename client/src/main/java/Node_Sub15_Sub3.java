/* Class248_Sub15_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub15_Sub3 extends Node_Sub15 {
    private Class293 aClass293_9690 = new Class293();
    private Class293 aClass293_9691 = new Class293();
    private int anInt9692 = 0;
    private int anInt9693 = -1;

    private final void method2483(Node_Sub17 class248_sub17) {
        class248_sub17.remove(true);
        class248_sub17.method2508();
        Node node = (((Node) ((Class293) aClass293_9691).aNode_3434).prev);
        if (node == ((Class293) aClass293_9691).aNode_3434)
            anInt9693 = -1;
        else
            anInt9693 = ((Node_Sub17) (Node_Sub17) node).anInt6999;
    }

    final Node_Sub15 method2401() {
        return (Node_Sub15) aClass293_9690.method3119(2);
    }

    private final void method2484(int[] is, int i, int i_0_) {
        for (Node_Sub15 class248_sub15 = (Node_Sub15) aClass293_9690.method3119(2); class248_sub15 != null; class248_sub15 = (Node_Sub15) aClass293_9690.method3107(-127))
            class248_sub15.method2403(is, i, i_0_);
    }

    final synchronized void method2485(Node_Sub15 class248_sub15) {
        aClass293_9690.method3111(class248_sub15, 593);
    }

    final int method2405() {
        return 0;
    }

    final synchronized int method2486() {
        return aClass293_9690.method3112(0);
    }

    final synchronized void method2400(int[] is, int i, int i_1_) {
        do {
            if (anInt9693 < 0) {
                method2484(is, i, i_1_);
                break;
            }
            if (anInt9692 + i_1_ < anInt9693) {
                anInt9692 += i_1_;
                method2484(is, i, i_1_);
                break;
            }
            int i_2_ = anInt9693 - anInt9692;
            method2484(is, i, i_2_);
            i += i_2_;
            i_1_ -= i_2_;
            anInt9692 += i_2_;
            method2490();
            Node_Sub17 class248_sub17 = (Node_Sub17) aClass293_9691.method3119(2);
            synchronized (class248_sub17) {
                int i_3_ = class248_sub17.method2507(this);
                if (i_3_ < 0) {
                    ((Node_Sub17) class248_sub17).anInt6999 = 0;
                    method2483(class248_sub17);
                } else {
                    ((Node_Sub17) class248_sub17).anInt6999 = i_3_;
                    method2488(((Node) class248_sub17).prev, class248_sub17);
                }
            }
        } while (i_1_ != 0);
    }

    private final void method2487(int i) {
        for (Node_Sub15 class248_sub15 = (Node_Sub15) aClass293_9690.method3119(2); class248_sub15 != null; class248_sub15 = (Node_Sub15) aClass293_9690.method3107(-127))
            class248_sub15.method2404(i);
    }

    private final void method2488(Node node, Node_Sub17 class248_sub17) {
        for (/**/; (node != ((Class293) aClass293_9691).aNode_3434 && (((Node_Sub17) (Node_Sub17) node).anInt6999 <= ((Node_Sub17) class248_sub17).anInt6999)); node = ((Node) node).prev) {
            /* empty */
        }
        Class346.method3537(node, (byte) 83, class248_sub17);
        anInt9693 = ((Node_Sub17) (Node_Sub17) (((Node) ((Class293) aClass293_9691).aNode_3434).prev)).anInt6999;
    }

    final synchronized void method2404(int i) {
        do {
            if (anInt9693 < 0) {
                method2487(i);
                break;
            }
            if (anInt9692 + i < anInt9693) {
                anInt9692 += i;
                method2487(i);
                break;
            }
            int i_4_ = anInt9693 - anInt9692;
            method2487(i_4_);
            i -= i_4_;
            anInt9692 += i_4_;
            method2490();
            Node_Sub17 class248_sub17 = (Node_Sub17) aClass293_9691.method3119(2);
            synchronized (class248_sub17) {
                int i_5_ = class248_sub17.method2507(this);
                if (i_5_ < 0) {
                    ((Node_Sub17) class248_sub17).anInt6999 = 0;
                    method2483(class248_sub17);
                } else {
                    ((Node_Sub17) class248_sub17).anInt6999 = i_5_;
                    method2488(((Node) class248_sub17).prev, class248_sub17);
                }
            }
        } while (i != 0);
    }

    final synchronized void method2489(Node_Sub15 class248_sub15) {
        class248_sub15.remove(true);
    }

    final Node_Sub15 method2399() {
        return (Node_Sub15) aClass293_9690.method3107(-128);
    }

    private final void method2490() {
        if (anInt9692 > 0) {
            for (Node_Sub17 class248_sub17 = (Node_Sub17) aClass293_9691.method3119(2); class248_sub17 != null; class248_sub17 = (Node_Sub17) aClass293_9691.method3107(-128))
                ((Node_Sub17) class248_sub17).anInt6999 -= anInt9692;
            anInt9693 -= anInt9692;
            anInt9692 = 0;
        }
    }

    public Node_Sub15_Sub3() {
        /* empty */
    }
}
