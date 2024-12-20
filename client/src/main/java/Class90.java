/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class90 {
    int anInt1108;
    int anInt1109;
    static int anInt1110;
    int[] anIntArray1111;
    int anInt1112;
    int anInt1113;
    boolean aBoolean1114;
    private int anInt1115;
    short aShort1116;
    int anInt1117;
    static int anInt1118;
    static Class276 aClass276_1119;
    short aShort1120;
    int anInt1121;
    int anInt1122;
    int anInt1123;
    int anInt1124 = -1;
    int anInt1125;
    static int anInt1126;
    private int anInt1127;
    static int anInt1128;
    int anInt1129;
    int anInt1130;
    int anInt1131;
    static Class48 aClass48_1132;
    int anInt1133;
    boolean aBoolean1134;
    int anInt1135;
    int anInt1136;
    int anInt1137;
    int anInt1138;
    boolean aBoolean1139 = false;
    boolean aBoolean1140;
    short aShort1141;
    boolean aBoolean1142;
    short aShort1143;
    private int anInt1144;
    boolean aBoolean1145;
    private int anInt1146;
    static int anInt1147;
    int anInt1148;
    int anInt1149;
    private int anInt1150;
    int[] anIntArray1151;
    private int anInt1152;
    int anInt1153;
    int anInt1154;
    int anInt1155;
    int anInt1156;
    int anInt1157;
    boolean aBoolean1158;
    int[] anIntArray1159;
    static int anInt1160;
    int anInt1161;
    boolean aBoolean1162;
    int anInt1163;
    int anInt1164;
    int anInt1165;
    private int anInt1166;
    int anInt1167;
    int anInt1168;
    int anInt1169;
    private int anInt1170;
    int anInt1171;
    int anInt1172;
    int anInt1173;
    int anInt1174;
    int anInt1175;
    private int anInt1176;
    boolean aBoolean1177;
    int anInt1178;
    private int anInt1179;
    static int anInt1180;
    static Class319 aClass319_1181;
    int[] anIntArray1182;
    int anInt1183;

    static final void method671(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
        anInt1180++;
        int i_5_ = i_3_ + -i;
        int i_6_ = i_0_ - i_4_;
        if ((i_6_ ^ 0xffffffff) == -1) {
            if (i_5_ != 0)
                Class185_Sub1.method1625(i_3_, i_4_, i_2_, 6, i);
        } else if (i_5_ == 0)
            Class156.method1375(i, i_0_, i_4_, i_2_, (byte) -87);
        else {
            if (i_6_ < 0)
                i_6_ = -i_6_;
            if (i_5_ < 0)
                i_5_ = -i_5_;
            boolean bool = (i_6_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff);
            if (bool) {
                int i_7_ = i_4_;
                int i_8_ = i_0_;
                i_4_ = i;
                i = i_7_;
                i_0_ = i_3_;
                i_3_ = i_8_;
            }
            if (i_4_ > i_0_) {
                int i_9_ = i_4_;
                int i_10_ = i;
                i_4_ = i_0_;
                i_0_ = i_9_;
                i = i_3_;
                i_3_ = i_10_;
            }
            int i_11_ = i;
            int i_12_ = -i_4_ + i_0_;
            int i_13_ = -i + i_3_;
            int i_14_ = -(i_12_ >> 1926127937);
            if ((i_13_ ^ 0xffffffff) > -1)
                i_13_ = -i_13_;
            if (i_1_ == -21125) {
                int i_15_ = (i_3_ ^ 0xffffffff) >= (i ^ 0xffffffff) ? -1 : 1;
                if (!bool) {
                    for (int i_16_ = i_4_; (i_0_ ^ 0xffffffff) <= (i_16_ ^ 0xffffffff); i_16_++) {
                        i_14_ += i_13_;
                        Class156.anIntArrayArray1867[i_11_][i_16_] = i_2_;
                        if ((i_14_ ^ 0xffffffff) < -1) {
                            i_14_ -= i_12_;
                            i_11_ += i_15_;
                        }
                    }
                } else {
                    for (int i_17_ = i_4_; i_17_ <= i_0_; i_17_++) {
                        Class156.anIntArrayArray1867[i_17_][i_11_] = i_2_;
                        i_14_ += i_13_;
                        if ((i_14_ ^ 0xffffffff) < -1) {
                            i_11_ += i_15_;
                            i_14_ -= i_12_;
                        }
                    }
                }
            }
        }
    }

    private final void method672(ByteStream class248_sub9, int i, byte i_18_) {
        if (i == 1) {
            ((Class90) this).aShort1143 = (short) class248_sub9.readShort(-1);
            ((Class90) this).aShort1116 = (short) class248_sub9.readShort(-1);
            ((Class90) this).aShort1141 = (short) class248_sub9.readShort(-1);
            ((Class90) this).aShort1120 = (short) class248_sub9.readShort(-1);
            int i_19_ = 3;
            ((Class90) this).aShort1120 <<= i_19_;
            ((Class90) this).aShort1141 <<= i_19_;
            ((Class90) this).aShort1143 <<= i_19_;
            ((Class90) this).aShort1116 <<= i_19_;
        } else if (i != 2) {
            if ((i ^ 0xffffffff) != -4) {
                if (i == 4) {
                    ((Class90) this).anInt1123 = class248_sub9.readUnsignedByte((byte) 114);
                    ((Class90) this).anInt1135 = class248_sub9.readByte(112);
                } else if (i != 5) {
                    if (i == 6) {
                        anInt1144 = class248_sub9.readInt(false);
                        anInt1115 = class248_sub9.readInt(false);
                    } else if ((i ^ 0xffffffff) == -8) {
                        ((Class90) this).anInt1133 = class248_sub9.readShort(-1);
                        ((Class90) this).anInt1173 = class248_sub9.readShort(-1);
                    } else if (i == 8) {
                        ((Class90) this).anInt1168 = class248_sub9.readShort(-1);
                        ((Class90) this).anInt1174 = class248_sub9.readShort(-1);
                    } else if (i != 9) {
                        if ((i ^ 0xffffffff) != -11) {
                            if ((i ^ 0xffffffff) != -13) {
                                if ((i ^ 0xffffffff) != -14) {
                                    if (i == 14)
                                        ((Class90) this).anInt1169 = class248_sub9.readShort(-1);
                                    else if ((i ^ 0xffffffff) == -16)
                                        ((Class90) this).anInt1164 = class248_sub9.readShort(-1);
                                    else if ((i ^ 0xffffffff) != -17) {
                                        if ((i ^ 0xffffffff) != -18) {
                                            if ((i ^ 0xffffffff) == -19)
                                                ((Class90) this).anInt1108 = class248_sub9.readInt(false);
                                            else if (i != 19) {
                                                if ((i ^ 0xffffffff) != -21) {
                                                    if (i != 21) {
                                                        if ((i ^ 0xffffffff) != -23) {
                                                            if (i == 23)
                                                                anInt1179 = (class248_sub9.readUnsignedByte((byte) 122));
                                                            else if ((i ^ 0xffffffff) != -25) {
                                                                if ((i ^ 0xffffffff) == -26) {
                                                                    int i_20_ = (class248_sub9.readUnsignedByte((byte) 109));
                                                                    ((Class90) this).anIntArray1151 = (new int
                                                                            [i_20_]);
                                                                    for (int i_21_ = 0; ((i_20_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff)); i_21_++)
                                                                        ((Class90) this).anIntArray1151[i_21_] = class248_sub9.readShort(-1);
                                                                } else if (i == 26)
                                                                    ((Class90) this).aBoolean1145 = false;
                                                                else if ((i ^ 0xffffffff) != -28) {
                                                                    if ((i ^ 0xffffffff) != -29) {
                                                                        if (i != 29) {
                                                                            if ((i ^ 0xffffffff) == -31)
                                                                                ((Class90) this).aBoolean1142 = true;
                                                                            else if ((i ^ 0xffffffff) == -32) {
                                                                                ((Class90) this).anInt1157 = class248_sub9.readShort(-1) << -1508305364 << 426587554;
                                                                                ((Class90) this).anInt1165 = class248_sub9.readShort(-1) << -1248576020 << 1978101922;
                                                                            } else if (i == 32)
                                                                                ((Class90) this).aBoolean1114 = false;
                                                                            else if ((i ^ 0xffffffff) == -34)
                                                                                ((Class90) this).aBoolean1139 = true;
                                                                            else if ((i ^ 0xffffffff) == -35)
                                                                                ((Class90) this).aBoolean1158 = false;
                                                                        } else
                                                                            class248_sub9.readUnsignedShort((byte) -10);
                                                                    } else
                                                                        anInt1146 = class248_sub9.readUnsignedByte((byte) -102);
                                                                } else
                                                                    ((Class90) this).anInt1153 = ((class248_sub9.readShort(-1)) << -422221300 << -656970878);
                                                            } else
                                                                ((Class90) this).aBoolean1177 = false;
                                                        } else
                                                            ((Class90) this).anInt1172 = (class248_sub9.readInt(false));
                                                    } else
                                                        anInt1166 = (class248_sub9.readUnsignedByte((byte) -45));
                                                } else
                                                    anInt1176 = (class248_sub9.readUnsignedByte((byte) 102));
                                            } else
                                                ((Class90) this).anInt1117 = (class248_sub9.readUnsignedByte((byte) 85));
                                        } else
                                            ((Class90) this).anInt1149 = class248_sub9.readShort(-1);
                                    } else {
                                        ((Class90) this).aBoolean1140 = (class248_sub9.readUnsignedByte((byte) 81) ^ 0xffffffff) == -2;
                                        ((Class90) this).anInt1124 = class248_sub9.readShort(-1);
                                        ((Class90) this).anInt1171 = class248_sub9.readShort(-1);
                                        ((Class90) this).aBoolean1162 = (class248_sub9.readUnsignedByte((byte) 112) ^ 0xffffffff) == -2;
                                    }
                                } else
                                    ((Class90) this).anInt1154 = class248_sub9.readByte(30);
                            } else
                                ((Class90) this).anInt1161 = class248_sub9.readByte(97);
                        } else {
                            int i_22_ = class248_sub9.readUnsignedByte((byte) -96);
                            ((Class90) this).anIntArray1159 = new int[i_22_];
                            for (int i_23_ = 0; i_23_ < i_22_; i_23_++)
                                ((Class90) this).anIntArray1159[i_23_] = class248_sub9.readShort(-1);
                        }
                    } else {
                        int i_24_ = class248_sub9.readUnsignedByte((byte) 100);
                        ((Class90) this).anIntArray1182 = new int[i_24_];
                        for (int i_25_ = 0; (i_24_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++)
                            ((Class90) this).anIntArray1182[i_25_] = class248_sub9.readShort(-1);
                    }
                } else
                    ((Class90) this).anInt1157 = ((Class90) this).anInt1165 = (class248_sub9.readShort(-1) << -1579064276 << -895281374);
            } else {
                ((Class90) this).anInt1148 = class248_sub9.readInt(false);
                ((Class90) this).anInt1131 = class248_sub9.readInt(false);
            }
        } else
            class248_sub9.readUnsignedByte((byte) -119);
        anInt1147++;
        if (i_18_ >= -59)
            method675((byte) 6, null);
    }

    static final void method673(PacketStream class248_sub9_sub2, byte i) {
        anInt1128++;
        class248_sub9_sub2.writeInt(27695, Class185_Sub1.aClass381_6655.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class23.aClass381_327.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class237.aClass381_2644.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class139.aClass381_1660.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Node_Sub14_Sub3.aClass381_9183.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class340_Sub6.aClass381_8158.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class116_Sub1.aClass381_6281.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Node_Sub14_Sub9.aClass381_9245.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class290.aClass381_3417.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Node_Sub33.aClass381_7199.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class374.aClass381_4595.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class221.aClass381_2536.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class246.aClass381_2778.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class168.aClass381_1972.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Node_Sub28.aClass381_7160.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Node_Sub8_Sub12.aClass381_9021.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class94.aClass381_1222.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Node_Sub2_Sub4.aClass381_8879.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class346_Sub5.aClass381_8280.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class4.aClass381_137.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class282_Sub8.aClass381_7670.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class206.aClass381_4980.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Node_Sub39.aClass381_7278.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class282_Sub14.aClass381_7724.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Node_Sub25.aClass381_5156.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class355.aClass381_4381.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class107.aClass381_1357.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class327.aClass381_3836.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class182.aClass381_2103.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class205.aClass381_2383.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Class215.aClass381_2481.method3919(1010));
        class248_sub9_sub2.writeInt(27695, Node_Sub3.aClass381_6826.method3919(1010));
        int i_26_ = 90 % ((i - -22) / 39);
        class248_sub9_sub2.writeInt(27695, Class83.method596(-2));
        class248_sub9_sub2.writeInt(27695, Class16.method220(-101));
        class248_sub9_sub2.writeInt(27695, Class346_Sub5.aClass381_8282.method3919(1010));
    }

    public static void method674(int i) {
        aClass48_1132 = null;
        if (i != 0)
            aClass276_1119 = null;
        aClass319_1181 = null;
        aClass276_1119 = null;
    }

    final void method675(byte i, ByteStream class248_sub9) {
        anInt1126++;
        if (i <= -16) {
            for (; ; ) {
                int i_27_ = class248_sub9.readUnsignedByte((byte) 78);
                if (i_27_ == 0)
                    break;
                method672(class248_sub9, i_27_, (byte) -92);
            }
        }
    }

    final void method676(int i) {
        ((Class90) this).anInt1125 = (anInt1144 & 0xff700f) >> 1304899056;
        if ((((Class90) this).anInt1161 ^ 0xffffffff) < 1 || ((Class90) this).anInt1154 > -2)
            ((Class90) this).aBoolean1134 = true;
        anInt1110++;
        anInt1150 = anInt1115 >> -1399347248 & 0xff;
        ((Class90) this).anInt1163 = anInt1144 >> -1336757816 & 0xff;
        anInt1152 = 0xff & anInt1115 >> -666598136;
        ((Class90) this).anInt1109 = anInt1150 + -((Class90) this).anInt1125;
        ((Class90) this).anInt1138 = anInt1152 - ((Class90) this).anInt1163;
        ((Class90) this).anInt1155 = anInt1144 & 0xff;
        anInt1127 = anInt1115 & 0xff;
        ((Class90) this).anInt1112 = -((Class90) this).anInt1155 + anInt1127;
        anInt1170 = anInt1115 >> -1428341768 & 0xff;
        ((Class90) this).anInt1122 = anInt1144 >> 849864856 & 0xff;
        ((Class90) this).anInt1113 = -((Class90) this).anInt1122 + anInt1170;
        if (i != -5543)
            ((Class90) this).aBoolean1134 = true;
        if (((Class90) this).anInt1153 != -1) {
            ((Class90) this).anInt1136 = ((Class90) this).anInt1173 * anInt1146 / 100;
            if (((Class90) this).anInt1136 == 0)
                ((Class90) this).anInt1136 = 1;
            ((Class90) this).anInt1129 = (((Class90) this).anInt1153 + -((((Class90) this).anInt1165 + -((Class90) this).anInt1157) / 2) + -((Class90) this).anInt1157) / ((Class90) this).anInt1136;
        }
        if (((Class90) this).anInt1172 != -1) {
            ((Class90) this).anInt1130 = ((Class90) this).anInt1173 * anInt1179 / 100;
            if ((((Class90) this).anInt1130 ^ 0xffffffff) == -1)
                ((Class90) this).anInt1130 = 1;
            ((Class90) this).anInt1175 = (((Class90) this).anInt1172 + (-((Class90) this).anInt1148 + -((-((Class90) this).anInt1148 + ((Class90) this).anInt1131) / 2))) / ((Class90) this).anInt1130;
        }
        if (((Class90) this).anInt1108 != 0) {
            ((Class90) this).anInt1121 = ((Class90) this).anInt1173 * anInt1176 / 100;
            ((Class90) this).anInt1167 = anInt1166 * ((Class90) this).anInt1173 / 100;
            if (((Class90) this).anInt1121 == 0)
                ((Class90) this).anInt1121 = 1;
            ((Class90) this).anInt1183 = (((((Class90) this).anInt1108 >> -1874035280 & 0xff) - (((Class90) this).anInt1125 + ((Class90) this).anInt1109 / 2)) << -369046168) / ((Class90) this).anInt1121;
            ((Class90) this).anInt1178 = ((-((Class90) this).anInt1155 + (-(((Class90) this).anInt1112 / 2) + (((Class90) this).anInt1108 & 0xff))) << -1981511896) / ((Class90) this).anInt1121;
            if (((Class90) this).anInt1167 == 0)
                ((Class90) this).anInt1167 = 1;
            ((Class90) this).anInt1137 = ((((((Class90) this).anInt1108 & 0xffdd) >> -268250168) + (-(((Class90) this).anInt1138 / 2) + -((Class90) this).anInt1163)) << 638339368) / ((Class90) this).anInt1121;
            Class90 class90_28_ = this;
            ((Class90) class90_28_).anInt1137 = (((Class90) class90_28_).anInt1137 + (((Class90) this).anInt1137 <= 0 ? 4 : -4));
            Class90 class90_29_ = this;
            ((Class90) class90_29_).anInt1178 = (((Class90) class90_29_).anInt1178 + ((((Class90) this).anInt1178 ^ 0xffffffff) >= -1 ? 4 : -4));
            ((Class90) this).anInt1156 = ((-((Class90) this).anInt1122 - ((Class90) this).anInt1113 / 2 + (((Class90) this).anInt1108 >> -1774939016 & 0xff)) << -2042501208) / ((Class90) this).anInt1167;
            Class90 class90_30_ = this;
            ((Class90) class90_30_).anInt1183 = (((Class90) class90_30_).anInt1183 + (((Class90) this).anInt1183 > 0 ? -4 : 4));
            Class90 class90_31_ = this;
            ((Class90) class90_31_).anInt1156 = (((Class90) class90_31_).anInt1156 + (((Class90) this).anInt1156 > 0 ? -4 : 4));
        }
    }

    public Class90() {
        ((Class90) this).aBoolean1114 = true;
        ((Class90) this).anInt1154 = -2;
        ((Class90) this).aBoolean1162 = true;
        ((Class90) this).anInt1117 = 0;
        ((Class90) this).aBoolean1158 = true;
        ((Class90) this).aBoolean1134 = false;
        ((Class90) this).aBoolean1142 = false;
        ((Class90) this).anInt1161 = -2;
        ((Class90) this).anInt1172 = -1;
        ((Class90) this).aBoolean1145 = true;
        ((Class90) this).anInt1149 = -1;
        ((Class90) this).aBoolean1140 = true;
        anInt1166 = 100;
        ((Class90) this).anInt1153 = -1;
        ((Class90) this).anInt1169 = 0;
        ((Class90) this).anInt1164 = -1;
        ((Class90) this).aBoolean1177 = true;
        anInt1179 = 100;
        anInt1146 = 100;
        ((Class90) this).anInt1123 = 0;
        ((Class90) this).anInt1171 = -1;
        anInt1176 = 100;
    }
}
