/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class157 {
    byte[] aByteArray1868;
    int anInt1869;
    int anInt1870;
    int anInt1871;
    int[] anIntArray1872;
    int anInt1873;
    int anInt1874;
    byte[] aByteArray1875;
    int anInt1876;

    final void method1378() {
        byte[] is = ((Class157) this).aByteArray1868;
        if (((Class157) this).aByteArray1875 == null) {
            for (int i = (((Class157) this).anInt1874 >> 1) - 1; i >= 0; i--) {
                int i_0_ = i * ((Class157) this).anInt1873;
                int i_1_ = ((((Class157) this).anInt1874 - i - 1) * ((Class157) this).anInt1873);
                for (int i_2_ = -((Class157) this).anInt1873; i_2_ < 0; i_2_++) {
                    byte i_3_ = is[i_0_];
                    is[i_0_] = is[i_1_];
                    is[i_1_] = i_3_;
                    i_0_++;
                    i_1_++;
                }
            }
        } else {
            byte[] is_4_ = ((Class157) this).aByteArray1875;
            for (int i = (((Class157) this).anInt1874 >> 1) - 1; i >= 0; i--) {
                int i_5_ = i * ((Class157) this).anInt1873;
                int i_6_ = ((((Class157) this).anInt1874 - i - 1) * ((Class157) this).anInt1873);
                for (int i_7_ = -((Class157) this).anInt1873; i_7_ < 0; i_7_++) {
                    byte i_8_ = is[i_5_];
                    is[i_5_] = is[i_6_];
                    is[i_6_] = i_8_;
                    i_8_ = is_4_[i_5_];
                    is_4_[i_5_] = is_4_[i_6_];
                    is_4_[i_6_] = i_8_;
                    i_5_++;
                    i_6_++;
                }
            }
        }
        int i = ((Class157) this).anInt1876;
        ((Class157) this).anInt1876 = ((Class157) this).anInt1870;
        ((Class157) this).anInt1870 = i;
    }

    static final Class157 method1379(Class381 class381, int i, int i_9_) {
        byte[] is = class381.method3922((byte) 125, i, i_9_);
        if (is == null)
            return null;
        return method1387(is)[0];
    }

    final int[] method1380() {
        int i = method1388();
        int[] is = new int[i * method1386()];
        if (((Class157) this).aByteArray1875 != null) {
            for (int i_10_ = 0; i_10_ < ((Class157) this).anInt1874; i_10_++) {
                int i_11_ = i_10_ * ((Class157) this).anInt1873;
                int i_12_ = (((Class157) this).anInt1869 + (i_10_ + ((Class157) this).anInt1876) * i);
                for (int i_13_ = 0; i_13_ < ((Class157) this).anInt1873; i_13_++) {
                    is[i_12_++] = (((Class157) this).aByteArray1875[i_11_] << 24 | (((Class157) this).anIntArray1872[(((Class157) this).aByteArray1868[i_11_] & 0xff)]));
                    i_11_++;
                }
            }
        } else {
            for (int i_14_ = 0; i_14_ < ((Class157) this).anInt1874; i_14_++) {
                int i_15_ = i_14_ * ((Class157) this).anInt1873;
                int i_16_ = (((Class157) this).anInt1869 + (i_14_ + ((Class157) this).anInt1876) * i);
                for (int i_17_ = 0; i_17_ < ((Class157) this).anInt1873; i_17_++) {
                    int i_18_ = (((Class157) this).anIntArray1872[((Class157) this).aByteArray1868[i_15_++] & 0xff]);
                    if (i_18_ != 0)
                        is[i_16_++] = ~0xffffff | i_18_;
                    else
                        is[i_16_++] = 0;
                }
            }
        }
        return is;
    }

    final void method1381(int i) {
        int i_19_ = -1;
        if (((Class157) this).anIntArray1872.length < 255) {
            for (int i_20_ = 0; i_20_ < ((Class157) this).anIntArray1872.length; i_20_++) {
                if (((Class157) this).anIntArray1872[i_20_] == i) {
                    i_19_ = i_20_;
                    break;
                }
            }
            if (i_19_ == -1) {
                i_19_ = ((Class157) this).anIntArray1872.length;
                int[] is = new int[((Class157) this).anIntArray1872.length + 1];
                Class159.method1398(((Class157) this).anIntArray1872, 0, is, 0, ((Class157) this).anIntArray1872.length);
                ((Class157) this).anIntArray1872 = is;
                is[i_19_] = i;
            }
        } else {
            int i_21_ = 2147483647;
            int i_22_ = i >> 16 & 0xff;
            int i_23_ = i >> 8 & 0xff;
            int i_24_ = i & 0xff;
            for (int i_25_ = 0; i_25_ < ((Class157) this).anIntArray1872.length; i_25_++) {
                int i_26_ = ((Class157) this).anIntArray1872[i_25_];
                int i_27_ = i_26_ >> 16 & 0xff;
                int i_28_ = i_26_ >> 8 & 0xff;
                int i_29_ = i_26_ & 0xff;
                int i_30_ = i_22_ - i_27_;
                if (i_30_ < 0)
                    i_30_ = -i_30_;
                int i_31_ = i_23_ - i_28_;
                if (i_31_ < 0)
                    i_31_ = -i_31_;
                int i_32_ = i_24_ - i_29_;
                if (i_32_ < 0)
                    i_32_ = -i_32_;
                int i_33_ = i_30_ + i_31_ + i_32_;
                if (i_33_ < i_21_) {
                    i_21_ = i_33_;
                    i_19_ = i_25_;
                }
            }
        }
        int i_34_ = 0;
        byte[] is = (new byte
                [((Class157) this).anInt1873 * ((Class157) this).anInt1874]);
        for (int i_35_ = 0; i_35_ < ((Class157) this).anInt1874; i_35_++) {
            for (int i_36_ = 0; i_36_ < ((Class157) this).anInt1873; i_36_++) {
                int i_37_ = ((Class157) this).aByteArray1868[i_34_] & 0xff;
                if (((Class157) this).anIntArray1872[i_37_] == 0) {
                    if (i_36_ > 0 && (((Class157) this).anIntArray1872[(((Class157) this).aByteArray1868[i_34_ - 1] & 0xff)]) != 0)
                        i_37_ = i_19_;
                    else if (i_35_ > 0 && (((Class157) this).anIntArray1872[((((Class157) this).aByteArray1868[i_34_ - ((Class157) this).anInt1873]) & 0xff)]) != 0)
                        i_37_ = i_19_;
                    else if (i_36_ < ((Class157) this).anInt1873 - 1 && (((Class157) this).anIntArray1872[(((Class157) this).aByteArray1868[i_34_ + 1] & 0xff)]) != 0)
                        i_37_ = i_19_;
                    else if (i_35_ < ((Class157) this).anInt1874 - 1 && (((Class157) this).anIntArray1872[((((Class157) this).aByteArray1868[i_34_ + ((Class157) this).anInt1873]) & 0xff)]) != 0)
                        i_37_ = i_19_;
                }
                is[i_34_++] = (byte) i_37_;
            }
        }
        ((Class157) this).aByteArray1868 = is;
    }

    static final Class157 method1382(Class381 class381, int i) {
        byte[] is = class381.method3930(-1, i);
        if (is == null)
            return null;
        return method1387(is)[0];
    }

    final void method1383() {
        byte[] is = (new byte
                [((Class157) this).anInt1873 * ((Class157) this).anInt1874]);
        int i = 0;
        if (((Class157) this).aByteArray1875 == null) {
            for (int i_38_ = 0; i_38_ < ((Class157) this).anInt1873; i_38_++) {
                for (int i_39_ = ((Class157) this).anInt1874 - 1; i_39_ >= 0; i_39_--)
                    is[i++] = (((Class157) this).aByteArray1868[i_38_ + i_39_ * ((Class157) this).anInt1873]);
            }
            ((Class157) this).aByteArray1868 = is;
        } else {
            byte[] is_40_ = new byte[(((Class157) this).anInt1873 * ((Class157) this).anInt1874)];
            for (int i_41_ = 0; i_41_ < ((Class157) this).anInt1873; i_41_++) {
                for (int i_42_ = ((Class157) this).anInt1874 - 1; i_42_ >= 0; i_42_--) {
                    is[i] = (((Class157) this).aByteArray1868[i_41_ + i_42_ * ((Class157) this).anInt1873]);
                    is_40_[i++] = (((Class157) this).aByteArray1875[i_41_ + i_42_ * ((Class157) this).anInt1873]);
                }
            }
            ((Class157) this).aByteArray1868 = is;
            ((Class157) this).aByteArray1875 = is_40_;
        }
        int i_43_ = ((Class157) this).anInt1876;
        ((Class157) this).anInt1876 = ((Class157) this).anInt1869;
        ((Class157) this).anInt1869 = ((Class157) this).anInt1870;
        ((Class157) this).anInt1870 = ((Class157) this).anInt1871;
        ((Class157) this).anInt1871 = ((Class157) this).anInt1876;
        i_43_ = ((Class157) this).anInt1874;
        ((Class157) this).anInt1874 = ((Class157) this).anInt1873;
        ((Class157) this).anInt1873 = i_43_;
    }

    final void method1384(int i) {
        int i_44_ = method1388();
        int i_45_ = method1386();
        if (((Class157) this).anInt1873 != i_44_ || ((Class157) this).anInt1874 != i_45_) {
            int i_46_ = i;
            if (i_46_ > ((Class157) this).anInt1869)
                i_46_ = ((Class157) this).anInt1869;
            int i_47_ = i;
            if ((i_47_ + ((Class157) this).anInt1869 + ((Class157) this).anInt1873) > i_44_)
                i_47_ = (i_44_ - ((Class157) this).anInt1869 - ((Class157) this).anInt1873);
            int i_48_ = i;
            if (i_48_ > ((Class157) this).anInt1876)
                i_48_ = ((Class157) this).anInt1876;
            int i_49_ = i;
            if ((i_49_ + ((Class157) this).anInt1876 + ((Class157) this).anInt1874) > i_45_)
                i_49_ = (i_45_ - ((Class157) this).anInt1876 - ((Class157) this).anInt1874);
            int i_50_ = ((Class157) this).anInt1873 + i_46_ + i_47_;
            int i_51_ = ((Class157) this).anInt1874 + i_48_ + i_49_;
            byte[] is = new byte[i_50_ * i_51_];
            if (((Class157) this).aByteArray1875 == null) {
                for (int i_52_ = 0; i_52_ < ((Class157) this).anInt1874; i_52_++) {
                    int i_53_ = i_52_ * ((Class157) this).anInt1873;
                    int i_54_ = (i_52_ + i_48_) * i_50_ + i_46_;
                    for (int i_55_ = 0; i_55_ < ((Class157) this).anInt1873; i_55_++)
                        is[i_54_++] = ((Class157) this).aByteArray1868[i_53_++];
                }
            } else {
                byte[] is_56_ = new byte[i_50_ * i_51_];
                for (int i_57_ = 0; i_57_ < ((Class157) this).anInt1874; i_57_++) {
                    int i_58_ = i_57_ * ((Class157) this).anInt1873;
                    int i_59_ = (i_57_ + i_48_) * i_50_ + i_46_;
                    for (int i_60_ = 0; i_60_ < ((Class157) this).anInt1873; i_60_++) {
                        is_56_[i_59_] = ((Class157) this).aByteArray1875[i_58_];
                        is[i_59_++] = ((Class157) this).aByteArray1868[i_58_++];
                    }
                }
                ((Class157) this).aByteArray1875 = is_56_;
            }
            ((Class157) this).anInt1869 -= i_46_;
            ((Class157) this).anInt1876 -= i_48_;
            ((Class157) this).anInt1871 -= i_47_;
            ((Class157) this).anInt1870 -= i_49_;
            ((Class157) this).anInt1873 = i_50_;
            ((Class157) this).anInt1874 = i_51_;
            ((Class157) this).aByteArray1868 = is;
        }
    }

    final void method1385(int i) {
        int i_61_ = -1;
        if (((Class157) this).anIntArray1872.length < 255) {
            for (int i_62_ = 0; i_62_ < ((Class157) this).anIntArray1872.length; i_62_++) {
                if (((Class157) this).anIntArray1872[i_62_] == i) {
                    i_61_ = i_62_;
                    break;
                }
            }
            if (i_61_ == -1) {
                i_61_ = ((Class157) this).anIntArray1872.length;
                int[] is = new int[((Class157) this).anIntArray1872.length + 1];
                Class159.method1398(((Class157) this).anIntArray1872, 0, is, 0, ((Class157) this).anIntArray1872.length);
                ((Class157) this).anIntArray1872 = is;
                is[i_61_] = i;
            }
        } else {
            int i_63_ = 2147483647;
            int i_64_ = i >> 16 & 0xff;
            int i_65_ = i >> 8 & 0xff;
            int i_66_ = i & 0xff;
            for (int i_67_ = 0; i_67_ < ((Class157) this).anIntArray1872.length; i_67_++) {
                int i_68_ = ((Class157) this).anIntArray1872[i_67_];
                int i_69_ = i_68_ >> 16 & 0xff;
                int i_70_ = i_68_ >> 8 & 0xff;
                int i_71_ = i_68_ & 0xff;
                int i_72_ = i_64_ - i_69_;
                if (i_72_ < 0)
                    i_72_ = -i_72_;
                int i_73_ = i_65_ - i_70_;
                if (i_73_ < 0)
                    i_73_ = -i_73_;
                int i_74_ = i_66_ - i_71_;
                if (i_74_ < 0)
                    i_74_ = -i_74_;
                int i_75_ = i_72_ + i_73_ + i_74_;
                if (i_75_ < i_63_) {
                    i_63_ = i_75_;
                    i_61_ = i_67_;
                }
            }
        }
        for (int i_76_ = ((Class157) this).anInt1874 - 1; i_76_ > 0; i_76_--) {
            int i_77_ = i_76_ * ((Class157) this).anInt1873;
            for (int i_78_ = ((Class157) this).anInt1873 - 1; i_78_ > 0; i_78_--) {
                if (((((Class157) this).anIntArray1872[((Class157) this).aByteArray1868[i_78_ + i_77_] & 0xff]) == 0) && (((Class157) this).anIntArray1872[((((Class157) this).aByteArray1868[i_78_ + i_77_ - 1 - ((Class157) this).anInt1873]) & 0xff)]) != 0)
                    ((Class157) this).aByteArray1868[i_78_ + i_77_] = (byte) i_61_;
            }
        }
    }

    final int method1386() {
        return (((Class157) this).anInt1874 + ((Class157) this).anInt1876 + ((Class157) this).anInt1870);
    }

    private static final Class157[] method1387(byte[] is) {
        ByteStream class248_sub9 = new ByteStream(is);
        ((ByteStream) class248_sub9).offset = is.length - 2;
        int i = class248_sub9.readShort(-1);
        Class157[] class157s = new Class157[i];
        for (int i_79_ = 0; i_79_ < i; i_79_++)
            class157s[i_79_] = new Class157();
        ((ByteStream) class248_sub9).offset = is.length - 7 - i * 8;
        int i_80_ = class248_sub9.readShort(-1);
        int i_81_ = class248_sub9.readShort(-1);
        int i_82_ = (class248_sub9.readUnsignedByte((byte) 95) & 0xff) + 1;
        for (int i_83_ = 0; i_83_ < i; i_83_++)
            ((Class157) class157s[i_83_]).anInt1869 = class248_sub9.readShort(-1);
        for (int i_84_ = 0; i_84_ < i; i_84_++)
            ((Class157) class157s[i_84_]).anInt1876 = class248_sub9.readShort(-1);
        for (int i_85_ = 0; i_85_ < i; i_85_++)
            ((Class157) class157s[i_85_]).anInt1873 = class248_sub9.readShort(-1);
        for (int i_86_ = 0; i_86_ < i; i_86_++)
            ((Class157) class157s[i_86_]).anInt1874 = class248_sub9.readShort(-1);
        for (int i_87_ = 0; i_87_ < i; i_87_++) {
            Class157 class157 = class157s[i_87_];
            ((Class157) class157).anInt1871 = (i_80_ - ((Class157) class157).anInt1873 - ((Class157) class157).anInt1869);
            ((Class157) class157).anInt1870 = (i_81_ - ((Class157) class157).anInt1874 - ((Class157) class157).anInt1876);
        }
        ((ByteStream) class248_sub9).offset = is.length - 7 - i * 8 - (i_82_ - 1) * 3;
        int[] is_88_ = new int[i_82_];
        for (int i_89_ = 1; i_89_ < i_82_; i_89_++) {
            is_88_[i_89_] = class248_sub9.method2221(255);
            if (is_88_[i_89_] == 0)
                is_88_[i_89_] = 1;
        }
        for (int i_90_ = 0; i_90_ < i; i_90_++)
            ((Class157) class157s[i_90_]).anIntArray1872 = is_88_;
        ((ByteStream) class248_sub9).offset = 0;
        for (int i_91_ = 0; i_91_ < i; i_91_++) {
            Class157 class157 = class157s[i_91_];
            int i_92_ = (((Class157) class157).anInt1873 * ((Class157) class157).anInt1874);
            ((Class157) class157).aByteArray1868 = new byte[i_92_];
            int i_93_ = class248_sub9.readUnsignedByte((byte) -78);
            if ((i_93_ & 0x2) == 0) {
                if ((i_93_ & 0x1) == 0) {
                    for (int i_94_ = 0; i_94_ < i_92_; i_94_++)
                        ((Class157) class157).aByteArray1868[i_94_] = class248_sub9.readByte(91);
                } else {
                    for (int i_95_ = 0; i_95_ < ((Class157) class157).anInt1873; i_95_++) {
                        for (int i_96_ = 0; i_96_ < ((Class157) class157).anInt1874; i_96_++)
                            ((Class157) class157).aByteArray1868[(i_95_ + i_96_ * ((Class157) class157).anInt1873)] = class248_sub9.readByte(103);
                    }
                }
            } else {
                boolean bool = false;
                ((Class157) class157).aByteArray1875 = new byte[i_92_];
                if ((i_93_ & 0x1) == 0) {
                    for (int i_97_ = 0; i_97_ < i_92_; i_97_++)
                        ((Class157) class157).aByteArray1868[i_97_] = class248_sub9.readByte(102);
                    for (int i_98_ = 0; i_98_ < i_92_; i_98_++) {
                        byte i_99_ = (((Class157) class157).aByteArray1875[i_98_] = class248_sub9.readByte(49));
                        bool = bool | i_99_ != -1;
                    }
                } else {
                    for (int i_100_ = 0; i_100_ < ((Class157) class157).anInt1873; i_100_++) {
                        for (int i_101_ = 0; i_101_ < ((Class157) class157).anInt1874; i_101_++)
                            ((Class157) class157).aByteArray1868[(i_100_ + i_101_ * ((Class157) class157).anInt1873)] = class248_sub9.readByte(82);
                    }
                    for (int i_102_ = 0; i_102_ < ((Class157) class157).anInt1873; i_102_++) {
                        for (int i_103_ = 0; i_103_ < ((Class157) class157).anInt1874; i_103_++) {
                            byte i_104_ = (((Class157) class157).aByteArray1875[i_102_ + i_103_ * ((Class157) class157).anInt1873] = class248_sub9.readByte(127));
                            bool = bool | i_104_ != -1;
                        }
                    }
                }
                if (!bool)
                    ((Class157) class157).aByteArray1875 = null;
            }
        }
        return class157s;
    }

    final int method1388() {
        return (((Class157) this).anInt1873 + ((Class157) this).anInt1869 + ((Class157) this).anInt1871);
    }

    final void method1389() {
        byte[] is = ((Class157) this).aByteArray1868;
        if (((Class157) this).aByteArray1875 == null) {
            for (int i = ((Class157) this).anInt1874 - 1; i >= 0; i--) {
                int i_105_ = i * ((Class157) this).anInt1873;
                for (int i_106_ = (i + 1) * ((Class157) this).anInt1873; i_105_ < i_106_; i_105_++) {
                    i_106_--;
                    byte i_107_ = is[i_105_];
                    is[i_105_] = is[i_106_];
                    is[i_106_] = i_107_;
                }
            }
        } else {
            byte[] is_108_ = ((Class157) this).aByteArray1875;
            for (int i = ((Class157) this).anInt1874 - 1; i >= 0; i--) {
                int i_109_ = i * ((Class157) this).anInt1873;
                for (int i_110_ = (i + 1) * ((Class157) this).anInt1873; i_109_ < i_110_; i_109_++) {
                    i_110_--;
                    byte i_111_ = is[i_109_];
                    is[i_109_] = is[i_110_];
                    is[i_110_] = i_111_;
                    i_111_ = is_108_[i_109_];
                    is_108_[i_109_] = is_108_[i_110_];
                    is_108_[i_110_] = i_111_;
                }
            }
        }
        int i = ((Class157) this).anInt1869;
        ((Class157) this).anInt1869 = ((Class157) this).anInt1871;
        ((Class157) this).anInt1871 = i;
    }

    final void method1390() {
        int i = method1388();
        int i_112_ = method1386();
        if (((Class157) this).anInt1873 != i || ((Class157) this).anInt1874 != i_112_) {
            byte[] is = new byte[i * i_112_];
            if (((Class157) this).aByteArray1875 != null) {
                byte[] is_113_ = new byte[i * i_112_];
                for (int i_114_ = 0; i_114_ < ((Class157) this).anInt1874; i_114_++) {
                    int i_115_ = i_114_ * ((Class157) this).anInt1873;
                    int i_116_ = ((i_114_ + ((Class157) this).anInt1876) * i + ((Class157) this).anInt1869);
                    for (int i_117_ = 0; i_117_ < ((Class157) this).anInt1873; i_117_++) {
                        is[i_116_] = ((Class157) this).aByteArray1868[i_115_];
                        is_113_[i_116_++] = ((Class157) this).aByteArray1875[i_115_++];
                    }
                }
                ((Class157) this).aByteArray1875 = is_113_;
            } else {
                for (int i_118_ = 0; i_118_ < ((Class157) this).anInt1874; i_118_++) {
                    int i_119_ = i_118_ * ((Class157) this).anInt1873;
                    int i_120_ = ((i_118_ + ((Class157) this).anInt1876) * i + ((Class157) this).anInt1869);
                    for (int i_121_ = 0; i_121_ < ((Class157) this).anInt1873; i_121_++)
                        is[i_120_++] = ((Class157) this).aByteArray1868[i_119_++];
                }
            }
            ((Class157) this).anInt1869 = ((Class157) this).anInt1871 = ((Class157) this).anInt1876 = ((Class157) this).anInt1870 = 0;
            ((Class157) this).anInt1873 = i;
            ((Class157) this).anInt1874 = i_112_;
            ((Class157) this).aByteArray1868 = is;
        }
    }

    static final Class157[] method1391(Class381 class381, int i) {
        byte[] is = class381.method3930(-1, i);
        if (is == null)
            return null;
        return method1387(is);
    }

    static final Class157[] method1392(Class381 class381, int i, int i_122_) {
        byte[] is = class381.method3922((byte) 113, i, i_122_);
        if (is == null)
            return null;
        return method1387(is);
    }

    public Class157() {
        /* empty */
    }
}
