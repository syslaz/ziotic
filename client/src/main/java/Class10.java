/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class10 {
    static boolean aBoolean226 = false;
    int anInt227;
    int anInt228;
    int anInt229;
    static int anInt230;
    static Class200 aClass200_231 = new Class200(0);
    static Class129[] aClass129Array232;
    static int anInt233;
    int anInt234;
    static String[] aStringArray235 = new String[100];
    static int anInt236 = -1;

    static final void method198(int i) {
        anInt233++;
        if (i <= -8)
            Class241.aClass278_2688.method2869(0);
    }

    public static void method199(int i) {
        aClass129Array232 = null;
        aClass200_231 = null;
        aStringArray235 = null;
        if (i != -1)
            aClass200_231 = null;
    }

    static final void method200(int i, PacketStream class248_sub9_sub2) {
        if (i <= 82)
            anInt236 = 35;
        anInt230++;
        for (int i_0_ = 0; Class228.anInt2578 > i_0_; i_0_++) {
            int i_1_ = Class269_Sub2.anIntArray7548[i_0_];
            Player player = Node_Sub32.aPlayerArray7197[i_1_];
            int i_2_ = class248_sub9_sub2.readUnsignedByte((byte) 73);
            if ((i_2_ & 0x4 ^ 0xffffffff) != -1)
                i_2_ += class248_sub9_sub2.readUnsignedByte((byte) -51) << 1884527304;
            if ((i_2_ & 0x200) != 0)
                i_2_ += (class248_sub9_sub2.readUnsignedByte((byte) -112) << -893099568);
            Class69.method525(player, -5, class248_sub9_sub2, i_2_, i_1_);
        }
    }

    public Class10() {
        /* empty */
    }
}
