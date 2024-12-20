/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class353 {
    static int anInt4190;
    short aShort4191;
    static Class253 aClass253_4192;
    byte aByte4193;
    int anInt4194;
    int anInt4195;
    static int anInt4196;
    int anInt4197;
    short aShort4198;
    boolean aBoolean4199;
    static int anInt4200;
    int anInt4201;
    int anInt4202;
    short aShort4203;

    static final int method3753(int i, int i_0_, int i_1_, int i_2_) {
        anInt4190++;
        if (Class177.aSArray2070 == null)
            return 0;
        int i_3_ = i_0_ >> 1029151305;
        int i_4_ = i >> 1766749353;
        if ((i_3_ ^ 0xffffffff) > -1 || i_4_ < 0 || -1 + Node_Sub8_Sub4.anInt8360 < i_3_ || (-1 + Node_Sub22.anInt7074 ^ 0xffffffff) > (i_4_ ^ 0xffffffff))
            return 0;
        int i_5_ = -13 % ((i_1_ - 84) / 42);
        int i_6_ = i_2_;
        if (i_6_ < 3 && (r.aByteArrayArrayArray9033[1][i_3_][i_4_] & 0x2) != 0)
            i_6_++;
        return Class177.aSArray2070[i_6_].method3150((byte) 98, i_0_, i);
    }

    public static void method3754(byte i) {
        if (i != -78)
            method3754((byte) -80);
        aClass253_4192 = null;
    }

    static final void method3755(NPC NPC, int i, int i_7_, ObjectDefinition class266, int i_8_, int i_9_, int i_10_, Player player) {
        anInt4196++;
        Node_Sub51 class248_sub51 = new Node_Sub51();
        ((Node_Sub51) class248_sub51).anInt7461 = i_9_ << 625536585;
        ((Node_Sub51) class248_sub51).anInt7479 = i_8_;
        if (i_10_ != -652104791)
            method3753(-91, -5, -99, 15);
        ((Node_Sub51) class248_sub51).anInt7466 = i_7_ << 346368937;
        if (class266 != null) {
            ((Node_Sub51) class248_sub51).aClass266_7456 = class266;
            int i_11_ = ((ObjectDefinition) class266).anInt3097;
            int i_12_ = ((ObjectDefinition) class266).anInt3065;
            if ((i ^ 0xffffffff) == -2 || i == 3) {
                i_12_ = ((ObjectDefinition) class266).anInt3097;
                i_11_ = ((ObjectDefinition) class266).anInt3065;
            }
            ((Node_Sub51) class248_sub51).anInt7474 = i_12_ + i_9_ << 1472179049;
            ((Node_Sub51) class248_sub51).anIntArray7472 = ((ObjectDefinition) class266).anIntArray3046;
            ((Node_Sub51) class248_sub51).anInt7475 = i_11_ + i_7_ << -115917367;
            ((Node_Sub51) class248_sub51).anInt7476 = ((ObjectDefinition) class266).anInt3078;
            ((Node_Sub51) class248_sub51).anInt7470 = ((ObjectDefinition) class266).anInt3018;
            ((Node_Sub51) class248_sub51).anInt7464 = ((ObjectDefinition) class266).anInt3028 << 383467913;
            ((Node_Sub51) class248_sub51).anInt7465 = ((ObjectDefinition) class266).anInt3019 << 1212389769;
            ((Node_Sub51) class248_sub51).anInt7480 = ((ObjectDefinition) class266).anInt3095;
            ((Node_Sub51) class248_sub51).anInt7473 = ((ObjectDefinition) class266).anInt3050;
            ((Node_Sub51) class248_sub51).anInt7478 = ((ObjectDefinition) class266).anInt3070;
            ((Node_Sub51) class248_sub51).aBoolean7481 = ((ObjectDefinition) class266).aBoolean3079;
            ((Node_Sub51) class248_sub51).aBoolean7453 = ((ObjectDefinition) class266).aBoolean3104;
            ((Node_Sub51) class248_sub51).anInt7462 = ((ObjectDefinition) class266).anInt3092;
            if (((ObjectDefinition) class266).anIntArray3049 != null) {
                ((Node_Sub51) class248_sub51).aBoolean7458 = true;
                class248_sub51.method2683(256);
            }
            if (((Node_Sub51) class248_sub51).anIntArray7472 != null)
                ((Node_Sub51) class248_sub51).anInt7469 = (((Node_Sub51) class248_sub51).anInt7476 - -(int) ((double) (-(((Node_Sub51) class248_sub51).anInt7476) + (((Node_Sub51) class248_sub51).anInt7470)) * Math.random()));
            Class144.aClass293_1702.method3109(class248_sub51, i_10_ ^ 0x26de5429);
        } else if (NPC == null) {
            if (player != null) {
                ((Node_Sub51) class248_sub51).aPlayer_7463 = player;
                ((Node_Sub51) class248_sub51).anInt7475 = (i_7_ - -player.method3632(-1) << -1694566167);
                ((Node_Sub51) class248_sub51).anInt7474 = i_9_ + player.method3632(i_10_ ^ 0x26de5456) << 1216768105;
                ((Node_Sub51) class248_sub51).anInt7462 = Node_Sub8.method2024(player, (byte) 22);
                ((Node_Sub51) class248_sub51).aBoolean7481 = ((Player) player).aBoolean10570;
                ((Node_Sub51) class248_sub51).anInt7480 = ((Player) player).anInt10566;
                ((Node_Sub51) class248_sub51).anInt7465 = 0;
                ((Node_Sub51) class248_sub51).anInt7464 = ((Player) player).anInt10553 << -514018071;
                ((Node_Sub51) class248_sub51).anInt7473 = 256;
                ((Node_Sub51) class248_sub51).anInt7478 = 256;
                Class363.aClass65_4475.method509(-1, class248_sub51, (long) ((Entity) player).anInt10484);
            }
        } else {
            ((Node_Sub51) class248_sub51).aNPC_7459 = NPC;
            Class255 class255 = (((NPC) NPC).aClass255_10614);
            if (((Class255) class255).anIntArray2923 != null) {
                ((Node_Sub51) class248_sub51).aBoolean7458 = true;
                class255 = class255.method2737((byte) 101, Node_Sub43.aClass291_7306);
            }
            if (class255 != null) {
                ((Node_Sub51) class248_sub51).anInt7474 = ((Class255) class255).size + i_9_ << -1186816407;
                ((Node_Sub51) class248_sub51).anInt7475 = i_7_ - -((Class255) class255).size << -652104791;
                ((Node_Sub51) class248_sub51).anInt7462 = Class85.method637(NPC, (byte) 89);
                ((Node_Sub51) class248_sub51).anInt7473 = ((Class255) class255).anInt2901;
                ((Node_Sub51) class248_sub51).anInt7464 = ((Class255) class255).anInt2891 << -1826717111;
                ((Node_Sub51) class248_sub51).anInt7478 = ((Class255) class255).anInt2884;
                ((Node_Sub51) class248_sub51).anInt7480 = ((Class255) class255).anInt2862;
                ((Node_Sub51) class248_sub51).aBoolean7481 = ((Class255) class255).aBoolean2882;
                ((Node_Sub51) class248_sub51).anInt7465 = ((Class255) class255).anInt2874 << -1886844279;
            }
            Class333.aClass293_3901.method3109(class248_sub51, i_10_ ^ 0x26de5426);
        }
    }

    Class353(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, boolean bool, boolean bool_21_, int i_22_) {
        ((Class353) this).anInt4201 = i_22_;
        ((Class353) this).anInt4202 = i_14_;
        ((Class353) this).aByte4193 = (byte) i_20_;
        ((Class353) this).aShort4191 = (short) i_17_;
        ((Class353) this).aShort4203 = (short) i_16_;
        ((Class353) this).aShort4198 = (short) i_18_;
        ((Class353) this).aBoolean4199 = bool_21_;
        ((Class353) this).anInt4194 = i_13_;
        ((Class353) this).anInt4195 = i_15_;
        ((Class353) this).anInt4197 = i;
    }

    static final void method3756(int i) {
        anInt4200++;
        int i_23_ = 80 % ((i - -42) / 63);
        aClass253_4192.method2719(-1);
        Class46.aClass269_600.method2806((byte) -97);
        Node_Sub8_Sub16_Sub1.aClient10301.method85(-6515);
        Class297_Sub1.aCanvas8478.setBackground(Color.black);
        Class21.anInt314 = -1;
        aClass253_4192 = Class114.method1075(Class297_Sub1.aCanvas8478, true);
        Class46.aClass269_600 = Animable.method3600(Class297_Sub1.aCanvas8478, true, (byte) 122);
    }
}
