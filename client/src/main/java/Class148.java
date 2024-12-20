/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Field;

final class Class148 implements Interface17 {
    private Color aColor5081;
    static int anInt5082;
    static int anInt5083;
    static int anInt5084;
    static int anInt5085;
    private int anInt5086;
    private Image anImage5087;
    private int anInt5088;
    private int anInt5089;
    private Image anImage5090;
    private Image anImage5091;
    private int anInt5092;
    private int anInt5093;
    private Image anImage5094;
    private boolean aBoolean5095;
    static Class119 aClass119_5096;
    static int anInt5097;
    static int anInt5098;
    static int anInt5099;
    private Image anImage5100;
    private int anInt5101;
    private Font aFont5102;
    private Image anImage5103;
    static int anInt5104;
    private int anInt5105;
    private int anInt5106;
    private Image anImage5107;
    static int anInt5108;
    private boolean aBoolean5109;
    private int anInt5110;
    static int anInt5111;
    static int anInt5112;
    static int anInt5113;
    private boolean aBoolean5114;
    private Image anImage5115;
    static int anInt5116;
    private FontMetrics aFontMetrics5117;
    static int anInt5118;
    private Image anImage5119;
    private Image anImage5120;

    public final void method54(int i) {
        anInt5111++;
        WorldAddress.method682(86);
        if (i != 31639)
            anInt5101 = 90;
    }

    public static void method1322(boolean bool) {
        aClass119_5096 = null;
        if (bool != true)
            aClass119_5096 = null;
    }

    private final boolean method1323(byte i, Object object, Class var_class, String string) throws IllegalAccessException, NoSuchFieldException {
        if (i != 107)
            anInt5093 = -83;
        anInt5085++;
        Field field = var_class.getDeclaredField(string);
        return field.getBoolean(object);
    }

    private final int method1324(byte i, int i_0_) {
        anInt5104++;
        if (aBoolean5114)
            return (Class282_Sub20.anInt7800 - i_0_) / 2;
        if (i < 125)
            method53(93);
        return 0;
    }

    private final int method1325(int i, int i_1_) {
        anInt5116++;
        if (aBoolean5109)
            return (-i_1_ + Class146.anInt1724) / 2;
        if (i > -68)
            method1326((byte) 91);
        return 0;
    }

