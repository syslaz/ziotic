/* Class226_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class226_Sub3 extends Class226 {
    static int anInt6668;
    static IncommingOpcode aIncommingOpcode_6669;
    static Class174 aClass174_6670;
    static int anInt6671;
    static int anInt6672;
    static int anInt6673;
    static short aShort6674 = 205;

    static final void method1814(Node_Sub36 class248_sub36, int i) {
        Node_Sub5.aClass293_6838.method3109(class248_sub36, i + -99);
        anInt6673++;
        ((Node_Sub36) class248_sub36).anInt7254 = ((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset;
        Class26.anInt357 += ((Node_Sub36) class248_sub36).anInt7254;
        ((ByteStream) ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257).offset = i;
    }

    static final void method1815(int i, byte i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
        anInt6672++;
        int i_5_ = 0;
        int i_6_ = i_4_;
        if (i_0_ != 0)
            method1816(false);
        int i_7_ = i_3_ * i_3_;
        int i_8_ = i_4_ * i_4_;
        int i_9_ = i_8_ << 1513178977;
        int i_10_ = i_7_ << -1936120159;
        int i_11_ = i_4_ << -2092365631;
        int i_12_ = i_9_ + i_7_ * (1 - i_11_);
        int i_13_ = -((-1 + i_11_) * i_10_) + i_8_;
        int i_14_ = i_7_ << -948565086;
        int i_15_ = i_8_ << 1537468226;
        int i_16_ = i_9_ * (3 + (i_5_ << 56761761));
        int i_17_ = i_10_ * (-3 + (i_6_ << 662059777));
        int i_18_ = (i_5_ - -1) * i_15_;
        int i_19_ = (-1 + i_6_) * i_14_;
        if (Class181.anInt2099 <= i_1_ && aa_Sub3.anInt5270 >= i_1_) {
            int i_20_ = Class49.method389(Class289.anInt3399, 47, Class302.anInt3500, i_3_ + i_2_);
            int i_21_ = Class49.method389(Class289.anInt3399, i_0_ ^ 0xb, Class302.anInt3500, i_2_ + -i_3_);
            Class149.method1331(i, i_0_ ^ ~0x5c, i_21_, Class156.anIntArrayArray1867[i_1_], i_20_);
        }
        while ((i_6_ ^ 0xffffffff) < -1) {
            if ((i_12_ ^ 0xffffffff) > -1) {
                while ((i_12_ ^ 0xffffffff) > -1) {
                    i_13_ += i_18_;
                    i_12_ += i_16_;
                    i_18_ += i_15_;
                    i_5_++;
                    i_16_ += i_15_;
                }
            }
            if (i_13_ < 0) {
                i_13_ += i_18_;
                i_12_ += i_16_;
                i_5_++;
                i_18_ += i_15_;
                i_16_ += i_15_;
            }
            i_13_ += -i_17_;
            i_12_ += -i_19_;
            i_19_ -= i_14_;
            i_6_--;
            i_17_ -= i_14_;
            int i_22_ = -i_6_ + i_1_;
            int i_23_ = i_6_ + i_1_;
            if ((Class181.anInt2099 ^ 0xffffffff) >= (i_23_ ^ 0xffffffff) && (aa_Sub3.anInt5270 ^ 0xffffffff) <= (i_22_ ^ 0xffffffff)) {
                int i_24_ = Class49.method389(Class289.anInt3399, 72, Class302.anInt3500, i_2_ - -i_5_);
                int i_25_ = Class49.method389(Class289.anInt3399, 74, Class302.anInt3500, i_2_ - i_5_);
                if (i_22_ >= Class181.anInt2099)
                    Class149.method1331(i, -50, i_25_, Class156.anIntArrayArray1867[i_22_], i_24_);
                if (i_23_ <= aa_Sub3.anInt5270)
                    Class149.method1331(i, -68, i_25_, Class156.anIntArrayArray1867[i_23_], i_24_);
            }
        }
    }

    public static void method1816(boolean bool) {
        aClass174_6670 = null;
        aIncommingOpcode_6669 = null;
        if (bool != false)
            aShort6674 = (short) -26;
    }

    static final boolean method1817(Class38 class38, int i) {
        anInt6668++;
        if (class38 == null)
            return false;
        if (i != -3)
            anInt6671 = -40;
        return Class226.method1803((-((Class38) class38).anInt412 + ((Class38) class38).anInt415), (-((Class38) class38).anInt420 + ((Class38) class38).anInt416), ((Class38) class38).anInt420, ((Class38) class38).anInt413, ((Class38) class38).anInt412, 96, (((Class38) class38).anInt411 + -((Class38) class38).anInt413));
    }
}
