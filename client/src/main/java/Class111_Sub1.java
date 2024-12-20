/* Class111_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;

final class Class111_Sub1 extends Class111 {
    static int anInt5521;
    private Class126 aClass126_5522;
    static int anInt5523;
    static int anInt5524;
    static int anInt5525;
    private Class103 aClass103_5526;
    static BigInteger aBigInteger5527;
    static int anInt5528;
    static int anInt5529 = 0;
    static int anInt5530;
    static int anInt5531;
    static int anInt5532;
    static IncommingOpcode aIncommingOpcode_5533;
    static int anInt5534;
    private Socket aSocket5535;
    static IncommingOpcode aIncommingOpcode_5536;
    static Class303[] aClass303Array5537;

    final int method780(byte[] is, int i, int i_0_, int i_1_) throws IOException {
        if (i_0_ >= -118)
            finalize();
        anInt5524++;
        return aClass103_5526.method733(is, true, i, i_1_);
    }

    final boolean method772(int i, int i_2_) throws IOException {
        anInt5532++;
        if (i != 1)
            method779(38);
        return aClass103_5526.method734(-1, i_2_);
    }

    static final void method782(int i, int i_3_, RSInterface2 class354, int i_4_) {
        if (Class115.aBoolean4952) {
            Class210 class210 = (aa_Sub2.anInt5262 == -1 ? null : Node_Sub20.aClass240_7045.method1923(-6119, aa_Sub2.anInt5262));
            if (client.method113(class354).method2668(119) && (Class346_Sub2.anInt8264 & 0x20) != 0 && (class210 == null || ((class354.method3757(0, aa_Sub2.anInt5262, ((Class210) class210).anInt2430) ^ 0xffffffff) != (((Class210) class210).anInt2430 ^ 0xffffffff)))) {
                Node_Sub14_Sub12_Sub1.anInt10309++;
                Class131.method1211(true, (long) (((RSInterface2) class354).interfaceValues | (((RSInterface2) class354).index << -679207552)), 0L, false, ((RSInterface2) class354).interfaceValues, 25, false, ((RSInterface2) class354).id, Class292.anInt3423, Node_Sub8_Sub4.aString8364, (byte) 87, (Class287.aString3382 + " -> " + ((RSInterface2) class354).aString4210), ((RSInterface2) class354).index);
            }
        }
        anInt5525++;
        for (int i_5_ = 9; (i_5_ ^ 0xffffffff) <= -6; i_5_--) {
            String string = Class249_Sub1.method2701(class354, (byte) 94, i_5_);
            if (string != null) {
                Class131.method1211(true, (long) (((RSInterface2) class354).interfaceValues | (((RSInterface2) class354).index << 1461943904)), (long) (i_5_ - -1), false, ((RSInterface2) class354).interfaceValues, 1003, false, ((RSInterface2) class354).id, Class43.method309(i_5_, class354, (byte) -26), string, (byte) 87, ((RSInterface2) class354).aString4210, ((RSInterface2) class354).index);
                Class367.anInt4510++;
            }
        }
        String string = Node_Sub8_Sub15.method2133(-1, class354);
        if (string != null) {
            Class131.method1211(true, (long) ((((RSInterface2) class354).index << -1462072736) | ((RSInterface2) class354).interfaceValues), 0L, false, ((RSInterface2) class354).interfaceValues, 17, false, ((RSInterface2) class354).id, ((RSInterface2) class354).anInt4297, string, (byte) 87, ((RSInterface2) class354).aString4210, ((RSInterface2) class354).index);
            Class359.anInt4427++;
        }
        int i_6_ = 79 / ((8 - i) / 33);
        for (int i_7_ = 4; (i_7_ ^ 0xffffffff) <= -1; i_7_--) {
            String string_8_ = Class249_Sub1.method2701(class354, (byte) 94, i_7_);
            if (string_8_ != null) {
                Class367.anInt4510++;
                Class131.method1211(true, (long) ((((RSInterface2) class354).index << 1467043808) | ((RSInterface2) class354).interfaceValues), (long) (1 + i_7_), false, ((RSInterface2) class354).interfaceValues, 48, false, ((RSInterface2) class354).id, Class43.method309(i_7_, class354, (byte) -26), string_8_, (byte) 87, ((RSInterface2) class354).aString4210, ((RSInterface2) class354).index);
            }
        }
        if (client.method113(class354).method2672((byte) -96)) {
            Class209.anInt2413++;
            if (((RSInterface2) class354).aString4305 == null)
                Class131.method1211(true, (long) (((RSInterface2) class354).index << 837392448 | ((RSInterface2) class354).interfaceValues), 0L, false, ((RSInterface2) class354).interfaceValues, 30, false, ((RSInterface2) class354).id, -1, Class41.aClass41_475.method301(Class191.anInt4822, (byte) -108), (byte) 87, "", ((RSInterface2) class354).index);
            else
                Class131.method1211(true, (long) (((RSInterface2) class354).interfaceValues | (((RSInterface2) class354).index << 597608864)), 0L, false, ((RSInterface2) class354).interfaceValues, 30, false, ((RSInterface2) class354).id, -1, ((RSInterface2) class354).aString4305, (byte) 87, "", ((RSInterface2) class354).index);
        }
    }

    public static void method783(int i) {
        aClass303Array5537 = null;
        aIncommingOpcode_5533 = null;
        if (i == -1462072736) {
            aBigInteger5527 = null;
            aIncommingOpcode_5536 = null;
        }
    }

    final void method774(int i) {
        anInt5530++;
        try {
            aSocket5535.close();
        } catch (IOException ioexception) {
            /* empty */
        }
        aClass103_5526.method732(-100);
        aClass126_5522.method1155(true);
        if (i != -1)
            method774(25);
    }

    protected final void finalize() {
        method774(-1);
        anInt5534++;
    }

    static final void method784(int i) {
        Class54.aClass129Array722 = null;
        if (i != 1003)
            method783(-94);
        Class366.aClass129Array4494 = null;
        Node_Sub14_Sub13.aClass129Array9290 = null;
        Class282_Sub20.aClass129Array7795 = null;
        Class240.aClass129Array2676 = null;
        Class261.aClass129Array2971 = null;
        Class66.aClass129Array5028 = null;
        Canvas_Sub1.aClass48_71 = null;
        anInt5528++;
        Node_Sub14_Sub27.aClass48_9449 = null;
        Class10.aClass129Array232 = null;
        Class366.aClass129Array4497 = null;
        Class73.aClass129_943 = null;
        Class272.aClass129Array3165 = null;
        Class168.aClass48_1968 = null;
        Node_Sub35.aClass129Array7247 = null;
        Class167.aClass129Array1958 = null;
        Node_Sub14_Sub3.aClass129Array9186 = null;
        Class238_Sub3.aClass129_6773 = null;
    }

    final void method779(int i) {
        if (i != -3200)
            finalize();
        aClass103_5526.method731(-110);
        anInt5523++;
        aClass126_5522.method1150(-19694);
    }

    Class111_Sub1(Socket socket, int i) throws IOException {
        aSocket5535 = socket;
        aSocket5535.setSoTimeout(30000);
        aSocket5535.setTcpNoDelay(true);
        aClass103_5526 = new Class103(aSocket5535.getInputStream(), i);
        aClass126_5522 = new Class126(aSocket5535.getOutputStream(), i);
    }

    final void method775(int i, byte[] is, int i_9_, int i_10_) throws IOException {
        anInt5521++;
        if (i_9_ == 1232)
            aClass126_5522.method1152(8716, i_10_, i, is);
    }

    static {
        aBigInteger5527 = new BigInteger("10001", 16);
        aIncommingOpcode_5533 = new IncommingOpcode(1, 3);
        aClass303Array5537 = new Class303[16];
        aIncommingOpcode_5536 = new IncommingOpcode(99, 4);
    }
}
