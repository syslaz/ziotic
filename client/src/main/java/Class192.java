/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.util.Arrays;

final class Class192 {
    static Class278 aClass278_2204;
    static int anInt2205;
    private Class278 aClass278_2206 = new Class278(128);
    private Class381 aClass381_2207;
    static int anInt2208;
    static int anInt2209;
    static int anInt2210;
    static boolean aBoolean2211 = false;
    static int anInt2212;
    static int anInt2213;
    static int[] anIntArray2214;
    static int anInt2215;
    static float aFloat2216 = 0.0F;
    static short[] aShortArray2217;

    final void method1648(boolean bool) {
        anInt2208++;
        synchronized (aClass278_2206) {
            aClass278_2206.method2872((byte) -78);
            if (bool != true)
                aBoolean2211 = false;
        }
    }

    static final void method1649(byte i) {
        if (i == 46) {
            anInt2213++;
            if (Class287.aHa3381 != null) {
                if (Node_Sub8_Sub6.aBoolean8949)
                    Class238_Sub1.method1876(-787);
                Class352.aClass27_4187.method254(28);
                Class73.method540();
                Class131.method1215(-31736);
                Node_Sub1.method1974(5123);
                Class110.method768((byte) -125);
                Class320.method3319(-26894);
                if (Class223.aClass199_5198 != null)
                    Class223.aClass199_5198.method1678((byte) -21);
                Class301.method3187((byte) 105);
                Node_Sub14_Sub35.method2379(true);
                Class111_Sub1.method784(1003);
                Node_Sub39.method2602(-4);
                Class262.method2770(false, (byte) -128);
                for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -2049; i_0_++) {
                    Player player = (Node_Sub32.aPlayerArray7197[i_0_]);
                    if (player != null) {
                        for (int i_1_ = 0; ((i_1_ ^ 0xffffffff) > ((((Entity) player).aClass162Array10502).length ^ 0xffffffff)); i_1_++)
                            ((Entity) player).aClass162Array10502[i_1_] = null;
                    }
                }
                for (int i_2_ = 0; ((Node_Sub8_Sub16_Sub1.anInt10303 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)); i_2_++) {
                    NPC NPC = (((Node_Sub10) Node_Sub30.aClass248_Sub10Array7182[i_2_]).aNPC_6946);
                    if (NPC != null) {
                        for (int i_3_ = 0; (((((Entity) NPC).aClass162Array10502).length ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++)
                            ((Entity) NPC).aClass162Array10502[i_3_] = null;
                    }
                }
                Class272.aViewport_3166 = null;
                Node_Sub14_Sub5.aViewport_9200 = null;
                Class287.aHa3381.method819(58);
                Class287.aHa3381 = null;
            }
        }
    }

    static final boolean method1650(int i, int i_4_, int i_5_) {
        if (i != 262144)
            method1649((byte) -69);
        anInt2212++;
        if (!(Class282_Sub27.method3033(i_4_, i_5_, false) | (0x40000 & i_4_ ^ 0xffffffff) != -1) && !Class79.method572(i_5_, 55, i_4_))
            return false;
        return true;
    }

    final void method1651(int i, byte i_6_) {
        if (i_6_ < -42) {
            anInt2215++;
            synchronized (aClass278_2206) {
                aClass278_2206.method2864(i, -15782);
            }
        }
    }

    public static void method1652(boolean bool) {
        aClass278_2204 = null;
        if (bool != true)
            method1652(true);
        aShortArray2217 = null;
        anIntArray2214 = null;
    }

    final void method1653(byte i) {
        anInt2205++;
        synchronized (aClass278_2206) {
            aClass278_2206.method2869(0);
            if (i != -105)
                aBoolean2211 = true;
        }
    }

    final Class130 method1654(int i, boolean bool) {
        anInt2210++;
        Class130 class130;
        synchronized (aClass278_2206) {
            if (bool != false)
                aShortArray2217 = null;
            class130 = (Class130) aClass278_2206.method2863(4, (long) i);
        }
        if (class130 != null)
            return class130;
        byte[] is;
        synchronized (aClass381_2207) {
            is = aClass381_2207.method3922((byte) 121, 1, i);
        }
        class130 = new Class130();
        if (is != null)
            class130.method1199(new ByteStream(is), -113);
        synchronized (aClass278_2206) {
            aClass278_2206.method2867((byte) 0, (long) i, class130);
        }
        return class130;
    }

    Class192(Class215 class215, int i, Class381 class381) {
        aClass381_2207 = class381;
        aClass381_2207.method3899(1, 0);
    }

    static final boolean readPacket(boolean bool) throws IOException {
        anInt2209++;
        if (Class289.aClass111_3398 == null)
            return false;
        if (Class51.currentIncommingOpcode == null) {
            if (Class1.aBoolean110) {
                if (!Class289.aClass111_3398.method772(1, 1))
                    return false;
                Class289.aClass111_3398.method780((((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).buffer), 1, -127, 0);
                Class45.anInt569 = 0;
                Class1.aBoolean110 = false;
                Viewport.anInt2649++;
            }
            ((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset = 0;
            if (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2235(1682588262)) {
                if (!Class289.aClass111_3398.method772(1, 1))
                    return false;
                Class289.aClass111_3398.method780((((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).buffer), 1, -126, 1);
                Viewport.anInt2649++;
                Class45.anInt569 = 0;
            }
            Class1.aBoolean110 = true;
            IncommingOpcode[] incommingOpcodes = Class290.method3094(-5);
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readOpcode(-58);
            if (i < 0 || i >= incommingOpcodes.length)
                throw new IOException("invo:" + i + " ip:" + (((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).offset));
            Class51.currentIncommingOpcode = incommingOpcodes[i];
            Class30.currentPacketSize = ((IncommingOpcode) Class51.currentIncommingOpcode).size;
        }
        if ((Class30.currentPacketSize ^ 0xffffffff) == 0) {
            if (!Class289.aClass111_3398.method772(1, 1))
                return false;
            Class289.aClass111_3398.method780((((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).buffer), 1, -127, 0);
            Class45.anInt569 = 0;
            Viewport.anInt2649++;
            Class30.currentPacketSize = (((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).buffer[0]) & 0xff;
        }
        if (Class30.currentPacketSize == -2) {
            if (!Class289.aClass111_3398.method772(1, 2))
                return false;
            Class289.aClass111_3398.method780((((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).buffer), 2, -125, 0);
            ((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset = 0;
            Class30.currentPacketSize = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            Class45.anInt569 = 0;
            Viewport.anInt2649 += 2;
        }
        if ((Class30.currentPacketSize ^ 0xffffffff) < -1) {
            if (!Class289.aClass111_3398.method772(1, Class30.currentPacketSize))
                return false;
            ((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset = 0;
            Class289.aClass111_3398.method780((((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).buffer), Class30.currentPacketSize, -128, 0);
            Viewport.anInt2649 += Class30.currentPacketSize;
            Class45.anInt569 = 0;
        }
        Class226_Sub3.aIncommingOpcode_6669 = Class61.aIncommingOpcode_832;
        Class61.aIncommingOpcode_832 = Node_Sub8_Sub14_Sub1.aIncommingOpcode_10293;
        Node_Sub8_Sub14_Sub1.aIncommingOpcode_10293 = Class51.currentIncommingOpcode;

        //System.out.println("IN " + Class51.currentIncommingOpcode.getOpcode() + " [len:" + Class51.currentIncommingOpcode.size + "]");

        if (Class151.aIncommingOpcode_1793 == Class51.currentIncommingOpcode) {
            Class245.method1957(-12062);
            Class282_Sub16.method2990((byte) 77);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class293.aIncommingOpcode_3425) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-102);
            int i_7_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEInt_((byte) 0);
            Class245.method1957(-12062);
            Class320.method3320(i_7_, i, 16);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class198.aIncommingOpcode_2263) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
            byte i_8_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByteS(-124);
            Class245.method1957(-12062);
            Node_Sub40.method2613(i_8_, i, (byte) 71);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class168.aIncommingOpcode_1970 == Class51.currentIncommingOpcode) {
            Class51.currentIncommingOpcode = null;
            return false;
        }
        if (Class51.currentIncommingOpcode == Class48.aIncommingOpcode_652) {
            Node_Sub8_Sub11.anInt8989 = Class164.anInt1934;
            if ((Class30.currentPacketSize ^ 0xffffffff) == -1) {
                Node_Sub4.aString6836 = null;
                Class51.currentIncommingOpcode = null;
                Class30.aClass211Array375 = null;
                Class226_Sub2.aString6665 = null;
                Class74.anInt963 = 0;
                return true;
            }
            Class226_Sub2.aString6665 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            boolean bool_9_ = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 91) == 1);
            if (bool_9_)
                Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            long l = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLong(1237129056);
            Node_Sub4.aString6836 = Class230.method1837(l, 13754);
            Class27.aByte364 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByte(66);
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -108);
            if ((i ^ 0xffffffff) == -256) {
                Class51.currentIncommingOpcode = null;
                return true;
            }
            Class74.anInt963 = i;
            Class211[] class211s = new Class211[100];
            for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (Class74.anInt963 ^ 0xffffffff); i_10_++) {
                class211s[i_10_] = new Class211();
                ((Class211) class211s[i_10_]).aString2440 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                bool_9_ = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -102) ^ 0xffffffff) == -2;
                if (bool_9_)
                    ((Class211) class211s[i_10_]).aString2441 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                else
                    ((Class211) class211s[i_10_]).aString2441 = ((Class211) class211s[i_10_]).aString2440;
                ((Class211) class211s[i_10_]).aString2437 = Class144.method1298((((Class211) class211s[i_10_]).aString2441), true);
                ((Class211) class211s[i_10_]).anInt2447 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                ((Class211) class211s[i_10_]).aByte2444 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByte(104);
                ((Class211) class211s[i_10_]).aString2436 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                if (((Class211) class211s[i_10_]).aString2441.equals(((Player) Class347.myPlayer).aString10550))
                    Class54_Sub1.aByte5333 = ((Class211) class211s[i_10_]).aByte2444;
            }
            boolean bool_11_ = false;
            int i_12_ = Class74.anInt963;
            while ((i_12_ ^ 0xffffffff) < -1) {
                bool_11_ = true;
                i_12_--;
                for (int i_13_ = 0; i_12_ > i_13_; i_13_++) {
                    if ((((Class211) class211s[i_13_]).aString2437.compareTo(((Class211) class211s[1 + i_13_]).aString2437)) > 0) {
                        Class211 class211 = class211s[i_13_];
                        class211s[i_13_] = class211s[i_13_ + 1];
                        bool_11_ = false;
                        class211s[i_13_ - -1] = class211;
                    }
                }
                if (bool_11_)
                    break;
            }
            Class30.aClass211Array375 = class211s;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Node_Sub28.aIncommingOpcode_7165 == Class51.currentIncommingOpcode) {
            int[] is = new int[4];
            for (int i = 0; (i ^ 0xffffffff) > -5; i++)
                is[i] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-102);
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            int i_14_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
            Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i, (byte) 31));
            if (class248_sub10 != null)
                Class381.method3917((byte) 123, is, (((Node_Sub10) class248_sub10).aNPC_6946), i_14_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class111_Sub1.aIncommingOpcode_5536 == Class51.currentIncommingOpcode) { // hola
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEInt_((byte) 0);
            Class245.method1957(-12062);
            Node_Sub12 class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method501((long) i, (byte) 31));
            if (class248_sub12 != null)
                Class106.method749(false, false, true, class248_sub12);
            if (Class282_Sub17.aClass354_7773 != null) {
                Class376.method3882(Class282_Sub17.aClass354_7773, 2260);
                Class282_Sub17.aClass354_7773 = null;
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class185.aIncommingOpcode_2161) {
            ((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset += 28;
            if (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2223(0))
                Class282_Sub28.method3042(-28 + (((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).offset), (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629), 93);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Node_Sub8_Sub16_Sub1.aIncommingOpcode_10302) {
            boolean bool_15_ = ((Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -93) ^ 0xffffffff) == -2);
            byte[] is = new byte[Class30.currentPacketSize + -1];
            Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2189(is, 0, Class30.currentPacketSize - 1, 114);
            Class34.method278(bool_15_, -1, is);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class29.aIncommingOpcode_371 == Class51.currentIncommingOpcode) {
            Class282_Sub22.method3015(Class231.aClass128_2606, (byte) -42);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class346_Sub7_Sub4_Sub1.aIncommingOpcode_10087) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
            int i_16_ = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-120) << -99494622);
            int i_17_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 105);
            int i_18_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 96);
            int i_19_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) -122);
            Class245.method1957(-12062);
            Class43.method310(true, (byte) -118, i_18_, i, i_19_, i_16_, i_17_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class340.aIncommingOpcode_3962) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEShort(712071856);
            int i_20_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(!bool);
            int i_21_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEShortA((byte) 97);
            Class245.method1957(-12062);
            Class83.method595(i_20_, i_21_, i, (byte) 119);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class84_Sub9.aIncommingOpcode_5493 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_22_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 122);
            boolean bool_23_ = (0x1 & i_22_) == 1;
            while ((((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset ^ 0xffffffff) > (Class30.currentPacketSize ^ 0xffffffff)) {
                int i_24_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readSmart((byte) 22);
                int i_25_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                int i_26_ = 0;
                if ((i_25_ ^ 0xffffffff) != -1) {
                    i_26_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 121);
                    if (i_26_ == 255)
                        i_26_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
                }
                Class44.method314(bool_23_, i_24_, i_26_, (byte) -107, i, i_25_ + -1);
            }
            Class162.anIntArray1901[Class112.method794(Class225_Sub1_Sub1.anInt9984++, 31)] = i;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class282_Sub13.aIncommingOpcode_7719) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -98);
            int i_27_ = i >> 140776613;
            int i_28_ = i & 0x1f;
            if ((i_28_ ^ 0xffffffff) == -1) {
                Class225_Sub3.aClass7Array8477[i_27_] = null;
                Class51.currentIncommingOpcode = null;
                return true;
            }
            Class7 class7 = new Class7();
            ((Class7) class7).anInt169 = i_28_;
            ((Class7) class7).anInt167 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -76);
            if ((((Class7) class7).anInt167 ^ 0xffffffff) <= -1 && (((Class7) class7).anInt167 < Class366.aClass129Array4497.length)) {
                if (((Class7) class7).anInt169 == 1 || ((Class7) class7).anInt169 == 10) {
                    ((Class7) class7).anInt164 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                    ((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset += 6;
                } else if ((((Class7) class7).anInt169 ^ 0xffffffff) <= -3 && ((((Class7) class7).anInt169 ^ 0xffffffff) >= -7)) {
                    if ((((Class7) class7).anInt169 ^ 0xffffffff) == -3) {
                        ((Class7) class7).anInt159 = 256;
                        ((Class7) class7).anInt163 = 256;
                    }
                    if ((((Class7) class7).anInt169 ^ 0xffffffff) == -4) {
                        ((Class7) class7).anInt163 = 256;
                        ((Class7) class7).anInt159 = 0;
                    }
                    if ((((Class7) class7).anInt169 ^ 0xffffffff) == -5) {
                        ((Class7) class7).anInt163 = 256;
                        ((Class7) class7).anInt159 = 512;
                    }
                    if ((((Class7) class7).anInt169 ^ 0xffffffff) == -6) {
                        ((Class7) class7).anInt159 = 256;
                        ((Class7) class7).anInt163 = 0;
                    }
                    if ((((Class7) class7).anInt169 ^ 0xffffffff) == -7) {
                        ((Class7) class7).anInt159 = 256;
                        ((Class7) class7).anInt163 = 512;
                    }
                    ((Class7) class7).anInt169 = 2;
                    ((Class7) class7).anInt160 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -76);
                    ((Class7) class7).anInt159 += (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1) - Class67.baseX << 1912034761);
                    ((Class7) class7).anInt163 += (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1) - Class368.baseY << -1342679991);
                    ((Class7) class7).anInt165 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 122) << 1160366466;
                    ((Class7) class7).anInt168 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                }
                ((Class7) class7).anInt158 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                if (((Class7) class7).anInt158 == 65535)
                    ((Class7) class7).anInt158 = -1;
                Class225_Sub3.aClass7Array8477[i_27_] = class7;
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Node_Sub42_Sub3.aIncommingOpcode_9792 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEInt_((byte) 0);
            int i_29_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt1((byte) -126);
            int i_30_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
            Class245.method1957(-12062);
            Class167.sendModel(i, (byte) 100, 5, i_30_, i_29_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class199.aIncommingOpcode_2275) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt1((byte) -105);
            if ((i ^ 0xffffffff) != (Class282_Sub19.recoveryQuestionsSetDate ^ 0xffffffff)) {
                Class282_Sub19.recoveryQuestionsSetDate = i;
                Class47.method351(Class315.aClass58_3653, -1, -1);
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class133.aIncommingOpcode_5041 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -21);
            int i_31_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 120);
            int i_32_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
            int i_33_ = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-119) << -648120350);
            int i_34_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) -124);
            Class245.method1957(-12062);
            Class124.updateCamera(i, i_33_, i_34_, i_32_, i_31_, -117);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class333.aIncommingOpcode_3900 == Class51.currentIncommingOpcode) {
            Class282_Sub22.method3015(Class118.aClass128_1483, (byte) -59);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class371.aIncommingOpcode_4556 == Class51.currentIncommingOpcode) {
            Class340_Sub5.method3455(63, Class337.aBoolean3934);
            Class51.currentIncommingOpcode = null;
            return false;
        }
        if (Class253.aIncommingOpcode_2848 == Class51.currentIncommingOpcode) {
            Class122.anInt1521 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2190(20198);
            Class118.aBoolean1484 = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -61) ^ 0xffffffff) == -2;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class161.aIncommingOpcode_1894) {
            Class340_Sub5.method3455(47, false);
            Class51.currentIncommingOpcode = null;
            return false;
        }
        if (za_Sub2.aIncommingOpcode_9807 == Class51.currentIncommingOpcode) {
            Node_Sub14_Sub25.anInt9424 = 1;
            Class316.anInt3662 = Class164.anInt1934;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class346_Sub7_Sub3.aIncommingOpcode_9942 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt1((byte) -64);
            int i_35_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEInt_((byte) 0);
            Class245.method1957(-12062);
            Node_Sub12 class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method501((long) i_35_, (byte) 31));
            Node_Sub12 class248_sub12_36_ = ((Node_Sub12) Class109.aClass65_1375.method501((long) i, (byte) 31));
            if (class248_sub12_36_ != null)
                Class106.method749(false, false, (class248_sub12 == null || ((((Node_Sub12) class248_sub12).anInt6964) != ((Node_Sub12) class248_sub12_36_).anInt6964)), class248_sub12_36_);
            if (class248_sub12 != null) {
                class248_sub12.remove(true);
                Class109.aClass65_1375.method509(-1, class248_sub12, (long) i);
            }
            RSInterface2 class354 = Class276.method2853(65535, i_35_);
            if (class354 != null)
                Class376.method3882(class354, 2260);
            class354 = Class276.method2853(65535, i);
            if (class354 != null) {
                Class376.method3882(class354, 2260);
                Class60.method471(true, (byte) 100, class354);
            }
            if ((Class179.anInt2084 ^ 0xffffffff) != 0)
                Class293.method3116(1, Class179.anInt2084, (byte) 124);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class301_Sub3.aIncommingOpcode_8450 == Class51.currentIncommingOpcode) {
            Class84_Sub5.anInt5430 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 82);
            Class51.currentIncommingOpcode = null;
            Class9.anInt225 = Class164.anInt1934;
            return true;
        }
        if (Class51.currentIncommingOpcode == Applet_Sub1.aIncommingOpcode_21) {
            Class84_Sub4.method613((byte) -89);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class7.aIncommingOpcode_166 == Class51.currentIncommingOpcode) {
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            String string_37_ = (Node_Sub8_Sub14_Sub1.method2127(-23, (Class346_Sub7_Sub2_Sub4.method3628(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629, (byte) 101))));
            Class216.method1740(0, string_37_, string, (byte) -15, string, string, 6);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class102.aIncommingOpcode_1296) {
            Class279_Sub2_Sub1.method2901((Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629), Class30.currentPacketSize, (byte) 58, Node_Sub14_Sub15.aClass174_9328);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Node_Sub14_Sub38.aIncommingOpcode_9571 == Class51.currentIncommingOpcode) {
            Node_Sub22.method2537(0);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (ObjectDefinition.aIncommingOpcode_3038 == Class51.currentIncommingOpcode) {
            Class296.anInt3458 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedShort((byte) -10);
            Class9.anInt225 = Class164.anInt1934;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class269.aIncommingOpcode_3131) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_38_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt2(-1893167880);
            Class245.method1957(-12062);
            Node_Sub8_Sub16_Sub1.method2138(i, i_38_, -2);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class284.aIncommingOpcode_3346) {
            Class282_Sub22.method3015(Class44.aClass128_557, (byte) -13);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class372.aIncommingOpcode_4581) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            if ((i ^ 0xffffffff) == -65536)
                i = -1;
            int i_39_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -18);
            int i_40_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_41_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 71);
            int i_42_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            Node_Sub42_Sub1.method2630(i_42_, (byte) 46, i, i_40_, i_41_, i_39_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class89.aIncommingOpcode_1105) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            Class245.method1957(-12062);
            Class282_Sub6.method2944(i, 16504, string);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Node_Sub14_Sub31.aIncommingOpcode_9485 == Class51.currentIncommingOpcode) {
            Class116_Sub1.aByte6279 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByteC((byte) 97);
            if (Class116_Sub1.aByte6279 == 0 || (Class116_Sub1.aByte6279 ^ 0xffffffff) == -2)
                Node_Sub8_Sub17.aBoolean9055 = true;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class320.aIncommingOpcode_3694) {
            Class346_Sub7_Sub1.anInt9907 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 99);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class160.aIncommingOpcode_1885) {
            Class282_Sub22.method3015(Node_Sub8_Sub4.aClass128_8371, (byte) -13);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == ha_Sub3.aIncommingOpcode_6045) {
            byte i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByteA(-8996);
            int i_43_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            Node_Sub43.aClass291_7306.method3102(-126, i_43_, i);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class253_Sub1.aIncommingOpcode_7515) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
            int i_44_ = 0x3 & i >> -1982989700;
            int i_45_ = i >> -2102072722 & 0x3fff;
            int i_46_ = i & 0x3fff;
            int i_47_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 72);
            int i_48_ = i_47_ >> -539226142;
            int i_49_ = i_47_ & 0x3;
            int i_50_ = Class112.anIntArray5203[i_48_];
            int i_51_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-106);
            i_46_ -= Class368.baseY;
            i_45_ -= Class67.baseX;
            if (i_51_ == 65535)
                i_51_ = -1;
            Class84_Sub8.method628(-24938, i_50_, i_46_, i_51_, i_45_, i_49_, i_44_, i_48_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (bool != true)
            method1652(true);
        if (Class51.currentIncommingOpcode == Class282_Sub6.aIncommingOpcode_7650) {
            for (int i = 0; i < (Node_Sub32.aPlayerArray7197).length; i++) {
                if (Node_Sub32.aPlayerArray7197[i] != null) {
                    ((Entity) Node_Sub32.aPlayerArray7197[i]).anIntArray10414 = null;
                    ((Entity) Node_Sub32.aPlayerArray7197[i]).anInt10444 = -1;
                }
            }
            for (int i = 0; ((Node_Sub8_Sub16_Sub1.anInt10303 ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
                ((Entity) (((Node_Sub10) Node_Sub30.aClass248_Sub10Array7182[i]).aNPC_6946)).anIntArray10414 = null;
                ((Entity) (((Node_Sub10) Node_Sub30.aClass248_Sub10Array7182[i]).aNPC_6946)).anInt10444 = -1;
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class11.aIncommingOpcode_243) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -73);
            boolean bool_52_ = (0x1 & i ^ 0xffffffff) == -2;
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            String string_53_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            if (string_53_.equals(""))
                string_53_ = string;
            String string_54_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            String string_55_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            if (string_55_.equals(""))
                string_55_ = string_54_;
            if (!bool_52_) {
                Class340_Sub7.aStringArray8181[Node_Sub2_Sub3.anInt8854] = string;
                Class54_Sub2.aStringArray5334[Node_Sub2_Sub3.anInt8854] = string_53_;
                Node_Sub14_Sub9.aStringArray9242[(Node_Sub2_Sub3.anInt8854)] = string_54_;
                Class54_Sub4.aStringArray5360[Node_Sub2_Sub3.anInt8854] = string_55_;
                Class292.aBooleanArray3422[Node_Sub2_Sub3.anInt8854] = Class112.method794(2, i) == 2;
                Node_Sub2_Sub3.anInt8854++;
            } else {
                for (int i_56_ = 0; Node_Sub2_Sub3.anInt8854 > i_56_; i_56_++) {
                    if (Class54_Sub2.aStringArray5334[i_56_].equals(string_55_)) {
                        Class340_Sub7.aStringArray8181[i_56_] = string;
                        Class54_Sub2.aStringArray5334[i_56_] = string_53_;
                        Node_Sub14_Sub9.aStringArray9242[i_56_] = string_54_;
                        Class54_Sub4.aStringArray5360[i_56_] = string_55_;
                        break;
                    }
                }
            }
            Class316.anInt3662 = Class164.anInt1934;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class252.aIncommingOpcode_2842 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-103);
            if (i == 65535)
                i = -1;
            int i_57_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt2(-1893167880);
            int i_58_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            if ((i_58_ ^ 0xffffffff) == -65536)
                i_58_ = -1;
            int i_59_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            Class245.method1957(-12062);
            for (int i_60_ = i_58_; (i ^ 0xffffffff) <= (i_60_ ^ 0xffffffff); i_60_++) {
                long l = (long) i_60_ + ((long) i_57_ << 1251883488);
                Node_Sub48 class248_sub48 = ((Node_Sub48) Class318.aClass65_3682.method501(l, (byte) 31));
                Node_Sub48 class248_sub48_61_;
                if (class248_sub48 != null) {
                    class248_sub48_61_ = new Node_Sub48((((Node_Sub48) class248_sub48).anInt7424), i_59_);
                    class248_sub48.remove(true);
                } else if ((i_60_ ^ 0xffffffff) != 0)
                    class248_sub48_61_ = new Node_Sub48(0, i_59_);
                else
                    class248_sub48_61_ = new Node_Sub48((((Node_Sub48) (((RSInterface2) Class276.method2853(65535, i_57_)).aClass248_Sub48_4310)).anInt7424), i_59_);
                Class318.aClass65_3682.method509(-1, class248_sub48_61_, l);
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Node_Sub40.aIncommingOpcode_7282 == Class51.currentIncommingOpcode) {
            if (Class188.method1633((byte) -14, Class273.anInt5008))
                Class282_Sub21.anInt7817 = (int) ((float) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1) * 2.5F);
            else
                Class282_Sub21.anInt7817 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1) * 30;
            Class51.currentIncommingOpcode = null;
            Class9.anInt225 = Class164.anInt1934;
            return true;
        }
        if (Class8.aIncommingOpcode_176 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            Player player;
            if (i == Class282_Sub29.anInt7896)
                player = Class347.myPlayer;
            else
                player = Node_Sub32.aPlayerArray7197[i];
            if (player == null) {
                Class51.currentIncommingOpcode = null;
                return true;
            }
            int i_62_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_63_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 116);
            boolean bool_64_ = (i_62_ & 0x8000 ^ 0xffffffff) != -1;
            if ((((Player) player).aString10550) != null && ((Player) player).aClass332_10549 != null) {
                boolean bool_65_ = false;
                if (i_63_ <= 1) {
                    if (!bool_64_ && (Class118.aBoolean1484 && !Class17.aBoolean287 || Node_Sub8_Sub11.aBoolean8992))
                        bool_65_ = true;
                    else if (Class20.method231(124, (((Player) player).aString10550)))
                        bool_65_ = true;
                }
                if (!bool_65_ && (Node_Sub14_Sub12.anInt9268 ^ 0xffffffff) == -1) {
                    int i_66_ = -1;
                    String string;
                    if (bool_64_) {
                        i_62_ &= 0x7fff;
                        Class1 class1 = (Class282_Sub27.method3035((byte) -13, Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629));
                        i_66_ = ((Class1) class1).anInt112;
                        string = (((Class1) class1).aClass248_Sub8_Sub20_106.method2147(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629, (byte) 113));
                    } else
                        string = (Node_Sub8_Sub14_Sub1.method2127(-107, (Class346_Sub7_Sub2_Sub4.method3628(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629, (byte) 101))));
                    ((Entity) player).message = string.trim();
                    ((Entity) player).anInt10481 = 150;
                    ((Entity) player).anInt10458 = i_62_ >> 322007112;
                    ((Entity) player).anInt10462 = 0xff & i_62_;
                    int i_67_;
                    if (i_63_ == 1 || i_63_ == 2)
                        i_67_ = bool_64_ ? 17 : 1;
                    else
                        i_67_ = bool_64_ ? 17 : 2;
                    if (i_63_ == 2)
                        Node_Sub4.method2010(null, string, ((Player) player).name, 0, 85, i_67_, "<img=1>" + player.method3655((byte) -115, false), "<img=1>" + player.method3657(-116, true), i_66_);
                    else if (i_63_ != 1)
                        Node_Sub4.method2010(null, string, ((Player) player).name, 0, 65, i_67_, player.method3655((byte) 49, false), player.method3657(-116, true), i_66_);
                    else
                        Node_Sub4.method2010(null, string, ((Player) player).name, 0, 82, i_67_, "<img=0>" + player.method3655((byte) 92, false), "<img=0>" + player.method3657(-116, true), i_66_);
                }
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Applet_Sub1.aIncommingOpcode_43 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            if (i == 65535)
                i = -1;
            int i_68_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -68);
            int i_69_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_70_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 77);
            Node_Sub39_Sub2.method2609(false, i_70_, i_68_, i, 256, true, i_69_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class5.aIncommingOpcode_144) {
            Node_Sub2_Sub3.anInt8854 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -55);
            for (int i = 0; i < Node_Sub2_Sub3.anInt8854; i++) {
                Class340_Sub7.aStringArray8181[i] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                Class54_Sub2.aStringArray5334[i] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                if (Class54_Sub2.aStringArray5334[i].equals(""))
                    Class54_Sub2.aStringArray5334[i] = Class340_Sub7.aStringArray8181[i];
                Node_Sub14_Sub9.aStringArray9242[i] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                Class54_Sub4.aStringArray5360[i] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                if (Class54_Sub4.aStringArray5360[i].equals(""))
                    Class54_Sub4.aStringArray5360[i] = Node_Sub14_Sub9.aStringArray9242[i];
                Class292.aBooleanArray3422[i] = false;
            }
            Class51.currentIncommingOpcode = null;
            Class316.anInt3662 = Class164.anInt1934;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class316_Sub2_Sub1.aIncommingOpcode_9876) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(!bool);
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            Class245.method1957(-12062);
            Class242.method1931(string, i, -120);    //readstring
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class346_Sub5_Sub2.aIncommingOpcode_9887 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
            Class245.method1957(-12062);
            Class167.sendModel(-1, (byte) 100, 3, -1, i);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class316_Sub1.aIncommingOpcode_8049 == Class51.currentIncommingOpcode) {
            boolean bool_71_ = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(bool) == 1);
            Class245.method1957(-12062);
            Node_Sub13.aBoolean6971 = bool_71_;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Node_Sub24.aIncommingOpcode_7122) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
            int i_72_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt1((byte) -64);
            Class245.method1957(-12062);
            Class206.method1701(i, (byte) 20, i_72_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class225_Sub1_Sub1.aIncommingOpcode_9985 == Class51.currentIncommingOpcode) {
            Class226_Sub1_Sub1.currentZ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -60);
            Class355.currentY = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByte(39) << -633803517);
            Class346_Sub5.currentX = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByteC((byte) 102) << 1587701667;
            for (Node_Sub13 class248_sub13 = ((Node_Sub13) Class346_Sub7_Sub5.aClass65_9959.method510(bool)); class248_sub13 != null; class248_sub13 = ((Node_Sub13) Class346_Sub7_Sub5.aClass65_9959.method512(false))) {
                int i = (int) (0x3L & (((Node) class248_sub13).id >> 1301559772));
                int i_73_ = (int) (((Node) class248_sub13).id & 0x3fffL);
                int i_74_ = i_73_ - Class67.baseX;
                int i_75_ = (int) (0x3fffL & (((Node) class248_sub13).id >> 573856142));
                int i_76_ = i_75_ + -Class368.baseY;
                if ((i ^ 0xffffffff) == (Class226_Sub1_Sub1.currentZ ^ 0xffffffff) && Class346_Sub5.currentX <= i_74_ && ((8 + Class346_Sub5.currentX ^ 0xffffffff) < (i_74_ ^ 0xffffffff)) && Class355.currentY <= i_76_ && i_76_ < Class355.currentY - -8) {
                    class248_sub13.remove(true);
                    if (i_74_ >= 0 && (i_76_ ^ 0xffffffff) <= -1 && Node_Sub8_Sub4.anInt8360 > i_74_ && (i_76_ ^ 0xffffffff) > (Node_Sub22.anInt7074 ^ 0xffffffff))
                        Class172.method1557(i_74_, Class226_Sub1_Sub1.currentZ, i_76_, (byte) 28);
                }
            }
            for (Node_Sub30 class248_sub30 = ((Node_Sub30) Class225_Sub2.aClass293_8466.method3119(2)); class248_sub30 != null; class248_sub30 = (Node_Sub30) Class225_Sub2.aClass293_8466.method3107(-128)) {
                if (((Class346_Sub5.currentX ^ 0xffffffff) >= (((Node_Sub30) class248_sub30).anInt7187 ^ 0xffffffff)) && (Class346_Sub5.currentX - -8 > ((Node_Sub30) class248_sub30).anInt7187) && (Class355.currentY <= ((Node_Sub30) class248_sub30).anInt7190) && (((Node_Sub30) class248_sub30).anInt7190 ^ 0xffffffff) > (Class355.currentY - -8 ^ 0xffffffff) && (Class226_Sub1_Sub1.currentZ == ((Node_Sub30) class248_sub30).anInt7184))
                    ((Node_Sub30) class248_sub30).aBoolean7189 = true;
            }
            for (Node_Sub30 class248_sub30 = ((Node_Sub30) IOException_Sub1.aClass293_82.method3119(2)); class248_sub30 != null; class248_sub30 = ((Node_Sub30) IOException_Sub1.aClass293_82.method3107(-127))) {
                if (((((Node_Sub30) class248_sub30).anInt7187 ^ 0xffffffff) <= (Class346_Sub5.currentX ^ 0xffffffff)) && ((((Node_Sub30) class248_sub30).anInt7187 ^ 0xffffffff) > (Class346_Sub5.currentX - -8 ^ 0xffffffff)) && (((Node_Sub30) class248_sub30).anInt7190 >= Class355.currentY) && (((Node_Sub30) class248_sub30).anInt7190 < 8 + Class355.currentY) && (Class226_Sub1_Sub1.currentZ == ((Node_Sub30) class248_sub30).anInt7184))
                    ((Node_Sub30) class248_sub30).aBoolean7189 = true;
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (PacketStream.aIncommingOpcode_9114 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEInt_((byte) 0);
            int i_77_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            Node_Sub43.aClass291_7306.method3102(57, i_77_, i);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class282_Sub28.aIncommingOpcode_7893) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            Class245.method1957(-12062);
            Class282_Sub4.method2933(8718, i);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Node_Sub47.aIncommingOpcode_7403) {
            Class282_Sub22.method3015(Class301_Sub3.aClass128_8448, (byte) -53);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Node_Sub2_Sub4.aIncommingOpcode_8875) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-113);
            if (i == 65535)
                i = -1;
            int i_78_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
            Class245.method1957(-12062);
            Class167.sendModel(-1, (byte) 100, 1, i, i_78_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Node_Sub14_Sub5.aIncommingOpcode_9201) {
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            Object[] objects = new Object[string.length() + 1];
            for (int i = string.length() - 1; (i ^ 0xffffffff) <= -1; i--) {
                if (string.charAt(i) != 's')
                    objects[1 + i] = new Integer(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false));
                else
                    objects[1 + i] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            }
            objects[0] = new Integer(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false));

            System.out.println("interfacescript: " + Arrays.toString(objects) + ")");

            Class245.method1957(-12062);
            RSInterface class248_sub6 = new RSInterface();
            ((RSInterface) class248_sub6).interfaceOpcodes = objects;
            Class47.executeScript(class248_sub6);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class111_Sub1.aIncommingOpcode_5533 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_79_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 69);
            Node_Sub43.aClass291_7306.method3105(i, 104, i_79_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class189.aIncommingOpcode_5061 == Class51.currentIncommingOpcode) {
            Class282_Sub22.method3015(Node_Sub8_Sub8.aClass128_8963, (byte) -38);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class170.aIncommingOpcode_1981 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEInt_((byte) 0);
            Class245.method1957(-12062);
            Class51.currentIncommingOpcode = null;
            if (i == -1) {
                Class359.anInt4436 = -1;
                Node_Sub14_Sub21.anInt9379 = -1;
            } else {
                int i_80_ = 0x3fff & i >> -1020743826;
                int i_81_ = 0x3fff & i;
                i_80_ -= Class67.baseX;
                if (i_80_ >= 0) {
                    if ((i_80_ ^ 0xffffffff) <= (Node_Sub8_Sub4.anInt8360 ^ 0xffffffff))
                        i_80_ = Node_Sub8_Sub4.anInt8360;
                } else
                    i_80_ = 0;
                i_81_ -= Class368.baseY;
                if ((i_81_ ^ 0xffffffff) <= -1) {
                    if (Node_Sub22.anInt7074 <= i_81_)
                        i_81_ = Node_Sub22.anInt7074;
                } else
                    i_81_ = 0;
                Node_Sub14_Sub21.anInt9379 = 256 + (i_80_ << 19994121);
                Class359.anInt4436 = (i_81_ << 1493685769) + 256;
            }
            return true;
        }
        if (Class51.currentIncommingOpcode == Node_Sub14_Sub29.aIncommingOpcode_9466) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 110);
            int i_82_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
            Class245.method1957(-12062);
            Class308.method3233(i, 66, i_82_, true);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Node_Sub14_Sub3.aIncommingOpcode_9179) {
            Class346_Sub5.currentX = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByteS(-78) << 1482437859);
            Class355.currentY = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByteC((byte) 104) << 1531462915;
            Class226_Sub1_Sub1.currentZ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) 42);
            while (((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset < Class30.currentPacketSize) {
                int subopcode = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -123);
                Class128 class128 = (Class251.method2712(-121)[subopcode]);
                Class282_Sub22.method3015(class128, (byte) -65);
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == OutputStream_Sub1.aIncommingOpcode_89) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
            int i_83_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            if (i_83_ == 65535)
                i_83_ = -1;
            int i_84_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt2(-1893167880);
            Class245.method1957(-12062);
            Node_Sub8_Sub14.method2125(i, i_84_, i_83_, (byte) -74);
            Class321 class321 = Class283.aClass342_3343.method3482((byte) 68, i_83_);
            Node_Sub8_Sub4.method2045(i_84_, 21, ((Class321) class321).anInt3742, ((Class321) class321).anInt3707, ((Class321) class321).anInt3781);
            Node_Sub23.method2539(((Class321) class321).anInt3748, ((Class321) class321).anInt3711, ((Class321) class321).anInt3724, i_84_, -18978);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class282_Sub28.aIncommingOpcode_7881) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) 88);
            int i_85_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) 6);
            if (i == 255) {
                i_85_ = -1;
                i = -1;
            }
            Class81.method585(-94, i, i_85_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class226_Sub2.aIncommingOpcode_6663) {
            Class250.method2709(31114, Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629, Class30.currentPacketSize);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class346_Sub7_Sub3.aIncommingOpcode_9944) {
            while ((((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset ^ 0xffffffff) > (Class30.currentPacketSize ^ 0xffffffff)) {
                boolean bool_86_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -101) == 1;
                String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                String string_87_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                int i_88_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 71);
                String string_89_ = "";
                boolean bool_90_ = false;
                if ((i ^ 0xffffffff) < -1) {
                    string_89_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                    bool_90_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 114) == 1;
                }
                for (int i_91_ = 0; i_91_ < client.anInt5226; i_91_++) {
                    if (!bool_86_) {
                        if (string.equals(Class282_Sub11.aStringArray7703[i_91_])) {
                            if ((i ^ 0xffffffff) != (Class286.anIntArray3372[i_91_] ^ 0xffffffff)) {
                                boolean bool_92_ = true;
                                for (Class346_Sub5_Sub1 class346_sub5_sub1 = ((Class346_Sub5_Sub1) Class101.aClass360_1285.method3815((byte) 84)); class346_sub5_sub1 != null; class346_sub5_sub1 = ((Class346_Sub5_Sub1) Class101.aClass360_1285.method3809(-24951))) {
                                    if (((Class346_Sub5_Sub1) class346_sub5_sub1).aString9882.equals(string)) {
                                        if ((i ^ 0xffffffff) == -1 || (((Class346_Sub5_Sub1) class346_sub5_sub1).aShort9883 ^ 0xffffffff) != -1) {
                                            if (i == 0 && (((Class346_Sub5_Sub1) class346_sub5_sub1).aShort9883) != 0) {
                                                bool_92_ = false;
                                                class346_sub5_sub1.method3538(-120);
                                            }
                                        } else {
                                            class346_sub5_sub1.method3538(-124);
                                            bool_92_ = false;
                                        }
                                    }
                                }
                                if (bool_92_)
                                    Class101.aClass360_1285.method3811(new Class346_Sub5_Sub1(string, i), 0);
                                Class286.anIntArray3372[i_91_] = i;
                            }
                            Class132.aStringArray1618[i_91_] = string_87_;
                            Node_Sub19.aStringArray7039[i_91_] = string_89_;
                            Class346_Sub2.anIntArray8262[i_91_] = i_88_;
                            string = null;
                            Node_Sub27.aBooleanArray7150[i_91_] = bool_90_;
                            break;
                        }
                    } else if (string_87_.equals(Class282_Sub11.aStringArray7703[i_91_])) {
                        Class282_Sub11.aStringArray7703[i_91_] = string;
                        string = null;
                        Class132.aStringArray1618[i_91_] = string_87_;
                        break;
                    }
                }
                if (string != null && client.anInt5226 < 200) {
                    Class282_Sub11.aStringArray7703[client.anInt5226] = string;
                    Class132.aStringArray1618[client.anInt5226] = string_87_;
                    Class286.anIntArray3372[client.anInt5226] = i;
                    Node_Sub19.aStringArray7039[client.anInt5226] = string_89_;
                    Class346_Sub2.anIntArray8262[client.anInt5226] = i_88_;
                    Node_Sub27.aBooleanArray7150[client.anInt5226] = bool_90_;
                    client.anInt5226++;
                }
            }
            Node_Sub14_Sub25.anInt9424 = 2;
            Class316.anInt3662 = Class164.anInt1934;
            boolean bool_93_ = false;
            int i = client.anInt5226;
            while (i > 0) {
                bool_93_ = true;
                i--;
                for (int i_94_ = 0; i > i_94_; i_94_++) {
                    if (((((((WorldAddress) Class346_Sub7_Sub2_Sub4.aWorldAddress_10119).worldId) ^ 0xffffffff) != (Class286.anIntArray3372[i_94_] ^ 0xffffffff)) && ((((WorldAddress) (Class346_Sub7_Sub2_Sub4.aWorldAddress_10119)).worldId ^ 0xffffffff) == (Class286.anIntArray3372[1 + i_94_] ^ 0xffffffff))) || (Class286.anIntArray3372[i_94_] == 0 && Class286.anIntArray3372[i_94_ + 1] != 0)) {
                        int i_95_ = Class286.anIntArray3372[i_94_];
                        Class286.anIntArray3372[i_94_] = Class286.anIntArray3372[i_94_ + 1];
                        Class286.anIntArray3372[1 + i_94_] = i_95_;
                        String string = Node_Sub19.aStringArray7039[i_94_];
                        Node_Sub19.aStringArray7039[i_94_] = Node_Sub19.aStringArray7039[i_94_ - -1];
                        Node_Sub19.aStringArray7039[i_94_ + 1] = string;
                        String string_96_ = Class282_Sub11.aStringArray7703[i_94_];
                        Class282_Sub11.aStringArray7703[i_94_] = Class282_Sub11.aStringArray7703[i_94_ - -1];
                        Class282_Sub11.aStringArray7703[i_94_ + 1] = string_96_;
                        String string_97_ = Class132.aStringArray1618[i_94_];
                        Class132.aStringArray1618[i_94_] = Class132.aStringArray1618[i_94_ - -1];
                        Class132.aStringArray1618[1 + i_94_] = string_97_;
                        int i_98_ = Class346_Sub2.anIntArray8262[i_94_];
                        Class346_Sub2.anIntArray8262[i_94_] = Class346_Sub2.anIntArray8262[1 + i_94_];
                        Class346_Sub2.anIntArray8262[i_94_ - -1] = i_98_;
                        boolean bool_99_ = Node_Sub27.aBooleanArray7150[i_94_];
                        Node_Sub27.aBooleanArray7150[i_94_] = Node_Sub27.aBooleanArray7150[i_94_ - -1];
                        bool_93_ = false;
                        Node_Sub27.aBooleanArray7150[1 + i_94_] = bool_99_;
                    }
                }
                if (bool_93_)
                    break;
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Node_Sub47.aIncommingOpcode_7415) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEInt_((byte) 0);
            int i_100_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEShortA((byte) 97);
            Class245.method1957(-12062);
            Class346_Sub7_Sub4_Sub1.method3681((byte) 91, i_100_, i);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Node_Sub2.aIncommingOpcode_6822) {
            Class282_Sub22.method3015(Class129_Sub2.aClass128_8519, (byte) -112);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class124.aIncommingOpcode_1534) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt1((byte) -112);
            int i_101_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            Class245.method1957(-12062);
            Class311.method3268(i, (byte) -111, i_101_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Node_Sub8_Sub19.aIncommingOpcode_9084 == Class51.currentIncommingOpcode) {
            Class245.method1957(-12062);
            Class340_Sub6.method3464(-1);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Node_Sub14_Sub8.aIncommingOpcode_9227) {
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            String string_102_ = (Class44_Sub1.aClass152_5288.method1356(true, i).method2147(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629, (byte) 106));
            Node_Sub4.method2010(null, string_102_, string, 0, 108, 19, string, string, i);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class22.aIncommingOpcode_318 == Class51.currentIncommingOpcode) {
            Class346_Sub5.currentX = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByte(43) << -1716789181);
            Class226_Sub1_Sub1.currentZ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) -121);
            Class355.currentY = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByte(99) << -914388317);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class175.aIncommingOpcode_2056 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-106);
            int i_103_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            Class245.method1957(-12062);
            Class282_Sub25.method3022(i, i_103_, false, 0);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class139.aIncommingOpcode_1657) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) -119);
            Class245.method1957(-12062);
            Class37.anInt410 = i;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class340_Sub9.aIncommingOpcode_8213) {
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            boolean bool_104_ = ((Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -24) ^ 0xffffffff) == -2);
            String string_105_;
            if (bool_104_)
                string_105_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            else
                string_105_ = string;
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            byte i_106_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByte(83);
            boolean bool_107_ = false;
            if ((i_106_ ^ 0xffffffff) == 127)
                bool_107_ = true;
            if (!bool_107_) {
                String string_108_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                Class211 class211 = new Class211();
                ((Class211) class211).aString2440 = string;
                ((Class211) class211).aString2441 = string_105_;
                ((Class211) class211).aString2437 = Class144.method1298(((Class211) class211).aString2441, true);
                ((Class211) class211).aString2436 = string_108_;
                ((Class211) class211).anInt2447 = i;
                ((Class211) class211).aByte2444 = i_106_;
                int i_109_;
                for (i_109_ = -1 + Class74.anInt963; (i_109_ ^ 0xffffffff) <= -1; i_109_--) {
                    int i_110_ = ((Class211) Class30.aClass211Array375[i_109_]).aString2437.compareTo(((Class211) class211).aString2437);
                    if ((i_110_ ^ 0xffffffff) == -1) {
                        ((Class211) Class30.aClass211Array375[i_109_]).anInt2447 = i;
                        ((Class211) Class30.aClass211Array375[i_109_]).aByte2444 = i_106_;
                        ((Class211) Class30.aClass211Array375[i_109_]).aString2436 = string_108_;
                        if (string_105_.equals(((Player) Class347.myPlayer).aString10550))
                            Class54_Sub1.aByte5333 = i_106_;
                        Class51.currentIncommingOpcode = null;
                        Node_Sub8_Sub11.anInt8989 = Class164.anInt1934;
                        return true;
                    }
                    if (i_110_ < 0)
                        break;
                }
                if (Class74.anInt963 >= Class30.aClass211Array375.length) {
                    Class51.currentIncommingOpcode = null;
                    return true;
                }
                for (int i_111_ = Class74.anInt963 + -1; (i_111_ ^ 0xffffffff) < (i_109_ ^ 0xffffffff); i_111_--)
                    Class30.aClass211Array375[i_111_ + 1] = Class30.aClass211Array375[i_111_];
                if (Class74.anInt963 == 0)
                    Class30.aClass211Array375 = new Class211[100];
                Class30.aClass211Array375[i_109_ - -1] = class211;
                Class74.anInt963++;
                if (string_105_.equals(((Player) (Class347.myPlayer)).aString10550))
                    Class54_Sub1.aByte5333 = i_106_;
            } else {
                if ((Class74.anInt963 ^ 0xffffffff) == -1) {
                    Class51.currentIncommingOpcode = null;
                    return true;
                }
                boolean bool_112_ = false;
                int i_113_;
                for (i_113_ = 0; (i_113_ ^ 0xffffffff) > (Class74.anInt963 ^ 0xffffffff); i_113_++) {
                    if (((Class211) Class30.aClass211Array375[i_113_]).aString2441.equals(string_105_) && ((((Class211) Class30.aClass211Array375[i_113_]).anInt2447) ^ 0xffffffff) == (i ^ 0xffffffff))
                        break;
                }
                if (Class74.anInt963 > i_113_) {
                    for (/**/; ((-1 + Class74.anInt963 ^ 0xffffffff) < (i_113_ ^ 0xffffffff)); i_113_++)
                        Class30.aClass211Array375[i_113_] = Class30.aClass211Array375[1 + i_113_];
                    Class74.anInt963--;
                    Class30.aClass211Array375[Class74.anInt963] = null;
                }
            }
            Node_Sub8_Sub11.anInt8989 = Class164.anInt1934;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class260.aIncommingOpcode_2963 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            if (i == 65535)
                i = -1;
            int i_114_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEInt_((byte) 0);
            Class245.method1957(-12062);
            Class167.sendModel(-1, (byte) 100, 2, i, i_114_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class218.aIncommingOpcode_2499) {
            Node_Sub14_Sub28.aString9457 = (Class30.currentPacketSize > 2 ? Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598) : Class41.aClass41_492.method301(Class191.anInt4822, (byte) -108));
            Class64.anInt865 = ((Class30.currentPacketSize ^ 0xffffffff) < -1 ? Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1) : -1);
            Class51.currentIncommingOpcode = null;
            if ((Class64.anInt865 ^ 0xffffffff) == -65536)
                Class64.anInt865 = -1;
            return true;
        }
        if (Class102.aIncommingOpcode_1306 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
            int i_115_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
            int i_116_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-112);
            Class245.method1957(-12062);
            Class282_Sub21.method3006((byte) 91, i, i_115_ + (i_116_ << 596098768));
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class282_Sub3.aIncommingOpcode_7616) {
            int id = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
            int pos = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEInt_((byte) 0);
            int walkable = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 84);

