/* Class282_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub28 extends Class282 {
    static int anInt7880;
    static IncommingOpcode aIncommingOpcode_7881 = new IncommingOpcode(16, 2);
    static int anInt7882;
    static int anInt7883;
    static int anInt7884;
    static int anInt7885;
    static int anInt7886;
    static int[] anIntArray7887;
    static int anInt7888;
    static int anInt7889;
    static int anInt7890;
    static OutgoingOpcode aOutgoingOpcode_7891 = new OutgoingOpcode(59, 3);
    static int anInt7892;
    static IncommingOpcode aIncommingOpcode_7893 = new IncommingOpcode(6, 2);
    static Class264 aClass264_7894;
    static int anInt7895 = -50;

    final void method2918(byte i) {
        if (i != 98)
            method2919(true);
        anInt7880++;
        if (((Class282) this).anInt3320 != 0 && (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub25_7345.method3026(true) ^ 0xffffffff) != -2)
            ((Class282) this).anInt3320 = 0;
        if (((Class282) this).anInt3320 < 0 || ((Class282) this).anInt3320 > 1)
            ((Class282) this).anInt3320 = method2919(false);
    }

    static final int method3038(byte[] is, String string, int i, int i_0_) {
        anInt7884++;
        if (i_0_ != 1)
            aIncommingOpcode_7881 = null;
        int i_1_ = i;
        int i_2_ = string.length();
        for (int i_3_ = 0; i_3_ < i_2_; i_3_ += 4) {
            int i_4_ = Class139.method1278(string.charAt(i_3_), 5041);
            int i_5_ = ((1 + i_3_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff) ? Class139.method1278(string.charAt(1 + i_3_), 5041) : -1);
            int i_6_ = (2 + i_3_ >= i_2_ ? -1 : Class139.method1278(string.charAt(2 + i_3_), 5041));
            int i_7_ = (i_2_ > i_3_ + 3 ? Class139.method1278(string.charAt(3 + i_3_), i_0_ ^ 0x13b0) : -1);
            is[i++] = (byte) Class358.retrieveLooksSettings(i_5_ >>> -2111674908, i_4_ << 1385912802);
            if ((i_6_ ^ 0xffffffff) == 0)
                break;
            is[i++] = (byte) Class358.retrieveLooksSettings((Class112.method794(15, i_5_) << 538115908), i_6_ >>> 190955938);
            if (i_7_ == -1)
                break;
            is[i++] = (byte) (Class358.retrieveLooksSettings(Class112.method794(i_6_ << -1232929690, 192), i_7_));
        }
        return -i_1_ + i;
    }

    public static void method3039(byte i) {
        aIncommingOpcode_7893 = null;
        aOutgoingOpcode_7891 = null;
        aClass264_7894 = null;
        int i_8_ = -23 % ((-74 - i) / 45);
        aIncommingOpcode_7881 = null;
        anIntArray7887 = null;
    }

    final int method3040(boolean bool) {
        if (bool != true)
            aClass264_7894 = null;
        anInt7890++;
        return ((Class282) this).anInt3320;
    }

    Class282_Sub28(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final boolean method3041(int i) {
        anInt7889++;
        if (i != 260)
            return true;
        return true;
    }

    static final void method3042(int i, ByteStream class248_sub9, int i_9_) {
        if (Class250.aClass46_2824 != null) {
            try {
                Class250.aClass46_2824.method334((byte) -66, 0L);
                Class250.aClass46_2824.method335(false, 24, (((ByteStream) class248_sub9).buffer), i);
            } catch (Exception exception) {
                /* empty */
            }
        }
        anInt7892++;
        if (i_9_ < 73)
            method3044(-96, -92, 111, -49, 114, null, -92, 11);
    }

    static final void method3043(int i) {
        anInt7883++;
        Node_Sub14_Sub21.anInt9378 = Class282_Sub15.anInt7752 = Class42.anInt548 = IncommingOpcode.anInt1478 = 0;
        if (i >= -121)
            aClass264_7894 = null;
    }

    final void method2922(boolean bool, int i) {
        ((Class282) this).anInt3320 = i;
        if (bool == true)
            anInt7886++;
    }

    Class282_Sub28(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    final int method2917(int i, int i_10_) {
        anInt7882++;
        if (i == i_10_ || (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub25_7345.method3026(true) ^ 0xffffffff) == -2)
            return 1;
        return 2;
    }

    final int method2919(boolean bool) {
        anInt7885++;
        if (bool != false)
            method3044(-127, 119, 6, -110, -18, null, 9, -32);
        return 1;
    }

    static final void method3044(int i, int i_11_, int i_12_, int i_13_, int i_14_, String string, int i_15_, int i_16_) {
        if (i_14_ > -59)
            method3042(100, null, 82);
        anInt7888++;
        Class346_Sub1 class346_sub1 = new Class346_Sub1();
        ((Class346_Sub1) class346_sub1).anInt8249 = i_13_;
        ((Class346_Sub1) class346_sub1).anInt8254 = i_16_;
        ((Class346_Sub1) class346_sub1).anInt8253 = i;
        ((Class346_Sub1) class346_sub1).aString8243 = string;
        ((Class346_Sub1) class346_sub1).anInt8244 = i_12_;
        ((Class346_Sub1) class346_sub1).anInt8246 = i_11_ + Node_Sub18.anInt7027;
        ((Class346_Sub1) class346_sub1).anInt8248 = i_15_;
        Class20.aClass360_308.method3811(class346_sub1, 0);
    }

    static {
        aClass264_7894 = new Class264(1);
    }
}
