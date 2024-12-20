/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;

import java.io.IOException;

abstract class Class86 {
    private byte[] aByteArray1050;
    private String aString1051;
    private boolean aBoolean1052;
    static int anInt1053;
    static int anInt1054;
    private Node_Sub2_Sub3 aClass248_Sub2_Sub3_1055;
    static int anInt1056;
    static int anInt1057;
    private boolean aBoolean1058;
    static int anInt1059;
    private boolean aBoolean1060;
    static int anInt1061;
    private OggSyncState anOggSyncState1062;
    static int anInt1063;
    static int anInt1064;
    private OggPage anOggPage1065;
    static int anInt1066 = 0;
    static int anInt1067;
    private boolean aBoolean1068;
    static int anInt1069;
    static int anInt1070;
    private Class65 aClass65_1071;
    static int anInt1072;
    private Node_Sub2_Sub1 aClass248_Sub2_Sub1_1073;
    static int anInt1074;
    static int anInt1075;
    static int anInt1076;
    private Node_Sub2_Sub4 aClass248_Sub2_Sub4_1077;
    static int anInt1078;
    static int anInt1079;
    private OggPacket anOggPacket1080;
    static int anInt1081;

    final boolean method640(int i) {
        if (i != 0)
            return false;
        anInt1076++;
        if (!aBoolean1060 && !aBoolean1068)
            return false;
        if (aClass248_Sub2_Sub4_1077 != null && aClass248_Sub2_Sub4_1077.method2002((byte) -122) > 0)
            return false;
        return true;
    }

    private final void method641(int i) {
        anInt1054++;
        for (Node_Sub2 class248_sub2 = (Node_Sub2) aClass65_1071.method510(true); class248_sub2 != null; class248_sub2 = (Node_Sub2) aClass65_1071.method512(false)) {
            if (aClass248_Sub2_Sub1_1073 != class248_sub2) {
                while ((((Node_Sub2) class248_sub2).anOggStreamState6820.packetOut() ^ 0xffffffff) == -2)
                    class248_sub2.method1978(anOggPacket1080, 127);
            }
        }
        if (aClass248_Sub2_Sub1_1073 != null) {
            for (int i_0_ = 0; i_0_ < 10 && method650(-111); i_0_++) {
                if ((((Node_Sub2) aClass248_Sub2_Sub1_1073).anOggStreamState6820.packetOut() ^ 0xffffffff) == -2)
                    aClass248_Sub2_Sub1_1073.method1978(anOggPacket1080, 104);
                else {
                    method647(16383);
                    return;
                }
            }
            if (i >= -109)
                method654(false);
        }
    }

    final Node_Sub2_Sub3 method642(byte i) {
        if (i != 6)
            aClass248_Sub2_Sub4_1077 = null;
        anInt1070++;
        return aClass248_Sub2_Sub3_1055;
    }

    private final void method643(int i) {
        anInt1056++;
        int i_1_ = 32 / ((i - -4) / 35);
        for (Node_Sub2 class248_sub2 = (Node_Sub2) aClass65_1071.method510(true); class248_sub2 != null; class248_sub2 = (Node_Sub2) aClass65_1071.method512(false)) {
            if (class248_sub2 instanceof Node_Sub2_Sub3) {
                Node_Sub2_Sub3 class248_sub2_sub3 = (Node_Sub2_Sub3) class248_sub2;
                while (((Node_Sub2) class248_sub2_sub3).anInt6825 <= 8 || (method654(false) > (double) class248_sub2_sub3.method1995(0))) {
                    if ((((Node_Sub2) class248_sub2_sub3).anOggStreamState6820.packetOut(anOggPacket1080) ^ 0xffffffff) != -2)
                        break;
                    class248_sub2_sub3.method1978(anOggPacket1080, 112);
                }
            }
        }
        method656((byte) 103, aString1051);
    }

    private final void method644(byte i) throws IOException {
        if (i <= 120)
            aBoolean1052 = false;
        anInt1069++;
        while ((((Node_Sub2) aClass248_Sub2_Sub1_1073).anOggStreamState6820.packetOut(anOggPacket1080) ^ 0xffffffff) != -2) {
            Node_Sub2 class248_sub2 = method651((byte) 126);
            if (class248_sub2 != null) {
                if (aClass248_Sub2_Sub3_1055 == class248_sub2)
                    method643(77);
            } else {
                if (aBoolean1068)
                    method641(-114);
                return;
            }
        }
        aClass248_Sub2_Sub1_1073.method1978(anOggPacket1080, 120);
    }

