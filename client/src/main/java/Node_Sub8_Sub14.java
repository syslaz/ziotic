/* Class248_Sub8_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

abstract class Node_Sub8_Sub14 extends Node_Sub8 {
    static long aLong9036 = 0L;
    static int anInt9037 = 0;
    static int anInt9038;
    static int anInt9039;
    int anInt9040;
    static int anInt9041;
    Interface9 anInterface9_9042;

    abstract Object method2122(int i);

    static final int method2123(int i, String string) {
        anInt9041++;
        if (!((Class174) Class140.aClass174_1661).aBoolean2039)
            return -1;
        if (IOException_Sub1.aHashtable84.containsKey(string))
            return 100;
        String string_0_ = Node_Sub8_Sub13_Sub2.method2104(109, string);
        if (string_0_ == null)
            return -1;
        if (i < 26)
            return -114;
        String string_1_ = Class282_Sub2.aString7613 + string_0_;
        if (!Class264.aClass381_2988.method3928("", string_1_, 86))
            return -1;
        if (!Class264.aClass381_2988.method3931(string_1_, true))
            return Class264.aClass381_2988.method3916(107, string_1_);
        byte[] is = Class264.aClass381_2988.method3908("", string_1_, (byte) 103);
        Object object = null;
        File file;
        try {
            file = Class3.method173(-3251, string_0_);
        } catch (RuntimeException runtimeexception) {
            return -1;
        }
        if (is != null && file != null) {
            boolean bool = true;
            byte[] is_2_ = Class282_Sub21.method3009(file, (byte) -108);
            if (is_2_ == null || (is.length ^ 0xffffffff) != (is_2_.length ^ 0xffffffff))
                bool = false;
            else {
                for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (is_2_.length ^ 0xffffffff); i_3_++) {
                    if (is[i_3_] != is_2_[i_3_]) {
                        bool = false;
                        break;
                    }
                }
            }
            try {
                if (!bool)
                    Class140.aClass174_1661.method1570(is, file, 29478);
            } catch (Throwable throwable) {
                return -1;
            }
            Class301.method3186(file, string, (byte) 20);
            return 100;
        }
        return -1;
    }

    static final void method2124(Player player, int i) {
        anInt9039++;
        if (i == 0) {
            Node_Sub51 class248_sub51 = ((Node_Sub51) (Class363.aClass65_4475.method501((long) ((Entity) player).anInt10484, (byte) 31)));
            if (class248_sub51 != null)
                class248_sub51.method2683(256);
            else
                Class353.method3755(null, 0, (((Entity) player).posQueueX[0]), null, ((Interactable) player).plane, (((Entity) player).posQueueY[0]), -652104791, player);
        }
    }

    static final void method2125(int i, int i_4_, int i_5_, byte i_6_) {
        anInt9038++;
        if (i_6_ == -74) {
            Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_4_, -874792672, 9);
            class248_sub8_sub10.method2084(614);
            ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983 = i_5_;
            ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976 = i;
        }
    }

    abstract boolean method2126(byte i);

    Node_Sub8_Sub14(Interface9 interface9, int i) {
        ((Node_Sub8_Sub14) this).anInterface9_9042 = interface9;
        ((Node_Sub8_Sub14) this).anInt9040 = i;
    }
}
