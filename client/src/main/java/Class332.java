/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class332 {
    static int anInt3865;
    private long aLong3866;
    static OutgoingOpcode aOutgoingOpcode_3867 = new OutgoingOpcode(14, -1);
    static int anInt3868;
    static int anInt3869;
    static int anInt3870;
    private int anInt3871;
    static int anInt3872;
    static int anInt3873;
    static boolean aBoolean3874 = false;
    static int anInt3875;
    static int anInt3876;
    static int anInt3877;
    static int anInt3878;
    int anInt3879 = -1;
    static int anInt3880;
    boolean aBoolean3881;
    static int anInt3882;
    static int anInt3883 = 0;
    private int[] looks;
    int[] colors;
    static int anInt3886;
    private long aLong3887;

    final Class162 method3397(Class172 class172, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, Class182 class182, Class356 class356, ha var_ha, int i_5_, int i_6_) {
        anInt3878++;
        int i_7_ = i;
        if (class182 != null) {
            boolean bool = false;
            boolean bool_8_ = false;
            boolean bool_9_ = false;
            boolean bool_10_ = false;
            int i_11_ = -1;
            int i_12_ = -1;
            Object object = null;
            i_11_ = ((Class182) class182).anIntArray2117[i_1_];
            i_7_ |= 0x20;
            Object object_13_ = null;
            int i_14_ = i_11_ >>> 280860208;
            i_11_ &= 0xffff;
            Node_Sub8_Sub2 class248_sub8_sub2 = class356.method3788(-61, i_14_);
            if (class248_sub8_sub2 != null) {
                bool_8_ |= class248_sub8_sub2.method2035(i_11_, -76);
                bool |= class248_sub8_sub2.method2040(1, i_11_);
                bool_10_ |= class248_sub8_sub2.method2037(1, i_11_);
                bool_9_ |= ((Class182) class182).aBoolean2116;
            }
            if ((((Class182) class182).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && (i_2_ ^ 0xffffffff) != 0 && ((Class182) class182).anIntArray2117.length > i_2_) {
                i_12_ = ((Class182) class182).anIntArray2117[i_2_];
                int i_15_ = i_12_ >>> 1868004752;
                i_12_ &= 0xffff;
                Node_Sub8_Sub2 class248_sub8_sub2_16_;
                if (i_15_ != i_14_)
                    class248_sub8_sub2_16_ = class356.method3788(-57, i_12_ >>> 116814672);
                else
                    class248_sub8_sub2_16_ = class248_sub8_sub2;
                if (class248_sub8_sub2_16_ != null) {
                    bool_8_ |= class248_sub8_sub2_16_.method2035(i_12_, -121);
                    bool |= class248_sub8_sub2_16_.method2040(1, i_12_);
                    bool_10_ |= class248_sub8_sub2_16_.method2037(1, i_12_);
                }
            }
            if (bool_8_)
                i_7_ |= 0x80;
            if (bool)
                i_7_ |= 0x100;
            if (bool_9_)
                i_7_ |= 0x200;
            if (bool_10_)
                i_7_ |= 0x400;
        }
        long l = ((long) i_4_ | ((long) i_6_ << -232032160 | (long) (i_5_ << 1676892656)));
        Class162 class162;
        synchronized (Node_Sub14_Sub15.aClass278_9325) {
            class162 = (Class162) Node_Sub14_Sub15.aClass278_9325.method2863(4, l);
        }
        if (class162 == null || (var_ha.b(class162.ua(), i_7_) ^ 0xffffffff) != -1) {
            if (class162 != null)
                i_7_ = var_ha.c(i_7_, class162.ua());
            int i_17_ = i_7_;
            Class343[] class343s = new Class343[3];
            int i_18_ = 0;
            if (!class172.method1553(1645, i_4_).method2782((byte) -123) || !class172.method1553(1645, i_5_).method2782((byte) -123) || !class172.method1553(1645, i_6_).method2782((byte) -123))
                return null;
            Class343 class343 = class172.method1553(1645, i_4_).method2778(73);
            if (class343 != null)
                class343s[i_18_++] = class343;
            class343 = class172.method1553(1645, i_5_).method2778(70);
            if (class343 != null)
                class343s[i_18_++] = class343;
            class343 = class172.method1553(1645, i_6_).method2778(118);
            if (class343 != null)
                class343s[i_18_++] = class343;
            i_17_ |= 0x4000;
            class343 = new Class343(class343s, i_18_);
            class162 = var_ha.a(class343, i_17_, Class346_Sub7_Sub1.anInt9908, 64, 768);
            for (int i_19_ = 0; i_19_ < 5; i_19_++) {
                for (int i_20_ = 0; Class226_Sub2.aShortArrayArrayArray6667.length > i_20_; i_20_++) {
                    if (((Class332) this).colors[i_19_] < (Class226_Sub2.aShortArrayArrayArray6667[i_20_][i_19_]).length)
                        class162.ia((Class205.aShortArrayArray2388[i_20_][i_19_]), (Class226_Sub2.aShortArrayArrayArray6667[i_20_][i_19_][(((Class332) this).colors[i_19_])]));
                }
            }
            class162.s(i_7_);
            synchronized (Node_Sub14_Sub15.aClass278_9325) {
                Node_Sub14_Sub15.aClass278_9325.method2867((byte) 0, l, class162);
            }
        }
        if (class182 == null)
            return class162;
        int i_21_ = -15 % ((-66 - i_0_) / 35);
        class162 = class162.method1436((byte) 4, i_7_, true);
        class162 = class182.method1605(i, i_3_, i_1_, class162, false, i_2_);
        return class162;
    }

    private final void method3398(byte i) {
        anInt3882++;
        aLong3866 = -1L;
        long[] ls = Class327.aLongArray3833;
        aLong3866 = (aLong3866 >>> 939924936 ^ ls[(int) ((aLong3866 ^ (long) (anInt3871 >> -1191059928)) & 0xffL)]);
        aLong3866 = (ls[(int) (0xffL & ((long) anInt3871 ^ aLong3866))] ^ aLong3866 >>> 807523912);
        for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -13; i_22_++) {
            aLong3866 = (aLong3866 >>> 1915601928 ^ ls[(int) (0xffL & ((long) (looks[i_22_] >> -2031423176) ^ aLong3866))]);
            aLong3866 = (aLong3866 >>> 1767731528 ^ ls[(int) ((aLong3866 ^ (long) (looks[i_22_] >> -667940752)) & 0xffL)]);
            aLong3866 = ls[(int) (0xffL & ((long) (looks[i_22_] >> -521343960) ^ aLong3866))] ^ aLong3866 >>> 2109592968;
            aLong3866 = (aLong3866 >>> 1666594376 ^ ls[(int) (0xffL & (aLong3866 ^ (long) looks[i_22_]))]);
        }
        for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > -6; i_23_++)
            aLong3866 = ls[(int) (((long) ((Class332) this).colors[i_23_] ^ aLong3866) & 0xffL)] ^ aLong3866 >>> 1475265928;
        aLong3866 = ls[(int) (0xffL & ((long) (!((Class332) this).aBoolean3881 ? 0 : 1) ^ aLong3866))] ^ aLong3866 >>> 2125216200;
        if (i > -10)
            method3397(null, -3, 57, 125, 107, 73, 51, null, null, null, -37, -70);
    }

    final Class162 method3399(int i, Class182 class182, Class356 class356, Class172 class172, int i_24_, byte i_25_, int i_26_, ha var_ha, Interface3 interface3, Class342 class342, Class119 class119, int i_27_) {
        anInt3870++;
        if ((((Class332) this).anInt3879 ^ 0xffffffff) != 0)
            return (class119.method1123(((Class332) this).anInt3879, 8881).method2745(var_ha, i_27_, (byte) -63, interface3, null, class356, i_26_, i, class182, i_24_));
        int i_28_ = i_27_;
        if (class182 != null) {
            boolean bool = false;
            boolean bool_29_ = false;
            boolean bool_30_ = false;
            boolean bool_31_ = false;
            int i_32_ = -1;
            int i_33_ = -1;
            Object object = null;
            i_28_ |= 0x20;
            Object object_34_ = null;
            i_32_ = ((Class182) class182).anIntArray2117[i];
            int i_35_ = i_32_ >>> -120708560;
            i_32_ &= 0xffff;
            Node_Sub8_Sub2 class248_sub8_sub2 = class356.method3788(-97, i_35_);
            if (class248_sub8_sub2 != null) {
                bool_29_ |= class248_sub8_sub2.method2035(i_32_, -3);
                bool |= class248_sub8_sub2.method2040(1, i_32_);
                bool_31_ |= class248_sub8_sub2.method2037(1, i_32_);
                bool_30_ |= ((Class182) class182).aBoolean2116;
            }
            if ((((Class182) class182).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && i_26_ != -1 && ((i_26_ ^ 0xffffffff) > (((Class182) class182).anIntArray2117.length ^ 0xffffffff))) {
                i_33_ = ((Class182) class182).anIntArray2117[i_26_];
                int i_36_ = i_33_ >>> -414088240;
                i_33_ &= 0xffff;
                Node_Sub8_Sub2 class248_sub8_sub2_37_ = ((i_36_ ^ 0xffffffff) != (i_35_ ^ 0xffffffff) ? class356.method3788(-119, i_36_) : class248_sub8_sub2);
                if (class248_sub8_sub2_37_ != null) {
                    bool_29_ |= class248_sub8_sub2_37_.method2035(i_33_, -70);
                    bool |= class248_sub8_sub2_37_.method2040(1, i_33_);
                    bool_31_ |= class248_sub8_sub2_37_.method2037(1, i_33_);
                }
            }
            if (bool_29_)
                i_28_ |= 0x80;
            if (bool)
                i_28_ |= 0x100;
            if (bool_30_)
                i_28_ |= 0x200;
            if (bool_31_)
                i_28_ |= 0x400;
        }
        int i_38_ = -15 / (-i_25_ / 62);
        Class162 class162;
        synchronized (Node_Sub14_Sub15.aClass278_9325) {
            class162 = (Class162) Node_Sub14_Sub15.aClass278_9325.method2863(4, aLong3866);
        }
        if (class162 == null || (var_ha.b(class162.ua(), i_28_) ^ 0xffffffff) != -1) {
            if (class162 != null)
                i_28_ = var_ha.c(i_28_, class162.ua());
            int i_39_ = i_28_;
            boolean bool = false;
            for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > -13; i_40_++) {
                int i_41_ = looks[i_40_];
                if ((i_41_ & 0x40000000 ^ 0xffffffff) != -1) {
                    if (!class342.method3482((byte) 101, 0x3fffffff & i_41_).method3337((byte) 106, ((Class332) this).aBoolean3881))
                        bool = true;
                } else if ((i_41_ & ~0x7fffffff ^ 0xffffffff) != -1 && !class172.method1553(1645, i_41_ & 0x3fffffff).method2782((byte) -123))
                    bool = true;
            }
            if (bool)
                return null;
            Class343[] class343s = new Class343[12];
            int i_42_ = 0;
            for (int i_43_ = 0; i_43_ < 12; i_43_++) {
                int i_44_ = looks[i_43_];
                if ((0x40000000 & i_44_) == 0) {
                    if ((~0x7fffffff & i_44_ ^ 0xffffffff) != -1) {
                        Class343 class343 = class172.method1553(1645, i_44_ & 0x3fffffff).method2778(106);
                        if (class343 != null)
                            class343s[i_42_++] = class343;
                    }
                } else {
                    Class343 class343 = (class342.method3482((byte) 120, i_44_ & 0x3fffffff).method3334(false, ((Class332) this).aBoolean3881));
                    if (class343 != null)
                        class343s[i_42_++] = class343;
                }
            }
            Class343 class343 = new Class343(class343s, i_42_);
            i_39_ |= 0x4000;
            class162 = var_ha.a(class343, i_39_, Class346_Sub7_Sub1.anInt9908, 64, 768);
            for (int i_45_ = 0; i_45_ < 5; i_45_++) {
                for (int i_46_ = 0; i_46_ < Class226_Sub2.aShortArrayArrayArray6667.length; i_46_++) {
                    if (((Class332) this).colors[i_45_] < (Class226_Sub2.aShortArrayArrayArray6667[i_46_][i_45_]).length)
                        class162.ia((Class205.aShortArrayArray2388[i_46_][i_45_]), (Class226_Sub2.aShortArrayArrayArray6667[i_46_][i_45_][(((Class332) this).colors[i_45_])]));
                }
            }
            class162.s(i_28_);
            synchronized (Node_Sub14_Sub15.aClass278_9325) {
                Node_Sub14_Sub15.aClass278_9325.method2867((byte) 0, aLong3866, class162);
            }
        }
        if (class182 == null)
            return class162;
        Class162 class162_47_ = class162.method1436((byte) 4, i_28_, true);
        class162_47_ = class182.method1605(i_27_, i_24_, i, class162, false, i_26_);
        return class162_47_;
    }

    static final void method3400(int i) {
        anInt3873++;
        if (i != 1)
            method3400(-99);
        Node_Sub8.aBoolean6865 = true;
    }

    final void setLooks(int i, int looksIndex, int dummy, Class342 class342) {
        anInt3868++;
        if ((i ^ 0xffffffff) == 0) {
            looks[looksIndex] = 0;
            //System.out.println("set1 looks[" + looksIndex + "] = " + looks[looksIndex]);
        } else {
            if (class342.method3482((byte) 66, i) == null)
                return;
            looks[looksIndex] = Class358.retrieveLooksSettings(1073741824, i);
            //System.out.println("set1 looks[" + looksIndex + "] = " + looks[looksIndex] + " lookValue: " + i);
            method3398((byte) -119);
        }
        if (dummy != 15073)
            anInt3883 = -27;
    }

    static final String method3402(int i, String[] strings, int i_50_, int i_51_) {
        anInt3872++;
        if (i_51_ == 0)
            return "";
        if ((i_51_ ^ 0xffffffff) == -2) {
            String string = strings[i_50_];
            if (string == null)
                return "null";
            return string.toString();
        }
        int i_52_ = i_50_ + i_51_;
        int i_53_ = 0;
        for (int i_54_ = i_50_; (i_52_ ^ 0xffffffff) < (i_54_ ^ 0xffffffff); i_54_++) {
            String string = strings[i_54_];
            if (string == null)
                i_53_ += 4;
            else
                i_53_ += string.length();
        }
        StringBuffer stringbuffer = new StringBuffer(i_53_);
        if (i != -30907)
            aOutgoingOpcode_3867 = null;
        for (int i_55_ = i_50_; (i_52_ ^ 0xffffffff) < (i_55_ ^ 0xffffffff); i_55_++) {
            String string = strings[i_55_];
            if (string == null)
                stringbuffer.append("null");
            else
                stringbuffer.append(string);
        }
        return stringbuffer.toString();
    }

    static final void method3403(boolean bool, int i, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_) {
        anInt3886++;
        if (bool != true)
            method3405(15, null);
        int i_61_ = Class131.anInt1600;
        int[] is = Class271.anIntArray3156;
        Class25.anInt338 = 0;
        for (int i_62_ = 0; (i_62_ ^ 0xffffffff) > (i_61_ + Class28.anInt4892 ^ 0xffffffff); i_62_++) {
            Class255 class255 = null;
            Entity entity;
            if (i_62_ < i_61_)
                entity = (Node_Sub32.aPlayerArray7197[is[i_62_]]);
            else {
                entity = ((Node_Sub10) (Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) (Class346_Sub7_Sub2_Sub3.anIntArray10381[i_62_ - i_61_]), (byte) 31))).aNPC_6946;
                class255 = ((NPC) (NPC) entity).aClass255_10614;
                if (((Class255) class255).anIntArray2923 != null) {
                    class255 = class255.method2737((byte) 95, Node_Sub43.aClass291_7306);
                    if (class255 == null)
                        continue;
                }
            }
            if ((((Entity) entity).anInt10410 ^ 0xffffffff) <= -1 && (Class54.anInt727 == ((Entity) entity).anInt10445 || (((((Interactable) Class347.myPlayer).plane) ^ 0xffffffff) == (((Interactable) entity).plane ^ 0xffffffff)))) {
                Class162.method1439(entity, entity.method3641(true), i_57_ >> 1621533281, i_58_, i >> -2115264383, 0, i_60_);
                if (Class303.anIntArray3527[0] >= 0) {
                    if ((((Entity) entity).message) != null && (i_61_ <= i_62_ || ((Node_Sub8_Sub4.anInt8377 ^ 0xffffffff) == -1) || Node_Sub8_Sub4.anInt8377 == 3 || (((Node_Sub8_Sub4.anInt8377 ^ 0xffffffff) == -2) && (Class310_Sub1.method3261(((Player) (Player) entity).aString10550, 116)))) && ((Class25.anInt338 ^ 0xffffffff) > (Class342.anInt4016 ^ 0xffffffff))) {
                        Class342.anIntArray4007[Class25.anInt338] = ((Class264.aClass285_2996.method3068(-1, ((Entity) entity).message)) / 2);
                        Class342.anIntArray4006[Class25.anInt338] = Class303.anIntArray3527[0];
                        Class342.anIntArray4009[Class25.anInt338] = Class303.anIntArray3527[1];
                        Class342.anIntArray4019[Class25.anInt338] = ((Entity) entity).anInt10458;
                        Class342.anIntArray4011[Class25.anInt338] = ((Entity) entity).anInt10462;
                        Class342.anIntArray4017[Class25.anInt338] = ((Entity) entity).anInt10481;
                        Class342.aStringArray4013[Class25.anInt338] = ((Entity) entity).message;
                        Class25.anInt338++;
                    }
                    int i_63_ = Class303.anIntArray3527[1] + i_59_;
                    if (!(((Entity) entity).aBoolean10439) && ((Node_Sub18.anInt7027 ^ 0xffffffff) > (((Entity) entity).anInt10416 ^ 0xffffffff))) {
                        int i_64_ = -1;
                        int i_65_ = 1;
                        if ((i_62_ ^ 0xffffffff) > (i_61_ ^ 0xffffffff)) {
                            Player player = (Node_Sub32.aPlayerArray7197[is[i_62_]]);
                            i_64_ = ((Class281) entity.method3642(0)).anInt3269;
                            if (((Player) player).aBoolean10565)
                                i_65_ = 2;
                        } else {
                            i_64_ = ((Class255) class255).anInt2899;
                            if ((i_64_ ^ 0xffffffff) == 0)
                                i_64_ = (((Class281) entity.method3642(0)).anInt3269);
                        }
                        Class129[] class129s = Node_Sub14_Sub3.aClass129Array9186;
                        if (i_64_ != -1) {
                            Class129[] class129s_66_ = ((Class129[]) Class382.aClass278_4697.method2863(4, (long) i_64_));
                            if (class129s_66_ == null) {
                                Class157[] class157s = Class157.method1392((Class290.aClass381_3417), i_64_, 0);
                                if (class157s != null) {
                                    class129s_66_ = new Class129[class157s.length];
                                    for (int i_67_ = 0; ((class157s.length ^ 0xffffffff) < (i_67_ ^ 0xffffffff)); i_67_++)
                                        class129s_66_[i_67_] = Class287.aHa3381.a(class157s[i_67_], true);
                                    Class382.aClass278_4697.method2867((byte) 0, (long) i_64_, class129s_66_);
                                }
                            }
                            if (class129s_66_ != null && (class129s_66_.length ^ 0xffffffff) <= -3)
                                class129s = class129s_66_;
                        }
                        if (class129s.length <= i_65_)
                            i_65_ = 1;
                        Class129 class129 = class129s[0];
                        Class129 class129_68_ = class129s[i_65_];
                        i_63_ -= Math.max((((Class285) Class264.aClass285_2996).anInt3370), class129.method1176());
                        int i_69_ = (Class303.anIntArray3527[0] + i_56_ - (class129.method1175() >> 2035041889));
                        int i_70_ = (class129.method1175() * ((Entity) entity).anInt10438 / 255);
                        int i_71_ = class129.method1176();
                        if ((((Entity) entity).anInt10438 ^ 0xffffffff) < -1 && (i_70_ ^ 0xffffffff) > -3)
                            i_70_ = 2;
                        class129.method1168(i_69_, i_63_);
                        Class287.aHa3381.T(i_69_, i_63_, i_69_ + i_70_, i_71_ + i_63_);
                        class129_68_.method1168(i_69_, i_63_);
                        Class287.aHa3381.KA(i_56_, i_59_, i + i_56_, i_59_ + i_57_);
                        Class210.method1724(class129.method1169() + i_69_, i_69_, (byte) -55, i_71_ + i_63_, i_63_);
                    } else
                        i_63_ -= Math.max((((Class285) Class264.aClass285_2996).anInt3370), Node_Sub14_Sub3.aClass129Array9186[0].method1176());
                    i_63_ -= 2;
                    if (!((Entity) entity).aBoolean10439) {
                        if (((Entity) entity).anInt10490 > Node_Sub18.anInt7027) {
                            Class129 class129 = (Class261.aClass129Array2971[(((Entity) entity).aBoolean10451) ? 2 : 0]);
                            Class129 class129_72_ = (Class261.aClass129Array2971[(((Entity) entity).aBoolean10451 ? 3 : 1)]);
                            int i_73_ = -1;
                            if (!(entity instanceof NPC))
                                i_73_ = (((Class281) entity.method3642(0)).anInt3312);
                            else {
                                i_73_ = ((Class255) class255).anInt2929;
                                if (i_73_ == -1)
                                    i_73_ = (((Class281) entity.method3642(0)).anInt3312);
                            }
                            if (i_73_ != -1) {
                                Class129[] class129s = ((Class129[]) Class241.aClass278_2690.method2863(4, (long) i_73_));
                                if (class129s == null) {
                                    Class157[] class157s = (Class157.method1392(Class290.aClass381_3417, i_73_, 0));
                                    if (class157s != null) {
                                        class129s = new Class129[class157s.length];
                                        for (int i_74_ = 0; ((i_74_ ^ 0xffffffff) > (class157s.length ^ 0xffffffff)); i_74_++)
                                            class129s[i_74_] = Class287.aHa3381.a((class157s[i_74_]), true);
                                        Class241.aClass278_2690.method2867((byte) 0, (long) i_73_, class129s);
                                    }
                                }
                                if (class129s != null && class129s.length == 4) {
                                    class129_72_ = class129s[(((Entity) entity).aBoolean10451) ? 3 : 1];
                                    class129 = class129s[(((Entity) entity).aBoolean10451) ? 2 : 0];
                                }
                            }
                            int i_75_ = (((Entity) entity).anInt10490 - Node_Sub18.anInt7027);
                            int i_76_;
                            if (i_75_ > ((Entity) entity).anInt10412) {
                                i_75_ -= ((Entity) entity).anInt10412;
                                int i_77_ = ((((Entity) entity).anInt10449 == 0) ? 0 : ((((Entity) entity).anInt10440 + -i_75_) / (((Entity) entity).anInt10449) * (((Entity) entity).anInt10449)));
                                i_76_ = (class129.method1175() * i_77_ / ((Entity) entity).anInt10440);
                            } else
                                i_76_ = class129.method1175();
                            int i_78_ = class129.method1176();
                            i_63_ -= i_78_;
                            int i_79_ = (Class303.anIntArray3527[0] + (i_56_ + -(class129.method1175() >> 1363513217)));
                            class129.method1168(i_79_, i_63_);
                            Class287.aHa3381.T(i_79_, i_63_, i_76_ + i_79_, i_78_ + i_63_);
                            class129_72_.method1168(i_79_, i_63_);
                            Class287.aHa3381.KA(i_56_, i_59_, i_56_ + i, i_59_ + i_57_);
                            Class210.method1724(i_79_ - -class129.method1169(), i_79_, (byte) -61, i_63_ - -i_78_, i_63_);
                            i_63_ -= 2;
                        }
                        if ((i_61_ ^ 0xffffffff) >= (i_62_ ^ 0xffffffff)) {
                            if (((((Class255) class255).anInt2890 ^ 0xffffffff) <= -1) && (Class272.aClass129Array3165.length > ((Class255) class255).anInt2890)) {
                                i_63_ -= 25;
                                Class129 class129 = (Class272.aClass129Array3165[((Class255) class255).anInt2890]);
                                class129.method1168((i_56_ + (Class303.anIntArray3527[0]) + -(class129.method1175() >> 1200134497)), i_63_);
                                Class210.method1724((i_56_ - -Class303.anIntArray3527[0] + (-(class129.method1175() >> 1705376353) + class129.method1169())), (Class303.anIntArray3527[0] + (i_56_ + -(class129.method1175() >> -1670861759))), (byte) -107, i_63_ + class129.method1181(), i_63_);
                                i_63_ -= 2;
                            }
                        } else {
                            Player player = ((Player) entity);
                            if (((Player) player).anInt10562 != -1) {
                                i_63_ -= 25;
                                Class129 class129 = (Node_Sub35.aClass129Array7247[(((Player) player).anInt10562)]);
                                class129.method1168(i_56_ + (Class303.anIntArray3527[0]) - 12, i_63_);
                                Class210.method1724(-12 + (i_56_ + Class303.anIntArray3527[0] - -class129.method1169()), i_56_ - -Class303.anIntArray3527[0] - 12, (byte) -38, i_63_ + class129.method1181(), i_63_);
                                i_63_ -= 2;
                            }
                            if (((Player) player).anInt10560 != -1) {
                                i_63_ -= 25;
                                Class129 class129 = (Class272.aClass129Array3165[(((Player) player).anInt10560)]);
                                class129.method1168(-12 + ((Class303.anIntArray3527[0]) + i_56_), i_63_);
                                Class210.method1724((Class303.anIntArray3527[0] + i_56_ + (-12 + class129.method1169())), -12 + (Class303.anIntArray3527[0] + i_56_), (byte) -123, i_63_ + class129.method1181(), i_63_);
                                i_63_ -= 2;
                            }
                        }
                    }
                    if (entity instanceof Player) {
                        if ((i_62_ ^ 0xffffffff) <= -1) {
                            int i_80_ = 0;
                            Class7[] class7s = Class225_Sub3.aClass7Array8477;
                            for (int i_81_ = 0; ((i_81_ ^ 0xffffffff) > (class7s.length ^ 0xffffffff)); i_81_++) {
                                Class7 class7 = class7s[i_81_];
                                if (class7 != null && ((Class7) class7).anInt169 == 10 && ((is[i_62_] ^ 0xffffffff) == (((Class7) class7).anInt164 ^ 0xffffffff))) {
                                    Class129 class129 = (Class366.aClass129Array4497[((Class7) class7).anInt167]);
                                    if (class129.method1176() > i_80_)
                                        i_80_ = class129.method1176();
                                    class129.method1168(((Class303.anIntArray3527[0]) + (i_56_ + -12)), (-class129.method1176() + i_63_));
                                    Class210.method1724(-12 + (i_56_ + (Class303.anIntArray3527[0] - -class129.method1169())), (Class303.anIntArray3527[0] + i_56_ - 12), (byte) -98, (-class129.method1176() + (i_63_ - -class129.method1181())), i_63_ + -class129.method1176());
                                }
                            }
                            if ((i_80_ ^ 0xffffffff) < -1)
                                i_63_ -= i_80_ + 2;
                        }
                    } else {
                        int i_82_ = 0;
                        Class7[] class7s = Class225_Sub3.aClass7Array8477;
                        for (int i_83_ = 0; ((i_83_ ^ 0xffffffff) > (class7s.length ^ 0xffffffff)); i_83_++) {
                            Class7 class7 = class7s[i_83_];
                            if (class7 != null && ((((Class7) class7).anInt169 ^ 0xffffffff) == -2) && (((Class346_Sub7_Sub2_Sub3.anIntArray10381[-i_61_ + i_62_]) ^ 0xffffffff) == (((Class7) class7).anInt164 ^ 0xffffffff))) {
                                Class129 class129 = (Class366.aClass129Array4497[((Class7) class7).anInt167]);
                                if ((i_82_ ^ 0xffffffff) > (class129.method1176() ^ 0xffffffff))
                                    i_82_ = class129.method1176();
                                if (Node_Sub18.anInt7027 % 20 < 10) {
                                    class129.method1168((i_56_ - -Class303.anIntArray3527[0] - 12), -class129.method1176() + i_63_);
                                    Class210.method1724((-12 + (i_56_ - -Class303.anIntArray3527[0]) - -class129.method1169()), (-12 + i_56_ + Class303.anIntArray3527[0]), (byte) -111, i_63_ - (class129.method1176() - class129.method1181()), i_63_ - class129.method1176());
                                }
                            }
                        }
                        if ((i_82_ ^ 0xffffffff) < -1)
                            i_63_ -= 2 + i_82_;
                    }
                    int i_84_ = 0;
                    for (/**/; ((i_84_ ^ 0xffffffff) > (Class25.anInt344 ^ 0xffffffff)); i_84_++) {
                        int i_85_ = (((Entity) entity).anIntArray10435[i_84_]);
                        int i_86_ = (((Entity) entity).anIntArray10470[i_84_]);
                        Class70 class70 = null;
                        int i_87_ = 0;
                        if ((i_86_ ^ 0xffffffff) > -1) {
                            if ((i_85_ ^ 0xffffffff) > -1)
                                continue;
                        } else {
                            if (i_85_ <= Node_Sub18.anInt7027)
                                continue;
                            class70 = (Class19.aClass4_298.method174(64, (((Entity) entity).anIntArray10470[i_84_])));
                            i_87_ = ((Class70) class70).anInt924;
                        }
                        int i_88_ = (((Entity) entity).anIntArray10433[i_84_]);
                        Class70 class70_89_ = null;
                        if (i_88_ >= 0)
                            class70_89_ = Class19.aClass4_298.method174(64, i_88_);
                        if (Node_Sub18.anInt7027 >= i_85_ - i_87_) {
                            int i_90_ = (((Entity) entity).anIntArray10446[i_84_]);
                            if ((i_90_ ^ 0xffffffff) <= -1) {
                                ((Entity) entity).anInt10416 = 300 + Node_Sub18.anInt7027;
                                ((Entity) entity).anInt10438 = i_90_;
                                ((Entity) entity).anIntArray10446[i_84_] = -1;
                            }
                            if (class70 == null)
                                ((Entity) entity).anIntArray10435[i_84_] = -1;
                            else {
                                int i_91_ = (entity.method3641(true) / 2);
                                Class162.method1439(entity, i_91_, i_57_ >> 1255264289, i_58_, i >> -938086623, 0, i_60_);
                                if ((Class303.anIntArray3527[0] ^ 0xffffffff) < 0) {
                                    Class303.anIntArray3527[0] += Class188.anIntArray2189[i_84_];
                                    Class303.anIntArray3527[1] += Class108.anIntArray1365[i_84_];
                                    Object object = null;
                                    Object object_92_ = null;
                                    Object object_93_ = null;
                                    Object object_94_ = null;
                                    int i_95_ = 0;
                                    int i_96_ = 0;
                                    int i_97_ = 0;
                                    int i_98_ = 0;
                                    int i_99_ = 0;
                                    int i_100_ = 0;
                                    int i_101_ = 0;
                                    int i_102_ = 0;
                                    Class129 class129 = null;
                                    Class129 class129_103_ = null;
                                    Class129 class129_104_ = null;
                                    Class129 class129_105_ = null;
                                    int i_106_ = 0;
                                    int i_107_ = 0;
                                    int i_108_ = 0;
                                    int i_109_ = 0;
                                    int i_110_ = 0;
                                    int i_111_ = 0;
                                    int i_112_ = 0;
                                    int i_113_ = 0;
                                    int i_114_ = 0;
                                    Class129 class129_115_ = class70.method529(-1, Class287.aHa3381);
                                    if (class129_115_ != null) {
                                        i_95_ = class129_115_.method1175();
                                        int i_116_ = class129_115_.method1176();
                                        class129_115_.method1179(Node_Sub14_Sub1.anIntArray9173);
                                        if (i_116_ > i_114_)
                                            i_114_ = i_116_;
                                        i_99_ = (Node_Sub14_Sub1.anIntArray9173[0]);
                                    }
                                    Class129 class129_117_ = class70.method531(true, Class287.aHa3381);
                                    if (class129_117_ != null) {
                                        i_96_ = class129_117_.method1175();
                                        int i_118_ = class129_117_.method1176();
                                        if (i_118_ > i_114_)
                                            i_114_ = i_118_;
                                        class129_117_.method1179(Node_Sub14_Sub1.anIntArray9173);
                                        i_100_ = (Node_Sub14_Sub1.anIntArray9173[0]);
                                    }
                                    Class129 class129_119_ = class70.method532(-1, Class287.aHa3381);
                                    if (class129_119_ != null) {
                                        i_97_ = class129_119_.method1175();
                                        int i_120_ = class129_119_.method1176();
                                        class129_119_.method1179(Node_Sub14_Sub1.anIntArray9173);
                                        if ((i_114_ ^ 0xffffffff) > (i_120_ ^ 0xffffffff))
                                            i_114_ = i_120_;
                                        i_101_ = (Node_Sub14_Sub1.anIntArray9173[0]);
                                    }
                                    Class129 class129_121_ = class70.method536(Class287.aHa3381, -74);
                                    if (class129_121_ != null) {
                                        i_98_ = class129_121_.method1175();
                                        int i_122_ = class129_121_.method1176();
                                        class129_121_.method1179(Node_Sub14_Sub1.anIntArray9173);
                                        if ((i_114_ ^ 0xffffffff) > (i_122_ ^ 0xffffffff))
                                            i_114_ = i_122_;
                                        i_102_ = (Node_Sub14_Sub1.anIntArray9173[0]);
                                    }
                                    if (class70_89_ != null) {
                                        class129 = (class70_89_.method529(-1, Class287.aHa3381));
                                        if (class129 != null) {
                                            i_106_ = class129.method1175();
                                            int i_123_ = class129.method1176();
                                            if ((i_114_ ^ 0xffffffff) > (i_123_ ^ 0xffffffff))
                                                i_114_ = i_123_;
                                            class129.method1179(Node_Sub14_Sub1.anIntArray9173);
                                            i_110_ = (Node_Sub14_Sub1.anIntArray9173[0]);
                                        }
                                        class129_103_ = (class70_89_.method531(true, Class287.aHa3381));
                                        if (class129_103_ != null) {
                                            i_107_ = class129_103_.method1175();
                                            int i_124_ = class129_103_.method1176();
                                            if ((i_124_ ^ 0xffffffff) < (i_114_ ^ 0xffffffff))
                                                i_114_ = i_124_;
                                            class129_103_.method1179(Node_Sub14_Sub1.anIntArray9173);
                                            i_111_ = (Node_Sub14_Sub1.anIntArray9173[0]);
                                        }
                                        class129_104_ = (class70_89_.method532(-1, Class287.aHa3381));
                                        if (class129_104_ != null) {
                                            i_108_ = class129_104_.method1175();
                                            int i_125_ = class129_104_.method1176();
                                            class129_104_.method1179(Node_Sub14_Sub1.anIntArray9173);
                                            if (i_125_ > i_114_)
                                                i_114_ = i_125_;
                                            i_112_ = (Node_Sub14_Sub1.anIntArray9173[0]);
                                        }
                                        class129_105_ = class70_89_.method536((Class287.aHa3381), -96);
                                        if (class129_105_ != null) {
                                            i_109_ = class129_105_.method1175();
                                            int i_126_ = class129_105_.method1176();
                                            if ((i_126_ ^ 0xffffffff) < (i_114_ ^ 0xffffffff))
                                                i_114_ = i_126_;
                                            class129_105_.method1179(Node_Sub14_Sub1.anIntArray9173);
                                            i_113_ = (Node_Sub14_Sub1.anIntArray9173[0]);
                                        }
                                    }
                                    Class48 class48 = Class168.aClass48_1968;
                                    Class48 class48_127_ = Class168.aClass48_1968;
                                    Class285 class285 = s_Sub2.aClass285_7962;
                                    int i_128_ = ((Class70) class70).anInt926;
                                    Class285 class285_129_ = s_Sub2.aClass285_7962;
                                    if (i_128_ >= 0) {
                                        Class48 class48_130_ = (Node_Sub25.method2548(i_128_, Class287.aHa3381, (byte) 58, true));
                                        Class285 class285_131_ = Class128.method1160((Class287.aHa3381), i_128_, 27198);
                                        if (class48_130_ != null && class285_131_ != null) {
                                            class48 = class48_130_;
                                            class285 = class285_131_;
                                        }
                                    }
                                    if (class70_89_ != null) {
                                        i_128_ = ((Class70) class70_89_).anInt926;
                                        if (i_128_ >= 0) {
                                            Class48 class48_132_ = (Node_Sub25.method2548(i_128_, Class287.aHa3381, (byte) 58, true));
                                            Class285 class285_133_ = (Class128.method1160(Class287.aHa3381, i_128_, 27198));
                                            if (class48_132_ != null && class285_133_ != null) {
                                                class48_127_ = class48_132_;
                                                class285_129_ = class285_133_;
                                            }
                                        }
                                    }
                                    Object object_134_ = null;
                                    String string = null;
                                    boolean bool_135_ = false;
                                    int i_136_ = 0;
                                    String string_137_ = (class70.method535((byte) 43, (((Entity) entity).anIntArray10472[i_84_])));
                                    int i_138_ = class285.method3068(-1, string_137_);
                                    if (class70_89_ != null) {
                                        string = (class70_89_.method535((byte) 43, (((Entity) entity).anIntArray10467[i_84_])));
                                        i_136_ = class285_129_.method3068(-1, string);
                                    }
                                    int i_139_ = 0;
                                    if (i_96_ > 0)
                                        i_139_ = i_138_ / i_96_ + 1;
                                    int i_140_ = 0;
                                    if (class70_89_ != null && (i_107_ ^ 0xffffffff) < -1)
                                        i_140_ = 1 + i_136_ / i_107_;
                                    int i_141_ = 0;
                                    int i_142_ = i_141_;
                                    if (i_95_ > 0)
                                        i_141_ += i_95_;
                                    i_141_ += 2;
                                    int i_143_ = i_141_;
                                    if ((i_97_ ^ 0xffffffff) < -1)
                                        i_141_ += i_97_;
                                    int i_144_ = i_141_;
                                    int i_145_ = i_141_;
                                    if ((i_96_ ^ 0xffffffff) < -1) {
                                        int i_146_ = i_96_ * i_139_;
                                        i_145_ += (i_146_ + -i_138_) / 2;
                                        i_141_ += i_146_;
                                    } else
                                        i_141_ += i_138_;
                                    int i_147_ = i_141_;
                                    if (i_98_ > 0)
                                        i_141_ += i_98_;
                                    int i_148_ = 0;
                                    int i_149_ = 0;
                                    int i_150_ = 0;
                                    int i_151_ = 0;
                                    int i_152_ = 0;
                                    if (class70_89_ != null) {
                                        i_141_ += 2;
                                        i_148_ = i_141_;
                                        if (i_106_ > 0)
                                            i_141_ += i_106_;
                                        i_141_ += 2;
                                        i_149_ = i_141_;
                                        if (i_108_ > 0)
                                            i_141_ += i_108_;
                                        i_150_ = i_141_;
                                        i_152_ = i_141_;
                                        if ((i_107_ ^ 0xffffffff) < -1) {
                                            int i_153_ = i_140_ * i_107_;
                                            i_152_ += (-i_136_ + i_153_) / 2;
                                            i_141_ += i_153_;
                                        } else
                                            i_141_ += i_136_;
                                        i_151_ = i_141_;
                                        if ((i_109_ ^ 0xffffffff) < -1)
                                            i_141_ += i_109_;
                                    }
                                    int i_154_ = ((((Entity) entity).anIntArray10435[i_84_]) - Node_Sub18.anInt7027);
                                    int i_155_ = (-(i_154_ * ((Class70) class70).anInt931 / ((Class70) class70).anInt924) + ((Class70) class70).anInt931);
                                    int i_156_ = ((((Class70) class70).anInt923 * i_154_ / ((Class70) class70).anInt924) + -((Class70) class70).anInt923);
                                    int i_157_ = (-(i_141_ >> -1604183647) + (Class303.anIntArray3527[0] + i_56_) - -i_155_);
                                    int i_158_ = (i_156_ + Class303.anIntArray3527[1] + i_59_ + -12);
                                    int i_159_ = i_158_;
                                    int i_160_ = i_158_ - -i_114_;
                                    int i_161_ = (i_158_ - -15 - -((Class70) class70).anInt937);
                                    int i_162_ = (-((Class285) class285).anInt3370 + i_161_);
                                    int i_163_ = (((Class285) class285).anInt3368 + i_161_);
                                    if ((i_159_ ^ 0xffffffff) < (i_162_ ^ 0xffffffff))
                                        i_159_ = i_162_;
                                    if (i_160_ < i_163_)
                                        i_160_ = i_163_;
                                    int i_164_ = 0;
                                    if (class70_89_ != null) {
                                        i_164_ = (((Class70) class70_89_).anInt937 + i_158_ + 15);
                                        int i_165_ = (-(((Class285) class285_129_).anInt3370) + i_164_);
                                        int i_166_ = (i_164_ - -(((Class285) class285_129_).anInt3368));
                                        if (i_159_ > i_165_)
                                            i_159_ = i_165_;
                                        if ((i_160_ ^ 0xffffffff) > (i_166_ ^ 0xffffffff))
                                            i_160_ = i_166_;
                                    }
                                    int i_167_ = 255;
                                    if (((Class70) class70).anInt936 >= 0)
                                        i_167_ = ((i_154_ << 914777480) / (-((Class70) class70).anInt936 + (((Class70) class70).anInt924)));
                                    if ((i_167_ ^ 0xffffffff) <= -1 && i_167_ < 255) {
                                        int i_168_ = i_167_ << -1007418632;
                                        int i_169_ = i_168_ | 0xffffff;
                                        if (class129_115_ != null)
                                            class129_115_.method1178(-i_99_ + i_157_ - -i_142_, i_158_, 0, i_169_, 1);
                                        if (class129_119_ != null)
                                            class129_119_.method1178(-i_101_ + (i_157_ + i_143_), i_158_, 0, i_169_, 1);
                                        if (class129_117_ != null) {
                                            for (int i_170_ = 0; ((i_139_ ^ 0xffffffff) < (i_170_ ^ 0xffffffff)); i_170_++)
                                                class129_117_.method1178((-i_100_ + i_144_ + i_157_ + i_96_ * i_170_), i_158_, 0, i_169_, 1);
                                        }
                                        if (class129_121_ != null)
                                            class129_121_.method1178(-i_102_ + (i_157_ - -i_147_), i_158_, 0, i_169_, 1);
                                        class48.method369(true, i_145_ + i_157_, string_137_, i_161_, 0, (i_168_ | ((Class70) class70).anInt940));
                                        if (class70_89_ != null) {
                                            if (class129 != null)
                                                class129.method1178(i_157_ - (-i_148_ - -i_110_), i_158_, 0, i_169_, 1);
                                            if (class129_104_ != null)
                                                class129_104_.method1178(-i_112_ + i_149_ + i_157_, i_158_, 0, i_169_, 1);
                                            if (class129_103_ != null) {
                                                for (int i_171_ = 0; ((i_171_ ^ 0xffffffff) > (i_140_ ^ 0xffffffff)); i_171_++)
                                                    class129_103_.method1178((i_107_ * i_171_ + (i_157_ - -i_150_) + -i_111_), i_158_, 0, i_169_, 1);
                                            }
                                            if (class129_105_ != null)
                                                class129_105_.method1178(i_157_ + i_151_ - i_113_, i_158_, 0, i_169_, 1);
                                            class48_127_.method369(true, i_152_ + i_157_, string, i_164_, 0, (((Class70) class70_89_).anInt940) | i_168_);
                                        }
                                    } else {
                                        if (class129_115_ != null)
                                            class129_115_.method1168(-i_99_ + i_157_ + i_142_, i_158_);
                                        if (class129_119_ != null)
                                            class129_119_.method1168(-i_101_ + i_157_ + i_143_, i_158_);
                                        if (class129_117_ != null) {
                                            for (int i_172_ = 0; ((i_139_ ^ 0xffffffff) < (i_172_ ^ 0xffffffff)); i_172_++)
                                                class129_117_.method1168((i_96_ * i_172_ + (-i_100_ + (i_157_ - -i_144_))), i_158_);
                                        }
                                        if (class129_121_ != null)
                                            class129_121_.method1168(-i_102_ + (i_147_ + i_157_), i_158_);
                                        class48.method369(true, i_145_ + i_157_, string_137_, i_161_, 0, ((((Class70) class70).anInt940) | ~0xffffff));
                                        if (class70_89_ != null) {
                                            if (class129 != null)
                                                class129.method1168(-i_110_ + (i_148_ + i_157_), i_158_);
                                            if (class129_104_ != null)
                                                class129_104_.method1168(-i_112_ + (i_149_ + i_157_), i_158_);
                                            if (class129_103_ != null) {
                                                for (int i_173_ = 0; i_173_ < i_140_; i_173_++)
                                                    class129_103_.method1168((i_173_ * i_107_ + -i_111_ + (i_157_ + i_150_)), i_158_);
                                            }
                                            if (class129_105_ != null)
                                                class129_105_.method1168(-i_113_ + i_151_ + i_157_, i_158_);
                                            class48_127_.method369(bool, i_157_ + i_152_, string, i_164_, 0, (((Class70) class70_89_).anInt940) | ~0xffffff);
                                        }
                                    }
                                    Class210.method1724(i_141_ + i_157_, i_157_, (byte) -76, 1 + i_160_, i_159_);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i_174_ = 0; i_174_ < Class156.anInt1866; i_174_++) {
            int i_175_ = Class275_Sub1.anIntArray8581[i_174_];
            Entity entity;
            if ((i_175_ ^ 0xffffffff) > -2049)
                entity = (Node_Sub32.aPlayerArray7197[i_175_]);
            else
                entity = (((Node_Sub10) (Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) (-2048 + i_175_), (byte) 31)).aNPC_6946);
            int i_176_ = Node_Sub14_Sub20.anIntArray9370[i_174_];
            Entity entity_177_;
            if ((i_176_ ^ 0xffffffff) > -2049)
                entity_177_ = (Node_Sub32.aPlayerArray7197[i_176_]);
            else
                entity_177_ = (((Node_Sub10) (Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) (-2048 + i_176_), (byte) 31)).aNPC_6946);
            Class25.method242(entity_177_, i_58_, i, --((Entity) entity).anInt10487, i_56_, i_59_, entity, i_57_, !bool, i_60_);
        }
        int i_178_ = (((Class285) Class264.aClass285_2996).anInt3370 + ((Class285) Class264.aClass285_2996).anInt3368 - -2);
        for (int i_179_ = 0; i_179_ < Class25.anInt338; i_179_++) {
            int i_180_ = Class342.anIntArray4006[i_179_];
            int i_181_ = Class342.anIntArray4009[i_179_];
            int i_182_ = Class342.anIntArray4007[i_179_];
            boolean bool_183_ = true;
            while (bool_183_) {
                bool_183_ = false;
                for (int i_184_ = 0; (i_184_ ^ 0xffffffff) > (i_179_ ^ 0xffffffff); i_184_++) {
                    if (((2 + i_181_ ^ 0xffffffff) < (-i_178_ + Class342.anIntArray4009[i_184_] ^ 0xffffffff)) && ((Class342.anIntArray4009[i_184_] - -2 ^ 0xffffffff) < (-i_178_ + i_181_ ^ 0xffffffff)) && (-i_182_ + i_180_ < (Class342.anIntArray4007[i_184_] + Class342.anIntArray4006[i_184_])) && ((Class342.anIntArray4006[i_184_] + -Class342.anIntArray4007[i_184_]) ^ 0xffffffff) > (i_180_ + i_182_ ^ 0xffffffff) && (-i_178_ + Class342.anIntArray4009[i_184_] < i_181_)) {
                        i_181_ = -i_178_ + Class342.anIntArray4009[i_184_];
                        bool_183_ = true;
                    }
                }
            }
            Class342.anIntArray4009[i_179_] = i_181_;
            String string = Class342.aStringArray4013[i_179_];
            int i_185_ = Class264.aClass285_2996.method3068(-1, string);
            int i_186_ = i_180_ + i_56_;
            int i_187_ = (i_181_ + i_59_ + -((Class285) Class264.aClass285_2996).anInt3370);
            int i_188_ = i_186_ + i_185_;
            int i_189_ = (i_59_ + i_181_ + ((Class285) Class264.aClass285_2996).anInt3368);
            if (Class74.anInt954 == 0) {
                int i_190_ = 16776960;
                if (Class342.anIntArray4019[i_179_] < 6)
                    i_190_ = (Node_Sub14.anIntArray6987[Class342.anIntArray4019[i_179_]]);
                if ((Class342.anIntArray4019[i_179_] ^ 0xffffffff) == -7)
                    i_190_ = ((Class54.anInt727 % 20 ^ 0xffffffff) > -11 ? 16711680 : 16776960);
                if ((Class342.anIntArray4019[i_179_] ^ 0xffffffff) == -8)
                    i_190_ = ((Class54.anInt727 % 20 ^ 0xffffffff) <= -11 ? 65535 : 255);
                if ((Class342.anIntArray4019[i_179_] ^ 0xffffffff) == -9)
                    i_190_ = Class54.anInt727 % 20 < 10 ? 45056 : 8454016;
                if (Class342.anIntArray4019[i_179_] == 9) {
                    int i_191_ = -Class342.anIntArray4017[i_179_] + 150;
                    if (i_191_ >= 50) {
                        if ((i_191_ ^ 0xffffffff) <= -101) {
                            if (i_191_ < 150)
                                i_190_ = 65280 + 5 * (i_191_ + -100);
                        } else
                            i_190_ = -(327680 * i_191_) - -16384000 + 16776960;
                    } else
                        i_190_ = 16711680 + 1280 * i_191_;
                }
                if (Class342.anIntArray4019[i_179_] == 10) {
                    int i_192_ = 150 + -Class342.anIntArray4017[i_179_];
                    if (i_192_ >= 50) {
                        if ((i_192_ ^ 0xffffffff) > -101)
                            i_190_ = -((-50 + i_192_) * 327680) + 16711935;
                        else if (i_192_ < 150)
                            i_190_ = (255 + 327680 * i_192_ - (32768000 - -(5 * (-100 + i_192_))));
                    } else
                        i_190_ = i_192_ * 5 + 16711680;
                }
                if (Class342.anIntArray4019[i_179_] == 11) {
                    int i_193_ = 150 + -Class342.anIntArray4017[i_179_];
                    if (i_193_ < 50)
                        i_190_ = -(i_193_ * 327685) + 16777215;
                    else if (i_193_ >= 100) {
                        if (i_193_ < 150)
                            i_190_ = -(327680 * i_193_) - -49545215;
                    } else
                        i_190_ = (i_193_ + -50) * 327685 + 65280;
                }
                int i_194_ = i_190_ | ~0xffffff;
                if (Class342.anIntArray4011[i_179_] == 0) {
                    Node_Sub14_Sub27.aClass48_9449.method354(i_56_ + i_180_, 86, string, i_59_ + i_181_, i_194_, -16777216);
                    i_186_ -= i_185_ >> 555932833;
                    i_188_ -= i_185_ >> -2101087327;
                }
                if ((Class342.anIntArray4011[i_179_] ^ 0xffffffff) == -2) {
                    Node_Sub14_Sub27.aClass48_9449.method355(Class54.anInt727, i_56_ - -i_180_, string, false, -16777216, i_59_ + i_181_, i_194_);
                    i_186_ -= i_185_ >> 1060955809;
                    i_188_ -= i_185_ >> -946419103;
                    i_187_ -= 5;
                    i_189_ += 5;
                }
                if (Class342.anIntArray4011[i_179_] == 2) {
                    i_187_ -= 5;
                    Node_Sub14_Sub27.aClass48_9449.method362(i_59_ - -i_181_, -16777216, string, i_56_ + i_180_, i_194_, Class54.anInt727, -1750);
                    i_188_ -= -5 + (i_185_ >> -117462207);
                    i_189_ += 5;
                    i_186_ -= (i_185_ >> 232967137) - -5;
                }
                if (Class342.anIntArray4011[i_179_] == 3) {
                    i_187_ -= 7;
                    i_186_ -= i_185_ >> -1519517215;
                    i_188_ -= i_185_ >> 580636161;
                    Node_Sub14_Sub27.aClass48_9449.method375(i_180_ + i_56_, i_194_, Class54.anInt727, -16777216, -Class342.anIntArray4017[i_179_] + 150, i_59_ + i_181_, string, (byte) -40);
                    i_189_ += 7;
                }
                if (Class342.anIntArray4011[i_179_] == 4) {
                    int i_195_ = ((-Class342.anIntArray4017[i_179_] + 150) * (Class264.aClass285_2996.method3068(-1, string) - -100) / 150);
                    Class287.aHa3381.T(-50 + (i_56_ - -i_180_), i_59_, 50 + i_56_ + i_180_, i_57_ + i_59_);
                    i_188_ += 50 + -i_195_;
                    i_186_ += -i_195_ + 50;
                    Node_Sub14_Sub27.aClass48_9449.method369(true, -i_195_ + (50 + (i_180_ + i_56_)), string, i_181_ + i_59_, -16777216, i_194_);
                    Class287.aHa3381.KA(i_56_, i_59_, i_56_ - -i, i_57_ + i_59_);
                }
                if (Class342.anIntArray4011[i_179_] == 5) {
                    int i_196_ = -Class342.anIntArray4017[i_179_] + 150;
                    int i_197_ = 0;
                    if (i_196_ < 25)
                        i_197_ = -25 + i_196_;
                    else if ((i_196_ ^ 0xffffffff) < -126)
                        i_197_ = -125 + i_196_;
                    int i_198_ = (((Class285) Class264.aClass285_2996).anInt3370 + ((Class285) Class264.aClass285_2996).anInt3368);
                    Class287.aHa3381.T(i_56_, -1 + (-i_198_ + (i_181_ + i_59_)), i + i_56_, i_59_ + (i_181_ + 5));
                    i_188_ -= i_185_ >> 1505535425;
                    i_187_ += i_197_;
                    i_189_ += i_197_;
                    Node_Sub14_Sub27.aClass48_9449.method354(i_180_ + i_56_, -91, string, i_197_ + i_59_ + i_181_, i_194_, -16777216);
                    i_186_ -= i_185_ >> 217018145;
                    Class287.aHa3381.KA(i_56_, i_59_, i + i_56_, i_57_ + i_59_);
                }
            } else {
                Node_Sub14_Sub27.aClass48_9449.method354(i_180_ + i_56_, -122, string, i_59_ - -i_181_, -256, -16777216);
                i_186_ -= i_185_ >> -1050428607;
                i_188_ -= i_185_ >> -1254179647;
            }
            Class210.method1724(i_188_ + 1, i_186_, (byte) -60, i_189_ - -1, i_187_);
        }
    }

    final Class162 method3404(Class356 class356, int i, boolean bool, Class342 class342, int i_199_, ha var_ha, int i_200_, int[] is, Interface3 interface3, int i_201_, Class286[] class286s, Class182 class182, Class119 class119, int i_202_, int i_203_, int i_204_, int i_205_, Class172 class172, Class131 class131, int i_206_, Class182 class182_207_) {
        anInt3869++;
        if ((((Class332) this).anInt3879 ^ 0xffffffff) != 0)
            return (class119.method1123(((Class332) this).anInt3879, 8881).method2738(is, class182_207_, 32, null, i_201_, class131, class182, i_202_, i_200_, i_204_, interface3, i_203_, i_206_, var_ha, i, i_205_, class286s, class356));
        int i_208_ = i_201_;
        long l = aLong3866;
        int[] is_209_ = looks;
        if (class182_207_ != null && ((((Class182) class182_207_).anInt2134 ^ 0xffffffff) <= -1 || ((((Class182) class182_207_).anInt2112 ^ 0xffffffff) <= -1))) {
            is_209_ = new int[12];
            for (int i_210_ = 0; i_210_ < 12; i_210_++)
                is_209_[i_210_] = looks[i_210_];
            if (((Class182) class182_207_).anInt2134 >= 0) {
                if ((((Class182) class182_207_).anInt2134 ^ 0xffffffff) != -65536) {
                    is_209_[5] = Class358.retrieveLooksSettings(1073741824, (((Class182) class182_207_).anInt2134));
                    l ^= (long) is_209_[5] << -1583374688;
                } else {
                    is_209_[5] = 0;
                    l ^= ~0xffffffffL;
                }
            }
            if (((Class182) class182_207_).anInt2112 >= 0) {
                if ((((Class182) class182_207_).anInt2112 ^ 0xffffffff) == -65536) {
                    is_209_[3] = 0;
                    l ^= 0xffffffffL;
                } else {
                    is_209_[3] = Class358.retrieveLooksSettings((((Class182) class182_207_).anInt2112), 1073741824);
                    l ^= (long) is_209_[3];
                }
            }
        }
        boolean bool_211_ = false;
        boolean bool_212_ = false;
        boolean bool_213_ = false;
        boolean bool_214_ = class182_207_ != null || class182 != null;
        int i_215_ = class286s != null ? class286s.length : 0;
        for (int i_216_ = 0; i_216_ < i_215_; i_216_++) {
            Class260.aClass248_Sub8_Sub2Array2967[i_216_] = null;
            if (class286s[i_216_] != null) {
                Class182 class182_217_ = class356.method3790((byte) -90, (((Class286) class286s[i_216_]).anInt3379));
                if (((Class182) class182_217_).anIntArray2117 != null) {
                    Class245.aClass182Array2752[i_216_] = class182_217_;
                    bool_214_ = true;
                    int i_218_ = ((Class286) class286s[i_216_]).anInt3374;
                    int i_219_ = ((Class286) class286s[i_216_]).anInt3378;
                    int i_220_ = ((Class182) class182_217_).anIntArray2117[i_218_];
                    Class260.aClass248_Sub8_Sub2Array2967[i_216_] = class356.method3788(-42, i_220_ >>> -464511952);
                    i_220_ &= 0xffff;
                    aa.anIntArray100[i_216_] = i_220_;
                    if (Class260.aClass248_Sub8_Sub2Array2967[i_216_] != null) {
                        bool_212_ |= Class260.aClass248_Sub8_Sub2Array2967[i_216_].method2035(i_220_, -12);
                        bool_211_ |= Class260.aClass248_Sub8_Sub2Array2967[i_216_].method2040(1, i_220_);
                        bool_213_ |= Class260.aClass248_Sub8_Sub2Array2967[i_216_].method2037(1, i_220_);
                    }
                    if ((((Class182) class182_217_).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && (i_219_ ^ 0xffffffff) != 0 && (((Class182) class182_217_).anIntArray2117.length > i_219_)) {
                        Class59.anIntArray814[i_216_] = (((Class182) class182_217_).anIntArray2113[i_218_]);
                        Node_Sub14_Sub27.anIntArray9450[i_216_] = ((Class286) class286s[i_216_]).anInt3373;
                        int i_221_ = (((Class182) class182_217_).anIntArray2117[i_219_]);
                        Class291.aClass248_Sub8_Sub2Array4743[i_216_] = class356.method3788(-114, i_221_ >>> 236549776);
                        i_221_ &= 0xffff;
                        Node_Sub18.anIntArray7018[i_216_] = i_221_;
                        if (Class291.aClass248_Sub8_Sub2Array4743[i_216_] != null) {
                            bool_212_ |= Class291.aClass248_Sub8_Sub2Array4743[i_216_].method2035(i_221_, -48);
                            bool_211_ |= Class291.aClass248_Sub8_Sub2Array4743[i_216_].method2040(1, i_221_);
                            bool_213_ |= Class291.aClass248_Sub8_Sub2Array4743[i_216_].method2037(1, i_221_);
                        }
                    } else {
                        Class59.anIntArray814[i_216_] = 0;
                        Node_Sub14_Sub27.anIntArray9450[i_216_] = 0;
                        Class291.aClass248_Sub8_Sub2Array4743[i_216_] = null;
                        Node_Sub18.anIntArray7018[i_216_] = -1;
                    }
                }
            }
        }
        int i_222_ = -1;
        int i_223_ = -1;
        int i_224_ = 0;
        Node_Sub8_Sub2 class248_sub8_sub2 = null;
        Node_Sub8_Sub2 class248_sub8_sub2_225_ = null;
        int i_226_ = -1;
        int i_227_ = -1;
        int i_228_ = 0;
        Node_Sub8_Sub2 class248_sub8_sub2_229_ = null;
        Node_Sub8_Sub2 class248_sub8_sub2_230_ = null;
        if (bool_214_) {
            i_208_ |= 0x20;
            if (class182_207_ != null) {
                i_222_ = ((Class182) class182_207_).anIntArray2117[i_202_];
                int i_231_ = i_222_ >>> 981367376;
                i_222_ &= 0xffff;
                class248_sub8_sub2 = class356.method3788(-51, i_231_);
                if (class248_sub8_sub2 != null) {
                    bool_212_ |= class248_sub8_sub2.method2035(i_222_, -88);
                    bool_211_ |= class248_sub8_sub2.method2040(1, i_222_);
                    bool_213_ |= class248_sub8_sub2.method2037(1, i_222_);
                }
                if ((((Class182) class182_207_).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && i_200_ != -1 && ((i_200_ ^ 0xffffffff) > (((Class182) class182_207_).anIntArray2117.length ^ 0xffffffff))) {
                    i_224_ = ((Class182) class182_207_).anIntArray2113[i_202_];
                    i_223_ = ((Class182) class182_207_).anIntArray2117[i_200_];
                    int i_232_ = i_223_ >>> -1970217136;
                    i_223_ &= 0xffff;
                    class248_sub8_sub2_225_ = (i_231_ == i_232_ ? class248_sub8_sub2 : class356.method3788(-106, i_232_));
                    if (class248_sub8_sub2_225_ != null) {
                        bool_212_ |= class248_sub8_sub2_225_.method2035(i_223_, -89);
                        bool_211_ |= class248_sub8_sub2_225_.method2040(1, i_223_);
                        bool_213_ |= class248_sub8_sub2_225_.method2037(1, i_223_);
                    }
                }
            }
            if (class182 != null) {
                i_226_ = ((Class182) class182).anIntArray2117[i_203_];
                int i_233_ = i_226_ >>> 535972112;
                i_226_ &= 0xffff;
                class248_sub8_sub2_229_ = class356.method3788(-105, i_233_);
                if (class248_sub8_sub2_229_ != null) {
                    bool_212_ |= class248_sub8_sub2_229_.method2035(i_226_, -37);
                    bool_211_ |= class248_sub8_sub2_229_.method2040(1, i_226_);
                    bool_213_ |= class248_sub8_sub2_229_.method2037(1, i_226_);
                }
                if ((((Class182) class182).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && (i_206_ ^ 0xffffffff) != 0 && ((Class182) class182).anIntArray2117.length > i_206_) {
                    i_228_ = ((Class182) class182).anIntArray2113[i_203_];
                    i_227_ = ((Class182) class182).anIntArray2117[i_206_];
                    int i_234_ = i_227_ >>> 548711952;
                    i_227_ &= 0xffff;
                    class248_sub8_sub2_230_ = (i_233_ == i_234_ ? class248_sub8_sub2_229_ : class356.method3788(-124, i_234_));
                    if (class248_sub8_sub2_230_ != null) {
                        bool_212_ |= class248_sub8_sub2_230_.method2035(i_227_, -33);
                        bool_211_ |= class248_sub8_sub2_230_.method2040(1, i_227_);
                        bool_213_ |= class248_sub8_sub2_230_.method2037(1, i_227_);
                    }
                }
            }
            if (bool_212_)
                i_208_ |= 0x80;
            if (bool_211_)
                i_208_ |= 0x100;
            if (bool_213_)
                i_208_ |= 0x400;
        }
        Class162 class162;
        synchronized (Node_Sub14_Sub2.aClass278_9175) {
            class162 = (Class162) Node_Sub14_Sub2.aClass278_9175.method2863(4, l);
        }
        Class281 class281 = null;
        if (anInt3871 != -1)
            class281 = class131.method1213(-20408, anInt3871);
        if (class162 == null || var_ha.b(class162.ua(), i_208_) != 0) {
            if (class162 != null)
                i_208_ = var_ha.c(i_208_, class162.ua());
            int i_235_ = i_208_;
            boolean bool_236_ = false;
            for (int i_237_ = 0; i_237_ < 12; i_237_++) {
                int i_238_ = is_209_[i_237_];
                if ((0x40000000 & i_238_) != 0) {
                    if (!class342.method3482((byte) 73, 0x3fffffff & i_238_).method3325(true, ((Class332) this).aBoolean3881))
                        bool_236_ = true;
                } else if ((~0x7fffffff & i_238_) != 0 && !class172.method1553(1645, i_238_ & 0x3fffffff).method2777((byte) 113))
                    bool_236_ = true;
            }
            if (!bool_236_) {
                Class343[] class343s = new Class343[12];
                for (int i_239_ = 0; i_239_ < 12; i_239_++) {
                    int i_240_ = is_209_[i_239_];
                    if ((0x40000000 & i_240_) != 0) {
                        Class343 class343 = (class342.method3482((byte) 112, i_240_ & 0x3fffffff).method3327(15580, ((Class332) this).aBoolean3881));
                        if (class343 != null)
                            class343s[i_239_] = class343;
                    } else if ((i_240_ & ~0x7fffffff ^ 0xffffffff) != -1) {
                        Class343 class343 = class172.method1553(1645, i_240_ & 0x3fffffff).method2781(69);
                        if (class343 != null)
                            class343s[i_239_] = class343;
                    }
                }
                if (class281 != null && ((Class281) class281).anIntArrayArray3291 != null) {
                    for (int i_241_ = 0; (((Class281) class281).anIntArrayArray3291.length > i_241_); i_241_++) {
                        if (class343s[i_241_] != null) {
                            int i_242_ = 0;
                            int i_243_ = 0;
                            int i_244_ = 0;
                            int i_245_ = 0;
                            int i_246_ = 0;
                            int i_247_ = 0;
                            if ((((Class281) class281).anIntArrayArray3291[i_241_]) != null) {
                                i_246_ = ((((Class281) class281).anIntArrayArray3291[i_241_][4]) << 59005603);
                                i_243_ = (((Class281) class281).anIntArrayArray3291[i_241_][1]);
                                i_245_ = ((((Class281) class281).anIntArrayArray3291[i_241_][3]) << -2062352445);
                                i_247_ = ((((Class281) class281).anIntArrayArray3291[i_241_][5]) << -198567549);
                                i_242_ = (((Class281) class281).anIntArrayArray3291[i_241_][0]);
                                i_244_ = (((Class281) class281).anIntArrayArray3291[i_241_][2]);
                            }
                            if (i_245_ != 0 || i_246_ != 0 || (i_247_ ^ 0xffffffff) != -1)
                                class343s[i_241_].method3505(12, i_247_, i_246_, i_245_);
                            if (i_242_ != 0 || i_243_ != 0 || i_244_ != 0)
                                class343s[i_241_].method3496(i_242_, i_243_, 0, i_244_);
                        }
                    }
                }
                i_235_ |= 0x4000;
                Class343 class343 = new Class343(class343s, class343s.length);
                class162 = var_ha.a(class343, i_235_, Class346_Sub7_Sub1.anInt9908, 64, 850);
                for (int i_248_ = 0; i_248_ < 5; i_248_++) {
                    for (int i_249_ = 0; (i_249_ < Class226_Sub2.aShortArrayArrayArray6667.length); i_249_++) {
                        if (((Class226_Sub2.aShortArrayArrayArray6667[i_249_][i_248_]).length ^ 0xffffffff) < (((Class332) this).colors[i_248_] ^ 0xffffffff))
                            class162.ia((Class205.aShortArrayArray2388[i_249_][i_248_]), (Class226_Sub2.aShortArrayArrayArray6667[i_249_][i_248_][(((Class332) this).colors[i_248_])]));
                    }
                }
                if (bool) {
                    class162.s(i_208_);
                    synchronized (Node_Sub14_Sub2.aClass278_9175) {
                        Node_Sub14_Sub2.aClass278_9175.method2867((byte) 0, l, class162);
                    }
                    aLong3887 = l;
                }
            } else {
                if ((aLong3887 ^ 0xffffffffffffffffL) != 0L) {
                    synchronized (Node_Sub14_Sub2.aClass278_9175) {
                        class162 = (Class162) Node_Sub14_Sub2.aClass278_9175.method2863(4, aLong3887);
                    }
                }
                if (class162 == null || (var_ha.b(class162.ua(), i_208_) ^ 0xffffffff) != -1)
                    return null;
            }
        }
        Class162 class162_250_ = class162.method1436((byte) 4, i_208_, true);
        boolean bool_251_ = false;
        if (is != null) {
            for (int i_252_ = 0; (i_252_ ^ 0xffffffff) > -13; i_252_++) {
                if (is[i_252_] != -1)
                    bool_251_ = true;
            }
        }
        if (!bool_214_ && !bool_251_)
            return class162_250_;
        Viewport[] viewports = null;
        if (class281 != null)
            viewports = class281.method2912(var_ha, (byte) -123);
        if (bool_251_ && viewports != null) {
            for (int i_253_ = 0; (i_253_ ^ 0xffffffff) > -13; i_253_++) {
                if (viewports[i_253_] != null)
                    class162_250_.method1443(viewports[i_253_], 1 << i_253_, true);
            }
        }
        int i_254_ = 0;
        if (i_199_ <= 72)
            aOutgoingOpcode_3867 = null;
        int i_255_ = 1;
        while (i_254_ < i_215_) {
            if (Class260.aClass248_Sub8_Sub2Array2967[i_254_] != null)
                class162_250_.method1424(0, Node_Sub14_Sub27.anIntArray9450[i_254_] + -1, Class59.anIntArray814[i_254_], Node_Sub18.anIntArray7018[i_254_], false, aa.anIntArray100[i_254_], i_255_, 0, null, Class291.aClass248_Sub8_Sub2Array4743[i_254_], Class260.aClass248_Sub8_Sub2Array2967[i_254_]);
            i_254_++;
            i_255_ <<= 1;
        }
        if (bool_251_) {
            for (int i_256_ = 0; (i_256_ ^ 0xffffffff) > -13; i_256_++) {
                if (is[i_256_] != -1) {
                    int i_257_ = is[i_256_] - i_205_;
                    i_257_ &= 0x3fff;
                    Viewport viewport = var_ha.e();
                    viewport.method1857(i_257_);
                    class162_250_.method1443(viewport, 1 << i_256_, false);
                }
            }
        }
        if (bool_251_ && viewports != null) {
            for (int i_258_ = 0; i_258_ < 12; i_258_++) {
                if (viewports[i_258_] != null)
                    class162_250_.method1443(viewports[i_258_], 1 << i_258_, false);
            }
        }
        if (class248_sub8_sub2 == null || class248_sub8_sub2_229_ == null) {
            if (class248_sub8_sub2 == null) {
                if (class248_sub8_sub2_229_ != null)
                    class162_250_.method1421(-119, class248_sub8_sub2_229_, false, i_227_, i_228_, i_226_, 0, -1 + i, class248_sub8_sub2_230_);
            } else
                class162_250_.method1421(-86, class248_sub8_sub2, false, i_223_, i_224_, i_222_, 0, -1 + i_204_, class248_sub8_sub2_225_);
        } else
            class162_250_.method1418(class248_sub8_sub2_230_, class248_sub8_sub2_229_, i_222_, i_228_, i_223_, -1 + i_204_, i_227_, false, class248_sub8_sub2_225_, i_226_, (byte) 115, (((Class182) class182_207_).aBooleanArray2133), class248_sub8_sub2, -1 + i, i_224_);
        for (int i_259_ = 0; i_259_ < i_215_; i_259_++) {
            Class260.aClass248_Sub8_Sub2Array2967[i_259_] = null;
            Class291.aClass248_Sub8_Sub2Array4743[i_259_] = null;
            Class245.aClass182Array2752[i_259_] = null;
        }
        return class162_250_;
    }

    static final void method3405(int i, Entity entity) {
        anInt3880++;
        int i_260_ = (-Node_Sub18.anInt7027 + (((Entity) entity).forceMovementSpeed1));
        int i_261_ = (512 * (((Entity) entity).forceMovementX1) - -(256 * entity.method3632(-1)));
        if (i != 512)
            method3405(115, null);
        int i_262_ = (512 * (((Entity) entity).forceMovementY1) + 256 * entity.method3632(-1));
        ((Interactable) entity).y += ((i_262_ - ((Interactable) entity).y) / i_260_);
        ((Interactable) entity).x += ((i_261_ - ((Interactable) entity).x) / i_260_);
        ((Entity) entity).anInt10500 = 0;
        if (((Entity) entity).forceMovementDirection == 0) //north
            entity.faceDir(false, 8192);
        if (((Entity) entity).forceMovementDirection == 1)  //east
            entity.faceDir(false, 12288);
        if (((Entity) entity).forceMovementDirection == 2) //south
            entity.faceDir(false, 0);
        if ((((Entity) entity).forceMovementDirection ^ 0xffffffff) == -4)  //west
            entity.faceDir(false, 4096);
    }

    final void method3406(boolean bool, int[] is, int i, int i_263_, int i_264_, int[] is_265_) {
        if (i < 24)
            aLong3866 = -126L;
        if ((anInt3871 ^ 0xffffffff) != (i_264_ ^ 0xffffffff))
            anInt3871 = i_264_;
        anInt3877++;
        ((Class332) this).colors = is_265_;
        looks = is;
        ((Class332) this).anInt3879 = i_263_;
        ((Class332) this).aBoolean3881 = bool;
        method3398((byte) -100);
    }

    final void setColors(int colourIndex, int dummycheck, int colour) {
        if (dummycheck == 0) {
            ((Class332) this).colors[colourIndex] = colour;
            //System.out.println("set colors[" + colourIndex + "] " + ((Class332) this).colors[colourIndex]);
            anInt3865++;
            method3398((byte) -11);
        }
    }

    public Class332() {
        /* empty */
    }

    public static void method3408(byte i) {
        if (i != -119)
            anInt3883 = -96;
        aOutgoingOpcode_3867 = null;
    }

    final void method3409(int i, boolean bool) {
        anInt3876++;
        if (i == 0) {
            ((Class332) this).aBoolean3881 = bool;
            method3398((byte) -25);
        }
    }

    final void setLooks2(int lookValue, Class172 class172, int someLookId, int i_269_) {
        anInt3875++;
        int lookIndex = Class24.anIntArray329[someLookId];
        if (class172.method1553(1645, lookValue) != null) {
            looks[lookIndex] = Class358.retrieveLooksSettings(lookValue, -2147483648); // Int.MIN_VALUE
            //System.out.println("set2 looks[" + someLookId + "] = " + looks[lookIndex] + " lookValue = " + lookValue);
            method3398((byte) -112);
            if (i_269_ <= 35)
                method3399(-80, null, null, null, -80, (byte) -63, -67, null, null, null, null, -60);
        }
    }
}
