/* ha_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;

import java.awt.*;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

abstract class ha_Sub3 extends ha {
    static int anInt5953;
    static int anInt5954;
    int anInt5955;
    private Class293 aClass293_5956 = new Class293();
    static int anInt5957;
    static int anInt5958;
    static int anInt5959;
    static int anInt5960;
    static int anInt5961;
    static int anInt5962;
    static int anInt5963;
    static int anInt5964;
    static int anInt5965;
    static int anInt5966;
    static int anInt5967;
    static int anInt5968;
    static int anInt5969;
    static int anInt5970;
    static int anInt5971;
    static int anInt5972;
    static int anInt5973;
    static int anInt5974;
    static int anInt5975;
    static int anInt5976;
    static int anInt5977;
    static int anInt5978;
    static int anInt5979;
    static int anInt5980;
    static int anInt5981;
    static int anInt5982;
    static int anInt5983;
    static int anInt5984;
    static int anInt5985;
    int anInt5986;
    static int anInt5987;
    static int anInt5988;
    static int anInt5989;
    static int anInt5990;
    static int anInt5991;
    static int anInt5992;
    Canvas aCanvas5993;
    static int anInt5994;
    static int anInt5995;
    private Canvas aCanvas5996;
    NativeInterface aNativeInterface5997;
    static int anInt5998;
    private Hashtable aHashtable5999;
    static int anInt6000;
    static int anInt6001;
    static int anInt6002;
    static int anInt6003;
    Object anObject6004;
    static int anInt6005;
    static int anInt6006;
    static int anInt6007;
    private Object anObject6008;
    static int anInt6009;
    static int anInt6010;
    static int anInt6011;
    static int anInt6012;
    static int anInt6013;
    static int anInt6014;
    static int anInt6015;
    static int anInt6016;
    static int anInt6017;
    static int anInt6018;
    static int anInt6019;
    long aLong6020;
    static int anInt6021;
    static int anInt6022;
    static int anInt6023;
    static int anInt6024;
    static int anInt6025;
    static int anInt6026;
    static int anInt6027;
    static int anInt6028;
    static int anInt6029;
    static int anInt6030;
    static int anInt6031;
    static int anInt6032;
    static int anInt6033;
    static int anInt6034;
    static int anInt6035;
    static int anInt6036;
    static int anInt6037;
    static int anInt6038;
    static int anInt6039;
    static int anInt6040;
    static int anInt6041;
    static int anInt6042;
    static int anInt6043;
    static int anInt6044;
    static IncommingOpcode aIncommingOpcode_6045;
    static int anInt6046;
    static int anInt6047;
    static int anInt6048;
    static int anInt6049;
    static int anInt6050;
    static int anInt6051;
    static int anInt6052;
    static int anInt6053;
    static int anInt6054;
    static int anInt6055;
    static int anInt6056;
    private int anInt6057;
    static int anInt6058;
    NativeHeap aNativeHeap6059;
    static boolean aBoolean6060 = false;
    static int anInt6061;
    NativeHeapBuffer aNativeHeapBuffer6062;
    static int anInt6063;
    static int anInt6064;
    static int anInt6065;
    static int anInt6066;
    static int anInt6067;
    static int anInt6068;
    static int anInt6069;
    static int anInt6070;
    static int anInt6071;
    static int anInt6072;
    static int anInt6073;
    static int anInt6074;
    static int anInt6075;
    static int anInt6076;
    static int anInt6077;
    static int anInt6078;
    static int anInt6079;
    static int anInt6080;
    static int anInt6081;
    static int anInt6082;
    static int anInt6083;
    static int anInt6084;
    private int anInt6085;
    static int anInt6086;
    static int anInt6087;
    static int anInt6088;
    static int anInt6089;
    static int anInt6090;
    static int anInt6091;
    static int anInt6092;
    static int anInt6093;
    static int anInt6094;
    static int anInt6095;
    static int anInt6096;
    static int anInt6097;
    static int anInt6098;
    static int anInt6099;
    static int anInt6100;
    static int anInt6101;
    static int anInt6102;
    static int anInt6103;
    static int anInt6104;
    static int anInt6105;
    static int anInt6106;
    static int anInt6107;
    Class381 aClass381_6108;
    static int anInt6109;
    static int anInt6110;
    static int anInt6111;
    static int anInt6112;
    static int anInt6113;
    static int anInt6114;
    static int anInt6115;
    static int anInt6116;
    static int anInt6117;
    static int anInt6118;
    static int anInt6119;
    static int anInt6120;
    static int anInt6121;
    static int anInt6122;
    static int anInt6123;
    static int anInt6124;
    static int anInt6125;
    static int anInt6126;
    Class370 aClass370_6127;
    static int anInt6128;
    static int anInt6129;
    static int anInt6130;
    static int anInt6131 = -50;
    static int anInt6132;
    static int anInt6133;
    static int anInt6134;
    static int anInt6135;
    static int anInt6136;
    static int anInt6137;
    boolean aBoolean6138 = true;
    int anInt6139;
    int anInt6140;
    Class238_Sub2 aClass238_Sub2_6141 = new Class238_Sub2();
    static int anInt6142;
    int anInt6143;
    static int anInt6144;
    static int anInt6145;
    static int anInt6146;
    Class238_Sub2 aClass238_Sub2_6147 = new Class238_Sub2();
    Class238_Sub2 aClass238_Sub2_6148 = new Class238_Sub2();
    Class238_Sub2 aClass238_Sub2_6149 = new Class238_Sub2();
    private Class238_Sub2 aClass238_Sub2_6150 = new Class238_Sub2();
    private Class238_Sub2 aClass238_Sub2_6151 = new Class238_Sub2();
    private int anInt6152 = 0;
    int anInt6153;
    int anInt6154;
    private float[] aFloatArray6155;
    int anInt6156;
    private boolean aBoolean6157 = false;
    int anInt6158 = -1;
    float aFloat6159;
    float aFloat6160;
    private boolean aBoolean6161;
    private boolean aBoolean6162;
    private float[] aFloatArray6163;
    int anInt6164 = 3584;
    Node_Sub42[] aClass248_Sub42Array6165;
    int anInt6166;
    int anInt6167;
    float aFloat6168;
    Class238_Sub2[] aClass238_Sub2Array6169;
    float aFloat6170;
    float aFloat6171;
    private Class340 aClass340_6172;
    int anInt6173 = 50;
    private int anInt6174;
    private float aFloat6175;
    int anInt6176;
    boolean aBoolean6177;
    private boolean aBoolean6178;
    Class5[] aClass5Array6179;
    private int anInt6180;
    boolean aBoolean6181;
    float[] aFloatArray6182;
    private float[] aFloatArray6183;
    private int anInt6184;
    float aFloat6185;
    boolean aBoolean6186;
    int anInt6187;
    boolean aBoolean6188;
    int anInt6189;
    float aFloat6190;
    float aFloat6191;
    int anInt6192;
    int anInt6193;
    Class17 aClass17_6194;
    float[] aFloatArray6195;
    int anInt6196;
    float aFloat6197;
    boolean aBoolean6198;
    private int anInt6199;
    private int anInt6200;
    private int anInt6201;
    float aFloat6202;
    private Class340[] aClass340Array6203;
    int anInt6204;
    private float aFloat6205;
    int anInt6206;
    int anInt6207;
    int anInt6208;
    boolean aBoolean6209;
    int anInt6210;
    boolean aBoolean6211;
    private Class59 aClass59_6212;
    float aFloat6213;
    int anInt6214;
    private Class316_Sub2 aClass316_Sub2_6215;
    Class34[] aClass34Array6216;
    int anInt6217;
    private float[] aFloatArray6218;
    boolean aBoolean6219;
    private int anInt6220;
    private boolean aBoolean6221;
    boolean aBoolean6222;
    int anInt6223;
    float aFloat6224;
    int anInt6225;
    boolean aBoolean6226;
    int anInt6227;
    private int anInt6228;
    float[] aFloatArray6229;
    private float[] aFloatArray6230;
    private boolean aBoolean6231;
    private Interface21[] anInterface21Array6232;
    boolean aBoolean6233;
    Class31 aClass31_6234;
    boolean aBoolean6235;
    int anInt6236;
    Interface21 anInterface21_6237;
    private int anInt6238;
    boolean aBoolean6239;
    private float[] aFloatArray6240;
    private int anInt6241;
    private float aFloat6242;
    int anInt6243;
    float aFloat6244;
    private Stream aStream6245;
    int anInt6246;
    private Class299 aClass299_6247;
    Class5[] aClass5Array6248;
    float aFloat6249;
    int anInt6250;
    int anInt6251;
    boolean aBoolean6252;
    private Interface18_Impl1 anInterface18_Impl1_6253;
    Class162_Sub1 aClass162_Sub1_6254;
    Class162_Sub1 aClass162_Sub1_6255;
    private Interface18_Impl1 anInterface18_Impl1_6256;
    Class162_Sub1 aClass162_Sub1_6257;
    Class162_Sub1 aClass162_Sub1_6258;
    private Class238_Sub2 aClass238_Sub2_6259;
    Class162_Sub1 aClass162_Sub1_6260;
    Class162_Sub1 aClass162_Sub1_6261;
    private Class185 aClass185_6262;
    Class185 aClass185_6263;
    Class162_Sub1 aClass162_Sub1_6264;
    Class185 aClass185_6265;
    Class162_Sub1 aClass162_Sub1_6266;
    Class185 aClass185_6267;
    Class185 aClass185_6268;
    private Class185 aClass185_6269;
    private Class185 aClass185_6270;
    private Interface18_Impl1 anInterface18_Impl1_6271;
    private Interface18_Impl2 anInterface18_Impl2_6272;
    Class162_Sub1 aClass162_Sub1_6273;
    Class162_Sub1 aClass162_Sub1_6274;
    private int anInt6275;
    boolean aBoolean6276;

    final void method920(int i, boolean bool) {
        anInt5987++;
        if (i != 0)
            ((ha_Sub3) this).anInt5955 = 44;
        if (bool != ((ha_Sub3) this).aBoolean6222) {
            ((ha_Sub3) this).aBoolean6222 = bool;
            method971((byte) 119);
        }
    }

    final boolean s() {
        anInt6013++;
        return true;
    }

    abstract void method921(boolean bool);

    private final void method922(int i) {
        if (i == 8652) {
            ((ha_Sub3) this).aFloat6160 = (float) (-((ha_Sub3) this).anInt6166 + ((ha_Sub3) this).anInt6217);
            anInt5988++;
            ((ha_Sub3) this).aFloat6168 = (float) (((ha_Sub3) this).anInt6154 - ((ha_Sub3) this).anInt6166);
            ((ha_Sub3) this).aFloat6213 = (float) (((ha_Sub3) this).anInt6208 - ((ha_Sub3) this).anInt6246);
            ((ha_Sub3) this).aFloat6191 = (float) (((ha_Sub3) this).anInt6167 + -((ha_Sub3) this).anInt6246);
        }
    }

    final boolean v() {
        anInt5971++;
        return false;
    }

    void p() {
        if (!aBoolean6231) {
            for (Node node = aClass293_5956.method3119(2); node != null; node = aClass293_5956.method3107(-128))
                ((za_Sub1) node).method2689(-61);
            Enumeration enumeration = aHashtable5999.keys();
            while (enumeration.hasMoreElements()) {
                Canvas canvas = (Canvas) enumeration.nextElement();
                method1001(canvas, (byte) 125, aHashtable5999.get(canvas));
            }
            Class48.method372(false, true, (byte) 119);
            ((ha_Sub3) this).aNativeInterface5997.release();
            aBoolean6231 = true;
        }
        anInt6092++;
    }

    final void method923(boolean bool, int i) {
        if (bool == !((ha_Sub3) this).aBoolean6252) {
            ((ha_Sub3) this).aBoolean6252 = bool;
            method971((byte) 120);
            anInt6174 &= ~0x7;
        }
        anInt6103++;
        if (i != -8043)
            ((ha_Sub3) this).aFloatArray6182 = null;
    }

    abstract Interface18_Impl2 method924(int i, boolean bool);

    final void method925(int i) {
        if (((ha_Sub3) this).aClass34Array6216[((ha_Sub3) this).anInt6207] != Class341.aClass34_3971) {
            ((ha_Sub3) this).aClass34Array6216[((ha_Sub3) this).anInt6207] = Class341.aClass34_3971;
            ((ha_Sub3) this).aClass238_Sub2Array6169[((ha_Sub3) this).anInt6207].method1866();
            method953(1);
        }
        if (i <= -67)
            anInt5990++;
    }

    final Stream method926(byte i, Buffer buffer) {
        if (i != -20)
            method929(null, 39);
        aStream6245.a(buffer);
        anInt6109++;
        return aStream6245;
    }

    final float[] method927(boolean bool, float[] fs) {
        if (bool != true)
            return null;
        anInt5966++;
        fs[4] = ((ha_Sub3) this).aFloatArray6229[1];
        fs[12] = ((ha_Sub3) this).aFloatArray6229[3];
        fs[8] = ((ha_Sub3) this).aFloatArray6229[2];
        fs[0] = ((ha_Sub3) this).aFloatArray6229[0];
        fs[1] = ((ha_Sub3) this).aFloatArray6229[4];
        fs[13] = ((ha_Sub3) this).aFloatArray6229[7];
        fs[5] = ((ha_Sub3) this).aFloatArray6229[5];
        fs[2] = ((ha_Sub3) this).aFloatArray6229[8];
        fs[9] = ((ha_Sub3) this).aFloatArray6229[6];
        fs[10] = ((ha_Sub3) this).aFloatArray6229[10];
        fs[7] = ((ha_Sub3) this).aFloatArray6229[13];
        fs[3] = ((ha_Sub3) this).aFloatArray6229[12];
        fs[6] = ((ha_Sub3) this).aFloatArray6229[9];
        fs[14] = ((ha_Sub3) this).aFloatArray6229[11];
        fs[15] = ((ha_Sub3) this).aFloatArray6229[15];
        fs[11] = ((ha_Sub3) this).aFloatArray6229[14];
        return fs;
    }

    final void ZA(int i, float f, float f_0_, float f_1_, float f_2_, float f_3_) {
        anInt6014++;
        boolean bool = (anInt6241 ^ 0xffffffff) != (i ^ 0xffffffff);
        if (bool || f != ((ha_Sub3) this).aFloat6244 || ((ha_Sub3) this).aFloat6249 != f_0_) {
            anInt6241 = i;
            ((ha_Sub3) this).aFloat6249 = f_0_;
            ((ha_Sub3) this).aFloat6244 = f;
            if (bool) {
                ((ha_Sub3) this).aFloat6202 = (float) (0xff & anInt6241) / 255.0F;
                ((ha_Sub3) this).aFloat6224 = (float) (0xff00 & anInt6241) / 65280.0F;
                ((ha_Sub3) this).aFloat6185 = (float) (0xff0000 & anInt6241) / 1.671168E7F;
                method960(true);
            }
            ((ha_Sub3) this).aNativeInterface5997.setSunColour(((ha_Sub3) this).aFloat6185, ((ha_Sub3) this).aFloat6224, ((ha_Sub3) this).aFloat6202, f, f_0_);
            method997((byte) -98);
        }
        if (aFloatArray6183[0] != f_1_ || aFloatArray6183[1] != f_2_ || f_3_ != aFloatArray6183[2]) {
            aFloatArray6183[2] = f_3_;
            aFloatArray6183[1] = f_2_;
            aFloatArray6183[0] = f_1_;
            aFloatArray6163[2] = -f_3_;
            aFloatArray6163[1] = -f_2_;
            aFloatArray6163[0] = -f_1_;
            float f_4_ = (float) (1.0 / Math.sqrt((double) (f_2_ * f_2_ + f_1_ * f_1_ + f_3_ * f_3_)));
            ((ha_Sub3) this).aFloatArray6182[0] = f_1_ * f_4_;
            ((ha_Sub3) this).aFloatArray6182[1] = f_4_ * f_2_;
            ((ha_Sub3) this).aFloatArray6182[2] = f_4_ * f_3_;
            ((ha_Sub3) this).aFloatArray6195[1] = -((ha_Sub3) this).aFloatArray6182[1];
            ((ha_Sub3) this).aFloatArray6195[0] = -((ha_Sub3) this).aFloatArray6182[0];
            ((ha_Sub3) this).aFloatArray6195[2] = -((ha_Sub3) this).aFloatArray6182[2];
            ((ha_Sub3) this).aNativeInterface5997.setSunDirection(((ha_Sub3) this).aFloatArray6182[0], ((ha_Sub3) this).aFloatArray6182[1], ((ha_Sub3) this).aFloatArray6182[2]);
            method965((byte) -124);
            ((ha_Sub3) this).anInt6210 = (int) (256.0F * f_1_ / f_2_);
            ((ha_Sub3) this).anInt6176 = (int) (256.0F * f_3_ / f_2_);
        }
        method1045((byte) -56);
    }

    final s a(int i, int i_5_, int[][] is, int[][] is_6_, int i_7_, int i_8_, int i_9_) {
        anInt6068++;
        return new s_Sub3(this, i_8_, i_9_, i, i_5_, is, is_6_, i_7_);
    }

    abstract void method928(Canvas canvas, int i, Object object);

    final void method929(Interface21 interface21, int i) {
        if (interface21 != anInterface21Array6232[((ha_Sub3) this).anInt6207]) {
            anInterface21Array6232[((ha_Sub3) this).anInt6207] = interface21;
            if (interface21 == null)
                method1032(114);
            else
                interface21.method79(32073);
            anInt6174 &= ~0x1;
        }
        if (i == -8423)
            anInt5964++;
    }

    abstract void method930(boolean bool, int i, int i_10_, Class280 class280);

    final Class162 a(Class343 class343, int i, int i_11_, int i_12_, int i_13_) {
        anInt6012++;
        return new Class162_Sub1(this, class343, i, i_12_, i_13_, i_11_);
    }

    final Class129 a(int i, int i_14_, int i_15_, int i_16_, boolean bool) {
        anInt5968++;
        Class129_Sub2 class129_sub2 = new Class129_Sub2(this, i_15_, i_16_, bool);
        class129_sub2.method1184(0, 0, i_15_, i_16_, i, i_14_);
        return class129_sub2;
    }

    abstract void method931(int i, int i_17_, Interface18_Impl1 interface18_impl1);

    final Interface21_Impl2 method932(float[] fs, int i, boolean bool, Class264 class264, int i_18_, int i_19_) {
        if (i_18_ > -101)
            b(true);
        anInt6094++;
        return method944(i_19_, 0, bool, class264, 0, i, (byte) 72, fs);
    }

    abstract boolean method933(int i, Class228 class228, Class264 class264);

    abstract void method934(Class14 class14, int i, int i_20_, int i_21_);

    final NativeHeapBuffer method935(int i, boolean bool, byte i_22_) {
        anInt6033++;
        if (i_22_ != -35)
            return null;
        return ((ha_Sub3) this).aNativeHeap6059.a(i, bool);
    }

    final void a(Class316 class316) {
        anInt6076++;
        aClass316_Sub2_6215 = (Class316_Sub2) class316;
    }

    final void la() {
        ((ha_Sub3) this).anInt6167 = ((ha_Sub3) this).anInt5986;
        anInt6021++;
        ((ha_Sub3) this).anInt6154 = ((ha_Sub3) this).anInt5955;
        ((ha_Sub3) this).anInt6217 = 0;
        ((ha_Sub3) this).anInt6208 = 0;
        if (((ha_Sub3) this).aBoolean6276) {
            ((ha_Sub3) this).aBoolean6276 = false;
            method1026(-113);
        }
        method922(8652);
    }

    private final void method936(int i) {
        aBoolean6162 = false;
        anInt6040++;
        if (aClass340_6172 != null)
            aClass340_6172.method3438((byte) 124);
        method1015((byte) 107);
        if (i != 8)
            ((ha_Sub3) this).aBoolean6198 = true;
    }

    abstract void method937(byte i);

    abstract Interface21_Impl3 method938(byte i, boolean bool, int[][] is, int i_23_);

    final void xa(float f) {
        if (((ha_Sub3) this).aFloat6170 != f) {
            ((ha_Sub3) this).aFloat6170 = f;
            ((ha_Sub3) this).aNativeInterface5997.setAmbient(f);
            method960(true);
            method1045((byte) -120);
        }
        anInt6019++;
    }

    final void a(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, aa var_aa, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
        anInt6115++;
    }

    final void a(Canvas canvas) {
        anInt5958++;
        aCanvas5996 = null;
        anObject6008 = null;
        if (canvas != null && canvas != ((ha_Sub3) this).aCanvas5993) {
            if (aHashtable5999.containsKey(canvas)) {
                anObject6008 = aHashtable5999.get(canvas);
                aCanvas5996 = canvas;
            }
        } else {
            aCanvas5996 = ((ha_Sub3) this).aCanvas5993;
            anObject6008 = ((ha_Sub3) this).anObject6004;
        }
        if (aCanvas5996 == null || anObject6008 == null)
            throw new RuntimeException();
        method928(aCanvas5996, -1, anObject6008);
        method980(31388);
    }

    final void c(int i) {
        anInt6090++;
        if ((i ^ 0xffffffff) != -2)
            throw new IllegalArgumentException("");
    }

    void method939(int i) {
        anInt6028++;
        ((ha_Sub3) this).anInt6227 = ((ha_Sub3) this).anInt6189;
        ((ha_Sub3) this).anInt6189 = i;
    }

    abstract void method940(byte i);

    final void f(int i, int i_34_) {
        anInt6078++;
        if ((i ^ 0xffffffff) != (((ha_Sub3) this).anInt6173 ^ 0xffffffff) || (((ha_Sub3) this).anInt6164 ^ 0xffffffff) != (i_34_ ^ 0xffffffff)) {
            ((ha_Sub3) this).anInt6173 = i;
            ((ha_Sub3) this).anInt6164 = i_34_;
            method1042((byte) -74);
            method981(true);
            method1046(0);
        }
    }

    Class340 method941(int i, int i_35_) {
        anInt6077++;
        if (i_35_ != 6)
            ((ha_Sub3) this).anInt6214 = -77;
        int i_36_ = i;
        while_191_:
        do {
            while_190_:
            do {
                do {
                    if (i_36_ != 6) {
                        if (i_36_ != 1) {
                            if (i_36_ != 2) {
                                if (i_36_ != 7)
                                    break while_191_;
                            } else
                                break;
                            break while_190_;
                        }
                    } else
                        return new Class340_Sub10(this);
                    return new Class340_Sub6(this);
                } while (false);
                return new Class340_Sub5(this, ((ha_Sub3) this).aClass370_6127);
            } while (false);
            return new Class340_Sub2(this);
        } while (false);
        return new Class340_Sub3(this);
    }

    final void T(int i, int i_37_, int i_38_, int i_39_) {
        anInt6035++;
        boolean bool = false;
        if ((i ^ 0xffffffff) < (((ha_Sub3) this).anInt6208 ^ 0xffffffff)) {
            ((ha_Sub3) this).anInt6208 = i;
            bool = true;
        }
        if (i_38_ < ((ha_Sub3) this).anInt6167) {
            ((ha_Sub3) this).anInt6167 = i_38_;
            bool = true;
        }
        if (((ha_Sub3) this).anInt6217 < i_37_) {
            ((ha_Sub3) this).anInt6217 = i_37_;
            bool = true;
        }
        if ((((ha_Sub3) this).anInt6154 ^ 0xffffffff) < (i_39_ ^ 0xffffffff)) {
            ((ha_Sub3) this).anInt6154 = i_39_;
            bool = true;
        }
        if (bool) {
            if (!((ha_Sub3) this).aBoolean6276) {
                ((ha_Sub3) this).aBoolean6276 = true;
                method1026(99);
            }
            method1048(true);
            method922(8652);
        }
    }

    final void method942(int i, int i_40_) {
        anInt6048++;
        if (i_40_ != anInt6180) {
            boolean bool;
            Class17 class17;
            boolean bool_41_;
            if ((i_40_ ^ 0xffffffff) != -2) {
                if (i_40_ == 2) {
                    bool = false;
                    bool_41_ = true;
                    class17 = Class330.aClass17_3854;
                } else if ((i_40_ ^ 0xffffffff) != -129) {
                    class17 = Class25.aClass17_342;
                    bool = false;
                    bool_41_ = false;
                } else {
                    bool_41_ = true;
                    bool = true;
                    class17 = Node_Sub9_Sub1.aClass17_9105;
                }
            } else {
                bool = true;
                class17 = Class337.aClass17_3932;
                bool_41_ = true;
            }
            if (!bool == ((ha_Sub3) this).aBoolean6226) {
                ((ha_Sub3) this).aBoolean6226 = bool;
                method1030(i ^ 0xf5);
            }
            if (((ha_Sub3) this).aBoolean6198 == !bool_41_) {
                ((ha_Sub3) this).aBoolean6198 = bool_41_;
                method947(true);
            }
            if (class17 != ((ha_Sub3) this).aClass17_6194) {
                ((ha_Sub3) this).aClass17_6194 = class17;
                method1038(false);
            }
            anInt6180 = i_40_;
            anInt6174 &= ~0x1c;
        }
        if (i != -129)
            method1048(true);
    }

    final boolean j() {
        anInt6132++;
        return false;
    }

    abstract void method943(int i);

    final void b(Canvas canvas) {
        anInt5989++;
        if (((ha_Sub3) this).aCanvas5993 == canvas)
            throw new RuntimeException();
        if (aHashtable5999.containsKey(canvas)) {
            method1001(canvas, (byte) 90, aHashtable5999.get(canvas));
            aHashtable5999.remove(canvas);
        }
    }

    final int E() {
        anInt6086++;
        return (((ha_Sub3) this).anInt6143 + (((ha_Sub3) this).anInt6140 - -((ha_Sub3) this).anInt6139));
    }

    final int b(int i, int i_42_) {
        anInt6146++;
        return i_42_ ^ i & i_42_;
    }

    final void U(int i, int i_43_, int i_44_, int i_45_, int i_46_) {
        anInt6009++;
        a(i, i_43_, i_44_ + i, i_43_, i_45_, i_46_);
    }

    final void C(boolean bool) {
        anInt5998++;
        ((ha_Sub3) this).aBoolean6188 = bool;
        method975(-96);
    }

    final void a(za var_za) {
        anInt6126++;
        ((ha_Sub3) this).aNativeHeap6059 = ((za_Sub1) (za_Sub1) var_za).aNativeHeap9798;
        ((ha_Sub3) this).aNativeHeapBuffer6062 = ((ha_Sub3) this).aNativeHeap6059.a(32768, false);
    }

    abstract Interface21_Impl2 method944(int i, int i_47_, boolean bool, Class264 class264, int i_48_, int i_49_, byte i_50_, float[] fs);

    final void za(int i, int i_51_, int i_52_, int i_53_, int i_54_) {
        method991(20719);
        anInt5976++;
        method976(i_53_, false);
        method946(0, 51, Class380.aClass280_4649);
        method951(Class380.aClass280_4649, (byte) 83, 0);
        method942(-129, i_54_);
        ((ha_Sub3) this).aClass238_Sub2_6141.method1898((float) i_52_, (float) i_52_, 1.0F, (byte) -49);
        ((ha_Sub3) this).aClass238_Sub2_6141.method1862(i, i_51_, 0);
        method948(58);
        method1000(false, -127);
        method931(0, 8, anInterface18_Impl1_6253);
        method1004(aClass185_6262, (byte) -15);
        method934(Class14.aClass14_264, 256, 0, 0);
        method1000(true, -119);
        method951(Class147.aClass280_1738, (byte) 125, 0);
        method946(0, -117, Class147.aClass280_1738);
    }

    final void method945(Class238_Sub2 class238_sub2, int i) {
        ((ha_Sub3) this).aClass238_Sub2_6141.method1868(class238_sub2);
        anInt6091++;
        if (i < 126)
            aClass299_6247 = null;
        ((ha_Sub3) this).aBoolean6138 = false;
        method989(38);
    }

    final void method946(int i, int i_55_, Class280 class280) {
        anInt6137++;
        int i_56_ = -102 / ((-13 - i_55_) / 32);
        method1017(-8980, i, class280, false, false);
    }

    abstract void method947(boolean bool);

    final void b(boolean bool) {
        anInt5992++;
    }

    final void method948(int i) {
        if (i <= 38)
            method948(64);
        anInt6038++;
        ((ha_Sub3) this).aBoolean6138 = false;
        method989(-114);
    }

    final void a(int[] is) {
        anInt6095++;
        is[0] = ((ha_Sub3) this).anInt5986;
        is[1] = ((ha_Sub3) this).anInt5955;
    }

    private final void method949(boolean bool) {
        anInt6026++;
        if (bool != true)
            a(-66);
        if (!aBoolean6178) {
            float[] fs = aFloatArray6240;
            aBoolean6178 = true;
            if ((((ha_Sub3) this).anInt5986 ^ 0xffffffff) != -1 && ((ha_Sub3) this).anInt5955 != 0) {
                fs[11] = 0.0F;
                fs[15] = 1.0F;
                fs[4] = 0.0F;
                fs[14] = 0.5F;
                fs[1] = 0.0F;
                fs[9] = 0.0F;
                fs[13] = 1.0F;
                fs[8] = 0.0F;
                fs[12] = -1.0F;
                fs[2] = 0.0F;
                fs[7] = 0.0F;
                fs[6] = 0.0F;
                fs[0] = 2.0F / (float) ((ha_Sub3) this).anInt5986;
                fs[3] = 0.0F;
                fs[5] = -2.0F / (float) ((ha_Sub3) this).anInt5955;
                fs[10] = 0.5F;
            } else {
                fs[0] = 1.0F;
                fs[2] = 0.0F;
                fs[7] = 0.0F;
                fs[13] = 0.0F;
                fs[1] = 0.0F;
                fs[5] = 1.0F;
                fs[6] = 0.0F;
                fs[9] = 0.0F;
                fs[10] = 1.0F;
                fs[15] = 1.0F;
                fs[14] = 0.0F;
                fs[8] = 0.0F;
                fs[12] = 0.0F;
                fs[3] = 0.0F;
                fs[4] = 0.0F;
                fs[11] = 0.0F;
            }
        }
    }

    final boolean l() {
        anInt6032++;
        return true;
    }

    final void method950(byte i, boolean bool) {
        if (i != 36)
            ((ha_Sub3) this).aBoolean6188 = false;
        if (!((ha_Sub3) this).aBoolean6219 != !bool) {
            ((ha_Sub3) this).aBoolean6219 = bool;
            method975(-120);
            anInt6174 &= ~0x1f;
        }
        anInt6017++;
    }

    final void method951(Class280 class280, byte i, int i_57_) {
        if (i > 81) {
            anInt5960++;
            method930(false, i_57_, 0, class280);
        }
    }

    final Class238_Sub2 method952(int i) {
        anInt6051++;
        if (i != -24720)
            return null;
        return ((ha_Sub3) this).aClass238_Sub2_6141;
    }

    private final void method953(int i) {
        anInt5953++;
        if (i != 1)
            aClass238_Sub2_6150 = null;
        method982(-128);
        if (aClass340_6172 != null)
            aClass340_6172.method3431(4095);
    }

    final int r() {
        anInt6142++;
        return ((ha_Sub3) this).anInt6192 - 2;
    }

    abstract void method954(byte i);

    final void a(int i, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_) {
        anInt6096++;
        float f = (float) -i + (float) i_59_;
        float f_64_ = (float) i_60_ - (float) i_58_;
        float f_65_ = 0.0F;
        float f_66_ = 1.0F;
        if (f != 0.0F || f_64_ != 0.0F) {
            f_66_ = (float) Math.sqrt((double) (f * f + f_64_ * f_64_));
            f_65_ = (float) Math.atan2((double) f_64_, (double) f);
        }
        method991(20719);
        method976(i_61_, false);
        method946(0, 116, Class380.aClass280_4649);
        method951(Class380.aClass280_4649, (byte) 114, 0);
        method942(-129, i_63_);
        ((ha_Sub3) this).aClass238_Sub2_6141.method1898((float) i_62_, f_66_, 1.0F, (byte) -49);
        ((ha_Sub3) this).aClass238_Sub2_6141.method1862(0, -i_62_ / 2, 0);
        ((ha_Sub3) this).aClass238_Sub2_6141.method1872(0x3fff & (int) (2607.5945876176133 * (double) f_65_));
        ((ha_Sub3) this).aClass238_Sub2_6141.method1862(i, i_58_, 0);
        method948(121);
        method1000(false, -120);
        method986(-27);
        method1000(true, -117);
        method951(Class147.aClass280_1738, (byte) 88, 0);
        method946(0, -84, Class147.aClass280_1738);
    }

    final void method955(byte i, Class5 class5, Class5 class5_67_) {
        anInt6120++;
        boolean bool = false;
        if (class5_67_ != ((ha_Sub3) this).aClass5Array6179[((ha_Sub3) this).anInt6207]) {
            ((ha_Sub3) this).aClass5Array6179[((ha_Sub3) this).anInt6207] = class5_67_;
            method1037(false);
            bool = true;
        }
        if (i <= 39)
            aFloatArray6183 = null;
        if (((ha_Sub3) this).aClass5Array6248[((ha_Sub3) this).anInt6207] != class5) {
            ((ha_Sub3) this).aClass5Array6248[((ha_Sub3) this).anInt6207] = class5;
            method1051((byte) 125);
            bool = true;
        }
        if (bool)
            anInt6174 &= ~0x1d;
    }

    abstract Interface21_Impl2 method956(int i, int[] is, int i_68_, boolean bool, int i_69_, int i_70_, int i_71_);

    private final void method957(byte i) {
        ((ha_Sub3) this).aFloat6159 = (float) ((ha_Sub3) this).anInt6164;
        if (i == 12)
            anInt6135++;
    }

    final Class238_Sub2 method958(int i) {
        anInt6055++;
        if (i <= 16)
            anInterface18_Impl1_6271 = null;
        return aClass238_Sub2_6150;
    }

    abstract float method959(int i);

    final int M() {
        anInt5965++;
        return anInt6275;
    }

    final void da(int i, int i_72_, int i_73_, int[] is) {
        anInt6043++;
        float f = ((ha_Sub3) this).aClass238_Sub2_6147.method1884((byte) -114, (float) i, (float) i_72_, (float) i_73_);
        int i_74_;
        int i_75_;
        if (!(f < -0.0078125F) && !(f > 0.0078125F)) {
            i_75_ = ((ha_Sub3) this).anInt6166;
            i_74_ = ((ha_Sub3) this).anInt6246;
        } else {
            i_74_ = (int) ((float) ((ha_Sub3) this).anInt6196 * (((ha_Sub3) this).aClass238_Sub2_6147.method1895((float) i_73_, (float) i_72_, (float) i, 15)) / f);
            i_75_ = (int) ((float) ((ha_Sub3) this).anInt6243 * (((ha_Sub3) this).aClass238_Sub2_6147.method1878((float) i, false, (float) i_72_, (float) i_73_)) / f);
        }
        is[1] = (int) (-((ha_Sub3) this).aFloat6160 + (float) i_75_);
        is[0] = (int) ((float) i_74_ - ((ha_Sub3) this).aFloat6213);
        is[2] = (int) f;
    }

    abstract void method960(boolean bool);

    final void a(int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_) {
        anInt6130++;
        float f = (float) i_77_ - (float) i;
        float f_81_ = (float) i_78_ - (float) i_76_;
        if (f == 0.0F && f_81_ == 0.0F)
            f = 1.0F;
        else {
            float f_82_ = (float) (1.0 / Math.sqrt((double) (f * f + f_81_ * f_81_)));
            f *= f_82_;
            f_81_ *= f_82_;
        }
        if (method1008((float) i_76_, (float) i, f_81_ + (float) i_78_, -1, f + (float) i_77_, 0.0F, 0.0F)) {
            method991(20719);
            method976(i_79_, false);
            method946(0, 71, Class380.aClass280_4649);
            method951(Class380.aClass280_4649, (byte) 111, 0);
            method942(-129, i_80_);
            method1003(22551);
            method1000(false, -123);
            method987((byte) 100);
            method1000(true, -127);
            method951(Class147.aClass280_1738, (byte) 95, 0);
            method946(0, 112, Class147.aClass280_1738);
        }
    }

    final Class129 a(Class157 class157, boolean bool) {
        anInt6000++;
        Class129 class129;
        if ((((Class157) class157).anInt1873 ^ 0xffffffff) != -1 && (((Class157) class157).anInt1874 ^ 0xffffffff) != -1) {
            int[] is = new int[(((Class157) class157).anInt1874 * ((Class157) class157).anInt1873)];
            int i = 0;
            int i_83_ = 0;
            if (((Class157) class157).aByteArray1875 != null) {
                for (int i_84_ = 0; ((((Class157) class157).anInt1874 ^ 0xffffffff) < (i_84_ ^ 0xffffffff)); i_84_++) {
                    for (int i_85_ = 0; ((((Class157) class157).anInt1873 ^ 0xffffffff) < (i_85_ ^ 0xffffffff)); i_85_++) {
                        is[i_83_++] = (Class358.retrieveLooksSettings((((Class157) class157).aByteArray1875[i] << 528514264), (((Class157) class157).anIntArray1872[Class112.method794(255, (((Class157) class157).aByteArray1868[i]))])));
                        i++;
                    }
                }
            } else {
                for (int i_86_ = 0; i_86_ < ((Class157) class157).anInt1874; i_86_++) {
                    for (int i_87_ = 0; i_87_ < ((Class157) class157).anInt1873; i_87_++) {
                        int i_88_ = (((Class157) class157).anIntArray1872[(((Class157) class157).aByteArray1868[i++] & 0xff)]);
                        is[i_83_++] = ((i_88_ ^ 0xffffffff) != -1 ? Class358.retrieveLooksSettings(i_88_, -16777216) : 0);
                    }
                }
            }
            class129 = this.method813(((Class157) class157).anInt1874, (byte) 99, ((Class157) class157).anInt1873, is, 0, ((Class157) class157).anInt1873);
        } else
            class129 = this.method813(1, (byte) 99, 1, new int[1], 0, 1);
        class129.method1165(((Class157) class157).anInt1869, ((Class157) class157).anInt1876, ((Class157) class157).anInt1871, ((Class157) class157).anInt1870);
        return class129;
    }

    final Interface18_Impl2 method961(byte i, int i_89_) {
        if ((i_89_ * 2 ^ 0xffffffff) < (anInterface18_Impl2_6272.method57(-1) ^ 0xffffffff))
            anInterface18_Impl2_6272.method48(i_89_, (byte) 102);
        int i_90_ = -73 % ((i - -36) / 62);
        anInt6110++;
        return anInterface18_Impl2_6272;
    }

    final Class129 a(int i, int i_91_, boolean bool) {
        anInt5977++;
        return new Class129_Sub2(this, i, i_91_, bool);
    }

    final boolean m() {
        anInt6102++;
        return true;
    }

    final void method962(int i, int i_92_, boolean bool, boolean bool_93_) {
        if (i != anInt6201 || ((ha_Sub3) this).aBoolean6181 != aBoolean6161) {
            Interface21_Impl2 interface21_impl2 = null;
            int i_94_ = 0;
            byte i_95_ = 0;
            int i_96_ = 0;
            byte i_97_ = !((ha_Sub3) this).aBoolean6181 ? (byte) 0 : (byte) 3;
            if ((i ^ 0xffffffff) > -1)
                method925(-69);
            else {
                interface21_impl2 = aClass299_6247.method3177(i, (byte) -125);
                Class312 class312 = ((ha) this).aD1414.method25(i, (byte) 126);
                if (((Class312) class312).aByte3643 == 0 && (((Class312) class312).aByte3642 ^ 0xffffffff) == -1)
                    method925(-124);
                else {
                    int i_98_ = ((Class312) class312).aBoolean3636 ? 64 : 128;
                    int i_99_ = i_98_ * 50;
                    Class238_Sub2 class238_sub2 = method1022(0);
                    class238_sub2.method1879((byte) 85, 0.0F, ((float) (((ha_Sub3) this).anInt6187 % i_99_ * ((Class312) class312).aByte3643) / (float) i_99_), ((float) (((ha_Sub3) this).anInt6187 % i_99_ * ((Class312) class312).aByte3642) / (float) i_99_));
                    method984(3, Node_Sub14_Sub16.aClass34_9338);
                }
                i_94_ = ((Class312) class312).anInt3633;
                if (!((ha_Sub3) this).aBoolean6181) {
                    i_96_ = ((Class312) class312).anInt3645;
                    i_97_ = ((Class312) class312).aByte3624;
                    i_95_ = ((Class312) class312).aByte3646;
                }
            }
            method985(i_95_, i_97_, -10, i_96_, bool_93_, bool);
            if (aClass340_6172 == null) {
                method929(interface21_impl2, -8423);
                method993((byte) 118, i_94_);
            } else
                aClass340_6172.method3442(interface21_impl2, i_94_, (byte) 116);
            aBoolean6161 = ((ha_Sub3) this).aBoolean6181;
            anInt6201 = i;
        }
        if (i_92_ < 1)
            anInt6085 = -5;
        anInt6058++;
        anInt6174 &= ~0x7;
    }

    final void a(Class338 class338, int i) {
        aClass59_6212.method461(this, class338, i, 0);
        anInt6030++;
    }

    final int method963(int i) {
        if (i != 128)
            ((ha_Sub3) this).aClass238_Sub2_6149 = null;
        anInt6036++;
        return ((ha_Sub3) this).anInt6207;
    }

    final void e(int i) {
        anInt6049++;
    }

    private final void method964(int i, Class14 class14, int i_100_) {
        method931(0, 8, anInterface18_Impl1_6271);
        anInt6015++;
        method1004(aClass185_6270, (byte) -15);
        method934(class14, i_100_, i, 0);
    }

    final boolean n() {
        anInt6087++;
        return aClass340Array6203[3].method3432(4095);
    }

    final void h(int i) {
        anInt6133++;
    }

    abstract void method965(byte i);

    private final void method966(int i) {
        if (i != 2963)
            anInt6201 = 111;
        anInt6121++;
        if (Class227.aClass31_2563 != ((ha_Sub3) this).aClass31_6234) {
            Class31 class31 = ((ha_Sub3) this).aClass31_6234;
            ((ha_Sub3) this).aClass31_6234 = Class227.aClass31_2563;
            if (class31.method268((byte) 0))
                method936(8);
            method949(true);
            ((ha_Sub3) this).aFloatArray6229 = aFloatArray6240;
            method1034((byte) -93);
            anInt6174 &= ~0x18;
        }
    }

    abstract Interface21_Impl2 method967(int i, Class264 class264, int i_101_, int i_102_, Class228 class228);

    private final void method968(int i) {
        anInt6063++;
        anInterface18_Impl1_6256 = method1010(105, true);
        anInterface18_Impl1_6256.method2(i, -30987, 24);
        aClass185_6269 = method1005((byte) 79, (new Class194[]{new Class194(Class89.aClass89_1097)}));
    }

    abstract void method969(int i);

    private final void method970(boolean bool) {
        aFloatArray6155[14] = aFloat6242;
        anInt5969++;
        aFloatArray6155[10] = aFloat6175;
        ((ha_Sub3) this).aFloat6197 = ((aFloatArray6155[14] - (float) ((ha_Sub3) this).anInt6164) / aFloatArray6155[10]);
        if (bool != true)
            method1040(-13, (byte) -71);
    }

    abstract void method971(byte i);

    final void KA(int i, int i_103_, int i_104_, int i_105_) {
        anInt6039++;
        if (i <= 0 && (((ha_Sub3) this).anInt5986 - 1 ^ 0xffffffff) >= (i_104_ ^ 0xffffffff) && i_103_ <= 0 && i_105_ >= ((ha_Sub3) this).anInt5955 + -1)
            la();
        else {
            ((ha_Sub3) this).anInt6217 = (i_103_ ^ 0xffffffff) > -1 ? 0 : i_103_;
            ((ha_Sub3) this).anInt6208 = i < 0 ? 0 : i;
            ((ha_Sub3) this).anInt6154 = i_105_ > ((ha_Sub3) this).anInt5986 ? 0 : i_105_;
            ((ha_Sub3) this).anInt6167 = ((((ha_Sub3) this).anInt5986 ^ 0xffffffff) <= (i_104_ ^ 0xffffffff) ? i_104_ : 0);
            if (!((ha_Sub3) this).aBoolean6276) {
                ((ha_Sub3) this).aBoolean6276 = true;
                method1026(-116);
            }
            method1048(true);
            method922(8652);
        }
    }

    final Interface21_Impl2 method972(byte[] is, int i, int i_106_, Class264 class264, int i_107_, boolean bool) {
        anInt6066++;
        if (i != 0)
            c(17);
        return method996(0, bool, i_106_, 0, is, class264, i_107_, -98);
    }

    final int i() {
        anInt6022++;
        return ((ha_Sub3) this).anInt6173;
    }

    final void a(int i, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_) {
        anInt6050++;
        float f = (float) -i + (float) i_109_;
        float f_116_ = (float) i_110_ - (float) i_108_;
        if (f == 0.0F && f_116_ == 0.0F)
            f = 1.0F;
        else {
            float f_117_ = (float) (1.0 / Math.sqrt((double) (f * f + f_116_ * f_116_)));
            f_116_ *= f_117_;
            f *= f_117_;
        }
        method991(20719);
        method976(i_111_, false);
        method946(0, 111, Class380.aClass280_4649);
        method951(Class380.aClass280_4649, (byte) 120, 0);
        method942(-129, i_112_);
        method1003(22551);
        i_115_ %= i_113_ + i_114_;
        method1000(false, -124);
        float f_118_ = f * (float) i_113_;
        float f_119_ = f_116_ * (float) i_113_;
        float f_120_ = 0.0F;
        float f_121_ = 0.0F;
        float f_122_ = f_118_;
        float f_123_ = f_119_;
        if ((i_113_ ^ 0xffffffff) > (i_115_ ^ 0xffffffff)) {
            f_121_ = (float) (i_113_ + (i_114_ + -i_115_)) * f_116_;
            f_120_ = (float) (-i_115_ + (i_113_ - -i_114_)) * f;
        } else {
            f_123_ = f_116_ * (float) (i_113_ - i_115_);
            f_122_ = (float) (i_113_ + -i_115_) * f;
        }
        float f_124_ = (float) i + f_120_;
        float f_125_ = f_121_ + (float) i_108_;
        float f_126_ = f * (float) i_114_;
        float f_127_ = (float) i_114_ * f_116_;
        for (; ; ) {
            if ((i ^ 0xffffffff) <= (i_109_ ^ 0xffffffff)) {
                if (f_124_ < (float) i_109_)
                    break;
                if (f_124_ + f_122_ < (float) i_109_)
                    f_122_ = (float) i_109_ - f_124_;
            } else {
                if (f_124_ > (float) i_109_)
                    break;
                if ((float) i_109_ < f_124_ + f_122_)
                    f_122_ = (float) i_109_ - f_124_;
            }
            if (i_110_ > i_108_) {
                if ((float) i_110_ < f_125_)
                    break;
                if ((float) i_110_ < f_125_ + f_123_)
                    f_123_ = -f_125_ + (float) i_110_;
            } else {
                if (f_125_ < (float) i_110_)
                    break;
                if ((float) i_110_ > f_125_ + f_123_)
                    f_123_ = (float) i_110_ - f_125_;
            }
            if (!method1008(f_125_, f_124_, f_123_ + f_125_, -1, f_122_ + f_124_, 0.0F, 0.0F))
                return;
            f_124_ += f_122_ + f_126_;
            method987((byte) 53);
            f_125_ += f_127_ + f_123_;
            f_123_ = f_119_;
            f_122_ = f_118_;
        }
        method1000(true, -124);
        method951(Class147.aClass280_1738, (byte) 121, 0);
        method946(0, -52, Class147.aClass280_1738);
    }

    final Class238_Sub2 method973(boolean bool) {
        anInt6024++;
        if (bool != true)
            ra(57, -64, 94, 79);
        return ((ha_Sub3) this).aClass238_Sub2_6149;
    }

    final Interface21_Impl3 method974(int i) {
        anInt6072++;
        if (i != 0)
            method999(43, null);
        if (aClass316_Sub2_6215 == null)
            return null;
        return aClass316_Sub2_6215.method3303((byte) -122);
    }

    final void H(int i, int i_128_, int i_129_, int[] is) {
        anInt5980++;
        float f = ((ha_Sub3) this).aClass238_Sub2_6147.method1884((byte) -74, (float) i, (float) i_128_, (float) i_129_);
        int i_130_;
        int i_131_;
        if (f < -0.0078125F || f > 0.0078125F) {
            i_131_ = (int) ((float) ((ha_Sub3) this).anInt6196 * (((ha_Sub3) this).aClass238_Sub2_6147.method1895((float) i_129_, (float) i_128_, (float) i, 15)) / f);
            i_130_ = (int) ((float) ((ha_Sub3) this).anInt6243 * (((ha_Sub3) this).aClass238_Sub2_6147.method1878((float) i, false, (float) i_128_, (float) i_129_)) / f);
        } else {
            i_130_ = ((ha_Sub3) this).anInt6166;
            i_131_ = ((ha_Sub3) this).anInt6246;
        }
        is[2] = (int) f;
        is[1] = (int) (-((ha_Sub3) this).aFloat6160 + (float) i_130_);
        is[0] = (int) ((float) i_131_ - ((ha_Sub3) this).aFloat6213);
    }

    abstract void method975(int i);

    final void pa() {
        ((ha_Sub3) this).aBoolean6181 = false;
        anInt6047++;
    }

    final void c(int i, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_) {
        anInt6011++;
        float f = method959(-101);
        method991(20719);
        method976(i_135_, false);
        method946(0, 94, Class380.aClass280_4649);
        method951(Class380.aClass280_4649, (byte) 118, 0);
        method942(-129, i_136_);
        ((ha_Sub3) this).aClass238_Sub2_6141.method1898((float) (-1 + i_134_), (float) (i_133_ - 1), 1.0F, (byte) -49);
        ((ha_Sub3) this).aClass238_Sub2_6141.method1885(-f + (float) i, 0.0F, -f + (float) i_132_, 13);
        method948(49);
        method1000(false, -119);
        method964(0, Class214.aClass14_2470, 4);
        method1000(true, -126);
        method951(Class147.aClass280_1738, (byte) 102, 0);
        method946(0, 92, Class147.aClass280_1738);
    }

    final void x() {
        if (aClass299_6247 != null)
            aClass299_6247.method3179(1000);
        anInt6073++;
    }

    final void method976(int i, boolean bool) {
        if ((i ^ 0xffffffff) != (((ha_Sub3) this).anInt6204 ^ 0xffffffff)) {
            ((ha_Sub3) this).anInt6204 = i;
            method954((byte) -105);
        }
        anInt6117++;
        if (bool != false)
            method948(-34);
    }

    final void method977(float f, int i) {
        if (f != aFloat6205) {
            aFloat6205 = f;
            method981(true);
        }
        int i_137_ = 24 / ((-13 - i) / 44);
        anInt6037++;
    }

    final int method978(int i) {
        if (i != -31039)
            s();
        anInt6016++;
        return anInt6220;
    }

    final Class238_Sub2 method979(byte i) {
        anInt6027++;
        if (i != 114)
            return null;
        return (((ha_Sub3) this).aClass238_Sub2Array6169[((ha_Sub3) this).anInt6207]);
    }

    final int JA(int i, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_) {
        anInt6145++;
        int i_143_ = 0;
        float f = ((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6754) * (float) i_139_ + ((float) i * ((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6728 + ((float) i_138_ * (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6744))) + (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6706));
        if (f < 1.0F)
            f = 1.0F;
        float f_144_ = ((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6754) * (float) i_142_ + (((float) i_141_ * (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6744)) + ((float) i_140_ * (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6728))) + (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6706));
        if (f_144_ < 1.0F)
            f_144_ = 1.0F;
        if (!(f < (float) ((ha_Sub3) this).anInt6173) || !((float) ((ha_Sub3) this).anInt6173 > f_144_)) {
            if (f > (float) ((ha_Sub3) this).anInt6164 && f_144_ > (float) ((ha_Sub3) this).anInt6164)
                i_143_ |= 0x20;
        } else
            i_143_ |= 0x10;
        int i_145_ = (int) ((float) ((ha_Sub3) this).anInt6196 * ((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6733) + ((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6711 * (float) i) + (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6750 * (float) i_138_) + ((float) i_139_ * (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6726)))) / f);
        int i_146_ = (int) (((float) i_142_ * (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6726) + (((float) i_141_ * ((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6750) + ((float) i_140_ * (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6711))) + (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6733)) * (float) ((ha_Sub3) this).anInt6196 / f_144_);
        if ((float) i_145_ < ((ha_Sub3) this).aFloat6213 && (float) i_146_ < ((ha_Sub3) this).aFloat6213)
            i_143_ |= 0x1;
        else if ((float) i_145_ > ((ha_Sub3) this).aFloat6191 && (float) i_146_ > ((ha_Sub3) this).aFloat6191)
            i_143_ |= 0x2;
        int i_147_ = (int) (((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6715) + (((float) i_138_ * ((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6737) + (float) i * (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6713) + (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6724 * (float) i_139_))) * (float) ((ha_Sub3) this).anInt6243 / f);
        int i_148_ = (int) ((float) ((ha_Sub3) this).anInt6243 * ((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6724) * (float) i_142_ + ((float) i_141_ * ((Class238_Sub2) (((ha_Sub3) this).aClass238_Sub2_6147)).aFloat6737 + (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6713 * (float) i_140_)) + ((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6715) / f_144_);
        if (((ha_Sub3) this).aFloat6160 > (float) i_147_ && (float) i_148_ < ((ha_Sub3) this).aFloat6160)
            i_143_ |= 0x4;
        else if (((ha_Sub3) this).aFloat6168 < (float) i_147_ && (float) i_148_ > ((ha_Sub3) this).aFloat6168)
            i_143_ |= 0x8;
        return i_143_;
    }

    private final void method980(int i) {
        if (aCanvas5996 == null)
            anInt6057 = anInt6085 = 1;
        else {
            Dimension dimension = aCanvas5996.getSize();
            anInt6057 = dimension.width;
            anInt6085 = dimension.height;
        }
        anInt6010++;
        if (i == 31388) {
            ((ha_Sub3) this).anInt5986 = anInt6057;
            ((ha_Sub3) this).anInt5955 = anInt6085;
            method1012((byte) 18);
            method1042((byte) -35);
            method981(true);
            method969(26588);
            method922(8652);
            method998(-23496);
            la();
        }
    }

    private final void method981(boolean bool) {
        aBoolean6221 = false;
        anInt5995++;
        method983(bool);
        if (((ha_Sub3) this).aClass31_6234 == Class210.aClass31_2428)
            method1034((byte) -83);
    }

    abstract void method982(int i);

    final void a(int i, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_) {
        anInt6067++;
    }

    private final void method983(boolean bool) {
        anInt6084++;
        if (bool != true)
            ((ha_Sub3) this).anInt6176 = 51;
        if (!aBoolean6221) {
            float[] fs = aFloatArray6218;
            float f = (float) ((ha_Sub3) this).anInt6173;
            float f_161_ = (float) ((ha_Sub3) this).anInt6164;
            float f_162_ = ((float) -((ha_Sub3) this).anInt6166 * aFloat6205 / (float) ((ha_Sub3) this).anInt6243);
            float f_163_ = (aFloat6205 * (float) -((ha_Sub3) this).anInt6246 / (float) ((ha_Sub3) this).anInt6196);
            float f_164_ = (aFloat6205 * (float) (-((ha_Sub3) this).anInt6246 + ((ha_Sub3) this).anInt5986) / (float) ((ha_Sub3) this).anInt6196);
            float f_165_ = (aFloat6205 * (float) (((ha_Sub3) this).anInt5955 - ((ha_Sub3) this).anInt6166) / (float) ((ha_Sub3) this).anInt6243);
            if (f_164_ == f_163_ || f_165_ == f_162_) {
                fs[13] = 0.0F;
                fs[5] = 1.0F;
                fs[11] = 0.0F;
                fs[7] = 0.0F;
                fs[15] = 1.0F;
                fs[1] = 0.0F;
                fs[6] = 0.0F;
                fs[14] = 0.0F;
                fs[2] = 0.0F;
                fs[9] = 0.0F;
                fs[3] = 0.0F;
                fs[10] = 1.0F;
                fs[12] = 0.0F;
                fs[0] = 1.0F;
                fs[4] = 0.0F;
                fs[8] = 0.0F;
            } else {
                fs[14] = f / (-f_161_ + f);
                fs[11] = 0.0F;
                fs[7] = 0.0F;
                fs[2] = 0.0F;
                fs[12] = (f_164_ + f_163_) / (f_163_ - f_164_);
                fs[4] = 0.0F;
                fs[5] = 2.0F / (-f_162_ + f_165_);
                fs[13] = (f_162_ + f_165_) / (f_165_ - f_162_);
                fs[10] = 1.0F / (f - f_161_);
                fs[3] = 0.0F;
                fs[8] = 0.0F;
                fs[15] = 1.0F;
                fs[6] = 0.0F;
                fs[0] = 2.0F / (f_164_ - f_163_);
                fs[1] = 0.0F;
                fs[9] = 0.0F;
            }
            method957((byte) 12);
            aBoolean6221 = true;
        }
    }

    final int c(int i, int i_166_) {
        anInt6075++;
        return i | i_166_;
    }

    final void method984(int i, Class34 class34) {
        ((ha_Sub3) this).aClass34Array6216[((ha_Sub3) this).anInt6207] = class34;
        if (i != 3)
            method1016('v', 102, -113);
        anInt5991++;
        method953(1);
    }

    final boolean a() {
        anInt6114++;
        return false;
    }

    private final void method985(int i, int i_167_, int i_168_, int i_169_, boolean bool, boolean bool_170_) {
        anInt6070++;
        bool_170_ &= n();
        if (!bool_170_ && ((i_167_ ^ 0xffffffff) == -5 || i_167_ == 8 || (i_167_ ^ 0xffffffff) == -10)) {
            i_167_ = 2;
            i_169_ = i_167_ != 4 ? 1 : i & 0x1;
            i = 0;
        }
        if (i_167_ != 0 && bool)
            i_167_ |= ~0x7fffffff;
        if (i_168_ != -10)
            ((ha_Sub3) this).aClass31_6234 = null;
        if ((anInt6152 ^ 0xffffffff) == (i_167_ ^ 0xffffffff)) {
            if ((anInt6152 ^ 0xffffffff) != -1) {
                aClass340Array6203[0x7fffffff & anInt6152].method3435(bool, 122);
                if (i != anInt6200 || (i_169_ ^ 0xffffffff) != (anInt6199 ^ 0xffffffff)) {
                    aClass340Array6203[anInt6152 & 0x7fffffff].method3433(i_168_ + -26417, i, i_169_);
                    anInt6199 = i_169_;
                    anInt6200 = i;
                }
            }
        } else {
            if ((anInt6152 ^ 0xffffffff) != -1)
                aClass340Array6203[0x7fffffff & anInt6152].method3441(true);
            if (i_167_ != 0) {
                aClass340_6172 = aClass340Array6203[0x7fffffff & i_167_];
                aClass340_6172.method3443(true, bool);
                aClass340_6172.method3435(bool, 114);
                aClass340_6172.method3433(-26427, i, i_169_);
            } else
                aClass340_6172 = null;
            anInt6152 = i_167_;
            anInt6200 = i;
            anInt6199 = i_169_;
        }
    }

    final void method986(int i) {
        method964(0, Class14.aClass14_264, 2);
        int i_171_ = -89 / ((-83 - i) / 33);
        anInt6082++;
    }

    private final void method987(byte i) {
        if (i > 31) {
            method931(0, 8, anInterface18_Impl1_6256);
            anInt6113++;
            method1004(aClass185_6269, (byte) -15);
            method934(Class107.aClass14_1355, 1, 0, 0);
        }
    }

    final Viewport e() {
        anInt6107++;
        return new Class238_Sub2();
    }

    final void method988(boolean bool) {
        anInt6046++;
        ((ha_Sub3) this).aClass238_Sub2Array6169 = new Class238_Sub2[((ha_Sub3) this).anInt6236];
        ((ha_Sub3) this).aClass5Array6179 = new Class5[((ha_Sub3) this).anInt6236];
        anInterface21Array6232 = new Interface21[((ha_Sub3) this).anInt6236];
        ((ha_Sub3) this).aClass5Array6248 = new Class5[((ha_Sub3) this).anInt6236];
        ((ha_Sub3) this).aClass34Array6216 = new Class34[((ha_Sub3) this).anInt6236];
        for (int i = 0; ((ha_Sub3) this).anInt6236 > i; i++) {
            ((ha_Sub3) this).aClass5Array6248[i] = Class60.aClass5_821;
            ((ha_Sub3) this).aClass5Array6179[i] = Class60.aClass5_821;
            ((ha_Sub3) this).aClass34Array6216[i] = Class341.aClass34_3971;
            ((ha_Sub3) this).aClass238_Sub2Array6169[i] = new Class238_Sub2();
        }
        ((ha_Sub3) this).aClass248_Sub42Array6165 = new Node_Sub42[-2 + ((ha_Sub3) this).anInt6192];
        ((ha_Sub3) this).anInterface21_6237 = method967(1, Class120.aClass264_1508, -65, 1, Class228.aClass228_2573);
        a(new za_Sub1(262144));
        ((ha_Sub3) this).aClass185_6268 = method1005((byte) -122, (new Class194[]{new Class194(new Class89[]{Class89.aClass89_1097, Class89.aClass89_1101})}));
        ((ha_Sub3) this).aClass185_6263 = method1005((byte) -120, (new Class194[]{new Class194(new Class89[]{Class89.aClass89_1097, Class89.aClass89_1099})}));
        ((ha_Sub3) this).aClass185_6265 = method1005((byte) 30, (new Class194[]{new Class194(Class89.aClass89_1097), new Class194(Class89.aClass89_1099), new Class194(Class89.aClass89_1101), new Class194(Class89.aClass89_1098)}));
        ((ha_Sub3) this).aClass185_6267 = method1005((byte) -120, (new Class194[]{new Class194(Class89.aClass89_1097), new Class194(Class89.aClass89_1099), new Class194(Class89.aClass89_1101)}));
        ((ha_Sub3) this).aClass162_Sub1_6260 = new Class162_Sub1(this, 0, 0, false, false);
        ((ha_Sub3) this).aClass162_Sub1_6266 = new Class162_Sub1(this, 0, 0, true, true);
        ((ha_Sub3) this).aClass162_Sub1_6258 = new Class162_Sub1(this, 0, 0, false, false);
        ((ha_Sub3) this).aClass162_Sub1_6264 = new Class162_Sub1(this, 0, 0, true, true);
        ((ha_Sub3) this).aClass162_Sub1_6274 = new Class162_Sub1(this, 0, 0, false, false);
        ((ha_Sub3) this).aClass162_Sub1_6255 = new Class162_Sub1(this, 0, 0, true, true);
        ((ha_Sub3) this).aClass162_Sub1_6261 = new Class162_Sub1(this, 0, 0, false, false);
        ((ha_Sub3) this).aClass162_Sub1_6254 = new Class162_Sub1(this, 0, 0, true, true);
        ((ha_Sub3) this).aClass162_Sub1_6257 = new Class162_Sub1(this, 0, 0, false, bool);
        ((ha_Sub3) this).aClass162_Sub1_6273 = new Class162_Sub1(this, 0, 0, true, true);
        aClass59_6212 = new Class59(this);
        anInterface18_Impl2_6272 = method924(-23469, true);
        method1054(-43);
        ((ha_Sub3) this).aClass370_6127 = new Class370(this);
        aClass340Array6203[1] = method941(1, 6);
        aClass340Array6203[2] = method941(2, 6);
        aClass340Array6203[4] = method941(4, 6);
        aClass340Array6203[5] = method941(5, 6);
        aClass340Array6203[6] = method941(6, 6);
        aClass340Array6203[7] = method941(7, 6);
        aClass340Array6203[3] = method941(3, 6);
        aClass340Array6203[8] = method941(8, 6);
        aClass340Array6203[9] = method941(9, 6);
        if (!aClass340Array6203[2].method3432(4095))
            aClass340Array6203[2] = method941(0, 6);
        if (!aClass340Array6203[4].method3432(4095))
            aClass340Array6203[4] = aClass340Array6203[2];
        if (!aClass340Array6203[8].method3432(4095))
            aClass340Array6203[8] = aClass340Array6203[4];
        if (!aClass340Array6203[9].method3432(4095))
            aClass340Array6203[9] = aClass340Array6203[8];
        method1013(101);
        la();
        this.h();
    }

    private final void method989(int i) {
        anInt6071++;
        if (((ha_Sub3) this).aClass31_6234 == Class227.aClass31_2563) {
            float f = method959(-91);
            ((ha_Sub3) this).aClass238_Sub2_6141.method1885(f, 0.0F, f, 13);
        }
        aBoolean6162 = false;
        method1049(true);
        int i_172_ = -7 % ((i - -71) / 41);
        if (aClass340_6172 != null)
            aClass340_6172.method3436(3);
    }

    final void HA(int i, int i_173_, int i_174_, int i_175_, int[] is) {
        anInt6025++;
        float f = ((ha_Sub3) this).aClass238_Sub2_6147.method1884((byte) -111, (float) i, (float) i_173_, (float) i_174_);
        if ((float) ((ha_Sub3) this).anInt6173 > f || f > (float) ((ha_Sub3) this).anInt6164)
            is[0] = is[1] = is[2] = -1;
        else {
            int i_176_ = (int) ((float) ((ha_Sub3) this).anInt6196 * (((ha_Sub3) this).aClass238_Sub2_6147.method1895((float) i_174_, (float) i_173_, (float) i, 15)) / (float) i_175_);
            int i_177_ = (int) ((float) ((ha_Sub3) this).anInt6243 * (((ha_Sub3) this).aClass238_Sub2_6147.method1878((float) i, false, (float) i_173_, (float) i_174_)) / (float) i_175_);
            is[1] = (int) (-((ha_Sub3) this).aFloat6160 + (float) i_177_);
            is[2] = (int) f;
            is[0] = (int) (-((ha_Sub3) this).aFloat6213 + (float) i_176_);
        }
    }

    final void method990(int i) {
        if ((anInt6174 ^ 0xffffffff) != -5) {
            method966(2963);
            method994(11073, false);
            method923(false, -8043);
            method1029(false, 23394);
            method950((byte) 36, false);
            method962(-2, 18, false, false);
            method942(-129, 1);
            method993((byte) 115, 0);
            anInt6174 = 4;
        }
        if (i == 1)
            anInt6125++;
    }

    final boolean A() {
        anInt6098++;
        return ((ha_Sub3) this).aBoolean6177;
    }

    private final void method991(int i) {
        if (i != 20719)
            aBoolean6162 = true;
        anInt6061++;
        if (anInt6174 != 1) {
            method966(2963);
            method994(11073, false);
            method923(false, -8043);
            method1029(false, 23394);
            method950((byte) 36, false);
            method962(-2, 62, false, false);
            method993((byte) 121, 1);
            method929(((ha_Sub3) this).anInterface21_6237, -8423);
            anInt6174 = 1;
        }
    }

    void j(int i) {
        if (aClass299_6247 != null)
            aClass299_6247.method3178(5);
        anInt6144++;
        ((ha_Sub3) this).anInt6187 = i & 0x7fffffff;
    }

    private final void method992(int i) {
        if (!aBoolean6157) {
            float[] fs = aFloatArray6155;
            float f = ((float) (-((ha_Sub3) this).anInt6246 * ((ha_Sub3) this).anInt6173) / (float) ((ha_Sub3) this).anInt6196);
            float f_178_ = ((float) (((ha_Sub3) this).anInt6173 * (-((ha_Sub3) this).anInt6246 + ((ha_Sub3) this).anInt5986)) / (float) ((ha_Sub3) this).anInt6196);
            float f_179_ = ((float) (((ha_Sub3) this).anInt6173 * ((ha_Sub3) this).anInt6166) / (float) ((ha_Sub3) this).anInt6243);
            float f_180_ = ((float) (((ha_Sub3) this).anInt6173 * (-((ha_Sub3) this).anInt5955 + ((ha_Sub3) this).anInt6166)) / (float) ((ha_Sub3) this).anInt6243);
            if (f != f_178_ && f_180_ != f_179_) {
                float f_181_ = (float) ((ha_Sub3) this).anInt6173 * 2.0F;
                fs[15] = 0.0F;
                fs[3] = 0.0F;
                fs[0] = f_181_ / (f_178_ - f);
                fs[5] = f_181_ / (f_179_ - f_180_);
                fs[1] = 0.0F;
                fs[10] = aFloat6175 = ((float) ((ha_Sub3) this).anInt6164 / (float) (-((ha_Sub3) this).anInt6164 + ((ha_Sub3) this).anInt6173));
                fs[2] = 0.0F;
                fs[4] = 0.0F;
                fs[6] = 0.0F;
                fs[13] = 0.0F;
                fs[11] = -1.0F;
                fs[14] = aFloat6242 = ((float) (((ha_Sub3) this).anInt6164 * ((ha_Sub3) this).anInt6173) / (float) (((ha_Sub3) this).anInt6173 - ((ha_Sub3) this).anInt6164));
                fs[7] = 0.0F;
                fs[8] = (f_178_ + f) / (f_178_ - f);
                fs[9] = (f_180_ + f_179_) / (f_179_ - f_180_);
                fs[12] = 0.0F;
            } else {
                fs[4] = 0.0F;
                fs[8] = 0.0F;
                fs[5] = 1.0F;
                fs[7] = 0.0F;
                fs[9] = 0.0F;
                fs[11] = 0.0F;
                fs[12] = 0.0F;
                fs[15] = 1.0F;
                fs[1] = 0.0F;
                fs[6] = 0.0F;
                fs[14] = 0.0F;
                fs[0] = 1.0F;
                fs[10] = 1.0F;
                fs[13] = 0.0F;
                fs[2] = 0.0F;
                fs[3] = 0.0F;
            }
            method970(true);
            aBoolean6157 = true;
        }
        anInt5979++;
        if (i >= -12)
            aBoolean6162 = true;
    }

    final void method993(byte i, int i_182_) {
        if (i >= 102) {
            if (i_182_ != 1) {
                if ((i_182_ ^ 0xffffffff) != -1) {
                    if (i_182_ != 2) {
                        if (i_182_ == 3)
                            method955((byte) 106, Class60.aClass5_821, Class346_Sub4.aClass5_8272);
                        else if ((i_182_ ^ 0xffffffff) == -5)
                            method955((byte) 46, Class46.aClass5_583, Class46.aClass5_583);
                    } else
                        method955((byte) 64, Class142.aClass5_1669, Class316_Sub1_Sub2.aClass5_9850);
                } else
                    method955((byte) 76, Class60.aClass5_821, Class60.aClass5_821);
            } else
                method955((byte) 43, Class142.aClass5_1669, Class142.aClass5_1669);
            anInt6054++;
        }
    }

    final Class129 a(int[] is, int i, int i_183_, int i_184_, int i_185_, boolean bool) {
        anInt6053++;
        return new Class129_Sub2(this, i_184_, i_185_, is, i, i_183_);
    }

    final void method994(int i, boolean bool) {
        if (i != 11073)
            ((ha_Sub3) this).aClass185_6263 = null;
        anInt6042++;
        if (bool != ((ha_Sub3) this).aBoolean6235) {
            ((ha_Sub3) this).aBoolean6235 = bool;
            method921(true);
            anInt6174 &= ~0x1f;
        }
    }

    final void method995(byte i, byte i_186_) {
        method976(i_186_ | (i_186_ << -661318872 | (i_186_ << -778402952 | i_186_ << 1226949840)), false);
        anInt6052++;
        if (i <= 56)
            ((ha_Sub3) this).aFloat6244 = 0.8756865F;
    }

    abstract Interface21_Impl2 method996(int i, boolean bool, int i_187_, int i_188_, byte[] is, Class264 class264, int i_189_, int i_190_);

    abstract void method997(byte i);

    final void method998(int i) {
        if (i == -23496) {
            anInt5975++;
            if (Class334.aClass31_3905 != ((ha_Sub3) this).aClass31_6234) {
                Class31 class31 = ((ha_Sub3) this).aClass31_6234;
                ((ha_Sub3) this).aClass31_6234 = Class334.aClass31_3905;
                if (class31.method268((byte) 0))
                    method936(8);
                ((ha_Sub3) this).aFloatArray6229 = aFloatArray6230;
                anInt6174 &= ~0x1f;
            }
        }
    }

    abstract void method999(int i, Class181 class181);

    abstract void method1000(boolean bool, int i);

    abstract void method1001(Canvas canvas, byte i, Object object);

    final void a(int i, Node_Sub42[] class248_sub42s) {
        for (int i_191_ = 0; i_191_ < i; i_191_++)
            ((ha_Sub3) this).aClass248_Sub42Array6165[i_191_] = class248_sub42s[i_191_];
        anInt6097++;
        ((ha_Sub3) this).anInt6189 = i;
        if (((ha_Sub3) this).aClass31_6234.method268((byte) 0))
            method939(0);
    }

    final int method1002(int i) {
        anInt6069++;
        if (i < 53)
            method1027(-2);
        return anInt6238;
    }

    final void EA(int i, int i_192_, int i_193_, int i_194_) {
        anInt5963++;
        if (!((ha_Sub3) this).aBoolean6181)
            throw new RuntimeException("");
        anInt6238 = i_192_;
        anInt6228 = i;
        anInt6220 = i_194_;
        anInt6184 = i_193_;
        if (aBoolean6161) {
            aClass340Array6203[3].method3439((byte) 117);
            aClass340Array6203[3].method3437(true);
        }
    }

    final void method1003(int i) {
        ((ha_Sub3) this).aClass238_Sub2_6141.method1866();
        anInt6116++;
        ((ha_Sub3) this).aBoolean6138 = true;
        if (i != 22551)
            method925(116);
        method989(i ^ 0x583e);
    }

    abstract void method1004(Class185 class185, byte i);

    abstract Class185 method1005(byte i, Class194[] class194s);

    abstract void method1006(Interface18_Impl2 interface18_impl2, Class14 class14, int i, int i_195_, int i_196_, int i_197_, int i_198_);

    abstract void method1007(Object object, Canvas canvas, int i);

    private final boolean method1008(float f, float f_199_, float f_200_, int i, float f_201_, float f_202_, float f_203_) {
        anInt6023++;
        if (i != -1)
            return false;
        Buffer buffer = anInterface18_Impl1_6256.method1(-4448, true);
        if (buffer == null)
            return false;
        Stream stream = method926((byte) -20, buffer);
        if (Stream.b()) {
            stream.a(f_199_);
            stream.a(f);
            stream.a(f_202_);
            stream.a(f_201_);
            stream.a(f_200_);
            stream.a(f_203_);
        } else {
            stream.b(f_199_);
            stream.b(f);
            stream.b(f_202_);
            stream.b(f_201_);
            stream.b(f_200_);
            stream.b(f_203_);
        }
        stream.a();
        return anInterface18_Impl1_6256.method4(-13472);
    }

    final void a(Viewport viewport) {
        ((ha_Sub3) this).aClass238_Sub2_6147 = (Class238_Sub2) viewport;
        anInt6129++;
        ((ha_Sub3) this).aClass238_Sub2_6149.method1868(((ha_Sub3) this).aClass238_Sub2_6147);
        ((ha_Sub3) this).aClass238_Sub2_6149.method1889(1);
        aClass238_Sub2_6150.method1896((byte) 125, ((ha_Sub3) this).aClass238_Sub2_6149);
        ((ha_Sub3) this).aClass238_Sub2_6148.method1896((byte) 74, ((ha_Sub3) this).aClass238_Sub2_6147);
        if (((ha_Sub3) this).aClass31_6234.method268((byte) 0))
            method936(8);
    }

    final void g(int i) {
        anInt6031++;
    }

    final float[] method1009(int i) {
        anInt6041++;
        if (i < 63)
            b(95, -102);
        return aFloatArray6230;
    }

    final void a(Class338 class338) {
        aClass59_6212.method461(this, class338, -1, 0);
        anInt6080++;
    }

    abstract Interface18_Impl1 method1010(int i, boolean bool);

    final Viewport t() {
        anInt6105++;
        return ((ha_Sub3) this).aClass238_Sub2_6147;
    }

    abstract Interface21_Impl1 method1011(int i, int i_204_, byte[] is, Class264 class264, int i_205_, int i_206_);

    private final void method1012(byte i) {
        anInt6044++;
        aBoolean6178 = false;
        if (i != 18)
            method1015((byte) -92);
        if (Class227.aClass31_2563 == ((ha_Sub3) this).aClass31_6234) {
            method949(true);
            method1034((byte) -91);
        }
    }

    void method1013(int i) {
        anInt5970++;
        method1028(-814);
        if (i < 77)
            XA();
    }

    final int[] Y() {
        anInt6064++;
        return (new int[]{((ha_Sub3) this).anInt6246, ((ha_Sub3) this).anInt6166, ((ha_Sub3) this).anInt6196, ((ha_Sub3) this).anInt6243});
    }

    final void method1014(byte i, boolean bool) {
        anInt5972++;
        int i_207_ = -67 / ((i - -34) / 45);
        if (!((ha_Sub3) this).aBoolean6209 != !bool) {
            ((ha_Sub3) this).aBoolean6209 = bool;
            method921(true);
        }
    }

    abstract void method1015(byte i);

    static final char method1016(char c, int i, int i_208_) {
        if (i != 0)
            return '\uff98';
        anInt6119++;
        if ((c ^ 0xffffffff) <= -193 && (c ^ 0xffffffff) >= -256) {
            if ((c ^ 0xffffffff) <= -193 && (c ^ 0xffffffff) >= -199)
                return 'A';
            if (c == 199)
                return 'C';
            if ((c ^ 0xffffffff) <= -201 && c <= 203)
                return 'E';
            if (c >= 204 && (c ^ 0xffffffff) >= -208)
                return 'I';
            if (c >= 210 && c <= 214)
                return 'O';
            if (c >= 217 && (c ^ 0xffffffff) >= -221)
                return 'U';
            if ((c ^ 0xffffffff) == -222)
                return 'Y';
            if ((c ^ 0xffffffff) == -224)
                return 's';
            if ((c ^ 0xffffffff) <= -225 && c <= 230)
                return 'a';
            if ((c ^ 0xffffffff) == -232)
                return 'c';
            if (c >= 232 && (c ^ 0xffffffff) >= -236)
                return 'e';
            if ((c ^ 0xffffffff) <= -237 && c <= 239)
                return 'i';
            if ((c ^ 0xffffffff) <= -243 && c <= 246)
                return 'o';
            if (c >= 249 && c <= 252)
                return 'u';
            if (c == 253 || c == 255)
                return 'y';
        }
        if ((c ^ 0xffffffff) == -339)
            return 'O';
        if ((c ^ 0xffffffff) == -340)
            return 'o';
        if ((c ^ 0xffffffff) == -377)
            return 'Y';
        return c;
    }

    abstract void method1017(int i, int i_209_, Class280 class280, boolean bool, boolean bool_210_);

    final boolean d() {
        anInt6100++;
        return true;
    }

    public static void method1018(int i) {
        aIncommingOpcode_6045 = null;
        if (i != 3584)
            method1018(-79);
    }

    final boolean f() {
        anInt5981++;
        return true;
    }

    final Class238_Sub2 method1019(byte i) {
        anInt5967++;
        if (!aBoolean6162) {
            aClass238_Sub2_6151.method1900((((ha_Sub3) this).aClass238_Sub2_6149), (((ha_Sub3) this).aClass238_Sub2_6141));
            aBoolean6162 = true;
        }
        if (i < 5)
            ((ha_Sub3) this).aNativeHeap6059 = null;
        return aClass238_Sub2_6151;
    }

    private final void method1020(byte i) {
        anInterface18_Impl1_6253 = method1010(106, false);
        anInt6118++;
        anInterface18_Impl1_6253.method2(12, -30987, 3096);
        int i_211_ = 0;
        int i_212_ = -105 / ((30 - i) / 48);
        for (/**/; i_211_ < 4; i_211_++) {
            Buffer buffer = anInterface18_Impl1_6253.method1(-4448, true);
            if (buffer != null) {
                Stream stream = method926((byte) -20, buffer);
                stream.a(0.0F);
                stream.a(0.0F);
                stream.a(0.0F);
                for (int i_213_ = 0; i_213_ <= 256; i_213_++) {
                    double d = 3.141592653589793 * (double) (i_213_ * 2) / 256.0;
                    float f = (float) Math.cos(d);
                    float f_214_ = (float) Math.sin(d);
                    if (Stream.b()) {
                        stream.a(f_214_);
                        stream.a(f);
                        stream.a(0.0F);
                    } else {
                        stream.b(f_214_);
                        stream.b(f);
                        stream.b(0.0F);
                    }
                }
                stream.a();
                if (anInterface18_Impl1_6253.method4(-13472))
                    break;
            }
        }
        aClass185_6262 = method1005((byte) -128, (new Class194[]{new Class194(Class89.aClass89_1097)}));
    }

    abstract void method1021(byte i, int i_215_);

    final void b(Canvas canvas, int i, int i_216_) {
        anInt6093++;
        Object object = null;
        if (canvas != null && ((ha_Sub3) this).aCanvas5993 != canvas) {
            if (aHashtable5999.containsKey(canvas))
                object = aHashtable5999.get(canvas);
        } else
            object = anObject6008;
        if (object == null)
            throw new RuntimeException();
        method1007(object, canvas, 117);
        if (aCanvas5996 == canvas)
            method980(31388);
    }

    final Class238_Sub2 method1022(int i) {
        anInt5954++;
        if (i != 0)
            anInt6201 = 51;
        return (((ha_Sub3) this).aClass238_Sub2Array6169[((ha_Sub3) this).anInt6207]);
    }

    abstract Object method1023(byte i, Canvas canvas);

    final void method1024(byte i, boolean bool) {
        if (i < 52)
            ((ha_Sub3) this).aFloatArray6195 = null;
        anInt5983++;
        if (bool != ((ha_Sub3) this).aBoolean6186) {
            ((ha_Sub3) this).aBoolean6186 = bool;
            method940((byte) 126);
        }
    }

    final void X(int i) {
        anInt6083++;
        ((ha_Sub3) this).anInt6156 = 0;
        for (/**/; i > 1; i >>= 1)
            ((ha_Sub3) this).anInt6156++;
        ((ha_Sub3) this).anInt6193 = 1 << ((ha_Sub3) this).anInt6156;
    }

    final void method1025(int i) {
        if (i != 6)
            ((ha_Sub3) this).anInterface21_6237 = null;
        method998(-23496);
        anInt6079++;
        method1034((byte) -90);
    }

    final Class316 d(int i, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_) {
        anInt5978++;
        return new Class316_Sub2_Sub1(this, i, i_217_, i_218_, i_219_, i_220_, i_221_);
    }

    abstract void method1026(int i);

    final void aa(int i, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_) {
        anInt6122++;
        method991(20719);
        method976(i_225_, false);
        method946(0, 26, Class380.aClass280_4649);
        method951(Class380.aClass280_4649, (byte) 115, 0);
        method942(-129, i_226_);
        ((ha_Sub3) this).aClass238_Sub2_6141.method1898((float) i_224_, (float) i_223_, 1.0F, (byte) -49);
        ((ha_Sub3) this).aClass238_Sub2_6141.method1862(i, i_222_, 0);
        method948(68);
        method1000(false, -127);
        method986(64);
        method1000(true, -123);
        method951(Class147.aClass280_1738, (byte) 95, 0);
        method946(0, -77, Class147.aClass280_1738);
    }

    final Node_Sub42 a(int i, int i_227_, int i_228_, int i_229_, int i_230_, float f) {
        anInt5962++;
        return new Node_Sub42_Sub3(i, i_227_, i_228_, i_229_, i_230_, f);
    }

    final za a(int i) {
        anInt5961++;
        za_Sub1 var_za_Sub1 = new za_Sub1(i);
        aClass293_5956.method3109(var_za_Sub1, -106);
        return var_za_Sub1;
    }

    final void method1027(int i) {
        anInt6104++;
        Enumeration enumeration = aHashtable5999.keys();
        while (enumeration.hasMoreElements()) {
            Canvas canvas = (Canvas) enumeration.nextElement();
            method1001(canvas, (byte) 115, aHashtable5999.get(canvas));
        }
        anInterface18_Impl1_6271.method3(false);
        anInterface18_Impl1_6256.method3(false);
        anInterface18_Impl1_6253.method3(false);
        ((ha_Sub3) this).aClass162_Sub1_6266.method1460(13783);
        int i_231_ = 55 / ((-49 - i) / 61);
        ((ha_Sub3) this).aClass162_Sub1_6264.method1460(13783);
        ((ha_Sub3) this).aClass162_Sub1_6255.method1460(13783);
        ((ha_Sub3) this).aClass162_Sub1_6254.method1460(13783);
        ((ha_Sub3) this).aClass162_Sub1_6273.method1460(13783);
        aClass59_6212.method468((byte) -127);
        anInterface18_Impl2_6272.method3(false);
    }

    ha_Sub3(Canvas canvas, Object object, d var_d, Class381 class381, int i, int i_232_) {
        super(var_d);
        ((ha_Sub3) this).anInt6167 = 0;
        ((ha_Sub3) this).anInt6154 = 0;
        ((ha_Sub3) this).aBoolean6198 = true;
        aFloatArray6163 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
        ((ha_Sub3) this).aBoolean6188 = true;
        ((ha_Sub3) this).aFloat6197 = 3584.0F;
        aFloatArray6155 = new float[16];
        aBoolean6162 = false;
        aBoolean6161 = false;
        anInt6180 = 1;
        anInt6184 = -1;
        ((ha_Sub3) this).aFloat6170 = 1.0F;
        ((ha_Sub3) this).aBoolean6186 = true;
        ((ha_Sub3) this).anInt6214 = -1;
        anInt6199 = 0;
        aBoolean6178 = false;
        ((ha_Sub3) this).aFloatArray6182 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
        ((ha_Sub3) this).anInt6153 = 128;
        aFloatArray6218 = new float[16];
        ((ha_Sub3) this).aFloat6185 = 1.0F;
        aClass340Array6203 = new Class340[10];
        ((ha_Sub3) this).anInt6208 = 0;
        anInt6200 = 0;
        ((ha_Sub3) this).aBoolean6226 = true;
        aBoolean6221 = false;
        ((ha_Sub3) this).anInt6223 = 0;
        ((ha_Sub3) this).aBoolean6222 = false;
        ((ha_Sub3) this).anInt6207 = 0;
        ((ha_Sub3) this).aFloatArray6195 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
        ((ha_Sub3) this).aBoolean6211 = false;
        ((ha_Sub3) this).aClass17_6194 = Class337.aClass17_3932;
        ((ha_Sub3) this).anInt6225 = 0;
        aFloatArray6183 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
        anInt6220 = 0;
        ((ha_Sub3) this).anInt6156 = 3;
        ((ha_Sub3) this).aClass31_6234 = Class334.aClass31_3905;
        ((ha_Sub3) this).anInt6166 = 0;
        ((ha_Sub3) this).anInt6217 = 0;
        ((ha_Sub3) this).aBoolean6209 = true;
        ((ha_Sub3) this).aFloat6159 = 3584.0F;
        ((ha_Sub3) this).anInt6193 = 8;
        ((ha_Sub3) this).anInt6196 = 512;
        anInt6241 = 16777215;
        aBoolean6231 = false;
        aFloatArray6240 = new float[16];
        ((ha_Sub3) this).aBoolean6219 = false;
        ((ha_Sub3) this).anInt6243 = 512;
        ((ha_Sub3) this).aFloat6244 = -1.0F;
        aFloat6205 = 1.0F;
        aFloatArray6230 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        anInt6238 = -1;
        ((ha_Sub3) this).aFloatArray6229 = aFloatArray6230;
        anInt6201 = -1;
        ((ha_Sub3) this).aFloat6202 = 1.0F;
        ((ha_Sub3) this).aFloat6249 = -1.0F;
        ((ha_Sub3) this).anInt6250 = 0;
        ((ha_Sub3) this).aBoolean6252 = false;
        ((ha_Sub3) this).anInt6246 = 0;
        ((ha_Sub3) this).aFloat6224 = 1.0F;
        aStream6245 = new Stream();
        aClass238_Sub2_6259 = new Class238_Sub2();
        try {
            anObject6008 = ((ha_Sub3) this).anObject6004 = object;
            ((ha_Sub3) this).aClass381_6108 = class381;
            aCanvas5996 = ((ha_Sub3) this).aCanvas5993 = canvas;
            ((ha_Sub3) this).anInt6206 = i;
            Dimension dimension = canvas.getSize();
            ((ha_Sub3) this).anInt5986 = anInt6057 = dimension.width;
            ((ha_Sub3) this).anInt5955 = anInt6085 = dimension.height;
            ((ha_Sub3) this).anInt6251 = i_232_;
            Class48.method361(false, true, true);
            if (((ha) this).aD1414 == null) {
                ((ha_Sub3) this).aNativeInterface5997 = new NativeInterface(0, ((ha_Sub3) this).anInt6251);
                aClass299_6247 = null;
            } else {
                aClass299_6247 = new Class299(this, ((ha) this).aD1414);
                ((ha_Sub3) this).aNativeInterface5997 = new NativeInterface(((ha) this).aD1414.method26(31363), ((ha_Sub3) this).anInt6251);
                for (int i_233_ = 0; ((((ha) this).aD1414.method26(31363) ^ 0xffffffff) < (i_233_ ^ 0xffffffff)); i_233_++) {
                    Class312 class312 = ((ha) this).aD1414.method25(i_233_, (byte) 125);
                    if (class312 != null)
                        ((ha_Sub3) this).aNativeInterface5997.initTextureMetrics(i_233_, ((Class312) class312).aByte3630, ((Class312) class312).aByte3625);
                }
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.method819(32);
            throw new RuntimeException("");
        }
    }

    final void a(Canvas canvas, int i, int i_234_) {
        anInt6002++;
        if (((ha_Sub3) this).aCanvas5993 == canvas)
            throw new RuntimeException();
        if (!aHashtable5999.containsKey(canvas)) {
            if (!canvas.isShowing())
                throw new RuntimeException();
            try {
                Class var_class = Class.forName("java.awt.Canvas");
                Method method = var_class.getMethod("setIgnoreRepaint", new Class[]{Boolean.TYPE});
                method.invoke(canvas, new Object[]{Boolean.TRUE});
            } catch (Exception exception) {
                /* empty */
            }
            Object object = method1023((byte) 3, canvas);
            if (object == null)
                throw new RuntimeException();
            aHashtable5999.put(canvas, object);
        }
    }

    private final void method1028(int i) {
        anInt6136++;
        method960(true);
        method997((byte) -115);
        method971((byte) 118);
        method939(i + 814);
        method965((byte) -124);
        method1045((byte) -32);
        method940((byte) 120);
        method943(i ^ ~0x1644);
        method975(i + 732);
        method921(true);
        method1041(16);
        if (i != -814)
            ((ha_Sub3) this).anInt6173 = -19;
        method947(true);
        method1038(false);
        method1030(106);
        for (int i_235_ = ((ha_Sub3) this).anInt6236 - 1; i_235_ >= 0; i_235_--) {
            method1040(i_235_, (byte) -65);
            method1037(false);
            method1051((byte) 119);
            method925(-72);
        }
        method954((byte) -116);
        method969(26588);
        method937((byte) 119);
        method1049(true);
        method1015((byte) 107);
    }

    final void method1029(boolean bool, int i) {
        if (i != 23394)
            ((ha_Sub3) this).anInt6167 = 60;
        if (!bool != !((ha_Sub3) this).aBoolean6211) {
            ((ha_Sub3) this).aBoolean6211 = bool;
            method943(5481);
            anInt6174 &= ~0x1f;
        }
        anInt6101++;
    }

    abstract void method1030(int i);

    final void method1031(boolean bool) {
        if (bool != true)
            ((ha_Sub3) this).aClass162_Sub1_6260 = null;
        anInt5982++;
        if (anInt6174 != 2) {
            method966(2963);
            method994(11073, false);
            method923(false, -8043);
            method1029(false, 23394);
            method950((byte) 36, false);
            method962(-2, 119, false, false);
            anInt6174 = 2;
        }
    }

    abstract void method1032(int i);

    final boolean b() {
        anInt6056++;
        return true;
    }

    final Interface21_Impl2 method1033(int i, int[] is, byte i_236_, boolean bool, int i_237_) {
        anInt6007++;
        if (i_236_ >= -32)
            aClass59_6212 = null;
        return method956(0, is, i, bool, 0, i_237_, -71);
    }

    private final void method1034(byte i) {
        int i_238_ = -108 / ((i - 20) / 63);
        method937((byte) 118);
        anInt6123++;
        if (aClass340_6172 != null)
            aClass340_6172.method3444(4095);
    }

    final int method1035(int i) {
        anInt6134++;
        if (i >= -87)
            ((ha_Sub3) this).aClass185_6265 = null;
        return anInt6184;
    }

    final void K(int[] is) {
        is[0] = ((ha_Sub3) this).anInt6208;
        is[3] = ((ha_Sub3) this).anInt6154;
        is[2] = ((ha_Sub3) this).anInt6167;
        anInt5959++;
        is[1] = ((ha_Sub3) this).anInt6217;
    }

    final void P(int i, int i_239_, int i_240_, int i_241_, int i_242_) {
        a(i, i_239_, i, i_239_ + i_240_, i_241_, i_242_);
        anInt6081++;
    }

    final void Q(int i, int i_243_, int i_244_, int i_245_, int i_246_, int i_247_, byte[] is, int i_248_, int i_249_) {
        anInt6034++;
    }

    private final void method1036(int i) {
        if (((ha_Sub3) this).aClass31_6234 != Node_Sub14_Sub39.aClass31_9598) {
            Class31 class31 = ((ha_Sub3) this).aClass31_6234;
            ((ha_Sub3) this).aClass31_6234 = Node_Sub14_Sub39.aClass31_9598;
            if (!class31.method268((byte) 0))
                method936(8);
            method992(-85);
            ((ha_Sub3) this).aFloatArray6229 = aFloatArray6155;
            method1034((byte) -108);
            anInt6174 &= ~0x7;
        }
        if (i == -8)
            anInt6001++;
    }

    abstract void method1037(boolean bool);

    abstract void method1038(boolean bool);

    abstract void method1039(byte i);

    final void method1040(int i, byte i_250_) {
        anInt5985++;
        if (i != ((ha_Sub3) this).anInt6207) {
            ((ha_Sub3) this).anInt6207 = i;
            method1039((byte) -13);
        }
        if (i_250_ != -65)
            method984(-67, null);
    }

    abstract void method1041(int i);

    private final void method1042(byte i) {
        aBoolean6157 = false;
        anInt6089++;
        if (i >= -15)
            ((ha_Sub3) this).aClass381_6108 = null;
        method992(-90);
        if (((ha_Sub3) this).aClass31_6234 == Node_Sub14_Sub39.aClass31_9598)
            method1034((byte) -72);
    }

    private final void method1043(byte i) {
        if (((ha_Sub3) this).aClass31_6234 != Class210.aClass31_2428) {
            Class31 class31 = ((ha_Sub3) this).aClass31_6234;
            ((ha_Sub3) this).aClass31_6234 = Class210.aClass31_2428;
            if (!class31.method268((byte) 0))
                method936(8);
            method983(true);
            ((ha_Sub3) this).aFloatArray6229 = aFloatArray6218;
            method1034((byte) -75);
            anInt6174 &= ~0x7;
        }
        if (i != -65)
            method925(-81);
        anInt6128++;
    }

    abstract boolean method1044(Class228 class228, Class264 class264, int i);

    abstract void method1045(byte i);

    private final void method1046(int i) {
        anInt6099++;
        if (aClass340_6172 != null)
            aClass340_6172.method3437(true);
        method1041(16);
        if (i != 0)
            ((ha_Sub3) this).aLong6020 = -94L;
    }

    private final void method1047(byte i) {
        if (i >= -88)
            M();
        anInt5984++;
        anInterface18_Impl1_6271 = method1010(118, false);
        anInterface18_Impl1_6271.method2(28, -30987, 140);
        for (int i_251_ = 0; (i_251_ ^ 0xffffffff) > -5; i_251_++) {
            Buffer buffer = anInterface18_Impl1_6271.method1(-4448, true);
            if (buffer != null) {
                Stream stream = method926((byte) -20, buffer);
                if (!Stream.b()) {
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(1.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(1.0F);
                    stream.b(0.0F);
                    stream.b(1.0F);
                    stream.b(1.0F);
                    stream.b(1.0F);
                    stream.b(0.0F);
                    stream.b(1.0F);
                    stream.b(1.0F);
                    stream.b(1.0F);
                    stream.b(1.0F);
                    stream.b(1.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(1.0F);
                    stream.b(0.0F);
                    stream.b(1.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                } else {
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(1.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(1.0F);
                    stream.a(0.0F);
                    stream.a(1.0F);
                    stream.a(1.0F);
                    stream.a(1.0F);
                    stream.a(0.0F);
                    stream.a(1.0F);
                    stream.a(1.0F);
                    stream.a(1.0F);
                    stream.a(1.0F);
                    stream.a(1.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(1.0F);
                    stream.a(0.0F);
                    stream.a(1.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                }
                stream.a();
                if (anInterface18_Impl1_6271.method4(-13472))
                    break;
            }
        }
        aClass185_6270 = method1005((byte) 17, (new Class194[]{new Class194(new Class89[]{Class89.aClass89_1097, Class89.aClass89_1101, Class89.aClass89_1101})}));
    }

    final aa a(int i, int i_252_, int[] is, int[] is_253_) {
        anInt6111++;
        return Class60.method470(is, 0, this, i, is_253_, i_252_);
    }

    abstract void method1048(boolean bool);

    final void a(int i, int i_254_, int i_255_, int i_256_, int i_257_, int i_258_, aa var_aa, int i_259_, int i_260_) {
        anInt6106++;
    }

    abstract void method1049(boolean bool);

    final void DA(int i, int i_261_, int i_262_, int i_263_) {
        anInt6065++;
        ((ha_Sub3) this).anInt6246 = i;
        ((ha_Sub3) this).anInt6166 = i_261_;
        ((ha_Sub3) this).anInt6243 = i_263_;
        ((ha_Sub3) this).anInt6196 = i_262_;
        method981(true);
        method1042((byte) -18);
        method998(-23496);
        method922(8652);
    }

    final void method1050(byte i) {
        anInt5957++;
        if (i != -77)
            method1005((byte) 53, null);
        if (anInt6174 != 8) {
            method1036(-8);
            method994(11073, true);
            method1029(true, 23394);
            method950((byte) 36, true);
            method942(-129, 1);
            anInt6174 = 8;
        }
    }

    abstract void method1051(byte i);

    final void method1052(byte i) {
        anInt6018++;
        if (i > -9)
            ((ha_Sub3) this).aFloat6168 = -0.39482835F;
        if ((anInt6174 ^ 0xffffffff) != -17) {
            method1043((byte) -65);
            method994(11073, true);
            method1029(true, 23394);
            method950((byte) 36, true);
            method942(-129, 1);
            anInt6174 = 16;
        }
    }

    final int method1053(int i) {
        if (i != -8)
            X(57);
        anInt6112++;
        return anInt6228;
    }

    final void ra(int i, int i_264_, int i_265_, int i_266_) {
        ((ha_Sub3) this).aBoolean6181 = true;
        anInt6220 = i_266_;
        anInt6184 = i_265_;
        anInt6228 = i;
        anInt6074++;
        anInt6238 = i_264_;
    }

    final Class48 a(Class285 class285, Class157[] class157s, boolean bool) {
        anInt5994++;
        return new Class48_Sub2(this, class285, class157s, bool);
    }

    final void b(int i) {
        anInt5973++;
        if (i < 128 || i > 1024)
            throw new IllegalArgumentException();
        if (aClass299_6247 != null)
            aClass299_6247.method3179(1000);
        ((ha_Sub3) this).anInt6153 = i;
    }

    final Viewport o() {
        anInt6003++;
        return aClass238_Sub2_6259;
    }

    final void A(int i, aa var_aa, int i_267_, int i_268_) {
        anInt6006++;
        aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
        Interface21_Impl2 interface21_impl2 = ((aa_Sub3) var_aa_Sub3).anInterface21_Impl2_5263;
        method1031(true);
        method929(interface21_impl2, -8423);
        method942(-129, 1);
        method955((byte) 40, Class142.aClass5_1669, Class142.aClass5_1669);
        method946(0, 80, Class380.aClass280_4649);
        method976(i, false);
        ((ha_Sub3) this).aClass238_Sub2_6141.method1898((float) ((ha_Sub3) this).anInt5955, (float) ((ha_Sub3) this).anInt5986, 0.0F, (byte) -49);
        method948(85);
        ((ha_Sub3) this).aClass238_Sub2Array6169[0].method1898(interface21_impl2.method71((float) ((ha_Sub3) this).anInt5955, -113), interface21_impl2.method64(-2092, (float) ((ha_Sub3) this).anInt5986), 1.0F, (byte) -49);
        ((ha_Sub3) this).aClass238_Sub2Array6169[0].method1885(interface21_impl2.method64(-2092, (float) -i_267_), 0.0F, interface21_impl2.method71((float) -i_268_, -95), 13);
        ((ha_Sub3) this).aClass34Array6216[0] = Node_Sub14_Sub16.aClass34_9338;
        method953(1);
        method986(-123);
        method925(-83);
        method946(0, -118, Class147.aClass280_1738);
    }

    final void method1054(int i) {
        anInt6088++;
        if (i > -38)
            method1015((byte) -95);
        Hashtable hashtable = new Hashtable();
        if (aHashtable5999 != null && !aHashtable5999.isEmpty()) {
            Enumeration enumeration = aHashtable5999.keys();
            while (enumeration.hasMoreElements()) {
                Canvas canvas = (Canvas) enumeration.nextElement();
                hashtable.put(canvas, method1023((byte) 3, canvas));
            }
        }
        aHashtable5999 = hashtable;
        method1047((byte) -121);
        method968(12);
        method1020((byte) -76);
        aClass59_6212.method462(107, this);
    }

    final void L(int i, int i_269_, int i_270_) {
        anInt6005++;
        if ((i ^ 0xffffffff) != (((ha_Sub3) this).anInt6214 ^ 0xffffffff) || (((ha_Sub3) this).anInt6158 ^ 0xffffffff) != (i_269_ ^ 0xffffffff) || (i_270_ ^ 0xffffffff) != (((ha_Sub3) this).anInt6223 ^ 0xffffffff)) {
            ((ha_Sub3) this).anInt6223 = i_270_;
            ((ha_Sub3) this).anInt6158 = i_269_;
            ((ha_Sub3) this).anInt6214 = i;
            method1046(0);
            method921(true);
        }
    }

    final int r(int i, int i_271_, int i_272_, int i_273_, int i_274_, int i_275_, int i_276_) {
        anInt6124++;
        int i_277_ = 0;
        float f = ((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6706) + ((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6754) * (float) i_272_ + ((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6744) * (float) i_271_ + (float) i * (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6728))));
        float f_278_ = ((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6706) + (((float) i_275_ * (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6754)) + (((float) i_274_ * (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6744)) + (float) i_273_ * (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6728))));
        if ((float) ((ha_Sub3) this).anInt6173 > f && (float) ((ha_Sub3) this).anInt6173 > f_278_)
            i_277_ |= 0x10;
        else if ((float) ((ha_Sub3) this).anInt6164 < f && f_278_ > (float) ((ha_Sub3) this).anInt6164)
            i_277_ |= 0x20;
        int i_279_ = (int) (((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6733) + (((float) i_272_ * ((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6726) + ((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6711 * (float) i) + (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6750) * (float) i_271_))) * (float) ((ha_Sub3) this).anInt6196 / (float) i_276_);
        int i_280_ = (int) (((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6733) + (((float) i_275_ * ((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6726) + ((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6711 * (float) i_273_) + ((float) i_274_ * (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6750))))) * (float) ((ha_Sub3) this).anInt6196 / (float) i_276_);
        if (!(((ha_Sub3) this).aFloat6213 > (float) i_279_) || !(((ha_Sub3) this).aFloat6213 > (float) i_280_)) {
            if (((ha_Sub3) this).aFloat6191 < (float) i_279_ && ((ha_Sub3) this).aFloat6191 < (float) i_280_)
                i_277_ |= 0x2;
        } else
            i_277_ |= 0x1;
        int i_281_ = (int) ((float) ((ha_Sub3) this).anInt6243 * (((float) i_272_ * ((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6724) + ((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6737 * (float) i_271_) + (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6713 * (float) i)) + ((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6715) / (float) i_276_);
        int i_282_ = (int) (((((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6715) + (((float) i_275_ * ((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6724) + (((float) i_274_ * (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6737)) + (((Class238_Sub2) ((ha_Sub3) this).aClass238_Sub2_6147).aFloat6713) * (float) i_273_))) * (float) ((ha_Sub3) this).anInt6243 / (float) i_276_);
        if (((ha_Sub3) this).aFloat6160 > (float) i_281_ && ((ha_Sub3) this).aFloat6160 > (float) i_282_)
            i_277_ |= 0x4;
        else if (((ha_Sub3) this).aFloat6168 < (float) i_281_ && (float) i_282_ > ((ha_Sub3) this).aFloat6168)
            i_277_ |= 0x8;
        return i_277_;
    }

    final int XA() {
        anInt6029++;
        return ((ha_Sub3) this).anInt6164;
    }

    static {
        aIncommingOpcode_6045 = new IncommingOpcode(89, 3);
    }
}
