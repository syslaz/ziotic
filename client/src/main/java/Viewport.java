/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;

abstract class Viewport {
    static Applet anApplet2646;
    static IncommingOpcode aIncommingOpcode_2647 = new IncommingOpcode(81, 6);
    static int anInt2648;
    static int anInt2649;
    static int anInt2650;
    static int anInt2651 = 1;

    abstract void method1857(int i);

    abstract void method1858(int i);

    abstract void method1859(int i, int i_0_, int i_1_);

    public static void method1860(int i) {
        if (i <= -53) {
            anApplet2646 = null;
            aIncommingOpcode_2647 = null;
        }
    }

    abstract void method1861(int i);

    abstract void method1862(int i, int i_2_, int i_3_);

    abstract Viewport method1863();

    abstract void method1864(int i);

    abstract void method1865(int i, int i_4_, int i_5_, int[] is);

    abstract void method1866();

    abstract void method1867(int[] is);

    abstract void method1868(Viewport viewport_6_);

    abstract void method1869(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_);

    abstract void method1870(int i, int i_12_, int i_13_, int[] is);

    static final Class136_Sub4_Sub1 method1871(ha_Sub2 var_ha_Sub2, int i, int i_14_, int i_15_, int i_16_) {
        anInt2650++;
        if (i < 28)
            anInt2649 = -79;
        if (((ha_Sub2) var_ha_Sub2).aBoolean5913 || (Class343.method3508(i_16_, -31218) && Class343.method3508(i_15_, -31218)))
            return new Class136_Sub4_Sub1(var_ha_Sub2, 3553, i_14_, i_16_, i_15_);
        if (!((ha_Sub2) var_ha_Sub2).aBoolean5837)
            return new Class136_Sub4_Sub1(var_ha_Sub2, i_14_, i_16_, i_15_, Class136_Sub4.method1269(i_16_, (byte) -128), Class136_Sub4.method1269(i_15_, (byte) -128));
        return new Class136_Sub4_Sub1(var_ha_Sub2, 34037, i_14_, i_16_, i_15_);
    }

    abstract void method1872(int i);

    abstract void method1873(int i);

    public Viewport() {
        /* empty */
    }

    static final void method1874() {
        Node_Sub8_Sub14_Sub1.method2128(1, Class111_Sub1.anInt5531);
    }

    abstract void method1875(int i, int i_17_, int i_18_, int[] is);
}
