/* Class248_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub33 extends Node {
    static Class381 aClass381_7199;
    static long aLong7200;
    static int anInt7201;
    int[] anIntArray7202;
    static int anInt7203;
    int[] anIntArray7204 = new int[1];
    static int anInt7205 = 0;
    static int anInt7206;
    static int anInt7207;

    final Class162 method2566(int i, int i_0_, int i_1_, Class182 class182, int i_2_, int i_3_, Class332 class332, ha var_ha, int i_4_, boolean bool) {
        anInt7203++;
        Class162 class162 = null;
        int i_5_ = i_0_;
        Class281 class281 = null;
        if ((i_2_ ^ 0xffffffff) != 0)
            class281 = Class301_Sub3_Sub1.aClass131_9974.method1213(-20408, i_2_);
        int[] is = ((Node_Sub33) this).anIntArray7202;
        if (class281 != null && ((Class281) class281).anIntArray3277 != null) {
            is = new int[((Class281) class281).anIntArray3277.length];
            for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (((Class281) class281).anIntArray3277.length ^ 0xffffffff)); i_6_++) {
                int i_7_ = ((Class281) class281).anIntArray3277[i_6_];
                if (i_7_ >= 0 && (((Node_Sub33) this).anIntArray7202.length ^ 0xffffffff) < (i_7_ ^ 0xffffffff))
                    is[i_6_] = ((Node_Sub33) this).anIntArray7202[i_7_];
                else
                    is[i_6_] = -1;
            }
        }
        boolean bool_8_ = false;
        boolean bool_9_ = false;
        if (i_3_ != -24182968)
            method2570(43);
        boolean bool_10_ = false;
        boolean bool_11_ = false;
        int i_12_ = -1;
        int i_13_ = -1;
        int i_14_ = 0;
        Node_Sub8_Sub2 class248_sub8_sub2 = null;
        Node_Sub8_Sub2 class248_sub8_sub2_15_ = null;
        if (class182 != null) {
            i_12_ = ((Class182) class182).anIntArray2117[i];
            i_5_ |= 0x20;
            int i_16_ = i_12_ >>> -539019696;
            i_12_ &= 0xffff;
            class248_sub8_sub2 = Class235.aClass356_2617.method3788(i_3_ + 24182888, i_16_);
            if (class248_sub8_sub2 != null) {
                bool_9_ |= class248_sub8_sub2.method2035(i_12_, -34);
                bool_8_ |= class248_sub8_sub2.method2040(i_3_ ^ ~0x17100b6, i_12_);
                bool_11_ |= class248_sub8_sub2.method2037(1, i_12_);
                bool_10_ |= ((Class182) class182).aBoolean2116;
            }
            if ((((Class182) class182).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && (i_4_ ^ 0xffffffff) != 0 && ((Class182) class182).anIntArray2117.length > i_4_) {
                i_14_ = ((Class182) class182).anIntArray2113[i];
                i_13_ = ((Class182) class182).anIntArray2117[i_4_];
                int i_17_ = i_13_ >>> 813323568;
                i_13_ &= 0xffff;
                if (i_16_ == i_17_)
                    class248_sub8_sub2_15_ = class248_sub8_sub2;
                else
                    class248_sub8_sub2_15_ = (Class235.aClass356_2617.method3788(i_3_ + 24182939, i_13_ >>> -1199143536));
                if (class248_sub8_sub2_15_ != null) {
                    bool_9_ |= class248_sub8_sub2_15_.method2035(i_13_, -43);
                    bool_8_ |= class248_sub8_sub2_15_.method2040(1, i_13_);
                    bool_11_ |= class248_sub8_sub2_15_.method2037(1, i_13_);
                }
            }
            if (bool_9_)
                i_5_ |= 0x80;
            if (bool_8_)
                i_5_ |= 0x100;
            if (bool_10_)
                i_5_ |= 0x200;
            if (bool_11_)
                i_5_ |= 0x400;
        }
        long l = method2568(is, i_2_, 0, bool, (class332 != null ? ((Class332) class332).colors : null));
        if (aa.aClass278_101 != null)
            class162 = (Class162) aa.aClass278_101.method2863(4, l);
        if (class162 == null || var_ha.b(class162.ua(), i_5_) != 0) {
            if (class162 != null)
                i_5_ = var_ha.c(i_5_, class162.ua());
            int i_18_ = i_5_;
            boolean bool_19_ = false;
            for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_20_++) {
                if (is[i_20_] != -1 && !Class283.aClass342_3343.method3482((byte) 126, is[i_20_]).method3325(true, bool))
                    bool_19_ = true;
            }
            if (bool_19_)
                return null;
            Class343[] class343s = new Class343[is.length];
            for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_21_++) {
                if ((is[i_21_] ^ 0xffffffff) != 0)
                    class343s[i_21_] = Class283.aClass342_3343.method3482((byte) 95, is[i_21_]).method3327(15580, bool);
            }
            if (class281 != null && ((Class281) class281).anIntArrayArray3291 != null) {
                for (int i_22_ = 0; i_22_ < ((Class281) class281).anIntArrayArray3291.length; i_22_++) {
                    if ((((Class281) class281).anIntArrayArray3291[i_22_] != null) && class343s[i_22_] != null) {
                        int i_23_ = (((Class281) class281).anIntArrayArray3291[i_22_][0]);
                        int i_24_ = (((Class281) class281).anIntArrayArray3291[i_22_][1]);
                        int i_25_ = (((Class281) class281).anIntArrayArray3291[i_22_][2]);
                        int i_26_ = (((Class281) class281).anIntArrayArray3291[i_22_][3]);
                        int i_27_ = (((Class281) class281).anIntArrayArray3291[i_22_][4]);
                        int i_28_ = (((Class281) class281).anIntArrayArray3291[i_22_][5]);
                        if ((i_26_ ^ 0xffffffff) != -1 || i_27_ != 0 || (i_28_ ^ 0xffffffff) != -1)
                            class343s[i_22_].method3505(12, i_28_, i_27_, i_26_);
                        if (i_23_ != 0 || i_24_ != 0 || (i_25_ ^ 0xffffffff) != -1)
                            class343s[i_22_].method3496(i_23_, i_24_, 0, i_25_);
                    }
                }
            }
            Class343 class343 = new Class343(class343s, class343s.length);
            if (class332 != null)
                i_18_ |= 0x4000;
            class162 = var_ha.a(class343, i_18_, Class166.anInt1949, 64, 850);
            if (class332 != null) {
                for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > -6; i_29_++) {
                    for (int i_30_ = 0; ((i_30_ ^ 0xffffffff) > (Class226_Sub2.aShortArrayArrayArray6667.length ^ 0xffffffff)); i_30_++) {
                        if (((Class226_Sub2.aShortArrayArrayArray6667[i_30_][i_29_]).length ^ 0xffffffff) < (((Class332) class332).colors[i_29_] ^ 0xffffffff))
                            class162.ia((Class205.aShortArrayArray2388[i_30_][i_29_]), (Class226_Sub2.aShortArrayArrayArray6667[i_30_][i_29_][(((Class332) class332).colors[i_29_])]));
                    }
                }
            }
            if (aa.aClass278_101 != null) {
                class162.s(i_5_);
                aa.aClass278_101.method2867((byte) 0, l, class162);
            }
        }
        if (class182 == null || class248_sub8_sub2 == null)
            return class162;
        Class162 class162_31_ = class162.method1436((byte) 1, i_5_, true);
        class162_31_.method1421(-97, class248_sub8_sub2, ((Class182) class182).aBoolean2116, i_13_, i_14_, i_12_, 0, -1 + i_1_, class248_sub8_sub2_15_);
        return class162_31_;
    }

    static final int method2567(byte i) {
        anInt7201++;
        if (i != 106)
            anInt7205 = -58;
        return Class39.anInt427;
    }

    private final long method2568(int[] is, int i, int i_32_, boolean bool, int[] is_33_) {
        anInt7206++;
        long[] ls = Class327.aLongArray3833;
        long l = -1L;
        l = l >>> 355893128 ^ ls[(int) (0xffL & (l ^ (long) (i >> -24182968)))];
        l = ls[(int) (((long) i ^ l) & 0xffL)] ^ l >>> 1133414856;
        for (int i_34_ = i_32_; (is.length ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++) {
            l = (ls[(int) ((l ^ (long) (is[i_34_] >> -1265074728)) & 0xffL)] ^ l >>> 251223048);
            l = (l >>> -1826522488 ^ ls[(int) (((long) (is[i_34_] >> -121715024) ^ l) & 0xffL)]);
            l = (ls[(int) (0xffL & ((long) (is[i_34_] >> -117460216) ^ l))] ^ l >>> -434110008);
            l = l >>> 1274066504 ^ ls[(int) ((l ^ (long) is[i_34_]) & 0xffL)];
        }
        if (is_33_ != null) {
            for (int i_35_ = 0; i_35_ < 5; i_35_++)
                l = l >>> 778369800 ^ ls[(int) (((long) is_33_[i_35_] ^ l) & 0xffL)];
        }
        l = l >>> -1100651064 ^ ls[(int) (0xffL & ((long) (bool ? 1 : 0) ^ l))];
        return l;
    }

    static final boolean method2569(int i, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, boolean bool) {
        anInt7207++;
        if (bool != true)
            method2567((byte) 99);
        if (i_41_ - -i_40_ <= i_42_ || i + i_42_ <= i_41_)
            return false;
        if (i_38_ - -i_36_ <= i_37_ || i_38_ >= i_39_ + i_37_)
            return false;
        return true;
    }

    public static void method2570(int i) {
        aClass381_7199 = null;
        if (i != 255)
            aClass381_7199 = null;
    }

    public Node_Sub33() {
        ((Node_Sub33) this).anIntArray7202 = new int[]{-1};
    }
}
