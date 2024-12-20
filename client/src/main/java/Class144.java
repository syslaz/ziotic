/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class144 {
    static int anInt1691 = -2;
    static Class168 aClass168_1692 = new Class168(12, 0, 1, 0);
    static int anInt1693;
    static int anInt1694;
    static int anInt1695;
    int anInt1696;
    static int anInt1697;
    private Class278 aClass278_1698 = new Class278(64);
    static int anInt1699;
    private Class381 aClass381_1700;
    static int anInt1701;
    static Class293 aClass293_1702 = new Class293();
    int anInt1703 = 0;
    static Interactable[] aInteractableArray1704;

    static final String method1298(String string, boolean bool) {
        anInt1695++;
        if (string == null)
            return null;
        int i = 0;
        int i_0_;
        for (i_0_ = string.length(); (i ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i++) {
            if (!Node_Sub2_Sub1.method1987(-23324, string.charAt(i)))
                break;
        }
        for (/**/; ((i ^ 0xffffffff) > (i_0_ ^ 0xffffffff) && Node_Sub2_Sub1.method1987(-23324, string.charAt(i_0_ - 1))); i_0_--) {
            /* empty */
        }
        int i_1_ = i_0_ + -i;
        if ((i_1_ ^ 0xffffffff) > -2 || i_1_ > 12)
            return null;
        StringBuffer stringbuffer = new StringBuffer(i_1_);
        if (bool != true)
            aClass168_1692 = null;
        for (int i_2_ = i; (i_0_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
            char c = string.charAt(i_2_);
            if (Class85.method639(-32723, c)) {
                char c_3_ = Class127.method1157((byte) 119, c);
                if ((c_3_ ^ 0xffffffff) != -1)
                    stringbuffer.append(c_3_);
            }
        }
        if (stringbuffer.length() == 0)
            return null;
        return stringbuffer.toString();
    }

    final Class145 method1299(int i, int i_4_) {
        anInt1699++;
        Class145 class145;
        synchronized (aClass278_1698) {
            class145 = (Class145) aClass278_1698.method2863(4, (long) i);
        }
        if (class145 != null)
            return class145;
        byte[] is;
        synchronized (aClass381_1700) {
            is = aClass381_1700.method3922((byte) 127, 4, i);
        }
        if (i_4_ >= -7)
            anInt1691 = 39;
        class145 = new Class145();
        ((Class145) class145).anInt1707 = i;
        ((Class145) class145).aClass144_1719 = this;
        if (is != null)
            class145.method1305(false, new ByteStream(is));
        class145.method1307(1652868904);
        synchronized (aClass278_1698) {
            aClass278_1698.method2867((byte) 0, (long) i, class145);
        }
        return class145;
    }

    public static void method1300(int i) {
        aInteractableArray1704 = null;
        if (i > -101)
            aInteractableArray1704 = null;
        aClass293_1702 = null;
        aClass168_1692 = null;
    }

    final void method1301(byte i, int i_5_) {
        synchronized (aClass278_1698) {
            aClass278_1698.method2864(i_5_, -15782);
        }
        if (i == -103)
            anInt1697++;
    }

    final void method1302(boolean bool) {
        anInt1693++;
        synchronized (aClass278_1698) {
            aClass278_1698.method2869(0);
            if (bool != false)
                aClass278_1698 = null;
        }
    }

    final void method1303(byte i) {
        anInt1694++;
        synchronized (aClass278_1698) {
            if (i <= 111)
                method1304(64, -22, -67L);
            aClass278_1698.method2872((byte) -78);
        }
    }

    static final String method1304(int i, int i_6_, long l) {
        Class99.method712(l, -8474);
        anInt1701++;
        int i_7_ = Node_Sub8_Sub9.aCalendar8968.get(5);
        if (i != 64)
            return null;
        int i_8_ = 1 + Node_Sub8_Sub9.aCalendar8968.get(2);
        int i_9_ = Node_Sub8_Sub9.aCalendar8968.get(1);
        return (Integer.toString(i_7_ / 10) + i_7_ % 10 + "/" + i_8_ / 10 + i_8_ % 10 + "/" + i_9_ % 100 / 10 + i_9_ % 10);
    }

    Class144(Class215 class215, int i, Class381 class381) {
        aClass381_1700 = class381;
        ((Class144) this).anInt1696 = aClass381_1700.method3899(4, 0);
    }
}
