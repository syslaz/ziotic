/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class229 {
    float aFloat2579;
    static boolean aBoolean2580;
    int anInt2581;
    static Class331 aClass331_2582;
    int anInt2583;
    Class316 aClass316_2584;
    static int anInt2585;
    float aFloat2586 = 1.0F;
    int anInt2587;
    float aFloat2588;
    float aFloat2589;
    static int anInt2590 = 0;
    static int[] anIntArray2591;
    static int anInt2592;
    float aFloat2593;
    static int anInt2594;
    int anInt2595;
    static int anInt2596;
    float aFloat2597 = 1.0F;
    int anInt2598;
    static int anInt2599;
    int anInt2600;

    static final void method1829(int i, int i_0_, int i_1_, Class381 class381, boolean bool, int i_2_, int i_3_) {
        if (i_1_ > 0) {
            Class341.aClass248_Sub15_Sub1_3980 = null;
            Class84_Sub9.aBoolean5496 = bool;
            Class278.anInt3236 = i;
            Node_Sub2_Sub2.anInt8839 = i_2_;
            Class332.anInt3883 = 1;
            NPC.aClass381_10591 = class381;
            Class113.anInt1399 = i_0_;
            Class54_Sub1.anInt5328 = Class161.aClass248_Sub15_Sub1_1895.method2418(true) / i_1_;
            if ((Class54_Sub1.anInt5328 ^ 0xffffffff) > -2)
                Class54_Sub1.anInt5328 = 1;
        } else
            Class132.method1216(bool, 67, i, i_0_, i_2_, class381);
        if (i_3_ >= -90)
            method1832(-26, 51, (byte) 65);
        anInt2596++;
    }

    final boolean method1830(int i, Class229 class229_4_) {
        if (i != 2)
            method1832(48, 44, (byte) 65);
        anInt2599++;
        if (((Class229) this).anInt2583 != ((Class229) class229_4_).anInt2583 || (((Class229) class229_4_).aFloat2588 != ((Class229) this).aFloat2588) || (((Class229) class229_4_).aFloat2589 != ((Class229) this).aFloat2589) || (((Class229) this).aFloat2593 != ((Class229) class229_4_).aFloat2593) || (((Class229) class229_4_).aFloat2579 != ((Class229) this).aFloat2579) || (((Class229) class229_4_).aFloat2597 != ((Class229) this).aFloat2597) || (((Class229) class229_4_).aFloat2586 != ((Class229) this).aFloat2586) || ((((Class229) this).anInt2598 ^ 0xffffffff) != (((Class229) class229_4_).anInt2598 ^ 0xffffffff)) || ((((Class229) class229_4_).anInt2581 ^ 0xffffffff) != (((Class229) this).anInt2581 ^ 0xffffffff)) || (((Class229) class229_4_).aClass316_2584 != ((Class229) this).aClass316_2584))
            return false;
        return true;
    }

    static final Class147_Sub1 method1831(int i) {
        Class311.anInt3612 = 0;
        anInt2594++;
        if (i >= -65)
            return null;
        return Class26.method252(-144254536);
    }

    static final boolean method1832(int i, int i_5_, byte i_6_) {
        int i_7_ = 43 / ((i_6_ - -61) / 59);
        anInt2592++;
        return (Class112_Sub2.method800(true, i, i_5_) & ((i_5_ & 0x2000 ^ 0xffffffff) != -1 | RSInterface2.method3766(-47, i_5_, i) | Class282_Sub18.method2996(i, 4, i_5_)));
    }

    final void method1833(ByteStream class248_sub9, byte i) {
        if (i >= -52)
            ((Class229) this).anInt2583 = 61;
        ((Class229) this).aFloat2597 = (float) (class248_sub9.readUnsignedByte((byte) 123) * 8) / 255.0F;
        anInt2585++;
        ((Class229) this).aFloat2579 = (float) (8 * class248_sub9.readUnsignedByte((byte) -76)) / 255.0F;
        ((Class229) this).aFloat2586 = (float) (class248_sub9.readUnsignedByte((byte) -81) * 8) / 255.0F;
    }

    public static void method1834(boolean bool) {
        if (bool != false)
            method1831(-13);
        anIntArray2591 = null;
        aClass331_2582 = null;
    }

    public Class229() {
        ((Class229) this).aFloat2579 = 0.25F;
        ((Class229) this).anInt2581 = 0;
        ((Class229) this).anInt2587 = -50;
        ((Class229) this).aFloat2593 = 1.2F;
        ((Class229) this).aFloat2589 = 0.69921875F;
        ((Class229) this).aFloat2588 = 1.1523438F;
        ((Class229) this).anInt2583 = Class83.anInt1033;
        ((Class229) this).anInt2598 = Node_Sub14_Sub33.anInt9510;
        ((Class229) this).aClass316_2584 = Class279_Sub1_Sub2.aClass316_9819;
        ((Class229) this).anInt2600 = -50;
        ((Class229) this).anInt2595 = -60;
    }

    Class229(ByteStream class248_sub9) {
        ((Class229) this).aFloat2579 = 0.25F;
        int i = class248_sub9.readUnsignedByte((byte) 119);
        if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub11_7347.method2963(true) == 1 && Class282_Sub25.aHa7855.r() > 0) {
            if ((0x1 & i) == 0)
                ((Class229) this).anInt2583 = Class83.anInt1033;
            else
                ((Class229) this).anInt2583 = class248_sub9.readInt(false);
            if ((i & 0x2) != 0)
                ((Class229) this).aFloat2588 = (float) class248_sub9.readShort(-1) / 256.0F;
            else
                ((Class229) this).aFloat2588 = 1.1523438F;
            if ((0x4 & i ^ 0xffffffff) == -1)
                ((Class229) this).aFloat2589 = 0.69921875F;
            else
                ((Class229) this).aFloat2589 = (float) class248_sub9.readShort(-1) / 256.0F;
            if ((i & 0x8 ^ 0xffffffff) == -1)
                ((Class229) this).aFloat2593 = 1.2F;
            else
                ((Class229) this).aFloat2593 = (float) class248_sub9.readShort(-1) / 256.0F;
        } else {
            if ((0x1 & i ^ 0xffffffff) != -1)
                class248_sub9.readInt(false);
            if ((0x2 & i) != 0)
                class248_sub9.readShort(-1);
            if ((0x4 & i) != 0)
                class248_sub9.readShort(-1);
            if ((i & 0x8) != 0)
                class248_sub9.readShort(-1);
            ((Class229) this).aFloat2589 = 0.69921875F;
            ((Class229) this).anInt2583 = Class83.anInt1033;
            ((Class229) this).aFloat2593 = 1.2F;
            ((Class229) this).aFloat2588 = 1.1523438F;
        }
        if ((0x10 & i ^ 0xffffffff) != -1) {
            ((Class229) this).anInt2587 = class248_sub9.readUnsignedShort((byte) -10);
            ((Class229) this).anInt2595 = class248_sub9.readUnsignedShort((byte) -10);
            ((Class229) this).anInt2600 = class248_sub9.readUnsignedShort((byte) -10);
        } else {
            ((Class229) this).anInt2587 = -50;
            ((Class229) this).anInt2600 = -50;
            ((Class229) this).anInt2595 = -60;
        }
        if ((i & 0x20) == 0)
            ((Class229) this).anInt2598 = Node_Sub14_Sub33.anInt9510;
        else
            ((Class229) this).anInt2598 = class248_sub9.readInt(false);
        if ((0x40 & i) != 0)
            ((Class229) this).anInt2581 = class248_sub9.readShort(-1);
        else
            ((Class229) this).anInt2581 = 0;
        if ((i & 0x80) == 0)
            ((Class229) this).aClass316_2584 = Class279_Sub1_Sub2.aClass316_9819;
        else {
            int i_8_ = class248_sub9.readShort(-1);
            int i_9_ = class248_sub9.readShort(-1);
            int i_10_ = class248_sub9.readShort(-1);
            int i_11_ = class248_sub9.readShort(-1);
            int i_12_ = class248_sub9.readShort(-1);
            int i_13_ = class248_sub9.readShort(-1);
            ((Class229) this).aClass316_2584 = Class337.method3421((byte) -121, i_9_, i_11_, i_10_, i_13_, i_12_, i_8_);
        }
    }

    static {
        aBoolean2580 = false;
        anIntArray2591 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
    }
}
