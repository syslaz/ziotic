/* Class267 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class267 implements Interface10 {
    private Class273 aClass273_4915;
    static int anInt4916;
    static int anInt4917;
    private Class129 aClass129_4918;
    static int anInt4919 = 0;
    static int anInt4920;
    static int anInt4921;
    static int anInt4922;
    static int anInt4923;
    private Class381 aClass381_4924;
    /*synthetic*/ static Class aClass4925;

    public final boolean method33(int i) {
        anInt4917++;
        if (i != 5618)
            method33(-11);
        return aClass381_4924.method3920(((Class273) aClass273_4915).anInt5006, -57);
    }

    static final void method2802() {
        for (int i = 0; i < Class297_Sub1.anInt8481; i++) {
            if (!Class271.aBooleanArray3147[i]) {
                Class156 class156 = Class340.aClass156Array3963[i];
                Node_Sub42 class248_sub42 = ((Class156) class156).aClass248_Sub42_1853;
                int i_0_ = ((Class156) class156).anInt1864;
                int i_1_ = class248_sub42.method2628(-17) - Class84_Sub9.anInt5495;
                int i_2_ = 1 + (2 * i_1_ >> Class96.anInt1249);
                int i_3_ = 0;
                int[] is = new int[i_2_ * i_2_];
                int i_4_ = (class248_sub42.method2620(109) - i_1_ >> Class96.anInt1249);
                int i_5_ = (class248_sub42.method2625((byte) -84) - i_1_ >> Class96.anInt1249);
                int i_6_ = (class248_sub42.method2625((byte) -78) + i_1_ >> Class96.anInt1249);
                if (i_5_ < 0) {
                    i_3_ -= i_5_;
                    i_5_ = 0;
                }
                if (i_6_ >= Class89.anInt1106)
                    i_6_ = Class89.anInt1106 - 1;
                for (int i_7_ = i_5_; i_7_ <= i_6_; i_7_++) {
                    int i_8_ = ((Class156) class156).aShortArray1857[i_3_];
                    int i_9_ = i_8_ >>> 8;
                    int i_10_ = i_3_ * i_2_ + i_9_;
                    int i_11_ = i_4_ + (i_8_ >>> 8);
                    int i_12_ = i_11_ + (i_8_ & 0xff) - 1;
                    if (i_11_ < 0) {
                        i_10_ -= i_11_;
                        i_11_ = 0;
                    }
                    if (i_12_ >= Class225_Sub1.anInt8454)
                        i_12_ = Class225_Sub1.anInt8454 - 1;
                    for (int i_13_ = i_11_; i_13_ <= i_12_; i_13_++) {
                        int i_14_ = 1;
                        Animable animable = (aa.method154(i_0_, i_13_, i_7_, (aClass4925 != null ? aClass4925 : (aClass4925 = method2804("Animable")))));
                        if (animable != null && (((Animable) animable).aByte9930) != 0) {
                            if ((((Animable) animable).aByte9930) == 1) {
                                boolean bool = i_13_ - 1 >= i_11_;
                                boolean bool_15_ = i_13_ + 1 <= i_12_;
                                if (!bool && i_7_ + 1 <= i_6_) {
                                    int i_16_ = (((Class156) class156).aShortArray1857[i_3_ + 1]);
                                    int i_17_ = i_4_ + (i_16_ >>> 8);
                                    int i_18_ = i_17_ + (i_16_ & 0xff);
                                    bool = i_13_ > i_17_ && i_13_ < i_18_;
                                }
                                if (!bool_15_ && i_7_ - 1 >= i_5_) {
                                    int i_19_ = (((Class156) class156).aShortArray1857[i_3_ - 1]);
                                    int i_20_ = i_4_ + (i_19_ >>> 8);
                                    int i_21_ = i_20_ + (i_19_ & 0xff);
                                    bool_15_ = i_13_ > i_20_ && i_13_ < i_21_;
                                }
                                if (bool && !bool_15_)
                                    i_14_ = 4;
                                else if (bool_15_ && !bool)
                                    i_14_ = 2;
                            } else {
                                boolean bool = i_13_ - 1 >= i_11_;
                                boolean bool_22_ = i_13_ + 1 <= i_12_;
                                if (!bool && i_7_ - 1 >= i_5_) {
                                    int i_23_ = (((Class156) class156).aShortArray1857[i_3_ - 1]);
                                    int i_24_ = i_4_ + (i_23_ >>> 8);
                                    int i_25_ = i_24_ + (i_23_ & 0xff);
                                    bool = i_13_ > i_24_ && i_13_ < i_25_;
                                }
                                if (!bool_22_ && i_7_ + 1 <= i_6_) {
                                    int i_26_ = (((Class156) class156).aShortArray1857[i_3_ + 1]);
                                    int i_27_ = i_4_ + (i_26_ >>> 8);
                                    int i_28_ = i_27_ + (i_26_ & 0xff);
                                    bool_22_ = i_13_ > i_27_ && i_13_ < i_28_;
                                }
                                if (bool && !bool_22_)
                                    i_14_ = 3;
                                else if (bool_22_ && !bool)
                                    i_14_ = 5;
                            }
                        }
                        is[i_10_++] = i_14_;
                    }
                    i_3_++;
                }
                Class271.aBooleanArray3147[i] = true;
                Class177.aSArray2070[i_0_].method3141(class248_sub42, is);
            }
        }
    }

    public final void method32(boolean bool, byte i) {
        anInt4916++;
        if (i >= -60)
            method33(112);
        if (bool) {
            int i_29_ = (Class226_Sub1.anInt6661 >= Class146.anInt1724 ? Class226_Sub1.anInt6661 : Class146.anInt1724);
            int i_30_ = ((s_Sub2.anInt7946 ^ 0xffffffff) <= (Class282_Sub20.anInt7800 ^ 0xffffffff) ? s_Sub2.anInt7946 : Class282_Sub20.anInt7800);
            int i_31_ = aClass129_4918.method1169();
            int i_32_ = aClass129_4918.method1181();
            int i_33_ = 0;
            int i_34_ = i_29_;
            int i_35_ = i_29_ * i_32_ / i_31_;
            int i_36_ = (i_30_ + -i_35_) / 2;
            if (i_35_ > i_30_) {
                i_35_ = i_30_;
                i_36_ = 0;
                i_34_ = i_31_ * i_30_ / i_32_;
                i_33_ = (i_29_ + -i_34_) / 2;
            }
            aClass129_4918.method1185(i_33_, i_36_, i_34_, i_35_);
        }
    }

    Class267(Class381 class381, Class273 class273) {
        aClass381_4924 = class381;
        aClass273_4915 = class273;
    }

    public final void method34(byte i) {
        anInt4921++;
        if (i <= 34)
            aClass273_4915 = null;
        aClass129_4918 = Node_Sub8_Sub3.method2043((((Class273) aClass273_4915).anInt5006), aClass381_4924, true);
    }

    static final void method2803(byte i, PacketStream class248_sub9_sub2) {
        class248_sub9_sub2.method2234(true);
        anInt4923++;
        if (i != -1)
            anInt4919 = -83;
        int i_37_ = Class282_Sub29.anInt7896;
        Player player = (Class347.myPlayer = Node_Sub32.aPlayerArray7197[i_37_] = new Player());
        ((Entity) player).anInt10484 = i_37_;
        int i_38_ = class248_sub9_sub2.readBits(i + 2060, 30);
        byte i_39_ = (byte) (i_38_ >> 611407932);
        int i_40_ = (0xfffddf8 & i_38_) >> 1983596494;
        ((Entity) player).posQueueX[0] = i_40_ - Class67.baseX;
        int i_41_ = 0x3fff & i_38_;
        ((Interactable) player).x = (((((Entity) player).posQueueX[0]) << -628301751) - -(player.method3632(i) << 880232328));
        ((Entity) player).posQueueY[0] = i_41_ + -Class368.baseY;
        ((Interactable) player).y = (((((Entity) player).posQueueY[0]) << 97833705) + (player.method3632(-1) << -791683800));
        Class177.anInt2074 = ((Interactable) player).plane = ((Interactable) player).aByte8322 = i_39_;
        if (Class209.method1717(i + -10386, (((Entity) player).posQueueX[0]), (((Entity) player).posQueueY[0])))
            ((Interactable) player).aByte8322++;
        if (Class338.aClass248_Sub9Array3937[i_37_] != null)
            player.parseAppearance(true, Class338.aClass248_Sub9Array3937[i_37_]);
        Class131.anInt1600 = 0;
        Class271.anIntArray3156[Class131.anInt1600++] = i_37_;
        Class209.aByteArray2423[i_37_] = (byte) 0;
        Class95.anInt1235 = 0;
        for (int i_42_ = 1; i_42_ < 2048; i_42_++) {
            if ((i_37_ ^ 0xffffffff) != (i_42_ ^ 0xffffffff)) {
                int i_43_ = class248_sub9_sub2.readBits(2059, 18);
                int i_44_ = i_43_ >> 1054907024;
                int i_45_ = 0xff & i_43_ >> 413298440;
                int i_46_ = 0xff & i_43_;
                Class107 class107 = (Node_Sub8_Sub16.aClass107Array9053[i_42_] = new Class107());
                ((Class107) class107).anInt1356 = 0;
                ((Class107) class107).anInt1354 = -1;
                ((Class107) class107).anInt1351 = i_46_ + (i_44_ << -1166444004) + (i_45_ << -1619835794);
                ((Class107) class107).aBoolean1352 = false;
                Node_Sub4.anIntArray6834[Class95.anInt1235++] = i_42_;
                Class209.aByteArray2423[i_42_] = (byte) 0;
            }
        }
        class248_sub9_sub2.method2233(-97);
    }

    /*synthetic*/
    static Class method2804(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
