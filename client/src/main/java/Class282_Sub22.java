/* Class282_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub22 extends Class282 {
    static int anInt7820;
    static int anInt7821;
    static int anInt7822;
    static int anInt7823;
    static int anInt7824;
    static int anInt7825;
    static int anInt7826;

    final void method2922(boolean bool, int i) {
        ((Class282) this).anInt3320 = i;
        if (bool == true)
            anInt7822++;
    }

    final int method3014(boolean bool) {
        anInt7824++;
        if (bool != true)
            method2919(false);
        return ((Class282) this).anInt3320;
    }

    static final void method3015(Class128 class128, byte i) {
        anInt7823++;
        if (Class142.aClass128_1671 == class128) {
            int localCoords = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 80); // the local coords
            int localX = ((0xfe & localCoords) >> 4) + Class346_Sub5.currentX * 2; // 
            int localY = (0xf & localCoords) + 2 * Class355.currentY;
            int absZ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 104); // height
            boolean bool = (0x1 & absZ ^ 0xffffffff) != -1;
            boolean bool_4_ = (0x2 & absZ) != 0;
            int i_5_ = !bool_4_ ? -1 : absZ >> 2;
            int absX = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByte(118) + localX); // region base x + local x
            int absY = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByte(68) + localY); // region base y + local y
            int targetId = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedShort((byte) -10); // target id
            int i_9_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedShort((byte) -10); // unknown
            int projectileId = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1); // projectile id
            int i_11_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -38); // start or end height
            if (!bool_4_)
                i_11_ *= 4;
            else
                i_11_ = (byte) i_11_;
            int i_12_ = 4 * Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -16); // start or end height
            int i_13_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_14_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int slope = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 122);
            int i_16_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            if (slope == 255)
                slope = -1;
            if (localX >= 0 && localY >= 0 && ((Node_Sub8_Sub4.anInt8360 * 2 ^ 0xffffffff) < (localX ^ 0xffffffff)) && Node_Sub8_Sub4.anInt8360 * 2 > localY && (absX ^ 0xffffffff) <= -1 && absY >= 0 && (2 * Node_Sub22.anInt7074 ^ 0xffffffff) < (absX ^ 0xffffffff) && (absY ^ 0xffffffff) > (Node_Sub22.anInt7074 * 2 ^ 0xffffffff) && (projectileId ^ 0xffffffff) != -65536) {
                i_11_ <<= 2;
                absX *= 256;
                localX *= 256;
                i_16_ <<= 2;
                localY *= 256;
                absY = 256 * absY;
                i_12_ <<= 2;
                if ((targetId ^ 0xffffffff) != -1 && (i_5_ ^ 0xffffffff) != 0) {
                    Entity entity = null;
                    if (targetId >= 0) {
                        int i_17_ = -1 + targetId;
                        Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_17_, (byte) 31));
                        if (class248_sub10 != null)
                            entity = (((Node_Sub10) class248_sub10).aNPC_6946);
                    } else {
                        int i_18_ = -targetId + -1;
                        if (Class282_Sub29.anInt7896 != i_18_)
                            entity = (Node_Sub32.aPlayerArray7197[i_18_]);
                        else
                            entity = Class347.myPlayer;
                    }
                    if (entity != null) {
                        Class281 class281 = entity.method3642(0);
                        if (((Class281) class281).anIntArrayArray3291 != null && (((Class281) class281).anIntArrayArray3291[i_5_] != null))
                            i_11_ -= (((Class281) class281).anIntArrayArray3291[i_5_][1]);
                        if (((Class281) class281).anIntArrayArray3308 != null && (((Class281) class281).anIntArrayArray3308[i_5_] != null))
                            i_11_ -= (((Class281) class281).anIntArrayArray3308[i_5_][1]);
                    }
                }
                Class346_Sub7_Sub2_Sub2 class346_sub7_sub2_sub2 = (new Class346_Sub7_Sub2_Sub2(projectileId, Class226_Sub1_Sub1.currentZ, Class226_Sub1_Sub1.currentZ, localX, localY, i_11_, Node_Sub18.anInt7027 + i_13_, i_14_ + Node_Sub18.anInt7027, slope, i_16_, targetId, i_9_, i_12_, bool, i_5_));
                class346_sub7_sub2_sub2.method3609(absX, absY, 0, (-i_12_ + Class353.method3753(absY, absX, 126, Class226_Sub1_Sub1.currentZ)), Node_Sub18.anInt7027 + i_13_);
                Node_Sub14_Sub27.aClass293_9440.method3109(new Node_Sub8_Sub9(class346_sub7_sub2_sub2), -119);
            }
        } else if (Class261.aClass128_2969 == class128) {
            int i_19_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -127);
            int i_20_ = (0x7 & i_19_ >> -683723996) + Class346_Sub5.currentX;
            int i_21_ = Class355.currentY + (i_19_ & 0x7);
            int i_22_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            if (i_22_ == 65535)
                i_22_ = -1;
            int i_23_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 78);
            int i_24_ = (i_23_ & 0xf4) >> -419631836;
            int i_25_ = 0x7 & i_23_;
            int i_26_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 117);
            int i_27_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -116);
            int i_28_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            if ((i_20_ ^ 0xffffffff) <= -1 && (i_21_ ^ 0xffffffff) <= -1 && Node_Sub8_Sub4.anInt8360 > i_20_ && (i_21_ ^ 0xffffffff) > (Node_Sub22.anInt7074 ^ 0xffffffff)) {
                int i_29_ = 1 + i_24_;
                if (((i_20_ - i_29_ ^ 0xffffffff) >= ((((Entity) Class347.myPlayer).posQueueX[0]) ^ 0xffffffff)) && (((Entity) Class347.myPlayer).posQueueX[0]) <= i_29_ + i_20_ && (((Entity) Class347.myPlayer).posQueueY[0]) >= -i_29_ + i_21_ && (i_29_ + i_21_ >= (((Entity) Class347.myPlayer).posQueueY[0])))
                    Class382.method3935(i_25_, i_22_, (i_24_ + (i_21_ << -1759326584) + (Class226_Sub1_Sub1.currentZ << 1968533656) - -(i_20_ << 987147152)), i_27_, i_28_, i_26_, false, 0);
            }
        } else if (class128 == Class129_Sub2.aClass128_8519) {    //createitem?
            int i_30_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-110);
            int i_31_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShortA(128);
            int i_32_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
            int i_33_ = (i_32_ & 0x7) + Class355.currentY;
            int i_34_ = Class368.baseY + i_33_;
            int i_35_ = Class346_Sub5.currentX - -(i_32_ >> 1104180836 & 0x7);
            int i_36_ = Class67.baseX + i_35_;
            int i_37_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            if (i_30_ != Class282_Sub29.anInt7896) {
                boolean bool = (i_35_ >= 0 && (i_33_ ^ 0xffffffff) <= -1 && (i_35_ ^ 0xffffffff) > (Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) && ((Node_Sub22.anInt7074 ^ 0xffffffff) < (i_33_ ^ 0xffffffff)));
                if (bool || Class73.method542((byte) 114, Class270.anInt3134)) {
                    Class223.method1782(i_34_, 0, new Node_Sub28(i_37_, i_31_), Class226_Sub1_Sub1.currentZ, i_36_);
                    if (bool)
                        Class172.method1557(i_35_, Class226_Sub1_Sub1.currentZ, i_33_, (byte) 28);
                }
            }
        } else if (class128 == Class44.aClass128_557) {
            int i_38_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
            if (i_38_ == 65535)
                i_38_ = -1;
            int i_39_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteA((byte) -45);
            int i_40_ = i_39_ >> -1383489438;
            int i_41_ = i_39_ & 0x3;
            int i_42_ = Class112.anIntArray5203[i_40_];
            int i_43_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
            int i_44_ = Class346_Sub5.currentX - -(i_43_ >> -706095452 & 0x7);
            int i_45_ = Class355.currentY - -(0x7 & i_43_);
            Class84_Sub8.method628(-24938, i_42_, i_45_, i_38_, i_44_, i_41_, Class226_Sub1_Sub1.currentZ, i_40_);
        } else if (Class113.aClass128_1401 == class128) {
            int localBaseCoords = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 120);
            boolean bool = (localBaseCoords & 0x80) != 0;
            int localX = ((0x38 & localBaseCoords) >> -2005365533) + Class346_Sub5.currentX;
            int localY = (localBaseCoords & 0x7) + Class355.currentY;
            int offsetX = localX + Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByte(51);
            int offsetY = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readByte(117) + localY);

            int targetId = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedShort((byte) -10);
            int projectileId = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int startHeight = 4 * Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -46);
            int endHeight = (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 98) * 4);
            int delay = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int speed = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int zCurve = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -20);
            int unknown = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            if ((zCurve ^ 0xffffffff) == -256)
                zCurve = -1;
            if ((localX ^ 0xffffffff) <= -1 && (localY ^ 0xffffffff) <= -1 && localX < Node_Sub8_Sub4.anInt8360 && (localY ^ 0xffffffff) > (Node_Sub22.anInt7074 ^ 0xffffffff) && offsetX >= 0 && offsetY >= 0 && (Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) < (offsetX ^ 0xffffffff) && (Node_Sub22.anInt7074 ^ 0xffffffff) < (offsetY ^ 0xffffffff) && projectileId != 65535) {
                offsetX = 256 + 512 * offsetX;
                startHeight <<= 2;
                offsetY = offsetY * 512 - -256;
                localX = localX * 512 - -256;
                endHeight <<= 2;
                unknown <<= 2;
                localY = 256 + localY * 512;
                Class346_Sub7_Sub2_Sub2 class346_sub7_sub2_sub2 = (new Class346_Sub7_Sub2_Sub2(projectileId, Class226_Sub1_Sub1.currentZ, Class226_Sub1_Sub1.currentZ, localX, localY, startHeight, delay - -Node_Sub18.anInt7027, Node_Sub18.anInt7027 + speed, zCurve, unknown, 0, targetId, endHeight, bool, -1));
                class346_sub7_sub2_sub2.method3609(offsetX, offsetY, 0, (-endHeight + Class353.method3753(offsetY, offsetX, -20, Class226_Sub1_Sub1.currentZ)), delay - -Node_Sub18.anInt7027);
                Node_Sub14_Sub27.aClass293_9440.method3109(new Node_Sub8_Sub9(class346_sub7_sub2_sub2), -105);
            }
        } else if (class128 == Class231.aClass128_2606) {
            int i_59_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -79);
            int i_60_ = (i_59_ >> 1512033156 & 0x7) + Class346_Sub5.currentX;
            int i_61_ = Class355.currentY - -(i_59_ & 0x7);
            int i_62_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_63_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 120);
            int i_64_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_65_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -51);
            if ((i_60_ ^ 0xffffffff) <= -1 && (i_61_ ^ 0xffffffff) <= -1 && (i_60_ ^ 0xffffffff) > (Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) && (Node_Sub22.anInt7074 ^ 0xffffffff) < (i_61_ ^ 0xffffffff)) {
                int i_66_ = 256 + 512 * i_60_;
                int i_67_ = 512 * i_61_ + 256;
                int i_68_ = Class226_Sub1_Sub1.currentZ;
                if (i_68_ < 3 && Class209.method1717(-10387, i_60_, i_61_))
                    i_68_++;
                Class346_Sub7_Sub2_Sub3 class346_sub7_sub2_sub3 = (new Class346_Sub7_Sub2_Sub3(i_62_, i_64_, Node_Sub18.anInt7027, Class226_Sub1_Sub1.currentZ, i_68_, i_66_, (-i_63_ + Class353.method3753(i_67_, i_66_, -24, Class226_Sub1_Sub1.currentZ)), i_67_, i_60_, i_60_, i_61_, i_61_, i_65_));
                Class198.aClass293_2259.method3109(new Node_Sub8_Sub8(class346_sub7_sub2_sub3), -120);
            }
        } else if (Node_Sub8_Sub4.aClass128_8371 == class128) {
            Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -34);
            int i_69_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -112);
            int i_70_ = Class346_Sub5.currentX - -(0x7 & i_69_ >> 1931889508);
            int i_71_ = Class355.currentY + (i_69_ & 0x7);
            int i_72_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_73_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -91);
            int i_74_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.method2221(255);
            String string = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readString(15598);
            Class282_Sub28.method3044(i_73_, i_72_, i_74_, i_70_, -90, string, i_71_, Class226_Sub1_Sub1.currentZ);
        } else if (Node_Sub8_Sub8.aClass128_8963 == class128) {
            int i_75_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
            int i_76_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 95);
            Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -77, i_75_).method2788((byte) 85, i_76_);
        } else if (Class118.aClass128_1483 == class128) {
            int type = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
            int i_78_ = type >> -2135261918;
            int i_79_ = 0x3 & type;
            int i_80_ = Class112.anIntArray5203[i_78_];
            int loc = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) 110);
            int i_82_ = ((0x72 & loc) >> 1106484228) + Class346_Sub5.currentX;
            int i_83_ = (loc & 0x7) + Class355.currentY;
            if (Class73.method542((byte) 114, Class270.anInt3134) || (i_82_ >= 0 && (i_83_ ^ 0xffffffff) <= -1 && (i_82_ ^ 0xffffffff) > (Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) && Node_Sub22.anInt7074 > i_83_))
                Class279_Sub2_Sub2.method2903(i_82_, i_80_, -1, i_78_, Class226_Sub1_Sub1.currentZ, i_79_, i_83_, 106);
        } else {
            if (i >= -12)
                method3015(null, (byte) 100);
            if (Node_Sub14_Sub32.aClass128_9498 == class128) {  //deleteitem?
                int i_84_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -107);
                int i_85_ = (i_84_ & 0x7) + Class355.currentY;
                int i_86_ = Class368.baseY + i_85_;
                int i_87_ = (i_84_ >> -1651294364 & 0x7) + Class346_Sub5.currentX;
                int i_88_ = i_87_ + Class67.baseX;
                int i_89_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
                Node_Sub13 class248_sub13 = ((Node_Sub13) (Class346_Sub7_Sub5.aClass65_9959.method501((long) (i_86_ << -946987474 | Class226_Sub1_Sub1.currentZ << 312693692 | i_88_), (byte) 31)));
                if (class248_sub13 != null) {
                    for (Node_Sub28 class248_sub28 = ((Node_Sub28) ((Node_Sub13) class248_sub13).aClass293_6966.method3119(2)); class248_sub28 != null; class248_sub28 = ((Node_Sub28) ((Node_Sub13) class248_sub13).aClass293_6966.method3107(-127))) {
                        if ((((Node_Sub28) class248_sub28).anInt7164 ^ 0xffffffff) == (i_89_ & 0x7fff ^ 0xffffffff)) {
                            class248_sub28.remove(true);
                            break;
                        }
                    }
                    if (((Node_Sub13) class248_sub13).aClass293_6966.method3115(false))
                        class248_sub13.remove(true);
                    if (i_87_ >= 0 && (i_85_ ^ 0xffffffff) <= -1 && Node_Sub8_Sub4.anInt8360 > i_87_ && Node_Sub22.anInt7074 > i_85_)
                        Class172.method1557(i_87_, Class226_Sub1_Sub1.currentZ, i_85_, (byte) 28);
                }
            } else if (class128 == Class323.aClass128_3796) { //create object
                int id = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
                int type = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
                int i_92_ = type >> -567246430;
                int i_93_ = type & 0x3;
                int i_94_ = Class112.anIntArray5203[i_92_];
                int loc = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -87);
                int i_96_ = (((loc & 0x77) >> -1960158428) + Class346_Sub5.currentX);
                int i_97_ = Class355.currentY - -(0x7 & loc);
                if (Class73.method542((byte) 114, Class270.anInt3134) || ((i_96_ ^ 0xffffffff) <= -1 && (i_97_ ^ 0xffffffff) <= -1 && Node_Sub8_Sub4.anInt8360 > i_96_ && i_97_ < Node_Sub22.anInt7074))
                    Class279_Sub2_Sub2.method2903(i_96_, i_94_, id, i_92_, Class226_Sub1_Sub1.currentZ, i_93_, i_97_, 71);
            } else if (class128 == Interactable.aClass128_8323) {
                int i_98_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -102);
                int i_99_ = Class355.currentY - -(0x7 & i_98_);
                int i_100_ = Class368.baseY + i_99_;
                int i_101_ = Class346_Sub5.currentX - -((i_98_ & 0x7f) >> 438508420);
                int i_102_ = Class67.baseX + i_101_;
                int i_103_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                int i_104_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                int i_105_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                if (Class346_Sub7_Sub5.aClass65_9959 != null) {
                    Node_Sub13 class248_sub13 = ((Node_Sub13) (Class346_Sub7_Sub5.aClass65_9959.method501((long) (Class226_Sub1_Sub1.currentZ << 105074012 | i_100_ << 1153413006 | i_102_), (byte) 31)));
                    if (class248_sub13 != null) {
                        for (Node_Sub28 class248_sub28 = ((Node_Sub28) ((Node_Sub13) class248_sub13).aClass293_6966.method3119(2)); class248_sub28 != null; class248_sub28 = ((Node_Sub28) ((Node_Sub13) class248_sub13).aClass293_6966.method3107(-128))) {
                            if ((((Node_Sub28) class248_sub28).anInt7164 == (0x7fff & i_103_)) && (((Node_Sub28) class248_sub28).anInt7161 == i_104_)) {
                                class248_sub28.remove(true);
                                ((Node_Sub28) class248_sub28).anInt7161 = i_105_;
                                Class223.method1782(i_100_, 0, class248_sub28, (Class226_Sub1_Sub1.currentZ), i_102_);
                                break;
                            }
                        }
                        if ((i_101_ ^ 0xffffffff) <= -1 && (i_99_ ^ 0xffffffff) <= -1 && ((Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) < (i_101_ ^ 0xffffffff)) && i_99_ < Node_Sub22.anInt7074)
                            Class172.method1557(i_101_, Class226_Sub1_Sub1.currentZ, i_99_, (byte) 28);
                    }
                }
            } else if (Class301_Sub3.aClass128_8448 == class128) {
                int i_106_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) -108);
                int i_107_ = (((0x7a & i_106_) >> -1847261596) + Class346_Sub5.currentX);
                int i_108_ = Class355.currentY + (i_106_ & 0x7);
                int i_109_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                if ((i_109_ ^ 0xffffffff) == -65536)
                    i_109_ = -1;
                int i_110_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 104);
                int i_111_ = (i_110_ & 0xf7) >> -1993390204;
                int i_112_ = i_110_ & 0x7;
                int i_113_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 78);
                int i_114_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByte((byte) 106);
                int i_115_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                if (i_107_ >= 0 && i_108_ >= 0 && i_107_ < Node_Sub8_Sub4.anInt8360 && i_108_ < Node_Sub22.anInt7074) {
                    int i_116_ = i_111_ + 1;
                    if (((((Entity) Class347.myPlayer).posQueueX[0]) ^ 0xffffffff) <= (-i_116_ + i_107_ ^ 0xffffffff) && ((i_107_ - -i_116_ ^ 0xffffffff) <= ((((Entity) Class347.myPlayer).posQueueX[0]) ^ 0xffffffff)) && ((-i_116_ + i_108_ ^ 0xffffffff) >= ((((Entity) Class347.myPlayer).posQueueY[0]) ^ 0xffffffff)) && (((Entity) Class347.myPlayer).posQueueY[0]) <= i_108_ - -i_116_)
                        Class158.method1393(0, i_115_, i_113_, ((Class226_Sub1_Sub1.currentZ << -219915368) - -(i_107_ << 1225343568) - (-(i_108_ << 1902956264) - i_111_)), i_112_, i_109_, i_114_);
                }
            } else if (class128 == Class28.aClass128_4893) {                      //createitem?
                int id = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedLEShort(true);
                int amt = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShortA(-120);
                int loc = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
                int i_120_ = (0x7 & loc) + Class355.currentY;
                int i_121_ = Class368.baseY + i_120_;
                int i_122_ = (((loc & 0x71) >> 1734835204) + Class346_Sub5.currentX);
                int i_123_ = i_122_ + Class67.baseX;
                boolean bool = (i_122_ >= 0 && (i_120_ ^ 0xffffffff) <= -1 && i_122_ < Node_Sub8_Sub4.anInt8360 && ((Node_Sub22.anInt7074 ^ 0xffffffff) < (i_120_ ^ 0xffffffff)));
                if (bool || Class73.method542((byte) 114, Class270.anInt3134)) {
                    Class223.method1782(i_121_, 0, new Node_Sub28(id, amt), Class226_Sub1_Sub1.currentZ, i_123_);
                    if (bool)
                        Class172.method1557(i_122_, Class226_Sub1_Sub1.currentZ, i_120_, (byte) 28);
                }
            } else if (class128 == Class84_Sub9.aClass128_5503) {
                int i_124_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteS((byte) -117);
                int i_125_ = i_124_ >> 1061559714;
                int i_126_ = Class112.anIntArray5203[i_125_];
                int i_127_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -103, i_127_);
                int i_128_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
                int i_129_ = ((0x75 & i_128_) >> 717766308) + Class346_Sub5.currentX;
                int i_130_ = Class355.currentY - -(i_128_ & 0x7);
                if ((i_125_ ^ 0xffffffff) == -12)
                    i_125_ = 10;
                int i_131_ = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readUnsignedByteC(true);
                int i_132_ = 0;
                if (((ObjectDefinition) class266).aByteArray3069 != null) {
                    int i_133_ = -1;
                    for (int i_134_ = 0; ((i_134_ ^ 0xffffffff) > (((ObjectDefinition) class266).aByteArray3069.length ^ 0xffffffff)); i_134_++) {
                        if ((((ObjectDefinition) class266).aByteArray3069[i_134_] ^ 0xffffffff) == (i_125_ ^ 0xffffffff)) {
                            i_133_ = i_134_;
                            break;
                        }
                    }
                    i_132_ = (((ObjectDefinition) class266).anIntArrayArray3099[i_133_]).length;
                }
                int i_135_ = 0;
                if (((ObjectDefinition) class266).aShortArray3073 != null)
                    i_135_ = ((ObjectDefinition) class266).aShortArray3073.length;
                int i_136_ = 0;
                if (((ObjectDefinition) class266).aShortArray3084 != null)
                    i_136_ = ((ObjectDefinition) class266).aShortArray3084.length;
                if ((i_131_ & 0x1 ^ 0xffffffff) != -2) {
                    int[] is = null;
                    if ((0x2 & i_131_ ^ 0xffffffff) == -3) {
                        is = new int[i_132_];
                        for (int i_137_ = 0; (i_137_ ^ 0xffffffff) > (i_132_ ^ 0xffffffff); i_137_++)
                            is[i_137_] = Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                    }
                    short[] is_138_ = null;
                    if ((i_131_ & 0x4 ^ 0xffffffff) == -5) {
                        is_138_ = new short[i_135_];
                        for (int i_139_ = 0; i_139_ < i_135_; i_139_++)
                            is_138_[i_139_] = (short) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                    }
                    short[] is_140_ = null;
                    if ((0x8 & i_131_) == 8) {
                        is_140_ = new short[i_136_];
                        for (int i_141_ = 0; i_136_ > i_141_; i_141_++)
                            is_140_[i_141_] = (short) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629.readShort(-1);
                    }
                    Class234.method1846(Class226_Sub1_Sub1.currentZ, i_129_, 0, i_126_, i_130_, new Class21(Class341.aLong3968++, is, is_138_, is_140_));
                } else
                    Class234.method1846(Class226_Sub1_Sub1.currentZ, i_129_, 0, i_126_, i_130_, null);
            } else {
                Class282_Sub14.method2975("T3 - " + class128, null, 1);
                Class340_Sub5.method3455(31, false);
            }
        }
    }

    final void method2918(byte i) {
        if (i == 98) {
            anInt7820++;
            if ((((Class282) this).anInt3320 ^ 0xffffffff) != -2 && (((Class282) this).anInt3320 ^ 0xffffffff) != -1)
                ((Class282) this).anInt3320 = method2919(false);
        }
    }

    Class282_Sub22(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    final int method2917(int i, int i_142_) {
        anInt7821++;
        if (i != 0)
            return 69;
        return 1;
    }

    Class282_Sub22(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final int method2919(boolean bool) {
        if (bool != false)
            return 27;
        anInt7826++;
        return 1;
    }
}
