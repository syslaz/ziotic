/* Class330_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class330_Sub1 extends Class330 {
    private Class209 aClass209_8054;
    static int anInt8055;
    private static char[] aCharArray8056 = new char[64];
    static int anInt8057;
    private Node_Sub8_Sub13 aClass248_Sub8_Sub13_8058;
    static int anInt8059;
    static int anInt8060;
    private byte[] aByteArray8061;
    static int anInt8062;
    static int anInt8063;
    static int anInt8064;
    private int anInt8065;
    static int anInt8066;
    private int anInt8067 = 0;
    static int anInt8068;
    private byte[] aByteArray8069;
    private Class77 aClass77_8070;
    private int anInt8071;
    private Class65 aClass65_8072 = new Class65(16);
    static int anInt8073;
    private int anInt8074;
    static int anInt8075;
    private Class209 aClass209_8076;
    private Class271 aClass271_8077;
    static int anInt8078;
    private Class323 aClass323_8079;
    private int anInt8080 = 0;
    private Class293 aClass293_8081 = new Class293();
    private Class293 aClass293_8082;
    private boolean aBoolean8083;
    private boolean aBoolean8084;
    private long aLong8085 = 0L;
    private boolean aBoolean8086;

    final int method3383(int i) {
        if (i != 9312)
            return 63;
        anInt8078++;
        if (method3379(-65) == null) {
            if (aClass248_Sub8_Sub13_8058 == null)
                return 0;
            return aClass248_Sub8_Sub13_8058.method2096(0);
        }
        return 100;
    }

    final byte[] method3380(int i, int i_0_) {
        anInt8073++;
        Node_Sub8_Sub13 class248_sub8_sub13 = method3385(i, -23661, 0);
        if (class248_sub8_sub13 == null)
            return null;
        byte[] is = class248_sub8_sub13.method2097(i_0_);
        class248_sub8_sub13.remove(true);
        return is;
    }

    final void method3384(int i) {
        anInt8055++;
        if (aClass209_8076 != null) {
            aBoolean8084 = true;
            int i_1_ = 66 / ((i - 9) / 42);
            if (aClass293_8082 == null)
                aClass293_8082 = new Class293();
        }
    }

    private final Node_Sub8_Sub13 method3385(int i, int i_2_, int i_3_) {
        anInt8060++;
        Node_Sub8_Sub13 class248_sub8_sub13 = ((Node_Sub8_Sub13) aClass65_8072.method501((long) i, (byte) 31));
        if (class248_sub8_sub13 != null && i_3_ == 0 && !((Node_Sub8_Sub13) class248_sub8_sub13).aBoolean9027 && ((Node_Sub8_Sub13) class248_sub8_sub13).aBoolean9024) {
            class248_sub8_sub13.remove(true);
            class248_sub8_sub13 = null;
        }
        if (class248_sub8_sub13 == null) {
            if (i_3_ == 0) {
                if (aClass209_8076 == null || aByteArray8061[i] == -1) {
                    if (aClass323_8079.method3356(0))
                        return null;
                    class248_sub8_sub13 = aClass323_8079.method3355(true, (byte) 2, anInt8065, i, 22013);
                } else
                    class248_sub8_sub13 = aClass77_8070.method564(aClass209_8076, -3, i);
            } else if ((i_3_ ^ 0xffffffff) == -2) {
                if (aClass209_8076 == null)
                    throw new RuntimeException();
                class248_sub8_sub13 = aClass77_8070.method568((byte) 127, i, aClass209_8076);
            } else {
                if (i_3_ != 2)
                    throw new RuntimeException();
                if (aClass209_8076 == null)
                    throw new RuntimeException();
                if (aByteArray8061[i] != -1)
                    throw new RuntimeException();
                if (!aClass323_8079.method3346(i_2_ + 23756))
                    class248_sub8_sub13 = aClass323_8079.method3355(false, (byte) 2, anInt8065, i, 22013);
                else
                    return null;
            }
            aClass65_8072.method509(-1, class248_sub8_sub13, (long) i);
        }
        if (((Node_Sub8_Sub13) class248_sub8_sub13).aBoolean9024)
            return null;
        byte[] is = class248_sub8_sub13.method2097(i_2_ ^ i_2_);
        if (class248_sub8_sub13 instanceof Node_Sub8_Sub13_Sub2) {
            try {
                if (is == null || (is.length ^ 0xffffffff) >= -3)
                    throw new RuntimeException();
                Class105.aCRC32_1344.reset();
                Class105.aCRC32_1344.update(is, 0, is.length + -2);
                int i_4_ = (int) Class105.aCRC32_1344.getValue();
                if ((i_4_ ^ 0xffffffff) != (((Class271) aClass271_8077).anIntArray3158[i] ^ 0xffffffff))
                    throw new RuntimeException();
                if (((Class271) aClass271_8077).aByteArrayArray3139 != null && (((Class271) aClass271_8077).aByteArrayArray3139[i] != null)) {
                    byte[] is_5_ = ((Class271) aClass271_8077).aByteArrayArray3139[i];
                    byte[] is_6_ = Class19.method230(0, is, -2 + is.length, 0);
                    for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -65; i_7_++) {
                        if ((is_6_[i_7_] ^ 0xffffffff) != (is_5_[i_7_] ^ 0xffffffff))
                            throw new RuntimeException();
                    }
                }
                int i_8_ = (((is[-2 + is.length] & 0xff) << 1477604264) + (0xff & is[is.length + -1]));
                if ((i_8_ ^ 0xffffffff) != (0xffff & ((Class271) aClass271_8077).anIntArray3143[i] ^ 0xffffffff))
                    throw new RuntimeException();
                if (aByteArray8061[i] != 1) {
                    anInt8067++;
                    aByteArray8061[i] = (byte) 1;
                }
                if (!((Node_Sub8_Sub13) class248_sub8_sub13).aBoolean9027)
                    class248_sub8_sub13.remove(true);
                return class248_sub8_sub13;
            } catch (Exception exception) {
                aByteArray8061[i] = (byte) -1;
                class248_sub8_sub13.remove(true);
                if (((Node_Sub8_Sub13) class248_sub8_sub13).aBoolean9027 && !aClass323_8079.method3356(i_2_ + 23661)) {
                    Node_Sub8_Sub13_Sub1 class248_sub8_sub13_sub1 = aClass323_8079.method3355(true, (byte) 2, anInt8065, i, 22013);
                    aClass65_8072.method509(-1, class248_sub8_sub13_sub1, (long) i);
                }
                return null;
            }
        }
        try {
            if (is == null || is.length <= 2)
                throw new RuntimeException();
            Class105.aCRC32_1344.reset();
            Class105.aCRC32_1344.update(is, 0, is.length - 2);
            int i_9_ = (int) Class105.aCRC32_1344.getValue();
            if ((i_9_ ^ 0xffffffff) != (((Class271) aClass271_8077).anIntArray3158[i] ^ 0xffffffff))
                throw new RuntimeException();
            if (((Class271) aClass271_8077).aByteArrayArray3139 != null && (((Class271) aClass271_8077).aByteArrayArray3139[i] != null)) {
                byte[] is_10_ = ((Class271) aClass271_8077).aByteArrayArray3139[i];
                byte[] is_11_ = Class19.method230(i_2_ ^ ~0x5c6c, is, -2 + is.length, 0);
                for (int i_12_ = 0; i_12_ < 64; i_12_++) {
                    if ((is_10_[i_12_] ^ 0xffffffff) != (is_11_[i_12_] ^ 0xffffffff))
                        throw new RuntimeException();
                }
            }
            ((Class323) aClass323_8079).anInt3818 = 0;
            ((Class323) aClass323_8079).anInt3819 = 0;
        } catch (RuntimeException runtimeexception) {
            aClass323_8079.method3352((byte) 96);
            class248_sub8_sub13.remove(true);
            if (((Node_Sub8_Sub13) class248_sub8_sub13).aBoolean9027 && !aClass323_8079.method3356(0)) {
                Node_Sub8_Sub13_Sub1 class248_sub8_sub13_sub1 = aClass323_8079.method3355(true, (byte) 2, anInt8065, i, 22013);
                aClass65_8072.method509(-1, class248_sub8_sub13_sub1, (long) i);
            }
            return null;
        }
        is[is.length + -2] = (byte) (((Class271) aClass271_8077).anIntArray3143[i] >>> 861428200);
        is[-1 + is.length] = (byte) ((Class271) aClass271_8077).anIntArray3143[i];
        if (aClass209_8076 != null) {
            aClass77_8070.method562(i, aClass209_8076, 1, is);
            if ((aByteArray8061[i] ^ 0xffffffff) != -2) {
                anInt8067++;
                aByteArray8061[i] = (byte) 1;
            }
        }
        if (!((Node_Sub8_Sub13) class248_sub8_sub13).aBoolean9027)
            class248_sub8_sub13.remove(true);
        return class248_sub8_sub13;
    }

    final int method3386(int i) {
        anInt8066++;
        int i_13_ = 108 % ((-2 - i) / 54);
        return anInt8067;
    }

    final int method3387(int i) {
        if (i != 100)
            return 57;
        anInt8057++;
        if (aClass271_8077 == null)
            return 0;
        return ((Class271) aClass271_8077).anInt3146;
    }

    final Class271 method3379(int i) {
        anInt8064++;
        if (aClass271_8077 != null)
            return aClass271_8077;
        if (aClass248_Sub8_Sub13_8058 == null) {
            if (aClass323_8079.method3356(0))
                return null;
            aClass248_Sub8_Sub13_8058 = aClass323_8079.method3355(true, (byte) 0, 255, anInt8065, 22013);
        }
        if (((Node_Sub8_Sub13) aClass248_Sub8_Sub13_8058).aBoolean9024)
            return null;
        if (i >= -10)
            aClass209_8054 = null;
        byte[] is = aClass248_Sub8_Sub13_8058.method2097(0);
        do {
            if (aClass248_Sub8_Sub13_8058 instanceof Node_Sub8_Sub13_Sub2) {
                try {
                    if (is == null)
                        throw new RuntimeException();
                    aClass271_8077 = new Class271(is, anInt8071, aByteArray8069);
                    if (((Class271) aClass271_8077).anInt3140 != anInt8074)
                        throw new RuntimeException();
                    break;
                } catch (RuntimeException runtimeexception) {
                    aClass271_8077 = null;
                    if (!aClass323_8079.method3356(0))
                        aClass248_Sub8_Sub13_8058 = aClass323_8079.method3355(true, (byte) 0, 255, anInt8065, 22013);
                    else
                        aClass248_Sub8_Sub13_8058 = null;
                    return null;
                }
            }
            try {
                if (is == null)
                    throw new RuntimeException();
                aClass271_8077 = new Class271(is, anInt8071, aByteArray8069);
            } catch (RuntimeException runtimeexception) {
                aClass323_8079.method3352((byte) 126);
                aClass271_8077 = null;
                if (aClass323_8079.method3356(0))
                    aClass248_Sub8_Sub13_8058 = null;
                else
                    aClass248_Sub8_Sub13_8058 = aClass323_8079.method3355(true, (byte) 0, 255, anInt8065, 22013);
                return null;
            }
            if (aClass209_8054 != null)
                aClass77_8070.method562(anInt8065, aClass209_8054, 1, is);
        } while (false);
        if (aClass209_8076 != null) {
            aByteArray8061 = new byte[((Class271) aClass271_8077).anInt3159];
            anInt8067 = 0;
        }
        aClass248_Sub8_Sub13_8058 = null;
        return aClass271_8077;
    }

    final void method3388(int i) {
        if (i != 0)
            method3384(66);
        anInt8059++;
        if (aClass293_8082 != null) {
            if (method3379(i + -42) == null)
                return;
            if (aBoolean8083) {
                boolean bool = true;
                for (Node node = aClass293_8082.method3119(2); node != null; node = aClass293_8082.method3107(i + -128)) {
                    int i_14_ = (int) ((Node) node).id;
                    if ((aByteArray8061[i_14_] ^ 0xffffffff) == -1)
                        method3385(i_14_, i ^ ~0x5c6c, 1);
                    if ((aByteArray8061[i_14_] ^ 0xffffffff) != -1)
                        node.remove(true);
                    else
                        bool = false;
                }
                while (((Class271) aClass271_8077).anIntArray3148.length > anInt8080) {
                    if ((((Class271) aClass271_8077).anIntArray3148[anInt8080] ^ 0xffffffff) == -1)
                        anInt8080++;
                    else {
                        if ((((Class77) aClass77_8070).anInt997 ^ 0xffffffff) <= -251) {
                            bool = false;
                            break;
                        }
                        if (aByteArray8061[anInt8080] == 0)
                            method3385(anInt8080, i ^ ~0x5c6c, 1);
                        if ((aByteArray8061[anInt8080] ^ 0xffffffff) == -1) {
                            Node node = new Node();
                            ((Node) node).id = (long) anInt8080;
                            aClass293_8082.method3109(node, -104);
                            bool = false;
                        }
                        anInt8080++;
                    }
                }
                if (bool) {
                    aBoolean8083 = false;
                    anInt8080 = 0;
                }
            } else if (aBoolean8084) {
                boolean bool = true;
                for (Node node = aClass293_8082.method3119(2); node != null; node = aClass293_8082.method3107(i + -128)) {
                    int i_15_ = (int) ((Node) node).id;
                    if (aByteArray8061[i_15_] != 1)
                        method3385(i_15_, -23661, 2);
                    if ((aByteArray8061[i_15_] ^ 0xffffffff) == -2)
                        node.remove(true);
                    else
                        bool = false;
                }
                while ((((Class271) aClass271_8077).anIntArray3148.length ^ 0xffffffff) < (anInt8080 ^ 0xffffffff)) {
                    if ((((Class271) aClass271_8077).anIntArray3148[anInt8080] ^ 0xffffffff) == -1)
                        anInt8080++;
                    else {
                        if (aClass323_8079.method3346(46)) {
                            bool = false;
                            break;
                        }
                        if (aByteArray8061[anInt8080] != 1)
                            method3385(anInt8080, i + -23661, 2);
                        if ((aByteArray8061[anInt8080] ^ 0xffffffff) != -2) {
                            Node node = new Node();
                            ((Node) node).id = (long) anInt8080;
                            bool = false;
                            aClass293_8082.method3109(node, -91);
                        }
                        anInt8080++;
                    }
                }
                if (bool) {
                    anInt8080 = 0;
                    aBoolean8084 = false;
                }
            } else
                aClass293_8082 = null;
        }
        if (aBoolean8086 && (aLong8085 ^ 0xffffffffffffffffL) >= (Class118.method1112(116) ^ 0xffffffffffffffffL)) {
            for (Node_Sub8_Sub13 class248_sub8_sub13 = (Node_Sub8_Sub13) aClass65_8072.method510(true); class248_sub8_sub13 != null; class248_sub8_sub13 = (Node_Sub8_Sub13) aClass65_8072.method512(false)) {
                if (!((Node_Sub8_Sub13) class248_sub8_sub13).aBoolean9024) {
                    if (!((Node_Sub8_Sub13) class248_sub8_sub13).aBoolean9025)
                        ((Node_Sub8_Sub13) class248_sub8_sub13).aBoolean9025 = true;
                    else {
                        if (!((Node_Sub8_Sub13) class248_sub8_sub13).aBoolean9027)
                            throw new RuntimeException();
                        class248_sub8_sub13.remove(true);
                    }
                }
            }
            aLong8085 = 1000L + Class118.method1112(116);
        }
    }

    final int method3376(int i, int i_16_) {
        anInt8068++;
        Node_Sub8_Sub13 class248_sub8_sub13 = ((Node_Sub8_Sub13) aClass65_8072.method501((long) i, (byte) 31));
        if (class248_sub8_sub13 != null)
            return class248_sub8_sub13.method2096(0);
        if (i_16_ != 1113)
            return -113;
        return 0;
    }

    final void method3377(byte i, int i_17_) {
        if (i == 76) {
            anInt8075++;
            if (aClass209_8076 != null) {
                for (Node node = aClass293_8081.method3119(2); node != null; node = aClass293_8081.method3107(-128)) {
                    if ((long) i_17_ == ((Node) node).id)
                        return;
                }
                Node node = new Node();
                ((Node) node).id = (long) i_17_;
                aClass293_8081.method3109(node, -107);
            }
        }
    }

    final int method3389(int i) {
        anInt8062++;
        if (aClass271_8077 == null)
            return 0;
        if (!aBoolean8083)
            return ((Class271) aClass271_8077).anInt3146;
        if (i <= 52)
            method3390(37);
        Node node = aClass293_8082.method3119(2);
        if (node == null)
            return 0;
        return (int) ((Node) node).id;
    }

    public static void method3390(int i) {
        if (i != 1)
            method3390(126);
        aCharArray8056 = null;
    }

    final void method3391(int i) {
        anInt8063++;
        if (aClass293_8082 != null && method3379(-77) != null) {
            for (Node node = aClass293_8081.method3119(i); node != null; node = aClass293_8081.method3107(-127)) {
                int i_18_ = (int) ((Node) node).id;
                if ((i_18_ ^ 0xffffffff) > -1 || ((((Class271) aClass271_8077).anInt3159 ^ 0xffffffff) >= (i_18_ ^ 0xffffffff)) || ((Class271) aClass271_8077).anIntArray3148[i_18_] == 0)
                    node.remove(true);
                else {
                    if (aByteArray8061[i_18_] == 0)
                        method3385(i_18_, -23661, 1);
                    if ((aByteArray8061[i_18_] ^ 0xffffffff) == 0)
                        method3385(i_18_, -23661, 2);
                    if (aByteArray8061[i_18_] == 1)
                        node.remove(true);
                }
            }
        }
    }

    Class330_Sub1(int i, Class209 class209, Class209 class209_19_, Class323 class323, Class77 class77, int i_20_, byte[] is, int i_21_, boolean bool) {
        aClass209_8076 = class209;
        anInt8065 = i;
        if (aClass209_8076 != null) {
            aBoolean8083 = true;
            aClass293_8082 = new Class293();
        } else
            aBoolean8083 = false;
        aClass323_8079 = class323;
        aBoolean8086 = bool;
        aClass209_8054 = class209_19_;
        aClass77_8070 = class77;
        anInt8071 = i_20_;
        anInt8074 = i_21_;
        aByteArray8069 = is;
        if (aClass209_8054 != null)
            aClass248_Sub8_Sub13_8058 = aClass77_8070.method564(aClass209_8054, -3, anInt8065);
    }

    static {
        for (int i = 0; i < 26; i++)
            aCharArray8056[i] = (char) (65 + i);
        for (int i = 26; i < 52; i++)
            aCharArray8056[i] = (char) (i + 97 + -26);
        for (int i = 52; (i ^ 0xffffffff) > -63; i++)
            aCharArray8056[i] = (char) (48 + i + -52);
        aCharArray8056[63] = '/';
        aCharArray8056[62] = '+';
    }
}
