/* Class248_Sub8_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub20 extends Node_Sub8 {
    static int anInt9087;
    private String[] aStringArray9088;
    static int anInt9089;
    static int anInt9090;
    static int anInt9091;
    int[] anIntArray9092;
    static int anInt9093;
    static boolean aBoolean9094;
    private int[] anIntArray9095;
    static int anInt9096;
    static int anInt9097;
    static int anInt9098;
    private int[][] anIntArrayArray9099;
    static int anInt9100;
    Class152 aClass152_9101;
    static int anInt9102 = -1;
    static int anInt9103;
    boolean aBoolean9104 = true;

    final String method2147(ByteStream class248_sub9, byte i) {
        anInt9091++;
        StringBuffer stringbuffer = new StringBuffer(80);
        if (anIntArray9095 != null) {
            for (int i_0_ = 0; (anIntArray9095.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
                stringbuffer.append(aStringArray9088[i_0_]);
                stringbuffer.append(((Node_Sub8_Sub20) this).aClass152_9101.method1355(method2153(false, i_0_), (class248_sub9.method2163((((Class168) Node_Sub30.method2563(-99, anIntArray9095[i_0_])).anInt1962), 255)), (byte) -122, anIntArrayArray9099[i_0_]));
            }
        }
        stringbuffer.append(aStringArray9088[aStringArray9088.length + -1]);
        if (i < 72)
            return null;
        return stringbuffer.toString();
    }

    final void method2148(byte i) {
        anInt9093++;
        int i_1_ = -20 / ((56 - i) / 51);
        if (((Node_Sub8_Sub20) this).anIntArray9092 != null) {
            for (int i_2_ = 0; ((((Node_Sub8_Sub20) this).anIntArray9092.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff)); i_2_++)
                ((Node_Sub8_Sub20) this).anIntArray9092[i_2_] = Class358.retrieveLooksSettings((((Node_Sub8_Sub20) this).anIntArray9092[i_2_]), 32768);
        }
    }

    final void method2149(ByteStream class248_sub9, byte i) {
        if (i >= 77) {
            for (; ; ) {
                int i_3_ = class248_sub9.readUnsignedByte((byte) 87);
                if (i_3_ == 0)
                    break;
                method2152(class248_sub9, i_3_, (byte) -119);
            }
            anInt9087++;
        }
    }

    final void method2150(ByteStream class248_sub9, byte i, int[] is) {
        anInt9098++;
        if (anIntArray9095 != null) {
            for (int i_4_ = 0; ((i_4_ ^ 0xffffffff) > (anIntArray9095.length ^ 0xffffffff) && is.length > i_4_); i_4_++) {
                int i_5_ = ((Class168) method2153(false, i_4_)).anInt1965;
                if ((i_5_ ^ 0xffffffff) < -1)
                    class248_sub9.method2162((long) is[i_4_], i_5_, -81);
            }
            if (i != 77)
                ((Node_Sub8_Sub20) this).aClass152_9101 = null;
        }
    }

    final int method2151(int i, int i_6_, byte i_7_) {
        anInt9103++;
        if (anIntArray9095 == null || (i ^ 0xffffffff) > -1 || (anIntArray9095.length ^ 0xffffffff) > (i ^ 0xffffffff))
            return -1;
        if (anIntArrayArray9099[i] == null || i_6_ < 0 || i_6_ > anIntArrayArray9099[i].length)
            return -1;
        if (i_7_ != -107)
            anInt9102 = 100;
        return anIntArrayArray9099[i][i_6_];
    }

    private final void method2152(ByteStream class248_sub9, int i, byte i_8_) {
        if (i_8_ >= -118)
            aBoolean9094 = false;
        if (i != 1) {
            if (i == 2) {
                int i_9_ = class248_sub9.readUnsignedByte((byte) -104);
                ((Node_Sub8_Sub20) this).anIntArray9092 = new int[i_9_];
                for (int i_10_ = 0; i_9_ > i_10_; i_10_++)
                    ((Node_Sub8_Sub20) this).anIntArray9092[i_10_] = class248_sub9.readShort(-1);
            } else if ((i ^ 0xffffffff) != -4) {
                if (i == 4)
                    ((Node_Sub8_Sub20) this).aBoolean9104 = false;
            } else {
                int i_11_ = class248_sub9.readUnsignedByte((byte) -95);
                anIntArrayArray9099 = new int[i_11_][];
                anIntArray9095 = new int[i_11_];
                for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
                    int i_13_ = class248_sub9.readShort(-1);
                    Class168 class168 = Node_Sub30.method2563(-117, i_13_);
                    if (class168 != null) {
                        anIntArray9095[i_12_] = i_13_;
                        anIntArrayArray9099[i_12_] = new int[((Class168) class168).anInt1966];
                        for (int i_14_ = 0; i_14_ < ((Class168) class168).anInt1966; i_14_++)
                            anIntArrayArray9099[i_12_][i_14_] = class248_sub9.readShort(-1);
                    }
                }
            }
        } else
            aStringArray9088 = Class80.method583(-105, class248_sub9.readString(15598), '<');
        anInt9089++;
    }

    final Class168 method2153(boolean bool, int i) {
        if (bool != false)
            method2150(null, (byte) -51, null);
        anInt9096++;
        if (anIntArray9095 == null || (i ^ 0xffffffff) > -1 || (anIntArray9095.length ^ 0xffffffff) > (i ^ 0xffffffff))
            return null;
        return Node_Sub30.method2563(-118, anIntArray9095[i]);
    }

    final int method2154(int i) {
        anInt9097++;
        if (anIntArray9095 == null)
            return 0;
        if (i != -1)
            return 100;
        return anIntArray9095.length;
    }

    final String method2155(boolean bool) {
        anInt9100++;
        StringBuffer stringbuffer = new StringBuffer(80);
        if (aStringArray9088 == null)
            return "";
        stringbuffer.append(aStringArray9088[0]);
        if (bool != false)
            ((Node_Sub8_Sub20) this).aClass152_9101 = null;
        for (int i = 1; (i ^ 0xffffffff) > (aStringArray9088.length ^ 0xffffffff); i++) {
            stringbuffer.append("...");
            stringbuffer.append(aStringArray9088[i]);
        }
        return stringbuffer.toString();
    }

    public Node_Sub8_Sub20() {
        /* empty */
    }

    static {
        anInt9090 = 1;
    }
}
