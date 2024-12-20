/* Class248_Sub44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub44 extends Node {
    Class65 aClass65_7310;
    byte[] aByteArray7311;

    final void method2639() {
        if (((Node_Sub44) this).aClass65_7310 == null) {
            ((Node_Sub44) this).aClass65_7310 = new Class65(16);
            int[] is = new int[16];
            int[] is_0_ = new int[16];
            is[9] = is_0_[9] = 128;
            Class134 class134 = new Class134(((Node_Sub44) this).aByteArray7311);
            int i = class134.method1229();
            for (int i_1_ = 0; i_1_ < i; i_1_++) {
                class134.method1236(i_1_);
                class134.method1231(i_1_);
                class134.method1226(i_1_);
            }
            while_212_:
            for (; ; ) {
                int i_2_ = class134.method1225();
                int i_3_ = ((Class134) class134).anIntArray1625[i_2_];
                while (((Class134) class134).anIntArray1625[i_2_] == i_3_) {
                    class134.method1236(i_2_);
                    int i_4_ = class134.method1224(i_2_);
                    if (i_4_ == 1) {
                        class134.method1234();
                        class134.method1226(i_2_);
                        if (!class134.method1233())
                            break;
                        break while_212_;
                    }
                    int i_5_ = i_4_ & 0xf0;
                    if (i_5_ == 176) {
                        int i_6_ = i_4_ & 0xf;
                        int i_7_ = i_4_ >> 8 & 0x7f;
                        int i_8_ = i_4_ >> 16 & 0x7f;
                        if (i_7_ == 0)
                            is[i_6_] = (is[i_6_] & ~0x1fc000) + (i_8_ << 14);
                        if (i_7_ == 32)
                            is[i_6_] = (is[i_6_] & ~0x3f80) + (i_8_ << 7);
                    }
                    if (i_5_ == 192) {
                        int i_9_ = i_4_ & 0xf;
                        int i_10_ = i_4_ >> 8 & 0x7f;
                        is_0_[i_9_] = is[i_9_] + i_10_;
                    }
                    if (i_5_ == 144) {
                        int i_11_ = i_4_ & 0xf;
                        int i_12_ = i_4_ >> 8 & 0x7f;
                        int i_13_ = i_4_ >> 16 & 0x7f;
                        if (i_13_ > 0) {
                            int i_14_ = is_0_[i_11_];
                            Node_Sub20 class248_sub20 = ((Node_Sub20) ((Node_Sub44) this).aClass65_7310.method501((long) i_14_, (byte) 31));
                            if (class248_sub20 == null) {
                                class248_sub20 = new Node_Sub20(new byte[128]);
                                ((Node_Sub44) this).aClass65_7310.method509(-1, class248_sub20, (long) i_14_);
                            }
                            ((Node_Sub20) class248_sub20).aByteArray7046[i_12_] = (byte) 1;
                        }
                    }
                    class134.method1231(i_2_);
                    class134.method1226(i_2_);
                }
            }
        }
    }

    static final Node_Sub44 method2640(Class381 class381, int i, int i_15_) {
        byte[] is = class381.method3922((byte) 120, i, i_15_);
        if (is == null)
            return null;
        return new Node_Sub44(new ByteStream(is));
    }

    final void method2641() {
        ((Node_Sub44) this).aClass65_7310 = null;
    }

    private Node_Sub44(ByteStream class248_sub9) {
        ((ByteStream) class248_sub9).offset = ((ByteStream) class248_sub9).buffer.length - 3;
        int i = class248_sub9.readUnsignedByte((byte) -97);
        int i_16_ = class248_sub9.readShort(-1);
        int i_17_ = 14 + i * 10;
        ((ByteStream) class248_sub9).offset = 0;
        int i_18_ = 0;
        int i_19_ = 0;
        int i_20_ = 0;
        int i_21_ = 0;
        int i_22_ = 0;
        int i_23_ = 0;
        int i_24_ = 0;
        int i_25_ = 0;
        while_210_:
        for (int i_26_ = 0; i_26_ < i; i_26_++) {
            int i_27_ = -1;
            for (; ; ) {
                int i_28_ = class248_sub9.readUnsignedByte((byte) -73);
                if (i_28_ != i_27_)
                    i_17_++;
                i_27_ = i_28_ & 0xf;
                if (i_28_ == 7)
                    continue while_210_;
                if (i_28_ == 23)
                    i_18_++;
                else if (i_27_ == 0)
                    i_20_++;
                else if (i_27_ == 1)
                    i_21_++;
                else if (i_27_ == 2)
                    i_19_++;
                else if (i_27_ == 3)
                    i_22_++;
                else if (i_27_ == 4)
                    i_23_++;
                else if (i_27_ == 5)
                    i_24_++;
                else {
                    if (i_27_ != 6)
                        break;
                    i_25_++;
                }
            }
            throw new RuntimeException();
        }
        i_17_ += 5 * i_18_;
        i_17_ += 2 * (i_20_ + i_21_ + i_19_ + i_22_ + i_24_);
        i_17_ += i_23_ + i_25_;
        int i_29_ = ((ByteStream) class248_sub9).offset;
        int i_30_ = (i + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_ + i_25_);
        for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
            class248_sub9.method2164(-125749561);
        i_17_ += ((ByteStream) class248_sub9).offset - i_29_;
        int i_32_ = ((ByteStream) class248_sub9).offset;
        int i_33_ = 0;
        int i_34_ = 0;
        int i_35_ = 0;
        int i_36_ = 0;
        int i_37_ = 0;
        int i_38_ = 0;
        int i_39_ = 0;
        int i_40_ = 0;
        int i_41_ = 0;
        int i_42_ = 0;
        int i_43_ = 0;
        int i_44_ = 0;
        int i_45_ = 0;
        for (int i_46_ = 0; i_46_ < i_19_; i_46_++) {
            i_45_ = i_45_ + class248_sub9.readUnsignedByte((byte) 120) & 0x7f;
            if (i_45_ == 0 || i_45_ == 32)
                i_25_++;
            else if (i_45_ == 1)
                i_33_++;
            else if (i_45_ == 33)
                i_34_++;
            else if (i_45_ == 7)
                i_35_++;
            else if (i_45_ == 39)
                i_36_++;
            else if (i_45_ == 10)
                i_37_++;
            else if (i_45_ == 42)
                i_38_++;
            else if (i_45_ == 99)
                i_39_++;
            else if (i_45_ == 98)
                i_40_++;
            else if (i_45_ == 101)
                i_41_++;
            else if (i_45_ == 100)
                i_42_++;
            else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121 || i_45_ == 123)
                i_43_++;
            else
                i_44_++;
        }
        int i_47_ = 0;
        int i_48_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_43_;
        int i_49_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_24_;
        int i_50_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_23_;
        int i_51_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_22_;
        int i_52_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_33_;
        int i_53_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_35_;
        int i_54_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_37_;
        int i_55_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_20_ + i_21_ + i_24_;
        int i_56_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_20_;
        int i_57_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_44_;
        int i_58_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_21_;
        int i_59_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_34_;
        int i_60_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_36_;
        int i_61_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_38_;
        int i_62_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_25_;
        int i_63_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_22_;
        int i_64_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_39_;
        int i_65_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_40_;
        int i_66_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_41_;
        int i_67_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_42_;
        int i_68_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_18_ * 3;
        ((Node_Sub44) this).aByteArray7311 = new byte[i_17_];
        ByteStream class248_sub9_69_ = new ByteStream(((Node_Sub44) this).aByteArray7311);
        class248_sub9_69_.writeInt(27695, 1297377380);
        class248_sub9_69_.writeInt(27695, 6);
        class248_sub9_69_.writeShort(1182, i > 1 ? 1 : 0);
        class248_sub9_69_.writeShort(1182, i);
        class248_sub9_69_.writeShort(1182, i_16_);
        ((ByteStream) class248_sub9).offset = i_29_;
        int i_70_ = 0;
        int i_71_ = 0;
        int i_72_ = 0;
        int i_73_ = 0;
        int i_74_ = 0;
        int i_75_ = 0;
        int i_76_ = 0;
        int[] is = new int[128];
        i_45_ = 0;
        for (int i_77_ = 0; i_77_ < i; i_77_++) {
            class248_sub9_69_.writeInt(27695, 1297379947);
            ((ByteStream) class248_sub9_69_).offset += 4;
            int i_78_ = ((ByteStream) class248_sub9_69_).offset;
            int i_79_ = -1;
            while_211_:
            do {
                for (; ; ) {
                    int i_80_ = class248_sub9.method2164(-125749561);
                    class248_sub9_69_.method2180((byte) -64, i_80_);
                    int i_81_ = ((((ByteStream) class248_sub9).buffer[i_47_++]) & 0xff);
                    boolean bool = i_81_ != i_79_;
                    i_79_ = i_81_ & 0xf;
                    if (i_81_ == 7) {
                        if (bool)
                            class248_sub9_69_.writeByte(-28, 255);
                        class248_sub9_69_.writeByte(-47, 47);
                        class248_sub9_69_.writeByte(-65, 0);
                        break while_211_;
                    }
                    if (i_81_ == 23) {
                        if (bool)
                            class248_sub9_69_.writeByte(-113, 255);
                        class248_sub9_69_.writeByte(-109, 81);
                        class248_sub9_69_.writeByte(-76, 3);
                        class248_sub9_69_.writeByte(-68, (((ByteStream) class248_sub9).buffer[i_68_++]));
                        class248_sub9_69_.writeByte(-97, (((ByteStream) class248_sub9).buffer[i_68_++]));
                        class248_sub9_69_.writeByte(-23, (((ByteStream) class248_sub9).buffer[i_68_++]));
                    } else {
                        i_70_ ^= i_81_ >> 4;
                        if (i_79_ == 0) {
                            if (bool)
                                class248_sub9_69_.writeByte(-32, 144 + i_70_);
                            i_71_ += (((ByteStream) class248_sub9).buffer[i_55_++]);
                            i_72_ += (((ByteStream) class248_sub9).buffer[i_56_++]);
                            class248_sub9_69_.writeByte(-52, i_71_ & 0x7f);
                            class248_sub9_69_.writeByte(-31, i_72_ & 0x7f);
                        } else if (i_79_ == 1) {
                            if (bool)
                                class248_sub9_69_.writeByte(-39, 128 + i_70_);
                            i_71_ += (((ByteStream) class248_sub9).buffer[i_55_++]);
                            i_73_ += (((ByteStream) class248_sub9).buffer[i_58_++]);
                            class248_sub9_69_.writeByte(-23, i_71_ & 0x7f);
                            class248_sub9_69_.writeByte(-59, i_73_ & 0x7f);
                        } else if (i_79_ == 2) {
                            if (bool)
                                class248_sub9_69_.writeByte(-47, 176 + i_70_);
                            i_45_ = i_45_ + (((ByteStream) class248_sub9).buffer[i_32_++]) & 0x7f;
                            class248_sub9_69_.writeByte(-106, i_45_);
                            int i_82_;
                            if (i_45_ == 0 || i_45_ == 32)
                                i_82_ = (((ByteStream) class248_sub9).buffer[i_62_++]);
                            else if (i_45_ == 1)
                                i_82_ = (((ByteStream) class248_sub9).buffer[i_52_++]);
                            else if (i_45_ == 33)
                                i_82_ = (((ByteStream) class248_sub9).buffer[i_59_++]);
                            else if (i_45_ == 7)
                                i_82_ = (((ByteStream) class248_sub9).buffer[i_53_++]);
                            else if (i_45_ == 39)
                                i_82_ = (((ByteStream) class248_sub9).buffer[i_60_++]);
                            else if (i_45_ == 10)
                                i_82_ = (((ByteStream) class248_sub9).buffer[i_54_++]);
                            else if (i_45_ == 42)
                                i_82_ = (((ByteStream) class248_sub9).buffer[i_61_++]);
                            else if (i_45_ == 99)
                                i_82_ = (((ByteStream) class248_sub9).buffer[i_64_++]);
                            else if (i_45_ == 98)
                                i_82_ = (((ByteStream) class248_sub9).buffer[i_65_++]);
                            else if (i_45_ == 101)
                                i_82_ = (((ByteStream) class248_sub9).buffer[i_66_++]);
                            else if (i_45_ == 100)
                                i_82_ = (((ByteStream) class248_sub9).buffer[i_67_++]);
                            else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121 || i_45_ == 123)
                                i_82_ = (((ByteStream) class248_sub9).buffer[i_48_++]);
                            else
                                i_82_ = (((ByteStream) class248_sub9).buffer[i_57_++]);
                            i_82_ += is[i_45_];
                            is[i_45_] = i_82_;
                            class248_sub9_69_.writeByte(-119, i_82_ & 0x7f);
                        } else if (i_79_ == 3) {
                            if (bool)
                                class248_sub9_69_.writeByte(-119, 224 + i_70_);
                            i_74_ += (((ByteStream) class248_sub9).buffer[i_63_++]);
                            i_74_ += (((ByteStream) class248_sub9).buffer[i_51_++]) << 7;
                            class248_sub9_69_.writeByte(-41, i_74_ & 0x7f);
                            class248_sub9_69_.writeByte(-67, i_74_ >> 7 & 0x7f);
                        } else if (i_79_ == 4) {
                            if (bool)
                                class248_sub9_69_.writeByte(-26, 208 + i_70_);
                            i_75_ += (((ByteStream) class248_sub9).buffer[i_50_++]);
                            class248_sub9_69_.writeByte(-46, i_75_ & 0x7f);
                        } else if (i_79_ == 5) {
                            if (bool)
                                class248_sub9_69_.writeByte(-114, 160 + i_70_);
                            i_71_ += (((ByteStream) class248_sub9).buffer[i_55_++]);
                            i_76_ += (((ByteStream) class248_sub9).buffer[i_49_++]);
                            class248_sub9_69_.writeByte(-108, i_71_ & 0x7f);
                            class248_sub9_69_.writeByte(-36, i_76_ & 0x7f);
                        } else {
                            if (i_79_ != 6)
                                break;
                            if (bool)
                                class248_sub9_69_.writeByte(-51, 192 + i_70_);
                            class248_sub9_69_.writeByte(-125, (((ByteStream) class248_sub9).buffer[i_62_++]));
                        }
                    }
                }
                throw new RuntimeException();
            } while (false);
            class248_sub9_69_.method2161((((ByteStream) class248_sub9_69_).offset) - i_78_, -2069575864);
        }
    }
}
