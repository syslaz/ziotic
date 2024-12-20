/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class54 {
    static Class129[] aClass129Array722;
    int anInt723;
    int anInt724;
    static int anInt725;
    int anInt726;
    static int anInt727 = 0;
    static int anInt728;

    abstract void method425(int i, int i_0_, int i_1_);

    static final void method426(ha var_ha, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, boolean bool_7_) {
        r.aHa9032 = var_ha;
        Node_Sub3.anInt6830 = i;
        Class252.aBoolean2841 = Node_Sub3.anInt6830 > 1 && r.aHa9032.v();
        Class96.anInt1249 = i_2_;
        Class241.anInt2692 = 1 << Class96.anInt1249;
        Class84_Sub9.anInt5495 = Class241.anInt2692 >> 1;
        Math.sqrt((double) (Class84_Sub9.anInt5495 * Class84_Sub9.anInt5495 + (Class84_Sub9.anInt5495 * Class84_Sub9.anInt5495)));
        Class111_Sub1.anInt5531 = i_3_;
        Class225_Sub1.anInt8454 = i_4_;
        Class89.anInt1106 = i_5_;
        Node_Sub47.anInt7416 = i_6_;
        Class282_Sub2.aClass161_7608 = Node_Sub14_Sub20.method2337(false);
        Class49.method387(-29670);
        Class85.aClass137ArrayArrayArray1047 = new Class137[i_3_][Class225_Sub1.anInt8454][Class89.anInt1106];
        Node_Sub14_Sub29.aSArray9471 = new s[i_3_];
        if (bool) {
            Class340_Sub8.anIntArrayArray8187 = new int[Class225_Sub1.anInt8454][Class89.anInt1106];
            Class250.aByteArrayArray2822 = new byte[Class225_Sub1.anInt8454][Class89.anInt1106];
            Class346_Sub7_Sub5.aShortArrayArray9957 = new short[Class225_Sub1.anInt8454][Class89.anInt1106];
            Class333.aClass137ArrayArrayArray3898 = new Class137[1][Class225_Sub1.anInt8454][Class89.anInt1106];
            Node_Sub14_Sub12_Sub1.aSArray10306 = new s[1];
        } else {
            Class340_Sub8.anIntArrayArray8187 = null;
            Class250.aByteArrayArray2822 = null;
            Class346_Sub7_Sub5.aShortArrayArray9957 = null;
            Class333.aClass137ArrayArrayArray3898 = null;
            Node_Sub14_Sub12_Sub1.aSArray10306 = null;
        }
        if (bool_7_) {
            Class286.aLongArrayArrayArray3380 = new long[i_3_][i_4_][i_5_];
            Class340.aClass156Array3963 = new Class156[65535];
            Class271.aBooleanArray3147 = new boolean[65535];
            Class297_Sub1.anInt8481 = 0;
        } else {
            Class286.aLongArrayArrayArray3380 = null;
            Class340.aClass156Array3963 = null;
            Class271.aBooleanArray3147 = null;
            Class297_Sub1.anInt8481 = 0;
        }
        Class67.method518(false);
        Class144.aInteractableArray1704 = new Interactable[2];
        Node_Sub12.aInteractableArray6965 = new Interactable[2];
        Class273.aInteractableArray5007 = new Interactable[2];
        Node_Sub38.aInteractableArray7263 = new Interactable[10000];
        Class133.anInt5038 = 0;
        Class173.aInteractableArray2019 = new Interactable[5000];
        Class67.anInt900 = 0;
        Class25.aAnimableArray345 = new Animable[5000];
        Node_Sub14_Sub36.anInt9552 = 0;
        RSInterface2.aBooleanArrayArray4314 = (new boolean
                [Node_Sub47.anInt7416 + Node_Sub47.anInt7416 + 1]
                [Node_Sub47.anInt7416 + Node_Sub47.anInt7416 + 1]);
        Class112.aBooleanArrayArray5202 = (new boolean
                [Node_Sub47.anInt7416 + Node_Sub47.anInt7416 + 2]
                [Node_Sub47.anInt7416 + Node_Sub47.anInt7416 + 2]);
        Class375.anIntArray4615 = new int[Node_Sub47.anInt7416 + Node_Sub47.anInt7416 + 2];
        Class352.aClass27_4187 = Class352.aClass27_4186;
        if (Class252.aBoolean2841) {
            Class84_Sub7.aBooleanArrayArrayArray5461 = (new boolean[i_3_]
                    [Node_Sub47.anInt7416 + Node_Sub47.anInt7416 + 1]
                    [Node_Sub47.anInt7416 + Node_Sub47.anInt7416 + 1]);
            Class105.aBooleanArrayArrayArray1343 = new boolean[i_3_][][];
            if (Class183.aClass288Array2143 != null)
                Class69.method526();
            Class183.aClass288Array2143 = new Class288[Node_Sub3.anInt6830];
            r.aHa9032.c(Class183.aClass288Array2143.length + 1);
            r.aHa9032.h(0);
            for (int i_8_ = 0; i_8_ < Class183.aClass288Array2143.length; i_8_++) {
                Class183.aClass288Array2143[i_8_] = new Class288(i_8_ + 1, r.aHa9032);
                new Thread(Class183.aClass288Array2143[i_8_], "wr" + i_8_).start();
            }
            int i_9_;
            if (Node_Sub3.anInt6830 == 2) {
                i_9_ = 4;
                Viewport.anInt2651 = 2;
            } else if (Node_Sub3.anInt6830 == 3) {
                i_9_ = 6;
                Viewport.anInt2651 = 3;
            } else {
                i_9_ = 8;
                Viewport.anInt2651 = 4;
            }
            Class345.aClass344Array4093 = new Class344[i_9_];
            for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
                Class345.aClass344Array4093[i_10_] = new Class344(Class236.aStringArrayArray2632[Node_Sub3.anInt6830 - 2][i_10_]);
        } else
            Viewport.anInt2651 = 1;
        Class270.anIntArray3138 = new int[Viewport.anInt2651 - 1];
        Class349_Sub2.anIntArray4721 = new int[Viewport.anInt2651 - 1];
    }

    abstract void method427(int i, int i_11_, int i_12_);

    public static void method428(int i) {
        aClass129Array722 = null;
        if (i >= -104)
            method426(null, -35, -107, 41, -104, 42, -13, true, true);
    }

    abstract void method429(int i, byte i_13_, int i_14_);

    static final void method430(int[] is, NPC NPC, int[] is_15_, int i, int[] is_16_) {
        if (i >= 106) {
            anInt725++;
            for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (is_16_.length ^ 0xffffffff); i_17_++) {
                int i_18_ = is_16_[i_17_];
                int i_19_ = is_15_[i_17_];
                int i_20_ = is[i_17_];
                for (int i_21_ = 0; i_19_ != 0 && i_21_ < (((Entity) NPC).aClass286Array10463).length; i_21_++) {
                    if ((0x1 & i_19_ ^ 0xffffffff) != -1) {
                        if (i_18_ != -1) {
                            Class182 class182 = Class235.aClass356_2617.method3790((byte) -90, i_18_);
                            int i_22_ = ((Class182) class182).anInt2102;
                            Class286 class286 = (((Entity) NPC).aClass286Array10463[i_21_]);
                            if (class286 != null) {
                                if (((Class286) class286).anInt3379 == i_18_) {
                                    if ((i_22_ ^ 0xffffffff) != -1) {
                                        if ((i_22_ ^ 0xffffffff) == -2) {
                                            ((Class286) class286).anInt3376 = i_20_;
                                            ((Class286) class286).anInt3374 = 0;
                                            ((Class286) class286).anInt3378 = 1;
                                            ((Class286) class286).anInt3373 = 0;
                                            ((Class286) class286).anInt3377 = 0;
                                            if (!((Entity) NPC).aBoolean10439)
                                                Class158.method1396(class182, 0, NPC, true);
                                        } else if (i_22_ == 2)
                                            ((Class286) class286).anInt3377 = 0;
                                    } else
                                        class286 = ((Entity) NPC).aClass286Array10463[i_21_] = null;
                                } else if (((Class182) class182).anInt2101 >= ((Class182) (Class235.aClass356_2617.method3790((byte) -90, (((Class286) class286).anInt3379)))).anInt2101)
                                    class286 = ((Entity) NPC).aClass286Array10463[i_21_] = null;
                            }
                            if (class286 == null) {
                                class286 = ((Entity) NPC).aClass286Array10463[i_21_] = new Class286();
                                ((Class286) class286).anInt3377 = 0;
                                ((Class286) class286).anInt3374 = 0;
                                ((Class286) class286).anInt3376 = i_20_;
                                ((Class286) class286).anInt3378 = 1;
                                ((Class286) class286).anInt3379 = i_18_;
                                ((Class286) class286).anInt3373 = 0;
                                if (!((Entity) NPC).aBoolean10439)
                                    Class158.method1396(class182, 0, NPC, true);
                            }
                        } else
                            ((Entity) NPC).aClass286Array10463[i_21_] = null;
                    }
                    i_19_ >>>= 1;
                }
            }
        }
    }

    Class54(int i, int i_23_, int i_24_) {
        ((Class54) this).anInt723 = i_23_;
        ((Class54) this).anInt724 = i;
        ((Class54) this).anInt726 = i_24_;
    }
}
