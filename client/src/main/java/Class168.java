/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class168 {
    static int anInt1960;
    static int anInt1961;
    int anInt1962;
    static int anInt1963 = -1;
    static int anInt1964;
    int anInt1965;
    int anInt1966;
    int anInt1967;
    static Class48 aClass48_1968;
    static int anInt1969;
    static IncommingOpcode aIncommingOpcode_1970 = new IncommingOpcode(109, 0);
    static Class168 aClass168_1971 = new Class168(6, 0, 4, 2);
    static Class381 aClass381_1972;

    static final void method1543(byte i) {
        if (i == -53) {
            anInt1969++;
            Class380.aClass278_4645.method2872((byte) -78);
        }
    }

    static final void method1544(int i, int i_0_) {
        Class312.anInt3627 = i_0_;
        anInt1961++;
        Class154.loginType = 2;
        if (i != 35)
            aClass48_1968 = null;
        long l = 0L;
        if (ByteStream.aString6879 == null)
            Class84_Sub1.method605(35, (byte) -111);
        else {
            ByteStream class248_sub9 = new ByteStream(Class110.method767(1, (Node_Sub11_Sub1.method2251(256, (ByteStream.aString6879)))));
            l = class248_sub9.readLong(1237129056);
            za_Sub1.aLong9803 = class248_sub9.readLong(1237129056);
            Class42.method307(true, "", (byte) 16, Class230.method1837(l, 13754));
        }
    }

    static final boolean method1545(int i, byte i_1_, int i_2_) {
        anInt1964++;
        int i_3_ = -115 % ((i_1_ - -74) / 46);
        if ((i & 0xc580) == 0)
            return false;
        return true;
    }

    public static void method1546(int i) {
        aClass48_1968 = null;
        aClass381_1972 = null;
        aClass168_1971 = null;
        aIncommingOpcode_1970 = null;
        int i_4_ = -102 % ((i - 50) / 38);
    }

    public final String toString() {
        anInt1960++;
        throw new IllegalStateException();
    }

    Class168(int i, int i_5_, int i_6_, int i_7_) {
        ((Class168) this).anInt1962 = i_6_;
        ((Class168) this).anInt1966 = i_7_;
        ((Class168) this).anInt1967 = i;
        ((Class168) this).anInt1965 = i_5_;
    }
}
