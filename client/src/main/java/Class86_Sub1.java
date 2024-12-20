/* Class86_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Class86_Sub1 extends Class86 {
    private int anInt5505;
    private byte[][] aByteArrayArray5506 = new byte[10][];
    static int anInt5507;
    private ByteStream aClass248_Sub9_5508 = new ByteStream(null);
    static Class85 aClass85_5509;
    static int anInt5510;
    static int anInt5511;
    static float[] aFloatArray5512 = new float[16384];
    private int[] anIntArray5513;
    static float[] aFloatArray5514 = new float[16384];
    static int anInt5515;
    private int anInt5516;
    static Class302 aClass302_5517;
    static WorldAddress lobbyAddress;
    private Class381 aClass381_5519;
    private ByteStream aClass248_Sub9_5520 = new ByteStream(null);

    static final void method657(boolean bool, ha var_ha) {
        anInt5511++;
        int i = 0;
        int i_0_ = 0;
        if (Node_Sub8_Sub6.aBoolean8949) {
            i = Class337.method3420(-2);
            i_0_ = RSInterface2.method3770((byte) -20);
        }
        if (bool != false)
            method657(false, null);
        int i_1_ = Class239.anInt2654 - -i;
        int i_2_ = Class346_Sub10.anInt8354 - -i_0_;
        int i_3_ = Class346_Sub2.anInt8261;
        int i_4_ = Class198.anInt2264 - 3;
        int i_5_ = 20;
        Class283.method3056(var_ha, i_5_, Class346_Sub2.anInt8261, Class239.anInt2654 + i, Class41.aClass41_490.method301(Class191.anInt4822, (byte) -108), true, Class198.anInt2264, i_0_ + Class346_Sub10.anInt8354);
        int i_6_ = i + Class46.aClass269_600.method2817((byte) -89);
        int i_7_ = i_0_ + Class46.aClass269_600.method2809(97);
        if (!Class342.aBoolean4008) {
            int i_8_ = 0;
            for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3119(2)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3107(-127))) {
                int i_9_ = (13 + i_2_ + (i_5_ + 16 * (Class379.anInt4638 - 1 + -i_8_)));
                if ((Class239.anInt2654 - -i ^ 0xffffffff) > (i_6_ ^ 0xffffffff) && (i_6_ < Class239.anInt2654 - -i - -Class346_Sub2.anInt8261) && (i_9_ - 13 ^ 0xffffffff) > (i_7_ ^ 0xffffffff) && (i_7_ ^ 0xffffffff) > (4 + i_9_ ^ 0xffffffff) && (((Node_Sub8_Sub11) class248_sub8_sub11).aBoolean9005))
                    var_ha.aa(Class239.anInt2654 - -i, i_9_ - 12, Class346_Sub2.anInt8261, 16, (Class267.anInt4922 | -Node_Sub18.anInt7029 + 255 << 47772088), 1);
                i_8_++;
            }
        } else {
            int i_10_ = 0;
            for (Node_Sub8_Sub5 class248_sub8_sub5 = ((Node_Sub8_Sub5) Class363.aClass64_4478.method492(896)); class248_sub8_sub5 != null; class248_sub8_sub5 = ((Node_Sub8_Sub5) Class363.aClass64_4478.method490(true))) {
                int i_11_ = i_2_ + i_5_ - (-13 - 16 * i_10_);
                i_10_++;
                if (Class239.anInt2654 - -i < i_6_ && i_6_ < i + (Class239.anInt2654 + Class346_Sub2.anInt8261) && (i_7_ ^ 0xffffffff) < (-13 + i_11_ ^ 0xffffffff) && i_11_ - -4 > i_7_ && (((Node_Sub8_Sub5) class248_sub8_sub5).anInt8937 > 1 || (((Node_Sub8_Sub11) (Node_Sub8_Sub11) ((Node_Sub8) (((Class64) ((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936).aClass248_Sub8_856)).aClass248_Sub8_6871).aBoolean9005)))
                    var_ha.aa(Class239.anInt2654 - -i, i_11_ - 12, Class346_Sub2.anInt8261, 16, (Class267.anInt4922 | 255 - Node_Sub18.anInt7029 << 515472824), 1);
            }
            if (Class276.aClass248_Sub8_Sub5_3209 != null) {
                Class283.method3056(var_ha, i_5_, Class316_Sub2.anInt8053, Class203.anInt2314, (((Node_Sub8_Sub5) Class276.aClass248_Sub8_Sub5_3209).aString8934), !bool, Class155.anInt1837, Class54_Sub3.anInt5344);
                i_10_ = 0;
                for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) ((Node_Sub8_Sub5) Class276.aClass248_Sub8_Sub5_3209).aClass64_8936.method492(896)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) ((Node_Sub8_Sub5) Class276.aClass248_Sub8_Sub5_3209).aClass64_8936.method490(!bool))) {
                    int i_12_ = i_10_ * 16 + (13 + (i_5_ + Class54_Sub3.anInt5344));
                    if (Class203.anInt2314 < i_6_ && ((i_6_ ^ 0xffffffff) > (Class316_Sub2.anInt8053 + Class203.anInt2314 ^ 0xffffffff)) && (i_7_ ^ 0xffffffff) < (-13 + i_12_ ^ 0xffffffff) && i_7_ < 4 + i_12_ && (((Node_Sub8_Sub11) class248_sub8_sub11).aBoolean9005))
                        var_ha.aa(Class203.anInt2314, i_12_ + -12, Class316_Sub2.anInt8053, 16, (Class267.anInt4922 | (-Node_Sub18.anInt7029 + 255 << 559734552)), 1);
                    i_10_++;
                }
                Class126.method1154((byte) 85, var_ha, Class54_Sub3.anInt5344, Class316_Sub2.anInt8053, i_5_, Class155.anInt1837, Class203.anInt2314);
            }
        }
        Class126.method1154((byte) 85, var_ha, i_0_ + Class346_Sub10.anInt8354, Class346_Sub2.anInt8261, i_5_, Class198.anInt2264, Class239.anInt2654 + i);
        if (Class342.aBoolean4008) {
            int i_13_ = 0;
            for (Node_Sub8_Sub5 class248_sub8_sub5 = ((Node_Sub8_Sub5) Class363.aClass64_4478.method492(896)); class248_sub8_sub5 != null; class248_sub8_sub5 = ((Node_Sub8_Sub5) Class363.aClass64_4478.method490(true))) {
                int i_14_ = (i_5_ + (i_0_ + Class346_Sub10.anInt8354) - -13 + i_13_ * 16);
                if ((((Node_Sub8_Sub5) class248_sub8_sub5).anInt8937 ^ 0xffffffff) == -2)
                    aa.method149(Class198.anInt2264, i_14_, Class239.anInt2654 - -i, var_ha, ~0xffffff | Class279_Sub1_Sub1.anInt9818, Class279_Sub1_Sub1.anInt9813 | ~0xffffff, (byte) 102, ((Node_Sub8_Sub11) (((Node_Sub8) ((Class64) (((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936)).aClass248_Sub8_856).aClass248_Sub8_6871)), i_7_, Class346_Sub2.anInt8261, i_6_, i_0_ + Class346_Sub10.anInt8354);
                else
                    Class341.method3479(Class279_Sub1_Sub1.anInt9813 | ~0xffffff, Class346_Sub2.anInt8261, var_ha, Class198.anInt2264, Class346_Sub10.anInt8354 + i_0_, ~0xffffff | Class279_Sub1_Sub1.anInt9818, i_14_, i_6_, i_7_, class248_sub8_sub5, 13, i + Class239.anInt2654);
                i_13_++;
            }
            if (Class276.aClass248_Sub8_Sub5_3209 != null) {
                i_13_ = 0;
                for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) ((Node_Sub8_Sub5) Class276.aClass248_Sub8_Sub5_3209).aClass64_8936.method492(896)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) ((Node_Sub8_Sub5) Class276.aClass248_Sub8_Sub5_3209).aClass64_8936.method490(true))) {
                    int i_15_ = 16 * i_13_ + (13 + Class54_Sub3.anInt5344 + i_5_);
                    i_13_++;
                    aa.method149(Class155.anInt1837, i_15_, Class203.anInt2314, var_ha, ~0xffffff | Class279_Sub1_Sub1.anInt9818, Class279_Sub1_Sub1.anInt9813 | ~0xffffff, (byte) 60, class248_sub8_sub11, i_7_, Class316_Sub2.anInt8053, i_6_, Class54_Sub3.anInt5344);
                }
                Interactable.method3564(Class54_Sub3.anInt5344, Class203.anInt2314, Class316_Sub2.anInt8053, bool, Class155.anInt1837);
            }
        } else {
            int i_16_ = 0;
            for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3119(2)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3107(-128))) {
                int i_17_ = ((-i_16_ + Class379.anInt4638 - 1) * 16 + 13 + (i_5_ + i_2_));
                aa.method149(i_4_, i_17_, i_1_, var_ha, ~0xffffff | Class279_Sub1_Sub1.anInt9818, ~0xffffff | Class279_Sub1_Sub1.anInt9813, (byte) 65, class248_sub8_sub11, i_7_, i_3_, i_6_, i_2_);
                i_16_++;
            }
        }
        Interactable.method3564(Class346_Sub10.anInt8354 - -i_0_, i + Class239.anInt2654, Class346_Sub2.anInt8261, bool, Class198.anInt2264);
    }

    public static void method658(int i) {
        aFloatArray5512 = null;
        aFloatArray5514 = null;
        lobbyAddress = null;
        aClass302_5517 = null;
        aClass85_5509 = null;
        if (i != 0)
            method658(9);
    }

    final void method659(int i) {
        anInt5510++;
        if (anIntArray5513 != null) {
            if (i != 24719)
                method659(86);
            for (int i_18_ = 0; (i_18_ < 10 && (anInt5505 + i_18_ ^ 0xffffffff) > (anIntArray5513.length ^ 0xffffffff)); i_18_++) {
                if (aByteArrayArray5506[i_18_] == null && aClass381_5519.method3915(i + -24630, 0, (anIntArray5513[anInt5505 + i_18_])))
                    aByteArrayArray5506[i_18_] = aClass381_5519.method3922((byte) 126, (anIntArray5513[i_18_ + anInt5505]), 0);
            }
        }
    }

    Class86_Sub1(int i, Class381 class381, int i_19_) {
        super(i);
        anInt5516 = i_19_;
        aClass381_5519 = class381;
    }

    static final void method660(int i) {
        Node_Sub22.anIntArray7077 = null;
        if (i != 0)
            method658(-42);
        Class218.anIntArray2503 = null;
        Node_Sub8_Sub9.anIntArray8966 = null;
        Class328.anIntArray3840 = null;
        Class13.anIntArray258 = null;
        Class340_Sub5.aBoolean8140 = false;
        anInt5507++;
    }

    final int method652(byte[] is, int i) throws IOException {
        anInt5515++;
        if (anIntArray5513 == null) {
            if (!aClass381_5519.method3915(i + 75, 0, anInt5516))
                return 0;
            byte[] is_20_ = aClass381_5519.method3922((byte) 110, anInt5516, 0);
            if (is_20_ == null)
                throw new IllegalStateException("");
            ((ByteStream) aClass248_Sub9_5520).offset = 0;
            ((ByteStream) aClass248_Sub9_5520).buffer = is_20_;
            int i_21_ = is_20_.length >> -1320295455;
            anIntArray5513 = new int[i_21_];
            for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
                anIntArray5513[i_22_] = aClass248_Sub9_5520.readShort(i + -3);
        }
        if (i != 2)
            method660(35);
        if ((anIntArray5513.length ^ 0xffffffff) >= (anInt5505 ^ 0xffffffff))
            return -1;
        method659(24719);
        ((ByteStream) aClass248_Sub9_5520).buffer = is;
        ((ByteStream) aClass248_Sub9_5520).offset = 0;
        while (((ByteStream) aClass248_Sub9_5520).offset < ((ByteStream) aClass248_Sub9_5520).buffer.length) {
            if (((ByteStream) aClass248_Sub9_5508).buffer == null) {
                if (aByteArrayArray5506[0] == null) {
                    ((ByteStream) aClass248_Sub9_5520).buffer = null;
                    return ((ByteStream) aClass248_Sub9_5520).offset;
                }
                ((ByteStream) aClass248_Sub9_5508).buffer = aByteArrayArray5506[0];
            }
            int i_23_ = (((ByteStream) aClass248_Sub9_5520).buffer.length + -((ByteStream) aClass248_Sub9_5520).offset);
            int i_24_ = (((ByteStream) aClass248_Sub9_5508).buffer.length + -((ByteStream) aClass248_Sub9_5508).offset);
            if ((i_23_ ^ 0xffffffff) <= (i_24_ ^ 0xffffffff)) {
                aClass248_Sub9_5520.method2215(((ByteStream) aClass248_Sub9_5508).offset, (byte) -32, ((ByteStream) aClass248_Sub9_5508).buffer, i_24_);
                ((ByteStream) aClass248_Sub9_5508).buffer = null;
                ((ByteStream) aClass248_Sub9_5508).offset = 0;
                anInt5505++;
                for (int i_25_ = 0; i_25_ < 9; i_25_++)
                    aByteArrayArray5506[i_25_] = aByteArrayArray5506[1 + i_25_];
                aByteArrayArray5506[9] = null;
                if ((anIntArray5513.length ^ 0xffffffff) >= (anInt5505 ^ 0xffffffff)) {
                    ((ByteStream) aClass248_Sub9_5520).buffer = null;
                    return ((ByteStream) aClass248_Sub9_5520).offset;
                }
            } else {
                aClass248_Sub9_5508.method2189(((ByteStream) aClass248_Sub9_5520).buffer, ((ByteStream) aClass248_Sub9_5520).offset, i_23_, 79);
                ((ByteStream) aClass248_Sub9_5520).buffer = null;
                return is.length;
            }
        }
        ((ByteStream) aClass248_Sub9_5520).buffer = null;
        return is.length;
    }

    static {
        double d = 3.834951969714103E-4;
        for (int i = 0; i < 16384; i++) {
            aFloatArray5514[i] = (float) Math.sin(d * (double) i);
            aFloatArray5512[i] = (float) Math.cos(d * (double) i);
        }
    }
}
