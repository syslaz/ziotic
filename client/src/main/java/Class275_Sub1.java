/* Class275_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Source;

import java.util.Random;

final class Class275_Sub1 extends Class275 implements Interface18_Impl1 {
    static int anInt8580;
    static int[] anIntArray8581 = new int[500];
    static Random aRandom8582 = new Random();
    static int anInt8583;
    static int anInt8584;
    static int anInt8585;
    static int anInt8586;
    static int anInt8587;
    static int anInt8588;
    static int anInt8589;
    static int anInt8590;
    private byte aByte8591;
    static Class111 aClass111_8592;
    static int anInt8593;

    public final boolean method4(int i) {
        if (i != -13472)
            return false;
        anInt8583++;
        return super.method2841(-104, (((ha_Sub3_Sub1) ((Class275) this).aHa_Sub3_Sub1_5150).aMapBuffer8758));
    }

    public final boolean method5(int i, Source source, int i_0_, int i_1_) {
        anInt8590++;
        if (i_0_ != 24689)
            return true;
        aByte8591 = (byte) i_1_;
        super.method2847(i, source, (byte) 31);
        return true;
    }

    static final void method2848(int i, boolean bool) {
        if (bool == false) {
            anInt8587++;
            Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i, -874792672, 3);
            class248_sub8_sub10.method2076(-52);
        }
    }

    static final void method2849(byte[] is, int i) {
        if (i != 21870)
            aClass111_8592 = null;
        anInt8588++;
        ByteStream class248_sub9 = new ByteStream(is);
        boolean bool = false;
        for (; ; ) {
            int i_2_ = class248_sub9.readUnsignedByte((byte) -124);
            if ((i_2_ ^ 0xffffffff) == -1)
                break;
            if ((i_2_ ^ 0xffffffff) == -2) {
                if (Class188.anIntArray2189 == null) {
                    Class25.anInt344 = 4;
                    Class188.anIntArray2189 = new int[4];
                    Class108.anIntArray1365 = new int[4];
                }
                for (int i_3_ = 0; ((i_3_ ^ 0xffffffff) > (Class188.anIntArray2189.length ^ 0xffffffff)); i_3_++) {
                    Class188.anIntArray2189[i_3_] = class248_sub9.readUnsignedShort((byte) -10);
                    Class108.anIntArray1365[i_3_] = class248_sub9.readUnsignedShort((byte) -10);
                }
                bool = true;
            } else if ((i_2_ ^ 0xffffffff) == -3)
                Class198.anInt2266 = class248_sub9.readShort(-1);
            else if ((i_2_ ^ 0xffffffff) == -4) {
                Class25.anInt344 = class248_sub9.readUnsignedByte((byte) 117);
                Class108.anIntArray1365 = new int[Class25.anInt344];
                Class188.anIntArray2189 = new int[Class25.anInt344];
            }
        }
        if (!bool) {
            if (Class188.anIntArray2189 == null) {
                Class25.anInt344 = 4;
                Class188.anIntArray2189 = new int[4];
                Class108.anIntArray1365 = new int[4];
            }
            for (int i_4_ = 0; ((i_4_ ^ 0xffffffff) > (Class188.anIntArray2189.length ^ 0xffffffff)); i_4_++) {
                Class188.anIntArray2189[i_4_] = 0;
                Class108.anIntArray1365[i_4_] = i_4_ * 20;
            }
        }
    }

    public final int method57(int i) {
        if (i != -1)
            anInt8593 = 78;
        anInt8585++;
        return super.method57(-1);
    }

    public static void method2850(byte i) {
        anIntArray8581 = null;
        aRandom8582 = null;
        aClass111_8592 = null;
        if (i < 1)
            method2850((byte) 23);
    }

    final int method2851(byte i) {
        if (i >= -41)
            aByte8591 = (byte) 5;
        anInt8584++;
        return aByte8591;
    }

    public final boolean method2(int i, int i_5_, int i_6_) {
        anInt8589++;
        aByte8591 = (byte) i;
        if (i_5_ != -30987)
            method2848(85, true);
        super.method48(i_6_, (byte) 102);
        return true;
    }

    Class275_Sub1(ha_Sub3_Sub1 var_ha_Sub3_Sub1, boolean bool) {
        super(var_ha_Sub3_Sub1, 34962, bool);
    }

    public final void method3(boolean bool) {
        super.method3(bool);
        if (bool != false)
            anIntArray8581 = null;
        anInt8580++;
    }

    public final Buffer method1(int i, boolean bool) {
        if (i != -4448)
            aClass111_8592 = null;
        anInt8586++;
        return super.method2843((((ha_Sub3_Sub1) ((Class275) this).aHa_Sub3_Sub1_5150).aMapBuffer8758), (byte) -119, bool);
    }
}
