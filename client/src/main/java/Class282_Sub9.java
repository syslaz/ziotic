/* Class282_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

final class Class282_Sub9 extends Class282 {
    static int anInt7675;
    static int anInt7676;
    static int anInt7677;
    static int anInt7678;
    static int anInt7679;
    static int anInt7680;
    static int anInt7681;
    static int anInt7682;
    static int anInt7683;
    static int anInt7684;
    static int anInt7685;

    static final int method2953(int i, int i_0_) {
        anInt7675++;
        i = ((i & ~0x55555555) >>> 2066009985) + (i & 0x55555555);
        i = (i & 0x33333333) - -(i >>> 149049602 & ~0xccccccc);
        i = i - -(i >>> 1122924644) & 0xf0f0f0f;
        i += i >>> -1077209208;
        if (i_0_ > -41)
            return -44;
        i += i >>> -1816402416;
        return 0xff & i;
    }

    final int method2917(int i, int i_1_) {
        anInt7685++;
        if (i != 0)
            return -75;
        return 1;
    }

    static final int method2954(byte i, String string) {
        anInt7680++;
        int i_2_ = string.length();
        int i_3_ = 0;
        for (int i_4_ = 0; i_4_ < i_2_; i_4_++)
            i_3_ = (i_3_ << -1732567067) + -i_3_ - -string.charAt(i_4_);
        if (i != 85)
            method2959(-98);
        return i_3_;
    }

    final int method2955(boolean bool) {
        anInt7679++;
        if (bool != true)
            return -84;
        return ((Class282) this).anInt3320;
    }

    static final int method2956(byte i) {
        anInt7681++;
        if (i > -53)
            method2959(-105);
        return Class195.anInt2234++;
    }

    static final Class225_Sub2 method2957(byte i, ByteStream class248_sub9) {
        anInt7682++;
        if (i <= 25)
            return null;
        Class225 class225 = Class358.method3798(99, class248_sub9);
        int i_5_ = class248_sub9.readInt(false);
        int i_6_ = class248_sub9.readInt(false);
        return new Class225_Sub2(((Class225) class225).aClass186_4993, ((Class225) class225).aClass272_4994, ((Class225) class225).anInt4992, ((Class225) class225).anInt4999, ((Class225) class225).anInt5000, ((Class225) class225).anInt5002, ((Class225) class225).anInt4997, ((Class225) class225).anInt5001, ((Class225) class225).anInt4995, i_5_, i_6_);
    }

    private static final int method2958(int i, Class381 class381) {
        anInt7676++;
        int i_7_ = 0;
        if (class381.method3920(Class84_Sub9.anInt5504, -61))
            i_7_++;
        if (class381.method3920(Class324.anInt3823, -98))
            i_7_++;
        if (class381.method3920(Class2.anInt123, -63))
            i_7_++;
        if (class381.method3920(Class86.anInt1053, -106))
            i_7_++;
        if (class381.method3920(Class253.anInt2845, 65))
            i_7_++;
        if (i != 1)
            return -4;
        if (class381.method3920(Node_Sub14_Sub23.anInt9395, 92))
            i_7_++;
        if (class381.method3920(Class346_Sub7_Sub4_Sub1.anInt10076, i + 109))
            i_7_++;
        if (class381.method3920(Class82.anInt1029, -75))
            i_7_++;
        if (class381.method3920(Class249_Sub2.anInt4804, 96))
            i_7_++;
        if (class381.method3920(Class297.anInt5019, i + 117))
            i_7_++;
        if (class381.method3920(Class245.anInt2753, i ^ 0x59))
            i_7_++;
        if (class381.method3920(Class89.anInt1107, -84))
            i_7_++;
        if (class381.method3920(s.anInt3470, 60))
            i_7_++;
        if (class381.method3920(Class297.anInt5010, 76))
            i_7_++;
        if (class381.method3920(Class233.anInt2614, 78))
            i_7_++;
        if (class381.method3920(Class326.anInt4807, i ^ 0x5d))
            i_7_++;
        return i_7_;
    }

    final void method2918(byte i) {
        anInt7684++;
        if (i == 98) {
            if ((((Class282) this).anInt3320 ^ 0xffffffff) != -2 && ((Class282) this).anInt3320 != 0)
                ((Class282) this).anInt3320 = method2919(false);
        }
    }

    Class282_Sub9(int i, Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    static final int method2959(int i) {
        anInt7677++;
        if ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub12_7330.method2967(true) ^ 0xffffffff) == -1) {
            for (int i_8_ = 0; i_8_ < Class262.anInt2977; i_8_++) {
                if ((Class262.anInterface19Array2974[i_8_].method62((byte) -55) ^ 0xffffffff) == -116 || (Class262.anInterface19Array2974[i_8_].method62((byte) -47) ^ 0xffffffff) == -84) {
                    Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub12_7330), (byte) -71, 1);
                    Class211.aBoolean2438 = true;
                    break;
                }
            }
        }
        if (Class90.aClass276_1119 == Class276.aClass276_3176) {
            Runtime runtime = Runtime.getRuntime();
            int i_9_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
            long l = Class118.method1112(i ^ 0x6d69);
            if ((Class272.aLong3170 ^ 0xffffffffffffffffL) == -1L)
                Class272.aLong3170 = l;
            if ((i_9_ ^ 0xffffffff) < -16385 && (l + -Class272.aLong3170 ^ 0xffffffffffffffffL) > -5001L) {
                if ((l + -Class316_Sub2_Sub1.aLong9869 ^ 0xffffffffffffffffL) < -1001L) {
                    System.gc();
                    Class316_Sub2_Sub1.aLong9869 = l;
                }
                return 0;
            }
        }
        if (Class276.aClass276_3185 == Class90.aClass276_1119) {
            if (Class156.aClass290_1861 == null)
                Class156.aClass290_1861 = new Class290(Class282_Sub5.aClass323_7634, Class340_Sub5.aClass77_8143, Class340_Sub9.aBigInteger8199, Class346_Sub5_Sub1.aBigInteger9885);
            if (!Class156.aClass290_1861.method3092(-70))
                return 0;
            Class219.method1753(true, null, 0, (byte) -122);
            Class254.aBoolean5127 = !Class55.method441(true);
            Class172.aClass381_2002 = Class38.method288(false, 1, (byte) -128, !Class254.aBoolean5127 ? 32 : 34);
            Class303.aClass381_3522 = Class38.method288(false, 1, (byte) -128, 33);
            Class168.aClass381_1972 = Class38.method288(false, 1, (byte) -128, 13);
        }
        if (Class90.aClass276_1119 == Class276.aClass276_3187) {
            boolean bool = Class303.aClass381_3522.method3914(i + 23066888);
            int i_10_ = Class210.aClass330_Sub1Array2435[33].method3383(9312);
            i_10_ = i_10_ + Class210.aClass330_Sub1Array2435[Class254.aBoolean5127 ? 34 : 32].method3383(9312);
            i_10_ += Class210.aClass330_Sub1Array2435[13].method3383(9312);
            i_10_ = i_10_ + (bool ? 100 : Class303.aClass381_3522.method3933((byte) -98));
            if (i_10_ != 400)
                return i_10_ / 4;
            Class129_Sub1.anInt8511 = Class172.aClass381_2002.method3919(1010);
            Class282_Sub11.anInt7706 = Class303.aClass381_3522.method3919(1010);
            Class211.method1727(Class172.aClass381_2002, -25);
            int i_11_ = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub7_7334.method2949(true);
            Class90.aClass319_1181 = new Class319(Class12.aClass215_249, Class191.anInt4822, Class303.aClass381_3522);
            int[] is = Class90.aClass319_1181.method3315(i_11_, (byte) 116);
            if (is.length == 0)
                is = Class90.aClass319_1181.method3315(0, (byte) 115);
            Class12 class12 = new Class12(Class172.aClass381_2002, Class168.aClass381_1972);
            if ((is.length ^ 0xffffffff) < -1) {
                Class346_Sub1.anInterface17Array8250 = new Interface17[is.length];
                for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class346_Sub1.anInterface17Array8250.length ^ 0xffffffff)); i_12_++)
                    Class346_Sub1.anInterface17Array8250[i_12_] = new Class254(Class90.aClass319_1181.method3317(-121, is[i_12_]), class12);
            }
        }
        if (Class90.aClass276_1119 == Class276.aClass276_3188)
            Node_Sub2_Sub1.method1983(Class168.aClass381_1972, Class172.aClass381_2002, WorldAddress.method681(127), (byte) -109);
        if (Class90.aClass276_1119 == Class276.aClass276_3189) {
            int i_13_ = Class41.method303(true);
            int i_14_ = Class224.method1786(91);
            if (i_14_ > i_13_)
                return 100 * i_13_ / i_14_;
        }
        if (Class90.aClass276_1119 == Class276.aClass276_3190) {
            if (Class346_Sub1.anInterface17Array8250 != null && Class346_Sub1.anInterface17Array8250.length > 0) {
                if ((Class346_Sub1.anInterface17Array8250[0].method52(26583) ^ 0xffffffff) > -101)
                    return 0;
                if (Class346_Sub1.anInterface17Array8250.length > 1 && Class90.aClass319_1181.method3316((byte) 70) && (Class346_Sub1.anInterface17Array8250[1].method52(26583) ^ 0xffffffff) > -101)
                    return 0;
            }
            Node_Sub39.method2603(0, Class287.aHa3381);
            Class307.method3226((byte) -99, Class287.aHa3381);
            Node_Sub14_Sub15.method2318(1, i ^ ~0x3f37);
        }
        if (Class90.aClass276_1119 == Class276.aClass276_3191) {
            for (int i_15_ = 0; i_15_ < 4; i_15_++)
                Class182.aClass164Array2114[i_15_] = Class290.method3090(Node_Sub8_Sub4.anInt8360, Node_Sub22.anInt7074, 0);
        }
        if (Class276.aClass276_3192 == Class90.aClass276_1119) {
            Class290.aClass381_3417 = Class38.method288(false, 1, (byte) -128, 8);
            Class185_Sub1.aClass381_6655 = Class38.method288(false, 1, (byte) -128, 0);
            Class23.aClass381_327 = Class38.method288(false, 1, (byte) -128, 1);
            Class237.aClass381_2644 = Class38.method288(false, 1, (byte) -128, 2);
            Class139.aClass381_1660 = Class38.method288(false, 1, (byte) -128, 3);
            Node_Sub14_Sub3.aClass381_9183 = Class38.method288(false, 1, (byte) -128, 4);
            Class340_Sub6.aClass381_8158 = Class38.method288(true, 1, (byte) -128, 5);
            Class116_Sub1.aClass381_6281 = Class38.method288(true, 1, (byte) -128, 6);
            Node_Sub14_Sub9.aClass381_9245 = Class38.method288(false, 1, (byte) -128, 7);
            Node_Sub33.aClass381_7199 = Class38.method288(false, 1, (byte) -128, 9);
            Class374.aClass381_4595 = Class38.method288(false, 1, (byte) -128, 10);
            Class221.aClass381_2536 = Class38.method288(false, 1, (byte) -128, 11);
            Class246.aClass381_2778 = Class38.method288(false, 1, (byte) -128, 12);
            Node_Sub28.aClass381_7160 = Class38.method288(false, 1, (byte) -128, 14);
            Node_Sub8_Sub12.aClass381_9021 = Class38.method288(false, 1, (byte) -128, 15);
            Class94.aClass381_1222 = Class38.method288(false, 1, (byte) -128, 16);
            Node_Sub2_Sub4.aClass381_8879 = Class38.method288(false, 1, (byte) -128, 17);
            Class346_Sub5.aClass381_8280 = Class38.method288(false, 1, (byte) -128, 18);
            Class4.aClass381_137 = Class38.method288(false, 1, (byte) -128, 19);
            Class282_Sub8.aClass381_7670 = Class38.method288(false, 1, (byte) -128, 20);
            Class206.aClass381_4980 = Class38.method288(false, 1, (byte) -128, 21);
            Node_Sub39.aClass381_7278 = Class38.method288(false, 1, (byte) -128, 22);
            Class282_Sub14.aClass381_7724 = Class38.method288(true, 1, (byte) -128, 23);
            Node_Sub25.aClass381_5156 = Class38.method288(false, 1, (byte) -128, 24);
            Class355.aClass381_4381 = Class38.method288(false, 1, (byte) -128, 25);
            Class107.aClass381_1357 = Class38.method288(true, 1, (byte) -128, 26);
            Class327.aClass381_3836 = Class38.method288(false, 1, (byte) -128, 27);
            Class182.aClass381_2103 = Class38.method288(true, 1, (byte) -128, 28);
            Class205.aClass381_2383 = Class38.method288(false, 1, (byte) -128, 29);
            Class215.aClass381_2481 = Class38.method288(true, 1, (byte) -128, 30);
            Node_Sub3.aClass381_6826 = Class38.method288(true, 1, (byte) -128, 31);
            Class346_Sub5.aClass381_8282 = Class38.method288(true, 2, (byte) -128, 36);
        }
        if (Class276.aClass276_3193 == Class90.aClass276_1119) {
            int i_16_ = 0;
            for (int i_17_ = 0; i_17_ < 37; i_17_++) {
                if (Class210.aClass330_Sub1Array2435[i_17_] != null)
                    i_16_ += (Class210.aClass330_Sub1Array2435[i_17_].method3383(i ^ 0x497d) * Class131.anIntArray1605[i_17_] / 100);
            }
            if ((i_16_ ^ 0xffffffff) != -101) {
                if ((Class340_Sub8.anInt8193 ^ 0xffffffff) > -1)
                    Class340_Sub8.anInt8193 = i_16_;
                return ((-Class340_Sub8.anInt8193 + i_16_) * 100 / (100 - Class340_Sub8.anInt8193));
            }
            Class255.method2741((byte) 107, Class290.aClass381_3417);
            Node_Sub2_Sub1.method1983(Class168.aClass381_1972, Class290.aClass381_3417, WorldAddress.method681(126), (byte) -109);
        }
        if (Class90.aClass276_1119 == Class276.aClass276_3194) {
            if ((Class282.anInt3319 ^ 0xffffffff) == 0)
                Class282.anInt3319 = Class116_Sub1.aClass381_6281.method3927((byte) 81, "scape main");
            Class282_Sub17.method2995((byte) 104);
            Node_Sub14_Sub15.method2318(2, -21035);
        }
        if (Class276.aClass276_3195 == Class90.aClass276_1119)
            Node_Sub8_Sub2.method2038(Node_Sub14_Sub15.aClass174_9328, Class215.aClass381_2481, (byte) -34);
        if (Class276.aClass276_3196 == Class90.aClass276_1119) {
            int i_18_ = Node_Sub8_Sub17.method2141(i ^ 0x6d1d);
            if ((i_18_ ^ 0xffffffff) > -101)
                return i_18_;
            Class39.method289(i ^ 0x6d67, Class182.aClass381_2103.method3930(-1, 1));
            Class275_Sub1.method2849(Class182.aClass381_2103.method3930(-1, 3), 21870);
        }
        if (Class90.aClass276_1119 == Class276.aClass276_3197) {
            if (Class198.anInt2266 != -1 && !Node_Sub14_Sub9.aClass381_9245.method3915(i ^ 0x6d6f, 0, Class198.anInt2266))
                return 99;
            Node_Sub14_Sub18.aD9354 = new Class326(Class107.aClass381_1357, Node_Sub33.aClass381_7199, Class290.aClass381_3417);
            Node_Sub20.aClass240_7045 = new Class240(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644);
            Class301_Sub3_Sub1.aClass131_9974 = new Class131(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644);
            Class86_Sub1.aClass85_5509 = new Class85(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644, Class290.aClass381_3417);
            Class346_Sub7_Sub1_Sub2.aClass259_10206 = new Class259(Class12.aClass215_249, Class191.anInt4822, Node_Sub2_Sub4.aClass381_8879);
            Class226_Sub1.aClass144_6662 = new Class144(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644);
            Class129_Sub1.aClass192_8517 = new Class192(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644);
            Class19.aClass4_298 = new Class4(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644, Class290.aClass381_3417);
            Class335.aClass172_3908 = new Class172(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644, Node_Sub14_Sub9.aClass381_9245);
            r_Sub2.aClass315_10275 = new Class315(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644);
            Class343.aClass329_4031 = new Class329(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644);
            Class346_Sub7_Sub4_Sub2.aClass368_10161 = new Class368(Class12.aClass215_249, Class191.anInt4822, true, Class94.aClass381_1222, Node_Sub14_Sub9.aClass381_9245);
            Node_Sub3.aClass257_6827 = new Class257(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644, Class290.aClass381_3417);
            Class19.aClass39_302 = new Class39(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644, Class290.aClass381_3417);
            Class148.aClass119_5096 = new Class119(Class12.aClass215_249, Class191.anInt4822, true, Class346_Sub5.aClass381_8280, Node_Sub14_Sub9.aClass381_9245);
            Class283.aClass342_3343 = new Class342(Class12.aClass215_249, Class191.anInt4822, true, Node_Sub20.aClass240_7045, Class4.aClass381_137, Node_Sub14_Sub9.aClass381_9245);
            Class276.aClass307_3208 = new Class307(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644);
            Class235.aClass356_2617 = new Class356(Class12.aClass215_249, Class191.anInt4822, Class282_Sub8.aClass381_7670, Class185_Sub1.aClass381_6655, Class23.aClass381_327);
            Class293.aClass102_3436 = new Class102(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644);
            Class371.aClass11_4569 = new Class11(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644);
            Class279_Sub2.aClass151_7577 = new Class151(Class12.aClass215_249, Class191.anInt4822, Class206.aClass381_4980, Node_Sub14_Sub9.aClass381_9245);
            ISAACCypher.aClass113_2193 = new Class113(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644);
            Class237.aClass146_2635 = new Class146(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644);
            Class86_Sub1.aClass302_5517 = new Class302(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644);
            Class229.aClass331_2582 = new Class331(Class12.aClass215_249, Class191.anInt4822, Node_Sub39.aClass381_7278);
            Class282_Sub23.aClass378_7835 = new Class378(Class12.aClass215_249, Class191.anInt4822, Class237.aClass381_2644);
            Class84_Sub7.method623((byte) -11, Node_Sub14_Sub9.aClass381_9245, Class168.aClass381_1972, Class290.aClass381_3417, Class139.aClass381_1660);
            RSInterface.method2014(101, Class205.aClass381_2383);
            Class23.aClass6_326 = new Class6(Class191.anInt4822, Node_Sub25.aClass381_5156, Class355.aClass381_4381);
            Class44_Sub1.aClass152_5288 = new Class152(Class191.anInt4822, Node_Sub25.aClass381_5156, Class355.aClass381_4381, new Class191());
            Node_Sub14_Sub36.method2385((byte) -62);
            Class346_Sub7_Sub4_Sub2.aClass368_10161.method3845((byte) -88, (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335.method2961(true) ^ 0xffffffff) == -1);
            Node_Sub43.aClass291_7306 = new Class291();
            Node_Sub20.method2521((byte) 85);
            Class282_Sub5.method2941((byte) -43, Class327.aClass381_3836);
            Class346_Sub7_Sub4_Sub1.method3683(Node_Sub14_Sub18.aD9354, (Node_Sub14_Sub9.aClass381_9245), (byte) 126);
            Class25 class25 = new Class25(Class374.aClass381_4595.method3908("", "huffman", (byte) 98));
            Class297_Sub1.method3139((byte) 124, class25);
            try {
                jagmisc.init();
            } catch (Throwable throwable) {
                /* empty */
            }
            Class132.aClass160_1609 = Canvas_Sub1.method122((byte) 123);
            InputStream_Sub2.aClass248_Sub24_78 = new Node_Sub24(true, Node_Sub14_Sub15.aClass174_9328);
        }
        if (Class276.aClass276_3199 == Class90.aClass276_1119) {
            int i_19_ = (method2958(1, Class290.aClass381_3417) + Node_Sub14_Sub17.method2324(true, (byte) 99));
            int i_20_ = Class318.method3310(-117) + Class224.method1786(99);
            if (i_20_ > i_19_)
                return i_19_ * 100 / i_20_;
        }
        if (Class276.aClass276_3200 == Class90.aClass276_1119)
            Class116.method1084(Class282_Sub14.aClass381_7724, Class226_Sub1.aClass144_6662, Class129_Sub1.aClass192_8517, Class346_Sub7_Sub4_Sub2.aClass368_10161, Node_Sub3.aClass257_6827, Class19.aClass39_302, Node_Sub43.aClass291_7306);
        if (Class90.aClass276_1119 == Class276.aClass276_3201) {
            Class282_Sub2.aStringArray7612 = new String[((Class146) Class237.aClass146_2635).anInt1731];
            Class357.anIntArray4417 = new int[((Class302) Class86_Sub1.aClass302_5517).anInt3506];
            Class215.aBooleanArray2477 = (new boolean
                    [((Class302) Class86_Sub1.aClass302_5517).anInt3506]);
            for (int i_21_ = 0; ((Class302) Class86_Sub1.aClass302_5517).anInt3506 > i_21_; i_21_++) {
                if (((Class69) Class86_Sub1.aClass302_5517.method3199(i_21_, (byte) -124)).anInt909 == 0) {
                    Class215.aBooleanArray2477[i_21_] = true;
                    Node_Sub14_Sub13.anInt9286++;
                }
                Class357.anIntArray4417[i_21_] = -1;
            }
            Class34.method276(i + -46359);
            Class279_Sub2.anInt7587 = Class139.aClass381_1660.method3927((byte) 65, "loginscreen");
            Class160.anInt1891 = Class139.aClass381_1660.method3927((byte) 88, "lobbyscreen");
            Class340_Sub6.aClass381_8158.method3926((byte) 1, true, false);
            Class116_Sub1.aClass381_6281.method3926((byte) 1, true, true);
            Class290.aClass381_3417.method3926((byte) 1, true, true);
            Class168.aClass381_1972.method3926((byte) 1, true, true);
            Class374.aClass381_4595.method3926((byte) 1, true, true);
            Class139.aClass381_1660.method3926((byte) 1, true, true);
            ((Class381) Class237.aClass381_2644).anInt4675 = 2;
            Class282_Sub6.aBoolean7649 = true;
            ((Class381) Node_Sub2_Sub4.aClass381_8879).anInt4675 = 2;
            ((Class381) Class94.aClass381_1222).anInt4675 = 2;
            ((Class381) Class346_Sub5.aClass381_8280).anInt4675 = 2;
            ((Class381) Class4.aClass381_137).anInt4675 = 2;
            ((Class381) Class282_Sub8.aClass381_7670).anInt4675 = 2;
            ((Class381) Class206.aClass381_4980).anInt4675 = 2;
        }
        if (Class276.aClass276_3202 == Class90.aClass276_1119) {
            if (!Class346_Sub7_Sub5_Sub2.method3699(Class279_Sub2.anInt7587, (byte) -22))
                return 0;
            boolean bool = true;
            for (int i_22_ = 0; ((i_22_ ^ 0xffffffff) > ((Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[Class279_Sub2.anInt7587]).length ^ 0xffffffff)); i_22_++) {
                RSInterface2 class354 = (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[Class279_Sub2.anInt7587][i_22_]);
                if ((((RSInterface2) class354).anInt4284 ^ 0xffffffff) == -6 && ((RSInterface2) class354).anInt4254 != -1 && !Class290.aClass381_3417.method3915(64, 0, (((RSInterface2) class354).anInt4254)))
                    bool = false;
            }
            if (!bool)
                return 0;
        }
        if (Class90.aClass276_1119 == Class276.aClass276_3203)
            Class111.method773(-94, true);
        if (Class90.aClass276_1119 == Class276.aClass276_3204) {
            Class282_Sub11.aClass74_7702.method548(1);
            try {
                Node_Sub29.aThread7170.join();
            } catch (InterruptedException interruptedexception) {
                return 0;
            }
            Class172.aClass381_2002 = null;
            Class346_Sub1.anInterface17Array8250 = null;
            Class282_Sub11.aClass74_7702 = null;
            Class303.aClass381_3522 = null;
            Node_Sub29.aThread7170 = null;
            Class90.aClass319_1181 = null;
            Node_Sub8_Sub15.method2134(false);
            Class279.aBoolean3255 = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub12_7330.method2967(true) == 1;
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub12_7330), (byte) -71, 1);
            if (!Class279.aBoolean3255) {
                if (((Class282_Sub15) (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322)).aBoolean7748 && (((Node_Sub24) InputStream_Sub2.aClass248_Sub24_78).anInt7126) < 512 && ((((Node_Sub24) InputStream_Sub2.aClass248_Sub24_78).anInt7126) ^ 0xffffffff) != -1)
                    Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322), (byte) -71, 0);
            } else
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322), (byte) -71, 0);
            Class293.method3113(17458);
            if (Class279.aBoolean3255)
                Node_Sub15_Sub5.method2495(false, 90, 0);
            else
                Node_Sub15_Sub5.method2495(false, -53, ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub15_7322.method2984(true));
            Class138.method1274(false, ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub1_7346.method2925(true), -1, -1, -1);
            Node_Sub39.method2603(0, Class287.aHa3381);
            Class307.method3226((byte) -106, Class287.aHa3381);
            Class349_Sub2.method3740(9749, Class290.aClass381_3417, Class287.aHa3381);
            aa_Sub3.method165(Node_Sub14_Sub13.aClass129Array9290, 54);
        }
        if (i != 27933)
            method2956((byte) -79);
        return Node_Sub14_Sub22.method2343(-53);
    }

    final int method2919(boolean bool) {
        anInt7683++;
        if (bool != false)
            return -118;
        return 1;
    }

    final void method2922(boolean bool, int i) {
        ((Class282) this).anInt3320 = i;
        if (bool == true)
            anInt7678++;
    }

    Class282_Sub9(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }
}
