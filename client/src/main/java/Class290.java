/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;
import java.util.Calendar;
import java.util.TimeZone;

final class Class290 {
    static int anInt3403;
    static int anInt3404;
    private Class330_Sub1[] aClass330_Sub1Array3405;
    private Class77 aClass77_3406;
    private BigInteger aBigInteger3407;
    static int anInt3408;
    static int anInt3409;
    private ByteStream aClass248_Sub9_3410;
    private Node_Sub8_Sub13_Sub1 aClass248_Sub8_Sub13_Sub1_3411;
    private Class323 aClass323_3412;
    static Calendar aCalendar3413 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    static int anInt3414;
    static int anInt3415;
    static int anInt3416;
    static Class381 aClass381_3417;
    static double aDouble3418;
    private BigInteger aBigInteger3419;
    static byte[][] aByteArrayArray3420 = new byte[50][];

    static final Class164 method3090(int i, int i_0_, int i_1_) {
        if (i_1_ != 0)
            aByteArrayArray3420 = null;
        anInt3404++;
        Class164 class164 = new Class164();
        ((Class164) class164).anInt1929 = 5 + (1 + i_0_);
        ((Class164) class164).anInt1928 = -1;
        ((Class164) class164).anInt1924 = 6 + i;
        ((Class164) class164).anInt1944 = -1;
        ((Class164) class164).anIntArrayArray1943 = (new int[((Class164) class164).anInt1924]
                [((Class164) class164).anInt1929]);
        class164.method1518((byte) 12);
        return class164;
    }

    public static void method3091(int i) {
        aCalendar3413 = null;
        if (i != -17)
            method3091(-7);
        aByteArrayArray3420 = null;
        aClass381_3417 = null;
    }

