/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class130 {
    int anInt1572 = -1;
    static Class264 aClass264_1573;
    static int anInt1574;
    int anInt1575;
    boolean aBoolean1576;
    static int anInt1577;
    private int anInt1578 = 0;
    int anInt1579;
    static int anInt1580 = 0;
    static int anInt1581;
    boolean aBoolean1582;
    static int anInt1583;
    int anInt1584;
    static int anInt1585;
    int anInt1586;
    static int anInt1587;
    int anInt1588;
    static int anInt1589;
    static int anInt1590;
    static int anInt1591;

    static final boolean method1197(int i, boolean bool, int i_0_) {
        if (bool != false)
            anInt1580 = -59;
        anInt1591++;
        if (!((0x40000 & i ^ 0xffffffff) != -1 | Class84_Sub6.method620(i, 0, i_0_)) && !Class136_Sub2.method1256(i, 104, i_0_))
            return false;
        return true;
    }

    private final void method1198(int i, byte i_1_) {
        anInt1587++;
        double d = (double) ((i & 0xffda77) >> 1503599472) / 256.0;
        double d_2_ = (double) (i >> -779871928 & 0xff) / 256.0;
        double d_3_ = (double) (0xff & i) / 256.0;
        double d_4_ = d;
        if (d_2_ < d_4_)
            d_4_ = d_2_;
        if (d_3_ < d_4_)
            d_4_ = d_3_;
        double d_5_ = d;
        if (d_2_ > d_5_)
            d_5_ = d_2_;
        if (d_5_ < d_3_)
            d_5_ = d_3_;
        double d_6_ = 0.0;
        double d_7_ = 0.0;
        double d_8_ = (d_4_ + d_5_) / 2.0;
        if (d_5_ != d_4_) {
            if (d_8_ < 0.5)
                d_7_ = (-d_4_ + d_5_) / (d_5_ + d_4_);
            if (d_8_ >= 0.5)
                d_7_ = (-d_4_ + d_5_) / (-d_4_ + (-d_5_ + 2.0));
            if (d_5_ == d)
                d_6_ = (-d_3_ + d_2_) / (d_5_ - d_4_);
            else if (d_2_ != d_5_) {
                if (d_3_ == d_5_)
                    d_6_ = 4.0 + (d - d_2_) / (d_5_ - d_4_);
            } else
                d_6_ = (d_3_ - d) / (d_5_ - d_4_) + 2.0;
        }
        d_6_ /= 6.0;
        ((Class130) this).anInt1575 = (int) (d_7_ * 256.0);
        ((Class130) this).anInt1588 = (int) (256.0 * d_8_);
        int i_9_ = 47 % ((13 - i_1_) / 42);
        if (!(d_8_ > 0.5))
            ((Class130) this).anInt1584 = (int) (512.0 * (d_8_ * d_7_));
        else
            ((Class130) this).anInt1584 = (int) (512.0 * ((-d_8_ + 1.0) * d_7_));
        if ((((Class130) this).anInt1575 ^ 0xffffffff) <= -1) {
            if (((Class130) this).anInt1575 > 255)
                ((Class130) this).anInt1575 = 255;
        } else
            ((Class130) this).anInt1575 = 0;
        if (((Class130) this).anInt1588 < 0)
            ((Class130) this).anInt1588 = 0;
        else if ((((Class130) this).anInt1588 ^ 0xffffffff) < -256)
            ((Class130) this).anInt1588 = 255;
        if (((Class130) this).anInt1584 < 1)
            ((Class130) this).anInt1584 = 1;
        ((Class130) this).anInt1579 = (int) (d_6_ * (double) ((Class130) this).anInt1584);
    }

    final void method1199(ByteStream class248_sub9, int i) {
        anInt1585++;
        if (i < -98) {
            for (; ; ) {
                int i_10_ = class248_sub9.readUnsignedByte((byte) -45);
                if ((i_10_ ^ 0xffffffff) == -1)
                    break;
                method1205(i_10_, class248_sub9, -2);
            }
        }
    }

    public static void method1200(int i) {
        aClass264_1573 = null;
        if (i != -1)
            aClass264_1573 = null;
    }

    static final int method1201(int i, String string, int i_11_) {
        if (i < 86)
            aClass264_1573 = null;
        anInt1583++;
        return Class377.method3885(i_11_, true, 25744, string);
    }

    static final boolean method1202(int i) {
        if (i != 1)
            anInt1580 = 69;
        anInt1589++;
        if (Class176.aBoolean2058) {
            try {
                if (((Boolean) Class78.method571("showingVideoAd", -8364, Class158.anApplet1881)).booleanValue())
                    return false;
                return true;
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        return true;
    }

    static final void method1203(RSInterface2 class354, int i, int i_12_, int i_13_) {
        anInt1574++;
        if (i_13_ > -81)
            method1202(45);
        if (Class371.aClass354_4564 == null && !Class145.aBoolean1721 && (class354 != null && Class352.method3750((byte) 48, class354) != null)) {
            Class371.aClass354_4564 = class354;
            Class312.aClass354_3637 = Class352.method3750((byte) 48, class354);
            Class146.anInt1726 = i;
            Class232.anInt2611 = 0;
            Class141.aBoolean5057 = false;
            Class270.anInt3136 = i_12_;
        }
    }

    static final Class339 method1204(int i, int i_14_) {
        anInt1590++;
        Class339[] class339s = Class162_Sub1.method1463(-126);
        for (int i_15_ = i; (class339s.length ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
            Class339 class339 = class339s[i_15_];
            if (i_14_ == ((Class339) class339).anInt3946)
                return class339;
        }
        return null;
    }

    private final void method1205(int i, ByteStream class248_sub9, int i_16_) {
        anInt1581++;
        if (i_16_ == (i ^ 0xffffffff)) {
            anInt1578 = class248_sub9.method2221(255);
            method1198(anInt1578, (byte) 92);
        } else if ((i ^ 0xffffffff) != -3) {
            if ((i ^ 0xffffffff) == -4)
                ((Class130) this).anInt1586 = class248_sub9.readShort(i_16_ ^ 0x1) << -1387058302;
            else if (i != 4) {
                if ((i ^ 0xffffffff) == -6)
                    ((Class130) this).aBoolean1576 = false;
            } else
                ((Class130) this).aBoolean1582 = false;
        } else {
            ((Class130) this).anInt1572 = class248_sub9.readShort(-1);
            if ((((Class130) this).anInt1572 ^ 0xffffffff) == -65536)
                ((Class130) this).anInt1572 = -1;
        }
    }

    public Class130() {
        ((Class130) this).aBoolean1576 = true;
        ((Class130) this).aBoolean1582 = true;
        ((Class130) this).anInt1586 = 512;
    }

    static {
        aClass264_1573 = new Class264(1);
    }
}
