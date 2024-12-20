/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;

public final class client extends Applet_Sub1 {
    public static int loaderVersion = -1;
    public static final int clientVersion = 1;

    static int anInt5226 = 0;
    static int anInt5227;
    static boolean aBoolean5228 = false;
    static int anInt5229;
    static int anInt5230;
    static int anInt5231;
    static int anInt5232;
    static int anInt5233;
    static int anInt5234;
    static int anInt5235;
    static int anInt5236;
    static int anInt5237;
    static int anInt5238;
    static int anInt5239;
    static int anInt5240;
    static int[] anIntArray5241;
    static int anInt5242;
    static int anInt5243;
    static int anInt5244;
    static int anInt5245 = -1;
    /*synthetic*/ static Class aClass5246;
    public static boolean aBoolean5247;

    private final void method102(int i) {
        anInt5244++;
        if (Class292.anInt3421 < ((Class323) Class282_Sub5.aClass323_7634).anInt3818) {
            Class346_Sub7_Sub2_Sub4.aWorldAddress_10119.method679((byte) -127);
            Class282_Sub24.anInt7836 = 250 * (((Class323) Class282_Sub5.aClass323_7634).anInt3818 - 1);
            if (Class282_Sub24.anInt7836 > 3000)
                Class282_Sub24.anInt7836 = 3000;
            if ((((Class323) Class282_Sub5.aClass323_7634).anInt3818 ^ 0xffffffff) <= -3 && ((Class323) Class282_Sub5.aClass323_7634).anInt3819 == 6) {
                this.method92(32673, "js5connect_outofdate");
                Class273.anInt5008 = 14;
                return;
            }
            if (((Class323) Class282_Sub5.aClass323_7634).anInt3818 >= 4 && ((Class323) Class282_Sub5.aClass323_7634).anInt3819 == -1) {
                this.method92(32673, "js5crc");
                Class273.anInt5008 = 14;
                return;
            }
            if (((Class323) Class282_Sub5.aClass323_7634).anInt3818 >= 4 && Node_Sub14_Sub33.method2374(Class273.anInt5008, 113)) {
                if (((Class323) Class282_Sub5.aClass323_7634).anInt3819 == 7 || (((Class323) Class282_Sub5.aClass323_7634).anInt3819 == 9))
                    this.method92(32673, "js5connect_full");
                else if (((Class323) Class282_Sub5.aClass323_7634).anInt3819 <= 0)
                    this.method92(32673, "js5io");
                else if (Node_Sub47.aString7409 == null)
                    this.method92(32673, "js5connect");
                else
                    this.method92(32673, ("js5proxy_" + Node_Sub47.aString7409.trim()));
                Class273.anInt5008 = 14;
                return;
            }
        }
        Class292.anInt3421 = ((Class323) Class282_Sub5.aClass323_7634).anInt3818;
        if ((Class282_Sub24.anInt7836 ^ 0xffffffff) < -1)
            Class282_Sub24.anInt7836--;
        else {
            do {
                try {
                    if ((Class330.anInt3856 ^ 0xffffffff) == -1) {
                        Class261.aClass322_2968 = (Class346_Sub7_Sub2_Sub4.aWorldAddress_10119.method680(43594, Node_Sub14_Sub15.aClass174_9328));
                        Class330.anInt3856++;
                    }
                    if ((Class330.anInt3856 ^ 0xffffffff) == -2) {
                        if ((Class261.aClass322_2968.anInt3788 ^ 0xffffffff) == -3) {
                            if (Class261.aClass322_2968.anObject3787 != null)
                                Node_Sub47.aString7409 = ((String) Class261.aClass322_2968.anObject3787);
                            method104(1000, (byte) 86);
                            break;
                        }
                        if (Class261.aClass322_2968.anInt3788 == 1)
                            Class330.anInt3856++;
                    }
                    if (Class330.anInt3856 == 2) {
                        Node_Sub40.aClass239_7285 = new Class239((Socket) (Class261.aClass322_2968.anObject3787), Node_Sub14_Sub15.aClass174_9328, 25000);
                        ByteStream class248_sub9 = new ByteStream(5);
                        class248_sub9.writeByte(-117, (((Class224) Class356.js5Opcode).opcode));
                        class248_sub9.writeInt(27695, 640);
                        Node_Sub40.aClass239_7285.method1912(-5324, ((ByteStream) class248_sub9).buffer, 0, 5);
                        Class330.anInt3856++;
                        Class305.aLong3548 = Class118.method1112(116);
                    }
                    if ((Class330.anInt3856 ^ 0xffffffff) == -4) {
                        if (!Node_Sub14_Sub33.method2374(Class273.anInt5008, 125) && Node_Sub40.aClass239_7285.method1920((byte) -124) <= 0) {
                            if (Class118.method1112(116) + -Class305.aLong3548 > 30000L) {
                                method104(1001, (byte) 102);
                                break;
                            }
                        } else {
                            int i_0_ = Node_Sub40.aClass239_7285.method1919((byte) 75);
                            if (i_0_ != 0) {
                                method104(i_0_, (byte) 115);
                                break;
                            }
                            Class330.anInt3856++;
                        }
                    }
                    if (Class330.anInt3856 == 4) {
                        boolean bool = (Node_Sub14_Sub33.method2374(Class273.anInt5008, 85) || Class263.method2771(-6, Class273.anInt5008) || Class188.method1633((byte) -14, Class273.anInt5008));
                        Class9[] class9s = Class9.method188((byte) -82);
                        ByteStream class248_sub9 = new ByteStream(class9s.length * 4);
                        Node_Sub40.aClass239_7285.method1916(((ByteStream) class248_sub9).buffer, (((ByteStream) class248_sub9).buffer).length, 0, (byte) 82);
                        for (int i_1_ = 0; ((i_1_ ^ 0xffffffff) > (class9s.length ^ 0xffffffff)); i_1_++)
                            class9s[i_1_].setjd5indata(16837, class248_sub9.readInt(false));
                        Class282_Sub5.aClass323_7634.method3349(!bool, Node_Sub40.aClass239_7285, 4);
                        Class261.aClass322_2968 = null;
                        Node_Sub40.aClass239_7285 = null;
                        Class330.anInt3856 = 0;
                    }
                    if (i < -57)
                        break;
                    method102(101);
                } catch (java.io.IOException ioexception) {
                    method104(1002, (byte) 114);
                    break;
                }
                break;
            } while (false);
        }
    }

