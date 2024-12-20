/* Class326 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class326 implements d {
    static int anInt4806;
    static int anInt4807;
    static int anInt4808;
    private Class381 aClass381_4809;
    private int anInt4810;
    static int anInt4811;
    static int anInt4812;
    static int anInt4813;
    private Class381 aClass381_4814;
    static int anInt4815;
    static int anInt4816;
    private Class312[] aClass312Array4817;
    private Class365 aClass365_4818 = new Class365(256);
    static int[] anIntArray4819 = new int[1];
    static OutgoingOpcode aOutgoingOpcode_4820 = new OutgoingOpcode(23, 11);
    static OutgoingOpcode aOutgoingOpcode_4821 = new OutgoingOpcode(81, 2);

    public final boolean method23(int i, int i_0_) {
        anInt4815++;
        Node_Sub8_Sub12 class248_sub8_sub12 = method3363(false, i);
        if (i_0_ != -32345)
            aClass381_4814 = null;
        if (class248_sub8_sub12 == null || !class248_sub8_sub12.method2090(this, aClass381_4809, true))
            return false;
        return true;
    }

    public final int[] method24(int i, int i_1_, float f, boolean bool, int i_2_, int i_3_) {
        if (i > -116)
            anInt4810 = -125;
        anInt4816++;
        return (method3363(false, i_2_).method2092(i_3_, (byte) -107, bool, (double) f, aClass381_4809, this, i_1_, ((Class312) aClass312Array4817[i_2_]).aBoolean3635));
    }

    public final float[] method28(int i, boolean bool, int i_4_, int i_5_, float f, int i_6_) {
        anInt4808++;
        if (i_6_ != -2202)
            method25(69, (byte) -86);
        return method3363(false, i_5_).method2089((((Class312) aClass312Array4817[i_5_]).aBoolean3635), (byte) -102, i, this, aClass381_4809, i_4_);
    }

    private final Node_Sub8_Sub12 method3363(boolean bool, int i) {
        if (bool != false)
            method3364(-117);
        anInt4812++;
        Node_Sub8 class248_sub8 = aClass365_4818.method3826((long) i, -1);
        if (class248_sub8 != null)
            return (Node_Sub8_Sub12) class248_sub8;
        byte[] is = aClass381_4814.method3930(-1, i);
        if (is == null)
            return null;
        Node_Sub8_Sub12 class248_sub8_sub12 = new Node_Sub8_Sub12(new ByteStream(is));
        aClass365_4818.method3825((long) i, (byte) 112, class248_sub8_sub12);
        return class248_sub8_sub12;
    }

    public static void method3364(int i) {
        anIntArray4819 = null;
        if (i != 0)
            method3364(-80);
        aOutgoingOpcode_4820 = null;
        aOutgoingOpcode_4821 = null;
    }

    public final int method26(int i) {
        if (i != 31363)
            method27(false, (byte) -51, -50, 8, 0.12729302F, 69);
        anInt4811++;
        return anInt4810;
    }

    public final Class312 method25(int i, byte i_7_) {
        if (i_7_ < 123)
            return null;
        anInt4806++;
        return aClass312Array4817[i];
    }

    public final int[] method27(boolean bool, byte i, int i_8_, int i_9_, float f, int i_10_) {
        anInt4813++;
        int i_11_ = 86 % ((-9 - i) / 59);
        return (method3363(false, i_10_).method2088((byte) 97, this, i_8_, aClass381_4809, (double) f, i_9_, ((Class312) aClass312Array4817[i_10_]).aBoolean3635));
    }

    Class326(Class381 class381, Class381 class381_12_, Class381 class381_13_) {
        aClass381_4814 = class381_12_;
        aClass381_4809 = class381_13_;
        ByteStream class248_sub9 = new ByteStream(class381.method3922((byte) 116, 0, 0));
        anInt4810 = class248_sub9.readShort(-1);
        aClass312Array4817 = new Class312[anInt4810];
        for (int i = 0; (i ^ 0xffffffff) > (anInt4810 ^ 0xffffffff); i++) {
            if (class248_sub9.readUnsignedByte((byte) -79) == 1)
                aClass312Array4817[i] = new Class312();
        }
        for (int i = 0; i < anInt4810; i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aBoolean3622 = class248_sub9.readUnsignedByte((byte) 71) == 0;
        }
        for (int i = 0; i < anInt4810; i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aBoolean3636 = ((class248_sub9.readUnsignedByte((byte) 110) ^ 0xffffffff) == -2);
        }
        for (int i = 0; (i ^ 0xffffffff) > (anInt4810 ^ 0xffffffff); i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aBoolean3631 = class248_sub9.readUnsignedByte((byte) 123) == 1;
        }
        for (int i = 0; (i ^ 0xffffffff) > (anInt4810 ^ 0xffffffff); i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aByte3625 = class248_sub9.readByte(58);
        }
        for (int i = 0; anInt4810 > i; i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aByte3630 = class248_sub9.readByte(50);
        }
        for (int i = 0; anInt4810 > i; i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aByte3624 = class248_sub9.readByte(40);
        }
        for (int i = 0; (i ^ 0xffffffff) > (anInt4810 ^ 0xffffffff); i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aByte3646 = class248_sub9.readByte(91);
        }
        for (int i = 0; i < anInt4810; i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aShort3634 = (short) class248_sub9.readShort(-1);
        }
        for (int i = 0; i < anInt4810; i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aByte3643 = class248_sub9.readByte(61);
        }
        for (int i = 0; i < anInt4810; i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aByte3642 = class248_sub9.readByte(79);
        }
        for (int i = 0; anInt4810 > i; i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aBoolean3638 = class248_sub9.readUnsignedByte((byte) 90) == 1;
        }
        for (int i = 0; i < anInt4810; i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aBoolean3635 = class248_sub9.readUnsignedByte((byte) 99) == 1;
        }
        for (int i = 0; i < anInt4810; i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aByte3623 = class248_sub9.readByte(83);
        }
        for (int i = 0; (i ^ 0xffffffff) > (anInt4810 ^ 0xffffffff); i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aBoolean3632 = ((class248_sub9.readUnsignedByte((byte) -73) ^ 0xffffffff) == -2);
        }
        for (int i = 0; i < anInt4810; i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aBoolean3639 = class248_sub9.readUnsignedByte((byte) 94) == 1;
        }
        for (int i = 0; (i ^ 0xffffffff) > (anInt4810 ^ 0xffffffff); i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).aBoolean3626 = class248_sub9.readUnsignedByte((byte) -96) == 1;
        }
        for (int i = 0; (anInt4810 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).anInt3633 = class248_sub9.readUnsignedByte((byte) 114);
        }
        for (int i = 0; anInt4810 > i; i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).anInt3645 = class248_sub9.readInt(false);
        }
        for (int i = 0; i < anInt4810; i++) {
            if (aClass312Array4817[i] != null)
                ((Class312) aClass312Array4817[i]).anInt3629 = class248_sub9.readUnsignedByte((byte) -73);
        }
    }
}
