/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class70 {
    static int anInt916;
    static int anInt917;
    private int anInt918;
    private int anInt919;
    static int anInt920;
    static int anInt921;
    static int anInt922;
    int anInt923 = 0;
    int anInt924 = 70;
    static int anInt925;
    int anInt926;
    static int anInt927;
    static int anInt928;
    static int anInt929;
    private String aString930 = "";
    int anInt931;
    static int anInt932;
    int anInt933;
    private int anInt934;
    static int anInt935;
    int anInt936;
    int anInt937;
    private int anInt938;
    Class4 aClass4_939;
    int anInt940;

    final void method527(ByteStream class248_sub9, byte i) {
        if (i < 14)
            aString930 = null;
        anInt928++;
        for (; ; ) {
            int i_0_ = class248_sub9.readUnsignedByte((byte) -56);
            if (i_0_ == 0)
                break;
            method528(class248_sub9, (byte) -101, i_0_);
        }
    }

    private final void method528(ByteStream class248_sub9, byte i, int i_1_) {
        anInt917++;
        if (i_1_ != 1) {
            if ((i_1_ ^ 0xffffffff) == -3)
                ((Class70) this).anInt940 = class248_sub9.method2221(255);
            else if ((i_1_ ^ 0xffffffff) == -4)
                anInt938 = class248_sub9.readShort(-1);
            else if ((i_1_ ^ 0xffffffff) != -5) {
                if (i_1_ == 5)
                    anInt934 = class248_sub9.readShort(-1);
                else if ((i_1_ ^ 0xffffffff) == -7)
                    anInt919 = class248_sub9.readShort(-1);
                else if (i_1_ != 7) {
                    if (i_1_ == 8)
                        aString930 = class248_sub9.readJagString2(-123);
                    else if ((i_1_ ^ 0xffffffff) != -10) {
                        if (i_1_ != 10) {
                            if (i_1_ != 11) {
                                if (i_1_ != 12) {
                                    if (i_1_ != 13) {
                                        if ((i_1_ ^ 0xffffffff) == -15)
                                            ((Class70) this).anInt936 = class248_sub9.readShort(-1);
                                    } else
                                        ((Class70) this).anInt937 = class248_sub9.readUnsignedShort((byte) -10);
                                } else
                                    ((Class70) this).anInt933 = class248_sub9.readUnsignedByte((byte) 123);
                            } else
                                ((Class70) this).anInt936 = 0;
                        } else
                            ((Class70) this).anInt923 = class248_sub9.readUnsignedShort((byte) -10);
                    } else
                        ((Class70) this).anInt924 = class248_sub9.readShort(-1);
                } else
                    ((Class70) this).anInt931 = class248_sub9.readUnsignedShort((byte) -10);
            } else
                anInt918 = class248_sub9.readShort(-1);
        } else
            ((Class70) this).anInt926 = class248_sub9.readShort(-1);
        int i_2_ = -101 % ((i - 68) / 44);
    }

    final Class129 method529(int i, ha var_ha) {
        anInt925++;
        if (i < (anInt938 ^ 0xffffffff))
            return null;
        Class129 class129 = (Class129) ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2863(4, (long) anInt938);
        if (class129 == null) {
            method530(var_ha, false);
            class129 = (Class129) ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2863(4, (long) anInt938);
        }
        return class129;
    }

    private final void method530(ha var_ha, boolean bool) {
        anInt935++;
        Class381 class381 = ((Class4) ((Class70) this).aClass4_939).aClass381_136;
        if ((anInt938 ^ 0xffffffff) <= -1 && ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2863(4, (long) anInt938) == null && class381.method3920(anInt938, -75)) {
            Class157 class157 = Class157.method1382(class381, anInt938);
            ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2867((byte) 0, (long) anInt938, var_ha.a(class157, true));
        }
        if (anInt934 >= 0 && ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2863(4, (long) anInt934) == null && class381.method3920(anInt934, 123)) {
            Class157 class157 = Class157.method1382(class381, anInt934);
            ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2867((byte) 0, (long) anInt934, var_ha.a(class157, true));
        }
        if (bool != false)
            method527(null, (byte) 28);
        if ((anInt918 ^ 0xffffffff) <= -1 && ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2863(4, (long) anInt918) == null && class381.method3920(anInt918, -86)) {
            Class157 class157 = Class157.method1382(class381, anInt918);
            ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2867((byte) 0, (long) anInt918, var_ha.a(class157, true));
        }
        if (anInt919 >= 0 && ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2863(4, (long) anInt919) == null && class381.method3920(anInt919, 88)) {
            Class157 class157 = Class157.method1382(class381, anInt919);
            ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2867((byte) 0, (long) anInt919, var_ha.a(class157, true));
        }
    }

    final Class129 method531(boolean bool, ha var_ha) {
        anInt920++;
        if (anInt934 < 0)
            return null;
        Class129 class129 = (Class129) ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2863(4, (long) anInt934);
        if (class129 == null) {
            method530(var_ha, false);
            class129 = (Class129) ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2863(4, (long) anInt934);
        }
        if (bool != true)
            method529(-47, null);
        return class129;
    }

    final Class129 method532(int i, ha var_ha) {
        anInt922++;
        if ((anInt918 ^ 0xffffffff) > i)
            return null;
        Class129 class129 = (Class129) ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2863(4, (long) anInt918);
        if (class129 == null) {
            method530(var_ha, false);
            class129 = (Class129) ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2863(4, (long) anInt918);
        }
        return class129;
    }

    static final long method533(boolean bool) {
        anInt932++;
        if (bool != true)
            return -77L;
        return Class132.aClass160_1609.method1406(-21571);
    }

    static final void method534(int i, byte[] is, int i_3_, int i_4_, int i_5_, int i_6_, byte i_7_, int i_8_, byte[] is_9_) {
        anInt916++;
        if (i_7_ == -108) {
            int i_10_ = -(i_5_ >> 1075193698);
            i_5_ = -(i_5_ & 0x3);
            for (int i_11_ = -i_3_; i_11_ < 0; i_11_++) {
                for (int i_12_ = i_10_; i_12_ < 0; i_12_++) {
                    is_9_[i++] += is[i_4_++];
                    is_9_[i++] += is[i_4_++];
                    is_9_[i++] += is[i_4_++];
                    is_9_[i++] += is[i_4_++];
                }
                for (int i_13_ = i_5_; i_13_ < 0; i_13_++)
                    is_9_[i++] += is[i_4_++];
                i_4_ += i_8_;
                i += i_6_;
            }
        }
    }

    final String method535(byte i, int i_14_) {
        anInt921++;
        String string = aString930;
        if (i != 43)
            ((Class70) this).aClass4_939 = null;
        for (; ; ) {
            int i_15_ = string.indexOf("%1");
            if (i_15_ < 0)
                break;
            string = (string.substring(0, i_15_) + Node_Sub14_Sub1.method2280(i_14_, false, (byte) -67) + string.substring(2 + i_15_));
        }
        return string;
    }

    public Class70() {
        anInt918 = -1;
        ((Class70) this).anInt933 = -1;
        anInt934 = -1;
        ((Class70) this).anInt936 = -1;
        ((Class70) this).anInt937 = 0;
        ((Class70) this).anInt926 = -1;
        ((Class70) this).anInt931 = 0;
        anInt919 = -1;
        ((Class70) this).anInt940 = 16777215;
        anInt938 = -1;
    }

    final Class129 method536(ha var_ha, int i) {
        anInt929++;
        if (anInt919 < 0)
            return null;
        if (i >= -55)
            anInt919 = 73;
        Class129 class129 = (Class129) ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2863(4, (long) anInt919);
        if (class129 == null) {
            method530(var_ha, false);
            class129 = (Class129) ((Class4) ((Class70) this).aClass4_939).aClass278_142.method2863(4, (long) anInt919);
        }
        return class129;
    }
}
