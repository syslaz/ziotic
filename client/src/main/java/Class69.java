/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class69 {
    static int anInt907;
    char aChar908;
    int anInt909 = 1;
    static int anInt910;
    static int anInt911;
    static int anInt912;
    static boolean aBoolean913 = false;
    static double aDouble914;
    static int anInt915;

    private final void method523(int i, int i_0_, ByteStream class248_sub9) {
        if ((i ^ 0xffffffff) != -2) {
            if (i == 2)
                ((Class69) this).anInt909 = 0;
        } else
            ((Class69) this).aChar908 = Class226.method1802((byte) -71, class248_sub9.readByte(82));
        anInt912++;
        if (i_0_ != 0)
            anInt910 = -105;
    }

    final void method524(ByteStream class248_sub9, byte i) {
        for (; ; ) {
            int i_1_ = class248_sub9.readUnsignedByte((byte) 120);
            if (i_1_ == 0)
                break;
            method523(i_1_, 0, class248_sub9);
        }
        if (i >= 22)
            anInt911++;
    }

    static final void method525(Player player, int i, PacketStream class248_sub9_sub2, int i_2_, int i_3_) {
        anInt907++;
        byte forcedMovementMode = -1;
        if ((i_2_ & 0x8) != 0) { //facedir
            ((Player) player).anInt10536 = class248_sub9_sub2.readUnsignedLEShort(true);
            if (((((Entity) player).anInt10503) ^ 0xffffffff) == -1) {
                System.out.println("face dir: " + ((Player) player).anInt10536);
                player.faceDir(false, ((Player) player).anInt10536);
                ((Player) player).anInt10536 = -1;
            }
        }
        int i_5_ = 22 % ((i - 82) / 33);
        if ((i_2_ & 0x2000 ^ 0xffffffff) != -1)
            ((Player) player).aBoolean10565 = (class248_sub9_sub2.readUnsignedByteC(true) ^ 0xffffffff) == -2;
        if ((0x800 & i_2_) != 0) { //forcedchat
            ((Entity) player).message = class248_sub9_sub2.readString(15598);
            if ((((Entity) player).message.charAt(0) ^ 0xffffffff) == -127) {
                ((Entity) player).message = ((Entity) player).message.substring(1);
                Class216.method1740(0, (((Entity) player).message), ((Player) player).name, (byte) -15, player.method3657(-116, true), player.method3655((byte) -120, false), 2);
            } else if (Class347.myPlayer == player)
                Class216.method1740(0, (((Entity) player).message), ((Player) player).name, (byte) -15, player.method3657(-116, true), player.method3655((byte) -100, false), 2);
            ((Entity) player).anInt10462 = 0;
            ((Entity) player).anInt10481 = 150;
            ((Entity) player).anInt10458 = 0;
        }
        if ((0x10000 & i_2_) != 0) {
            ((Entity) player).aByte10477 = class248_sub9_sub2.readByte(33);
            ((Entity) player).aByte10413 = class248_sub9_sub2.readByteS(-33);
            ((Entity) player).aByte10485 = class248_sub9_sub2.readByteA(-8996);
            ((Entity) player).aByte10450 = (byte) class248_sub9_sub2.readUnsignedByteA((byte) -45);
            ((Entity) player).anInt10479 = (Node_Sub18.anInt7027 - -class248_sub9_sub2.readUnsignedLEShortA(128));
            ((Entity) player).anInt10421 = (Node_Sub18.anInt7027 - -class248_sub9_sub2.readShort(-1));
        }
        if ((i_2_ & 0x100 ^ 0xffffffff) != -1) {
            int i_6_ = class248_sub9_sub2.readUnsignedByteS((byte) 57);
            int[] is = new int[i_6_];
            int[] is_7_ = new int[i_6_];
            int[] is_8_ = new int[i_6_];
            for (int i_9_ = 0; i_6_ > i_9_; i_9_++) {
                int i_10_ = class248_sub9_sub2.readUnsignedLEShortA(128);
                if (i_10_ == 65535)
                    i_10_ = -1;
                is[i_9_] = i_10_;
                is_7_[i_9_] = class248_sub9_sub2.readUnsignedByte((byte) 112);
                is_8_[i_9_] = class248_sub9_sub2.readShort(-1);
            }
            Class65.method514(is_7_, 0, is_8_, player, is);
        }
        if ((i_2_ & 0x1000) != 0) {//graphics2
            int i_11_ = class248_sub9_sub2.readUnsignedLEShortA(128);
            int i_12_ = class248_sub9_sub2.readInt1((byte) -65);
            if (i_11_ == 65535)
                i_11_ = -1;
            int i_13_ = class248_sub9_sub2.readUnsignedByteS((byte) 120);
            int i_14_ = 0x7 & i_13_;
            int i_15_ = i_13_ >> -977184189 & 0xf;
            if (i_15_ == 15)
                i_15_ = -1;
            player.method3629(i_15_, i_11_, i_12_, 1, (byte) 115, i_14_);
        }
        if ((0x4000 & i_2_) != 0) {
            int i_16_ = class248_sub9_sub2.readShortA(-126);
            ((Entity) player).anInt10412 = class248_sub9_sub2.readUnsignedByteC(true);
            ((Entity) player).anInt10449 = class248_sub9_sub2.readUnsignedByte((byte) 69);
            ((Entity) player).anInt10440 = 0x7fff & i_16_;
            ((Entity) player).aBoolean10451 = (0x8000 & i_16_) != 0;
            ((Entity) player).anInt10490 = (Node_Sub18.anInt7027 - -(((Entity) player).anInt10440) - -(((Entity) player).anInt10412));
        }
        if ((0x20 & i_2_ ^ 0xffffffff) != -1) //movementmode
            Class302.aByteArray3504[i_3_] = class248_sub9_sub2.readByteS(-93);
        if ((i_2_ & 0x1) != 0) { //faceentity
            int i_17_ = class248_sub9_sub2.readShortA(-96);
            if (i_17_ == 65535)
                i_17_ = -1;
            System.out.println("face entity: " + i_17_);
            ((Entity) player).faceEntity = i_17_;
        }
        if ((i_2_ & 0x20000 ^ 0xffffffff) != -1) { //graphics3
            int i_18_ = class248_sub9_sub2.readUnsignedLEShortA(128);
            int i_19_ = class248_sub9_sub2.readInt(false);
            if ((i_18_ ^ 0xffffffff) == -65536)
                i_18_ = -1;
            int i_20_ = class248_sub9_sub2.readUnsignedByte((byte) -50);
            int i_21_ = i_20_ & 0x7;
            int i_22_ = (0x79 & i_20_) >> 1241608995;
            if ((i_22_ ^ 0xffffffff) == -16)
                i_22_ = -1;
            player.method3629(i_22_, i_18_, i_19_, 2, (byte) 117, i_21_);
        }
        if ((0x40 & i_2_ ^ 0xffffffff) != -1) {//anim
            int[] is = new int[4];
            for (int i_23_ = 0; i_23_ < 4; i_23_++) {
                is[i_23_] = class248_sub9_sub2.readUnsignedLEShort(true);
                if ((is[i_23_] ^ 0xffffffff) == -65536)
                    is[i_23_] = -1;
            }
            int i_24_ = class248_sub9_sub2.readUnsignedByteA((byte) -45);
            Class257.method2752(i_24_, player, (byte) 66, is);
        }
        if ((0x10 & i_2_ ^ 0xffffffff) != -1) {//appear
            int i_25_ = class248_sub9_sub2.readUnsignedByteS((byte) -127);
            byte[] is = new byte[i_25_];
            ByteStream class248_sub9 = new ByteStream(is);
            class248_sub9_sub2.method2200(i_25_, is, false, 0);
            Class338.aClass248_Sub9Array3937[i_3_] = class248_sub9;
            player.parseAppearance(true, class248_sub9);
        }
        if ((0x400 & i_2_) != 0) {
            ((Entity) player).forceMovementX1 = class248_sub9_sub2.readByteS(-34);
            ((Entity) player).forceMovementY1 = class248_sub9_sub2.readByteA(-8996);
            ((Entity) player).forceMovementX2 = class248_sub9_sub2.readByteC((byte) 127);
            ((Entity) player).forceMovementY2 = class248_sub9_sub2.readByteA(-8996);
            ((Entity) player).forceMovementSpeed1 = (class248_sub9_sub2.readShortA(-102) + Node_Sub18.anInt7027);
            ((Entity) player).forceMovementSpeed2 = (class248_sub9_sub2.readUnsignedLEShortA(128) + Node_Sub18.anInt7027);
            ((Entity) player).forceMovementDirection = class248_sub9_sub2.readUnsignedByte((byte) 120);
            System.out.println("x1: " + ((Entity) player).forceMovementX1);
            System.out.println("y1: " + ((Entity) player).forceMovementY1);
            System.out.println("x2: " + ((Entity) player).forceMovementX2);
            System.out.println("y2: " + ((Entity) player).forceMovementY2);
            System.out.println("speed1: " + ((Entity) player).forceMovementSpeed1);
            System.out.println("speed2: " + ((Entity) player).forceMovementSpeed2);
            System.out.println("dir: " + ((Entity) player).forceMovementDirection);

            if (((Player) player).aBoolean10576) {
                ((Entity) player).forceMovementX2 += ((Player) player).anInt10559;
                ((Entity) player).forceMovementX1 += ((Player) player).anInt10559;
                ((Entity) player).forceMovementY1 += ((Player) player).anInt10581;
                ((Entity) player).anInt10503 = 0;
                ((Entity) player).forceMovementY2 += ((Player) player).anInt10581;
            } else {
                ((Entity) player).anInt10503 = 1;
                ((Entity) player).forceMovementX2 += ((Entity) player).posQueueX[0];
                ((Entity) player).forceMovementY1 += ((Entity) player).posQueueY[0];
                ((Entity) player).forceMovementY2 += ((Entity) player).posQueueY[0];
                ((Entity) player).forceMovementX1 += ((Entity) player).posQueueX[0];
            }
            ((Entity) player).anInt10505 = 0;
        }
        if ((i_2_ & 0x8000) != 0) //forcemovementmode
            forcedMovementMode = class248_sub9_sub2.readByteC((byte) 94);
        if ((0x2 & i_2_ ^ 0xffffffff) != -1) {//hit
            int i_26_ = class248_sub9_sub2.readUnsignedByteC(true);
            if (i_26_ > 0) {
                for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
                    int i_28_ = -1;
                    int i_29_ = -1;
                    int i_30_ = -1;
                    int i_31_ = class248_sub9_sub2.readSmart((byte) 22);
                    if ((i_31_ ^ 0xffffffff) == -32768) {
                        i_31_ = class248_sub9_sub2.readSmart((byte) 22);
                        i_29_ = class248_sub9_sub2.readSmart((byte) 22);
                        i_28_ = class248_sub9_sub2.readSmart((byte) 22);
                        i_30_ = class248_sub9_sub2.readSmart((byte) 22);
                    } else if ((i_31_ ^ 0xffffffff) == -32767)
                        i_31_ = -1;
                    else
                        i_29_ = class248_sub9_sub2.readSmart((byte) 22);
                    int i_32_ = class248_sub9_sub2.readSmart((byte) 22);
                    int i_33_ = class248_sub9_sub2.readUnsignedByteA((byte) -45);
                    player.method3643(i_28_, 80, i_29_, i_32_, (Node_Sub18.anInt7027), i_31_, i_33_, i_30_);
                }
            }
        }
        if ((0x80 & i_2_ ^ 0xffffffff) != -1) {//graphics
            int i_34_ = class248_sub9_sub2.readUnsignedLEShortA(128);
            int i_35_ = class248_sub9_sub2.readInt1((byte) -112);
            if ((i_34_ ^ 0xffffffff) == -65536)
                i_34_ = -1;
            int i_36_ = class248_sub9_sub2.readUnsignedByteS((byte) 112);
            int i_37_ = i_36_ & 0x7;
            int i_38_ = i_36_ >> 2064794275 & 0xf;


            if ((i_38_ ^ 0xffffffff) == -16)
                i_38_ = -1;
            player.method3629(i_38_, i_34_, i_35_, 0, (byte) 116, i_37_);
        }
        if ((i_2_ & 0x40000 ^ 0xffffffff) != -1) {
            int i_39_ = class248_sub9_sub2.readUnsignedByteS((byte) 78);
            int[] is = new int[i_39_];
            int[] is_40_ = new int[i_39_];
            for (int i_41_ = 0; i_41_ < i_39_; i_41_++) {
                int i_42_ = class248_sub9_sub2.readShortA(-102);
                if ((i_42_ & 0xc000) != 49152)
                    is[i_41_] = i_42_;
                else {
                    int i_43_ = class248_sub9_sub2.readUnsignedLEShortA(128);
                    is[i_41_] = Class358.retrieveLooksSettings(i_43_, i_42_ << 582863824);
                }
                is_40_[i_41_] = class248_sub9_sub2.readShortA(-110);
            }
            player.method3638(is_40_, false, is);
        }
        if (((Player) player).aBoolean10576) {
            if ((forcedMovementMode ^ 0xffffffff) != -128) {
                byte i_44_;
                if (forcedMovementMode != -1)
                    i_44_ = forcedMovementMode;
                else
                    i_44_ = Class302.aByteArray3504[i_3_];
                Class43.method312(player, i_44_, 0);
                player.method3654(i_44_, 0, ((Player) player).anInt10581, ((Player) player).anInt10559);
            } else
                player.method3653(((Player) player).anInt10581, ((Player) player).anInt10559, (byte) -73);
        }
    }

    public Class69() {
        /* empty */
    }

    static final void method526() {
        for (int i = 0; i < Class183.aClass288Array2143.length; i++)
            Class183.aClass288Array2143[i].method3082();
        Class183.aClass288Array2143 = null;
    }

    static {
        anInt910 = 0;
    }
}
