/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class278 {
    static int anInt3221;
    static int anInt3222;
    private Class64 aClass64_3223 = new Class64();
    static int anInt3224;
    static int anInt3225;
    static int anInt3226;
    static int anInt3227;
    static int anInt3228;
    private Class65 aClass65_3229;
    static int anInt3230;
    static int anInt3231;
    static int anInt3232;
    static int anInt3233;
    static int anInt3234;
    static int anInt3235;
    static int anInt3236;
    static int anInt3237;
    private int anInt3238;
    static int anInt3239;
    private int anInt3240;

    static boolean method2861(boolean bool, boolean bool_0_) {
        return bool | bool_0_;
    }

    final Object method2862(int i) {
        if (i != 4)
            method2871(81L, -29);
        anInt3239++;
        Node_Sub8_Sub16 class248_sub8_sub16 = (Node_Sub8_Sub16) aClass65_3229.method512(false);
        while (class248_sub8_sub16 != null) {
            Object object = class248_sub8_sub16.method2135(i + 71);
            if (object != null)
                return object;
            Node_Sub8_Sub16 class248_sub8_sub16_1_ = class248_sub8_sub16;
            class248_sub8_sub16 = (Node_Sub8_Sub16) aClass65_3229.method512(false);
            class248_sub8_sub16_1_.remove(true);
            class248_sub8_sub16_1_.method2021((byte) -26);
            anInt3238 += ((Node_Sub8_Sub16) class248_sub8_sub16_1_).anInt9050;
        }
        return null;
    }

    final Object method2863(int i, long l) {
        if (i != 4)
            return null;
        anInt3235++;
        Node_Sub8_Sub16 class248_sub8_sub16 = (Node_Sub8_Sub16) aClass65_3229.method501(l, (byte) 31);
        if (class248_sub8_sub16 == null)
            return null;
        Object object = class248_sub8_sub16.method2135(75);
        if (object == null) {
            class248_sub8_sub16.remove(true);
            class248_sub8_sub16.method2021((byte) -26);
            anInt3238 += ((Node_Sub8_Sub16) class248_sub8_sub16).anInt9050;
            return null;
        }
        if (class248_sub8_sub16.method2136((byte) 87)) {
            Node_Sub8_Sub16_Sub1 class248_sub8_sub16_sub1 = new Node_Sub8_Sub16_Sub1(object, (((Node_Sub8_Sub16) class248_sub8_sub16).anInt9050));
            aClass65_3229.method509(-1, class248_sub8_sub16_sub1, (((Node) class248_sub8_sub16).id));
            aClass64_3223.method491(class248_sub8_sub16_sub1, i ^ ~0x75);
            ((Node_Sub8) class248_sub8_sub16_sub1).aLong6870 = 0L;
            class248_sub8_sub16.remove(true);
            class248_sub8_sub16.method2021((byte) -26);
        } else {
            aClass64_3223.method491(class248_sub8_sub16, -106);
            ((Node_Sub8) class248_sub8_sub16).aLong6870 = 0L;
        }
        return object;
    }

    final void method2864(int i, int i_2_) {
        anInt3222++;
        if (i_2_ != -15782)
            anInt3236 = -93;
        if (Class145.aClass212_1717 != null) {
            for (Node_Sub8_Sub16 class248_sub8_sub16 = ((Node_Sub8_Sub16) aClass64_3223.method492(i_2_ ^ ~0x3e25)); class248_sub8_sub16 != null; class248_sub8_sub16 = (Node_Sub8_Sub16) aClass64_3223.method490(true)) {
                if (!class248_sub8_sub16.method2136((byte) 84)) {
                    if ((long) i < ++((Node_Sub8) class248_sub8_sub16).aLong6870) {
                        Node_Sub8_Sub16 class248_sub8_sub16_3_ = Class145.aClass212_1717.method1730(class248_sub8_sub16, 2);
                        aClass65_3229.method509(-1, class248_sub8_sub16_3_, (((Node) class248_sub8_sub16).id));
                        Class79.method574(class248_sub8_sub16, class248_sub8_sub16_3_, (byte) -101);
                        class248_sub8_sub16.remove(true);
                        class248_sub8_sub16.method2021((byte) -26);
                    }
                } else if (class248_sub8_sub16.method2135(75) == null) {
                    class248_sub8_sub16.remove(true);
                    class248_sub8_sub16.method2021((byte) -26);
                    anInt3238 += (((Node_Sub8_Sub16) class248_sub8_sub16).anInt9050);
                }
            }
        }
    }

    final Object method2865(int i) {
        anInt3226++;
        if (i != 3)
            method2867((byte) 98, -32L, null);
        Node_Sub8_Sub16 class248_sub8_sub16 = (Node_Sub8_Sub16) aClass65_3229.method510(true);
        while (class248_sub8_sub16 != null) {
            Object object = class248_sub8_sub16.method2135(75);
            if (object != null)
                return object;
            Node_Sub8_Sub16 class248_sub8_sub16_4_ = class248_sub8_sub16;
            class248_sub8_sub16 = (Node_Sub8_Sub16) aClass65_3229.method512(false);
            class248_sub8_sub16_4_.remove(true);
            class248_sub8_sub16_4_.method2021((byte) -26);
            anInt3238 += ((Node_Sub8_Sub16) class248_sub8_sub16_4_).anInt9050;
        }
        return null;
    }

    static final void method2866(ha var_ha, int i, int i_5_, int i_6_, int i_7_, ObjectDefinition class266) {
        anInt3221++;
        Class61 class61 = Class19.aClass39_302.method293(((ObjectDefinition) class266).anInt3036, 126);
        if ((((Class61) class61).anInt825 ^ 0xffffffff) != 0) {
            if (((ObjectDefinition) class266).aBoolean3055) {
                i_7_ += ((ObjectDefinition) class266).anInt3056;
                i_7_ &= 0x3;
            } else
                i_7_ = 0;
            Class129 class129 = class61.method473(((ObjectDefinition) class266).aBoolean3061, i ^ 0x28a50657, var_ha, i_7_);
            if (class129 != null) {
                int i_8_ = ((ObjectDefinition) class266).anInt3097;
                int i_9_ = ((ObjectDefinition) class266).anInt3065;
                if ((0x1 & i_7_ ^ 0xffffffff) == -2) {
                    i_9_ = ((ObjectDefinition) class266).anInt3097;
                    i_8_ = ((ObjectDefinition) class266).anInt3065;
                }
                int i_10_ = class129.method1169();
                int i_11_ = class129.method1181();
                if (((Class61) class61).aBoolean827) {
                    i_10_ = 4 * i_8_;
                    i_11_ = i_9_ * 4;
                }
                if ((((Class61) class61).anInt830 ^ 0xffffffff) != -1)
                    class129.method1166(i_5_, 4 - (4 * i_9_ - i_6_), i_10_, i_11_, 0, (~0xffffff | ((Class61) class61).anInt830), 1);
                else
                    class129.method1185(i_5_, i_6_ + -((i_9_ - 1) * 4), i_10_, i_11_);
                if (i != 4)
                    anInt3236 = 12;
            }
        }
    }

    final void method2867(byte i, long l, Object object) {
        if (i != 0)
            method2864(43, -24);
        anInt3233++;
        method2873((byte) -71, 1, l, object);
    }

    final int method2868(int i) {
        anInt3224++;
        int i_12_ = 122 % ((48 - i) / 50);
        return anInt3238;
    }

    final void method2869(int i) {
        anInt3225++;
        if (i != 0)
            aClass64_3223 = null;
        for (Node_Sub8_Sub16 class248_sub8_sub16 = (Node_Sub8_Sub16) aClass64_3223.method492(896); class248_sub8_sub16 != null; class248_sub8_sub16 = (Node_Sub8_Sub16) aClass64_3223.method490(true)) {
            if (class248_sub8_sub16.method2136((byte) 80)) {
                class248_sub8_sub16.remove(true);
                class248_sub8_sub16.method2021((byte) -26);
                anInt3238 += ((Node_Sub8_Sub16) class248_sub8_sub16).anInt9050;
            }
        }
    }

    final int method2870(boolean bool) {
        if (bool != false)
            method2873((byte) 1, -50, 102L, null);
        anInt3227++;
        return anInt3240;
    }

    private final void method2871(long l, int i) {
        anInt3228++;
        Node_Sub8_Sub16 class248_sub8_sub16 = (Node_Sub8_Sub16) aClass65_3229.method501(l, (byte) 31);
        method2874((byte) -43, class248_sub8_sub16);
        if (i < 37)
            method2868(-89);
    }

    final void method2872(byte i) {
        anInt3232++;
        aClass64_3223.method496((byte) -74);
        aClass65_3229.method504(-1);
        anInt3238 = anInt3240;
        if (i != -78)
            aClass64_3223 = null;
    }

    Class278(int i) {
        this(i, i);
    }

    final void method2873(byte i, int i_13_, long l, Object object) {
        anInt3237++;
        if ((i_13_ ^ 0xffffffff) < (anInt3240 ^ 0xffffffff))
            throw new IllegalStateException("s>cs");
        method2871(l, 107);
        anInt3238 -= i_13_;
        while (anInt3238 < 0) {
            Node_Sub8_Sub16 class248_sub8_sub16 = (Node_Sub8_Sub16) aClass64_3223.method497(896);
            method2874((byte) -93, class248_sub8_sub16);
        }
        Node_Sub8_Sub16_Sub1 class248_sub8_sub16_sub1 = new Node_Sub8_Sub16_Sub1(object, i_13_);
        aClass65_3229.method509(-1, class248_sub8_sub16_sub1, l);
        aClass64_3223.method491(class248_sub8_sub16_sub1, i + -44);
        ((Node_Sub8) class248_sub8_sub16_sub1).aLong6870 = 0L;
        if (i != -71)
            aClass64_3223 = null;
    }

    private final void method2874(byte i, Node_Sub8_Sub16 class248_sub8_sub16) {
        if (class248_sub8_sub16 != null) {
            class248_sub8_sub16.remove(true);
            class248_sub8_sub16.method2021((byte) -26);
            anInt3238 += ((Node_Sub8_Sub16) class248_sub8_sub16).anInt9050;
        }
        anInt3230++;
        if (i > -12)
            method2871(-34L, -70);
    }

    final int method2875(boolean bool) {
        if (bool != false)
            aClass64_3223 = null;
        anInt3231++;
        int i = 0;
        for (Node_Sub8_Sub16 class248_sub8_sub16 = (Node_Sub8_Sub16) aClass64_3223.method492(896); class248_sub8_sub16 != null; class248_sub8_sub16 = (Node_Sub8_Sub16) aClass64_3223.method490(true)) {
            if (!class248_sub8_sub16.method2136((byte) 46))
                i++;
        }
        return i;
    }

    Class278(int i, int i_14_) {
        anInt3238 = i;
        anInt3240 = i;
        int i_15_;
        for (i_15_ = 1; i > i_15_ + i_15_ && (i_15_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff); i_15_ += i_15_) {
            /* empty */
        }
        aClass65_3229 = new Class65(i_15_);
    }
}
