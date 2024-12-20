/* Class349 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

class Class349 {
    private ha_Sub2 aHa_Sub2_4164;
    Buffer aBuffer4165;

    final void method3735(byte[] is, int i) {
        if (((Class349) this).aBuffer4165 == null || ((Class349) this).aBuffer4165.getSize() < i)
            ((Class349) this).aBuffer4165 = ((ha_Sub2) aHa_Sub2_4164).aNativeHeap5799.a(i, false);
        ((Class349) this).aBuffer4165.a(is, 0, 0, i);
    }

    Class349(ha_Sub2 var_ha_Sub2, byte[] is, int i) {
        aHa_Sub2_4164 = var_ha_Sub2;
        ((Class349) this).aBuffer4165 = ((ha_Sub2) aHa_Sub2_4164).aNativeHeap5799.a(i, false);
        if (is != null)
            ((Class349) this).aBuffer4165.a(is, 0, 0, i);
    }

    Class349(ha_Sub2 var_ha_Sub2, Buffer buffer) {
        aHa_Sub2_4164 = var_ha_Sub2;
        ((Class349) this).aBuffer4165 = buffer;
    }
}
