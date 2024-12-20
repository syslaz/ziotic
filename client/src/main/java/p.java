/* p - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class p extends Node implements Interface8 {
    long nativeid;
    private static boolean aBoolean4864 = false;
    int anInt4865;
    Canvas aCanvas4866;
    private static long aLong4867;
    int anInt4868;

    final void method2583(Rectangle[] rectangles, int i, int i_0_, int i_1_) {
        try {
            synchronized (((p) this).aCanvas4866.getTreeLock()) {
                for (int i_2_ = 0; i_2_ < i; i_2_++) {
                    Rectangle rectangle = rectangles[i_2_];
                    if (rectangle.width > 0 && rectangle.height > 0)
                        K(rectangle.x, rectangle.y, rectangle.width, rectangle.height, i_0_, i_1_);
                }
                aBoolean4864 = false;
            }
        } catch (Exception exception) {
            method2584(exception);
        }
    }

    private final void method2584(Exception exception) {
        if (!aBoolean4864) {
            aLong4867 = Class118.method1112(116);
            aBoolean4864 = true;
        } else if (Class118.method1112(116) - aLong4867 < 30000L)
            ((p) this).aCanvas4866.repaint();
        else
            throw new RuntimeException(exception.getMessage());
    }

    final void method2585() {
        w(true);
        ((p) this).nativeid = 0L;
        ((p) this).aCanvas4866 = null;
    }

    private final native void sa(oa var_oa, Canvas canvas, int i, int i_3_);

    final void method2586(int i, int i_4_) {
        try {
            synchronized (((p) this).aCanvas4866.getTreeLock()) {
                Dimension dimension = ((p) this).aCanvas4866.getSize();
                H(i, i_4_, dimension.width, dimension.height);
                aBoolean4864 = false;
            }
        } catch (Exception exception) {
            method2584(exception);
        }
    }

    private final native void oa(Canvas canvas, int i, int i_5_);

    final void method2587(Canvas canvas, int i, int i_6_) {
        ((p) this).anInt4868 = i;
        ((p) this).anInt4865 = i_6_;
        oa(canvas, i, i_6_);
    }

    protected final void finalize() {
        if (((p) this).nativeid != 0L)
            Class123.method1136(this, (byte) -116);
    }

    public final native void w(boolean bool);

    private final native void K(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_);

    private final native void H(int i, int i_12_, int i_13_, int i_14_);

    p(oa var_oa, Canvas canvas, int i, int i_15_) {
        ((p) this).aCanvas4866 = canvas;
        ((p) this).anInt4868 = i;
        ((p) this).anInt4865 = i_15_;
        sa(var_oa, ((p) this).aCanvas4866, i, i_15_);
    }
}
