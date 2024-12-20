/* Class129_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.io.*;

final class Class129_Sub1 extends Class129 {
    private int anInt8486 = 0;
    static int anInt8487;
    static int anInt8488;
    static int anInt8489;
    private int anInt8490;
    private ha_Sub2 aHa_Sub2_8491;
    static int anInt8492;
    private Class136_Sub4_Sub1 aClass136_Sub4_Sub1_8493;
    static int anInt8494 = 1;
    static int anInt8495;
    private boolean aBoolean8496;
    static IncommingOpcode aIncommingOpcode_8497 = new IncommingOpcode(24, 3);
    static int anInt8498;
    private int anInt8499 = 0;
    static int anInt8500;
    static int anInt8501;
    static int anInt8502;
    static int anInt8503;
    static int anInt8504;
    static int anInt8505;
    private int anInt8506;
    static int anInt8507;
    private int anInt8508;
    static int anInt8509;
    static int anInt8510;
    static int anInt8511;
    private Class136_Sub4_Sub1 aClass136_Sub4_Sub1_8512;
    static int anInt8513;
    static int anInt8514;
    static IncommingOpcode aIncommingOpcode_8515 = new IncommingOpcode(31, -1);
    static int anInt8516;
    static Class192 aClass192_8517;

    public static void method1186(int i) {
        aClass192_8517 = null;
        if (i == 28478) {
            aIncommingOpcode_8497 = null;
            aIncommingOpcode_8515 = null;
        }
    }

    final int method1176() {
        anInt8501++;
        return ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966;
    }

    final void method1180(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt8509++;
        int i_6_ = i_1_ + i;
        int i_7_ = i_2_ + i_0_;
        aClass136_Sub4_Sub1_8493.method1246(false, false);
        aHa_Sub2_8491.method864(119);
        aHa_Sub2_8491.method889(-2, aClass136_Sub4_Sub1_8493);
        aHa_Sub2_8491.method885(0, i_5_);
        aHa_Sub2_8491.method881((byte) 115, i_3_);
        OpenGL.glColor4ub((byte) (i_4_ >> 199035216), (byte) (i_4_ >> -269332344), (byte) i_4_, (byte) (i_4_ >> -236127080));
        if (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aBoolean9968 && !aBoolean8496) {
            float f = (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967 * (float) i_2_ / (float) (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966));
            float f_8_ = (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969 * (float) i_1_ / (float) (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964));
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, f);
            OpenGL.glVertex2i(i, i_0_);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(i, i_7_);
            OpenGL.glTexCoord2f(f_8_, 0.0F);
            OpenGL.glVertex2i(i_6_, i_7_);
            OpenGL.glTexCoord2f(f_8_, f);
            OpenGL.glVertex2i(i_6_, i_0_);
            OpenGL.glEnd();
        } else {
            OpenGL.glPushMatrix();
            OpenGL.glTranslatef((float) anInt8499, (float) anInt8486, 0.0F);
            int i_9_ = method1169();
            int i_10_ = method1181();
            int i_11_ = i_0_ + (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966);
            OpenGL.glBegin(7);
            int i_12_ = i_0_;
            for (/**/; (i_11_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff); i_11_ += i_10_) {
                int i_13_ = ((((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964) + i);
                int i_14_ = i;
                for (/**/; (i_13_ ^ 0xffffffff) >= (i_6_ ^ 0xffffffff); i_13_ += i_9_) {
                    OpenGL.glTexCoord2f(0.0F, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                    OpenGL.glVertex2i(i_14_, i_12_);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(i_14_, i_11_);
                    OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, 0.0F);
                    OpenGL.glVertex2i(i_13_, i_11_);
                    OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                    OpenGL.glVertex2i(i_13_, i_12_);
                    i_14_ += i_9_;
                }
                if ((i_14_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
                    float f = ((float) (i_6_ - i_14_) * (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969) / (float) ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964);
                    OpenGL.glTexCoord2f(0.0F, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                    OpenGL.glVertex2i(i_14_, i_12_);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(i_14_, i_11_);
                    OpenGL.glTexCoord2f(f, 0.0F);
                    OpenGL.glVertex2i(i_6_, i_11_);
                    OpenGL.glTexCoord2f(f, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                    OpenGL.glVertex2i(i_6_, i_12_);
                }
                i_12_ += i_10_;
            }
            if ((i_12_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff)) {
                float f = ((((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967) * (float) (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966 - -i_12_ - i_7_) / (float) ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966);
                int i_15_ = ((((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964) + i);
                int i_16_ = i;
                for (/**/; i_6_ >= i_15_; i_15_ += i_9_) {
                    OpenGL.glTexCoord2f(0.0F, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                    OpenGL.glVertex2i(i_16_, i_12_);
                    OpenGL.glTexCoord2f(0.0F, f);
                    OpenGL.glVertex2i(i_16_, i_7_);
                    OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, f);
                    OpenGL.glVertex2i(i_15_, i_7_);
                    OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                    OpenGL.glVertex2i(i_15_, i_12_);
                    i_16_ += i_9_;
                }
                if ((i_6_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff)) {
                    float f_17_ = ((((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969) * (float) (i_6_ + -i_16_) / (float) ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964);
                    OpenGL.glTexCoord2f(0.0F, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                    OpenGL.glVertex2i(i_16_, i_12_);
                    OpenGL.glTexCoord2f(0.0F, f);
                    OpenGL.glVertex2i(i_16_, i_7_);
                    OpenGL.glTexCoord2f(f_17_, f);
                    OpenGL.glVertex2i(i_6_, i_7_);
                    OpenGL.glTexCoord2f(f_17_, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                    OpenGL.glVertex2i(i_6_, i_12_);
                }
            }
            OpenGL.glEnd();
            OpenGL.glPopMatrix();
        }
    }

    final int method1175() {
        anInt8514++;
        return ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964;
    }

    final void method1183(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
        anInt8507++;
        aClass136_Sub4_Sub1_8493.method1246(false, (0x1 & i_24_ ^ 0xffffffff) != -1);
        aHa_Sub2_8491.method864(109);
        aHa_Sub2_8491.method885(0, i_23_);
        OpenGL.glColor4ub((byte) (i_22_ >> 1576239728), (byte) (i_22_ >> 2844264), (byte) i_22_, (byte) (i_22_ >> -1792188808));
        if (!aBoolean8496) {
            if (aClass136_Sub4_Sub1_8512 != null) {
                method1190(i_21_, (byte) 28);
                aClass136_Sub4_Sub1_8512.method1246(false, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967));
                OpenGL.glTexCoord2f(0.0F, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                OpenGL.glVertex2i(i, i_18_);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(i, i_20_ + i_18_);
                OpenGL.glMultiTexCoord2f(33985, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, 0.0F);
                OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, 0.0F);
                OpenGL.glVertex2i(i + i_19_, i_20_ + i_18_);
                OpenGL.glMultiTexCoord2f(33985, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967));
                OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                OpenGL.glVertex2i(i + i_19_, i_18_);
                OpenGL.glEnd();
                method1188((byte) -32);
            } else {
                aHa_Sub2_8491.method889(-2, aClass136_Sub4_Sub1_8493);
                aHa_Sub2_8491.method881((byte) 123, i_21_);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                OpenGL.glVertex2i(i, i_18_);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(i, i_20_ + i_18_);
                OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, 0.0F);
                OpenGL.glVertex2i(i_19_ + i, i_20_ + i_18_);
                OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                OpenGL.glVertex2i(i_19_ + i, i_18_);
                OpenGL.glEnd();
            }
        } else {
            float f = (float) i_19_ / (float) method1169();
            float f_25_ = (float) i_20_ / (float) method1181();
            float f_26_ = (float) anInt8499 * f + (float) i;
            float f_27_ = (float) i_18_ + f_25_ * (float) anInt8486;
            float f_28_ = f_26_ + f * (float) ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964;
            float f_29_ = (f_25_ * (float) ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966 + f_27_);
            if (aClass136_Sub4_Sub1_8512 != null) {
                method1190(i_21_, (byte) 28);
                aClass136_Sub4_Sub1_8512.method1246(false, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967));
                OpenGL.glTexCoord2f(0.0F, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                OpenGL.glVertex2f(f_26_, f_27_);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(f_26_, f_29_);
                OpenGL.glMultiTexCoord2f(33985, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, 0.0F);
                OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, 0.0F);
                OpenGL.glVertex2f(f_28_, f_29_);
                OpenGL.glMultiTexCoord2f(33985, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967));
                OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                OpenGL.glVertex2f(f_28_, f_27_);
                OpenGL.glEnd();
                method1188((byte) -32);
            } else {
                aHa_Sub2_8491.method889(-2, aClass136_Sub4_Sub1_8493);
                aHa_Sub2_8491.method881((byte) 117, i_21_);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                OpenGL.glVertex2f(f_26_, f_27_);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(f_26_, f_29_);
                OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, 0.0F);
                OpenGL.glVertex2f(f_28_, f_29_);
                OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
                OpenGL.glVertex2f(f_28_, f_27_);
                OpenGL.glEnd();
            }
        }
    }

    final void method1184(int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
        anInt8503++;
        if (!((ha_Sub2) aHa_Sub2_8491).aBoolean5869)
            aClass136_Sub4_Sub1_8493.method1264(i_34_, i_31_, i_32_, i_30_, 34037, i_33_, i);
        else {
            int[] is = aHa_Sub2_8491.na(i_33_, i_34_, i_31_, i_32_);
            if (is != null) {
                for (int i_35_ = 0; i_35_ < is.length; i_35_++)
                    is[i_35_] = Class358.retrieveLooksSettings(is[i_35_], -16777216);
                method1189(i, i_30_, i_31_, i_32_, is, 0, i_31_);
            }
        }
    }

    static final String method1187(int i, Throwable throwable) throws IOException {
        anInt8510++;
        String string;
        if (throwable instanceof RuntimeException_Sub1) {
            RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
            throwable = (((RuntimeException_Sub1) runtimeexception_sub1).aThrowable4708);
            string = (((RuntimeException_Sub1) runtimeexception_sub1).aString4710 + " | ");
        } else
            string = "";
        if (i != -28017)
            return null;
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        throwable.printStackTrace(printwriter);
        printwriter.close();
        String string_36_ = stringwriter.toString();
        BufferedReader bufferedreader = new BufferedReader(new StringReader(string_36_));
        String string_37_ = bufferedreader.readLine();
        for (; ; ) {
            String string_38_ = bufferedreader.readLine();
            if (string_38_ == null)
                break;
            int i_39_ = string_38_.indexOf('(');
            int i_40_ = string_38_.indexOf(')', 1 + i_39_);
            String string_41_;
            if (i_39_ == -1)
                string_41_ = string_38_;
            else
                string_41_ = string_38_.substring(0, i_39_);
            string_41_ = string_41_.trim();
            string_41_ = string_41_.substring(string_41_.lastIndexOf(' ') + 1);
            string_41_ = string_41_.substring(string_41_.lastIndexOf('\t') + 1);
            string += string_41_;
            if ((i_39_ ^ 0xffffffff) != 0 && (i_40_ ^ 0xffffffff) != 0) {
                int i_42_ = string_38_.indexOf(".java:", i_39_);
                if (i_42_ >= 0)
                    string += string_38_.substring(i_42_ - -5, i_40_);
            }
            string += ' ';
        }
        string += "| " + (String) string_37_;
        return string;
    }

    final void method1165(int i, int i_43_, int i_44_, int i_45_) {
        anInt8488++;
        anInt8506 = i_44_;
        anInt8499 = i;
        anInt8486 = i_43_;
        anInt8490 = i_45_;
        aBoolean8496 = ((anInt8499 ^ 0xffffffff) != -1 || anInt8486 != 0 || (anInt8506 ^ 0xffffffff) != -1 || anInt8490 != 0);
    }

    final void method1167(float f, float f_46_, float f_47_, float f_48_, float f_49_, float f_50_, int i, int i_51_, int i_52_, int i_53_) {
        anInt8516++;
        if (aBoolean8496) {
            float f_54_ = (float) method1169();
            float f_55_ = (float) method1181();
            float f_56_ = (-f + f_47_) / f_54_;
            float f_57_ = (-f_46_ + f_48_) / f_54_;
            float f_58_ = (-f + f_49_) / f_55_;
            float f_59_ = (-f_46_ + f_50_) / f_55_;
            float f_60_ = f_58_ * (float) anInt8486;
            float f_61_ = (float) anInt8486 * f_59_;
            float f_62_ = (float) anInt8499 * f_56_;
            float f_63_ = (float) anInt8499 * f_57_;
            float f_64_ = -f_56_ * (float) anInt8506;
            float f_65_ = -f_57_ * (float) anInt8506;
            float f_66_ = -f_58_ * (float) anInt8490;
            f = f + f_62_ + f_60_;
            f_49_ = f_49_ + f_62_ + f_66_;
            f_46_ = f_61_ + (f_46_ + f_63_);
            f_47_ = f_60_ + (f_47_ + f_64_);
            float f_67_ = -f_59_ * (float) anInt8490;
            f_48_ = f_61_ + (f_65_ + f_48_);
            f_50_ = f_67_ + (f_50_ + f_63_);
        }
        float f_68_ = f_47_ - f + f_49_;
        aClass136_Sub4_Sub1_8493.method1246(false, (0x1 & i_53_) != 0);
        float f_69_ = f_48_ + (f_50_ - f_46_);
        aHa_Sub2_8491.method864(124);
        aHa_Sub2_8491.method889(-2, aClass136_Sub4_Sub1_8493);
        aHa_Sub2_8491.method885(0, i_52_);
        aHa_Sub2_8491.method881((byte) 123, i);
        OpenGL.glColor4ub((byte) (i_51_ >> 1937011472), (byte) (i_51_ >> -960607480), (byte) i_51_, (byte) (i_51_ >> 1430530232));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967));
        OpenGL.glVertex2f(f, f_46_);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(f_49_, f_50_);
        OpenGL.glTexCoord2f((((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969), 0.0F);
        OpenGL.glVertex2f(f_68_, f_69_);
        OpenGL.glTexCoord2f((((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969), (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967));
        OpenGL.glVertex2f(f_47_, f_48_);
        OpenGL.glEnd();
    }

    private final void method1188(byte i) {
        aHa_Sub2_8491.method880(true, 1);
        if (i == -32) {
            anInt8495++;
            aHa_Sub2_8491.method889(-2, null);
            aHa_Sub2_8491.method858(-91, 8448, 8448);
            aHa_Sub2_8491.method911(768, 34168, 1, (byte) 4);
            aHa_Sub2_8491.method849(0, 770, (byte) 37, 5890);
            aHa_Sub2_8491.method880(true, 0);
            aHa_Sub2_8491.method911(768, 34168, 1, (byte) 4);
        }
    }

    final void method1177(int i, int i_70_, int i_71_) {
        anInt8504++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        aClass136_Sub4_Sub1_8512 = Class311.method3269(aHa_Sub2_8491, i, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964, (byte) -54, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966, i_70_);
        anInt8508 = i_71_;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    final int method1169() {
        anInt8500++;
        return (anInt8506 + ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964 + anInt8499);
    }

    final void method1174(float f, float f_72_, float f_73_, float f_74_, float f_75_, float f_76_, int i, aa var_aa, int i_77_, int i_78_) {
        anInt8498++;
        Class136_Sub4_Sub1 class136_sub4_sub1 = ((aa_Sub2) (aa_Sub2) var_aa).aClass136_Sub4_Sub1_5256;
        if (aBoolean8496) {
            float f_79_ = (float) method1169();
            float f_80_ = (float) method1181();
            float f_81_ = (-f + f_73_) / f_79_;
            float f_82_ = (f_74_ - f_72_) / f_79_;
            float f_83_ = (f_75_ - f) / f_80_;
            float f_84_ = (-f_72_ + f_76_) / f_80_;
            float f_85_ = f_83_ * (float) anInt8486;
            float f_86_ = f_84_ * (float) anInt8486;
            float f_87_ = (float) anInt8499 * f_81_;
            float f_88_ = (float) anInt8499 * f_82_;
            float f_89_ = -f_81_ * (float) anInt8506;
            float f_90_ = -f_82_ * (float) anInt8506;
            float f_91_ = (float) anInt8490 * -f_83_;
            f_73_ = f_89_ + f_73_ + f_85_;
            f_75_ = f_75_ + f_87_ + f_91_;
            float f_92_ = -f_84_ * (float) anInt8490;
            f = f + f_87_ + f_85_;
            f_72_ = f_72_ + f_88_ + f_86_;
            f_74_ = f_86_ + (f_90_ + f_74_);
            f_76_ = f_88_ + f_76_ + f_92_;
        }
        float f_93_ = f_73_ - f + f_75_;
        aClass136_Sub4_Sub1_8493.method1246(false, (0x1 & i) != 0);
        float f_94_ = f_74_ + (-f_72_ + f_76_);
        aHa_Sub2_8491.method864(124);
        aHa_Sub2_8491.method889(-2, aClass136_Sub4_Sub1_8493);
        aHa_Sub2_8491.method881((byte) 113, 1);
        aHa_Sub2_8491.method880(true, 1);
        aHa_Sub2_8491.method889(-2, class136_sub4_sub1);
        aHa_Sub2_8491.method858(-40, 8448, 7681);
        aHa_Sub2_8491.method911(768, 34168, 0, (byte) 4);
        aHa_Sub2_8491.method885(0, 1);
        float f_95_ = (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9969 / (float) ((Class136_Sub4_Sub1) class136_sub4_sub1).anInt9964);
        float f_96_ = (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9967 / (float) ((Class136_Sub4_Sub1) class136_sub4_sub1).anInt9966);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
        OpenGL.glMultiTexCoord2f(33985, f_95_ * (f - (float) i_77_), ((((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9967) - (f_72_ - (float) i_78_) * f_96_));
        OpenGL.glVertex2f(f, f_72_);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) -i_77_ + f_75_) * f_95_, (-((f_76_ - (float) i_78_) * f_96_) + (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9967)));
        OpenGL.glVertex2f(f_75_, f_76_);
        OpenGL.glMultiTexCoord2f(33984, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, f_95_ * ((float) -i_77_ + f_93_), ((((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9967) - ((float) -i_78_ + f_94_) * f_96_));
        OpenGL.glVertex2f(f_93_, f_94_);
        OpenGL.glMultiTexCoord2f(33984, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
        OpenGL.glMultiTexCoord2f(33985, ((float) -i_77_ + f_73_) * f_95_, ((((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9967) - f_96_ * (f_74_ - (float) i_78_)));
        OpenGL.glVertex2f(f_73_, f_74_);
        OpenGL.glEnd();
        aHa_Sub2_8491.method911(768, 5890, 0, (byte) 4);
        aHa_Sub2_8491.method881((byte) 116, 0);
        aHa_Sub2_8491.method889(-2, null);
        aHa_Sub2_8491.method880(true, 0);
    }

    private final void method1189(int i, int i_97_, int i_98_, int i_99_, int[] is, int i_100_, int i_101_) {
        anInt8513++;
        aClass136_Sub4_Sub1_8493.method1262((byte) -53, i_98_, i_100_, i_99_, i_97_, true, is, i_101_, i);
    }

    private final void method1190(int i, byte i_102_) {
        aHa_Sub2_8491.method880(true, 1);
        anInt8487++;
        aHa_Sub2_8491.method889(-2, aClass136_Sub4_Sub1_8493);
        aHa_Sub2_8491.method858(i_102_ ^ 0x6a, 7681, aHa_Sub2_8491.method892(false, i));
        aHa_Sub2_8491.method911(768, 34167, 1, (byte) 4);
        aHa_Sub2_8491.method849(0, 770, (byte) 37, 34168);
        aHa_Sub2_8491.method880(true, 0);
        aHa_Sub2_8491.method889(-2, aClass136_Sub4_Sub1_8512);
        aHa_Sub2_8491.method858(-46, 7681, 34479);
        aHa_Sub2_8491.method911(768, 34166, 1, (byte) 4);
        if (anInt8508 != 0) {
            if (anInt8508 != 1) {
                if (anInt8508 == 2)
                    aHa_Sub2_8491.method910(i_102_ + -14245, 1.0F, 0.5F, 0.5F, 0.0F);
                else if (anInt8508 == 3)
                    aHa_Sub2_8491.method910(-14217, 128.5F, 128.5F, 128.5F, 0.0F);
            } else
                aHa_Sub2_8491.method910(-14217, 0.5F, 0.5F, 1.0F, 0.0F);
        } else
            aHa_Sub2_8491.method910(i_102_ + -14245, 0.5F, 1.0F, 0.5F, 0.0F);
        if (i_102_ != 28)
            method1180(-108, 7, -122, -17, -128, -34, 89);
    }

    final void method1164(int i, int i_103_, aa var_aa, int i_104_, int i_105_) {
        anInt8489++;
        aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
        Class136_Sub4_Sub1 class136_sub4_sub1 = ((aa_Sub2) var_aa_Sub2).aClass136_Sub4_Sub1_5256;
        aClass136_Sub4_Sub1_8493.method1246(false, false);
        aHa_Sub2_8491.method864(120);
        aHa_Sub2_8491.method889(-2, aClass136_Sub4_Sub1_8493);
        aHa_Sub2_8491.method881((byte) 127, 1);
        aHa_Sub2_8491.method880(true, 1);
        aHa_Sub2_8491.method889(-2, class136_sub4_sub1);
        aHa_Sub2_8491.method858(118, 8448, 7681);
        aHa_Sub2_8491.method911(768, 34168, 0, (byte) 4);
        aHa_Sub2_8491.method885(0, 1);
        i_103_ += anInt8486;
        i += anInt8499;
        int i_106_ = ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964 + i;
        int i_107_ = (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966 + i_103_);
        float f = (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9969 / (float) ((Class136_Sub4_Sub1) class136_sub4_sub1).anInt9964);
        float f_108_ = (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9967 / (float) ((Class136_Sub4_Sub1) class136_sub4_sub1).anInt9966);
        float f_109_ = (float) (-i_104_ + i) * f;
        float f_110_ = f * (float) (i_106_ - i_104_);
        float f_111_ = (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9967 - f_108_ * (float) (i_103_ - i_105_));
        float f_112_ = (-(f_108_ * (float) (i_107_ - i_105_)) + ((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9967);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
        OpenGL.glMultiTexCoord2f(33985, f_109_, f_111_);
        OpenGL.glVertex2i(i, i_103_);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, f_109_, f_112_);
        OpenGL.glVertex2i(i, (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966) + i_103_);
        OpenGL.glMultiTexCoord2f(33984, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, f_110_, f_112_);
        OpenGL.glVertex2i(i - -(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964), (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966) + i_103_);
        OpenGL.glMultiTexCoord2f(33984, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
        OpenGL.glMultiTexCoord2f(33985, f_110_, f_111_);
        OpenGL.glVertex2i((((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964) + i, i_103_);
        OpenGL.glEnd();
        aHa_Sub2_8491.method911(768, 5890, 0, (byte) 4);
        aHa_Sub2_8491.method881((byte) 115, 0);
        aHa_Sub2_8491.method889(-2, null);
        aHa_Sub2_8491.method880(true, 0);
    }

    final int method1181() {
        anInt8502++;
        return (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966 + anInt8486 - -anInt8490);
    }

    final void method1179(int[] is) {
        is[3] = anInt8490;
        is[0] = anInt8499;
        anInt8505++;
        is[1] = anInt8486;
        is[2] = anInt8506;
    }

    final void method1178(int i, int i_113_, int i_114_, int i_115_, int i_116_) {
        anInt8492++;
        aClass136_Sub4_Sub1_8493.method1246(false, false);
        aHa_Sub2_8491.method864(112);
        aHa_Sub2_8491.method885(0, i_116_);
        OpenGL.glColor4ub((byte) (i_115_ >> -1982703312), (byte) (i_115_ >> 1369417384), (byte) i_115_, (byte) (i_115_ >> -1729131368));
        i_113_ += anInt8486;
        i += anInt8499;
        if (aClass136_Sub4_Sub1_8512 == null) {
            aHa_Sub2_8491.method889(-2, aClass136_Sub4_Sub1_8493);
            aHa_Sub2_8491.method881((byte) 119, i_114_);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
            OpenGL.glVertex2i(i, i_113_);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(i, i_113_ - -((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966);
            OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, 0.0F);
            OpenGL.glVertex2i((((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964) + i, i_113_ + ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966);
            OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
            OpenGL.glVertex2i(i - -((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964, i_113_);
            OpenGL.glEnd();
        } else {
            method1190(i_114_, (byte) 28);
            aClass136_Sub4_Sub1_8512.method1246(false, false);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
            OpenGL.glTexCoord2f(0.0F, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
            OpenGL.glVertex2i(i, i_113_);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(i, (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966) + i_113_);
            OpenGL.glMultiTexCoord2f(33985, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, 0.0F);
            OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, 0.0F);
            OpenGL.glVertex2i(i - -((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964, (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9966) + i_113_);
            OpenGL.glMultiTexCoord2f(33985, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
            OpenGL.glTexCoord2f(((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9969, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).aFloat9967);
            OpenGL.glVertex2i(i - -((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_8493).anInt9964, i_113_);
            OpenGL.glEnd();
            method1188((byte) -32);
        }
    }

    Class129_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_117_, boolean bool) {
        anInt8490 = 0;
        aBoolean8496 = false;
        anInt8506 = 0;
        anInt8508 = 0;
        aHa_Sub2_8491 = var_ha_Sub2;
        aClass136_Sub4_Sub1_8493 = Viewport.method1871(var_ha_Sub2, 49, !bool ? 6407 : 6408, i_117_, i);
    }

    Class129_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_118_, int i_119_, int i_120_) {
        anInt8490 = 0;
        aBoolean8496 = false;
        anInt8506 = 0;
        anInt8508 = 0;
        aHa_Sub2_8491 = var_ha_Sub2;
        aClass136_Sub4_Sub1_8493 = Class311.method3269(var_ha_Sub2, i, i_119_, (byte) -54, i_120_, i_118_);
    }

    Class129_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_121_, int[] is, int i_122_, int i_123_) {
        anInt8490 = 0;
        aBoolean8496 = false;
        anInt8506 = 0;
        anInt8508 = 0;
        aHa_Sub2_8491 = var_ha_Sub2;
        aClass136_Sub4_Sub1_8493 = Class77.method563(i_121_, i_123_, 71, false, is, i_122_, i, var_ha_Sub2);
    }
}
