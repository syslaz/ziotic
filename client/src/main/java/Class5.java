/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class5 {
    static IncommingOpcode aIncommingOpcode_144 = new IncommingOpcode(72, -2);
    static int anInt145 = -1;
    static int[] anIntArray146 = new int[4096];
    static int anInt147;
    static int anInt148;
    static boolean aBoolean149 = false;

    public Class5() {
        /* empty */
    }

    static final void sendClickedButtonPacket(String string, int i, int i_0_, int interfaceSettings, int buttonOpcode) {
        anInt148++;
        RSInterface2 class354 = Class188.method1635(interfaceSettings, i_0_, 0);
        if (class354 != null) {
            if (((RSInterface2) class354).onButton_Parameters != null) {
                RSInterface script = new RSInterface();
                ((RSInterface) script).rsInter = class354;
                ((RSInterface) script).aString6851 = string;
                ((RSInterface) script).interfaceOpcodes = ((RSInterface2) class354).onButton_Parameters;
                ((RSInterface) script).anInt6844 = buttonOpcode;

//                System.out.println("id: " + ((RSInterface) script).id + " string: " + ((RSInterface) script).aString6851);
//                String s = "[";
//                for (int j = 0; j < ((RSInterface) script).interfaceOpcodes.length; j++) {
//                	if (j == ((RSInterface) script).interfaceOpcodes.length - 1) {
//                		s += ((RSInterface) script).interfaceOpcodes[j] + " ]";
//                	} else
//                		s += " " + ((RSInterface) script).interfaceOpcodes[j] + ",";
//                }
//                System.out.println(s);

                Class47.executeScript(script);
            }
            if (Class273.anInt5008 == 10 && client.method113(class354).method2670(i + buttonOpcode, i ^ ~0x3)) {

                if (buttonOpcode == 1) {
                    ha_Sub3.anInt5974++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub18.aOutgoingOpcode_7002));
                    Class194.method1665((byte) 30, class248_sub36, interfaceSettings, ((RSInterface2) class354).id, i_0_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if (buttonOpcode == 2) {
                    Class235.anInt2619++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(i ^ ~0x1, (Class346_Sub5_Sub2.aISAACCypher_9889), za_Sub2.aOutgoingOpcode_9805);
                    Class194.method1665((byte) 30, class248_sub36, interfaceSettings, ((RSInterface2) class354).id, i_0_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if (buttonOpcode == 3) {
                    Class116_Sub1.anInt6278++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(i + 2, (Class346_Sub5_Sub2.aISAACCypher_9889), Class188.aOutgoingOpcode_2186);
                    Class194.method1665((byte) 30, class248_sub36, interfaceSettings, ((RSInterface2) class354).id, i_0_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if ((buttonOpcode ^ 0xffffffff) == -5) {
                    Node_Sub8_Sub19.anInt9081++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class258.aOutgoingOpcode_2950);
                    Class194.method1665((byte) 30, class248_sub36, interfaceSettings, ((RSInterface2) class354).id, i_0_);
                    Class226_Sub3.method1814(class248_sub36, i ^ 0xffffffff);
                }
                if (buttonOpcode == 5) {
                    Node_Sub1.anInt6806++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(i ^ ~0x1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class241.aOutgoingOpcode_2693);
                    Class194.method1665((byte) 30, class248_sub36, interfaceSettings, ((RSInterface2) class354).id, i_0_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if (buttonOpcode == 6) {
                    Class358.anInt4423++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(i ^ ~0x1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class149.aOutgoingOpcode_1745);
                    Class194.method1665((byte) 30, class248_sub36, interfaceSettings, ((RSInterface2) class354).id, i_0_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if (buttonOpcode == 7) {
                    Class264.anInt2987++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(i + 2, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub2_Sub1.aOutgoingOpcode_8817));
                    Class194.method1665((byte) 30, class248_sub36, interfaceSettings, ((RSInterface2) class354).id, i_0_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if (buttonOpcode == 8) {
                    Class346_Sub1.anInt8247++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class212.aOutgoingOpcode_2456);
                    Class194.method1665((byte) 30, class248_sub36, interfaceSettings, ((RSInterface2) class354).id, i_0_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if (buttonOpcode == 9) {
                    Class108.anInt1360++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class25.aOutgoingOpcode_343);
                    Class194.method1665((byte) 30, class248_sub36, interfaceSettings, ((RSInterface2) class354).id, i_0_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if ((buttonOpcode ^ 0xffffffff) == -11) {
                    Class282_Sub3.anInt7615++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub14_Sub20.aOutgoingOpcode_9374));
                    Class194.method1665((byte) 30, class248_sub36, interfaceSettings, ((RSInterface2) class354).id, i_0_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
            }
        }
    }

    static final int method180(int i, int i_3_, int i_4_, int i_5_, boolean bool) {
        if (bool != false)
            return -87;
        anInt147++;
        int i_6_ = i & 0xf;
        int i_7_ = (i_6_ ^ 0xffffffff) > -9 ? i_3_ : i_5_;
        int i_8_ = (i_6_ >= 4 ? i_6_ == 12 || (i_6_ ^ 0xffffffff) == -15 ? i_3_ : i_4_ : i_5_);
        return (((i_6_ & 0x1 ^ 0xffffffff) != -1 ? -i_7_ : i_7_) + ((i_6_ & 0x2) == 0 ? i_8_ : -i_8_));
    }

    public static void method181(int i) {
        if (i == -11922) {
            anIntArray146 = null;
            aIncommingOpcode_144 = null;
        }
    }
}
