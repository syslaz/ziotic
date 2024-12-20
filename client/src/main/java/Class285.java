/* Class285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Class285 {
    static int anInt3356;
    static int anInt3357;
    private byte[] aByteArray3358;
    private byte[][] aByteArrayArray3359;
    static int anInt3360;
    static int anInt3361;
    static int anInt3362;
    static int anInt3363;
    static int anInt3364;
    int anInt3365;
    static int[] anIntArray3366 = new int[8];
    static int anInt3367;
    int anInt3368;
    static int anInt3369;
    int anInt3370;
    static int anInt3371;

    final int method3065(int i, String string, int i_0_, Class129[] class129s, int i_1_) {
        anInt3357++;
        if ((i_1_ ^ 0xffffffff) == -1)
            i_1_ = ((Class285) this).anInt3365;
        int i_2_ = method3073(string, 174, new int[]{i_0_}, Class59.aStringArray811, class129s);
        int i_3_ = i_1_ * (i + i_2_);
        return (((Class285) this).anInt3368 + (((Class285) this).anInt3370 + i_3_));
    }

    final int method3066(String string, byte i, Class129[] class129s, int i_4_) {
        anInt3362++;
        if (i != -46)
            return -108;
        return method3073(string, 174, new int[]{i_4_}, Class59.aStringArray811, class129s);
    }

    final int method3067(int i, int i_5_, char c) {
        if (i_5_ != 0)
            return 38;
        anInt3363++;
        if (aByteArrayArray3359 != null)
            return aByteArrayArray3359[i][c];
        return 0;
    }

    final int method3068(int i, String string) {
        if (i != -1)
            return 2;
        anInt3371++;
        return method3071(215, string, null);
    }

    public static void method3069(byte i) {
        if (i != -87)
            anIntArray3366 = null;
        anIntArray3366 = null;
    }

    final int method3070(String string, int i, Class129[] class129s, int i_6_) {
        anInt3356++;
        int i_7_ = method3073(string, 174, new int[]{i_6_}, Class59.aStringArray811, class129s);
        if (i >= -117)
            return -19;
        int i_8_ = 0;
        for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
            int i_10_ = method3071(215, Class59.aStringArray811[i_9_], class129s);
            if ((i_8_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff))
                i_8_ = i_10_;
        }
        return i_8_;
    }

    final int method3071(int i, String string, Class129[] class129s) {
        anInt3361++;
        if (string == null)
            return 0;
        int i_11_ = -1;
        int i_12_ = -1;
        int i_13_ = 0;
        int i_14_ = string.length();
        for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
            char c = string.charAt(i_15_);
            if (c == 60)
                i_11_ = i_15_;
            else {
                if ((c ^ 0xffffffff) == -63 && i_11_ != -1) {
                    String string_16_ = string.substring(i_11_ + 1, i_15_);
                    i_11_ = -1;
                    if (string_16_.equals("lt"))
                        c = '<';
                    else if (string_16_.equals("gt"))
                        c = '>';
                    else if (!string_16_.equals("nbsp")) {
                        if (!string_16_.equals("shy")) {
                            if (string_16_.equals("times"))
                                c = '\u00d7';
                            else if (!string_16_.equals("euro")) {
                                if (!string_16_.equals("copy")) {
                                    if (string_16_.equals("reg"))
                                        c = '\u00ae';
                                    else {
                                        if (string_16_.startsWith("img=") && class129s != null) {
                                            try {
                                                int i_17_ = (Class282_Sub21.method3012((byte) -110, string_16_.substring(4)));
                                                i_12_ = -1;
                                                i_13_ += class129s[i_17_].method1169();
                                            } catch (Exception exception) {
                                                /* empty */
                                            }
                                        }
                                        continue;
                                    }
                                } else
                                    c = '\u00a9';
                            } else
                                c = '\u20ac';
                        } else
                            c = '\u00ad';
                    } else
                        c = '\u00a0';
                }
                if ((i_11_ ^ 0xffffffff) == 0) {
                    i_13_ += (aByteArray3358[0xff & Class297_Sub1.method3137(27, c)]) & 0xff;
                    if (aByteArrayArray3359 != null && (i_12_ ^ 0xffffffff) != 0)
                        i_13_ += aByteArrayArray3359[i_12_][c];
                    i_12_ = c;
                }
            }
        }
        if (i != 215)
            ((Class285) this).anInt3368 = 98;
        return i_13_;
    }

    final String method3072(Class129[] class129s, String string, int i, int i_18_) {
        anInt3364++;
        if ((method3071(215, string, class129s) ^ 0xffffffff) >= (i_18_ ^ 0xffffffff))
            return string;
        i_18_ -= method3071(215, "...", null);
        int i_19_ = -1;
        int i_20_ = -1;
        int i_21_ = 0;
        int i_22_ = string.length();
        String string_23_ = "";
        for (int i_24_ = i; (i_22_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
            char c = string.charAt(i_24_);
            if ((c ^ 0xffffffff) == -61)
                i_19_ = i_24_;
            else {
                if (c == 62 && (i_19_ ^ 0xffffffff) != 0) {
                    String string_25_ = string.substring(i_19_ + 1, i_24_);
                    i_19_ = -1;
                    if (string_25_.equals("lt"))
                        c = '<';
                    else if (!string_25_.equals("gt")) {
                        if (!string_25_.equals("nbsp")) {
                            if (string_25_.equals("shy"))
                                c = '\u00ad';
                            else if (!string_25_.equals("times")) {
                                if (string_25_.equals("euro"))
                                    c = '\u20ac';
                                else if (!string_25_.equals("copy")) {
                                    if (string_25_.equals("reg"))
                                        c = '\u00ae';
                                    else {
                                        if (string_25_.startsWith("img=") && class129s != null) {
                                            try {
                                                int i_26_ = (Class282_Sub21.method3012((byte) -120, string_25_.substring(4)));
                                                i_21_ += class129s[i_26_].method1169();
                                                i_20_ = -1;
                                                if ((i_18_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff))
                                                    return string_23_ + "...";
                                                string_23_ = (string.substring(0, 1 + i_24_));
                                            } catch (Exception exception) {
                                                /* empty */
                                            }
                                        }
                                        continue;
                                    }
                                } else
                                    c = '\u00a9';
                            } else
                                c = '\u00d7';
                        } else
                            c = '\u00a0';
                    } else
                        c = '>';
                }
                if ((i_19_ ^ 0xffffffff) == 0) {
                    i_21_ += 0xff & (aByteArray3358[Class297_Sub1.method3137(47, c) & 0xff]);
                    if (aByteArrayArray3359 != null && i_20_ != -1)
                        i_21_ += aByteArrayArray3359[i_20_][c];
                    i_20_ = c;
                    int i_27_ = i_21_;
                    if (aByteArrayArray3359 != null)
                        i_27_ += aByteArrayArray3359[c][46];
                    if (i_27_ > i_18_)
                        return string_23_ + "...";
                    string_23_ = string.substring(0, 1 + i_24_);
                }
            }
        }
        return string;
    }

    final int method3073(String string, int i, int[] is, String[] strings, Class129[] class129s) {
        anInt3360++;
        if (string == null)
            return 0;
        int i_28_ = 0;
        int i_29_ = 0;
        int i_30_ = -1;
        int i_31_ = 0;
        int i_32_ = 0;
        int i_33_ = -1;
        if (i != 174)
            return 106;
        int i_34_ = -1;
        int i_35_ = 0;
        int i_36_ = string.length();
        for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > (i_36_ ^ 0xffffffff); i_37_++) {
            int i_38_ = 0xff & Class297_Sub1.method3137(59, string.charAt(i_37_));
            int i_39_ = 0;
            if (i_38_ == 60)
                i_33_ = i_37_;
            else {
                int i_40_;
                if ((i_33_ ^ 0xffffffff) != 0) {
                    if (i_38_ != 62)
                        continue;
                    i_40_ = i_33_;
                    String string_41_ = string.substring(i_33_ + 1, i_37_);
                    i_33_ = -1;
                    if (!string_41_.equals("br")) {
                        if (string_41_.equals("lt")) {
                            i_39_ += method3075(-117, 60);
                            if (aByteArrayArray3359 != null && i_34_ != -1)
                                i_39_ += aByteArrayArray3359[i_34_][60];
                            i_34_ = 60;
                        } else if (!string_41_.equals("gt")) {
                            if (string_41_.equals("nbsp")) {
                                i_39_ += method3075(-65, 160);
                                if (aByteArrayArray3359 != null && i_34_ != -1)
                                    i_39_ += aByteArrayArray3359[i_34_][160];
                                i_34_ = 160;
                            } else if (!string_41_.equals("shy")) {
                                if (!string_41_.equals("times")) {
                                    if (string_41_.equals("euro")) {
                                        i_39_ += method3075(i ^ ~0xe1, 8364);
                                        if (aByteArrayArray3359 != null && (i_34_ ^ 0xffffffff) != 0)
                                            i_39_ += (aByteArrayArray3359[i_34_][8364]);
                                        i_34_ = 8364;
                                    } else if (!string_41_.equals("copy")) {
                                        if (string_41_.equals("reg")) {
                                            i_39_ += method3075(-51, 174);
                                            if (aByteArrayArray3359 != null && (i_34_ ^ 0xffffffff) != 0)
                                                i_39_ += (aByteArrayArray3359[i_34_][174]);
                                            i_34_ = 174;
                                        } else if (string_41_.startsWith("img=") && class129s != null) {
                                            try {
                                                int i_42_ = (Class282_Sub21.method3012((byte) -123, string_41_.substring(4)));
                                                i_34_ = -1;
                                                i_39_ += class129s[i_42_].method1169();
                                            } catch (Exception exception) {
                                                /* empty */
                                            }
                                        }
                                    } else {
                                        i_39_ += method3075(-35, 169);
                                        if (aByteArrayArray3359 != null && i_34_ != -1)
                                            i_39_ += (aByteArrayArray3359[i_34_][169]);
                                        i_34_ = 169;
                                    }
                                } else {
                                    i_39_ += method3075(i + -263, 215);
                                    if (aByteArrayArray3359 != null && (i_34_ ^ 0xffffffff) != 0)
                                        i_39_ += aByteArrayArray3359[i_34_][215];
                                    i_34_ = 215;
                                }
                            } else {
                                i_39_ += method3075(-112, 173);
                                if (aByteArrayArray3359 != null && (i_34_ ^ 0xffffffff) != 0)
                                    i_39_ += aByteArrayArray3359[i_34_][173];
                                i_34_ = 173;
                            }
                        } else {
                            i_39_ += method3075(-39, 62);
                            if (aByteArrayArray3359 != null && i_34_ != -1)
                                i_39_ += aByteArrayArray3359[i_34_][62];
                            i_34_ = 62;
                        }
                    } else {
                        strings[i_35_] = string.substring(i_29_, i_37_ - -1);
                        i_35_++;
                        if ((strings.length ^ 0xffffffff) >= (i_35_ ^ 0xffffffff))
                            return 0;
                        i_34_ = -1;
                        i_29_ = i_37_ + 1;
                        i_30_ = -1;
                        i_28_ = 0;
                        continue;
                    }
                    i_38_ = -1;
                } else {
                    i_39_ += method3075(-59, i_38_);
                    i_40_ = i_37_;
                    if (aByteArrayArray3359 != null && i_34_ != -1)
                        i_39_ += aByteArrayArray3359[i_34_][i_38_];
                    i_34_ = i_38_;
                }
                if ((i_39_ ^ 0xffffffff) < -1) {
                    i_28_ += i_39_;
                    if (is != null) {
                        if ((i_38_ ^ 0xffffffff) == -33) {
                            i_30_ = i_37_;
                            i_31_ = i_28_;
                            i_32_ = 1;
                        }
                        if ((i_28_ ^ 0xffffffff) < (is[((is.length ^ 0xffffffff) >= (i_35_ ^ 0xffffffff) ? is.length - 1 : i_35_)] ^ 0xffffffff)) {
                            if ((i_30_ ^ 0xffffffff) <= -1) {
                                strings[i_35_] = string.substring(i_29_, 1 + i_30_ + -i_32_);
                                i_35_++;
                                if ((strings.length ^ 0xffffffff) >= (i_35_ ^ 0xffffffff))
                                    return 0;
                                i_29_ = 1 + i_30_;
                                i_30_ = -1;
                                i_34_ = -1;
                                i_28_ -= i_31_;
                            } else {
                                strings[i_35_] = string.substring(i_29_, i_40_);
                                i_35_++;
                                if ((strings.length ^ 0xffffffff) >= (i_35_ ^ 0xffffffff))
                                    return 0;
                                i_34_ = -1;
                                i_30_ = -1;
                                i_28_ = i_39_;
                                i_29_ = i_40_;
                            }
                        }
                        if ((i_38_ ^ 0xffffffff) == -46) {
                            i_32_ = 0;
                            i_30_ = i_37_;
                            i_31_ = i_28_;
                        }
                    }
                }
            }
        }
        if (string.length() > i_29_) {
            strings[i_35_] = string.substring(i_29_, string.length());
            i_35_++;
        }
        return i_35_;
    }

    static final void method3074(int i) throws IOException {
        if (i != 7388)
            method3069((byte) 105);
        if (Class289.aClass111_3398 != null && Class26.anInt357 > 0) {
            ((ByteStream) Class94.aClass248_Sub9_1217).offset = 0;
            for (; ; ) {
                Node_Sub36 class248_sub36 = ((Node_Sub36) Node_Sub5.aClass293_6838.method3119(i ^ 0x1cde));
                if (class248_sub36 == null || ((((((ByteStream) Class94.aClass248_Sub9_1217).buffer).length - (((ByteStream) Class94.aClass248_Sub9_1217).offset)) ^ 0xffffffff) > (((Node_Sub36) class248_sub36).anInt7254 ^ 0xffffffff)))
                    break;
                Class94.aClass248_Sub9_1217.method2215(0, (byte) -32, (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).buffer), ((Node_Sub36) class248_sub36).anInt7254);
                Class26.anInt357 -= ((Node_Sub36) class248_sub36).anInt7254;
                class248_sub36.remove(true);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2201(16954);
                class248_sub36.method2590(i + 9636);
            }
            Class289.aClass111_3398.method775(((ByteStream) Class94.aClass248_Sub9_1217).offset, ((ByteStream) Class94.aClass248_Sub9_1217).buffer, 1232, 0);
            Class282_Sub18.anInt7780 += ((ByteStream) Class94.aClass248_Sub9_1217).offset;
            Class173.anInt2014 = 0;
        }
        anInt3367++;
    }

    Class285(byte[] is) {
        ByteStream class248_sub9 = new ByteStream(is);
        int i = class248_sub9.readUnsignedByte((byte) -82);
        if (i != 0)
            throw new RuntimeException("");
        boolean bool = (class248_sub9.readUnsignedByte((byte) -45) ^ 0xffffffff) == -2;
        aByteArray3358 = new byte[256];
        class248_sub9.method2189(aByteArray3358, 0, 256, 112);
        if (bool) {
            int[] is_43_ = new int[256];
            for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > -257; i_44_++)
                is_43_[i_44_] = class248_sub9.readUnsignedByte((byte) -87);
            int[] is_45_ = new int[256];
            for (int i_46_ = 0; i_46_ < 256; i_46_++)
                is_45_[i_46_] = class248_sub9.readUnsignedByte((byte) 85);
            byte[][] is_47_ = new byte[256][];
            for (int i_48_ = 0; i_48_ < 256; i_48_++) {
                is_47_[i_48_] = new byte[is_43_[i_48_]];
                byte i_49_ = 0;
                for (int i_50_ = 0; ((is_47_[i_48_].length ^ 0xffffffff) < (i_50_ ^ 0xffffffff)); i_50_++) {
                    i_49_ += class248_sub9.readByte(73);
                    is_47_[i_48_][i_50_] = i_49_;
                }
            }
            byte[][] is_51_ = new byte[256][];
            for (int i_52_ = 0; (i_52_ ^ 0xffffffff) > -257; i_52_++) {
                is_51_[i_52_] = new byte[is_43_[i_52_]];
                byte i_53_ = 0;
                for (int i_54_ = 0; ((i_54_ ^ 0xffffffff) > (is_51_[i_52_].length ^ 0xffffffff)); i_54_++) {
                    i_53_ += class248_sub9.readByte(49);
                    is_51_[i_52_][i_54_] = i_53_;
                }
            }
            aByteArrayArray3359 = new byte[256][256];
            for (int i_55_ = 0; (i_55_ ^ 0xffffffff) > -257; i_55_++) {
                if ((i_55_ ^ 0xffffffff) != -33 && (i_55_ ^ 0xffffffff) != -161) {
                    for (int i_56_ = 0; i_56_ < 256; i_56_++) {
                        if (i_56_ != 32 && i_56_ != 160)
                            aByteArrayArray3359[i_55_][i_56_] = (byte) (Class136_Sub1.method1253(i_56_, aByteArray3358, is_45_, (byte) 84, i_55_, is_47_, is_51_, is_43_));
                    }
                }
            }
            ((Class285) this).anInt3365 = is_45_[32] + is_43_[32];
        } else
            ((Class285) this).anInt3365 = class248_sub9.readUnsignedByte((byte) -21);
        class248_sub9.readUnsignedByte((byte) 118);
        class248_sub9.readUnsignedByte((byte) 87);
        ((Class285) this).anInt3370 = class248_sub9.readUnsignedByte((byte) -92);
        ((Class285) this).anInt3368 = class248_sub9.readUnsignedByte((byte) 73);
    }

    final int method3075(int i, int i_57_) {
        if (i >= -30)
            ((Class285) this).anInt3368 = -53;
        anInt3369++;
        return 0xff & aByteArray3358[i_57_];
    }
}
