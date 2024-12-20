/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class315 {
    private Class278 aClass278_3650 = new Class278(64);
    static int anInt3651;
    static int anInt3652;
    static Class58 aClass58_3653 = new Class58("", 19);
    private Class381 aClass381_3654;
    static int anInt3655;
    static int anInt3656;
    static int anInt3657;
    static int anInt3658;
    static int anInt3659;

    static final void method3277(int i, d var_d, int i_0_, int i_1_, ha var_ha, int i_2_, int i_3_) {
        anInt3651++;
        if (Node_Sub14_Sub5.anInt9208 < 100)
            Node_Sub8_Sub13_Sub1.method2100(var_d, var_ha, (byte) -84);
        var_ha.KA(i_2_, i_3_, i_2_ - -i, i_0_ + i_3_);
        if (Node_Sub14_Sub5.anInt9208 < 100) {
            int i_4_ = 20;
            int i_5_ = i_2_ + i / 2;
            int i_6_ = -i_4_ + i_0_ / 2 + (i_3_ - 18);
            var_ha.aa(i_2_, i_3_, i, i_0_, -16777216, 0);
            var_ha.c(-152 + i_5_, i_6_, 304, 34, Node_Sub43.aColorArray7309[Node_Sub33.anInt7205].getRGB(), 0);
            var_ha.aa(-150 + i_5_, 2 + i_6_, 3 * Node_Sub14_Sub5.anInt9208, 30, Class173.aColorArray2012[Node_Sub33.anInt7205].getRGB(), 0);
            Node_Sub14_Sub27.aClass48_9449.method354(i_5_, -94, Class41.aClass41_484.method301(Class191.anInt4822, (byte) -108), i_6_ + i_4_, Class133.aColorArray5039[Node_Sub33.anInt7205].getRGB(), -1);
        } else {
            int i_7_ = (-(int) ((float) i / Class116.aFloat1447) + Node_Sub14_Sub30.anInt9478);
            if (i_1_ != -1)
                method3279(79, null);
            int i_8_ = ((int) ((float) i_0_ / Class116.aFloat1447) + Class261.anInt2972);
            int i_9_ = (Node_Sub14_Sub30.anInt9478 - -(int) ((float) i / Class116.aFloat1447));
            Class226.anInt2549 = (int) ((float) (i_0_ * 2) / Class116.aFloat1447);
            Class59.anInt818 = (-(int) ((float) i / Class116.aFloat1447) + Node_Sub14_Sub30.anInt9478);
            int i_10_ = (-(int) ((float) i_0_ / Class116.aFloat1447) + Class261.anInt2972);
            Class323.anInt3789 = (-(int) ((float) i_0_ / Class116.aFloat1447) + Class261.anInt2972);
            Class36.anInt406 = (int) ((float) (2 * i) / Class116.aFloat1447);
            Class116.method1093(Class116.anInt1468 + i_7_, i_8_ - -Class116.anInt1469, Class116.anInt1468 + i_9_, Class116.anInt1469 + i_10_, i_2_, i_3_, i + i_2_, 1 + i_0_ + i_3_);
            Class116.method1091(var_ha);
            Class293 class293 = Class116.method1096(var_ha);
            NPC.method3668(0, var_ha, 0, i_1_ ^ 0x1068, class293);
            if (Node_Sub28.anInt7166 > 0) {
                Class282_Sub1.anInt7595--;
                if ((Class282_Sub1.anInt7595 ^ 0xffffffff) == -1) {
                    Class282_Sub1.anInt7595 = 20;
                    Node_Sub28.anInt7166--;
                }
            }
            if (Class75.aBoolean978) {
                int i_11_ = i_2_ - (-i + 5);
                int i_12_ = -8 + (i_0_ + i_3_);
                Canvas_Sub1.aClass48_71.method376(16776960, i_11_, -1, (byte) -108, i_12_, "Fps:" + Class17.anInt291);
                i_12_ -= 15;
                Runtime runtime = Runtime.getRuntime();
                int i_13_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                int i_14_ = 16776960;
                if ((i_13_ ^ 0xffffffff) < -65537)
                    i_14_ = 16711680;
                Canvas_Sub1.aClass48_71.method376(i_14_, i_11_, -1, (byte) -108, i_12_, "Mem:" + i_13_ + "k");
                i_12_ -= 15;
            }
        }
    }

    public static void method3278(int i) {
        aClass58_3653 = null;
        if (i != -7913)
            aClass58_3653 = null;
    }

    static final int method3279(int i, Entity entity) {
        anInt3656++;
        if ((((Entity) entity).anInt10480 ^ 0xffffffff) == i)
            return 0;
        if ((((Entity) entity).faceEntity ^ 0xffffffff) != 0) {
            Entity entity_15_ = null;
            if ((((Entity) entity).faceEntity ^ 0xffffffff) <= -32769) {
                if ((((Entity) entity).faceEntity) >= 32768)
                    entity_15_ = (Node_Sub32.aPlayerArray7197[-32768 + ((Entity) entity).faceEntity]);
            } else {
                Node_Sub10 class248_sub10 = ((Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) ((Entity) entity).faceEntity, (byte) 31)));
                if (class248_sub10 != null)
                    entity_15_ = (((Node_Sub10) class248_sub10).aNPC_6946);
            }
            if (entity_15_ != null) {
                int i_16_ = (-((Interactable) entity_15_).x + ((Interactable) entity).x);
                int i_17_ = (((Interactable) entity).y - (((Interactable) entity_15_).y));
                if ((i_16_ ^ 0xffffffff) != -1 || (i_17_ ^ 0xffffffff) != -1)
                    entity.faceDir(false, 0x3fff & (int) (Math.atan2((double) i_16_, (double) i_17_) * 2607.5945876176133));
            }
        }
        if (entity instanceof Player) {
            Player player = (Player) entity;
            if (((((Player) player).anInt10536) ^ 0xffffffff) != 0 && ((((Entity) player).anInt10503) == 0 || ((Entity) player).anInt10500 > 0)) {
                player.faceDir(false, ((Player) player).anInt10536);
                ((Player) player).anInt10536 = -1;
            }
        } else if (entity instanceof NPC) {
            NPC NPC = (NPC) entity;
            if (((((NPC) NPC).anInt10594) ^ 0xffffffff) != 0 && ((((Entity) NPC).anInt10503) == 0 || ((Entity) NPC).anInt10500 > 0)) {
                int i_18_ = (((Interactable) NPC).x + -(256 * (((NPC) NPC).anInt10594 + (-Class67.baseX - Class67.baseX))));
                int i_19_ = (((Interactable) NPC).y + -(256 * (-Class368.baseY + (-Class368.baseY + (((NPC) NPC).anInt10602)))));
                if ((i_18_ ^ 0xffffffff) != -1 || i_19_ != 0)
                    NPC.faceDir(false, (int) (Math.atan2((double) i_18_, (double) i_19_) * 2607.5945876176133) & 0x3fff);
                ((NPC) NPC).anInt10594 = -1;
            }
        }
        return entity.method3636(true);
    }

    static final void method3280(int i) {
        anInt3657++;
        int i_20_ = 1024;
        int i_21_ = 3072;
        if (Class357.aBoolean4416) {
            i_21_ = 4096;
            if (Class98.aBoolean1261)
                i_20_ = 2048;
        }
        if (Node_Sub8_Sub13.aFloat9030 < (float) i_20_)
            Node_Sub8_Sub13.aFloat9030 = (float) i_20_;
        int i_22_ = -80 % ((43 - i) / 33);
        for (/**/; Class282_Sub7.aFloat7661 >= 16384.0F; Class282_Sub7.aFloat7661 -= 16384.0F) {
            /* empty */
        }
        if ((float) i_21_ < Node_Sub8_Sub13.aFloat9030)
            Node_Sub8_Sub13.aFloat9030 = (float) i_21_;
        for (/**/; Class282_Sub7.aFloat7661 < 0.0F; Class282_Sub7.aFloat7661 += 16384.0F) {
            /* empty */
        }
        int i_23_ = Class82.anInt1027 >> 1107031625;
        int i_24_ = Class189.anInt5066 >> 2007723401;
        int i_25_ = Class353.method3753(Class189.anInt5066, Class82.anInt1027, 32, Class177.anInt2074);
        int i_26_ = 0;
        if ((i_23_ ^ 0xffffffff) < -4 && (i_24_ ^ 0xffffffff) < -4 && Node_Sub8_Sub4.anInt8360 - 4 > i_23_ && (i_24_ ^ 0xffffffff) > (-4 + Node_Sub22.anInt7074 ^ 0xffffffff)) {
            for (int i_27_ = -4 + i_23_; i_27_ <= i_23_ - -4; i_27_++) {
                for (int i_28_ = i_24_ - 4; i_24_ + 4 >= i_28_; i_28_++) {
                    int i_29_ = Class177.anInt2074;
                    if ((i_29_ ^ 0xffffffff) > -4 && Class209.method1717(-10387, i_27_, i_28_))
                        i_29_++;
                    int i_30_ = 0;
                    if ((((Class310) Class73.aClass310_Sub1_941).aByteArrayArrayArray3590) != null && (((Class310) Class73.aClass310_Sub1_941).aByteArrayArrayArray3590[i_29_]) != null)
                        i_30_ = (0xff & (((Class310) Class73.aClass310_Sub1_941).aByteArrayArrayArray3590[i_29_][i_27_][i_28_])) * 8 << -2106218302;
                    if (Class177.aSArray2070 != null && Class177.aSArray2070[i_29_] != null) {
                        int i_31_ = (i_25_ + i_30_ + -Class177.aSArray2070[i_29_].method3145(i_27_, 88, i_28_));
                        if (i_31_ > i_26_)
                            i_26_ = i_31_;
                    }
                }
            }
        }
        int i_32_ = (i_26_ >> 395431554) * 1536;
        if (i_32_ > 786432)
            i_32_ = 786432;
        if ((i_32_ ^ 0xffffffff) > -262145)
            i_32_ = 262144;
        if ((i_32_ ^ 0xffffffff) < (Node_Sub14_Sub6.anInt9213 ^ 0xffffffff))
            Node_Sub14_Sub6.anInt9213 += (-Node_Sub14_Sub6.anInt9213 + i_32_) / 24;
        else if ((Node_Sub14_Sub6.anInt9213 ^ 0xffffffff) < (i_32_ ^ 0xffffffff))
            Node_Sub14_Sub6.anInt9213 += (i_32_ + -Node_Sub14_Sub6.anInt9213) / 80;
    }

    static final boolean method3281(int i, int i_33_, int i_34_) {
        if (i_34_ != 3828)
            return true;
        anInt3659++;
        if ((0x22 & i) == 0)
            return false;
        return true;
    }

    final Node_Sub8_Sub3 method3282(int i, int i_35_) {
        anInt3652++;
        if (i_35_ != -4)
            method3278(-108);
        Node_Sub8_Sub3 class248_sub8_sub3;
        synchronized (aClass278_3650) {
            class248_sub8_sub3 = (Node_Sub8_Sub3) aClass278_3650.method2863(i_35_ ^ ~0x7, (long) i);
        }
        if (class248_sub8_sub3 != null)
            return class248_sub8_sub3;
        byte[] is;
        synchronized (aClass381_3654) {
            is = aClass381_3654.method3922((byte) 120, 5, i);
        }
        class248_sub8_sub3 = new Node_Sub8_Sub3();
        if (is != null)
            class248_sub8_sub3.method2044(new ByteStream(is), (byte) 121);
        synchronized (aClass278_3650) {
            aClass278_3650.method2867((byte) 0, (long) i, class248_sub8_sub3);
        }
        return class248_sub8_sub3;
    }

    static final float method3283(float f, int i, float f_36_, float f_37_, float f_38_, float f_39_, float f_40_, int i_41_) {
        anInt3655++;
        float f_42_ = 0.0F;
        float f_43_ = -f_39_ + f;
        float f_44_ = f_38_ - f_40_;
        float f_45_ = -f_36_ + f_37_;
        float f_46_ = (float) i_41_;
        float f_47_ = 0.0F;
        float f_48_ = 0.0F;
        for (/**/; f_42_ < 1.1F; f_42_ += 0.1F) {
            float f_49_ = f_39_ + f_43_ * f_42_;
            float f_50_ = f_40_ + f_44_ * f_42_;
            float f_51_ = f_36_ + f_45_ * f_42_;
            int i_52_ = (int) f_49_ >> -90047351;
            int i_53_ = (int) f_51_ >> 362602601;
            if ((i_52_ ^ 0xffffffff) < -1 && i_53_ > 0 && (Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) < (i_52_ ^ 0xffffffff) && Node_Sub22.anInt7074 > i_53_) {
                int i_54_ = (((Interactable) Class347.myPlayer).plane);
                if (i_54_ < 3 && (r.aByteArrayArrayArray9033[1][i_52_][i_53_] & 0x2) != 0)
                    i_54_++;
                int i_55_ = Node_Sub14_Sub29.aSArray9471[i_54_].method3150((byte) 100, (int) f_49_, (int) f_51_);
                if (f_50_ > (float) i_55_) {
                    if ((i ^ 0xffffffff) <= -3)
                        return (0.1F * method3283(f_49_, i + -1, f_48_, f_51_, f_50_, f_46_, f_47_, 0) + (-0.1F + f_42_));
                    return f_42_;
                }
            }
            f_48_ = f_51_;
            f_46_ = f_49_;
            f_47_ = f_50_;
        }
        return -1.0F;
    }

    Class315(Class215 class215, int i, Class381 class381) {
        aClass381_3654 = class381;
        aClass381_3654.method3899(5, 0);
    }
}