    static final void method645(RSInterface2 class354, byte i, int i_2_, int i_3_, Class285 class285, String string, int i_4_, int i_5_, int i_6_, int i_7_, Class48 class48, aa var_aa) {
        anInt1059++;
        int i_8_;
        if ((Node_Sub45.anInt7343 ^ 0xffffffff) == -5)
            i_8_ = 0x3fff & (int) Class282_Sub7.aFloat7661;
        else
            i_8_ = ((int) Class282_Sub7.aFloat7661 + Class346_Sub7_Sub5.anInt9958) & 0x3fff;
        int i_9_ = (Math.max(((RSInterface2) class354).anInt4332 / 2, ((RSInterface2) class354).anInt4223 / 2) + 10);
        if (i > -43)
            method645(null, (byte) 65, -121, 106, null, null, -30, 104, -80, -3, null, null);
        int i_10_ = i_6_ * i_6_ + i_2_ * i_2_;
        if ((i_9_ * i_9_ ^ 0xffffffff) <= (i_10_ ^ 0xffffffff)) {
            int i_11_ = Node_Sub9_Sub1.anIntArray9106[i_8_];
            int i_12_ = Node_Sub9_Sub1.anIntArray9109[i_8_];
            if ((Node_Sub45.anInt7343 ^ 0xffffffff) != -5) {
                i_11_ = i_11_ * 256 / (Class252.anInt2843 - -256);
                i_12_ = i_12_ * 256 / (256 + Class252.anInt2843);
            }
            int i_13_ = i_11_ * i_2_ + i_12_ * i_6_ >> 1883228942;
            int i_14_ = -(i_11_ * i_6_) + i_2_ * i_12_ >> -1166921586;
            int i_15_ = class285.method3070(string, -127, null, 100);
            int i_16_ = class285.method3065(-1, string, 100, null, 0);
            i_13_ -= i_15_ / 2;
            if (-((RSInterface2) class354).anInt4332 <= i_13_ && ((RSInterface2) class354).anInt4332 >= i_13_ && (i_14_ ^ 0xffffffff) <= (-((RSInterface2) class354).anInt4223 ^ 0xffffffff) && ((RSInterface2) class354).anInt4223 >= i_14_)
                class48.method370((-i_14_ + i_4_ - (-(((RSInterface2) class354).anInt4223 / 2) - (-i_7_ + -i_16_))), 0, var_aa, string, i_4_, null, i_3_, (((RSInterface2) class354).anInt4332 / 2 + (i_13_ - -i_5_)), 50, 0, 0, 0, null, i_5_, 1, i_15_);
        }
    }

    static final void method646(int i, int i_17_, int i_18_) {
        anInt1061++;
        if (i_17_ != 2)
            method645(null, (byte) 30, -112, 45, null, null, -125, 6, -115, -50, null, null);
        if (Class279_Sub1.anInt7561 == 1)
            Class340_Sub2.method3450(false, i, i_18_, Class323.aClass248_Sub8_Sub11_3804);
        else if (Class279_Sub1.anInt7561 == 2) {
            if (Node_Sub8_Sub6.aBoolean8949)
                Class357.method3796(i_18_ + Class337.method3420(-2), 5966, i - -RSInterface2.method3770((byte) -26));
            else
                Class357.method3796(i_18_, 5966, i);
        }
        Class323.aClass248_Sub8_Sub11_3804 = null;
        Class279_Sub1.anInt7561 = 0;
    }

    final void method647(int i) {
        anInt1074++;
        if (!aBoolean1060) {
            for (Node_Sub2 class248_sub2 = (Node_Sub2) aClass65_1071.method510(true); class248_sub2 != null; class248_sub2 = (Node_Sub2) aClass65_1071.method512(false)) {
                class248_sub2.method1982((byte) -98);
                ((Node_Sub2) class248_sub2).anOggStreamState6820.b();
            }
            anOggPacket1080.b();
            anOggPage1065.b();
            anOggSyncState1062.b();
            if (i == 16383)
                aBoolean1060 = true;
        }
    }

    final Node_Sub2_Sub1 method648(byte i) {
        anInt1081++;
        if (i > -50)
            return null;
        return aClass248_Sub2_Sub1_1073;
    }

