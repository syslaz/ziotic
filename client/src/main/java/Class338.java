/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.lang.reflect.Method;

final class Class338 {
    static int anInt3936;
    static ByteStream[] aClass248_Sub9Array3937 = new ByteStream[2048];
    static int anInt3938;
    static int anInt3939 = -1;
    static int requestAttempts;
    Class26 aClass26_3941 = new Class26();
    static int anInt3942;
    static int anInt3943;
    /*synthetic*/ static Class aClass3944;

    static final void method3425(int i, boolean bool, File file) {
        if (i != 0)
            anInt3938 = 105;
        anInt3942++;
        if (Class188.anObject2188 == null)
            Class373.method3870(6143);
        try {
            Class var_class = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method method = (var_class.getDeclaredMethod("dumpHeap", new Class[]{(aClass3944 != null ? aClass3944 : (aClass3944 = method3429("java.lang.String"))), Boolean.TYPE}));
            method.invoke(Class188.anObject2188, new Object[]{file.getAbsolutePath(), new Boolean(bool)});
        } catch (Exception exception) {
            System.out.println("HeapDump error:");
            exception.printStackTrace();
        }
    }

    public static void method3426(byte i) {
        if (i <= -28)
            aClass248_Sub9Array3937 = null;
    }

    static final void method3427(Class229 class229, int i, int i_0_) {
        anInt3936++;
        if (Node_Sub8.aBoolean6865) {
            Node_Sub8.aBoolean6865 = false;
            i_0_ = 0;
        }
        if (Class112_Sub3.aClass229_8641 == null || !Class112_Sub3.aClass229_8641.method1830(2, class229)) {
            Class112_Sub3.aClass229_8641 = class229;
            Class260.aLong2966 = Class118.method1112(116);
            Class340.anInt3959 = Class151.anInt1804 = i_0_;
            if ((Class340.anInt3959 ^ 0xffffffff) != -1) {
                Class214.aFloat2472 = Class282_Sub24.aFloat7839;
                ISAACCypher.aFloat2199 = Class136_Sub3.aFloat8401;
                Class109.aFloat1380 = Node_Sub46.aFloat7374;
                Node_Sub14_Sub20.aFloat9373 = Class376.aFloat4940;
                Class23.anInt325 = Class224.anInt2545;
                Class307.anInt3557 = Node_Sub13.anInt6973;
                Class282_Sub15.aFloat7750 = Class365.aFloat4480;
                Class84_Sub7.aFloat5468 = Class346_Sub7_Sub2_Sub1.aFloat10024;
                Node_Sub14_Sub5.aClass316_9209 = Node_Sub8_Sub12.aClass316_9013;
                Interactable.anInt8325 = aa_Sub1.anInt5255;
            } else
                Class340_Sub6.method3463(true);
        }
        if (i != 0)
            method3426((byte) -13);
    }

