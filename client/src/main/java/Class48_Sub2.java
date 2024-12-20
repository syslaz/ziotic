/* Class48_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class48_Sub2 extends Class48 {
    private Interface21_Impl2 anInterface21_Impl2_5297;
    private ha_Sub3 aHa_Sub3_5298;
    private boolean aBoolean5299;
    private Interface18_Impl1 anInterface18_Impl1_5300;

    final void fa(char c, int i, int i_0_, int i_1_, boolean bool) {
        aHa_Sub3_5298.method990(1);
        aHa_Sub3_5298.method929(anInterface21_Impl2_5297, -8423);
        if (aBoolean5299 || bool) {
            aHa_Sub3_5298.method955((byte) 93, Class60.aClass5_821, Class142.aClass5_1669);
            aHa_Sub3_5298.method946(0, -116, Class380.aClass280_4649);
            aHa_Sub3_5298.method976(i_1_, false);
        } else
            aHa_Sub3_5298.method955((byte) 98, Class142.aClass5_1669, Class142.aClass5_1669);
        Class238_Sub2 class238_sub2 = aHa_Sub3_5298.method952(-24720);
        class238_sub2.method1859(i, i_0_, 0);
        aHa_Sub3_5298.method948(55);
        aHa_Sub3_5298.method931(0, 8, anInterface18_Impl1_5300);
        aHa_Sub3_5298.method1004(((ha_Sub3) aHa_Sub3_5298).aClass185_6268, (byte) -15);
        aHa_Sub3_5298.method934(Class14.aClass14_264, 2, c * '\004', 0);
        if (aBoolean5299 || bool)
            aHa_Sub3_5298.method946(0, -101, Class147.aClass280_1738);
    }

    Class48_Sub2(ha_Sub3 var_ha_Sub3, Class285 class285, Class157[] class157s, boolean bool) {
        super(var_ha_Sub3, class285);
        aHa_Sub3_5298 = var_ha_Sub3;
        int i = 0;
        for (int i_2_ = 0; i_2_ < 256; i_2_++) {
            Class157 class157 = class157s[i_2_];
            if (((Class157) class157).anInt1874 > i)
                i = ((Class157) class157).anInt1874;
            if (((Class157) class157).anInt1873 > i)
                i = ((Class157) class157).anInt1873;
        }
        int i_3_ = i * 16;
        if (bool) {
            byte[] is = new byte[i_3_ * i_3_];
            for (int i_4_ = 0; i_4_ < 256; i_4_++) {
                Class157 class157 = class157s[i_4_];
                int i_5_ = ((Class157) class157).anInt1874;
                int i_6_ = ((Class157) class157).anInt1873;
                int i_7_ = i_4_ % 16 * i;
                int i_8_ = i_4_ / 16 * i;
                int i_9_ = i_8_ * i_3_ + i_7_;
                int i_10_ = 0;
                if (((Class157) class157).aByteArray1875 == null) {
                    byte[] is_11_ = ((Class157) class157).aByteArray1868;
                    for (int i_12_ = 0; i_12_ < i_5_; i_12_++) {
                        for (int i_13_ = 0; i_13_ < i_6_; i_13_++)
                            is[i_9_++] = (byte) (is_11_[i_10_++] == 0 ? 0 : -1);
                        i_9_ += i_3_ - i_6_;
                    }
                } else {
                    byte[] is_14_ = ((Class157) class157).aByteArray1875;
                    for (int i_15_ = 0; i_15_ < i_5_; i_15_++) {
                        for (int i_16_ = 0; i_16_ < i_6_; i_16_++)
                            is[i_9_++] = is_14_[i_10_++];
                        i_9_ += i_3_ - i_6_;
                    }
                }
            }
            if (!var_ha_Sub3.method933(-3119, Class228.aClass228_2573, Class130.aClass264_1573)) {
                int[] is_17_ = new int[is.length];
                for (int i_18_ = 0; i_18_ < is.length; i_18_++)
                    is_17_[i_18_] = is[i_18_] << 24;
                anInterface21_Impl2_5297 = var_ha_Sub3.method1033(i_3_, is_17_, (byte) -64, false, i_3_);
            } else
                anInterface21_Impl2_5297 = var_ha_Sub3.method972(is, 0, i_3_, Class130.aClass264_1573, i_3_, false);
            aBoolean5299 = true;
        } else {
            int[] is = new int[i_3_ * i_3_];
            for (int i_19_ = 0; i_19_ < 256; i_19_++) {
                Class157 class157 = class157s[i_19_];
                int[] is_20_ = ((Class157) class157).anIntArray1872;
                byte[] is_21_ = ((Class157) class157).aByteArray1875;
                byte[] is_22_ = ((Class157) class157).aByteArray1868;
                int i_23_ = ((Class157) class157).anInt1874;
                int i_24_ = ((Class157) class157).anInt1873;
                int i_25_ = i_19_ % 16 * i;
                int i_26_ = i_19_ / 16 * i;
                int i_27_ = i_26_ * i_3_ + i_25_;
                int i_28_ = 0;
                if (is_21_ != null) {
                    for (int i_29_ = 0; i_29_ < i_23_; i_29_++) {
                        for (int i_30_ = 0; i_30_ < i_24_; i_30_++) {
                            is[i_27_++] = (is_21_[i_28_] << 24 | is_20_[is_22_[i_28_] & 0xff]);
                            i_28_++;
                        }
                        i_27_ += i_3_ - i_24_;
                    }
                } else {
                    for (int i_31_ = 0; i_31_ < i_23_; i_31_++) {
                        for (int i_32_ = 0; i_32_ < i_24_; i_32_++) {
                            int i_33_;
                            if ((i_33_ = is_22_[i_28_++]) != 0)
                                is[i_27_++] = ~0xffffff | is_20_[i_33_ & 0xff];
                            else
                                i_27_++;
                        }
                        i_27_ += i_3_ - i_24_;
                    }
                }
            }
            anInterface21_Impl2_5297 = var_ha_Sub3.method1033(i_3_, is, (byte) -51, false, i_3_);
            aBoolean5299 = false;
        }
        anInterface21_Impl2_5297.method78(-9495, Class51.aClass171_691);
        anInterface18_Impl1_5300 = var_ha_Sub3.method1010(71, false);
        anInterface18_Impl1_5300.method2(20, -30987, 20480);
        for (int i_34_ = 0; i_34_ < 4; i_34_++) {
            Buffer buffer = anInterface18_Impl1_5300.method1(-4448, true);
            if (buffer != null) {
                Stream stream = aHa_Sub3_5298.method926((byte) -20, buffer);
                float f = (anInterface21_Impl2_5297.method64(-2092, (float) i_3_) / (float) i_3_);
                float f_35_ = (anInterface21_Impl2_5297.method71((float) i_3_, -71) / (float) i_3_);
                for (int i_36_ = 0; i_36_ < 256; i_36_++) {
                    Class157 class157 = class157s[i_36_];
                    int i_37_ = ((Class157) class157).anInt1874;
                    int i_38_ = ((Class157) class157).anInt1873;
                    int i_39_ = ((Class157) class157).anInt1876;
                    int i_40_ = ((Class157) class157).anInt1869;
                    float f_41_ = (float) (i_36_ % 16 * i);
                    float f_42_ = (float) (i_36_ / 16 * i);
                    float f_43_ = f_41_ * f;
                    float f_44_ = f_42_ * f_35_;
                    float f_45_ = (f_41_ + (float) i_38_) * f;
                    float f_46_ = (f_42_ + (float) i_37_) * f_35_;
                    if (Stream.b()) {
                        stream.a((float) i_40_);
                        stream.a((float) i_39_);
                        stream.a(0.0F);
                        stream.a(f_43_);
                        stream.a(f_44_);
                        stream.a((float) i_40_);
                        stream.a((float) (i_39_ + i_37_));
                        stream.a(0.0F);
                        stream.a(f_43_);
                        stream.a(f_46_);
                        stream.a((float) (i_40_ + i_38_));
                        stream.a((float) (i_39_ + i_37_));
                        stream.a(0.0F);
                        stream.a(f_45_);
                        stream.a(f_46_);
                        stream.a((float) (i_40_ + i_38_));
                        stream.a((float) i_39_);
                        stream.a(0.0F);
                        stream.a(f_45_);
                        stream.a(f_44_);
                    } else {
                        stream.b((float) i_40_);
                        stream.b((float) i_39_);
                        stream.b(0.0F);
                        stream.b(f_43_);
                        stream.b(f_44_);
                        stream.b((float) i_40_);
                        stream.b((float) (i_39_ + i_37_));
                        stream.b(0.0F);
                        stream.b(f_43_);
                        stream.b(f_46_);
                        stream.b((float) (i_40_ + i_38_));
                        stream.b((float) (i_39_ + i_37_));
                        stream.b(0.0F);
                        stream.b(f_45_);
                        stream.b(f_46_);
                        stream.b((float) (i_40_ + i_38_));
                        stream.b((float) i_39_);
                        stream.b(0.0F);
                        stream.b(f_45_);
                        stream.b(f_44_);
                    }
                }
                stream.a();
                if (anInterface18_Impl1_5300.method4(-13472))
                    break;
            }
        }
    }

    final void method359(char c, int i, int i_47_, int i_48_, boolean bool, aa var_aa, int i_49_, int i_50_) {
        /* empty */
    }
}
