/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class207 {
    static int anInt2390;
    private boolean aBoolean2391 = false;
    static int anInt2392;
    static int anInt2393;
    private int anInt2394;
    private String[] aStringArray2395 = new String[0];
    static int anInt2396;
    static int anInt2397;
    static boolean aBoolean2398 = true;
    static int anInt2399;
    private int anInt2400;
    static int anInt2401;

    public final String toString() {
        anInt2396++;
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("[");
        for (int i = 0; (i ^ 0xffffffff) > (anInt2394 ^ 0xffffffff); i++) {
            if ((i ^ 0xffffffff) != -1)
                stringbuffer.append(", ");
            stringbuffer.append(aStringArray2395[i]);
        }
        stringbuffer.append("]");
        return stringbuffer.toString();
    }

    private final void method1703(int i, int i_0_) {
        anInt2390++;
        String[] strings = new String[method1705(-20, i_0_)];
        Class159.method1399(aStringArray2395, 0, strings, 0, aStringArray2395.length);
        if (i == 32696)
            aStringArray2395 = strings;
    }

    private final void method1704(String string, int i, int i_1_) {
        anInt2393++;
        int i_2_ = -82 % ((32 - i_1_) / 55);
        if ((anInt2394 ^ 0xffffffff) > (i ^ 0xffffffff))
            anInt2394 = i;
        if ((aStringArray2395.length ^ 0xffffffff) >= (i ^ 0xffffffff))
            method1703(32696, i);
        aStringArray2395[i] = string;
    }

    private final int method1705(int i, int i_3_) {
        int i_4_ = 25 / ((76 - i) / 47);
        anInt2392++;
        int i_5_ = aStringArray2395.length;
        while ((i_3_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff)) {
            if (aBoolean2391) {
                if (i_5_ == 0)
                    i_5_ = 1;
                else
                    i_5_ *= anInt2400;
            } else
                i_5_ += anInt2400;
        }
        return i_5_;
    }

    final void method1706(int i, String string) {
        method1704(string, 1 + anInt2394, 111);
        if (i != -17195)
            anInt2394 = 77;
        anInt2401++;
    }

    static final void method1707(int i, boolean bool, int i_6_, int i_7_, int i_8_) {
        anInt2399++;
        if (bool || Class150.anInt1751 != i || Node_Sub19.anInt7031 != i_7_ || ((Class177.anInt2074 ^ 0xffffffff) != (Class84_Sub5.anInt5425 ^ 0xffffffff) && (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335.method2961(true) ^ 0xffffffff) != -2)) {
            Node_Sub19.anInt7031 = i_7_;
            Class84_Sub5.anInt5425 = Class177.anInt2074;
            Class150.anInt1751 = i;
            if ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335.method2961(true) ^ 0xffffffff) == -2)
                Class84_Sub5.anInt5425 = 0;
            Node_Sub14_Sub15.method2318(i_6_, -21035);
            Node_Sub19.method2518(Node_Sub14_Sub31.aClass285_9492, Canvas_Sub1.aClass48_71, Class287.aHa3381, (byte) -27, true, Class41.aClass41_478.method301(Class191.anInt4822, (byte) -108));
            int i_9_ = Class67.baseX;
            int i_10_ = Class368.baseY;
            Class67.baseX = (Class150.anInt1751 + -(Node_Sub8_Sub4.anInt8360 >> 886771620)) * 8;
            Class368.baseY = (-(Node_Sub22.anInt7074 >> 788719556) + Node_Sub19.anInt7031) * 8;
            Class333.aClass248_Sub8_Sub1_3897 = Class116.method1081(8 * Class150.anInt1751, 8 * Node_Sub19.anInt7031);
            Class102.aClass380_1309 = null;
            int i_11_ = -i_9_ + Class67.baseX;
            int i_12_ = Class368.baseY + -i_10_;
            if ((i_6_ ^ 0xffffffff) != -12) {
                Class28.anInt4892 = 0;
                boolean bool_13_ = false;
                int i_14_ = -512 + Node_Sub8_Sub4.anInt8360 * 512;
                int i_15_ = -512 + Node_Sub22.anInt7074 * 512;
                for (int i_16_ = 0; Node_Sub8_Sub16_Sub1.anInt10303 > i_16_; i_16_++) {
                    Node_Sub10 class248_sub10 = Node_Sub30.aClass248_Sub10Array7182[i_16_];
                    if (class248_sub10 != null) {
                        NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                        ((Interactable) NPC).y -= i_12_ * 512;
                        ((Interactable) NPC).x -= 512 * i_11_;
                        if ((((Interactable) NPC).x) < 0 || (((Interactable) NPC).x) > i_14_ || (((Interactable) NPC).y) < 0 || (((Interactable) NPC).y) > i_15_) {
                            NPC.method3670((byte) -86, null);
                            bool_13_ = true;
                            class248_sub10.remove(true);
                        } else {
                            boolean bool_17_ = true;
                            for (int i_18_ = 0; i_18_ < 10; i_18_++) {
                                ((Entity) NPC).posQueueX[i_18_] -= i_11_;
                                ((Entity) NPC).posQueueY[i_18_] -= i_12_;
                                if (((((Entity) NPC).posQueueX[i_18_]) ^ 0xffffffff) > -1 || (Node_Sub8_Sub4.anInt8360 <= (((Entity) NPC).posQueueX[i_18_])) || (((Entity) NPC).posQueueY[i_18_]) < 0 || ((((Entity) NPC).posQueueY[i_18_]) >= Node_Sub22.anInt7074))
                                    bool_17_ = false;
                            }
                            if (bool_17_)
                                Class346_Sub7_Sub2_Sub3.anIntArray10381[Class28.anInt4892++] = (((Entity) NPC).anInt10484);
                            else {
                                NPC.method3670((byte) -86, null);
                                bool_13_ = true;
                                class248_sub10.remove(true);
                            }
                        }
                    }
                }
                if (bool_13_) {
                    Node_Sub8_Sub16_Sub1.anInt10303 = Class253_Sub1.aClass65_7514.method513((byte) 32);
                    Class253_Sub1.aClass65_7514.method508(Node_Sub30.aClass248_Sub10Array7182, true);
                }
            } else {
                for (int i_19_ = 0; ((Node_Sub8_Sub16_Sub1.anInt10303 ^ 0xffffffff) < (i_19_ ^ 0xffffffff)); i_19_++) {
                    Node_Sub10 class248_sub10 = Node_Sub30.aClass248_Sub10Array7182[i_19_];
                    if (class248_sub10 != null) {
                        NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                        for (int i_20_ = 0; i_20_ < 10; i_20_++) {
                            ((Entity) NPC).posQueueX[i_20_] -= i_11_;
                            ((Entity) NPC).posQueueY[i_20_] -= i_12_;
                        }
                        ((Interactable) NPC).x -= i_11_ * 512;
                        ((Interactable) NPC).y -= i_12_ * 512;
                    }
                }
            }
            for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > -2049; i_21_++) {
                Player player = (Node_Sub32.aPlayerArray7197[i_21_]);
                if (player != null) {
                    for (int i_22_ = 0; i_22_ < 10; i_22_++) {
                        ((Entity) player).posQueueX[i_22_] -= i_11_;
                        ((Entity) player).posQueueY[i_22_] -= i_12_;
                    }
                    ((Interactable) player).y -= i_12_ * 512;
                    ((Interactable) player).x -= 512 * i_11_;
                }
            }
            Class7[] class7s = Class225_Sub3.aClass7Array8477;
            for (int i_23_ = i_8_; i_23_ < class7s.length; i_23_++) {
                Class7 class7 = class7s[i_23_];
                if (class7 != null) {
                    ((Class7) class7).anInt159 -= 512 * i_11_;
                    ((Class7) class7).anInt163 -= i_12_ * 512;
                }
            }
            for (Node_Sub30 class248_sub30 = ((Node_Sub30) Class225_Sub2.aClass293_8466.method3119(2)); class248_sub30 != null; class248_sub30 = (Node_Sub30) Class225_Sub2.aClass293_8466.method3107(i_8_ + -127)) {
                ((Node_Sub30) class248_sub30).anInt7190 -= i_12_;
                ((Node_Sub30) class248_sub30).anInt7187 -= i_11_;
                if (Class270.anInt3134 != 4 && ((((Node_Sub30) class248_sub30).anInt7187 ^ 0xffffffff) > -1 || ((Node_Sub30) class248_sub30).anInt7190 < 0 || ((Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) >= (((Node_Sub30) class248_sub30).anInt7187 ^ 0xffffffff)) || (((Node_Sub30) class248_sub30).anInt7190 >= Node_Sub22.anInt7074)))
                    class248_sub30.remove(true);
            }
            for (Node_Sub30 class248_sub30 = ((Node_Sub30) IOException_Sub1.aClass293_82.method3119(2)); class248_sub30 != null; class248_sub30 = (Node_Sub30) IOException_Sub1.aClass293_82.method3107(i_8_ + -127)) {
                ((Node_Sub30) class248_sub30).anInt7187 -= i_11_;
                ((Node_Sub30) class248_sub30).anInt7190 -= i_12_;
                if ((Class270.anInt3134 ^ 0xffffffff) != -5 && (((Node_Sub30) class248_sub30).anInt7187 < 0 || ((Node_Sub30) class248_sub30).anInt7190 < 0 || ((Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) >= (((Node_Sub30) class248_sub30).anInt7187 ^ 0xffffffff)) || ((Node_Sub22.anInt7074 ^ 0xffffffff) >= (((Node_Sub30) class248_sub30).anInt7190 ^ 0xffffffff))))
                    class248_sub30.remove(true);
            }
            if ((Class270.anInt3134 ^ 0xffffffff) != -5) {
                for (Node_Sub13 class248_sub13 = ((Node_Sub13) Class346_Sub7_Sub5.aClass65_9959.method510(true)); class248_sub13 != null; class248_sub13 = (Node_Sub13) Class346_Sub7_Sub5.aClass65_9959.method512(false)) {
                    int i_24_ = (int) (0x3fffL & ((Node) class248_sub13).id);
                    int i_25_ = -Class67.baseX + i_24_;
                    int i_26_ = (int) (0x3fffL & (((Node) class248_sub13).id >> 1266323854));
                    int i_27_ = -Class368.baseY + i_26_;
                    if ((i_25_ ^ 0xffffffff) > -1 || i_27_ < 0 || i_25_ >= Node_Sub8_Sub4.anInt8360 || ((Node_Sub22.anInt7074 ^ 0xffffffff) >= (i_27_ ^ 0xffffffff)))
                        class248_sub13.remove(true);
                }
            }
            if (Applet_Sub1.anInt44 != 0) {
                Class72.anInt4876 -= i_12_;
                Applet_Sub1.anInt44 -= i_11_;
            }
            Class48.method366(-98);
            if (i_6_ != 11) {
                Class301.anInt4931 -= i_11_;
                Class281.cameraZMovement -= i_12_;
                Class346_Sub7_Sub1.cameraPosX -= 512 * i_11_;
                Class316_Sub1_Sub2.cameraPosZ -= i_12_ * 512;
                Class346_Sub5.anInt8283 -= i_12_;
                Class1.cameraXMovement -= i_11_;
                if (((Math.abs(i_11_) ^ 0xffffffff) < (Node_Sub8_Sub4.anInt8360 ^ 0xffffffff)) || Math.abs(i_12_) > Node_Sub22.anInt7074)
                    Class332.method3400(1);
            } else if (Node_Sub45.anInt7343 != 4) {
                Node_Sub45.anInt7343 = 1;
                Node_Sub14_Sub21.anInt9379 = Class359.anInt4436 = -1;
            } else {
                Class189.anInt5066 -= i_12_ * 512;
                Class61.anInt831 -= 512 * i_11_;
                Class82.anInt1027 -= 512 * i_11_;
                Node_Sub32.anInt7198 -= 512 * i_12_;
            }
            Class178.method1593((byte) -120);
            Class131.method1215(i_8_ ^ ~0x7bf7);
            Class198.aClass293_2259.method3121(10);
            Node_Sub14_Sub27.aClass293_9440.method3121(10);
            Class20.aClass360_308.method3813(0);
            Class302.method3198(i_8_ + 113);
        }
    }

    final String[] method1708(int i) {
        if (i <= 38)
            return null;
        anInt2397++;
        String[] strings = new String[1 + anInt2394];
        Class159.method1399(aStringArray2395, 0, strings, 0, anInt2394 - -1);
        return strings;
    }

    Class207(int i, boolean bool) {
        anInt2394 = -1;
        aBoolean2391 = bool;
        anInt2400 = i;
    }
}
