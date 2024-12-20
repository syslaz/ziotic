/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class347 {
    static char[] aCharArray4127 = {' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df'};
    static int anInt4128;
    static int anInt4129;
    private int anInt4130 = 0;
    static Class276[] aClass276Array4131;
    private Class223 aClass223_4132;
    private int anInt4133;
    private Class223 aClass223_4134;
    private boolean aBoolean4135;
    static int anInt4136;
    private int anInt4137 = 1;
    static int anInt4138;
    static int anInt4139;
    private ha_Sub2 aHa_Sub2_4140;
    static int anInt4141;
    static int anInt4142;
    private Class223 aClass223_4143;
    static Class278 aClass278_4144 = new Class278(8);
    static int anInt4145;
    static int anInt4146;
    static int anInt4147;
    private Class293 aClass293_4148;
    private int anInt4149;
    static Player myPlayer;
    private boolean aBoolean4151;
    private int anInt4152;
    private boolean aBoolean4153;
    private boolean aBoolean4154;
    private Node_Sub8_Sub4 aClass248_Sub8_Sub4_4155;
    private Node_Sub8_Sub4 aClass248_Sub8_Sub4_4156;
    private int anInt4157;
    private boolean aBoolean4158;
    private boolean aBoolean4159;
    private Class136_Sub4[] aClass136_Sub4Array4160;
    private Class136_Sub4 aClass136_Sub4_4161;

    static final void method3723(long[] ls, Object[] objects, boolean bool) {
        aa.method151(objects, 0, ls, ls.length + -1, (byte) -115);
        if (bool != false)
            myPlayer = null;
        anInt4146++;
    }

    final boolean method3724(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt4142++;
        if (i_2_ != 26185)
            method3730(true);
        if (aClass223_4143 == null || aClass293_4148.method3115(false))
            return false;
        if ((anInt4133 ^ 0xffffffff) != (i_3_ ^ 0xffffffff) || i != anInt4137) {
            anInt4133 = i_3_;
            anInt4137 = i;
            for (Node node = aClass293_4148.method3119(2); node != ((Class293) aClass293_4148).aNode_3434; node = ((Node) node).prev)
                ((Node_Sub11) node).method2250(anInt4137, anInt4133, 2048);
            aBoolean4158 = true;
            aBoolean4151 = true;
            aBoolean4153 = true;
        }
        if (method3725((byte) -114)) {
            aBoolean4135 = true;
            anInt4149 = i_1_;
            anInt4130 = i_0_;
            aHa_Sub2_4140.method873(aClass223_4143, i_2_ + -26185);
            aClass223_4143.method1784(0, false);
            aHa_Sub2_4140.method850((byte) -32, -anInt4130, (anInt4137 - -anInt4149 - ((ha_Sub2) aHa_Sub2_4140).anInt5597));
            return true;
        }
        return false;
    }

    private final boolean method3725(byte i) {
        anInt4128++;
        if (aBoolean4158) {
            if (aClass248_Sub8_Sub4_4156 != null) {
                aClass248_Sub8_Sub4_4156.method2047(i ^ ~0x31);
                aClass248_Sub8_Sub4_4156 = null;
            }
            if (aClass136_Sub4_4161 != null) {
                aClass136_Sub4_4161.method1249(125);
                aClass136_Sub4_4161 = null;
            }
            if (aClass223_4134 != null)
                aClass248_Sub8_Sub4_4156 = new Node_Sub8_Sub4(aHa_Sub2_4140, 6402, anInt4133, anInt4137, (((ha_Sub2) aHa_Sub2_4140).anInt5777));
            if (!aBoolean4159) {
                if (aClass248_Sub8_Sub4_4156 == null)
                    aClass248_Sub8_Sub4_4156 = new Node_Sub8_Sub4(aHa_Sub2_4140, 6402, anInt4133, anInt4137);
            } else
                aClass136_Sub4_4161 = new Class136_Sub4(aHa_Sub2_4140, 34037, 6402, anInt4133, anInt4137);
            aBoolean4158 = false;
            aBoolean4154 = true;
            aBoolean4151 = true;
        }
        if (aBoolean4153) {
            if (aClass248_Sub8_Sub4_4155 != null) {
                aClass248_Sub8_Sub4_4155.method2047(i + 225);
                aClass248_Sub8_Sub4_4155 = null;
            }
            if (aClass136_Sub4Array4160[0] != null) {
                aClass136_Sub4Array4160[0].method1249(106);
                aClass136_Sub4Array4160[0] = null;
            }
            if (aClass136_Sub4Array4160[1] != null) {
                aClass136_Sub4Array4160[1].method1249(97);
                aClass136_Sub4Array4160[1] = null;
            }
            if (aClass223_4134 != null)
                aClass248_Sub8_Sub4_4155 = new Node_Sub8_Sub4(aHa_Sub2_4140, anInt4157, anInt4133, anInt4137, (((ha_Sub2) aHa_Sub2_4140).anInt5777));
            aClass136_Sub4Array4160[0] = new Class136_Sub4(aHa_Sub2_4140, 34037, anInt4157, anInt4133, anInt4137);
            aClass136_Sub4Array4160[1] = anInt4152 > 1 ? new Class136_Sub4(aHa_Sub2_4140, 34037, anInt4157, anInt4133, anInt4137) : null;
            aBoolean4153 = false;
            aBoolean4151 = true;
            aBoolean4154 = true;
        }
        if (i != -114)
            anInt4137 = 123;
        if (aBoolean4151) {
            if (aClass223_4134 != null) {
                aHa_Sub2_4140.method873(aClass223_4132, i ^ ~0x71);
                aClass223_4132.method1783(1, 0);
                aClass223_4132.method1783(1, 1);
                aClass223_4132.method1783(i + 115, 8);
                aClass223_4132.method1778(-22433, 0, aClass136_Sub4Array4160[0]);
                if ((anInt4152 ^ 0xffffffff) < -2)
                    aClass223_4132.method1778(-22433, 1, aClass136_Sub4Array4160[1]);
                if (aBoolean4159)
                    aClass223_4132.method1778(-22433, 8, aClass136_Sub4_4161);
                aHa_Sub2_4140.method887(aClass223_4132, -106);
                aHa_Sub2_4140.method873(aClass223_4134, 0);
                aClass223_4134.method1783(1, 0);
                aClass223_4134.method1783(1, 8);
                aClass223_4134.method1777(aClass248_Sub8_Sub4_4155, 15061, 0);
                aClass223_4134.method1777(aClass248_Sub8_Sub4_4156, 15061, 8);
                aHa_Sub2_4140.method887(aClass223_4134, 21);
            } else {
                aHa_Sub2_4140.method873(aClass223_4132, i + 114);
                aClass223_4132.method1783(1, 0);
                aClass223_4132.method1783(1, 1);
                aClass223_4132.method1783(1, 8);
                aClass223_4132.method1778(-22433, 0, aClass136_Sub4Array4160[0]);
                if (anInt4152 > 1)
                    aClass223_4132.method1778(-22433, 1, aClass136_Sub4Array4160[1]);
                if (aBoolean4159)
                    aClass223_4132.method1778(-22433, 8, aClass136_Sub4_4161);
                else
                    aClass223_4132.method1777(aClass248_Sub8_Sub4_4156, 15061, 8);
                aHa_Sub2_4140.method887(aClass223_4132, -111);
            }
            aBoolean4154 = true;
            aBoolean4151 = false;
        }
        if (aBoolean4154) {
            aHa_Sub2_4140.method873(aClass223_4143, 0);
            aBoolean4154 = !aClass223_4143.method1770(i ^ ~0x23);
            aHa_Sub2_4140.method887(aClass223_4143, -123);
        }
        if (aBoolean4154)
            return false;
        return true;
    }

    final void method3726(int i) {
        anInt4139++;
        if (aBoolean4135) {
            if (aClass223_4134 != null) {
                aHa_Sub2_4140.method883(20133, aClass223_4134);
                int i_4_ = 16384;
                aHa_Sub2_4140.method865(aClass223_4132, 14908);
                aClass223_4134.method1775(0, 39);
                aClass223_4132.method1784(0, false);
                if (aBoolean4159)
                    i_4_ |= 0x100;
                OpenGL.glBlitFramebufferEXT(0, 0, anInt4133, anInt4137, 0, 0, anInt4133, anInt4137, i_4_, 9728);
                aHa_Sub2_4140.method860(aClass223_4134, -90);
                aHa_Sub2_4140.method906(aClass223_4132, 125);
            }
            aHa_Sub2_4140.method864(118);
            aHa_Sub2_4140.method885(0, 0);
            aHa_Sub2_4140.method881((byte) 125, 1);
            aHa_Sub2_4140.la();
            if (i > -8)
                aBoolean4135 = false;
            int i_5_ = 0;
            int i_6_ = 1;
            Node_Sub11 class248_sub11;
            for (Node_Sub11 class248_sub11_7_ = (Node_Sub11) aClass293_4148.method3119(2); class248_sub11_7_ != null; class248_sub11_7_ = class248_sub11) {
                class248_sub11 = (Node_Sub11) aClass293_4148.method3107(-128);
                int i_8_ = class248_sub11_7_.method2248(-11);
                for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff); i_9_++) {
                    class248_sub11_7_.method2241(aClass136_Sub4Array4160[i_5_], aClass136_Sub4_4161, -12103, i_9_);
                    if (class248_sub11 != null || i_9_ != i_8_ - 1) {
                        aClass223_4132.method1784(i_6_, false);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float) anInt4137);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(0, anInt4137);
                        OpenGL.glTexCoord2f((float) anInt4133, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(anInt4133, anInt4137);
                        OpenGL.glTexCoord2f((float) anInt4133, (float) anInt4137);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(anInt4133, 0);
                        OpenGL.glEnd();
                    } else {
                        aHa_Sub2_4140.method887(aClass223_4132, -104);
                        aHa_Sub2_4140.method850((byte) -32, 0, 0);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float) anInt4137);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(anInt4130, anInt4149);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(anInt4130, anInt4137 + anInt4149);
                        OpenGL.glTexCoord2f((float) anInt4133, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(anInt4130 + anInt4133, anInt4137 + anInt4149);
                        OpenGL.glTexCoord2f((float) anInt4133, (float) anInt4137);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(anInt4130 + anInt4133, anInt4149);
                        OpenGL.glEnd();
                    }
                    class248_sub11_7_.method2249(i_9_, true);
                    i_5_ = 1 + i_5_ & 0x1;
                    i_6_ = i_6_ + 1 & 0x1;
                }
            }
            aBoolean4135 = false;
        }
    }

    static final boolean method3727(int i, byte i_10_, int i_11_) {
        anInt4145++;
        if (i_10_ != -111)
            method3727(-39, (byte) 42, -2);
        if ((i ^ 0xffffffff) == -12)
            i = 10;
        ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -59, i_11_);
        if (i >= 5 && i <= 8)
            i = 4;
        return class266.method2788((byte) 85, i);
    }

    public static void method3728(int i) {
        aCharArray4127 = null;
        myPlayer = null;
        if (i == 209) {
            aClass278_4144 = null;
            aClass276Array4131 = null;
        }
    }

    final boolean method3729(byte i) {
        if (i != -127)
            method3731(false, null);
        anInt4141++;
        if (aClass223_4143 == null)
            return false;
        return true;
    }

    private final void method3730(boolean bool) {
        anInt4147++;
        boolean bool_12_ = bool;
        int i = 0;
        int i_13_ = 0;
        for (Node_Sub11 class248_sub11 = (Node_Sub11) aClass293_4148.method3119(2); class248_sub11 != null; class248_sub11 = (Node_Sub11) aClass293_4148.method3107(-128)) {
            int i_14_ = class248_sub11.method2246((byte) 30);
            if (i < i_14_)
                i = i_14_;
            i_13_ += class248_sub11.method2248(127);
            bool_12_ |= class248_sub11.method2239(0);
        }
        int i_15_;
        if ((i ^ 0xffffffff) != -3) {
            if (i == 1)
                i_15_ = 34842;
            else
                i_15_ = 6408;
        } else
            i_15_ = 34836;
        if (i_15_ != anInt4157) {
            anInt4157 = i_15_;
            aBoolean4153 = true;
        }
        int i_16_ = anInt4152 > 2 ? 2 : anInt4152;
        int i_17_ = (i_13_ ^ 0xffffffff) < -3 ? 2 : i_13_;
        if ((i_17_ ^ 0xffffffff) != (i_16_ ^ 0xffffffff))
            aBoolean4151 = aBoolean4153 = true;
        anInt4152 = i_13_;
        if (bool_12_ != aBoolean4159) {
            aBoolean4158 = true;
            aBoolean4159 = bool_12_;
        }
    }

    final void method3731(boolean bool, Node_Sub11 class248_sub11) {
        ((Node_Sub11) class248_sub11).aBoolean6949 = false;
        anInt4138++;
        class248_sub11.method2245(false);
        class248_sub11.remove(bool);
        method3730(false);
    }

    final boolean method3732(byte i, Node_Sub11 class248_sub11) {
        anInt4136++;
        if (aClass223_4143 != null) {
            if (class248_sub11.method2242(true) || class248_sub11.method2240(1)) {
                aClass293_4148.method3109(class248_sub11, -127);
                method3730(false);
                if (method3725((byte) -114)) {
                    if ((anInt4133 ^ 0xffffffff) != 0 && anInt4137 != -1)
                        class248_sub11.method2250(anInt4137, anInt4133, 2048);
                    ((Node_Sub11) class248_sub11).aBoolean6949 = true;
                    return true;
                }
            }
            method3731(true, class248_sub11);
        }
        if (i <= 64)
            return false;
        return false;
    }

    final void method3733(int i) {
        aClass248_Sub8_Sub4_4155 = null;
        aClass248_Sub8_Sub4_4156 = null;
        aClass136_Sub4Array4160 = null;
        aClass223_4143 = aClass223_4134 = aClass223_4132 = null;
        anInt4129++;
        aClass136_Sub4_4161 = null;
        if (!aClass293_4148.method3115(false)) {
            for (Node node = aClass293_4148.method3119(2); node != ((Class293) aClass293_4148).aNode_3434; node = ((Node) node).prev)
                ((Node_Sub11) node).method2245(false);
        }
        if (i != 235)
            method3732((byte) 74, null);
        anInt4133 = anInt4137 = 1;
    }

    Class347(ha_Sub2 var_ha_Sub2) {
        anInt4133 = 1;
        anInt4149 = 0;
        aClass293_4148 = new Class293();
        aBoolean4151 = true;
        aBoolean4154 = true;
        anInt4152 = 0;
        anInt4157 = -1;
        aBoolean4158 = true;
        aBoolean4159 = false;
        aBoolean4153 = true;
        aClass136_Sub4Array4160 = new Class136_Sub4[2];
        aHa_Sub2_4140 = var_ha_Sub2;
        if (((ha_Sub2) aHa_Sub2_4140).aBoolean5836 && ((ha_Sub2) aHa_Sub2_4140).aBoolean5837) {
            aClass223_4143 = aClass223_4132 = new Class223(aHa_Sub2_4140);
            if ((((ha_Sub2) aHa_Sub2_4140).anInt5777 ^ 0xffffffff) < -2 && ((ha_Sub2) aHa_Sub2_4140).aBoolean5852 && ((ha_Sub2) aHa_Sub2_4140).aBoolean5915)
                aClass223_4143 = aClass223_4134 = new Class223(aHa_Sub2_4140);
        }
    }
}
