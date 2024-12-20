/* Class248_Sub8_Sub16_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.ref.SoftReference;

final class Node_Sub8_Sub16_Sub2 extends Node_Sub8_Sub16 {
    private SoftReference aSoftReference10304;

    final boolean method2136(byte i) {
        if (i < 7)
            return false;
        return true;
    }

    Node_Sub8_Sub16_Sub2(Object object, int i) {
        super(i);
        aSoftReference10304 = new SoftReference(object);
    }

    final Object method2135(int i) {
        if (i != 75)
            aSoftReference10304 = null;
        return aSoftReference10304.get();
    }
}