    static final void method3428(int i, Entity entity, boolean bool) {
        anInt3943++;
        Class281 class281 = entity.method3642(i ^ i);
        if ((((Entity) entity).anInt10503 ^ 0xffffffff) == -1) {
            Class84_Sub7.anInt5458 = -1;
            ((Entity) entity).anInt10500 = 0;
            Class346_Sub7_Sub1_Sub2.anInt10195 = 0;
        } else {
            if ((((Entity) entity).anInt10444 != -1) && (((Entity) entity).anInt10424) == 0) {
                Class182 class182 = (Class235.aClass356_2617.method3790((byte) -90, (((Entity) entity).anInt10444)));
                if ((((Entity) entity).anInt10505) > 0 && ((Class182) class182).anInt2107 == 0) {
                    ((Entity) entity).anInt10500++;
                    Class346_Sub7_Sub1_Sub2.anInt10195 = 0;
                    Class84_Sub7.anInt5458 = -1;
                    return;
                }
                if (((((Entity) entity).anInt10505) ^ 0xffffffff) >= -1 && (((Class182) class182).anInt2105 ^ 0xffffffff) == -1) {
                    Class346_Sub7_Sub1_Sub2.anInt10195 = 0;
                    ((Entity) entity).anInt10500++;
                    Class84_Sub7.anInt5458 = -1;
                    return;
                }
            }
            for (int i_1_ = 0; ((((Entity) entity).aClass305Array10441).length > i_1_); i_1_++) {
                if ((((Class305) (((Entity) entity).aClass305Array10441[i_1_])).anInt3537 ^ 0xffffffff) != 0 && ((Node_Sub18.anInt7027 ^ 0xffffffff) <= (((Class305) (((Entity) entity).aClass305Array10441[i_1_])).anInt3538 ^ 0xffffffff))) {
                    Class51 class51 = (Class279_Sub2.aClass151_7577.method1353(((Class305) (((Entity) entity).aClass305Array10441[i_1_])).anInt3537, -1));
                    if (((Class51) class51).aBoolean682 && (((Class51) class51).anInt690 ^ 0xffffffff) != 0) {
                        Class182 class182 = Class235.aClass356_2617.method3790((byte) -90, (((Class51) class51).anInt690));
                        if (((Entity) entity).anInt10505 > 0 && ((Class182) class182).anInt2107 == 0) {
                            ((Entity) entity).anInt10500++;
                            Class84_Sub7.anInt5458 = -1;
                            Class346_Sub7_Sub1_Sub2.anInt10195 = 0;
                            return;
                        }
                        if (((Entity) entity).anInt10505 <= 0 && ((((Class182) class182).anInt2105 ^ 0xffffffff) == -1)) {
                            Class346_Sub7_Sub1_Sub2.anInt10195 = 0;
                            ((Entity) entity).anInt10500++;
                            Class84_Sub7.anInt5458 = -1;
                            return;
                        }
                    }
                }
            }
            int i_2_ = ((Interactable) entity).x;
            int i_3_ = ((Interactable) entity).y;
            int i_4_ = (512 * (((Entity) entity).posQueueX[-1 + ((Entity) entity).anInt10503]) + entity.method3632(-1) * 256);
            int i_5_ = ((((Entity) entity).posQueueY[(((Entity) entity).anInt10503) - 1]) * 512 - -(entity.method3632(-1) * 256));
            if ((i_2_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
                if ((i_5_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff)) {
                    if ((i_3_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff))
                        entity.faceDir(false, 12288);
                    else
                        entity.faceDir(false, 14336);
                } else
                    entity.faceDir(false, 10240);
            } else if (i_4_ < i_2_) {
                if (i_5_ <= i_3_) {
                    if ((i_3_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff))
                        entity.faceDir(false, 2048);
                    else
                        entity.faceDir(false, 4096);
                } else
                    entity.faceDir(false, 6144);
            } else if ((i_5_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff)) {
                if (i_5_ < i_3_)
                    entity.faceDir(false, 0);
            } else
                entity.faceDir(false, 8192);
            byte i_6_ = (((Entity) entity).aByteArray10499[(((Entity) entity).anInt10503) + -1]);
            if (!bool && (-i_2_ + i_4_ > 1024 || (i_4_ + -i_2_ ^ 0xffffffff) > 1023 || (-i_3_ + i_5_ ^ 0xffffffff) < -1025 || i_5_ - i_3_ < -1024)) {
                ((Interactable) entity).y = i_5_;
                ((Interactable) entity).x = i_4_;
                entity.method3644((byte) -17, (((Entity) entity).anInt10427), false);
                Class84_Sub7.anInt5458 = -1;
                Class346_Sub7_Sub1_Sub2.anInt10195 = 0;
                if (((((Entity) entity).anInt10505) ^ 0xffffffff) < -1)
                    ((Entity) entity).anInt10505--;
                ((Entity) entity).anInt10503--;
            } else {
                int i_7_ = 16;
                boolean bool_8_ = true;
                if (entity instanceof NPC)
                    bool_8_ = ((Class255) (((NPC) (NPC) entity).aClass255_10614)).aBoolean2850;
                if (!bool_8_) {
                    if (!bool && (((Entity) entity).anInt10503 ^ 0xffffffff) < -2)
                        i_7_ = 24;
                    if (!bool && (((Entity) entity).anInt10503 ^ 0xffffffff) < -3)
                        i_7_ = 32;
                } else {
                    int i_9_ = (-((Class109) (((Entity) entity).aClass109_10471)).anInt1378 + ((Entity) entity).anInt10427);
                    if ((i_9_ ^ 0xffffffff) != -1 && (((Entity) entity).faceEntity) == -1 && (((Entity) entity).anInt10480) != 0)
                        i_7_ = 8;
                    if (!bool && (((Entity) entity).anInt10503 ^ 0xffffffff) < -3)
                        i_7_ = 24;
                    if (!bool && (((Entity) entity).anInt10503 ^ 0xffffffff) < -4)
                        i_7_ = 32;
                }
                if ((((Entity) entity).anInt10500) > 0 && (((Entity) entity).anInt10503) > 1) {
                    ((Entity) entity).anInt10500--;
                    i_7_ = 32;
                }
                if ((i_6_ ^ 0xffffffff) == -3)
                    i_7_ <<= 1;
                else if ((i_6_ ^ 0xffffffff) == -1)
                    i_7_ >>= 1;
                if (((Class281) class281).anInt3282 != -1) {
                    i_7_ <<= 9;
                    if ((((Entity) entity).anInt10503) != 1) {
                        if (i_7_ <= ((Entity) entity).anInt10507) {
                            if (((Entity) entity).anInt10507 > 0) {
                                ((Entity) entity).anInt10507 -= ((Class281) class281).anInt3282;
                                if ((((Entity) entity).anInt10507 ^ 0xffffffff) > -1)
                                    ((Entity) entity).anInt10507 = 0;
                            }
                        } else {
                            ((Entity) entity).anInt10507 += ((Class281) class281).anInt3282;
                            if ((i_7_ ^ 0xffffffff) > (((Entity) entity).anInt10507 ^ 0xffffffff))
                                ((Entity) entity).anInt10507 = i_7_;
                        }
                    } else {
                        int i_10_ = (((Entity) entity).anInt10507 * ((Entity) entity).anInt10507);
                        int i_11_ = (((((Interactable) entity).x) <= i_4_ ? i_4_ - ((Interactable) entity).x : -i_4_ + ((Interactable) entity).x) << 748605673);
                        int i_12_ = (((((Interactable) entity).y) <= i_5_ ? i_5_ - ((Interactable) entity).y : (((Interactable) entity).y) - i_5_) << 1399853065);
                        int i_13_ = ((i_12_ ^ 0xffffffff) <= (i_11_ ^ 0xffffffff) ? i_12_ : i_11_);
                        int i_14_ = 2 * ((Class281) class281).anInt3282 * i_13_;
                        if (i_10_ <= i_14_) {
                            if ((i_13_ ^ 0xffffffff) <= (i_10_ / 2 ^ 0xffffffff)) {
                                if (((Entity) entity).anInt10507 < i_7_) {
                                    ((Entity) entity).anInt10507 += ((Class281) class281).anInt3282;
                                    if ((((Entity) entity).anInt10507 ^ 0xffffffff) < (i_7_ ^ 0xffffffff))
                                        ((Entity) entity).anInt10507 = i_7_;
                                }
                            } else {
                                ((Entity) entity).anInt10507 -= ((Class281) class281).anInt3282;
                                if (((Entity) entity).anInt10507 < 0)
                                    ((Entity) entity).anInt10507 = 0;
                            }
                        } else
                            ((Entity) entity).anInt10507 /= 2;
                    }
                    i_7_ = (((Entity) entity).anInt10507) >> 63295049;
                    if (i_7_ < 1)
                        i_7_ = 1;
                }
                Class346_Sub7_Sub1_Sub2.anInt10195 = 0;
                if (i_4_ == i_2_ && (i_3_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff))
                    Class84_Sub7.anInt5458 = -1;
                else {
                    if (i_4_ <= i_2_) {
                        if (i_2_ > i_4_) {
                            ((Interactable) entity).x -= i_7_;
                            Class346_Sub7_Sub1_Sub2.anInt10195 |= 0x8;
                            if (i_4_ > (((Interactable) entity).x))
                                ((Interactable) entity).x = i_4_;
                        }
                    } else {
                        ((Interactable) entity).x += i_7_;
                        Class346_Sub7_Sub1_Sub2.anInt10195 |= 0x4;
                        if (((Interactable) entity).x > i_4_)
                            ((Interactable) entity).x = i_4_;
                    }
                    if ((i_3_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff)) {
                        if ((i_3_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
                            Class346_Sub7_Sub1_Sub2.anInt10195 |= 0x2;
                            ((Interactable) entity).y -= i_7_;
                            if ((i_5_ ^ 0xffffffff) < ((((Interactable) entity).y) ^ 0xffffffff))
                                ((Interactable) entity).y = i_5_;
                        }
                    } else {
                        Class346_Sub7_Sub1_Sub2.anInt10195 |= 0x1;
                        ((Interactable) entity).y += i_7_;
                        if (((((Interactable) entity).y) ^ 0xffffffff) < (i_5_ ^ 0xffffffff))
                            ((Interactable) entity).y = i_5_;
                    }
                    if ((i_7_ ^ 0xffffffff) <= -33)
                        Class84_Sub7.anInt5458 = 2;
                    else
                        Class84_Sub7.anInt5458 = i_6_;
                }
                if (((Interactable) entity).x == i_4_ && ((i_5_ ^ 0xffffffff) == (((Interactable) entity).y ^ 0xffffffff))) {
                    ((Entity) entity).anInt10503--;
                    if (((((Entity) entity).anInt10505) ^ 0xffffffff) < -1)
                        ((Entity) entity).anInt10505--;
                }
            }
        }
    }

    public Class338() {
        /* empty */
    }

    /*synthetic*/
    static Class method3429(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
