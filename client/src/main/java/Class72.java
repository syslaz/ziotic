/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class72 implements Interface9 {
    int anInt4872;
    static int anInt4873;
    int anInt4874;
    int anInt4875;
    static int anInt4876 = -1;
    int anInt4877;
    int anInt4878;
    static int anInt4879;
    static int anInt4880;
    int anInt4881;
    boolean aBoolean4882;

    static final Class380 method539(boolean bool, Class381 class381, int i, String string) {
        anInt4873++;
        int i_0_ = class381.method3927((byte) 83, string);
        if (i_0_ == -1)
            return new Class380(0);
        int[] is = class381.method3918(i_0_, -123);
        Class380 class380 = new Class380(is.length);
        int i_1_ = 0;
        int i_2_ = 0;
        while (((Class380) class380).anInt4643 > i_1_) {
            ByteStream class248_sub9 = new ByteStream(class381.method3922((byte) 126, i_0_, is[i_2_++]));
            int i_3_ = class248_sub9.readInt(false);
            int i_4_ = class248_sub9.readShort(-1);
            int i_5_ = class248_sub9.readUnsignedByte((byte) 95);
            if (!bool && i_5_ == 1)
                ((Class380) class380).anInt4643--;
            else {
                ((Class380) class380).anIntArray4644[i_1_] = i_3_;
                ((Class380) class380).anIntArray4646[i_1_] = i_4_;
                i_1_++;
            }
        }
        if (i != 255)
            anInt4876 = 58;
        return class380;
    }

    public final boolean method30(Interface9 interface9, boolean bool) {
        anInt4880++;
        if (!(interface9 instanceof Class72))
            return false;
        Class72 class72_6_ = (Class72) interface9;
        if ((((Class72) class72_6_).anInt4872 ^ 0xffffffff) != (((Class72) this).anInt4872 ^ 0xffffffff))
            return false;
        if ((((Class72) class72_6_).anInt4875 ^ 0xffffffff) != (((Class72) this).anInt4875 ^ 0xffffffff))
            return false;
        if ((((Class72) this).anInt4874 ^ 0xffffffff) != (((Class72) class72_6_).anInt4874 ^ 0xffffffff))
            return false;
        if ((((Class72) this).anInt4881 ^ 0xffffffff) != (((Class72) class72_6_).anInt4881 ^ 0xffffffff))
            return false;
        if (bool != true)
            method539(false, null, 124, null);
        if (((Class72) class72_6_).anInt4878 != ((Class72) this).anInt4878)
            return false;
        if (((Class72) this).anInt4877 != ((Class72) class72_6_).anInt4877)
            return false;
        if (((Class72) this).aBoolean4882 == !((Class72) class72_6_).aBoolean4882)
            return false;
        return true;
    }

    public final long method31(byte i) {
        anInt4879++;
        long[] ls = Class327.aLongArray3833;
        long l = -1L;
        l = (l >>> -1320818424 ^ ls[(int) (((long) ((Class72) this).anInt4872 ^ l) & 0xffL)]);
        l = l >>> 8099848 ^ ls[(int) ((l ^ (long) (((Class72) this).anInt4875 >> 613704424)) & 0xffL)];
        l = (l >>> -3885688 ^ ls[(int) (0xffL & (l ^ (long) ((Class72) this).anInt4875))]);
        l = (l >>> 1956930376 ^ ls[(int) (0xffL & (l ^ (long) (((Class72) this).anInt4874 >> -433958280)))]);
        l = ls[(int) (((long) (((Class72) this).anInt4874 >> -1984734192) ^ l) & 0xffL)] ^ l >>> -1257198968;
        int i_7_ = 34 / ((-42 - i) / 46);
        l = (l >>> 1572300232 ^ ls[(int) (0xffL & (l ^ (long) (((Class72) this).anInt4874 >> -45523672)))]);
        l = (l >>> 1284473160 ^ ls[(int) (((long) ((Class72) this).anInt4874 ^ l) & 0xffL)]);
        l = (l >>> 782387656 ^ ls[(int) (0xffL & ((long) ((Class72) this).anInt4881 ^ l))]);
        l = l >>> 1073438664 ^ ls[(int) (0xffL & ((long) (((Class72) this).anInt4878 >> 1934732984) ^ l))];
        l = (l >>> 1082002248 ^ ls[(int) (0xffL & (l ^ (long) (((Class72) this).anInt4878 >> 1306226032)))]);
        l = l >>> -1823347896 ^ ls[(int) (((long) (((Class72) this).anInt4878 >> 1308692776) ^ l) & 0xffL)];
        l = (ls[(int) (0xffL & ((long) ((Class72) this).anInt4878 ^ l))] ^ l >>> 1017899592);
        l = (l >>> -1323035704 ^ ls[(int) (0xffL & ((long) ((Class72) this).anInt4877 ^ l))]);
        l = ls[(int) ((l ^ (long) (((Class72) this).aBoolean4882 ? 1 : 0)) & 0xffL)] ^ l >>> -622532984;
        return l;
    }
}
