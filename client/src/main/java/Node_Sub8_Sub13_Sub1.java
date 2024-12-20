/* Class248_Sub8_Sub13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.lang.reflect.Method;

final class Node_Sub8_Sub13_Sub1 extends Node_Sub8_Sub13 {
    static boolean aBoolean10242 = false;
    byte aByte10243;
    static int anInt10244;
    static int anInt10245;
    static int anInt10246;
    static int anInt10247;
    int anInt10248;
    static int anInt10249;
    ByteStream aClass248_Sub9_10250;
    /*synthetic*/ static Class aClass10251;

    static final boolean method2099(int i, Class var_class, String string) {
        anInt10245++;
        if (i != 492219900)
            return false;
        Class var_class_0_ = (Class) Class26.aHashtable355.get(string);
        if (var_class_0_ != null) {
            if (var_class_0_.getClassLoader() != var_class.getClassLoader())
                return false;
            return true;
        }
        File file = null;
        if (file == null)
            file = (File) IOException_Sub1.aHashtable84.get(string);
        if (file != null) {
            try {
                file = new File(file.getCanonicalPath());
                Class var_class_1_ = Class.forName("java.lang.Runtime");
                Class var_class_2_ = Class.forName("java.lang.reflect.AccessibleObject");
                Method method = var_class_2_.getDeclaredMethod("setAccessible", (new Class[]{Boolean.TYPE}));
                Method method_3_ = (var_class_1_.getDeclaredMethod("load0", new Class[]{Class.forName("java.lang.Class"), Class.forName("java.lang.String")}));
                method.invoke(method_3_, new Object[]{Boolean.TRUE});
                method_3_.invoke(Runtime.getRuntime(), new Object[]{var_class, file.getPath()});
                method.invoke(method_3_, new Object[]{Boolean.FALSE});
                Class26.aHashtable355.put(string, var_class);
                return true;
            } catch (NoSuchMethodException nosuchmethodexception) {
                System.load(file.getPath());
                Class26.aHashtable355.put(string, (aClass10251 != null ? aClass10251 : (aClass10251 = method2103("Class176"))));
                return true;
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        return false;
    }

    final int method2096(int i) {
        anInt10244++;
        if (i != 0)
            return 2;
        if (((Node_Sub8_Sub13_Sub1) this).aClass248_Sub9_10250 == null)
            return 0;
        return (((ByteStream) (((Node_Sub8_Sub13_Sub1) this).aClass248_Sub9_10250)).offset * 100 / ((((ByteStream) ((Node_Sub8_Sub13_Sub1) this).aClass248_Sub9_10250).buffer).length - ((Node_Sub8_Sub13_Sub1) this).aByte10243));
    }

    static final void method2100(d var_d, ha var_ha, byte i) {
        anInt10249++;
        if (Class116.aClass248_Sub8_Sub1_1434 != null) {
            if (Node_Sub14_Sub5.anInt9208 < 10) {
                if (!Class116.aClass381_1431.method3931((((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).aString8905), true)) {
                    Node_Sub14_Sub5.anInt9208 = (Class282_Sub14.aClass381_7724.method3916(-7, (((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).aString8905))) / 10;
                    return;
                }
                Class226_Sub1.method1805((byte) 37);
                Node_Sub14_Sub5.anInt9208 = 10;
            }
            if (Node_Sub14_Sub5.anInt9208 == 10) {
                Class116.anInt1468 = (((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).anInt8897) >> -622255290 << 759159238;
                Class116.anInt1469 = (((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).anInt8887) >> -493274330 << -1031531834;
                Class116.anInt1465 = (64 + -Class116.anInt1468 + (((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).anInt8888 >> 452616774 << 1662240966));
                Class116.anInt1457 = (((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).anInt8901 >> 1690165606 << 1093401766) - Class116.anInt1469 - -64;
                int[] is = new int[3];
                int i_4_ = -1;
                int i_5_ = -1;
                if (Class116.aClass248_Sub8_Sub1_1434.method2031(is, (Class67.baseX - -((((Interactable) Class347.myPlayer).x) >> -2134044375)), (((Interactable) Class347.myPlayer).y >> 795578569) + Class368.baseY, ((Interactable) Class347.myPlayer).plane, 0)) {
                    i_5_ = is[2] + -Class116.anInt1469;
                    i_4_ = is[1] + -Class116.anInt1468;
                }
                if (!Node_Sub46.aBoolean7386 && i_4_ >= 0 && (Class116.anInt1465 ^ 0xffffffff) < (i_4_ ^ 0xffffffff) && i_5_ >= 0 && (Class116.anInt1457 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
                    i_5_ += -5 + (int) (Math.random() * 10.0);
                    i_4_ += -5 + (int) (10.0 * Math.random());
                    Node_Sub14_Sub30.anInt9478 = i_4_;
                    Class261.anInt2972 = i_5_;
                } else if (Class282_Sub24.anInt7837 == -1 || (RSInterface2.anInt4372 ^ 0xffffffff) == 0) {
                    Class116.aClass248_Sub8_Sub1_1434.method2034((((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).anInt8891 >> -811704562) & 0x3fff, is, 0x3fff & (((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).anInt8891), -28);
                    Node_Sub14_Sub30.anInt9478 = is[1] - Class116.anInt1468;
                    Class261.anInt2972 = is[2] + -Class116.anInt1469;
                } else {
                    Class116.aClass248_Sub8_Sub1_1434.method2034(Class282_Sub24.anInt7837, is, RSInterface2.anInt4372, -79);
                    if (is != null) {
                        Node_Sub14_Sub30.anInt9478 = -Class116.anInt1468 + is[1];
                        Class261.anInt2972 = -Class116.anInt1469 + is[2];
                    }
                    Class282_Sub24.anInt7837 = RSInterface2.anInt4372 = -1;
                    Node_Sub46.aBoolean7386 = false;
                }
                if (((((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).anInt8900) ^ 0xffffffff) == -38)
                    Class116.aFloat1448 = Class116.aFloat1447 = 3.0F;
                else if ((((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).anInt8900 ^ 0xffffffff) != -51) {
                    if ((((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).anInt8900 ^ 0xffffffff) == -76)
                        Class116.aFloat1448 = Class116.aFloat1447 = 6.0F;
                    else if (((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).anInt8900 != 100) {
                        if ((((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).anInt8900 ^ 0xffffffff) != -201)
                            Class116.aFloat1448 = Class116.aFloat1447 = 8.0F;
                        else
                            Class116.aFloat1448 = Class116.aFloat1447 = 16.0F;
                    } else
                        Class116.aFloat1448 = Class116.aFloat1447 = 8.0F;
                } else
                    Class116.aFloat1448 = Class116.aFloat1447 = 4.0F;
                Class116.anInt1446 = (int) Class116.aFloat1447 >> -2125667327;
                Class116.aByteArrayArrayArray1442 = Class51.method402(0, Class116.anInt1446);
                Class296.method3132((byte) -7);
                Class116.method1085();
                Class102.aClass293_1308 = new Class293();
                Class116.anInt1440 += (int) (Math.random() * 5.0) - 2;
                if ((Class116.anInt1440 ^ 0xffffffff) > 7)
                    Class116.anInt1440 = -8;
                if (Class116.anInt1440 > 8)
                    Class116.anInt1440 = 8;
                Class116.anInt1445 += -2 + (int) (Math.random() * 5.0);
                if ((Class116.anInt1445 ^ 0xffffffff) > 15)
                    Class116.anInt1445 = -16;
                if ((Class116.anInt1445 ^ 0xffffffff) < -17)
                    Class116.anInt1445 = 16;
                Class116.method1097(var_d, (Class116.anInt1440 >> -1298478846 << -429643542), Class116.anInt1445 >> -270095775);
                Class116.aClass257_1436.method2751(1024, (byte) -115, 256);
                Class116.aClass39_1435.method290(1, 256, 256);
                Class116.aClass368_1437.method3842(4096, true);
                Class229.aClass331_2582.method3396(256, -886);
                Node_Sub14_Sub5.anInt9208 = 20;
            } else {
                if (i > -76)
                    method2100(null, null, (byte) -113);
                if (Node_Sub14_Sub5.anInt9208 == 20) {
                    Class136.method1243(-16777216, true);
                    Class116.method1098(var_ha, Class116.anInt1440, Class116.anInt1445);
                    Node_Sub14_Sub5.anInt9208 = 60;
                    Class136.method1243(-16777216, true);
                    Class366.method3830(0);
                } else if ((Node_Sub14_Sub5.anInt9208 ^ 0xffffffff) == -61) {
                    if (Class116.aClass381_1431.method3913((((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).aString8905 + "_staticelements"), false)) {
                        if (!Class116.aClass381_1431.method3931((((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).aString8905 + "_staticelements"), true))
                            return;
                        Class116.aClass380_1444 = Class72.method539(Class115.aBoolean4950, Class116.aClass381_1431, 255, ((((Node_Sub8_Sub1) (Class116.aClass248_Sub8_Sub1_1434)).aString8905) + "_staticelements"));
                    } else
                        Class116.aClass380_1444 = new Class380(0);
                    Class116.method1101();
                    Node_Sub14_Sub5.anInt9208 = 70;
                    Class136.method1243(-16777216, true);
                    Class366.method3830(0);
                } else if ((Node_Sub14_Sub5.anInt9208 ^ 0xffffffff) == -71) {
                    Node_Sub14_Sub17.aClass243_9341 = new Class243(var_ha, 11, true, Class297_Sub1.aCanvas8478);
                    Node_Sub14_Sub5.anInt9208 = 73;
                    Class136.method1243(-16777216, true);
                    Class366.method3830(0);
                } else if ((Node_Sub14_Sub5.anInt9208 ^ 0xffffffff) == -74) {
                    Class198.aClass243_2267 = new Class243(var_ha, 12, true, Class297_Sub1.aCanvas8478);
                    Node_Sub14_Sub5.anInt9208 = 76;
                    Class136.method1243(-16777216, true);
                    Class366.method3830(0);
                } else if (Node_Sub14_Sub5.anInt9208 == 76) {
                    Class377.aClass243_4623 = new Class243(var_ha, 14, true, Class297_Sub1.aCanvas8478);
                    Node_Sub14_Sub5.anInt9208 = 79;
                    Class136.method1243(-16777216, true);
                    Class366.method3830(0);
                } else if (Node_Sub14_Sub5.anInt9208 == 79) {
                    Class102.aClass243_1310 = new Class243(var_ha, 17, true, Class297_Sub1.aCanvas8478);
                    Node_Sub14_Sub5.anInt9208 = 82;
                    Class136.method1243(-16777216, true);
                    Class366.method3830(0);
                } else if (Node_Sub14_Sub5.anInt9208 == 82) {
                    Node_Sub15_Sub4.aClass243_9698 = new Class243(var_ha, 19, true, Class297_Sub1.aCanvas8478);
                    Node_Sub14_Sub5.anInt9208 = 85;
                    Class136.method1243(-16777216, true);
                    Class366.method3830(0);
                } else if (Node_Sub14_Sub5.anInt9208 == 85) {
                    Class340_Sub8.aClass243_8196 = new Class243(var_ha, 22, true, Class297_Sub1.aCanvas8478);
                    Node_Sub14_Sub5.anInt9208 = 88;
                    Class136.method1243(-16777216, true);
                    Class366.method3830(0);
                } else if (Node_Sub14_Sub5.anInt9208 == 88) {
                    Class238_Sub3.aClass243_6774 = new Class243(var_ha, 26, true, Class297_Sub1.aCanvas8478);
                    Node_Sub14_Sub5.anInt9208 = 91;
                    Class136.method1243(-16777216, true);
                    Class366.method3830(0);
                } else {
                    Node_Sub8_Sub10.aClass243_8978 = new Class243(var_ha, 30, true, Class297_Sub1.aCanvas8478);
                    Node_Sub14_Sub5.anInt9208 = 100;
                    Class136.method1243(-16777216, true);
                    Class366.method3830(0);
                    System.gc();
                }
            }
        }
    }

    static final Class346_Sub7_Sub5 method2101(int i, int i_6_, int i_7_) {
        Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_6_][i_7_];
        if (class137 == null)
            return null;
        return ((Class137) class137).aClass346_Sub7_Sub5_1646;
    }

    final byte[] method2097(int i) {
        if (i != 0)
            return null;
        anInt10247++;
        if (((Node_Sub8_Sub13) this).aBoolean9024 || (((ByteStream) (((Node_Sub8_Sub13_Sub1) this).aClass248_Sub9_10250)).offset < (-((Node_Sub8_Sub13_Sub1) this).aByte10243 + (((ByteStream) ((Node_Sub8_Sub13_Sub1) this).aClass248_Sub9_10250).buffer).length)))
            throw new RuntimeException();
        return (((ByteStream) ((Node_Sub8_Sub13_Sub1) this).aClass248_Sub9_10250).buffer);
    }

    static final boolean method2102(int i, int i_8_, PacketStream class248_sub9_sub2) {
        anInt10246++;
        int i_9_ = class248_sub9_sub2.readBits(2059, i);
        if (i_9_ == 0) {
            if (class248_sub9_sub2.readBits(2059, 1) != 0)
                method2102(2, i_8_, class248_sub9_sub2);
            int i_10_ = class248_sub9_sub2.readBits(i ^ 0x809, 6);
            int i_11_ = class248_sub9_sub2.readBits(i + 2057, 6);
            boolean bool = class248_sub9_sub2.readBits(2059, 1) == 1;
            if (bool)
                Class269_Sub2.anIntArray7548[Class228.anInt2578++] = i_8_;
            if (Node_Sub32.aPlayerArray7197[i_8_] != null)
                throw new RuntimeException("hr:lr");
            Class107 class107 = Node_Sub8_Sub16.aClass107Array9053[i_8_];
            Player player = (Node_Sub32.aPlayerArray7197[i_8_] = new Player());
            ((Entity) player).anInt10484 = i_8_;
            if (Class338.aClass248_Sub9Array3937[i_8_] != null)
                player.parseAppearance(true, Class338.aClass248_Sub9Array3937[i_8_]);
            player.method3644((byte) -17, ((Class107) class107).anInt1356, true);
            ((Entity) player).faceEntity = ((Class107) class107).anInt1354;
            int i_12_ = ((Class107) class107).anInt1351;
            int i_13_ = i_12_ >> 505635068;
            int i_14_ = 0xff & i_12_ >> 52482798;
            int i_15_ = i_12_ & 0xff;
            int i_16_ = (i_14_ << 1970961574) - -i_10_ + -Class67.baseX;
            int i_17_ = (i_15_ << 1038713798) + i_11_ + -Class368.baseY;
            ((Player) player).aBoolean10565 = ((Class107) class107).aBoolean1352;
            ((Entity) player).aByteArray10499[0] = Class302.aByteArray3504[i_8_];
            ((Interactable) player).plane = ((Interactable) player).aByte8322 = (byte) i_13_;
            if (Class209.method1717(-10387, i_16_, i_17_))
                ((Interactable) player).aByte8322++;
            player.method3653(i_17_, i_16_, (byte) -111);
            ((Player) player).aBoolean10576 = false;
            Node_Sub8_Sub16.aClass107Array9053[i_8_] = null;
            return true;
        }
        if ((i_9_ ^ 0xffffffff) == -2) {
            int i_18_ = class248_sub9_sub2.readBits(2059, 2);
            int i_19_ = (((Class107) Node_Sub8_Sub16.aClass107Array9053[i_8_]).anInt1351);
            ((Class107) Node_Sub8_Sub16.aClass107Array9053[i_8_]).anInt1351 = ((0x30000000 & i_18_ + (i_19_ >> 492219900) << 1683440764) + (0xfffffff & i_19_));
            return false;
        }
        if (i_9_ == 2) {
            int i_20_ = class248_sub9_sub2.readBits(2059, 5);
            int i_21_ = i_20_ >> -476619293;
            int i_22_ = i_20_ & 0x7;
            int i_23_ = (((Class107) Node_Sub8_Sub16.aClass107Array9053[i_8_]).anInt1351);
            int i_24_ = (i_23_ >> 959213660) - -i_21_ & 0x3;
            int i_25_ = (i_23_ & 0x3fe5df) >> 1589249102;
            int i_26_ = 0xff & i_23_;
            if (i_22_ == 0) {
                i_25_--;
                i_26_--;
            }
            if ((i_22_ ^ 0xffffffff) == -2)
                i_26_--;
            if (i_22_ == 2) {
                i_25_++;
                i_26_--;
            }
            if (i_22_ == 3)
                i_25_--;
            if ((i_22_ ^ 0xffffffff) == -5)
                i_25_++;
            if (i_22_ == 5) {
                i_26_++;
                i_25_--;
            }
            if (i_22_ == 6)
                i_26_++;
            if ((i_22_ ^ 0xffffffff) == -8) {
                i_25_++;
                i_26_++;
            }
            ((Class107) Node_Sub8_Sub16.aClass107Array9053[i_8_]).anInt1351 = (i_25_ << -1991254386) + ((i_24_ << 2048362044) - -i_26_);
            return false;
        }
        int i_27_ = class248_sub9_sub2.readBits(2059, 18);
        int i_28_ = i_27_ >> 767531856;
        int i_29_ = 0xff & i_27_ >> 781714312;
        int i_30_ = 0xff & i_27_;
        int i_31_ = (((Class107) Node_Sub8_Sub16.aClass107Array9053[i_8_]).anInt1351);
        int i_32_ = 0x3 & (i_31_ >> -666608164) - -i_28_;
        int i_33_ = 0xff & (i_31_ >> 1811526350) + i_29_;
        int i_34_ = 0xff & i_30_ + i_31_;
        ((Class107) Node_Sub8_Sub16.aClass107Array9053[i_8_]).anInt1351 = i_34_ + (i_33_ << 1069591182) + (i_32_ << 241301180);
        return false;
    }

    /*synthetic*/
    static Class method2103(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
