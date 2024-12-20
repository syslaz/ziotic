/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Class34 {
    static int anInt389;
    static int anInt390;
    static int anInt391;
    static int anInt392;
    static int anInt393;
    static int anInt394 = 0;
    static int anInt395;

    static final void method275(boolean bool) {
        for (int i = 0; Class164.anInt1937 > i; i++)
            Class183.aClass2Array2137[i] = null;
        anInt391++;
        Class164.anInt1937 = 0;
        for (int i = 0; (i ^ 0xffffffff) > (Class111_Sub1.anInt5531 ^ 0xffffffff); i++) {
            for (int i_0_ = 0; (Class225_Sub1.anInt8454 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
                for (int i_1_ = 0; Class89.anInt1106 > i_1_; i_1_++) {
                    Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_1_][i_0_];
                    if (class137 != null) {
                        if (((Class137) class137).aShort1638 > 0)
                            ((Class137) class137).aShort1638 *= -1;
                        if ((((Class137) class137).aShort1639 ^ 0xffffffff) < -1)
                            ((Class137) class137).aShort1639 *= -1;
                    }
                }
            }
        }
        for (int i = 0; (i ^ 0xffffffff) > (Class111_Sub1.anInt5531 ^ 0xffffffff); i++) {
            for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (Class225_Sub1.anInt8454 ^ 0xffffffff); i_2_++) {
                for (int i_3_ = 0; i_3_ < Class89.anInt1106; i_3_++) {
                    Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_3_][i_2_];
                    if (class137 != null) {
                        boolean bool_4_ = ((Class311.aClass137ArrayArrayArray3620[0][i_3_][i_2_]) != null && (((Class137) (Class311.aClass137ArrayArrayArray3620[0][i_3_][i_2_])).aClass137_1651) != null);
                        if ((((Class137) class137).aShort1638 ^ 0xffffffff) > -1) {
                            int i_5_ = i_2_;
                            int i_6_ = i_2_;
                            int i_7_ = i;
                            int i_8_ = i;
                            Class137 class137_9_ = (Class311.aClass137ArrayArrayArray3620[i][i_3_][i_5_ + -1]);
                            int i_10_;
                            for (i_10_ = Node_Sub14_Sub29.aSArray9471[i].method3145(i_3_, 72, i_2_); (i_5_ > 0 && class137_9_ != null && ((Class137) class137_9_).aShort1638 < 0 && ((((Class137) class137_9_).aShort1638 ^ 0xffffffff) == (((Class137) class137).aShort1638 ^ 0xffffffff)) && (((Class137) class137_9_).aShort1650 == ((Class137) class137).aShort1650) && ((i_10_ ^ 0xffffffff) == (Node_Sub14_Sub29.aSArray9471[i].method3145(i_3_, 86, -1 + i_5_) ^ 0xffffffff))); class137_9_ = (Class311.aClass137ArrayArrayArray3620[i][i_3_][i_5_ - 1])) {
                                if (-1 + i_5_ > 0 && ((i_10_ ^ 0xffffffff) != ((Node_Sub14_Sub29.aSArray9471[i].method3145(i_3_, 108, -2 + i_5_)) ^ 0xffffffff)))
                                    break;
                                i_5_--;
                            }
                            for (class137_9_ = (Class311.aClass137ArrayArrayArray3620[i][i_3_][1 + i_6_]); ((i_6_ ^ 0xffffffff) > (Class89.anInt1106 ^ 0xffffffff) && class137_9_ != null && ((Class137) class137_9_).aShort1638 < 0 && ((((Class137) class137_9_).aShort1638 ^ 0xffffffff) == (((Class137) class137).aShort1638 ^ 0xffffffff)) && ((((Class137) class137).aShort1650 ^ 0xffffffff) == (((Class137) class137_9_).aShort1650 ^ 0xffffffff)) && i_10_ == (Node_Sub14_Sub29.aSArray9471[i].method3145(i_3_, 124, i_6_ + 1))); class137_9_ = (Class311.aClass137ArrayArrayArray3620[i][i_3_][i_6_ + 1])) {
                                if (Class89.anInt1106 > i_6_ - -1 && ((i_10_ ^ 0xffffffff) != ((Node_Sub14_Sub29.aSArray9471[i].method3145(i_3_, 123, i_6_ - -2)) ^ 0xffffffff)))
                                    break;
                                i_6_++;
                            }
                            int i_11_ = 1 + -i_7_ + i_8_;
                            int i_12_ = Node_Sub14_Sub29.aSArray9471[!bool_4_ ? i_7_ : 1 + i_7_].method3145(i_3_, 73, i_5_);
                            int i_13_ = (((Class137) class137).aShort1638 * i_11_ + i_12_);
                            int i_14_ = Node_Sub14_Sub29.aSArray9471[bool_4_ ? 1 + i_7_ : i_7_].method3145(i_3_, 81, i_6_ - -1);
                            int i_15_ = (i_14_ + ((Class137) class137).aShort1638 * i_11_);
                            int i_16_ = i_3_ << Class96.anInt1249;
                            int i_17_ = i_5_ << Class96.anInt1249;
                            int i_18_ = (Class241.anInt2692 + (i_6_ << Class96.anInt1249));
                            Class183.aClass2Array2137[Class164.anInt1937++] = (new Class2(1, i_8_, i_16_ + ((Class137) class137).aShort1650, ((Class137) class137).aShort1650 + i_16_, ((Class137) class137).aShort1650 + i_16_, ((Class137) class137).aShort1650 + i_16_, i_12_, i_14_, i_15_, i_13_, i_17_, i_18_, i_18_, i_17_));
                            for (int i_19_ = i_7_; (i_8_ ^ 0xffffffff) <= (i_19_ ^ 0xffffffff); i_19_++) {
                                for (int i_20_ = i_5_; i_20_ <= i_6_; i_20_++)
                                    ((Class137) (Class311.aClass137ArrayArrayArray3620[i_19_][i_3_][i_20_])).aShort1638 *= -1;
                            }
                        }
                        if ((((Class137) class137).aShort1639 ^ 0xffffffff) > -1) {
                            int i_21_ = i_3_;
                            int i_22_ = i_3_;
                            int i_23_ = i;
                            int i_24_ = i;
                            Class137 class137_25_ = (Class311.aClass137ArrayArrayArray3620[i][-1 + i_21_][i_2_]);
                            int i_26_;
                            for (i_26_ = Node_Sub14_Sub29.aSArray9471[i].method3145(i_3_, 98, i_2_); ((i_21_ ^ 0xffffffff) < -1 && class137_25_ != null && ((Class137) class137_25_).aShort1639 < 0 && ((((Class137) class137_25_).aShort1639 ^ 0xffffffff) == (((Class137) class137).aShort1639 ^ 0xffffffff)) && (((Class137) class137_25_).aShort1640 == ((Class137) class137).aShort1640) && ((i_26_ ^ 0xffffffff) == ((Node_Sub14_Sub29.aSArray9471[i].method3145(i_21_ + -1, 122, i_2_)) ^ 0xffffffff))); class137_25_ = (Class311.aClass137ArrayArrayArray3620[i][-1 + i_21_][i_2_])) {
                                if ((i_21_ + -1 ^ 0xffffffff) < -1 && (Node_Sub14_Sub29.aSArray9471[i].method3145(-2 + i_21_, 88, i_2_) != i_26_))
                                    break;
                                i_21_--;
                            }
                            for (class137_25_ = (Class311.aClass137ArrayArrayArray3620[i][1 + i_22_][i_2_]); (i_22_ < Class225_Sub1.anInt8454 && class137_25_ != null && (((Class137) class137_25_).aShort1639 ^ 0xffffffff) > -1 && ((((Class137) class137_25_).aShort1639 ^ 0xffffffff) == (((Class137) class137).aShort1639 ^ 0xffffffff)) && ((((Class137) class137).aShort1640 ^ 0xffffffff) == (((Class137) class137_25_).aShort1640 ^ 0xffffffff)) && ((i_26_ ^ 0xffffffff) == (Node_Sub14_Sub29.aSArray9471[i].method3145(i_22_ + 1, 67, i_2_) ^ 0xffffffff))); class137_25_ = (Class311.aClass137ArrayArrayArray3620[i][1 + i_22_][i_2_])) {
                                if (((1 + i_22_ ^ 0xffffffff) > (Class225_Sub1.anInt8454 ^ 0xffffffff)) && (Node_Sub14_Sub29.aSArray9471[i].method3145(2 + i_22_, 117, i_2_) != i_26_))
                                    break;
                                i_22_++;
                            }
                            int i_27_ = 1 + -i_23_ + i_24_;
                            int i_28_ = Node_Sub14_Sub29.aSArray9471[!bool_4_ ? i_23_ : 1 + i_23_].method3145(i_21_, 103, i_2_);
                            int i_29_ = (i_27_ * ((Class137) class137).aShort1639 + i_28_);
                            int i_30_ = Node_Sub14_Sub29.aSArray9471[!bool_4_ ? i_23_ : 1 + i_23_].method3145(i_22_ + 1, 82, i_2_);
                            int i_31_ = (i_27_ * ((Class137) class137).aShort1639 + i_30_);
                            int i_32_ = i_21_ << Class96.anInt1249;
                            int i_33_ = ((i_22_ << Class96.anInt1249) + Class241.anInt2692);
                            int i_34_ = i_2_ << Class96.anInt1249;
                            Class183.aClass2Array2137[Class164.anInt1937++] = (new Class2(2, i_24_, i_32_, i_33_, i_33_, i_32_, i_28_, i_30_, i_31_, i_29_, ((Class137) class137).aShort1640 + i_34_, i_34_ - -((Class137) class137).aShort1640, ((Class137) class137).aShort1640 + i_34_, i_34_ + ((Class137) class137).aShort1640));
                            for (int i_35_ = i_23_; i_35_ <= i_24_; i_35_++) {
                                for (int i_36_ = i_21_; ((i_36_ ^ 0xffffffff) >= (i_22_ ^ 0xffffffff)); i_36_++)
                                    ((Class137) (Class311.aClass137ArrayArrayArray3620[i_35_][i_36_][i_2_])).aShort1639 *= -1;
                            }
                        }
                    }
                }
            }
        }
        Node_Sub8_Sub2.aBoolean8914 = bool;
    }

    public final String toString() {
        anInt390++;
        throw new IllegalStateException();
    }

    static final void method276(int i) {
        if (i == -18426) {
            anInt395++;
            Class45 class45 = null;
            try {
                Class322 class322 = Node_Sub14_Sub15.aClass174_9328.method1574(true, 0, "2");
                while ((class322.anInt3788 ^ 0xffffffff) == -1)
                    Class279_Sub2.method2897((byte) -124, 1L);
                if (class322.anInt3788 == 1) {
                    class45 = (Class45) class322.anObject3787;
                    byte[] is = new byte[(int) class45.method321(0)];
                    int i_37_;
                    for (int i_38_ = 0; (is.length ^ 0xffffffff) < (i_38_ ^ 0xffffffff); i_38_ += i_37_) {
                        i_37_ = class45.method322(i_38_, is.length + -i_38_, (byte) 120, is);
                        if (i_37_ == -1)
                            throw new IOException("EOF");
                    }
                    Class245.method1956(new ByteStream(is), i ^ 0xb65);
                }
            } catch (Exception exception) {
                /* empty */
            }
            do {
                try {
                    if (class45 == null)
                        break;
                    class45.method323(123);
                } catch (Exception exception) {
                    break;
                }
                break;
            } while (false);
        }
    }

    static final byte[] method277(boolean bool, int i, byte[] is) {
        anInt392++;
        if (bool != false)
            return null;
        byte[] is_39_ = new byte[i];
        Class159.method1402(is, 0, is_39_, 0, i);
        return is_39_;
    }

    static final void method278(boolean bool, int i, byte[] is) {
        anInt389++;
        if (Node_Sub8_Sub8.aClass248_Sub9_8965 == null)
            Node_Sub8_Sub8.aClass248_Sub9_8965 = new ByteStream(20000);
        Node_Sub8_Sub8.aClass248_Sub9_8965.method2215(0, (byte) -32, is, is.length);
        if (i != -1)
            method279((byte) -47, -71L);
        if (bool) {
            Node_Sub14_Sub27.method2355(-128, (((ByteStream) (Node_Sub8_Sub8.aClass248_Sub9_8965)).buffer));
            Class64.aClass147_Sub1Array869 = new Class147_Sub1[Class41.anInt533];
            int i_40_ = 0;
            for (int i_41_ = RSInterface.anInt6848; Class270.anInt3135 >= i_41_; i_41_++) {
                Class147_Sub1 class147_sub1 = Node_Sub14_Sub34.method2378(i + -3651, i_41_);
                if (class147_sub1 != null)
                    Class64.aClass147_Sub1Array869[i_40_++] = class147_sub1;
            }
            Node_Sub14_Sub7.aBoolean9218 = false;
            Class349_Sub1.aLong4789 = Class118.method1112(116);
            Node_Sub8_Sub8.aClass248_Sub9_8965 = null;
        }
    }

    public Class34() {
        /* empty */
    }

    static final String method279(byte i, long l) {
        anInt393++;
        if ((l ^ 0xffffffffffffffffL) >= -1L || l >= 6582952005840035281L)
            return null;
        if ((l % 37L ^ 0xffffffffffffffffL) == -1L)
            return null;
        if (i != -104)
            method275(true);
        int i_42_ = 0;
        long l_43_ = l;
        while ((l_43_ ^ 0xffffffffffffffffL) != -1L) {
            l_43_ /= 37L;
            i_42_++;
        }
        StringBuffer stringbuffer = new StringBuffer(i_42_);
        while (l != 0L) {
            long l_44_ = l;
            l /= 37L;
            char c = (Class346_Sub7_Sub2_Sub4.aCharArray10094[(int) (l_44_ + -(l * 37L))]);
            if (c == '_') {
                int i_45_ = stringbuffer.length() - 1;
                c = '\u00a0';
                stringbuffer.setCharAt(i_45_, Character.toUpperCase(stringbuffer.charAt(i_45_)));
            }
            stringbuffer.append(c);
        }
        stringbuffer.reverse();
        stringbuffer.setCharAt(0, Character.toUpperCase(stringbuffer.charAt(0)));
        return stringbuffer.toString();
    }
}
