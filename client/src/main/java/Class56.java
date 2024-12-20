/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class56 {
    int anInt736 = -2147483648;
    static int anInt737;
    boolean aBoolean738;
    static int anInt739;
    private int anInt740 = -1;
    boolean aBoolean741;
    private int anInt742;
    private Class65 aClass65_743;
    int anInt744;
    Class257 aClass257_745;
    int anInt746;
    static int anInt747;
    int anInt748;
    static long aLong749 = -1L;
    int[] anIntArray750;
    int anInt751;
    int anInt752;
    int anInt753;
    int[] anIntArray754;
    static int anInt755;
    static int anInt756;
    int anInt757;
    int anInt758;
    private int anInt759;
    private int anInt760;
    byte[] aByteArray761;
    int anInt762;
    int anInt763;
    static int anInt764;
    private int anInt765;
    int anInt766;
    boolean aBoolean767;
    private int anInt768;
    int anInt769;
    int anInt770;
    boolean aBoolean771;
    static int anInt772;
    int anInt773;
    int anInt774;
    String[] aStringArray775;
    static int anInt776;
    static int anInt777;
    int anInt778;
    int anInt779;
    private int anInt780;
    private int anInt781;
    private int anInt782;
    int anInt783;
    static int anInt784;
    String aString785;
    String aString786;

    static final Class287 method443(byte i, String string, ha_Sub2 var_ha_Sub2, int i_0_) {
        if (i < 38)
            return null;
        anInt764++;
        int i_1_ = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(i_0_, i_1_);
        OpenGL.glProgramStringARB(i_0_, 34933, string);
        OpenGL.glGetIntegerv(34379, Node_Sub8_Sub11.anIntArray8993, 0);
        if (Node_Sub8_Sub11.anIntArray8993[0] != -1) {
            OpenGL.glBindProgramARB(i_0_, 0);
            return null;
        }
        OpenGL.glBindProgramARB(i_0_, 0);
        return new Class287(var_ha_Sub2, i_0_, i_1_);
    }

    final String method444(String string, byte i, int i_2_) {
        anInt739++;
        if (i != -83)
            return null;
        if (aClass65_743 == null)
            return string;
        Node_Sub32 class248_sub32 = (Node_Sub32) aClass65_743.method501((long) i_2_, (byte) 31);
        if (class248_sub32 == null)
            return string;
        return ((Node_Sub32) class248_sub32).aString7195;
    }

    final void method445(byte i) {
        if (((Class56) this).anIntArray754 != null) {
            for (int i_3_ = 0; ((Class56) this).anIntArray754.length > i_3_; i_3_ += 2) {
                if (((Class56) this).anIntArray754[i_3_] < ((Class56) this).anInt769)
                    ((Class56) this).anInt769 = ((Class56) this).anIntArray754[i_3_];
                else if ((((Class56) this).anIntArray754[i_3_] ^ 0xffffffff) < (((Class56) this).anInt778 ^ 0xffffffff))
                    ((Class56) this).anInt778 = ((Class56) this).anIntArray754[i_3_];
                if ((((Class56) this).anInt770 ^ 0xffffffff) >= (((Class56) this).anIntArray754[1 + i_3_] ^ 0xffffffff)) {
                    if ((((Class56) this).anIntArray754[i_3_ - -1] ^ 0xffffffff) < (((Class56) this).anInt736 ^ 0xffffffff))
                        ((Class56) this).anInt736 = ((Class56) this).anIntArray754[i_3_ - -1];
                } else
                    ((Class56) this).anInt770 = ((Class56) this).anIntArray754[i_3_ - -1];
            }
        }
        if (i < 82)
            method444(null, (byte) -128, -68);
        anInt784++;
    }

    private final void method446(ByteStream class248_sub9, boolean bool, int i) {
        if (bool != true)
            method443((byte) 41, null, null, -98);
        if ((i ^ 0xffffffff) != -2) {
            if (i != 2) {
                if ((i ^ 0xffffffff) != -4) {
                    if (i != 4) {
                        if ((i ^ 0xffffffff) == -6)
                            ((Class56) this).anInt752 = class248_sub9.method2221(255);
                        else if ((i ^ 0xffffffff) != -7) {
                            if ((i ^ 0xffffffff) != -8) {
                                if (i == 8)
                                    ((Class56) this).aBoolean741 = (class248_sub9.readUnsignedByte((byte) 94) ^ 0xffffffff) == -2;
                                else if (i != 9) {
                                    if (i >= 10 && i <= 14)
                                        ((Class56) this).aStringArray775[(-10 + i)] = class248_sub9.readString(15598);
                                    else if (i == 15) {
                                        int i_4_ = class248_sub9.readUnsignedByte((byte) -82);
                                        ((Class56) this).anIntArray754 = new int[2 * i_4_];
                                        for (int i_5_ = 0; i_5_ < 2 * i_4_; i_5_++)
                                            ((Class56) this).anIntArray754[i_5_] = class248_sub9.readUnsignedShort((byte) -10);
                                        ((Class56) this).anInt748 = class248_sub9.readInt(false);
                                        int i_6_ = class248_sub9.readUnsignedByte((byte) -37);
                                        ((Class56) this).anIntArray750 = new int[i_6_];
                                        for (int i_7_ = 0; (((((Class56) this).anIntArray750).length ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++)
                                            ((Class56) this).anIntArray750[i_7_] = class248_sub9.readInt(false);
                                        ((Class56) this).aByteArray761 = new byte[i_4_];
                                        for (int i_8_ = 0; i_4_ > i_8_; i_8_++)
                                            ((Class56) this).aByteArray761[i_8_] = class248_sub9.readByte(120);
                                    } else if ((i ^ 0xffffffff) == -17)
                                        ((Class56) this).aBoolean738 = false;
                                    else if ((i ^ 0xffffffff) != -18) {
                                        if ((i ^ 0xffffffff) == -19)
                                            anInt768 = class248_sub9.readShort(-1);
                                        else if (i == 19)
                                            ((Class56) this).anInt751 = class248_sub9.readShort(-1);
                                        else if (i != 20) {
                                            if (i == 21)
                                                ((Class56) this).anInt762 = class248_sub9.readInt(false);
                                            else if ((i ^ 0xffffffff) == -23)
                                                ((Class56) this).anInt746 = class248_sub9.readInt(false);
                                            else if ((i ^ 0xffffffff) == -24) {
                                                ((Class56) this).anInt783 = (class248_sub9.readUnsignedByte((byte) 80));
                                                ((Class56) this).anInt773 = (class248_sub9.readUnsignedByte((byte) 85));
                                                ((Class56) this).anInt766 = (class248_sub9.readUnsignedByte((byte) 84));
                                            } else if (i == 24) {
                                                ((Class56) this).anInt753 = (class248_sub9.readUnsignedShort((byte) -10));
                                                ((Class56) this).anInt774 = (class248_sub9.readUnsignedShort((byte) -10));
                                            } else if ((i ^ 0xffffffff) == -250) {
                                                int i_9_ = (class248_sub9.readUnsignedByte((byte) 108));
                                                if (aClass65_743 == null) {
                                                    int i_10_ = (Class136_Sub4.method1269(i_9_, (byte) -128));
                                                    aClass65_743 = new Class65(i_10_);
                                                }
                                                for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff)); i_11_++) {
                                                    boolean bool_12_ = ((class248_sub9.readUnsignedByte((byte) 94)) == 1);
                                                    int i_13_ = class248_sub9.method2221(255);
                                                    Node node;
                                                    if (bool_12_)
                                                        node = (new Node_Sub32(class248_sub9.readString(15598)));
                                                    else
                                                        node = (new Node_Sub37(class248_sub9.readInt(false)));
                                                    aClass65_743.method509(-1, node, (long) i_13_);
                                                }
                                            }
                                        } else {
                                            anInt759 = class248_sub9.readShort(-1);
                                            if ((anInt759 ^ 0xffffffff) == -65536)
                                                anInt759 = -1;
                                            anInt781 = class248_sub9.readShort(-1);
                                            if (anInt781 == 65535)
                                                anInt781 = -1;
                                            anInt782 = class248_sub9.readInt(false);
                                            anInt780 = class248_sub9.readInt(false);
                                        }
                                    } else
                                        ((Class56) this).aString785 = class248_sub9.readString(15598);
                                } else {
                                    anInt740 = class248_sub9.readShort(-1);
                                    if ((anInt740 ^ 0xffffffff) == -65536)
                                        anInt740 = -1;
                                    anInt760 = class248_sub9.readShort(-1);
                                    if ((anInt760 ^ 0xffffffff) == -65536)
                                        anInt760 = -1;
                                    anInt742 = class248_sub9.readInt(!bool);
                                    anInt765 = class248_sub9.readInt(!bool);
                                }
                            } else {
                                int i_14_ = class248_sub9.readUnsignedByte((byte) -116);
                                if ((i_14_ & 0x1) == 0)
                                    ((Class56) this).aBoolean767 = false;
                                if ((0x2 & i_14_) == 2)
                                    ((Class56) this).aBoolean771 = true;
                            }
                        } else
                            ((Class56) this).anInt763 = class248_sub9.readUnsignedByte((byte) -84);
                    } else
                        ((Class56) this).anInt779 = class248_sub9.method2221(255);
                } else
                    ((Class56) this).aString786 = class248_sub9.readString(15598);
            } else
                ((Class56) this).anInt757 = class248_sub9.readShort(-1);
        } else
            ((Class56) this).anInt744 = class248_sub9.readShort(-1);
        anInt776++;
    }

    final int method447(int i, int i_15_, int i_16_) {
        anInt772++;
        if (aClass65_743 == null)
            return i_15_;
        Node_Sub37 class248_sub37 = (Node_Sub37) aClass65_743.method501((long) i, (byte) 31);
        if (i_16_ != 18551)
            method443((byte) 111, null, null, 7);
        if (class248_sub37 == null)
            return i_15_;
        return ((Node_Sub37) class248_sub37).anInt7261;
    }

    final Class129 method448(boolean bool, ha var_ha) {
        anInt737++;
        Class129 class129 = ((Class129) (((Class257) ((Class56) this).aClass257_745).aClass278_2945.method2863(4, (long) (anInt768 | 0x20000 | ((ha) var_ha).anInt1418 << 1265135165))));
        if (bool != false)
            return null;
        if (class129 != null)
            return class129;
        ((Class257) ((Class56) this).aClass257_745).aClass381_2936.method3920(anInt768, 59);
        Class157 class157 = Class157.method1379((((Class257) ((Class56) this).aClass257_745).aClass381_2936), anInt768, 0);
        if (class157 != null) {
            class129 = var_ha.a(class157, true);
            ((Class257) ((Class56) this).aClass257_745).aClass278_2945.method2867((byte) 0, (long) (((ha) var_ha).anInt1418 << 2135018141 | (0x20000 | anInt768)), class129);
        }
        return class129;
    }

    final boolean method449(byte i, Interface3 interface3) {
        anInt777++;
        int i_17_;
        if (anInt760 != -1)
            i_17_ = interface3.method11(anInt760, (byte) 125);
        else if (anInt740 != -1)
            i_17_ = interface3.method10(anInt740, (byte) -116);
        else
            return true;
        if (anInt742 > i_17_ || (i_17_ ^ 0xffffffff) < (anInt765 ^ 0xffffffff))
            return false;
        if (i != -14)
            method443((byte) 100, null, null, 121);
        boolean bool = false;
        int i_18_;
        if (anInt781 == -1) {
            if (anInt759 != -1)
                i_18_ = interface3.method10(anInt759, (byte) -94);
            else
                return true;
        } else
            i_18_ = interface3.method11(anInt781, (byte) 87);
        if ((i_18_ ^ 0xffffffff) > (anInt782 ^ 0xffffffff) || (anInt780 ^ 0xffffffff) > (i_18_ ^ 0xffffffff))
            return false;
        return true;
    }

    final void method450(byte i, ByteStream class248_sub9) {
        for (; ; ) {
            int i_19_ = class248_sub9.readUnsignedByte((byte) 88);
            if (i_19_ == 0)
                break;
            method446(class248_sub9, true, i_19_);
        }
        if (i != 101)
            method451((byte) 16, null, null);
        anInt756++;
    }

    static final Class169 method451(byte i, ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class188[] class188s) {
        anInt747++;
        if (i != 37)
            aLong749 = -83L;
        for (int i_20_ = 0; i_20_ < class188s.length; i_20_++) {
            if (class188s[i_20_] == null || (((Class188) class188s[i_20_]).aLong2187 ^ 0xffffffffffffffffL) >= -1L)
                return null;
        }
        long l = OpenGL.glCreateProgramObjectARB();
        for (int i_21_ = 0; i_21_ < class188s.length; i_21_++)
            OpenGL.glAttachObjectARB(l, ((Class188) class188s[i_21_]).aLong2187);
        OpenGL.glLinkProgramARB(l);
        OpenGL.glGetObjectParameterivARB(l, 35714, Class346_Sub7_Sub1.anIntArray9913, 0);
        if ((Class346_Sub7_Sub1.anIntArray9913[0] ^ 0xffffffff) == -1) {
            if (Class346_Sub7_Sub1.anIntArray9913[0] == 0)
                System.out.println("Shader linking failed:");
            OpenGL.glGetObjectParameterivARB(l, 35716, Class346_Sub7_Sub1.anIntArray9913, 1);
            if (Class346_Sub7_Sub1.anIntArray9913[1] > 1) {
                byte[] is = new byte[Class346_Sub7_Sub1.anIntArray9913[1]];
                OpenGL.glGetInfoLogARB(l, Class346_Sub7_Sub1.anIntArray9913[1], Class346_Sub7_Sub1.anIntArray9913, 0, is, 0);
                System.out.println(new String(is));
            }
            if (Class346_Sub7_Sub1.anIntArray9913[0] == 0) {
                for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (class188s.length ^ 0xffffffff); i_22_++)
                    OpenGL.glDetachObjectARB(l, (((Class188) class188s[i_22_]).aLong2187));
                OpenGL.glDeleteObjectARB(l);
                return null;
            }
        }
        return new Class169(var_ha_Sub3_Sub1, l, class188s);
    }

    final Class129 method452(boolean bool, ha var_ha, byte i) {
        anInt755++;
        int i_23_ = !bool ? ((Class56) this).anInt744 : ((Class56) this).anInt757;
        int i_24_ = ((ha) var_ha).anInt1418 << -413122787 | i_23_;
        Class129 class129 = (Class129) ((Class257) ((Class56) this).aClass257_745).aClass278_2945.method2863(4, (long) i_24_);
        if (class129 != null)
            return class129;
        if (!((Class257) ((Class56) this).aClass257_745).aClass381_2936.method3920(i_23_, i + 26))
            return null;
        if (i != 72)
            return null;
        Class157 class157 = Class157.method1379((((Class257) ((Class56) this).aClass257_745).aClass381_2936), i_23_, 0);
        if (class157 != null) {
            class129 = var_ha.a(class157, true);
            ((Class257) ((Class56) this).aClass257_745).aClass278_2945.method2867((byte) 0, (long) i_24_, class129);
        }
        return class129;
    }

    public Class56() {
        ((Class56) this).aBoolean738 = true;
        anInt760 = -1;
        anInt759 = -1;
        ((Class56) this).anInt744 = -1;
        ((Class56) this).aBoolean767 = true;
        ((Class56) this).anInt757 = -1;
        ((Class56) this).anInt752 = -1;
        ((Class56) this).aStringArray775 = new String[5];
        anInt768 = -1;
        ((Class56) this).anInt763 = 0;
        ((Class56) this).anInt751 = -1;
        anInt781 = -1;
        ((Class56) this).anInt783 = -1;
        ((Class56) this).anInt773 = -1;
        ((Class56) this).aBoolean741 = true;
        ((Class56) this).anInt766 = -1;
        ((Class56) this).anInt770 = 2147483647;
        ((Class56) this).anInt778 = -2147483648;
        ((Class56) this).anInt769 = 2147483647;
        ((Class56) this).aBoolean771 = false;
    }
}
