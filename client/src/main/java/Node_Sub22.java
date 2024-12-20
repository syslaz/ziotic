/* Class248_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub22 extends Node {
    int anInt7071;
    static int anInt7072;
    Class86_Sub1 aClass86_Sub1_7073;
    static int anInt7074 = 104;
    boolean aBoolean7075;
    boolean aBoolean7076;
    static int[] anIntArray7077;
    boolean aBoolean7078;
    boolean aBoolean7079;
    int anInt7080;
    static int anInt7081;
    static int anInt7082;

    static final void method2534(Class137[][][] class137s, byte i) {
        anInt7082++;
        int i_0_ = 0;
        if (i < 106)
            anIntArray7077 = null;
        for (/**/; i_0_ < class137s.length; i_0_++) {
            Class137[][] class137s_1_ = class137s[i_0_];
            for (int i_2_ = 0; (class137s_1_.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
                for (int i_3_ = 0; ((class137s_1_[i_2_].length ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
                    Class137 class137 = class137s_1_[i_2_][i_3_];
                    if (class137 != null) {
                        if (((Class137) class137).aClass346_Sub7_Sub4_1645 instanceof Interface16)
                            ((Interface16) ((Class137) class137).aClass346_Sub7_Sub4_1645).method44(true);
                        if (((Class137) class137).aClass346_Sub7_Sub1_1644 instanceof Interface16)
                            ((Interface16) ((Class137) class137).aClass346_Sub7_Sub1_1644).method44(true);
                        if (((Class137) class137).aClass346_Sub7_Sub1_1642 instanceof Interface16)
                            ((Interface16) ((Class137) class137).aClass346_Sub7_Sub1_1642).method44(true);
                        if (((Class137) class137).aClass346_Sub7_Sub5_1636 instanceof Interface16)
                            ((Interface16) ((Class137) class137).aClass346_Sub7_Sub5_1636).method44(true);
                        if (((Class137) class137).aClass346_Sub7_Sub5_1646 instanceof Interface16)
                            ((Interface16) ((Class137) class137).aClass346_Sub7_Sub5_1646).method44(true);
                        for (Class49 class49 = ((Class137) class137).aClass49_1649; class49 != null; class49 = ((Class49) class49).aClass49_660) {
                            Animable animable = ((Class49) class49).aAnimable_656;
                            if (animable instanceof Interface16)
                                ((Interface16) animable).method44(true);
                        }
                    }
                }
            }
        }
    }

    static final void method2535(String string, int i, String string_4_, boolean bool, int i_5_) {
        anInt7081++;
        Node_Sub36 class248_sub36 = Class352.method3751(0);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-119, ((Class224) Class356.aClass224_4399).opcode);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, 0);
        int i_6_ = (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, 640);
        int[] is = Class112.method789((byte) -103, class248_sub36);
        int i_7_ = (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string_4_, (byte) -102);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, Node_Sub8_Sub5.anInt8930);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -92);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLong(14731, Class54_Sub2.aLong5343);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-112, Class191.anInt4822);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-67, ((Class215) Class12.aClass215_249).anInt2475);
        Class239.method1913((byte) 61, (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257));
        String string_8_ = Class8.aString182;
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-34, string_8_ == null ? 0 : 1);
        if (string_8_ != null)
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string_8_, (byte) -66);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-90, i_5_);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-103, bool ? 1 : 0);
        ((ByteStream) ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257).offset += 7;
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2184(is, ((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset, (byte) 112, i_7_);
        if (i == -27314) {
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2206((((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset + -i_6_), i ^ 0x6ab0);
            Class226_Sub3.method1814(class248_sub36, 0);
            Node_Sub4.anInt6833 = -3;
            Class367.anInt4509 = 0;
            Node_Sub42_Sub1.anInt9782 = 1;
            Class215.anInt2476 = 0;
            if ((i_5_ ^ 0xffffffff) > -14) {
                Class45.aBoolean560 = true;
                Class61.method476(i ^ 0x6ab3);
            }
        }
    }

    public static void method2536(byte i) {
        if (i == 13)
            anIntArray7077 = null;
    }

    Node_Sub22(int i, Class86_Sub1 class86_sub1, int i_9_, boolean bool) {
        ((Node_Sub22) this).aClass86_Sub1_7073 = class86_sub1;
        ((Node_Sub22) this).anInt7080 = i;
        ((Node_Sub22) this).aBoolean7079 = bool;
        ((Node_Sub22) this).anInt7071 = i_9_;
    }

    static final void method2537(int i) {
        Class22.anInt319++;
        Class282_Sub2.anInt7611 = 0;
        Class120.anInt1511 = i;
        anInt7072++;
        Class316_Sub1.method3289((byte) 114);
        Class119.method1118(11473);
        Class200.method1682((byte) -72);
        boolean bool = false;
        for (int i_10_ = 0; (Class120.anInt1511 ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
            int i_11_ = Class131.anIntArray1596[i_10_];
            Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_11_, (byte) 31));
            NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
            if (Class145.aBoolean1721 && Class65.method506(i_11_, -3))
                Class295.method3128(i ^ ~0x754);
            if ((((Entity) NPC).anInt10452) != Class22.anInt319) {
                if (((NPC) NPC).aClass255_10614.method2740((byte) -67))
                    Node_Sub14_Sub19.method2335(false, NPC);
                NPC.method3670((byte) -89, null);
                bool = true;
                class248_sub10.remove(true);
            }
        }
        if (bool) {
            Node_Sub8_Sub16_Sub1.anInt10303 = Class253_Sub1.aClass65_7514.method513((byte) 32);
            Class253_Sub1.aClass65_7514.method508(Node_Sub30.aClass248_Sub10Array7182, true);
        }
        if ((Class30.currentPacketSize ^ 0xffffffff) != ((((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset) ^ 0xffffffff))
            throw new RuntimeException("gnp1 pos:" + (((ByteStream) (Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629)).offset) + " psize:" + Class30.currentPacketSize);
        for (int i_12_ = 0; (Class28.anInt4892 ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
            if ((Class253_Sub1.aClass65_7514.method501((long) Class346_Sub7_Sub2_Sub3.anIntArray10381[i_12_], (byte) 31)) == null)
                throw new RuntimeException("gnp2 pos:" + i_12_ + " size:" + Class28.anInt4892);
        }
        if ((Node_Sub8_Sub16_Sub1.anInt10303 + -Class28.anInt4892 ^ 0xffffffff) != -1)
            throw new RuntimeException("gnp3 mis:" + (-Class28.anInt4892 + (Node_Sub8_Sub16_Sub1.anInt10303)));
        for (int i_13_ = 0; ((Node_Sub8_Sub16_Sub1.anInt10303 ^ 0xffffffff) < (i_13_ ^ 0xffffffff)); i_13_++) {
            if (((Entity) (((Node_Sub10) Node_Sub30.aClass248_Sub10Array7182[i_13_]).aNPC_6946)).anInt10452 != Class22.anInt319)
                throw new RuntimeException("gnp4 uk:" + (((Entity) (((Node_Sub10) (Node_Sub30.aClass248_Sub10Array7182[i_13_])).aNPC_6946)).anInt10484));
        }
    }
}
