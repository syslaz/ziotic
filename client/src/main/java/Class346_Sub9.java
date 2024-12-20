/* Class346_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub9 extends Class346 {
    boolean aBoolean8342 = false;
    int anInt8343;
    int anInt8344;
    int anInt8345;
    int anInt8346;
    int anInt8347;

    public Class346_Sub9() {
        /* empty */
    }

    final boolean method3718(int i, int i_0_) {
        if (!((Class346_Sub9) this).aBoolean8342)
            return false;
        int i_1_ = (((Class346_Sub9) this).anInt8345 - ((Class346_Sub9) this).anInt8347);
        int i_2_ = (((Class346_Sub9) this).anInt8343 - ((Class346_Sub9) this).anInt8346);
        int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
        int i_4_ = (i * i_1_ + i_0_ * i_2_ - (((Class346_Sub9) this).anInt8347 * i_1_ + ((Class346_Sub9) this).anInt8346 * i_2_));
        if (i_4_ <= 0) {
            int i_5_ = ((Class346_Sub9) this).anInt8347 - i;
            int i_6_ = ((Class346_Sub9) this).anInt8346 - i_0_;
            if (i_5_ * i_5_ + i_6_ * i_6_ >= (((Class346_Sub9) this).anInt8344 * ((Class346_Sub9) this).anInt8344))
                return false;
            return true;
        }
        if (i_4_ > i_3_) {
            int i_7_ = ((Class346_Sub9) this).anInt8345 - i;
            int i_8_ = ((Class346_Sub9) this).anInt8343 - i_0_;
            if (i_7_ * i_7_ + i_8_ * i_8_ >= (((Class346_Sub9) this).anInt8344 * ((Class346_Sub9) this).anInt8344))
                return false;
            return true;
        }
        i_4_ = (i_4_ << 10) / i_3_;
        int i_9_ = ((Class346_Sub9) this).anInt8347 + (i_1_ * i_4_ >> 10) - i;
        int i_10_ = ((Class346_Sub9) this).anInt8346 + (i_2_ * i_4_ >> 10) - i_0_;
        if (i_9_ * i_9_ + i_10_ * i_10_ >= (((Class346_Sub9) this).anInt8344 * ((Class346_Sub9) this).anInt8344))
            return false;
        return true;
    }
}
