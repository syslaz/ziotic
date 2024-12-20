/* ha_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;

import java.awt.*;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

final class ha_Sub2 extends ha {
    static int anInt5587;
    static int anInt5588;
    static int anInt5589;
    static int anInt5590;
    static int anInt5591;
    static int anInt5592;
    static int anInt5593;
    static int anInt5594;
    static int anInt5595;
    static int anInt5596;
    int anInt5597;
    static int anInt5598;
    private long aLong5599;
    static int anInt5600;
    private int anInt5601;
    static int anInt5602;
    static int anInt5603;
    static int anInt5604;
    static int anInt5605;
    static int anInt5606;
    static int anInt5607;
    static int anInt5608;
    static int anInt5609;
    private Canvas aCanvas5610;
    static int anInt5611;
    static int anInt5612;
    static int anInt5613;
    static int anInt5614;
    static int anInt5615;
    static int anInt5616;
    private Hashtable aHashtable5617 = new Hashtable();
    static int anInt5618;
    static int anInt5619;
    static int anInt5620;
    static int anInt5621;
    static int anInt5622;
    static int anInt5623;
    static int anInt5624;
    static int anInt5625;
    static int anInt5626;
    static int anInt5627;
    static int anInt5628;
    static int anInt5629;
    static int anInt5630;
    static int anInt5631;
    static int anInt5632;
    static int anInt5633;
    static int anInt5634;
    static int anInt5635;
    static int anInt5636;
    static int anInt5637;
    static int anInt5638;
    static int anInt5639;
    static int anInt5640;
    static int anInt5641;
    static int anInt5642;
    static int anInt5643;
    static int anInt5644;
    static int anInt5645;
    static int anInt5646;
    private long aLong5647;
    static int anInt5648;
    static int anInt5649;
    static int anInt5650;
    static int anInt5651;
    static int anInt5652;
    static int anInt5653;
    static int anInt5654;
    static int anInt5655;
    static int anInt5656;
    static int anInt5657;
    static int anInt5658;
    static int anInt5659;
    static int anInt5660;
    static int anInt5661;
    static int anInt5662;
    static int anInt5663;
    static int anInt5664;
    static int anInt5665;
    static int anInt5666;
    static int anInt5667;
    static int anInt5668;
    static int anInt5669;
    static int anInt5670;
    static int anInt5671;
    static int anInt5672;
    static int anInt5673;
    static int anInt5674;
    static int anInt5675;
    static int anInt5676;
    static int anInt5677;
    static int anInt5678;
    static int anInt5679;
    static int anInt5680;
    static int anInt5681;
    static int anInt5682;
    static int anInt5683;
    static int anInt5684;
    static int anInt5685;
    static int anInt5686;
    static int anInt5687;
    static int anInt5688;
    static int anInt5689;
    static int anInt5690;
    static int anInt5691;
    static int anInt5692;
    private int anInt5693;
    static int anInt5694;
    static int anInt5695;
    int anInt5696;
    static int anInt5697;
    static int anInt5698;
    static int anInt5699;
    static int anInt5700;
    static int anInt5701;
    static int anInt5702;
    static int anInt5703;
    static int anInt5704 = -1;
    static int anInt5705;
    static int anInt5706;
    static int anInt5707;
    static int anInt5708;
    static int anInt5709;
    static int anInt5710;
    static int anInt5711;
    static int anInt5712;
    static int anInt5713;
    static int anInt5714;
    static int anInt5715;
    static int anInt5716;
    static int anInt5717;
    static int anInt5718;
    static int anInt5719;
    static int anInt5720;
    static int anInt5721;
    static int anInt5722;
    static int anInt5723;
    static int anInt5724;
    static int anInt5725;
    static int anInt5726;
    static int anInt5727;
    static int anInt5728;
    static int anInt5729;
    static int anInt5730;
    static int anInt5731;
    static int anInt5732;
    private OpenGL anOpenGL5733;
    static int anInt5734;
    static int anInt5735;
    static int anInt5736;
    static int anInt5737;
    static int anInt5738;
    static int anInt5739;
    static int anInt5740;
    static int anInt5741;
    static int anInt5742;
    static int anInt5743;
    static int anInt5744;
    static int anInt5745;
    static int anInt5746;
    static int anInt5747;
    static int anInt5748;
    static int anInt5749;
    static int anInt5750;
    private Canvas aCanvas5751;
    static int anInt5752;
    static int anInt5753;
    static int anInt5754;
    static int anInt5755;
    static int anInt5756;
    static int anInt5757;
    static int anInt5758;
    static int anInt5759;
    static int anInt5760;
    static int anInt5761;
    static int anInt5762;
    static int anInt5763;
    static int anInt5764;
    static int anInt5765;
    static int anInt5766;
    static int anInt5767;
    static int anInt5768;
    private Class347 aClass347_5769;
    static int anInt5770;
    static int anInt5771;
    static int anInt5772;
    private Class371 aClass371_5773;
    static int anInt5774;
    static int anInt5775;
    private Node_Sub11_Sub1 aClass248_Sub11_Sub1_5776;
    int anInt5777;
    static int anInt5778;
    static int anInt5779;
    static int anInt5780;
    static int anInt5781;
    static int anInt5782;
    static int anInt5783;
    static int anInt5784;
    static int anInt5785;
    static int anInt5786;
    static int anInt5787;
    static int anInt5788;
    static int anInt5789;
    int anInt5790 = 128;
    static int anInt5791;
    static int anInt5792;
    private Class359 aClass359_5793;
    static int anInt5794;
    private Class96 aClass96_5795 = new Class96();
    private Class238_Sub3 aClass238_Sub3_5796 = new Class238_Sub3();
    Class238_Sub3 aClass238_Sub3_5797 = new Class238_Sub3();
    int anInt5798 = 3;
    NativeHeap aNativeHeap5799;
    int anInt5800;
    Class382 aClass382_5801;
    private boolean aBoolean5802 = false;
    int anInt5803 = 8;
    private Class293 aClass293_5804 = new Class293();
    private Interface20[] anInterface20Array5805 = new Interface20[4];
    private Interface20 anInterface20_5806;
    private Interface20 anInterface20_5807;
    private Interface20[] anInterface20Array5808 = new Interface20[4];
    private int anInt5809 = -1;
    private Interface20[] anInterface20Array5810;
    private Class129_Sub1 aClass129_Sub1_5811;
    private Class223 aClass223_5812;
    private int anInt5813 = -1;
    private int anInt5814;
    int anInt5815;
    private Class293 aClass293_5816;
    private int anInt5817;
    int anInt5818;
    private Class293 aClass293_5819;
    private Class293 aClass293_5820;
    private Class293 aClass293_5821;
    private Class293 aClass293_5822;
    private Class293 aClass293_5823;
    private Class293 aClass293_5824;
    private int anInt5825;
    private int anInt5826;
    private int anInt5827;
    private boolean aBoolean5828;
    private long aLong5829;
    private boolean aBoolean5830;
    private boolean aBoolean5831;
    Class238_Sub3 aClass238_Sub3_5832;
    private boolean aBoolean5833;
    Class238_Sub3 aClass238_Sub3_5834;
    Class238_Sub3 aClass238_Sub3_5835;
    boolean aBoolean5836;
    boolean aBoolean5837;
    float[] aFloatArray5838;
    private float[] aFloatArray5839;
    float aFloat5840;
    private int anInt5841;
    private boolean aBoolean5842;
    private float aFloat5843;
    float aFloat5844;
    Node_Sub9_Sub1 aClass248_Sub9_Sub1_5845;
    float aFloat5846;
    private int anInt5847;
    private Class136[] aClass136Array5848;
    Class162_Sub2 aClass162_Sub2_5849;
    private int anInt5850;
    private int anInt5851;
    boolean aBoolean5852;
    private boolean aBoolean5853;
    int anInt5854;
    private float aFloat5855;
    int anInt5856;
    private boolean aBoolean5857;
    private int anInt5858;
    private float[] aFloatArray5859;
    private int anInt5860;
    private Interface6 anInterface6_5861;
    int anInt5862;
    int anInt5863;
    int anInt5864;
    Class162_Sub2 aClass162_Sub2_5865;
    private int anInt5866;
    float aFloat5867;
    float aFloat5868;
    boolean aBoolean5869;
    private int anInt5870;
    boolean aBoolean5871;
    boolean aBoolean5872;
    private boolean aBoolean5873;
    Class162_Sub2 aClass162_Sub2_5874;
    private boolean aBoolean5875;
    Class162_Sub2 aClass162_Sub2_5876;
    boolean aBoolean5877;
    float aFloat5878;
    int anInt5879;
    int anInt5880;
    private int anInt5881;
    int anInt5882;
    boolean aBoolean5883;
    float aFloat5884;
    Class162_Sub2 aClass162_Sub2_5885;
    private Class136_Sub4_Sub1 aClass136_Sub4_Sub1_5886;
    private Interface1 anInterface1_5887;
    int anInt5888;
    Class136_Sub4 aClass136_Sub4_5889;
    int anInt5890;
    private int anInt5891;
    private int anInt5892;
    float aFloat5893;
    Class162_Sub2 aClass162_Sub2_5894;
    Class223 aClass223_5895;
    private String aString5896;
    int anInt5897;
    Class140 aClass140_5898;
    private float aFloat5899;
    float aFloat5900;
    private float aFloat5901;
    private float aFloat5902;
    private int anInt5903;
    Class162_Sub2 aClass162_Sub2_5904;
    Class162_Sub2 aClass162_Sub2_5905;
    private int anInt5906;
    boolean aBoolean5907;
    Class162_Sub2 aClass162_Sub2_5908;
    private float aFloat5909;
    boolean aBoolean5910;
    private Class316_Sub1 aClass316_Sub1_5911;
    private String aString5912;
    boolean aBoolean5913;
    boolean aBoolean5914;
    boolean aBoolean5915;
    float aFloat5916;
    private int anInt5917;
    Class140 aClass140_5918;
    float aFloat5919;
    private Node_Sub42[] aClass248_Sub42Array5920;
    int anInt5921;
    int anInt5922;
    private int anInt5923;
    private float aFloat5924;
    private boolean aBoolean5925;
    private Interface6 anInterface6_5926;
    private boolean aBoolean5927;
    private int anInt5928;
    private boolean aBoolean5929;
    boolean aBoolean5930;
    private int anInt5931;
    private float aFloat5932;
    int anInt5933;
    int anInt5934;
    int anInt5935;
    boolean aBoolean5936;
    private float[] aFloatArray5937;
    private boolean aBoolean5938;
    private boolean aBoolean5939;
    float aFloat5940;
    private int anInt5941;
    private boolean aBoolean5942;
    private boolean aBoolean5943;
    float aFloat5944;
    private float[] aFloatArray5945;
    Class162_Sub2 aClass162_Sub2_5946;
    int[] anIntArray5947;
    int[] anIntArray5948;
    private int anInt5949;
    int[] anIntArray5950;
    byte[] aByteArray5951;
    private int anInt5952;

    final void b(Canvas canvas) {
        anInt5736++;
        if (canvas == aCanvas5610)
            throw new RuntimeException();
        if (aHashtable5617.containsKey(canvas)) {
            Long var_long = (Long) aHashtable5617.get(canvas);
            anOpenGL5733.releaseSurface(canvas, var_long.longValue());
            aHashtable5617.remove(canvas);
        }
    }

    final int JA(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
        anInt5660++;
        int i_5_ = 0;
        float f = ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6797) + ((float) i * ((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6775 + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6791) * (float) i_0_ + ((float) i_1_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6793))));
        if (f < 1.0F)
            f = 1.0F;
        float f_6_ = ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6797) + ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6791) * (float) i_3_ + ((float) i_2_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6775)) + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6793) * (float) i_4_));
        if (f_6_ < 1.0F)
            f_6_ = 1.0F;
        if ((float) ((ha_Sub2) this).anInt5897 > f && f_6_ < (float) ((ha_Sub2) this).anInt5897)
            i_5_ |= 0x10;
        else if (f > (float) anInt5858 && f_6_ > (float) anInt5858)
            i_5_ |= 0x20;
        int i_7_ = (int) (((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6780) + ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6785 * (float) i_1_) + ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6794 * (float) i) + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6784) * (float) i_0_))) * (float) ((ha_Sub2) this).anInt5864 / f);
        int i_8_ = (int) ((float) ((ha_Sub2) this).anInt5864 * ((float) i_2_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6794) + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6784 * (float) i_3_) + ((float) i_4_ * ((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6785) + ((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6780) / f_6_);
        if (((ha_Sub2) this).aFloat5916 > (float) i_7_ && ((ha_Sub2) this).aFloat5916 > (float) i_8_)
            i_5_ |= 0x1;
        else if ((float) i_7_ > ((ha_Sub2) this).aFloat5844 && (float) i_8_ > ((ha_Sub2) this).aFloat5844)
            i_5_ |= 0x2;
        int i_9_ = (int) ((float) ((ha_Sub2) this).anInt5863 * ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6770) + ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6761 * (float) i) + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6772 * (float) i_0_) + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6786 * (float) i_1_))) / f);
        int i_10_ = (int) (((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6770) + ((float) i_4_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6786) + ((float) i_2_ * ((Class238_Sub3) (((ha_Sub2) this).aClass238_Sub3_5832)).aFloat6761 + ((float) i_3_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6772))))) * (float) ((ha_Sub2) this).anInt5863 / f_6_);
        if ((float) i_9_ < ((ha_Sub2) this).aFloat5940 && (float) i_10_ < ((ha_Sub2) this).aFloat5940)
            i_5_ |= 0x4;
        else if ((float) i_9_ > ((ha_Sub2) this).aFloat5900 && (float) i_10_ > ((ha_Sub2) this).aFloat5900)
            i_5_ |= 0x8;
        return i_5_;
    }

    private final void method839(int i) {
        ((ha_Sub2) this).aFloat5940 = (float) (-((ha_Sub2) this).anInt5933 + anInt5917);
        ((ha_Sub2) this).aFloat5916 = (float) (anInt5841 - ((ha_Sub2) this).anInt5890);
        anInt5670++;
        ((ha_Sub2) this).aFloat5844 = (float) (-((ha_Sub2) this).anInt5890 + anInt5906);
        int i_11_ = -75 / ((-73 - i) / 35);
        ((ha_Sub2) this).aFloat5900 = (float) (-((ha_Sub2) this).anInt5933 + anInt5931);
    }

    final boolean a() {
        anInt5640++;
        if (aClass248_Sub11_Sub1_5776 == null || ((ha_Sub2) this).anInt5777 > 1 && !aBoolean5925)
            return false;
        return true;
    }

    final void a(Class316 class316) {
        aClass316_Sub1_5911 = (Class316_Sub1) class316;
        anInt5683++;
    }

    final void F(int i, int i_12_) {
        anInt5611++;
    }

    final void ra(int i, int i_13_, int i_14_, int i_15_) {
        ((ha_Sub2) this).aBoolean5914 = true;
        ((ha_Sub2) this).anInt5880 = i_15_;
        ((ha_Sub2) this).anInt5856 = i_13_;
        ((ha_Sub2) this).anInt5854 = i_14_;
        anInt5778++;
        ((ha_Sub2) this).anInt5922 = i;
    }

    final void method840(boolean bool) {
        if (bool != true)
            anInt5693 = 84;
        anInt5743++;
        OpenGL.glPopMatrix();
    }

    final synchronized void method841(int i, int i_16_, int i_17_) {
        anInt5705++;
        Node_Sub37 class248_sub37 = new Node_Sub37(i_16_);
        if (i != -24474)
            d(115, -108);
        ((Node) class248_sub37).id = (long) i_17_;
        aClass293_5822.method3109(class248_sub37, -105);
    }

    final synchronized void j(int i) {
        anInt5781++;
        int i_18_ = 0;
        i &= 0x7fffffff;
        while (!aClass293_5819.method3115(false)) {
            Node_Sub37 class248_sub37 = (Node_Sub37) aClass293_5819.method3108(false);
            Class377.anIntArray4629[i_18_++] = (int) ((Node) class248_sub37).id;
            ((ha_Sub2) this).anInt5815 -= ((Node_Sub37) class248_sub37).anInt7261;
            if (i_18_ == 1000) {
                OpenGL.glDeleteBuffersARB(i_18_, Class377.anIntArray4629, 0);
                i_18_ = 0;
            }
        }
        if ((i_18_ ^ 0xffffffff) < -1) {
            OpenGL.glDeleteBuffersARB(i_18_, Class377.anIntArray4629, 0);
            i_18_ = 0;
        }
        while (!aClass293_5820.method3115(false)) {
            Node_Sub37 class248_sub37 = (Node_Sub37) aClass293_5820.method3108(false);
            Class377.anIntArray4629[i_18_++] = (int) ((Node) class248_sub37).id;
            ((ha_Sub2) this).anInt5818 -= ((Node_Sub37) class248_sub37).anInt7261;
            if (i_18_ == 1000) {
                OpenGL.glDeleteTextures(i_18_, Class377.anIntArray4629, 0);
                i_18_ = 0;
            }
        }
        if (i_18_ > 0) {
            OpenGL.glDeleteTextures(i_18_, Class377.anIntArray4629, 0);
            i_18_ = 0;
        }
        while (!aClass293_5821.method3115(false)) {
            Node_Sub37 class248_sub37 = (Node_Sub37) aClass293_5821.method3108(false);
            Class377.anIntArray4629[i_18_++] = ((Node_Sub37) class248_sub37).anInt7261;
            if ((i_18_ ^ 0xffffffff) == -1001) {
                OpenGL.glDeleteFramebuffersEXT(i_18_, Class377.anIntArray4629, 0);
                i_18_ = 0;
            }
        }
        if (i_18_ > 0) {
            OpenGL.glDeleteFramebuffersEXT(i_18_, Class377.anIntArray4629, 0);
            i_18_ = 0;
        }
        while (!aClass293_5822.method3115(false)) {
            Node_Sub37 class248_sub37 = (Node_Sub37) aClass293_5822.method3108(false);
            Class377.anIntArray4629[i_18_++] = (int) ((Node) class248_sub37).id;
            anInt5817 -= ((Node_Sub37) class248_sub37).anInt7261;
            if (i_18_ == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(i_18_, Class377.anIntArray4629, 0);
                i_18_ = 0;
            }
        }
        if ((i_18_ ^ 0xffffffff) < -1) {
            OpenGL.glDeleteRenderbuffersEXT(i_18_, Class377.anIntArray4629, 0);
            boolean bool = false;
        }
        while (!aClass293_5816.method3115(false)) {
            Node_Sub37 class248_sub37 = (Node_Sub37) aClass293_5816.method3108(false);
            OpenGL.glDeleteLists((int) ((Node) class248_sub37).id, ((Node_Sub37) class248_sub37).anInt7261);
        }
        while (!aClass293_5823.method3115(false)) {
            Node node = aClass293_5823.method3108(false);
            OpenGL.glDeleteProgramARB((int) ((Node) node).id);
        }
        while (!aClass293_5824.method3115(false)) {
            Node node = aClass293_5824.method3108(false);
            OpenGL.glDeleteObjectARB(((Node) node).id);
        }
        while (!aClass293_5816.method3115(false)) {
            Node_Sub37 class248_sub37 = (Node_Sub37) aClass293_5816.method3108(false);
            OpenGL.glDeleteLists((int) ((Node) class248_sub37).id, ((Node_Sub37) class248_sub37).anInt7261);
        }
        aClass359_5793.method3806(-128);
        if ((E() ^ 0xffffffff) < -100663297 && ((60000L + aLong5829 ^ 0xffffffffffffffffL) > (Class118.method1112(116) ^ 0xffffffffffffffffL))) {
            System.gc();
            aLong5829 = Class118.method1112(116);
        }
        ((ha_Sub2) this).anInt5800 = i;
    }

    final void method842(int i, Interface6 interface6) {
        if (i == -4593) {
            if (interface6 != anInterface6_5861) {
                if (aBoolean5842)
                    OpenGL.glBindBufferARB(34962, interface6.method20((byte) -31));
                anInterface6_5861 = interface6;
            }
            anInt5596++;
        }
    }

    final void e(int i) {
        anInt5710++;
        method915(1136122328);
    }

    final void c(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_) {
        anInt5761++;
        float f = 0.35F + (float) i;
        float f_24_ = 0.35F + (float) i_19_;
        float f_25_ = -1.0F + (f + (float) i_20_);
        float f_26_ = f_24_ + (float) i_21_ - 1.0F;
        method872(1);
        method885(0, i_23_);
        OpenGL.glColor4ub((byte) (i_22_ >> -271801712), (byte) (i_22_ >> 646945032), (byte) i_22_, (byte) (i_22_ >> -1263559688));
        if (aBoolean5939)
            OpenGL.glDisable(32925);
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(f, f_24_);
        OpenGL.glVertex2f(f, f_26_);
        OpenGL.glVertex2f(f_25_, f_26_);
        OpenGL.glVertex2f(f_25_, f_24_);
        OpenGL.glEnd();
        if (aBoolean5939)
            OpenGL.glEnable(32925);
    }

    final void H(int i, int i_27_, int i_28_, int[] is) {
        anInt5701++;
        float f = ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6793) * (float) i_28_ + ((float) i * ((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6775 + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6791) * (float) i_27_) + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6797));
        if (f == 0.0F)
            is[0] = is[1] = is[2] = -1;
        else {
            int i_29_ = (int) ((float) ((ha_Sub2) this).anInt5864 * ((float) i_28_ * ((Class238_Sub3) (((ha_Sub2) this).aClass238_Sub3_5832)).aFloat6785 + (((float) i_27_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6784)) + ((float) i * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6794))) + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6780)) / f);
            is[0] = (int) ((float) i_29_ - ((ha_Sub2) this).aFloat5916);
            int i_30_ = (int) ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6770 + ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6786 * (float) i_28_) + ((float) i * ((Class238_Sub3) (((ha_Sub2) this).aClass238_Sub3_5832)).aFloat6761 + ((float) i_27_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6772))))) * (float) ((ha_Sub2) this).anInt5863 / f);
            is[1] = (int) ((float) i_30_ - ((ha_Sub2) this).aFloat5940);
            is[2] = (int) f;
        }
    }

    final void a(Class338 class338, int i) {
        aClass96_5795.method706(class338, true, this, i);
        anInt5619++;
    }

    final void method843(int i, Class140 class140, Class140 class140_31_, Class140 class140_32_, Class140 class140_33_) {
        if (class140_31_ == null)
            OpenGL.glDisableClientState(32884);
        else {
            method842(i ^ ~0x9186, ((Class140) class140_31_).anInterface6_1662);
            OpenGL.glVertexPointer(((Class140) class140_31_).aByte1668, ((Class140) class140_31_).aShort1666, anInterface6_5861.method21(26249), (anInterface6_5861.method22(9889) + (long) (((Class140) class140_31_).aByte1664)));
            OpenGL.glEnableClientState(32884);
        }
        anInt5624++;
        if (class140_32_ == null)
            OpenGL.glDisableClientState(32885);
        else {
            method842(-4593, ((Class140) class140_32_).anInterface6_1662);
            OpenGL.glNormalPointer(((Class140) class140_32_).aShort1666, anInterface6_5861.method21(26249), (anInterface6_5861.method22(9889) + (long) (((Class140) class140_32_).aByte1664)));
            OpenGL.glEnableClientState(32885);
        }
        if (i != 32886)
            d();
        if (class140_33_ == null)
            OpenGL.glDisableClientState(32886);
        else {
            method842(i + -37479, ((Class140) class140_33_).anInterface6_1662);
            OpenGL.glColorPointer(((Class140) class140_33_).aByte1668, ((Class140) class140_33_).aShort1666, anInterface6_5861.method21(26249), (anInterface6_5861.method22(9889) - -(long) (((Class140) class140_33_).aByte1664)));
            OpenGL.glEnableClientState(32886);
        }
        if (class140 != null) {
            method842(-4593, ((Class140) class140).anInterface6_1662);
            OpenGL.glTexCoordPointer(((Class140) class140).aByte1668, ((Class140) class140).aShort1666, anInterface6_5861.method21(i ^ 0xe6ff), (anInterface6_5861.method22(i ^ 0xa6d7) - -(long) (((Class140) class140).aByte1664)));
            OpenGL.glEnableClientState(32888);
        } else
            OpenGL.glDisableClientState(32888);
    }

    final void method844(int i) {
        if (i != 17776)
            aFloat5902 = -0.7511074F;
        if ((anInt5827 ^ 0xffffffff) != -5) {
            method852(0);
            method899(2286, false);
            method878(false, i ^ ~0x4519);
            method913(false, 0);
            method870(35, false);
            method882(-2, (byte) 126);
            method885(0, 1);
            anInt5827 = 4;
        }
        anInt5772++;
    }

    final void method845(Class238_Sub3 class238_sub3, int i) {
        if (i != 28727)
            na(-63, 83, 63, -123);
        anInt5780++;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(class238_sub3.method1907((byte) -119), 0);
    }

    final boolean q() {
        anInt5661++;
        if (aClass248_Sub11_Sub1_5776 == null || !aClass248_Sub11_Sub1_5776.method2243(818))
            return false;
        return true;
    }

    final Interface13 d(int i, int i_34_) {
        anInt5759++;
        return null;
    }

    final synchronized void method846(long l, boolean bool) {
        if (bool == true) {
            anInt5757++;
            Node node = new Node();
            ((Node) node).id = l;
            aClass293_5824.method3109(node, -90);
        }
    }

    final boolean s() {
        anInt5656++;
        return true;
    }

    final void e(int i, int i_35_) throws Exception_Sub1 {
        try {
            anOpenGL5733.swapBuffers();
        } catch (Exception exception) {
            /* empty */
        }
        anInt5648++;
    }

    final synchronized void method847(int i, byte i_36_) {
        anInt5620++;
        Node node = new Node();
        ((Node) node).id = (long) i;
        aClass293_5823.method3109(node, -103);
        if (i_36_ != -51)
            method898(-94, -5);
    }

    final void aa(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_) {
        anInt5588++;
        float f = 0.35F + (float) i;
        float f_42_ = 0.35F + (float) i_37_;
        float f_43_ = f + (float) i_38_;
        float f_44_ = (float) i_39_ + f_42_;
        method872(1);
        method885(0, i_41_);
        OpenGL.glColor4ub((byte) (i_40_ >> 344119536), (byte) (i_40_ >> -2115065848), (byte) i_40_, (byte) (i_40_ >> 1765430488));
        if (aBoolean5939)
            OpenGL.glDisable(32925);
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(f, f_42_);
        OpenGL.glVertex2f(f, f_44_);
        OpenGL.glVertex2f(f_43_, f_44_);
        OpenGL.glVertex2f(f_43_, f_42_);
        OpenGL.glEnd();
        if (aBoolean5939)
            OpenGL.glEnable(32925);
    }

    final void method848(Class238_Sub3 class238_sub3, byte i) {
        anInt5699++;
        if (i != 70)
            U(29, -98, 105, 89, 48);
        OpenGL.glLoadMatrixf(class238_sub3.method1907((byte) -110), 0);
    }

    final void a(int i, int i_45_, int i_46_, int i_47_) {
        aClass347_5769.method3724(i_47_, i, i_45_, 26185, i_46_);
        anInt5655++;
    }

    final void method849(int i, int i_48_, byte i_49_, int i_50_) {
        anInt5629++;
        OpenGL.glTexEnvi(8960, 34184 - -i, i_50_);
        OpenGL.glTexEnvi(8960, 34200 + i, i_48_);
        if (i_49_ != 37)
            aClass293_5819 = null;
    }

    final boolean n() {
        anInt5708++;
        return aClass371_5773.method3858(3, 12686);
    }

    final void a(int i, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_) {
        OpenGL.glLineWidth((float) i_55_);
        anInt5645++;
        a(i, i_51_, i_52_, i_53_, i_54_, i_56_);
        OpenGL.glLineWidth(1.0F);
    }

    final void method850(byte i, int i_57_, int i_58_) {
        anInt5725++;
        if (i != -32)
            aBoolean5929 = false;
        anInt5870 = i_57_;
        anInt5892 = i_58_;
        method900((byte) 14);
        method888((byte) -122);
    }

    final void f(int i, int i_59_) {
        anInt5688++;
        if (((ha_Sub2) this).anInt5897 != i || (i_59_ ^ 0xffffffff) != (anInt5858 ^ 0xffffffff)) {
            ((ha_Sub2) this).anInt5897 = i;
            anInt5858 = i_59_;
            method895(true);
            method859(98);
            if ((anInt5903 ^ 0xffffffff) != -4) {
                if (anInt5903 == 2)
                    method914((byte) 118);
            } else
                method879(5889);
        }
    }

    final void method851(float f, int i, float f_60_) {
        anInt5644++;
        aFloat5932 = f;
        aFloat5902 = f_60_;
        method859(i ^ ~0x3d280a90);
        if (i != -1026034392)
            aFloat5932 = 0.8359454F;
    }

    private final void method852(int i) {
        if (anInt5903 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if ((((ha_Sub2) this).anInt5696 ^ 0xffffffff) < -1 && (((ha_Sub2) this).anInt5597 ^ 0xffffffff) < -1)
                OpenGL.glOrtho(0.0, (double) ((ha_Sub2) this).anInt5696, (double) ((ha_Sub2) this).anInt5597, 0.0, -1.0, 1.0);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            anInt5903 = 1;
            anInt5827 &= ~0x18;
        }
        if (i != 0)
            ((ha_Sub2) this).aFloat5940 = -0.7177214F;
        anInt5727++;
    }

    final void a(int[] is) {
        is[0] = ((ha_Sub2) this).anInt5696;
        anInt5609++;
        is[1] = ((ha_Sub2) this).anInt5597;
    }

    private final void method853(byte i) {
        anInt5634++;
        aClass136Array5848 = new Class136[((ha_Sub2) this).anInt5888];
        ((ha_Sub2) this).aClass136_Sub4_5889 = new Class136_Sub4(this, 3553, 6408, 1, 1);
        new Class136_Sub4(this, 3553, 6408, 1, 1);
        new Class136_Sub4(this, 3553, 6408, 1, 1);
        ((ha_Sub2) this).aClass162_Sub2_5876 = new Class162_Sub2(this);
        ((ha_Sub2) this).aClass162_Sub2_5904 = new Class162_Sub2(this);
        ((ha_Sub2) this).aClass162_Sub2_5894 = new Class162_Sub2(this);
        ((ha_Sub2) this).aClass162_Sub2_5865 = new Class162_Sub2(this);
        ((ha_Sub2) this).aClass162_Sub2_5905 = new Class162_Sub2(this);
        ((ha_Sub2) this).aClass162_Sub2_5849 = new Class162_Sub2(this);
        ((ha_Sub2) this).aClass162_Sub2_5885 = new Class162_Sub2(this);
        ((ha_Sub2) this).aClass162_Sub2_5946 = new Class162_Sub2(this);
        ((ha_Sub2) this).aClass162_Sub2_5908 = new Class162_Sub2(this);
        ((ha_Sub2) this).aClass162_Sub2_5874 = new Class162_Sub2(this);
        if (((ha_Sub2) this).aBoolean5836) {
            ((ha_Sub2) this).aClass223_5895 = new Class223(this);
            new Class223(this);
        }
        int i_61_ = -91 % ((30 - i) / 55);
    }

    final void method854(int i) {
        if (i > -79)
            aClass316_Sub1_5911 = null;
        anInt5724++;
        if (anInt5827 != 16) {
            method890(-106);
            method899(2286, true);
            method913(true, 0);
            method870(41, true);
            method885(0, 1);
            anInt5827 = 16;
        }
    }

    final boolean l() {
        anInt5794++;
        return true;
    }

    final void method855(int i) {
        OpenGL.glLightfv(16384, 4611, ((ha_Sub2) this).aFloatArray5838, i);
        anInt5605++;
        OpenGL.glLightfv(16385, 4611, aFloatArray5945, 0);
    }

    private final void method856(boolean bool) {
        if (bool == false) {
            if (aBoolean5875) {
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                aBoolean5875 = false;
            }
            anInt5753++;
        }
    }

    final void Q(int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, byte[] is, int i_67_, int i_68_) {
        anInt5641++;
        float f;
        float f_69_;
        if (aClass136_Sub4_Sub1_5886 != null && (((Class136_Sub4) aClass136_Sub4_Sub1_5886).anInt8416 ^ 0xffffffff) <= (i_63_ ^ 0xffffffff) && ((i_64_ ^ 0xffffffff) >= (((Class136_Sub4) aClass136_Sub4_Sub1_5886).anInt8412 ^ 0xffffffff))) {
            aClass136_Sub4_Sub1_5886.method1268(is, 6406, 0, 0, 0, 0, false, i_64_, -88, i_63_);
            f_69_ = (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_5886).aFloat9967 * (float) i_64_ / (float) (((Class136_Sub4) aClass136_Sub4_Sub1_5886).anInt8412));
            f = ((float) i_63_ * ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_5886).aFloat9969 / (float) (((Class136_Sub4) aClass136_Sub4_Sub1_5886).anInt8416));
        } else {
            aClass136_Sub4_Sub1_5886 = Class301_Sub2.method3192(false, is, this, 6406, 6406, i_64_, i_63_, -102);
            aClass136_Sub4_Sub1_5886.method1266((byte) -60, false, false);
            f = ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_5886).aFloat9969;
            f_69_ = ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_5886).aFloat9967;
        }
        method864(105);
        method889(-2, aClass136_Sub4_Sub1_5886);
        method885(0, i_68_);
        OpenGL.glColor4ub((byte) (i_65_ >> 37922160), (byte) (i_65_ >> 1731206792), (byte) i_65_, (byte) (i_65_ >> -398306760));
        method901(-82, i_66_);
        method858(9, 34165, 34165);
        method911(768, 34166, 0, (byte) 4);
        method911(770, 5890, 2, (byte) 4);
        method849(0, 770, (byte) 37, 34166);
        method849(2, 770, (byte) 37, 5890);
        float f_70_ = (float) i;
        float f_71_ = (float) i_62_;
        float f_72_ = f_70_ + (float) i_63_;
        OpenGL.glBegin(7);
        float f_73_ = f_71_ + (float) i_64_;
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(f_70_, f_71_);
        OpenGL.glTexCoord2f(0.0F, f);
        OpenGL.glVertex2f(f_70_, f_73_);
        OpenGL.glTexCoord2f(f_69_, f);
        OpenGL.glVertex2f(f_72_, f_73_);
        OpenGL.glTexCoord2f(f_69_, 0.0F);
        OpenGL.glVertex2f(f_72_, f_71_);
        OpenGL.glEnd();
        method911(768, 5890, 0, (byte) 4);
        method911(770, 34166, 2, (byte) 4);
        method849(0, 770, (byte) 37, 5890);
        method849(2, 770, (byte) 37, 34166);
    }

    final Class162 a(Class343 class343, int i, int i_74_, int i_75_, int i_76_) {
        anInt5723++;
        return new Class162_Sub2(this, class343, i, i_75_, i_76_, i_74_);
    }

    private final void method857(byte i) {
        if (aBoolean5938 && (((ha_Sub2) this).anInt5921 ^ 0xffffffff) <= -1)
            OpenGL.glEnable(2912);
        else
            OpenGL.glDisable(2912);
        anInt5639++;
        if (i <= 15)
            method869((byte) -16, 87, true, -97, null);
    }

    final void method858(int i, int i_77_, int i_78_) {
        int i_79_ = 36 / ((i - 70) / 48);
        anInt5646++;
        if ((anInt5941 ^ 0xffffffff) == -1) {
            boolean bool = false;
            if ((anInt5923 ^ 0xffffffff) != (i_78_ ^ 0xffffffff)) {
                OpenGL.glTexEnvi(8960, 34161, i_78_);
                bool = true;
                anInt5923 = i_78_;
            }
            if ((anInt5891 ^ 0xffffffff) != (i_77_ ^ 0xffffffff)) {
                OpenGL.glTexEnvi(8960, 34162, i_77_);
                anInt5891 = i_77_;
                bool = true;
            }
            if (bool)
                anInt5827 &= ~0x1d;
        } else {
            OpenGL.glTexEnvi(8960, 34161, i_78_);
            OpenGL.glTexEnvi(8960, 34162, i_77_);
        }
    }

    final int[] na(int i, int i_80_, int i_81_, int i_82_) {
        anInt5638++;
        int[] is = new int[i_82_ * i_81_];
        for (int i_83_ = 0; i_83_ < i_82_; i_83_++)
            OpenGL.glReadPixelsi(i, ((ha_Sub2) this).anInt5597 - i_80_ + -i_83_, i_81_, 1, 32993, ((ha_Sub2) this).anInt5934, is, i_83_ * i_81_);
        return is;
    }

    private final void method859(int i) {
        anInt5687++;
        aFloat5901 = (float) (-((ha_Sub2) this).anInt5882 + anInt5858) - aFloat5902;
        ((ha_Sub2) this).aFloat5868 = -((float) ((ha_Sub2) this).anInt5921 * aFloat5932) + aFloat5901;
        if (i < 46)
            I();
        if (((ha_Sub2) this).aFloat5868 < (float) ((ha_Sub2) this).anInt5897)
            ((ha_Sub2) this).aFloat5868 = (float) ((ha_Sub2) this).anInt5897;
        OpenGL.glFogf(2915, ((ha_Sub2) this).aFloat5868);
        OpenGL.glFogf(2916, aFloat5901);
        Node_Sub12.aFloatArray6959[1] = ((float) Class112.method794(65280, ((ha_Sub2) this).anInt5879) / 65280.0F);
        Node_Sub12.aFloatArray6959[0] = ((float) Class112.method794(16711680, ((ha_Sub2) this).anInt5879) / 1.671168E7F);
        Node_Sub12.aFloatArray6959[2] = ((float) Class112.method794(255, ((ha_Sub2) this).anInt5879) / 255.0F);
        OpenGL.glFogfv(2918, Node_Sub12.aFloatArray6959, 0);
    }

    final Class129 a(int i, int i_84_, boolean bool) {
        anInt5775++;
        return new Class129_Sub1(this, i, i_84_, bool);
    }

    final void g(int i) {
        anInt5664++;
    }

    final void w() {
        anInt5649++;
        OpenGL.glFinish();
    }

    final void la() {
        anInt5684++;
        anInt5841 = 0;
        anInt5931 = ((ha_Sub2) this).anInt5597;
        anInt5906 = ((ha_Sub2) this).anInt5696;
        anInt5917 = 0;
        OpenGL.glDisable(3089);
        method839(-10);
    }

    final void method860(Interface20 interface20, int i) {
        anInt5747++;
        if (anInt5813 < 0 || anInterface20Array5805[anInt5813] != interface20)
            throw new RuntimeException();
        anInterface20Array5805[anInt5813--] = null;
        interface20.method74(119);
        int i_85_ = 37 / ((10 - i) / 60);
        if ((anInt5813 ^ 0xffffffff) > -1)
            anInterface20_5806 = null;
        else {
            anInterface20_5806 = anInterface20Array5805[anInt5813];
            anInterface20_5806.method76((byte) -67);
        }
    }

    private final void method861(int i) {
        OpenGL.glDepthMask(aBoolean5833 && aBoolean5927);
        if (i == 0)
            anInt5722++;
    }

    private final void method862(byte i) {
        anInt5666++;
        if (i != -97)
            method876(-66, 68, 84, 74);
        if (aCanvas5751 == null)
            anInt5693 = anInt5601 = 0;
        else {
            Dimension dimension = aCanvas5751.getSize();
            anInt5693 = dimension.width;
            anInt5601 = dimension.height;
        }
        if (anInterface20_5807 == null) {
            ((ha_Sub2) this).anInt5597 = anInt5601;
            ((ha_Sub2) this).anInt5696 = anInt5693;
            method900((byte) 14);
        }
        method884((byte) -34);
        la();
    }

    final void method863(int i) {
        if ((anInt5827 ^ 0xffffffff) != -9) {
            method871(i + 3);
            method899(2286, true);
            method913(true, i + 1);
            method870(45, true);
            method885(i ^ 0xffffffff, 1);
            anInt5827 = 8;
        }
        anInt5717++;
        if (i != -1)
            j();
    }

    final int I() {
        anInt5738++;
        int i = anInt5952;
        anInt5952 = 0;
        return i;
    }

    final void method864(int i) {
        if (i < 101)
            ((ha_Sub2) this).aBoolean5837 = false;
        anInt5651++;
        if ((anInt5827 ^ 0xffffffff) != -3) {
            method852(0);
            method899(2286, false);
            method878(false, -118);
            method913(false, 0);
            method870(91, false);
            method882(-2, (byte) 108);
            anInt5827 = 2;
        }
    }

    final void method865(Interface20 interface20, int i) {
        anInt5668++;
        if (i != 14908)
            aBoolean5875 = true;
        if (anInt5814 >= 3)
            throw new RuntimeException();
        if ((anInt5814 ^ 0xffffffff) <= -1)
            anInterface20Array5808[anInt5814].method73(-19346);
        anInterface20_5807 = anInterface20Array5808[++anInt5814] = interface20;
        anInterface20_5807.method75(true);
    }

    final void h(int i) {
        anInt5675++;
        method903(0);
    }

    final synchronized void method866(int i, int i_86_, int i_87_) {
        if (i_86_ != -5)
            ((ha_Sub2) this).anInt5777 = -95;
        anInt5732++;
        Node_Sub37 class248_sub37 = new Node_Sub37(i_87_);
        ((Node) class248_sub37).id = (long) i;
        aClass293_5819.method3109(class248_sub37, -118);
    }

    final void method867(float f, boolean bool) {
        anInt5707++;
        if (f != aFloat5843) {
            aFloat5843 = f;
            if (anInt5903 == 3)
                method879(5889);
        }
        if (bool != false)
            ((ha_Sub2) this).aBoolean5872 = false;
    }

    private final void method868(boolean bool) {
        anInt5662++;
        Node_Sub12.aFloatArray6959[3] = 1.0F;
        Node_Sub12.aFloatArray6959[0] = ((ha_Sub2) this).aFloat5884 * ((ha_Sub2) this).aFloat5840;
        Node_Sub12.aFloatArray6959[2] = ((ha_Sub2) this).aFloat5840 * ((ha_Sub2) this).aFloat5893;
        Node_Sub12.aFloatArray6959[1] = ((ha_Sub2) this).aFloat5840 * ((ha_Sub2) this).aFloat5867;
        if (bool == true) {
            OpenGL.glLightfv(16384, 4609, Node_Sub12.aFloatArray6959, 0);
            Node_Sub12.aFloatArray6959[2] = -((ha_Sub2) this).aFloat5846 * ((ha_Sub2) this).aFloat5893;
            Node_Sub12.aFloatArray6959[1] = -((ha_Sub2) this).aFloat5846 * ((ha_Sub2) this).aFloat5867;
            Node_Sub12.aFloatArray6959[0] = ((ha_Sub2) this).aFloat5884 * -((ha_Sub2) this).aFloat5846;
            Node_Sub12.aFloatArray6959[3] = 1.0F;
            OpenGL.glLightfv(16385, 4609, Node_Sub12.aFloatArray6959, 0);
        }
    }

    final Interface6 method869(byte i, int i_88_, boolean bool, int i_89_, byte[] is) {
        int i_90_ = -57 % ((i - 37) / 51);
        anInt5621++;
        if (aBoolean5842 && (!bool || aBoolean5942))
            return new Class249_Sub2(this, i_89_, is, i_88_, bool);
        return new Class349_Sub1(this, i_89_, is, i_88_);
    }

    final void method870(int i, boolean bool) {
        if (i >= 25) {
            if (!aBoolean5833 != !bool) {
                aBoolean5833 = bool;
                method861(0);
                anInt5827 &= ~0x1f;
            }
            anInt5770++;
        }
    }

    private final void method871(int i) {
        anInt5720++;
        if ((anInt5903 ^ 0xffffffff) != -3) {
            anInt5903 = 2;
            method914((byte) 91);
            method919(0);
            anInt5827 &= ~0x7;
        }
        if (i != 2)
            ((ha_Sub2) this).aClass223_5895 = null;
    }

    final void a(Canvas canvas) {
        aLong5647 = 0L;
        anInt5763++;
        aCanvas5751 = null;
        if (canvas != null && canvas != aCanvas5610) {
            if (aHashtable5617.containsKey(canvas)) {
                Long var_long = (Long) aHashtable5617.get(canvas);
                aLong5647 = var_long.longValue();
                aCanvas5751 = canvas;
            }
        } else {
            aCanvas5751 = aCanvas5610;
            aLong5647 = aLong5599;
        }
        if (aCanvas5751 == null || aLong5647 == 0L)
            throw new RuntimeException();
        anOpenGL5733.setSurface(aLong5647);
        method862((byte) -97);
    }

    final int XA() {
        anInt5692++;
        return anInt5858;
    }

    private final void method872(int i) {
        anInt5663++;
        if (i != 1)
            aFloat5843 = 0.36495084F;
        if ((anInt5827 ^ 0xffffffff) != -2) {
            method852(0);
            method899(i ^ 0x8ef, false);
            method878(false, -120);
            method913(false, 0);
            method870(86, false);
            method889(-2, null);
            method882(-2, (byte) 97);
            method881((byte) 113, 1);
            anInt5827 = 1;
        }
    }

    final void method873(Interface20 interface20, int i) {
        anInt5762++;
        if (i != 0)
            C(false);
        if (!((ha_Sub2) this).aBoolean5852) {
            if (anInt5809 >= 3)
                throw new RuntimeException();
            if ((anInt5809 ^ 0xffffffff) <= -1)
                anInterface20Array5810[anInt5809].method77(true);
            anInterface20_5806 = anInterface20_5807 = anInterface20Array5810[++anInt5809] = interface20;
            anInterface20_5806.method72(-1358);
        } else {
            method906(interface20, 120);
            method865(interface20, 14908);
        }
    }

    final int M() {
        anInt5652++;
        int i = anInt5949;
        anInt5949 = 0;
        return i;
    }

    final synchronized void method874(int i, int i_91_) {
        anInt5787++;
        if (i_91_ != -15493)
            ((ha_Sub2) this).aFloat5940 = -0.11671008F;
        Node_Sub37 class248_sub37 = new Node_Sub37(i);
        aClass293_5821.method3109(class248_sub37, -93);
    }

    final Class136_Sub3 method875(int i) {
        if (i != 1)
            ((ha_Sub2) this).aClass162_Sub2_5874 = null;
        anInt5633++;
        if (aClass316_Sub1_5911 == null)
            return null;
        return aClass316_Sub1_5911.method3293(true);
    }

    final void a(float f, float f_92_, float f_93_) {
        Class224.aFloat2541 = f_92_;
        Class258.aFloat2955 = f_93_;
        anInt5741++;
        Class141.aFloat5058 = f;
    }

    final void a(int i, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_) {
        anInt5718++;
        if ((i_95_ ^ 0xffffffff) != (i ^ 0xffffffff) || i_94_ != i_96_) {
            method872(1);
            method885(0, i_98_);
            float f = (float) i_95_ - (float) i;
            float f_102_ = (float) i_96_ - (float) i_94_;
            float f_103_ = (float) (1.0 / Math.sqrt((double) (f_102_ * f_102_ + f * f)));
            f *= f_103_;
            OpenGL.glColor4ub((byte) (i_97_ >> -789191088), (byte) (i_97_ >> -1006228824), (byte) i_97_, (byte) (i_97_ >> 1884935992));
            i_101_ %= i_99_ + i_100_;
            f_102_ *= f_103_;
            float f_104_ = f * (float) i_99_;
            float f_105_ = (float) i_99_ * f_102_;
            float f_106_ = 0.0F;
            float f_107_ = 0.0F;
            float f_108_ = f_104_;
            float f_109_ = f_105_;
            if ((i_101_ ^ 0xffffffff) < (i_99_ ^ 0xffffffff)) {
                f_107_ = (float) (-i_101_ + (i_99_ - -i_100_)) * f_102_;
                f_106_ = f * (float) (-i_101_ + (i_99_ - -i_100_));
            } else {
                f_108_ = (float) (-i_101_ + i_99_) * f;
                f_109_ = f_102_ * (float) (i_99_ + -i_101_);
            }
            float f_110_ = f_106_ + (0.35F + (float) i);
            float f_111_ = f_107_ + ((float) i_94_ + 0.35F);
            float f_112_ = (float) i_100_ * f;
            float f_113_ = (float) i_100_ * f_102_;
            for (; ; ) {
                if (i >= i_95_) {
                    if (0.35F + (float) i_95_ > f_110_)
                        break;
                    if ((float) i_95_ > f_110_ + f_108_)
                        f_108_ = -f_110_ + (float) i_95_;
                } else {
                    if (0.35F + (float) i_95_ < f_110_)
                        break;
                    if (f_108_ + f_110_ > (float) i_95_)
                        f_108_ = (float) i_95_ - f_110_;
                }
                if (i_96_ > i_94_) {
                    if (f_111_ > (float) i_96_ + 0.35F)
                        break;
                    if (f_111_ + f_109_ > (float) i_96_)
                        f_109_ = -f_111_ + (float) i_96_;
                } else {
                    if (f_111_ < (float) i_96_ + 0.35F)
                        break;
                    if ((float) i_96_ > f_109_ + f_111_)
                        f_109_ = -f_111_ + (float) i_96_;
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(f_110_, f_111_);
                OpenGL.glVertex2f(f_108_ + f_110_, f_109_ + f_111_);
                OpenGL.glEnd();
                f_111_ += f_113_ + f_109_;
                f_110_ += f_112_ + f_108_;
                f_108_ = f_104_;
                f_109_ = f_105_;
            }
        }
    }

    final void method876(int i, int i_114_, int i_115_, int i_116_) {
        if (i_114_ != 24873)
            aString5896 = null;
        anInt5750++;
        OpenGL.glDrawArrays(i, i_116_, i_115_);
    }

    final Node_Sub42 a(int i, int i_117_, int i_118_, int i_119_, int i_120_, float f) {
        anInt5742++;
        return new Node_Sub42_Sub2(i, i_117_, i_118_, i_119_, i_120_, f);
    }

    final void b(boolean bool) {
        anInt5613++;
    }

    final Interface1 method877(int i, byte i_121_, byte[] is, int i_122_, boolean bool) {
        anInt5671++;
        if (aBoolean5842 && (!bool || aBoolean5942))
            return new Class249_Sub1(this, i, is, i_122_, bool);
        if (i_121_ != -85)
            aBoolean5942 = true;
        return new Class349_Sub2(this, i, is, i_122_);
    }

    final boolean v() {
        anInt5607++;
        return false;
    }

    final void method878(boolean bool, int i) {
        if (i <= -96) {
            anInt5680++;
            if (!bool != !aBoolean5857) {
                aBoolean5857 = bool;
                method912((byte) 125);
                anInt5827 &= ~0x7;
            }
        }
    }

    final void K(int[] is) {
        is[0] = anInt5841;
        is[1] = anInt5917;
        is[3] = anInt5931;
        anInt5740++;
        is[2] = anInt5906;
    }

    final void da(int i, int i_123_, int i_124_, int[] is) {
        anInt5771++;
        float f = ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6797) + ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6793) * (float) i_124_ + ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6791) * (float) i_123_ + (float) i * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6775))));
        if ((float) ((ha_Sub2) this).anInt5897 > f || f > (float) anInt5858)
            is[0] = is[1] = is[2] = -1;
        else {
            int i_125_ = (int) ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6780 + ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6785 * (float) i_124_) + ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6784) * (float) i_123_ + ((float) i * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6794))))) * (float) ((ha_Sub2) this).anInt5864 / f);
            int i_126_ = (int) ((float) ((ha_Sub2) this).anInt5863 * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6770 + (((float) i_124_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6786)) + (((float) i_123_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6772)) + ((float) i * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6761))))) / f);
            if (((ha_Sub2) this).aFloat5916 <= (float) i_125_ && ((ha_Sub2) this).aFloat5844 >= (float) i_125_ && ((ha_Sub2) this).aFloat5940 <= (float) i_126_ && (float) i_126_ <= ((ha_Sub2) this).aFloat5900) {
                is[1] = (int) (-((ha_Sub2) this).aFloat5940 + (float) i_126_);
                is[0] = (int) (-((ha_Sub2) this).aFloat5916 + (float) i_125_);
                is[2] = (int) f;
            } else
                is[0] = is[1] = is[2] = -1;
        }
    }

    private final void method879(int i) {
        anInt5689++;
        float f = (aFloat5843 * (float) -((ha_Sub2) this).anInt5890 / (float) ((ha_Sub2) this).anInt5864);
        float f_127_ = (aFloat5843 * (float) -((ha_Sub2) this).anInt5933 / (float) ((ha_Sub2) this).anInt5863);
        float f_128_ = (aFloat5843 * (float) (-((ha_Sub2) this).anInt5890 + ((ha_Sub2) this).anInt5696) / (float) ((ha_Sub2) this).anInt5864);
        float f_129_ = (aFloat5843 * (float) (((ha_Sub2) this).anInt5597 - ((ha_Sub2) this).anInt5933) / (float) ((ha_Sub2) this).anInt5863);
        OpenGL.glMatrixMode(i);
        OpenGL.glLoadIdentity();
        if (f != f_128_ && f_129_ != f_127_)
            OpenGL.glOrtho((double) f, (double) f_128_, (double) -f_129_, (double) -f_127_, (double) ((ha_Sub2) this).anInt5897, (double) anInt5858);
        OpenGL.glMatrixMode(5888);
    }

    final void method880(boolean bool, int i) {
        if (anInt5941 != i) {
            OpenGL.glActiveTexture(i + 33984);
            anInt5941 = i;
        }
        if (bool != true)
            method911(-21, -9, -89, (byte) -106);
        anInt5779++;
    }

    final Interface14 a(Interface13 interface13, Interface2 interface2) {
        anInt5673++;
        return null;
    }

    final void x() {
        anInt5628++;
    }

    final void method881(byte i, int i_130_) {
        if ((i_130_ ^ 0xffffffff) != -2) {
            if ((i_130_ ^ 0xffffffff) != -1) {
                if ((i_130_ ^ 0xffffffff) != -3) {
                    if (i_130_ == 3)
                        method858(122, 8448, 260);
                    else if ((i_130_ ^ 0xffffffff) == -5)
                        method858(118, 34023, 34023);
                } else
                    method858(121, 7681, 34165);
            } else
                method858(121, 8448, 8448);
        } else
            method858(127, 7681, 7681);
        if (i < 111)
            method905(false, 85, 39, null, -13);
        anInt5618++;
    }

    final void b(int i, int i_131_, int i_132_, int i_133_, double d) {
        anInt5685++;
    }

    ha_Sub2(Canvas canvas, d var_d, int i) {
        super(var_d);
        anInterface20Array5810 = new Interface20[4];
        anInt5814 = -1;
        new Class64();
        new Class65(16);
        aClass293_5816 = new Class293();
        aClass293_5819 = new Class293();
        aClass293_5820 = new Class293();
        aClass293_5821 = new Class293();
        aClass293_5822 = new Class293();
        aClass293_5823 = new Class293();
        aClass293_5824 = new Class293();
        ((ha_Sub2) this).aClass238_Sub3_5832 = new Class238_Sub3();
        ((ha_Sub2) this).aClass238_Sub3_5834 = new Class238_Sub3();
        ((ha_Sub2) this).aClass238_Sub3_5835 = new Class238_Sub3();
        ((ha_Sub2) this).aFloatArray5838 = new float[4];
        anInt5841 = 0;
        anInt5851 = -1;
        ((ha_Sub2) this).anInt5854 = -1;
        ((ha_Sub2) this).anInt5879 = -1;
        ((ha_Sub2) this).anInt5863 = 512;
        anInt5870 = 0;
        aFloatArray5859 = new float[4];
        ((ha_Sub2) this).aFloat5846 = -1.0F;
        ((ha_Sub2) this).aFloat5884 = 1.0F;
        ((ha_Sub2) this).aFloat5867 = 1.0F;
        ((ha_Sub2) this).anInt5880 = 0;
        aFloat5843 = 1.0F;
        ((ha_Sub2) this).anInt5882 = 0;
        aFloat5899 = -1.0F;
        anInt5892 = 0;
        aBoolean5873 = false;
        ((ha_Sub2) this).anInt5890 = 0;
        ((ha_Sub2) this).anInt5864 = 512;
        anInt5858 = 3584;
        aFloatArray5839 = new float[4];
        ((ha_Sub2) this).anInt5897 = 50;
        anInt5917 = 0;
        aClass248_Sub42Array5920 = new Node_Sub42[Class279_Sub2_Sub2.anInt9838];
        ((ha_Sub2) this).aFloat5840 = -1.0F;
        aFloat5924 = -1.0F;
        ((ha_Sub2) this).aFloat5919 = 3584.0F;
        anInt5906 = 0;
        anInt5923 = 8448;
        ((ha_Sub2) this).anInt5856 = -1;
        aFloat5932 = 1.0F;
        ((ha_Sub2) this).anInt5933 = 0;
        anInt5891 = 8448;
        aFloatArray5937 = new float[16];
        ((ha_Sub2) this).aFloat5893 = 1.0F;
        aBoolean5927 = true;
        anInt5931 = 0;
        ((ha_Sub2) this).anInt5921 = -1;
        ((ha_Sub2) this).aFloat5944 = 3584.0F;
        aFloat5902 = 0.0F;
        aFloatArray5945 = new float[4];
        ((ha_Sub2) this).aClass248_Sub9_Sub1_5845 = new Node_Sub9_Sub1(8192);
        ((ha_Sub2) this).anIntArray5947 = new int[1];
        ((ha_Sub2) this).anIntArray5950 = new int[1];
        ((ha_Sub2) this).anIntArray5948 = new int[1];
        ((ha_Sub2) this).aByteArray5951 = new byte[16384];
        ((ha_Sub2) this).anInt5777 = i;
        aCanvas5751 = aCanvas5610 = canvas;
        if (!Class111.method776(-103, "jaclib"))
            throw new RuntimeException("");
        if (!Class111.method776(-112, "jaggl"))
            throw new RuntimeException("");
        try {
            anOpenGL5733 = new OpenGL();
            aLong5647 = aLong5599 = anOpenGL5733.init(canvas, 8, 8, 8, 24, 0, ((ha_Sub2) this).anInt5777);
            if (aLong5599 == 0L)
                throw new RuntimeException("");
            method903(0);
            int i_134_ = method894(false);
            if ((i_134_ ^ 0xffffffff) != -1)
                throw new RuntimeException("");
            ((ha_Sub2) this).anInt5934 = !((ha_Sub2) this).aBoolean5872 ? 5121 : 33639;
            if ((aString5912.indexOf("radeon") ^ 0xffffffff) != 0) {
                int i_135_ = 0;
                boolean bool = false;
                boolean bool_136_ = false;
                String[] strings = Class80.method583(122, aString5912.replace('/', ' '), ' ');
                for (int i_137_ = 0; (strings.length ^ 0xffffffff) < (i_137_ ^ 0xffffffff); i_137_++) {
                    String string = strings[i_137_];
                    try {
                        if ((string.length() ^ 0xffffffff) < -1) {
                            if ((string.charAt(0) ^ 0xffffffff) == -121 && string.length() >= 3 && Class303.method3204(string.substring(1, 3), 10)) {
                                bool_136_ = true;
                                string = string.substring(1);
                            }
                            if (string.equals("hd"))
                                bool = true;
                            else {
                                if (string.startsWith("hd")) {
                                    bool = true;
                                    string = string.substring(2);
                                }
                                if ((string.length() ^ 0xffffffff) <= -5 && Class303.method3204(string.substring(0, 4), 10)) {
                                    i_135_ = (Class282_Sub21.method3012((byte) -127, string.substring(0, 4)));
                                    break;
                                }
                            }
                        }
                    } catch (Exception exception) {
                        /* empty */
                    }
                }
                if (!bool || i_135_ < 4000)
                    ((ha_Sub2) this).aBoolean5907 = false;
                if (!bool_136_ && !bool) {
                    if ((i_135_ ^ 0xffffffff) <= -7001 && (i_135_ ^ 0xffffffff) >= -8000)
                        aBoolean5842 = false;
                    if ((i_135_ ^ 0xffffffff) <= -7001 && i_135_ <= 9250)
                        ((ha_Sub2) this).aBoolean5910 = false;
                }
                ((ha_Sub2) this).aBoolean5837 &= anOpenGL5733.a("GL_ARB_half_float_pixel");
                aBoolean5942 = aBoolean5842;
                ((ha_Sub2) this).aBoolean5877 = true;
            }
            if ((aString5896.indexOf("intel") ^ 0xffffffff) != 0)
                ((ha_Sub2) this).aBoolean5836 = false;
            aBoolean5943 = !aString5896.equals("s3 graphics");
            if (aBoolean5842) {
                try {
                    int[] is = new int[1];
                    OpenGL.glGenBuffersARB(1, is, 0);
                } catch (Throwable throwable) {
                    throw new RuntimeException("");
                }
            }
            Class48.method361(false, true, true);
            aBoolean5802 = true;
            aClass359_5793 = new Class359(this, ((ha) this).aD1414);
            method853((byte) 113);
            ((ha_Sub2) this).aClass382_5801 = new Class382(this);
            aClass347_5769 = new Class347(this);
            if (aClass347_5769.method3729((byte) -127)) {
                aClass248_Sub11_Sub1_5776 = new Node_Sub11_Sub1(this);
                if (!aClass248_Sub11_Sub1_5776.method2255(0)) {
                    aClass248_Sub11_Sub1_5776.method2245(false);
                    aClass248_Sub11_Sub1_5776 = null;
                }
            }
            aClass371_5773 = new Class371(this);
            method886(false);
            method862((byte) -97);
            h();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            p();
            throw new RuntimeException("");
        }
    }

    final void method882(int i, byte i_138_) {
        method907(i, true, 37922160);
        anInt5686++;
        int i_139_ = -18 / ((15 - i_138_) / 55);
    }

    final void method883(int i, Interface20 interface20) {
        anInt5711++;
        if ((anInt5814 ^ 0xffffffff) > -1 || interface20 != anInterface20Array5808[anInt5814])
            throw new RuntimeException();
        anInterface20Array5808[anInt5814--] = null;
        interface20.method73(-19346);
        if (anInt5814 < 0)
            anInterface20_5807 = null;
        else {
            anInterface20_5807 = anInterface20Array5808[anInt5814];
            anInterface20_5807.method75(true);
        }
        if (i != 20133)
            ((ha_Sub2) this).aClass238_Sub3_5832 = null;
    }

    final void c(int i) {
        anInt5706++;
        if ((i ^ 0xffffffff) != -2)
            throw new IllegalArgumentException("");
    }

    final void pa() {
        anInt5758++;
        ((ha_Sub2) this).aBoolean5914 = false;
    }

    final void a(int i, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_) {
        anInt5774++;
        method872(1);
        method885(0, i_144_);
        float f = (float) i_141_ - (float) i;
        float f_145_ = (float) i_142_ - (float) i_140_;
        if (f == 0.0F && f_145_ == 0.0F)
            f = 1.0F;
        else {
            float f_146_ = (float) (1.0 / Math.sqrt((double) (f * f + f_145_ * f_145_)));
            f_145_ *= f_146_;
            f *= f_146_;
        }
        OpenGL.glColor4ub((byte) (i_143_ >> -1378342672), (byte) (i_143_ >> 609228616), (byte) i_143_, (byte) (i_143_ >> 1770783256));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(0.35F + (float) i, 0.35F + (float) i_140_);
        OpenGL.glVertex2f(0.35F + ((float) i_141_ + f), 0.35F + (f_145_ + (float) i_142_));
        OpenGL.glEnd();
    }

    final void L(int i, int i_147_, int i_148_) {
        anInt5614++;
        if (((ha_Sub2) this).anInt5879 != i || (i_147_ ^ 0xffffffff) != (((ha_Sub2) this).anInt5921 ^ 0xffffffff) || (((ha_Sub2) this).anInt5882 ^ 0xffffffff) != (i_148_ ^ 0xffffffff)) {
            ((ha_Sub2) this).anInt5879 = i;
            ((ha_Sub2) this).anInt5882 = i_148_;
            ((ha_Sub2) this).anInt5921 = i_147_;
            method859(71);
            method857((byte) 91);
        }
    }

    final boolean j() {
        anInt5654++;
        return false;
    }

    final boolean A() {
        anInt5734++;
        if (!aBoolean5939 || q() && !aBoolean5925)
            return false;
        return true;
    }

    final void h() {
        anInt5726++;
        if (aBoolean5943 && (((ha_Sub2) this).anInt5696 ^ 0xffffffff) < -1 && (((ha_Sub2) this).anInt5597 ^ 0xffffffff) < -1) {
            int i = anInt5841;
            int i_149_ = anInt5906;
            int i_150_ = anInt5917;
            int i_151_ = anInt5931;
            la();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            method884((byte) -67);
            method899(2286, false);
            method878(false, -98);
            method913(false, 0);
            method870(45, false);
            method889(-2, null);
            method882(-2, (byte) -96);
            method881((byte) 118, 1);
            method885(0, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, ((ha_Sub2) this).anInt5696, ((ha_Sub2) this).anInt5597, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            KA(i, i_150_, i_149_, i_151_);
        }
    }

    final void method884(byte i) {
        if (anInt5903 != 0) {
            anInt5903 = 0;
            anInt5827 &= ~0x1f;
        }
        anInt5719++;
        if (i >= -9)
            k();
    }

    final void method885(int i, int i_152_) {
        anInt5754++;
        if (i != 0)
            aLong5599 = -97L;
        if (i_152_ != anInt5825) {
            int i_153_;
            boolean bool;
            boolean bool_154_;
            if ((i_152_ ^ 0xffffffff) == -2) {
                bool = true;
                bool_154_ = true;
                i_153_ = 1;
            } else if (i_152_ == 2) {
                i_153_ = 2;
                bool = false;
                bool_154_ = true;
            } else if (i_152_ == 128) {
                bool_154_ = true;
                i_153_ = 3;
                bool = true;
            } else {
                bool_154_ = true;
                i_153_ = 0;
                bool = false;
            }
            if (!aBoolean5830 != !bool_154_) {
                OpenGL.glColorMask(bool_154_, bool_154_, bool_154_, true);
                aBoolean5830 = bool_154_;
            }
            if (bool == !aBoolean5828) {
                if (!bool)
                    OpenGL.glDisable(3008);
                else
                    OpenGL.glEnable(3008);
                aBoolean5828 = bool;
            }
            if ((i_153_ ^ 0xffffffff) != (anInt5826 ^ 0xffffffff)) {
                if (i_153_ == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (i_153_ != 2) {
                    if (i_153_ == 3) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    } else
                        OpenGL.glDisable(3042);
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                }
                anInt5826 = i_153_;
            }
            anInt5827 &= ~0x1c;
            anInt5825 = i_152_;
        }
    }

    final void a(za var_za) {
        ((ha_Sub2) this).aNativeHeap5799 = ((za_Sub2) (za_Sub2) var_za).aNativeHeap9810;
        anInt5786++;
        if (anInterface6_5926 == null) {
            Node_Sub9_Sub1 class248_sub9_sub1 = new Node_Sub9_Sub1(80);
            if (!((ha_Sub2) this).aBoolean5872) {
                class248_sub9_sub1.method2225(4440, -1.0F);
                class248_sub9_sub1.method2225(4440, -1.0F);
                class248_sub9_sub1.method2225(4440, 0.0F);
                class248_sub9_sub1.method2225(4440, 0.0F);
                class248_sub9_sub1.method2225(4440, 1.0F);
                class248_sub9_sub1.method2225(4440, 1.0F);
                class248_sub9_sub1.method2225(4440, -1.0F);
                class248_sub9_sub1.method2225(4440, 0.0F);
                class248_sub9_sub1.method2225(4440, 1.0F);
                class248_sub9_sub1.method2225(4440, 1.0F);
                class248_sub9_sub1.method2225(4440, 1.0F);
                class248_sub9_sub1.method2225(4440, 1.0F);
                class248_sub9_sub1.method2225(4440, 0.0F);
                class248_sub9_sub1.method2225(4440, 1.0F);
                class248_sub9_sub1.method2225(4440, 0.0F);
                class248_sub9_sub1.method2225(4440, -1.0F);
                class248_sub9_sub1.method2225(4440, 1.0F);
                class248_sub9_sub1.method2225(4440, 0.0F);
                class248_sub9_sub1.method2225(4440, 0.0F);
                class248_sub9_sub1.method2225(4440, 0.0F);
            } else {
                class248_sub9_sub1.method2226(103, -1.0F);
                class248_sub9_sub1.method2226(124, -1.0F);
                class248_sub9_sub1.method2226(109, 0.0F);
                class248_sub9_sub1.method2226(103, 0.0F);
                class248_sub9_sub1.method2226(62, 1.0F);
                class248_sub9_sub1.method2226(127, 1.0F);
                class248_sub9_sub1.method2226(106, -1.0F);
                class248_sub9_sub1.method2226(47, 0.0F);
                class248_sub9_sub1.method2226(43, 1.0F);
                class248_sub9_sub1.method2226(67, 1.0F);
                class248_sub9_sub1.method2226(114, 1.0F);
                class248_sub9_sub1.method2226(111, 1.0F);
                class248_sub9_sub1.method2226(83, 0.0F);
                class248_sub9_sub1.method2226(55, 1.0F);
                class248_sub9_sub1.method2226(91, 0.0F);
                class248_sub9_sub1.method2226(123, -1.0F);
                class248_sub9_sub1.method2226(54, 1.0F);
                class248_sub9_sub1.method2226(48, 0.0F);
                class248_sub9_sub1.method2226(29, 0.0F);
                class248_sub9_sub1.method2226(61, 0.0F);
            }
            anInterface6_5926 = method869((byte) 92, ((ByteStream) class248_sub9_sub1).offset, false, 20, (((ByteStream) class248_sub9_sub1).buffer));
            ((ha_Sub2) this).aClass140_5898 = new Class140(anInterface6_5926, 5126, 3, 0);
            ((ha_Sub2) this).aClass140_5918 = new Class140(anInterface6_5926, 5126, 2, 12);
            aClass96_5795.method703(this, 111);
        }
    }

    private final void method886(boolean bool) {
        method882(-2, (byte) -96);
        anInt5735++;
        for (int i = -1 + ((ha_Sub2) this).anInt5888; i >= 0; i--) {
            method880(true, i);
            method889(-2, null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        method858(-58, 8448, 8448);
        method911(770, 34168, 2, (byte) 4);
        method856(bool);
        anInt5825 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        anInt5826 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        aBoolean5828 = true;
        OpenGL.glColorMask(true, true, true, true);
        aBoolean5830 = true;
        method899(2286, true);
        method878(true, -109);
        method913(true, 0);
        method870(125, true);
        method884((byte) -99);
        anOpenGL5733.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] fs = {0.0F, 0.0F, 0.0F, 1.0F};
        for (int i = 0; (i ^ 0xffffffff) > -9; i++) {
            int i_155_ = 16384 + i;
            OpenGL.glLightfv(i_155_, 4608, fs, 0);
            OpenGL.glLightf(i_155_, 4615, 0.0F);
            OpenGL.glLightf(i_155_, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        anInt5851 = ((ha_Sub2) this).anInt5879 = -1;
        la();
    }

    final Viewport t() {
        anInt5746++;
        return ((ha_Sub2) this).aClass238_Sub3_5832;
    }

    final boolean f() {
        anInt5702++;
        return true;
    }

    final void a(int i, Node_Sub42[] class248_sub42s) {
        anInt5594++;
        for (int i_156_ = 0; i_156_ < i; i_156_++)
            aClass248_Sub42Array5920[i_156_] = class248_sub42s[i_156_];
        anInt5847 = i;
        if ((anInt5903 ^ 0xffffffff) != -2)
            method908((byte) -99);
    }

    final void a(Class338 class338) {
        anInt5731++;
        aClass96_5795.method706(class338, true, this, -1);
    }

    final void method887(Interface20 interface20, int i) {
        int i_157_ = -101 % ((-43 - i) / 44);
        anInt5602++;
        if (!((ha_Sub2) this).aBoolean5852) {
            if (anInt5809 < 0 || anInterface20Array5810[anInt5809] != interface20)
                throw new RuntimeException();
            anInterface20Array5810[anInt5809--] = null;
            interface20.method77(true);
            if (anInt5809 < 0)
                anInterface20_5806 = anInterface20_5807 = null;
            else {
                anInterface20_5806 = anInterface20_5807 = anInterface20Array5810[anInt5809];
                anInterface20_5806.method72(-1358);
            }
        } else {
            method860(interface20, 115);
            method883(20133, interface20);
        }
    }

    final void u() {
        anInt5729++;
        if (aClass248_Sub11_Sub1_5776 != null && aClass248_Sub11_Sub1_5776.method2243(818)) {
            aClass347_5769.method3731(true, aClass248_Sub11_Sub1_5776);
            aClass359_5793.method3802((byte) -122);
        }
    }

    private final void method888(byte i) {
        if (i > -93)
            T(32, -34, -80, 88);
        if ((anInt5841 ^ 0xffffffff) < (anInt5906 ^ 0xffffffff) || (anInt5931 ^ 0xffffffff) > (anInt5917 ^ 0xffffffff))
            OpenGL.glScissor(0, 0, 0, 0);
        else
            OpenGL.glScissor(anInt5841 + anInt5870, -anInt5931 + (((ha_Sub2) this).anInt5597 + anInt5892), anInt5906 - anInt5841, anInt5931 - anInt5917);
        anInt5716++;
    }

    final int i() {
        anInt5744++;
        return ((ha_Sub2) this).anInt5897;
    }

    final void a(Viewport viewport) {
        anInt5690++;
        ((ha_Sub2) this).aClass238_Sub3_5832.method1868(viewport);
        ((ha_Sub2) this).aClass238_Sub3_5834.method1868(((ha_Sub2) this).aClass238_Sub3_5832);
        ((ha_Sub2) this).aClass238_Sub3_5834.method1905(-123);
        ((ha_Sub2) this).aClass238_Sub3_5835.method1904((byte) 33, ((ha_Sub2) this).aClass238_Sub3_5834);
        if (anInt5903 != 1)
            method919(0);
    }

    final Class129 a(Class157 class157, boolean bool) {
        anInt5695++;
        int[] is = new int[(((Class157) class157).anInt1874 * ((Class157) class157).anInt1873)];
        int i = 0;
        int i_158_ = 0;
        if (((Class157) class157).aByteArray1875 == null) {
            for (int i_159_ = 0; ((Class157) class157).anInt1874 > i_159_; i_159_++) {
                for (int i_160_ = 0; ((Class157) class157).anInt1873 > i_160_; i_160_++) {
                    int i_161_ = (((Class157) class157).anIntArray1872[((Class157) class157).aByteArray1868[i++] & 0xff]);
                    is[i_158_++] = ((i_161_ ^ 0xffffffff) != -1 ? Class358.retrieveLooksSettings(i_161_, -16777216) : 0);
                }
            }
        } else {
            for (int i_162_ = 0; ((Class157) class157).anInt1874 > i_162_; i_162_++) {
                for (int i_163_ = 0; ((i_163_ ^ 0xffffffff) > (((Class157) class157).anInt1873 ^ 0xffffffff)); i_163_++) {
                    is[i_158_++] = (Class358.retrieveLooksSettings((((Class157) class157).anIntArray1872[Class112.method794(255, (((Class157) class157).aByteArray1868[i]))]), (((Class157) class157).aByteArray1875[i] << 1745823032)));
                    i++;
                }
            }
        }
        Class129 class129 = this.method813(((Class157) class157).anInt1874, (byte) 99, ((Class157) class157).anInt1873, is, 0, ((Class157) class157).anInt1873);
        class129.method1165(((Class157) class157).anInt1869, ((Class157) class157).anInt1876, ((Class157) class157).anInt1871, ((Class157) class157).anInt1870);
        return class129;
    }

    final void a(Canvas canvas, int i, int i_164_) {
        anInt5679++;
        if (aCanvas5610 == canvas)
            throw new RuntimeException();
        if (!aHashtable5617.containsKey(canvas)) {
            if (!canvas.isShowing())
                throw new RuntimeException();
            try {
                Class var_class = Class.forName("java.awt.Canvas");
                Method method = var_class.getMethod("setIgnoreRepaint", new Class[]{Boolean.TYPE});
                method.invoke(canvas, new Object[]{Boolean.TRUE});
            } catch (Exception exception) {
                /* empty */
            }
            long l = anOpenGL5733.prepareSurface(canvas);
            if ((l ^ 0xffffffffffffffffL) == 0L)
                throw new RuntimeException();
            aHashtable5617.put(canvas, new Long(l));
        }
    }

    final void a(int i, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, aa var_aa, int i_170_, int i_171_) {
        anInt5590++;
        aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
        Class136_Sub4_Sub1 class136_sub4_sub1 = ((aa_Sub2) var_aa_Sub2).aClass136_Sub4_Sub1_5256;
        method864(114);
        method889(-2, ((aa_Sub2) var_aa_Sub2).aClass136_Sub4_Sub1_5256);
        method885(0, i_169_);
        method858(-27, 8448, 7681);
        method911(768, 34167, 0, (byte) 4);
        float f = (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9969 / (float) ((Class136_Sub4_Sub1) class136_sub4_sub1).anInt9964);
        float f_172_ = (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9967 / (float) ((Class136_Sub4_Sub1) class136_sub4_sub1).anInt9966);
        float f_173_ = (float) i_166_ - (float) i;
        float f_174_ = (float) i_167_ - (float) i_165_;
        float f_175_ = (float) (1.0 / Math.sqrt((double) (f_173_ * f_173_ + f_174_ * f_174_)));
        f_173_ *= f_175_;
        f_174_ *= f_175_;
        OpenGL.glColor4ub((byte) (i_168_ >> -2118626384), (byte) (i_168_ >> 372310184), (byte) i_168_, (byte) (i_168_ >> -1092571752));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (i - i_170_) * f, f_172_ * (float) (i_165_ + -i_171_));
        OpenGL.glVertex2f((float) i + 0.35F, (float) i_165_ + 0.35F);
        OpenGL.glTexCoord2f((float) (i_166_ + -i_170_) * f, f_172_ * (float) (i_167_ - i_171_));
        OpenGL.glVertex2f(0.35F + ((float) i_166_ + f_173_), 0.35F + (f_174_ + (float) i_167_));
        OpenGL.glEnd();
        method911(768, 5890, 0, (byte) 4);
    }

    final void method889(int i, Class136 class136) {
        anInt5608++;
        Class136 class136_176_ = aClass136Array5848[anInt5941];
        if (class136 != class136_176_) {
            if (class136 != null) {
                if (class136_176_ != null) {
                    if (((Class136) class136_176_).anInt4770 != ((Class136) class136).anInt4770) {
                        OpenGL.glDisable(((Class136) class136_176_).anInt4770);
                        OpenGL.glEnable(((Class136) class136).anInt4770);
                    }
                } else
                    OpenGL.glEnable(((Class136) class136).anInt4770);
                OpenGL.glBindTexture(((Class136) class136).anInt4770, class136.method1241(6598));
            } else
                OpenGL.glDisable(((Class136) class136_176_).anInt4770);
            aClass136Array5848[anInt5941] = class136;
        }
        anInt5827 &= i;
    }

    final int E() {
        anInt5598++;
        return (((ha_Sub2) this).anInt5818 + ((ha_Sub2) this).anInt5815 - -anInt5817);
    }

    private final void method890(int i) {
        if (anInt5903 != 3) {
            anInt5903 = 3;
            method879(5889);
            method919(0);
            anInt5827 &= ~0x7;
        }
        anInt5721++;
        if (i > -90)
            a(-115, -45, null, null, 37, -36, -60);
    }

    private final void method891(float f, float f_177_, float f_178_, byte i) {
        anInt5591++;
        OpenGL.glMatrixMode(5890);
        if (aBoolean5875)
            OpenGL.glLoadIdentity();
        OpenGL.glTranslatef(f, f_177_, f_178_);
        OpenGL.glMatrixMode(5888);
        if (i >= -26)
            ya();
        aBoolean5875 = true;
    }

    final void za(int i, int i_179_, int i_180_, int i_181_, int i_182_) {
        anInt5669++;
        if (i_180_ < 0)
            i_180_ = -i_180_;
        if ((i - -i_180_ ^ 0xffffffff) <= (anInt5841 ^ 0xffffffff) && (i + -i_180_ ^ 0xffffffff) >= (anInt5906 ^ 0xffffffff) && anInt5917 <= i_180_ + i_179_ && (i_179_ - i_180_ ^ 0xffffffff) >= (anInt5931 ^ 0xffffffff)) {
            method872(1);
            method885(0, i_182_);
            OpenGL.glColor4ub((byte) (i_181_ >> 618387440), (byte) (i_181_ >> -625086328), (byte) i_181_, (byte) (i_181_ >> -1481625704));
            float f = 0.35F + (float) i;
            float f_183_ = (float) i_179_ + 0.35F;
            int i_184_ = i_180_ << -1158059295;
            if ((float) i_184_ < aFloat5899) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(1.0F + f, f_183_ + 1.0F);
                OpenGL.glVertex2f(1.0F + f, f_183_ - 1.0F);
                OpenGL.glVertex2f(-1.0F + f, f_183_ - 1.0F);
                OpenGL.glVertex2f(f - 1.0F, f_183_ + 1.0F);
                OpenGL.glEnd();
            } else if (!(aFloat5924 >= (float) i_184_)) {
                OpenGL.glBegin(6);
                OpenGL.glVertex2f(f, f_183_);
                int i_185_ = 262144 / (i_180_ * 6);
                if (i_185_ > 64) {
                    if ((i_185_ ^ 0xffffffff) < -513)
                        i_185_ = 512;
                } else
                    i_185_ = 64;
                i_185_ = Class44_Sub1.method318(27690, i_185_);
                OpenGL.glVertex2f((float) i_180_ + f, f_183_);
                for (int i_186_ = -i_185_ + 16384; i_186_ > 0; i_186_ -= i_185_)
                    OpenGL.glVertex2f(f + (Class252.aFloatArray2838[i_186_] * (float) i_180_), (((float) i_180_ * Class252.aFloatArray2839[i_186_]) + f_183_));
                OpenGL.glVertex2f(f + (float) i_180_, f_183_);
                OpenGL.glEnd();
            } else {
                OpenGL.glEnable(2832);
                OpenGL.glPointSize((float) i_184_);
                OpenGL.glBegin(0);
                OpenGL.glVertex2f(f, f_183_);
                OpenGL.glEnd();
                OpenGL.glDisable(2832);
            }
        }
    }

    final int method892(boolean bool, int i) {
        anInt5714++;
        if (i == 1)
            return 7681;
        if (i == 0)
            return 8448;
        if (i != 2) {
            if (i == 3)
                return 260;
            if ((i ^ 0xffffffff) == -5)
                return 34023;
        } else
            return 34165;
        if (bool != false)
            aClass316_Sub1_5911 = null;
        throw new IllegalArgumentException();
    }

    final void a(boolean bool) {
        anInt5622++;
    }

    final void method893(boolean bool, int i, int i_187_, boolean bool_188_) {
        if (i != 0)
            t();
        if ((i_187_ ^ 0xffffffff) != (anInt5860 ^ 0xffffffff) || aBoolean5873 == !((ha_Sub2) this).aBoolean5914) {
            Class136_Sub4 class136_sub4 = null;
            int i_189_ = 0;
            byte i_190_ = 0;
            int i_191_ = 0;
            byte i_192_ = ((ha_Sub2) this).aBoolean5914 ? (byte) 3 : (byte) 0;
            if ((i_187_ ^ 0xffffffff) > -1)
                method856(false);
            else {
                class136_sub4 = aClass359_5793.method3804(68, i_187_);
                Class312 class312 = ((ha) this).aD1414.method25(i_187_, (byte) 126);
                if (((Class312) class312).aByte3643 == 0 && ((Class312) class312).aByte3642 == 0)
                    method856(false);
                else {
                    int i_193_ = !((Class312) class312).aBoolean3636 ? 128 : 64;
                    int i_194_ = i_193_ * 50;
                    method891((float) (((Class312) class312).aByte3643 * (((ha_Sub2) this).anInt5800 % i_194_)) / (float) i_194_, ((float) (((ha_Sub2) this).anInt5800 % i_194_ * ((Class312) class312).aByte3642) / (float) i_194_), 0.0F, (byte) -40);
                }
                i_189_ = ((Class312) class312).anInt3633;
                if (!((ha_Sub2) this).aBoolean5914) {
                    i_190_ = ((Class312) class312).aByte3646;
                    i_192_ = ((Class312) class312).aByte3624;
                    i_191_ = ((Class312) class312).anInt3645;
                }
            }
            aClass371_5773.method3860(i_190_, i_191_, i_192_, bool_188_, bool, 0);
            if (!aClass371_5773.method3861(class136_sub4, (byte) -59, i_189_)) {
                method889(i + -2, class136_sub4);
                method881((byte) 119, i_189_);
            }
            aBoolean5873 = ((ha_Sub2) this).aBoolean5914;
            anInt5860 = i_187_;
        }
        anInt5636++;
        anInt5827 &= ~0x7;
    }

    private final int method894(boolean bool) {
        anInt5728++;
        aString5896 = OpenGL.glGetString(7936).toLowerCase();
        int i = 0;
        aString5912 = OpenGL.glGetString(7937).toLowerCase();
        if ((aString5896.indexOf("microsoft") ^ 0xffffffff) != 0)
            i |= 0x1;
        if ((aString5896.indexOf("brian paul") ^ 0xffffffff) != 0 || aString5896.indexOf("mesa") != -1)
            i |= 0x1;
        String string = OpenGL.glGetString(7938);
        String[] strings = Class80.method583(115, string.replace('.', ' '), ' ');
        if ((strings.length ^ 0xffffffff) <= -3) {
            try {
                int i_195_ = Class282_Sub21.method3012((byte) -115, strings[0]);
                int i_196_ = Class282_Sub21.method3012((byte) -121, strings[1]);
                anInt5866 = 10 * i_195_ + i_196_;
            } catch (NumberFormatException numberformatexception) {
                i |= 0x4;
            }
        } else
            i |= 0x4;
        if (anInt5866 < 12)
            i |= 0x2;
        if (!anOpenGL5733.a("GL_ARB_multitexture"))
            i |= 0x8;
        if (!anOpenGL5733.a("GL_ARB_texture_env_combine"))
            i |= 0x20;
        int[] is = new int[1];
        OpenGL.glGetIntegerv(34018, is, 0);
        ((ha_Sub2) this).anInt5888 = is[0];
        OpenGL.glGetIntegerv(34929, is, 0);
        anInt5850 = is[0];
        OpenGL.glGetIntegerv(34930, is, 0);
        anInt5881 = is[0];
        if (((ha_Sub2) this).anInt5888 < 2 || (anInt5850 ^ 0xffffffff) > -3 || (anInt5881 ^ 0xffffffff) > -3)
            i |= 0x10;
        ((ha_Sub2) this).aBoolean5872 = Stream.b();
        aBoolean5853 = anOpenGL5733.arePbuffersAvailable();
        aBoolean5842 = anOpenGL5733.a("GL_ARB_vertex_buffer_object");
        aBoolean5939 = anOpenGL5733.a("GL_ARB_multisample");
        ((ha_Sub2) this).aBoolean5871 = anOpenGL5733.a("GL_ARB_vertex_program");
        anOpenGL5733.a("GL_ARB_fragment_program");
        ((ha_Sub2) this).aBoolean5936 = anOpenGL5733.a("GL_ARB_vertex_shader");
        ((ha_Sub2) this).aBoolean5930 = anOpenGL5733.a("GL_ARB_fragment_shader");
        ((ha_Sub2) this).aBoolean5910 = anOpenGL5733.a("GL_EXT_texture3D");
        ((ha_Sub2) this).aBoolean5837 = anOpenGL5733.a("GL_ARB_texture_rectangle");
        ((ha_Sub2) this).aBoolean5883 = anOpenGL5733.a("GL_ARB_texture_cube_map");
        ((ha_Sub2) this).aBoolean5907 = anOpenGL5733.a("GL_ARB_texture_float");
        ((ha_Sub2) this).aBoolean5913 = bool;
        ((ha_Sub2) this).aBoolean5836 = anOpenGL5733.a("GL_EXT_framebuffer_object");
        ((ha_Sub2) this).aBoolean5852 = anOpenGL5733.a("GL_EXT_framebuffer_blit");
        ((ha_Sub2) this).aBoolean5915 = anOpenGL5733.a("GL_EXT_framebuffer_multisample");
        aBoolean5925 = ((ha_Sub2) this).aBoolean5852 & ((ha_Sub2) this).aBoolean5915;
        ((ha_Sub2) this).aBoolean5869 = Class64.aString871.startsWith("mac");
        OpenGL.glGetFloatv(2834, Node_Sub12.aFloatArray6959, 0);
        aFloat5924 = Node_Sub12.aFloatArray6959[1];
        aFloat5899 = Node_Sub12.aFloatArray6959[0];
        if ((i ^ 0xffffffff) != -1)
            return i;
        return 0;
    }

    final za a(int i) {
        anInt5625++;
        za_Sub2 var_za_Sub2 = new za_Sub2(i);
        aClass293_5804.method3109(var_za_Sub2, -109);
        return var_za_Sub2;
    }

    final s a(int i, int i_197_, int[][] is, int[][] is_198_, int i_199_, int i_200_, int i_201_) {
        anInt5658++;
        return new s_Sub2(this, i_200_, i_201_, i, i_197_, is, is_198_, i_199_);
    }

    private final void method895(boolean bool) {
        anInt5659++;
        float[] fs = aFloatArray5937;
        float f = ((float) (((ha_Sub2) this).anInt5897 * -((ha_Sub2) this).anInt5890) / (float) ((ha_Sub2) this).anInt5864);
        float f_202_ = ((float) (((ha_Sub2) this).anInt5897 * (((ha_Sub2) this).anInt5696 - ((ha_Sub2) this).anInt5890)) / (float) ((ha_Sub2) this).anInt5864);
        float f_203_ = ((float) (((ha_Sub2) this).anInt5897 * ((ha_Sub2) this).anInt5933) / (float) ((ha_Sub2) this).anInt5863);
        float f_204_ = ((float) ((-((ha_Sub2) this).anInt5597 + ((ha_Sub2) this).anInt5933) * ((ha_Sub2) this).anInt5897) / (float) ((ha_Sub2) this).anInt5863);
        if (bool != true)
            ((ha_Sub2) this).aBoolean5930 = false;
        if (f_202_ != f && f_203_ != f_204_) {
            float f_205_ = (float) ((ha_Sub2) this).anInt5897 * 2.0F;
            fs[0] = f_205_ / (-f + f_202_);
            fs[12] = 0.0F;
            fs[14] = aFloat5909 = (-((float) anInt5858 * f_205_) / (float) (anInt5858 + -((ha_Sub2) this).anInt5897));
            fs[15] = 0.0F;
            fs[13] = 0.0F;
            fs[2] = 0.0F;
            fs[10] = aFloat5855 = ((float) -(((ha_Sub2) this).anInt5897 + anInt5858) / (float) (-((ha_Sub2) this).anInt5897 + anInt5858));
            fs[8] = (f + f_202_) / (f_202_ - f);
            fs[7] = 0.0F;
            fs[1] = 0.0F;
            fs[3] = 0.0F;
            fs[9] = (f_204_ + f_203_) / (-f_204_ + f_203_);
            fs[5] = f_205_ / (f_203_ - f_204_);
            fs[11] = -1.0F;
            fs[4] = 0.0F;
            fs[6] = 0.0F;
        } else {
            fs[10] = 1.0F;
            fs[5] = 1.0F;
            fs[9] = 0.0F;
            fs[7] = 0.0F;
            fs[13] = 0.0F;
            fs[1] = 0.0F;
            fs[3] = 0.0F;
            fs[12] = 0.0F;
            fs[4] = 0.0F;
            fs[15] = 1.0F;
            fs[6] = 0.0F;
            fs[2] = 0.0F;
            fs[11] = 0.0F;
            fs[8] = 0.0F;
            fs[14] = 0.0F;
            fs[0] = 1.0F;
        }
        method917((byte) 106);
    }

    final int b(int i, int i_206_) {
        anInt5760++;
        return i_206_ & i ^ i_206_;
    }

    final void a(int i, int i_207_, int i_208_, int i_209_, int i_210_, int i_211_, aa var_aa, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_) {
        anInt5678++;
        if ((i_208_ ^ 0xffffffff) != (i ^ 0xffffffff) || i_207_ != i_209_) {
            aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
            Class136_Sub4_Sub1 class136_sub4_sub1 = ((aa_Sub2) var_aa_Sub2).aClass136_Sub4_Sub1_5256;
            method864(121);
            method889(-2, ((aa_Sub2) var_aa_Sub2).aClass136_Sub4_Sub1_5256);
            method885(0, i_211_);
            method858(12, 8448, 7681);
            method911(768, 34167, 0, (byte) 4);
            float f = (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9969 / (float) (((Class136_Sub4_Sub1) class136_sub4_sub1).anInt9964));
            float f_217_ = (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9967 / (float) (((Class136_Sub4_Sub1) class136_sub4_sub1).anInt9966));
            float f_218_ = (float) -i + (float) i_208_;
            float f_219_ = (float) i_209_ - (float) i_207_;
            float f_220_ = (float) (1.0 / Math.sqrt((double) (f_218_ * f_218_ + f_219_ * f_219_)));
            f_218_ *= f_220_;
            f_219_ *= f_220_;
            i_216_ %= i_214_ + i_215_;
            OpenGL.glColor4ub((byte) (i_210_ >> -1396408464), (byte) (i_210_ >> -1788346296), (byte) i_210_, (byte) (i_210_ >> -15275272));
            float f_221_ = (float) i_214_ * f_218_;
            float f_222_ = f_219_ * (float) i_214_;
            float f_223_ = 0.0F;
            float f_224_ = 0.0F;
            float f_225_ = f_221_;
            float f_226_ = f_222_;
            if ((i_214_ ^ 0xffffffff) <= (i_216_ ^ 0xffffffff)) {
                f_225_ = f_218_ * (float) (i_214_ - i_216_);
                f_226_ = (float) (-i_216_ + i_214_) * f_219_;
            } else {
                f_224_ = f_219_ * (float) (i_215_ + (i_214_ + -i_216_));
                f_223_ = (float) (i_215_ + (i_214_ - i_216_)) * f_218_;
            }
            float f_227_ = f_223_ + (0.35F + (float) i);
            float f_228_ = 0.35F + (float) i_207_ + f_224_;
            float f_229_ = (float) i_215_ * f_218_;
            float f_230_ = f_219_ * (float) i_215_;
            for (; ; ) {
                if ((i_208_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
                    if (0.35F + (float) i_208_ < f_227_)
                        break;
                    if (f_227_ + f_225_ > (float) i_208_)
                        f_225_ = -f_227_ + (float) i_208_;
                } else {
                    if (f_227_ < 0.35F + (float) i_208_)
                        break;
                    if ((float) i_208_ > f_227_ + f_225_)
                        f_225_ = -f_227_ + (float) i_208_;
                }
                if (i_209_ <= i_207_) {
                    if (f_228_ < 0.35F + (float) i_209_)
                        break;
                    if ((float) i_209_ > f_228_ + f_226_)
                        f_226_ = (float) i_209_ - f_228_;
                } else {
                    if ((float) i_209_ + 0.35F < f_228_)
                        break;
                    if ((float) i_209_ < f_226_ + f_228_)
                        f_226_ = (float) i_209_ - f_228_;
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f(f * (f_227_ - (float) i_212_), f_217_ * ((float) -i_213_ + f_228_));
                OpenGL.glVertex2f(f_227_, f_228_);
                OpenGL.glTexCoord2f(f * (f_227_ + f_225_ - (float) i_212_), f_217_ * (f_228_ + f_226_ - (float) i_213_));
                OpenGL.glVertex2f(f_227_ + f_225_, f_226_ + f_228_);
                OpenGL.glEnd();
                f_228_ += f_230_ + f_226_;
                f_227_ += f_225_ + f_229_;
                f_226_ = f_222_;
                f_225_ = f_221_;
            }
            method911(768, 5890, 0, (byte) 4);
        }
    }

    final void p() {
        for (Node node = aClass293_5804.method3119(2); node != null; node = aClass293_5804.method3107(-127))
            ((za_Sub2) node).method2691(false);
        anInt5593++;
        if (aClass347_5769 != null)
            aClass347_5769.method3733(235);
        if (anOpenGL5733 != null) {
            method915(1136122328);
            Enumeration enumeration = aHashtable5617.keys();
            while (enumeration.hasMoreElements()) {
                Canvas canvas = (Canvas) enumeration.nextElement();
                Long var_long = (Long) aHashtable5617.get(canvas);
                anOpenGL5733.releaseSurface(canvas, var_long.longValue());
            }
            anOpenGL5733.release();
            anOpenGL5733 = null;
        }
        if (aBoolean5802) {
            Class48.method372(false, true, (byte) 119);
            aBoolean5802 = false;
        }
    }

    final Class129 a(int i, int i_231_, int i_232_, int i_233_, boolean bool) {
        anInt5715++;
        return new Class129_Sub1(this, i, i_231_, i_232_, i_233_);
    }

    final int r(int i, int i_234_, int i_235_, int i_236_, int i_237_, int i_238_, int i_239_) {
        anInt5632++;
        float f = ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6797) + ((float) i * ((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6775 + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6791) * (float) i_234_ + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6793) * (float) i_235_));
        float f_240_ = ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6797) + (((float) i_238_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6793)) + ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6791) * (float) i_237_ + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6775) * (float) i_236_)));
        int i_241_ = 0;
        if (f < (float) ((ha_Sub2) this).anInt5897 && (float) ((ha_Sub2) this).anInt5897 > f_240_)
            i_241_ |= 0x10;
        else if (f > (float) anInt5858 && (float) anInt5858 < f_240_)
            i_241_ |= 0x20;
        int i_242_ = (int) (((float) i * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6794) + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6784) * (float) i_234_ + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6785) * (float) i_235_ + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6780)) * (float) ((ha_Sub2) this).anInt5864 / (float) i_239_);
        int i_243_ = (int) ((float) ((ha_Sub2) this).anInt5864 * ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6784) * (float) i_237_ + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6794 * (float) i_236_) + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6785 * (float) i_238_) + ((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6780) / (float) i_239_);
        if (!(((ha_Sub2) this).aFloat5916 > (float) i_242_) || !(((ha_Sub2) this).aFloat5916 > (float) i_243_)) {
            if ((float) i_242_ > ((ha_Sub2) this).aFloat5844 && ((ha_Sub2) this).aFloat5844 < (float) i_243_)
                i_241_ |= 0x2;
        } else
            i_241_ |= 0x1;
        int i_244_ = (int) ((float) ((ha_Sub2) this).anInt5863 * ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6786) * (float) i_235_ + ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6761 * (float) i) + ((float) i_234_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6772))) + ((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6770) / (float) i_239_);
        int i_245_ = (int) ((float) ((ha_Sub2) this).anInt5863 * ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6772) * (float) i_237_ + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6761 * (float) i_236_) + ((float) i_238_ * ((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6786) + ((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6770) / (float) i_239_);
        if (((ha_Sub2) this).aFloat5940 > (float) i_244_ && ((ha_Sub2) this).aFloat5940 > (float) i_245_)
            i_241_ |= 0x4;
        else if ((float) i_244_ > ((ha_Sub2) this).aFloat5900 && ((ha_Sub2) this).aFloat5900 < (float) i_245_)
            i_241_ |= 0x8;
        return i_241_;
    }

    final synchronized void method896(int i, int i_246_, int i_247_) {
        anInt5764++;
        Node_Sub37 class248_sub37 = new Node_Sub37(i_247_);
        ((Node) class248_sub37).id = (long) i;
        if (i_246_ == 0)
            aClass293_5820.method3109(class248_sub37, -97);
    }

    final int r() {
        anInt5749++;
        return 4;
    }

    final Class316 a(Class316 class316, Class316 class316_248_, float f, Class316 class316_249_) {
        anInt5589++;
        if (class316 != null && class316_248_ != null && ((ha_Sub2) this).aBoolean5883 && ((ha_Sub2) this).aBoolean5836) {
            Class316_Sub1_Sub1 class316_sub1_sub1 = null;
            Class316_Sub1 class316_sub1 = (Class316_Sub1) class316;
            Class316_Sub1 class316_sub1_250_ = (Class316_Sub1) class316_248_;
            Class136_Sub3 class136_sub3 = class316_sub1.method3293(true);
            Class136_Sub3 class136_sub3_251_ = class316_sub1_250_.method3293(true);
            if (class136_sub3 != null && class136_sub3_251_ != null) {
                int i = (((((Class136_Sub3) class136_sub3).anInt8397 ^ 0xffffffff) < (((Class136_Sub3) class136_sub3_251_).anInt8397 ^ 0xffffffff)) ? ((Class136_Sub3) class136_sub3).anInt8397 : ((Class136_Sub3) class136_sub3_251_).anInt8397);
                if (class316_249_ != class316 && class316_249_ != class316_248_ && class316_249_ instanceof Class316_Sub1_Sub1) {
                    Class316_Sub1_Sub1 class316_sub1_sub1_252_ = (Class316_Sub1_Sub1) class316_249_;
                    if (class316_sub1_sub1_252_.method3295(32395) == i)
                        class316_sub1_sub1 = class316_sub1_sub1_252_;
                }
                if (class316_sub1_sub1 == null)
                    class316_sub1_sub1 = new Class316_Sub1_Sub1(this, i);
                if (class316_sub1_sub1.method3296(class136_sub3_251_, class136_sub3, (byte) 95, f))
                    return class316_sub1_sub1;
            }
        }
        if (!(f < 0.5F))
            return class316_248_;
        return class316;
    }

    final void b(int i) {
        anInt5752++;
        if ((i ^ 0xffffffff) > -129 || (i ^ 0xffffffff) < -1025)
            throw new IllegalArgumentException();
        ((ha_Sub2) this).anInt5790 = i;
        aClass359_5793.method3802((byte) -127);
    }

    final void method897(Interface1 interface1, int i, byte i_253_, int i_254_, int i_255_) {
        anInt5745++;
        if (i_253_ > -77)
            anInt5891 = 92;
        int i_256_ = interface1.method8((byte) 23);
        i *= method916(-73, i_256_);
        method904((byte) 82, interface1);
        OpenGL.glDrawElements(i_254_, i_255_, i_256_, interface1.method6(-4468) + (long) i);
    }

    final boolean d() {
        anInt5650++;
        return true;
    }

    final void EA(int i, int i_257_, int i_258_, int i_259_) {
        anInt5784++;
        if (!((ha_Sub2) this).aBoolean5914)
            throw new RuntimeException("");
        ((ha_Sub2) this).anInt5880 = i_259_;
        ((ha_Sub2) this).anInt5856 = i_257_;
        ((ha_Sub2) this).anInt5854 = i_258_;
        ((ha_Sub2) this).anInt5922 = i;
        if (aBoolean5873) {
            ((Class371) aClass371_5773).aClass84_Sub6_4562.method618((byte) -115);
            ((Class371) aClass371_5773).aClass84_Sub6_4562.method616((byte) -104);
        }
    }

    final Interface2 a(int i, int i_260_) {
        anInt5592++;
        return null;
    }

    final void GA(int i) {
        anInt5713++;
        method885(0, 0);
        OpenGL.glClearColor((float) (i & 0xff0000) / 1.671168E7F, (float) (i & 0xff00) / 65280.0F, (float) (i & 0xff) / 255.0F, (float) (i >>> -940001160) / 255.0F);
        OpenGL.glClear(16384);
    }

    final int method898(int i, int i_261_) {
        if (i_261_ != 6407)
            method878(false, 4);
        anInt5698++;
        if ((i ^ 0xffffffff) != -6407 && i != 6409) {
            if ((i ^ 0xffffffff) != -6411 && i != 34846 && (i ^ 0xffffffff) != -34845) {
                if (i == 6407)
                    return 3;
                if ((i ^ 0xffffffff) == -6409 || (i ^ 0xffffffff) == -34848)
                    return 4;
                if (i != 34843) {
                    if (i == 34842)
                        return 8;
                    if ((i ^ 0xffffffff) != -6403) {
                        if ((i ^ 0xffffffff) == -6402)
                            return 1;
                    } else
                        return 3;
                } else
                    return 6;
            } else
                return 2;
        } else
            return 1;
        throw new IllegalArgumentException("");
    }

    final void method899(int i, boolean bool) {
        if (bool == !aBoolean5938) {
            aBoolean5938 = bool;
            method857((byte) 41);
            anInt5827 &= ~0x1f;
        }
        anInt5739++;
        if (i != 2286)
            method905(true, -124, -3, null, -123);
    }

    private final void method900(byte i) {
        if (i == 14) {
            anInt5783++;
            OpenGL.glViewport(anInt5870, anInt5892, ((ha_Sub2) this).anInt5696, ((ha_Sub2) this).anInt5597);
        }
    }

    final void method901(int i, int i_262_) {
        Node_Sub12.aFloatArray6959[0] = (float) Class112.method794(i_262_, 16711680) / 1.671168E7F;
        Node_Sub12.aFloatArray6959[2] = (float) Class112.method794(i_262_, 255) / 255.0F;
        Node_Sub12.aFloatArray6959[3] = (float) (i_262_ >>> -824080680) / 255.0F;
        if (i < -33) {
            anInt5616++;
            Node_Sub12.aFloatArray6959[1] = (float) Class112.method794(65280, i_262_) / 65280.0F;
            OpenGL.glTexEnvfv(8960, 8705, Node_Sub12.aFloatArray6959, 0);
        }
    }

    final void C(boolean bool) {
        aBoolean5927 = bool;
        anInt5635++;
        method861(0);
    }

    final void DA(int i, int i_263_, int i_264_, int i_265_) {
        ((ha_Sub2) this).anInt5863 = i_265_;
        ((ha_Sub2) this).anInt5933 = i_263_;
        ((ha_Sub2) this).anInt5890 = i;
        ((ha_Sub2) this).anInt5864 = i_264_;
        anInt5623++;
        method895(true);
        method839(108);
        if ((anInt5903 ^ 0xffffffff) != -4) {
            if (anInt5903 == 2)
                method914((byte) 106);
        } else
            method879(5889);
    }

    final void z() {
        anInt5782++;
        if (((ha_Sub2) this).aBoolean5836) {
            if (anInterface20_5807 != aClass223_5812)
                throw new RuntimeException();
            aClass223_5812.method1783(1, 0);
            aClass223_5812.method1783(1, 8);
            method887(aClass223_5812, -101);
        } else if (aBoolean5853) {
            aClass129_Sub1_5811.method1184(0, 0, ((ha_Sub2) this).anInt5696, ((ha_Sub2) this).anInt5597, 0, 0);
            anOpenGL5733.setSurface(aLong5647);
        } else
            throw new RuntimeException("");
        ((ha_Sub2) this).anInt5696 = anInt5693;
        aClass129_Sub1_5811 = null;
        ((ha_Sub2) this).anInt5597 = anInt5601;
        method884((byte) -123);
        method900((byte) 14);
        la();
    }

    final Viewport e() {
        anInt5587++;
        return new Class238_Sub3();
    }

    final void method902(int i, boolean bool) {
        anInt5768++;
        if (!bool != !aBoolean5929) {
            aBoolean5929 = bool;
            method912((byte) 125);
        }
        int i_266_ = 26 / ((i - -22) / 48);
    }

    final void T(int i, int i_267_, int i_268_, int i_269_) {
        if (anInt5906 > i_268_)
            anInt5906 = i_268_;
        anInt5657++;
        if (i > anInt5841)
            anInt5841 = i;
        if ((i_269_ ^ 0xffffffff) > (anInt5931 ^ 0xffffffff))
            anInt5931 = i_269_;
        if ((anInt5917 ^ 0xffffffff) > (i_267_ ^ 0xffffffff))
            anInt5917 = i_267_;
        OpenGL.glEnable(3089);
        method839(-125);
        method888((byte) -101);
    }

    private final void method903(int i) {
        anInt5712++;
        int i_270_ = i;
        while (!anOpenGL5733.b()) {
            if (i_270_++ > 5)
                throw new RuntimeException("");
            Class279_Sub2.method2897((byte) -124, 1000L);
        }
    }

    final void method904(byte i, Interface1 interface1) {
        anInt5653++;
        if (anInterface1_5887 != interface1) {
            if (aBoolean5842)
                OpenGL.glBindBufferARB(34963, interface1.method9(false));
            anInterface1_5887 = interface1;
        }
        if (i != 82)
            b(false);
    }

    final void X(int i) {
        anInt5643++;
        ((ha_Sub2) this).anInt5798 = 0;
        for (/**/; i > 1; i >>= 1)
            ((ha_Sub2) this).anInt5798++;
        ((ha_Sub2) this).anInt5803 = 1 << ((ha_Sub2) this).anInt5798;
    }

    final Interface6 method905(boolean bool, int i, int i_271_, Buffer buffer, int i_272_) {
        anInt5792++;
        if (aBoolean5842 && (!bool || aBoolean5942))
            return new Class249_Sub2(this, i, buffer, i_272_, bool);
        if (i_271_ > -32)
            c();
        return new Class349_Sub1(this, i, buffer);
    }

    final void method906(Interface20 interface20, int i) {
        anInt5681++;
        if (anInt5813 >= 3)
            throw new RuntimeException();
        if (anInt5813 >= 0)
            anInterface20Array5805[anInt5813].method74(127);
        anInterface20_5806 = anInterface20Array5805[++anInt5813] = interface20;
        if (i > 115)
            anInterface20_5806.method76((byte) -67);
    }

    final Class48 a(Class285 class285, Class157[] class157s, boolean bool) {
        anInt5631++;
        return new Class48_Sub1(this, class285, class157s, bool);
    }

    final void ya() {
        method870(106, true);
        anInt5767++;
        OpenGL.glClear(256);
    }

    final void method907(int i, boolean bool, int i_273_) {
        anInt5665++;
        method893(true, 0, i, bool);
        if (i_273_ != 37922160)
            A(94, null, 39, 37);
    }

    final boolean y() {
        anInt5789++;
        if (aClass248_Sub11_Sub1_5776 != null) {
            if (!aClass248_Sub11_Sub1_5776.method2243(818)) {
                if (!aClass347_5769.method3732((byte) 72, aClass248_Sub11_Sub1_5776))
                    return false;
                aClass359_5793.method3802((byte) -124);
            }
            return true;
        }
        return false;
    }

    private final void method908(byte i) {
        anInt5709++;
        int i_274_;
        for (i_274_ = 0; anInt5847 > i_274_; i_274_++) {
            Node_Sub42 class248_sub42 = aClass248_Sub42Array5920[i_274_];
            Class316_Sub2_Sub1.aFloatArray9874[0] = (float) class248_sub42.method2620(123);
            int i_275_ = 16386 + i_274_;
            Class316_Sub2_Sub1.aFloatArray9874[1] = (float) class248_sub42.method2624(Class316_Sub1.method3291(i, 22061));
            Class316_Sub2_Sub1.aFloatArray9874[2] = (float) class248_sub42.method2625((byte) -125);
            Class316_Sub2_Sub1.aFloatArray9874[3] = 1.0F;
            OpenGL.glLightfv(i_275_, 4611, Class316_Sub2_Sub1.aFloatArray9874, 0);
            int i_276_ = class248_sub42.method2626(false);
            float f = class248_sub42.method2621((byte) 110) / 255.0F;
            Class316_Sub2_Sub1.aFloatArray9874[0] = (float) Class112.method794(i_276_ >> -566049648, 255) * f;
            Class316_Sub2_Sub1.aFloatArray9874[1] = f * (float) (Class112.method794(i_276_, 65424) >> 2147357128);
            Class316_Sub2_Sub1.aFloatArray9874[2] = (float) Class112.method794(255, i_276_) * f;
            OpenGL.glLightfv(i_275_, 4609, Class316_Sub2_Sub1.aFloatArray9874, 0);
            OpenGL.glLightf(i_275_, 4617, 1.0F / (float) (class248_sub42.method2628(-79) * class248_sub42.method2628(-36)));
            OpenGL.glEnable(i_275_);
        }
        for (/**/; (i_274_ ^ 0xffffffff) > (anInt5928 ^ 0xffffffff); i_274_++)
            OpenGL.glDisable(i_274_ + 16386);
        if (i != -99)
            ((ha_Sub2) this).aFloat5878 = -0.7426886F;
        anInt5928 = anInt5847;
    }

    final void A(int i, aa var_aa, int i_277_, int i_278_) {
        anInt5612++;
        aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
        Class136_Sub4_Sub1 class136_sub4_sub1 = ((aa_Sub2) var_aa_Sub2).aClass136_Sub4_Sub1_5256;
        method864(121);
        method889(-2, ((aa_Sub2) var_aa_Sub2).aClass136_Sub4_Sub1_5256);
        method885(0, 1);
        method858(-65, 8448, 7681);
        method911(768, 34167, 0, (byte) 4);
        float f = (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9969 / (float) ((Class136_Sub4_Sub1) class136_sub4_sub1).anInt9964);
        float f_279_ = (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9967 / (float) ((Class136_Sub4_Sub1) class136_sub4_sub1).anInt9966);
        OpenGL.glColor4ub((byte) (i >> -2120582544), (byte) (i >> 1201269800), (byte) i, (byte) (i >> -978307560));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(f * (float) (-i_277_ + anInt5841), f_279_ * (float) (-i_278_ + anInt5917));
        OpenGL.glVertex2i(anInt5841, anInt5917);
        OpenGL.glTexCoord2f(f * (float) (-i_277_ + anInt5841), (float) (anInt5931 - i_278_) * f_279_);
        OpenGL.glVertex2i(anInt5841, anInt5931);
        OpenGL.glTexCoord2f((float) (-i_277_ + anInt5906) * f, (float) (-i_278_ + anInt5931) * f_279_);
        OpenGL.glVertex2i(anInt5906, anInt5931);
        OpenGL.glTexCoord2f((float) (-i_277_ + anInt5906) * f, (float) (-i_278_ + anInt5917) * f_279_);
        OpenGL.glVertex2i(anInt5906, anInt5917);
        OpenGL.glEnd();
        method911(768, 5890, 0, (byte) 4);
    }

    final void b(Canvas canvas, int i, int i_280_) {
        anInt5674++;
        long l = 0L;
        if (canvas == null || aCanvas5610 == canvas)
            l = aLong5599;
        else if (aHashtable5617.containsKey(canvas)) {
            Long var_long = (Long) aHashtable5617.get(canvas);
            l = var_long.longValue();
        }
        if (l == 0L)
            throw new RuntimeException();
        anOpenGL5733.surfaceResized(l);
        if (canvas == aCanvas5751)
            method862((byte) -97);
    }

    final void k() {
        aClass347_5769.method3726(-67);
        anInt5595++;
    }

    private final void method909(int i) {
        Node_Sub12.aFloatArray6959[1] = ((ha_Sub2) this).aFloat5878 * ((ha_Sub2) this).aFloat5867;
        if (i <= 28)
            q();
        Node_Sub12.aFloatArray6959[0] = ((ha_Sub2) this).aFloat5878 * ((ha_Sub2) this).aFloat5884;
        Node_Sub12.aFloatArray6959[3] = 1.0F;
        anInt5637++;
        Node_Sub12.aFloatArray6959[2] = ((ha_Sub2) this).aFloat5878 * ((ha_Sub2) this).aFloat5893;
        OpenGL.glLightModelfv(2899, Node_Sub12.aFloatArray6959, 0);
    }

    final void a(Rectangle[] rectangles, int i, int i_281_, int i_282_) throws Exception_Sub1 {
        e(i_281_, i_282_);
        anInt5626++;
    }

    final Class167 c() {
        anInt5697++;
        int i = -1;
        if ((aString5896.indexOf("nvidia") ^ 0xffffffff) == 0) {
            if (aString5896.indexOf("intel") == -1) {
                if (aString5896.indexOf("ati") != -1)
                    i = 4098;
            } else
                i = 32902;
        } else
            i = 4318;
        return new Class167(i, "OpenGL", anInt5866, aString5912, 0L);
    }

    final void HA(int i, int i_283_, int i_284_, int i_285_, int[] is) {
        anInt5672++;
        float f = ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6797) + ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6793) * (float) i_284_ + ((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6791) * (float) i_283_ + (float) i * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6775))));
        if (f < (float) ((ha_Sub2) this).anInt5897 || f > (float) anInt5858)
            is[0] = is[1] = is[2] = -1;
        else {
            int i_286_ = (int) ((float) ((ha_Sub2) this).anInt5864 * (((float) i_284_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6785)) + (((float) i_283_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6784)) + ((float) i * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6794))) + (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6780)) / (float) i_285_);
            int i_287_ = (int) (((((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6772 * (float) i_283_) + (float) i * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6761) + ((float) i_284_ * (((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6786)) + ((Class238_Sub3) ((ha_Sub2) this).aClass238_Sub3_5832).aFloat6770) * (float) ((ha_Sub2) this).anInt5863 / (float) i_285_);
            if (!((float) i_286_ >= ((ha_Sub2) this).aFloat5916) || !(((ha_Sub2) this).aFloat5844 >= (float) i_286_) || !((float) i_287_ >= ((ha_Sub2) this).aFloat5940) || !((float) i_287_ <= ((ha_Sub2) this).aFloat5900))
                is[0] = is[1] = is[2] = -1;
            else {
                is[1] = (int) (-((ha_Sub2) this).aFloat5940 + (float) i_287_);
                is[2] = (int) f;
                is[0] = (int) (-((ha_Sub2) this).aFloat5916 + (float) i_286_);
            }
        }
    }

    final void KA(int i, int i_288_, int i_289_, int i_290_) {
        if (i_288_ < 0)
            i_288_ = 0;
        anInt5603++;
        if (((ha_Sub2) this).anInt5696 < i_289_)
            i_289_ = ((ha_Sub2) this).anInt5696;
        if (i < 0)
            i = 0;
        if (i_290_ > ((ha_Sub2) this).anInt5597)
            i_290_ = ((ha_Sub2) this).anInt5597;
        anInt5841 = i;
        anInt5906 = i_289_;
        anInt5917 = i_288_;
        anInt5931 = i_290_;
        OpenGL.glEnable(3089);
        method839(59);
        method888((byte) -116);
    }

    final void method910(int i, float f, float f_291_, float f_292_, float f_293_) {
        Node_Sub12.aFloatArray6959[3] = f_293_;
        Node_Sub12.aFloatArray6959[0] = f_291_;
        anInt5755++;
        Node_Sub12.aFloatArray6959[1] = f_292_;
        Node_Sub12.aFloatArray6959[2] = f;
        if (i != -14217)
            aFloat5902 = -1.6126654F;
        OpenGL.glTexEnvfv(8960, 8705, Node_Sub12.aFloatArray6959, 0);
    }

    final void method911(int i, int i_294_, int i_295_, byte i_296_) {
        anInt5788++;
        if (i_296_ != 4)
            a(-24, 112, 108, -74, true);
        OpenGL.glTexEnvi(8960, 34176 + i_295_, i_294_);
        OpenGL.glTexEnvi(8960, 34192 - -i_295_, i);
    }

    final boolean m() {
        anInt5766++;
        return true;
    }

    final int c(int i, int i_297_) {
        anInt5667++;
        return i | i_297_;
    }

    final void a(int i, int i_298_, int i_299_, int i_300_, int i_301_, int i_302_, int i_303_, int i_304_, int i_305_, int i_306_, int i_307_, int i_308_, int i_309_) {
        method872(1);
        anInt5703++;
        method885(0, i_309_);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (i_306_ >> -1885045648), (byte) (i_306_ >> 911761416), (byte) i_306_, (byte) (i_306_ >> 513480248));
        OpenGL.glVertex3f((float) i + 0.35F, (float) i_298_ + 0.35F, (float) i_299_);
        OpenGL.glColor4ub((byte) (i_307_ >> 1970512816), (byte) (i_307_ >> 366551688), (byte) i_307_, (byte) (i_307_ >> -438993736));
        OpenGL.glVertex3f(0.35F + (float) i_300_, (float) i_301_ + 0.35F, (float) i_302_);
        OpenGL.glColor4ub((byte) (i_308_ >> 36381328), (byte) (i_308_ >> -107412888), (byte) i_308_, (byte) (i_308_ >> 179025912));
        OpenGL.glVertex3f((float) i_303_ + 0.35F, 0.35F + (float) i_304_, (float) i_305_);
        OpenGL.glEnd();
    }

    final int[] Y() {
        anInt5737++;
        return (new int[]{((ha_Sub2) this).anInt5890, ((ha_Sub2) this).anInt5933, ((ha_Sub2) this).anInt5864, ((ha_Sub2) this).anInt5863});
    }

    final void U(int i, int i_310_, int i_311_, int i_312_, int i_313_) {
        anInt5642++;
        method872(1);
        method885(0, i_313_);
        float f = (float) i + 0.35F;
        float f_314_ = 0.35F + (float) i_310_;
        OpenGL.glColor4ub((byte) (i_312_ >> 738730224), (byte) (i_312_ >> -1026034392), (byte) i_312_, (byte) (i_312_ >> 989716184));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(f, f_314_);
        OpenGL.glVertex2f((float) i_311_ + f, f_314_);
        OpenGL.glEnd();
    }

    final Viewport o() {
        anInt5694++;
        return aClass238_Sub3_5796;
    }

    final void ZA(int i, float f, float f_315_, float f_316_, float f_317_, float f_318_) {
        anInt5691++;
        boolean bool = (anInt5851 ^ 0xffffffff) != (i ^ 0xffffffff);
        if (bool || ((ha_Sub2) this).aFloat5840 != f || ((ha_Sub2) this).aFloat5846 != f_315_) {
            ((ha_Sub2) this).aFloat5840 = f;
            anInt5851 = i;
            ((ha_Sub2) this).aFloat5846 = f_315_;
            if (bool) {
                ((ha_Sub2) this).aFloat5867 = (float) (anInt5851 & 0xff00) / 65280.0F;
                ((ha_Sub2) this).aFloat5884 = (float) (0xff0000 & anInt5851) / 1.671168E7F;
                ((ha_Sub2) this).aFloat5893 = (float) (0xff & anInt5851) / 255.0F;
                method909(57);
            }
            method868(true);
        }
        if (aFloatArray5859[0] != f_316_ || aFloatArray5859[1] != f_317_ || f_318_ != aFloatArray5859[2]) {
            aFloatArray5859[1] = f_317_;
            aFloatArray5859[2] = f_318_;
            aFloatArray5859[0] = f_316_;
            aFloatArray5839[2] = -f_318_;
            aFloatArray5839[1] = -f_317_;
            aFloatArray5839[0] = -f_316_;
            float f_319_ = (float) (1.0 / Math.sqrt((double) (f_317_ * f_317_ + f_316_ * f_316_ + f_318_ * f_318_)));
            ((ha_Sub2) this).aFloatArray5838[0] = f_316_ * f_319_;
            ((ha_Sub2) this).aFloatArray5838[1] = f_317_ * f_319_;
            ((ha_Sub2) this).aFloatArray5838[2] = f_319_ * f_318_;
            aFloatArray5945[2] = -((ha_Sub2) this).aFloatArray5838[2];
            aFloatArray5945[0] = -((ha_Sub2) this).aFloatArray5838[0];
            aFloatArray5945[1] = -((ha_Sub2) this).aFloatArray5838[1];
            method855(0);
            ((ha_Sub2) this).anInt5862 = (int) (f_316_ * 256.0F / f_317_);
            ((ha_Sub2) this).anInt5935 = (int) (f_318_ * 256.0F / f_317_);
        }
    }

    final void P(int i, int i_320_, int i_321_, int i_322_, int i_323_) {
        method872(1);
        anInt5615++;
        method885(0, i_323_);
        float f = (float) i + 0.35F;
        float f_324_ = (float) i_320_ + 0.35F;
        OpenGL.glColor4ub((byte) (i_322_ >> 1459042544), (byte) (i_322_ >> -1969887512), (byte) i_322_, (byte) (i_322_ >> 1136122328));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(f, f_324_);
        OpenGL.glVertex2f(f, (float) i_321_ + f_324_);
        OpenGL.glEnd();
    }

    private final void method912(byte i) {
        if (aBoolean5857 && !aBoolean5929)
            OpenGL.glEnable(2896);
        else
            OpenGL.glDisable(2896);
        anInt5756++;
        if (i != 125)
            K(null);
    }

    final void xa(float f) {
        if (((ha_Sub2) this).aFloat5878 != f) {
            ((ha_Sub2) this).aFloat5878 = f;
            method909(87);
        }
        anInt5765++;
    }

    final boolean b() {
        anInt5676++;
        return true;
    }

    final void method913(boolean bool, int i) {
        anInt5682++;
        if (i != 0)
            ((ha_Sub2) this).aClass223_5895 = null;
        if (!aBoolean5831 != !bool) {
            if (bool)
                OpenGL.glEnable(2929);
            else
                OpenGL.glDisable(2929);
            anInt5827 &= ~0x1f;
            aBoolean5831 = bool;
        }
    }

    final aa a(int i, int i_325_, int[] is, int[] is_326_) {
        anInt5700++;
        return Class346_Sub10.method3721(this, is_326_, i, i_325_, is, 1179648);
    }

    private final void method914(byte i) {
        if (i < 88)
            method903(42);
        OpenGL.glMatrixMode(5889);
        anInt5627++;
        OpenGL.glLoadMatrixf(aFloatArray5937, 0);
        OpenGL.glMatrixMode(5888);
    }

    final void a(Interface14 interface14) {
        anInt5748++;
    }

    private final void method915(int i) {
        anOpenGL5733.a();
        if (i == 1136122328)
            anInt5730++;
    }

    final int method916(int i, int i_327_) {
        anInt5630++;
        if ((i_327_ ^ 0xffffffff) == -5122 || i_327_ == 5120)
            return 1;
        if ((i_327_ ^ 0xffffffff) == -5124 || i_327_ == 5122)
            return 2;
        if (i > -44)
            return -43;
        if (i_327_ == 5125 || i_327_ == 5124 || i_327_ == 5126)
            return 4;
        throw new IllegalArgumentException("");
    }

    private final void method917(byte i) {
        aFloatArray5937[14] = aFloat5909;
        anInt5600++;
        aFloatArray5937[10] = aFloat5855;
        if (i <= 79)
            ((ha_Sub2) this).aFloat5944 = 1.4745909F;
        ((ha_Sub2) this).aFloat5944 = (float) anInt5858;
        ((ha_Sub2) this).aFloat5919 = (aFloatArray5937[14] - (float) anInt5858) / aFloatArray5937[10];
    }

    final Class129 a(int[] is, int i, int i_328_, int i_329_, int i_330_, boolean bool) {
        anInt5791++;
        return new Class129_Sub1(this, i_329_, i_330_, is, i, i_328_);
    }

    final void method918(int i) {
        OpenGL.glPushMatrix();
        anInt5785++;
        if (i != 0)
            g(-105);
    }

    final Class316 d(int i, int i_331_, int i_332_, int i_333_, int i_334_, int i_335_) {
        anInt5677++;
        if (!((ha_Sub2) this).aBoolean5883)
            return null;
        return new Class316_Sub1_Sub2(this, i, i_331_, i_332_, i_333_, i_334_, i_335_);
    }

    private final void method919(int i) {
        anInt5604++;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(((ha_Sub2) this).aClass238_Sub3_5834.method1907((byte) -82), 0);
        if (aBoolean5873)
            ((Class371) aClass371_5773).aClass84_Sub6_4562.method618((byte) -118);
        method855(i);
        method908((byte) -99);
    }
}
