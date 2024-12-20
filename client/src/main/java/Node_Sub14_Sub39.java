/* Class248_Sub14_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub39 extends Node_Sub14 {
    static int anInt9585;
    static int anInt9586;
    static int anInt9587;
    private int anInt9588;
    private int anInt9589 = 4096;
    static int anInt9590;
    private int anInt9591;
    static int anInt9592;
    static int anInt9593;
    private int anInt9594;
    private int anInt9595;
    static int anInt9596;
    private int anInt9597;
    static Class31 aClass31_9598 = new Class31();
    static int anInt9599;
    static int[] anIntArray9600;
    private int anInt9601;

    public static void method2393(int i) {
        aClass31_9598 = null;
        anIntArray9600 = null;
        int i_0_ = 55 % ((i - -54) / 62);
    }

    private final boolean method2394(int i, int i_1_, boolean bool) {
        anInt9593++;
        int i_2_ = (-i_1_ + i) * anInt9601 >> 1617828428;
        if (bool != true)
            return false;
        int i_3_ = Class21.anIntArray317[0xff & 255 * i_2_ >> 918778828];
        i_3_ = (i_3_ << -383397492) / anInt9601;
        i_3_ = (i_3_ << 1790151852) / anInt9594;
        i_3_ = i_3_ * anInt9589 >> -1583644724;
        if (i_1_ - -i >= i_3_ || (-i_3_ ^ 0xffffffff) <= (i + i_1_ ^ 0xffffffff))
            return false;
        return true;
    }

    final int[] method2264(byte i, int i_4_) {
        if (i != -40)
            anInt9594 = 110;
        anInt9590++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_4_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int i_5_ = -2048 + Node_Sub14_Sub3.anIntArray9184[i_4_];
            for (int i_6_ = 0; i_6_ < Class185.anInt2164; i_6_++) {
                int i_7_ = -2048 + Node_Sub8_Sub3.anIntArray8921[i_6_];
                int i_8_ = anInt9591 + i_7_;
                i_8_ = (i_8_ ^ 0xffffffff) <= 2047 ? i_8_ : 4096 + i_8_;
                i_8_ = i_8_ <= 2048 ? i_8_ : -4096 + i_8_;
                int i_9_ = anInt9595 + i_5_;
                i_9_ = i_9_ < -2048 ? 4096 + i_9_ : i_9_;
                i_9_ = i_9_ <= 2048 ? i_9_ : -4096 + i_9_;
                int i_10_ = i_7_ + anInt9597;
                i_10_ = i_10_ >= -2048 ? i_10_ : i_10_ - -4096;
                i_10_ = i_10_ <= 2048 ? i_10_ : i_10_ + -4096;
                int i_11_ = anInt9588 + i_5_;
                i_11_ = i_11_ < -2048 ? 4096 + i_11_ : i_11_;
                i_11_ = i_11_ <= 2048 ? i_11_ : -4096 + i_11_;
                is[i_6_] = (method2394(i_9_, i_8_, true) || method2395(i_11_, i_10_, false)) ? 4096 : 0;
            }
        }
        return is;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_12_) {
        int i_13_ = i_12_;
        while_235_:
        do {
            while_234_:
            do {
                while_233_:
                do {
                    while_232_:
                    do {
                        while_231_:
                        do {
                            do {
                                if (i_13_ != 0) {
                                    if ((i_13_ ^ 0xffffffff) != -2) {
                                        if ((i_13_ ^ 0xffffffff) != -3) {
                                            if ((i_13_ ^ 0xffffffff) != -4) {
                                                if ((i_13_ ^ 0xffffffff) != -5) {
                                                    if ((i_13_ ^ 0xffffffff) != -6) {
                                                        if (i_13_ == 6)
                                                            break while_234_;
                                                        break while_235_;
                                                    }
                                                } else
                                                    break while_232_;
                                                break while_233_;
                                            }
                                        } else
                                            break;
                                        break while_231_;
                                    }
                                } else {
                                    anInt9591 = class248_sub9.readShort(-1);
                                    break while_235_;
                                }
                                anInt9595 = class248_sub9.readShort(-1);
                                break while_235_;
                            } while (false);
                            anInt9597 = class248_sub9.readShort(i ^ 0x3c);
                            break while_235_;
                        } while (false);
                        anInt9588 = class248_sub9.readShort(-1);
                        break while_235_;
                    } while (false);
                    anInt9601 = class248_sub9.readShort(-1);
                    break while_235_;
                } while (false);
                anInt9589 = class248_sub9.readShort(-1);
                break while_235_;
            } while (false);
            anInt9594 = class248_sub9.readShort(-1);
        } while (false);
        if (i != -61)
            anInt9601 = -20;
        anInt9596++;
    }

    private final boolean method2395(int i, int i_14_, boolean bool) {
        anInt9599++;
        int i_15_ = anInt9601 * (i_14_ + i) >> -101305332;
        int i_16_ = Class21.anIntArray317[0xff & i_15_ * 255 >> 563663564];
        i_16_ = (i_16_ << -790501716) / anInt9601;
        i_16_ = (i_16_ << -113291348) / anInt9594;
        i_16_ = i_16_ * anInt9589 >> -1329998900;
        if (bool != false)
            method2397((byte) 0);
        if (i_16_ <= i + -i_14_ || (i + -i_14_ ^ 0xffffffff) >= (-i_16_ ^ 0xffffffff))
            return false;
        return true;
    }

    final void method2263(int i) {
        anInt9586++;
        s_Sub3.method3164(true);
        if (i != 8351)
            anInt9601 = -55;
    }

    static final void method2396(int[] is, int i, byte i_17_, int[] is_18_, int i_19_) {
        anInt9592++;
        if (i_17_ <= -29) {
            if ((i ^ 0xffffffff) > (i_19_ ^ 0xffffffff)) {
                int i_20_ = (i + i_19_) / 2;
                int i_21_ = i;
                int i_22_ = is[i_20_];
                is[i_20_] = is[i_19_];
                is[i_19_] = i_22_;
                int i_23_ = is_18_[i_20_];
                is_18_[i_20_] = is_18_[i_19_];
                is_18_[i_19_] = i_23_;
                int i_24_ = (i_22_ ^ 0xffffffff) == -2147483648 ? 0 : 1;
                for (int i_25_ = i; i_25_ < i_19_; i_25_++) {
                    if (((i_25_ & i_24_) + i_22_ ^ 0xffffffff) < (is[i_25_] ^ 0xffffffff)) {
                        int i_26_ = is[i_25_];
                        is[i_25_] = is[i_21_];
                        is[i_21_] = i_26_;
                        int i_27_ = is_18_[i_25_];
                        is_18_[i_25_] = is_18_[i_21_];
                        is_18_[i_21_++] = i_27_;
                    }
                }
                is[i_19_] = is[i_21_];
                is[i_21_] = i_22_;
                is_18_[i_19_] = is_18_[i_21_];
                is_18_[i_21_] = i_23_;
                method2396(is, i, (byte) -55, is_18_, i_21_ - 1);
                method2396(is, i_21_ + 1, (byte) -90, is_18_, i_19_);
            }
        }
    }

    static final void method2397(byte i) {
        anInt9587++;
        Class131.anInt1600 = 0;
        if (i == 73) {
            for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > -2049; i_28_++) {
                Class338.aClass248_Sub9Array3937[i_28_] = null;
                Class302.aByteArray3504[i_28_] = (byte) 1;
                Node_Sub8_Sub16.aClass107Array9053[i_28_] = null;
            }
        }
    }

    static final void method2398(int i, Entity entity, int i_29_) {
        anInt9585++;
        int i_30_ = -1;
        int i_31_ = 0;
        if ((((Entity) entity).forceMovementSpeed1 ^ 0xffffffff) < (Node_Sub18.anInt7027 ^ 0xffffffff))
            Class332.method3405(512, entity);
        else if ((Node_Sub18.anInt7027 ^ 0xffffffff) >= ((((Entity) entity).forceMovementSpeed2) ^ 0xffffffff))
            Class59.method463((byte) 33, entity);
        else {
            Class338.method3428(-1024, entity, false);
            i_30_ = Class84_Sub7.anInt5458;
            i_31_ = Class346_Sub7_Sub1_Sub2.anInt10195;
        }
        if (((((Interactable) entity).x ^ 0xffffffff) > -513) || ((Interactable) entity).y < 512 || ((512 * (Node_Sub8_Sub4.anInt8360 - 1) ^ 0xffffffff) >= (((Interactable) entity).x ^ 0xffffffff)) || ((((Interactable) entity).y ^ 0xffffffff) <= (512 * Node_Sub22.anInt7074 + -512 ^ 0xffffffff))) {
            ((Entity) entity).anIntArray10414 = null;
            i_30_ = -1;
            ((Entity) entity).forceMovementSpeed2 = 0;
            i_31_ = 0;
            ((Entity) entity).forceMovementSpeed1 = 0;
            ((Entity) entity).anInt10444 = -1;
            ((Interactable) entity).x = (512 * (((Entity) entity).posQueueX[0]) - -(256 * entity.method3632(-1)));
            ((Interactable) entity).y = ((((Entity) entity).posQueueY[0]) * 512 - -(256 * entity.method3632(-1)));
            entity.method3637(0);
            for (int i_32_ = 0; (((((Entity) entity).aClass305Array10441).length ^ 0xffffffff) < (i_32_ ^ 0xffffffff)); i_32_++)
                ((Class305) (((Entity) entity).aClass305Array10441[i_32_])).anInt3537 = -1;
        }
        if ((Class347.myPlayer == entity) && (((Interactable) entity).x < 6144 || ((Interactable) entity).y < 6144 || ((512 * (-12 + Node_Sub8_Sub4.anInt8360) ^ 0xffffffff) >= (((Interactable) entity).x ^ 0xffffffff)) || ((((Interactable) entity).y ^ 0xffffffff) <= ((Node_Sub22.anInt7074 - 12) * 512 ^ 0xffffffff)))) {
            ((Entity) entity).forceMovementSpeed2 = 0;
            i_30_ = -1;
            ((Entity) entity).anIntArray10414 = null;
            i_31_ = 0;
            ((Entity) entity).anInt10444 = -1;
            ((Entity) entity).forceMovementSpeed1 = 0;
            ((Interactable) entity).x = ((((Entity) entity).posQueueX[0]) * 512 + entity.method3632(-1) * 256);
            ((Interactable) entity).y = ((((Entity) entity).posQueueY[0]) * 512 + 256 * entity.method3632(i + -257));
            entity.method3637(0);
            for (int i_33_ = 0; ((i_33_ ^ 0xffffffff) > ((((Entity) entity).aClass305Array10441).length ^ 0xffffffff)); i_33_++)
                ((Class305) (((Entity) entity).aClass305Array10441[i_33_])).anInt3537 = -1;
        }
        int i_34_ = Class315.method3279(-1, entity);
        Class65.method511(i ^ ~0x3870, entity);
        Class189.method1637(i_31_, entity, (byte) -57, i_34_, i_30_);
        Class43.method312(entity, i_30_, i ^ i);
        Class140.method1282((byte) -125, entity);
    }

    public Node_Sub14_Sub39() {
        super(0, true);
        anInt9588 = 2048;
        anInt9595 = 0;
        anInt9591 = 2048;
        anInt9594 = 8192;
        anInt9597 = 0;
        anInt9601 = 12288;
    }
}
