/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

abstract class Class30 {
    int anInt373;
    String aString374;
    static Class211[] aClass211Array375;
    static int anInt376;
    static int currentPacketSize = 0;
    static int anInt378;

    final Socket method261(int i) throws IOException {
        if (i != 0)
            ((Class30) this).anInt373 = -77;
        anInt378++;
        return new Socket(((Class30) this).aString374, ((Class30) this).anInt373);
    }

    static final void method262(int i, long l) {
        anInt376++;
        int i_0_ = ((((Interactable) Class347.myPlayer).x) - -Node_Sub41.anInt7288);
        int i_1_ = (Class185.anInt2162 + (((Interactable) Class347.myPlayer).y));
        if (Class82.anInt1027 + -i_0_ < -2000 || (-i_0_ + Class82.anInt1027 ^ 0xffffffff) < -2001 || (-i_1_ + Class189.anInt5066 ^ 0xffffffff) > 1999 || -i_1_ + Class189.anInt5066 > 2000) {
            Class82.anInt1027 = i_0_;
            Class189.anInt5066 = i_1_;
        }
        if (i_0_ != Class82.anInt1027) {
            int i_2_ = -Class82.anInt1027 + i_0_;
            int i_3_ = (int) (l * (long) i_2_ / 320L);
            if ((i_2_ ^ 0xffffffff) < -1) {
                if ((i_3_ ^ 0xffffffff) != -1) {
                    if (i_2_ < i_3_)
                        i_3_ = i_2_;
                } else
                    i_3_ = 1;
            } else if ((i_3_ ^ 0xffffffff) != -1) {
                if ((i_3_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff))
                    i_3_ = i_2_;
            } else
                i_3_ = -1;
            Class82.anInt1027 += i_3_;
        }
        if (i_1_ != Class189.anInt5066) {
            int i_4_ = i_1_ + -Class189.anInt5066;
            int i_5_ = (int) (l * (long) i_4_ / 320L);
            if ((i_4_ ^ 0xffffffff) < -1) {
                if (i_5_ != 0) {
                    if (i_5_ > i_4_)
                        i_5_ = i_4_;
                } else
                    i_5_ = 1;
            } else if ((i_5_ ^ 0xffffffff) != -1) {
                if (i_4_ > i_5_)
                    i_5_ = i_4_;
            } else
                i_5_ = -1;
            Class189.anInt5066 += i_5_;
        }
        Node_Sub8_Sub13.aFloat9030 += Class325.aFloat3829 * (float) l / 6.0F;
        if (i < 5)
            currentPacketSize = 36;
        Class282_Sub7.aFloat7661 += (float) l * Class192.aFloat2216 / 6.0F;
        Class315.method3280(84);
    }

    public static void method263(int i) {
        int i_6_ = 22 / ((-7 - i) / 57);
        aClass211Array375 = null;
    }

    abstract Socket method264(int i) throws IOException;

    public Class30() {
        /* empty */
    }
}
