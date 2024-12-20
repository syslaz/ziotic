/* Class248_Sub14_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub30 extends Node_Sub14 {
    static int anInt9472;
    static int anInt9473;
    static int anInt9474;
    static int anInt9475;
    static boolean aBoolean9476 = false;
    static volatile boolean aBoolean9477 = true;
    static int anInt9478;
    static Viewport aViewport_9479;
    static int anInt9480;

    private final int method2362(int i, int i_0_, boolean bool) {
        if (bool != true)
            return -5;
        anInt9473++;
        int i_1_ = i + 57 * i_0_;
        i_1_ ^= i_1_ << -1733697375;
        return (-((1376312589 + i_1_ * (i_1_ * i_1_ * 15731 - -789221) & 0x7fffffff) / 262144) + 4096);
    }

    public static void method2363(boolean bool) {
        if (bool != false)
            aBoolean9477 = false;
        aViewport_9479 = null;
    }

    public Node_Sub14_Sub30() {
        super(0, true);
    }

    final int[] method2264(byte i, int i_2_) {
        anInt9475++;
        if (i != -40)
            method2362(-28, 109, true);
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_2_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int i_3_ = Node_Sub14_Sub3.anIntArray9184[i_2_];
            for (int i_4_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++)
                is[i_4_] = method2362(Node_Sub8_Sub3.anIntArray8921[i_4_], i_3_, true) % 4096;
        }
        return is;
    }

    static final Class224[] method2364(int i) {
        if (i != 1376312589)
            return null;
        anInt9480++;
        return (new Class224[]{Class356.aClass224_4391, Class356.js5Opcode, Class356.aClass224_4395, Class356.aClass224_4396, Class356.aClass224_4397, Class356.aClass224_4398, Class356.aClass224_4399, Class356.aClass224_4400, Class356.aClass224_4401, Class356.aClass224_4402, Class356.aClass224_4403, Class356.aClass224_4404});
    }

    static final void method2365(String[] strings, int i, int i_5_, int i_6_, short[] is) {
        if (i_6_ < i) {
            int i_7_ = (i + i_6_) / 2;
            int i_8_ = i_6_;
            String string = strings[i_7_];
            strings[i_7_] = strings[i];
            strings[i] = string;
            short i_9_ = is[i_7_];
            is[i_7_] = is[i];
            is[i] = i_9_;
            for (int i_10_ = i_6_; (i_10_ ^ 0xffffffff) > (i ^ 0xffffffff); i_10_++) {
                if (string == null || (strings[i_10_] != null && ((0x1 & i_10_ ^ 0xffffffff) < (strings[i_10_].compareTo(string) ^ 0xffffffff)))) {
                    String string_11_ = strings[i_10_];
                    strings[i_10_] = strings[i_8_];
                    strings[i_8_] = string_11_;
                    short i_12_ = is[i_10_];
                    is[i_10_] = is[i_8_];
                    is[i_8_++] = i_12_;
                }
            }
            strings[i] = strings[i_8_];
            strings[i_8_] = string;
            is[i] = is[i_8_];
            is[i_8_] = i_9_;
            method2365(strings, -1 + i_8_, -117, i_6_, is);
            method2365(strings, i, -73, i_8_ + 1, is);
        }
        if (i_5_ > -25)
            aViewport_9479 = null;
        anInt9472++;
    }
}
