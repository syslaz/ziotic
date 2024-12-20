/* Class381 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class381 {
    static int anInt4650;
    static int anInt4651;
    static int anInt4652;
    static int anInt4653;
    private Class330 aClass330_4654;
    static int anInt4655;
    static int anInt4656;
    static int anInt4657;
    static int anInt4658;
    static int anInt4659;
    static int anInt4660;
    static int anInt4661;
    static int anInt4662;
    static int anInt4663;
    private Class271 aClass271_4664 = null;
    static int anInt4665;
    private Object[][] anObjectArrayArray4666;
    private Object[] anObjectArray4667;
    static int anInt4668;
    static int anInt4669;
    static int anInt4670;
    static int anInt4671;
    static int anInt4672;
    static int anInt4673;
    static int anInt4674;
    int anInt4675;
    static int anInt4676;
    static int anInt4677;
    static int anInt4678;
    static boolean aBoolean4679 = false;
    static int anInt4680;
    static boolean aBoolean4681 = true;
    static int anInt4682;
    static int anInt4683;
    static OutgoingOpcode aOutgoingOpcode_4684 = new OutgoingOpcode(44, 3);
    static int anInt4685;
    static int anInt4686;
    static int anInt4687;
    private boolean aBoolean4688;
    static int anInt4689;
    static int anInt4690;
    static int anInt4691;
    static int anInt4692;
    static int anInt4693 = 0;
    static int anInt4694;
    static int anInt4695;

    private final int method3898(boolean bool, int i) {
        anInt4682++;
        if (!method3921((byte) -103, i))
            return 0;
        if (anObjectArray4667[i] != null)
            return 100;
        if (bool != false)
            aClass271_4664 = null;
        return aClass330_4654.method3376(i, 1113);
    }

    final int method3899(int i, int i_0_) {
        anInt4653++;
        if (!method3921((byte) -76, i))
            return 0;
        if (i_0_ != 0)
            aBoolean4679 = true;
        return ((Class271) aClass271_4664).anIntArray3144[i];
    }

    private final void method3900(int i, int i_1_) {
        anInt4694++;
        if (aBoolean4688)
            anObjectArray4667[i] = aClass330_4654.method3380(i, 0);
        else
            anObjectArray4667[i] = Class255.method2742(false, aClass330_4654.method3380(i, i_1_ + 24659), (byte) 114);
        if (i_1_ != -24659)
            method3920(-81, 28);
    }

    private final boolean method3901(byte i) {
        if (i != -18)
            return true;
        anInt4662++;
        if (aClass271_4664 == null) {
            aClass271_4664 = aClass330_4654.method3379(i ^ 0x3a);
            if (aClass271_4664 == null)
                return false;
            anObjectArray4667 = new Object[((Class271) aClass271_4664).anInt3159];
            anObjectArrayArray4666 = new Object[((Class271) aClass271_4664).anInt3159][];
        }
        return true;
    }

    final int method3902(int i) {
        if (i != 0)
            method3909(36, 48);
        anInt4658++;
        if (!method3901((byte) -18))
            return -1;
        return ((Class271) aClass271_4664).anIntArray3144.length;
    }

    private final boolean method3903(int i, int i_2_, int i_3_) {
        anInt4683++;
        if (!method3901((byte) -18))
            return false;
        if (i_2_ > -13)
            method3914(59);
        if ((i_3_ ^ 0xffffffff) > -1 || i < 0 || i_3_ >= ((Class271) aClass271_4664).anIntArray3144.length || ((Class271) aClass271_4664).anIntArray3144[i_3_] <= i) {
            if (!Class279_Sub2_Sub1.aBoolean9831)
                return false;
            throw new IllegalArgumentException(String.valueOf(i_3_) + "," + i);
        }
        return true;
    }

    final int method3904(int i, byte i_4_) {
        anInt4670++;
        if (!method3901((byte) -18))
            return -1;
        int i_5_ = ((Class271) aClass271_4664).aClass127_3154.method1156((byte) 105, i);
        if (i_4_ < 97)
            return 15;
        if (!method3921((byte) -123, i_5_))
            return -1;
        return i_5_;
    }

    final void method3905(int i) {
        if (i == 0) {
            anInt4652++;
            if (anObjectArray4667 != null) {
                for (int i_6_ = 0; anObjectArray4667.length > i_6_; i_6_++)
                    anObjectArray4667[i_6_] = null;
            }
        }
    }

    final boolean method3906(int i, int i_7_) {
        anInt4660++;
        if (i != -14491)
            return false;
        if (!method3921((byte) -78, i_7_))
            return false;
        if (anObjectArray4667[i_7_] != null)
            return true;
        method3900(i_7_, i + -10168);
        if (anObjectArray4667[i_7_] != null)
            return true;
        return false;
    }

    private final void method3907(int i, int i_8_) {
        anInt4657++;
        if (i_8_ != 0)
            aClass271_4664 = null;
        aClass330_4654.method3377((byte) 76, i);
    }

    final byte[] method3908(String string, String string_9_, byte i) {
        anInt4676++;
        if (!method3901((byte) -18))
            return null;
        string_9_ = string_9_.toLowerCase();
        if (i <= 61)
            aBoolean4681 = true;
        string = string.toLowerCase();
        int i_10_ = ((Class271) aClass271_4664).aClass127_3154.method1156((byte) 117, method3924(string_9_, false));
        if (!method3921((byte) -56, i_10_))
            return null;
        int i_11_ = ((Class271) aClass271_4664).aClass127Array3145[i_10_].method1156((byte) 113, method3924(string, false));
        return method3922((byte) 115, i_10_, i_11_);
    }

    final void method3909(int i, int i_12_) {
        anInt4669++;
        if (i >= -96)
            method3923(null, 69);
        if (method3921((byte) -41, i_12_)) {
            if (anObjectArrayArray4666 != null)
                anObjectArrayArray4666[i_12_] = null;
        }
    }

    static final void method3910(int i, byte i_13_) {
        anInt4672++;
        if (Class283.aByteArrayArrayArray3338 == null)
            Class283.aByteArrayArrayArray3338 = (new byte[4][Node_Sub8_Sub4.anInt8360]
                    [Node_Sub22.anInt7074]);
        for (int i_14_ = i; (i_14_ ^ 0xffffffff) > -5; i_14_++) {
            for (int i_15_ = 0; i_15_ < Node_Sub8_Sub4.anInt8360; i_15_++) {
                for (int i_16_ = 0; ((Node_Sub22.anInt7074 ^ 0xffffffff) < (i_16_ ^ 0xffffffff)); i_16_++)
                    Class283.aByteArrayArrayArray3338[i_14_][i_15_][i_16_] = i_13_;
            }
        }
    }

    final byte[] method3911(int[] is, int i, int i_17_, int i_18_) {
        anInt4663++;
        if (!method3903(i, -63, i_17_))
            return null;
        if (anObjectArrayArray4666[i_17_] == null || anObjectArrayArray4666[i_17_][i] == null) {
            boolean bool = method3925(is, i_17_, i, false);
            if (!bool) {
                method3900(i_17_, i_18_ + -24661);
                bool = method3925(is, i_17_, i, false);
                if (!bool)
                    return null;
            }
        }
        byte[] is_19_ = Class346_Sub7_Sub1_Sub1.method3587(anObjectArrayArray4666[i_17_][i], false, -30711);
        if (((Class381) this).anInt4675 == 1) {
            anObjectArrayArray4666[i_17_][i] = null;
            if (((Class271) aClass271_4664).anIntArray3144[i_17_] == 1)
                anObjectArrayArray4666[i_17_] = null;
        } else if (((Class381) this).anInt4675 == 2)
            anObjectArrayArray4666[i_17_] = null;
        if (i_18_ != 2)
            aBoolean4681 = false;
        return is_19_;
    }

    final void method3912(int i) {
        if (anObjectArrayArray4666 != null) {
            for (int i_20_ = 0; ((i_20_ ^ 0xffffffff) > (anObjectArrayArray4666.length ^ 0xffffffff)); i_20_++)
                anObjectArrayArray4666[i_20_] = null;
        }
        if (i == 0)
            anInt4671++;
    }

    final boolean method3913(String string, boolean bool) {
        if (bool != false)
            aBoolean4688 = true;
        anInt4665++;
        if (!method3901((byte) -18))
            return false;
        string = string.toLowerCase();
        int i = ((Class271) aClass271_4664).aClass127_3154.method1156((byte) 112, method3924(string, bool));
        if ((i ^ 0xffffffff) > -1)
            return false;
        return true;
    }

    final boolean method3914(int i) {
        anInt4674++;
        if (!method3901((byte) -18))
            return false;
        boolean bool = true;
        if (i != 23094821)
            aBoolean4688 = false;
        for (int i_21_ = 0; i_21_ < ((Class271) aClass271_4664).anIntArray3149.length; i_21_++) {
            int i_22_ = ((Class271) aClass271_4664).anIntArray3149[i_21_];
            if (anObjectArray4667[i_22_] == null) {
                method3900(i_22_, -24659);
                if (anObjectArray4667[i_22_] == null)
                    bool = false;
            }
        }
        return bool;
    }

    final boolean method3915(int i, int i_23_, int i_24_) {
        anInt4668++;
        if (!method3903(i_23_, -43, i_24_))
            return false;
        if (i <= 33)
            return false;
        if (anObjectArrayArray4666[i_24_] != null && anObjectArrayArray4666[i_24_][i_23_] != null)
            return true;
        if (anObjectArray4667[i_24_] != null)
            return true;
        method3900(i_24_, -24659);
        if (anObjectArray4667[i_24_] != null)
            return true;
        return false;
    }

    final int method3916(int i, String string) {
        anInt4680++;
        if (!method3901((byte) -18))
            return 0;
        string = string.toLowerCase();
        int i_25_ = 83 / ((i - 54) / 53);
        int i_26_ = ((Class271) aClass271_4664).aClass127_3154.method1156((byte) 106, method3924(string, false));
        return method3898(false, i_26_);
    }

    static final void method3917(byte i, int[] is, NPC NPC, int i_27_) {
        anInt4651++;
        if (i <= 1)
            method3910(62, (byte) -82);
        if ((((Entity) NPC).anIntArray10414) != null) {
            boolean bool = true;
            for (int i_28_ = 0; ((i_28_ ^ 0xffffffff) > ((((Entity) NPC).anIntArray10414).length ^ 0xffffffff)); i_28_++) {
                if ((((Entity) NPC).anIntArray10414[i_28_]) != is[i_28_]) {
                    bool = false;
                    break;
                }
            }
            if (bool && ((((Entity) NPC).anInt10444) ^ 0xffffffff) != 0) {
                Class182 class182 = (Class235.aClass356_2617.method3790((byte) -90, ((Entity) NPC).anInt10444));
                int i_29_ = ((Class182) class182).anInt2102;
                if ((i_29_ ^ 0xffffffff) == -2) {
                    ((Entity) NPC).anInt10466 = 0;
                    ((Entity) NPC).anInt10407 = 1;
                    ((Entity) NPC).anInt10420 = 0;
                    ((Entity) NPC).anInt10424 = i_27_;
                    ((Entity) NPC).anInt10419 = 0;
                    if (!((Entity) NPC).aBoolean10439)
                        Class158.method1396(class182, (((Entity) NPC).anInt10420), NPC, true);
                }
                if ((i_29_ ^ 0xffffffff) == -3)
                    ((Entity) NPC).anInt10419 = 0;
            }
        }
        boolean bool = true;
        for (int i_30_ = 0; is.length > i_30_; i_30_++) {
            if (is[i_30_] != -1)
                bool = false;
            if ((((Entity) NPC).anIntArray10414) == null || ((((Entity) NPC).anIntArray10414[i_30_]) ^ 0xffffffff) == 0 || ((((Class182) Class235.aClass356_2617.method3790((byte) -90, is[i_30_])).anInt2101) >= ((Class182) (Class235.aClass356_2617.method3790((byte) -90, (((Entity) NPC).anIntArray10414[i_30_])))).anInt2101)) {
                ((Entity) NPC).anIntArray10414 = is;
                ((Entity) NPC).anInt10424 = i_27_;
                ((Entity) NPC).anInt10505 = (((Entity) NPC).anInt10503);
            }
        }
        if (bool) {
            ((Entity) NPC).anInt10424 = i_27_;
            ((Entity) NPC).anIntArray10414 = is;
            ((Entity) NPC).anInt10505 = (((Entity) NPC).anInt10503);
        }
    }

    final int[] method3918(int i, int i_31_) {
        anInt4691++;
        if (!method3921((byte) -56, i))
            return null;
        int i_32_ = 113 % ((22 - i_31_) / 36);
        int[] is = ((Class271) aClass271_4664).anIntArrayArray3161[i];
        if (is == null) {
            is = new int[((Class271) aClass271_4664).anIntArray3148[i]];
            for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_33_++)
                is[i_33_] = i_33_;
        }
        return is;
    }

    final int method3919(int i) {
        anInt4692++;
        if (i != 1010)
            return -33;
        if (!method3901((byte) -18))
            throw new IllegalStateException("");
        return ((Class271) aClass271_4664).anInt3141;
    }

    final boolean method3920(int i, int i_34_) {
        anInt4686++;
        if (!method3901((byte) -18))
            return false;
        if ((((Class271) aClass271_4664).anIntArray3144.length ^ 0xffffffff) == -2)
            return method3915(91, i, 0);
        if (!method3921((byte) -48, i))
            return false;
        if ((((Class271) aClass271_4664).anIntArray3144[i] ^ 0xffffffff) == -2)
            return method3915(47, 0, i);
        int i_35_ = 44 % ((5 - i_34_) / 54);
        throw new RuntimeException();
    }

    private final boolean method3921(byte i, int i_36_) {
        if (i > -21)
            return false;
        anInt4690++;
        if (!method3901((byte) -18))
            return false;
        if ((i_36_ ^ 0xffffffff) > -1 || i_36_ >= ((Class271) aClass271_4664).anIntArray3144.length || ((Class271) aClass271_4664).anIntArray3144[i_36_] == 0) {
            if (Class279_Sub2_Sub1.aBoolean9831)
                throw new IllegalArgumentException(Integer.toString(i_36_));
            return false;
        }
        return true;
    }

    final byte[] method3922(byte i, int i_37_, int i_38_) {
        anInt4659++;
        if (i <= 107)
            method3929(null, 5);
        return method3911(null, i_38_, i_37_, 2);
    }

    final void method3923(String string, int i) {
        anInt4655++;
        if (method3901((byte) -18)) {
            string = string.toLowerCase();
            int i_39_ = ((Class271) aClass271_4664).aClass127_3154.method1156((byte) 115, method3924(string, false));
            method3907(i_39_, i);
        }
    }

    private static final int method3924(String string, boolean bool) {
        anInt4695++;
        int i = string.length();
        int i_40_ = 0;
        int i_41_ = 0;
        if (bool != false)
            method3924(null, true);
        for (/**/; (i ^ 0xffffffff) < (i_41_ ^ 0xffffffff); i_41_++)
            i_40_ = (-i_40_ + (i_40_ << 23094821) - -Class297_Sub1.method3137(9, string.charAt(i_41_)));
        return i_40_;
    }

    private final boolean method3925(int[] is, int i, int i_42_, boolean bool) {
        anInt4650++;
        if (!method3921((byte) -92, i))
            return false;
        if (anObjectArray4667[i] == null)
            return false;
        int i_43_ = ((Class271) aClass271_4664).anIntArray3148[i];
        int[] is_44_ = ((Class271) aClass271_4664).anIntArrayArray3161[i];
        if (bool != false)
            return true;
        if (anObjectArrayArray4666[i] == null)
            anObjectArrayArray4666[i] = new Object[((Class271) aClass271_4664).anIntArray3144[i]];
        Object[] objects = anObjectArrayArray4666[i];
        boolean bool_45_ = true;
        for (int i_46_ = 0; (i_46_ ^ 0xffffffff) > (i_43_ ^ 0xffffffff); i_46_++) {
            int i_47_;
            if (is_44_ != null)
                i_47_ = is_44_[i_46_];
            else
                i_47_ = i_46_;
            if (objects[i_47_] == null) {
                bool_45_ = false;
                break;
            }
        }
        if (bool_45_)
            return true;
        byte[] is_48_;
        if (is == null || (is[0] == 0 && (is[1] ^ 0xffffffff) == -1 && is[2] == 0 && (is[3] ^ 0xffffffff) == -1))
            is_48_ = Class346_Sub7_Sub1_Sub1.method3587(anObjectArray4667[i], false, -30711);
        else {
            is_48_ = Class346_Sub7_Sub1_Sub1.method3587(anObjectArray4667[i], true, -30711);
            ByteStream class248_sub9 = new ByteStream(is_48_);
            class248_sub9.method2167((((ByteStream) class248_sub9).buffer).length, is, false, 5);
        }
        byte[] is_49_ = Class165.method1533(is_48_, 22047);
        if (aBoolean4688)
            anObjectArray4667[i] = null;
        if (i_43_ <= 1) {
            int i_50_;
            if (is_44_ == null)
                i_50_ = 0;
            else
                i_50_ = is_44_[0];
            if ((((Class381) this).anInt4675 ^ 0xffffffff) == -1)
                objects[i_50_] = Class255.method2742(false, is_49_, (byte) 96);
            else
                objects[i_50_] = is_49_;
        } else if (((Class381) this).anInt4675 != 2) {
            int i_51_ = is_49_.length;
            int i_52_ = is_49_[--i_51_] & 0xff;
            i_51_ -= i_43_ * (i_52_ * 4);
            ByteStream class248_sub9 = new ByteStream(is_49_);
            ((ByteStream) class248_sub9).offset = i_51_;
            int[] is_53_ = new int[i_43_];
            for (int i_54_ = 0; i_54_ < i_52_; i_54_++) {
                int i_55_ = 0;
                for (int i_56_ = 0; (i_43_ ^ 0xffffffff) < (i_56_ ^ 0xffffffff); i_56_++) {
                    i_55_ += class248_sub9.readInt(false);
                    is_53_[i_56_] += i_55_;
                }
            }
            byte[][] is_57_ = new byte[i_43_][];
            for (int i_58_ = 0; (i_58_ ^ 0xffffffff) > (i_43_ ^ 0xffffffff); i_58_++) {
                is_57_[i_58_] = new byte[is_53_[i_58_]];
                is_53_[i_58_] = 0;
            }
            ((ByteStream) class248_sub9).offset = i_51_;
            int i_59_ = 0;
            for (int i_60_ = 0; (i_60_ ^ 0xffffffff) > (i_52_ ^ 0xffffffff); i_60_++) {
                int i_61_ = 0;
                for (int i_62_ = 0; (i_62_ ^ 0xffffffff) > (i_43_ ^ 0xffffffff); i_62_++) {
                    i_61_ += class248_sub9.readInt(false);
                    Class159.method1402(is_49_, i_59_, is_57_[i_62_], is_53_[i_62_], i_61_);
                    i_59_ += i_61_;
                    is_53_[i_62_] += i_61_;
                }
            }
            for (int i_63_ = 0; (i_43_ ^ 0xffffffff) < (i_63_ ^ 0xffffffff); i_63_++) {
                int i_64_;
                if (is_44_ == null)
                    i_64_ = i_63_;
                else
                    i_64_ = is_44_[i_63_];
                if (((Class381) this).anInt4675 == 0)
                    objects[i_64_] = Class255.method2742(false, is_57_[i_63_], (byte) 88);
                else
                    objects[i_64_] = is_57_[i_63_];
            }
        } else {
            int i_65_ = is_49_.length;
            int i_66_ = is_49_[--i_65_] & 0xff;
            i_65_ -= 4 * (i_66_ * i_43_);
            ByteStream class248_sub9 = new ByteStream(is_49_);
            int i_67_ = 0;
            ((ByteStream) class248_sub9).offset = i_65_;
            int i_68_ = 0;
            for (int i_69_ = 0; (i_69_ ^ 0xffffffff) > (i_66_ ^ 0xffffffff); i_69_++) {
                int i_70_ = 0;
                for (int i_71_ = 0; i_71_ < i_43_; i_71_++) {
                    i_70_ += class248_sub9.readInt(false);
                    int i_72_;
                    if (is_44_ == null)
                        i_72_ = i_71_;
                    else
                        i_72_ = is_44_[i_71_];
                    if ((i_72_ ^ 0xffffffff) == (i_42_ ^ 0xffffffff)) {
                        i_68_ = i_72_;
                        i_67_ += i_70_;
                    }
                }
            }
            if (i_67_ == 0)
                return true;
            byte[] is_73_ = new byte[i_67_];
            i_67_ = 0;
            ((ByteStream) class248_sub9).offset = i_65_;
            int i_74_ = 0;
            for (int i_75_ = 0; (i_66_ ^ 0xffffffff) < (i_75_ ^ 0xffffffff); i_75_++) {
                int i_76_ = 0;
                for (int i_77_ = 0; i_77_ < i_43_; i_77_++) {
                    i_76_ += class248_sub9.readInt(false);
                    int i_78_;
                    if (is_44_ == null)
                        i_78_ = i_77_;
                    else
                        i_78_ = is_44_[i_77_];
                    if (i_78_ == i_42_) {
                        Class159.method1402(is_49_, i_74_, is_73_, i_67_, i_76_);
                        i_67_ += i_76_;
                    }
                    i_74_ += i_76_;
                }
            }
            objects[i_68_] = is_73_;
        }
        return true;
    }

    final void method3926(byte i, boolean bool, boolean bool_79_) {
        anInt4678++;
        if (method3901((byte) -18)) {
            if (bool_79_) {
                ((Class271) aClass271_4664).aClass127_3154 = null;
                ((Class271) aClass271_4664).anIntArray3151 = null;
            }
            if (i != 1)
                method3919(-123);
            if (bool) {
                ((Class271) aClass271_4664).aClass127Array3145 = null;
                ((Class271) aClass271_4664).anIntArrayArray3160 = null;
            }
        }
    }

    final int method3927(byte i, String string) {
        anInt4685++;
        if (!method3901((byte) -18))
            return -1;
        string = string.toLowerCase();
        int i_80_ = ((Class271) aClass271_4664).aClass127_3154.method1156((byte) 107, method3924(string, false));
        if (i <= 49)
            return 12;
        if (!method3921((byte) -71, i_80_))
            return -1;
        return i_80_;
    }

    final boolean method3928(String string, String string_81_, int i) {
        anInt4661++;
        if (!method3901((byte) -18))
            return false;
        string_81_ = string_81_.toLowerCase();
        if (i < 59)
            method3913(null, true);
        string = string.toLowerCase();
        int i_82_ = ((Class271) aClass271_4664).aClass127_3154.method1156((byte) 123, method3924(string_81_, false));
        if (i_82_ < 0)
            return false;
        int i_83_ = ((Class271) aClass271_4664).aClass127Array3145[i_82_].method1156((byte) 114, method3924(string, false));
        if (i_83_ < 0)
            return false;
        return true;
    }

    final boolean method3929(String string, int i) {
        anInt4673++;
        int i_84_ = method3927((byte) 60, "");
        if (i != i_84_)
            return method3932(string, 10, "");
        return method3932("", 19, string);
    }

    final byte[] method3930(int i, int i_85_) {
        anInt4656++;
        if (!method3901((byte) -18))
            return null;
        if (((Class271) aClass271_4664).anIntArray3144.length == 1)
            return method3922((byte) 111, 0, i_85_);
        if (!method3921((byte) -127, i_85_))
            return null;
        if ((((Class271) aClass271_4664).anIntArray3144[i_85_] ^ 0xffffffff) == -2)
            return method3922((byte) 110, i_85_, 0);
        if (i != -1)
            anInt4693 = 17;
        throw new RuntimeException();
    }

    Class381(Class330 class330, boolean bool, int i) {
        if ((i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) < -3)
            throw new IllegalArgumentException("js5: Invalid value " + i + " supplied for discardunpacked");
        aClass330_4654 = class330;
        aBoolean4688 = bool;
        ((Class381) this).anInt4675 = i;
    }

    final boolean method3931(String string, boolean bool) {
        if (bool != true)
            aClass271_4664 = null;
        anInt4677++;
        if (!method3901((byte) -18))
            return false;
        string = string.toLowerCase();
        int i = ((Class271) aClass271_4664).aClass127_3154.method1156((byte) 116, method3924(string, false));
        return method3906(-14491, i);
    }

    private final boolean method3932(String string, int i, String string_86_) {
        anInt4689++;
        if (!method3901((byte) -18))
            return false;
        string_86_ = string_86_.toLowerCase();
        string = string.toLowerCase();
        int i_87_ = 45 % ((i - -62) / 33);
        int i_88_ = ((Class271) aClass271_4664).aClass127_3154.method1156((byte) 119, method3924(string_86_, false));
        if (!method3921((byte) -78, i_88_))
            return false;
        int i_89_ = ((Class271) aClass271_4664).aClass127Array3145[i_88_].method1156((byte) 119, method3924(string, false));
        return method3915(70, i_89_, i_88_);
    }

    final int method3933(byte i) {
        anInt4687++;
        if (!method3901((byte) -18))
            return 0;
        if (i >= -97)
            method3904(31, (byte) -32);
        int i_90_ = 0;
        int i_91_ = 0;
        for (int i_92_ = 0; (i_92_ ^ 0xffffffff) > (anObjectArray4667.length ^ 0xffffffff); i_92_++) {
            if (((Class271) aClass271_4664).anIntArray3148[i_92_] > 0) {
                i_91_ += method3898(false, i_92_);
                i_90_ += 100;
            }
        }
        if ((i_90_ ^ 0xffffffff) == -1)
            return 100;
        int i_93_ = i_91_ * 100 / i_90_;
        return i_93_;
    }

    public static void method3934(byte i) {
        aOutgoingOpcode_4684 = null;
        if (i <= 9)
            anInt4693 = 112;
    }
}
