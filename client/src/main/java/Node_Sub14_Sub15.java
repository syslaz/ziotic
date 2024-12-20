/* Class248_Sub14_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Node_Sub14_Sub15 extends Node_Sub14 {
    private int anInt9308;
    private int anInt9309 = 5;
    private short[] aShortArray9310;
    private int anInt9311 = 2;
    static int anInt9312;
    private int anInt9313 = 2048;
    private int anInt9314;
    private int anInt9315 = 0;
    static int anInt9316;
    static int anInt9317;
    private byte[] aByteArray9318;
    static int anInt9319;
    static int anInt9320;
    static int anInt9321;
    static OutgoingOpcode aOutgoingOpcode_9322 = new OutgoingOpcode(60, -1);
    static int anInt9323 = 0;
    static int anInt9324 = 0;
    static Class278 aClass278_9325 = new Class278(5);
    static Node_Sub43 aClass248_Sub43_9326;
    static int[] anIntArray9327 = {16, 32, 64, 128};
    static Class174 aClass174_9328;

    final void method2269(ByteStream class248_sub9, byte i, int i_0_) {
        int i_1_ = i_0_;
        while_85_:
        do {
            while_84_:
            do {
                while_83_:
                do {
                    while_82_:
                    do {
                        while_81_:
                        do {
                            do {
                                if (i_1_ != 0) {
                                    if (i_1_ != 1) {
                                        if ((i_1_ ^ 0xffffffff) != -3) {
                                            if ((i_1_ ^ 0xffffffff) != -4) {
                                                if ((i_1_ ^ 0xffffffff) != -5) {
                                                    if (i_1_ != 5) {
                                                        if (i_1_ == 6)
                                                            break while_84_;
                                                        break while_85_;
                                                    }
                                                } else
                                                    break while_82_;
                                                break while_83_;
                                            }
                                        } else
                                            break;
                                        break while_81_;
                                    }
                                } else {
                                    anInt9309 = anInt9314 = class248_sub9.readUnsignedByte((byte) 111);
                                    break while_85_;
                                }
                                anInt9315 = class248_sub9.readUnsignedByte((byte) 110);
                                break while_85_;
                            } while (false);
                            anInt9313 = class248_sub9.readShort(-1);
                            break while_85_;
                        } while (false);
                        anInt9311 = class248_sub9.readUnsignedByte((byte) 90);
                        break while_85_;
                    } while (false);
                    anInt9308 = class248_sub9.readUnsignedByte((byte) 100);
                    break while_85_;
                } while (false);
                anInt9309 = class248_sub9.readUnsignedByte((byte) 124);
                break while_85_;
            } while (false);
            anInt9314 = class248_sub9.readUnsignedByte((byte) 83);
        } while (false);
        if (i != -61)
            anInt9323 = -28;
        anInt9319++;
    }

    final void method2263(int i) {
        aByteArray9318 = Class136_Sub4.method1265(anInt9315, 83);
        anInt9312++;
        if (i == 8351)
            method2319((byte) 96);
    }

    public static void method2317(boolean bool) {
        if (bool != false)
            anIntArray9327 = null;
        aOutgoingOpcode_9322 = null;
        aClass248_Sub43_9326 = null;
        aClass278_9325 = null;
        anIntArray9327 = null;
        aClass174_9328 = null;
    }

    static final void method2318(int i, int i_2_) {
        anInt9321++;
        if (Class273.anInt5008 != i) {
            if ((i ^ 0xffffffff) == -14) {
                if (ByteStream.aString6879 == null)
                    Class112_Sub3.method803(Class212.aString2453, Node_Sub8.aString6862, 102, Class312.anInt3627);
                else
                    Class168.method1544(i_2_ + 21070, Class312.anInt3627);
            }
            if (i != 13 && Class275_Sub1.aClass111_8592 != null) {
                Class275_Sub1.aClass111_8592.method774(-1);
                Class275_Sub1.aClass111_8592 = null;
            }
            if ((i ^ 0xffffffff) == -4)
                Class111.method773(i_2_ + 20997, ((Class179.anInt2084 ^ 0xffffffff) != (Class279_Sub2.anInt7587 ^ 0xffffffff)));
            if (i_2_ == -21035) {
                if ((i ^ 0xffffffff) == -8)
                    Class87.method661((byte) 84, (Class179.anInt2084 != Class160.anInt1891));
                if ((i ^ 0xffffffff) != -6) {
                    if ((i ^ 0xffffffff) == -7) {
                        if (ByteStream.aString6879 == null)
                            Class112_Sub3.method803(Class212.aString2453, Node_Sub8.aString6862, 126, Class312.anInt3627);
                        else
                            Class168.method1544(35, Class312.anInt3627);
                    } else if ((i ^ 0xffffffff) == -10) {
                        if (ByteStream.aString6879 == null)
                            Class112_Sub3.method803(Class212.aString2453, Node_Sub8.aString6862, 107, Class312.anInt3627);
                        else
                            Class168.method1544(i_2_ + 21070, Class312.anInt3627);
                    } else if (i == 12) {
                        if (ByteStream.aString6879 != null)
                            Class65.method502((byte) -109);
                        else
                            Class32.method270(Class212.aString2453, (byte) 26, Node_Sub8.aString6862);
                    }
                } else if (ByteStream.aString6879 == null)
                    Class32.method270(Class212.aString2453, (byte) 26, Node_Sub8.aString6862);
                else
                    Class65.method502((byte) -65);
                if (Class162_Sub1.method1459(-118, Class273.anInt5008)) {
                    ((Class381) Class237.aClass381_2644).anInt4675 = 2;
                    ((Class381) Node_Sub2_Sub4.aClass381_8879).anInt4675 = 2;
                    ((Class381) Class94.aClass381_1222).anInt4675 = 2;
                    ((Class381) Class346_Sub5.aClass381_8280).anInt4675 = 2;
                    ((Class381) Class4.aClass381_137).anInt4675 = 2;
                    ((Class381) Class282_Sub8.aClass381_7670).anInt4675 = 2;
                    ((Class381) Class206.aClass381_4980).anInt4675 = 2;
                }
                if (Class162_Sub1.method1459(-94, i)) {
                    Class282_Sub1.anInt7594 = 1;
                    Class129_Sub1.anInt8494 = 1;
                    Node_Sub43.anInt7307 = 0;
                    Class36.anInt405 = 0;
                    Class128.anInt1570 = 0;
                    Class262.method2770(true, (byte) -123);
                    ((Class381) Class237.aClass381_2644).anInt4675 = 1;
                    ((Class381) Node_Sub2_Sub4.aClass381_8879).anInt4675 = 1;
                    ((Class381) Class94.aClass381_1222).anInt4675 = 1;
                    ((Class381) Class346_Sub5.aClass381_8280).anInt4675 = 1;
                    ((Class381) Class4.aClass381_137).anInt4675 = 1;
                    ((Class381) Class282_Sub8.aClass381_7670).anInt4675 = 1;
                    ((Class381) Class206.aClass381_4980).anInt4675 = 1;
                }
                if ((i ^ 0xffffffff) == -12 || (i ^ 0xffffffff) == -4)
                    Entity.method3631(23159);
                boolean bool = ((i ^ 0xffffffff) == -3 || Class263.method2771(i_2_ + 21029, i) || Class188.method1633((byte) -14, i));
                boolean bool_3_ = (Class273.anInt5008 == 2 || Class263.method2771(-6, Class273.anInt5008) || Class188.method1633((byte) -14, Class273.anInt5008));
                if (!bool_3_ != !bool) {
                    if (!bool) {
                        Class346_Sub7_Sub2_Sub4.method3627(2, (byte) -57);
                        Class282_Sub5.aClass323_7634.method3348((byte) 115, true);
                    } else {
                        Node_Sub8_Sub3.anInt8927 = Class282.anInt3319;
                        if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7362.method2993(true) != 0) {
                            Class301_Sub3_Sub1.method3195(0, ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7362.method2993(true), 2, false, (byte) -34, Class282.anInt3319, Class116_Sub1.aClass381_6281);
                            Class253_Sub1.method2728(false);
                        } else
                            Class346_Sub7_Sub2_Sub4.method3627(2, (byte) -127);
                        Class282_Sub5.aClass323_7634.method3348((byte) 110, false);
                    }
                }
                if (Class162_Sub1.method1459(-53, i) || (i ^ 0xffffffff) == -14)
                    Class287.aHa3381.h();
                Class273.anInt5008 = i;
            }
        }
    }

    private final void method2319(byte i) {
        anInt9317++;
        if (i >= 87) {
            Random random = new Random((long) anInt9315);
            aShortArray9310 = new short[512];
            if (anInt9313 > 0) {
                for (int i_4_ = 0; i_4_ < 512; i_4_++)
                    aShortArray9310[i_4_] = (short) RSInterface.method2016(anInt9313, -1, random);
            }
        }
    }

    final int[] method2264(byte i, int i_5_) {
        anInt9316++;
        if (i != -40)
            aClass248_Sub43_9326 = null;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_5_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int i_6_ = Node_Sub14_Sub3.anIntArray9184[i_5_] * anInt9314 + 2048;
            int i_7_ = i_6_ >> 1982823628;
            int i_8_ = i_7_ + 1;
            int i_9_ = 0;
            while_93_:
            for (/**/; (Class185.anInt2164 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
                Class247.anInt2794 = IOException_Sub1.anInt85 = Node_Sub8_Sub6.anInt8951 = Class282_Sub27.anInt7876 = 2147483647;
                int i_10_ = (anInt9309 * Node_Sub8_Sub3.anIntArray8921[i_9_] + 2048);
                int i_11_ = i_10_ >> 1254191468;
                int i_12_ = 1 + i_11_;
                for (int i_13_ = i_7_ + -1; (i_13_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff); i_13_++) {
                    int i_14_ = 0xff & aByteArray9318[(i_13_ < anInt9314 ? i_13_ : -anInt9314 + i_13_) & 0xff];
                    for (int i_15_ = -1 + i_11_; (i_12_ ^ 0xffffffff) <= (i_15_ ^ 0xffffffff); i_15_++) {
                        int i_16_ = (0xff & (aByteArray9318[(i_14_ + (((i_15_ ^ 0xffffffff) > (anInt9309 ^ 0xffffffff)) ? i_15_ : i_15_ + -anInt9309) & 0xff)])) * 2;
                        int i_17_ = i_10_ - (aShortArray9310[i_16_++] - -(i_15_ << -448061972));
                        int i_18_ = i_6_ + (-(i_13_ << 881726188) + -aShortArray9310[i_16_]);
                        int i_19_ = anInt9308;
                        int i_20_;
                        while_89_:
                        do {
                            while_88_:
                            do {
                                while_87_:
                                do {
                                    while_86_:
                                    do {
                                        do {
                                            if (i_19_ != 1) {
                                                if (i_19_ != 3) {
                                                    if (i_19_ != 4) {
                                                        if ((i_19_ ^ 0xffffffff) != -6) {
                                                            if (i_19_ == 2)
                                                                break while_87_;
                                                            break while_88_;
                                                        }
                                                    } else
                                                        break;
                                                    break while_86_;
                                                }
                                            } else {
                                                i_20_ = ((i_17_ * i_17_ + i_18_ * i_18_) >> 2009733996);
                                                break while_89_;
                                            }
                                            i_18_ = i_18_ < 0 ? -i_18_ : i_18_;
                                            i_17_ = i_17_ >= 0 ? i_17_ : -i_17_;
                                            i_20_ = (((i_17_ ^ 0xffffffff) >= (i_18_ ^ 0xffffffff)) ? i_18_ : i_17_);
                                            break while_89_;
                                        } while (false);
                                        i_17_ = (int) (4096.0 * (Math.sqrt((double) ((float) ((i_17_ ^ 0xffffffff) <= -1 ? i_17_ : -i_17_) / 4096.0F))));
                                        i_18_ = (int) ((Math.sqrt((double) ((float) ((i_18_ < 0) ? -i_18_ : i_18_) / 4096.0F))) * 4096.0);
                                        i_20_ = i_17_ - -i_18_;
                                        i_20_ = i_20_ * i_20_ >> 1573236140;
                                        break while_89_;
                                    } while (false);
                                    i_18_ *= i_18_;
                                    i_17_ *= i_17_;
                                    i_20_ = (int) (4096.0 * (Math.sqrt(Math.sqrt((double) ((float) (i_17_ + i_18_) / 1.6777216E7F)))));
                                    break while_89_;
                                } while (false);
                                i_20_ = (((i_18_ ^ 0xffffffff) > -1 ? -i_18_ : i_18_) + ((i_17_ ^ 0xffffffff) <= -1 ? i_17_ : -i_17_));
                                break while_89_;
                            } while (false);
                            i_20_ = (int) (4096.0 * (Math.sqrt((double) ((float) (i_18_ * i_18_ + (i_17_ * i_17_)) / 1.6777216E7F))));
                        } while (false);
                        if (Class247.anInt2794 <= i_20_) {
                            if (i_20_ < IOException_Sub1.anInt85) {
                                Class282_Sub27.anInt7876 = Node_Sub8_Sub6.anInt8951;
                                Node_Sub8_Sub6.anInt8951 = IOException_Sub1.anInt85;
                                IOException_Sub1.anInt85 = i_20_;
                            } else if (Node_Sub8_Sub6.anInt8951 <= i_20_) {
                                if ((i_20_ ^ 0xffffffff) > (Class282_Sub27.anInt7876 ^ 0xffffffff))
                                    Class282_Sub27.anInt7876 = i_20_;
                            } else {
                                Class282_Sub27.anInt7876 = Node_Sub8_Sub6.anInt8951;
                                Node_Sub8_Sub6.anInt8951 = i_20_;
                            }
                        } else {
                            Class282_Sub27.anInt7876 = Node_Sub8_Sub6.anInt8951;
                            Node_Sub8_Sub6.anInt8951 = IOException_Sub1.anInt85;
                            IOException_Sub1.anInt85 = Class247.anInt2794;
                            Class247.anInt2794 = i_20_;
                        }
                    }
                }
                int i_21_ = anInt9311;
                while_91_:
                do {
                    while_90_:
                    do {
                        do {
                            if ((i_21_ ^ 0xffffffff) != -1) {
                                if (i_21_ != 1) {
                                    if (i_21_ != 3) {
                                        if (i_21_ != 4) {
                                            if (i_21_ == 2)
                                                break while_91_;
                                            continue while_93_;
                                        }
                                    } else
                                        break;
                                    break while_90_;
                                }
                            } else {
                                is[i_9_] = Class247.anInt2794;
                                continue while_93_;
                            }
                            is[i_9_] = IOException_Sub1.anInt85;
                            continue while_93_;
                        } while (false);
                        is[i_9_] = Node_Sub8_Sub6.anInt8951;
                        continue while_93_;
                    } while (false);
                    is[i_9_] = Class282_Sub27.anInt7876;
                    continue while_93_;
                } while (false);
                is[i_9_] = IOException_Sub1.anInt85 + -Class247.anInt2794;
            }
        }
        return is;
    }

    static final void method2320(int i) {
        anInt9320++;
        if (i == 881726188 && Class321.loginStage == 5)
            Class321.loginStage = 6;
    }

    public Node_Sub14_Sub15() {
        super(0, true);
        anInt9314 = 5;
        aShortArray9310 = new short[512];
        aByteArray9318 = new byte[512];
        anInt9308 = 1;
    }
}