//sendInterface(Player player, int id, int window, int location, boolean walkable)

            System.out.println("sendInterface(player, " + id + ", " + (pos >> 16) + ", " + (pos & 0xffff) + ", " + (walkable == 1) + ");");

            Class245.method1957(-12062);
            Node_Sub12 class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method501((long) pos, (byte) 31));
            if (class248_sub12 != null)
                Class106.method749(!bool, false, (((Node_Sub12) class248_sub12).anInt6964 != id), class248_sub12);
            Node_Sub8.method2022(walkable, id, pos, (byte) -55, false);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Node_Sub14_Sub20.aIncommingOpcode_9365 == Class51.currentIncommingOpcode) {
            Node_Sub8_Sub4.anInt8377 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) 1);
            Class40.anInt450 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class334.aIncommingOpcode_3902 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -49);
            int i_119_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
            int i_120_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-113);
            int i_121_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_122_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            int localCoords = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
            int localY = 0x7 & localCoords;
            int localX = (localCoords & 0x7a) >> 3;
            if (localX == 15)
                localX = -1;
            if (i_119_ >> 30 == 0) {
                if (i_119_ >> 29 == 0) {
                    if (i_119_ >> 28 != 0) {
                        int i_126_ = i_119_ & 0xffff;
                        Player player;
                        if (Class282_Sub29.anInt7896 == i_126_)
                            player = Class347.myPlayer;
                        else
                            player = (Node_Sub32.aPlayerArray7197[i_126_]);
                        if (player != null) {
                            Class305 class305 = (((Entity) player).aClass305Array10441[i]);
                            if (i_120_ == 65535)
                                i_120_ = -1;
                            boolean bool_127_ = true;
                            int i_128_ = ((Class305) class305).anInt3537;
                            if (i_120_ != -1 && i_128_ != -1) {
                                if (i_128_ == i_120_) {
                                    Class51 class51 = Class279_Sub2.aClass151_7577.method1353(i_120_, -1);
                                    if (((Class51) class51).aBoolean682 && (((Class51) class51).anInt690 != -1)) {
                                        Class182 class182 = (Class235.aClass356_2617.method3790((byte) -90, ((Class51) class51).anInt690));
                                        int i_129_ = ((Class182) class182).anInt2102;
                                        if (i_129_ != 0 && i_129_ != 2) {
                                            if (i_129_ == -1)
                                                bool_127_ = true;
                                        } else
                                            bool_127_ = false;
                                    }
                                } else {
                                    Class51 class51 = Class279_Sub2.aClass151_7577.method1353(i_120_, -1);
                                    Class51 class51_130_ = Class279_Sub2.aClass151_7577.method1353(i_128_, -1);
                                    if (((Class51) class51).anInt690 != -1 && ((Class51) class51_130_).anInt690 != -1) {
                                        Class182 class182 = (Class235.aClass356_2617.method3790((byte) -90, ((Class51) class51).anInt690));
                                        Class182 class182_131_ = (Class235.aClass356_2617.method3790((byte) -90, (((Class51) class51_130_).anInt690)));
                                        if (((Class182) class182_131_).anInt2101 > ((Class182) class182).anInt2101)
                                            bool_127_ = false;
                                    }
                                }
                            }
                            if (bool_127_) {
                                ((Class305) class305).anInt3537 = i_120_;
                                ((Class305) class305).anInt3538 = i_122_ + Node_Sub18.anInt7027;
                                ((Class305) class305).anInt3539 = i_121_;
                                ((Class305) class305).anInt3544 = localX;
                                ((Class305) class305).anInt3540 = localY;
                                ((Class305) class305).anInt3542 = 0;
                                ((Class305) class305).anInt3536 = 1;
                                ((Class305) class305).anInt3541 = 0;
                                if (Node_Sub18.anInt7027 < ((Class305) class305).anInt3538)
                                    ((Class305) class305).anInt3542 = -1;
                                if (((Class305) class305).anInt3537 == 65535)
                                    ((Class305) class305).anInt3537 = -1;
                                if (((Class305) class305).anInt3537 != -1 && (((Class305) class305).anInt3538 == Node_Sub18.anInt7027)) {
                                    int i_132_ = (((Class51) (Class279_Sub2.aClass151_7577.method1353(((Class305) class305).anInt3537, -1))).anInt690);
                                    if (i_132_ != -1) {
                                        Class182 class182 = (Class235.aClass356_2617.method3790((byte) -90, i_132_));
                                        if (class182 != null && (((Class182) class182).anIntArray2117) != null && !(((Entity) player).aBoolean10439))
                                            Class158.method1396(class182, 0, player, true);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int i_133_ = 0xffff & i_119_;
                    Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_133_, (byte) 31));
                    if (class248_sub10 != null) {
                        NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                        if (i_120_ == 65535)
                            i_120_ = -1;
                        Class305 class305 = (((Entity) NPC).aClass305Array10441[i]);
                        boolean bool_134_ = true;
                        int i_135_ = ((Class305) class305).anInt3537;
                        if (i_120_ != -1 && i_135_ != -1) {
                            if (i_135_ == i_120_) {
                                Class51 class51 = Class279_Sub2.aClass151_7577.method1353(i_120_, -1);
                                if (((Class51) class51).aBoolean682 && ((Class51) class51).anInt690 != -1) {
                                    Class182 class182 = (Class235.aClass356_2617.method3790((byte) -90, ((Class51) class51).anInt690));
                                    int i_136_ = ((Class182) class182).anInt2102;
                                    if (i_136_ != 0 && i_136_ != 2) {
                                        if (i_136_ == 1)
                                            bool_134_ = true;
                                    } else
                                        bool_134_ = false;
                                }
                            } else {
                                Class51 class51 = Class279_Sub2.aClass151_7577.method1353(i_120_, -1);
                                Class51 class51_137_ = Class279_Sub2.aClass151_7577.method1353(i_135_, -1);
                                if ((((Class51) class51).anInt690 ^ 0xffffffff) != 0 && (((Class51) class51_137_).anInt690 != -1)) {
                                    Class182 class182 = (Class235.aClass356_2617.method3790((byte) -90, ((Class51) class51).anInt690));
                                    Class182 class182_138_ = (Class235.aClass356_2617.method3790((byte) -90, (((Class51) class51_137_).anInt690)));
                                    if (((Class182) class182_138_).anInt2101 > ((Class182) class182).anInt2101)
                                        bool_134_ = false;
                                }
                            }
                        }
                        if (bool_134_) {
                            ((Class305) class305).anInt3542 = 0;
                            ((Class305) class305).anInt3541 = 0;
                            ((Class305) class305).anInt3537 = i_120_;
                            ((Class305) class305).anInt3539 = i_121_;
                            ((Class305) class305).anInt3536 = 1;
                            ((Class305) class305).anInt3538 = Node_Sub18.anInt7027 + i_122_;
                            ((Class305) class305).anInt3544 = localX;
                            ((Class305) class305).anInt3540 = localY;
                            if (((Class305) class305).anInt3538 > Node_Sub18.anInt7027)
                                ((Class305) class305).anInt3542 = -1;
                            if (((Class305) class305).anInt3537 == 65535)
                                ((Class305) class305).anInt3537 = -1;
                            if (((Class305) class305).anInt3537 != -1 && (((Class305) class305).anInt3538 == Node_Sub18.anInt7027)) {
                                int i_139_ = ((Class51) (Class279_Sub2.aClass151_7577.method1353(((Class305) class305).anInt3537, -1))).anInt690;
                                if (i_139_ != -1) {
                                    Class182 class182 = Class235.aClass356_2617.method3790((byte) -90, i_139_);
                                    if (class182 != null && (((Class182) class182).anIntArray2117) != null && !(((Entity) NPC).aBoolean10439))
                                        Class158.method1396(class182, 0, NPC, true);
                                }
                            }
                        }
                    }
                }
            } else {
                int i_140_ = (0x3c2d2ce3 & i_119_) >> 28;
                int i_141_ = -Class67.baseX + (0x3fff & i_119_ >> 14);
                int i_142_ = -Class368.baseY + (i_119_ & 0x3fff);
                if (i_141_ >= 0 && i_142_ >= 0 && i_141_ < Node_Sub8_Sub4.anInt8360 && (Node_Sub22.anInt7074 > i_142_)) {
                    int i_143_ = 512 * i_141_ + 256;
                    int i_144_ = i_142_ * 512 + 256;
                    int i_145_ = i_140_;
                    if (i_145_ < 3 && Class209.method1717(-10387, i_141_, i_142_))
                        i_145_++;
                    Class346_Sub7_Sub2_Sub3 class346_sub7_sub2_sub3 = (new Class346_Sub7_Sub2_Sub3(i_120_, i_122_, Node_Sub18.anInt7027, i_140_, i_145_, i_143_, (Class353.method3753(i_144_, i_143_, 27, i_140_) - i_121_), i_144_, i_141_, i_141_, i_142_, i_142_, localY));
                    Class198.aClass293_2259.method3109(new Node_Sub8_Sub8(class346_sub7_sub2_sub3), -95);
                }
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class269.aIncommingOpcode_3130 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
            int i_146_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            boolean bool_147_ = (0x1 & i ^ 0xffffffff) == -2;  //iconfig
            Class125.method1146(i_146_, bool_147_, 0);
            Class162.anIntArray1901[Class112.method794(31, Class225_Sub1_Sub1.anInt9984++)] = i_146_;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class185_Sub1.aIncommingOpcode_6651 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt1((byte) -93);
            int i_148_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            Class245.method1957(-12062);
            Node_Sub14_Sub1.method2279(false, i_148_, i);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class340_Sub10.aIncommingOpcode_8227 == Class51.currentIncommingOpcode) {
            Class342.aClass200_4010 = Class279_Sub2_Sub1.method2899(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -97), (byte) -59);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class59.aIncommingOpcode_803 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_149_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_150_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            Class245.method1957(-12062);
            if (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i] != null) {
                for (int i_151_ = i_149_; i_151_ < i_150_; i_151_++) {
                    int i_152_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2221(255);
                    if ((i_151_ ^ 0xffffffff) > ((Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i]).length ^ 0xffffffff) && (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i][i_151_]) != null)
                        ((RSInterface2) (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i][i_151_])).anInt4255 = i_152_;
                }
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class346_Sub4.aIncommingOpcode_8274 == Class51.currentIncommingOpcode) {
            boolean bool_153_ = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 125) == 1);
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            String string_154_ = string;
            if (bool_153_)
                string_154_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            long l = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLong(1237129056);
            long l_155_ = (long) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            long l_156_ = (long) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2221(255);
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 84);
            long l_157_ = l_156_ + (l_155_ << 329235040);
            boolean bool_158_ = false;
            while_133_:
            do {
                for (int i_159_ = 0; (i_159_ ^ 0xffffffff) > -101; i_159_++) {
                    if (l_157_ == Class9.aLongArray223[i_159_]) {
                        bool_158_ = true;
                        break while_133_;
                    }
                }
                if (i <= 1) {
                    if (Class118.aBoolean1484 && !Class17.aBoolean287 || Node_Sub8_Sub11.aBoolean8992)
                        bool_158_ = true;
                    else if (Class20.method231(124, string_154_))
                        bool_158_ = true;
                }
            } while (false);
            if (!bool_158_ && (Node_Sub14_Sub12.anInt9268 ^ 0xffffffff) == -1) {
                Class9.aLongArray223[Class230.anInt2604] = l_157_;
                Class230.anInt2604 = (Class230.anInt2604 - -1) % 100;
                String string_160_ = (Node_Sub8_Sub14_Sub1.method2127(-84, (Class346_Sub7_Sub2_Sub4.method3628(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629, (byte) 101))));
                if ((i ^ 0xffffffff) != -3 && i != 3) {
                    if (i == 1)
                        Node_Sub4.method2010(Class34.method279((byte) -104, l), string_160_, string, 0, 125, 9, "<img=0>" + string_154_, "<img=0>" + string, -1);
                    else
                        Node_Sub4.method2010(Class34.method279((byte) -104, l), string_160_, string, 0, 82, 9, string_154_, string, -1);
                } else
                    Node_Sub4.method2010(Class34.method279((byte) -104, l), string_160_, string, 0, 113, 9, "<img=1>" + string_154_, "<img=1>" + string, -1);
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class84_Sub4.aIncommingOpcode_5405 == Class51.currentIncommingOpcode) {
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            Class245.method1957(-12062);
            Class282_Sub6.method2944(i, 16504, string);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class358.aIncommingOpcode_4421 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            if ((i ^ 0xffffffff) == -65536)
                i = -1;
            int index = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 80);
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            int onTop = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -76);
            if (index >= 1 && index <= 8) {
                if (string.equalsIgnoreCase("null"))
                    string = null;
                Node_Sub14_Sub14.aStringArray9304[index - 1] = string;
                Class346_Sub7_Sub3.anIntArray9943[index - 1] = i;
                Node_Sub8.aBooleanArray6868[-1 + index] = (onTop ^ 0xffffffff) == -1;
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class251.aIncommingOpcode_2836) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_163_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 84);
            boolean bool_164_ = (i_163_ & 0x1 ^ 0xffffffff) == -2;
            Class147_Sub1.method1318(i, bool_164_, !bool);
            int i_165_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            for (int i_166_ = 0; i_166_ < i_165_; i_166_++) {
                int amount = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(bool);
                if ((amount ^ 0xffffffff) == -256)
                    amount = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
                int id = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-115);
                Class44.method314(bool_164_, i_166_, amount, (byte) -107, i, id - 1);
            }
            Class162.anIntArray1901[Class112.method794(Class225_Sub1_Sub1.anInt9984++, 31)] = i;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class205.aIncommingOpcode_2386) {
            boolean bool_169_ = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 69) == 1);
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            String string_170_ = string;
            if (bool_169_)
                string_170_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            long l = (long) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            long l_171_ = (long) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2221(255);
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -105);
            int i_172_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            long l_173_ = (l << 536343648) + l_171_;
            boolean bool_174_ = false;
            while_134_:
            do {
                for (int i_175_ = 0; (i_175_ ^ 0xffffffff) > -101; i_175_++) {
                    if (l_173_ == Class9.aLongArray223[i_175_]) {
                        bool_174_ = true;
                        break while_134_;
                    }
                }
                if (i <= 1 && Class20.method231(-77, string_170_))
                    bool_174_ = true;
            } while (false);
            if (!bool_174_ && Node_Sub14_Sub12.anInt9268 == 0) {
                Class9.aLongArray223[Class230.anInt2604] = l_173_;
                Class230.anInt2604 = (1 + Class230.anInt2604) % 100;
                String string_176_ = (Class44_Sub1.aClass152_5288.method1356(bool, i_172_).method2147(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629, (byte) 118));
                if (i != 2) {
                    if ((i ^ 0xffffffff) == -2)
                        Node_Sub4.method2010(null, string_176_, string, 0, 102, 18, "<img=0>" + string_170_, "<img=0>" + string, i_172_);
                    else
                        Node_Sub4.method2010(null, string_176_, string, 0, 78, 18, string_170_, string, i_172_);
                } else
                    Node_Sub4.method2010(null, string_176_, string, 0, 99, 18, "<img=1>" + string_170_, "<img=1>" + string, i_172_);
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class125.aIncommingOpcode_1545 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readSmart((byte) 22);
            int i_177_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
            int i_178_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -84);
            String string = "";
            String string_179_ = string;
            if ((i_178_ & 0x1 ^ 0xffffffff) != -1) {
                string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
                if ((0x2 & i_178_ ^ 0xffffffff) == -1)
                    string_179_ = string;
                else
                    string_179_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            }
            String string_180_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            if (i != 99) {
                if (!string_179_.equals("") && Class20.method231(-116, string_179_)) {
                    Class51.currentIncommingOpcode = null;
                    return true;
                }
                Class216.method1740(i_177_, string_180_, string, (byte) -15, string, string_179_, i);
            } else
                Class106.method750(string_180_, (byte) 76);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class225_Sub1_Sub1.aIncommingOpcode_9978 == Class51.currentIncommingOpcode) {
            Class282_Sub22.method3015(Interactable.aClass128_8323, (byte) -40);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class357.aIncommingOpcode_4411) {
            Class282_Sub22.method3015(Class261.aClass128_2969, (byte) -69);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class351.aIncommingOpcode_4734) {
            Class282_Sub22.method3015(Class323.aClass128_3796, (byte) -111);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class54_Sub4.aIncommingOpcode_5366) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) -114);
            int i_181_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) 89);
            int i_182_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
            int i_183_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
            int i_184_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-114);
            Class245.method1957(-12062);
            Class160.aBooleanArray1890[i_183_] = true;
            Node_Sub8_Sub11.anIntArray9000[i_183_] = i_182_;
            Class19.anIntArray301[i_183_] = i_181_;
            Class346_Sub7_Sub4_Sub2.anIntArray10187[i_183_] = i;
            Class23.anIntArray322[i_183_] = i_184_;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class129_Sub1.aIncommingOpcode_8497 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-101);
            byte i_185_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByteC((byte) 104);
            Class245.method1957(-12062);
            Class311.method3268(i_185_, (byte) -74, i);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class282_Sub17.aIncommingOpcode_7768) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
            int i_186_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(bool);
            int i_187_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_188_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt2(-1893167880);
            Class245.method1957(-12062);
            Class167.sendModel(i, (byte) 100, 7, i_186_ | i_187_ << -447992912, i_188_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class340_Sub5.aIncommingOpcode_8139 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
            int i_189_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(bool);
            Class245.method1957(-12062);
            if ((i_189_ ^ 0xffffffff) == -3)
                Node_Sub8_Sub7.method2069(-15074);
            Class179.anInt2084 = i;
            ObjectDefinition.method2795(i, (byte) 111);
            Node_Sub14_Sub38.method2392(false, -118);
            Class47.method344(Class179.anInt2084);
            for (int i_190_ = 0; i_190_ < 100; i_190_++)
                Class359.aBooleanArray4435[i_190_] = true;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class66.aIncommingOpcode_5022) {
            if (Node_Sub48.aFrame7432 != null)
                Class138.method1274(false, ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub1_7346.method2925(bool), -1, -1, -1);
            byte[] is = new byte[Class30.currentPacketSize];
            Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2232(Class30.currentPacketSize, is, (byte) 113, 0);
            String string = Class112_Sub1.method799(0, Class30.currentPacketSize, is, -87);
            Class99.method710(string, 0, (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) ^ 0xffffffff) == -2, Node_Sub14_Sub15.aClass174_9328, true);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Node_Sub28.aIncommingOpcode_7162) {
            Class282_Sub22.method3015(Class142.aClass128_1671, (byte) -29);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class169.aIncommingOpcode_1979 == Class51.currentIncommingOpcode) {
            boolean bool_191_ = ((Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 70) ^ 0xffffffff) == -2);
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            String string_192_ = string;
            if (bool_191_)
                string_192_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            long l = (long) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            long l_193_ = (long) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2221(255);
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -65);
            long l_194_ = (l << 656340832) - -l_193_;
            boolean bool_195_ = false;
            while_135_:
            do {
                for (int i_196_ = 0; i_196_ < 100; i_196_++) {
                    if (Class9.aLongArray223[i_196_] == l_194_) {
                        bool_195_ = true;
                        break while_135_;
                    }
                }
                if (i <= 1) {
                    if (Class118.aBoolean1484 && !Class17.aBoolean287 || Node_Sub8_Sub11.aBoolean8992)
                        bool_195_ = true;
                    else if (Class20.method231(-91, string_192_))
                        bool_195_ = true;
                }
            } while (false);
            if (!bool_195_ && Node_Sub14_Sub12.anInt9268 == 0) {
                Class9.aLongArray223[Class230.anInt2604] = l_194_;
                Class230.anInt2604 = (Class230.anInt2604 - -1) % 100;
                String string_197_ = (Node_Sub8_Sub14_Sub1.method2127(-118, (Class346_Sub7_Sub2_Sub4.method3628(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629, (byte) 101))));
                if ((i ^ 0xffffffff) == -3)
                    Node_Sub4.method2010(null, string_197_, string, 0, 63, 7, "<img=1>" + string_192_, "<img=1>" + string, -1);
                else if (i == 1)
                    Node_Sub4.method2010(null, string_197_, string, 0, 100, 7, "<img=0>" + string_192_, "<img=0>" + string, -1);
                else
                    Node_Sub4.method2010(null, string_197_, string, 0, 62, 3, string_192_, string, -1);
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class129_Sub1.aIncommingOpcode_8515) {
            boolean bool_198_ = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 120) == 1);
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            String string_199_ = string;
            if (bool_198_)
                string_199_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            long l = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLong(1237129056);
            long l_200_ = (long) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            long l_201_ = (long) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2221(255);
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -59);
            int i_202_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            long l_203_ = (l_200_ << 958687328) + l_201_;
            boolean bool_204_ = false;
            while_136_:
            do {
                for (int i_205_ = 0; (i_205_ ^ 0xffffffff) > -101; i_205_++) {
                    if (l_203_ == Class9.aLongArray223[i_205_]) {
                        bool_204_ = true;
                        break while_136_;
                    }
                }
                if (i <= 1 && Class20.method231(-80, string_199_))
                    bool_204_ = true;
            } while (false);
            if (!bool_204_ && Node_Sub14_Sub12.anInt9268 == 0) {
                Class9.aLongArray223[Class230.anInt2604] = l_203_;
                Class230.anInt2604 = (Class230.anInt2604 + 1) % 100;
                String string_206_ = (Class44_Sub1.aClass152_5288.method1356(true, i_202_).method2147(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629, (byte) 107));
                if (i != 2) {
                    if (i != 1)
                        Node_Sub4.method2010(Class34.method279((byte) -104, l), string_206_, string, 0, 105, 20, string_199_, string, i_202_);
                    else
                        Node_Sub4.method2010(Class34.method279((byte) -104, l), string_206_, string, 0, 93, 20, "<img=0>" + string_199_, "<img=0>" + string, i_202_);
                } else
                    Node_Sub4.method2010(Class34.method279((byte) -104, l), string_206_, string, 0, 106, 20, "<img=1>" + string_199_, "<img=1>" + string, i_202_);
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class82.aIncommingOpcode_1024 == Class51.currentIncommingOpcode) {
            Class282.readMapRegionUpdate(1830088036);
            Class51.currentIncommingOpcode = null;
            return false;
        }
        if (Class51.currentIncommingOpcode == Class367.aIncommingOpcode_4506) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
            za_Sub1.aClass322_9801 = Node_Sub14_Sub15.aClass174_9328.method1564(i, (byte) -23);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class282_Sub25.aIncommingOpcode_7848) {
            Node_Sub43.aClass291_7306.method3098(-12777);
            Class51.currentIncommingOpcode = null;
            Class115.anInt4949 += 32;
            return true;
        }
        if (Class51.currentIncommingOpcode == Interactable.aIncommingOpcode_8321) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
            int i_207_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            if ((i_207_ ^ 0xffffffff) == -65536)
                i_207_ = -1;
            int i_208_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
            Class269.method2807(i_207_, i_208_, -95, i);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (OutgoingOpcode.aIncommingOpcode_1918 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2157((byte) -23);
            int i_209_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 97);
            int i_210_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            if ((i_210_ ^ 0xffffffff) == -65536)
                i_210_ = -1;
            Node_Sub27.method2555(64, i_210_, i_209_, i);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class84_Sub6.aIncommingOpcode_5447 == Class51.currentIncommingOpcode) {
            Class282_Sub22.method3015(Class84_Sub9.aClass128_5503, (byte) -70);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class309.aIncommingOpcode_3578) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            int i_211_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            int i_212_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
            int i_213_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-126);
            Class245.method1957(-12062);
            Node_Sub8_Sub4.method2045(i_212_, 52, i_211_, i, i_213_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == OutgoingOpcode.aIncommingOpcode_1916) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -28);
            if ((Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 81) ^ 0xffffffff) == -1)
                Class275_Sub2.aClass187Array8602[i] = new Class187();
            else {
                ((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset--;
                Class275_Sub2.aClass187Array8602[i] = new Class187(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629);
            }
            Class376.anInt4942 = Class164.anInt1934;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class264.aIncommingOpcode_2986) {
            Class380.method3894(-1, Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598));
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class39.aIncommingOpcode_431 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            Class245.method1957(-12062);
            Class2.method170(false, i);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Node_Sub14_Sub8.aIncommingOpcode_9225) {
            boolean bool_214_ = ((Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -90) ^ 0xffffffff) == -2);
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            String string_215_ = string;
            if (bool_214_)
                string_215_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -62);
            boolean bool_216_ = false;
            if (i <= 1) {
                if (Class118.aBoolean1484 && !Class17.aBoolean287 || Node_Sub8_Sub11.aBoolean8992)
                    bool_216_ = true;
                else if ((i ^ 0xffffffff) >= -2 && Class20.method231(-65, string_215_))
                    bool_216_ = true;
            }
            if (!bool_216_ && (Node_Sub14_Sub12.anInt9268 ^ 0xffffffff) == -1) {
                String string_217_ = (Node_Sub8_Sub14_Sub1.method2127(-60, (Class346_Sub7_Sub2_Sub4.method3628(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629, (byte) 101))));
                if ((i ^ 0xffffffff) != -3) {
                    if ((i ^ 0xffffffff) != -2)
                        Node_Sub4.method2010(null, string_217_, string, 0, 87, 24, string_215_, string, -1);
                    else
                        Node_Sub4.method2010(null, string_217_, string, 0, 88, 24, "<img=0>" + string_215_, "<img=0>" + string, -1);
                } else
                    Node_Sub4.method2010(null, string_217_, string, 0, 107, 24, "<img=1>" + string_215_, "<img=1>" + string, -1);
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Viewport.aIncommingOpcode_2647 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
            int i_218_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
            Class245.method1957(-12062);
            if ((i_218_ ^ 0xffffffff) == -65536)
                i_218_ = -1;
            Class175.method1587(i, i_218_, 16);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class13.aIncommingOpcode_256) {//access?
            int range2 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            if (range2 == 65535)
                range2 = -1;
            int range1 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            if (range1 == 65535)
                range1 = -1;
            int interfaceSet1 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readLEInt_((byte) 0);
            int interfaceSet2 = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt2(-1893167880);

            System.out.println("sendAccessMask(player, " + range1 + ", " + range2 + ", " + (interfaceSet1 >> 16) + ", " + (interfaceSet1 & 0xffff) + ", " + (interfaceSet2 >> 16) + ", " + (interfaceSet2 & 0xffff) + ");");
            Class245.method1957(-12062);
            for (int i_222_ = range1; (range2 ^ 0xffffffff) <= (i_222_ ^ 0xffffffff); i_222_++) {
                long l = (long) i_222_ + ((long) interfaceSet1 << -1394498592);
                Node_Sub48 class248_sub48 = ((Node_Sub48) Class318.aClass65_3682.method501(l, (byte) 31));
                Node_Sub48 class248_sub48_223_;
                if (class248_sub48 != null) {
                    class248_sub48_223_ = new Node_Sub48(interfaceSet2, (((Node_Sub48) class248_sub48).anInt7418));
                    class248_sub48.remove(bool);
                } else if (i_222_ != -1)
                    class248_sub48_223_ = new Node_Sub48(interfaceSet2, -1);
                else
                    class248_sub48_223_ = new Node_Sub48(interfaceSet2, (((Node_Sub48) (((RSInterface2) Class276.method2853(65535, interfaceSet1)).aClass248_Sub48_4310)).anInt7418));
                Class318.aClass65_3682.method509(-1, class248_sub48_223_, l);
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class111.aIncommingOpcode_1390) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt1((byte) -89);
            Class245.method1957(-12062);
            Class167.sendModel(0, (byte) 100, 5, Class282_Sub29.anInt7896, i);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class253.aIncommingOpcode_2847 == Class51.currentIncommingOpcode) {
            Class282_Sub22.method3015(Class28.aClass128_4893, (byte) -16);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class263.aIncommingOpcode_2982 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt2(-1893167880);
            int i_224_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
            Class245.method1957(-12062);
            Class282_Sub14.method2974(i_224_, i, true);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class146.aIncommingOpcode_1725 == Class51.currentIncommingOpcode) {
            boolean bool_225_ = ((Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -100) ^ 0xffffffff) == -2);
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            String string_226_ = string;
            if (bool_225_)
                string_226_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 120);
            int i_227_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            boolean bool_228_ = false;
            if ((i ^ 0xffffffff) >= -2 && Class20.method231(-94, string_226_))
                bool_228_ = true;
            if (!bool_228_ && Node_Sub14_Sub12.anInt9268 == 0) {
                String string_229_ = (Class44_Sub1.aClass152_5288.method1356(true, i_227_).method2147(Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629, (byte) 91));
                if (i == 2)
                    Node_Sub4.method2010(null, string_229_, string, 0, 111, 25, "<img=1>" + string_226_, "<img=1>" + string, i_227_);
                else if (i != 1)
                    Node_Sub4.method2010(null, string_229_, string, 0, 125, 25, string_226_, string, i_227_);
                else
                    Node_Sub4.method2010(null, string_229_, string, 0, 96, 25, "<img=0>" + string_226_, "<img=0>" + string, i_227_);
            }
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class291.aIncommingOpcode_4752) {
            Class282_Sub22.method3015(Class113.aClass128_1401, (byte) -48);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (PacketStream.aIncommingOpcode_9123 == Class51.currentIncommingOpcode) {
            int lvl = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) 62);
            int xp = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt(false);
            int id = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
            Class9.anIntArray224[id] = xp;
            Node_Sub14_Sub16.anIntArray9337[id] = lvl;
            r_Sub2.anIntArray10286[id] = 1;
            int i_232_ = Class226_Sub2_Sub1.anIntArray8809[id] + -1;
            for (int i_233_ = 0; i_232_ > i_233_; i_233_++) {
                if ((xp ^ 0xffffffff) <= (Class255.anIntArray2918[i_233_] ^ 0xffffffff))
                    r_Sub2.anIntArray10286[id] = i_233_ + 2;
            }
            Node_Sub39.anIntArray7279[Class112.method794(31, Class340_Sub10.anInt8225++)] = id;
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class346_Sub5_Sub2.aIncommingOpcode_9900) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readInt1((byte) -70);
            int i_234_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            Node_Sub43.aClass291_7306.method3105(i_234_, 115, i);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Node_Sub14_Sub38.aIncommingOpcode_9581) {
            Class282_Sub22.method3015(Node_Sub14_Sub32.aClass128_9498, (byte) -45);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class300.aIncommingOpcode_3495 == Class51.currentIncommingOpcode) {
            if ((Class179.anInt2084 ^ 0xffffffff) != 0)
                Class293.method3116(0, Class179.anInt2084, (byte) 121);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        if (Class51.currentIncommingOpcode == Class166.aIncommingOpcode_1946) {
            Class380.readCustomMapRegionUpdate(116);
            Class51.currentIncommingOpcode = null;
            return false;
        }
        if (Class282_Sub15.aIncommingOpcode_7747 == Class51.currentIncommingOpcode) {
            int i = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            if (i == 65535)
                i = -1;
            int i_235_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 104);
            int i_236_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_237_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -77);
            int i_238_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            Node_Sub39_Sub2.method2609(!bool, i_237_, i_235_, i, i_238_, false, i_236_);
            Class51.currentIncommingOpcode = null;
            return true;
        }
        Class282_Sub14.method2975(("T1 - " + (Class51.currentIncommingOpcode == null ? -1 : Class51.currentIncommingOpcode.getOpcode()) + "," + (Class61.aIncommingOpcode_832 == null ? -1 : Class61.aIncommingOpcode_832.getOpcode()) + "," + (Class226_Sub3.aIncommingOpcode_6669 != null ? Class226_Sub3.aIncommingOpcode_6669.getOpcode() : -1) + " - " + Class30.currentPacketSize), null, 1);
        Class340_Sub5.method3455(71, false);
        return true;
    }

    static {
        aClass278_2204 = new Class278(8);
        aShortArray2217 = new short[256];
    }
}
