/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.ms.com.ComFailException;
import com.ms.directX.*;

import java.awt.*;

public final class Class97 implements Interface4 {
    private DSCursors[] aDSCursorsArray4753;
    private int[] anIntArray4754 = new int[2];
    private int anInt4755;
    private boolean[] aBooleanArray4756;
    private int anInt4757;
    private byte[][] aByteArrayArray4758;
    private WaveFormatEx aWaveFormatEx4759;
    private int anInt4760;
    private int[] anIntArray4761;
    private DirectSound aDirectSound4762;
    private int[] anIntArray4763;
    private DirectSoundBuffer[] aDirectSoundBufferArray4764;
    private DSBufferDesc[] aDSBufferDescArray4765;

    public final void method16(int i, int i_0_) {
        if (aDirectSoundBufferArray4764[i] != null) {
            try {
                aDirectSoundBufferArray4764[i].stop();
            } catch (com.ms.com.ComFailException comfailexception) {
                /* empty */
            }
            aDirectSoundBufferArray4764[i] = null;
        }
        if (i_0_ != 16)
            method17(-51, null);
    }

    public final void method12(byte i, int i_1_, int i_2_) throws Exception {
        if ((anInt4760 ^ 0xffffffff) == -1 || aDirectSoundBufferArray4764[i_2_] != null)
            throw new IllegalStateException();
        int i_3_ = anInt4757 * 65536;
        if (aByteArrayArray4758[i_2_] == null || aByteArrayArray4758[i_2_].length != i_3_) {
            aByteArrayArray4758[i_2_] = new byte[i_3_];
            aDSBufferDescArray4765[i_2_].bufferBytes = i_3_;
        }
        aDirectSoundBufferArray4764[i_2_] = aDirectSound4762.createSoundBuffer(aDSBufferDescArray4765[i_2_], aWaveFormatEx4759);
        aBooleanArray4756[i_2_] = false;
        anIntArray4754[i_2_] = 0;
        if (i != 27)
            method17(-53, null);
        anIntArray4763[i_2_] = i_1_;
    }

    public final void method17(int i, int[] is) {
        int i_4_ = is.length;
        if (i_4_ != 256 * anInt4755)
            throw new IllegalArgumentException();
        int i_5_ = anIntArray4754[i] * anInt4757;
        for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
            int i_7_ = is[i_6_];
            if ((i_7_ + 8388608 & ~0xffffff) != 0)
                i_7_ = 0x7fffff ^ i_7_ >> 31;
            aByteArrayArray4758[i][i_5_ + i_6_ * 2] = (byte) (i_7_ >> 8);
            aByteArrayArray4758[i][i_5_ + i_6_ * 2 + 1] = (byte) (i_7_ >> 16);
        }
        aDirectSoundBufferArray4764[i].writeBuffer(i_5_, i_4_ * 2, aByteArrayArray4758[i], 0);
        anIntArray4754[i] = anIntArray4754[i] + i_4_ / anInt4755 & 0xffff;
        if (!aBooleanArray4756[i]) {
            aDirectSoundBufferArray4764[i].play(1);
            aBooleanArray4756[i] = true;
        }
    }

    public final int method14(int i, int i_8_) {
        if (!aBooleanArray4756[i])
            return 0;
        aDirectSoundBufferArray4764[i].getCurrentPosition(aDSCursorsArray4753[i]);
        int i_9_ = aDSCursorsArray4753[i].write / anInt4757;
        int i_10_ = 0xffff & -i_9_ + anIntArray4754[i];
        if ((i_10_ ^ 0xffffffff) < (anIntArray4763[i] ^ 0xffffffff)) {
            int i_11_ = 0xffff & i_9_ + -anIntArray4754[i];
            while (i_11_ > 0) {
                i_11_ -= 256;
                method17(i, anIntArray4761);
            }
            i_10_ = -i_9_ + anIntArray4754[i] & 0xffff;
        }
        if (i_8_ != 23707)
            method14(95, -92);
        return i_10_;
    }

    public final void method15(int i, byte i_12_) {
        try {
            aDirectSoundBufferArray4764[i].stop();
        } catch (ComFailException e) {
            e.printStackTrace();
        }
        aBooleanArray4756[i] = false;
        aDirectSoundBufferArray4764[i].setCurrentPosition(0);
        anIntArray4754[i] = 0;
        if (i_12_ != -14)
            method17(5, null);
    }

    public Class97() throws Exception {
        aDSCursorsArray4753 = new DSCursors[2];
        aBooleanArray4756 = new boolean[2];
        aByteArrayArray4758 = new byte[2][];
        anIntArray4763 = new int[2];
        aDirectSoundBufferArray4764 = new DirectSoundBuffer[2];
        aDSBufferDescArray4765 = new DSBufferDesc[2];
        aDirectSound4762 = new DirectSound();
        aWaveFormatEx4759 = new WaveFormatEx();
        for (int i = 0; i < 2; i++)
            aDSBufferDescArray4765[i] = new DSBufferDesc();
        for (int i = 0; (i ^ 0xffffffff) > -3; i++)
            aDSCursorsArray4753[i] = new DSCursors();
    }

    public final void method13(boolean bool, Component component, int i, int i_13_) throws Exception {
        if (anInt4760 == 0) {
            if ((i ^ 0xffffffff) > -8001 || (i ^ 0xffffffff) < -48001)
                throw new IllegalArgumentException();
            anInt4757 = bool ? 4 : 2;
            anInt4755 = bool ? 2 : 1;
            anIntArray4761 = new int[256 * anInt4755];
            aDirectSound4762.initialize(null);
            aDirectSound4762.setCooperativeLevel(component, 2);
            for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -3; i_14_++)
                aDSBufferDescArray4765[i_14_].flags = 16384;
            anInt4760 = i;
            aWaveFormatEx4759.channels = anInt4755;
            aWaveFormatEx4759.bitsPerSample = 16;
            aWaveFormatEx4759.samplesPerSec = i;
            aWaveFormatEx4759.formatTag = 1;
            aWaveFormatEx4759.blockAlign = anInt4757;
            int i_15_ = 98 / ((i_13_ - -59) / 57);
            aWaveFormatEx4759.avgBytesPerSec = i * anInt4757;
        }
    }
}
