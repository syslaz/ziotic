/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Class323 {
    static int anInt3789;
    static int anInt3790;
    static int anInt3791;
    static int anInt3792;
    static int anInt3793;
    static int anInt3794;
    static int anInt3795;
    static Class128 aClass128_3796;
    static int anInt3797;
    static int anInt3798;
    static int anInt3799;
    static int anInt3800;
    static int anInt3801;
    static int anInt3802;
    static int anInt3803;
    static Node_Sub8_Sub11 aClass248_Sub8_Sub11_3804;
    private Class64 aClass64_3805 = new Class64();
    static int anInt3806;
    private Class64 aClass64_3807 = new Class64();
    static float[] aFloatArray3808 = new float[16];
    static int anInt3809;
    private Class64 aClass64_3810 = new Class64();
    private Class64 aClass64_3811 = new Class64();
    private Class239 aClass239_3812;
    private int anInt3813;
    private ByteStream aClass248_Sub9_3814 = new ByteStream(4);
    private long aLong3815;
    private byte aByte3816 = 0;
    private ByteStream aClass248_Sub9_3817;
    volatile int anInt3818 = 0;
    volatile int anInt3819 = 0;
    private Node_Sub8_Sub13_Sub1 aClass248_Sub8_Sub13_Sub1_3820;

    public static void method3342(byte i) {
        aFloatArray3808 = null;
        aClass128_3796 = null;
        if (i == -127)
            aClass248_Sub8_Sub11_3804 = null;
    }

    final boolean method3343(byte i) {
        anInt3790++;
        if (aClass239_3812 != null) {
            long l = Class118.method1112(116);
            int i_0_ = (int) (l + -aLong3815);
            aLong3815 = l;
            if ((i_0_ ^ 0xffffffff) < -201)
                i_0_ = 200;
            anInt3813 += i_0_;
            if (anInt3813 > 30000) {
                try {
                    aClass239_3812.method1914((byte) -85);
                } catch (Exception exception) {
                    /* empty */
                }
                aClass239_3812 = null;
            }
        }
        if (aClass239_3812 == null) {
            if ((method3353(i + 99) ^ 0xffffffff) != -1 || method3354(i ^ 0x4031) != 0)
                return false;
            return true;
        }
        try {
            aClass239_3812.method1915(0);
            for (Node_Sub8_Sub13_Sub1 class248_sub8_sub13_sub1 = (Node_Sub8_Sub13_Sub1) aClass64_3805.method492(896); class248_sub8_sub13_sub1 != null; class248_sub8_sub13_sub1 = ((Node_Sub8_Sub13_Sub1) aClass64_3805.method490(true))) {
                ((ByteStream) aClass248_Sub9_3814).offset = 0;
                aClass248_Sub9_3814.writeByte(i + 70, 1);
                aClass248_Sub9_3814.method2185((byte) -56, (int) (((Node_Sub8) class248_sub8_sub13_sub1).aLong6870));
                aClass239_3812.method1912(-5324, ((ByteStream) aClass248_Sub9_3814).buffer, 0, 4);
                aClass64_3807.method491(class248_sub8_sub13_sub1, -114);
            }
            if (i != -99)
                method3354(-104);
            for (Node_Sub8_Sub13_Sub1 class248_sub8_sub13_sub1 = ((Node_Sub8_Sub13_Sub1) aClass64_3810.method492(i + 995)); class248_sub8_sub13_sub1 != null; class248_sub8_sub13_sub1 = ((Node_Sub8_Sub13_Sub1) aClass64_3810.method490(true))) {
                ((ByteStream) aClass248_Sub9_3814).offset = 0;
                aClass248_Sub9_3814.writeByte(i + 65, 0);
                aClass248_Sub9_3814.method2185((byte) -56, (int) (((Node_Sub8) class248_sub8_sub13_sub1).aLong6870));
                aClass239_3812.method1912(-5324, ((ByteStream) aClass248_Sub9_3814).buffer, 0, 4);
                aClass64_3811.method491(class248_sub8_sub13_sub1, -106);
            }
            for (int i_1_ = 0; i_1_ < 100; i_1_++) {
                int i_2_ = aClass239_3812.method1920((byte) 118);
                if (i_2_ < 0)
                    throw new IOException();
                if ((i_2_ ^ 0xffffffff) == -1)
                    break;
                anInt3813 = 0;
                int i_3_ = 0;
                if (aClass248_Sub8_Sub13_Sub1_3820 == null)
                    i_3_ = 8;
                else if ((((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).anInt10248 ^ 0xffffffff) == -1)
                    i_3_ = 1;
                if ((i_3_ ^ 0xffffffff) < -1) {
                    int i_4_ = (i_3_ - ((ByteStream) aClass248_Sub9_3817).offset);
                    if (i_2_ < i_4_)
                        i_4_ = i_2_;
                    aClass239_3812.method1916(((ByteStream) aClass248_Sub9_3817).buffer, i_4_, ((ByteStream) aClass248_Sub9_3817).offset, (byte) 104);
                    if (aByte3816 != 0) {
                        for (int i_5_ = 0; (i_4_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++)
                            ((ByteStream) aClass248_Sub9_3817).buffer[i_5_ + (((ByteStream) aClass248_Sub9_3817).offset)] = (byte) (Class316_Sub1.method3291((((ByteStream) aClass248_Sub9_3817).buffer[i_5_ + (((ByteStream) aClass248_Sub9_3817).offset)]), aByte3816));
                    }
                    ((ByteStream) aClass248_Sub9_3817).offset += i_4_;
                    if (i_3_ <= ((ByteStream) aClass248_Sub9_3817).offset) {
                        if (aClass248_Sub8_Sub13_Sub1_3820 == null) {
                            ((ByteStream) aClass248_Sub9_3817).offset = 0;
                            int i_6_ = aClass248_Sub9_3817.readUnsignedByte((byte) -123);
                            int i_7_ = aClass248_Sub9_3817.readShort(-1);
                            int i_8_ = aClass248_Sub9_3817.readUnsignedByte((byte) -60);
                            int i_9_ = aClass248_Sub9_3817.readInt(false);
                            int i_10_ = i_8_ & 0x7f;
                            boolean bool = (0x80 & i_8_) != 0;
                            long l = (long) (i_7_ + (i_6_ << 791635888));
                            Object object = null;
                            Node_Sub8_Sub13_Sub1 class248_sub8_sub13_sub1;
                            if (bool) {
                                for (class248_sub8_sub13_sub1 = ((Node_Sub8_Sub13_Sub1) aClass64_3811.method492(i ^ ~0x3e2)); class248_sub8_sub13_sub1 != null; class248_sub8_sub13_sub1 = ((Node_Sub8_Sub13_Sub1) aClass64_3811.method490(true))) {
                                    if (l == (((Node_Sub8) class248_sub8_sub13_sub1).aLong6870))
                                        break;
                                }
                            } else {
                                for (class248_sub8_sub13_sub1 = ((Node_Sub8_Sub13_Sub1) aClass64_3807.method492(896)); class248_sub8_sub13_sub1 != null; class248_sub8_sub13_sub1 = ((Node_Sub8_Sub13_Sub1) aClass64_3807.method490(true))) {
                                    if ((((Node_Sub8) class248_sub8_sub13_sub1).aLong6870 ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL))
                                        break;
                                }
                            }
                            if (class248_sub8_sub13_sub1 == null)
                                throw new IOException();
                            int i_11_ = (i_10_ ^ 0xffffffff) != -1 ? 9 : 5;
                            aClass248_Sub8_Sub13_Sub1_3820 = class248_sub8_sub13_sub1;
                            ((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250 = (new ByteStream(i_11_ + i_9_ + (((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aByte10243)));
                            ((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250.writeByte(i ^ 0x42, i_10_);
                            ((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250.writeInt(27695, i_9_);
                            ((ByteStream) aClass248_Sub9_3817).offset = 0;
                            ((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).anInt10248 = 8;
                        } else if (((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).anInt10248 == 0) {
                            if ((((ByteStream) aClass248_Sub9_3817).buffer[0]) != -1)
                                aClass248_Sub8_Sub13_Sub1_3820 = null;
                            else {
                                ((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).anInt10248 = 1;
                                ((ByteStream) aClass248_Sub9_3817).offset = 0;
                            }
                        } else
                            throw new IOException();
                    }
                } else {
                    int i_12_ = (-((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aByte10243 + ((ByteStream) (((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250)).buffer.length);
                    int i_13_ = 512 - ((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).anInt10248;
                    if (i_13_ > i_12_ - ((ByteStream) (((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250)).offset)
                        i_13_ = i_12_ - ((ByteStream) (((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250)).offset;
                    if (i_2_ < i_13_)
                        i_13_ = i_2_;
                    aClass239_3812.method1916((((ByteStream) (((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250)).buffer), i_13_, ((ByteStream) (((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250)).offset, (byte) -69);
                    if ((aByte3816 ^ 0xffffffff) != -1) {
                        for (int i_14_ = 0; (i_13_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++)
                            ((ByteStream) (((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250)).buffer[i_14_ + ((ByteStream) (((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250)).offset] = (byte) (Class316_Sub1.method3291((((ByteStream) (((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250)).buffer[(i_14_ + (((ByteStream) (((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250)).offset))]), aByte3816));
                    }
                    ((ByteStream) (((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250)).offset += i_13_;
                    ((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).anInt10248 += i_13_;
                    if (i_12_ == (((ByteStream) (((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).aClass248_Sub9_10250)).offset)) {
                        aClass248_Sub8_Sub13_Sub1_3820.method2021((byte) -26);
                        ((Node_Sub8_Sub13) aClass248_Sub8_Sub13_Sub1_3820).aBoolean9024 = false;
                        aClass248_Sub8_Sub13_Sub1_3820 = null;
                    } else if ((((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).anInt10248 ^ 0xffffffff) == -513)
                        ((Node_Sub8_Sub13_Sub1) aClass248_Sub8_Sub13_Sub1_3820).anInt10248 = 0;
                }
            }
            return true;
        } catch (IOException ioexception) {
            try {
                aClass239_3812.method1914((byte) -85);
            } catch (Exception exception) {
                /* empty */
            }
            aClass239_3812 = null;
            ((Class323) this).anInt3819 = -2;
            ((Class323) this).anInt3818++;
            if (method3353(0) != 0 || method3354(-16468) != 0)
                return false;
            return true;
        }
    }

    final void method3344(byte i) {
        anInt3809++;
        if (aClass239_3812 != null)
            aClass239_3812.method1914((byte) -85);
        if (i >= -81)
            aClass128_3796 = null;
    }

    final void method3345(byte i) {
        anInt3799++;
        if (i == 70) {
            if (aClass239_3812 != null)
                aClass239_3812.method1918(0);
        }
    }

    final boolean method3346(int i) {
        if (i < 38)
            aClass239_3812 = null;
        anInt3798++;
        if (method3354(-16468) < 20)
            return false;
        return true;
    }

    final void method3347(int i) {
        anInt3800++;
        if (aClass239_3812 != null) {
            if (i != 1)
                method3351(71);
            try {
                ((ByteStream) aClass248_Sub9_3814).offset = 0;
                aClass248_Sub9_3814.writeByte(-124, 7);
                aClass248_Sub9_3814.method2185((byte) -56, 0);
                aClass239_3812.method1912(-5324, ((ByteStream) aClass248_Sub9_3814).buffer, 0, 4);
            } catch (IOException ioexception) {
                try {
                    aClass239_3812.method1914((byte) -85);
                } catch (Exception exception) {
                    /* empty */
                }
                ((Class323) this).anInt3818++;
                aClass239_3812 = null;
                ((Class323) this).anInt3819 = -2;
            }
        }
    }

    final void method3348(byte i, boolean bool) {
        anInt3806++;
        if (aClass239_3812 != null) {
            try {
                int i_15_ = -102 / ((16 - i) / 37);
                ((ByteStream) aClass248_Sub9_3814).offset = 0;
                aClass248_Sub9_3814.writeByte(-65, !bool ? 3 : 2);
                aClass248_Sub9_3814.method2185((byte) -56, 0);
                aClass239_3812.method1912(-5324, ((ByteStream) aClass248_Sub9_3814).buffer, 0, 4);
            } catch (IOException ioexception) {
                try {
                    aClass239_3812.method1914((byte) -85);
                } catch (Exception exception) {
                    /* empty */
                }
                aClass239_3812 = null;
                ((Class323) this).anInt3818++;
                ((Class323) this).anInt3819 = -2;
            }
        }
    }

    final void method3349(boolean bool, Class239 class239, int i) {
        if (aClass239_3812 != null) {
            try {
                aClass239_3812.method1914((byte) -85);
            } catch (Exception exception) {
                /* empty */
            }
            aClass239_3812 = null;
        }
        anInt3793++;
        aClass239_3812 = class239;
        method3351(11);
        method3348((byte) -105, bool);
        ((ByteStream) aClass248_Sub9_3817).offset = 0;
        aClass248_Sub8_Sub13_Sub1_3820 = null;
        for (; ; ) {
            Node_Sub8_Sub13_Sub1 class248_sub8_sub13_sub1 = (Node_Sub8_Sub13_Sub1) aClass64_3807.method497(896);
            if (class248_sub8_sub13_sub1 == null)
                break;
            aClass64_3805.method491(class248_sub8_sub13_sub1, i ^ ~0x72);
        }
        for (; ; ) {
            Node_Sub8_Sub13_Sub1 class248_sub8_sub13_sub1 = (Node_Sub8_Sub13_Sub1) aClass64_3811.method497(896);
            if (class248_sub8_sub13_sub1 == null)
                break;
            aClass64_3810.method491(class248_sub8_sub13_sub1, -114);
        }
        if (aByte3816 != 0) {
            try {
                ((ByteStream) aClass248_Sub9_3814).offset = 0;
                aClass248_Sub9_3814.writeByte(-121, 4);
                aClass248_Sub9_3814.writeByte(-58, aByte3816);
                aClass248_Sub9_3814.writeShort(1182, 0);
                aClass239_3812.method1912(i ^ ~0x14cf, ((ByteStream) aClass248_Sub9_3814).buffer, 0, 4);
            } catch (IOException ioexception) {
                try {
                    aClass239_3812.method1914((byte) -85);
                } catch (Exception exception) {
                    /* empty */
                }
                aClass239_3812 = null;
                ((Class323) this).anInt3819 = -2;
                ((Class323) this).anInt3818++;
            }
        }
        if (i != 4)
            method3354(-93);
        anInt3813 = 0;
        aLong3815 = Class118.method1112(i ^ 0x70);
    }

    static final Class165 method3350(ByteStream class248_sub9, int i) {
        anInt3797++;
        String string = class248_sub9.readString(15598);
        Class186 class186 = (Class136_Sub2.method1259(-1)[class248_sub9.readUnsignedByte((byte) 127)]);
        Class272 class272 = Class359.method3805(-12865)[class248_sub9.readUnsignedByte((byte) 84)];
        if (i != 8916)
            aClass248_Sub8_Sub11_3804 = null;
        int i_16_ = class248_sub9.readUnsignedShort((byte) -10);
        int i_17_ = class248_sub9.readUnsignedShort((byte) -10);
        int i_18_ = class248_sub9.readUnsignedByte((byte) -66);
        int i_19_ = class248_sub9.readUnsignedByte((byte) 86);
        int i_20_ = class248_sub9.readUnsignedByte((byte) -21);
        int i_21_ = class248_sub9.readShort(-1);
        int i_22_ = class248_sub9.readShort(i ^ ~0x22d4);
        int i_23_ = class248_sub9.readInt(false);
        int i_24_ = class248_sub9.readInt(false);
        int i_25_ = class248_sub9.readInt(false);
        return new Class165(string, class186, class272, i_16_, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_);
    }

    private final void method3351(int i) {
        anInt3801++;
        if (aClass239_3812 != null && i > 0) {
            try {
                ((ByteStream) aClass248_Sub9_3814).offset = 0;
                aClass248_Sub9_3814.writeByte(-85, 6);
                aClass248_Sub9_3814.method2185((byte) -56, 3);
                aClass239_3812.method1912(-5324, ((ByteStream) aClass248_Sub9_3814).buffer, 0, 4);
            } catch (IOException ioexception) {
                try {
                    aClass239_3812.method1914((byte) -85);
                } catch (Exception exception) {
                    /* empty */
                }
                ((Class323) this).anInt3818++;
                ((Class323) this).anInt3819 = -2;
                aClass239_3812 = null;
            }
        }
    }

    final void method3352(byte i) {
        try {
            aClass239_3812.method1914((byte) -85);
        } catch (Exception exception) {
            /* empty */
        }
        anInt3802++;
        ((Class323) this).anInt3819 = -1;
        if (i < 66)
            method3354(7);
        ((Class323) this).anInt3818++;
        aClass239_3812 = null;
        aByte3816 = (byte) (int) (1.0 + 255.0 * Math.random());
    }

    final int method3353(int i) {
        anInt3795++;
        if (i != 0)
            method3351(0);
        return aClass64_3805.method494(55) + aClass64_3807.method494(32);
    }

    private final int method3354(int i) {
        anInt3794++;
        if (i != -16468)
            return 57;
        return aClass64_3810.method494(31) - -aClass64_3811.method494(18);
    }

    final Node_Sub8_Sub13_Sub1 method3355(boolean bool, byte i, int i_26_, int i_27_, int i_28_) {
        anInt3803++;
        long l = (long) ((i_26_ << 1938247248) + i_27_);
        Node_Sub8_Sub13_Sub1 class248_sub8_sub13_sub1 = new Node_Sub8_Sub13_Sub1();
        ((Node_Sub8_Sub13) class248_sub8_sub13_sub1).aBoolean9027 = bool;
        if (i_28_ != 22013)
            return null;
        ((Node_Sub8_Sub13_Sub1) class248_sub8_sub13_sub1).aByte10243 = i;
        ((Node_Sub8) class248_sub8_sub13_sub1).aLong6870 = l;
        if (bool) {
            if (method3353(i_28_ ^ 0x55fd) >= 20)
                throw new RuntimeException();
            aClass64_3805.method491(class248_sub8_sub13_sub1, -127);
        } else {
            if (method3354(-16468) >= 20)
                throw new RuntimeException();
            aClass64_3810.method491(class248_sub8_sub13_sub1, -107);
        }
        return class248_sub8_sub13_sub1;
    }

    final boolean method3356(int i) {
        if (i != 0)
            return false;
        anInt3792++;
        if (method3353(i) < 20)
            return false;
        return true;
    }

    public Class323() {
        aClass248_Sub9_3817 = new ByteStream(8);
    }

    static {
        anInt3791 = 0;
        aClass128_3796 = new Class128(0, 4);
    }
}
