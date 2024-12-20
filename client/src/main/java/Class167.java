/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class167 {
    String aString1951;
    int anInt1952;
    int anInt1953;
    String aString1954;
    static int anInt1955;
    static int anInt1956;
    long aLong1957;
    static Class129[] aClass129Array1958;
    static int anInt1959;

    public static void method1538(byte i) {
        if (i == -10)
            aClass129Array1958 = null;
    }

    static final void method1539(String string, boolean bool) {
        if (bool != true)
            aClass129Array1958 = null;
        anInt1955++;
        System.out.println("Error: " + Class45.method325(string, "\n", "%0a", 108));
    }

    static final void sendModel(int i, byte i_0_, int i_1_, int i_2_, int i_3_) {
        anInt1956++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_3_, -874792672, 4);
        class248_sub8_sub10.method2084(614);
        if (i_0_ != 100)
            aClass129Array1958 = null;
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976 = i_2_;
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8981 = i;
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983 = i_1_;
    }

    static final void method1541(int i, int i_4_, int i_5_, int i_6_, Class346_Sub7_Sub3 class346_sub7_sub3) {
        Class137 class137 = Class296.method3130(i, i_4_, i_5_);
        if (class137 != null) {
            ((Interactable) class346_sub7_sub3).x = (i_4_ << Class96.anInt1249) + Class84_Sub9.anInt5495;
            ((Interactable) class346_sub7_sub3).anInt8317 = i_6_;
            ((Interactable) class346_sub7_sub3).y = (i_5_ << Class96.anInt1249) + Class84_Sub9.anInt5495;
            ((Class137) class137).aClass346_Sub7_Sub3_1647 = class346_sub7_sub3;
            int i_7_ = ((Class177.aSArray2070 == Node_Sub14_Sub12_Sub1.aSArray10306) ? 1 : 0);
            if (class346_sub7_sub3.method3574((byte) -72)) {
                if (class346_sub7_sub3.method3563(false)) {
                    ((Interactable) class346_sub7_sub3).aInteractable_8320 = Node_Sub12.aInteractableArray6965[i_7_];
                    Node_Sub12.aInteractableArray6965[i_7_] = class346_sub7_sub3;
                } else {
                    ((Interactable) class346_sub7_sub3).aInteractable_8320 = Class144.aInteractableArray1704[i_7_];
                    Class144.aInteractableArray1704[i_7_] = class346_sub7_sub3;
                    Node_Sub30.aBoolean7192 = true;
                }
            } else {
                ((Interactable) class346_sub7_sub3).aInteractable_8320 = Class273.aInteractableArray5007[i_7_];
                Class273.aInteractableArray5007[i_7_] = class346_sub7_sub3;
            }
        }
    }

    static final boolean method1542(boolean bool, int i, int i_8_, Class346_Sub7_Sub5 class346_sub7_sub5, int i_9_) {
        anInt1959++;
        if (!Class346.aBoolean4120 || !WorldAddress.aBoolean1189)
            return false;
        if ((Class346_Sub7_Sub4_Sub2.anInt10163 ^ 0xffffffff) > -101)
            return false;
        if (bool != false)
            aClass129Array1958 = null;
        if (!Class249.method2696((byte) -124, i, i_9_, i_8_))
            return false;
        int i_10_ = i_9_ << Class96.anInt1249;
        int i_11_ = i_8_ << Class96.anInt1249;
        int i_12_ = -1 + Class177.aSArray2070[i].method3145(i_9_, 96, i_8_);
        int i_13_ = i_12_ - -class346_sub7_sub5.method3580(-32768);
        if ((((Class346_Sub7_Sub5) class346_sub7_sub5).aShort9955 ^ 0xffffffff) == -2) {
            if (!Class161.method1417(false, i_10_, i_10_, i_12_, i_10_, i_13_, Class241.anInt2692 + i_11_, i_13_, i_11_, i_11_))
                return false;
            if (!Class161.method1417(false, i_10_, i_10_, i_12_, i_10_, i_12_, Class241.anInt2692 + i_11_, i_13_, Class241.anInt2692 + i_11_, i_11_))
                return false;
            Class255.anInt2925++;
            return true;
        }
        if ((((Class346_Sub7_Sub5) class346_sub7_sub5).aShort9955 ^ 0xffffffff) == -3) {
            if (!Class161.method1417(false, i_10_, i_10_ - -Class241.anInt2692, i_12_, i_10_, i_13_, Class241.anInt2692 + i_11_, i_13_, Class241.anInt2692 + i_11_, Class241.anInt2692 + i_11_))
                return false;
            if (!Class161.method1417(false, i_10_, i_10_ - -Class241.anInt2692, i_12_, Class241.anInt2692 + i_10_, i_13_, Class241.anInt2692 + i_11_, i_12_, i_11_ - -Class241.anInt2692, i_11_ + Class241.anInt2692))
                return false;
            Class255.anInt2925++;
            return true;
        }
        if ((((Class346_Sub7_Sub5) class346_sub7_sub5).aShort9955 ^ 0xffffffff) == -5) {
            if (!Class161.method1417(false, Class241.anInt2692 + i_10_, Class241.anInt2692 + i_10_, i_12_, i_10_ - -Class241.anInt2692, i_13_, i_11_ - -Class241.anInt2692, i_13_, i_11_, i_11_))
                return false;
            if (!Class161.method1417(false, i_10_ - -Class241.anInt2692, Class241.anInt2692 + i_10_, i_12_, Class241.anInt2692 + i_10_, i_12_, Class241.anInt2692 + i_11_, i_13_, i_11_ + Class241.anInt2692, i_11_))
                return false;
            Class255.anInt2925++;
            return true;
        }
        if ((((Class346_Sub7_Sub5) class346_sub7_sub5).aShort9955 ^ 0xffffffff) == -9) {
            if (!Class161.method1417(bool, i_10_, Class241.anInt2692 + i_10_, i_12_, i_10_, i_13_, i_11_, i_13_, i_11_, i_11_))
                return false;
            if (!Class161.method1417(false, i_10_, i_10_ - -Class241.anInt2692, i_12_, i_10_ - -Class241.anInt2692, i_13_, i_11_, i_12_, i_11_, i_11_))
                return false;
            Class255.anInt2925++;
            return true;
        }
        if ((((Class346_Sub7_Sub5) class346_sub7_sub5).aShort9955 ^ 0xffffffff) == -17) {
            if (!Class226.method1803(Class84_Sub9.anInt5495, i_13_, i_12_, Class84_Sub9.anInt5495 + i_11_, i_10_, 51, Class84_Sub9.anInt5495))
                return false;
            Class255.anInt2925++;
            return true;
        }
        if ((((Class346_Sub7_Sub5) class346_sub7_sub5).aShort9955 ^ 0xffffffff) == -33) {
            if (!Class226.method1803(Class84_Sub9.anInt5495, i_13_, i_12_, i_11_ + Class84_Sub9.anInt5495, i_10_ + Class84_Sub9.anInt5495, 50, Class84_Sub9.anInt5495))
                return false;
            Class255.anInt2925++;
            return true;
        }
        if ((((Class346_Sub7_Sub5) class346_sub7_sub5).aShort9955 ^ 0xffffffff) == -65) {
            if (!Class226.method1803(Class84_Sub9.anInt5495, i_13_, i_12_, i_11_, Class84_Sub9.anInt5495 + i_10_, 38, Class84_Sub9.anInt5495))
                return false;
            Class255.anInt2925++;
            return true;
        }
        if (((Class346_Sub7_Sub5) class346_sub7_sub5).aShort9955 == 128) {
            if (!Class226.method1803(Class84_Sub9.anInt5495, i_13_, i_12_, i_11_, i_10_, 85, Class84_Sub9.anInt5495))
                return false;
            Class255.anInt2925++;
            return true;
        }
        return true;
    }

    Class167(int i, String string, int i_14_, String string_15_, long l) {
        ((Class167) this).aString1954 = string_15_;
        ((Class167) this).aString1951 = string;
        ((Class167) this).anInt1953 = i;
        ((Class167) this).anInt1952 = i_14_;
        ((Class167) this).aLong1957 = l;
    }
}
