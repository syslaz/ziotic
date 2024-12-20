/* Class248_Sub31_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub1 extends Node_Sub31 {
    byte[] aByteArray9734;
    boolean aBoolean9735;
    int anInt9736;
    int anInt9737;
    int anInt9738;

    final Node_Sub31_Sub1 method2564(Class317 class317) {
        ((Node_Sub31_Sub1) this).aByteArray9734 = class317.method3308(((Node_Sub31_Sub1) this).aByteArray9734, -54);
        ((Node_Sub31_Sub1) this).anInt9736 = class317.method3306((byte) 91, ((Node_Sub31_Sub1) this).anInt9736);
        if (((Node_Sub31_Sub1) this).anInt9738 == ((Node_Sub31_Sub1) this).anInt9737)
            ((Node_Sub31_Sub1) this).anInt9738 = ((Node_Sub31_Sub1) this).anInt9737 = class317.method3307(((Node_Sub31_Sub1) this).anInt9738, 6909);
        else {
            ((Node_Sub31_Sub1) this).anInt9738 = class317.method3307(((Node_Sub31_Sub1) this).anInt9738, 6909);
            ((Node_Sub31_Sub1) this).anInt9737 = class317.method3307(((Node_Sub31_Sub1) this).anInt9737, 6909);
            if (((Node_Sub31_Sub1) this).anInt9738 == ((Node_Sub31_Sub1) this).anInt9737)
                ((Node_Sub31_Sub1) this).anInt9738--;
        }
        return this;
    }

    Node_Sub31_Sub1(int i, byte[] is, int i_0_, int i_1_) {
        ((Node_Sub31_Sub1) this).anInt9736 = i;
        ((Node_Sub31_Sub1) this).aByteArray9734 = is;
        ((Node_Sub31_Sub1) this).anInt9738 = i_0_;
        ((Node_Sub31_Sub1) this).anInt9737 = i_1_;
    }

    Node_Sub31_Sub1(int i, byte[] is, int i_2_, int i_3_, boolean bool) {
        ((Node_Sub31_Sub1) this).anInt9736 = i;
        ((Node_Sub31_Sub1) this).aByteArray9734 = is;
        ((Node_Sub31_Sub1) this).anInt9738 = i_2_;
        ((Node_Sub31_Sub1) this).anInt9737 = i_3_;
        ((Node_Sub31_Sub1) this).aBoolean9735 = bool;
    }
}
