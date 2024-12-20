/* Class345_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import javax.sound.sampled.*;
import java.awt.*;

final class Class345_Sub1 extends Class345 {
    private boolean aBoolean8235 = false;
    private AudioFormat anAudioFormat8236;
    private int anInt8237;
    private SourceDataLine aSourceDataLine8238;
    private byte[] aByteArray8239;
    static Class aClass8240;

    final void method3528(int i) throws LineUnavailableException {
        try {
            DataLine.Info info = (new DataLine.Info((aClass8240 == null ? (aClass8240 = method3535("javax.sound.sampled.SourceDataLine")) : aClass8240), anAudioFormat8236, i << (Class225_Sub3.aBoolean8472 ? 2 : 1)));
            aSourceDataLine8238 = (SourceDataLine) AudioSystem.getLine(info);
            aSourceDataLine8238.open();
            aSourceDataLine8238.start();
            anInt8237 = i;
        } catch (LineUnavailableException lineunavailableexception) {
            if ((Class282_Sub9.method2953(i, -58) ^ 0xffffffff) != -2)
                method3528(Class136_Sub4.method1269(i, (byte) -128));
            else {
                aSourceDataLine8238 = null;
                throw lineunavailableexception;
            }
        }
    }

    final void method3522() throws LineUnavailableException {
        aSourceDataLine8238.flush();
        if (aBoolean8235) {
            aSourceDataLine8238.close();
            aSourceDataLine8238 = null;
            DataLine.Info info = (new DataLine.Info((aClass8240 == null ? (aClass8240 = method3535("javax.sound.sampled.SourceDataLine")) : aClass8240), anAudioFormat8236, anInt8237 << (Class225_Sub3.aBoolean8472 ? 2 : 1)));
            aSourceDataLine8238 = (SourceDataLine) AudioSystem.getLine(info);
            aSourceDataLine8238.open();
            aSourceDataLine8238.start();
        }
    }

    final void method3526(Component component) {
        Mixer.Info[] infos = AudioSystem.getMixerInfo();
        if (infos != null) {
            Mixer.Info[] infos_0_ = infos;
            for (int i = 0; infos_0_.length > i; i++) {
                Mixer.Info info = infos_0_[i];
                if (info != null) {
                    String string = info.getName();
                    if (string != null && string.toLowerCase().indexOf("soundmax") >= 0)
                        aBoolean8235 = true;
                }
            }
        }
        anAudioFormat8236 = new AudioFormat((float) Class54.anInt728, 16, Class225_Sub3.aBoolean8472 ? 2 : 1, true, false);
        aByteArray8239 = new byte[256 << (!Class225_Sub3.aBoolean8472 ? 1 : 2)];
    }

    final int method3523() {
        return anInt8237 - (aSourceDataLine8238.available() >> (Class225_Sub3.aBoolean8472 ? 2 : 1));
    }

    final void method3533() {
        int i = 256;
        if (Class225_Sub3.aBoolean8472)
            i <<= 1;
        for (int i_1_ = 0; i_1_ < i; i_1_++) {
            int i_2_ = ((Class345_Sub1) this).anIntArray4089[i_1_];
            if ((i_2_ + 8388608 & ~0xffffff) != 0)
                i_2_ = 0x7fffff ^ i_2_ >> 31;
            aByteArray8239[i_1_ * 2] = (byte) (i_2_ >> 8);
            aByteArray8239[i_1_ * 2 + 1] = (byte) (i_2_ >> 16);
        }
        aSourceDataLine8238.write(aByteArray8239, 0, i << 1);
    }

    final void method3531() {
        if (null != aSourceDataLine8238) {
            aSourceDataLine8238.close();
            aSourceDataLine8238 = null;
        }
    }

    static Class method3535(String string) {
        Class var_class = null;
        try {
            var_class = Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            try {
                throw new NoClassDefFoundError().initCause(classnotfoundexception);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        return var_class;
    }
}
