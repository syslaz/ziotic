/* Class248_Sub8_Sub14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.ref.SoftReference;

final class Node_Sub8_Sub14_Sub2 extends Node_Sub8_Sub14 {
    private SoftReference aSoftReference10296;

    Node_Sub8_Sub14_Sub2(Interface9 interface9, Object object, int i) {
        super(interface9, i);
        aSoftReference10296 = new SoftReference(object);
    }

    final boolean method2126(byte i) {
        if (i >= -62)
            method2122(121);
        return true;
    }

    final Object method2122(int i) {
        if (i != -1)
            aSoftReference10296 = null;
        return aSoftReference10296.get();
    }
}
