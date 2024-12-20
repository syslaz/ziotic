/* Class346_Sub7_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub7_Sub5_Sub2 extends Class346_Sub7_Sub5 implements Interface16 {
    static int anInt10214;
    private boolean aBoolean10215 = false;
    static int anInt10216;
    static int anInt10217;
    static int anInt10218;
    private Class38 aClass38_10219;
    private boolean aBoolean10220;
    static int anInt10221;
    static int anInt10222;
    static OutgoingOpcode aOutgoingOpcode_10223 = new OutgoingOpcode(54, -1);
    static int anInt10224;
    static int anInt10225;
    static int anInt10226;
    static int anInt10227;
    static int anInt10228;
    static int anInt10229;
    static int anInt10230;
    static int anInt10231;
    static int anInt10232;
    static int anInt10233;
    static int anInt10234;
    static int anInt10235;
    Class150 aClass150_10236;
    static int anInt10237;
    static int anInt10238;
    static int anInt10239;
    static int anInt10240;
    static int anInt10241;

    final boolean method3579(ha var_ha, int i, int i_0_, byte i_1_) {
        anInt10221++;
        Class162 class162 = ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236.method1339(var_ha, false, 131072, i_1_ + -21488, false);
        if (class162 == null)
            return false;
        if (i_1_ != 103)
            method3701(-49, 82, 82);
        Viewport viewport = var_ha.o();
        viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
        if (!Class357.aBoolean4416)
            return class162.method1437(i_0_, i, viewport, false, 0);
        return class162.method1420(i_0_, i, viewport, false, 0, ObjectDefinition.anInt3100);
    }

    public final void method42(boolean bool, ha var_ha) {
        ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236.method1346((byte) 39, var_ha);
        anInt10233++;
        if (bool != true)
            aBoolean10220 = false;
    }

    final void method3577(int i) {
        if (i == 131072) {
            anInt10227++;
            throw new IllegalStateException();
        }
    }

    final void method3572(Interactable interactable, ha var_ha, int i, int i_2_, int i_3_, boolean bool, int i_4_) {
        anInt10239++;
        if (i_2_ >= 109)
            throw new IllegalStateException();
    }

    final boolean method3574(byte i) {
        anInt10238++;
        int i_5_ = 49 / ((i - 14) / 57);
        return false;
    }

    public final int method43(byte i) {
        anInt10232++;
        if (i != -111)
            return -39;
        return (((Class150) ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236).anInt1787);
    }

    static final int[][] method3696(byte i, int i_6_, int i_7_, boolean bool, float f, int i_8_, int i_9_, int i_10_, int i_11_) {
        anInt10217++;
        int[][] is = new int[i_10_][i_6_];
        Node_Sub14_Sub1 class248_sub14_sub1 = new Node_Sub14_Sub1();
        ((Node_Sub14_Sub1) class248_sub14_sub1).aBoolean9159 = bool;
        ((Node_Sub14_Sub1) class248_sub14_sub1).anInt9171 = i_7_;
        ((Node_Sub14_Sub1) class248_sub14_sub1).anInt9165 = (int) (4096.0F * f);
        ((Node_Sub14_Sub1) class248_sub14_sub1).anInt9163 = i_9_;
        ((Node_Sub14_Sub1) class248_sub14_sub1).anInt9162 = i_8_;
        class248_sub14_sub1.method2263(i + 8432);
        Class68.method521(i_10_, false, i_6_);
        int i_12_ = 0;
        if (i != -81)
            aOutgoingOpcode_10223 = null;
        for (/**/; i_12_ < i_10_; i_12_++)
            class248_sub14_sub1.method2275((byte) 100, i_12_, is[i_12_]);
        return is;
    }

    final int method3580(int i) {
        if (i != -32768)
            method41(-108, null);
        anInt10241++;
        return ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236.method1341(1);
    }

    public static void method3697(byte i) {
        if (i == -47)
            aOutgoingOpcode_10223 = null;
    }

    Class346_Sub7_Sub5_Sub2(ha var_ha, ObjectDefinition class266, int i, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool, int i_17_, int i_18_, int i_19_) {
        super(i_14_, i_15_, i_16_, i, i_13_, Animable.method3596((byte) 112, i_17_, i_18_));
        ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236 = new Class150(var_ha, class266, i_17_, i_18_, ((Interactable) this).plane, i_13_, this, bool, i_19_);
        aBoolean10220 = (((ObjectDefinition) class266).anInt3105 ^ 0xffffffff) != -1 && !bool;
    }

    final int method3567(byte i) {
        anInt10229++;
        if (i <= 81)
            method3575((byte) 112, null);
        return ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236.method1337(-1);
    }

    public final int method40(byte i) {
        if (i < 63)
            ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236 = null;
        anInt10231++;
        return (((Class150) ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236).anInt1754);
    }

    final Class346_Sub10 method3578(int i, ha var_ha) {
        anInt10240++;
        if (i != -1)
            aBoolean10220 = false;
        Class162 class162 = ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236.method1339(var_ha, true, 2048, i ^ 0x5388, false);
        if (class162 == null)
            return null;
        Viewport viewport = var_ha.o();
        viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
        Class346_Sub10 class346_sub10 = Class282_Sub21.method3013(aBoolean10220, (byte) 122, 1);
        int i_20_ = ((Interactable) this).x >> 248255273;
        int i_21_ = ((Interactable) this).y >> -509576663;
        ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236.method1347(false, i_21_, viewport, i_20_, class162, var_ha, i_20_, i_21_, true);
        if (!Class357.aBoolean4416)
            class162.method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), 0);
        else
            class162.method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), ObjectDefinition.anInt3100, 0);
        if ((((Class150) ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236).aClass346_Sub8_1773) != null) {
            Class338 class338 = ((Class150) ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236).aClass346_Sub8_1773.method3714();
            if (!Class357.aBoolean4416)
                var_ha.a(class338);
            else
                var_ha.a(class338, ObjectDefinition.anInt3100);
        }
        aBoolean10215 = class162.F() || (((Class150) (((Class346_Sub7_Sub5_Sub2) this).aClass150_10236)).aClass346_Sub8_1773) != null;
        if (aClass38_10219 != null)
            Class225_Sub1.method1788(aClass38_10219, ((Interactable) this).anInt8317, class162, ((Interactable) this).y, i ^ 0x50, ((Interactable) this).x);
        else
            aClass38_10219 = Class282_Sub11.method2965(((Interactable) this).y, ((Interactable) this).x, ((Interactable) this).anInt8317, 544, class162);
        return class346_sub10;
    }

    public final void method41(int i, ha var_ha) {
        ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236.method1335(var_ha, i ^ 0x599f);
        anInt10214++;
        if (i != 6120)
            aBoolean10220 = true;
    }

    static final boolean method3698(int i, int i_22_, int i_23_) {
        anInt10224++;
        if (i_23_ != 33)
            return false;
        if ((i & 0x21) == 0)
            return false;
        return true;
    }

    final void method3573(ha var_ha, byte i) {
        anInt10218++;
        Class162 class162 = ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236.method1339(var_ha, true, 262144, -21385, true);
        if (class162 != null) {
            int i_24_ = ((Interactable) this).x >> -1071921175;
            int i_25_ = ((Interactable) this).y >> -1689660151;
            Viewport viewport = var_ha.o();
            viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
            ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236.method1347(false, i_25_, viewport, i_24_, class162, var_ha, i_24_, i_25_, false);
        }
        if (i <= 121)
            aBoolean10215 = true;
    }

    static final boolean method3699(int interfaceId, byte i_26_) {
        anInt10228++;
        if (Class77.aBooleanArray988[interfaceId])
            return true;
        if (!Class346_Sub2.aClass381_8257.method3906(-14491, interfaceId))
            return false;
        int i_27_ = Class346_Sub2.aClass381_8257.method3899(interfaceId, 0);
        if (i_27_ == 0) {
            Class77.aBooleanArray988[interfaceId] = true;
            return true;
        }
        if (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[interfaceId] == null)
            Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[interfaceId] = new RSInterface2[i_27_];
        if (i_26_ != -22)
            aOutgoingOpcode_10223 = null;
        for (int interfaceChild = 0; interfaceChild < i_27_; interfaceChild++) {
            if (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[interfaceId][interfaceChild] == null) {
                byte[] is = Class346_Sub2.aClass381_8257.method3922((byte) 116, interfaceId, interfaceChild);
                if (is != null) {
                    RSInterface2 inter = (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[interfaceId][interfaceChild] = new RSInterface2());
                    ((RSInterface2) inter).interfaceValues = (interfaceId << 16) + interfaceChild;
                    if (is[0] == -1)
                        inter.parseInterface(0, new ByteStream(is));
                    else
                        throw new IllegalStateException("if1");
                }
            }
        }
        Class77.aBooleanArray988[interfaceId] = true;
        return true;
    }

    final boolean method3568(int i) {
        int i_29_ = -20 / ((i - 53) / 45);
        anInt10237++;
        return false;
    }

    final void method3700(byte i, Class21 class21) {
        ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236.method1344(class21, 0);
        anInt10222++;
        if (i != 123)
            method3580(-68);
    }

    public final void method44(boolean bool) {
        anInt10234++;
        if (bool != true)
            method3577(-111);
    }

    public final int method46(byte i) {
        anInt10226++;
        int i_30_ = 31 / ((i - -57) / 53);
        return (((Class150) ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236).anInt1755);
    }

    static final void method3701(int i, int i_31_, int i_32_) {
        anInt10235++;
        Class279_Sub1_Sub1.anInt9816++;
        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, Class346_Sub5_Sub2.aISAACCypher_9889, Node_Sub42_Sub2.aOutgoingOpcode_9784);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, i);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(i_32_, -231665880);
        if (i_31_ != -1)
            aOutgoingOpcode_10223 = null;
        Class226_Sub3.method1814(class248_sub36, 0);
    }

    final Class38 method3575(byte i, ha var_ha) {
        anInt10225++;
        if (i >= -86)
            method3700((byte) -97, null);
        return aClass38_10219;
    }

    final boolean method3563(boolean bool) {
        if (bool != false)
            aBoolean10220 = false;
        anInt10216++;
        return aBoolean10215;
    }

    public final boolean method45(int i) {
        if (i != -28823)
            method46((byte) 28);
        anInt10230++;
        return ((Class346_Sub7_Sub5_Sub2) this).aClass150_10236.method1338((byte) -127);
    }
}
