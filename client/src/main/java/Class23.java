/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class23 {
    static int[] anIntArray322 = new int[5];
    static int anInt323;
    static int anInt324;
    static int anInt325;
    static Class6 aClass6_326;
    static Class381 aClass381_327;

    static final void method235(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
        anInt323++;
        int i_11_ = -29 % ((i_5_ - 62) / 39);
        if (Class346_Sub7_Sub5_Sub2.method3699(i_10_, (byte) -22)) {
            if (Node_Sub46.aClass354ArrayArray7379[i_10_] != null)
                client.method117(Node_Sub46.aClass354ArrayArray7379[i_10_], -1, i_1_, i_4_, i_8_, i_9_, i_2_, i_3_, i, i_0_, i_6_, i_7_);
            else
                client.method117((Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_10_]), -1, i_1_, i_4_, i_8_, i_9_, i_2_, i_3_, i, i_0_, i_6_, i_7_);
        }
    }

    static final int method236(String string, int i) {
        anInt324++;
        if (i != 5)
            aClass6_326 = null;
        for (int i_12_ = 0; i_12_ < Class346_Sub7_Sub5_Sub1.aStringArray10037.length; i_12_++) {
            if (Class346_Sub7_Sub5_Sub1.aStringArray10037[i_12_].equalsIgnoreCase(string))
                return i_12_;
        }
        return -1;
    }

    public static void method237(int i) {
        anIntArray322 = null;
        aClass381_327 = null;
        int i_13_ = 51 / ((70 - i) / 46);
        aClass6_326 = null;
    }
}
