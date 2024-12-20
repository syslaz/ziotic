/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

final class Class45 {
    static boolean aBoolean560 = false;
    static int anInt561;
    static int anInt562;
    private File aFile563;
    static int anInt564;
    private RandomAccessFile aRandomAccessFile565;
    static Class154 aClass154_566;
    static int anInt567;
    private long aLong568;
    static int anInt569 = 0;
    static int anInt570;
    static int anInt571;
    private long aLong572;
    static long aLong573 = 0L;
    static int anInt574;
    static int anInt575;
    static int anInt576;

    final long method321(int i) throws IOException {
        if (i != 0)
            aLong572 = -95L;
        anInt567++;
        return aRandomAccessFile565.length();
    }

    final int method322(int i, int i_0_, byte i_1_, byte[] is) throws IOException {
        anInt575++;
        int i_2_ = aRandomAccessFile565.read(is, i, i_0_);
        if (i_1_ <= 118)
            aLong573 = 45L;
        if ((i_2_ ^ 0xffffffff) < -1)
            aLong568 += (long) i_2_;
        return i_2_;
    }

    final void method323(int i) throws IOException {
        if (aRandomAccessFile565 != null) {
            aRandomAccessFile565.close();
            aRandomAccessFile565 = null;
        }
        int i_3_ = 45 % ((-16 - i) / 39);
        anInt576++;
    }

    protected final void finalize() throws Throwable {
        if (aRandomAccessFile565 != null) {
            System.out.println("Warning! fileondisk " + aFile563 + " not closed correctly using close(). Auto-closing instead. ");
            method323(28);
        }
        anInt571++;
    }

    final File method324(boolean bool) {
        anInt561++;
        if (bool != true)
            method326(0);
        return aFile563;
    }

    static final String method325(String string, String string_4_, String string_5_, int i) {
        if (i <= 43)
            return null;
        anInt562++;
        for (int i_6_ = string.indexOf(string_5_); (i_6_ ^ 0xffffffff) != 0; i_6_ = string.indexOf(string_5_, string_4_.length() + i_6_))
            string = (string.substring(0, i_6_) + string_4_ + string.substring(string_5_.length() + i_6_));
        return string;
    }

    public static void method326(int i) {
        aClass154_566 = null;
        if (i != 0)
            aBoolean560 = false;
    }

    final void method327(int i, int i_7_, int i_8_, byte[] is) throws IOException {
        anInt570++;
        if ((aLong572 ^ 0xffffffffffffffffL) > (aLong568 + (long) i_8_ ^ 0xffffffffffffffffL)) {
            aRandomAccessFile565.seek(aLong572);
            aRandomAccessFile565.write(1);
            throw new EOFException();
        }
        aRandomAccessFile565.write(is, i_7_, i_8_);
        if (i == 3874)
            aLong568 += (long) i_8_;
    }

    Class45(File file, String string, long l) throws IOException {
        if (l == -1L)
            l = 9223372036854775807L;
        if (file.length() > l)
            file.delete();
        aRandomAccessFile565 = new RandomAccessFile(file, string);
        aLong572 = l;
        aFile563 = file;
        aLong568 = 0L;
        int i = aRandomAccessFile565.read();
        if ((i ^ 0xffffffff) != 0 && !string.equals("r")) {
            aRandomAccessFile565.seek(0L);
            aRandomAccessFile565.write(i);
        }
        aRandomAccessFile565.seek(0L);
    }

    static final boolean method328(byte i, int i_9_) {
        if (i != 13)
            method328((byte) 105, -126);
        anInt564++;
        if ((i_9_ ^ 0xffffffff) != -11 && i_9_ != 11 && i_9_ != 12)
            return false;
        return true;
    }

    final void method329(long l, byte i) throws IOException {
        anInt574++;
        aRandomAccessFile565.seek(l);
        aLong568 = l;
        if (i != 103)
            anInt569 = -123;
    }
}
