/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class198 {
    private int[] anIntArray2239;
    static int anInt2240;
    private int[] anIntArray2241;
    private String[] aStringArray2242;
    private int[] anIntArray2243;
    private int[] anIntArray2244;
    private int[][] anIntArrayArray2245;
    static int anInt2246;
    static int anInt2247;
    static int anInt2248 = 0;
    private int[] anIntArray2249;
    private Class65 aClass65_2250;
    private String aString2251;
    private int[] anIntArray2252;
    private int[] anIntArray2253;
    static int anInt2254;
    static int anInt2255;
    private String aString2256;
    int anInt2257 = -1;
    private int[][] anIntArrayArray2258;
    static Class293 aClass293_2259 = new Class293();
    private String[] aStringArray2260;
    private int[] anIntArray2261;
    private int[][] anIntArrayArray2262;
    static IncommingOpcode aIncommingOpcode_2263 = new IncommingOpcode(112, 2);
    static int anInt2264;
    static int anInt2265;
    static int anInt2266 = -1;
    static Class243 aClass243_2267;

    static final Class168[] method1672(int i) {
        if (i != -25801)
            anInt2266 = -122;
        anInt2240++;
        return (new Class168[]{Class279_Sub1_Sub1.aClass168_9812, Class181.aClass168_2098, Node_Sub14_Sub18.aClass168_9351, Class79.aClass168_1003, Class168.aClass168_1971, Class87.aClass168_1084, Class340_Sub2.aClass168_8110, Class253_Sub1.aClass168_7512, Class223.aClass168_5169, Node_Sub14_Sub35.aClass168_9537, Class144.aClass168_1692, Class76.aClass168_982, Class282_Sub21.aClass168_7816, Class6.aClass168_152});
    }

    final void method1673(int i) {
        anInt2254++;
        if (i != 6)
            method1675(20, 110, 87);
        if (aString2251 == null)
            aString2251 = aString2256;
    }

    private final void method1674(boolean bool, ByteStream class248_sub9, int i) {
        anInt2246++;
        if (bool != true)
            method1675(80, 1, -76);
        if (i != 1) {
            if (i == 2)
                aString2251 = class248_sub9.readJagString2(-75);
            else if (i != 3) {
                if (i == 4) {
                    int i_0_ = class248_sub9.readUnsignedByte((byte) -91);
                    anIntArrayArray2262 = new int[i_0_][3];
                    for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
                        anIntArrayArray2262[i_1_][0] = class248_sub9.readShort(-1);
                        anIntArrayArray2262[i_1_][1] = class248_sub9.readInt(!bool);
                        anIntArrayArray2262[i_1_][2] = class248_sub9.readInt(!bool);
                    }
                } else if ((i ^ 0xffffffff) == -6)
                    class248_sub9.readShort(-1);
                else if (i != 6) {
                    if (i != 7) {
                        if (i != 8) {
                            if ((i ^ 0xffffffff) == -10)
                                class248_sub9.readUnsignedByte((byte) -100);
                            else if (i == 10) {
                                int i_2_ = class248_sub9.readUnsignedByte((byte) -65);
                                anIntArray2249 = new int[i_2_];
                                for (int i_3_ = 0; (i_2_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++)
                                    anIntArray2249[i_3_] = class248_sub9.readInt(!bool);
                            } else if (i != 12) {
                                if ((i ^ 0xffffffff) == -14) {
                                    int i_4_ = class248_sub9.readUnsignedByte((byte) -60);
                                    anIntArray2252 = new int[i_4_];
                                    for (int i_5_ = 0; i_4_ > i_5_; i_5_++)
                                        anIntArray2252[i_5_] = class248_sub9.readShort(-1);
                                } else if ((i ^ 0xffffffff) == -15) {
                                    int i_6_ = class248_sub9.readUnsignedByte((byte) 72);
                                    anIntArrayArray2245 = new int[i_6_][2];
                                    for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
                                        anIntArrayArray2245[i_7_][0] = class248_sub9.readUnsignedByte((byte) 76);
                                        anIntArrayArray2245[i_7_][1] = class248_sub9.readUnsignedByte((byte) 87);
                                    }
                                } else if ((i ^ 0xffffffff) != -16) {
                                    if ((i ^ 0xffffffff) != -18) {
                                        if (i == 18) {
                                            int i_8_ = class248_sub9.readUnsignedByte((byte) 119);
                                            anIntArray2253 = new int[i_8_];
                                            aStringArray2260 = new String[i_8_];
                                            anIntArray2261 = new int[i_8_];
                                            anIntArray2241 = new int[i_8_];
                                            for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)); i_9_++) {
                                                anIntArray2241[i_9_] = class248_sub9.readInt(false);
                                                anIntArray2253[i_9_] = class248_sub9.readInt(false);
                                                anIntArray2261[i_9_] = class248_sub9.readInt(!bool);
                                                aStringArray2260[i_9_] = class248_sub9.readString(15598);
                                            }
                                        } else if ((i ^ 0xffffffff) == -20) {
                                            int i_10_ = class248_sub9.readUnsignedByte((byte) -73);
                                            anIntArray2239 = new int[i_10_];
                                            anIntArray2243 = new int[i_10_];
                                            aStringArray2242 = new String[i_10_];
                                            anIntArray2244 = new int[i_10_];
                                            for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
                                                anIntArray2243[i_11_] = class248_sub9.readInt(false);
                                                anIntArray2244[i_11_] = class248_sub9.readInt(false);
                                                anIntArray2239[i_11_] = class248_sub9.readInt(false);
                                                aStringArray2242[i_11_] = class248_sub9.readString(15598);
                                            }
                                        } else if (i == 249) {
                                            int i_12_ = class248_sub9.readUnsignedByte((byte) -68);
                                            if (aClass65_2250 == null) {
                                                int i_13_ = (Class136_Sub4.method1269(i_12_, (byte) -128));
                                                aClass65_2250 = new Class65(i_13_);
                                            }
                                            for (int i_14_ = 0; ((i_12_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++) {
                                                boolean bool_15_ = (((class248_sub9.readUnsignedByte((byte) -71)) ^ 0xffffffff) == -2);
                                                int i_16_ = class248_sub9.method2221(255);
                                                Node node;
                                                if (bool_15_)
                                                    node = (new Node_Sub32(class248_sub9.readString(15598)));
                                                else
                                                    node = (new Node_Sub37(class248_sub9.readInt(false)));
                                                aClass65_2250.method509(-1, node, (long) i_16_);
                                            }
                                        }
                                    } else
                                        ((Class198) this).anInt2257 = class248_sub9.readShort(-1);
                                } else
                                    class248_sub9.readShort(-1);
                            } else
                                class248_sub9.readInt(!bool);
                        }
                    } else
                        class248_sub9.readUnsignedByte((byte) -21);
                } else
                    class248_sub9.readUnsignedByte((byte) -68);
            } else {
                int i_17_ = class248_sub9.readUnsignedByte((byte) 98);
                anIntArrayArray2258 = new int[i_17_][3];
                for (int i_18_ = 0; (i_17_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++) {
                    anIntArrayArray2258[i_18_][0] = class248_sub9.readShort(-1);
                    anIntArrayArray2258[i_18_][1] = class248_sub9.readInt(false);
                    anIntArrayArray2258[i_18_][2] = class248_sub9.readInt(false);
                }
            }
        } else
            aString2256 = class248_sub9.readJagString2(-98);
    }

    static final boolean method1675(int i, int i_19_, int i_20_) {
        int i_21_ = 29 / ((i - -66) / 33);
        anInt2247++;
        if ((i_20_ & 0x21 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    final void method1676(byte i, ByteStream class248_sub9) {
        anInt2255++;
        for (; ; ) {
            int i_22_ = class248_sub9.readUnsignedByte((byte) 118);
            if (i_22_ == 0)
                break;
            method1674(true, class248_sub9, i_22_);
        }
        if (i != 64)
            method1672(17);
    }

    public static void method1677(int i) {
        aClass243_2267 = null;
        aClass293_2259 = null;
        aIncommingOpcode_2263 = null;
        if (i != 33)
            anInt2248 = -124;
    }

    public Class198() {
        /* empty */
    }
}
