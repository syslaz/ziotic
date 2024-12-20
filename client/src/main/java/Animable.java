/* Class346_Sub7_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Constructor;

abstract class Animable extends Interactable {
    static int anInt9915;
    short y1;//
    static int anInt9917;
    static int anInt9918;
    static int anInt9919;
    static int anInt9920;
    static int anInt9921;
    short y2;//
    short x2;//
    static int anInt9924;
    static int anInt9925;
    static int anInt9926;
    boolean aBoolean9927;
    static int anInt9928;
    short x1;//
    byte aByte9930;
    /*synthetic*/ static Class aClass9931;

    static final int method3596(byte i, int i_0_, int i_1_) {
        anInt9919++;
        if (i_0_ == 1 || (i_0_ ^ 0xffffffff) == -4)
            return Node_Sub14_Sub15.anIntArray9327[i_1_ & 0x3];
        if (i != 112)
            anInt9925 = 59;
        return Class81_Sub1.anIntArray8421[0x3 & i_1_];
    }

    final boolean getSomeBoolean(int i) {
        anInt9926++;
        int x = ((Animable) this).x1;//x1?
        if (i > -100)
            anInt9925 = -16;
        for (/**/; ((x ^ 0xffffffff) >= (((Animable) this).x2 ^ 0xffffffff)); x++) {
            for (int y = ((Animable) this).y1; ((Animable) this).y2 >= y; y++) {
                int i_4_ = x - (Class286.anInt3375 - Node_Sub47.anInt7416);
                if (i_4_ >= 0 && RSInterface2.aBooleanArrayArray4314.length > i_4_) {
                    int i_5_ = (-Class152.anInt1808 + y - -Node_Sub47.anInt7416);
                    if ((i_5_ ^ 0xffffffff) <= -1 && i_5_ < RSInterface2.aBooleanArrayArray4314.length && RSInterface2.aBooleanArrayArray4314[i_4_][i_5_])
                        return true;
                }
            }
        }
        return false;
    }

    static final Class207 method3597(int i) {
        anInt9924++;
        if (i != 1)
            return null;
        return Class281.method2914(-108, 1);
    }

    static final int method3598(int i, int i_6_, int i_7_) {
        anInt9918++;
        int i_8_ = 0;
        if (i_7_ <= 75)
            anInt9925 = 100;
        while ((i_6_ ^ 0xffffffff) < -1) {
            i_8_ = i & 0x1 | i_8_ << 1112973313;
            i_6_--;
            i >>>= 1;
        }
        return i_8_;
    }

    final int method3566(Node_Sub42[] class248_sub42s, byte i) {
        anInt9920++;
        int i_9_ = 0;
        if (i != -58)
            return -53;
        while_56_:
        for (int i_10_ = ((Animable) this).x1; ((Animable) this).x2 >= i_10_; i_10_++) {
            for (int i_11_ = ((Animable) this).y1; ((Animable) this).y2 >= i_11_; i_11_++) {
                long l = (Class286.aLongArrayArrayArray3380[((Interactable) this).plane][i_10_][i_11_]);
                long l_12_ = 0L;
                while_55_:
                while ((l_12_ ^ 0xffffffffffffffffL) >= -49L) {
                    int i_13_ = (int) (l >>> (int) l_12_ & 0xffffL);
                    if (i_13_ <= 0)
                        break;
                    Class156 class156 = Class340.aClass156Array3963[-1 + i_13_];
                    for (int i_14_ = 0; i_9_ > i_14_; i_14_++) {
                        if (((Class156) class156).aClass248_Sub42_1853 == class248_sub42s[i_14_]) {
                            l_12_ += 16L;
                            continue while_55_;
                        }
                    }
                    class248_sub42s[i_9_++] = ((Class156) class156).aClass248_Sub42_1853;
                    if (i_9_ == 4)
                        break while_56_;
                    l_12_ += 16L;
                }
            }
        }
        for (int i_15_ = i_9_; (i_15_ ^ 0xffffffff) > -5; i_15_++)
            class248_sub42s[i_15_] = null;
        if ((((Animable) this).aByte9930 ^ 0xffffffff) != -1) {
            int i_16_ = -Class286.anInt3375 + ((Animable) this).x1;
            int i_17_ = -Class152.anInt1808 + ((Animable) this).y1;
            int i_18_;
            short i_19_;
            short i_20_;
            int i_21_;
            if ((((Animable) this).aByte9930 ^ 0xffffffff) != -2) {
                if (i_17_ <= -i_16_) {
                    i_20_ = ((Animable) this).y1;
                    i_21_ = ((Animable) this).x1 + 1;
                    i_18_ = ((Animable) this).y1 - -1;
                    i_19_ = ((Animable) this).x1;
                } else {
                    i_20_ = ((Animable) this).y1;
                    i_21_ = ((Animable) this).x1 + -1;
                    i_19_ = ((Animable) this).x1;
                    i_18_ = ((Animable) this).y1 + -1;
                }
            } else if (i_17_ > i_16_) {
                i_18_ = -1 + ((Animable) this).y1;
                i_19_ = ((Animable) this).x1;
                i_20_ = ((Animable) this).y1;
                i_21_ = ((Animable) this).x1 - -1;
            } else {
                i_18_ = 1 + ((Animable) this).y1;
                i_19_ = ((Animable) this).x1;
                i_20_ = ((Animable) this).y1;
                i_21_ = ((Animable) this).x1 + -1;
            }
            int i_22_ = 0;
            while_58_:
            for (/**/; (i_22_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff); i_22_++) {
                long l = (Class286.aLongArrayArrayArray3380[((Interactable) this).plane][i_19_][i_18_]);
                while (l != 0L) {
                    Class156 class156 = (Class340.aClass156Array3963[(int) (-1L + (0xffffL & l))]);
                    l >>>= 16;
                    if (((Class156) class156).aClass248_Sub42_1853 == class248_sub42s[i_22_])
                        continue while_58_;
                }
                l = (Class286.aLongArrayArrayArray3380[((Interactable) this).plane][i_21_][i_20_]);
                while (l != 0L) {
                    Class156 class156 = (Class340.aClass156Array3963[(int) (-1L + (0xffffL & l))]);
                    l >>>= 16;
                    if (((Class156) class156).aClass248_Sub42_1853 == class248_sub42s[i_22_])
                        continue while_58_;
                }
                for (int i_23_ = i_22_; (i_23_ ^ 0xffffffff) > (i_9_ + -1 ^ 0xffffffff); i_23_++)
                    class248_sub42s[i_23_] = class248_sub42s[1 + i_23_];
                i_9_--;
            }
        }
        return i_9_;
    }

    void updateCoordinateBounds(byte i) {
        if (i >= -125)
            getSomeBoolean(-62);
        anInt9928++;
    }

    static final Class269 method3600(Component component, boolean bool, byte i) {
        anInt9921++;
        if (i != 122)
            anInt9925 = 67;
        try {
            Constructor constructor = (Class.forName("Class269_Sub1").getDeclaredConstructor(new Class[]{(aClass9931 != null ? aClass9931 : (aClass9931 = method3602("java.awt.Component"))), Boolean.TYPE}));
            return ((Class269) constructor.newInstance(new Object[]{component, new Boolean(bool)}));
        } catch (Throwable throwable) {
            return new Class269_Sub2(component, bool);
        }
    }

    static final void method3601(int i, int i_24_, int i_25_, int i_26_, boolean bool) {
        anInt9915++;
        if (Class346_Sub7_Sub5_Sub2.method3699(i_24_, (byte) -22)) {
            Class289.method3087(-1, (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_24_]), bool, i_25_, (byte) 90, i_26_);
            if (i != 32280)
                method3601(-85, -105, 60, -60, true);
        }
    }

    final boolean method3576(ha var_ha, byte i) {
        anInt9917++;
        if (i != 35)
            return false;
        return Class343.method3498((byte) 91, ((Animable) this).x1, ((Interactable) this).aByte8322, ((Animable) this).x2, this.method3575((byte) -87, var_ha), ((Animable) this).y2, ((Animable) this).y1);
    }

    Animable(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, boolean bool, byte i_35_) {
        ((Animable) this).x2 = (short) i_32_;
        ((Interactable) this).aByte8322 = (byte) i_27_;
        ((Interactable) this).plane = (byte) i;
        ((Animable) this).y2 = (short) i_34_;
        ((Interactable) this).y = i_30_;
        ((Animable) this).x1 = (short) i_31_;
        ((Animable) this).y1 = (short) i_33_;
        ((Animable) this).aBoolean9927 = bool;
        ((Interactable) this).anInt8317 = i_29_;
        ((Interactable) this).x = i_28_;
        ((Animable) this).aByte9930 = i_35_;
    }

    /*synthetic*/
    static Class method3602(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
