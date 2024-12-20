/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2 {
    short aShort113;
    short[] aShortArray114;
    byte aByte115;
    static int anInt116 = 2;
    int[] anIntArray117;
    static int anInt118 = -1;
    short[] aShortArray119;
    static int anInt120;
    short aShort121;
    int[] anIntArray122;
    static int anInt123;
    int[] anIntArray124;
    short aShort125;
    byte aByte126;
    static int anInt127;
    short[] aShortArray128;
    short aShort129;

    static final void method170(boolean bool, int i) {
        anInt120++;
        if (bool == false) {
            Node_Sub22 class248_sub22 = ((Node_Sub22) Node_Sub14_Sub35.aClass65_9540.method501((long) i, (byte) 31));
            if (class248_sub22 != null) {
                ((Node_Sub22) class248_sub22).aBoolean7078 = !((Node_Sub22) class248_sub22).aBoolean7078;
                ((Node_Sub22) class248_sub22).aClass86_Sub1_7073.method649(((Node_Sub22) class248_sub22).aBoolean7078, -119);
            }
        }
    }

    Class2(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
        ((Class2) this).aByte115 = (byte) i;
        ((Class2) this).anIntArray124 = new int[4];
        ((Class2) this).anIntArray117 = new int[4];
        ((Class2) this).aByte126 = (byte) i_0_;
        ((Class2) this).anIntArray122 = new int[4];
        ((Class2) this).anIntArray124[1] = i_2_;
        ((Class2) this).anIntArray124[2] = i_3_;
        ((Class2) this).anIntArray124[0] = i_1_;
        ((Class2) this).anIntArray124[3] = i_4_;
        ((Class2) this).anIntArray122[1] = i_6_;
        ((Class2) this).anIntArray122[3] = i_8_;
        ((Class2) this).anIntArray122[0] = i_5_;
        ((Class2) this).anIntArray122[2] = i_7_;
        ((Class2) this).anIntArray117[0] = i_9_;
        ((Class2) this).anIntArray117[2] = i_11_;
        ((Class2) this).aShort113 = (short) (i_1_ >> Class96.anInt1249);
        ((Class2) this).anIntArray117[3] = i_12_;
        ((Class2) this).anIntArray117[1] = i_10_;
        ((Class2) this).aShort121 = (short) (i_3_ >> Class96.anInt1249);
        ((Class2) this).aShort125 = (short) (i_9_ >> Class96.anInt1249);
        ((Class2) this).aShortArray128 = new short[4];
        ((Class2) this).aShortArray119 = new short[4];
        ((Class2) this).aShortArray114 = new short[4];
        ((Class2) this).aShort129 = (short) (i_11_ >> Class96.anInt1249);
    }
}
