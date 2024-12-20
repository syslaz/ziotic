/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

final class Class94 {
    String aString1209;
    static int anInt1210;
    static int anInt1211;
    int anInt1212;
    int anInt1213;
    String aString1214;
    int anInt1215 = Class282_Sub9.method2956((byte) -57);
    int anInt1216;
    static ByteStream aClass248_Sub9_1217 = new ByteStream(1350);
    String aString1218;
    static int anInt1219;
    String aString1220;
    String aString1221;
    static Class381 aClass381_1222;
    static int anInt1223;
    static Class208 aClass208_1224 = new Class208(5, 1);
    int anInt1225;

    public static void method689(boolean bool) {
        aClass248_Sub9_1217 = null;
        aClass381_1222 = null;
        if (bool == true)
            aClass208_1224 = null;
    }

    final void method690(String string, int i, int i_0_, int i_1_, String string_2_, int i_3_, String string_4_, String string_5_, String string_6_) {
        ((Class94) this).anInt1215 = Class282_Sub9.method2956((byte) -118);
        anInt1223++;
        ((Class94) this).aString1209 = string_2_;
        ((Class94) this).aString1221 = string;
        ((Class94) this).anInt1213 = Node_Sub18.anInt7027;
        if (i_3_ != 1350)
            ((Class94) this).aString1218 = null;
        ((Class94) this).aString1220 = string_6_;
        ((Class94) this).anInt1225 = i_1_;
        ((Class94) this).anInt1216 = i_0_;
        ((Class94) this).aString1214 = string_5_;
        ((Class94) this).anInt1212 = i;
        ((Class94) this).aString1218 = string_4_;
    }

