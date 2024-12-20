/* Class380 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class380 {
    static int anInt4640;
    static int anInt4641;
    static int anInt4642;
    int anInt4643;
    int[] anIntArray4644;
    static Class278 aClass278_4645 = new Class278(4);
    int[] anIntArray4646;
    static int anInt4647;
    static int anInt4648 = -1;
    static Class280 aClass280_4649 = new Class280();

    static final void readCustomMapRegionUpdate(int i) {
        anInt4640++;
        int i_0_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
        Class270.anInt3134 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
        boolean bool = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true) == 1);
        int i_1_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
        int i_2_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
        Node_Sub20.method2524(false);
        Class329.changeRegionSize(i_2_, true);
        Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2234(true);
        for (int i_3_ = 0; i_3_ < 4; i_3_++) {
            for (int i_4_ = 0; i_4_ < Node_Sub8_Sub4.anInt8360 >> -907702717; i_4_++) {
                for (int i_5_ = 0; i_5_ < Node_Sub22.anInt7074 >> -1704066749; i_5_++) {
                    int i_6_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 1);
                    if ((i_6_ ^ 0xffffffff) == -2)
                        Class245.anIntArrayArrayArray2749[i_3_][i_4_][i_5_] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readBits(2059, 26);
                    else
                        Class245.anIntArrayArrayArray2749[i_3_][i_4_][i_5_] = -1;
                }
            }
        }
        Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2233(-111);
        int i_7_ = (-(((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset) + Class30.currentPacketSize) / 16;
        Node_Sub8_Sub5.mapXTEAKeys = new int[i_7_][4];
        if (i >= 84) {
            for (int i_8_ = 0; (i_7_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
                for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -5; i_9_++)
                    Node_Sub8_Sub5.mapXTEAKeys[i_8_][i_9_] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
            }
            InputStream_Sub2.aByteArrayArray79 = new byte[i_7_][];
            Class282_Sub7.aByteArrayArray7666 = new byte[i_7_][];
            Node_Sub39.anIntArray7280 = new int[i_7_];
            Class346_Sub7_Sub4.anIntArray9951 = new int[i_7_];
            Class296.aByteArrayArray3456 = null;
            Class360.aByteArrayArray4447 = new byte[i_7_][];
            Class192.anIntArray2214 = new int[i_7_];
            Class14.anIntArray263 = new int[i_7_];
            Node_Sub2_Sub3.aByteArrayArray8850 = new byte[i_7_][];
            Node_Sub14_Sub36.anIntArray9544 = new int[i_7_];
            Node_Sub14_Sub35.anIntArray9529 = null;
            i_7_ = 0;
            for (int i_10_ = 0; i_10_ < 4; i_10_++) {
                for (int i_11_ = 0; ((Node_Sub8_Sub4.anInt8360 >> -464783453 ^ 0xffffffff) < (i_11_ ^ 0xffffffff)); i_11_++) {
                    for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Node_Sub22.anInt7074 >> -1787493437 ^ 0xffffffff)); i_12_++) {
                        int i_13_ = (Class245.anIntArrayArrayArray2749[i_10_][i_11_][i_12_]);
                        if (i_13_ != -1) {
                            int i_14_ = (0xffc444 & i_13_) >> -1021632306;
                            int i_15_ = i_13_ >> 1520207683 & 0x7ff;
                            int i_16_ = (i_14_ / 8 << 757549320) - -(i_15_ / 8);
                            for (int i_17_ = 0; i_7_ > i_17_; i_17_++) {
                                if (Node_Sub14_Sub36.anIntArray9544[i_17_] == i_16_) {
                                    i_16_ = -1;
                                    break;
                                }
                            }
                            if (i_16_ != -1) {
                                Node_Sub14_Sub36.anIntArray9544[i_7_] = i_16_;
                                int i_18_ = (0xffb8 & i_16_) >> 195492904;
                                int i_19_ = i_16_ & 0xff;
                                Node_Sub39.anIntArray7280[i_7_] = (Class340_Sub6.aClass381_8158.method3927((byte) 91, "m" + i_18_ + "_" + i_19_));
                                Class346_Sub7_Sub4.anIntArray9951[i_7_] = (Class340_Sub6.aClass381_8158.method3927((byte) 72, "l" + i_18_ + "_" + i_19_));
                                Class14.anIntArray263[i_7_] = (Class340_Sub6.aClass381_8158.method3927((byte) 78, "um" + i_18_ + "_" + i_19_));
                                Class192.anIntArray2214[i_7_] = (Class340_Sub6.aClass381_8158.method3927((byte) 51, "ul" + i_18_ + "_" + i_19_));
                                i_7_++;
                            }
                        }
                    }
                }
            }
            Class207.method1707(i_0_, bool, 11, i_1_, 0);
        }
    }

    static final void method3894(int i, String string) {
        Class84_Sub8.aString5473 = string;
        anInt4641++;
        if (Class158.anApplet1881 != null) {
            try {
                String string_20_ = Class158.anApplet1881.getParameter("cookieprefix");
                String string_21_ = Class158.anApplet1881.getParameter("cookiehost");
                String string_22_ = (string_20_ + "settings=" + string + "; version=1; path=/; domain=" + string_21_);
                if ((string.length() ^ 0xffffffff) == i)
                    string_22_ += "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                else
                    string_22_ += ("; Expires=" + Class209.method1715(i + 2, (94608000000L + Class118.method1112(116))) + "; Max-Age=" + 94608000L);
                Class78.method570((byte) -62, Class158.anApplet1881, "document.cookie=\"" + string_22_ + "\"");
            } catch (Throwable throwable) {
                /* empty */
            }
        }
    }

    static final void method3895(int i, int i_23_, String string) {
        anInt4642++;
        int i_24_ = Class131.anInt1600;
        if (i_23_ == 12102) {
            int[] is = Class271.anIntArray3156;
            boolean bool = false;
            for (int i_25_ = 0; (i_24_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++) {
                Player player = (Node_Sub32.aPlayerArray7197[is[i_25_]]);
                if (player != null && (player != Class347.myPlayer) && ((Player) player).aString10550 != null && ((Player) player).aString10550.equalsIgnoreCase(string)) {
                    if (i == 1) {
                        Class258.anInt2946++;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub19.aOutgoingOpcode_7032));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, is[i_25_]);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteS((byte) 107, 0);
                        Class226_Sub3.method1814(class248_sub36, 0);
                    } else if (i == 4) {
                        Class249.anInt2806++;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class282_Sub28.aOutgoingOpcode_7891));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(is[i_25_], i_23_ ^ 0x2f02);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteC(0, (byte) 116);
                        Class226_Sub3.method1814(class248_sub36, i_23_ + -12102);
                    } else if (i == 5) {
                        Class321.anInt3727++;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class381.aOutgoingOpcode_4684));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, is[i_25_]);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteC(0, (byte) 98);
                        Class226_Sub3.method1814(class248_sub36, i_23_ + -12102);
                    } else if ((i ^ 0xffffffff) == -7) {
                        Class316_Sub1_Sub2.anInt9855++;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class346_Sub5_Sub1.aOutgoingOpcode_9880));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(is[i_25_], 109);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteA(0, (byte) 106);
                        Class226_Sub3.method1814(class248_sub36, 0);
                    } else if (i == 7) {
                        Node_Sub14_Sub32.anInt9495++;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(i_23_ ^ 0x2f47, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub8_Sub18.aOutgoingOpcode_9075));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(is[i_25_], 41);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteC(0, (byte) 113);
                        Class226_Sub3.method1814(class248_sub36, 0);
                    }
                    bool = true;
                    break;
                }
            }
            if (!bool)
                Node_Sub14_Sub5.method2289(4, 31663, Class41.aClass41_487.method301(Class191.anInt4822, (byte) -108) + string);
        }
    }

    static final void method3896(Entity entity, int i) {
        anInt4647++;
        if (entity instanceof NPC) {
            NPC NPC = (NPC) entity;
            if ((((NPC) NPC).aClass255_10614) != null)
                Class282_Sub15.method2983(true, NPC, (((Interactable) Class347.myPlayer).plane != (((Interactable) NPC).plane)));
        } else if (entity instanceof Player) {
            Player player = (Player) entity;
            Class272.method2837(player, 0, (((Interactable) player).plane != ((Interactable) Class347.myPlayer).plane));
        }
        int i_26_ = 89 / ((15 - i) / 50);
    }

    Class380(int i) {
        ((Class380) this).anInt4643 = i;
        ((Class380) this).anIntArray4644 = new int[((Class380) this).anInt4643];
        ((Class380) this).anIntArray4646 = new int[((Class380) this).anInt4643];
    }

    public static void method3897(int i) {
        aClass280_4649 = null;
        aClass278_4645 = null;
        if (i != 1520207683)
            aClass280_4649 = null;
    }
}
