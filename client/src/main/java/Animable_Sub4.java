/* Class346_Sub7_Sub2_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub7_Sub2_Sub4 extends Animable implements Interface16 {
    static int anInt10093;
    static char[] aCharArray10094;
    static int anInt10095;
    static int anInt10096;
    static int anInt10097;
    static int anInt10098;
    static int anInt10099;
    static int anInt10100;
    static int anInt10101;
    static int anInt10102;
    static int anInt10103;
    static int anInt10104 = 0;
    static int anInt10105;
    static int anInt10106;
    static int anInt10107;
    static int anInt10108;
    static int anInt10109;
    private boolean aBoolean10110;
    static int anInt10111;
    static int anInt10112;
    static int[] anIntArray10113 = {0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4};
    static int anInt10114;
    static int anInt10115;
    private boolean aBoolean10116 = false;
    static int anInt10117;
    static int anInt10118;
    static WorldAddress aWorldAddress_10119;
    Class150 aClass150_10120;
    private Class38 aClass38_10121;
    static int anInt10122;
    static int anInt10123;
    static int anInt10124;
    static int anInt10125;

    public final int method43(byte i) {
        anInt10105++;
        if (i != -111)
            aBoolean10116 = false;
        return (((Class150) ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120).anInt1787);
    }

    final void method3572(Interactable interactable, ha var_ha, int i, int i_0_, int i_1_, boolean bool, int i_2_) {
        anInt10112++;
        if (i_0_ <= 109)
            aWorldAddress_10119 = null;
        throw new IllegalStateException();
    }

    final void method3623(Class21 class21, int i) {
        anInt10093++;
        ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120.method1344(class21, i);
    }

    public final void method44(boolean bool) {
        anInt10118++;
        if (bool != true)
            anInt10111 = 97;
    }

    final Class38 method3575(byte i, ha var_ha) {
        anInt10109++;
        if (i >= -86)
            anInt10111 = -104;
        return aClass38_10121;
    }

    static final void method3624(int i, int[][] is) {
        Class156.anIntArrayArray1867 = is;
        anInt10115++;
        if (i != 4)
            aCharArray10094 = null;
    }

    Class346_Sub7_Sub2_Sub4(ha var_ha, ObjectDefinition class266, int i, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
        super(i, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, (((ObjectDefinition) class266).anInt3032 ^ 0xffffffff) == -2, Node_Sub11.method2238(i_11_, i_12_, -16878));
        ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120 = new Class150(var_ha, class266, i_11_, i_12_, ((Interactable) this).plane, i_3_, this, bool, i_13_);
        aBoolean10110 = ((ObjectDefinition) class266).anInt3105 != 0 && !bool;
    }

    final boolean method3574(byte i) {
        int i_14_ = 99 / ((i - 14) / 57);
        anInt10098++;
        return false;
    }

    public final void method42(boolean bool, ha var_ha) {
        ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120.method1346((byte) 39, var_ha);
        if (bool == true)
            anInt10106++;
    }

    public final int method46(byte i) {
        anInt10122++;
        int i_15_ = -14 / ((i - -57) / 53);
        return (((Class150) ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120).anInt1755);
    }

    final boolean method3568(int i) {
        int i_16_ = 48 / ((53 - i) / 45);
        anInt10114++;
        return false;
    }

    final void method3573(ha var_ha, byte i) {
        if (i > 121) {
            anInt10096++;
            Class162 class162 = ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120.method1339(var_ha, true, 262144, -21385, true);
            if (class162 != null) {
                Viewport viewport = var_ha.o();
                viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
                ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120.method1347(false, ((Animable) this).y2, viewport, ((Animable) this).x1, class162, var_ha, ((Animable) this).x2, ((Animable) this).y1, false);
            }
        }
    }

    final int method3567(byte i) {
        anInt10117++;
        if (i < 81)
            return -29;
        return ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120.method1337(-1);
    }

    final int method3580(int i) {
        if (i != -32768)
            return -53;
        anInt10097++;
        return ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120.method1341(1);
    }

    public final void method41(int i, ha var_ha) {
        ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120.method1335(var_ha, i ^ 0x599f);
        if (i != 6120)
            method3574((byte) 29);
        anInt10100++;
    }

    final boolean method3579(ha var_ha, int i, int i_17_, byte i_18_) {
        anInt10125++;
        if (i_18_ != 103)
            method3625(null, null, false);
        Class162 class162 = ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120.method1339(var_ha, false, 131072, i_18_ ^ ~0x53ef, false);
        if (class162 == null)
            return false;
        Viewport viewport = var_ha.o();
        viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
        if (Class357.aBoolean4416)
            return class162.method1420(i_17_, i, viewport, false, 0, ObjectDefinition.anInt3100);
        return class162.method1437(i_17_, i, viewport, false, 0);
    }

    public final int method40(byte i) {
        anInt10095++;
        if (i <= 63)
            anIntArray10113 = null;
        return (((Class150) ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120).anInt1754);
    }

    static final void method3625(Class310_Sub1 class310_sub1, byte[][] is, boolean bool) {
        anInt10102++;
        int[] is_19_ = {-1, 0, 0, 0, 0};
        int i = is.length;
        for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (i ^ 0xffffffff); i_20_++) {
            byte[] is_21_ = is[i_20_];
            if (is_21_ != null) {
                ByteStream class248_sub9 = new ByteStream(is_21_);
                int i_22_ = Node_Sub14_Sub36.anIntArray9544[i_20_] >> 576174888;
                int i_23_ = 0xff & Node_Sub14_Sub36.anIntArray9544[i_20_];
                int i_24_ = -Class67.baseX + i_22_ * 64;
                int i_25_ = 64 * i_23_ - Class368.baseY;
                Node_Sub37.method2594(-25926);
                class310_sub1.method3237(Class368.baseY, i_24_, Class67.baseX, class248_sub9, Class182.aClass164Array2114, -27506, i_25_);
                class310_sub1.method3255(i_24_, i_25_, class248_sub9, is_19_, (byte) -95, Class287.aHa3381);
                if (!((Class310) class310_sub1).aBoolean3604 && (Class150.anInt1751 / 8 ^ 0xffffffff) == (i_22_ ^ 0xffffffff) && ((Node_Sub19.anInt7031 / 8 ^ 0xffffffff) == (i_23_ ^ 0xffffffff)) && (is_19_[0] ^ 0xffffffff) != 0) {
                    Class223.aClass199_5198 = Class293.aClass102_3436.method728(is_19_[2], is_19_[0], -23470, is_19_[1], is_19_[3], (Class371.aClass11_4569));
                    Class115.anInt4953 = is_19_[4];
                }
            }
        }
        int i_26_ = 0;
        if (bool != false)
            anIntArray10113 = null;
        for (/**/; (i ^ 0xffffffff) < (i_26_ ^ 0xffffffff); i_26_++) {
            int i_27_ = (-Class67.baseX + 64 * (Node_Sub14_Sub36.anIntArray9544[i_26_] >> 1700054376));
            int i_28_ = ((0xff & Node_Sub14_Sub36.anIntArray9544[i_26_]) * 64 + -Class368.baseY);
            byte[] is_29_ = is[i_26_];
            if (is_29_ == null && (Node_Sub19.anInt7031 ^ 0xffffffff) > -801) {
                Node_Sub37.method2594(-25926);
                class310_sub1.method3245((byte) -14, i_28_, 64, i_27_, 64);
            }
        }
    }

    public final boolean method45(int i) {
        if (i != -28823)
            return false;
        anInt10099++;
        return ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120.method1338((byte) -127);
    }

    public static void method3626(byte i) {
        aCharArray10094 = null;
        aWorldAddress_10119 = null;
        anIntArray10113 = null;
        if (i > -29)
            method3626((byte) -88);
    }

    final Class346_Sub10 method3578(int i, ha var_ha) {
        anInt10107++;
        Class162 class162 = ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120.method1339(var_ha, true, 2048, -21385, false);
        if (class162 == null)
            return null;
        Viewport viewport = var_ha.o();
        viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
        Class346_Sub10 class346_sub10 = Class282_Sub21.method3013(aBoolean10110, (byte) 113, 1);
        ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120.method1347(false, ((Animable) this).y2, viewport, ((Animable) this).x1, class162, var_ha, ((Animable) this).x2, ((Animable) this).y1, true);
        if (!Class357.aBoolean4416)
            class162.method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), 0);
        else
            class162.method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), ObjectDefinition.anInt3100, 0);
        if ((((Class150) ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120).aClass346_Sub8_1773) != null) {
            Class338 class338 = ((Class150) ((Class346_Sub7_Sub2_Sub4) this).aClass150_10120).aClass346_Sub8_1773.method3714();
            if (!Class357.aBoolean4416)
                var_ha.a(class338);
            else
                var_ha.a(class338, ObjectDefinition.anInt3100);
        }
        aBoolean10116 = class162.F() || (((Class150) (((Class346_Sub7_Sub2_Sub4) this).aClass150_10120)).aClass346_Sub8_1773) != null;
        if (aClass38_10121 == null)
            aClass38_10121 = Class282_Sub11.method2965(((Interactable) this).y, ((Interactable) this).x, ((Interactable) this).anInt8317, 544, class162);
        else
            Class225_Sub1.method1788(aClass38_10121, ((Interactable) this).anInt8317, class162, ((Interactable) this).y, i + -89, ((Interactable) this).x);
        if (i != -1)
            method3572(null, null, 34, 42, -5, false, -24);
        return class346_sub10;
    }

    static final void method3627(int i, byte i_30_) {
        anInt10124++;
        Class54_Sub1.anInt5328 = i;
        NPC.aClass381_10591 = null;
        Class84_Sub9.aBoolean5496 = false;
        Class113.anInt1399 = -1;
        Class341.aClass248_Sub15_Sub1_3980 = null;
        Class278.anInt3236 = -1;
        Node_Sub2_Sub2.anInt8839 = 0;
        Class332.anInt3883 = 1;
        if (i_30_ > -26)
            anInt10104 = -112;
    }

    final void method3577(int i) {
        anInt10103++;
        if (i == 131072)
            throw new IllegalStateException();
    }

    final boolean method3563(boolean bool) {
        if (bool != false)
            aCharArray10094 = null;
        anInt10108++;
        return aBoolean10116;
    }

    static final String method3628(ByteStream class248_sub9, byte i) {
        anInt10123++;
        if (i != 101)
            return null;
        return Node_Sub2.method1980(32767, 0, class248_sub9);
    }

    static {
        aCharArray10094 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