    static final void method1326(byte i) {
        anInt5082++;
        int i_2_ = -8 % ((38 - i) / 34);
        Node_Sub8_Sub16_Sub1.aClient10301.method97((byte) 72);
        Node_Sub14_Sub24.method2347((byte) 86);
        Class226_Sub3.aIncommingOpcode_6669 = null;
        Class61.aIncommingOpcode_832 = null;
        Class282_Sub21.anInt7817 = 0;
        Node_Sub8_Sub14_Sub1.aIncommingOpcode_10293 = null;
        ((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset = 0;
        Class45.anInt569 = 0;
        Class84_Sub6.method622((byte) 51);
        Node_Sub4.aString6836 = null;
        Node_Sub14_Sub25.anInt9424 = 0;
        Class30.aClass211Array375 = null;
        client.anInt5226 = 0;
        Class74.anInt963 = 0;
    }

    public final void method51(byte i) {
        if (i != -2)
            anInt5106 = -66;
        anInt5112++;
    }

    private final void method1327(byte i) throws IllegalAccessException, NoSuchFieldException {
        anInt5118++;
        Class var_class = Class158.anApplet1881.getClass();
        anImage5115 = (Image) method1328(var_class, 2, "bar");
        anImage5107 = (Image) method1328(var_class, 2, "background");
        anImage5094 = (Image) method1328(var_class, 2, "left");
        anImage5120 = (Image) method1328(var_class, 2, "right");
        anImage5119 = (Image) method1328(var_class, 2, "top");
        anImage5087 = (Image) method1328(var_class, 2, "bottom");
        anImage5091 = (Image) method1328(var_class, 2, "bodyLeft");
        anImage5100 = (Image) method1328(var_class, 2, "bodyRight");
        anImage5090 = (Image) method1328(var_class, 2, "bodyFill");
        aFont5102 = (Font) method1328(var_class, 2, "bf");
        aFontMetrics5117 = (FontMetrics) method1328(var_class, 2, "bfm");
        if (i > -109)
            method54(89);
        aColor5081 = (Color) method1328(var_class, 2, "colourtext");
        Object object = method1328(var_class, 2, "lb");
        Class var_class_3_ = object.getClass();
        aBoolean5109 = method1323((byte) 107, object, var_class_3_, "xMiddle");
        aBoolean5114 = method1323((byte) 107, object, var_class_3_, "yMiddle");
        anInt5093 = method1329((byte) -122, var_class_3_, "xOffset", object);
        anInt5088 = method1329((byte) -122, var_class_3_, "yOffset", object);
        anInt5105 = method1329((byte) -122, var_class_3_, "width", object);
        anInt5106 = method1329((byte) -122, var_class_3_, "height", object);
        anInt5089 = method1329((byte) -122, var_class_3_, "boxXOffset", object);
        anInt5086 = method1329((byte) -122, var_class_3_, "boxYOffset", object);
        anInt5101 = method1329((byte) -122, var_class_3_, "boxWidth", object);
        anInt5092 = method1329((byte) -122, var_class_3_, "textYOffset", object);
        anInt5110 = method1329((byte) -122, var_class_3_, "offsetPerTenCycles", object);
    }

    public final int method53(int i) {
        if (i != -11222)
            return 7;
        anInt5083++;
        return 0;
    }

    public final void method55(boolean bool, byte i) {
        anInt5084++;
        if (!aBoolean5095) {
            if (Class158.anApplet1881 == null)
                aBoolean5095 = true;
            else if (aFont5102 == null) {
                try {
                    method1327((byte) -122);
                } catch (Exception exception) {
                    aBoolean5095 = true;
                }
            }
        }
        if (aBoolean5095)
            method1330((byte) 90);
        else {
            Graphics graphics = Class297_Sub1.aCanvas8478.getGraphics();
            if (graphics != null) {
                try {
                    int i_4_ = Class282_Sub11.aClass74_7702.method545((byte) 43);
                    String string = Class282_Sub11.aClass74_7702.method555((byte) 21);
                    if (Class211.anImage2448 == null)
                        Class211.anImage2448 = (Class297_Sub1.aCanvas8478.createImage(Class146.anInt1724, Class282_Sub20.anInt7800));
                    Graphics graphics_5_ = Class211.anImage2448.getGraphics();
                    graphics_5_.clearRect(0, 0, Class146.anInt1724, Class282_Sub20.anInt7800);
                    int i_6_ = anImage5091.getWidth(null);
                    int i_7_ = anImage5100.getWidth(null);
                    int i_8_ = anImage5090.getWidth(null);
                    int i_9_ = anImage5091.getHeight(null);
                    int i_10_ = anImage5100.getHeight(null);
                    int i_11_ = anImage5090.getHeight(null);
                    graphics_5_.drawImage(anImage5091, (method1325(-82, i_6_) - -anInt5089 + -(anInt5101 / 2)), (method1324((byte) 127, i_9_) - -anInt5086), null);
                    int i_12_ = i_6_ + anInt5089 - anInt5101 / 2;
                    int i_13_ = anInt5089 - -(anInt5101 / 2);
                    for (int i_14_ = i_12_; i_13_ >= i_14_; i_14_ += i_8_)
                        graphics_5_.drawImage(anImage5090, (method1325(-91, i_6_) - -anInt5089 + i_14_), (method1324((byte) 126, i_11_) + anInt5086), null);
                    graphics_5_.drawImage(anImage5100, (method1325(-93, i_7_) + (anInt5089 + anInt5101 / 2)), (method1324((byte) 126, i_10_) - -anInt5086), null);
                    int i_15_ = anImage5094.getWidth(null);
                    int i_16_ = anImage5094.getHeight(null);
                    int i_17_ = anImage5120.getWidth(null);
                    int i_18_ = anImage5120.getHeight(null);
                    int i_19_ = anImage5087.getHeight(null);
                    int i_20_ = anImage5119.getWidth(null);
                    int i_21_ = anImage5119.getHeight(null);
                    int i_22_ = anImage5087.getWidth(null);
                    int i_23_ = anImage5115.getWidth(null);
                    int i_24_ = anImage5107.getWidth(null);
                    int i_25_ = method1325(-95, anInt5105) + anInt5093;
                    int i_26_ = method1324((byte) 127, anInt5106) + anInt5088;
                    graphics_5_.drawImage(anImage5094, i_25_, (anInt5106 + -i_16_) / 2 + i_26_, null);
                    graphics_5_.drawImage(anImage5120, -i_17_ + anInt5105 + i_25_, (anInt5106 + -i_18_) / 2 + i_26_, null);
                    if (anImage5103 == null)
                        anImage5103 = (Class297_Sub1.aCanvas8478.createImage(-i_15_ + (anInt5105 + -i_17_), anInt5106));
                    Graphics graphics_27_ = anImage5103.getGraphics();
                    for (int i_28_ = 0; i_28_ < anInt5105 + -i_15_ + -i_17_; i_28_ += i_20_)
                        graphics_27_.drawImage(anImage5119, i_28_, 0, null);
                    for (int i_29_ = 0; anInt5105 + -i_15_ + -i_17_ > i_29_; i_29_ += i_22_)
                        graphics_27_.drawImage(anImage5087, i_29_, -i_19_ + anInt5106, null);
                    int i_30_ = (-i_17_ + anInt5105 - i_15_) * i_4_ / 100;
                    if (i_30_ > 0) {
                        Image image = (Class297_Sub1.aCanvas8478.createImage(i_30_, -i_19_ + (-i_21_ + anInt5106)));
                        int i_31_ = image.getWidth(null);
                        Graphics graphics_32_ = image.getGraphics();
                        int i_33_ = (anInt5110 * Class340_Sub9.method3474(-16632) / 10 % i_23_);
                        for (int i_34_ = i_33_ - i_23_; i_34_ < i_31_; i_34_ += i_23_)
                            graphics_32_.drawImage(anImage5115, i_34_, 0, null);
                        graphics_27_.drawImage(image, 0, i_21_, null);
                    }
                    int i_35_ = i_30_;
                    i_30_ = -i_30_ + (-i_15_ + anInt5105 + -i_17_);
                    if ((i_30_ ^ 0xffffffff) < -1) {
                        Image image = (Class297_Sub1.aCanvas8478.createImage(i_30_, -i_21_ + (anInt5106 - i_19_)));
                        int i_36_ = image.getWidth(null);
                        Graphics graphics_37_ = image.getGraphics();
                        for (int i_38_ = 0; i_36_ > i_38_; i_38_ += i_24_)
                            graphics_37_.drawImage(anImage5107, i_38_, 0, null);
                        graphics_27_.drawImage(image, i_35_, i_21_, null);
                    }
                    graphics_5_.drawImage(anImage5103, i_25_ - -i_15_, i_26_, null);
                    graphics_5_.setFont(aFont5102);
                    graphics_5_.setColor(aColor5081);
                    graphics_5_.drawString(string, ((anInt5105 + -aFontMetrics5117.stringWidth(string)) / 2 + i_25_), (anInt5106 / 2 + (i_26_ + 4) - -anInt5092));
                    graphics.drawImage(Class211.anImage2448, 0, 0, null);
                } catch (Exception exception) {
                    aBoolean5095 = true;
                }
            } else
                Class297_Sub1.aCanvas8478.repaint();
            int i_39_ = -98 / ((i - -24) / 48);
        }
    }

    private final Object method1328(Class var_class, int i, String string) throws IllegalAccessException, NoSuchFieldException {
        anInt5108++;
        Field field = var_class.getDeclaredField(string);
        Object object = field.get(Class158.anApplet1881);
        field.set(Class158.anApplet1881, null);
        if (i != 2)
            method54(-96);
        return object;
    }

    public final int method52(int i) {
        if (i != 26583)
            method51((byte) 2);
        anInt5099++;
        return 100;
    }

    public final boolean method56(long l, int i) {
        if (i != -3650)
            anImage5115 = null;
        anInt5113++;
        return true;
    }

    private final int method1329(byte i, Class var_class, String string, Object object) throws IllegalAccessException, NoSuchFieldException {
        anInt5098++;
        Field field = var_class.getDeclaredField(string);
        if (i != -122)
            method56(-3L, 26);
        return field.getInt(object);
    }

    private final void method1330(byte i) {
        Class262.method2769(Class282_Sub11.aClass74_7702.method545((byte) 43), (Node_Sub43.aColorArray7309[Node_Sub33.anInt7205]), (byte) 87, Class133.aColorArray5039[Node_Sub33.anInt7205], Class282_Sub11.aClass74_7702.method555((byte) 21), (Class173.aColorArray2012[Node_Sub33.anInt7205]));
        if (i >= 53)
            anInt5097++;
    }

    public Class148() {
        /* empty */
    }
}
