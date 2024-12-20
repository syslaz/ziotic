/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class187 {
    int anInt2170;
    static int anInt2171;
    int anInt2172;
    static int anInt2173;
    static int anInt2174;
    int anInt2175;
    static int anInt2176;
    static Class339 aClass339_2177 = new Class339("WTRC", "office", "_rc", 1);
    private byte aByte2178;
    int anInt2179;
    int anInt2180;

    static final void method1629(int i, ha var_ha) {
        if (i != 81)
            aClass339_2177 = null;
        anInt2173++;
        if (((Class379.anInt4638 ^ 0xffffffff) <= -3 || Class115.aBoolean4952) && Class371.aClass354_4564 == null) {
            String string;
            if (!Class115.aBoolean4952 || (Class379.anInt4638 ^ 0xffffffff) <= -3) {
                if (!Class44_Sub1.aBoolean5292 || !Class353.aClass253_4192.method2722(true, 81) || (Class379.anInt4638 ^ 0xffffffff) >= -3) {
                    Node_Sub8_Sub11 class248_sub8_sub11 = Class300.aClass248_Sub8_Sub11_3498;
                    if (class248_sub8_sub11 == null)
                        return;
                    string = Class101.method718(i ^ 0x36, class248_sub8_sub11);
                    int[] is = null;
                    if (!Node_Sub3.method2007((((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999), 50)) {
                        if ((((Node_Sub8_Sub11) class248_sub8_sub11).anInt9003) == -1) {
                            if (Node_Sub15_Sub4.method2491(-54, (((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999))) {
                                Node_Sub10 class248_sub10 = ((Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) (int) (((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006), (byte) 31)));
                                if (class248_sub10 != null) {
                                    NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                                    Class255 class255 = (((NPC) NPC).aClass255_10614);
                                    if (((Class255) class255).anIntArray2923 != null)
                                        class255 = (class255.method2737((byte) 56, (Node_Sub43.aClass291_7306)));
                                    if (class255 != null)
                                        is = (((Class255) class255).anIntArray2905);
                                }
                            } else if (Class290.method3093(((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999, (byte) 111)) {
                                Object object = null;
                                ObjectDefinition class266;
                                if ((((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999 ^ 0xffffffff) == -1010)
                                    class266 = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -81, (int) (((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006)));
                                else
                                    class266 = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -92, (int) ((((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006) >>> -311190432 & 0x7fffffffL)));
                                if (((ObjectDefinition) class266).anIntArray3049 != null)
                                    class266 = (class266.method2797(Node_Sub43.aClass291_7306, 125));
                                if (class266 != null)
                                    is = ((ObjectDefinition) class266).anIntArray3029;
                            }
                        } else
                            is = ((Class321) (Class283.aClass342_3343.method3482((byte) 97, (((Node_Sub8_Sub11) class248_sub8_sub11).anInt9003)))).anIntArray3761;
                    } else
                        is = (((Class321) (Class283.aClass342_3343.method3482((byte) 92, (int) (((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006)))).anIntArray3761);
                    if (is != null)
                        string += Class357.method3792(i ^ 0x4b, is);
                } else
                    string = Class101.method718(124, (Class300.aClass248_Sub8_Sub11_3498));
            } else
                string = (Node_Sub8_Sub4.aString8364 + Class41.aClass41_498.method301(Class191.anInt4822, (byte) -108) + Class287.aString3382 + " ->");
            if ((Class379.anInt4638 ^ 0xffffffff) < -3)
                string += ("<col=ffffff> / " + (Class379.anInt4638 + -2) + Class41.aClass41_491.method301(Class191.anInt4822, (byte) -108));
            if (Class299.aClass354_3491 != null) {
                Class48 class48 = Class299.aClass354_3491.method3758(i + -80, var_ha);
                if (class48 == null)
                    class48 = Node_Sub14_Sub27.aClass48_9449;
                class48.method357(Node_Sub14_Sub21.anIntArray9380, Class275_Sub1.aRandom8582, Class5.anInt145, Node_Sub14_Sub11.aClass129Array9254, Class296.anIntArray3460, ((RSInterface2) Class299.aClass354_3491).anInt4223, ((RSInterface2) Class299.aClass354_3491).anInt4308, Class25.anInt340, ((RSInterface2) Class299.aClass354_3491).anInt4256, string, Class359.anInt4433, 31520, ((RSInterface2) Class299.aClass354_3491).anInt4332, ((RSInterface2) Class299.aClass354_3491).anInt4340, ((RSInterface2) Class299.aClass354_3491).anInt4334);
                Class54_Sub2.method435(Class296.anIntArray3460[3], Class296.anIntArray3460[0], -47, Class296.anIntArray3460[1], Class296.anIntArray3460[2]);
            } else if (Class54_Sub4.aClass354_5357 != null && (Class12.aClass215_249 == Class346_Sub7_Sub2_Sub3.aClass215_10385)) {
                int i_0_ = (Node_Sub14_Sub27.aClass48_9449.method356(Node_Sub14_Sub21.anIntArray9380, 4 + Class41.anInt532, Node_Sub14_Sub11.aClass129Array9254, string, 16777215, Class279_Sub1_Sub1.anInt9817 - -16, Class25.anInt340, (byte) -115, Class275_Sub1.aRandom8582, 0));
                Class54_Sub2.method435(16, Class41.anInt532 - -4, -121, Class279_Sub1_Sub1.anInt9817, i_0_ + Class264.aClass285_2996.method3068(-1, string));
            }
        }
    }

    final int method1630(int i) {
        int i_1_ = 94 % ((i - -36) / 52);
        anInt2176++;
        if ((aByte2178 & 0x8 ^ 0xffffffff) != -9)
            return 0;
        return 1;
    }

    final int method1631(int i) {
        if (i != -1)
            method1631(109);
        anInt2174++;
        return 0x7 & aByte2178;
    }

    public static void method1632(int i) {
        aClass339_2177 = null;
        if (i != -3)
            aClass339_2177 = null;
    }

    public Class187() {
        /* empty */
    }

    Class187(ByteStream class248_sub9) {
        aByte2178 = class248_sub9.readByte(69);
        ((Class187) this).anInt2175 = class248_sub9.readShort(-1);
        ((Class187) this).anInt2170 = class248_sub9.readInt(false);
        ((Class187) this).anInt2180 = class248_sub9.readInt(false);
        ((Class187) this).anInt2179 = class248_sub9.readInt(false);
        ((Class187) this).anInt2172 = class248_sub9.readInt(false);
    }
}
