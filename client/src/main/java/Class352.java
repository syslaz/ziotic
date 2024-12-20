/* Class352 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

final class Class352 {
    static int anInt4177;
    static int anInt4178;
    static int anInt4179 = -1;
    static int anInt4180;
    static Class157 aClass157_4181;
    static short aShort4182 = 1;
    static OutgoingOpcode aOutgoingOpcode_4183 = new OutgoingOpcode(12, 7);
    static int anInt4184;
    Interface1 anInterface1_4185;
    static Class27 aClass27_4186;
    static Class27 aClass27_4187;
    static String aString4188;
    static Class208 aClass208_4189;

    public static void method3748(int i) {
        aString4188 = null;
        aClass27_4186 = null;
        int i_0_ = 7 % ((62 - i) / 60);
        aClass208_4189 = null;
        aClass157_4181 = null;
        aOutgoingOpcode_4183 = null;
        aClass27_4187 = null;
    }

    static final Class90 method3749(int i, int i_1_) {
        anInt4180++;
        Class90 class90 = ((Class90) Canvas_Sub1.aClass278_70.method2863(i_1_ + 11840, (long) i));
        if (class90 != null)
            return class90;
        byte[] is = Class340_Sub3.aClass381_8115.method3922((byte) 127, 0, i);
        class90 = new Class90();
        if (is != null)
            class90.method675((byte) -50, new ByteStream(is));
        if (i_1_ != -11836)
            return null;
        class90.method676(i_1_ + 6293);
        Canvas_Sub1.aClass278_70.method2867((byte) 0, (long) i, class90);
        return class90;
    }

    static final RSInterface2 method3750(byte i, RSInterface2 class354) {
        anInt4184++;
        RSInterface2 class354_2_ = client.method111(class354);
        if (class354_2_ == null)
            class354_2_ = ((RSInterface2) class354).aClass354_4272;
        if (i != 48)
            return null;
        return class354_2_;
    }

    static final Node_Sub36 method3751(int i) {
        anInt4178++;
        Node_Sub36 class248_sub36 = Class139.method1279((byte) -62);
        ((Node_Sub36) class248_sub36).aOutgoingOpcode_7256 = null;
        ((Node_Sub36) class248_sub36).anInt7260 = i;
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257 = new PacketStream(5000);
        return class248_sub36;
    }

    static final void method3752(int i) {
        anInt4177++;
        if (Class321.loginStage != 0 && (Class321.loginStage ^ 0xffffffff) != -6) {
            try {
                int i_3_;
                if (Class59.anInt815 != 0)
                    i_3_ = 2000;
                else
                    i_3_ = 250;
                if (++Class198.anInt2248 > i_3_) {
                    if (Class289.aClass111_3398 != null) {
                        Class289.aClass111_3398.method774(-1);
                        Class289.aClass111_3398 = null;
                    }
                    if (Class59.anInt815 < 3) {
                        if ((Class154.loginType ^ 0xffffffff) == -3)
                            Class346_Sub7_Sub2_Sub4.aWorldAddress_10119.method679((byte) -89);
                        else
                            Class86_Sub1.lobbyAddress.method679((byte) -54);
                        Class321.loginStage = 1;
                        Class198.anInt2248 = 0;
                        Class59.anInt815++;
                    } else {
                        Class321.loginStage = 0;
                        Class84_Sub1.method605(-5, (byte) -111);
                        return;
                    }
                }
                if ((Class321.loginStage ^ 0xffffffff) == -2) {
                    if (Class154.loginType == 2)
                        Class13.aClass322_255 = (Class346_Sub7_Sub2_Sub4.aWorldAddress_10119.method680(43594, Node_Sub14_Sub15.aClass174_9328));
                    else
                        Class13.aClass322_255 = (Class86_Sub1.lobbyAddress.method680(43594, Node_Sub14_Sub15.aClass174_9328));
                    Class321.loginStage = 2;
                }
                if ((Class321.loginStage ^ 0xffffffff) == -3) {
                    if ((Class13.aClass322_255.anInt3788 ^ 0xffffffff) == -3)
                        throw new IOException();
                    if ((Class13.aClass322_255.anInt3788 ^ 0xffffffff) != -2)
                        return;
                    Class289.aClass111_3398 = Class94.method693(7500, (byte) -73, (Socket) (Class13.aClass322_255.anObject3787));
                    Class13.aClass322_255 = null;
                    Node_Sub14_Sub24.method2347((byte) 35);
                    Node_Sub36 class248_sub36 = method3751(0);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-36, ((Class224) Class356.aClass224_4391).opcode);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class285.method3074(i + 7374);
                    Class321.loginStage = 3;
                }
                if (Class321.loginStage == 3) {
                    if (!Class289.aClass111_3398.method772(1, 1))
                        return;
                    Class289.aClass111_3398.method780((((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).buffer), 1, i ^ ~0x75, 0);
                    int i_4_ = 0xff & (((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).buffer[0]);
                    if ((i_4_ ^ 0xffffffff) != -1) {
                        Class321.loginStage = 0;
                        Class84_Sub1.method605(i_4_, (byte) -111);
                        Class289.aClass111_3398.method774(-1);
                        Class289.aClass111_3398 = null;
                        NPC.method3664(i + 92);
                        return;
                    }
                    ((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset = 0;
                    ByteStream class248_sub9 = new ByteStream(518);
                    int[] is = new int[4];
                    is[2] = (int) (Math.random() * 9.9999999E7);
                    is[1] = (int) (Math.random() * 9.9999999E7);
                    is[0] = (int) (9.9999999E7 * Math.random());
                    is[3] = (int) (Math.random() * 9.9999999E7);
                    class248_sub9.writeByte(-105, 10);
                    class248_sub9.writeInt(27695, is[0]);
                    class248_sub9.writeInt(i + 27681, is[1]);
                    class248_sub9.writeInt(27695, is[2]);
                    class248_sub9.writeInt(i ^ 0x6c21, is[3]);
                    class248_sub9.writeLong(14731, 0L);
                    class248_sub9.method2183(Node_Sub8.aString6862, (byte) -109);
                    class248_sub9.writeLong(i + 14717, za_Sub1.aLong9803);
                    class248_sub9.writeLong(14731, Class1.aLong109);
                    class248_sub9.method2194(Class111_Sub1.aBigInteger5527, (Node_Sub40_Sub1.aBigInteger9773), 109);
                    Node_Sub14_Sub24.method2347((byte) 77);
                    Node_Sub36 class248_sub36 = method3751(0);
                    PacketStream class248_sub9_sub2 = (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257);
                    if (Class154.loginType == 2) {
                        if (Class273.anInt5008 == 13)
                            class248_sub9_sub2.writeByte(-113, (((Class224) (Class356.aClass224_4397)).opcode));
                        else
                            class248_sub9_sub2.writeByte(i ^ ~0x42, (((Class224) (Class356.aClass224_4395)).opcode));
                        class248_sub9_sub2.writeShort(1182, 0);
                        int i_5_ = ((ByteStream) class248_sub9_sub2).offset;
                        class248_sub9_sub2.writeInt(27695, 640);
                        class248_sub9_sub2.writeShort(1182, client.loaderVersion);
                        class248_sub9_sub2.writeShort(1182, client.clientVersion);
                        class248_sub9_sub2.method2215(0, (byte) -32, ((ByteStream) class248_sub9).buffer, ((ByteStream) class248_sub9).offset);
                        int i_6_ = ((ByteStream) class248_sub9_sub2).offset;
                        class248_sub9_sub2.method2183(Class212.aString2453, (byte) -96);
                        class248_sub9_sub2.writeByte(-26, Class312.anInt3627);
                        class248_sub9_sub2.writeByte(-48, Class346_Sub7_Sub3.method3672((byte) -112));
                        class248_sub9_sub2.writeShort(1182, Class146.anInt1724);
                        class248_sub9_sub2.writeShort(i ^ 0x490, Class282_Sub20.anInt7800);
                        class248_sub9_sub2.writeByte(-118, ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub6_7357.method2946(true));
                        Class239.method1913((byte) 61, class248_sub9_sub2);
                        class248_sub9_sub2.method2183(Class84_Sub8.aString5473, (byte) -92);
                        class248_sub9_sub2.writeInt(27695, Node_Sub8_Sub5.anInt8930);
                        ByteStream class248_sub9_7_ = Node_Sub14_Sub38.aClass248_Sub45_9584.method2646((byte) -112);
                        class248_sub9_sub2.writeByte(-33, (((ByteStream) class248_sub9_7_).offset));
                        class248_sub9_sub2.method2215(0, (byte) -32, ((ByteStream) class248_sub9_7_).buffer, ((ByteStream) class248_sub9_7_).offset);
                        Class37.aBoolean408 = true;
                        ByteStream class248_sub9_8_ = new ByteStream(InputStream_Sub2.aClass248_Sub24_78.method2545(72));
                        InputStream_Sub2.aClass248_Sub24_78.method2543(class248_sub9_8_, -92);
                        class248_sub9_sub2.method2215(0, (byte) -32, ((ByteStream) class248_sub9_8_).buffer, (((ByteStream) class248_sub9_8_).buffer).length);
                        class248_sub9_sub2.writeShort(1182, Class69.anInt910);
                        class248_sub9_sub2.writeLong(14731, Class54_Sub2.aLong5343);
                        class248_sub9_sub2.writeByte(-59, (Class8.aString182 != null) ? 1 : 0);
                        if (Class8.aString182 != null)
                            class248_sub9_sub2.method2183(Class8.aString182, (byte) -77);
                        class248_sub9_sub2.writeByte(-128, !Class54_Sub1.method431("jagtheora", -22534) ? 0 : 1);
                        class248_sub9_sub2.writeByte(-59, !Class176.aBoolean2058 ? 0 : 1);
                        Class90.method673(class248_sub9_sub2, (byte) -81);
                        class248_sub9_sub2.method2184(is, (((ByteStream) class248_sub9_sub2).offset), (byte) 112, i_6_);
                        class248_sub9_sub2.method2206((((ByteStream) class248_sub9_sub2).offset) + -i_5_, i ^ ~0xf);
                    } else {
                        class248_sub9_sub2.writeByte(i + -110, ((Class224) Class356.aClass224_4398).opcode);
                        class248_sub9_sub2.writeShort(1182, 0);
                        int i_9_ = ((ByteStream) class248_sub9_sub2).offset;
                        class248_sub9_sub2.writeInt(27695, 640);
                        class248_sub9_sub2.writeShort(1182, client.loaderVersion);
                        class248_sub9_sub2.writeShort(1182, client.clientVersion);
                        class248_sub9_sub2.method2215(0, (byte) -32, ((ByteStream) class248_sub9).buffer, ((ByteStream) class248_sub9).offset);
                        int i_10_ = ((ByteStream) class248_sub9_sub2).offset;
                        class248_sub9_sub2.method2183(Class212.aString2453, (byte) -80);
                        class248_sub9_sub2.writeByte(i + -35, (((Class215) Class12.aClass215_249).anInt2475));
                        class248_sub9_sub2.writeByte(i + -87, Class191.anInt4822);
                        Class239.method1913((byte) 61, class248_sub9_sub2);
                        class248_sub9_sub2.method2183(Class84_Sub8.aString5473, (byte) -115);
                        class248_sub9_sub2.writeInt(27695, Node_Sub8_Sub5.anInt8930);
                        Class90.method673(class248_sub9_sub2, (byte) -113);
                        class248_sub9_sub2.method2184(is, (((ByteStream) class248_sub9_sub2).offset), (byte) 112, i_10_);
                        class248_sub9_sub2.method2206((((ByteStream) class248_sub9_sub2).offset) + -i_9_, -2);
                    }
                    Class226_Sub3.method1814(class248_sub36, i ^ 0xe);
                    Class285.method3074(7388);
                    Class346_Sub5_Sub2.aISAACCypher_9889 = new ISAACCypher(is);
                    for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -5; i_11_++)
                        is[i_11_] += 50;
                    Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2227((byte) 105, is);
                    Class321.loginStage = 4;
                }
                if ((Class321.loginStage ^ 0xffffffff) == -5) {
                    if (!Class289.aClass111_3398.method772(1, 1))
                        return;
                    Class289.aClass111_3398.method780((((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).buffer), 1, -128, 0);
                    int i_12_ = 0xff & (((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).buffer[0]);
                    if (i_12_ != 21) {
                        if (i_12_ == 29)
                            Class321.loginStage = 13;
                        else {
                            if (i_12_ == 1) {
                                Class321.loginStage = 5;
                                Class84_Sub1.method605(i_12_, (byte) -111);
                                return;
                            }
                            if ((i_12_ ^ 0xffffffff) == -3)
                                Class321.loginStage = 8;
                            else {
                                if ((i_12_ ^ 0xffffffff) != -16) {
                                    if (i_12_ != 23 || (Class59.anInt815 ^ 0xffffffff) <= -4) {
                                        Class321.loginStage = 0;
                                        Class84_Sub1.method605(i_12_, (byte) -111);
                                        Class289.aClass111_3398.method774(-1);
                                        Class289.aClass111_3398 = null;
                                        NPC.method3664(i ^ 0x6c);
                                    } else {
                                        Class198.anInt2248 = 0;
                                        Class59.anInt815++;
                                        Class321.loginStage = 1;
                                        Class289.aClass111_3398.method774(-1);
                                        Class289.aClass111_3398 = null;
                                        return;
                                    }
                                    return;
                                }
                                Class30.currentPacketSize = -2;
                                Class321.loginStage = 14;
                            }
                        }
                    } else
                        Class321.loginStage = 7;
                }
                if ((Class321.loginStage ^ 0xffffffff) == -7) {
                    Node_Sub14_Sub24.method2347((byte) 95);
                    Node_Sub36 class248_sub36 = method3751(0);
                    PacketStream class248_sub9_sub2 = (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257);
                    class248_sub9_sub2.method2236(Class346_Sub5_Sub2.aISAACCypher_9889, 8);
                    class248_sub9_sub2.writeOpcode(false, (((Class224) Class356.aClass224_4402).opcode));
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class285.method3074(7388);
                    Class321.loginStage = 4;
                } else if ((Class321.loginStage ^ 0xffffffff) == -8) {
                    if (Class289.aClass111_3398.method772(i ^ 0xf, 1)) {
                        Class289.aClass111_3398.method780((((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).buffer), 1, i + -140, 0);
                        int i_13_ = ((((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).buffer[0]) & 0xff);
                        Node_Sub8_Sub19.anInt9082 = i_13_ * 50;
                        Class321.loginStage = 0;
                        Class84_Sub1.method605(21, (byte) -111);
                        Class289.aClass111_3398.method774(i ^ ~0xe);
                        Class289.aClass111_3398 = null;
                        NPC.method3664(-104);
                    }
                } else if (Class321.loginStage == 13) {
                    if (Class289.aClass111_3398.method772(i ^ 0xf, 1)) {
                        Class289.aClass111_3398.method780((((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).buffer), 1, -125, 0);
                        Class81.anInt4908 = (0xff & (((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).buffer[0]));
                        Class321.loginStage = 0;
                        Class84_Sub1.method605(29, (byte) -111);
                        Class289.aClass111_3398.method774(-1);
                        Class289.aClass111_3398 = null;
                        NPC.method3664(-43);
                    }
                } else if (Class321.loginStage == 8) {
                    if (Class289.aClass111_3398.method772(1, 1)) {
                        Class289.aClass111_3398.method780((((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).buffer), 1, -124, 0);
                        Class321.loginStage = 9;
                        Node_Sub30.anInt7175 = (((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).buffer[0]) & 0xff;
                    }
                } else {
                    if ((Class321.loginStage ^ 0xffffffff) == -10) {
                        PacketStream responseBlock = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629;
                        if (Class154.loginType == 2) {
                            if (!Class289.aClass111_3398.method772(1, Node_Sub30.anInt7175))
                                return;
                            Class289.aClass111_3398.method780((((ByteStream) responseBlock).buffer), Node_Sub30.anInt7175, i + -134, 0);
                            ((ByteStream) responseBlock).offset = 0;
                            Class226_Sub1_Sub1.anInt8801 = responseBlock.readUnsignedByte((byte) -55);
                            Class7.anInt162 = responseBlock.readUnsignedByte((byte) 124);
                            Class118.aBoolean1484 = (responseBlock.readUnsignedByte((byte) -40) ^ 0xffffffff) == -2;
                            Class17.aBoolean287 = (responseBlock.readUnsignedByte((byte) 121) == 1);
                            Class381.aBoolean4679 = (responseBlock.readUnsignedByte((byte) -65) ^ 0xffffffff) == -2;
                            Node_Sub8_Sub11.aBoolean8992 = (responseBlock.readUnsignedByte((byte) 103) ^ 0xffffffff) == -2;
                            Class282_Sub29.anInt7896 = responseBlock.readShort(-1);
                            Class229.aBoolean2580 = (responseBlock.readUnsignedByte((byte) 99) == 1);
                            Class122.anInt1521 = responseBlock.method2190(20198);
                            Class115.aBoolean4950 = (responseBlock.readUnsignedByte((byte) 117) ^ 0xffffffff) == -2;
                            Class346_Sub7_Sub4_Sub2.aClass368_10161.method3837(i + 99, Class115.aBoolean4950);
                            Class283.aClass342_3343.method3494(0, Class115.aBoolean4950);
                            Class148.aClass119_5096.method1113(3, Class115.aBoolean4950);
                        } else {
                            if (!Class289.aClass111_3398.method772(i + -13, Node_Sub30.anInt7175))
                                return;
                            Class289.aClass111_3398.method780((((ByteStream) responseBlock).buffer), Node_Sub30.anInt7175, -126, 0);
                            ((ByteStream) responseBlock).offset = 0;
                            Class226_Sub1_Sub1.anInt8801 = responseBlock.readUnsignedByte((byte) -73);
                            Class7.anInt162 = responseBlock.readUnsignedByte((byte) -52);
                            Class118.aBoolean1484 = (responseBlock.readUnsignedByte((byte) 106) == 1);
                            Class17.aBoolean287 = (responseBlock.readUnsignedByte((byte) 76) ^ 0xffffffff) == -2;
                            Class381.aBoolean4679 = (responseBlock.readUnsignedByte((byte) -89) ^ 0xffffffff) == -2;
                            Class114.membershipEnd = responseBlock.readLong(1237129056);
                            int membershipFlags = responseBlock.readUnsignedByte((byte) -69);
                            Class101.aBoolean1290 = (membershipFlags & 0x2 ^ 0xffffffff) != -1;
                            Class229.aBoolean2580 = (0x1 & membershipFlags) != 0;
                            Class282_Sub19.recoveryQuestionsSetDate = responseBlock.readInt(false);
                            Node_Sub48.recoveryQuestionsSet = responseBlock.readShort(-1);
                            Canvas_Sub1.unreadMessages = responseBlock.readShort(-1);
                            Class132.lastLoggedInDate = responseBlock.readShort(-1);
                            Class366.lastIP = responseBlock.readInt(false);
                            za_Sub1.aClass322_9801 = (Node_Sub14_Sub15.aClass174_9328.method1564(Class366.lastIP, (byte) -74));
                            Class282_Sub14.emailStatus = responseBlock.readUnsignedByte((byte) 103);
                            Class317.anInt3677 = responseBlock.readShort(i ^ ~0xe);
                            Node_Sub8_Sub4.anInt8368 = responseBlock.readShort(-1);
                            Node_Sub14_Sub20.aBoolean9375 = (responseBlock.readUnsignedByte((byte) 105) ^ 0xffffffff) == -2;
                            ((Player) Class347.myPlayer).aString10550 = ((Player) Class347.myPlayer).name = Node_Sub14_Sub14.aString9306 = responseBlock.readJagString2(-77);
                            Node_Sub14_Sub25.anInt9418 = responseBlock.readUnsignedByte((byte) -113);
                            Class325.loginInterfaceRemoval = responseBlock.readInt(false);
                            Node_Sub8_Sub17.aBoolean9055 = (responseBlock.readUnsignedByte((byte) -73) ^ 0xffffffff) == -2;
                            Class307.aWorldAddress_3551 = new WorldAddress();
                            ((WorldAddress) Class307.aWorldAddress_3551).worldId = responseBlock.readShort(-1);
                            if (((WorldAddress) Class307.aWorldAddress_3551).worldId == 65535)
                                ((WorldAddress) Class307.aWorldAddress_3551).worldId = -1;
                            ((WorldAddress) Class307.aWorldAddress_3551).address = responseBlock.readJagString2(-77);
                            if (s_Sub2.aClass339_7951 != Class18.aClass339_295) {
                                ((WorldAddress) Class307.aWorldAddress_3551).port2 = (50000 + (((WorldAddress) Class307.aWorldAddress_3551).worldId));
                                ((WorldAddress) Class307.aWorldAddress_3551).port1 = (40000 - -(((WorldAddress) Class307.aWorldAddress_3551).worldId));
                            }

                            /*System.out.println("1: " + Class226_Sub1_Sub1.anInt8801);
                            System.out.println("2: " + Class7.anInt162);
                            System.out.println("3: " + Class118.aBoolean1484);
                            System.out.println("4: " + Class17.aBoolean287);
                            System.out.println("5: " + Class381.aBoolean4679);
                            System.out.println("6: " + Class114.membershipEnd);
                            System.out.println("7: " + membershipFlags);
                            System.out.println("8: " + Class282_Sub19.recoveryQuestionsSetDate);
                            System.out.println("9: " + Node_Sub48.recoveryQuestionsSet);
                            System.out.println("10: " + Canvas_Sub1.unreadMessages);
                            System.out.println("11: " + Class132.lastLoggedInDate);
                            System.out.println("12: " + Class366.lastIP);
                            System.out.println("13: " + Class282_Sub14.emailStatus);
                            System.out.println("14: " + Class317.anInt3677);
                            System.out.println("15: " + Node_Sub8_Sub4.anInt8368);
                            System.out.println("16: " + Node_Sub14_Sub20.aBoolean9375);
                            System.out.println("17: " + ((Player) Class347.aPlayer_4150).name);
                            System.out.println("18: " + Node_Sub14_Sub25.anInt9418);
                            System.out.println("19: " + Class325.loginInterfaceRemoval);
                            System.out.println("20: " + Node_Sub8_Sub17.aBoolean9055);
                            System.out.println("21: " + ((WorldAddress) Class307.aWorldAddress_3551).worldId);
                            System.out.println("22: " + ((WorldAddress) Class307.aWorldAddress_3551).address);*/

                            if (Class14.aClass339_266 != Class18.aClass339_295 && ((Class346_Sub7_Sub2_Sub4.aWorldAddress_10119.method677(Class279_Sub2_Sub1.worldAddress, (byte) -72)) || (Class346_Sub7_Sub2_Sub4.aWorldAddress_10119.method677(Class112_Sub2.demoAddress, (byte) -72))))
                                Node_Sub14_Sub22.method2344(i + 4082);
                        }
                        if (Class118.aBoolean1484 && !Class381.aBoolean4679 || Class229.aBoolean2580) {
                            try {
                                Class78.method571("zap", -8364, Class158.anApplet1881);
                            } catch (Throwable throwable) {
                                if (Class69.aBoolean913) {
                                    try {
                                        //Class158.anApplet1881.getAppletContext().showDocument(new URL(Class158.anApplet1881.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception exception) {
                                        /* empty */
                                    }
                                }
                            }
                        } else {
                            try {
                                Class78.method571("unzap", -8364, Class158.anApplet1881);
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                        }
                        if (Class18.aClass339_295 == s_Sub2.aClass339_7951) {
                            try {
                                Class78.method571("loggedin", i + -8378, Class158.anApplet1881);
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                        }
                        if (Class154.loginType != 2) {
                            Class321.loginStage = 0;
                            Class84_Sub1.method605(2, (byte) -111);
                            Class98.method708((byte) 97);
                            Node_Sub14_Sub15.method2318(7, -21035);
                            Class51.currentIncommingOpcode = null;
                            return;
                        }
                        Class321.loginStage = 11;
                    }
                    if ((Class321.loginStage ^ 0xffffffff) == -12) {
                        if (!Class289.aClass111_3398.method772(1, 3))
                            return;
                        Class289.aClass111_3398.method780((((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).buffer), 3, -120, 0);
                        Class321.loginStage = 12;
                    }
                    if (Class321.loginStage == 12) {
                        PacketStream class248_sub9_sub2 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629;
                        ((ByteStream) class248_sub9_sub2).offset = 0;
                        if (class248_sub9_sub2.method2235(1682588262)) {
                            if (!Class289.aClass111_3398.method772(1, 1))
                                return;
                            Class289.aClass111_3398.method780((((ByteStream) class248_sub9_sub2).buffer), 1, -124, 3);
                        }
                        Class51.currentIncommingOpcode = (Class290.method3094(-5)[class248_sub9_sub2.readOpcode(-87)]);
                        Class30.currentPacketSize = class248_sub9_sub2.readShort(i ^ ~0xe);
                        Class321.loginStage = 10;
                    }
                    if ((Class321.loginStage ^ 0xffffffff) == -11) {
                        if (Class289.aClass111_3398.method772(1, Class30.currentPacketSize)) {
                            Class289.aClass111_3398.method780((((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).buffer), Class30.currentPacketSize, -126, 0);
                            ((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset = 0;
                            int i_15_ = Class30.currentPacketSize;
                            Class321.loginStage = 0;
                            Class84_Sub1.method605(2, (byte) -111);
                            Class162_Sub1.method1461((byte) -124);
                            Class267.method2803((byte) -1, (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629));
                            Class150.anInt1751 = -1;
                            if (Class166.aIncommingOpcode_1946 == Class51.currentIncommingOpcode)
                                Class380.readCustomMapRegionUpdate(i + 95);
                            else
                                Class282.readMapRegionUpdate(i ^ 0x6d14ed6a);
                            if ((((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset) != i_15_)
                                throw new RuntimeException("lswp pos:" + (((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).offset) + " psize:" + i_15_);
                            Class51.currentIncommingOpcode = null;
                        }
                    } else if (Class321.loginStage == i) {
                        if ((Class30.currentPacketSize ^ 0xffffffff) == 1) {
                            if (!Class289.aClass111_3398.method772(1, 2))
                                return;
                            Class289.aClass111_3398.method780((((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).buffer), 2, i ^ ~0x76, 0);
                            ((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset = 0;
                            Class30.currentPacketSize = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                        }
                        if (Class289.aClass111_3398.method772(1, Class30.currentPacketSize)) {
                            Class289.aClass111_3398.method780((((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).buffer), Class30.currentPacketSize, i + -139, 0);
                            ((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset = 0;
                            int i_16_ = Class30.currentPacketSize;
                            Class321.loginStage = 0;
                            Class84_Sub1.method605(15, (byte) -111);
                            Class225_Sub3.method1798(i + -14);
                            Class267.method2803((byte) -1, (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629));
                            if (i_16_ != ((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).offset)
                                throw new RuntimeException("lswpr pos:" + (((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).offset) + " psize:" + i_16_);
                            Class51.currentIncommingOpcode = null;
                        }
                    }
                }
            } catch (IOException ioexception) {
                if (Class289.aClass111_3398 != null) {
                    Class289.aClass111_3398.method774(-1);
                    Class289.aClass111_3398 = null;
                }
                if ((Class59.anInt815 ^ 0xffffffff) > -4) {
                    if (Class154.loginType != 2)
                        Class86_Sub1.lobbyAddress.method679((byte) -121);
                    else
                        Class346_Sub7_Sub2_Sub4.aWorldAddress_10119.method679((byte) -41);
                    Class198.anInt2248 = 0;
                    Class321.loginStage = 1;
                    Class59.anInt815++;
                } else {
                    Class321.loginStage = 0;
                    Class84_Sub1.method605(-4, (byte) -111);
                    NPC.method3664(-113);
                }
            }
        }
    }

    static {
        aClass27_4187 = aClass27_4186 = new Class27(false);
        aClass208_4189 = new Class208(6, 1);
    }
}
