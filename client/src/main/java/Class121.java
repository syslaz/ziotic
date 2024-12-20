/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class121 {
    static int anInt1513 = 1;
    static int[] anIntArray1514 = new int[4];
    static int anInt1515;

    static final void method1127(int i) {
        anInt1515++;
        int i_0_ = Class131.anInt1600;
        int[] is = Class271.anIntArray3156;
        if (i != 32684)
            method1127(-41);
        for (int i_1_ = 0; i_0_ > i_1_; i_1_++) {
            Player player = (Node_Sub32.aPlayerArray7197[is[i_1_]]);
            if (player != null && ((((Entity) player).anInt10481) ^ 0xffffffff) < -1) {
                ((Entity) player).anInt10481--;
                if (((((Entity) player).anInt10481) ^ 0xffffffff) == -1)
                    ((Entity) player).message = null;
            }
        }
        for (int i_2_ = 0; Class28.anInt4892 > i_2_; i_2_++) {
            long l = (long) Class346_Sub7_Sub2_Sub3.anIntArray10381[i_2_];
            Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501(l, (byte) 31));
            if (class248_sub10 != null) {
                NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                if (((((Entity) NPC).anInt10481) ^ 0xffffffff) < -1) {
                    ((Entity) NPC).anInt10481--;
                    if (((Entity) NPC).anInt10481 == 0)
                        ((Entity) NPC).message = null;
                }
            }
        }
    }

    public static void method1128(int i) {
        anIntArray1514 = null;
        int i_3_ = 1 % ((75 - i) / 32);
    }
}
