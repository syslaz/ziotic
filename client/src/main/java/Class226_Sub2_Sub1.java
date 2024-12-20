/* Class226_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class226_Sub2_Sub1 extends Class226_Sub2 {
    static int anInt8806;
    static int anInt8807;
    static int anInt8808;
    static int[] anIntArray8809 = {99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120};
    /*synthetic*/ static Class aClass8810;

    public static void method1810(int i) {
        anIntArray8809 = null;
        if (i != 28616)
            method1812(-22, -65, -45, 9, -47, 56, 21, 15, null);
    }

    static final int method1811(int i, byte i_0_) {
        int i_1_ = 33 / ((i_0_ - -57) / 50);
        anInt8806++;
        return i & 0xff;
    }

    static final void method1812(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, ha var_ha) {
        anInt8807++;
        Interface16 interface16 = (Interface16) RSInterface2.method3763(i, i_4_, i_5_);
        if (interface16 != null) {
            ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -15, interface16.method40((byte) 96));
            int i_9_ = 0x3 & interface16.method43((byte) -111);
            int i_10_ = interface16.method46((byte) -117);
            if (((ObjectDefinition) class266).anInt3036 != -1)
                Class278.method2866(var_ha, 4, i_6_, i_8_, i_9_, class266);
            else {
                int i_11_ = i_7_;
                if (((ObjectDefinition) class266).anInt3105 > 0)
                    i_11_ = i_3_;
                if (i_10_ == 0 || i_10_ == 2) {
                    if ((i_9_ ^ 0xffffffff) == -1)
                        var_ha.method822(i_11_, 1, 4, i_8_, i_6_);
                    else if (i_9_ == 1)
                        var_ha.method817(53, i_8_, 4, i_6_, i_11_);
                    else if (i_9_ != 2) {
                        if (i_9_ == 3)
                            var_ha.method817(126, 3 + i_8_, 4, i_6_, i_11_);
                    } else
                        var_ha.method822(i_11_, 1, 4, i_8_, 3 + i_6_);
                }
                if ((i_10_ ^ 0xffffffff) == -4) {
                    if ((i_9_ ^ 0xffffffff) == -1)
                        var_ha.method820(1, 28, 1, i_8_, i_6_, i_11_);
                    else if (i_9_ == 1)
                        var_ha.method820(1, 30, 1, i_8_, i_6_ + 3, i_11_);
                    else if (i_9_ == 2)
                        var_ha.method820(1, 86, 1, 3 + i_8_, 3 + i_6_, i_11_);
                    else if ((i_9_ ^ 0xffffffff) == -4)
                        var_ha.method820(1, i_2_ ^ 0x6, 1, i_8_ + 3, i_6_, i_11_);
                }
                if ((i_10_ ^ 0xffffffff) == -3) {
                    if ((i_9_ ^ 0xffffffff) != -1) {
                        if ((i_9_ ^ 0xffffffff) == -2)
                            var_ha.method822(i_11_, 1, 4, i_8_, 3 + i_6_);
                        else if (i_9_ == 2)
                            var_ha.method817(-94, i_8_ - -3, 4, i_6_, i_11_);
                        else if (i_9_ == 3)
                            var_ha.method822(i_11_, 1, 4, i_8_, i_6_);
                    } else
                        var_ha.method817(103, i_8_, 4, i_6_, i_11_);
                }
            }
        }
        interface16 = (Interface16) aa.method154(i, i_4_, i_5_, (aClass8810 != null ? aClass8810 : (aClass8810 = method1813("Interface16"))));
        if (interface16 != null) {
            ObjectDefinition class266 = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -74, interface16.method40((byte) 127)));
            int i_12_ = interface16.method43((byte) -111) & 0x3;
            int i_13_ = interface16.method46((byte) 121);
            if ((((ObjectDefinition) class266).anInt3036 ^ 0xffffffff) == 0) {
                if (i_13_ == 9) {
                    int i_14_ = -1118482;
                    if (((ObjectDefinition) class266).anInt3105 > 0)
                        i_14_ = -1179648;
                    if (i_12_ == 0 || i_12_ == 2)
                        var_ha.method811(3 + i_6_, i_8_, 3 + i_8_, i_14_, (byte) 49, i_6_);
                    else
                        var_ha.method811(3 + i_6_, i_8_ - -3, i_8_, i_14_, (byte) 49, i_6_);
                }
            } else
                Class278.method2866(var_ha, i_2_ ^ 0x67, i_6_, i_8_, i_12_, class266);
        }
        interface16 = (Interface16) Class346_Sub7_Sub1.method3584(i, i_4_, i_5_);
        if (i_2_ != 99)
            anIntArray8809 = null;
        if (interface16 != null) {
            ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -94, interface16.method40((byte) 64));
            int i_15_ = 0x3 & interface16.method43((byte) -111);
            if ((((ObjectDefinition) class266).anInt3036 ^ 0xffffffff) != 0)
                Class278.method2866(var_ha, 4, i_6_, i_8_, i_15_, class266);
        }
    }

    /*synthetic*/
    static Class method1813(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
