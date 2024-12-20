/* Class248_Sub8_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub2 extends Node_Sub8 {
    static int anInt8909;
    static int anInt8910;
    static int anInt8911;
    private int anInt8912;
    private byte[][] aByteArrayArray8913;
    static boolean aBoolean8914 = false;
    static Class293 aClass293_8915 = new Class293();
    static int anInt8916;
    static int anInt8917;
    static boolean aBoolean8918 = false;
    Class362[] aClass362Array8919;

    final boolean method2035(int i, int i_0_) {
        if (i_0_ > -2)
            return false;
        anInt8911++;
        return (((Class362) ((Node_Sub8_Sub2) this).aClass362Array8919[i]).aBoolean4468);
    }

    final boolean method2036(int i) {
        anInt8917++;
        if (((Node_Sub8_Sub2) this).aClass362Array8919 != null)
            return true;
        if (aByteArrayArray8913 == null) {
            synchronized (Node_Sub42.aClass381_7299) {
                if (!Node_Sub42.aClass381_7299.method3906(-14491, anInt8912))
                    return false;
                int[] is = Node_Sub42.aClass381_7299.method3918(anInt8912, i ^ ~0x3b);
                aByteArrayArray8913 = new byte[is.length][];
                for (int i_1_ = 0; (is.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++)
                    aByteArrayArray8913[i_1_] = Node_Sub42.aClass381_7299.method3922((byte) 120, anInt8912, is[i_1_]);
            }
        }
        boolean bool = true;
        for (int i_2_ = i; (aByteArrayArray8913.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
            byte[] is = aByteArrayArray8913[i_2_];
            ByteStream class248_sub9 = new ByteStream(is);
            ((ByteStream) class248_sub9).offset = 1;
            int i_3_ = class248_sub9.readShort(-1);
            synchronized (Class109.aClass381_1371) {
                bool &= Class109.aClass381_1371.method3920(i_3_, 61);
            }
        }
        if (!bool)
            return false;
        Class293 class293 = new Class293();
        int[] is;
        synchronized (Node_Sub42.aClass381_7299) {
            int i_4_ = Node_Sub42.aClass381_7299.method3899(anInt8912, 0);
            ((Node_Sub8_Sub2) this).aClass362Array8919 = new Class362[i_4_];
            is = Node_Sub42.aClass381_7299.method3918(anInt8912, 90);
        }
        for (int i_5_ = 0; is.length > i_5_; i_5_++) {
            byte[] is_6_ = aByteArrayArray8913[i_5_];
            ByteStream class248_sub9 = new ByteStream(is_6_);
            ((ByteStream) class248_sub9).offset = 1;
            int i_7_ = class248_sub9.readShort(-1);
            Node_Sub19 class248_sub19 = null;
            for (Node_Sub19 class248_sub19_8_ = (Node_Sub19) class293.method3119(i ^ 0x2); class248_sub19_8_ != null; class248_sub19_8_ = (Node_Sub19) class293.method3107(-127)) {
                if ((((Node_Sub19) class248_sub19_8_).anInt7037 ^ 0xffffffff) == (i_7_ ^ 0xffffffff)) {
                    class248_sub19 = class248_sub19_8_;
                    break;
                }
            }
            if (class248_sub19 == null) {
                synchronized (Class109.aClass381_1371) {
                    class248_sub19 = new Node_Sub19(i_7_, Class109.aClass381_1371.method3930(-1, i_7_));
                }
                class293.method3109(class248_sub19, -92);
            }
            ((Node_Sub8_Sub2) this).aClass362Array8919[is[i_5_]] = new Class362(is_6_, class248_sub19);
        }
        aByteArrayArray8913 = null;
        return true;
    }

    final boolean method2037(int i, int i_9_) {
        if (i != 1)
            return false;
        anInt8909++;
        return (((Class362) ((Node_Sub8_Sub2) this).aClass362Array8919[i_9_]).aBoolean4469);
    }

    static final void method2038(Class174 class174, Class381 class381, byte i) {
        Class282_Sub2.aString7613 = "";
        anInt8910++;
        Class140.aClass174_1661 = class174;
        if (i >= -4)
            method2038(null, null, (byte) -24);
        Class264.aClass381_2988 = class381;
        if (!Class64.aString871.startsWith("win")) {
            if (Class64.aString871.startsWith("linux"))
                Class282_Sub2.aString7613 += "linux/";
            else if (Class64.aString871.startsWith("mac"))
                Class282_Sub2.aString7613 += "macos/";
        } else
            Class282_Sub2.aString7613 += "windows/";
        if (!((Class174) Class140.aClass174_1661).aBoolean2047) {
            if (!Class64.aString874.startsWith("amd64") && !Class64.aString874.startsWith("x86_64")) {
                if (Class64.aString874.startsWith("i386") || Class64.aString874.startsWith("i486") || Class64.aString874.startsWith("i586") || Class64.aString874.startsWith("x86"))
                    Class282_Sub2.aString7613 += "x86/";
                else if (!Class64.aString874.startsWith("ppc"))
                    Class282_Sub2.aString7613 += "universal/";
                else
                    Class282_Sub2.aString7613 += "ppc/";
            } else
                Class282_Sub2.aString7613 += "x86_64/";
        } else
            Class282_Sub2.aString7613 += "msjava/";
    }

    public static void method2039(int i) {
        aClass293_8915 = null;
        if (i >= -6)
            method2038(null, null, (byte) 66);
    }

    final boolean method2040(int i, int i_10_) {
        if (i != 1)
            method2035(42, -18);
        anInt8916++;
        return (((Class362) ((Node_Sub8_Sub2) this).aClass362Array8919[i_10_]).aBoolean4458);
    }

    Node_Sub8_Sub2(int i) {
        anInt8912 = i;
    }
}
