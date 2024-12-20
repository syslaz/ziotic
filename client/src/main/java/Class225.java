/* Class225 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class225 implements Interface11 {
    int anInt4992;
    Class186 aClass186_4993;
    Class272 aClass272_4994;
    int anInt4995;
    static int anInt4996;
    int anInt4997;
    static int anInt4998;
    int anInt4999;
    int anInt5000;
    int anInt5001;
    int anInt5002;

    static final void method1787(int i, int i_0_, int i_1_, int i_2_, boolean bool, RSInterface2[] class354s, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        anInt4996++;
        Class287.aHa3381.KA(i_5_, i_1_, i_7_, i);
        if (i_3_ >= 80) {
            for (int i_8_ = 0; (class354s.length ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
                RSInterface2 class354 = class354s[i_8_];
                if (class354 != null && (i_4_ == ((RSInterface2) class354).anInt4300 || (i_4_ == -1412584499 && Class371.aClass354_4564 == class354))) {
                    int i_9_ = i_0_ + ((RSInterface2) class354).anInt4257;
                    int i_10_ = ((RSInterface2) class354).anInt4370 - -i_2_;
                    int i_11_ = 1 + (i_9_ - -((RSInterface2) class354).anInt4332);
                    int i_12_ = 1 + i_10_ - -((RSInterface2) class354).anInt4223;
                    int i_13_;
                    if ((i_6_ ^ 0xffffffff) != 0)
                        i_13_ = i_6_;
                    else {
                        Node_Sub2_Sub1.aRectangleArray8834[Node_Sub14.anInt6990].setBounds(((RSInterface2) class354).anInt4257 + i_0_, ((RSInterface2) class354).anInt4370 - -i_2_, ((RSInterface2) class354).anInt4332, ((RSInterface2) class354).anInt4223);
                        i_13_ = Node_Sub14.anInt6990++;
                    }
                    ((RSInterface2) class354).anInt4366 = Node_Sub18.anInt7027;
                    ((RSInterface2) class354).anInt4339 = i_13_;
                    if (!client.method119(class354)) {
                        if (((RSInterface2) class354).anInt4205 != 0)
                            Class57.method453((byte) -99, class354);
                        int i_14_ = i_0_ + ((RSInterface2) class354).anInt4257;
                        int i_15_ = ((RSInterface2) class354).anInt4370 - -i_2_;
                        int i_16_ = 0;
                        int i_17_ = 0;
                        if (Node_Sub8_Sub6.aBoolean8949) {
                            i_16_ = Class337.method3420(-2);
                            i_17_ = RSInterface2.method3770((byte) -113);
                        }
                        int i_18_ = ((RSInterface2) class354).anInt4344;
                        if (Class332.aBoolean3874 && (((((Node_Sub48) client.method113(class354)).anInt7424) ^ 0xffffffff) != -1 || ((RSInterface2) class354).anInt4284 == 0) && i_18_ > 127)
                            i_18_ = 127;
                        if (Class371.aClass354_4564 == class354) {
                            if (i_4_ != -1412584499 && (((ha.anInt1407 ^ 0xffffffff) == (((RSInterface2) class354).anInt4346 ^ 0xffffffff)) || ((((RSInterface2) class354).anInt4346 ^ 0xffffffff) == (Class225_Sub1.anInt8457 ^ 0xffffffff)))) {
                                Class239.anInt2675 = i_2_;
                                Node_Sub8_Sub8.anInt8964 = i_0_;
                                Class67.aClass354Array898 = class354s;
                                continue;
                            }
                            if (Class141.aBoolean5057 && Class305.aBoolean3549) {
                                int i_19_ = (Class46.aClass269_600.method2817((byte) -128) - -i_16_);
                                int i_20_ = (Class46.aClass269_600.method2809(123) - -i_17_);
                                i_19_ -= Class146.anInt1726;
                                i_20_ -= Class270.anInt3136;
                                if ((i_19_ ^ 0xffffffff) > (Class380.anInt4648 ^ 0xffffffff))
                                    i_19_ = Class380.anInt4648;
                                if ((((RSInterface2) class354).anInt4332 + i_19_ ^ 0xffffffff) < ((((RSInterface2) Class312.aClass354_3637).anInt4332) + Class380.anInt4648 ^ 0xffffffff))
                                    i_19_ = (((RSInterface2) Class312.aClass354_3637).anInt4332 + Class380.anInt4648 - ((RSInterface2) class354).anInt4332);
                                if (Node_Sub2_Sub4.anInt8869 > i_20_)
                                    i_20_ = Node_Sub2_Sub4.anInt8869;
                                if ((Node_Sub2_Sub4.anInt8869 + (((RSInterface2) Class312.aClass354_3637).anInt4223)) < ((RSInterface2) class354).anInt4223 + i_20_)
                                    i_20_ = (Node_Sub2_Sub4.anInt8869 + ((((RSInterface2) Class312.aClass354_3637).anInt4223) + -(((RSInterface2) class354).anInt4223)));
                                i_14_ = i_19_;
                                i_15_ = i_20_;
                            }
                            if (Class225_Sub1.anInt8457 == ((RSInterface2) class354).anInt4346)
                                i_18_ = 128;
                        }
                        int i_21_;
                        int i_22_;
                        int i_23_;
                        int i_24_;
                        if (((RSInterface2) class354).anInt4284 != 2) {
                            int i_25_ = ((RSInterface2) class354).anInt4332 + i_14_;
                            int i_26_ = i_15_ + ((RSInterface2) class354).anInt4223;
                            i_23_ = i_14_ > i_5_ ? i_14_ : i_5_;
                            i_22_ = i_15_ <= i_1_ ? i_1_ : i_15_;
                            if (((RSInterface2) class354).anInt4284 == 9) {
                                i_26_++;
                                i_25_++;
                            }
                            i_21_ = i_7_ > i_25_ ? i_25_ : i_7_;
                            i_24_ = ((i_26_ ^ 0xffffffff) <= (i ^ 0xffffffff) ? i : i_26_);
                        } else {
                            i_21_ = i_7_;
                            i_22_ = i_1_;
                            i_23_ = i_5_;
                            i_24_ = i;
                        }
                        if ((i_21_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff) && i_24_ > i_22_) {
                            if ((((RSInterface2) class354).anInt4205 ^ 0xffffffff) != -1) {
                                if ((Class249.anInt2809 == ((RSInterface2) class354).anInt4205) || (((RSInterface2) class354).anInt4205 == Class95.anInt1229)) {
                                    Class102.method727(i_14_, -104, class354, i_15_);
                                    if (!Node_Sub8_Sub6.aBoolean8949) {
                                        Node_Sub8_Sub9.method2074(i_15_, ((Class95.anInt1229 ^ 0xffffffff) == ((((RSInterface2) class354).anInt4205) ^ 0xffffffff)), i_14_, -119, ((RSInterface2) class354).anInt4223, ((RSInterface2) class354).anInt4332);
                                        Class287.aHa3381.KA(i_5_, i_1_, i_7_, i);
                                    }
                                    Class359.aBooleanArray4435[i_13_] = true;
                                    continue;
                                }
                                if ((((RSInterface2) class354).anInt4205 ^ 0xffffffff) == (Class212.anInt2452 ^ 0xffffffff)) {
                                    if (class354.method3768(Class287.aHa3381, 0) != null) {
                                        Node_Sub37.method2594(-25926);
                                        Class361.method3817(i_15_, (byte) -110, i_14_, Class287.aHa3381, class354);
                                        Class143.aBooleanArray1678[i_13_] = true;
                                        Class287.aHa3381.KA(i_5_, i_1_, i_7_, i);
                                        if (Node_Sub8_Sub6.aBoolean8949) {
                                            if (bool)
                                                Class210.method1724(i_11_, i_9_, (byte) -127, i_12_, i_10_);
                                            else
                                                Class340_Sub9.method3472(i_9_, i_12_, i_11_, i_10_, (byte) 104);
                                        }
                                    }
                                    continue;
                                }
                                if ((za_Sub2.anInt9809 ^ 0xffffffff) == (((RSInterface2) class354).anInt4205 ^ 0xffffffff)) {
                                    if (class354.method3768(Class287.aHa3381, 0) != null) {
                                        Node_Sub8_Sub6.method2062(2, i_14_, class354, i_15_);
                                        Class143.aBooleanArray1678[i_13_] = true;
                                        Class287.aHa3381.KA(i_5_, i_1_, i_7_, i);
                                        if (Node_Sub8_Sub6.aBoolean8949) {
                                            if (bool)
                                                Class210.method1724(i_11_, i_9_, (byte) -98, i_12_, i_10_);
                                            else
                                                Class340_Sub9.method3472(i_9_, i_12_, i_11_, i_10_, (byte) 121);
                                        }
                                    }
                                    continue;
                                }
                                if ((((RSInterface2) class354).anInt4205 ^ 0xffffffff) == (Class282_Sub4.anInt7625 ^ 0xffffffff)) {
                                    Class315.method3277(((RSInterface2) class354).anInt4332, Node_Sub14_Sub18.aD9354, ((RSInterface2) class354).anInt4223, -1, Class287.aHa3381, i_14_, i_15_);
                                    Class359.aBooleanArray4435[i_13_] = true;
                                    Class287.aHa3381.KA(i_5_, i_1_, i_7_, i);
                                    continue;
                                }
                                if (((RSInterface2) class354).anInt4205 == Class257.anInt2941) {
                                    Class166.method1535((((RSInterface2) class354).anInt4332), -24604, i_14_, i_15_, (((RSInterface2) class354).anInt4223), Class287.aHa3381);
                                    Class359.aBooleanArray4435[i_13_] = true;
                                    Class287.aHa3381.KA(i_5_, i_1_, i_7_, i);
                                    continue;
                                }
                                if ((((RSInterface2) class354).anInt4205 ^ 0xffffffff) == (ha.anInt1403 ^ 0xffffffff)) {
                                    if (Class75.aBoolean978 || ha_Sub3_Sub1.aBoolean8718) {
                                        int i_27_ = (((RSInterface2) class354).anInt4332 + i_14_);
                                        int i_28_ = 15 + i_15_;
                                        if (Node_Sub8_Sub6.aBoolean8949) {
                                            if (bool)
                                                Class210.method1724(i_11_, i_9_, (byte) -38, i_12_, i_10_);
                                            else
                                                Class340_Sub9.method3472(i_9_, i_12_, i_11_, i_10_, (byte) 111);
                                        }
                                        if (Class75.aBoolean978) {
                                            int i_29_ = -256;
                                            if (Class17.anInt291 < 20)
                                                i_29_ = -65536;
                                            Canvas_Sub1.aClass48_71.method376(i_29_, i_27_, -1, (byte) -108, i_28_, "Fps:" + Class17.anInt291);
                                            i_28_ += 15;
                                            Runtime runtime = Runtime.getRuntime();
                                            int i_30_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                                            int i_31_ = -256;
                                            if (i_30_ > 98304) {
                                                i_31_ = -65536;
                                                if (Class340_Sub10.aBoolean8221) {
                                                    Class263.method2773(-32492);
                                                    for (int i_32_ = 0; ((i_32_ ^ 0xffffffff) > -11); i_32_++)
                                                        System.gc();
                                                    i_30_ = (int) (((runtime.totalMemory()) - (runtime.freeMemory())) / 1024L);
                                                    if (i_30_ > 65536)
                                                        Node_Sub14_Sub5.method2289(4, 31663, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                                }
                                            }
                                            Canvas_Sub1.aClass48_71.method376(i_31_, i_27_, -1, (byte) -108, i_28_, "Mem:" + i_30_ + "k");
                                            i_28_ += 15;
                                            Canvas_Sub1.aClass48_71.method376(-256, i_27_, -1, (byte) -108, i_28_, ("In:" + Class41.anInt534 + "B/s Out:" + Class226_Sub3.anInt6671 + "B/s"));
                                            i_28_ += 15;
                                            int i_33_ = Class287.aHa3381.E() / 1024;
                                            Canvas_Sub1.aClass48_71.method376(((i_33_ ^ 0xffffffff) < -65537 ? -65536 : -256), i_27_, -1, (byte) -108, i_28_, "Offheap:" + i_33_ + "k");
                                            i_28_ += 15;
                                            int i_34_ = 0;
                                            int i_35_ = 0;
                                            int i_36_ = 0;
                                            for (int i_37_ = 0; i_37_ < 37; i_37_++) {
                                                if ((Class210.aClass330_Sub1Array2435[i_37_]) != null) {
                                                    i_34_ += Class210.aClass330_Sub1Array2435[i_37_].method3387(100);
                                                    i_35_ += Class210.aClass330_Sub1Array2435[i_37_].method3386(55);
                                                    i_36_ += Class210.aClass330_Sub1Array2435[i_37_].method3389(102);
                                                }
                                            }
                                            int i_38_ = 100 * i_36_ / i_34_;
                                            int i_39_ = 10000 * i_35_ / i_34_;
                                            String string = ("Cache:" + (Class84_Sub9.method630((byte) -122, 2, (long) i_39_, 0, true)) + "% (" + i_38_ + "%)");
                                            Class168.aClass48_1968.method376(-256, i_27_, -1, (byte) -108, i_28_, string);
                                            i_28_ += 12;
                                        }
                                        if ((Class381.anInt4693 ^ 0xffffffff) < -1)
                                            Class168.aClass48_1968.method376(-256, i_27_, -1, (byte) -108, i_28_, ("Particles: " + Exception_Sub1.anInt96 + " / " + Class381.anInt4693));
                                        i_28_ += 12;
                                        if (ha_Sub3_Sub1.aBoolean8718) {
                                            Class168.aClass48_1968.method376(-256, i_27_, -1, (byte) -108, i_28_, ("Polys: " + Class287.aHa3381.I() + " Models: " + Class287.aHa3381.M()));
                                            i_28_ += 12;
                                            Class168.aClass48_1968.method376(-256, i_27_, -1, (byte) -108, i_28_, ("Ls: " + (Node_Sub14_Sub21.anInt9378) + " La: " + Class282_Sub15.anInt7752 + " NPC: " + Class42.anInt548 + " Pl: " + IncommingOpcode.anInt1478));
                                            Class282_Sub28.method3043(-126);
                                            i_28_ += 12;
                                        }
                                        Class359.aBooleanArray4435[i_13_] = true;
                                    }
                                    continue;
                                }
                            }
                            if ((((RSInterface2) class354).anInt4284 ^ 0xffffffff) == -1) {
                                if (((((RSInterface2) class354).anInt4205 ^ 0xffffffff) == (Class279_Sub2.anInt7581 ^ 0xffffffff)) && Class287.aHa3381.q())
                                    Class287.aHa3381.a(i_14_, i_15_, (((RSInterface2) class354).anInt4332), (((RSInterface2) class354).anInt4223));
                                method1787(i_24_, (i_14_ - ((RSInterface2) class354).anInt4261), i_22_, i_15_ + -(((RSInterface2) class354).anInt4271), bool, class354s, 91, ((RSInterface2) class354).interfaceValues, i_23_, i_13_, i_21_);
                                if (((RSInterface2) class354).aClass354Array4285 != null)
                                    method1787(i_24_, -(((RSInterface2) class354).anInt4261) + i_14_, i_22_, i_15_ - (((RSInterface2) class354).anInt4271), bool, (((RSInterface2) class354).aClass354Array4285), 99, ((RSInterface2) class354).interfaceValues, i_23_, i_13_, i_21_);
                                Node_Sub12 class248_sub12 = ((Node_Sub12) (Class109.aClass65_1375.method501((long) (((RSInterface2) class354).interfaceValues), (byte) 31)));
                                if (class248_sub12 != null)
                                    Class310_Sub1.method3257(i_14_, (((Node_Sub12) class248_sub12).anInt6964), i_22_, 50, i_15_, i_21_, i_23_, i_13_, i_24_);
                                if ((Class279_Sub2.anInt7581 == ((RSInterface2) class354).anInt4205) && Class287.aHa3381.q())
                                    Class287.aHa3381.k();
                                Class287.aHa3381.KA(i_5_, i_1_, i_7_, i);
                            }
                            if (Class304.aBooleanArray3530[i_13_] || Class339.anInt3947 > 1) {
                                if ((((RSInterface2) class354).anInt4284 ^ 0xffffffff) == -4) {
                                    if (i_18_ == 0) {
                                        if (((RSInterface2) class354).aBoolean4219)
                                            Class287.aHa3381.aa(i_14_, i_15_, (((RSInterface2) class354).anInt4332), (((RSInterface2) class354).anInt4223), (((RSInterface2) class354).anInt4308), 0);
                                        else
                                            Class287.aHa3381.c(i_14_, i_15_, (((RSInterface2) class354).anInt4332), (((RSInterface2) class354).anInt4223), (((RSInterface2) class354).anInt4308), 0);
                                    } else if (((RSInterface2) class354).aBoolean4219)
                                        Class287.aHa3381.aa(i_14_, i_15_, ((RSInterface2) class354).anInt4332, ((RSInterface2) class354).anInt4223, ((((RSInterface2) class354).anInt4308 & 0xffffff) | (-(i_18_ & 0xff) + 255 << -765580328)), 1);
                                    else
                                        Class287.aHa3381.c(i_14_, i_15_, ((RSInterface2) class354).anInt4332, ((RSInterface2) class354).anInt4223, ((255 - (0xff & i_18_) << -1330241672) | (0xffffff & (((RSInterface2) class354).anInt4308))), 1);
                                    if (Node_Sub8_Sub6.aBoolean8949) {
                                        if (bool)
                                            Class210.method1724(i_11_, i_9_, (byte) -77, i_12_, i_10_);
                                        else
                                            Class340_Sub9.method3472(i_9_, i_12_, i_11_, i_10_, (byte) 95);
                                    }
                                } else if (((RSInterface2) class354).anInt4284 == 4) {
                                    Class48 class48 = class354.method3758(1, Class287.aHa3381);
                                    if (class48 == null) {
                                        if (Node_Sub14_Sub30.aBoolean9476)
                                            Class376.method3882(class354, 2260);
                                    } else {
                                        int i_40_ = ((RSInterface2) class354).anInt4308;
                                        String string = (((RSInterface2) class354).aString4250);
                                        if ((((RSInterface2) class354).id ^ 0xffffffff) != 0) {
                                            Class321 class321 = (Class283.aClass342_3343.method3482((byte) 72, (((RSInterface2) class354).id)));
                                            string = (((Class321) class321).aString3702);
                                            if (string == null)
                                                string = "null";
                                            if (((((Class321) class321).anInt3771) == 1 || ((((RSInterface2) class354).anInt4263) ^ 0xffffffff) != -2) && (((RSInterface2) class354).anInt4263) != -1)
                                                string = ("<col=ff9040>" + string + "</col> x" + (Class186.method1626((((RSInterface2) class354).anInt4263), 3)));
                                        }
                                        if (((RSInterface2) class354).anInt4336 != -1) {
                                            string = (Class215.method1737((((RSInterface2) class354).anInt4336), -1));
                                            if (string == null)
                                                string = "";
                                        }
                                        if (Class282_Sub17.aClass354_7773 == class354) {
                                            string = (Class41.aClass41_497.method301(Class191.anInt4822, (byte) -108));
                                            i_40_ = (((RSInterface2) class354).anInt4308);
                                        }
                                        if (za_Sub1.aBoolean9799)
                                            Class287.aHa3381.T(i_14_, i_15_, (((RSInterface2) class354).anInt4332) + i_14_, (i_15_ - -(((RSInterface2) class354).anInt4223)));
                                        class48.method360(((RSInterface2) class354).anInt4349, (Node_Sub14_Sub13.aClass129Array9290), ((RSInterface2) class354).anInt4256, ((RSInterface2) class354).anInt4334, i_15_, ((((RSInterface2) class354).aBoolean4290) ? (255 - (i_18_ & 0xff) << 1660029976) : -1), i_14_, ((RSInterface2) class354).anInt4223, null, ((RSInterface2) class354).anInt4332, 0, null, 0, (-(i_18_ & 0xff) + 255 << -1161467528) | i_40_, 1, ((RSInterface2) class354).anInt4353, string);
                                        if (za_Sub1.aBoolean9799)
                                            Class287.aHa3381.KA(i_5_, i_1_, i_7_, i);
                                        if ((string.trim().length() ^ 0xffffffff) < -1) {
                                            if (za_Sub1.aBoolean9799) {
                                                if (Node_Sub8_Sub6.aBoolean8949) {
                                                    if (!bool)
                                                        Class340_Sub9.method3472(i_9_, i_12_, i_11_, i_10_, (byte) 98);
                                                    else
                                                        Class210.method1724(i_11_, i_9_, (byte) -118, i_12_, i_10_);
                                                }
                                            } else {
                                                Class285 class285 = (Class128.method1160(Class287.aHa3381, (((RSInterface2) class354).anInt4275), 27198));
                                                int i_41_ = (class285.method3070(string, -119, (Node_Sub14_Sub13.aClass129Array9290), (((RSInterface2) class354).anInt4332)));
                                                int i_42_ = (class285.method3065(-1, string, (((RSInterface2) class354).anInt4332), (Node_Sub14_Sub13.aClass129Array9290), (((RSInterface2) class354).anInt4353)));
                                                if (Node_Sub8_Sub6.aBoolean8949) {
                                                    if (!bool)
                                                        Class340_Sub9.method3472(i_14_, i_42_ + i_15_, i_14_ + i_41_, i_15_, (byte) 111);
                                                    else
                                                        Class210.method1724(i_41_ + i_14_, i_14_, (byte) -43, i_42_ + i_15_, i_15_);
                                                }
                                            }
                                        }
                                    }
                                } else if (((RSInterface2) class354).anInt4284 == 5) {
                                    if ((((RSInterface2) class354).anInt4291 ^ 0xffffffff) > -1) {
                                        Class129 class129;
                                        if (((RSInterface2) class354).id == -1) {
                                            if (((((RSInterface2) class354).anInt4336) ^ 0xffffffff) == 0)
                                                class129 = (class354.method3769(Class287.aHa3381, (byte) -126));
                                            else
                                                class129 = (Class271.method2833(0, Class287.aHa3381, (((RSInterface2) class354).anInt4336)));
                                        } else {
                                            Class332 class332 = ((((RSInterface2) class354).aBoolean4312) ? (((Player) (Class347.myPlayer)).aClass332_10549) : null);
                                            class129 = (Class283.aClass342_3343.method3484(-52, (~0xffffff | (((RSInterface2) class354).anInt4340)), (((RSInterface2) class354).id), Class287.aHa3381, (((RSInterface2) class354).anInt4299), (((RSInterface2) class354).anInt4263), (((RSInterface2) class354).anInt4268), class332));
                                        }
                                        if (class129 != null) {
                                            int i_43_ = class129.method1169();
                                            int i_44_ = class129.method1181();
                                            int i_45_ = ((-(i_18_ & 0xff) + 255 << 454962424) | ((((RSInterface2) class354).anInt4308) != 0 ? 0xffffff & (((RSInterface2) class354).anInt4308) : 16777215));
                                            if (((RSInterface2) class354).aBoolean4360) {
                                                Class287.aHa3381.T(i_14_, i_15_, (i_14_ - -(((RSInterface2) class354).anInt4332)), (((RSInterface2) class354).anInt4223) + i_15_);
                                                if ((((RSInterface2) class354).anInt4253) != 0) {
                                                    int i_46_ = (((((RSInterface2) class354).anInt4332) + -1 + i_43_) / i_43_);
                                                    int i_47_ = (((((RSInterface2) class354).anInt4223) + (i_44_ - 1)) / i_44_);
                                                    for (int i_48_ = 0; ((i_46_ ^ 0xffffffff) < (i_48_ ^ 0xffffffff)); i_48_++) {
                                                        for (int i_49_ = 0; ((i_49_ ^ 0xffffffff) > (i_47_ ^ 0xffffffff)); i_49_++) {
                                                            if (((((RSInterface2) class354).anInt4308) ^ 0xffffffff) != -1)
                                                                class129.method1161((((float) i_43_ / 2.0F) + (float) (i_48_ * i_43_ + i_14_)), ((float) (i_15_ + i_44_ * i_49_) + ((float) i_44_ / 2.0F)), 4096, (((RSInterface2) class354).anInt4253), 0, i_45_, 1);
                                                            else
                                                                class129.method1162((((float) i_43_ / 2.0F) + (float) (i_43_ * i_48_ + i_14_)), (((float) i_44_ / 2.0F) + (float) (i_15_ - -(i_49_ * i_44_))), 4096, (((RSInterface2) class354).anInt4253));
                                                        }
                                                    }
                                                } else if ((((RSInterface2) class354).anInt4308) == 0 && ((i_18_ ^ 0xffffffff) == -1))
                                                    class129.method1182(i_14_, i_15_, (((RSInterface2) class354).anInt4332), (((RSInterface2) class354).anInt4223));
                                                else
                                                    class129.method1180(i_14_, i_15_, (((RSInterface2) class354).anInt4332), (((RSInterface2) class354).anInt4223), 0, i_45_, 1);
                                                Class287.aHa3381.KA(i_5_, i_1_, i_7_, i);
                                            } else if ((((RSInterface2) class354).anInt4308) != 0 || ((i_18_ ^ 0xffffffff) != -1)) {
                                                if (((((RSInterface2) class354).anInt4253) ^ 0xffffffff) != -1)
                                                    class129.method1161((((float) (((RSInterface2) class354).anInt4332) / 2.0F) + (float) i_14_), ((float) i_15_ + ((float) (((RSInterface2) class354).anInt4223) / 2.0F)), (((RSInterface2) class354).anInt4332 * 4096 / i_43_), (((RSInterface2) class354).anInt4253), 0, i_45_, 1);
                                                else if ((((RSInterface2) class354).anInt4332) == i_43_ && ((i_44_ ^ 0xffffffff) == ((((RSInterface2) class354).anInt4223) ^ 0xffffffff)))
                                                    class129.method1178(i_14_, i_15_, 0, i_45_, 1);
                                                else
                                                    class129.method1166(i_14_, i_15_, (((RSInterface2) class354).anInt4332), (((RSInterface2) class354).anInt4223), 0, i_45_, 1);
                                            } else if (((((RSInterface2) class354).anInt4253) ^ 0xffffffff) != -1)
                                                class129.method1162(((float) (((RSInterface2) class354).anInt4332) / 2.0F) + (float) i_14_, ((float) i_15_ + ((float) (((RSInterface2) class354).anInt4223) / 2.0F)), (4096 * (((RSInterface2) class354).anInt4332) / i_43_), (((RSInterface2) class354).anInt4253));
                                            else if ((((RSInterface2) class354).anInt4332) != i_43_ || i_44_ != (((RSInterface2) class354).anInt4223))
                                                class129.method1185(i_14_, i_15_, (((RSInterface2) class354).anInt4332), (((RSInterface2) class354).anInt4223));
                                            else
                                                class129.method1168(i_14_, i_15_);
                                        } else if (Node_Sub14_Sub30.aBoolean9476)
                                            Class376.method3882(class354, 2260);
                                    } else
                                        class354.method3760((byte) -65, Class293.aClass102_3436, Class371.aClass11_4569).method1681(0, i_14_, 0, Class287.aHa3381, (((RSInterface2) class354).anInt4329 << 188177571), (byte) -125, (((RSInterface2) class354).anInt4221 << 2131344067), ((RSInterface2) class354).anInt4223, i_15_, ((RSInterface2) class354).anInt4332);
                                    if (Node_Sub8_Sub6.aBoolean8949) {
                                        if (bool)
                                            Class210.method1724(i_11_, i_9_, (byte) -45, i_12_, i_10_);
                                        else
                                            Class340_Sub9.method3472(i_9_, i_12_, i_11_, i_10_, (byte) 110);
                                    }
                                } else if ((((RSInterface2) class354).anInt4284 ^ 0xffffffff) == -7) {
                                    Node_Sub18.method2516((byte) 73);
                                    Class122 class122 = null;
                                    Class162 class162 = null;
                                    int i_50_ = 0;
                                    if ((((RSInterface2) class354).id ^ 0xffffffff) == 0) {
                                        if (((RSInterface2) class354).anInt4222 != 5) {
                                            if ((((RSInterface2) class354).anInt4222) != 8 && (((RSInterface2) class354).anInt4222) != 9) {
                                                if ((((RSInterface2) class354).anInt4248) != -1) {
                                                    Class182 class182 = (Class235.aClass356_2617.method3790((byte) -90, (((RSInterface2) class354).anInt4248)));
                                                    class162 = (class354.method3777((Node_Sub43.aClass291_7306), (Class335.aClass172_3908), (Class148.aClass119_5096), (((RSInterface2) class354).anInt4234), (((RSInterface2) class354).anInt4237), Class287.aHa3381, (Class301_Sub3_Sub1.aClass131_9974), (((RSInterface2) class354).anInt4282), class182, (Class235.aClass356_2617), (((Player) (Class347.myPlayer)).aClass332_10549), (Class283.aClass342_3343), 2048, class122, false));
                                                    if (class162 == null && (Node_Sub14_Sub30.aBoolean9476))
                                                        Class376.method3882(class354, 2260);
                                                } else {
                                                    class162 = (class354.method3777((Node_Sub43.aClass291_7306), (Class335.aClass172_3908), (Class148.aClass119_5096), 0, -1, Class287.aHa3381, (Class301_Sub3_Sub1.aClass131_9974), -1, null, (Class235.aClass356_2617), (((Player) (Class347.myPlayer)).aClass332_10549), (Class283.aClass342_3343), 2048, class122, false));
                                                    if (class162 == null && (Node_Sub14_Sub30.aBoolean9476))
                                                        Class376.method3882(class354, 2260);
                                                }
                                            } else {
                                                Node_Sub33 class248_sub33 = (IOException_Sub1.method127(false, (((RSInterface2) class354).anInt4269), (byte) -60));
                                                Class182 class182 = ((((RSInterface2) class354).anInt4248) == -1 ? null : (Class235.aClass356_2617.method3790((byte) -90, (((RSInterface2) class354).anInt4248))));
                                                if (class248_sub33 != null) {
                                                    Class332 class332 = (!(((RSInterface2) class354).aBoolean4312) ? null : (((Player) (Class347.myPlayer)).aClass332_10549));
                                                    class162 = (class248_sub33.method2566((((RSInterface2) class354).anInt4237), 2048, (((RSInterface2) class354).anInt4234), class182, (((RSInterface2) class354).anInt4338), -24182968, class332, Class287.aHa3381, (((RSInterface2) class354).anInt4282), ((((RSInterface2) class354).anInt4222) == 9)));
                                                }
                                            }
                                        } else {
                                            int i_51_ = (((RSInterface2) class354).anInt4269);
                                            if ((i_51_ ^ 0xffffffff) <= -1 && i_51_ < 2048) {
                                                Player player = (Node_Sub32.aPlayerArray7197[i_51_]);
                                                Class182 class182 = (((((RSInterface2) class354).anInt4248) ^ 0xffffffff) != 0 ? (Class235.aClass356_2617.method3790((byte) -90, (((RSInterface2) class354).anInt4248))) : null);
                                                if ((player != null) && (((i_51_ ^ 0xffffffff) == ((Class282_Sub29.anInt7896) ^ 0xffffffff)) || (((Class282_Sub9.method2954((byte) 85, (((Player) player).aString10550))) ^ 0xffffffff) == ((((RSInterface2) class354).anInt4338) ^ 0xffffffff))))
                                                    class162 = (((Player) player).aClass332_10549.method3404((Class235.aClass356_2617), 0, true, (Class283.aClass342_3343), 112, Class287.aHa3381, (((RSInterface2) class354).anInt4282), null, (Node_Sub43.aClass291_7306), 2048, null, null, (Class148.aClass119_5096), (((RSInterface2) class354).anInt4237), 0, (((RSInterface2) class354).anInt4234), 0, (Class335.aClass172_3908), (Class301_Sub3_Sub1.aClass131_9974), -1, class182));
                                            }
                                        }
                                    } else {
                                        Class321 class321 = (Class283.aClass342_3343.method3482((byte) 107, (((RSInterface2) class354).id)));
                                        if (class321 != null) {
                                            class321 = (class321.method3340(18479, (((RSInterface2) class354).anInt4263)));
                                            Class182 class182 = (((((RSInterface2) class354).anInt4248) ^ 0xffffffff) == 0 ? null : (Class235.aClass356_2617.method3790((byte) -90, (((RSInterface2) class354).anInt4248))));
                                            Class332 class332 = (!(((RSInterface2) class354).aBoolean4312) ? null : (((Player) (Class347.myPlayer)).aClass332_10549));
                                            class162 = (class321.method3333(class182, (((RSInterface2) class354).anInt4234), class332, Class287.aHa3381, -26163, 1, (((RSInterface2) class354).anInt4237), 2048, (((RSInterface2) class354).anInt4282)));
                                            if (class162 != null)
                                                i_50_ = (-class162.fa() >> -1728103519);
                                            else
                                                Class376.method3882(class354, 2260);
                                        }
                                    }
                                    if (class162 != null) {
                                        int i_52_;
                                        if ((((RSInterface2) class354).anInt4321 ^ 0xffffffff) >= -1)
                                            i_52_ = 512;
                                        else
                                            i_52_ = (((((RSInterface2) class354).anInt4332) << 458781993) / (((RSInterface2) class354).anInt4321));
                                        int i_53_;
                                        if (((RSInterface2) class354).anInt4327 > 0)
                                            i_53_ = (((((RSInterface2) class354).anInt4223) << -1640868343) / (((RSInterface2) class354).anInt4327));
                                        else
                                            i_53_ = 512;
                                        int i_54_ = ((((RSInterface2) class354).anInt4332 / 2) + i_14_);
                                        int i_55_ = ((((RSInterface2) class354).anInt4223 / 2) + i_15_);
                                        if (!((RSInterface2) class354).aBoolean4264) {
                                            i_54_ += ((i_52_ * (((RSInterface2) class354).anInt4273)) >> 1833349321);
                                            i_55_ += ((i_53_ * (((RSInterface2) class354).anInt4270)) >> 52812521);
                                        }
                                        Class272.aViewport_3166.method1866();
                                        Class287.aHa3381.a(Class272.aViewport_3166);
                                        Class287.aHa3381.DA(i_54_, i_55_, i_52_, i_53_);
                                        Class287.aHa3381.ya();
                                        if (((RSInterface2) class354).aBoolean4356)
                                            Class287.aHa3381.C(false);
                                        if (!((RSInterface2) class354).aBoolean4264) {
                                            int i_56_ = ((((((RSInterface2) class354).anInt4365) << 255533666) * (Node_Sub9_Sub1.anIntArray9106[((((RSInterface2) class354).anInt4328) << 2098111075)])) >> 224822638);
                                            int i_57_ = (((Node_Sub9_Sub1.anIntArray9109[((((RSInterface2) class354).anInt4328) << 1352561571)]) * ((((RSInterface2) class354).anInt4365) << -1590991454)) >> 186904206);
                                            Node_Sub14_Sub5.aViewport_9200.method1864(-(((RSInterface2) class354).anInt4289) << -1571568413);
                                            Node_Sub14_Sub5.aViewport_9200.method1858((((RSInterface2) class354).anInt4209) << -555266333);
                                            Node_Sub14_Sub5.aViewport_9200.method1862((((RSInterface2) class354).anInt4280) << -1216555550, (i_50_ + ((((RSInterface2) class354).anInt4350) << 1982563426) + i_56_), i_57_ + (((RSInterface2) class354).anInt4350 << 1833932706));
                                            Node_Sub14_Sub5.aViewport_9200.method1873((((RSInterface2) class354).anInt4328) << -1614747581);
                                        } else {
                                            Node_Sub14_Sub5.aViewport_9200.method1861(((RSInterface2) class354).anInt4328);
                                            Node_Sub14_Sub5.aViewport_9200.method1858(((RSInterface2) class354).anInt4209);
                                            Node_Sub14_Sub5.aViewport_9200.method1872(((RSInterface2) class354).anInt4289);
                                            Node_Sub14_Sub5.aViewport_9200.method1862((((RSInterface2) class354).anInt4273), (((RSInterface2) class354).anInt4270), (((RSInterface2) class354).anInt4335));
                                        }
                                        class354.method3764((Node_Sub14_Sub5.aViewport_9200), 5562, class162, Node_Sub18.anInt7027, Class287.aHa3381);
                                        if (za_Sub1.aBoolean9799)
                                            Class287.aHa3381.T(i_14_, i_15_, i_14_ + (((RSInterface2) class354).anInt4332), i_15_ + (((RSInterface2) class354).anInt4223));
                                        if (((RSInterface2) class354).aBoolean4264) {
                                            if (!((RSInterface2) class354).aBoolean4231) {
                                                class162.method1440((Node_Sub14_Sub5.aViewport_9200), null, 1);
                                                if ((((RSInterface2) class354).aClass346_Sub8_4342) != null)
                                                    Class287.aHa3381.a(((RSInterface2) class354).aClass346_Sub8_4342.method3711());
                                            } else
                                                class162.method1441((Node_Sub14_Sub5.aViewport_9200), null, (((RSInterface2) class354).anInt4365), 1);
                                        } else if (!((RSInterface2) class354).aBoolean4231) {
                                            class162.method1440((Node_Sub14_Sub5.aViewport_9200), null, 1);
                                            if ((((RSInterface2) class354).aClass346_Sub8_4342) != null)
                                                Class287.aHa3381.a(((RSInterface2) class354).aClass346_Sub8_4342.method3711());
                                        } else
                                            class162.method1441((Node_Sub14_Sub5.aViewport_9200), null, (((RSInterface2) class354).anInt4365) << 95883682, 1);
                                        if (za_Sub1.aBoolean9799)
                                            Class287.aHa3381.KA(i_5_, i_1_, i_7_, i);
                                        if (((RSInterface2) class354).aBoolean4356)
                                            Class287.aHa3381.C(true);
                                    }
                                    if (Node_Sub8_Sub6.aBoolean8949) {
                                        if (bool)
                                            Class210.method1724(i_11_, i_9_, (byte) -61, i_12_, i_10_);
                                        else
                                            Class340_Sub9.method3472(i_9_, i_12_, i_11_, i_10_, (byte) 97);
                                    }
                                } else if (((RSInterface2) class354).anInt4284 == 9) {
                                    int i_58_;
                                    int i_59_;
                                    int i_60_;
                                    int i_61_;
                                    if (((RSInterface2) class354).aBoolean4230) {
                                        i_59_ = i_14_;
                                        i_58_ = i_15_;
                                        i_60_ = (((RSInterface2) class354).anInt4223 + i_15_);
                                        i_61_ = (((RSInterface2) class354).anInt4332 + i_14_);
                                    } else {
                                        i_58_ = (((RSInterface2) class354).anInt4223 + i_15_);
                                        i_59_ = i_14_;
                                        i_60_ = i_15_;
                                        i_61_ = i_14_ - -(((RSInterface2) class354).anInt4332);
                                    }
                                    if (((RSInterface2) class354).anInt4208 != 1)
                                        Class287.aHa3381.a(i_59_, i_60_, i_61_, i_58_, ((RSInterface2) class354).anInt4308, ((RSInterface2) class354).anInt4208, 0);
                                    else
                                        Class287.aHa3381.a(i_59_, i_60_, i_61_, i_58_, (((RSInterface2) class354).anInt4308), 0);
                                    if (Node_Sub8_Sub6.aBoolean8949) {
                                        if (!bool)
                                            Class340_Sub9.method3472(i_9_, i_12_, i_11_, i_10_, (byte) 94);
                                        else
                                            Class210.method1724(i_11_, i_9_, (byte) -107, i_12_, i_10_);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public Class208 method35(byte i) {
        anInt4998++;
        if (i != 62)
            return null;
        return null;
    }

    Class225(Class186 class186, Class272 class272, int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_) {
        ((Class225) this).aClass186_4993 = class186;
        ((Class225) this).anInt5000 = i_63_;
        ((Class225) this).anInt4997 = i_65_;
        ((Class225) this).anInt4995 = i_67_;
        ((Class225) this).anInt5001 = i_66_;
        ((Class225) this).anInt4992 = i;
        ((Class225) this).anInt4999 = i_62_;
        ((Class225) this).anInt5002 = i_64_;
        ((Class225) this).aClass272_4994 = class272;
    }
}
