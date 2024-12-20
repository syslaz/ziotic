/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class183 {
    static Interface14[] anInterface14Array2136;
    static Class2[] aClass2Array2137;
    static int anInt2138;
    Class136_Sub2 aClass136_Sub2_2139 = null;
    static int[] anIntArray2140 = {1, 4, 1, 2};
    Class136_Sub4[] aClass136_Sub4Array2141 = null;
    Class136_Sub2 aClass136_Sub2_2142 = null;
    static Class288[] aClass288Array2143;
    boolean aBoolean2144;
    Class136_Sub2 aClass136_Sub2_2145;
    Class136_Sub4[] aClass136_Sub4Array2146 = null;

    static final void method1613(int i, int i_0_, int i_1_) {
        Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_0_][i_1_];
        if (class137 != null) {
            aa_Sub2.method164(((Class137) class137).aClass346_Sub7_Sub5_1636);
            aa_Sub2.method164(((Class137) class137).aClass346_Sub7_Sub5_1646);
            if (((Class137) class137).aClass346_Sub7_Sub5_1636 != null)
                ((Class137) class137).aClass346_Sub7_Sub5_1636 = null;
            if (((Class137) class137).aClass346_Sub7_Sub5_1646 != null)
                ((Class137) class137).aClass346_Sub7_Sub5_1646 = null;
        }
    }

    public static void method1614(byte i) {
        anInterface14Array2136 = null;
        anIntArray2140 = null;
        aClass288Array2143 = null;
        aClass2Array2137 = null;
        if (i != -75)
            method1614((byte) -23);
    }

    static final short method1615(byte i, int i_2_) {
        if (i > -103)
            return (short) -107;
        anInt2138++;
        int i_3_ = 0x3f & i_2_ >> 310617194;
        int i_4_ = (0x387 & i_2_) >> 661268099;
        int i_5_ = i_2_ & 0x7f;
        i_4_ = (i_5_ <= 64 ? i_5_ * i_4_ >> -1392037529 : i_4_ * (-i_5_ + 127) >> -1085058713);
        int i_6_ = i_4_ + i_5_;
        int i_7_;
        if ((i_6_ ^ 0xffffffff) == -1)
            i_7_ = i_4_ << 2091916929;
        else
            i_7_ = (i_4_ << 1926462536) / i_6_;
        int i_8_ = i_6_;
        return (short) (i_3_ << -1974183734 | i_7_ >> 1985410660 << 469779335 | i_8_);
    }

    Class183(ha_Sub2 var_ha_Sub2) {
        ((Class183) this).aClass136_Sub2_2145 = null;
        ((Class183) this).aBoolean2144 = ((ha_Sub2) var_ha_Sub2).aBoolean5910;
        Class363.method3821(-112, var_ha_Sub2);
        if (((Class183) this).aBoolean2144) {
            byte[] is = Class346_Sub7_Sub1_Sub1.method3587(Node_Sub36.anObject7258, false, -30711);
            ((Class183) this).aClass136_Sub2_2145 = new Class136_Sub2(var_ha_Sub2, 6410, 128, 128, 16, is, 6410);
            is = Class346_Sub7_Sub1_Sub1.method3587(Class108.anObject1367, false, -30711);
            ((Class183) this).aClass136_Sub2_2142 = new Class136_Sub2(var_ha_Sub2, 6410, 128, 128, 16, is, 6410);
            Class382 class382 = ((ha_Sub2) var_ha_Sub2).aClass382_5801;
            if (class382.method3938(35632)) {
                is = Class346_Sub7_Sub1_Sub1.method3587(Canvas_Sub1.anObject72, false, -30711);
                ((Class183) this).aClass136_Sub2_2139 = new Class136_Sub2(var_ha_Sub2, 6408, 128, 128, 16);
                Class136_Sub2 class136_sub2 = new Class136_Sub2(var_ha_Sub2, 6409, 128, 128, 16, is, 6409);
                if (class382.method3937(((Class183) this).aClass136_Sub2_2139, 2.0F, (byte) 113, class136_sub2))
                    ((Class183) this).aClass136_Sub2_2139.method1247((byte) -70);
                else {
                    ((Class183) this).aClass136_Sub2_2139.method1249(91);
                    ((Class183) this).aClass136_Sub2_2139 = null;
                }
                class136_sub2.method1249(-74);
            }
        } else {
            ((Class183) this).aClass136_Sub4Array2146 = new Class136_Sub4[16];
            for (int i = 0; i < 16; i++) {
                byte[] is = Class282_Sub4.method2934(Node_Sub36.anObject7258, 108, 32768, i * 16384 * 2);
                ((Class183) this).aClass136_Sub4Array2146[i] = new Class136_Sub4(var_ha_Sub2, 3553, 6410, 128, 128, true, is, 6410, false);
            }
            ((Class183) this).aClass136_Sub4Array2141 = new Class136_Sub4[16];
            for (int i = 0; (i ^ 0xffffffff) > -17; i++) {
                byte[] is = Class282_Sub4.method2934(Class108.anObject1367, 44, 32768, 2 * (128 * (i * 128)));
                ((Class183) this).aClass136_Sub4Array2141[i] = new Class136_Sub4(var_ha_Sub2, 3553, 6410, 128, 128, true, is, 6410, false);
            }
        }
    }
}
