/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class253 {
    static int anInt2845;
    static int anInt2846 = -1;
    static IncommingOpcode aIncommingOpcode_2847 = new IncommingOpcode(56, 5);
    static IncommingOpcode aIncommingOpcode_2848 = new IncommingOpcode(2, 4);
    static int anInt2849;

    abstract void method2718(byte i);

    public Class253() {
        /* empty */
    }

    abstract void method2719(int i);

    public static void method2720(int i) {
        aIncommingOpcode_2848 = null;
        if (i == 0)
            aIncommingOpcode_2847 = null;
    }

    static final int method2721(Class147_Sub1 class147_sub1, int i, Class147_Sub1 class147_sub1_0_, boolean bool, int i_1_) {
        anInt2849++;
        if (i_1_ == 1) {
            int i_2_ = ((Class147) class147_sub1_0_).anInt1742;
            int i_3_ = ((Class147) class147_sub1).anInt1742;
            if (!bool) {
                if ((i_3_ ^ 0xffffffff) == 0)
                    i_3_ = 2001;
                if ((i_2_ ^ 0xffffffff) == 0)
                    i_2_ = 2001;
            }
            return -i_3_ + i_2_;
        }
        if (i != -18646)
            method2720(-10);
        if ((i_1_ ^ 0xffffffff) == -3)
            return (Class225_Sub1_Sub1.method1790(((Class55) class147_sub1_0_.method1319(3)).aString732, Class191.anInt4822, i + 18646, ((Class55) class147_sub1.method1319(3)).aString732));
        if ((i_1_ ^ 0xffffffff) == -4) {
            if (!((Class147_Sub1) class147_sub1_0_).aString6283.equals("-")) {
                if (((Class147_Sub1) class147_sub1).aString6283.equals("-")) {
                    if (bool)
                        return 1;
                    return -1;
                }
            } else {
                if (((Class147_Sub1) class147_sub1).aString6283.equals("-"))
                    return 0;
                if (!bool)
                    return 1;
                return -1;
            }
            return (Class225_Sub1_Sub1.method1790(((Class147_Sub1) class147_sub1_0_).aString6283, Class191.anInt4822, 0, ((Class147_Sub1) class147_sub1).aString6283));
        }
        if ((i_1_ ^ 0xffffffff) == -5) {
            if (!class147_sub1_0_.method1316(123)) {
                if (!class147_sub1.method1316(i + 18746))
                    return 0;
                return -1;
            }
            if (class147_sub1.method1316(i ^ ~0x48f0))
                return 0;
            return 1;
        }
        if ((i_1_ ^ 0xffffffff) == -6) {
            if (class147_sub1_0_.method1315(0)) {
                if (class147_sub1.method1315(i ^ ~0x48d5))
                    return 0;
                return 1;
            }
            if (class147_sub1.method1315(0))
                return -1;
            return 0;
        }
        if (i_1_ == 6) {
            if (!class147_sub1_0_.method1314(true)) {
                if (class147_sub1.method1314(true))
                    return -1;
                return 0;
            }
            if (class147_sub1.method1314(true))
                return 0;
            return 1;
        }
        if (i_1_ == 7) {
            if (class147_sub1_0_.method1317(1)) {
                if (class147_sub1.method1317(i ^ ~0x48d4))
                    return 0;
                return 1;
            }
            if (!class147_sub1.method1317(1))
                return 0;
            return -1;
        }
        if ((i_1_ ^ 0xffffffff) == -9) {
            int i_4_ = ((Class147_Sub1) class147_sub1_0_).anInt6288;
            int i_5_ = ((Class147_Sub1) class147_sub1).anInt6288;
            if (bool) {
                if ((i_4_ ^ 0xffffffff) == -1001)
                    i_4_ = -1;
                if ((i_5_ ^ 0xffffffff) == -1001)
                    i_5_ = -1;
            } else {
                if ((i_5_ ^ 0xffffffff) == 0)
                    i_5_ = 1000;
                if ((i_4_ ^ 0xffffffff) == 0)
                    i_4_ = 1000;
            }
            return -i_5_ + i_4_;
        }
        return (((Class147_Sub1) class147_sub1_0_).anInt6285 + -((Class147_Sub1) class147_sub1).anInt6285);
    }

    abstract boolean method2722(boolean bool, int i);

    abstract Interface19 method2723(int i);
}
