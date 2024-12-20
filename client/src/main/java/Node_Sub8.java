/* Class248_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Node_Sub8 extends Node {
    static int[] anIntArray6860;
    static int anInt6861;
    static String aString6862 = "";
    static int anInt6863;
    static int anInt6864;
    static boolean aBoolean6865;
    static int anInt6866;
    Node_Sub8 aClass248_Sub8_6867;
    static boolean[] aBooleanArray6868;
    static int anInt6869;
    long aLong6870;
    Node_Sub8 aClass248_Sub8_6871;
    static int anInt6872;
    static Class65 aClass65_6873;
    static int anInt6874;

    static final void method2017(int i, RSInterface2 class354, int i_0_, byte i_1_) {
        if (i_1_ == 13) {
            Class359.anInt4433 = i_0_;
            Class5.anInt145 = i;
            Class299.aClass354_3491 = class354;
            anInt6866++;
        }
    }

    final boolean method2018(byte i) {
        if (i != 65)
            return false;
        anInt6869++;
        if (((Node_Sub8) this).aClass248_Sub8_6867 == null)
            return false;
        return true;
    }

    public static void method2019(boolean bool) {
        if (bool == false) {
            aClass65_6873 = null;
            anIntArray6860 = null;
            aBooleanArray6868 = null;
            aString6862 = null;
        }
    }

    static final void method2020() {
        for (; ; ) {
            boolean bool = true;
            for (int i = 0; i < Class183.aClass288Array2143.length; i++) {
                if (!Class183.aClass288Array2143[i].method3083()) {
                    synchronized (Class183.aClass288Array2143[i]) {
                        Class183.aClass288Array2143[i].notify();
                    }
                    bool = false;
                } else
                    WorldAddress.aLongArray1184[i] = Class183.aClass288Array2143[i].method3084();
            }
            if (bool)
                break;
            try {
                Class279_Sub2.method2897((byte) -124, 1L);
            } catch (Exception exception) {
                /* empty */
            }
        }
        Class183.aClass288Array2143[Class183.aClass288Array2143.length - 1].method3079();
        Class181.method1604(1);
        for (; ; ) {
            boolean bool = true;
            for (int i = 0; i < Class183.aClass288Array2143.length - 1; i++) {
                if (!Class183.aClass288Array2143[i].method3083()) {
                    synchronized (Class183.aClass288Array2143[i]) {
                        Class183.aClass288Array2143[i].notify();
                    }
                    bool = false;
                }
            }
            if (bool)
                break;
            try {
                Class279_Sub2.method2897((byte) -124, 1L);
            } catch (Exception exception) {
                /* empty */
            }
        }
        for (int i = 1; i < Class183.aClass288Array2143.length - 2; i++)
            Class183.aClass288Array2143[i].method3079();
        Class181.method1604(2);
        while (!Class183.aClass288Array2143[0].method3083()) {
            synchronized (Class183.aClass288Array2143[0]) {
                Class183.aClass288Array2143[0].notify();
            }
            try {
                Class279_Sub2.method2897((byte) -124, 1L);
            } catch (Exception exception) {
                /* empty */
            }
        }
        Class183.aClass288Array2143[0].method3079();
    }

    final void method2021(byte i) {
        if (i == -26) {
            anInt6864++;
            if (((Node_Sub8) this).aClass248_Sub8_6867 != null) {
                ((Node_Sub8) ((Node_Sub8) this).aClass248_Sub8_6867).aClass248_Sub8_6871 = ((Node_Sub8) this).aClass248_Sub8_6871;
                ((Node_Sub8) ((Node_Sub8) this).aClass248_Sub8_6871).aClass248_Sub8_6867 = ((Node_Sub8) this).aClass248_Sub8_6867;
                ((Node_Sub8) this).aClass248_Sub8_6871 = null;
                ((Node_Sub8) this).aClass248_Sub8_6867 = null;
            }
        }
    }

    static final Node_Sub12 method2022(int i, int i_2_, int i_3_, byte i_4_, boolean bool) {
        anInt6872++;
        Node_Sub12 class248_sub12 = new Node_Sub12();
        ((Node_Sub12) class248_sub12).anInt6960 = i;
        ((Node_Sub12) class248_sub12).anInt6964 = i_2_;
        Class109.aClass65_1375.method509(-1, class248_sub12, (long) i_3_);
        int i_5_ = 34 % ((i_4_ - 81) / 39);
        ObjectDefinition.method2795(i_2_, (byte) 102);
        RSInterface2 class354 = Class276.method2853(65535, i_3_);
        if (class354 != null)
            Class376.method3882(class354, 2260);
        if (Class282_Sub17.aClass354_7773 != null) {
            Class376.method3882(Class282_Sub17.aClass354_7773, 2260);
            Class282_Sub17.aClass354_7773 = null;
        }
        Class147_Sub1.method1320(-4);
        if (class354 != null)
            Class60.method471(!bool, (byte) 100, class354);
        if (!bool)
            Class47.method344(i_2_);
        if (!bool && (Class179.anInt2084 ^ 0xffffffff) != 0)
            Class293.method3116(1, Class179.anInt2084, (byte) -45);
        return class248_sub12;
    }

    public Node_Sub8() {
        /* empty */
    }

    static final void method2023(int i, int i_6_, int i_7_, int i_8_, int i_9_, byte[] is, byte[] is_10_, int i_11_, int i_12_) {
        anInt6863++;
        int i_13_ = -(i_7_ >> -635802014);
        if (i_9_ != 13427)
            aString6862 = null;
        i_7_ = -(0x3 & i_7_);
        for (int i_14_ = -i_8_; (i_14_ ^ 0xffffffff) > -1; i_14_++) {
            for (int i_15_ = i_13_; i_15_ < 0; i_15_++) {
                is_10_[i_6_++] += is[i_11_++];
                is_10_[i_6_++] += is[i_11_++];
                is_10_[i_6_++] += is[i_11_++];
                is_10_[i_6_++] += is[i_11_++];
            }
            for (int i_16_ = i_7_; (i_16_ ^ 0xffffffff) > -1; i_16_++)
                is_10_[i_6_++] += is[i_11_++];
            i_11_ += i;
            i_6_ += i_12_;
        }
    }

    static final int method2024(Player player, byte i) {
        anInt6861++;
        int i_17_ = (((Player) player).anInt10577);
        Class281 class281 = player.method3642(0);
        if (i <= 21)
            anInt6874 = 97;
        if ((((Entity) player).anInt10434) == -1 || (((Entity) player).aBoolean10491))
            i_17_ = ((Player) player).anInt10572;
        else if (((((Class281) class281).anInt3262 ^ 0xffffffff) == ((((Entity) player).anInt10434) ^ 0xffffffff)) || ((((Class281) class281).anInt3265 ^ 0xffffffff) == (((Entity) player).anInt10434 ^ 0xffffffff)) || (((Class281) class281).anInt3294 == ((Entity) player).anInt10434) || (((Entity) player).anInt10434) == ((Class281) class281).anInt3278)
            i_17_ = ((Player) player).anInt10532;
        else if (((((Class281) class281).anInt3276 ^ 0xffffffff) == ((((Entity) player).anInt10434) ^ 0xffffffff)) || (((((Entity) player).anInt10434) ^ 0xffffffff) == (((Class281) class281).anInt3316 ^ 0xffffffff)) || (((Class281) class281).anInt3310 == ((Entity) player).anInt10434) || (((Class281) class281).anInt3264 == ((Entity) player).anInt10434))
            i_17_ = ((Player) player).anInt10552;
        return i_17_;
    }

    static {
        anIntArray6860 = new int[13];
        aBoolean6865 = false;
        aBooleanArray6868 = new boolean[8];
        aClass65_6873 = new Class65(16);
        anInt6874 = 0;
    }
}
