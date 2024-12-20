/* Class205_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.nio.ByteBuffer;

final class Class205_Sub1 extends Class205 {
    private ByteBuffer aByteBuffer6657;

    final void method1698(byte i, byte[] is) {
        aByteBuffer6657 = ByteBuffer.allocateDirect(is.length);
        aByteBuffer6657.position(0);
        aByteBuffer6657.put(is);
        if (i >= -69)
            method1693(-18, 111, 73);
    }

    final byte[] method1693(int i, int i_0_, int i_1_) {
        byte[] is = new byte[i_0_];
        if (i >= -34)
            return null;
        aByteBuffer6657.position(i_1_);
        aByteBuffer6657.get(is, 0, i_0_);
        return is;
    }

    final byte[] method1697(int i) {
        byte[] is = new byte[aByteBuffer6657.capacity()];
        aByteBuffer6657.position(0);
        int i_2_ = 86 % ((26 - i) / 57);
        aByteBuffer6657.get(is);
        return is;
    }
}
