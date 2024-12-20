/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class150 {
    static int anInt1751;
    private byte aByte1752;
    private Class162 aClass162_1753;
    int anInt1754;
    int anInt1755;
    private boolean aBoolean1756;
    static int anInt1757;
    static int[] anIntArray1758 = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    private boolean aBoolean1759;
    private int anInt1760 = -1;
    private int anInt1761;
    private int anInt1762;
    private byte aByte1763;
    static int anInt1764;
    static int anInt1765;
    static int anInt1766;
    private Interactable aInteractable_1767;
    private r aR1768;
    private int anInt1769;
    private int anInt1770 = 0;
    private Class182 aClass182_1771;
    static int anInt1772;
    Class346_Sub8 aClass346_Sub8_1773;
    static int anInt1774;
    static int anInt1775;
    static int anInt1776;
    static int anInt1777;
    private int anInt1778;
    private int anInt1779;
    static int anInt1780;
    private int anInt1781;
    static int anInt1782;
    static int anInt1783;
    static int anInt1784;
    private int anInt1785;
    private boolean aBoolean1786;
    int anInt1787;
    static int anInt1788;
    private boolean[] aBooleanArray1789;
    private Class21 aClass21_1790;

    final void method1335(ha var_ha, int i) {
        anInt1776++;
        if (aR1768 != null) {
            Class334.method3417(aR1768, aByte1763, (((Interactable) aInteractable_1767).x), (((Interactable) aInteractable_1767).y), aBooleanArray1789);
            aBooleanArray1789 = null;
            aR1768 = null;
        }
        if (i != 20087)
            anInt1760 = -26;
    }

    public static void method1336(int i) {
        anIntArray1758 = null;
        if (i > -25)
            method1345(65, null);
    }

    final int method1337(int i) {
        if (i != -1)
            method1337(126);
        anInt1784++;
        return anInt1778;
    }

    final boolean method1338(byte i) {
        anInt1777++;
        if (i > -126)
            return true;
        return aBoolean1786;
    }

    final Class162 method1339(ha var_ha, boolean bool, int i, int i_0_, boolean bool_1_) {
        anInt1782++;
        ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -66, ((Class150) this).anInt1754);
        if (((ObjectDefinition) class266).anIntArray3049 != null)
            class266 = class266.method2797(Node_Sub43.aClass291_7306, 124);
        if (class266 == null) {
            method1335(var_ha, i_0_ ^ ~0x1dff);
            anInt1762 = -1;
            anInt1760 = -1;
            anInt1785 = -1;
            return null;
        }
        if (!aBoolean1756 && anInt1762 != ((ObjectDefinition) class266).anInt3043) {
            aClass162_1753 = null;
            method1343((byte) -46, -1);
        }
        method1348((byte) 110, aInteractable_1767);
        if (bool) {
            bool = bool & (aBoolean1786 & ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342.method2976(true) != 0);
            bool = bool & (((ObjectDefinition) class266).anInt3043 != anInt1785 || (aClass182_1771 != null && (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342.method2976(true) >= 2) && ((anInt1779 ^ 0xffffffff) != (anInt1760 ^ 0xffffffff) || ((((Class182) aClass182_1771).aBoolean2127 || Node_Sub8_Sub2.aBoolean8918) && anInt1769 != anInt1779))));
        }
        if (bool_1_ && !bool) {
            anInt1762 = ((ObjectDefinition) class266).anInt3043;
            return null;
        }
        if (bool) {
            Class334.method3417(aR1768, aByte1763, (((Interactable) aInteractable_1767).x), (((Interactable) aInteractable_1767).y), aBooleanArray1789);
            anInt1785 = -1;
            anInt1760 = -1;
        }
        s var_s = Class177.aSArray2070[aByte1763];
        if (i_0_ != -21385)
            anInt1761 = -90;
        s var_s_2_;
        if (aBoolean1759)
            var_s_2_ = Node_Sub14_Sub29.aSArray9471[0];
        else
            var_s_2_ = aByte1763 < 3 ? Class177.aSArray2070[aByte1763 + 1] : null;
        Class162 class162 = null;
        if (aClass182_1771 != null) {
            if (bool)
                i |= 0x40000;
            class162 = (class266.method2786((((Class150) this).anInt1755 != 11 ? ((Class150) this).anInt1787 : 4 + ((Class150) this).anInt1787), anInt1779, aClass21_1790, ((Interactable) aInteractable_1767).x, (((Class150) this).anInt1755 == 11 ? 10 : ((Class150) this).anInt1755), anInt1781, var_s_2_, var_s.method3150((byte) 109, (((Interactable) aInteractable_1767).x), (((Interactable) aInteractable_1767).y)), ((Interactable) aInteractable_1767).y, -1, aClass182_1771, var_s, anInt1769, var_ha, i));
            if (class162 != null) {
                if (bool) {
                    if (aBooleanArray1789 == null)
                        aBooleanArray1789 = new boolean[4];
                    aR1768 = class162.ba(aR1768);
                    Class340_Sub6.method3460(aR1768, aByte1763, ((Interactable) aInteractable_1767).x, ((Interactable) aInteractable_1767).y, aBooleanArray1789);
                    anInt1785 = ((ObjectDefinition) class266).anInt3043;
                    anInt1760 = anInt1779;
                }
                anInt1770 = class162.fa();
                anInt1778 = class162.ma();
            } else {
                aR1768 = null;
                anInt1770 = 0;
                anInt1778 = 0;
                aBooleanArray1789 = null;
            }
            aClass162_1753 = null;
        } else if (aClass162_1753 != null && i == (i & aClass162_1753.ua()) && anInt1762 == ((ObjectDefinition) class266).anInt3043)
            class162 = aClass162_1753;
        else {
            if (aClass162_1753 != null)
                i |= aClass162_1753.ua();
            Class101 class101 = (class266.method2785((((Class150) this).anInt1755 != 11 ? ((Class150) this).anInt1787 : 4 - -((Class150) this).anInt1787), bool, aClass21_1790, i, var_s.method3150((byte) 123, (((Interactable) aInteractable_1767).x), (((Interactable) aInteractable_1767).y)), var_ha, (byte) -128, ((Interactable) aInteractable_1767).y, (((Class150) this).anInt1755 != 11 ? ((Class150) this).anInt1755 : 10), ((Interactable) aInteractable_1767).x, var_s, var_s_2_));
            if (class101 == null) {
                aClass162_1753 = null;
                anInt1778 = 0;
                anInt1770 = 0;
                aBooleanArray1789 = null;
                aR1768 = null;
            } else {
                aClass162_1753 = class162 = ((Class101) class101).aClass162_1283;
                if (bool) {
                    aR1768 = ((Class101) class101).aR1289;
                    aBooleanArray1789 = null;
                    Class340_Sub6.method3460(aR1768, aByte1763, ((Interactable) aInteractable_1767).x, ((Interactable) aInteractable_1767).y, null);
                    anInt1785 = ((ObjectDefinition) class266).anInt3043;
                    anInt1760 = -1;
                }
                anInt1770 = class162.fa();
                anInt1778 = class162.ma();
            }
        }
        anInt1762 = ((ObjectDefinition) class266).anInt3043;
        return class162;
    }

    static final String method1340(int i, boolean bool, int i_3_) {
        anInt1775++;
        if (bool != false)
            return null;
        int i_4_ = i + -i_3_;
        if ((i_4_ ^ 0xffffffff) > 8)
            return "<col=ff0000>";
        if ((i_4_ ^ 0xffffffff) > 5)
            return "<col=ff3000>";
        if (i_4_ < -3)
            return "<col=ff7000>";
        if (i_4_ < 0)
            return "<col=ffb000>";
        if (i_4_ > 9)
            return "<col=00ff00>";
        if (i_4_ > 6)
            return "<col=40ff00>";
        if (i_4_ > 3)
            return "<col=80ff00>";
        if ((i_4_ ^ 0xffffffff) < -1)
            return "<col=c0ff00>";
        return "<col=ffff00>";
    }

    final int method1341(int i) {
        anInt1764++;
        if (i != 1)
            return 6;
        return anInt1770;
    }

    final void method1342(byte i, int i_5_) {
        aBoolean1756 = true;
        int i_6_ = 48 % ((32 - i) / 38);
        anInt1783++;
        method1343((byte) -46, i_5_);
    }

    private final void method1343(byte i, int i_7_) {
        anInt1774++;
        if (i != -46)
            anInt1770 = -16;
        int i_8_ = i_7_;
        boolean bool = false;
        if ((i_8_ ^ 0xffffffff) == 0) {
            ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -39, ((Class150) this).anInt1754);
            ObjectDefinition class266_9_ = class266;
            if (((ObjectDefinition) class266).anIntArray3049 != null)
                class266 = class266.method2797(Node_Sub43.aClass291_7306, i + 169);
            if (class266 == null)
                return;
            if (class266_9_ == class266)
                class266_9_ = null;
            if (((ObjectDefinition) class266).anIntArray3096 == null) {
                if (((ObjectDefinition) class266).anInt3023 == -1) {
                    if (class266_9_ != null && ((ObjectDefinition) class266_9_).anIntArray3096 != null) {
                        if (aClass182_1771 != null && class266_9_.method2800((((Class182) aClass182_1771).anInt2120), (byte) 28))
                            return;
                        i_8_ = class266_9_.method2798(false);
                        if ((((ObjectDefinition) class266_9_).anInt3043 ^ 0xffffffff) != (anInt1762 ^ 0xffffffff))
                            bool = ((ObjectDefinition) class266_9_).aBoolean3039;
                    } else if (class266_9_ != null && (((ObjectDefinition) class266_9_).anInt3023 ^ 0xffffffff) != 0 && (anInt1762 != ((ObjectDefinition) class266_9_).anInt3043)) {
                        bool = ((ObjectDefinition) class266_9_).aBoolean3039;
                        i_8_ = ((ObjectDefinition) class266_9_).anInt3023;
                    }
                } else if ((anInt1762 ^ 0xffffffff) != (((ObjectDefinition) class266).anInt3043 ^ 0xffffffff)) {
                    bool = ((ObjectDefinition) class266).aBoolean3039;
                    i_8_ = ((ObjectDefinition) class266).anInt3023;
                }
            } else {
                if (aClass182_1771 != null && class266.method2800((((Class182) aClass182_1771).anInt2120), (byte) 28))
                    return;
                i_8_ = class266.method2798(false);
                if ((((ObjectDefinition) class266).anInt3043 ^ 0xffffffff) != (anInt1762 ^ 0xffffffff))
                    bool = ((ObjectDefinition) class266).aBoolean3039;
            }
        }
        if ((i_8_ ^ 0xffffffff) == 0)
            aClass182_1771 = null;
        else {
            aClass162_1753 = null;
            if (aClass182_1771 == null || ((Class182) aClass182_1771).anInt2120 != i_8_)
                aClass182_1771 = Class235.aClass356_2617.method3790((byte) -90, i_8_);
            else if ((((Class182) aClass182_1771).anInt2102 ^ 0xffffffff) == -1)
                return;
            if (((Class182) aClass182_1771).anIntArray2117 == null)
                aClass182_1771 = null;
            else {
                if (!bool) {
                    anInt1781 = 1;
                    anInt1779 = 0;
                } else {
                    anInt1779 = (int) (Math.random() * (double) (((Class182) aClass182_1771).anIntArray2117).length);
                    anInt1781 = (int) (Math.random() * (double) (((Class182) aClass182_1771).anIntArray2113[anInt1779])) + 1;
                }
                anInt1769 = anInt1779 - -1;
                if (anInt1769 < 0 || (((Class182) aClass182_1771).anIntArray2117.length ^ 0xffffffff) >= (anInt1769 ^ 0xffffffff))
                    anInt1769 = -1;
                anInt1761 = Node_Sub18.anInt7027 - anInt1781;
            }
        }
    }

    final void method1344(Class21 class21, int i) {
        anInt1765++;
        aClass21_1790 = class21;
        if (i != 0)
            method1341(102);
        aClass162_1753 = null;
    }

    static final void method1345(int i, Player player) {
        anInt1757++;
        if (i != 1073741823)
            anInt1751 = 13;
        Node_Sub51 class248_sub51 = ((Node_Sub51) (Class363.aClass65_4475.method501((long) ((Entity) player).anInt10484, (byte) 31)));
        if (class248_sub51 != null) {
            if (((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 != null) {
                Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460);
                ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 = null;
            }
            class248_sub51.remove(true);
        }
    }

    final void method1346(byte i, ha var_ha) {
        if (i != 39)
            aByte1763 = (byte) 2;
        method1339(var_ha, true, 262144, i ^ ~0x53af, true);
        anInt1766++;
    }

    final void method1347(boolean bool, int i, Viewport viewport, int i_10_, Class162 class162, ha var_ha, int i_11_, int i_12_, boolean bool_13_) {
        anInt1772++;
        if (bool == false) {
            Class40[] class40s = class162.method1431();
            Class124[] class124s = class162.method1426();
            if ((((Class150) this).aClass346_Sub8_1773 == null || (((Class346_Sub8) ((Class150) this).aClass346_Sub8_1773).aBoolean8330)) && (class40s != null || class124s != null)) {
                ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -92, ((Class150) this).anInt1754);
                if (((ObjectDefinition) class266).anIntArray3049 != null)
                    class266 = class266.method2797(Node_Sub43.aClass291_7306, 125);
                if (class266 != null)
                    ((Class150) this).aClass346_Sub8_1773 = Class346_Sub8.method3716(Node_Sub18.anInt7027, true);
            }
            if (((Class150) this).aClass346_Sub8_1773 != null) {
                class162.method1442(viewport);
                if (bool_13_)
                    ((Class150) this).aClass346_Sub8_1773.method3712(var_ha, (long) Node_Sub18.anInt7027, class40s, class124s, false);
                else
                    ((Class150) this).aClass346_Sub8_1773.method3717((long) Node_Sub18.anInt7027);
                ((Class150) this).aClass346_Sub8_1773.method3703(aByte1752, i_10_, i_11_, i_12_, i);
            }
        }
    }

    protected final void finalize() {
        anInt1788++;
        if (((Class150) this).aClass346_Sub8_1773 != null)
            ((Class150) this).aClass346_Sub8_1773.method3706();
    }

    private final void method1348(byte i, Interactable interactable) {
        if (i == 110) {
            anInt1780++;
            int i_14_;
            while_106_:
            for (; ; ) {
                if (aClass182_1771 == null) {
                    if (aBoolean1756)
                        return;
                    method1343((byte) -46, -1);
                    if (aClass182_1771 == null)
                        return;
                }
                i_14_ = -anInt1761 + Node_Sub18.anInt7027;
                if ((i_14_ ^ 0xffffffff) < -101 && ((((Class182) aClass182_1771).anInt2130 ^ 0xffffffff) < -1)) {
                    int i_15_;
                    for (i_15_ = ((((Class182) aClass182_1771).anIntArray2117).length - ((Class182) aClass182_1771).anInt2130); ((anInt1779 ^ 0xffffffff) > (i_15_ ^ 0xffffffff) && ((((Class182) aClass182_1771).anIntArray2113[anInt1779]) ^ 0xffffffff) > (i_14_ ^ 0xffffffff)); anInt1779++)
                        i_14_ -= (((Class182) aClass182_1771).anIntArray2113[anInt1779]);
                    if (i_15_ <= anInt1779) {
                        int i_16_ = 0;
                        for (int i_17_ = i_15_; ((i_17_ ^ 0xffffffff) > ((((Class182) aClass182_1771).anIntArray2117).length ^ 0xffffffff)); i_17_++)
                            i_16_ += (((Class182) aClass182_1771).anIntArray2113[i_17_]);
                        i_14_ %= i_16_;
                    }
                    anInt1769 = 1 + anInt1779;
                    if ((anInt1769 ^ 0xffffffff) <= (((Class182) aClass182_1771).anIntArray2117.length ^ 0xffffffff)) {
                        anInt1769 -= ((Class182) aClass182_1771).anInt2130;
                        if ((anInt1769 ^ 0xffffffff) > -1 || ((anInt1769 ^ 0xffffffff) <= ((((Class182) aClass182_1771).anIntArray2117).length ^ 0xffffffff)))
                            anInt1769 = -1;
                    }
                }
                for (; ; ) {
                    if (((Class182) aClass182_1771).anIntArray2113[anInt1779] >= i_14_)
                        break while_106_;
                    Class158.method1396(aClass182_1771, anInt1779, interactable, true);
                    i_14_ -= (((Class182) aClass182_1771).anIntArray2113[anInt1779]);
                    anInt1779++;
                    if (((Class182) aClass182_1771).anIntArray2117.length <= anInt1779) {
                        anInt1779 -= ((Class182) aClass182_1771).anInt2130;
                        if (anInt1779 < 0 || (((Class182) aClass182_1771).anIntArray2117).length <= anInt1779) {
                            aClass182_1771 = null;
                            break;
                        }
                    }
                    anInt1769 = anInt1779 + 1;
                    if (anInt1769 >= ((Class182) aClass182_1771).anIntArray2117.length) {
                        anInt1769 -= ((Class182) aClass182_1771).anInt2130;
                        if (anInt1769 < 0 || anInt1769 >= (((Class182) aClass182_1771).anIntArray2117).length)
                            anInt1769 = -1;
                    }
                }
            }
            anInt1781 = i_14_;
            anInt1761 = Node_Sub18.anInt7027 + -i_14_;
        }
    }

    Class150(ha var_ha, ObjectDefinition class266, int i, int i_18_, int i_19_, int i_20_, Interactable interactable, boolean bool, int i_21_) {
        anInt1762 = -1;
        aBoolean1759 = false;
        anInt1785 = -1;
        anInt1778 = 0;
        aBoolean1756 = false;
        aByte1763 = (byte) i_20_;
        aByte1752 = (byte) i_19_;
        ((Class150) this).anInt1755 = i;
        ((Class150) this).anInt1754 = ((ObjectDefinition) class266).anInt3043;
        aBoolean1759 = bool;
        aInteractable_1767 = interactable;
        ((Class150) this).anInt1787 = i_18_;
        aBoolean1786 = (var_ha.s() && ((ObjectDefinition) class266).aBoolean3085 && !aBoolean1759);
        if (i_21_ != -1)
            aBoolean1756 = true;
        method1343((byte) -46, i_21_);
    }
}
