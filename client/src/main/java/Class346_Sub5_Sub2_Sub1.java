/* Class346_Sub5_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub5_Sub2_Sub1 extends Class346_Sub5_Sub2 {
    private short aShort10312;
    private short aShort10313;
    private short aShort10314;
    Class346_Sub6 aClass346_Sub6_10315;
    private int anInt10316;
    private short aShort10317;
    private short aShort10318;
    private int anInt10319;
    private short aShort10320;

    final void method3554() {
        ((Class346_Sub8) (((Class346_Sub6) (((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315)).aClass346_Sub8_8295)).aClass346_Sub5_Sub2_Sub1Array8333[aShort10312] = null;
        Class340.aClass346_Sub5_Sub2_Sub1Array3966[Class130.anInt1580] = this;
        Class130.anInt1580 = Class130.anInt1580 + 1 & 0x3ff;
        this.method3538(-124);
        this.method3547(-11364);
    }

    final void method3555(ha var_ha, long l) {
        int i = ((Class346_Sub5_Sub2) this).anInt9894 >> 12 + Class96.anInt1249;
        int i_0_ = ((Class346_Sub5_Sub2) this).anInt9895 >> 12 + Class96.anInt1249;
        int i_1_ = ((Class346_Sub5_Sub2) this).anInt9891 >> 12;
        if (i_1_ > 0 || i_1_ < -262144 || i < 0 || i >= Class225_Sub1.anInt8454 || i_0_ < 0 || i_0_ >= Class89.anInt1106)
            method3554();
        else {
            Class346_Sub8 class346_sub8 = (((Class346_Sub6) ((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315).aClass346_Sub8_8295);
            Class90 class90 = (((Class346_Sub6) ((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315).aClass90_8294);
            s[] var_ses = Class177.aSArray2070;
            int i_2_ = ((Class346_Sub8) class346_sub8).anInt8340;
            Class137 class137 = (Class311.aClass137ArrayArrayArray3620[((Class346_Sub8) class346_sub8).anInt8340][i][i_0_]);
            if (class137 != null)
                i_2_ = ((Class137) class137).aByte1637;
            int i_3_ = var_ses[i_2_].method3145(i, 89, i_0_);
            int i_4_;
            if (i_2_ < Class111_Sub1.anInt5531 - 1)
                i_4_ = var_ses[i_2_ + 1].method3145(i, 119, i_0_);
            else
                i_4_ = i_3_ - (8 << Class96.anInt1249);
            if (((Class90) class90).aBoolean1134) {
                if (((Class90) class90).anInt1161 == -1 && i_1_ > i_3_) {
                    method3554();
                    return;
                }
                if (((Class90) class90).anInt1161 >= 0 && i_1_ > var_ses[((Class90) class90).anInt1161].method3145(i, 48, i_0_)) {
                    method3554();
                    return;
                }
                if (((Class90) class90).anInt1154 == -1 && i_1_ < i_4_) {
                    method3554();
                    return;
                }
                if (((Class90) class90).anInt1154 >= 0 && i_1_ < var_ses[((Class90) class90).anInt1154 + 1].method3145(i, 113, i_0_)) {
                    method3554();
                    return;
                }
            }
            int i_5_;
            for (i_5_ = Class111_Sub1.anInt5531 - 1; i_5_ > 0 && i_1_ > var_ses[i_5_].method3145(i, 89, i_0_); i_5_--) {
                /* empty */
            }
            if (((Class90) class90).aBoolean1158 && i_5_ == 0 && i_1_ > var_ses[0].method3145(i, 75, i_0_))
                method3554();
            else if (i_5_ == Class111_Sub1.anInt5531 - 1 && (var_ses[i_5_].method3145(i, 120, i_0_) - i_1_ > 8 << Class96.anInt1249))
                method3554();
            else {
                class137 = Class311.aClass137ArrayArrayArray3620[i_5_][i][i_0_];
                if (class137 == null) {
                    if (i_5_ == 0 || (Class311.aClass137ArrayArrayArray3620[0][i][i_0_] == null))
                        class137 = Class311.aClass137ArrayArrayArray3620[0][i][i_0_] = new Class137(0);
                    boolean bool = (((Class137) (Class311.aClass137ArrayArrayArray3620[0][i][i_0_])).aClass137_1651 != null);
                    if (i_5_ == 3 && bool) {
                        method3554();
                        return;
                    }
                    for (int i_6_ = 1; i_6_ <= i_5_; i_6_++) {
                        if ((Class311.aClass137ArrayArrayArray3620[i_6_][i][i_0_]) == null) {
                            class137 = Class311.aClass137ArrayArrayArray3620[i_6_][i][i_0_] = new Class137(i_6_);
                            if (bool)
                                ((Class137) class137).aByte1637++;
                        }
                    }
                }
                if (((Class90) class90).aBoolean1139) {
                    int i_7_ = ((Class346_Sub5_Sub2) this).anInt9894 >> 12;
                    int i_8_ = ((Class346_Sub5_Sub2) this).anInt9895 >> 12;
                    if (((Class137) class137).aClass346_Sub7_Sub5_1636 != null) {
                        Class38 class38 = ((Class137) class137).aClass346_Sub7_Sub5_1636.method3575((byte) -105, var_ha);
                        if (class38 != null && class38.method286(i_1_, (byte) 127, i_8_, i_7_)) {
                            method3554();
                            return;
                        }
                    }
                    if (((Class137) class137).aClass346_Sub7_Sub5_1646 != null) {
                        Class38 class38 = ((Class137) class137).aClass346_Sub7_Sub5_1646.method3575((byte) -101, var_ha);
                        if (class38 != null && class38.method286(i_1_, (byte) -51, i_8_, i_7_)) {
                            method3554();
                            return;
                        }
                    }
                    if (((Class137) class137).aClass346_Sub7_Sub4_1645 != null) {
                        Class38 class38 = ((Class137) class137).aClass346_Sub7_Sub4_1645.method3575((byte) -93, var_ha);
                        if (class38 != null && class38.method286(i_1_, (byte) 93, i_8_, i_7_)) {
                            method3554();
                            return;
                        }
                    }
                    for (Class49 class49 = ((Class137) class137).aClass49_1649; class49 != null; class49 = ((Class49) class49).aClass49_660) {
                        Class38 class38 = ((Class49) class49).aAnimable_656.method3575((byte) -127, var_ha);
                        if (class38 != null && class38.method286(i_1_, (byte) 40, i_8_, i_7_)) {
                            method3554();
                            return;
                        }
                    }
                }
                ((Class338) ((Class346_Sub8) class346_sub8).aClass338_8338).aClass26_3941.method249(98, this);
            }
        }
    }

    final void method3556(long l, int i) {
        aShort10318 -= i;
        if (aShort10318 <= 0)
            method3554();
        else {
            int i_9_ = ((Class346_Sub5_Sub2) this).anInt9894 >> 12;
            int i_10_ = ((Class346_Sub5_Sub2) this).anInt9891 >> 12;
            int i_11_ = ((Class346_Sub5_Sub2) this).anInt9895 >> 12;
            Class346_Sub8 class346_sub8 = (((Class346_Sub6) ((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315).aClass346_Sub8_8295);
            Class90 class90 = (((Class346_Sub6) ((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315).aClass90_8294);
            if (((Class90) class90).anInt1108 != 0) {
                if (aShort10320 - aShort10318 <= ((Class90) class90).anInt1121) {
                    int i_12_ = ((((Class346_Sub5_Sub2) this).anInt9897 >> 8 & 0xff00) + (anInt10319 >> 16 & 0xff) + ((Class90) class90).anInt1183 * i);
                    int i_13_ = ((((Class346_Sub5_Sub2) this).anInt9897 & 0xff00) + (anInt10319 >> 8 & 0xff) + ((Class90) class90).anInt1137 * i);
                    int i_14_ = ((((Class346_Sub5_Sub2) this).anInt9897 << 8 & 0xff00) + (anInt10319 & 0xff) + ((Class90) class90).anInt1178 * i);
                    if (i_12_ < 0)
                        i_12_ = 0;
                    else if (i_12_ > 65535)
                        i_12_ = 65535;
                    if (i_13_ < 0)
                        i_13_ = 0;
                    else if (i_13_ > 65535)
                        i_13_ = 65535;
                    if (i_14_ < 0)
                        i_14_ = 0;
                    else if (i_14_ > 65535)
                        i_14_ = 65535;
                    ((Class346_Sub5_Sub2) this).anInt9897 &= ~0xffffff;
                    ((Class346_Sub5_Sub2) this).anInt9897 |= (((i_12_ & 0xff00) << 8) + (i_13_ & 0xff00) + ((i_14_ & 0xff00) >> 8));
                    anInt10319 &= ~0xffffff;
                    anInt10319 |= (((i_12_ & 0xff) << 16) + ((i_13_ & 0xff) << 8) + (i_14_ & 0xff));
                }
                if (aShort10320 - aShort10318 <= ((Class90) class90).anInt1167) {
                    int i_15_ = ((((Class346_Sub5_Sub2) this).anInt9897 >> 16 & 0xff00) + (anInt10319 >> 24 & 0xff) + ((Class90) class90).anInt1156 * i);
                    if (i_15_ < 0)
                        i_15_ = 0;
                    else if (i_15_ > 65535)
                        i_15_ = 65535;
                    ((Class346_Sub5_Sub2) this).anInt9897 &= 0xffffff;
                    ((Class346_Sub5_Sub2) this).anInt9897 |= (i_15_ & 0xff00) << 16;
                    anInt10319 &= 0xffffff;
                    anInt10319 |= (i_15_ & 0xff) << 24;
                }
            }
            if (((Class90) class90).anInt1172 != -1 && aShort10320 - aShort10318 <= ((Class90) class90).anInt1130)
                anInt10316 += ((Class90) class90).anInt1175 * i;
            if (((Class90) class90).anInt1153 != -1 && aShort10320 - aShort10318 <= ((Class90) class90).anInt1136)
                ((Class346_Sub5_Sub2) this).anInt9896 += ((Class90) class90).anInt1129 * i;
            double d = (double) aShort10313;
            double d_16_ = (double) aShort10314;
            double d_17_ = (double) aShort10317;
            boolean bool = false;
            if (((Class90) class90).anInt1123 == 1) {
                int i_18_ = i_9_ - ((Class99) (((Class346_Sub6) (((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315)).aClass99_8291)).anInt1271;
                int i_19_ = i_10_ - ((Class99) (((Class346_Sub6) (((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315)).aClass99_8291)).anInt1266;
                int i_20_ = i_11_ - ((Class99) (((Class346_Sub6) (((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315)).aClass99_8291)).anInt1274;
                int i_21_ = ((int) Math.sqrt((double) (i_18_ * i_18_ + i_19_ * i_19_ + i_20_ * i_20_)) >> 2);
                long l_22_ = (long) (((Class90) class90).anInt1135 * i_21_ * i);
                anInt10316 -= (long) anInt10316 * l_22_ >> 18;
            } else if (((Class90) class90).anInt1123 == 2) {
                int i_23_ = i_9_ - ((Class99) (((Class346_Sub6) (((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315)).aClass99_8291)).anInt1271;
                int i_24_ = i_10_ - ((Class99) (((Class346_Sub6) (((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315)).aClass99_8291)).anInt1266;
                int i_25_ = i_11_ - ((Class99) (((Class346_Sub6) (((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315)).aClass99_8291)).anInt1274;
                int i_26_ = i_23_ * i_23_ + i_24_ * i_24_ + i_25_ * i_25_;
                long l_27_ = (long) (((Class90) class90).anInt1135 * i_26_ * i);
                anInt10316 -= (long) anInt10316 * l_27_ >> 28;
            }
            if (((Class90) class90).anIntArray1182 != null) {
                Node node = (((Class293) ((Class346_Sub8) class346_sub8).aClass293_8336).aNode_3434);
                for (Node node_28_ = ((Node) node).prev; node_28_ != node; node_28_ = ((Node) node_28_).prev) {
                    Node_Sub8_Sub17 class248_sub8_sub17 = (Node_Sub8_Sub17) node_28_;
                    Class303 class303 = (((Node_Sub8_Sub17) class248_sub8_sub17).aClass303_9060);
                    if (((Class303) class303).anInt3520 != 1) {
                        boolean bool_29_ = false;
                        for (int i_30_ = 0; i_30_ < ((Class90) class90).anIntArray1182.length; i_30_++) {
                            if (((Class90) class90).anIntArray1182[i_30_] == ((Class303) class303).anInt3526) {
                                bool_29_ = true;
                                break;
                            }
                        }
                        if (bool_29_) {
                            double d_31_ = (double) (i_9_ - ((Node_Sub8_Sub17) class248_sub8_sub17).anInt9064);
                            double d_32_ = (double) (i_10_ - ((Node_Sub8_Sub17) class248_sub8_sub17).anInt9065);
                            double d_33_ = (double) (i_11_ - ((Node_Sub8_Sub17) class248_sub8_sub17).anInt9058);
                            double d_34_ = (d_31_ * d_31_ + d_32_ * d_32_ + d_33_ * d_33_);
                            if (!(d_34_ > (double) (((Class303) class303).aLong3516))) {
                                double d_35_ = Math.sqrt(d_34_);
                                if (d_35_ == 0.0)
                                    d_35_ = 1.0;
                                double d_36_ = (((d_31_ * (double) (((Node_Sub8_Sub17) class248_sub8_sub17).anInt9059)) + d_32_ * (double) ((Class303) class303).anInt3512 + (d_33_ * (double) (((Node_Sub8_Sub17) class248_sub8_sub17).anInt9054))) * 65535.0 / ((double) (((Class303) class303).anInt3514) * d_35_));
                                if (!(d_36_ < (double) (((Class303) class303).anInt3521))) {
                                    double d_37_ = 0.0;
                                    if (((Class303) class303).anInt3508 == 1)
                                        d_37_ = (d_35_ / 16.0 * (double) (((Class303) class303).anInt3528));
                                    else if (((Class303) class303).anInt3508 == 2)
                                        d_37_ = (d_35_ / 16.0 * (d_35_ / 16.0) * (double) (((Class303) class303).anInt3528));
                                    if (((Class303) class303).anInt3511 == 0) {
                                        if (((Class303) class303).anInt3525 == 0) {
                                            d += ((double) (((Node_Sub8_Sub17) class248_sub8_sub17).anInt9059) - d_37_) * (double) i;
                                            d_16_ += ((double) (((Class303) class303).anInt3512) - d_37_) * (double) i;
                                            d_17_ += ((double) (((Node_Sub8_Sub17) class248_sub8_sub17).anInt9054) - d_37_) * (double) i;
                                            bool = true;
                                        } else {
                                            ((Class346_Sub5_Sub2) this).anInt9894 += ((double) (((Node_Sub8_Sub17) class248_sub8_sub17).anInt9059) - d_37_) * (double) i;
                                            ((Class346_Sub5_Sub2) this).anInt9891 += ((double) (((Class303) class303).anInt3512) - d_37_) * (double) i;
                                            ((Class346_Sub5_Sub2) this).anInt9895 += ((double) (((Node_Sub8_Sub17) class248_sub8_sub17).anInt9054) - d_37_) * (double) i;
                                        }
                                    } else {
                                        double d_38_ = (d_31_ / d_35_ * (double) (((Class303) class303).anInt3514));
                                        double d_39_ = (d_32_ / d_35_ * (double) (((Class303) class303).anInt3514));
                                        double d_40_ = (d_33_ / d_35_ * (double) (((Class303) class303).anInt3514));
                                        if (((Class303) class303).anInt3525 == 0) {
                                            d += d_38_ * (double) i;
                                            d_16_ += d_39_ * (double) i;
                                            d_17_ += d_40_ * (double) i;
                                            bool = true;
                                        } else {
                                            ((Class346_Sub5_Sub2) this).anInt9894 += d_38_ * (double) i;
                                            ((Class346_Sub5_Sub2) this).anInt9891 += d_39_ * (double) i;
                                            ((Class346_Sub5_Sub2) this).anInt9895 += d_40_ * (double) i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (((Class90) class90).anIntArray1151 != null) {
                for (int i_41_ = 0; i_41_ < ((Class90) class90).anIntArray1151.length; i_41_++) {
                    Node_Sub8_Sub17 class248_sub8_sub17 = ((Node_Sub8_Sub17) (Class52.aClass179_709.method1598((long) ((Class90) class90).anIntArray1151[i_41_], 23574)));
                    while (class248_sub8_sub17 != null) {
                        Class303 class303 = (((Node_Sub8_Sub17) class248_sub8_sub17).aClass303_9060);
                        double d_42_ = (double) (i_9_ - (((Node_Sub8_Sub17) class248_sub8_sub17).anInt9064));
                        double d_43_ = (double) (i_10_ - ((Node_Sub8_Sub17) class248_sub8_sub17).anInt9065);
                        double d_44_ = (double) (i_11_ - ((Node_Sub8_Sub17) class248_sub8_sub17).anInt9058);
                        double d_45_ = d_42_ * d_42_ + d_43_ * d_43_ + d_44_ * d_44_;
                        if (d_45_ > (double) ((Class303) class303).aLong3516)
                            class248_sub8_sub17 = ((Node_Sub8_Sub17) Class52.aClass179_709.method1595(6594));
                        else {
                            double d_46_ = Math.sqrt(d_45_);
                            if (d_46_ == 0.0)
                                d_46_ = 1.0;
                            double d_47_ = ((d_42_ * (double) (((Node_Sub8_Sub17) class248_sub8_sub17).anInt9059) + d_43_ * (double) (((Class303) class303).anInt3512) + d_44_ * (double) (((Node_Sub8_Sub17) class248_sub8_sub17).anInt9054)) * 65535.0 / ((double) ((Class303) class303).anInt3514 * d_46_));
                            if (d_47_ < (double) ((Class303) class303).anInt3521)
                                class248_sub8_sub17 = ((Node_Sub8_Sub17) Class52.aClass179_709.method1595(6594));
                            else {
                                double d_48_ = 0.0;
                                if (((Class303) class303).anInt3508 == 1)
                                    d_48_ = (d_46_ / 16.0 * (double) (((Class303) class303).anInt3528));
                                else if (((Class303) class303).anInt3508 == 2)
                                    d_48_ = (d_46_ / 16.0 * (d_46_ / 16.0) * (double) (((Class303) class303).anInt3528));
                                if (((Class303) class303).anInt3511 == 0) {
                                    if (((Class303) class303).anInt3525 == 0) {
                                        d += ((double) (((Node_Sub8_Sub17) class248_sub8_sub17).anInt9059) - d_48_) * (double) i;
                                        d_16_ += ((double) (((Class303) class303).anInt3512) - d_48_) * (double) i;
                                        d_17_ += ((double) (((Node_Sub8_Sub17) class248_sub8_sub17).anInt9054) - d_48_) * (double) i;
                                        bool = true;
                                    } else {
                                        ((Class346_Sub5_Sub2) this).anInt9894 += ((double) (((Node_Sub8_Sub17) class248_sub8_sub17).anInt9059) - d_48_) * (double) i;
                                        ((Class346_Sub5_Sub2) this).anInt9891 += ((double) (((Class303) class303).anInt3512) - d_48_) * (double) i;
                                        ((Class346_Sub5_Sub2) this).anInt9895 += ((double) (((Node_Sub8_Sub17) class248_sub8_sub17).anInt9054) - d_48_) * (double) i;
                                    }
                                } else {
                                    double d_49_ = (d_42_ / d_46_ * (double) (((Class303) class303).anInt3514));
                                    double d_50_ = (d_43_ / d_46_ * (double) (((Class303) class303).anInt3514));
                                    double d_51_ = (d_44_ / d_46_ * (double) (((Class303) class303).anInt3514));
                                    if (((Class303) class303).anInt3525 == 0) {
                                        d += d_49_ * (double) i;
                                        d_16_ += d_50_ * (double) i;
                                        d_17_ += d_51_ * (double) i;
                                        bool = true;
                                    } else {
                                        ((Class346_Sub5_Sub2) this).anInt9894 += d_49_ * (double) i;
                                        ((Class346_Sub5_Sub2) this).anInt9891 += d_50_ * (double) i;
                                        ((Class346_Sub5_Sub2) this).anInt9895 += d_51_ * (double) i;
                                    }
                                }
                                class248_sub8_sub17 = ((Node_Sub8_Sub17) Class52.aClass179_709.method1595(6594));
                            }
                        }
                    }
                }
            }
            if (((Class90) class90).anIntArray1159 != null) {
                if (((Class90) class90).anIntArray1111 == null) {
                    ((Class90) class90).anIntArray1111 = new int[((Class90) class90).anIntArray1159.length];
                    for (int i_52_ = 0; i_52_ < ((Class90) class90).anIntArray1159.length; i_52_++) {
                        Node_Sub45.method2642(115, (((Class90) class90).anIntArray1159[i_52_]));
                        ((Class90) class90).anIntArray1111[i_52_] = ((Node_Sub37) (Node_Sub37) (Node_Sub14_Sub16.aClass65_9333.method501((long) (((Class90) class90).anIntArray1159[i_52_]), (byte) 31))).anInt7261;
                    }
                }
                for (int i_53_ = 0; i_53_ < ((Class90) class90).anIntArray1111.length; i_53_++) {
                    Class303 class303 = (Class111_Sub1.aClass303Array5537[((Class90) class90).anIntArray1111[i_53_]]);
                    if (((Class303) class303).anInt3525 == 0) {
                        d += (double) (((Class303) class303).anInt3519 * i);
                        d_16_ += (double) (((Class303) class303).anInt3512 * i);
                        d_17_ += (double) (((Class303) class303).anInt3523 * i);
                        bool = true;
                    } else {
                        ((Class346_Sub5_Sub2) this).anInt9894 += ((Class303) class303).anInt3519 * i;
                        ((Class346_Sub5_Sub2) this).anInt9891 += ((Class303) class303).anInt3512 * i;
                        ((Class346_Sub5_Sub2) this).anInt9895 += ((Class303) class303).anInt3523 * i;
                    }
                }
            }
            if (bool) {
                while (d > 32767.0 || d_16_ > 32767.0 || d_17_ > 32767.0 || d < -32767.0 || d_16_ < -32767.0 || d_17_ < -32767.0) {
                    d /= 2.0;
                    d_16_ /= 2.0;
                    d_17_ /= 2.0;
                    anInt10316 <<= 1;
                }
                aShort10313 = (short) (int) d;
                aShort10314 = (short) (int) d_16_;
                aShort10317 = (short) (int) d_17_;
            }
            ((Class346_Sub5_Sub2) this).anInt9894 += (((long) aShort10313 * (long) (anInt10316 << 2) >> 23) * (long) i);
            ((Class346_Sub5_Sub2) this).anInt9891 += (((long) aShort10314 * (long) (anInt10316 << 2) >> 23) * (long) i);
            ((Class346_Sub5_Sub2) this).anInt9895 += (((long) aShort10317 * (long) (anInt10316 << 2) >> 23) * (long) i);
        }
    }

    final void method3557(Class346_Sub6 class346_sub6, int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, boolean bool, boolean bool_64_) {
        ((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315 = class346_sub6;
        ((Class346_Sub5_Sub2) this).anInt9894 = i << 12;
        ((Class346_Sub5_Sub2) this).anInt9891 = i_54_ << 12;
        ((Class346_Sub5_Sub2) this).anInt9895 = i_55_ << 12;
        ((Class346_Sub5_Sub2) this).anInt9897 = i_61_;
        aShort10320 = aShort10318 = (short) i_60_;
        ((Class346_Sub5_Sub2) this).anInt9896 = i_62_;
        ((Class346_Sub5_Sub2) this).anInt9899 = i_63_;
        ((Class346_Sub5_Sub2) this).aBoolean9898 = bool_64_;
        aShort10313 = (short) i_56_;
        aShort10314 = (short) i_57_;
        aShort10317 = (short) i_58_;
        anInt10316 = i_59_;
        ((Class346_Sub5_Sub2) this).aByte9888 = ((Class40) (((Class346_Sub6) (((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315)).aClass40_8289)).aByte460;
        method3558();
    }

    private final void method3558() {
        int i = ((Class346_Sub8) (((Class346_Sub6) ((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315).aClass346_Sub8_8295)).anInt8327;
        if ((((Class346_Sub8) ((Class346_Sub6) (((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315)).aClass346_Sub8_8295).aClass346_Sub5_Sub2_Sub1Array8333[i]) != null)
            ((Class346_Sub8) ((Class346_Sub6) (((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315)).aClass346_Sub8_8295).aClass346_Sub5_Sub2_Sub1Array8333[i].method3554();
        ((Class346_Sub8) (((Class346_Sub6) (((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315)).aClass346_Sub8_8295)).aClass346_Sub5_Sub2_Sub1Array8333[i] = this;
        aShort10312 = (short) ((Class346_Sub8) (((Class346_Sub6) ((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315).aClass346_Sub8_8295)).anInt8327;
        ((Class346_Sub8) (((Class346_Sub6) (((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315)).aClass346_Sub8_8295)).anInt8327 = i + 1 & 0x1fff;
        ((Class346_Sub6) ((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315).aClass360_8288.method3811(this, 0);
    }

    Class346_Sub5_Sub2_Sub1(Class346_Sub6 class346_sub6, int i, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, boolean bool, boolean bool_75_) {
        ((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315 = class346_sub6;
        ((Class346_Sub5_Sub2) this).anInt9894 = i << 12;
        ((Class346_Sub5_Sub2) this).anInt9891 = i_65_ << 12;
        ((Class346_Sub5_Sub2) this).anInt9895 = i_66_ << 12;
        ((Class346_Sub5_Sub2) this).anInt9897 = i_72_;
        aShort10320 = aShort10318 = (short) i_71_;
        ((Class346_Sub5_Sub2) this).anInt9896 = i_73_;
        ((Class346_Sub5_Sub2) this).anInt9899 = i_74_;
        ((Class346_Sub5_Sub2) this).aBoolean9898 = bool_75_;
        aShort10313 = (short) i_67_;
        aShort10314 = (short) i_68_;
        aShort10317 = (short) i_69_;
        anInt10316 = i_70_;
        ((Class346_Sub5_Sub2) this).aByte9888 = ((Class40) (((Class346_Sub6) (((Class346_Sub5_Sub2_Sub1) this).aClass346_Sub6_10315)).aClass40_8289)).aByte460;
        method3558();
    }
}