    final boolean method3092(int i) {
        anInt3409++;
        if (aClass248_Sub9_3410 != null)
            return true;
        if (aClass248_Sub8_Sub13_Sub1_3411 == null) {
            if (aClass323_3412.method3356(0))
                return false;
            aClass248_Sub8_Sub13_Sub1_3411 = aClass323_3412.method3355(true, (byte) 0, 255, 255, 22013);
        }
        if (((Node_Sub8_Sub13) aClass248_Sub8_Sub13_Sub1_3411).aBoolean9024)
            return false;
        ByteStream class248_sub9 = new ByteStream(aClass248_Sub8_Sub13_Sub1_3411.method2097(0));
        ((ByteStream) class248_sub9).offset = 5;
        int i_2_ = class248_sub9.readUnsignedByte((byte) 111);
        ((ByteStream) class248_sub9).offset += 72 * i_2_;
        byte[] is = (new byte
                [(-((ByteStream) class248_sub9).offset + ((ByteStream) class248_sub9).buffer.length)]);
        int i_3_ = 108 / ((i - -4) / 55);
        class248_sub9.method2189(is, 0, is.length, 124);
        byte[] is_4_;
        if (aBigInteger3407 == null || aBigInteger3419 == null)
            is_4_ = is;
        else {
            BigInteger biginteger = new BigInteger(is);
            BigInteger biginteger_5_ = launch.rs ? biginteger.modPow(aBigInteger3407, aBigInteger3419) : biginteger;
            is_4_ = biginteger_5_.toByteArray();
        }
        if (is_4_.length != 65)
            throw new RuntimeException();
        byte[] is_6_ = Class19.method230(0, ((ByteStream) class248_sub9).buffer, -5 + (-is.length + (((ByteStream) class248_sub9).offset)), 5);
        for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -65; i_7_++) {
            if (is_6_[i_7_] != is_4_[i_7_ - -1])
                throw new RuntimeException();
        }
        aClass330_Sub1Array3405 = new Class330_Sub1[i_2_];
        aClass248_Sub9_3410 = class248_sub9;
        return true;
    }

    static final boolean method3093(int i, byte i_8_) {
        anInt3416++;
        int i_9_ = 124 / ((i_8_ - -57) / 54);
        if ((i ^ 0xffffffff) == -17 || (i ^ 0xffffffff) == -5 || i == 49 || (i ^ 0xffffffff) == -11 || (i ^ 0xffffffff) == -1009)
            return true;
        if ((i ^ 0xffffffff) == -47 || i == 1009)
            return true;
        return false;
    }

    static final IncommingOpcode[] method3094(int i) {
        anInt3415++;
        if (i != -5)
            aByteArrayArray3420 = null;
        return (new IncommingOpcode[]{Interactable.aIncommingOpcode_8321, Class111_Sub1.aIncommingOpcode_5533, Class253.aIncommingOpcode_2848, Class84_Sub6.aIncommingOpcode_5447, Class139.aIncommingOpcode_1657, Class199.aIncommingOpcode_2275, Class282_Sub28.aIncommingOpcode_7893, Class185_Sub1.aIncommingOpcode_6651, Class269.aIncommingOpcode_3131, Class39.aIncommingOpcode_431, Class169.aIncommingOpcode_1979, Class29.aIncommingOpcode_371, Class189.aIncommingOpcode_5061, Class225_Sub1_Sub1.aIncommingOpcode_9978, Class346_Sub5_Sub2.aIncommingOpcode_9900, Class282_Sub13.aIncommingOpcode_7719, Class282_Sub28.aIncommingOpcode_7881, Class358.aIncommingOpcode_4421, Node_Sub28.aIncommingOpcode_7165, Class151.aIncommingOpcode_1793, Class175.aIncommingOpcode_2056, Node_Sub14_Sub8.aIncommingOpcode_9227, Class48.aIncommingOpcode_652, Class253_Sub1.aIncommingOpcode_7515, Class129_Sub1.aIncommingOpcode_8497, Class205.aIncommingOpcode_2386, Class161.aIncommingOpcode_1894, ObjectDefinition.aIncommingOpcode_3038, Class316_Sub1.aIncommingOpcode_8049, Class346_Sub7_Sub3.aIncommingOpcode_9942, Class11.aIncommingOpcode_243, Class129_Sub1.aIncommingOpcode_8515, Class7.aIncommingOpcode_166, Class340_Sub9.aIncommingOpcode_8213, Node_Sub14_Sub29.aIncommingOpcode_9466, Class82.aIncommingOpcode_1024, Class133.aIncommingOpcode_5041, Class282_Sub3.aIncommingOpcode_7616, Node_Sub40.aIncommingOpcode_7282, Class346_Sub4.aIncommingOpcode_8274, Class8.aIncommingOpcode_176, Class13.aIncommingOpcode_256, Class300.aIncommingOpcode_3495, Class125.aIncommingOpcode_1545, Class333.aIncommingOpcode_3900, Class84_Sub4.aIncommingOpcode_5405, Class22.aIncommingOpcode_318, Class320.aIncommingOpcode_3694, Class251.aIncommingOpcode_2836, Class263.aIncommingOpcode_2982, Node_Sub14_Sub5.aIncommingOpcode_9201, Class291.aIncommingOpcode_4752, Class293.aIncommingOpcode_3425, Class316_Sub2_Sub1.aIncommingOpcode_9876, Class170.aIncommingOpcode_1981, Class269.aIncommingOpcode_3130, Class253.aIncommingOpcode_2847, PacketStream.aIncommingOpcode_9123, Class340.aIncommingOpcode_3962, za_Sub2.aIncommingOpcode_9807, Class371.aIncommingOpcode_4556, Class264.aIncommingOpcode_2986, Class340_Sub10.aIncommingOpcode_8227, Node_Sub14_Sub38.aIncommingOpcode_9581, OutgoingOpcode.aIncommingOpcode_1918, Class146.aIncommingOpcode_1725, Class346_Sub7_Sub4_Sub1.aIncommingOpcode_10087, Class334.aIncommingOpcode_3902, Applet_Sub1.aIncommingOpcode_43, Class367.aIncommingOpcode_4506, Class282_Sub15.aIncommingOpcode_7747, Node_Sub28.aIncommingOpcode_7162, Class5.aIncommingOpcode_144, Class225_Sub1_Sub1.aIncommingOpcode_9985, Class357.aIncommingOpcode_4411, Class185.aIncommingOpcode_2161, OutputStream_Sub1.aIncommingOpcode_89, Class66.aIncommingOpcode_5022, Class218.aIncommingOpcode_2499, Node_Sub47.aIncommingOpcode_7415, Class301_Sub3.aIncommingOpcode_8450, Viewport.aIncommingOpcode_2647, Applet_Sub1.aIncommingOpcode_21, Node_Sub42_Sub3.aIncommingOpcode_9792, Class111.aIncommingOpcode_1390, Node_Sub14_Sub31.aIncommingOpcode_9485, Class309.aIncommingOpcode_3578, Class160.aIncommingOpcode_1885, Class346_Sub5_Sub2.aIncommingOpcode_9887, ha_Sub3.aIncommingOpcode_6045, Node_Sub8_Sub16_Sub1.aIncommingOpcode_10302, Class284.aIncommingOpcode_3346, Node_Sub24.aIncommingOpcode_7122, Class252.aIncommingOpcode_2842, Node_Sub14_Sub3.aIncommingOpcode_9179, Node_Sub47.aIncommingOpcode_7403, Class282_Sub17.aIncommingOpcode_7768, OutgoingOpcode.aIncommingOpcode_1916, Class59.aIncommingOpcode_803, Class111_Sub1.aIncommingOpcode_5536, Class89.aIncommingOpcode_1105, Class351.aIncommingOpcode_4734, Class102.aIncommingOpcode_1296, Class282_Sub25.aIncommingOpcode_7848, Class84_Sub9.aIncommingOpcode_5493, Class166.aIncommingOpcode_1946, Class102.aIncommingOpcode_1306, PacketStream.aIncommingOpcode_9114, Node_Sub2_Sub4.aIncommingOpcode_8875, Class168.aIncommingOpcode_1970, Node_Sub2.aIncommingOpcode_6822, Node_Sub8_Sub19.aIncommingOpcode_9084, Class198.aIncommingOpcode_2263, Class226_Sub2.aIncommingOpcode_6663, Class372.aIncommingOpcode_4581, Node_Sub14_Sub20.aIncommingOpcode_9365, Node_Sub14_Sub8.aIncommingOpcode_9225, Node_Sub14_Sub38.aIncommingOpcode_9571, Class346_Sub7_Sub3.aIncommingOpcode_9944, Class124.aIncommingOpcode_1534, Class340_Sub5.aIncommingOpcode_8139, Class260.aIncommingOpcode_2963, Class282_Sub6.aIncommingOpcode_7650, Class54_Sub4.aIncommingOpcode_5366});
    }

    private final Class330_Sub1 method3095(boolean bool, int i, Class209 class209, byte i_10_, Class209 class209_11_) {
        anInt3403++;
        if (aClass248_Sub9_3410 == null)
            throw new RuntimeException();
        if (i < 0 || aClass330_Sub1Array3405.length <= i)
            throw new RuntimeException();
        if (aClass330_Sub1Array3405[i] != null)
            return aClass330_Sub1Array3405[i];
        ((ByteStream) aClass248_Sub9_3410).offset = 6 + 72 * i;
        int i_12_ = aClass248_Sub9_3410.readInt(false);
        if (i_10_ != 53)
            method3090(58, 49, 94);
        int i_13_ = aClass248_Sub9_3410.readInt(false);
        byte[] is = new byte[64];
        aClass248_Sub9_3410.method2189(is, 0, 64, 91);
        Class330_Sub1 class330_sub1 = new Class330_Sub1(i, class209, class209_11_, aClass323_3412, aClass77_3406, i_12_, is, i_13_, bool);
        aClass330_Sub1Array3405[i] = class330_sub1;
        return class330_sub1;
    }

    final Class330_Sub1 method3096(Class209 class209, int i, Class209 class209_14_, boolean bool) {
        anInt3414++;
        if (bool != false)
            return null;
        return method3095(true, i, class209_14_, (byte) 53, class209);
    }

    final void method3097(byte i) {
        anInt3408++;
        if (aClass330_Sub1Array3405 != null) {
            if (i != -43)
                aCalendar3413 = null;
            for (int i_15_ = 0; ((aClass330_Sub1Array3405.length ^ 0xffffffff) < (i_15_ ^ 0xffffffff)); i_15_++) {
                if (aClass330_Sub1Array3405[i_15_] != null)
                    aClass330_Sub1Array3405[i_15_].method3391(i ^ ~0x28);
            }
            for (int i_16_ = 0; aClass330_Sub1Array3405.length > i_16_; i_16_++) {
                if (aClass330_Sub1Array3405[i_16_] != null)
                    aClass330_Sub1Array3405[i_16_].method3388(0);
            }
        }
    }

    Class290(Class323 class323, Class77 class77, BigInteger biginteger, BigInteger biginteger_17_) {
        aBigInteger3407 = biginteger;
        aBigInteger3419 = biginteger_17_;
        aClass323_3412 = class323;
        aClass77_3406 = class77;
        if (!aClass323_3412.method3356(0))
            aClass248_Sub8_Sub13_Sub1_3411 = aClass323_3412.method3355(true, (byte) 0, 255, 255, 22013);
    }
}
