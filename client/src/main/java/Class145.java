/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class145 {
    int anInt1705 = 64;
    static int anInt1706;
    int anInt1707;
    static int anInt1708;
    int anInt1709;
    boolean aBoolean1710;
    int anInt1711;
    int anInt1712;
    int anInt1713;
    int anInt1714 = -1;
    int anInt1715;
    static int anInt1716;
    static Class212 aClass212_1717;
    static int anInt1718;
    Class144 aClass144_1719;
    int anInt1720;
    static boolean aBoolean1721 = false;
    boolean aBoolean1722;
    boolean aBoolean1723;

    final void method1305(boolean bool, ByteStream class248_sub9) {
        if (bool == false) {
            anInt1718++;
            for (; ; ) {
                int i = class248_sub9.readUnsignedByte((byte) 83);
                if (i == 0)
                    break;
                method1308(i, class248_sub9, -115);
            }
        }
    }

    public static void method1306(int i) {
        if (i != -30914)
            method1309(-81, -122);
        aClass212_1717 = null;
    }

    final void method1307(int i) {
        anInt1716++;
        ((Class145) this).anInt1709 = (((Class145) this).anInt1707 | ((Class145) this).anInt1709 << 1652868904);
        if (i != 1652868904)
            ((Class145) this).aBoolean1710 = true;
    }

    private final void method1308(int i, ByteStream class248_sub9, int i_0_) {
        anInt1706++;
        int i_1_ = -84 % ((i_0_ - -42) / 45);
        if ((i ^ 0xffffffff) == -2)
            ((Class145) this).anInt1720 = Class43.method311(class248_sub9.method2221(255), 109);
        else if (i == 2)
            ((Class145) this).anInt1714 = class248_sub9.readUnsignedByte((byte) 124);
        else if (i == 3) {
            ((Class145) this).anInt1714 = class248_sub9.readShort(-1);
            if ((((Class145) this).anInt1714 ^ 0xffffffff) == -65536)
                ((Class145) this).anInt1714 = -1;
        } else if (i != 5) {
            if (i != 7) {
                if (i == 8)
                    ((Class144) ((Class145) this).aClass144_1719).anInt1703 = ((Class145) this).anInt1707;
                else if (i == 9)
                    ((Class145) this).anInt1715 = class248_sub9.readShort(-1) << -1358678846;
                else if ((i ^ 0xffffffff) != -11) {
                    if ((i ^ 0xffffffff) != -12) {
                        if ((i ^ 0xffffffff) != -13) {
                            if ((i ^ 0xffffffff) != -14) {
                                if (i == 14)
                                    ((Class145) this).anInt1705 = (class248_sub9.readUnsignedByte((byte) -31) << 268744386);
                                else if (i == 16)
                                    ((Class145) this).anInt1711 = class248_sub9.readUnsignedByte((byte) -56);
                            } else
                                ((Class145) this).anInt1713 = class248_sub9.method2221(255);
                        } else
                            ((Class145) this).aBoolean1723 = true;
                    } else
                        ((Class145) this).anInt1709 = class248_sub9.readUnsignedByte((byte) 84);
                } else
                    ((Class145) this).aBoolean1722 = false;
            } else
                ((Class145) this).anInt1712 = Class43.method311(class248_sub9.method2221(255), 122);
        } else
            ((Class145) this).aBoolean1710 = false;
    }

    static final void method1309(int i, int i_2_) {
        anInt1708++;
        if (i == -25908) {
            Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_2_, i + -874766764, 6);
            class248_sub8_sub10.method2076(-128);
        }
    }

    public Class145() {
        ((Class145) this).aBoolean1710 = true;
        ((Class145) this).anInt1713 = 1190717;
        ((Class145) this).anInt1720 = 0;
        ((Class145) this).anInt1709 = 8;
        ((Class145) this).anInt1715 = 512;
        ((Class145) this).anInt1712 = -1;
        ((Class145) this).anInt1711 = 127;
        ((Class145) this).aBoolean1723 = false;
        ((Class145) this).aBoolean1722 = true;
    }

    static {
        aClass212_1717 = Class238_Sub2.method1890(0);
    }
}
