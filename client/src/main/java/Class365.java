/* Class365 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class365 {
    static int anInt4479;
    static float aFloat4480;
    static int anInt4481;
    static int anInt4482;
    static int anInt4483;
    private Node_Sub8 aClass248_Sub8_4484 = new Node_Sub8();
    private Class65 aClass65_4485;
    private int anInt4486;
    private Class64 aClass64_4487 = new Class64();
    private int anInt4488;

    final void method3825(long l, byte i, Node_Sub8 class248_sub8) {
        if ((anInt4486 ^ 0xffffffff) == -1) {
            Node_Sub8 class248_sub8_0_ = aClass64_4487.method497(896);
            class248_sub8_0_.remove(true);
            class248_sub8_0_.method2021((byte) -26);
            if (class248_sub8_0_ == aClass248_Sub8_4484) {
                class248_sub8_0_ = aClass64_4487.method497(896);
                class248_sub8_0_.remove(true);
                class248_sub8_0_.method2021((byte) -26);
            }
        } else
            anInt4486--;
        if (i < 82)
            method3826(61L, 87);
        anInt4483++;
        aClass65_4485.method509(-1, class248_sub8, l);
        aClass64_4487.method491(class248_sub8, -121);
    }

    final Node_Sub8 method3826(long l, int i) {
        anInt4479++;
        Node_Sub8 class248_sub8 = (Node_Sub8) aClass65_4485.method501(l, (byte) 31);
        if (i != -1)
            aFloat4480 = 0.52401733F;
        if (class248_sub8 != null)
            aClass64_4487.method491(class248_sub8, -128);
        return class248_sub8;
    }

    final void method3827(boolean bool) {
        anInt4481++;
        if (bool == true) {
            aClass64_4487.method496((byte) -74);
            aClass65_4485.method504(-1);
            aClass248_Sub8_4484 = new Node_Sub8();
            anInt4486 = anInt4488;
        }
    }

    final void method3828(long l, boolean bool) {
        anInt4482++;
        if (bool != false)
            method3828(13L, true);
        Node_Sub8 class248_sub8 = (Node_Sub8) aClass65_4485.method501(l, (byte) 31);
        if (class248_sub8 != null) {
            class248_sub8.remove(true);
            class248_sub8.method2021((byte) -26);
            anInt4486++;
        }
    }

    Class365(int i) {
        anInt4486 = i;
        anInt4488 = i;
        int i_1_;
        for (i_1_ = 1; (i ^ 0xffffffff) < (i_1_ + i_1_ ^ 0xffffffff); i_1_ += i_1_) {
            /* empty */
        }
        aClass65_4485 = new Class65(i_1_);
    }
}
