/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class Class50 {
    static int anInt661;
    static int[] anIntArray662 = {19, 55, 38, 155, 255, 110, 137, 205, 76};
    static byte[][][] aByteArrayArrayArray663;
    static int anInt664;
    static int anInt665;
    private Class64 aClass64_666;
    static int anInt667;
    static int anInt668;
    private Node_Sub8 aClass248_Sub8_669;
    static int anInt670;
    static int anInt671;
    static int anInt672;
    static int anInt673;

    static final void method392(PacketStream class248_sub9_sub2, byte i) {
        anInt668++;
        Node_Sub38 class248_sub38 = (Node_Sub38) Node_Sub8_Sub2.aClass293_8915.method3119(2);
        if (class248_sub38 != null) {
            boolean bool = false;
            for (int i_0_ = 0; ((((Node_Sub38) class248_sub38).anInt7272 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
                if (((Node_Sub38) class248_sub38).aClass322Array7267[i_0_] != null) {
                    if (((((Node_Sub38) class248_sub38).aClass322Array7267[i_0_].anInt3788) ^ 0xffffffff) == -3)
                        ((Node_Sub38) class248_sub38).anIntArray7271[i_0_] = -5;
                    if (((((Node_Sub38) class248_sub38).aClass322Array7267[i_0_].anInt3788) ^ 0xffffffff) == -1)
                        bool = true;
                }
                if (((Node_Sub38) class248_sub38).aClass322Array7268[i_0_] != null) {
                    if (((((Node_Sub38) class248_sub38).aClass322Array7268[i_0_].anInt3788) ^ 0xffffffff) == -3)
                        ((Node_Sub38) class248_sub38).anIntArray7271[i_0_] = -6;
                    if (((((Node_Sub38) class248_sub38).aClass322Array7268[i_0_].anInt3788) ^ 0xffffffff) == -1)
                        bool = true;
                }
            }
            if (!bool) {
                int i_1_ = ((ByteStream) class248_sub9_sub2).offset;
                class248_sub9_sub2.writeInt(27695, ((Node_Sub38) class248_sub38).anInt7275);
                for (int i_2_ = 0; i_2_ < ((Node_Sub38) class248_sub38).anInt7272; i_2_++) {
                    if ((((Node_Sub38) class248_sub38).anIntArray7271[i_2_] ^ 0xffffffff) != -1)
                        class248_sub9_sub2.writeByte(-87, (((Node_Sub38) class248_sub38).anIntArray7271[i_2_]));
                    else {
                        try {
                            int i_3_ = (((Node_Sub38) class248_sub38).anIntArray7265[i_2_]);
                            if ((i_3_ ^ 0xffffffff) == -1) {
                                Field field = ((Field) (((Node_Sub38) class248_sub38).aClass322Array7267[i_2_].anObject3787));
                                int i_4_ = field.getInt(null);
                                class248_sub9_sub2.writeByte(-100, 0);
                                class248_sub9_sub2.writeInt(27695, i_4_);
                            } else if (i_3_ != 1) {
                                if (i_3_ == 2) {
                                    Field field = ((Field) (((Node_Sub38) class248_sub38).aClass322Array7267[i_2_].anObject3787));
                                    int i_5_ = field.getModifiers();
                                    class248_sub9_sub2.writeByte(-74, 0);
                                    class248_sub9_sub2.writeInt(27695, i_5_);
                                }
                            } else {
                                Field field = ((Field) (((Node_Sub38) class248_sub38).aClass322Array7267[i_2_].anObject3787));
                                field.setInt(null, (((Node_Sub38) class248_sub38).anIntArray7273[i_2_]));
                                class248_sub9_sub2.writeByte(-92, 0);
                            }
                            if (i_3_ != 3) {
                                if (i_3_ == 4) {
                                    Method method = ((Method) (((Node_Sub38) class248_sub38).aClass322Array7268[i_2_].anObject3787));
                                    int i_6_ = method.getModifiers();
                                    class248_sub9_sub2.writeByte(-74, 0);
                                    class248_sub9_sub2.writeInt(27695, i_6_);
                                }
                            } else {
                                Method method = ((Method) (((Node_Sub38) class248_sub38).aClass322Array7268[i_2_].anObject3787));
                                byte[][] is = (((Node_Sub38) class248_sub38).aByteArrayArrayArray7274[i_2_]);
                                Object[] objects = new Object[is.length];
                                for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_7_++) {
                                    ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_7_])));
                                    objects[i_7_] = objectinputstream.readObject();
                                }
                                Object object = method.invoke(null, objects);
                                if (object == null)
                                    class248_sub9_sub2.writeByte(-56, 0);
                                else if (!(object instanceof Number)) {
                                    if (object instanceof String) {
                                        class248_sub9_sub2.writeByte(-105, 2);
                                        class248_sub9_sub2.method2183((String) object, (byte) -110);
                                    } else
                                        class248_sub9_sub2.writeByte(-109, 4);
                                } else {
                                    class248_sub9_sub2.writeByte(-49, 1);
                                    class248_sub9_sub2.writeLong(14731, ((Number) object).longValue());
                                }
                            }
                        } catch (ClassNotFoundException classnotfoundexception) {
                            class248_sub9_sub2.writeByte(-51, -10);
                        } catch (java.io.InvalidClassException invalidclassexception) {
                            class248_sub9_sub2.writeByte(-30, -11);
                        } catch (java.io.StreamCorruptedException streamcorruptedexception) {
                            class248_sub9_sub2.writeByte(-83, -12);
                        } catch (java.io.OptionalDataException optionaldataexception) {
                            class248_sub9_sub2.writeByte(-73, -13);
                        } catch (IllegalAccessException illegalaccessexception) {
                            class248_sub9_sub2.writeByte(-116, -14);
                        } catch (IllegalArgumentException illegalargumentexception) {
                            class248_sub9_sub2.writeByte(-85, -15);
                        } catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
                            class248_sub9_sub2.writeByte(-32, -16);
                        } catch (SecurityException securityexception) {
                            class248_sub9_sub2.writeByte(-74, -17);
                        } catch (java.io.IOException ioexception) {
                            class248_sub9_sub2.writeByte(-111, -18);
                        } catch (NullPointerException nullpointerexception) {
                            class248_sub9_sub2.writeByte(-34, -19);
                        } catch (Exception exception) {
                            class248_sub9_sub2.writeByte(-60, -20);
                        } catch (Throwable throwable) {
                            class248_sub9_sub2.writeByte(-103, -21);
                        }
                    }
                }
                class248_sub9_sub2.method2196(i_1_, false);
                class248_sub38.remove(true);
                if (i < 88)
                    anInt672 = 12;
            }
        }
    }

    static final int method393(byte i, int i_8_) {
        if (i >= -121)
            method397((byte) -78);
        anInt671++;
        return i_8_ & 0x3ff;
    }

    static final boolean method394(int i, int i_9_) {
        anInt665++;
        if (i_9_ >= -111)
            method399(44, 33, true);
        if (i != 2 && i != 3)
            return false;
        return true;
    }

    static final String method395(int i) {
        anInt670++;
        String string = "www";
        if (Class18.aClass339_295 != Class187.aClass339_2177) {
            if (RSInterface2.aClass339_4311 == Class18.aClass339_295)
                string = "www-wtqa";
            else if (Class346_Sub7_Sub1_Sub1.aClass339_10136 == Class18.aClass339_295)
                string = "www-wtwip";
        } else
            string = "www-wtrc";
        String string_10_ = "";
        if (Class84_Sub8.aString5473 != null)
            string_10_ = "/p=" + Class84_Sub8.aString5473;
        if (i != -1)
            return null;
        return ("http://" + string + "." + ((Class215) Class12.aClass215_249).aString2478 + ".com/l=" + Class191.anInt4822 + "/a=" + Node_Sub8_Sub5.anInt8930 + string_10_ + "/");
    }

    public static void method396(int i) {
        anIntArray662 = null;
        if (i == 3200)
            aByteArrayArrayArray663 = null;
    }

    static final void method397(byte i) {
        anInt673++;
        if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7333.method2952(true) == 2) {
            if (i != 112)
                method392(null, (byte) -59);
            byte i_11_ = (byte) (-4 + Class54.anInt727 & 0xff);
            int i_12_ = Class54.anInt727 % Node_Sub8_Sub4.anInt8360;
            for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -5; i_13_++) {
                for (int i_14_ = 0; ((Node_Sub22.anInt7074 ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++)
                    Class283.aByteArrayArrayArray3338[i_13_][i_12_][i_14_] = i_11_;
            }
            if (Class177.anInt2074 != 3) {
                for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -3; i_15_++) {
                    Class208.anIntArray2403[i_15_] = -1000000;
                    Class114.anIntArray1426[i_15_] = 1000000;
                    Class340_Sub7.anIntArray8163[i_15_] = 0;
                    Class346_Sub7_Sub3_Sub1.anIntArray10513[i_15_] = 1000000;
                    s_Sub3.anIntArray8013[i_15_] = 0;
                }
                int i_16_ = (((Interactable) Class347.myPlayer).x);
                int i_17_ = (((Interactable) Class347.myPlayer).y);
                if ((Node_Sub45.anInt7343 ^ 0xffffffff) == -2 || Node_Sub14_Sub21.anInt9379 != -1) {
                    if ((Node_Sub45.anInt7343 ^ 0xffffffff) != -2) {
                        i_16_ = Node_Sub14_Sub21.anInt9379;
                        i_17_ = Class359.anInt4436;
                    }
                    if (((r.aByteArrayArrayArray9033[Class177.anInt2074][i_16_ >> 899506057][i_17_ >> 170195177]) & 0x4) != 0)
                        Class346_Sub10.method3720(0, i_17_ >> -961226135, false, i_16_ >> 179273609, Class311.aClass137ArrayArrayArray3620, 0);
                    if ((Class127.cameraPitch ^ 0xffffffff) > -2561) {
                        int i_18_ = Class346_Sub7_Sub1.cameraPosX >> 645535689;
                        int i_19_ = Class316_Sub1_Sub2.cameraPosZ >> 1228025929;
                        int i_20_ = i_16_ >> 59293801;
                        int i_21_ = i_17_ >> 2143021769;
                        int i_22_;
                        if ((i_20_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff))
                            i_22_ = -i_18_ + i_20_;
                        else
                            i_22_ = i_18_ + -i_20_;
                        int i_23_;
                        if ((i_21_ ^ 0xffffffff) >= (i_19_ ^ 0xffffffff))
                            i_23_ = i_19_ - i_21_;
                        else
                            i_23_ = -i_19_ + i_21_;
                        if (((i_22_ ^ 0xffffffff) == -1 && (i_23_ ^ 0xffffffff) == -1) || ((-Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) <= (i_22_ ^ 0xffffffff)) || i_22_ >= Node_Sub8_Sub4.anInt8360 || i_23_ <= -Node_Sub22.anInt7074 || ((Node_Sub22.anInt7074 ^ 0xffffffff) >= (i_23_ ^ 0xffffffff)))
                            Class282_Sub14.method2975(("RC: " + i_18_ + "," + i_19_ + " " + i_20_ + "," + i_21_ + " " + Class67.baseX + "," + Class368.baseY), null, 1);
                        else if (i_23_ >= i_22_) {
                            int i_24_ = 65536 * i_22_ / i_23_;
                            int i_25_ = 32768;
                            while (i_21_ != i_19_) {
                                if ((i_19_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff))
                                    i_19_++;
                                else if (i_21_ < i_19_)
                                    i_19_--;
                                if ((0x4 & (r.aByteArrayArrayArray9033[Class177.anInt2074][i_18_][i_19_])) != 0) {
                                    Class346_Sub10.method3720(1, i_19_, false, i_18_, Class311.aClass137ArrayArrayArray3620, i + -112);
                                    break;
                                }
                                i_25_ += i_24_;
                                if (i_25_ >= 65536) {
                                    if (i_18_ >= i_20_) {
                                        if ((i_18_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff))
                                            i_18_--;
                                    } else
                                        i_18_++;
                                    i_25_ -= 65536;
                                    if ((((r.aByteArrayArrayArray9033[Class177.anInt2074][i_18_][i_19_]) & 0x4) ^ 0xffffffff) != -1) {
                                        Class346_Sub10.method3720(1, i_19_, false, i_18_, (Class311.aClass137ArrayArrayArray3620), 0);
                                        break;
                                    }
                                }
                            }
                        } else {
                            int i_26_ = 65536 * i_23_ / i_22_;
                            int i_27_ = 32768;
                            while ((i_18_ ^ 0xffffffff) != (i_20_ ^ 0xffffffff)) {
                                if (i_20_ > i_18_)
                                    i_18_++;
                                else if ((i_18_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff))
                                    i_18_--;
                                if (((r.aByteArrayArrayArray9033[Class177.anInt2074][i_18_][i_19_]) & 0x4) != 0) {
                                    Class346_Sub10.method3720(1, i_19_, false, i_18_, Class311.aClass137ArrayArrayArray3620, i + -112);
                                    break;
                                }
                                i_27_ += i_26_;
                                if (i_27_ >= 65536) {
                                    i_27_ -= 65536;
                                    if (i_21_ > i_19_)
                                        i_19_++;
                                    else if (i_19_ > i_21_)
                                        i_19_--;
                                    if ((((r.aByteArrayArrayArray9033[Class177.anInt2074][i_18_][i_19_]) & 0x4) ^ 0xffffffff) != -1) {
                                        Class346_Sub10.method3720(1, i_19_, false, i_18_, (Class311.aClass137ArrayArrayArray3620), 0);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int i_28_ = Class353.method3753(Class316_Sub1_Sub2.cameraPosZ, Class346_Sub7_Sub1.cameraPosX, 127, Class177.anInt2074);
                    if (i_28_ + -InputStream_Sub1.cameraPosY < 3200 && ((0x4 & (r.aByteArrayArrayArray9033[Class177.anInt2074][Class346_Sub7_Sub1.cameraPosX >> 1605279753][Class316_Sub1_Sub2.cameraPosZ >> 1881763209])) != 0))
                        Class346_Sub10.method3720(1, Class316_Sub1_Sub2.cameraPosZ >> -992724151, false, Class346_Sub7_Sub1.cameraPosX >> -1372257303, Class311.aClass137ArrayArrayArray3620, 0);
                }
            }
        }
    }

    final Node_Sub8 method398(boolean bool) {
        anInt661++;
        Node_Sub8 class248_sub8 = aClass248_Sub8_669;
        if (class248_sub8 == ((Class64) aClass64_666).aClass248_Sub8_856) {
            aClass248_Sub8_669 = null;
            return null;
        }
        aClass248_Sub8_669 = ((Node_Sub8) class248_sub8).aClass248_Sub8_6871;
        if (bool != false)
            method393((byte) -46, -88);
        return class248_sub8;
    }

    static final boolean method399(int i, int i_29_, boolean bool) {
        if (bool != false)
            method397((byte) -8);
        anInt664++;
        if ((0x800 & i ^ 0xffffffff) == -1 || (i_29_ & 0x37 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    final Node_Sub8 method400(byte i) {
        anInt667++;
        if (i != 47)
            return null;
        Node_Sub8 class248_sub8 = (((Node_Sub8) ((Class64) aClass64_666).aClass248_Sub8_856).aClass248_Sub8_6871);
        if (((Class64) aClass64_666).aClass248_Sub8_856 == class248_sub8) {
            aClass248_Sub8_669 = null;
            return null;
        }
        aClass248_Sub8_669 = ((Node_Sub8) class248_sub8).aClass248_Sub8_6871;
        return class248_sub8;
    }

    public Class50() {
        /* empty */
    }

    Class50(Class64 class64) {
        aClass64_666 = class64;
    }
}
