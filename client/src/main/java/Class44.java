/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class44 {
    static int anInt556;
    static Class128 aClass128_557 = new Class128(11, 4);
    static Class381 aClass381_558;
    static int anInt559;

    public static void method313(int i) {
        if (i != -1)
            aClass381_558 = null;
        aClass128_557 = null;
        aClass381_558 = null;
    }

    static final void method314(boolean bool, int i, int i_0_, byte i_1_, int i_2_, int i_3_) {
        anInt556++;
        if (i_1_ == -107) {
            long l = (long) ((bool ? -2147483648 : 0) | i_2_);
            Node_Sub33 class248_sub33 = ((Node_Sub33) Class57.aClass65_790.method501(l, (byte) 31));
            if (class248_sub33 == null) {
                class248_sub33 = new Node_Sub33();
                Class57.aClass65_790.method509(i_1_ + 106, class248_sub33, l);
            }
            if ((((Node_Sub33) class248_sub33).anIntArray7202.length ^ 0xffffffff) >= (i ^ 0xffffffff)) {
                int[] is = new int[1 + i];
                int[] is_4_ = new int[1 + i];
                for (int i_5_ = 0; i_5_ < (((Node_Sub33) class248_sub33).anIntArray7202).length; i_5_++) {
                    is[i_5_] = (((Node_Sub33) class248_sub33).anIntArray7202[i_5_]);
                    is_4_[i_5_] = (((Node_Sub33) class248_sub33).anIntArray7204[i_5_]);
                }
                for (int i_6_ = (((Node_Sub33) class248_sub33).anIntArray7202).length; (i ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
                    is[i_6_] = -1;
                    is_4_[i_6_] = 0;
                }
                ((Node_Sub33) class248_sub33).anIntArray7202 = is;
                ((Node_Sub33) class248_sub33).anIntArray7204 = is_4_;
            }
            ((Node_Sub33) class248_sub33).anIntArray7202[i] = i_3_;
            ((Node_Sub33) class248_sub33).anIntArray7204[i] = i_0_;
        }
    }

    static final boolean method315(byte i) {
        anInt559++;
        if (Class176.aBoolean2058) {
            try {
                Class78.method571("showVideoAd", -8364, Class158.anApplet1881);
                return true;
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        int i_7_ = -42 % ((82 - i) / 34);
        return false;
    }

    public Class44() {
        /* empty */
    }

    abstract void method316(float[] fs, int i, float f, byte i_8_, int i_9_, float f_10_, int i_11_, int i_12_, float f_13_, float f_14_, int i_15_);
}
