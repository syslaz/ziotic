/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class219 {
    private int anInt2508;
    private Class64 aClass64_2509 = new Class64();
    static int anInt2510;
    static int anInt2511;
    private Class65 aClass65_2512;
    static int anInt2513;
    static int anInt2514;
    static int anInt2515;
    static int anInt2516;
    static int anInt2517;
    static int anInt2518;
    static int anInt2519;
    static int anInt2520;
    static int anInt2521;
    static int anInt2522;
    static int anInt2523;
    static int anInt2524;
    private int anInt2525;

    final void method1752(int i) {
        anInt2516++;
        if (i != -28524)
            method1763(-60, 51, null, null);
        for (Node_Sub8_Sub14 class248_sub8_sub14 = (Node_Sub8_Sub14) aClass64_2509.method492(896); class248_sub8_sub14 != null; class248_sub8_sub14 = (Node_Sub8_Sub14) aClass64_2509.method490(true)) {
            if (class248_sub8_sub14.method2126((byte) -106)) {
                class248_sub8_sub14.remove(true);
                class248_sub8_sub14.method2021((byte) -26);
                anInt2508 += ((Node_Sub8_Sub14) class248_sub8_sub14).anInt9040;
            }
        }
    }

    static final void method1753(boolean bool, String string, int i, byte i_0_) {
        Class238_Sub1.method1876(-787);
        anInt2520++;
        if (i != 0) {
            ha var_ha = null;
            if (string != null) {
                var_ha = Class32.method272(0, 0, 0, Node_Sub14_Sub18.aD9354, Node_Sub3.aClass381_6826, Class297_Sub1.aCanvas8478);
                var_ha.GA(0);
                Class285 class285 = Class32.method273(0, -127, Class214.anInt2474, Class168.aClass381_1972);
                Class48 class48 = var_ha.a(class285, Class157.method1392(Class290.aClass381_3417, Class214.anInt2474, 0), true);
                Class377.method3884(false);
                Node_Sub19.method2518(class285, class48, var_ha, (byte) -27, true, string);
            }
            try {
                Class287.aHa3381 = Class32.method272(i, 0, ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub6_7357.method2946(true) * 2, Node_Sub14_Sub18.aD9354, Node_Sub3.aClass381_6826, Class297_Sub1.aCanvas8478);
                if (string != null) {
                    var_ha.GA(0);
                    Class285 class285 = Class32.method273(0, -128, Class214.anInt2474, Class168.aClass381_1972);
                    Class48 class48 = var_ha.a(class285, Class157.method1392(Class290.aClass381_3417, Class214.anInt2474, 0), true);
                    Class377.method3884(false);
                    Node_Sub19.method2518(class285, class48, var_ha, (byte) -27, true, string);
                }
                if (Class287.aHa3381.l()) {
                    boolean bool_1_ = true;
                    try {
                        bool_1_ = (((Node_Sub24) InputStream_Sub2.aClass248_Sub24_78).anInt7126 ^ 0xffffffff) < -257;
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                    za var_za;
                    if (!bool_1_)
                        var_za = Class287.aHa3381.a(104857600);
                    else
                        var_za = Class287.aHa3381.a(146800640);
                    Class287.aHa3381.a(var_za);
                }
            } catch (Throwable throwable) {
                int i_2_ = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true);
                if (i_2_ == 2)
                    Node_Sub15_Sub5.aBoolean9720 = true;
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358), (byte) -71, 0);
                method1753(bool, string, i_2_, (byte) -112);
                return;
            } finally {
                if (var_ha != null) {
                    try {
                        var_ha.method819(95);
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                }
            }
        } else {
            Class287.aHa3381 = Class32.method272(0, 0, 2 * ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub6_7357.method2946(true), Node_Sub14_Sub18.aD9354, Node_Sub3.aClass381_6826, Class297_Sub1.aCanvas8478);
            if (string != null) {
                Class287.aHa3381.GA(0);
                Class285 class285 = Class32.method273(0, -127, Class214.anInt2474, Class168.aClass381_1972);
                Class48 class48 = Class287.aHa3381.a(class285, Class157.method1392((Class290.aClass381_3417), (Class214.anInt2474), 0), true);
                Class377.method3884(false);
                Node_Sub19.method2518(class285, class48, Class287.aHa3381, (byte) -27, true, string);
            }
        }
        ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2986(!bool, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358), (byte) -71, i);
        Class367.method3834(0);
        Class287.aHa3381.g(10000);
        Class287.aHa3381.X(32);
        Class272.aViewport_3166 = Class287.aHa3381.e();
        Node_Sub14_Sub5.aViewport_9200 = Class287.aHa3381.e();
        Node_Sub14_Sub35.method2380((byte) -118);
        Class287.aHa3381.b((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub3_7337.method2932(true) ^ 0xffffffff) == -2);
        if (Class287.aHa3381.a())
            Class310.method3241(105, (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub27_7321.method3034(true) ^ 0xffffffff) == -2);
        Class177.method1590(Node_Sub22.anInt7074 >> 1831328291, Class287.aHa3381, 5, Node_Sub8_Sub4.anInt8360 >> -1368471357);
        Class332.method3400(1);
        Class199.aClass377Array2282 = null;
        Class37.aBoolean408 = false;
        Class5.aBoolean149 = true;
        if (i_0_ > -111)
            method1759(-122, 14, -53);
        Node_Sub8_Sub15.method2130((byte) -114);
    }

    final void method1754(byte i) {
        anInt2524++;
        aClass64_2509.method496((byte) -74);
        aClass65_2512.method504(-1);
        int i_3_ = 43 / ((-77 - i) / 48);
        anInt2508 = anInt2525;
    }

    final void method1755(int i, int i_4_) {
        if (i_4_ == 8192) {
            anInt2510++;
            if (Class340_Sub6.aClass296_8155 != null) {
                for (Node_Sub8_Sub14 class248_sub8_sub14 = (Node_Sub8_Sub14) aClass64_2509.method492(896); class248_sub8_sub14 != null; class248_sub8_sub14 = ((Node_Sub8_Sub14) aClass64_2509.method490(true))) {
                    if (class248_sub8_sub14.method2126((byte) -90)) {
                        if (class248_sub8_sub14.method2122(-1) == null) {
                            class248_sub8_sub14.remove(true);
                            class248_sub8_sub14.method2021((byte) -26);
                            anInt2508 += (((Node_Sub8_Sub14) class248_sub8_sub14).anInt9040);
                        }
                    } else if ((++((Node_Sub8) class248_sub8_sub14).aLong6870 ^ 0xffffffffffffffffL) < ((long) i ^ 0xffffffffffffffffL)) {
                        Node_Sub8_Sub14 class248_sub8_sub14_5_ = (Class340_Sub6.aClass296_8155.method3133(class248_sub8_sub14, i_4_ + -8193));
                        aClass65_2512.method509(-1, class248_sub8_sub14_5_, (((Node) class248_sub8_sub14).id));
                        Class79.method574(class248_sub8_sub14, class248_sub8_sub14_5_, (byte) -92);
                        class248_sub8_sub14.remove(true);
                        class248_sub8_sub14.method2021((byte) -26);
                    }
                }
            }
        }
    }

    static final void method1756(int i, int i_6_, int i_7_, boolean bool) {
        anInt2514++;
        Class229 class229 = Class122.aClass229ArrayArray1524[i][i_6_];
        if (bool == false)
            Class338.method3427((class229 != null ? class229 : Node_Sub18.aClass229_7016), 0, i_7_);
    }

    private final void method1757(byte i, Interface9 interface9) {
        anInt2522++;
        long l = interface9.method31((byte) -92);
        if (i != 110)
            anInt2525 = 66;
        for (Node_Sub8_Sub14 class248_sub8_sub14 = (Node_Sub8_Sub14) aClass65_2512.method501(l, (byte) 31); class248_sub8_sub14 != null; class248_sub8_sub14 = (Node_Sub8_Sub14) aClass65_2512.method507((byte) -78)) {
            if (((Node_Sub8_Sub14) class248_sub8_sub14).anInterface9_9042.method30(interface9, true)) {
                method1758(class248_sub8_sub14, (byte) 74);
                break;
            }
        }
    }

    private final void method1758(Node_Sub8_Sub14 class248_sub8_sub14, byte i) {
        if (class248_sub8_sub14 != null) {
            class248_sub8_sub14.remove(true);
            class248_sub8_sub14.method2021((byte) -26);
            anInt2508 += ((Node_Sub8_Sub14) class248_sub8_sub14).anInt9040;
        }
        anInt2517++;
        if (i <= 35)
            method1760(118);
    }

    static final boolean method1759(int i, int i_8_, int i_9_) {
        anInt2519++;
        if (i_9_ != 0)
            return false;
        return (((0x2000 & i_8_ ^ 0xffffffff) != -1 | Class282_Sub11.method2962(91, i, i_8_) | Class74.method556(i, true, i_8_)) & Class50.method399(i_8_, i, false));
    }

    final int method1760(int i) {
        if (i < 27)
            method1756(-28, -22, -28, false);
        anInt2513++;
        return anInt2525;
    }

    final Object method1761(byte i, Interface9 interface9) {
        anInt2518++;
        long l = interface9.method31((byte) 24);
        for (Node_Sub8_Sub14 class248_sub8_sub14 = (Node_Sub8_Sub14) aClass65_2512.method501(l, (byte) 31); class248_sub8_sub14 != null; class248_sub8_sub14 = (Node_Sub8_Sub14) aClass65_2512.method507((byte) 120)) {
            if (((Node_Sub8_Sub14) class248_sub8_sub14).anInterface9_9042.method30(interface9, true)) {
                Object object = class248_sub8_sub14.method2122(-1);
                if (object == null) {
                    class248_sub8_sub14.remove(true);
                    class248_sub8_sub14.method2021((byte) -26);
                    anInt2508 += (((Node_Sub8_Sub14) class248_sub8_sub14).anInt9040);
                } else {
                    if (class248_sub8_sub14.method2126((byte) -119)) {
                        Node_Sub8_Sub14_Sub1 class248_sub8_sub14_sub1 = (new Node_Sub8_Sub14_Sub1(interface9, object, (((Node_Sub8_Sub14) class248_sub8_sub14).anInt9040)));
                        aClass65_2512.method509(-1, class248_sub8_sub14_sub1, (((Node) class248_sub8_sub14).id));
                        aClass64_2509.method491(class248_sub8_sub14_sub1, -111);
                        ((Node_Sub8) class248_sub8_sub14_sub1).aLong6870 = 0L;
                        class248_sub8_sub14.remove(true);
                        class248_sub8_sub14.method2021((byte) -26);
                    } else {
                        aClass64_2509.method491(class248_sub8_sub14, -120);
                        ((Node_Sub8) class248_sub8_sub14).aLong6870 = 0L;
                    }
                    return object;
                }
            }
        }
        if (i != 5)
            method1757((byte) -69, null);
        return null;
    }

    final int method1762(int i) {
        anInt2511++;
        if (i != 2)
            return 7;
        return anInt2508;
    }

    private final void method1763(int i, int i_10_, Object object, Interface9 interface9) {
        anInt2515++;
        if ((i_10_ ^ 0xffffffff) < (anInt2525 ^ 0xffffffff))
            throw new IllegalStateException("s>cs");
        method1757((byte) 110, interface9);
        anInt2508 -= i_10_;
        while ((anInt2508 ^ 0xffffffff) > -1) {
            Node_Sub8_Sub14 class248_sub8_sub14 = (Node_Sub8_Sub14) aClass64_2509.method497(896);
            method1758(class248_sub8_sub14, (byte) 46);
        }
        Node_Sub8_Sub14_Sub1 class248_sub8_sub14_sub1 = new Node_Sub8_Sub14_Sub1(interface9, object, i_10_);
        if (i != 4296)
            method1754((byte) 102);
        aClass65_2512.method509(-1, class248_sub8_sub14_sub1, interface9.method31((byte) -94));
        aClass64_2509.method491(class248_sub8_sub14_sub1, -124);
        ((Node_Sub8) class248_sub8_sub14_sub1).aLong6870 = 0L;
    }

    final void method1764(byte i, Object object, Interface9 interface9) {
        method1763(4296, 1, object, interface9);
        anInt2523++;
        if (i != 3)
            method1753(true, null, 80, (byte) 86);
    }

    Class219(int i) {
        anInt2525 = i;
        anInt2508 = i;
        int i_11_;
        for (i_11_ = 1; i > i_11_ + i_11_; i_11_ += i_11_) {
            /* empty */
        }
        aClass65_2512 = new Class65(i_11_);
    }
}
