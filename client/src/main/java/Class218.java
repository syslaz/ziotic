/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class218 {
    private String aString2490 = "null";
    static int anInt2491;
    static int anInt2492;
    char aChar2493;
    static int anInt2494;
    static int anInt2495;
    static int anInt2496;
    private Class65 aClass65_2497;
    private int anInt2498;
    static IncommingOpcode aIncommingOpcode_2499 = new IncommingOpcode(78, -1);
    static int anInt2500;
    Class65 aClass65_2501;
    char aChar2502;
    static int[] anIntArray2503;
    static int anInt2504;
    static int anInt2505;
    static double aDouble2506 = -1.0;
    static boolean aBoolean2507 = false;

    private final void method1743(byte i) {
        anInt2500++;
        aClass65_2497 = new Class65(((Class218) this).aClass65_2501.method505(-1));
        for (Node_Sub32 class248_sub32 = ((Node_Sub32) ((Class218) this).aClass65_2501.method510(true)); class248_sub32 != null; class248_sub32 = (Node_Sub32) ((Class218) this).aClass65_2501.method512(false)) {
            Node_Sub41 class248_sub41 = new Node_Sub41((((Node_Sub32) class248_sub32).aString7195), (int) (((Node) class248_sub32).id));
            aClass65_2497.method509(-1, class248_sub41, Class222.method1767(0, (((Node_Sub32) class248_sub32).aString7195)));
        }
        int i_0_ = -32 % ((-31 - i) / 41);
    }

    final int method1744(byte i, int i_1_) {
        anInt2504++;
        if (((Class218) this).aClass65_2501 == null)
            return anInt2498;
        if (i > -110)
            return -58;
        Node_Sub37 class248_sub37 = ((Node_Sub37) ((Class218) this).aClass65_2501.method501((long) i_1_, (byte) 31));
        if (class248_sub37 == null)
            return anInt2498;
        return ((Node_Sub37) class248_sub37).anInt7261;
    }

    final boolean method1745(String string, int i) {
        anInt2505++;
        if (((Class218) this).aClass65_2501 == null)
            return false;
        if (aClass65_2497 == null)
            method1743((byte) -126);
        for (Node_Sub41 class248_sub41 = ((Node_Sub41) aClass65_2497.method501(Class222.method1767(i ^ i, string), (byte) 31)); class248_sub41 != null; class248_sub41 = (Node_Sub41) aClass65_2497.method507((byte) 50)) {
            if (((Node_Sub41) class248_sub41).aString7289.equals(string))
                return true;
        }
        return false;
    }

    public static void method1746(boolean bool) {
        aIncommingOpcode_2499 = null;
        anIntArray2503 = null;
        if (bool != false)
            anIntArray2503 = null;
    }

    final void method1747(int i, ByteStream class248_sub9) {
        anInt2496++;
        if (i <= 71)
            method1750(-3, 104);
        for (; ; ) {
            int i_2_ = class248_sub9.readUnsignedByte((byte) 100);
            if ((i_2_ ^ 0xffffffff) == -1)
                break;
            method1749(-84, i_2_, class248_sub9);
        }
    }

    private final void method1748(boolean bool) {
        aClass65_2497 = new Class65(((Class218) this).aClass65_2501.method505(-1));
        anInt2491++;
        for (Node_Sub37 class248_sub37 = ((Node_Sub37) ((Class218) this).aClass65_2501.method510(bool)); class248_sub37 != null; class248_sub37 = (Node_Sub37) ((Class218) this).aClass65_2501.method512(!bool)) {
            Node_Sub37 class248_sub37_3_ = new Node_Sub37((int) ((Node) class248_sub37).id);
            aClass65_2497.method509(-1, class248_sub37_3_, (long) (((Node_Sub37) class248_sub37).anInt7261));
        }
    }

    private final void method1749(int i, int i_4_, ByteStream class248_sub9) {
        if ((i_4_ ^ 0xffffffff) == -2)
            ((Class218) this).aChar2502 = Class226.method1802((byte) -71, class248_sub9.readByte(66));
        else if (i_4_ != 2) {
            if (i_4_ != 3) {
                if (i_4_ == 4)
                    anInt2498 = class248_sub9.readInt(false);
                else if (i_4_ == 5 || i_4_ == 6) {
                    int i_5_ = class248_sub9.readShort(-1);
                    ((Class218) this).aClass65_2501 = new Class65(Class136_Sub4.method1269(i_5_, (byte) -128));
                    for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_6_++) {
                        int i_7_ = class248_sub9.readInt(false);
                        Node node;
                        if (i_4_ == 5)
                            node = new Node_Sub32(class248_sub9.readString(15598));
                        else
                            node = new Node_Sub37(class248_sub9.readInt(false));
                        ((Class218) this).aClass65_2501.method509(-1, node, (long) i_7_);
                    }
                }
            } else
                aString2490 = class248_sub9.readString(15598);
        } else
            ((Class218) this).aChar2493 = Class226.method1802((byte) -71, class248_sub9.readByte(51));
        anInt2495++;
        int i_8_ = -85 % ((81 - i) / 43);
    }

    final String method1750(int i, int i_9_) {
        anInt2494++;
        if (((Class218) this).aClass65_2501 == null)
            return aString2490;
        int i_10_ = -111 % ((i - -65) / 59);
        Node_Sub32 class248_sub32 = ((Node_Sub32) ((Class218) this).aClass65_2501.method501((long) i_9_, (byte) 31));
        if (class248_sub32 == null)
            return aString2490;
        return ((Node_Sub32) class248_sub32).aString7195;
    }

    public Class218() {
        /* empty */
    }

    final boolean method1751(int i, int i_11_) {
        anInt2492++;
        if (((Class218) this).aClass65_2501 == null)
            return false;
        if (aClass65_2497 == null)
            method1748(true);
        Node_Sub37 class248_sub37 = (Node_Sub37) aClass65_2497.method501((long) i, (byte) 31);
        if (class248_sub37 == null)
            return false;
        if (i_11_ != 78)
            return true;
        return true;
    }
}
