/* Class116_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class116_Sub1 extends Class116 {
    static OutgoingOpcode aOutgoingOpcode_6277;
    static int anInt6278;
    static byte aByte6279 = -1;
    static int anInt6280;
    static Class381 aClass381_6281;

    static final Class285 method1102(Class381 class381, int i, int i_0_) {
        anInt6280++;
        if (i != 13580)
            return null;
        byte[] is = class381.method3930(-1, i_0_);
        if (is == null)
            return null;
        return new Class285(is);
    }

    static final void method1103() {
        int i = 10;
        int i_1_ = 30;
        if (Class21.anInt311 != 0 && Class90.aClass48_1132 != null) {
            r.aHa9032.K(Node_Sub8_Sub10.anIntArray8975);
            for (int i_2_ = 0; i_2_ < Class270.anIntArray3138.length; i_2_++)
                r.aHa9032.method822(-256, 1, (Node_Sub8_Sub10.anIntArray8975[3] - Node_Sub8_Sub10.anIntArray8975[1]), Node_Sub8_Sub10.anIntArray8975[1], (Class270.anIntArray3138[i_2_] + Class349_Sub2.anIntArray4721[i_2_]));
            for (int i_3_ = 0; i_3_ < Class300.anInt3496; i_3_++) {
                Class2 class2 = Node_Sub14_Sub14.aClass2Array9305[i_3_];
                r.aHa9032.H(((Class2) class2).anIntArray124[0], ((Class2) class2).anIntArray122[0], ((Class2) class2).anIntArray117[0], Node_Sub24.anIntArray7124);
                r.aHa9032.H(((Class2) class2).anIntArray124[1], ((Class2) class2).anIntArray122[1], ((Class2) class2).anIntArray117[1], Class226_Sub1_Sub1.anIntArray8804);
                r.aHa9032.H(((Class2) class2).anIntArray124[2], ((Class2) class2).anIntArray122[2], ((Class2) class2).anIntArray117[2], Node_Sub14_Sub36.anIntArray9548);
                r.aHa9032.H(((Class2) class2).anIntArray124[3], ((Class2) class2).anIntArray122[3], ((Class2) class2).anIntArray117[3], Class237.anIntArray2641);
                if (Node_Sub24.anIntArray7124[2] != -1 && Class226_Sub1_Sub1.anIntArray8804[2] != -1 && Node_Sub14_Sub36.anIntArray9548[2] != -1 && Class237.anIntArray2641[2] != -1) {
                    int i_4_ = -65536;
                    if (((Class2) class2).aByte115 == 4)
                        i_4_ = -16776961;
                    r.aHa9032.method811(Class226_Sub1_Sub1.anIntArray8804[0], Class226_Sub1_Sub1.anIntArray8804[1], Node_Sub24.anIntArray7124[1], i_4_, (byte) 49, Node_Sub24.anIntArray7124[0]);
                    r.aHa9032.method811(Node_Sub14_Sub36.anIntArray9548[0], Node_Sub14_Sub36.anIntArray9548[1], Class226_Sub1_Sub1.anIntArray8804[1], i_4_, (byte) 49, Class226_Sub1_Sub1.anIntArray8804[0]);
                    r.aHa9032.method811(Class237.anIntArray2641[0], Class237.anIntArray2641[1], Node_Sub14_Sub36.anIntArray9548[1], i_4_, (byte) 49, (Node_Sub14_Sub36.anIntArray9548[0]));
                    r.aHa9032.method811(Node_Sub24.anIntArray7124[0], Node_Sub24.anIntArray7124[1], Class237.anIntArray2641[1], i_4_, (byte) 49, Class237.anIntArray2641[0]);
                    r.aHa9032.method811(Node_Sub14_Sub36.anIntArray9548[0], Node_Sub14_Sub36.anIntArray9548[1], Node_Sub24.anIntArray7124[1], i_4_, (byte) 49, Node_Sub24.anIntArray7124[0]);
                }
            }
            Class90.aClass48_1132.method369(true, i, ("Dynamic: " + Node_Sub14_Sub36.anInt9552 + "/" + 5000), i_1_ + 45, -16777216, -256);
            Class90.aClass48_1132.method369(true, i, ("Total Opaque Onscreen: " + Class133.anInt5038 + "/" + 10000), i_1_ + 60, -16777216, -256);
            Class90.aClass48_1132.method369(true, i, ("Total Trans Onscreen: " + Class67.anInt900 + "/" + 5000), i_1_ + 75, -16777216, -256);
            Class90.aClass48_1132.method369(true, i, ("Occluders: " + (Node_Sub41.anInt7287 + Class164.anInt1937) + " Active: " + Class300.anInt3496), i_1_ + 90, -16777216, -256);
            Class90.aClass48_1132.method369(true, i, ("Occluded: Ground:" + Class346_Sub5.anInt8278 + " Walls: " + Class255.anInt2925 + " CPs: " + Class69.anInt915 + " Pixels: " + (Class346_Sub7_Sub4_Sub2.anInt10163)), i_1_ + 105, -16777216, -256);
            Class90.aClass48_1132.method369(true, i, ("Occlude Calc Took: " + (Node_Sub14_Sub33.aLong9516 / 1000L) + "us"), i_1_ + 120, -16777216, -256);
            if (Class21.anInt311 == 2 && Class103.anIntArray1317 != null) {
                for (int i_5_ = 0; i_5_ < Class103.anIntArray1317.length; i_5_++) {
                    float f = (float) Class103.anIntArray1317[i_5_];
                    f /= 4194304.0F;
                    if (f > 1.0F)
                        f = 1.0F;
                    f *= 255.0F;
                    f = 255.0F - f;
                    int i_6_ = (int) f;
                    Class103.anIntArray1317[i_5_] = i_6_ | i_6_ << 8 | i_6_ << 16 | ~0xffffff;
                }
                Class129 class129 = r.aHa9032.method813(Class64.anInt868, (byte) 99, Class312.anInt3644, Class103.anIntArray1317, 0, Class312.anInt3644);
                class129.method1178(i, 170, 1, 0, 0);
            }
        }
    }

    public static void method1104(int i) {
        aOutgoingOpcode_6277 = null;
        aClass381_6281 = null;
        if (i != -1)
            method1104(84);
    }

    static {
        aOutgoingOpcode_6277 = new OutgoingOpcode(50, 0);
    }
}