    final void method100(byte i) {
        if (i != 59)
            method108(82);
        anInt5243++;
        if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) != 2)
            method106(i ^ 0x3b);
        else {
            try {
                method106(0);
            } catch (ThreadDeath threaddeath) {
                throw threaddeath;
            } catch (Throwable throwable) {
                Class282_Sub14.method2975((throwable.getMessage() + " (Recovered) " + method95(-4)), throwable, 1);
                Node_Sub15_Sub5.aBoolean9720 = true;
                Node_Sub15_Sub5.method2495(false, 99, 0);
            }
        }
    }

    final void method87(byte i) {
        if (i == -95) {
            anInt5240++;
            if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) == 2) {
                try {
                    method118(0);
                } catch (ThreadDeath threaddeath) {
                    throw threaddeath;
                } catch (Throwable throwable) {
                    Class282_Sub14.method2975((throwable.getMessage() + " (Recovered) " + method95(-84)), throwable, 1);
                    Node_Sub15_Sub5.aBoolean9720 = true;
                    Node_Sub15_Sub5.method2495(false, 80, 0);
                }
            } else
                method118(0);
        }
    }

    static final byte[] method103(byte i, byte[] is) {
        anInt5234++;
        if (is == null)
            return null;
        if (i != 3)
            return null;
        byte[] is_2_ = new byte[is.length];
        Class159.method1402(is, 0, is_2_, 0, is.length);
        return is_2_;
    }

    private final void method104(int i, byte i_3_) {
        ((Class323) Class282_Sub5.aClass323_7634).anInt3819 = i;
        Class330.anInt3856 = 0;
        Class261.aClass322_2968 = null;
        anInt5236++;
        if (i_3_ <= 69)
            method103((byte) 81, null);
        ((Class323) Class282_Sub5.aClass323_7634).anInt3818++;
        Node_Sub40.aClass239_7285 = null;
    }

    final void method88(int i) {
        anInt5242++;
        method108(7879);
        Class304.method3209(i + 15360);
        Node_Sub8_Sub10.method2079(71);
        Class41.method304(0);
        Class253.method2720(0);
        Class269.method2812(3161);
        Class142.method1289(128);
        Class245.method1959(i ^ ~0x3464);
        Class9.method195(6);
        Class4.method176((byte) -62);
        Class193.method1657(0);
        Node_Sub8.method2019(false);
        Node.method1966(true);
        Class64.method500(-1);
        Applet_Sub1.method96((byte) -105);
        Class160.method1411((byte) -19);
        Class79.method573(119);
        Class215.method1739(0);
        Viewport.method1860(-92);
        Node_Sub45.method2645((byte) -99);
        Node_Sub24.method2546(i ^ ~0x3b98);
        Class7.method184(32);
        Class291.method3101(-1);
        Class293.method3118((byte) 58);
        Class323.method3342((byte) -127);
        Class77.method566(81);
        Class290.method3091(-17);
        Class330_Sub1.method3390(1);
        Class381.method3934((byte) 50);
        Class46.method332((byte) 94);
        Class209.method1718(115);
        Class131.method1209((byte) 126);
        Class85.method636(-18039);
        Class144.method1300(i ^ 0x3bf4);
        Class192.method1652(true);
        Class172.method1556(37);
        Class315.method3278(-7913);
        Class329.method3372(75);
        Class368.method3836(true);
        Class39.method294((byte) -103);
        Class342.method3491((byte) -109);
        Class240.method1921(false);
        Class307.method3227(-120);
        Class356.method3786((byte) -90);
        Class102.method720(2);
        Class11.method207(-15046);
        Class151.method1351((byte) -50);
        Class113.method806(98);
        Class146.method1310((byte) 115);
        Class302.method3200(true);
        Class6.method182(120);
        Class111.method771((byte) 116);
        ByteStream.method2174(255);
        ISAACCypher.method1645(-22833);
        PacketStream.method2231(128);
        IncommingOpcode.method1105(i + 15373);
        Class333.method3414(-115);
        Node_Sub43.method2638((byte) -78);
        Class310_Sub1.method3253(-95);
        Class380.method3897(1520207683);
        Class199.method1679(0);
        Class360.method3808((byte) 116);
        RSInterface2.method3775(-121);
        Class377.method3886(-117);
        Player.method3656(9600);
        Class200.method1683(87);
        Class211.method1728(-2001);
        Class187.method1632(-3);
        Node_Sub36.method2593(-15098);
        Class128.method1159(i + -5752);
        Node_Sub28.method2556(11);
        NPC.method3665(false);
        Node_Sub12.method2257(-128);
        Node_Sub48.method2674(-4);
        Node_Sub8_Sub16.method2137(true);
        Class105.method746((byte) -98);
        Class261.method2764((byte) 117);
        Class363.method3822((byte) 43);
        Class346.method3539(i + 7395);
        Class346_Sub5.method3546((byte) -126);
        Class118.method1111(20079);
        Class67.method519(true);
        WorldAddress.method683((byte) -57);
        Class158.method1395(29142);
        Class260.method2763(14);
        Class166.method1536((byte) 119);
        Class332.method3408((byte) -119);
        Node_Sub8_Sub2.method2039(-26);
        Class182.method1609((byte) 89);
        Class286.method3076((byte) -126);
        Class162.method1432((byte) -54);
        Class229.method1834(false);
        Class316.method3286((byte) -74);
        Class335.method3418(19669);
        Class106.method747(-3602);
        ObjectDefinition.method2791(-19550);
        Class343.method3510(0);
        Class101.method719(2077735568);
        s.method3147(-1);
        Class21.method233((byte) -17);
        Class255.method2734(false);
        Class122.method1130(i ^ ~0x3b9b);
        Class321.method3324(true);
        Class48.method371(34);
        Class45.method326(i ^ ~0x3b9b);
        Class108.method756(true);
        Class282_Sub6.method2942(-91);
        Class282_Sub27.method3037(18);
        Class282_Sub2.method2928(true);
        Class282_Sub20.method3004(-30504);
        Class282_Sub13.method2970((byte) 36);
        Class282_Sub28.method3039((byte) -2);
        Class282_Sub25.method3023(false);
        Class282_Sub5.method2939((byte) -128);
        Class282_Sub11.method2964((byte) 105);
        Class282_Sub14.method2972((byte) 106);
        Class282_Sub21.method3011(-123);
        Class282_Sub8.method2951(i + 15260);
        Class282_Sub19.method3000(1);
        Class282_Sub3.method2931(false);
        Class282_Sub15.method2980(0);
        Class282_Sub10.method2960(-2649);
        Class282_Sub23.method3016(2);
        Class282_Sub7.method2947(20418);
        Class282_Sub12.method2968(120);
        Class282_Sub17.method2994(117);
        Class176.method1588(31266);
        Class167.method1538((byte) -10);
        Exception_Sub1.method131((byte) -42);
        aa.method153(i + 15136);
        za.method2686(i + 15387);
        Class285.method3069((byte) -87);
        Class338.method3426((byte) -105);
        Node_Sub42.method2623(i ^ ~0x5356);
        Class20.method232((byte) 100);
        Interactable.method3571((byte) -85);
        Node_Sub15_Sub1.method2406(-20927);
        Class345.method3532((byte) -29);
        Class317.method3309((byte) -128);
        Class47.method350();
        OutgoingOpcode.method1514((byte) -126);
        Class58.method457((byte) 64);
        Node_Sub2_Sub3.method1996(-15626);
        Class86_Sub1.method658(0);
        Node_Sub2_Sub1.method1986(-56);
        Node_Sub2_Sub4.method2004(-26000);
        Class232.method1841(true);
        Class170.method1549(4);
        Class114.method1074(42);
        Class276.method2855(22136);
        Class121.method1128(115);
        Class328.method3367((byte) -23);
        Class326.method3364(0);
        Class25.method241(true);
        Class12.method209(i ^ ~0x3bf0);
        Class116.method1080();
        Class76.method561(-28);
        Class361.method3816(-125);
        Class175.method1585(3);
        Class258.method2757(-3);
        Class110.method766(13334);
        Class289.method3086((byte) 86);
        Class186.method1627(0);
        Class272.method2835(-127);
        Class325.method3361((byte) 109);
        Class214.method1734(i + 18767);
        Class27.method256(95);
        Class109.method760(-27121);
        Class346_Sub8.method3702();
        Class281.method2911(i + 15247);
        Class125.method1147(i + 15209);
        Class271.method2832((byte) -113);
        Class330.method3375(116);
        Class116_Sub1.method1104(-1);
        Class235.method1847(i ^ 0x3bf4);
        Class82.method593(-1);
        Class251.method2713((byte) -46);
        Node_Sub35.method2589((byte) 88);
        Class243.method1941();
        Class298.method3169((byte) 4);
        Class149.method1334(1);
        RSInterface.method2012(-1333244320);
        Node_Sub8_Sub18.method2145(1);
        Class19.method229(true);
        Class161.method1415((byte) -127);
        Class156.method1372(22767);
        Class344.method3518(i ^ 0x3be1);
        Class346_Sub7_Sub4.method3677(i + 47657);
        Class346_Sub7_Sub3.method3673(3);
        Class346_Sub7_Sub5.method3689((byte) 99);
        Class346_Sub7_Sub1.method3582(16);
        Class49.method390(i + 15260);
        r.method2106(-1);
        Class295.method3127((byte) -55);
        Class104.method735();
        Class40.method297((byte) 49);
        Class124.method1138(115);
        Node_Sub19.method2520(false);
        Class362.method3819();
        Class237.method1856((byte) -58);
        Class51.method407(i + 15439);
        Class292.method3106(true);
        Node_Sub33.method2570(255);
        Class270.method2829(i + 29308);
        Node_Sub34.method2582();
        Class57.method456(22580);
        Class107.method753(true);
        Node_Sub4.method2009((byte) -50);
        Class145.method1306(-30914);
        Class130.method1200(-1);
        Class250.method2705(true);
        Class61.method478((byte) -58);
        Class210.method1725((byte) 21);
        Class198.method1677(33);
        Class52.method411(i ^ 0x68d2);
        Class80.method579(true);
        Node_Sub8_Sub7.method2070(false);
        Class90.method674(0);
        Class303.method3201(false);
        Class139.method1277(14205);
        Class135.method1239((byte) 116);
        Class327.method3365(false);
        Class22.method234((byte) -122);
        Class94.method689(true);
        Class87.method662((byte) -23);
        Node_Sub30.method2562(0);
        Class324.method3357((byte) -36);
        Class374.method3873((byte) -82);
        Class346_Sub2.method3542(true);
        Class346_Sub7_Sub2_Sub2.method3615(i ^ 0x3b9b);
        Class346_Sub7_Sub2_Sub3.method3620((byte) 52);
        Class346_Sub1.method3541(i + 25260);
        Class68.method522(128);
        Node_Sub13.method2259(-112);
        Class256.method2748((byte) 60);
        Class24.method238((byte) -50);
        Class355.method3781(i ^ 0x6279);
        Class334.method3416((byte) -112);
        Class168.method1546(-7);
        Class346_Sub7_Sub3_Sub1.method3674(i ^ 0x7a73);
        Class346_Sub7_Sub5_Sub2.method3697((byte) -47);
        Class150.method1336(-108);
        Class346_Sub7_Sub1_Sub2.method3592(i + 15256);
        Class346_Sub7_Sub2_Sub4.method3626((byte) -79);
        Class346_Sub7_Sub4_Sub2.method3688(false);
        Class230.method1836(0);
        Class253_Sub1.method2726(-9959);
        Class269_Sub2.method2826(i ^ 0x5178);
        Class208.method1709(i ^ ~0x3bf0);
        Class225_Sub1_Sub1.method1791(i ^ ~0x3b9b);
        Class115.method1077((byte) 94);
        Class273.method2840(true);
        Class206.method1702(1);
        Class297_Sub1.method3138((byte) 100);
        Class225_Sub2.method1796(-3706);
        Class225_Sub3.method1800(i ^ ~0x3bff);
        Class165.method1532(true);
        Class312.method3271((byte) -67);
        Node_Sub8_Sub12.method2093(-879071864);
        Class218.method1746(false);
        Node_Sub8_Sub3.method2042(-27627);
        Class236.method1851(-2);
        Node_Sub8_Sub6.method2058((byte) 113);
        Node_Sub2.method1979(i ^ 0x3bcc);
        Class263.method2772(false);
        Canvas_Sub1.method121(118);
        Class32.method271(i + 15260);
        Class30.method263(91);
        IOException_Sub1.method128(0);
        Class241.method1929(-99);
        Class262.method2768(i + 15263);
        Class231.method1838((byte) 125);
        Class143.method1294(true);
        Class127.method1158(25);
        Class205.method1696(i + 15262);
        Class306.method3220();
        Class246.method1962(120);
        Node_Sub8_Sub16_Sub1.method2139(107);
        Class212.method1731(107);
        Class111_Sub1.method783(-1462072736);
        Node_Sub14_Sub1.method2276(i ^ ~0x3bda);
        Class346_Sub7_Sub4_Sub1.method3680(85);
        Class346_Sub7_Sub5_Sub1.method3693(65535);
        Class309.method3235(i + 45051);
        Class346_Sub7_Sub1_Sub1.method3590((byte) -4);
        Node_Sub47.method2660(i + -375877564);
        Node_Sub32.method2565(i + 24814);
        Class147.method1312(i ^ i);
        Class55.method438(i ^ ~0x3bdb);
        Class26.method251(false);
        Class134.method1223();
        Node_Sub15_Sub4.method2492((byte) -114);
        Node_Sub50.method2678(false);
        Class204.method1692();
        Class53.method424();
        Node_Sub20.method2525(1);
        Class341.method3480(i + 42987);
        Class345_Sub2.method3536();
        Class13.method213(-105);
        Node_Sub2_Sub2.method1992(false);
        Node_Sub14.method2266(-11148);
        Class66.method516((byte) -74);
        Class71.method537((byte) -63);
        Class133.method1219(false);
        Class141.method1287((byte) -109);
        Class28.method258((byte) 113);
        Class81.method587(-29864);
        Class81_Sub1.method589(-30978);
        Class301_Sub2.method3191(-23738);
        Class301.method3183(true);
        Class301_Sub3.method3194(i + 15260);
        Class301_Sub3_Sub1.method3196((byte) 117);
        Class311.method3266(i ^ 0x44e0);
        Class60.method469(i + -15092);
        Class63.method485();
        Class148.method1322(true);
        Class300.method3180(63);
        Class252.method2716(0);
        Class346_Sub5_Sub2.method3551(-4400);
        Class346_Sub6.method3559((byte) 38);
        Class50.method396(3200);
        Class346_Sub4.method3544(i + 15161);
        Class23.method237(-38);
        Class279.method2880(1871698636);
        Class367.method3831(115);
        Class227.method1825(-11);
        Node_Sub8_Sub14_Sub1.method2129(1);
        Class296.method3131((byte) -90);
        Node_Sub38.method2598(i ^ ~0x3b9b);
        Node_Sub14_Sub6.method2291(119);
        Node_Sub14_Sub12.method2305((byte) 85);
        Node_Sub40.method2614(2);
        Class189.method1639((byte) -44);
        Class203.method1686((byte) -58);
        Class359.method3803((byte) -41);
        Class371.method3859(102);
        Class347.method3728(209);
        Class96.method705(i + 17011);
        Class238_Sub3.method1903(0);
        Class382.method3936(false);
        Class129_Sub1.method1186(28478);
        Class223.method1776((byte) 19);
        Class316_Sub1.method3287(i ^ 0x3bff);
        Class136_Sub4_Sub1.method1271(true);
        Class162_Sub2.method1469(false);
        Class140.method1281((byte) 85);
        Node_Sub9_Sub1.method2224(25819);
        ha_Sub3.method1018(3584);
        Class89.method667(125);
        Class228.method1826(2);
        Class370.method3855(0);
        Class238_Sub2.method1881(-59);
        Class5.method181(-11922);
        Class299.method3172(29281);
        Class340.method3440(-12296);
        Class316_Sub2.method3302(0);
        Class17.method223(-33);
        Class59.method460(-16766);
        Class185.method1621(-25694);
        Class162_Sub1.method1455(0);
        Class264.method2776(126);
        Class280.method2907(115);
        Class181.method1602(false);
        Class14.method214(-24048);
        Class275_Sub1.method2850((byte) 101);
        Class369.method3849();
        Node_Sub14_Sub8.method2297((byte) -33);
        Node_Sub14_Sub14.method2316(0);
        Node_Sub14_Sub13.method2313((byte) 32);
        Node_Sub14_Sub34.method2377((byte) -97);
        Node_Sub14_Sub20.method2339(4096);
        Node_Sub14_Sub38.method2391(true);
        Node_Sub14_Sub25.method2349((byte) -99);
        Node_Sub14_Sub26.method2350(105);
        Node_Sub14_Sub28.method2357(4096);
        Node_Sub14_Sub22.method2342((byte) 117);
        Node_Sub14_Sub30.method2363(false);
        Node_Sub14_Sub21.method2340((byte) -69);
        Node_Sub14_Sub15.method2317(false);
        Node_Sub14_Sub32.method2372(false);
        Node_Sub14_Sub12_Sub1.method2309(-1378707903);
        Node_Sub14_Sub27.method2356(28045);
        Node_Sub14_Sub7.method2292((byte) -67);
        Node_Sub14_Sub35.method2381(-24214);
        Node_Sub14_Sub18.method2331(-15789);
        Node_Sub14_Sub2.method2283(0);
        Node_Sub14_Sub36.method2384((byte) -57);
        Node_Sub14_Sub3.method2284(4521);
        Node_Sub14_Sub11.method2303(2048);
        Node_Sub14_Sub24.method2346(2);
        Node_Sub14_Sub16.method2322((byte) -123);
        Node_Sub14_Sub31.method2367(true);
        Node_Sub14_Sub29.method2361(0);
        Node_Sub14_Sub4.method2287(5);
        Node_Sub14_Sub17.method2325(-99);
        Node_Sub14_Sub5.method2290(19706);
        Node_Sub14_Sub39.method2393(i + 15138);
        Node_Sub14_Sub9.method2300((byte) 78);
        Class318.method3312(16);
        Node_Sub49.method2675();
        Class351.method3746(1);
        aa_Sub1.method158((byte) 101);
        Class268.method2805(i + 17878);
        Class375.method3877(false);
        Node_Sub40_Sub1.method2618(-31835);
        Class196.method1668(16);
        Class372.method3862(-128);
        Class349_Sub2.method3741(-11773);
        s_Sub2.method3159((byte) 86);
        Class221.method1765(true);
        Class136_Sub2.method1258(3520);
        Node_Sub8_Sub4.method2046(false);
        Node_Sub11.method2247(i ^ 0x3bc2);
        Class183.method1614((byte) -75);
        Class84_Sub6.method619((byte) -118);
        Class353.method3754((byte) -78);
        Class15.method218(0);
        r_Sub1.method2111(-1);
        za_Sub2.method2693((byte) 76);
        aa_Sub2.method160(i ^ 0x3b9b);
        Class357.method3791(8218);
        Node_Sub1.method1976(-9111);
        Class287.method3077(i + 15136);
        Node_Sub42_Sub2.method2632((byte) -126);
        Class316_Sub1_Sub2.method3299(119);
        Class249_Sub2.method2702(i ^ ~0x3bdd);
        Class84_Sub4.method610(false);
        Class136_Sub1.method1254(false);
        Class84_Sub9.method632(-8554);
        Class84_Sub7.method625(0);
        Class84_Sub2.method607(i + 49426);
        Class84_Sub8.method626(true);
        Class84_Sub3.method608(i + 18604);
        Class29.method260(i + 15328);
        Class73.method543(i ^ ~0x533c);
        Class320.method3321((byte) -74);
        Class171.method1552(i + 15151);
        za_Sub1.method2690(26162);
        Class132.method1217((byte) -63);
        Class284.method3063(-116);
        r_Sub2.method2116((byte) -79);
        Class18.method227((byte) 120);
        Class44_Sub1.method317(7);
        Class129_Sub2.method1191(-4);
        aa_Sub3.method166((byte) -38);
        s_Sub3.method3167(0);
        Class283.method3055((byte) 22);
        Class316_Sub2_Sub1.method3304(i + 15264);
        Node_Sub42_Sub3.method2636(-126);
        Class340_Sub10.method3478((byte) -123);
        Class340_Sub6.method3462((byte) 64);
        Class340_Sub5.method3458(i ^ 0x4f39);
        Class340_Sub2.method3448(1002);
        Class340_Sub3.method3453((byte) -82);
        Class279_Sub2.method2898(27966);
        Class44.method313(i ^ 0x3b9b);
        Class358.method3801(17);
        Class112.method793((byte) -123);
        Class112_Sub3.method802(true);
        Class112_Sub2.method801(3317);
        Class340_Sub7.method3465(-25050);
        Class340_Sub9.method3468((byte) 16);
        Class340_Sub8.method3467((byte) 67);
        Class169.method1548((byte) -85);
        Class275_Sub2.method2852(i ^ ~0xb308);
        Class185_Sub1.method1624((byte) 62);
        Class226_Sub1.method1804(-6937);
        Class226.method1801((byte) -118);
        Class226_Sub1_Sub1.method1806(true);
        Class226_Sub3.method1816(false);
        Class226_Sub2_Sub1.method1810(28616);
        Class226_Sub2.method1809((byte) 76);
        Node_Sub3.method2005(1011);
        Node_Sub46.method2655((byte) 99);
        Class173.method1561((byte) 127);
        Node_Sub18.method2513(i + 14769);
        Class188.method1636(true);
        Class346_Sub5_Sub1.method3549((byte) -100);
        Node_Sub8_Sub9.method2073(-28431);
        Node_Sub8_Sub8.method2072(3006);
        Node_Sub39.method2605((byte) 120);
        Node_Sub22.method2536((byte) 13);
        Class177.method1591(true);
        Class75.method558((byte) -125);
        Node_Sub8_Sub15.method2131((byte) 126);
        Node_Sub27.method2554(255);
        Node_Sub23.method2540((byte) -19);
        Node_Sub8_Sub5.method2049(false);
        Node_Sub8_Sub11.method2086(-16334);
        Node_Sub25.method2550(-30831);
        Class103.method730(-110);
        OutputStream_Sub1.method130((byte) 79);
        InputStream_Sub2.method125(false);
        Class99.method713(true);
        Node_Sub5.method2011(-20099);
        Node_Sub29.method2560((byte) 88);
        Node_Sub8_Sub19.method2146(i ^ ~0x409c);
        Class216.method1741(15839);
        Class10.method199(-1);
        Class352.method3748(i + 15387);
        Class242.method1932((byte) -119);
        Class279_Sub1_Sub2.method2891(false);
        Class337.method3422((byte) -103);
        Class95.method695((byte) 90);
        Class366.method3829(false);
        Class8.method185((byte) -114);
        Class120.method1125(23132);
        Class54.method428(i + 15152);
        Class54_Sub4.method437((byte) 116);
        Class54_Sub2.method434((byte) 113);
        Class54_Sub1.method433(3);
        Class279_Sub2_Sub1.method2902(126);
        Class279_Sub1_Sub1.method2889(-127);
        if (Applet_Sub1.anInt45 != 0)
            aBoolean5247 = true;
    }

    final void method83(boolean bool) {
        if (Class346_Sub7_Sub1_Sub1.aBoolean10133)
            Class94.method691((byte) -89);
        anInt5239++;
        Class191.method1647((byte) 70);
        if (Class287.aHa3381 != null)
            Class287.aHa3381.method819(122);
        if (Node_Sub48.aFrame7432 != null) {
            Class222.method1768(Node_Sub14_Sub15.aClass174_9328, Node_Sub48.aFrame7432, -2);
            Node_Sub48.aFrame7432 = null;
        }
        if (Class289.aClass111_3398 != null) {
            Class289.aClass111_3398.method774(-1);
            Class289.aClass111_3398 = null;
        }
        if (bool == false) {
            Node_Sub51.method2684(-1409991511);
            Class282_Sub5.aClass323_7634.method3344((byte) -107);
            Class340_Sub5.aClass77_8143.method565(-106);
            if (Class346_Sub7_Sub4_Sub2.aClass333_10174 != null) {
                Class346_Sub7_Sub4_Sub2.aClass333_10174.method3411((byte) 113);
                Class346_Sub7_Sub4_Sub2.aClass333_10174 = null;
            }
            try {
                Class95.aClass46_1231.method339(-128);
                for (int i = 0; (i ^ 0xffffffff) > -38; i++)
                    Class96.aClass46Array1242[i].method339(-127);
                Class271.aClass46_3157.method339(-119);
                Class250.aClass46_2824.method339(-108);
                Class246.method1960(-28975);
            } catch (Exception exception) {
                /* empty */
            }
        }
    }

    static final void method105() {
        int i = Class131.anInt1600;
        int[] is = Class271.anIntArray3156;
        int i_4_ = r.aBoolean9031 ? i : i + Class28.anInt4892;
        for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
            Entity entity;
            if (i_5_ < i)
                entity = (Node_Sub32.aPlayerArray7197[is[i_5_]]);
            else
                entity = ((Node_Sub10) (Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) (Class346_Sub7_Sub2_Sub3.anIntArray10381[i_5_ - i]), (byte) 31))).aNPC_6946;
            if (((Entity) entity).anInt10410 >= 0) {
                int i_6_ = entity.method3632(-1);
                if ((i_6_ & 0x1) == 0) {
                    if ((((Interactable) entity).x & 0x1ff) == 0 && (((Interactable) entity).y & 0x1ff) == 0)
                        continue;
                } else if ((((Interactable) entity).x & 0x1ff) == 256 && ((((Interactable) entity).y) & 0x1ff) == 256)
                    continue;
                ((Interactable) entity).anInt8317 = (Class353.method3753(((Interactable) entity).y, ((Interactable) entity).x, 27, ((Interactable) entity).plane));
                Class299.method3175(entity, true);
            }
        }
    }

    private final void method106(int i) {
        anInt5237++;
        if ((Class273.anInt5008 ^ 0xffffffff) != -15) {
            long l = (Class70.method533(true) / 1000000L + -Node_Sub8_Sub14.aLong9036);
            Node_Sub8_Sub14.aLong9036 = Class70.method533(true) / 1000000L;
            boolean bool = Class15.method216(28984);
            if (bool && ha_Sub3_Sub1.aBoolean8709 && Node_Sub8_Sub3.aClass345_8922 != null)
                Node_Sub8_Sub3.aClass345_8922.method3524(121);
            if (Class299.method3174(Class273.anInt5008, (byte) -97)) {
                if (Class81_Sub1.aLong8423 == 0L || ((Class118.method1112(116) ^ 0xffffffffffffffffL) >= (Class81_Sub1.aLong8423 ^ 0xffffffffffffffffL))) {
                    if (!Class287.aHa3381.d() && Class375.aBoolean4603)
                        Class141.method1284((byte) 127);
                } else
                    Class138.method1274(false, Class346_Sub7_Sub3.method3672((byte) -112), Class268.anInt3127, Class340_Sub7.anInt8182, -1);
            }
            if (Node_Sub48.aFrame7432 == null) {
                java.awt.Container container;
                if (Class300.aFrame3494 == null) {
                    if (Class158.anApplet1881 != null)
                        container = Class158.anApplet1881;
                    else
                        container = Class54_Sub1.anApplet_Sub1_5332;
                } else
                    container = Class300.aFrame3494;
                int i_7_ = container.getSize().width;
                int i_8_ = container.getSize().height;
                if (Class300.aFrame3494 == container) {
                    Insets insets = Class300.aFrame3494.getInsets();
                    i_7_ -= insets.right + insets.left;
                    i_8_ -= insets.top - -insets.bottom;
                }
                if (Class279_Sub1_Sub2.anInt9824 != i_7_ || (Class223.anInt5196 ^ 0xffffffff) != (i_8_ ^ 0xffffffff) || Class5.aBoolean149) {
                    if (Class287.aHa3381 != null && !Class287.aHa3381.m()) {
                        Class223.anInt5196 = i_8_;
                        Class279_Sub1_Sub2.anInt9824 = i_7_;
                    } else
                        Class66.method517(-2);
                    Class81_Sub1.aLong8423 = Class118.method1112(116) + 500L;
                    Class5.aBoolean149 = false;
                }
            }
            if (Node_Sub48.aFrame7432 != null && !Class172.aBoolean1997 && Class299.method3174(Class273.anInt5008, (byte) 113))
                Class138.method1274(false, ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub1_7346.method2925(true), -1, -1, -1);
            boolean bool_9_ = false;
            if (Class156.aBoolean1849) {
                bool_9_ = true;
                Class156.aBoolean1849 = false;
            }
            if (bool_9_)
                Class377.method3884(false);
            if (Class287.aHa3381 != null && Class287.aHa3381.d() || ((Class346_Sub7_Sub3.method3672((byte) -112) ^ 0xffffffff) != -2))
                Class60.method472(-101);
            if (!Node_Sub14_Sub33.method2374(Class273.anInt5008, i ^ 0x76)) {
                if (!Class239.method1917(12459, Class273.anInt5008)) {
                    if (Class221.method1766(Class273.anInt5008, (byte) 102))
                        Class41.method302(-1);
                    else if (!Class162_Sub1.method1459(i ^ ~0x29, Class273.anInt5008)) {
                        if (Class273.anInt5008 != 10) {
                            if (Class273.anInt5008 == 13)
                                Node_Sub19.method2518(Node_Sub14_Sub31.aClass285_9492, Canvas_Sub1.aClass48_71, Class287.aHa3381, (byte) -27, false, ((Class41.aClass41_480.method301(Class191.anInt4822, (byte) -108)) + "<br>" + (Class41.aClass41_481.method301(Class191.anInt4822, (byte) -108))));
                        } else
                            Entity.method3645(l, i ^ ~0x74);
                    } else if (Class128.anInt1570 != 1) {
                        if (Class128.anInt1570 == 2) {
                            if ((Class36.anInt405 ^ 0xffffffff) < (Class129_Sub1.anInt8494 ^ 0xffffffff))
                                Class129_Sub1.anInt8494 = Class36.anInt405;
                            int i_10_ = ((50 * (Class129_Sub1.anInt8494 + -Class36.anInt405) / Class129_Sub1.anInt8494) + 50);
                            Node_Sub19.method2518(Node_Sub14_Sub31.aClass285_9492, Canvas_Sub1.aClass48_71, Class287.aHa3381, (byte) -27, true, (Class41.aClass41_478.method301((Class191.anInt4822), (byte) -108) + "<br>(" + i_10_ + "%)"));
                        } else
                            Node_Sub19.method2518(Node_Sub14_Sub31.aClass285_9492, Canvas_Sub1.aClass48_71, Class287.aHa3381, (byte) -27, true, Class41.aClass41_478.method301((Class191.anInt4822), (byte) -108));
                    } else {
                        if ((Node_Sub43.anInt7307 ^ 0xffffffff) < (Class282_Sub1.anInt7594 ^ 0xffffffff))
                            Class282_Sub1.anInt7594 = Node_Sub43.anInt7307;
                        int i_11_ = ((-Node_Sub43.anInt7307 + Class282_Sub1.anInt7594) * 50 / Class282_Sub1.anInt7594);
                        Node_Sub19.method2518(Node_Sub14_Sub31.aClass285_9492, Canvas_Sub1.aClass48_71, Class287.aHa3381, (byte) -27, true, (Class41.aClass41_478.method301(Class191.anInt4822, (byte) -108) + "<br>(" + i_11_ + "%)"));
                    }
                } else
                    Class41.method302(-1);
            } else
                Class126.method1151(-3740, bool_9_);
            if (Class339.anInt3947 == 3) {
                for (int i_12_ = 0; i_12_ < Node_Sub14.anInt6990; i_12_++) {
                    Rectangle rectangle = Node_Sub2_Sub1.aRectangleArray8834[i_12_];
                    if (!Class304.aBooleanArray3530[i_12_]) {
                        if (Class143.aBooleanArray1678[i_12_])
                            Class287.aHa3381.method812(rectangle.height, -65536, rectangle.width, i + 115, rectangle.y, rectangle.x);
                        else
                            Class287.aHa3381.method812(rectangle.height, -16711936, rectangle.width, 119, rectangle.y, rectangle.x);
                    } else
                        Class287.aHa3381.method812(rectangle.height, -65281, rectangle.width, 104, rectangle.y, rectangle.x);
                }
            }
            if (Class112.method785((byte) 111))
                Class136.method1248((byte) 70, Class287.aHa3381);
            if (((Class174) Node_Sub14_Sub15.aClass174_9328).aBoolean2047 && Class299.method3174(Class273.anInt5008, (byte) -57) && Class339.anInt3947 == 0 && Class346_Sub7_Sub3.method3672((byte) -112) == 1 && !bool_9_) {
                int i_13_ = 0;
                for (int i_14_ = 0; i_14_ < Node_Sub14.anInt6990; i_14_++) {
                    if (Class143.aBooleanArray1678[i_14_]) {
                        Class143.aBooleanArray1678[i_14_] = false;
                        Node_Sub14_Sub34.aRectangleArray9525[i_13_++] = Node_Sub2_Sub1.aRectangleArray8834[i_14_];
                    }
                }
                try {
                    if (Node_Sub8_Sub6.aBoolean8949)
                        Class355.method3783((Node_Sub14_Sub34.aRectangleArray9525), i_13_, (byte) 116);
                    else
                        Class287.aHa3381.method818((Node_Sub14_Sub34.aRectangleArray9525), i_13_, 0);
                } catch (Exception_Sub1 exception_sub1) {
                    /* empty */
                }
            } else if (!Node_Sub14_Sub33.method2374(Class273.anInt5008, 84)) {
                for (int i_15_ = 0; Node_Sub14.anInt6990 > i_15_; i_15_++)
                    Class143.aBooleanArray1678[i_15_] = false;
                try {
                    if (Node_Sub8_Sub6.aBoolean8949)
                        Class247.method1963((byte) 56);
                    else
                        Class287.aHa3381.method821(5);
                } catch (Exception_Sub1 exception_sub1) {
                    Class282_Sub14.method2975((exception_sub1.getMessage() + " (Recovered) " + method95(i + 109)), exception_sub1, i + 1);
                    Node_Sub15_Sub5.method2495(false, -55, 0);
                }
            }
            Class84_Sub4.method609(true);
            int i_16_ = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub18_7318.method2997(true);
            if (i == i_16_)
                Class279_Sub2.method2897((byte) -124, 15L);
            else if (i_16_ != 1) {
                if ((i_16_ ^ 0xffffffff) == -3)
                    Class279_Sub2.method2897((byte) -124, 5L);
                else if ((i_16_ ^ 0xffffffff) == -4)
                    Class279_Sub2.method2897((byte) -124, 2L);
            } else
                Class279_Sub2.method2897((byte) -124, 10L);
            if (Class282_Sub6.aBoolean7649)
                Class36.method284(-25694);
            if ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub12_7330.method2967(true) ^ 0xffffffff) == -2 && Class273.anInt5008 == 3 && Class179.anInt2084 != -1) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub12_7330), (byte) -71, 0);
                Class293.method3113(17458);
            }
        }
    }

    private final void method107(byte i) {
        int i_17_ = 29 % ((i - 8) / 38);
        anInt5230++;
        boolean bool = Class282_Sub5.aClass323_7634.method3343((byte) -99);
        if (!bool)
            method102(-101);
    }

    public static void method108(int i) {
        if (i != 7879)
            anIntArray5241 = null;
        anIntArray5241 = null;
    }

    final synchronized void method85(int i) {
        anInt5229++;
        if (Class158.anApplet1881 != null && Class297_Sub1.aCanvas8478 == null && !(((Class174) Node_Sub14_Sub15.aClass174_9328).aBoolean2047)) {
            try {
                Class var_class = Class158.anApplet1881.getClass();
                Field field = var_class.getDeclaredField("canvas");
                Class297_Sub1.aCanvas8478 = (Canvas) field.get(Class158.anApplet1881);
                field.set(Class158.anApplet1881, null);
                if (Class297_Sub1.aCanvas8478 != null)
                    return;
            } catch (Exception exception) {
                /* empty */
            }
        }
        super.method85(i);
    }

    static final void method109(int i) {
        int i_18_ = Class131.anInt1600;
        int[] is = Class271.anIntArray3156;
        int i_19_ = r.aBoolean9031 ? i_18_ : i_18_ + Class28.anInt4892;
        for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
            Entity entity;
            if (i_20_ < i_18_)
                entity = (Node_Sub32.aPlayerArray7197[is[i_20_]]);
            else
                entity = ((Node_Sub10) (Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) (Class346_Sub7_Sub2_Sub3.anIntArray10381[i_20_ - i_18_]), (byte) 31))).aNPC_6946;
            if (((Interactable) entity).plane == i) {
                ((Entity) entity).anInt10487 = 0;
                if ((((Entity) entity).anInt10410) < 0)
                    ((Entity) entity).aBoolean10439 = false;
                else {
                    int i_21_ = entity.method3632(-1);
                    if ((i_21_ & 0x1) == 0) {
                        if (((((Interactable) entity).x) & 0x1ff) != 0 || ((((Interactable) entity).y) & 0x1ff) != 0) {
                            ((Entity) entity).aBoolean10439 = false;
                            continue;
                        }
                    } else if (((((Interactable) entity).x) & 0x1ff) != 256 || ((((Interactable) entity).y) & 0x1ff) != 256) {
                        ((Entity) entity).aBoolean10439 = false;
                        continue;
                    }
                    if (i_21_ == 1) {
                        int i_22_ = ((((Interactable) entity).x) >> 9);
                        int i_23_ = ((((Interactable) entity).y) >> 9);
                        if (((Entity) entity).anInt10410 != Class27.anIntArrayArray361[i_22_][i_23_]) {
                            ((Entity) entity).aBoolean10439 = true;
                            continue;
                        }
                        if (Class334.anIntArrayArray3903[i_22_][i_23_] > 1) {
                            Class334.anIntArrayArray3903[i_22_][i_23_]--;
                            ((Entity) entity).aBoolean10439 = true;
                            continue;
                        }
                    } else {
                        int i_24_ = (i_21_ - 1) * 256 + 252;
                        int i_25_ = ((((Interactable) entity).x) - i_24_ >> 9);
                        int i_26_ = ((((Interactable) entity).y) - i_24_ >> 9);
                        int i_27_ = ((((Interactable) entity).x) + i_24_ >> 9);
                        int i_28_ = ((((Interactable) entity).y) + i_24_ >> 9);
                        if (!Class358.method3800(i_27_, i_26_, false, i_28_, i_25_, (((Entity) entity).anInt10410))) {
                            for (int i_29_ = i_25_; i_29_ <= i_27_; i_29_++) {
                                for (int i_30_ = i_26_; i_30_ <= i_28_; i_30_++) {
                                    if (((Entity) entity).anInt10410 == (Class27.anIntArrayArray361[i_29_][i_30_]))
                                        Class334.anIntArrayArray3903[i_29_][i_30_]--;
                                }
                            }
                            ((Entity) entity).aBoolean10439 = true;
                            continue;
                        }
                    }
                    ((Entity) entity).aBoolean10439 = false;
                    ((Interactable) entity).anInt8317 = Class353.method3753((((Interactable) entity).y), (((Interactable) entity).x), 127, (((Interactable) entity).plane));
                    Class299.method3175(entity, true);
                }
            }
        }
    }

    static final void method110() {
        Class156.anInt1866 = 0;
        for (int i = 0; i < Class28.anInt4892; i++) {
            NPC NPC = (((Node_Sub10) (Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) Class346_Sub7_Sub2_Sub3.anIntArray10381[i], (byte) 31))).aNPC_6946);
            if ((((Entity) NPC).aBoolean10439) && NPC.method3640((byte) 82) != -1) {
                int i_31_ = ((NPC.method3632(-1) - 1) * 256 + 252);
                int i_32_ = (((Interactable) NPC).x - i_31_) >> 9;
                int i_33_ = (((Interactable) NPC).y - i_31_) >> 9;
                Entity entity = Class162_Sub1.method1449((((Interactable) NPC).plane), -28802, i_33_, i_32_);
                if (entity != null) {
                    int i_34_ = (((Entity) entity).anInt10484);
                    if (entity instanceof NPC)
                        i_34_ += 2048;
                    if ((((Entity) entity).anInt10487) == 0 && (entity.method3640((byte) 99) != -1)) {
                        Class275_Sub1.anIntArray8581[Class156.anInt1866] = i_34_;
                        Node_Sub14_Sub20.anIntArray9370[Class156.anInt1866] = i_34_;
                        Class156.anInt1866++;
                        ((Entity) entity).anInt10487++;
                    }
                    Class275_Sub1.anIntArray8581[Class156.anInt1866] = i_34_;
                    Node_Sub14_Sub20.anIntArray9370[Class156.anInt1866] = ((Entity) NPC).anInt10484 + 2048;
                    Class156.anInt1866++;
                    ((Entity) entity).anInt10487++;
                }
            }
        }
        Node_Sub14_Sub39.method2396(Node_Sub14_Sub20.anIntArray9370, 0, (byte) -105, Class275_Sub1.anIntArray8581, Class156.anInt1866 - 1);
    }

    static final RSInterface2 method111(RSInterface2 class354) {
        int i = method113(class354).method2666(121);
        if (i == 0)
            return null;
        for (int i_35_ = 0; i_35_ < i; i_35_++) {
            class354 = Class276.method2853(65535, ((RSInterface2) class354).anInt4300);
            if (class354 == null)
                return null;
        }
        return class354;
    }

    static final void method112(int i) {
        int i_36_ = Class131.anInt1600;
        int[] is = Class271.anIntArray3156;
        for (int i_37_ = 0; i_37_ < i_36_ + Class28.anInt4892; i_37_++) {
            Entity entity;
            if (i_37_ < i_36_)
                entity = (Node_Sub32.aPlayerArray7197[is[i_37_]]);
            else
                entity = ((Node_Sub10) (Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) (Class346_Sub7_Sub2_Sub3.anIntArray10381[i_37_ - i_36_]), (byte) 31))).aNPC_6946;
            if (((Interactable) entity).plane == i && (((Entity) entity).anInt10410) >= 0) {
                int i_38_ = entity.method3632(-1);
                if ((i_38_ & 0x1) == 0) {
                    if ((((Interactable) entity).x & 0x1ff) != 0 || (((Interactable) entity).y & 0x1ff) != 0)
                        continue;
                } else if ((((Interactable) entity).x & 0x1ff) != 256 || ((((Interactable) entity).y) & 0x1ff) != 256)
                    continue;
                if (i_38_ == 1) {
                    int i_39_ = (((Interactable) entity).x >> 9);
                    int i_40_ = (((Interactable) entity).y >> 9);
                    if ((((Entity) entity).anInt10410) > Class27.anIntArrayArray361[i_39_][i_40_]) {
                        Class27.anIntArrayArray361[i_39_][i_40_] = ((Entity) entity).anInt10410;
                        Class334.anIntArrayArray3903[i_39_][i_40_] = 1;
                    } else if (((Entity) entity).anInt10410 == Class27.anIntArrayArray361[i_39_][i_40_])
                        Class334.anIntArrayArray3903[i_39_][i_40_]++;
                } else {
                    int i_41_ = (i_38_ - 1) * 256 + 60;
                    int i_42_ = ((((Interactable) entity).x - i_41_) >> 9);
                    int i_43_ = ((((Interactable) entity).y - i_41_) >> 9);
                    int i_44_ = ((((Interactable) entity).x + i_41_) >> 9);
                    int i_45_ = ((((Interactable) entity).y + i_41_) >> 9);
                    for (int i_46_ = i_42_; i_46_ <= i_44_; i_46_++) {
                        for (int i_47_ = i_43_; i_47_ <= i_45_; i_47_++) {
                            if (((Entity) entity).anInt10410 > Class27.anIntArrayArray361[i_46_][i_47_]) {
                                Class27.anIntArrayArray361[i_46_][i_47_] = ((Entity) entity).anInt10410;
                                Class334.anIntArrayArray3903[i_46_][i_47_] = 1;
                            } else if (((Entity) entity).anInt10410 == (Class27.anIntArrayArray361[i_46_][i_47_]))
                                Class334.anIntArrayArray3903[i_46_][i_47_]++;
                        }
                    }
                }
            }
        }
    }

    public final void init() {
        anInt5227++;
        if (this.method93(-116)) {
            Class279_Sub2_Sub1.worldAddress = new WorldAddress();
            ((WorldAddress) Class279_Sub2_Sub1.worldAddress).worldId = Integer.parseInt(this.getParameter("worldid"));
            Class86_Sub1.lobbyAddress = new WorldAddress();
            ((WorldAddress) Class86_Sub1.lobbyAddress).worldId = Integer.parseInt(this.getParameter("lobbyid"));
            ((WorldAddress) Class86_Sub1.lobbyAddress).address = this.getParameter("lobbyaddress");
            Class112_Sub2.demoAddress = new WorldAddress();
            ((WorldAddress) Class112_Sub2.demoAddress).worldId = Integer.parseInt(this.getParameter("demoid"));
            ((WorldAddress) Class112_Sub2.demoAddress).address = this.getParameter("demoaddress");
            Class18.aClass339_295 = (Class130.method1204(0, Integer.parseInt(this.getParameter("modewhere"))));
            //if (Class18.aClass339_295 != Class14.aClass339_266) {
            //    if (!Class205.method1695(-128, Class18.aClass339_295) && s_Sub2.aClass339_7951 != Class18.aClass339_295)
            //        Class18.aClass339_295 = s_Sub2.aClass339_7951;
            //} else
            //    Class18.aClass339_295 = Class346_Sub7_Sub1_Sub1.aClass339_10136;
            Class346_Sub6.aClass79_8296 = (Class8.method187(Integer.parseInt(this.getParameter("modewhat")), 83));
            //if (Class346_Sub6.aClass79_8296 != Class260.aClass79_2965 && Class346_Sub6.aClass79_8296 != Class246.aClass79_2757 && za.aClass79_7487 != Class346_Sub6.aClass79_8296)
            //    Class346_Sub6.aClass79_8296 = za.aClass79_7487;
            try {
                Class191.anInt4822 = Integer.parseInt(this.getParameter("lang"));
            } catch (Exception exception) {
                Class191.anInt4822 = 0;
            }
            String string = this.getParameter("objecttag");
            if (string != null && string.equals("1"))
                Class346_Sub7_Sub3.aBoolean9941 = true;
            else
                Class346_Sub7_Sub3.aBoolean9941 = false;
            String string_48_ = this.getParameter("js");
            if (string_48_ != null && string_48_.equals("1"))
                Class176.aBoolean2058 = true;
            else
                Class176.aBoolean2058 = false;
            String string_49_ = this.getParameter("advert");
            if (string_49_ == null || !string_49_.equals("1"))
                Class69.aBoolean913 = false;
            else
                Class69.aBoolean913 = true;
            String string_50_ = this.getParameter("game");
            if (string_50_ != null) {
                if (!string_50_.equals("0")) {
                    if (!string_50_.equals("1")) {
                        if (string_50_.equals("2"))
                            Class12.aClass215_249 = Class162_Sub2.aClass215_6507;
                        else if (string_50_.equals("3"))
                            Class12.aClass215_249 = Class260.aClass215_2964;
                    } else
                        Class12.aClass215_249 = Class359.aClass215_4430;
                } else
                    Class12.aClass215_249 = Class346_Sub7_Sub2_Sub3.aClass215_10385;
            }
            try {
                Node_Sub8_Sub5.anInt8930 = Integer.parseInt(this.getParameter("affid"));
            } catch (Exception exception) {
                Node_Sub8_Sub5.anInt8930 = 0;
            }
            Class352.aString4188 = this.getParameter("quiturl");
            Class84_Sub8.aString5473 = this.getParameter("settings");
            if (Class84_Sub8.aString5473 == null)
                Class84_Sub8.aString5473 = "";
            Class45.aBoolean560 = "1".equals(this.getParameter("under"));
            String string_51_ = this.getParameter("country");
            if (string_51_ != null) {
                try {
                    Class340_Sub2.anInt8109 = Integer.parseInt(string_51_);
                } catch (Exception exception) {
                    Class340_Sub2.anInt8109 = 0;
                }
            }
            Node_Sub33.anInt7205 = Integer.parseInt(this.getParameter("colourid"));
            if (Node_Sub33.anInt7205 < 0 || Class173.aColorArray2012.length <= Node_Sub33.anInt7205)
                Node_Sub33.anInt7205 = 0;
            if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1)
                Class229.aBoolean2580 = Class304.aBoolean3535 = true;
            String string_52_ = this.getParameter("frombilling");
            if (string_52_ != null && string_52_.equals("true"))
                Class345.aBoolean4105 = true;
            ByteStream.aString6879 = this.getParameter("sskey");
            if (ByteStream.aString6879 != null && ByteStream.aString6879.length() < 2)
                ByteStream.aString6879 = null;
            String string_53_ = this.getParameter("force64mb");
            if (string_53_ != null && string_53_.equals("true"))
                Class340_Sub10.aBoolean8221 = true;
            String string_54_ = this.getParameter("worldflags");
            if (string_54_ != null) {
                try {
                    Class20.anInt309 = Integer.parseInt(string_54_);
                } catch (Exception exception) {
                    /* empty */
                }
            }
            String string_55_ = this.getParameter("userFlow");
            if (string_55_ != null) {
                try {
                    Class54_Sub2.aLong5343 = Long.parseLong(string_55_);
                } catch (NumberFormatException numberformatexception) {
                    /* empty */
                }
            }
            Class8.aString182 = this.getParameter("additionalInfo");
            if (Class8.aString182 != null && (Class8.aString182.length() ^ 0xffffffff) < -51)
                Class8.aString182 = null;
            Node_Sub8_Sub16_Sub1.aClient10301 = this;
            if (Class346_Sub7_Sub2_Sub3.aClass215_10385 == Class12.aClass215_249) {
                Class226_Sub1.anInt6661 = 765;
                s_Sub2.anInt7946 = 503;
            } else if (Class359.aClass215_4430 == Class12.aClass215_249) {
                s_Sub2.anInt7946 = 480;
                Class226_Sub1.anInt6661 = 640;
            }
            this.method84(Class346_Sub6.aClass79_8296.method578(-183) + 32, ((Class215) Class12.aClass215_249).aString2478, 640, Class226_Sub1.anInt6661, s_Sub2.anInt7946, (byte) -24, 37);
        }
    }

    static final Node_Sub48 method113(RSInterface2 class354) {
        Node_Sub48 class248_sub48 = ((Node_Sub48) (Class318.aClass65_3682.method501((((long) ((RSInterface2) class354).interfaceValues << 32) + (long) ((RSInterface2) class354).index), (byte) 31)));
        if (class248_sub48 != null)
            return class248_sub48;
        return ((RSInterface2) class354).aClass248_Sub48_4310;
    }

    private final void method114(int i) {
        if (Class273.anInt5008 == 7 && (Class321.loginStage ^ 0xffffffff) == -1) {
            if ((Class282_Sub21.anInt7817 ^ 0xffffffff) < -2) {
                Class9.anInt225 = Class164.anInt1934;
                Class282_Sub21.anInt7817--;
            }
            if (!Class145.aBoolean1721)
                Class184.method1616((byte) 106);
            for (int i_56_ = 0; (i_56_ ^ 0xffffffff) > -101; i_56_++) {
                if (!OutgoingOpcode.handlePacket((byte) -7))
                    break;
            }
        }
        anInt5231++;
        Class77.anInt998++;
        Class102.method727(-1, -104, null, -1);
        Node_Sub8.method2017(-1, null, -1, (byte) 13);
        Class282_Sub24.method3021(0);
        Class164.anInt1934++;
        for (int i_57_ = 0; Node_Sub8_Sub16_Sub1.anInt10303 > i_57_; i_57_++) {
            NPC NPC = (((Node_Sub10) Node_Sub30.aClass248_Sub10Array7182[i_57_]).aNPC_6946);
            if (NPC != null) {
                byte i_58_ = (((Class255) (((NPC) NPC).aClass255_10614)).aByte2867);
                if ((0x1 & i_58_) != 0) {
                    int i_59_ = NPC.method3632(-1);
                    if ((i_58_ & 0x2 ^ 0xffffffff) != -1 && ((Entity) NPC).anInt10503 == 0 && Math.random() * 1000.0 < 10.0) {
                        int i_60_ = (int) Math.round(10.0 * Math.random() - 5.0);
                        int i_61_ = (int) Math.round(-5.0 + Math.random() * 10.0);
                        if ((i_60_ ^ 0xffffffff) != -1 || i_61_ != 0) {
                            int i_62_ = ((((Entity) NPC).posQueueX[0]) + i_60_);
                            if ((i_62_ ^ 0xffffffff) <= -1) {
                                if (-i_59_ + Node_Sub8_Sub4.anInt8360 + -1 < i_62_)
                                    i_62_ = -1 + (-i_59_ + (Node_Sub8_Sub4.anInt8360));
                            } else
                                i_62_ = 0;
                            int i_63_ = i_61_ + (((Entity) NPC).posQueueY[0]);
                            if ((i_63_ ^ 0xffffffff) <= -1) {
                                if ((i_63_ ^ 0xffffffff) < (Node_Sub22.anInt7074 - (i_59_ - -1) ^ 0xffffffff))
                                    i_63_ = -i_59_ + (Node_Sub22.anInt7074 + -1);
                            } else
                                i_63_ = 0;
                            int i_64_ = (Node_Sub8_Sub18.method2144(i_59_, (((Entity) NPC).posQueueX[0]), (Class182.aClass164Array2114[(((Interactable) NPC).plane)]), (((Entity) NPC).posQueueY[0]), i_59_, Class115.anIntArray4954, true, i_59_, 0, 28002, i_63_, 0, Class193.anIntArray2218, i_62_, -1));
                            if ((i_64_ ^ 0xffffffff) < -1) {
                                if (i_64_ > 9)
                                    i_64_ = 9;
                                for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
                                    ((Entity) NPC).posQueueX[i_65_] = (Class115.anIntArray4954[-1 + (i_64_ + -i_65_)]);
                                    ((Entity) NPC).posQueueY[i_65_] = (Class193.anIntArray2218[-1 + (i_64_ - i_65_)]);
                                    ((Entity) NPC).aByteArray10499[i_65_] = (byte) 1;
                                }
                                ((Entity) NPC).anInt10503 = i_64_;
                            }
                        }
                    }
                    Class338.method3428(i ^ ~0x7a5b, NPC, true);
                    int i_66_ = Class315.method3279(-1, NPC);
                    Class65.method511(-14705, NPC);
                    Class189.method1637(Class346_Sub7_Sub1_Sub2.anInt10195, NPC, (byte) -66, i_66_, Class84_Sub7.anInt5458);
                    Class43.method312(NPC, Class84_Sub7.anInt5458, 0);
                    Class140.method1282((byte) -111, NPC);
                }
            }
        }
        if ((Class321.loginStage ^ 0xffffffff) == -1 && (Node_Sub42_Sub1.anInt9782 ^ 0xffffffff) == -1) {
            if ((Node_Sub45.anInt7343 ^ 0xffffffff) != -3)
                Class158.method1397(i ^ 0x79a6);
            else
                Node_Sub15_Sub5.method2496(18128);
            if ((Class346_Sub7_Sub1.cameraPosX >> 1715597897 ^ 0xffffffff) > -15 || ((Class346_Sub7_Sub1.cameraPosX >> 524857641 ^ 0xffffffff) <= (-14 + Node_Sub8_Sub4.anInt8360 ^ 0xffffffff)) || ((Class316_Sub1_Sub2.cameraPosZ >> -1089265239 ^ 0xffffffff) > -15) || ((Class316_Sub1_Sub2.cameraPosZ >> -1374275671 ^ 0xffffffff) <= (Node_Sub22.anInt7074 + -14 ^ 0xffffffff)))
                Class281.method2915((byte) -73);
        }
        for (; ; ) {
            RSInterface class248_sub6 = ((RSInterface) Node_Sub8_Sub10.aClass293_8979.method3108(false));
            if (class248_sub6 == null)
                break;
            RSInterface2 class354 = ((RSInterface) class248_sub6).rsInter;
            if (((RSInterface2) class354).index >= 0) {
                RSInterface2 class354_67_ = Class276.method2853(65535, ((RSInterface2) class354).anInt4300);
                if (class354_67_ == null || ((RSInterface2) class354_67_).aClass354Array4285 == null || (((RSInterface2) class354).index >= ((RSInterface2) class354_67_).aClass354Array4285.length) || (((RSInterface2) class354_67_).aClass354Array4285[((RSInterface2) class354).index]) != class354)
                    continue;
            }
            Class47.executeScript(class248_sub6);
        }
        for (; ; ) {
            RSInterface class248_sub6 = (RSInterface) Class71.aClass293_5032.method3108(false);
            if (class248_sub6 == null)
                break;
            RSInterface2 class354 = ((RSInterface) class248_sub6).rsInter;
            if ((((RSInterface2) class354).index ^ 0xffffffff) <= -1) {
                RSInterface2 class354_68_ = Class276.method2853(65535, ((RSInterface2) class354).anInt4300);
                if (class354_68_ == null || ((RSInterface2) class354_68_).aClass354Array4285 == null || (((RSInterface2) class354_68_).aClass354Array4285.length <= ((RSInterface2) class354).index) || (((RSInterface2) class354_68_).aClass354Array4285[((RSInterface2) class354).index]) != class354)
                    continue;
            }
            Class47.executeScript(class248_sub6);
        }
        for (; ; ) {
            RSInterface class248_sub6 = (RSInterface) Class176.aClass293_2065.method3108(false);
            if (class248_sub6 == null)
                break;
            RSInterface2 class354 = ((RSInterface) class248_sub6).rsInter;
            if ((((RSInterface2) class354).index ^ 0xffffffff) <= -1) {
                RSInterface2 class354_69_ = Class276.method2853(65535, ((RSInterface2) class354).anInt4300);
                if (class354_69_ == null || ((RSInterface2) class354_69_).aClass354Array4285 == null || ((((RSInterface2) class354_69_).aClass354Array4285.length ^ 0xffffffff) >= (((RSInterface2) class354).index ^ 0xffffffff)) || class354 != (((RSInterface2) class354_69_).aClass354Array4285[((RSInterface2) class354).index]))
                    continue;
            }
            Class47.executeScript(class248_sub6);
        }
        if (Class371.aClass354_4564 != null)
            ha.method815((byte) 39);
        if ((Node_Sub18.anInt7027 % 1500 ^ 0xffffffff) == -1)
            Entity.method3631(i ^ 0x23d3);
        if (i != 31140)
            anInt5245 = 56;
        if (Class273.anInt5008 == 7 && Class321.loginStage == 0)
            Class141.method1285((byte) -89);
        s_Sub2.method3160(false);
        if (Class346_Sub7_Sub1_Sub1.aBoolean10133 && (Node_Sub8_Sub1.aLong8892 < Class118.method1112(116) + -60000L))
            Class94.method691((byte) -117);
        for (Class346_Sub5_Sub1 class346_sub5_sub1 = ((Class346_Sub5_Sub1) Class101.aClass360_1285.method3815((byte) 92)); class346_sub5_sub1 != null; class346_sub5_sub1 = ((Class346_Sub5_Sub1) Class101.aClass360_1285.method3809(-24951))) {
            if ((-5L + Class118.method1112(i + -31024) / 1000L ^ 0xffffffffffffffffL) < ((long) ((Class346_Sub5_Sub1) class346_sub5_sub1).anInt9879 ^ 0xffffffffffffffffL)) {
                if (((Class346_Sub5_Sub1) class346_sub5_sub1).aShort9883 > 0)
                    Class216.method1740(0, (((Class346_Sub5_Sub1) class346_sub5_sub1).aString9882 + Class41.aClass41_485.method301(Class191.anInt4822, (byte) -108)), "", (byte) -15, "", "", 5);
                if (((Class346_Sub5_Sub1) class346_sub5_sub1).aShort9883 == 0)
                    Class216.method1740(0, (((Class346_Sub5_Sub1) class346_sub5_sub1).aString9882 + Class41.aClass41_486.method301(Class191.anInt4822, (byte) -108)), "", (byte) -15, "", "", 5);
                class346_sub5_sub1.method3538(-123);
            }
        }
        do {
            if ((Class273.anInt5008 ^ 0xffffffff) == -8 && Class321.loginStage == 0) {
                if (Class289.aClass111_3398 == null)
                    Class340_Sub5.method3455(i + -31067, false);
                else {
                    Class173.anInt2014++;
                    if (Class173.anInt2014 > 50) {
                        Class338.requestAttempts++;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class232.aOutgoingOpcode_2612));
                        Class226_Sub3.method1814(class248_sub36, 0);
                        //System.out.println("OUT 83-3");
                    }
                    try {
                        Class285.method3074(7388);
                    } catch (java.io.IOException ioexception) {
                        Class340_Sub5.method3455(102, false);
                        break;
                    }
                    break;
                }
                break;
            }
        } while (false);
    }

    static final void method115() {
        int i = Class131.anInt1600;
        int[] is = Class271.anIntArray3156;
        int i_70_ = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub5_7324.method2940(true);
        boolean bool = i_70_ == 1 && i > 200 || i_70_ == 0 && i > 50;
        for (int i_71_ = 0; i_71_ < i; i_71_++) {
            Player player = (Node_Sub32.aPlayerArray7197[is[i_71_]]);
            if (!player.method3650((byte) -84))
                ((Entity) player).anInt10410 = -1;
            else if (((Player) player).aBoolean10585)
                ((Entity) player).anInt10410 = -1;
            else {
                player.updateCoordinateBounds((byte) -128);
                if ((((Animable) player).x1) < 0 || (((Animable) player).y1) < 0 || (((Animable) player).x2) >= Node_Sub8_Sub4.anInt8360 || (((Animable) player).y2) >= Node_Sub22.anInt7074)
                    ((Entity) player).anInt10410 = -1;
                else {
                    ((Player) player).aBoolean10561 = (((Entity) player).aBoolean10491 ? bool : false);
                    if (player == Class347.myPlayer)
                        ((Entity) player).anInt10410 = 2147483647;
                    else {
                        int i_72_ = 0;
                        if (!((Entity) player).aBoolean10439)
                            i_72_++;
                        if (((Entity) player).anInt10416 > Node_Sub18.anInt7027)
                            i_72_ += 2;
                        i_72_ += (5 - player.method3632(-1) << 2);
                        if (((Player) player).aBoolean10565)
                            i_72_ += 512;
                        else {
                            if (Class37.anInt410 == 0)
                                i_72_ += 32;
                            else
                                i_72_ += 128;
                            i_72_ += 256;
                        }
                        ((Entity) player).anInt10410 = i_72_ + 1;
                    }
                }
            }
        }
        for (int i_73_ = 0; i_73_ < Class28.anInt4892; i_73_++) {
            NPC NPC = (((Node_Sub10) (Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) Class346_Sub7_Sub2_Sub3.anIntArray10381[i_73_], (byte) 31))).aNPC_6946);
            if (!NPC.method3663((byte) -84) || !((NPC) NPC).aClass255_10614.method2735(-1, Node_Sub43.aClass291_7306))
                ((Entity) NPC).anInt10410 = -1;
            else {
                NPC.updateCoordinateBounds((byte) -128);
                if ((((Animable) NPC).x1) < 0 || (((Animable) NPC).y1) < 0 || (((Animable) NPC).x2) >= Node_Sub8_Sub4.anInt8360 || (((Animable) NPC).y2) >= Node_Sub22.anInt7074)
                    ((Entity) NPC).anInt10410 = -1;
                else {
                    int i_74_ = 0;
                    if (!((Entity) NPC).aBoolean10439)
                        i_74_++;
                    if (((Entity) NPC).anInt10416 > Node_Sub18.anInt7027)
                        i_74_ += 2;
                    i_74_ += (5 - NPC.method3632(-1) << 2);
                    if (Class37.anInt410 == 0) {
                        if (((Class255) (((NPC) NPC).aClass255_10614)).aBoolean2851)
                            i_74_ += 64;
                        else
                            i_74_ += 128;
                    } else if (Class37.anInt410 == 1) {
                        if (((Class255) (((NPC) NPC).aClass255_10614)).aBoolean2851)
                            i_74_ += 32;
                        else
                            i_74_ += 64;
                    }
                    if (((Class255) (((NPC) NPC).aClass255_10614)).aBoolean2857)
                        i_74_ += 1024;
                    else if (!((Class255) (((NPC) NPC).aClass255_10614)).aBoolean2889)
                        i_74_ += 256;
                    ((Entity) NPC).anInt10410 = i_74_ + 1;
                }
            }
        }
        for (int i_75_ = 0; i_75_ < Class225_Sub3.aClass7Array8477.length; i_75_++) {
            Class7 class7 = Class225_Sub3.aClass7Array8477[i_75_];
            if (class7 != null) {
                if (((Class7) class7).anInt169 == 1) {
                    Node_Sub10 class248_sub10 = ((Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) ((Class7) class7).anInt164, (byte) 31)));
                    if (class248_sub10 != null) {
                        NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                        if (((Entity) NPC).anInt10410 >= 0)
                            ((Entity) NPC).anInt10410 += 2048;
                    }
                } else if (((Class7) class7).anInt169 == 10) {
                    Player player = (Node_Sub32.aPlayerArray7197[((Class7) class7).anInt164]);
                    if (player != null && (player != Class347.myPlayer) && ((Entity) player).anInt10410 >= 0)
                        ((Entity) player).anInt10410 += 2048;
                }
            }
        }
    }

    static final void method116() {
        for (int i = 0; i < Node_Sub8_Sub4.anInt8360; i++) {
            int[] is = Class27.anIntArrayArray361[i];
            for (int i_76_ = 0; i_76_ < Node_Sub22.anInt7074; i_76_++)
                is[i_76_] = 0;
        }
    }

    static final void method117(RSInterface2[] class354s, int i, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_) {
        for (int i_87_ = 0; i_87_ < class354s.length; i_87_++) {
            RSInterface2 class354 = class354s[i_87_];
            if (class354 != null && ((RSInterface2) class354).anInt4300 == i) {
                int i_88_ = ((RSInterface2) class354).anInt4257 + i_81_;
                int i_89_ = ((RSInterface2) class354).anInt4370 + i_82_;
                int i_90_;
                int i_91_;
                int i_92_;
                int i_93_;
                if (((RSInterface2) class354).anInt4284 == 2) {
                    i_90_ = i_77_;
                    i_91_ = i_78_;
                    i_92_ = i_79_;
                    i_93_ = i_80_;
                } else {
                    int i_94_ = i_88_ + ((RSInterface2) class354).anInt4332;
                    int i_95_ = i_89_ + ((RSInterface2) class354).anInt4223;
                    if (((RSInterface2) class354).anInt4284 == 9) {
                        i_94_++;
                        i_95_++;
                    }
                    i_90_ = i_88_ > i_77_ ? i_88_ : i_77_;
                    i_91_ = i_89_ > i_78_ ? i_89_ : i_78_;
                    i_92_ = i_94_ < i_79_ ? i_94_ : i_79_;
                    i_93_ = i_95_ < i_80_ ? i_95_ : i_80_;
                }
                if (((RSInterface2) class354).anInt4284 != 0 && !((RSInterface2) class354).maybeHasScripts && ((Node_Sub48) method113(class354)).anInt7424 == 0 && class354 != Class312.aClass354_3637 && ((RSInterface2) class354).anInt4205 != Class212.anInt2452 && ((RSInterface2) class354).anInt4205 != Class214.anInt2473) {
                    if (i_90_ < i_92_ && i_91_ < i_93_)
                        Class282_Sub26.method3030((byte) -24, class354);
                } else if (!method119(class354)) {
                    int i_96_ = 0;
                    int i_97_ = 0;
                    if (Node_Sub8_Sub6.aBoolean8949) {
                        i_96_ = Class337.method3420(-2);
                        i_97_ = RSInterface2.method3770((byte) -37);
                    }
                    if (class354 == Class371.aClass354_4564 && (Class352.method3750((byte) 48, Class371.aClass354_4564) != null)) {
                        Node_Sub8_Sub13_Sub1.aBoolean10242 = true;
                        Class95.anInt1234 = i_88_;
                        Class352.anInt4179 = i_89_;
                    }
                    if (((RSInterface2) class354).aBoolean4296 || i_90_ < i_92_ && i_91_ < i_93_) {
                        if (((RSInterface2) class354).aBoolean4259 && i_85_ >= i_90_ && i_86_ >= i_91_ && i_85_ < i_92_ && i_86_ < i_93_) {
                            for (RSInterface class248_sub6 = ((RSInterface) Class176.aClass293_2065.method3119(2)); class248_sub6 != null; class248_sub6 = (RSInterface) Class176.aClass293_2065.method3107(-127)) {
                                if (((RSInterface) class248_sub6).aBoolean6852) {
                                    class248_sub6.remove(true);
                                    ((RSInterface2) (((RSInterface) class248_sub6).rsInter)).aBoolean4266 = false;
                                }
                            }
                            if (Class232.anInt2611 == 0) {
                                Class371.aClass354_4564 = null;
                                Class312.aClass354_3637 = null;
                            }
                            Class282_Sub12.anInt7715 = 0;
                            Node_Sub42_Sub3.aBoolean9794 = false;
                            Class218.aBoolean2507 = false;
                            if (!Class145.aBoolean1721)
                                Class184.method1616((byte) 61);
                        }
                        boolean bool;
                        if ((Class46.aClass269_600.method2817((byte) -56) + i_96_) >= i_90_ && (Class46.aClass269_600.method2809(127) + i_97_ >= i_91_) && (Class46.aClass269_600.method2817((byte) -123) + i_96_) < i_92_ && (Class46.aClass269_600.method2809(95) + i_97_ < i_93_))
                            bool = true;
                        else
                            bool = false;
                        if (!Class115.aBoolean4952 && bool) {
                            if (((RSInterface2) class354).anInt4294 >= 0)
                                Class136_Sub4.anInt8413 = ((RSInterface2) class354).anInt4294;
                            else if (((RSInterface2) class354).aBoolean4259)
                                Class136_Sub4.anInt8413 = -1;
                        }
                        if (!Class145.aBoolean1721 && i_85_ >= i_90_ && i_86_ >= i_91_ && i_85_ < i_92_ && i_86_ < i_93_)
                            Class111_Sub1.method782(88, i_86_ - i_89_, class354, i_85_ - i_88_);
                        boolean bool_98_ = false;
                        if (Class46.aClass269_600.method2814((byte) 119) && bool)
                            bool_98_ = true;
                        boolean bool_99_ = false;
                        Node_Sub39 class248_sub39 = ((Node_Sub39) Class368.aClass293_4524.method3119(2));
                        if (class248_sub39 != null && class248_sub39.method2604(-127) == 0 && (class248_sub39.method2606(-15204) + i_96_ >= i_90_) && (class248_sub39.method2601((byte) -68) + i_97_ >= i_91_) && (class248_sub39.method2606(-15204) + i_96_ < i_92_) && (class248_sub39.method2601((byte) -77) + i_97_ < i_93_))
                            bool_99_ = true;
                        if (((RSInterface2) class354).aByteArray4307 != null && !Class112.method785((byte) 65)) {
                            for (int i_100_ = 0; i_100_ < (((RSInterface2) class354).aByteArray4307).length; i_100_++) {
                                if (!Class353.aClass253_4192.method2722(true, (((RSInterface2) class354).aByteArray4307[i_100_]))) {
                                    if (((RSInterface2) class354).anIntArray4369 != null)
                                        ((RSInterface2) class354).anIntArray4369[i_100_] = 0;
                                } else if ((((RSInterface2) class354).anIntArray4369) == null || (Node_Sub18.anInt7027 >= (((RSInterface2) class354).anIntArray4369[i_100_]))) {
                                    byte i_101_ = (((RSInterface2) class354).aByteArray4330[i_100_]);
                                    if (i_101_ == 0 || (((i_101_ & 0x8) == 0 || (!Class353.aClass253_4192.method2722(true, 86) && !Class353.aClass253_4192.method2722(true, 82) && !(Class353.aClass253_4192.method2722(true, 81)))) && ((i_101_ & 0x2) == 0 || Class353.aClass253_4192.method2722(true, 86)) && ((i_101_ & 0x1) == 0 || Class353.aClass253_4192.method2722(true, 82)) && ((i_101_ & 0x4) == 0 || (Class353.aClass253_4192.method2722(true, 81))))) {
                                        if (i_100_ < 10)
                                            Class5.sendClickedButtonPacket("", -1, -1, (((RSInterface2) class354).interfaceValues), i_100_ + 1);
                                        else if (i_100_ == 10) {
                                            Class1.method168((byte) 65);
                                            Node_Sub48 class248_sub48 = method113(class354);
                                            Node_Sub14_Sub13.method2312(((Node_Sub48) class248_sub48).anInt7418, 1, class354, class248_sub48.method2673(2));
                                            Node_Sub8_Sub4.aString8364 = (Node_Sub8_Sub15.method2133(-1, class354));
                                            if (Node_Sub8_Sub4.aString8364 == null)
                                                Node_Sub8_Sub4.aString8364 = "Null";
                                            Class287.aString3382 = ((((RSInterface2) class354).aString4210) + "<col=ffffff>");
                                        }
                                        int i_102_ = (((RSInterface2) class354).anIntArray4212[i_100_]);
                                        if ((((RSInterface2) class354).anIntArray4369) == null)
                                            ((RSInterface2) class354).anIntArray4369 = (new int
                                                    [(((RSInterface2) class354).aByteArray4307).length]);
                                        if (i_102_ != 0)
                                            ((RSInterface2) class354).anIntArray4369[i_100_] = (Node_Sub18.anInt7027 + i_102_);
                                        else
                                            ((RSInterface2) class354).anIntArray4369[i_100_] = 2147483647;
                                    }
                                }
                            }
                        }
                        if (bool_99_)
                            Class130.method1203(class354, (i_96_ + class248_sub39.method2606(-15204) - i_88_), (i_97_ + class248_sub39.method2601((byte) -18) - i_89_), -103);
                        if (Class371.aClass354_4564 != null && Class371.aClass354_4564 != class354 && bool && method113(class354).method2667(-94))
                            Class316_Sub2.aClass354_8052 = class354;
                        if (class354 == Class312.aClass354_3637) {
                            Class305.aBoolean3549 = true;
                            Class380.anInt4648 = i_88_;
                            Node_Sub2_Sub4.anInt8869 = i_89_;
                        }
                        if (((RSInterface2) class354).maybeHasScripts || ((RSInterface2) class354).anInt4205 != 0) {
                            if (bool && Class329.anInt3851 != 0 && (((RSInterface2) class354).anObjectArray4204 != null)) {
                                RSInterface class248_sub6 = new RSInterface();
                                ((RSInterface) class248_sub6).aBoolean6852 = true;
                                ((RSInterface) class248_sub6).rsInter = class354;
                                ((RSInterface) class248_sub6).anInt6843 = Class329.anInt3851;
                                ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4204;
                                Class176.aClass293_2065.method3109(class248_sub6, -114);
                            }
                            if (Class371.aClass354_4564 != null || Class145.aBoolean1721 || ((((RSInterface2) class354).anInt4205 != Class282_Sub4.anInt7625) && Class282_Sub12.anInt7715 > 0)) {
                                bool_99_ = false;
                                bool_98_ = false;
                                bool = false;
                            }
                            if (((RSInterface2) class354).anInt4205 != 0) {
                                if ((((RSInterface2) class354).anInt4205 == Class249.anInt2809) || (((RSInterface2) class354).anInt4205 == Class95.anInt1229)) {
                                    Class341.aClass354_3973 = class354;
                                    if (Class223.aClass199_5198 != null)
                                        Class223.aClass199_5198.method1680(2, ((RSInterface2) class354).anInt4223, Class287.aHa3381);
                                    if (((RSInterface2) class354).anInt4205 == Class249.anInt2809) {
                                        if (!Class145.aBoolean1721 && i_85_ >= i_90_ && i_86_ >= i_91_ && i_85_ < i_92_ && i_86_ < i_93_) {
                                            Class356.method3785((Class287.aHa3381), i_84_, i_83_, -284797828);
                                            for (Class346_Sub2 class346_sub2 = ((Class346_Sub2) (Node_Sub8_Sub14_Sub1.aClass360_10291.method3815((byte) 50))); class346_sub2 != null; class346_sub2 = ((Class346_Sub2) (Node_Sub8_Sub14_Sub1.aClass360_10291.method3809(-24951)))) {
                                                if (i_85_ >= (((Class346_Sub2) class346_sub2).anInt8256) && (i_85_ < (((Class346_Sub2) class346_sub2).anInt8260)) && (i_86_ >= (((Class346_Sub2) class346_sub2).anInt8263)) && (i_86_ < (((Class346_Sub2) class346_sub2).anInt8255))) {
                                                    Class184.method1616((byte) 73);
                                                    Class380.method3896((((Class346_Sub2) class346_sub2).aEntity_8258), -123);
                                                }
                                            }
                                        }
                                        continue;
                                    }
                                }
                                if (((RSInterface2) class354).anInt4205 == Class212.anInt2452) {
                                    if (class354.method3768(Class287.aHa3381, 0) != null && (Class346_Sub7_Sub1.anInt9907 == 0 || (Class346_Sub7_Sub1.anInt9907 == 3)) && !Class145.aBoolean1721 && i_85_ >= i_90_ && i_86_ >= i_91_ && i_85_ < i_92_ && i_86_ < i_93_) {
                                        int i_103_ = i_85_ - i_88_;
                                        int i_104_ = i_86_ - i_89_;
                                        int i_105_ = (((RSInterface2) class354).anIntArray4238[i_104_]);
                                        if (i_103_ >= i_105_ && (i_103_ <= (i_105_ + (((RSInterface2) class354).anIntArray4362[i_104_])))) {
                                            i_103_ -= (((RSInterface2) class354).anInt4332) / 2;
                                            i_104_ -= (((RSInterface2) class354).anInt4223) / 2;
                                            int i_106_;
                                            if (Node_Sub45.anInt7343 == 4)
                                                i_106_ = ((int) (Class282_Sub7.aFloat7661) & 0x3fff);
                                            else
                                                i_106_ = (((int) (Class282_Sub7.aFloat7661) + (Class346_Sub7_Sub5.anInt9958)) & 0x3fff);
                                            int i_107_ = (Node_Sub9_Sub1.anIntArray9106[i_106_]);
                                            int i_108_ = (Node_Sub9_Sub1.anIntArray9109[i_106_]);
                                            if (Node_Sub45.anInt7343 != 4) {
                                                i_107_ = (i_107_ * (Class252.anInt2843 + 256)) >> 8;
                                                i_108_ = (i_108_ * (Class252.anInt2843 + 256)) >> 8;
                                            }
                                            int i_109_ = ((i_104_ * i_107_ + i_103_ * i_108_) >> 14);
                                            int i_110_ = ((i_104_ * i_108_ - i_103_ * i_107_) >> 14);
                                            int i_111_;
                                            int i_112_;
                                            if (Node_Sub45.anInt7343 == 4) {
                                                i_111_ = ((Class61.anInt831 >> 9) + (i_109_ >> 2));
                                                i_112_ = (Node_Sub32.anInt7198 >> 9) - (i_110_ >> 2);
                                            } else {
                                                int i_113_ = (Class347.myPlayer.method3632(-1) - 1) * 256;
                                                i_111_ = ((((Interactable) (Class347.myPlayer)).x) - i_113_ >> 9) + (i_109_ >> 2);
                                                i_112_ = ((((Interactable) (Class347.myPlayer)).y) - i_113_ >> 9) - (i_110_ >> 2);
                                            }
                                            if (Class115.aBoolean4952 && (Class346_Sub2.anInt8264 & 0x40) != 0) {
                                                RSInterface2 class354_114_ = (Class188.method1635((Class346_Sub7_Sub5.anInt9963), (InputStream_Sub2.anInt76), 0));
                                                if (class354_114_ != null)
                                                    Class131.method1211(true, (long) (((((RSInterface2) class354).index) << 32) | (((RSInterface2) class354).interfaceValues)), 1L, true, i_112_, 21, false, (((RSInterface2) class354).id), Class292.anInt3423, (Node_Sub8_Sub4.aString8364), (byte) 87, " ->", i_111_);
                                                else
                                                    Class1.method168((byte) 87);
                                            } else {
                                                if (Class12.aClass215_249 == Class359.aClass215_4430)
                                                    Class131.method1211(true, 0L, 1L, true, i_112_, 2, false, -1, -1, (Class41.aClass41_493.method301(Class191.anInt4822, (byte) -108)), (byte) 87, "", i_111_);
                                                Class131.method1211(true, 0L, 1L, true, i_112_, 45, false, -1, Class64.anInt865, (Node_Sub14_Sub28.aString9457), (byte) 87, "", i_111_);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                if (((RSInterface2) class354).anInt4205 == Class282_Sub4.anInt7625) {
                                    WorldAddress.aClass354_1193 = class354;
                                    if (bool)
                                        Node_Sub42_Sub3.aBoolean9794 = true;
                                    if (bool_99_) {
                                        int i_115_ = (int) ((double) (i_96_ + (class248_sub39.method2606(-15204)) - i_88_ - ((((RSInterface2) class354).anInt4332) / 2)) * 2.0 / (double) (Class116.aFloat1447));
                                        int i_116_ = (int) -((double) (i_97_ + (class248_sub39.method2601((byte) 122)) - i_89_ - ((((RSInterface2) class354).anInt4223) / 2)) * 2.0 / (double) (Class116.aFloat1447));
                                        int i_117_ = (Node_Sub14_Sub30.anInt9478 + i_115_ + Class116.anInt1468);
                                        int i_118_ = (Class261.anInt2972 + i_116_ + Class116.anInt1469);
                                        Node_Sub8_Sub1 class248_sub8_sub1 = Class340_Sub5.method3456(123);
                                        if (class248_sub8_sub1 != null) {
                                            int[] is = new int[3];
                                            class248_sub8_sub1.method2033(i_117_, i_118_, -81, is);
                                            if (is != null) {
                                                if (Class353.aClass253_4192.method2722(true, 82) && (Class226_Sub1_Sub1.anInt8801) > 0) {
                                                    Class258.method2756(is[2], is[1], is[0], false);
                                                    continue;
                                                }
                                                Class218.aBoolean2507 = true;
                                                OutputStream_Sub1.anInt88 = is[0];
                                                Viewport.anInt2648 = is[1];
                                                Class338.anInt3938 = is[2];
                                            }
                                            Class282_Sub12.anInt7715 = 1;
                                            Class54_Sub1.aBoolean5321 = false;
                                            Class146.anInt1726 = Class46.aClass269_600.method2817((byte) -128);
                                            Class270.anInt3136 = Class46.aClass269_600.method2809(67);
                                        }
                                    } else if (bool_98_ && (Class282_Sub12.anInt7715 > 0)) {
                                        if (Class282_Sub12.anInt7715 == 1 && ((Class146.anInt1726 != (Class46.aClass269_600.method2817((byte) -122))) || (Class270.anInt3136 != Class46.aClass269_600.method2809(98)))) {
                                            Class114.anInt1424 = (Node_Sub14_Sub30.anInt9478);
                                            Class54_Sub3.anInt5348 = Class261.anInt2972;
                                            Class282_Sub12.anInt7715 = 2;
                                        }
                                        if (Class282_Sub12.anInt7715 == 2) {
                                            Class54_Sub1.aBoolean5321 = true;
                                            Node_Sub18.method2515((byte) -123, (Class114.anInt1424 + (int) ((double) ((Class146.anInt1726) - (Class46.aClass269_600.method2817((byte) -71))) * 2.0 / (double) (Class116.aFloat1448))));
                                            Class231.method1840((Class54_Sub3.anInt5348 - (int) ((double) ((Class270.anInt3136) - (Class46.aClass269_600.method2809(62))) * 2.0 / (double) (Class116.aFloat1448))), -1);
                                        }
                                    } else {
                                        if (Class282_Sub12.anInt7715 > 0 && !Class54_Sub1.aBoolean5321) {
                                            if ((Class282_Sub27.anInt7878 == 1 || Class211.method1729(-555)) && Class379.anInt4638 > 2)
                                                Class86.method646(Class270.anInt3136, 2, Class146.anInt1726);
                                            else if (Class339.method3430(-1))
                                                Class86.method646(Class270.anInt3136, 2, Class146.anInt1726);
                                        }
                                        Class282_Sub12.anInt7715 = 0;
                                    }
                                    continue;
                                }
                                if (((RSInterface2) class354).anInt4205 == Class257.anInt2941) {
                                    if (bool_98_)
                                        Class377.method3887(((RSInterface2) class354).anInt4223, ((RSInterface2) class354).anInt4332, (i_97_ + Class46.aClass269_600.method2809(118) - i_89_), (byte) -128, (i_96_ + Class46.aClass269_600.method2817((byte) -103) - i_88_));
                                    continue;
                                }
                                if (((RSInterface2) class354).anInt4205 == Class214.anInt2473) {
                                    Node_Sub8.method2017(i_88_, class354, i_89_, (byte) 13);
                                    continue;
                                }
                            }
                            if (!((RSInterface2) class354).aBoolean4320 && bool_99_) {
                                ((RSInterface2) class354).aBoolean4320 = true;
                                if (((RSInterface2) class354).anObjectArray4228 != null) {
                                    RSInterface class248_sub6 = new RSInterface();
                                    ((RSInterface) class248_sub6).aBoolean6852 = true;
                                    ((RSInterface) class248_sub6).rsInter = class354;
                                    ((RSInterface) class248_sub6).anInt6849 = (i_96_ + class248_sub39.method2606(-15204) - i_88_);
                                    ((RSInterface) class248_sub6).anInt6843 = (i_97_ + class248_sub39.method2601((byte) 127) - i_89_);
                                    ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4228);
                                    Class176.aClass293_2065.method3109(class248_sub6, -124);
                                }
                            }
                            if (((RSInterface2) class354).aBoolean4320 && bool_98_ && (((RSInterface2) class354).anObjectArray4316 != null)) {
                                RSInterface class248_sub6 = new RSInterface();
                                ((RSInterface) class248_sub6).aBoolean6852 = true;
                                ((RSInterface) class248_sub6).rsInter = class354;
                                ((RSInterface) class248_sub6).anInt6849 = (i_96_ + Class46.aClass269_600.method2817((byte) -71) - i_88_);
                                ((RSInterface) class248_sub6).anInt6843 = (i_97_ + Class46.aClass269_600.method2809(87) - i_89_);
                                ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4316;
                                Class176.aClass293_2065.method3109(class248_sub6, -114);
                            }
                            if (((RSInterface2) class354).aBoolean4320 && !bool_98_) {
                                ((RSInterface2) class354).aBoolean4320 = false;
                                if (((RSInterface2) class354).anObjectArray4260 != null) {
                                    RSInterface class248_sub6 = new RSInterface();
                                    ((RSInterface) class248_sub6).aBoolean6852 = true;
                                    ((RSInterface) class248_sub6).rsInter = class354;
                                    ((RSInterface) class248_sub6).anInt6849 = (i_96_ + Class46.aClass269_600.method2817((byte) -128) - i_88_);
                                    ((RSInterface) class248_sub6).anInt6843 = i_97_ + Class46.aClass269_600.method2809(126) - i_89_;
                                    ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4260);
                                    Class71.aClass293_5032.method3109(class248_sub6, -107);
                                }
                            }
                            if (bool_98_ && (((RSInterface2) class354).anObjectArray4224 != null)) {
                                RSInterface class248_sub6 = new RSInterface();
                                ((RSInterface) class248_sub6).aBoolean6852 = true;
                                ((RSInterface) class248_sub6).rsInter = class354;
                                ((RSInterface) class248_sub6).anInt6849 = (i_96_ + Class46.aClass269_600.method2817((byte) -51) - i_88_);
                                ((RSInterface) class248_sub6).anInt6843 = (i_97_ + Class46.aClass269_600.method2809(74) - i_89_);
                                ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4224;
                                Class176.aClass293_2065.method3109(class248_sub6, -128);
                            }
                            if (!((RSInterface2) class354).aBoolean4266 && bool) {
                                ((RSInterface2) class354).aBoolean4266 = true;
                                if (((RSInterface2) class354).anObjectArray4348 != null) {
                                    RSInterface class248_sub6 = new RSInterface();
                                    ((RSInterface) class248_sub6).aBoolean6852 = true;
                                    ((RSInterface) class248_sub6).rsInter = class354;
                                    ((RSInterface) class248_sub6).anInt6849 = (i_96_ + Class46.aClass269_600.method2817((byte) -121) - i_88_);
                                    ((RSInterface) class248_sub6).anInt6843 = i_97_ + Class46.aClass269_600.method2809(46) - i_89_;
                                    ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4348);
                                    Class176.aClass293_2065.method3109(class248_sub6, -91);
                                }
                            }
                            if (((RSInterface2) class354).aBoolean4266 && bool && (((RSInterface2) class354).anObjectArray4207 != null)) {
                                RSInterface class248_sub6 = new RSInterface();
                                ((RSInterface) class248_sub6).aBoolean6852 = true;
                                ((RSInterface) class248_sub6).rsInter = class354;
                                ((RSInterface) class248_sub6).anInt6849 = (i_96_ + Class46.aClass269_600.method2817((byte) -79) - i_88_);
                                ((RSInterface) class248_sub6).anInt6843 = (i_97_ + Class46.aClass269_600.method2809(67) - i_89_);
                                ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4207;
                                Class176.aClass293_2065.method3109(class248_sub6, -109);
                            }
                            if (((RSInterface2) class354).aBoolean4266 && !bool) {
                                ((RSInterface2) class354).aBoolean4266 = false;
                                if (((RSInterface2) class354).anObjectArray4220 != null) {
                                    RSInterface class248_sub6 = new RSInterface();
                                    ((RSInterface) class248_sub6).aBoolean6852 = true;
                                    ((RSInterface) class248_sub6).rsInter = class354;
                                    ((RSInterface) class248_sub6).anInt6849 = (i_96_ + Class46.aClass269_600.method2817((byte) -51) - i_88_);
                                    ((RSInterface) class248_sub6).anInt6843 = i_97_ + Class46.aClass269_600.method2809(126) - i_89_;
                                    ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4220);
                                    Class71.aClass293_5032.method3109(class248_sub6, -106);
                                }
                            }
                            if (((RSInterface2) class354).anObjectArray4351 != null) {
                                RSInterface class248_sub6 = new RSInterface();
                                ((RSInterface) class248_sub6).rsInter = class354;
                                ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4351;
                                Node_Sub8_Sub10.aClass293_8979.method3109(class248_sub6, -104);
                            }
                            if (((RSInterface2) class354).anObjectArray4267 != null && (Class264.anInt2999 > ((RSInterface2) class354).anInt4357)) {
                                if ((((RSInterface2) class354).anIntArray4277 == null) || ((Class264.anInt2999 - ((RSInterface2) class354).anInt4357) > 32)) {
                                    RSInterface class248_sub6 = new RSInterface();
                                    ((RSInterface) class248_sub6).rsInter = class354;
                                    ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4267);
                                    Class176.aClass293_2065.method3109(class248_sub6, -122);
                                } else {
                                    while_9_:
                                    for (int i_119_ = ((RSInterface2) class354).anInt4357; i_119_ < Class264.anInt2999; i_119_++) {
                                        int i_120_ = (Class311.anIntArray3621[i_119_ & 0x1f]);
                                        for (int i_121_ = 0; i_121_ < (((RSInterface2) class354).anIntArray4277).length; i_121_++) {
                                            if ((((RSInterface2) class354).anIntArray4277[i_121_]) == i_120_) {
                                                RSInterface class248_sub6 = new RSInterface();
                                                ((RSInterface) class248_sub6).rsInter = class354;
                                                ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4267);
                                                Class176.aClass293_2065.method3109(class248_sub6, -115);
                                                break while_9_;
                                            }
                                        }
                                    }
                                }
                                ((RSInterface2) class354).anInt4357 = Class264.anInt2999;
                            }
                            if (((RSInterface2) class354).anObjectArray4225 != null && (Class84_Sub3.anInt5401 > ((RSInterface2) class354).anInt4249)) {
                                if ((((RSInterface2) class354).anIntArray4242 == null) || ((Class84_Sub3.anInt5401 - ((RSInterface2) class354).anInt4249) > 32)) {
                                    RSInterface class248_sub6 = new RSInterface();
                                    ((RSInterface) class248_sub6).rsInter = class354;
                                    ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4225);
                                    Class176.aClass293_2065.method3109(class248_sub6, -97);
                                } else {
                                    while_10_:
                                    for (int i_122_ = ((RSInterface2) class354).anInt4249; i_122_ < Class84_Sub3.anInt5401; i_122_++) {
                                        int i_123_ = (Node_Sub45.anIntArray7359[i_122_ & 0x1f]);
                                        for (int i_124_ = 0; i_124_ < (((RSInterface2) class354).anIntArray4242).length; i_124_++) {
                                            if ((((RSInterface2) class354).anIntArray4242[i_124_]) == i_123_) {
                                                RSInterface class248_sub6 = new RSInterface();
                                                ((RSInterface) class248_sub6).rsInter = class354;
                                                ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4225);
                                                Class176.aClass293_2065.method3109(class248_sub6, -118);
                                                break while_10_;
                                            }
                                        }
                                    }
                                }
                                ((RSInterface2) class354).anInt4249 = Class84_Sub3.anInt5401;
                            }
                            if (((RSInterface2) class354).anObjectArray4358 != null && (Class115.anInt4949 > ((RSInterface2) class354).anInt4236)) {
                                if ((((RSInterface2) class354).anIntArray4252 == null) || ((Class115.anInt4949 - ((RSInterface2) class354).anInt4236) > 32)) {
                                    RSInterface class248_sub6 = new RSInterface();
                                    ((RSInterface) class248_sub6).rsInter = class354;
                                    ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4358);
                                    Class176.aClass293_2065.method3109(class248_sub6, -97);
                                } else {
                                    while_11_:
                                    for (int i_125_ = ((RSInterface2) class354).anInt4236; i_125_ < Class115.anInt4949; i_125_++) {
                                        int i_126_ = (Class282_Sub14.anIntArray7725[i_125_ & 0x1f]);
                                        for (int i_127_ = 0; i_127_ < (((RSInterface2) class354).anIntArray4252).length; i_127_++) {
                                            if ((((RSInterface2) class354).anIntArray4252[i_127_]) == i_126_) {
                                                RSInterface class248_sub6 = new RSInterface();
                                                ((RSInterface) class248_sub6).rsInter = class354;
                                                ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4358);
                                                Class176.aClass293_2065.method3109(class248_sub6, -106);
                                                break while_11_;
                                            }
                                        }
                                    }
                                }
                                ((RSInterface2) class354).anInt4236 = Class115.anInt4949;
                            }
                            if (((RSInterface2) class354).anObjectArray4262 != null && (Class225_Sub1_Sub1.anInt9984 > ((RSInterface2) class354).anInt4309)) {
                                if ((((RSInterface2) class354).anIntArray4324 == null) || ((Class225_Sub1_Sub1.anInt9984 - ((RSInterface2) class354).anInt4309) > 32)) {
                                    RSInterface class248_sub6 = new RSInterface();
                                    ((RSInterface) class248_sub6).rsInter = class354;
                                    ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4262);
                                    Class176.aClass293_2065.method3109(class248_sub6, -104);
                                } else {
                                    while_12_:
                                    for (int i_128_ = ((RSInterface2) class354).anInt4309; i_128_ < Class225_Sub1_Sub1.anInt9984; i_128_++) {
                                        int i_129_ = (Class162.anIntArray1901[i_128_ & 0x1f]);
                                        for (int i_130_ = 0; i_130_ < (((RSInterface2) class354).anIntArray4324).length; i_130_++) {
                                            if ((((RSInterface2) class354).anIntArray4324[i_130_]) == i_129_) {
                                                RSInterface class248_sub6 = new RSInterface();
                                                ((RSInterface) class248_sub6).rsInter = class354;
                                                ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4262);
                                                Class176.aClass293_2065.method3109(class248_sub6, -124);
                                                break while_12_;
                                            }
                                        }
                                    }
                                }
                                ((RSInterface2) class354).anInt4309 = Class225_Sub1_Sub1.anInt9984;
                            }
                            if (((RSInterface2) class354).anObjectArray4246 != null && (Class340_Sub10.anInt8225 > ((RSInterface2) class354).anInt4301)) {
                                if ((((RSInterface2) class354).anIntArray4227 == null) || ((Class340_Sub10.anInt8225 - ((RSInterface2) class354).anInt4301) > 32)) {
                                    RSInterface class248_sub6 = new RSInterface();
                                    ((RSInterface) class248_sub6).rsInter = class354;
                                    ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4246);
                                    Class176.aClass293_2065.method3109(class248_sub6, -95);
                                } else {
                                    while_13_:
                                    for (int i_131_ = ((RSInterface2) class354).anInt4301; i_131_ < Class340_Sub10.anInt8225; i_131_++) {
                                        int i_132_ = (Node_Sub39.anIntArray7279[i_131_ & 0x1f]);
                                        for (int i_133_ = 0; i_133_ < (((RSInterface2) class354).anIntArray4227).length; i_133_++) {
                                            if ((((RSInterface2) class354).anIntArray4227[i_133_]) == i_132_) {
                                                RSInterface class248_sub6 = new RSInterface();
                                                ((RSInterface) class248_sub6).rsInter = class354;
                                                ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4246);
                                                Class176.aClass293_2065.method3109(class248_sub6, -92);
                                                break while_13_;
                                            }
                                        }
                                    }
                                }
                                ((RSInterface2) class354).anInt4301 = Class340_Sub10.anInt8225;
                            }
                            if ((Class111_Sub1.anInt5529 > ((RSInterface2) class354).anInt4377) && (((RSInterface2) class354).anObjectArray4313 != null)) {
                                RSInterface class248_sub6 = new RSInterface();
                                ((RSInterface) class248_sub6).rsInter = class354;
                                ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4313;
                                Class176.aClass293_2065.method3109(class248_sub6, -120);
                            }
                            if ((Class316.anInt3662 > ((RSInterface2) class354).anInt4377) && (((RSInterface2) class354).anObjectArray4258 != null)) {
                                RSInterface class248_sub6 = new RSInterface();
                                ((RSInterface) class248_sub6).rsInter = class354;
                                ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4258;
                                Class176.aClass293_2065.method3109(class248_sub6, -123);
                            }
                            if ((Node_Sub8_Sub11.anInt8989 > ((RSInterface2) class354).anInt4377) && (((RSInterface2) class354).anObjectArray4376 != null)) {
                                RSInterface class248_sub6 = new RSInterface();
                                ((RSInterface) class248_sub6).rsInter = class354;
                                ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4376;
                                Class176.aClass293_2065.method3109(class248_sub6, -111);
                            }
                            if ((Class376.anInt4942 > ((RSInterface2) class354).anInt4377) && (((RSInterface2) class354).anObjectArray4226 != null)) {
                                RSInterface class248_sub6 = new RSInterface();
                                ((RSInterface) class248_sub6).rsInter = class354;
                                ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4226;
                                Class176.aClass293_2065.method3109(class248_sub6, -124);
                            }
                            if ((Class9.anInt225 > ((RSInterface2) class354).anInt4377) && (((RSInterface2) class354).anObjectArray4214 != null)) {
                                RSInterface class248_sub6 = new RSInterface();
                                ((RSInterface) class248_sub6).rsInter = class354;
                                ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4214;
                                Class176.aClass293_2065.method3109(class248_sub6, -106);
                            }
                            ((RSInterface2) class354).anInt4377 = Class164.anInt1934;
                            if (((RSInterface2) class354).anObjectArray4355 != null) {
                                for (int i_134_ = 0; i_134_ < Class262.anInt2977; i_134_++) {
                                    RSInterface class248_sub6 = new RSInterface();
                                    ((RSInterface) class248_sub6).rsInter = class354;
                                    ((RSInterface) class248_sub6).anInt6854 = Class262.anInterface19Array2974[i_134_].method61(-18458);
                                    ((RSInterface) class248_sub6).anInt6855 = Class262.anInterface19Array2974[i_134_].method62((byte) -47);
                                    ((RSInterface) class248_sub6).interfaceOpcodes = (((RSInterface2) class354).anObjectArray4355);
                                    Class176.aClass293_2065.method3109(class248_sub6, -113);
                                }
                            }
                            if (Class346_Sub7_Sub4_Sub2.aBoolean10186 && (((RSInterface2) class354).anObjectArray4371 != null)) {
                                RSInterface class248_sub6 = new RSInterface();
                                ((RSInterface) class248_sub6).rsInter = class354;
                                ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4371;
                                Class176.aClass293_2065.method3109(class248_sub6, -114);
                            }
                        }
                        if (((RSInterface2) class354).anInt4284 == 5 && ((RSInterface2) class354).anInt4291 != -1)
                            class354.method3760((byte) -52, Class293.aClass102_3436, Class371.aClass11_4569).method1680(2, ((RSInterface2) class354).anInt4223, Class287.aHa3381);
                        Class282_Sub26.method3030((byte) -24, class354);
                        if (((RSInterface2) class354).anInt4284 == 0) {
                            method117(class354s, ((RSInterface2) class354).interfaceValues, i_90_, i_91_, i_92_, i_93_, i_88_ - ((RSInterface2) class354).anInt4261, i_89_ - ((RSInterface2) class354).anInt4271, i_83_, i_84_, i_85_, i_86_);
                            if (((RSInterface2) class354).aClass354Array4285 != null)
                                method117(((RSInterface2) class354).aClass354Array4285, ((RSInterface2) class354).interfaceValues, i_90_, i_91_, i_92_, i_93_, i_88_ - ((RSInterface2) class354).anInt4261, i_89_ - ((RSInterface2) class354).anInt4271, i_83_, i_84_, i_85_, i_86_);
                            Node_Sub12 class248_sub12 = ((Node_Sub12) (Class109.aClass65_1375.method501((long) ((RSInterface2) class354).interfaceValues, (byte) 31)));
                            if (class248_sub12 != null) {
                                if ((Class12.aClass215_249 == (Class346_Sub7_Sub2_Sub3.aClass215_10385)) && (((Node_Sub12) class248_sub12).anInt6960) == 0 && !Class145.aBoolean1721 && bool && !Class332.aBoolean3874)
                                    Class184.method1616((byte) 109);
                                Class23.method235(i_83_, i_84_, i_90_, i_88_, i_89_, i_91_, 102, i_85_, i_86_, i_92_, i_93_, ((Node_Sub12) class248_sub12).anInt6964);
                            }
                        }
                    }
                }
            }
        }
    }

    public static final void main(String[] strings) {
        try {
            if ((strings.length ^ 0xffffffff) != -7)
                Node_Sub26.method2552("Argument count", false);
            Class279_Sub2_Sub1.worldAddress = new WorldAddress();
            ((WorldAddress) Class279_Sub2_Sub1.worldAddress).worldId = Integer.parseInt(strings[0]);
            Class86_Sub1.lobbyAddress = new WorldAddress();
            ((WorldAddress) Class86_Sub1.lobbyAddress).worldId = Integer.parseInt(strings[1]);
            Class112_Sub2.demoAddress = new WorldAddress();
            ((WorldAddress) Class112_Sub2.demoAddress).worldId = Integer.parseInt(strings[2]);
            Class18.aClass339_295 = Class14.aClass339_266;
            if (!strings[3].equals("live")) {
                if (strings[3].equals("rc"))
                    Class346_Sub6.aClass79_8296 = Class246.aClass79_2757;
                else if (strings[3].equals("wip"))
                    Class346_Sub6.aClass79_8296 = Class260.aClass79_2965;
                else
                    Node_Sub26.method2552("modewhat", false);
            } else
                Class346_Sub6.aClass79_8296 = za.aClass79_7487;
            Class191.anInt4822 = Class23.method236(strings[4], 5);
            if ((Class191.anInt4822 ^ 0xffffffff) == 0) {
                if (strings[4].equals("english"))
                    Class191.anInt4822 = 0;
                else if (strings[4].equals("german"))
                    Class191.anInt4822 = 1;
                else
                    Node_Sub26.method2552("language", false);
            }
            Class176.aBoolean2058 = false;
            Class346_Sub7_Sub3.aBoolean9941 = false;
            if (strings[5].equals("game0"))
                Class12.aClass215_249 = Class346_Sub7_Sub2_Sub3.aClass215_10385;
            else if (strings[5].equals("game1"))
                Class12.aClass215_249 = Class359.aClass215_4430;
            else if (strings[5].equals("game2"))
                Class12.aClass215_249 = Class162_Sub2.aClass215_6507;
            else if (!strings[5].equals("game3"))
                Node_Sub26.method2552("game", false);
            else
                Class12.aClass215_249 = Class260.aClass215_2964;
            ByteStream.aString6879 = null;
            Class345.aBoolean4105 = false;
            Class54_Sub2.aLong5343 = 0L;
            Class8.aString182 = null;
            Class340_Sub10.aBoolean8221 = false;
            Node_Sub8_Sub5.anInt8930 = 0;
            Class84_Sub8.aString5473 = "";
            Class340_Sub2.anInt8109 = 0;
            Node_Sub33.anInt7205 = ((Class215) Class12.aClass215_249).anInt2475;
            Class20.anInt309 = 0;
            Class229.aBoolean2580 = Class304.aBoolean3535 = true;
            client var_client = new client();
            Node_Sub8_Sub16_Sub1.aClient10301 = var_client;
            var_client.method86(1024, ((Class215) Class12.aClass215_249).aString2478, false, 37, 640, 768, (Class346_Sub6.aClass79_8296.method578(-183) + 32), -124);
            Class300.aFrame3494.setLocation(40, 40);
        } catch (Exception exception) {
            Class282_Sub14.method2975(null, exception, 1);
        }
        anInt5232++;
    }

    private final void method118(int i) {
        anInt5235++;
        if ((Class273.anInt5008 ^ 0xffffffff) != -15) {
            Node_Sub18.anInt7027++;
            if ((Node_Sub18.anInt7027 % 1000 ^ 0xffffffff) == -2) {
                GregorianCalendar gregoriancalendar = new GregorianCalendar();
                Class25.anInt340 = (gregoriancalendar.get(11) * 600 - -(gregoriancalendar.get(12) * 10) - -(gregoriancalendar.get(13) / 6));
                Class275_Sub1.aRandom8582.setSeed((long) Class25.anInt340);
            }
            if (Node_Sub18.anInt7027 % 50 == 0) {
                Class226_Sub3.anInt6671 = Class282_Sub18.anInt7780;
                Class41.anInt534 = Viewport.anInt2649;
                Class282_Sub18.anInt7780 = 0;
                Viewport.anInt2649 = 0;
            }
            method107((byte) 73);
            if (Class156.aClass290_1861 != null)
                Class156.aClass290_1861.method3097((byte) -43);
            Class209.method1713(-122);
            Class48.method368((byte) 125);
            Class353.aClass253_4192.method2718((byte) -92);
            Class46.aClass269_600.method2815(-6928);
            if (Class287.aHa3381 != null)
                Class287.aHa3381.j((int) Class118.method1112(i + 116));
            Class119.method1124(-3);
            Class370.anInt4555 = 0;
            Class262.anInt2977 = 0;
            for (Interface19 interface19 = Class353.aClass253_4192.method2723(i + 20175); interface19 != null; interface19 = Class353.aClass253_4192.method2723(i + 20175)) {
                int i_135_ = interface19.method58(-24548);
                if ((i_135_ ^ 0xffffffff) != -3 && i_135_ != 3) {
                    if ((i_135_ ^ 0xffffffff) == -1 && Class370.anInt4555 < 75) {
                        Node_Sub8_Sub16.anInterface19Array9052[Class370.anInt4555] = interface19;
                        Class370.anInt4555++;
                    }
                } else {
                    int i_136_ = interface19.method62((byte) -77);
                    if (!Node_Sub8_Sub13.method2095(i ^ 0x52) || (i_136_ != 96 && i_136_ != 167 && (i_136_ ^ 0xffffffff) != -179)) {
                        if ((Class262.anInt2977 ^ 0xffffffff) > -129) {
                            Class262.anInterface19Array2974[Class262.anInt2977] = interface19;
                            Class262.anInt2977++;
                        }
                    } else if (Class112.method785((byte) 83))
                        Class296.method3129((byte) -15);
                    else
                        RSInterface.method2015(false);
                }
            }
            Class329.anInt3851 = i;
            for (Node_Sub39 class248_sub39 = Class46.aClass269_600.method2810((byte) 127); class248_sub39 != null; class248_sub39 = Class46.aClass269_600.method2810((byte) 126)) {
                int i_137_ = class248_sub39.method2604(-128);
                if (i_137_ == -1)
                    Node_Sub14_Sub7.aClass293_9223.method3109(class248_sub39, i ^ ~0x6e);
                else if (i_137_ != 6) {
                    if (Class8.method186(i_137_, (byte) 79)) {
                        Class368.aClass293_4524.method3109(class248_sub39, -97);
                        if (Class368.aClass293_4524.method3112(0) > 10)
                            Class368.aClass293_4524.method3108(false);
                    }
                } else
                    Class329.anInt3851 += class248_sub39.method2599(19702);
            }
            if (Class112.method785((byte) 107))
                OutgoingOpcode.method1511(i ^ 0x2280);
            if (Node_Sub14_Sub33.method2374(Class273.anInt5008, 114)) {
                Class279_Sub2.method2896((byte) 66);
                Class366.method3830(0);
            } else if (Class162_Sub1.method1459(-86, Class273.anInt5008))
                Node_Sub29.method2561((byte) -105);
            if (!Class263.method2771(i + -6, Class273.anInt5008) || Class162_Sub1.method1459(i + -92, Class273.anInt5008)) {
                if (!Class188.method1633((byte) -14, Class273.anInt5008) || Class162_Sub1.method1459(-41, Class273.anInt5008)) {
                    if ((Class273.anInt5008 ^ 0xffffffff) != -13) {
                        if (!Class45.method328((byte) 13, Class273.anInt5008) || Class162_Sub1.method1459(i + -74, Class273.anInt5008)) {
                            if ((Class273.anInt5008 ^ 0xffffffff) == -14) {
                                Class352.method3752(14);
                                if (Class282_Sub19.anInt7785 != -3 && ((Class282_Sub19.anInt7785 ^ 0xffffffff) != -3) && ((Class282_Sub19.anInt7785 ^ 0xffffffff) != -16))
                                    Class340_Sub5.method3455(i ^ 0x1f, false);
                            }
                        } else
                            Class310.method3239((byte) -44);
                    } else
                        Class352.method3752(14);
                } else {
                    method114(31140);
                    Class352.method3752(14);
                }
            } else {
                method114(31140);
                Class259.method2759((byte) -33);
                Class352.method3752(i + 14);
            }
            Class169.method1547(26160, Class287.aHa3381);
            Class368.aClass293_4524.method3108(false);
        }
    }

    final void method90(int i) {
        anInt5238++;
        if (Class340_Sub10.aBoolean8221)
            Class75.anInt977 = 64;
        Frame frame = new Frame("Jagex");
        frame.pack();
        frame.dispose();
        Class66.method517(i ^ ~0x15);
        Class340_Sub5.aClass77_8143 = new Class77(Node_Sub14_Sub15.aClass174_9328);
        Class282_Sub5.aClass323_7634 = new Class323();
        Class76.method559(new int[]{1000, 100}, false, new int[]{i, 260});
        if (s_Sub2.aClass339_7951 != Class18.aClass339_295)
            Node_Sub50.aByteArrayArray7444 = new byte[50][];
        Node_Sub14_Sub38.aClass248_Sub45_9584 = Class282_Sub1.method2923(0);
        if (Class18.aClass339_295 != s_Sub2.aClass339_7951) {
            if (Class205.method1695(-119, Class18.aClass339_295)) {
                ((WorldAddress) Class279_Sub2_Sub1.worldAddress).address = this.getCodeBase().getHost();
                ((WorldAddress) Class279_Sub2_Sub1.worldAddress).port1 = 40000 + (((WorldAddress) Class279_Sub2_Sub1.worldAddress).worldId);
                ((WorldAddress) Class86_Sub1.lobbyAddress).port1 = ((WorldAddress) Class86_Sub1.lobbyAddress).worldId + 40000;
                ((WorldAddress) Class112_Sub2.demoAddress).port1 = (((WorldAddress) Class112_Sub2.demoAddress).worldId + 40000);
                ((WorldAddress) Class279_Sub2_Sub1.worldAddress).port2 = 50000 - -(((WorldAddress) Class279_Sub2_Sub1.worldAddress).worldId);
                ((WorldAddress) Class86_Sub1.lobbyAddress).port2 = ((WorldAddress) Class86_Sub1.lobbyAddress).worldId + 50000;
                ((WorldAddress) Class112_Sub2.demoAddress).port2 = (((WorldAddress) Class112_Sub2.demoAddress).worldId + 50000);
            } else if (Class14.aClass339_266 == Class18.aClass339_295) {
                ((WorldAddress) Class279_Sub2_Sub1.worldAddress).address = "127.0.0.1";
                ((WorldAddress) Class86_Sub1.lobbyAddress).address = "127.0.0.1";
                ((WorldAddress) Class279_Sub2_Sub1.worldAddress).port1 = 40000 - -(((WorldAddress) Class279_Sub2_Sub1.worldAddress).worldId);
                ((WorldAddress) Class112_Sub2.demoAddress).address = "127.0.0.1";
                ((WorldAddress) Class86_Sub1.lobbyAddress).port1 = ((WorldAddress) Class86_Sub1.lobbyAddress).worldId + 40000;
                ((WorldAddress) Class112_Sub2.demoAddress).port1 = (40000 - -((WorldAddress) Class112_Sub2.demoAddress).worldId);
                ((WorldAddress) Class279_Sub2_Sub1.worldAddress).port2 = (((WorldAddress) Class279_Sub2_Sub1.worldAddress).worldId + 50000);
                ((WorldAddress) Class86_Sub1.lobbyAddress).port2 = (50000 - -((WorldAddress) Class86_Sub1.lobbyAddress).worldId);
                ((WorldAddress) Class112_Sub2.demoAddress).port2 = (((WorldAddress) Class112_Sub2.demoAddress).worldId + 50000);
            }
        } else {
            ((WorldAddress) Class279_Sub2_Sub1.worldAddress).address = this.getCodeBase().getHost();
        }
        if (Class346_Sub7_Sub2_Sub3.aClass215_10385 == Class12.aClass215_249)
            Class36.aBoolean404 = false;
        Class166.aShortArray1948 = Class147.aShortArray1734 = Node_Sub14.aShortArray6985 = Class192.aShortArray2217 = new short[256];
        Class346_Sub7_Sub2_Sub4.aWorldAddress_10119 = Class279_Sub2_Sub1.worldAddress;
        if (Class359.aClass215_4430 != Class12.aClass215_249) {
            if (Class260.aClass215_2964 == Class12.aClass215_249) {
                Class205.aShortArrayArray2388 = Class282_Sub10.aShortArrayArray7691;
                Class226_Sub2.aShortArrayArrayArray6667 = Node_Sub14_Sub25.aShortArrayArrayArray9419;
            } else {
                Class205.aShortArrayArray2388 = Class307.aShortArrayArray3564;
                Class226_Sub2.aShortArrayArrayArray6667 = Class264.aShortArrayArrayArray2994;
            }
        } else {
            Class205.aShortArrayArray2388 = Class282_Sub7.aShortArrayArray7658;
            Class83.anInt1033 = 16777215;
            Class44_Sub1.aBoolean5292 = true;
            Node_Sub14_Sub33.anInt9510 = 0;
            Class226_Sub2.aShortArrayArrayArray6667 = Class176.aShortArrayArrayArray2060;
        }
        try {
            Class106.aClipboard1346 = Node_Sub8_Sub16_Sub1.aClient10301.getToolkit().getSystemClipboard();
        } catch (Exception exception) {
            /* empty */
        }
        Class353.aClass253_4192 = Class114.method1075(Class297_Sub1.aCanvas8478, true);
        Class46.aClass269_600 = Animable.method3600(Class297_Sub1.aCanvas8478, true, (byte) 122);
        try {
            if (((Class174) Node_Sub14_Sub15.aClass174_9328).aClass45_2042 != null) {
                Class95.aClass46_1231 = new Class46(((Class174) (Node_Sub14_Sub15.aClass174_9328)).aClass45_2042, 5200, 0);
                for (int i_138_ = 0; (i_138_ ^ 0xffffffff) > -38; i_138_++)
                    Class96.aClass46Array1242[i_138_] = new Class46((((Class174) Node_Sub14_Sub15.aClass174_9328).aClass45Array2033[i_138_]), 6000, 0);
                Class271.aClass46_3157 = new Class46(((Class174) (Node_Sub14_Sub15.aClass174_9328)).aClass45_2036, 6000, 0);
                Class238_Sub2.aClass209_6732 = new Class209(255, Class95.aClass46_1231, Class271.aClass46_3157, 500000);
                Class250.aClass46_2824 = new Class46(((Class174) (Node_Sub14_Sub15.aClass174_9328)).aClass45_2034, 24, 0);
                ((Class174) Node_Sub14_Sub15.aClass174_9328).aClass45_2036 = null;
                ((Class174) Node_Sub14_Sub15.aClass174_9328).aClass45_2034 = null;
                ((Class174) Node_Sub14_Sub15.aClass174_9328).aClass45Array2033 = null;
                ((Class174) Node_Sub14_Sub15.aClass174_9328).aClass45_2042 = null;
            }
        } catch (java.io.IOException ioexception) {
            Class95.aClass46_1231 = null;
            Class250.aClass46_2824 = null;
            Class271.aClass46_3157 = null;
            Class238_Sub2.aClass209_6732 = null;
        }
        //if (Class18.aClass339_295 != s_Sub2.aClass339_7951)
        //    Class75.aBoolean978 = true;
        Class316_Sub1_Sub2.aString9860 = Class41.aClass41_478.method301(Class191.anInt4822, (byte) -108);
    }

    final String method95(int i) {
        anInt5233++;
        int i_139_ = 17 % ((i - 43) / 32);
        String string = null;
        try {
            string = ("[1)" + Class67.baseX + "," + Class368.baseY + "," + Node_Sub8_Sub4.anInt8360 + "," + Node_Sub22.anInt7074 + "|");
            if (Class347.myPlayer != null)
                string += ("2)" + Class177.anInt2074 + "," + (Class67.baseX + (((Entity) Class347.myPlayer).posQueueX[0])) + "," + (Class368.baseY + (((Entity) Class347.myPlayer).posQueueY[0])) + "|");
            string += ("3)" + ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) + "|4)" + ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7340.method2946(true) + "|5)" + Class346_Sub7_Sub3.method3672((byte) -112) + "|6)" + Class146.anInt1724 + "," + Class282_Sub20.anInt7800 + "|");
            string += "7)" + ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub11_7347.method2963(true) + "|";
            string += "8)" + ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342.method2976(true) + "|";
            string += "9)" + ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub23_7360.method3018(true) + "|";
            string += "10)" + ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub29_7313.method3047(true) + "|";
            string += "11)" + ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub27_7321.method3034(true) + "|";
            string += "12)" + ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335.method2961(true) + "|";
            string += "13)" + Class75.anInt977 + "|";
            string += "14)" + Class273.anInt5008;
            if (InputStream_Sub2.aClass248_Sub24_78 != null)
                string += "|15)" + (((Node_Sub24) InputStream_Sub2.aClass248_Sub24_78).anInt7126);
            try {
                if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) == 2) {
                    Class var_class = Class.forName("java.lang.ClassLoader");
                    Field field = var_class.getDeclaredField("nativeLibraries");
                    Class var_class_140_ = Class.forName("java.lang.reflect.AccessibleObject");
                    Method method = var_class_140_.getDeclaredMethod("setAccessible", (new Class[]{Boolean.TYPE}));
                    method.invoke(field, new Object[]{Boolean.TRUE});
                    Vector vector = ((Vector) field.get((aClass5246 != null ? aClass5246 : (aClass5246 = method120("client"))).getClassLoader()));
                    for (int i_141_ = 0; vector.size() > i_141_; i_141_++) {
                        try {
                            Object object = vector.elementAt(i_141_);
                            Field field_142_ = object.getClass().getDeclaredField("name");
                            method.invoke(field_142_, new Object[]{Boolean.TRUE});
                            try {
                                String string_143_ = (String) field_142_.get(object);
                                if (string_143_ != null && (string_143_.indexOf("sw3d.dll") ^ 0xffffffff) != 0) {
                                    Field field_144_ = object.getClass().getDeclaredField("handle");
                                    method.invoke(field_144_, (new Object[]{Boolean.TRUE}));
                                    string += ("|16)" + (Long.toHexString(field_144_.getLong(object))));
                                    method.invoke(field_144_, (new Object[]{Boolean.FALSE}));
                                }
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                            method.invoke(field_142_, new Object[]{Boolean.FALSE});
                        } catch (Throwable throwable) {
                            /* empty */
                        }
                    }
                }
            } catch (Throwable throwable) {
                /* empty */
            }
            string += "]";
        } catch (Throwable throwable) {
            /* empty */
        }
        return string;
    }

    static final boolean method119(RSInterface2 class354) {
        if (Class332.aBoolean3874) {
            if (((Node_Sub48) method113(class354)).anInt7424 != 0)
                return false;
            if (((RSInterface2) class354).anInt4284 == 0)
                return false;
        }
        return ((RSInterface2) class354).aBoolean4293;
    }

    /*synthetic*/
    static Class method120(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    public static void provideLoaderVersion(int version) {
        loaderVersion = version;
    }
}
