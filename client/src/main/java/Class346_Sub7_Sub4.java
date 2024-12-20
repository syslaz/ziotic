/* Class346_Sub7_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class346_Sub7_Sub4 extends Interactable {
    static int anInt9945;
    static int anInt9946;
    short aShort9947;
    static int anInt9948;
    static int anInt9949;
    static int anInt9950;
    static int[] anIntArray9951;
    static int anInt9952;

    final boolean method3576(ha var_ha, byte i) {
        if (i != 35)
            method3677(40);
        anInt9946++;
        return Class249.method2696((byte) -117, ((Interactable) this).aByte8322, (((Interactable) this).x >> Class96.anInt1249), (((Interactable) this).y >> Class96.anInt1249));
    }

    static final Class94 method3676(boolean bool, int i) {
        if (bool != false)
            return null;
        anInt9948++;
        if ((i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) <= -101)
            return null;
        return Class13.aClass94Array259[i];
    }

    public static void method3677(int i) {
        if (i != 32397)
            anIntArray9951 = null;
        anIntArray9951 = null;
    }

    static final boolean method3678(int i, int i_0_, int i_1_) {
        anInt9952++;
        if (!Class145.aBoolean1721)
            return false;
        int i_2_ = i_0_ >> -1944309744;
        int i_3_ = 0xffff & i_0_;
        if (i != -12599)
            method3679(-25, 69);
        if (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_2_] == null || (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_2_][i_3_] == null))
            return false;
        RSInterface2 class354 = Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_2_][i_3_];
        if (i_1_ == -1 && (((RSInterface2) class354).anInt4284 ^ 0xffffffff) == -1) {
            for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3119(2)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3107(i + 12472))) {
                if ((((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999 ^ 0xffffffff) == -26 || (((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999 == 1003) || (((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999 == 17) || (((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999 ^ 0xffffffff) == -49 || (((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999 ^ 0xffffffff) == -31) {
                    for (RSInterface2 class354_4_ = Class276.method2853(65535, (((Node_Sub8_Sub11) class248_sub8_sub11).anInt8987)); class354_4_ != null; class354_4_ = Class141.method1283(false, class354_4_)) {
                        if ((((RSInterface2) class354).interfaceValues ^ 0xffffffff) == (((RSInterface2) class354_4_).interfaceValues ^ 0xffffffff))
                            return true;
                    }
                }
            }
        } else {
            for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3119(2)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3107(i + 12471))) {
                if (((i_1_ ^ 0xffffffff) == (((Node_Sub8_Sub11) class248_sub8_sub11).anInt8998 ^ 0xffffffff)) && (((Node_Sub8_Sub11) class248_sub8_sub11).anInt8987 == ((RSInterface2) class354).interfaceValues) && ((((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999 ^ 0xffffffff) == -26 || (((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999) == 1003 || ((((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999) ^ 0xffffffff) == -18 || ((((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999) ^ 0xffffffff) == -49 || (((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999) == 30))
                    return true;
            }
        }
        return false;
    }

    static final void method3679(int i, int i_5_) {
        if (i == -1) {
            anInt9949++;
            Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_5_, -874792672, 12);
            class248_sub8_sub10.method2076(-98);
        }
    }

    final int method3566(Node_Sub42[] class248_sub42s, byte i) {
        anInt9950++;
        if (i != -58)
            return -47;
        return this.method3581(class248_sub42s, (((Interactable) this).x >> Class96.anInt1249), (byte) 85, (((Interactable) this).y >> Class96.anInt1249));
    }

    final boolean getSomeBoolean(int i) {
        anInt9945++;
        if (i > -100)
            method3576(null, (byte) 8);
        return (RSInterface2.aBooleanArrayArray4314[((((Interactable) this).x >> Class96.anInt1249) - Class286.anInt3375 - -Node_Sub47.anInt7416)][(Node_Sub47.anInt7416 + (((Interactable) this).y >> Class96.anInt1249) + -Class152.anInt1808)]);
    }

    Class346_Sub7_Sub4(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
        ((Interactable) this).plane = (byte) i_8_;
        ((Interactable) this).y = i_7_;
        ((Interactable) this).x = i;
        ((Class346_Sub7_Sub4) this).aShort9947 = (short) i_10_;
        ((Interactable) this).aByte8322 = (byte) i_9_;
        ((Interactable) this).anInt8317 = i_6_;
    }
}