    final void method649(boolean bool, int i) {
        if (aClass248_Sub2_Sub4_1077 != null) {
            Node_Sub15_Sub5 class248_sub15_sub5 = aClass248_Sub2_Sub4_1077.method2003((byte) 81);
            if (class248_sub15_sub5 != null)
                class248_sub15_sub5.method2498((byte) 113, bool);
        }
        if (i <= -74) {
            anInt1067++;
            aBoolean1052 = !aBoolean1052;
        }
    }

    private final boolean method650(int i) {
        int i_19_ = -40 / ((i - -57) / 53);
        anInt1063++;
        if (aClass248_Sub2_Sub4_1077 != null) {
            if (aClass248_Sub2_Sub1_1073.method1990((byte) -45) && !(method654(false) > aClass248_Sub2_Sub1_1073.method1985((byte) -121)))
                return false;
            return true;
        }
        double d = (double) aClass248_Sub2_Sub1_1073.method1984((byte) -19);
        if (d != 0.0 && !((double) Class118.method1112(116) >= 1000.0 / d + (double) aClass248_Sub2_Sub1_1073.method1991(0)))
            return false;
        return true;
    }

    private final Node_Sub2 method651(byte i) throws IOException {
        anInt1079++;
        if (aBoolean1060)
            throw new IllegalStateException();
        if (aBoolean1068)
            return null;
        while ((anOggSyncState1062.pageOut(anOggPage1065) ^ 0xffffffff) >= -1) {
            int i_20_ = method652(aByteArray1050, 2);
            if (i_20_ == -1) {
                aBoolean1068 = true;
                return null;
            }
            if ((i_20_ ^ 0xffffffff) == -1)
                return null;
            if (!anOggSyncState1062.write(aByteArray1050, i_20_))
                throw new RuntimeException("");
        }
        int i_21_ = anOggPage1065.getSerialNumber();
        if (i <= 124)
            method643(82);
        if (anOggPage1065.isBOS()) {
            OggStreamState oggstreamstate = new OggStreamState(i_21_);
            if (!oggstreamstate.pageIn(anOggPage1065))
                throw new IllegalStateException();
            if (oggstreamstate.packetPeek(anOggPacket1080) != 1)
                throw new IllegalStateException();
            Node_Sub2 class248_sub2;
            if (aClass248_Sub2_Sub1_1073 != null || !anOggPacket1080.isTheora()) {
                if (aClass248_Sub2_Sub4_1077 == null && anOggPacket1080.isVorbis()) {
                    aClass248_Sub2_Sub4_1077 = new Node_Sub2_Sub4(oggstreamstate);
                    class248_sub2 = aClass248_Sub2_Sub4_1077;
                } else {
                    byte[] is = anOggPacket1080.getData();
                    StringBuffer stringbuffer = new StringBuffer();
                    for (int i_22_ = 1; is.length > i_22_; i_22_++) {
                        if (!Character.isLetterOrDigit((char) is[i_22_]))
                            break;
                        stringbuffer.append((char) is[i_22_]);
                    }
                    String string = stringbuffer.toString();
                    if (string.equals("kate"))
                        class248_sub2 = new Node_Sub2_Sub3(oggstreamstate);
                    else
                        class248_sub2 = new Node_Sub2_Sub2(oggstreamstate);
                }
            } else {
                aClass248_Sub2_Sub1_1073 = new Node_Sub2_Sub1(oggstreamstate);
                class248_sub2 = aClass248_Sub2_Sub1_1073;
            }
            aClass65_1071.method509(-1, class248_sub2, (long) i_21_);
            return class248_sub2;
        }
        Node_Sub2 class248_sub2 = (Node_Sub2) aClass65_1071.method501((long) i_21_, (byte) 31);
        if (!((Node_Sub2) class248_sub2).anOggStreamState6820.pageIn(anOggPage1065))
            throw new IllegalStateException();
        return class248_sub2;
    }

    abstract int method652(byte[] is, int i) throws IOException;

    final Node_Sub2_Sub4 method653(int i) {
        anInt1078++;
        int i_23_ = -98 / ((i - -71) / 55);
        return aClass248_Sub2_Sub4_1077;
    }

    final double method654(boolean bool) {
        anInt1072++;
        if (bool != false)
            return 0.6367509784599686;
        if (aClass248_Sub2_Sub4_1077 != null)
            return aClass248_Sub2_Sub4_1077.method2000(3);
        if (aClass248_Sub2_Sub1_1073 != null)
            return aClass248_Sub2_Sub1_1073.method1985((byte) -121);
        return 0.0;
    }

