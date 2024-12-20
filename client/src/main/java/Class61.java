/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class61 {
    Class39 aClass39_823;
    static d aD824;
    int anInt825;
    static int anInt826;
    boolean aBoolean827 = false;
    static int anInt828;
    static int anInt829;
    int anInt830;
    static int anInt831 = 0;
    static IncommingOpcode aIncommingOpcode_832;
    static double aDouble833;
    static int anInt834;
    static int anInt835;
    static int anInt836;

    final Class129 method473(boolean bool, int i, ha var_ha, int i_0_) {
        if (i != 681903699)
            return null;
        anInt828++;
        long l = (long) (((ha) var_ha).anInt1418 << 681903699 | ((!bool ? 0 : 262144) | (i_0_ << 1668522000 | ((Class61) this).anInt825)));
        Class129 class129 = (Class129) ((Class39) ((Class61) this).aClass39_823).aClass278_438.method2863(i + -681903695, l);
        if (class129 != null)
            return class129;
        if (!((Class39) ((Class61) this).aClass39_823).aClass381_436.method3920(((Class61) this).anInt825, 84))
            return null;
        Class157 class157 = Class157.method1379((((Class39) ((Class61) this).aClass39_823).aClass381_436), ((Class61) this).anInt825, 0);
        if (class157 != null) {
            ((Class157) class157).anInt1870 = ((Class157) class157).anInt1869 = ((Class157) class157).anInt1871 = ((Class157) class157).anInt1876 = 0;
            if (bool)
                class157.method1378();
            for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i_1_++)
                class157.method1383();
        }
        class129 = var_ha.a(class157, true);
        if (class129 != null)
            ((Class39) ((Class61) this).aClass39_823).aClass278_438.method2867((byte) 0, l, class129);
        return class129;
    }

    private final void method474(ByteStream class248_sub9, int i, int i_2_) {
        if (i_2_ == 1)
            ((Class61) this).anInt825 = class248_sub9.readShort(-1);
        else if ((i_2_ ^ 0xffffffff) != -3) {
            if (i_2_ == 3)
                ((Class61) this).aBoolean827 = true;
            else if (i_2_ == 4)
                ((Class61) this).anInt825 = -1;
        } else
            ((Class61) this).anInt830 = class248_sub9.method2221(255);
        anInt829++;
        int i_3_ = 6 / ((14 - i) / 53);
    }

    final boolean method475(byte i) {
        if (i != 80)
            aDouble833 = 0.8167371204208419;
        anInt836++;
        return ((Class39) ((Class61) this).aClass39_823).aClass381_436.method3920(((Class61) this).anInt825, 127);
    }

    static final void method476(int i) {
        anInt835++;
        if (Class158.anApplet1881 != null) {
            if (i != -3)
                anInt831 = 72;
            try {
                String string = Class158.anApplet1881.getParameter("cookiehost");
                int i_4_ = -11745 + (int) (Class118.method1112(116) / 86400000L);
                String string_5_ = ("usrdob=" + i_4_ + "; version=1; path=/; domain=" + string);
                Class78.method570((byte) -14, Class158.anApplet1881, "document.cookie=\"" + string_5_ + "\"");
            } catch (Throwable throwable) {
                /* empty */
            }
        }
    }

    final void method477(ByteStream class248_sub9, byte i) {
        int i_6_ = -118 % ((i - -34) / 58);
        for (; ; ) {
            int i_7_ = class248_sub9.readUnsignedByte((byte) 95);
            if ((i_7_ ^ 0xffffffff) == -1)
                break;
            method474(class248_sub9, -58, i_7_);
        }
        anInt826++;
    }

    public Class61() {
        /* empty */
    }

    public static void method478(byte i) {
        if (i > -22)
            method476(-29);
        aD824 = null;
        aIncommingOpcode_832 = null;
    }
}
