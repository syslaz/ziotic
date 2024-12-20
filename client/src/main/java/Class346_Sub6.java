/* Class346_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub6 extends Class346 {
    int anInt8285;
    boolean aBoolean8286 = false;
    static int anInt8287;
    Class360 aClass360_8288;
    Class40 aClass40_8289;
    static int anInt8290;
    Class99 aClass99_8291;
    private int anInt8292 = 0;
    static int anInt8293;
    Class90 aClass90_8294;
    Class346_Sub8 aClass346_Sub8_8295;
    static Class79 aClass79_8296;
    private long aLong8297;
    private Class99 aClass99_8298;
    private int anInt8299;
    private int anInt8300;
    private int anInt8301;
    private int anInt8302;
    private int anInt8303;
    private int anInt8304;
    private int anInt8305;
    private boolean aBoolean8306;

    public static void method3559(byte i) {
        if (i == 38)
            aClass79_8296 = null;
    }

    final void method3560(int i, boolean bool, ha var_ha, boolean bool_0_, long l) {
        if (!((Class346_Sub6) this).aBoolean8286) {
            if (((Class90) ((Class346_Sub6) this).aClass90_8294).anInt1117 <= Node_Sub2_Sub2.anInt8840) {
                if ((Node_Sub46.anInt7393 ^ 0xffffffff) >= ((Class84_Sub9.anIntArray5491[Node_Sub2_Sub2.anInt8840]) ^ 0xffffffff)) {
                    if (!aBoolean8306) {
                        if (((((Class90) ((Class346_Sub6) this).aClass90_8294).anInt1171) ^ 0xffffffff) != 0) {
                            int i_1_ = (int) (-aLong8297 + l);
                            if (!((Class90) (((Class346_Sub6) this).aClass90_8294)).aBoolean1162 && ((i_1_ ^ 0xffffffff) < (((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1171 ^ 0xffffffff)))
                                bool = false;
                            else
                                i_1_ %= ((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1171;
                            if (!((Class90) (((Class346_Sub6) this).aClass90_8294)).aBoolean1140 && ((i_1_ ^ 0xffffffff) > (((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1124 ^ 0xffffffff)))
                                bool = false;
                            if (((Class90) (((Class346_Sub6) this).aClass90_8294)).aBoolean1140 && i_1_ >= (((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1124))
                                bool = false;
                        }
                    } else
                        bool = false;
                } else
                    bool = false;
            } else
                bool = false;
        } else
            bool = false;
        anInt8290++;
        if (bool) {
            Class182.anInt2108++;
            int i_2_ = (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1272 + ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1264 + (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1281)) / 3;
            int i_3_ = ((((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1269 + ((((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1265) + (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1270))) / 3);
            int i_4_ = ((((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1280 + ((((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1276) + (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1268))) / 3);
            if ((((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1271 != i_2_) || (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1266 ^ 0xffffffff) != (i_3_ ^ 0xffffffff) || i_4_ != (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1274)) {
                ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1274 = i_4_;
                ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1266 = i_3_;
                ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1271 = i_2_;
                int i_5_ = (-(((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1281) + (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1264));
                int i_6_ = ((((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1265) + -(((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1270));
                int i_7_ = ((((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1268) - (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1276));
                int i_8_ = (-(((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1281) + (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1272));
                int i_9_ = (-(((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1270) + (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1269));
                int i_10_ = ((((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1280) - (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1276));
                anInt8304 = -(i_7_ * i_9_) + i_6_ * i_10_;
                anInt8299 = -(i_8_ * i_6_) + i_5_ * i_9_;
                for (anInt8301 = i_7_ * i_8_ - i_5_ * i_10_; ((anInt8304 ^ 0xffffffff) < -32768 || (anInt8301 ^ 0xffffffff) < -32768 || anInt8299 > 32767 || (anInt8304 ^ 0xffffffff) > 32766 || (anInt8301 ^ 0xffffffff) > 32766 || (anInt8299 ^ 0xffffffff) > 32766); anInt8299 >>= 1) {
                    anInt8301 >>= 1;
                    anInt8304 >>= 1;
                }
                int i_11_ = (int) Math.sqrt((double) (anInt8301 * anInt8301 + (anInt8304 * anInt8304 - -(anInt8299 * anInt8299))));
                if ((i_11_ ^ 0xffffffff) >= -1)
                    i_11_ = 1;
                anInt8304 = 32767 * anInt8304 / i_11_;
                anInt8301 = anInt8301 * 32767 / i_11_;
                anInt8299 = anInt8299 * 32767 / i_11_;
                if ((((Class90) ((Class346_Sub6) this).aClass90_8294).aShort1116) > 0 || ((((Class90) ((Class346_Sub6) this).aClass90_8294).aShort1120) ^ 0xffffffff) < -1) {
                    int i_12_ = (int) (Math.atan2((double) anInt8299, (double) anInt8304) * 2607.5945876176133);
                    int i_13_ = (int) (2607.5945876176133 * (Math.atan2((double) anInt8301, Math.sqrt((double) (anInt8299 * anInt8299 + (anInt8304 * anInt8304))))));
                    anInt8305 = ((((Class90) ((Class346_Sub6) this).aClass90_8294).aShort1116) + -(((Class90) ((Class346_Sub6) this).aClass90_8294).aShort1143));
                    anInt8302 = (-(anInt8305 >> -1079723999) + ((((Class90) ((Class346_Sub6) this).aClass90_8294).aShort1143) + i_12_));
                    anInt8300 = (-(((Class90) ((Class346_Sub6) this).aClass90_8294).aShort1141) + (((Class90) ((Class346_Sub6) this).aClass90_8294).aShort1120));
                    anInt8303 = i_13_ + (((Class90) (((Class346_Sub6) this).aClass90_8294)).aShort1141 - (anInt8300 >> 635403457));
                }
            }
            anInt8292 += (int) ((double) i * ((double) (((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1174 + -(((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1168)) * Math.random() + (double) (((Class90) ((Class346_Sub6) this).aClass90_8294).anInt1168)));
            if (anInt8292 > 63) {
                int i_14_ = anInt8292 >> -1338413626;
                anInt8292 &= 0x3f;
                for (int i_15_ = 0; (i_14_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
                    int i_16_;
                    int i_17_;
                    int i_18_;
                    if (((((Class90) ((Class346_Sub6) this).aClass90_8294).aShort1116) ^ 0xffffffff) >= -1 && (((Class90) ((Class346_Sub6) this).aClass90_8294).aShort1120) <= 0) {
                        i_18_ = anInt8299;
                        i_17_ = anInt8304;
                        i_16_ = anInt8301;
                    } else {
                        int i_19_ = anInt8302 - -(int) (Math.random() * (double) anInt8305);
                        i_19_ &= 0x3fff;
                        int i_20_ = Node_Sub9_Sub1.anIntArray9106[i_19_];
                        int i_21_ = Node_Sub9_Sub1.anIntArray9109[i_19_];
                        int i_22_ = ((int) (Math.random() * (double) anInt8300) + anInt8303);
                        i_22_ &= 0x1fff;
                        int i_23_ = Node_Sub9_Sub1.anIntArray9106[i_22_];
                        int i_24_ = Node_Sub9_Sub1.anIntArray9109[i_22_];
                        int i_25_ = 13;
                        i_16_ = (i_24_ << -275667391) * -1;
                        i_17_ = i_21_ * i_23_ >> i_25_;
                        i_18_ = i_20_ * i_23_ >> i_25_;
                    }
                    float f = (float) Math.random();
                    float f_26_ = (float) Math.random();
                    if (f_26_ + f > 1.0F) {
                        f_26_ = -f_26_ + 1.0F;
                        f = 1.0F - f;
                    }
                    float f_27_ = -f_26_ - f + 1.0F;
                    int i_28_ = (int) (f_26_ * (float) ((Class99) (((Class346_Sub6) this).aClass99_8291)).anInt1264 + (float) (((Class99) (((Class346_Sub6) this).aClass99_8291)).anInt1281) * f + (float) (((Class99) (((Class346_Sub6) this).aClass99_8291)).anInt1272) * f_27_);
                    int i_29_ = (int) ((float) (((Class99) (((Class346_Sub6) this).aClass99_8291)).anInt1269) * f_27_ + (f_26_ * (float) (((Class99) (((Class346_Sub6) this).aClass99_8291)).anInt1265) + (float) (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1270) * f));
                    int i_30_ = (int) ((float) (((Class99) (((Class346_Sub6) this).aClass99_8291)).anInt1276) * f + (float) (((Class99) (((Class346_Sub6) this).aClass99_8291)).anInt1268) * f_26_ + (float) (((Class99) (((Class346_Sub6) this).aClass99_8291)).anInt1280) * f_27_);
                    int i_31_ = (int) (((float) ((Class99) aClass99_8298).anInt1264 * f_26_) + f * (float) (((Class99) aClass99_8298).anInt1281) + ((float) ((Class99) aClass99_8298).anInt1272 * f_27_));
                    int i_32_ = (int) (((float) ((Class99) aClass99_8298).anInt1270 * f) + ((float) ((Class99) aClass99_8298).anInt1265 * f_26_) + ((float) ((Class99) aClass99_8298).anInt1269 * f_27_));
                    int i_33_ = (int) (f_27_ * (float) (((Class99) aClass99_8298).anInt1280) + ((float) (((Class99) aClass99_8298).anInt1276) * f + (float) (((Class99) aClass99_8298).anInt1268) * f_26_));
                    int i_34_ = -i_31_ + i_28_;
                    int i_35_ = i_29_ + -i_32_;
                    int i_36_ = i_30_ + -i_33_;
                    int i_37_ = (int) ((double) i_34_ * Math.random() + (double) i_31_);
                    int i_38_ = (int) ((double) i_32_ + Math.random() * (double) i_35_);
                    int i_39_ = (int) (Math.random() * (double) i_36_ + (double) i_33_);
                    int i_40_ = ((int) ((double) ((((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1131) + -((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1148) * Math.random()) + (((Class90) ((Class346_Sub6) this).aClass90_8294).anInt1148));
                    int i_41_ = ((int) (Math.random() * (double) (-((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1133 + ((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1173)) + (((Class90) ((Class346_Sub6) this).aClass90_8294).anInt1133));
                    int i_42_ = ((int) ((double) ((((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1165) - (((Class90) ((Class346_Sub6) this).aClass90_8294).anInt1157)) * Math.random()) + (((Class90) ((Class346_Sub6) this).aClass90_8294).anInt1157));
                    int i_43_;
                    if (((Class90) ((Class346_Sub6) this).aClass90_8294).aBoolean1177) {
                        double d = Math.random();
                        i_43_ = ((int) ((double) ((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1122 + (Math.random() * (double) (((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1113))) << 586120664 | (((int) ((double) ((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1125 + (double) (((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1109) * d) << -813916464) | ((int) ((double) (((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1163) + (double) (((Class90) ((Class346_Sub6) this).aClass90_8294).anInt1138) * d) << -1936819576) | (int) ((double) (((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1112) * d + (double) (((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1155))));
                    } else
                        i_43_ = ((int) ((Math.random() * (double) ((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1113) + (double) (((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1122)) << -1206445768 | ((int) ((Math.random() * (double) (((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1112)) + (double) (((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1155)) | (((int) (((double) (((Class90) ((Class346_Sub6) this).aClass90_8294).anInt1138) * Math.random()) + (double) (((Class90) ((Class346_Sub6) this).aClass90_8294).anInt1163)) << 247175080) | ((int) ((double) (((Class90) ((Class346_Sub6) this).aClass90_8294).anInt1125) + (Math.random() * (double) (((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1109))) << -1968849424))));
                    int i_44_ = (((Class90) ((Class346_Sub6) this).aClass90_8294).anInt1164);
                    if (!var_ha.b() && !(((Class90) ((Class346_Sub6) this).aClass90_8294).aBoolean1142))
                        i_44_ = -1;
                    if (Class130.anInt1580 != Class221.anInt2535) {
                        Class346_Sub5_Sub2_Sub1 class346_sub5_sub2_sub1 = (Class340.aClass346_Sub5_Sub2_Sub1Array3966[Class221.anInt2535]);
                        Class221.anInt2535 = Class221.anInt2535 - -1 & 0x3ff;
                        class346_sub5_sub2_sub1.method3557(this, i_37_, i_38_, i_39_, i_17_, i_16_, i_18_, i_40_, i_41_, i_43_, i_42_, i_44_, (((Class90) ((Class346_Sub6) this).aClass90_8294).aBoolean1145), (((Class90) ((Class346_Sub6) this).aClass90_8294).aBoolean1114));
                    } else {
                        Class346_Sub5_Sub2_Sub1 class346_sub5_sub2_sub1 = (new Class346_Sub5_Sub2_Sub1(this, i_37_, i_38_, i_39_, i_17_, i_16_, i_18_, i_40_, i_41_, i_43_, i_42_, i_44_, ((Class90) (((Class346_Sub6) this).aClass90_8294)).aBoolean1145, ((Class90) (((Class346_Sub6) this).aClass90_8294)).aBoolean1114));
                    }
                }
            }
        }
        if (!((Class346_Sub6) this).aClass99_8291.method709(aClass99_8298, -15742)) {
            Class99 class99 = aClass99_8298;
            aClass99_8298 = ((Class346_Sub6) this).aClass99_8291;
            ((Class346_Sub6) this).aClass99_8291 = class99;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1265 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt452;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1269 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt441;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1274 = ((Class99) aClass99_8298).anInt1274;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1270 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt458;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1281 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt447;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1272 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt439;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1280 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt455;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1266 = ((Class99) aClass99_8298).anInt1266;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1264 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt453;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1268 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt440;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1276 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt457;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1271 = ((Class99) aClass99_8298).anInt1271;
        }
        ((Class346_Sub6) this).anInt8285 = 0;
        for (Class346_Sub5_Sub2_Sub1 class346_sub5_sub2_sub1 = (Class346_Sub5_Sub2_Sub1) ((Class346_Sub6) this).aClass360_8288.method3815((byte) 27); class346_sub5_sub2_sub1 != null; class346_sub5_sub2_sub1 = (Class346_Sub5_Sub2_Sub1) ((Class346_Sub6) this).aClass360_8288.method3809(-24951)) {
            class346_sub5_sub2_sub1.method3556(l, i);
            ((Class346_Sub6) this).anInt8285++;
        }
        if (bool_0_ != true)
            method3559((byte) 24);
        Class381.anInt4693 += ((Class346_Sub6) this).anInt8285;
    }

    final void method3561(long l, int i, ha var_ha) {
        for (Class346_Sub5_Sub2_Sub1 class346_sub5_sub2_sub1 = (Class346_Sub5_Sub2_Sub1) ((Class346_Sub6) this).aClass360_8288.method3815((byte) 11); class346_sub5_sub2_sub1 != null; class346_sub5_sub2_sub1 = ((Class346_Sub5_Sub2_Sub1) ((Class346_Sub6) this).aClass360_8288.method3809(-24951)))
            class346_sub5_sub2_sub1.method3555(var_ha, l);
        if (i != -31392)
            anInt8299 = -17;
        anInt8293++;
    }

    final void method3562(byte i) {
        ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1276 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt457;
        ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1280 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt455;
        ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1265 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt452;
        if (i >= 32) {
            anInt8287++;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1264 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt453;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1270 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt458;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1268 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt440;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1281 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt447;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1272 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt439;
            ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1269 = ((Class40) ((Class346_Sub6) this).aClass40_8289).anInt441;
            if (((((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1264 ^ 0xffffffff) == (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1281 ^ 0xffffffff)) && ((((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1272 ^ 0xffffffff) == ((((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1264) ^ 0xffffffff)) && (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1265 == (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1270)) && ((((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1269 ^ 0xffffffff) == ((((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1265) ^ 0xffffffff)) && (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1268 == (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1276)) && (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1268 == (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1280)))
                aBoolean8306 = true;
            else if (aBoolean8306) {
                ((Class99) aClass99_8298).anInt1280 = (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1280);
                ((Class99) aClass99_8298).anInt1276 = (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1276);
                ((Class99) aClass99_8298).anInt1268 = (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1268);
                ((Class99) aClass99_8298).anInt1272 = (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1272);
                ((Class99) aClass99_8298).anInt1265 = (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1265);
                ((Class99) aClass99_8298).anInt1270 = (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1270);
                ((Class99) aClass99_8298).anInt1281 = (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1281);
                aBoolean8306 = false;
                ((Class99) aClass99_8298).anInt1264 = (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1264);
                ((Class99) aClass99_8298).anInt1269 = (((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1269);
            }
        }
    }

    Class346_Sub6(ha var_ha, Class40 class40, Class346_Sub8 class346_sub8, long l) {
        ((Class346_Sub6) this).aClass99_8291 = new Class99();
        aClass99_8298 = new Class99();
        aBoolean8306 = false;
        aLong8297 = l;
        ((Class346_Sub6) this).aClass346_Sub8_8295 = class346_sub8;
        ((Class346_Sub6) this).aClass40_8289 = class40;
        ((Class346_Sub6) this).aClass90_8294 = ((Class346_Sub6) this).aClass40_8289.method296(false);
        if (!var_ha.b() && (((Class90) ((Class346_Sub6) this).aClass90_8294).anInt1149 ^ 0xffffffff) != 0)
            ((Class346_Sub6) this).aClass90_8294 = Class352.method3749(((Class90) (((Class346_Sub6) this).aClass90_8294)).anInt1149, -11836);
        ((Class346_Sub6) this).aClass360_8288 = new Class360();
        anInt8292 += Math.random() * 64.0;
        method3562((byte) 68);
        ((Class99) aClass99_8298).anInt1280 = ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1280;
        ((Class99) aClass99_8298).anInt1270 = ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1270;
        ((Class99) aClass99_8298).anInt1265 = ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1265;
        ((Class99) aClass99_8298).anInt1272 = ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1272;
        ((Class99) aClass99_8298).anInt1281 = ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1281;
        ((Class99) aClass99_8298).anInt1264 = ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1264;
        ((Class99) aClass99_8298).anInt1269 = ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1269;
        ((Class99) aClass99_8298).anInt1268 = ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1268;
        ((Class99) aClass99_8298).anInt1276 = ((Class99) ((Class346_Sub6) this).aClass99_8291).anInt1276;
    }
}
