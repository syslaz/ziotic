/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class WorldAddress {
    static long[] aLongArray1184;
    static int anInt1185;
    String address;
    static int anInt1187;
    static int anInt1188;
    static boolean aBoolean1189 = true;
    static int anInt1190;
    int worldId;
    private boolean aBoolean1192 = true;
    static RSInterface2 aClass354_1193;
    static int anInt1194;
    int port2;
    static String[] aStringArray1196;
    private boolean aBoolean1197;
    int port1 = 43594;
    static int anInt1199;

    final boolean method677(WorldAddress worldAddress_0_, byte i) {
        if (i != -72)
            return true;
        anInt1199++;
        if (worldAddress_0_ == null)
            return false;
        if (((((WorldAddress) this).worldId ^ 0xffffffff) != (((WorldAddress) worldAddress_0_).worldId ^ 0xffffffff)) || !((WorldAddress) this).address.equals(((WorldAddress) worldAddress_0_).address))
            return false;
        return true;
    }

    static final void method678(int i) {
        anInt1185++;
        Class141.aClass278_5052.method2869(0);
        Node_Sub14_Sub24.aClass278_9410.method2869(0);
        Class347.aClass278_4144.method2869(0);
        if (i >= -82)
            method678(80);
        Class280.aClass278_3258.method2869(0);
    }

    final void method679(byte i) {
        if (aBoolean1192) {
            if (aBoolean1197)
                aBoolean1197 = false;
            else
                aBoolean1192 = false;
        } else {
            aBoolean1192 = true;
            aBoolean1197 = true;
        }
        int i_1_ = -89 % ((i - 14) / 39);
        anInt1188++;
    }

    final Class322 method680(int i, Class174 class174) {
        anInt1187++;
        if (i != 43594)
            ((WorldAddress) this).worldId = 16;
        return class174.method1566((aBoolean1192 ? ((WorldAddress) this).port2 : ((WorldAddress) this).port1), aBoolean1197, (byte) 112, ((WorldAddress) this).address);
    }

    static final int[] method681(int i) {
        int i_2_ = -94 % ((81 - i) / 45);
        anInt1190++;
        return new int[]{Class293.anInt3438, Class214.anInt2474, Class340.anInt3961};
    }

    static final void method682(int i) {
        anInt1194++;
        int i_3_ = 84 / ((i - 51) / 35);
        Class211.anImage2448 = null;
        Class275_Sub2.aFont8603 = null;
    }

    public static void method683(byte i) {
        aStringArray1196 = null;
        int i_4_ = 38 / ((i - 25) / 36);
        aLongArray1184 = null;
        aClass354_1193 = null;
    }

    public WorldAddress() {
        aBoolean1197 = false;
        ((WorldAddress) this).port2 = 443;
    }

    static {
        aLongArray1184 = new long[10];
        aStringArray1196 = new String[5];
    }
}
