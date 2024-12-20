/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class74 implements Runnable {
    static int anInt945;
    static int anInt946;
    static int anInt947;
    static int anInt948;
    private boolean aBoolean949;
    static int anInt950;
    static int anInt951;
    static int anInt952;
    static int anInt953;
    static int anInt954 = 0;
    static int anInt955;
    private Interface17 anInterface17_956 = new Class148();
    static int anInt957;
    static int anInt958;
    static int anInt959;
    static int anInt960;
    private volatile boolean aBoolean961;
    static int anInt962 = 0;
    static int anInt963;
    private long aLong964;
    private Class276 aClass276_965;
    private int anInt966;
    private Interface17 anInterface17_967 = null;
    private long aLong968;
    private String aString969;
    static int anInt970;
    private int anInt971;

    final Class276 method544(int i) {
        if (i != 255)
            aBoolean961 = false;
        anInt960++;
        return aClass276_965;
    }

    final int method545(byte i) {
        anInt958++;
        if (i != 43)
            aClass276_965 = null;
        return anInt966;
    }

    final int method546(int i) {
        if (i != 0)
            method553(null, -17, null, -85L, 40);
        anInt948++;
        return anInt971;
    }

    final synchronized void method547(Interface17 interface17, boolean bool) {
        if (bool == true) {
            anInt951++;
            anInterface17_967 = anInterface17_956;
            anInterface17_956 = interface17;
            aLong968 = Class118.method1112(116);
        }
    }

    final void method548(int i) {
        anInt952++;
        if (i == 1)
            aBoolean961 = true;
    }

    final long method549(byte i) {
        if (i > -68)
            method551((byte) 77);
        anInt946++;
        return aLong964;
    }

    static final int method550(int i, char c, byte i_0_) {
        anInt959++;
        int i_1_ = c << -883793436;
        int i_2_ = 27 / ((-54 - i_0_) / 61);
        if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
            int i_3_ = Character.toLowerCase(c);
            i_1_ = (i_3_ << -1573550172) + 1;
        }
        return i_1_;
    }

    final int method551(byte i) {
        anInt955++;
        if (aClass276_965 == null)
            return 0;
        int i_4_ = aClass276_965.method2854(4);
        if (((Class276) aClass276_965).aBoolean3184 && ((Class276) aClass276_965).anInt3181 > anInt966)
            return anInt966 - -1;
        if (i_4_ < 0 || Class347.aClass276Array4131.length - 1 <= i_4_)
            return 100;
        int i_5_ = -75 % ((i - 19) / 47);
        if (((Class276) aClass276_965).anInt3182 == anInt966)
            return ((Class276) aClass276_965).anInt3181;
        return ((Class276) aClass276_965).anInt3182;
    }

    final synchronized boolean method552(byte i) {
        if (i <= 60)
            aLong964 = -78L;
        anInt947++;
        return anInterface17_956.method56(aLong968, -3650);
    }

    final synchronized void method553(String string, int i, Class276 class276, long l, int i_6_) {
        anInt966 = i;
        aClass276_965 = class276;
        anInt950++;
        aString969 = string;
        if (i_6_ == -1484216776)
            aLong964 = l;
    }

    public final void run() {
        while (!aBoolean961) {
            long l = Class118.method1112(116);
            synchronized (this) {
                try {
                    anInt971++;
                    if (anInterface17_956 instanceof Class148)
                        anInterface17_956.method55(aBoolean949, (byte) -123);
                    else {
                        long l_7_ = Class118.method1112(116);
                        if (Class287.aHa3381 == null || anInterface17_967 == null || (anInterface17_967.method53(-11222) ^ 0xffffffff) == -1 || (aLong968 < l_7_ - (long) anInterface17_967.method53(-11222))) {
                            if (anInterface17_967 != null) {
                                aBoolean949 = true;
                                anInterface17_967.method54(31639);
                                anInterface17_967 = null;
                            }
                            if (aBoolean949) {
                                Class377.method3884(false);
                                if (Class287.aHa3381 != null)
                                    Class287.aHa3381.GA(0);
                            }
                            anInterface17_956.method55(aBoolean949 || (Class287.aHa3381 != null && Class287.aHa3381.d()), (byte) 93);
                        } else {
                            int i = (int) ((-aLong968 + l_7_) * 255L / (long) anInterface17_967.method53(-11222));
                            int i_8_ = 255 - i;
                            i_8_ = 0xffffff | i_8_ << -1076608872;
                            Class377.method3884(false);
                            i = i << -1484216776 | 0xffffff;
                            Class287.aHa3381.GA(0);
                            Class129 class129 = Class287.aHa3381.a(Class146.anInt1724, Class282_Sub20.anInt7800, true);
                            Class287.aHa3381.method816(class129, 25109);
                            anInterface17_967.method55(true, (byte) -113);
                            Class287.aHa3381.z();
                            class129.method1178(0, 0, 0, i_8_, 1);
                            Class287.aHa3381.method816(class129, 25109);
                            Class287.aHa3381.GA(0);
                            anInterface17_956.method55(true, (byte) -127);
                            Class287.aHa3381.z();
                            class129.method1178(0, 0, 0, i, 1);
                        }
                        try {
                            if (Class287.aHa3381 != null && !(anInterface17_956 instanceof Class148))
                                Class287.aHa3381.method821(5);
                        } catch (Exception_Sub1 exception_sub1) {
                            Class282_Sub14.method2975((exception_sub1.getMessage() + " (Recovered) " + Node_Sub8_Sub16_Sub1.aClient10301.method95(102)), exception_sub1, 1);
                            Node_Sub15_Sub5.method2495(true, 75, 0);
                        }
                    }
                    java.awt.Container container;
                    if (Class300.aFrame3494 == null) {
                        if (Class158.anApplet1881 == null)
                            container = Class54_Sub1.anApplet_Sub1_5332;
                        else
                            container = Class158.anApplet1881;
                    } else
                        container = Class300.aFrame3494;
                    container.getSize();
                    container.getSize();
                    if (Class300.aFrame3494 == container)
                        Class300.aFrame3494.getInsets();
                    aBoolean949 = false;
                    if (Class287.aHa3381 != null && !(anInterface17_956 instanceof Class148) && ((aClass276_965.method2854(4) ^ 0xffffffff) > (Class276.aClass276_3203.method2854(4) ^ 0xffffffff)))
                        Class66.method517(-2);
                } catch (Exception exception) {
                    continue;
                }
            }
            long l_9_ = Class118.method1112(116);
            int i = (int) (20L + l + -l_9_);
            if (i > 0)
                Class279_Sub2.method2897((byte) -124, (long) i);
        }
        anInt970++;
    }

    final synchronized void method554(byte i) {
        aBoolean949 = true;
        if (i == 43)
            anInt953++;
    }

    final String method555(byte i) {
        if (i != 21)
            anInt963 = -96;
        anInt945++;
        return aString969;
    }

    public Class74() {
        /* empty */
    }

    static final boolean method556(int i, boolean bool, int i_10_) {
        if (bool != true)
            method556(-6, true, -119);
        anInt957++;
        if ((0x10000 & i_10_) == 0)
            return false;
        return true;
    }
}
