/* Class279_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class279_Sub2_Sub1 extends Class279_Sub2 {
    static int anInt9826;
    static int anInt9827;
    static int anInt9828;
    static int anInt9829;
    static OutgoingOpcode aOutgoingOpcode_9830 = new OutgoingOpcode(34, 3);
    static boolean aBoolean9831 = false;
    private byte[] aByteArray9832;
    static WorldAddress worldAddress;

    public Class279_Sub2_Sub1() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    static final Class200 method2899(int i, byte i_0_) {
        anInt9829++;
        Class200[] class200s = Class84_Sub4.method612((byte) 120);
        for (int i_1_ = 0; class200s.length > i_1_; i_1_++) {
            Class200 class200 = class200s[i_1_];
            if ((i ^ 0xffffffff) == (((Class200) class200).anInt2287 ^ 0xffffffff))
                return class200;
        }
        if (i_0_ != -59)
            method2899(-21, (byte) 12);
        return null;
    }

    final byte[] method2900(int i, byte i_2_, int i_3_, int i_4_) {
        aByteArray9832 = new byte[i * i_4_ * i_3_ * 2];
        anInt9828++;
        this.method2883(i, i_4_, i_3_, 0);
        if (i_2_ < 111)
            return null;
        return aByteArray9832;
    }

    static final void method2901(ByteStream class248_sub9, int i, byte i_5_, Class174 class174) {
        anInt9826++;
        Node_Sub38 class248_sub38 = new Node_Sub38();
        ((Node_Sub38) class248_sub38).anInt7272 = class248_sub9.readUnsignedByte((byte) 120);
        ((Node_Sub38) class248_sub38).anInt7275 = class248_sub9.readInt(false);
        ((Node_Sub38) class248_sub38).aClass322Array7267 = new Class322[((Node_Sub38) class248_sub38).anInt7272];
        ((Node_Sub38) class248_sub38).aByteArrayArrayArray7274 = new byte[((Node_Sub38) class248_sub38).anInt7272][][];
        if (i_5_ == 58) {
            ((Node_Sub38) class248_sub38).anIntArray7271 = new int[((Node_Sub38) class248_sub38).anInt7272];
            ((Node_Sub38) class248_sub38).aClass322Array7268 = new Class322[((Node_Sub38) class248_sub38).anInt7272];
            ((Node_Sub38) class248_sub38).anIntArray7273 = new int[((Node_Sub38) class248_sub38).anInt7272];
            ((Node_Sub38) class248_sub38).anIntArray7265 = new int[((Node_Sub38) class248_sub38).anInt7272];
            for (int i_6_ = 0; ((((Node_Sub38) class248_sub38).anInt7272 ^ 0xffffffff) < (i_6_ ^ 0xffffffff)); i_6_++) {
                try {
                    int i_7_ = class248_sub9.readUnsignedByte((byte) -68);
                    if (i_7_ != 0 && i_7_ != 1 && (i_7_ ^ 0xffffffff) != -3) {
                        if ((i_7_ ^ 0xffffffff) == -4 || i_7_ == 4) {
                            String string = class248_sub9.readString(i_5_ + 15540);
                            String string_8_ = class248_sub9.readString(15598);
                            int i_9_ = class248_sub9.readUnsignedByte((byte) -56);
                            String[] strings = new String[i_9_];
                            for (int i_10_ = 0; (i_9_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++)
                                strings[i_10_] = class248_sub9.readString(15598);
                            byte[][] is = new byte[i_9_][];
                            if ((i_7_ ^ 0xffffffff) == -4) {
                                for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff)); i_11_++) {
                                    int i_12_ = class248_sub9.readInt(false);
                                    is[i_11_] = new byte[i_12_];
                                    class248_sub9.method2189(is[i_11_], 0, i_12_, 85);
                                }
                            }
                            ((Node_Sub38) class248_sub38).anIntArray7265[i_6_] = i_7_;
                            Class[] var_classes = new Class[i_9_];
                            for (int i_13_ = 0; i_13_ < i_9_; i_13_++)
                                var_classes[i_13_] = za.method2685(strings[i_13_], (byte) -125);
                            ((Node_Sub38) class248_sub38).aClass322Array7268[i_6_] = (class174.method1580(Class316_Sub1.method3291(i_5_, -43), za.method2685(string, (byte) -121), string_8_, var_classes));
                            ((Node_Sub38) class248_sub38).aByteArrayArrayArray7274[i_6_] = is;
                        }
                    } else {
                        String string = class248_sub9.readString(15598);
                        String string_14_ = class248_sub9.readString(15598);
                        int i_15_ = 0;
                        if ((i_7_ ^ 0xffffffff) == -2)
                            i_15_ = class248_sub9.readInt(false);
                        ((Node_Sub38) class248_sub38).anIntArray7265[i_6_] = i_7_;
                        ((Node_Sub38) class248_sub38).anIntArray7273[i_6_] = i_15_;
                        ((Node_Sub38) class248_sub38).aClass322Array7267[i_6_] = class174.method1571(true, za.method2685(string, (byte) -126), string_14_);
                    }
                } catch (ClassNotFoundException classnotfoundexception) {
                    ((Node_Sub38) class248_sub38).anIntArray7271[i_6_] = -1;
                } catch (SecurityException securityexception) {
                    ((Node_Sub38) class248_sub38).anIntArray7271[i_6_] = -2;
                } catch (NullPointerException nullpointerexception) {
                    ((Node_Sub38) class248_sub38).anIntArray7271[i_6_] = -3;
                } catch (Exception exception) {
                    ((Node_Sub38) class248_sub38).anIntArray7271[i_6_] = -4;
                } catch (Throwable throwable) {
                    ((Node_Sub38) class248_sub38).anIntArray7271[i_6_] = -5;
                }
            }
            Node_Sub8_Sub2.aClass293_8915.method3109(class248_sub38, i_5_ ^ ~0x48);
        }
    }

    public static void method2902(int i) {
        if (i <= 123)
            method2899(47, (byte) -28);
        aOutgoingOpcode_9830 = null;
        worldAddress = null;
    }

    final void method2893(byte i, int i_16_, byte i_17_) {
        anInt9827++;
        if (i_17_ == -111) {
            int i_18_ = i_16_ * 2;
            int i_19_ = i & 0xff;
            aByteArray9832[i_18_++] = (byte) (i_19_ * 3 >> -1692604859);
            aByteArray9832[i_18_] = (byte) (i_19_ * 3 >> 508956997);
        }
    }
}
