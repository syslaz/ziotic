/* Class284 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class284 {
    static int anInt3345;
    static IncommingOpcode aIncommingOpcode_3346 = new IncommingOpcode(91, 4);
    static int anInt3347;
    static int anInt3348;
    int anInt3349;
    int anInt3350;
    int anInt3351 = 128;
    int anInt3352;
    static int anInt3353;
    int anInt3354;
    int anInt3355;

    static final int method3061(int i, Node_Sub8_Sub11 class248_sub8_sub11) {
        anInt3347++;
        if (i >= -28)
            method3063(-112);
        String string = Class101.method718(100, class248_sub8_sub11);
        int[] is = null;
        if (!Node_Sub3.method2007(((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999, 50)) {
            if (((Node_Sub8_Sub11) class248_sub8_sub11).anInt9003 == -1) {
                if (!Node_Sub15_Sub4.method2491(-83, (((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999))) {
                    if (Class290.method3093(((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999, (byte) 70)) {
                        Object object = null;
                        ObjectDefinition class266;
                        if (((((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999) ^ 0xffffffff) == -1010)
                            class266 = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -23, (int) ((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006));
                        else
                            class266 = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -118, (int) (0x7fffffffL & (((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006 >>> 1875893024))));
                        if (((ObjectDefinition) class266).anIntArray3049 != null)
                            class266 = class266.method2797((Node_Sub43.aClass291_7306), 124);
                        if (class266 != null)
                            is = ((ObjectDefinition) class266).anIntArray3029;
                    }
                } else {
                    Node_Sub10 class248_sub10 = ((Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) (int) ((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006, (byte) 31)));
                    if (class248_sub10 != null) {
                        NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                        Class255 class255 = (((NPC) NPC).aClass255_10614);
                        if (((Class255) class255).anIntArray2923 != null)
                            class255 = class255.method2737((byte) 50, (Node_Sub43.aClass291_7306));
                        if (class255 != null)
                            is = ((Class255) class255).anIntArray2905;
                    }
                }
            } else
                is = ((Class321) (Class283.aClass342_3343.method3482((byte) 108, (((Node_Sub8_Sub11) class248_sub8_sub11).anInt9003)))).anIntArray3761;
        } else
            is = (((Class321) (Class283.aClass342_3343.method3482((byte) 104, (int) ((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006))).anIntArray3761);
        if (is != null)
            string += Class357.method3792(26, is);
        int i_0_ = Class264.aClass285_2996.method3071(215, string, (Node_Sub14_Sub11.aClass129Array9254));
        if (((Node_Sub8_Sub11) class248_sub8_sub11).aBoolean8995)
            i_0_ += 4 + Class238_Sub3.aClass129_6773.method1175();
        return i_0_;
    }

    final void method3062(Class284 class284_1_, int i) {
        ((Class284) this).anInt3350 = ((Class284) class284_1_).anInt3350;
        ((Class284) this).anInt3355 = ((Class284) class284_1_).anInt3355;
        ((Class284) this).anInt3349 = ((Class284) class284_1_).anInt3349;
        ((Class284) this).anInt3354 = ((Class284) class284_1_).anInt3354;
        ((Class284) this).anInt3352 = ((Class284) class284_1_).anInt3352;
        anInt3348++;
        if (i != 91)
            method3063(-53);
        ((Class284) this).anInt3351 = ((Class284) class284_1_).anInt3351;
    }

    public static void method3063(int i) {
        aIncommingOpcode_3346 = null;
        if (i >= -115)
            aIncommingOpcode_3346 = null;
    }

    final Class284 method3064(int i) {
        if (i != 24695)
            ((Class284) this).anInt3350 = -92;
        anInt3353++;
        return new Class284(((Class284) this).anInt3355, ((Class284) this).anInt3351, ((Class284) this).anInt3350, ((Class284) this).anInt3354, ((Class284) this).anInt3349, ((Class284) this).anInt3352);
    }

    Class284(int i) {
        ((Class284) this).anInt3350 = 128;
        ((Class284) this).anInt3355 = i;
    }

    private Class284(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        ((Class284) this).anInt3350 = 128;
        ((Class284) this).anInt3355 = i;
        ((Class284) this).anInt3350 = i_3_;
        ((Class284) this).anInt3352 = i_6_;
        ((Class284) this).anInt3351 = i_2_;
        ((Class284) this).anInt3354 = i_4_;
        ((Class284) this).anInt3349 = i_5_;
    }
}