    final void method655(byte i) throws IOException {
        anInt1075++;
        if (!aBoolean1052) {
            if (i <= 111)
                method654(true);
            while (!aBoolean1060) {
                Node_Sub2 class248_sub2;
                if (aBoolean1058)
                    class248_sub2 = ((Node_Sub2) (aClass65_1071.method501((long) anOggPage1065.getSerialNumber(), (byte) 31)));
                else {
                    class248_sub2 = method651((byte) 126);
                    if (class248_sub2 == null) {
                        if (aBoolean1068)
                            method641(-125);
                        break;
                    }
                    if (class248_sub2 == null)
                        throw new IllegalStateException();
                    aBoolean1058 = true;
                }
                if (class248_sub2 == aClass248_Sub2_Sub4_1077) {
                    if ((aClass248_Sub2_Sub4_1077.method2002((byte) 84) ^ 0xffffffff) <= -51)
                        break;
                    while (((Node_Sub2) aClass248_Sub2_Sub4_1077).anOggStreamState6820.packetOut(anOggPacket1080) == 1) {
                        aClass248_Sub2_Sub4_1077.method1978(anOggPacket1080, 113);
                        method643(-80);
                        if (aClass248_Sub2_Sub1_1073 != null) {
                            double d = aClass248_Sub2_Sub1_1073.method1985((byte) -121);
                            for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -11 && method650(118); i_24_++) {
                                method644((byte) 126);
                                if (aBoolean1060)
                                    return;
                            }
                            if (aClass248_Sub2_Sub1_1073.method1985((byte) -121) > d)
                                return;
                        }
                        if ((aClass248_Sub2_Sub4_1077.method2002((byte) 86) ^ 0xffffffff) <= -51)
                            return;
                    }
                } else if (!(class248_sub2 instanceof Node_Sub2_Sub3)) {
                    if (aClass248_Sub2_Sub1_1073 == class248_sub2) {
                        if (aClass248_Sub2_Sub4_1077 == null && !aBoolean1052) {
                            for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -11 && method650(3); i_25_++) {
                                method644((byte) 124);
                                if (aBoolean1060)
                                    break;
                            }
                            break;
                        }
                    } else {
                        while (((Node_Sub2) class248_sub2).anOggStreamState6820.packetOut(anOggPacket1080) == 1) {
                            if (((Node_Sub2) class248_sub2).anInt6825 == 1 && class248_sub2 instanceof Node_Sub2_Sub3)
                                method656((byte) 124, aString1051);
                            class248_sub2.method1978(anOggPacket1080, 123);
                        }
                    }
                } else
                    method643(66);
                aBoolean1058 = false;
            }
        }
    }

    Class86(int i) {
        if (!Class111.method776(-121, "jagtheora"))
            throw new RuntimeException("Failed to load jagtheora library");
        aByteArray1050 = new byte[i];
        anOggSyncState1062 = new OggSyncState();
        anOggPage1065 = new OggPage();
        anOggPacket1080 = new OggPacket();
        aClass65_1071 = new Class65(8);
    }

    final void method656(byte i, String string) {
        aString1051 = string;
        anInt1057++;
        if (aString1051 == null)
            aClass248_Sub2_Sub3_1055 = null;
        else {
            if (i < 45)
                method645(null, (byte) 100, -106, -16, null, null, 101, 91, 64, 33, null, null);
            if (aClass248_Sub2_Sub3_1055 != null && !aString1051.equals(aClass248_Sub2_Sub3_1055.method1998(false)))
                aClass248_Sub2_Sub3_1055 = null;
            if (aClass248_Sub2_Sub3_1055 == null) {
                for (Node_Sub2 class248_sub2 = (Node_Sub2) aClass65_1071.method510(true); class248_sub2 != null; class248_sub2 = (Node_Sub2) aClass65_1071.method512(false)) {
                    if (class248_sub2 instanceof Node_Sub2_Sub3) {
                        Node_Sub2_Sub3 class248_sub2_sub3 = (Node_Sub2_Sub3) class248_sub2;
                        if (aString1051.equals(class248_sub2_sub3.method1998(false))) {
                            aClass248_Sub2_Sub3_1055 = class248_sub2_sub3;
                            break;
                        }
                    }
                }
            }
        }
    }
}
