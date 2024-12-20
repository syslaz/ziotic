/* Class340_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class340_Sub2 extends Class340 {
    static int anInt8099;
    private boolean aBoolean8100 = false;
    static int anInt8101;
    static int anInt8102;
    static int anInt8103;
    static int anInt8104;
    static int anInt8105;
    static int anInt8106;
    static int anInt8107;
    static int anInt8108;
    static int anInt8109;
    static Class168 aClass168_8110 = new Class168(8, 0, 4, 1);
    static int anInt8111;
    static int anInt8112;

    static final void method3447(byte i) {
        int i_0_ = -45 / ((30 - i) / 56);
        anInt8106++;
        Canvas_Sub1.aClass278_70.method2872((byte) -78);
    }

    final void method3433(int i, int i_1_, int i_2_) {
        anInt8103++;
        if (i != -26427)
            method3433(-12, 22, 48);
    }

    final void method3441(boolean bool) {
        if (!aBoolean8100)
            ((Class340) this).aHa_Sub3_3954.method951(Class147.aClass280_1738, (byte) 87, 0);
        else {
            ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
            ((Class340) this).aHa_Sub3_3954.method999(117, Class221.aClass181_2533);
            ((Class340) this).aHa_Sub3_3954.method955((byte) 47, Class60.aClass5_821, Class60.aClass5_821);
            ((Class340) this).aHa_Sub3_3954.method946(2, -126, Class380.aClass280_4649);
            ((Class340) this).aHa_Sub3_3954.method951(Class147.aClass280_1738, (byte) 94, 0);
            ((Class340) this).aHa_Sub3_3954.method925(-111);
            ((Class340) this).aHa_Sub3_3954.method929(null, -8423);
            ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
            aBoolean8100 = false;
        }
        if (bool != true)
            anInt8109 = 59;
        anInt8108++;
        ((Class340) this).aHa_Sub3_3954.method955((byte) 117, Class60.aClass5_821, Class60.aClass5_821);
    }

    public static void method3448(int i) {
        aClass168_8110 = null;
        if (i != 1002)
            method3451((byte) 98, 58, null, null);
    }

    final boolean method3432(int i) {
        if (i != 4095)
            anInt8109 = 5;
        anInt8102++;
        return true;
    }

    static final void method3449(boolean bool, Node_Sub15_Sub1 class248_sub15_sub1, boolean bool_3_) {
        anInt8101++;
        if (bool != true)
            aClass168_8110 = null;
        Node_Sub8_Sub3.aClass345_8922.method3530(class248_sub15_sub1, 76);
        if (bool_3_)
            Class225_Sub2.method1793(Node_Sub28.aClass381_7160, Node_Sub14_Sub3.aClass381_9183, class248_sub15_sub1, -1, Node_Sub8_Sub12.aClass381_9021, Node_Sub8_Sub3.aClass345_8922);
    }

    final void method3442(Interface21 interface21, int i, byte i_4_) {
        ((Class340) this).aHa_Sub3_3954.method929(interface21, -8423);
        anInt8105++;
        ((Class340) this).aHa_Sub3_3954.method993((byte) 119, i);
        if (i_4_ < 68)
            anInt8112 = -63;
    }

    static final void method3450(boolean bool, int i, int i_5_, Node_Sub8_Sub11 class248_sub8_sub11) {
        anInt8104++;
        if (class248_sub8_sub11 != null && (class248_sub8_sub11 != ((Class293) Class358.aClass293_4424).aNode_3434)) {
            int i_6_ = ((Node_Sub8_Sub11) class248_sub8_sub11).anInt8998;
            int i_7_ = ((Node_Sub8_Sub11) class248_sub8_sub11).anInt8987;
            int i_8_ = ((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999;
            int i_9_ = (int) ((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006;
            long l = ((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006;
            if ((i_8_ ^ 0xffffffff) <= -2001)
                i_8_ -= 2000;
            if (i_8_ == 47) {
                Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_9_, (byte) 31));
                if (class248_sub10 != null) {
                    Class238_Sub2.anInt6717++;
                    NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                    Node_Sub14_Sub37.anInt9562 = i;
                    Class276.anInt3206 = 2;
                    Class151.anInt1799 = i_5_;
                    Class221.anInt2537 = 0;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class309.aOutgoingOpcode_3577);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteA(!Class353.aClass253_4192.method2722(true, 82) ? 0 : 1, (byte) 122);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_9_, 100);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class344.method3520(0, ((Entity) NPC).posQueueY[0], 0, NPC.method3632(-1), -2, NPC.method3632(-1), true, ((Entity) NPC).posQueueX[0], -1);
                }
            }
            if (i_8_ == 51) {
                Player player = (Node_Sub32.aPlayerArray7197[i_9_]);
                if (player != null) {
                    Node_Sub14_Sub37.anInt9562 = i;
                    Class221.anInt2537 = 0;
                    Class346_Sub7_Sub2_Sub4.anInt10101++;
                    Class276.anInt3206 = 2;
                    Class151.anInt1799 = i_5_;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class112_Sub2.aOutgoingOpcode_8635));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteC(!Class353.aClass253_4192.method2722(true, 82) ? 0 : 1, (byte) 109);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_9_, 120);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class344.method3520(0, ((Entity) player).posQueueY[0], 0, player.method3632(-1), -2, player.method3632(-1), true, ((Entity) player).posQueueX[0], -1);
                }
            }
            if ((i_8_ ^ 0xffffffff) == -59) {
                Player player = (Node_Sub32.aPlayerArray7197[i_9_]);
                if (player != null) {
                    Class221.anInt2537 = 0;
                    Node_Sub14_Sub37.anInt9562 = i;
                    Class151.anInt1799 = i_5_;
                    Class316_Sub1_Sub2.anInt9855++;
                    Class276.anInt3206 = 2;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class346_Sub5_Sub1.aOutgoingOpcode_9880));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_9_, 116);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteA(Class353.aClass253_4192.method2722(true, 82) ? 1 : 0, (byte) 102);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class344.method3520(0, ((Entity) player).posQueueY[0], 0, player.method3632(-1), -2, player.method3632(-1), true, ((Entity) player).posQueueX[0], -1);
                }
            }
            if ((i_8_ ^ 0xffffffff) == -7) {
                Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_9_, (byte) 31));
                if (class248_sub10 != null) {
                    Node_Sub14_Sub37.anInt9562 = i;
                    Class221.anInt2537 = 0;
                    Class276.anInt3206 = 2;
                    NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                    Class151.anInt1799 = i_5_;
                    Class375.anInt4607++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class279_Sub2_Sub1.aOutgoingOpcode_9830));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteA(Class353.aClass253_4192.method2722(!bool, 82) ? 1 : 0, (byte) 100);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(i_9_, -231665880);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class344.method3520(0, ((Entity) NPC).posQueueY[0], 0, NPC.method3632(-1), -2, NPC.method3632(-1), true, ((Entity) NPC).posQueueX[0], -1);
                }
            }
            if (i_8_ == 12) {
                Class151.anInt1799 = i_5_;
                Class334.anInt3904++;
                Class276.anInt3206 = 2;
                Class221.anInt2537 = 0;
                Node_Sub14_Sub37.anInt9562 = i;
                Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class346_Sub7_Sub3.aOutgoingOpcode_9933));
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, Class67.baseX + i_6_);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, i_7_ - -Class368.baseY);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-24, Class353.aClass253_4192.method2722(!bool, 82) ? 1 : 0);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(i_9_, -231665880);
                Class226_Sub3.method1814(class248_sub36, 0);
                Class349_Sub1.method3738(i_6_, i_7_, (byte) 40);
            }
            if (i_8_ == 49) {
                Class221.anInt2537 = 0;
                Class276.anInt3206 = 2;
                Class342.anInt3996++;
                Class151.anInt1799 = i_5_;
                Node_Sub14_Sub37.anInt9562 = i;
                Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class240.aOutgoingOpcode_2679);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, (int) (l >>> 1800406624) & 0x7fffffff);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-98, !Class353.aClass253_4192.method2722(true, 82) ? 0 : 1);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, i_7_ + Class368.baseY);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(Class67.baseX + i_6_, -231665880);
                Class226_Sub3.method1814(class248_sub36, 0);
                Class373.method3871(i_6_, l, i_7_, 0);
            }
            if (i_8_ == 59) {
                Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_9_, (byte) 31));
                if (class248_sub10 != null) {
                    Class284.anInt3345++;
                    Class276.anInt3206 = 2;
                    Class151.anInt1799 = i_5_;
                    Node_Sub14_Sub37.anInt9562 = i;
                    Class221.anInt2537 = 0;
                    NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class147.aOutgoingOpcode_1740);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(i_9_, -231665880);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteA(!Class353.aClass253_4192.method2722(true, 82) ? 0 : 1, (byte) 101);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class344.method3520(0, ((Entity) NPC).posQueueY[0], 0, NPC.method3632(-1), -2, NPC.method3632(-1), true, ((Entity) NPC).posQueueX[0], -1);
                }
            }
            if ((i_8_ ^ 0xffffffff) == -24) {
                Player player = (Node_Sub32.aPlayerArray7197[i_9_]);
                if (player != null) {
                    Node_Sub14_Sub32.anInt9495++;
                    Class276.anInt3206 = 2;
                    Class151.anInt1799 = i_5_;
                    Class221.anInt2537 = 0;
                    Node_Sub14_Sub37.anInt9562 = i;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub8_Sub18.aOutgoingOpcode_9075));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_9_, 109);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteC(Class353.aClass253_4192.method2722(true, 82) ? 1 : 0, (byte) 115);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class344.method3520(0, ((Entity) player).posQueueY[0], 0, player.method3632(-1), -2, player.method3632(-1), true, ((Entity) player).posQueueX[0], -1);
                }
            }
            if (i_8_ == 9) {
                Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_9_, (byte) 31));
                if (class248_sub10 != null) {
                    Class346_Sub7_Sub3.anInt9935++;
                    Class221.anInt2537 = 0;
                    Node_Sub14_Sub37.anInt9562 = i;
                    NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                    Class151.anInt1799 = i_5_;
                    Class276.anInt3206 = 2;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class326.aOutgoingOpcode_4820);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, i_9_);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(Class168.anInt1963, -231665880);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, InputStream_Sub2.anInt76);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt1(Class346_Sub7_Sub5.anInt9963, (byte) -64);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteS((byte) 105, Class353.aClass253_4192.method2722(true, 82) ? 1 : 0);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class344.method3520(0, ((Entity) NPC).posQueueY[0], 0, NPC.method3632(-1), -2, NPC.method3632(-1), true, ((Entity) NPC).posQueueX[0], -1);
                }
            }
            if ((i_8_ ^ 0xffffffff) == -31 && Class282_Sub17.aClass354_7773 == null) {
                Class346_Sub7_Sub5_Sub2.method3701(i_7_, -1, i_6_);
                Class282_Sub17.aClass354_7773 = Class188.method1635(i_7_, i_6_, 0);
                Class376.method3882(Class282_Sub17.aClass354_7773, 2260);
            }
            if (i_8_ == 44) {
                Class12.anInt250++;
                Class276.anInt3206 = 2;
                Class151.anInt1799 = i_5_;
                Node_Sub14_Sub37.anInt9562 = i;
                Class221.anInt2537 = 0;
                Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class328.aOutgoingOpcode_3839);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEInt((byte) 114, Class346_Sub7_Sub5.anInt9963);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, Class368.baseY + i_7_);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteA(Class353.aClass253_4192.method2722(true, 82) ? 1 : 0, (byte) 122);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_9_, 105);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(InputStream_Sub2.anInt76, 59);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(Class67.baseX + i_6_, 107);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, Class168.anInt1963);
                Class226_Sub3.method1814(class248_sub36, 0);
                Class349_Sub1.method3738(i_6_, i_7_, (byte) 40);
            }
            if (i_8_ == 13) {
                Player player = (Node_Sub32.aPlayerArray7197[i_9_]);
                if (player != null) {
                    Class276.anInt3206 = 2;
                    Node_Sub14_Sub37.anInt9562 = i;
                    Class151.anInt1799 = i_5_;
                    Class221.anInt2537 = 0;
                    Class321.anInt3727++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class381.aOutgoingOpcode_4684);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, i_9_);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteC((!Class353.aClass253_4192.method2722(!bool, 82) ? 0 : 1), (byte) 103);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class344.method3520(0, ((Entity) player).posQueueY[0], 0, player.method3632(-1), -2, player.method3632(-1), true, ((Entity) player).posQueueX[0], -1);
                }
            }
            if (i_8_ == 48 || (i_8_ ^ 0xffffffff) == -1004)
                Class5.sendClickedButtonPacket((((Node_Sub8_Sub11) class248_sub8_sub11).aString9001), -1, i_6_, i_7_, i_9_);
            if ((i_8_ ^ 0xffffffff) == -51) {
                Class151.anInt1799 = i_5_;
                Node_Sub14_Sub37.anInt9562 = i;
                Class221.anInt2537 = 0;
                Class98.anInt1262++;
                Class276.anInt3206 = 2;
                Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class105.aOutgoingOpcode_1345);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-127, Class353.aClass253_4192.method2722(true, 82) ? 1 : 0);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(Class368.baseY + i_7_, 121);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(Class67.baseX + i_6_, 95);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(!bool, i_9_);
                Class226_Sub3.method1814(class248_sub36, 0);
                Class349_Sub1.method3738(i_6_, i_7_, (byte) 40);
            }
            if ((i_8_ ^ 0xffffffff) == -46) {
                if (Class226_Sub1_Sub1.anInt8801 <= 0 || !Class353.aClass253_4192.method2722(true, 82) || !Class353.aClass253_4192.method2722(true, 81)) {
                    Node_Sub36 class248_sub36 = Node_Sub14_Sub17.method2326(i_9_, (byte) 26, i_7_, i_6_);
                    if (i_9_ != 1) {
                        Class221.anInt2537 = 0;
                        Class276.anInt3206 = 1;
                        Node_Sub14_Sub37.anInt9562 = i;
                        Class151.anInt1799 = i_5_;
                    } else {
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-48, -1);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-68, -1);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, (int) Class282_Sub7.aFloat7661);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-108, 57);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-23, Class346_Sub7_Sub5.anInt9958);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-58, Class252.anInt2843);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-52, 89);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, (((Interactable) Class347.myPlayer).x));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, (((Interactable) Class347.myPlayer).y));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-92, 63);
                    }
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class344.method3520(0, i_7_, 0, 1, -4, 1, true, i_6_, -1);
                } else
                    Class258.method2756(Class368.baseY + i_7_, Class67.baseX + i_6_, (((Interactable) Class347.myPlayer).plane), false);
            }
            if (bool == false) {
                if ((i_8_ ^ 0xffffffff) == -6) {
                    Player player = (Node_Sub32.aPlayerArray7197[i_9_]);
                    if (player != null) {
                        Class276.anInt3206 = 2;
                        Node_Sub14_Sub37.anInt9562 = i;
                        Class151.anInt1799 = i_5_;
                        Class221.anInt2537 = 0;
                        Class258.anInt2946++;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub19.aOutgoingOpcode_7032));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, i_9_);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteS((byte) 123, (Class353.aClass253_4192.method2722(true, 82) ? 1 : 0));
                        Class226_Sub3.method1814(class248_sub36, 0);
                        Class344.method3520(0, ((Entity) player).posQueueY[0], 0, player.method3632(-1), -2, player.method3632(-1), true, ((Entity) player).posQueueX[0], -1);
                    }
                }
                if (i_8_ == 16) {
                    Class151.anInt1799 = i_5_;
                    Node_Sub14_Sub37.anInt9562 = i;
                    Node_Sub14_Sub25.anInt9414++;
                    Class221.anInt2537 = 0;
                    Class276.anInt3206 = 2;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class211.aOutgoingOpcode_2445);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(Class368.baseY + i_7_, 97);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, Class67.baseX + i_6_);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, 0x7fffffff & (int) (l >>> -1306473312));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteA(Class353.aClass253_4192.method2722(true, 82) ? 1 : 0, (byte) 119);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class373.method3871(i_6_, l, i_7_, 0);
                }
                if (i_8_ == 19) {
                    Node_Sub14_Sub37.anInt9562 = i;
                    Node_Sub2_Sub2.anInt8843++;
                    Class276.anInt3206 = 2;
                    Class151.anInt1799 = i_5_;
                    Class221.anInt2537 = 0;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class346_Sub5_Sub1.aOutgoingOpcode_9884));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteA(!Class353.aClass253_4192.method2722(true, 82) ? 0 : 1, (byte) 95);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_7_ - -Class368.baseY, 117);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_6_ - -Class67.baseX, 91);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_9_, 86);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class349_Sub1.method3738(i_6_, i_7_, (byte) 40);
                }
                if (i_8_ == 1011) {
                    Class151.anInt1799 = i_5_;
                    Class221.anInt2537 = 0;
                    Class219.anInt2521++;
                    Class276.anInt3206 = 2;
                    Node_Sub14_Sub37.anInt9562 = i;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class326.aOutgoingOpcode_4821);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, i_9_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if ((i_8_ ^ 0xffffffff) == -9) {
                    Player player = (Node_Sub32.aPlayerArray7197[i_9_]);
                    if (player != null) {
                        Class276.anInt3206 = 2;
                        Class221.anInt2537 = 0;
                        Class249.anInt2806++;
                        Class151.anInt1799 = i_5_;
                        Node_Sub14_Sub37.anInt9562 = i;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class282_Sub28.aOutgoingOpcode_7891));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_9_, 52);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteC((!Class353.aClass253_4192.method2722(!bool, 82) ? 0 : 1), (byte) 95);
                        Class226_Sub3.method1814(class248_sub36, 0);
                        Class344.method3520(0, ((Entity) player).posQueueY[0], 0, player.method3632(-1), -2, player.method3632(-1), true, ((Entity) player).posQueueX[0], -1);
                    }
                }
                if (i_8_ == 1002) {
                    Class151.anInt1799 = i_5_;
                    Class221.anInt2537 = 0;
                    Node_Sub14_Sub37.anInt9562 = i;
                    Class276.anInt3206 = 2;
                    Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_9_, (byte) 31));
                    if (class248_sub10 != null) {
                        NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                        Class255 class255 = (((NPC) NPC).aClass255_10614);
                        if (((Class255) class255).anIntArray2923 != null)
                            class255 = class255.method2737((byte) 83, (Node_Sub43.aClass291_7306));
                        if (class255 != null) {
                            Class287.anInt3384++;
                            Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (aa_Sub2.aOutgoingOpcode_5260));
                            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, ((Class255) class255).anInt2914);
                            Class226_Sub3.method1814(class248_sub36, 0);
                        }
                    }
                }
                if (i_8_ == 2) {
                    if (Class226_Sub1_Sub1.anInt8801 <= 0 || !Class353.aClass253_4192.method2722(!bool, 82) || !Class353.aClass253_4192.method2722(true, 81)) {
                        Node_Sub2_Sub1.anInt8824++;
                        Class221.anInt2537 = 0;
                        Node_Sub14_Sub37.anInt9562 = i;
                        Class151.anInt1799 = i_5_;
                        Class276.anInt3206 = 1;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub14_Sub35.aOutgoingOpcode_9538));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(Class67.baseX + i_6_, -231665880);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(Class368.baseY + i_7_, -231665880);
                        Class226_Sub3.method1814(class248_sub36, 0);
                    } else
                        Class258.method2756(Class368.baseY + i_7_, Class67.baseX - -i_6_, (((Interactable) Class347.myPlayer).plane), false);
                }
                if ((i_8_ ^ 0xffffffff) == -26) {
                    RSInterface2 class354 = Class188.method1635(i_7_, i_6_, 0);
                    if (class354 != null)
                        Class346_Sub7_Sub3_Sub1.method3675(class354, false);
                }
                if ((i_8_ ^ 0xffffffff) == -19) {
                    Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_9_, (byte) 31));
                    if (class248_sub10 != null) {
                        Node_Sub14_Sub37.anInt9562 = i;
                        Class333.anInt3889++;
                        Class276.anInt3206 = 2;
                        Class151.anInt1799 = i_5_;
                        NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                        Class221.anInt2537 = 0;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class181.aOutgoingOpcode_2095));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteC((Class353.aClass253_4192.method2722(true, 82) ? 1 : 0), (byte) 124);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_9_, 63);
                        Class226_Sub3.method1814(class248_sub36, 0);
                        Class344.method3520(0, ((Entity) NPC).posQueueY[0], 0, NPC.method3632(-1), -2, NPC.method3632(-1), true, ((Entity) NPC).posQueueX[0], -1);
                    }
                }
                if (i_8_ == 4) {
                    Node_Sub14_Sub37.anInt9562 = i;
                    Class358.anInt4418++;
                    Class276.anInt3206 = 2;
                    Class221.anInt2537 = 0;
                    Class151.anInt1799 = i_5_;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class352.aOutgoingOpcode_4183);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteC(Class353.aClass253_4192.method2722(true, 82) ? 1 : 0, (byte) 109);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(Class67.baseX + i_6_, 43);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, i_7_ - -Class368.baseY);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA((int) (l >>> 483092128) & 0x7fffffff, -231665880);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class373.method3871(i_6_, l, i_7_, 0);
                }
                if (i_8_ == 15) {
                    Class276.anInt3206 = 2;
                    Class151.anInt1799 = i_5_;
                    Class49.anInt657++;
                    Class221.anInt2537 = 0;
                    Node_Sub14_Sub37.anInt9562 = i;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Applet_Sub1.aOutgoingOpcode_42);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(i_9_, -231665880);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(i_7_ - -Class368.baseY, -231665880);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteA((!Class353.aClass253_4192.method2722(!bool, 82) ? 0 : 1), (byte) 112);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, Class67.baseX + i_6_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class349_Sub1.method3738(i_6_, i_7_, (byte) 40);
                }
                if (i_8_ == 60) {
                    Player player = (Node_Sub32.aPlayerArray7197[i_9_]);
                    if (player != null) {
                        Class151.anInt1799 = i_5_;
                        Class221.anInt2537 = 0;
                        Class276.anInt3206 = 2;
                        Node_Sub14_Sub37.anInt9562 = i;
                        Class112_Sub3.anInt8642++;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class29.aOutgoingOpcode_372);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(i_9_, -231665880);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(InputStream_Sub2.anInt76, -231665880);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, Class168.anInt1963);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-124, (Class353.aClass253_4192.method2722(true, 82) ? 1 : 0));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, Class346_Sub7_Sub5.anInt9963);
                        Class226_Sub3.method1814(class248_sub36, 0);
                        Class344.method3520(0, ((Entity) player).posQueueY[0], 0, player.method3632(-1), -2, player.method3632(-1), true, ((Entity) player).posQueueX[0], -1);
                    }
                }
                if (i_8_ == 1009) {
                    Class339.anInt3949++;
                    Class276.anInt3206 = 2;
                    Class221.anInt2537 = 0;
                    Class151.anInt1799 = i_5_;
                    Node_Sub14_Sub37.anInt9562 = i;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class250.aOutgoingOpcode_2825);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, i_9_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if ((i_8_ ^ 0xffffffff) == -21) {
                    Player player = (Node_Sub32.aPlayerArray7197[i_9_]);
                    if (player != null) {
                        Class221.anInt2537 = 0;
                        Class151.anInt1799 = i_5_;
                        Node_Sub14_Sub37.anInt9562 = i;
                        Class276.anInt3206 = 2;
                        Class7.anInt170++;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class112_Sub2.aOutgoingOpcode_8632));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(i_9_, -231665880);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteA((Class353.aClass253_4192.method2722(!bool, 82) ? 1 : 0), (byte) 116);
                        Class226_Sub3.method1814(class248_sub36, 0);
                        Class344.method3520(0, ((Entity) player).posQueueY[0], 0, player.method3632(-1), -2, player.method3632(-1), true, ((Entity) player).posQueueX[0], -1);
                    }
                }
                if (i_8_ == 1006 || i_8_ == 1004 || (i_8_ ^ 0xffffffff) == -1008 || (i_8_ ^ 0xffffffff) == -1002 || (i_8_ ^ 0xffffffff) == -1013)
                    Node_Sub14_Sub13.method2314(113, i_8_, i_9_, i_6_);
                if (i_8_ == 1008) {
                    Class276.anInt3206 = 2;
                    Class151.anInt1799 = i_5_;
                    Class236.anInt2629++;
                    Node_Sub14_Sub37.anInt9562 = i;
                    Class221.anInt2537 = 0;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class172.aOutgoingOpcode_2000);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(Class368.baseY + i_7_, 79);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_6_ + Class67.baseX, 56);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA((int) (l >>> 858597856) & 0x7fffffff, 79);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteC(Class353.aClass253_4192.method2722(true, 82) ? 1 : 0, (byte) 91);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class373.method3871(i_6_, l, i_7_, 0);
                }
                if (i_8_ == 11) {
                    Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_9_, (byte) 31));
                    if (class248_sub10 != null) {
                        Class151.anInt1799 = i_5_;
                        Node_Sub14_Sub37.anInt9562 = i;
                        Class221.anInt2537 = 0;
                        NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                        Class315.anInt3658++;
                        Class276.anInt3206 = 2;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class209.aOutgoingOpcode_2422));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteC((!Class353.aClass253_4192.method2722(!bool, 82) ? 0 : 1), (byte) 96);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_9_, 58);
                        Class226_Sub3.method1814(class248_sub36, 0);
                        Class344.method3520(0, ((Entity) NPC).posQueueY[0], 0, NPC.method3632(-1), -2, NPC.method3632(-1), true, ((Entity) NPC).posQueueX[0], -1);
                    }
                }
                if (i_8_ == 17) {
                    RSInterface2 class354 = Class188.method1635(i_7_, i_6_, 0);
                    if (class354 != null) {
                        Class1.method168((byte) 11);
                        Node_Sub48 class248_sub48 = client.method113(class354);
                        Node_Sub14_Sub13.method2312(((Node_Sub48) class248_sub48).anInt7418, 1, class354, class248_sub48.method2673(2));
                        Node_Sub8_Sub4.aString8364 = Node_Sub8_Sub15.method2133(-1, class354);
                        Class287.aString3382 = (((RSInterface2) class354).aString4210 + "<col=ffffff>");
                        if (Node_Sub8_Sub4.aString8364 == null)
                            Node_Sub8_Sub4.aString8364 = "Null";
                    }
                } else {
                    if (i_8_ == 57) {
                        Class276.anInt3206 = 2;
                        Class151.anInt1799 = i_5_;
                        Class221.anInt2537 = 0;
                        Node_Sub14_Sub37.anInt9562 = i;
                        Class112_Sub3.anInt8640++;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class346_Sub7_Sub1_Sub2.aOutgoingOpcode_10198));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteA((Class353.aClass253_4192.method2722(true, 82) ? 1 : 0), (byte) 99);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, i_6_ - -Class67.baseX);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, i_7_ + Class368.baseY);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, i_9_);
                        Class226_Sub3.method1814(class248_sub36, 0);
                        Class349_Sub1.method3738(i_6_, i_7_, (byte) 40);
                    }
                    if (i_8_ == 22) {
                        Node_Sub14_Sub37.anInt9562 = i;
                        Class276.anInt3206 = 2;
                        Class112_Sub3.anInt8642++;
                        Class221.anInt2537 = 0;
                        Class151.anInt1799 = i_5_;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class29.aOutgoingOpcode_372);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA((((Entity) Class347.myPlayer).anInt10484), -231665880);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(InputStream_Sub2.anInt76, -231665880);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, Class168.anInt1963);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-38, (Class353.aClass253_4192.method2722(true, 82) ? 1 : 0));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, Class346_Sub7_Sub5.anInt9963);
                        Class226_Sub3.method1814(class248_sub36, 0);
                    }
                    if (i_8_ == 10) {
                        Class221.anInt2537 = 0;
                        Class2.anInt127++;
                        Class151.anInt1799 = i_5_;
                        Class276.anInt3206 = 2;
                        Node_Sub14_Sub37.anInt9562 = i;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class316_Sub1_Sub2.aOutgoingOpcode_9862));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(Class368.baseY + i_7_, 46);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteA((!Class353.aClass253_4192.method2722(true, 82) ? 0 : 1), (byte) 118);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, i_6_ - -Class67.baseX);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA((int) (l >>> -439113120) & 0x7fffffff, -231665880);
                        Class226_Sub3.method1814(class248_sub36, 0);
                        Class373.method3871(i_6_, l, i_7_, 0);
                    }
                    if ((i_8_ ^ 0xffffffff) == -47) {
                        Node_Sub14_Sub37.anInt9562 = i;
                        Class136.anInt4769++;
                        Class221.anInt2537 = 0;
                        Class151.anInt1799 = i_5_;
                        Class276.anInt3206 = 2;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class264.aOutgoingOpcode_2993));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, i_7_ + Class368.baseY);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(Class67.baseX + i_6_, -231665880);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, Class168.anInt1963);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByteC((!Class353.aClass253_4192.method2722(true, 82) ? 0 : 1), (byte) 115);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA((int) (l >>> 117421728) & 0x7fffffff, 118);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEInt((byte) 113, Class346_Sub7_Sub5.anInt9963);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, InputStream_Sub2.anInt76);
                        Class226_Sub3.method1814(class248_sub36, 0);
                        Class373.method3871(i_6_, l, i_7_, 0);
                    }
                    if ((i_8_ ^ 0xffffffff) == -22) {
                        Class151.anInt1799 = i_5_;
                        Class235.anInt2618++;
                        Node_Sub14_Sub37.anInt9562 = i;
                        Class221.anInt2537 = 0;
                        Class276.anInt3206 = 1;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class64.aOutgoingOpcode_858);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(Class168.anInt1963, -231665880);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(InputStream_Sub2.anInt76, -231665880);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEInt((byte) 121, Class346_Sub7_Sub5.anInt9963);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(!bool, Class67.baseX + i_6_);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(!bool, Class368.baseY + i_7_);
                        Class226_Sub3.method1814(class248_sub36, 0);
                        Class344.method3520(0, i_7_, 0, 1, -4, 1, true, i_6_, -1);
                    }
                    if ((i_8_ ^ 0xffffffff) == -4) {
                        Player player = (Node_Sub32.aPlayerArray7197[i_9_]);
                        if (player != null) {
                            Class221.anInt2537 = 0;
                            Class151.anInt1799 = i_5_;
                            Node_Sub14_Sub37.anInt9562 = i;
                            Class276.anInt3206 = 2;
                            Class346_Sub7_Sub2_Sub2.anInt10335++;
                            Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class340_Sub8.aOutgoingOpcode_8190));
                            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-84, (Class353.aClass253_4192.method2722(true, 82) ? 1 : 0));
                            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_9_, 104);
                            Class226_Sub3.method1814(class248_sub36, 0);
                            Class344.method3520(0, (((Entity) player).posQueueY[0]), 0, player.method3632(-1), -2, player.method3632(-1), true, (((Entity) player).posQueueX[0]), -1);
                        }
                    }
                    if (Class115.aBoolean4952)
                        Class1.method168((byte) -125);
                    if (Class18.aClass354_294 != null && Node_Sub8.anInt6874 == 0)
                        Class376.method3882(Class18.aClass354_294, 2260);
                }
            }
        }
    }

    static final void method3451(byte i, int i_10_, Class381 class381, Class381 class381_11_) {
        Node_Sub42.aClass381_7299 = class381_11_;
        if (i != 94)
            method3449(true, null, false);
        anInt8111++;
        Class109.aClass381_1371 = class381;
    }

    final void method3435(boolean bool, int i) {
        if (i > 109) {
            ((Class340) this).aHa_Sub3_3954.method955((byte) 73, Class142.aClass5_1669, Class60.aClass5_821);
            anInt8099++;
        }
    }

    final void method3443(boolean bool, boolean bool_12_) {
        anInt8107++;
        Interface21_Impl3 interface21_impl3 = ((Class340) this).aHa_Sub3_3954.method974(0);
        if (bool != true)
            anInt8109 = 64;
        if (interface21_impl3 == null || !bool_12_)
            ((Class340) this).aHa_Sub3_3954.method951(Class282_Sub2.aClass280_7605, (byte) 97, 0);
        else {
            ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
            ((Class340) this).aHa_Sub3_3954.method929(interface21_impl3, -8423);
            ((Class340) this).aHa_Sub3_3954.method999(123, Class282_Sub27.aClass181_7871);
            ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
            ((Class340) this).aHa_Sub3_3954.method955((byte) 124, Class142.aClass5_1669, (Class316_Sub1_Sub2.aClass5_9850));
            ((Class340) this).aHa_Sub3_3954.method1017(-8980, 2, (Class346_Sub7_Sub3_Sub1.aClass280_10511), false, true);
            ((Class340) this).aHa_Sub3_3954.method951(Class282_Sub2.aClass280_7605, (byte) 97, 0);
            Class238_Sub2 class238_sub2 = ((Class340) this).aHa_Sub3_3954.method1022(0);
            class238_sub2.method1886((byte) 87, ((Class340) this).aHa_Sub3_3954.method958(47));
            ((Class340) this).aHa_Sub3_3954.method984(3, Node_Sub14_Sub31.aClass34_9493);
            ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
            aBoolean8100 = true;
        }
    }

    Class340_Sub2(ha_Sub3 var_ha_Sub3) {
        super(var_ha_Sub3);
    }
}
