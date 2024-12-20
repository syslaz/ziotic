/* Class250 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class250 {
    static int anInt2817;
    static int anInt2818;
    static int anInt2819;
    int anInt2820;
    int anInt2821;
    static byte[][] aByteArrayArray2822;
    static int anInt2823;
    static Class46 aClass46_2824;
    static OutgoingOpcode aOutgoingOpcode_2825 = new OutgoingOpcode(38, 2);
    static int anInt2826;
    static int anInt2827;
    int anInt2828;

    public static void method2705(boolean bool) {
        aOutgoingOpcode_2825 = null;
        aByteArrayArray2822 = null;
        aClass46_2824 = null;
        if (bool != true)
            method2705(true);
    }

    private final void method2706(ByteStream class248_sub9, byte i, int i_0_) {
        anInt2817++;
        if (i_0_ == 1) {
            ((Class250) this).anInt2821 = class248_sub9.readShort(-1);
            ((Class250) this).anInt2820 = class248_sub9.readUnsignedByte((byte) 124);
            ((Class250) this).anInt2828 = class248_sub9.readUnsignedByte((byte) -86);
        }
        if (i <= 78)
            ((Class250) this).anInt2820 = 123;
    }

    final void method2707(int i, ByteStream class248_sub9) {
        for (; ; ) {
            int i_1_ = class248_sub9.readUnsignedByte((byte) -93);
            if ((i_1_ ^ 0xffffffff) == -1)
                break;
            method2706(class248_sub9, (byte) 108, i_1_);
        }
        if (i == 38)
            anInt2826++;
    }

    static final String method2708(int i, boolean bool, long l) {
        anInt2818++;
        Class99.method712(l, -8474);
        int i_2_ = Node_Sub8_Sub9.aCalendar8968.get(5);
        if (bool != true)
            method2708(-61, true, -124L);
        int i_3_ = Node_Sub8_Sub9.aCalendar8968.get(2);
        int i_4_ = Node_Sub8_Sub9.aCalendar8968.get(1);
        int i_5_ = Node_Sub8_Sub9.aCalendar8968.get(11);
        int i_6_ = Node_Sub8_Sub9.aCalendar8968.get(12);
        if ((i ^ 0xffffffff) == -4)
            return Node_Sub8_Sub11.method2087(-113, i, l);
        return (Integer.toString(i_2_ / 10) + i_2_ % 10 + "-" + Class99.aStringArrayArray1277[i][i_3_] + "-" + i_4_ + " " + i_5_ / 10 + i_5_ % 10 + ":" + i_6_ / 10 + i_6_ % 10);
    }

    static final void method2709(int i, PacketStream class248_sub9_sub2, int i_7_) {
        Class151.aBoolean1805 = false;
        Class228.anInt2578 = 0;
        anInt2827++;
        Class279.method2877(i ^ i, class248_sub9_sub2);
        Class10.method200(i + -31024, class248_sub9_sub2);
        if (Class151.aBoolean1805)
            System.out.println("---endgpp---");
        if (i_7_ != ((ByteStream) class248_sub9_sub2).offset)
            throw new RuntimeException("gpi1 pos:" + (((ByteStream) class248_sub9_sub2).offset) + " psize:" + i_7_);
    }

    static final boolean method2710(byte i, int i_8_, int i_9_) {
        if (i != 11)
            method2708(-103, true, -9L);
        anInt2823++;
        if (!((0x70000 & i_8_ ^ 0xffffffff) != -1 | Class346_Sub7_Sub2_Sub3.method3621((byte) -124, i_9_, i_8_)) && !Class52.method412(i_8_, (byte) -35, i_9_))
            return false;
        return true;
    }

    public Class250() {
        /* empty */
    }
}