    static final void method691(byte i) {
        anInt1210++;
        Class45 class45 = null;
        try {
            class45 = Class174.method1572((byte) -91, "2");
            if (i > -81)
                method692(null, null, null, -2);
            ByteStream class248_sub9 = new ByteStream(3 - -(6 * Node_Sub14_Sub13.anInt9286));
            class248_sub9.writeByte(-27, 1);
            class248_sub9.writeShort(1182, Node_Sub14_Sub13.anInt9286);
            for (int i_7_ = 0; ((Class357.anIntArray4417.length ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
                if (Class215.aBooleanArray2477[i_7_]) {
                    class248_sub9.writeShort(1182, i_7_);
                    class248_sub9.writeInt(27695, Class357.anIntArray4417[i_7_]);
                }
            }
            class45.method327(3874, 0, ((ByteStream) class248_sub9).offset, ((ByteStream) class248_sub9).buffer);
        } catch (Exception exception) {
            /* empty */
        }
        try {
            if (class45 != null)
                class45.method323(-124);
        } catch (Exception exception) {
            /* empty */
        }
        Node_Sub8_Sub1.aLong8892 = Class118.method1112(116);
        Class346_Sub7_Sub1_Sub1.aBoolean10133 = false;
    }

    static final void method692(Node_Sub35 class248_sub35, ha var_ha, Class56 class56, int i) {
        anInt1219++;
        Class129 class129 = class56.method448(false, var_ha);
        if (class129 != null) {
            int i_8_ = class129.method1175();
            if ((i_8_ ^ 0xffffffff) > (class129.method1176() ^ 0xffffffff))
                i_8_ = class129.method1176();
            int i_9_ = 10;
            int i_10_ = ((Node_Sub35) class248_sub35).anInt7245;
            int i_11_ = ((Node_Sub35) class248_sub35).anInt7249;
            int i_12_ = 0;
            if (i != 6983)
                method692(null, null, null, 8);
            int i_13_ = 0;
            int i_14_ = 0;
            if (((Class56) class56).aString786 != null) {
                i_12_ = s_Sub2.aClass285_7962.method3073((((Class56) class56).aString786), 174, null, (WorldAddress.aStringArray1196), null);
                for (int i_15_ = 0; i_12_ > i_15_; i_15_++) {
                    String string = WorldAddress.aStringArray1196[i_15_];
                    if ((i_12_ + -1 ^ 0xffffffff) < (i_15_ ^ 0xffffffff))
                        string = string.substring(0, -4 + string.length());
                    int i_16_ = Class377.aClass243_4623.method1937(string);
                    if ((i_13_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff))
                        i_13_ = i_16_;
                }
                i_14_ = (Class377.aClass243_4623.method1936() * i_12_ - -(Class377.aClass243_4623.method1935() / 2));
            }
            int i_17_ = i_8_ / 2 + ((Node_Sub35) class248_sub35).anInt7245;
            int i_18_ = ((Node_Sub35) class248_sub35).anInt7249;
            if ((i_10_ ^ 0xffffffff) > (i_8_ + Class116.anInt1464 ^ 0xffffffff)) {
                i_10_ = Class116.anInt1464;
                i_17_ = i_13_ / 2 + Class116.anInt1464 - -(i_8_ / 2) + (i_9_ - -5);
            } else if ((-i_8_ + Class116.anInt1466 ^ 0xffffffff) > (i_10_ ^ 0xffffffff)) {
                i_10_ = Class116.anInt1466 + -i_8_;
                i_17_ = (-5 + (-(i_13_ / 2) + -i_9_) + Class116.anInt1466 - i_8_ / 2);
            }
            if ((Class116.anInt1470 + i_8_ ^ 0xffffffff) >= (i_11_ ^ 0xffffffff)) {
                if ((i_11_ ^ 0xffffffff) < (-i_8_ + Class116.anInt1456 ^ 0xffffffff)) {
                    i_18_ = -i_14_ + (-(i_8_ / 2) + Class116.anInt1456) + -i_9_;
                    i_11_ = Class116.anInt1456 - i_8_;
                }
            } else {
                i_18_ = i_9_ + Class116.anInt1470 - -(i_8_ / 2);
                i_11_ = Class116.anInt1470;
            }
            int i_19_ = ((int) (32767.0 * (Math.atan2((double) (i_10_ + -(((Node_Sub35) class248_sub35).anInt7245)), (double) (i_11_ + -(((Node_Sub35) class248_sub35).anInt7249))) / 3.141592653589793)) & 0xffff);
            class129.method1162((float) i_8_ / 2.0F + (float) i_10_, (float) i_8_ / 2.0F + (float) i_11_, 4096, i_19_);
            int i_20_ = -2;
            int i_21_ = -2;
            int i_22_ = -2;
            int i_23_ = -2;
            if (((Class56) class56).aString786 != null) {
                i_21_ = i_18_;
                i_20_ = -5 + i_17_ - i_13_ / 2;
                i_22_ = i_13_ + (i_20_ + 10);
                i_23_ = 3 + Class377.aClass243_4623.method1936() * i_12_ + i_21_;
                if (((Class56) class56).anInt746 != 0)
                    var_ha.method820(-i_20_ + i_22_, i ^ 0x1b7b, -i_21_ + i_23_, i_21_, i_20_, ((Class56) class56).anInt746);
                if ((((Class56) class56).anInt762 ^ 0xffffffff) != -1)
                    var_ha.method812(i_23_ + -i_21_, ((Class56) class56).anInt762, -i_20_ + i_22_, i + -6873, i_21_, i_20_);
                for (int i_24_ = 0; (i_12_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
                    String string = WorldAddress.aStringArray1196[i_24_];
                    if (-1 + i_12_ > i_24_)
                        string = string.substring(0, string.length() - 4);
                    Class377.aClass243_4623.method1939(var_ha, string, i_17_, i_18_, (((Class56) class56).anInt779), true);
                    i_18_ += Class377.aClass243_4623.method1936();
                }
            }
            if (((Class56) class56).anInt744 != -1 || ((Class56) class56).aString786 != null) {
                Node_Sub23 class248_sub23 = new Node_Sub23(class248_sub35);
                i_8_ >>= 1;
                ((Node_Sub23) class248_sub23).anInt7094 = i_23_;
                ((Node_Sub23) class248_sub23).anInt7084 = i_11_ + -i_8_;
                ((Node_Sub23) class248_sub23).anInt7092 = i_20_;
                ((Node_Sub23) class248_sub23).anInt7085 = i_21_;
                ((Node_Sub23) class248_sub23).anInt7090 = i_8_ + i_11_;
                ((Node_Sub23) class248_sub23).anInt7087 = i_10_ + i_8_;
                ((Node_Sub23) class248_sub23).anInt7091 = i_22_;
                ((Node_Sub23) class248_sub23).anInt7083 = i_10_ - i_8_;
                Class102.aClass293_1308.method3109(class248_sub23, -88);
            }
        }
    }

    Class94(int i, int i_25_, String string, String string_26_, String string_27_, String string_28_, int i_29_, String string_30_) {
        ((Class94) this).aString1218 = string_30_;
        ((Class94) this).aString1214 = string;
        ((Class94) this).aString1209 = string_27_;
        ((Class94) this).anInt1225 = i;
        ((Class94) this).aString1221 = string_28_;
        ((Class94) this).anInt1216 = i_25_;
        ((Class94) this).anInt1213 = Node_Sub18.anInt7027;
        ((Class94) this).anInt1212 = i_29_;
        ((Class94) this).aString1220 = string_26_;
    }

    static final Class111 method693(int i, byte i_31_, Socket socket) throws IOException {
        anInt1211++;
        if (i_31_ >= 0)
            aClass208_1224 = null;
        return new Class111_Sub1(socket, i);
    }
}
