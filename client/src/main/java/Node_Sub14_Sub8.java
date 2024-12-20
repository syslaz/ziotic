/* Class248_Sub14_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub8 extends Node_Sub14 {
    static IncommingOpcode aIncommingOpcode_9225 = new IncommingOpcode(116, -1);
    static int anInt9226;
    static IncommingOpcode aIncommingOpcode_9227 = new IncommingOpcode(21, -1);
    private int anInt9228;
    static int anInt9229;
    private int anInt9230;
    static int anInt9231;
    static int anInt9232;
    static int anInt9233;
    private int anInt9234;

    static final int method2296(int i, int i_0_, int i_1_, int i_2_) {
        i &= 0x3;
        anInt9233++;
        if ((i ^ 0xffffffff) == -1)
            return i_1_;
        if (i_2_ != 30141)
            return -117;
        if ((i ^ 0xffffffff) == -2)
            return i_0_;
        if (i == 2)
            return -i_1_ + 7;
        return -i_0_ + 7;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_3_) {
        anInt9232++;
        if (i != -61)
            anInt9234 = -128;
        int i_4_ = i_3_;
        if ((i_4_ ^ 0xffffffff) == -1)
            method2299(-24408, class248_sub9.method2221(255));
    }

    public static void method2297(byte i) {
        aIncommingOpcode_9225 = null;
        if (i > -14)
            aIncommingOpcode_9225 = null;
        aIncommingOpcode_9227 = null;
    }

    static final void method2298(String string, int i) {
        anInt9229++;
        if (Class115.aBoolean4952 && (Class346_Sub2.anInt8264 & 0x18) != 0) {
            boolean bool = false;
            int i_5_ = Class131.anInt1600;
            int[] is = Class271.anIntArray3156;
            for (int i_6_ = i; i_6_ < i_5_; i_6_++) {
                Player player = (Node_Sub32.aPlayerArray7197[is[i_6_]]);
                if (((Player) player).aString10550 != null && ((Player) player).aString10550.equalsIgnoreCase(string) && (((Class347.myPlayer == player) && ((0x10 & Class346_Sub2.anInt8264 ^ 0xffffffff) != -1)) || (player != null && (Class346_Sub2.anInt8264 & 0x8) != 0))) {
                    Class112_Sub3.anInt8642++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class29.aOutgoingOpcode_372);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(is[i_6_], -231665880);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(InputStream_Sub2.anInt76, -231665880);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, Class168.anInt1963);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-101, 0);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(i + 27695, Class346_Sub7_Sub5.anInt9963);
                    Class226_Sub3.method1814(class248_sub36, i);
                    bool = true;
                    Class344.method3520(0, ((Entity) player).posQueueY[0], 0, player.method3632(-1), -2, player.method3632(-1), true, ((Entity) player).posQueueX[0], -1);
                    break;
                }
            }
            if (!bool)
                Node_Sub14_Sub5.method2289(4, 31663, Class41.aClass41_487.method301(Class191.anInt4822, (byte) -108) + string);
            if (Class115.aBoolean4952)
                Class1.method168((byte) 86);
        }
    }

    private Node_Sub14_Sub8(int i) {
        super(0, false);
        method2299(-24408, i);
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9231++;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (bool != true)
            anInt9228 = -22;
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int[] is_7_ = is[0];
            int[] is_8_ = is[1];
            int[] is_9_ = is[2];
            for (int i_10_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
                is_7_[i_10_] = anInt9228;
                is_8_[i_10_] = anInt9230;
                is_9_[i_10_] = anInt9234;
            }
        }
        return is;
    }

    private final void method2299(int i, int i_11_) {
        anInt9234 = 0xff0 & i_11_ << -971017372;
        anInt9228 = 0xff0 & i_11_ >> -1092423860;
        anInt9230 = (0xff00 & i_11_) >> 718651716;
        anInt9226++;
        if (i != -24408)
            anInt9228 = -18;
    }

    public Node_Sub14_Sub8() {
        this(0);
    }
}
