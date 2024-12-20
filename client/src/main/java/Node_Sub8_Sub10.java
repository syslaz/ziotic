/* Class248_Sub8_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub10 extends Node_Sub8 {
    static int anInt8971;
    static int anInt8972;
    static int anInt8973;
    String aString8974;
    static int[] anIntArray8975 = new int[4];
    int anInt8976;
    static int anInt8977;
    static Class243 aClass243_8978;
    static Class293 aClass293_8979 = new Class293();
    static int anInt8980;
    int anInt8981;
    static double aDouble8982;
    int anInt8983;
    static int anInt8984;
    static int anInt8985;
    static int anInt8986;

    static final short[] method2075(short[] is, int i, byte i_0_) {
        if (i_0_ != 103)
            anIntArray8975 = null;
        anInt8980++;
        short[] is_1_ = new short[i];
        Class159.method1404(is, 0, is_1_, 0, i);
        return is_1_;
    }

    final void method2076(int i) {
        ((Node_Sub8) this).aLong6870 = (500L + Class118.method1112(116) | ~0x7fffffffffffffffL & ((Node_Sub8) this).aLong6870);
        anInt8985++;
        Class321.aClass64_3739.method491(this, -128);
        if (i >= -38)
            ((Node_Sub8_Sub10) this).anInt8981 = 125;
    }

    final int method2077(int i) {
        anInt8973++;
        if (i > -86)
            method2084(-42);
        return (int) (0xffL & ((Node) this).id >>> -736821408);
    }

    static final void method2078(boolean bool, byte[][][] is, int i, byte i_2_, int i_3_, int i_4_, boolean bool_5_) {
        int i_6_ = bool ? 1 : 0;
        Class133.anInt5038 = 0;
        Class67.anInt900 = 0;
        za.anInt7490++;
        if ((i_4_ & 0x2) == 0) {
            for (Interactable interactable = Class144.aInteractableArray1704[i_6_]; interactable != null; interactable = ((Interactable) interactable).aInteractable_8320) {
                if (!Class351.method3747(interactable, bool, is, i, i_2_)) {
                    Class225_Sub3.method1799(interactable);
                    if (((Interactable) interactable).anInt8316 != -1)
                        Node_Sub38.aInteractableArray7263[Class133.anInt5038++] = interactable;
                }
            }
        }
        if ((i_4_ & 0x1) == 0) {
            for (Interactable interactable = Node_Sub12.aInteractableArray6965[i_6_]; interactable != null; interactable = ((Interactable) interactable).aInteractable_8320) {
                if (!Class351.method3747(interactable, bool, is, i, i_2_)) {
                    Class225_Sub3.method1799(interactable);
                    if (((Interactable) interactable).anInt8316 != -1)
                        Class173.aInteractableArray2019[Class67.anInt900++] = interactable;
                }
            }
            for (Interactable interactable = Class273.aInteractableArray5007[i_6_]; interactable != null; interactable = ((Interactable) interactable).aInteractable_8320) {
                if (!Class351.method3747(interactable, bool, is, i, i_2_)) {
                    if (interactable.method3563(false)) {
                        Class225_Sub3.method1799(interactable);
                        if (((Interactable) interactable).anInt8316 != -1)
                            Class173.aInteractableArray2019[Class67.anInt900++] = interactable;
                    } else {
                        Class225_Sub3.method1799(interactable);
                        if (((Interactable) interactable).anInt8316 != -1)
                            Node_Sub38.aInteractableArray7263[Class133.anInt5038++] = interactable;
                    }
                }
            }
            if (!bool) {
                for (int i_7_ = 0; i_7_ < Node_Sub14_Sub36.anInt9552; i_7_++) {
                    if (!Class351.method3747((Class25.aAnimableArray345[i_7_]), bool, is, i, i_2_)) {
                        Class225_Sub3.method1799(Class25.aAnimableArray345[i_7_]);
                        if ((((Interactable) Class25.aAnimableArray345[i_7_]).anInt8316) != -1) {
                            if (Class25.aAnimableArray345[i_7_].method3563(false))
                                Class173.aInteractableArray2019[Class67.anInt900++] = (Class25.aAnimableArray345[i_7_]);
                            else
                                Node_Sub38.aInteractableArray7263[Class133.anInt5038++] = (Class25.aAnimableArray345[i_7_]);
                        }
                    }
                }
            }
        }
        if (Class133.anInt5038 > 0) {
            Class301_Sub1.method3190(Node_Sub38.aInteractableArray7263, 0, Class133.anInt5038 - 1);
            for (int i_8_ = 0; i_8_ < Class133.anInt5038; i_8_++)
                Node_Sub13.method2262((Node_Sub38.aInteractableArray7263[i_8_]), true, bool_5_);
        }
        if (Node_Sub19.aBoolean7030)
            r.aHa9032.a(0, null);
        if ((i_4_ & 0x2) == 0) {
            for (int i_9_ = Class118.anInt1482; i_9_ < Class111_Sub1.anInt5531; i_9_++) {
                if (i_9_ >= i && is != null) {
                    int i_10_ = RSInterface2.aBooleanArrayArray4314.length;
                    if ((Node_Sub14.anInt6982 + RSInterface2.aBooleanArrayArray4314.length) > Class225_Sub1.anInt8454)
                        i_10_ -= (Node_Sub14.anInt6982 + RSInterface2.aBooleanArrayArray4314.length - Class225_Sub1.anInt8454);
                    int i_11_ = RSInterface2.aBooleanArrayArray4314[0].length;
                    if ((Animable.anInt9925 + RSInterface2.aBooleanArrayArray4314[0].length) > Class89.anInt1106)
                        i_11_ -= (Animable.anInt9925 + RSInterface2.aBooleanArrayArray4314[0].length - Class89.anInt1106);
                    boolean[][] bools = Class112.aBooleanArrayArray5202;
                    if (Node_Sub8_Sub20.aBoolean9094) {
                        if (Class252.aBoolean2841)
                            bools = (Class84_Sub7.aBooleanArrayArrayArray5461[i_9_]);
                        for (int i_12_ = Class367.anInt4513; i_12_ < i_10_; i_12_++) {
                            int i_13_ = (i_12_ + Node_Sub14.anInt6982 - Class367.anInt4513);
                            for (int i_14_ = Node_Sub14_Sub37.anInt9555; i_14_ < i_11_; i_14_++) {
                                bools[i_12_][i_14_] = false;
                                if (RSInterface2.aBooleanArrayArray4314[i_12_][i_14_]) {
                                    int i_15_ = (i_14_ + Animable.anInt9925 - Node_Sub14_Sub37.anInt9555);
                                    for (int i_16_ = i_9_; i_16_ >= 0; i_16_--) {
                                        if ((Class311.aClass137ArrayArrayArray3620[i_16_][i_13_][i_15_]) != null && (((Class137) (Class311.aClass137ArrayArrayArray3620[i_16_][i_13_][i_15_])).aByte1637) == i_9_) {
                                            if (i_16_ >= i && (is[i_16_][i_13_][i_15_]) == i_2_ || (Class249.method2696((byte) -126, i_9_, i_13_, i_15_)))
                                                bools[i_12_][i_14_] = false;
                                            else
                                                bools[i_12_][i_14_] = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (Class252.aBoolean2841) {
                        if (i_3_ >= 0)
                            Class177.aSArray2070[i_9_].method3144(0, 0, 0, null, false, i_3_, i_4_);
                        else
                            Class177.aSArray2070[i_9_].method3149(0, 0, 0, null, false, i_4_);
                        for (int i_17_ = 0; i_17_ < Node_Sub3.anInt6830; i_17_++)
                            Class345.aClass344Array4093[i_17_].method3513(-1, new Class346_Sub4(i_9_ + 1));
                    } else if (i_3_ >= 0)
                        Class177.aSArray2070[i_9_].method3144(Class286.anInt3375, Class152.anInt1808, Node_Sub47.anInt7416, Class112.aBooleanArrayArray5202, false, i_3_, i_4_);
                    else
                        Class177.aSArray2070[i_9_].method3149(Class286.anInt3375, Class152.anInt1808, Node_Sub47.anInt7416, Class112.aBooleanArrayArray5202, false, i_4_);
                } else {
                    int i_18_ = RSInterface2.aBooleanArrayArray4314.length;
                    if ((Node_Sub14.anInt6982 + RSInterface2.aBooleanArrayArray4314.length) > Class225_Sub1.anInt8454)
                        i_18_ -= (Node_Sub14.anInt6982 + RSInterface2.aBooleanArrayArray4314.length - Class225_Sub1.anInt8454);
                    int i_19_ = RSInterface2.aBooleanArrayArray4314[0].length;
                    if ((Animable.anInt9925 + RSInterface2.aBooleanArrayArray4314[0].length) > Class89.anInt1106)
                        i_19_ -= (Animable.anInt9925 + RSInterface2.aBooleanArrayArray4314[0].length - Class89.anInt1106);
                    boolean[][] bools = Class112.aBooleanArrayArray5202;
                    if (Node_Sub8_Sub20.aBoolean9094) {
                        if (Class252.aBoolean2841)
                            bools = (Class84_Sub7.aBooleanArrayArrayArray5461[i_9_]);
                        for (int i_20_ = Class367.anInt4513; i_20_ < i_18_; i_20_++) {
                            int i_21_ = (i_20_ + Node_Sub14.anInt6982 - Class367.anInt4513);
                            for (int i_22_ = Node_Sub14_Sub37.anInt9555; i_22_ < i_19_; i_22_++) {
                                if ((RSInterface2.aBooleanArrayArray4314[i_20_][i_22_]) && !(Class249.method2696((byte) -120, i_9_, i_21_, (i_22_ + Animable.anInt9925 - Node_Sub14_Sub37.anInt9555))))
                                    bools[i_20_][i_22_] = true;
                                else
                                    bools[i_20_][i_22_] = false;
                            }
                        }
                    }
                    if (Class252.aBoolean2841) {
                        if (i_3_ >= 0)
                            Class177.aSArray2070[i_9_].method3144(0, 0, 0, null, false, i_3_, i_4_);
                        else
                            Class177.aSArray2070[i_9_].method3149(0, 0, 0, null, false, i_4_);
                        for (int i_23_ = 0; i_23_ < Node_Sub3.anInt6830; i_23_++)
                            Class345.aClass344Array4093[i_23_].method3513(-1, new Class346_Sub4(i_9_ + 1));
                    } else if (i_3_ >= 0)
                        Class177.aSArray2070[i_9_].method3144(Class286.anInt3375, Class152.anInt1808, Node_Sub47.anInt7416, Class112.aBooleanArrayArray5202, true, i_3_, i_4_);
                    else
                        Class177.aSArray2070[i_9_].method3149(Class286.anInt3375, Class152.anInt1808, Node_Sub47.anInt7416, Class112.aBooleanArrayArray5202, true, i_4_);
                }
            }
        }
        if (Class67.anInt900 > 0) {
            Node_Sub8_Sub18.method2143(Class173.aInteractableArray2019, 0, Class67.anInt900 - 1);
            for (int i_24_ = 0; i_24_ < Class67.anInt900; i_24_++)
                Node_Sub13.method2262((Class173.aInteractableArray2019[i_24_]), true, bool_5_);
        }
    }

    public static void method2079(int i) {
        aClass293_8979 = null;
        aClass243_8978 = null;
        anIntArray8975 = null;
        if (i != 71)
            method2078(false, null, 15, (byte) 87, 76, 54, true);
    }

    static final void method2080(int i) {
        if (i <= -45) {
            if ((Class174.aString2046.toLowerCase().indexOf("microsoft") ^ 0xffffffff) == 0) {
                Class282_Sub27.anIntArray7877[59] = 57;
                if (Class174.aMethod2029 == null) {
                    Class282_Sub27.anIntArray7877[222] = 59;
                    Class282_Sub27.anIntArray7877[192] = 58;
                } else {
                    Class282_Sub27.anIntArray7877[192] = 28;
                    Class282_Sub27.anIntArray7877[520] = 59;
                    Class282_Sub27.anIntArray7877[222] = 58;
                }
                Class282_Sub27.anIntArray7877[92] = 74;
                Class282_Sub27.anIntArray7877[61] = 27;
                Class282_Sub27.anIntArray7877[45] = 26;
                Class282_Sub27.anIntArray7877[91] = 42;
                Class282_Sub27.anIntArray7877[47] = 73;
                Class282_Sub27.anIntArray7877[93] = 43;
                Class282_Sub27.anIntArray7877[44] = 71;
                Class282_Sub27.anIntArray7877[46] = 72;
            } else {
                Class282_Sub27.anIntArray7877[190] = 72;
                Class282_Sub27.anIntArray7877[187] = 27;
                Class282_Sub27.anIntArray7877[223] = 28;
                Class282_Sub27.anIntArray7877[221] = 43;
                Class282_Sub27.anIntArray7877[186] = 57;
                Class282_Sub27.anIntArray7877[191] = 73;
                Class282_Sub27.anIntArray7877[192] = 58;
                Class282_Sub27.anIntArray7877[189] = 26;
                Class282_Sub27.anIntArray7877[220] = 74;
                Class282_Sub27.anIntArray7877[188] = 71;
                Class282_Sub27.anIntArray7877[222] = 59;
                Class282_Sub27.anIntArray7877[219] = 42;
            }
            anInt8972++;
        }
    }

    static final boolean method2081(int i, byte i_25_) {
        if (i_25_ != 99)
            aClass293_8979 = null;
        anInt8984++;
        if (i != 48 && i != 25 && i != 1003 && i != 17 && i != 30)
            return false;
        return true;
    }

    final long method2082(boolean bool) {
        if (bool != true)
            ((Node_Sub8_Sub10) this).anInt8976 = -56;
        anInt8971++;
        return 0x7fffffffffffffffL & ((Node_Sub8) this).aLong6870;
    }

    final int method2083(byte i) {
        anInt8986++;
        if (i != 81)
            method2076(17);
        return (int) ((Node) this).id;
    }

    final void method2084(int i) {
        ((Node_Sub8) this).aLong6870 |= ~0x7fffffffffffffffL;
        if (i == 614) {
            anInt8977++;
            if (method2082(true) == 0L)
                Class241.aClass64_2691.method491(this, -126);
        }
    }

    Node_Sub8_Sub10(int i, int i_26_) {
        ((Node) this).id = (long) i << -2106084256 | (long) i_26_;
    }
}
