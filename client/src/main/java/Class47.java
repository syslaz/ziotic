/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

final class Class47 {
    private static int[] anIntArray601 = new int[1000];
    static int anInt602;
    static int anInt603;
    static int anInt604;
    private static int anInt605 = 0;
    static int anInt606;
    static Class278 aClass278_607;
    private static RSInterface2 aClass354_608;
    static int anInt609;
    static int anInt610;
    private static int[][] anIntArrayArray611;
    private static Class149[] aClass149Array612;
    private static int anInt613;
    static int anInt614;
    private static RSInterface2 aClass354_615;
    private static int[] anIntArray616 = new int[3];
    static int anInt617;
    private static Class1 aClass1_618;
    static int anInt619;
    private static String[] stringOpcodes;
    static int anInt621;
    private static int[] integerOpcodes;
    private static int[] anIntArray623;
    private static String[] aStringArray624;
    private static int anInt625;
    static int anInt626;
    private static int anInt627;

    static final void method340(int i, boolean bool) {
        /* empty */
    }

    private static final void executeInterfaceScript(RSInterface script, int i) {
        Object[] objects = ((RSInterface) script).interfaceOpcodes;
        int i_0_ = ((Integer) objects[0]).intValue();
        Node_Sub8_Sub18 script_ = Class374.method3874(i_0_, -7550);
        if (script_ != null) {
            integerOpcodes = (new int
                    [((Node_Sub8_Sub18) script_).integerInstructionsAmount]);
            int i_1_ = 0;
            stringOpcodes = (new String
                    [((Node_Sub8_Sub18) script_).stringInstructionsAmount]);
            int i_2_ = 0;
            for (int i_3_ = 1; i_3_ < objects.length; i_3_++) {
                if (objects[i_3_] instanceof Integer) {
                    int i_4_ = ((Integer) objects[i_3_]).intValue();
                    if (i_4_ == -2147483647)
                        i_4_ = ((RSInterface) script).anInt6849;
                    if (i_4_ == -2147483646)
                        i_4_ = ((RSInterface) script).anInt6843;
                    if (i_4_ == -2147483645)
                        i_4_ = ((((RSInterface) script).rsInter != null) ? ((RSInterface2) (((RSInterface) script).rsInter)).interfaceValues : -1);
                    if (i_4_ == -2147483644)
                        i_4_ = ((RSInterface) script).anInt6844;
                    if (i_4_ == -2147483643)
                        i_4_ = ((((RSInterface) script).rsInter != null) ? ((RSInterface2) (((RSInterface) script).rsInter)).index : -1);
                    if (i_4_ == -2147483642)
                        i_4_ = ((((RSInterface) script).aClass354_6850 != null) ? ((RSInterface2) (((RSInterface) script).aClass354_6850)).interfaceValues : -1);
                    if (i_4_ == -2147483641)
                        i_4_ = ((((RSInterface) script).aClass354_6850 != null) ? ((RSInterface2) (((RSInterface) script).aClass354_6850)).index : -1);
                    if (i_4_ == -2147483640)
                        i_4_ = ((RSInterface) script).anInt6854;
                    if (i_4_ == -2147483639)
                        i_4_ = ((RSInterface) script).anInt6855;
                    integerOpcodes[i_1_++] = i_4_;
                } else if (objects[i_3_] instanceof String) {
                    String string = (String) objects[i_3_];
                    if (string.equals("event_opbase"))
                        string = ((RSInterface) script).aString6851;
                    stringOpcodes[i_2_++] = string;
                }
            }
            anInt627 = ((RSInterface) script).anInt6842;
            method347(script_, i);
        }
    }

    static final void executeScript(RSInterface script) {
        executeInterfaceScript(script, 200000);
    }

    private static final void method343(int i, boolean bool) {
        if (i < 5100) {
            if (i == 5000) {
                anIntArray601[anInt613++] = Node_Sub8_Sub4.anInt8377;
                return;
            }
            if (i == 5001) {
                anInt613 -= 3;
                Node_Sub8_Sub4.anInt8377 = anIntArray601[anInt613];
                Class342.aClass200_4010 = Class279_Sub2_Sub1.method2899(anIntArray601[anInt613 + 1], (byte) -59);
                if (Class342.aClass200_4010 == null)
                    Class342.aClass200_4010 = Class342.aClass200_4003;
                Class40.anInt450 = anIntArray601[anInt613 + 2];
                anInt626++;
                Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class370.aOutgoingOpcode_4553);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-121, Node_Sub8_Sub4.anInt8377);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-44, ((Class200) Class342.aClass200_4010).anInt2287);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-86, Class40.anInt450);
                Class226_Sub3.method1814(class248_sub36, 0);
                return;
            }
            if (i == 5002) {
                anInt605 -= 2;
                String string = aStringArray624[anInt605];
                String string_5_ = aStringArray624[anInt605 + 1];
                anInt613 -= 2;
                int i_6_ = anIntArray601[anInt613];
                int i_7_ = anIntArray601[anInt613 + 1];
                if (string_5_ == null)
                    string_5_ = "";
                if (string_5_.length() > 80)
                    string_5_ = string_5_.substring(0, 80);
                anInt619++;
                Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class84_Sub7.aOutgoingOpcode_5469);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-85, (Class208.method1710(true, string) + 2 + Class208.method1710(true, string_5_)));
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -78);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-39, i_6_ - 1);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-69, i_7_);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string_5_, (byte) -114);
                Class226_Sub3.method1814(class248_sub36, 0);
                return;
            }
            if (i == 5003) {
                int i_8_ = anIntArray601[--anInt613];
                Class94 class94 = Class346_Sub7_Sub4.method3676(false, i_8_);
                String string = "";
                if (class94 != null && ((Class94) class94).aString1218 != null)
                    string = ((Class94) class94).aString1218;
                aStringArray624[anInt605++] = string;
                return;
            }
            if (i == 5004) {
                int i_9_ = anIntArray601[--anInt613];
                Class94 class94 = Class346_Sub7_Sub4.method3676(false, i_9_);
                int i_10_ = -1;
                if (class94 != null)
                    i_10_ = ((Class94) class94).anInt1225;
                anIntArray601[anInt613++] = i_10_;
                return;
            }
            if (i == 5005) {
                if (Class342.aClass200_4010 == null)
                    anIntArray601[anInt613++] = -1;
                else {
                    anIntArray601[anInt613++] = ((Class200) Class342.aClass200_4010).anInt2287;
                    return;
                }
                return;
            }
            if (i == 5006) {
                int i_11_ = anIntArray601[--anInt613];
                Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class253_Sub1.aOutgoingOpcode_7502);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-37, i_11_);
                Class226_Sub3.method1814(class248_sub36, 0);
                return;
            }
            if (i == 5008) {
                String string = aStringArray624[--anInt605];
                method345(string, i);
                return;
            }
            if (i == 5009) {
                anInt605 -= 2;
                String string = aStringArray624[anInt605];
                String string_12_ = aStringArray624[anInt605 + 1];
                if (Class226_Sub1_Sub1.anInt8801 != 0 || ((!Class118.aBoolean1484 || Class17.aBoolean287) && !Node_Sub8_Sub11.aBoolean8992)) {
                    anInt603++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub4.aOutgoingOpcode_6832));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-55, 0);
                    int i_13_ = (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -108);
                    Class166.method1537((byte) -98, (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257), string_12_);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2216(-20198, (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset) - i_13_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    return;
                }
                return;
            }
            if (i == 5010) {
                int i_14_ = anIntArray601[--anInt613];
                Class94 class94 = Class346_Sub7_Sub4.method3676(false, i_14_);
                String string = "";
                if (class94 != null && ((Class94) class94).aString1214 != null)
                    string = ((Class94) class94).aString1214;
                aStringArray624[anInt605++] = string;
                return;
            }
            if (i == 5011) {
                int i_15_ = anIntArray601[--anInt613];
                Class94 class94 = Class346_Sub7_Sub4.method3676(false, i_15_);
                String string = "";
                if (class94 != null && ((Class94) class94).aString1221 != null)
                    string = ((Class94) class94).aString1221;
                aStringArray624[anInt605++] = string;
                return;
            }
            if (i == 5012) {
                int i_16_ = anIntArray601[--anInt613];
                Class94 class94 = Class346_Sub7_Sub4.method3676(false, i_16_);
                int i_17_ = -1;
                if (class94 != null)
                    i_17_ = ((Class94) class94).anInt1212;
                anIntArray601[anInt613++] = i_17_;
                return;
            }
            if (i == 5015) {
                String string;
                if (Class347.myPlayer != null && (((Player) Class347.myPlayer).name) != null)
                    string = Class347.myPlayer.method3657(-116, true);
                else
                    string = "";
                aStringArray624[anInt605++] = string;
                return;
            }
            if (i == 5016) {
                anIntArray601[anInt613++] = Class40.anInt450;
                return;
            }
            if (i == 5017) {
                anIntArray601[anInt613++] = Node_Sub33.method2567((byte) 106);
                return;
            }
            if (i == 5018) {
                int i_18_ = anIntArray601[--anInt613];
                Class94 class94 = Class346_Sub7_Sub4.method3676(false, i_18_);
                int i_19_ = 0;
                if (class94 != null)
                    i_19_ = ((Class94) class94).anInt1216;
                anIntArray601[anInt613++] = i_19_;
                return;
            }
            if (i == 5019) {
                int i_20_ = anIntArray601[--anInt613];
                Class94 class94 = Class346_Sub7_Sub4.method3676(false, i_20_);
                String string = "";
                if (class94 != null && ((Class94) class94).aString1220 != null)
                    string = ((Class94) class94).aString1220;
                aStringArray624[anInt605++] = string;
                return;
            }
            if (i == 5020) {
                String string;
                if (Class347.myPlayer != null && (((Player) Class347.myPlayer).name) != null)
                    string = Class347.myPlayer.method3655((byte) -113, false);
                else
                    string = "";
                aStringArray624[anInt605++] = string;
                return;
            }
            if (i == 5023) {
                int i_21_ = anIntArray601[--anInt613];
                Class94 class94 = Class346_Sub7_Sub4.method3676(false, i_21_);
                int i_22_ = -1;
                if (class94 != null)
                    i_22_ = ((Class94) class94).anInt1215;
                anIntArray601[anInt613++] = i_22_;
                return;
            }
            if (i == 5024) {
                int i_23_ = anIntArray601[--anInt613];
                Class94 class94 = Class346_Sub7_Sub4.method3676(false, i_23_);
                int i_24_ = -1;
                if (class94 != null)
                    i_24_ = ((Class94) class94).anInt1213;
                anIntArray601[anInt613++] = i_24_;
                return;
            }
            if (i == 5025) {
                int i_25_ = anIntArray601[--anInt613];
                Class94 class94 = Class346_Sub7_Sub4.method3676(false, i_25_);
                String string = "";
                if (class94 != null && ((Class94) class94).aString1209 != null)
                    string = ((Class94) class94).aString1209;
                aStringArray624[anInt605++] = string;
                return;
            }
            if (i == 5050) {
                int i_26_ = anIntArray601[--anInt613];
                aStringArray624[anInt605++] = (((Node_Sub8_Sub6) Class23.aClass6_326.method183(15076, i_26_)).aString8942);
                return;
            }
            if (i == 5051) {
                int i_27_ = anIntArray601[--anInt613];
                Node_Sub8_Sub6 class248_sub8_sub6 = Class23.aClass6_326.method183(15076, i_27_);
                if (((Node_Sub8_Sub6) class248_sub8_sub6).anIntArray8946 == null)
                    anIntArray601[anInt613++] = 0;
                else {
                    anIntArray601[anInt613++] = (((Node_Sub8_Sub6) class248_sub8_sub6).anIntArray8946).length;
                    return;
                }
                return;
            }
            if (i == 5052) {
                anInt613 -= 2;
                int i_28_ = anIntArray601[anInt613];
                int i_29_ = anIntArray601[anInt613 + 1];
                Node_Sub8_Sub6 class248_sub8_sub6 = Class23.aClass6_326.method183(15076, i_28_);
                int i_30_ = (((Node_Sub8_Sub6) class248_sub8_sub6).anIntArray8946[i_29_]);
                anIntArray601[anInt613++] = i_30_;
                return;
            }
            if (i == 5053) {
                int i_31_ = anIntArray601[--anInt613];
                Node_Sub8_Sub6 class248_sub8_sub6 = Class23.aClass6_326.method183(15076, i_31_);
                if (((Node_Sub8_Sub6) class248_sub8_sub6).anIntArray8945 == null)
                    anIntArray601[anInt613++] = 0;
                else {
                    anIntArray601[anInt613++] = (((Node_Sub8_Sub6) class248_sub8_sub6).anIntArray8945).length;
                    return;
                }
                return;
            }
            if (i == 5054) {
                anInt613 -= 2;
                int i_32_ = anIntArray601[anInt613];
                int i_33_ = anIntArray601[anInt613 + 1];
                anIntArray601[anInt613++] = (((Node_Sub8_Sub6) Class23.aClass6_326.method183(15076, i_32_)).anIntArray8945[i_33_]);
                return;
            }
            if (i == 5055) {
                int i_34_ = anIntArray601[--anInt613];
                aStringArray624[anInt605++] = Class44_Sub1.aClass152_5288.method1356(true, i_34_).method2155(false);
                return;
            }
            if (i == 5056) {
                int i_35_ = anIntArray601[--anInt613];
                Node_Sub8_Sub20 class248_sub8_sub20 = Class44_Sub1.aClass152_5288.method1356(true, i_35_);
                if (((Node_Sub8_Sub20) class248_sub8_sub20).anIntArray9092 == null)
                    anIntArray601[anInt613++] = 0;
                else {
                    anIntArray601[anInt613++] = (((Node_Sub8_Sub20) class248_sub8_sub20).anIntArray9092).length;
                    return;
                }
                return;
            }
            if (i == 5057) {
                anInt613 -= 2;
                int i_36_ = anIntArray601[anInt613];
                int i_37_ = anIntArray601[anInt613 + 1];
                anIntArray601[anInt613++] = (((Node_Sub8_Sub20) Class44_Sub1.aClass152_5288.method1356(true, i_36_)).anIntArray9092[i_37_]);
                return;
            }
            if (i == 5058) {
                aClass1_618 = new Class1();
                ((Class1) aClass1_618).anInt112 = anIntArray601[--anInt613];
                ((Class1) aClass1_618).aClass248_Sub8_Sub20_106 = Class44_Sub1.aClass152_5288.method1356(true, ((Class1) aClass1_618).anInt112);
                ((Class1) aClass1_618).anIntArray107 = new int[((Class1) aClass1_618).aClass248_Sub8_Sub20_106.method2154(-1)];
                return;
            }
            if (i == 5059) {
                anInt617++;
                Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class8.aOutgoingOpcode_180);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-20, 0);
                int i_38_ = (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-85, 0);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, ((Class1) aClass1_618).anInt112);
                ((Class1) aClass1_618).aClass248_Sub8_Sub20_106.method2150((((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257), (byte) 77, ((Class1) aClass1_618).anIntArray107);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2216(-20198, (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset - i_38_));
                Class226_Sub3.method1814(class248_sub36, 0);
                return;
            }
            if (i == 5060) {
                String string = aStringArray624[--anInt605];
                anInt609++;
                Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub14_Sub15.aOutgoingOpcode_9322));
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-25, 0);
                int i_39_ = (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -65);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, ((Class1) aClass1_618).anInt112);
                ((Class1) aClass1_618).aClass248_Sub8_Sub20_106.method2150((((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257), (byte) 77, ((Class1) aClass1_618).anIntArray107);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2216(-20198, (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset - i_39_));
                Class226_Sub3.method1814(class248_sub36, 0);
                return;
            }
            if (i == 5061) {
                anInt617++;
                Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class8.aOutgoingOpcode_180);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-91, 0);
                int i_40_ = (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-116, 1);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, ((Class1) aClass1_618).anInt112);
                ((Class1) aClass1_618).aClass248_Sub8_Sub20_106.method2150((((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257), (byte) 77, ((Class1) aClass1_618).anIntArray107);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2216(-20198, (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset - i_40_));
                Class226_Sub3.method1814(class248_sub36, 0);
                return;
            }
            if (i == 5062) {
                anInt613 -= 2;
                int i_41_ = anIntArray601[anInt613];
                int i_42_ = anIntArray601[anInt613 + 1];
                anIntArray601[anInt613++] = (((Node_Sub8_Sub6) Class23.aClass6_326.method183(15076, i_41_)).aCharArray8950[i_42_]);
                return;
            }
            if (i == 5063) {
                anInt613 -= 2;
                int i_43_ = anIntArray601[anInt613];
                int i_44_ = anIntArray601[anInt613 + 1];
                anIntArray601[anInt613++] = (((Node_Sub8_Sub6) Class23.aClass6_326.method183(15076, i_43_)).aCharArray8944[i_44_]);
                return;
            }
            if (i == 5064) {
                anInt613 -= 2;
                int i_45_ = anIntArray601[anInt613];
                int i_46_ = anIntArray601[anInt613 + 1];
                if (i_46_ == -1)
                    anIntArray601[anInt613++] = -1;
                else {
                    anIntArray601[anInt613++] = Class23.aClass6_326.method183(15076, i_45_).method2056((char) i_46_, 4137);
                    return;
                }
                return;
            }
            if (i == 5065) {
                anInt613 -= 2;
                int i_47_ = anIntArray601[anInt613];
                int i_48_ = anIntArray601[anInt613 + 1];
                if (i_48_ == -1)
                    anIntArray601[anInt613++] = -1;
                else {
                    anIntArray601[anInt613++] = Class23.aClass6_326.method183(15076, i_47_).method2059((byte) 101, (char) i_48_);
                    return;
                }
                return;
            }
            if (i == 5066) {
                int i_49_ = anIntArray601[--anInt613];
                anIntArray601[anInt613++] = Class44_Sub1.aClass152_5288.method1356(true, i_49_).method2154(-1);
                return;
            }
            if (i == 5067) {
                anInt613 -= 2;
                int i_50_ = anIntArray601[anInt613];
                int i_51_ = anIntArray601[anInt613 + 1];
                int i_52_ = (((Class168) Class44_Sub1.aClass152_5288.method1356(true, i_50_).method2153(false, i_51_)).anInt1967);
                anIntArray601[anInt613++] = i_52_;
                return;
            }
            if (i == 5068) {
                anInt613 -= 2;
                int i_53_ = anIntArray601[anInt613];
                int i_54_ = anIntArray601[anInt613 + 1];
                ((Class1) aClass1_618).anIntArray107[i_53_] = i_54_;
                return;
            }
            if (i == 5069) {
                anInt613 -= 2;
                int i_55_ = anIntArray601[anInt613];
                int i_56_ = anIntArray601[anInt613 + 1];
                ((Class1) aClass1_618).anIntArray107[i_55_] = i_56_;
                return;
            }
            if (i == 5070) {
                anInt613 -= 3;
                int i_57_ = anIntArray601[anInt613];
                int i_58_ = anIntArray601[anInt613 + 1];
                int i_59_ = anIntArray601[anInt613 + 2];
                Node_Sub8_Sub20 class248_sub8_sub20 = Class44_Sub1.aClass152_5288.method1356(true, i_57_);
                if ((((Class168) class248_sub8_sub20.method2153(false, i_58_)).anInt1967) != 0)
                    throw new RuntimeException("bad command");
                anIntArray601[anInt613++] = class248_sub8_sub20.method2151(i_58_, i_59_, (byte) -107);
                return;
            }
            if (i == 5071) {
                String string = aStringArray624[--anInt605];
                boolean bool_60_ = anIntArray601[--anInt613] == 1;
                Class346_Sub7_Sub1.method3583(string, 2, bool_60_);
                anIntArray601[anInt613++] = Class346_Sub7_Sub2_Sub4.anInt10111;
                return;
            }
            if (i == 5072) {
                if (Class19.aShortArray305 == null || (Node_Sub21.anInt7054 >= Class346_Sub7_Sub2_Sub4.anInt10111))
                    anIntArray601[anInt613++] = -1;
                else {
                    anIntArray601[anInt613++] = (Class19.aShortArray305[Node_Sub21.anInt7054++] & 0xffff);
                    return;
                }
                return;
            }
            if (i == 5073) {
                Node_Sub21.anInt7054 = 0;
                return;
            }
        } else if (i < 5200) {
            if (i == 5100) {
                if (Class353.aClass253_4192.method2722(true, 86))
                    anIntArray601[anInt613++] = 1;
                else {
                    anIntArray601[anInt613++] = 0;
                    return;
                }
                return;
            }
            if (i == 5101) {
                if (Class353.aClass253_4192.method2722(true, 82))
                    anIntArray601[anInt613++] = 1;
                else {
                    anIntArray601[anInt613++] = 0;
                    return;
                }
                return;
            }
            if (i == 5102) {
                if (Class353.aClass253_4192.method2722(true, 81))
                    anIntArray601[anInt613++] = 1;
                else {
                    anIntArray601[anInt613++] = 0;
                    return;
                }
                return;
            }
        } else if (i < 5300) {
            if (i == 5200) {
                Class264.method2775(false, anIntArray601[--anInt613]);
                return;
            }
            if (i == 5201) {
                anIntArray601[anInt613++] = Class81.method586((byte) 114);
                return;
            }
            if (i == 5205) {
                Class73.method541(-1, false, -2753, anIntArray601[--anInt613], -1);
                return;
            }
            if (i == 5206) {
                int i_61_ = anIntArray601[--anInt613];
                Node_Sub8_Sub1 class248_sub8_sub1 = Class116.method1081(i_61_ >> 14 & 0x3fff, i_61_ & 0x3fff);
                if (class248_sub8_sub1 == null)
                    anIntArray601[anInt613++] = -1;
                else {
                    anIntArray601[anInt613++] = ((Node_Sub8_Sub1) class248_sub8_sub1).anInt8895;
                    return;
                }
                return;
            }
            if (i == 5207) {
                Node_Sub8_Sub1 class248_sub8_sub1 = Class116.method1094(anIntArray601[--anInt613]);
                if (class248_sub8_sub1 == null || (((Node_Sub8_Sub1) class248_sub8_sub1).aString8898 == null))
                    aStringArray624[anInt605++] = "";
                else {
                    aStringArray624[anInt605++] = (((Node_Sub8_Sub1) class248_sub8_sub1).aString8898);
                    return;
                }
                return;
            }
            if (i == 5208) {
                anIntArray601[anInt613++] = Class36.anInt406;
                anIntArray601[anInt613++] = Class226.anInt2549;
                return;
            }
            if (i == 5209) {
                anIntArray601[anInt613++] = Node_Sub14_Sub30.anInt9478 + Class116.anInt1468;
                anIntArray601[anInt613++] = Class261.anInt2972 + Class116.anInt1469;
                return;
            }
            if (i == 5210) {
                int i_62_ = anIntArray601[--anInt613];
                Node_Sub8_Sub1 class248_sub8_sub1 = Class116.method1094(i_62_);
                if (class248_sub8_sub1 == null) {
                    anIntArray601[anInt613++] = 0;
                    anIntArray601[anInt613++] = 0;
                } else {
                    anIntArray601[anInt613++] = (((Node_Sub8_Sub1) class248_sub8_sub1).anInt8891 >> 14) & 0x3fff;
                    anIntArray601[anInt613++] = (((Node_Sub8_Sub1) class248_sub8_sub1).anInt8891 & 0x3fff);
                    return;
                }
                return;
            }
            if (i == 5211) {
                int i_63_ = anIntArray601[--anInt613];
                Node_Sub8_Sub1 class248_sub8_sub1 = Class116.method1094(i_63_);
                if (class248_sub8_sub1 == null) {
                    anIntArray601[anInt613++] = 0;
                    anIntArray601[anInt613++] = 0;
                } else {
                    anIntArray601[anInt613++] = (((Node_Sub8_Sub1) class248_sub8_sub1).anInt8888 - (((Node_Sub8_Sub1) class248_sub8_sub1).anInt8897));
                    anIntArray601[anInt613++] = (((Node_Sub8_Sub1) class248_sub8_sub1).anInt8901 - (((Node_Sub8_Sub1) class248_sub8_sub1).anInt8887));
                    return;
                }
                return;
            }
            if (i == 5212) {
                Node_Sub35 class248_sub35 = Node_Sub14_Sub19.method2333((byte) -91);
                if (class248_sub35 == null) {
                    anIntArray601[anInt613++] = -1;
                    anIntArray601[anInt613++] = -1;
                } else {
                    anIntArray601[anInt613++] = ((Node_Sub35) class248_sub35).anInt7243;
                    int i_64_ = (((Node_Sub35) class248_sub35).anInt7244 << 28 | (((Node_Sub35) class248_sub35).anInt7252 + Class116.anInt1468) << 14 | (((Node_Sub35) class248_sub35).anInt7246 + Class116.anInt1469));
                    anIntArray601[anInt613++] = i_64_;
                    return;
                }
                return;
            }
            if (i == 5213) {
                Node_Sub35 class248_sub35 = Class351.method3742((byte) -24);
                if (class248_sub35 == null) {
                    anIntArray601[anInt613++] = -1;
                    anIntArray601[anInt613++] = -1;
                } else {
                    anIntArray601[anInt613++] = ((Node_Sub35) class248_sub35).anInt7243;
                    int i_65_ = (((Node_Sub35) class248_sub35).anInt7244 << 28 | (((Node_Sub35) class248_sub35).anInt7252 + Class116.anInt1468) << 14 | (((Node_Sub35) class248_sub35).anInt7246 + Class116.anInt1469));
                    anIntArray601[anInt613++] = i_65_;
                    return;
                }
                return;
            }
            if (i == 5214) {
                int i_66_ = anIntArray601[--anInt613];
                Node_Sub8_Sub1 class248_sub8_sub1 = Class340_Sub5.method3456(125);
                if (class248_sub8_sub1 != null) {
                    boolean bool_67_ = class248_sub8_sub1.method2031(anIntArray616, i_66_ >> 14 & 0x3fff, i_66_ & 0x3fff, i_66_ >> 28 & 0x3, 0);
                    if (bool_67_)
                        Class64.method495(anIntArray616[2], anIntArray616[1], (byte) -87);
                }
                return;
            }
            if (i == 5215) {
                anInt613 -= 2;
                int i_68_ = anIntArray601[anInt613];
                int i_69_ = anIntArray601[anInt613 + 1];
                Class64 class64 = Class116.method1086(i_68_ >> 14 & 0x3fff, i_68_ & 0x3fff);
                boolean bool_70_ = false;
                for (Node_Sub8_Sub1 class248_sub8_sub1 = (Node_Sub8_Sub1) class64.method492(896); class248_sub8_sub1 != null; class248_sub8_sub1 = (Node_Sub8_Sub1) class64.method490(true)) {
                    if (((Node_Sub8_Sub1) class248_sub8_sub1).anInt8895 == i_69_) {
                        bool_70_ = true;
                        break;
                    }
                }
                if (bool_70_)
                    anIntArray601[anInt613++] = 1;
                else {
                    anIntArray601[anInt613++] = 0;
                    return;
                }
                return;
            }
            if (i == 5218) {
                int i_71_ = anIntArray601[--anInt613];
                Node_Sub8_Sub1 class248_sub8_sub1 = Class116.method1094(i_71_);
                if (class248_sub8_sub1 == null)
                    anIntArray601[anInt613++] = -1;
                else {
                    anIntArray601[anInt613++] = ((Node_Sub8_Sub1) class248_sub8_sub1).anInt8900;
                    return;
                }
                return;
            }
            if (i == 5220) {
                anIntArray601[anInt613++] = Node_Sub14_Sub5.anInt9208 == 100 ? 1 : 0;
                return;
            }
            if (i == 5221) {
                int i_72_ = anIntArray601[--anInt613];
                Class64.method495(i_72_ & 0x3fff, i_72_ >> 14 & 0x3fff, (byte) -87);
                return;
            }
            if (i == 5222) {
                Node_Sub8_Sub1 class248_sub8_sub1 = Class340_Sub5.method3456(123);
                if (class248_sub8_sub1 != null) {
                    boolean bool_73_ = class248_sub8_sub1.method2033(((Node_Sub14_Sub30.anInt9478) + Class116.anInt1468), (Class261.anInt2972 + Class116.anInt1469), -95, anIntArray616);
                    if (bool_73_) {
                        anIntArray601[anInt613++] = anIntArray616[1];
                        anIntArray601[anInt613++] = anIntArray616[2];
                    } else {
                        anIntArray601[anInt613++] = -1;
                        anIntArray601[anInt613++] = -1;
                    }
                } else {
                    anIntArray601[anInt613++] = -1;
                    anIntArray601[anInt613++] = -1;
                    return;
                }
                return;
            }
            if (i == 5223) {
                anInt613 -= 2;
                int i_74_ = anIntArray601[anInt613];
                int i_75_ = anIntArray601[anInt613 + 1];
                Class73.method541(i_75_ & 0x3fff, false, -2753, i_74_, i_75_ >> 14 & 0x3fff);
                return;
            }
            if (i == 5224) {
                int i_76_ = anIntArray601[--anInt613];
                Node_Sub8_Sub1 class248_sub8_sub1 = Class340_Sub5.method3456(124);
                if (class248_sub8_sub1 != null) {
                    boolean bool_77_ = class248_sub8_sub1.method2031(anIntArray616, i_76_ >> 14 & 0x3fff, i_76_ & 0x3fff, i_76_ >> 28 & 0x3, 0);
                    if (bool_77_) {
                        anIntArray601[anInt613++] = anIntArray616[1];
                        anIntArray601[anInt613++] = anIntArray616[2];
                    } else {
                        anIntArray601[anInt613++] = -1;
                        anIntArray601[anInt613++] = -1;
                    }
                } else {
                    anIntArray601[anInt613++] = -1;
                    anIntArray601[anInt613++] = -1;
                    return;
                }
                return;
            }
            if (i == 5225) {
                int i_78_ = anIntArray601[--anInt613];
                Node_Sub8_Sub1 class248_sub8_sub1 = Class340_Sub5.method3456(124);
                if (class248_sub8_sub1 != null) {
                    boolean bool_79_ = class248_sub8_sub1.method2033(i_78_ >> 14 & 0x3fff, i_78_ & 0x3fff, -112, anIntArray616);
                    if (bool_79_) {
                        anIntArray601[anInt613++] = anIntArray616[1];
                        anIntArray601[anInt613++] = anIntArray616[2];
                    } else {
                        anIntArray601[anInt613++] = -1;
                        anIntArray601[anInt613++] = -1;
                    }
                } else {
                    anIntArray601[anInt613++] = -1;
                    anIntArray601[anInt613++] = -1;
                    return;
                }
                return;
            }
            if (i == 5226) {
                Node_Sub42_Sub2.method2634(6408, anIntArray601[--anInt613]);
                return;
            }
            if (i == 5227) {
                anInt613 -= 2;
                int i_80_ = anIntArray601[anInt613];
                int i_81_ = anIntArray601[anInt613 + 1];
                Class73.method541(i_81_ & 0x3fff, true, -2753, i_80_, i_81_ >> 14 & 0x3fff);
                return;
            }
            if (i == 5228) {
                Class141.aBoolean5059 = anIntArray601[--anInt613] == 1;
                return;
            }
            if (i == 5229) {
                anIntArray601[anInt613++] = Class141.aBoolean5059 ? 1 : 0;
                return;
            }
            if (i == 5230) {
                int i_82_ = anIntArray601[--anInt613];
                ObjectDefinition.method2801((byte) -120, i_82_);
                return;
            }
            if (i == 5231) {
                anInt613 -= 2;
                int i_83_ = anIntArray601[anInt613];
                boolean bool_84_ = anIntArray601[anInt613 + 1] == 1;
                if (Node_Sub12.aClass65_6963 != null) {
                    Node node = Node_Sub12.aClass65_6963.method501((long) i_83_, (byte) 31);
                    if (node != null && !bool_84_)
                        node.remove(true);
                    else if (node == null && bool_84_) {
                        node = new Node();
                        Node_Sub12.aClass65_6963.method509(-1, node, (long) i_83_);
                    }
                }
                return;
            }
            if (i == 5232) {
                int i_85_ = anIntArray601[--anInt613];
                if (Node_Sub12.aClass65_6963 != null) {
                    Node node = Node_Sub12.aClass65_6963.method501((long) i_85_, (byte) 31);
                    anIntArray601[anInt613++] = node != null ? 1 : 0;
                } else {
                    anIntArray601[anInt613++] = 0;
                    return;
                }
                return;
            }
            if (i == 5233) {
                anInt613 -= 2;
                int i_86_ = anIntArray601[anInt613];
                boolean bool_87_ = anIntArray601[anInt613 + 1] == 1;
                if (za_Sub1.aClass65_9797 != null) {
                    Node node = za_Sub1.aClass65_9797.method501((long) i_86_, (byte) 31);
                    if (node != null && !bool_87_)
                        node.remove(true);
                    else if (node == null && bool_87_) {
                        node = new Node();
                        za_Sub1.aClass65_9797.method509(-1, node, (long) i_86_);
                    }
                }
                return;
            }
            if (i == 5234) {
                int i_88_ = anIntArray601[--anInt613];
                if (za_Sub1.aClass65_9797 != null) {
                    Node node = za_Sub1.aClass65_9797.method501((long) i_88_, (byte) 31);
                    anIntArray601[anInt613++] = node != null ? 1 : 0;
                } else {
                    anIntArray601[anInt613++] = 0;
                    return;
                }
                return;
            }
            if (i == 5235) {
                anIntArray601[anInt613++] = (Class116.aClass248_Sub8_Sub1_1434 != null ? ((Node_Sub8_Sub1) Class116.aClass248_Sub8_Sub1_1434).anInt8895 : -1);
                return;
            }
            if (i == 5236) {
                anInt613 -= 2;
                int i_89_ = anIntArray601[anInt613];
                int i_90_ = anIntArray601[anInt613 + 1];
                int i_91_ = i_90_ >> 14 & 0x3fff;
                int i_92_ = i_90_ & 0x3fff;
                int i_93_ = Node_Sub14_Sub28.method2359(i_92_, i_89_, true, i_91_);
                if (i_93_ < 0)
                    anIntArray601[anInt613++] = -1;
                else {
                    anIntArray601[anInt613++] = i_93_;
                    return;
                }
                return;
            }
            if (i == 5237) {
                Node_Sub8_Sub7.method2069(-15074);
                return;
            }
        } else if (i < 5400) {
            if (i == 5300) {
                anInt613 -= 2;
                int i_94_ = anIntArray601[anInt613];
                int i_95_ = anIntArray601[anInt613 + 1];
                Class138.method1274(false, 3, i_95_, i_94_, -1);
                anIntArray601[anInt613++] = Node_Sub48.aFrame7432 != null ? 1 : 0;
                return;
            }
            if (i == 5301) {
                if (Node_Sub48.aFrame7432 != null)
                    Class138.method1274(false, ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub1_7346.method2925(true), -1, -1, -1);
                return;
            }
            if (i == 5302) {
                Class377[] class377s = Class282_Sub14.method2977(false);
                anIntArray601[anInt613++] = class377s.length;
                return;
            }
            if (i == 5303) {
                int i_96_ = anIntArray601[--anInt613];
                Class377[] class377s = Class282_Sub14.method2977(false);
                anIntArray601[anInt613++] = ((Class377) class377s[i_96_]).anInt4620;
                anIntArray601[anInt613++] = ((Class377) class377s[i_96_]).anInt4619;
                return;
            }
            if (i == 5305) {
                int i_97_ = za.anInt7491;
                int i_98_ = Class25.anInt332;
                int i_99_ = -1;
                Class377[] class377s = Class282_Sub14.method2977(false);
                for (int i_100_ = 0; i_100_ < class377s.length; i_100_++) {
                    Class377 class377 = class377s[i_100_];
                    if (((Class377) class377).anInt4620 == i_97_ && ((Class377) class377).anInt4619 == i_98_) {
                        i_99_ = i_100_;
                        break;
                    }
                }
                anIntArray601[anInt613++] = i_99_;
                return;
            }
            if (i == 5306) {
                anIntArray601[anInt613++] = Class346_Sub7_Sub3.method3672((byte) -112);
                return;
            }
            if (i == 5307) {
                int i_101_ = anIntArray601[--anInt613];
                if (i_101_ >= 1 && i_101_ <= 2) {
                    Class138.method1274(false, i_101_, -1, -1, -1);
                    return;
                }
                return;
            }
            if (i == 5308) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub1_7346.method2925(true);
                return;
            }
            if (i == 5309) {
                int i_102_ = anIntArray601[--anInt613];
                if (i_102_ >= 1 && i_102_ <= 2) {
                    Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub1_7346), (byte) -71, i_102_);
                    Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub1_7354), (byte) -71, i_102_);
                    Class293.method3113(17458);
                    return;
                }
                return;
            }
        } else if (i < 5500) {
            if (i == 5400) {
                anInt605 -= 2;
                String string = aStringArray624[anInt605];
                String string_103_ = aStringArray624[anInt605 + 1];
                int i_104_ = anIntArray601[--anInt613];
                anInt610++;
                Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Node_Sub50.aOutgoingOpcode_7439);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-119, (Class208.method1710(true, string) + Class208.method1710(true, string_103_) + 1));
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -93);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string_103_, (byte) -74);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-92, i_104_);
                Class226_Sub3.method1814(class248_sub36, 0);
                return;
            }
            if (i == 5401) {
                anInt613 -= 2;
                Class166.aShortArray1948[anIntArray601[anInt613]] = (short) Class363.method3823(anIntArray601[anInt613 + 1], (byte) 113);
                Class283.aClass342_3343.method3483(-90);
                Class283.aClass342_3343.method3492((byte) 103);
                Class148.aClass119_5096.method1122((byte) -119);
                Class60.method472(-101);
                return;
            }
            if (i == 5405) {
                anInt613 -= 2;
                int i_105_ = anIntArray601[anInt613];
                int i_106_ = anIntArray601[anInt613 + 1];
                if (i_105_ >= 0 && i_105_ < 2)
                    Class59.anIntArrayArrayArray808[i_105_] = new int[i_106_ << 1][4];
                return;
            }
            if (i == 5406) {
                anInt613 -= 7;
                int i_107_ = anIntArray601[anInt613];
                int i_108_ = anIntArray601[anInt613 + 1] << 1;
                int i_109_ = anIntArray601[anInt613 + 2];
                int i_110_ = anIntArray601[anInt613 + 3];
                int i_111_ = anIntArray601[anInt613 + 4];
                int i_112_ = anIntArray601[anInt613 + 5];
                int i_113_ = anIntArray601[anInt613 + 6];
                if (i_107_ >= 0 && i_107_ < 2 && Class59.anIntArrayArrayArray808[i_107_] != null && i_108_ >= 0 && (i_108_ < Class59.anIntArrayArrayArray808[i_107_].length)) {
                    Class59.anIntArrayArrayArray808[i_107_][i_108_] = new int[]{(i_109_ >> 14 & 0x3fff) << 9, i_110_ << 2, (i_109_ & 0x3fff) << 9, i_113_};
                    Class59.anIntArrayArrayArray808[i_107_][i_108_ + 1] = new int[]{(i_111_ >> 14 & 0x3fff) << 9, i_112_ << 2, (i_111_ & 0x3fff) << 9};
                }
                return;
            }
            if (i == 5407) {
                int i_114_ = ((Class59.anIntArrayArrayArray808[anIntArray601[--anInt613]]).length >> 1);
                anIntArray601[anInt613++] = i_114_;
                return;
            }
            if (i == 5411) {
                if (Node_Sub48.aFrame7432 != null)
                    Class138.method1274(false, ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub1_7346.method2925(true), -1, -1, -1);
                if (Class300.aFrame3494 != null) {
                    Class94.method691((byte) -83);
                    System.exit(0);
                } else {
                    String string = (Class352.aString4188 != null ? Class352.aString4188 : Class50.method395(-1));
                    Class99.method710(string, 0, ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub15_7358.method2984(true) == 1, Node_Sub14_Sub15.aClass174_9328, false);
                    return;
                }
                return;
            }
            if (i == 5419) {
                String string = "";
                if (za_Sub1.aClass322_9801 != null) {
                    if (za_Sub1.aClass322_9801.anObject3787 != null)
                        string = (String) za_Sub1.aClass322_9801.anObject3787;
                    else
                        string = Node_Sub29.method2557((byte) -80, (za_Sub1.aClass322_9801.anInt3784));
                }
                aStringArray624[anInt605++] = string;
                return;
            }
            if (i == 5420) {
                anIntArray601[anInt613++] = (((Class174) Node_Sub14_Sub15.aClass174_9328).aBoolean2039) ? 0 : 1;
                return;
            }
            if (i == 5421) {
                if (Node_Sub48.aFrame7432 != null)
                    Class138.method1274(false, ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub1_7346.method2925(true), -1, -1, -1);
                String string = aStringArray624[--anInt605];
                boolean bool_115_ = anIntArray601[--anInt613] == 1;
                String string_116_ = Class50.method395(-1) + string;
                Class99.method710(string_116_, 0, (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) == 1), Node_Sub14_Sub15.aClass174_9328, bool_115_);
                return;
            }
            if (i == 5422) {
                anInt605 -= 2;
                String string = aStringArray624[anInt605];
                String string_117_ = aStringArray624[anInt605 + 1];
                int i_118_ = anIntArray601[--anInt613];
                if (string.length() > 0) {
                    if (Class101.aStringArray1286 == null)
                        Class101.aStringArray1286 = new String[(Class183.anIntArray2140[(((Class215) Class12.aClass215_249).anInt2475)])];
                    Class101.aStringArray1286[i_118_] = string;
                }
                if (string_117_.length() > 0) {
                    if (Class226.aStringArray2546 == null)
                        Class226.aStringArray2546 = new String[(Class183.anIntArray2140[(((Class215) Class12.aClass215_249).anInt2475)])];
                    Class226.aStringArray2546[i_118_] = string_117_;
                }
                return;
            }
            if (i == 5423) {
                System.out.println(aStringArray624[--anInt605]);
                return;
            }
            if (i == 5424) {
                anInt613 -= 11;
                Node_Sub42_Sub3.anInt9793 = anIntArray601[anInt613];
                Class357.anInt4410 = anIntArray601[anInt613 + 1];
                Class267.anInt4922 = anIntArray601[anInt613 + 2];
                Node_Sub18.anInt7029 = anIntArray601[anInt613 + 3];
                Class81.anInt4913 = anIntArray601[anInt613 + 4];
                Class340_Sub7.anInt8162 = anIntArray601[anInt613 + 5];
                Class349_Sub2.anInt4726 = anIntArray601[anInt613 + 6];
                PacketStream.anInt9126 = anIntArray601[anInt613 + 7];
                Node_Sub15_Sub4.anInt9702 = anIntArray601[anInt613 + 8];
                Class279_Sub1_Sub1.anInt9818 = anIntArray601[anInt613 + 9];
                Class279_Sub1_Sub1.anInt9813 = anIntArray601[anInt613 + 10];
                Class290.aClass381_3417.method3920(Class81.anInt4913, -126);
                Class290.aClass381_3417.method3920(Class340_Sub7.anInt8162, -80);
                Class290.aClass381_3417.method3920(Class349_Sub2.anInt4726, 77);
                Class290.aClass381_3417.method3920(PacketStream.anInt9126, 91);
                Class290.aClass381_3417.method3920(Node_Sub15_Sub4.anInt9702, -115);
                Class316_Sub1_Sub2.aClass129_9857 = Class87.aClass129_1085 = Class112.aClass129_5206 = null;
                Class346_Sub2.aClass129_8259 = Node_Sub14_Sub12_Sub1.aClass129_10307 = Class297_Sub1.aClass129_8483 = null;
                Class282_Sub25.aClass129_7852 = Class282_Sub6.aClass129_7652 = null;
                Class240.aBoolean2682 = true;
                return;
            }
            if (i == 5425) {
                Node_Sub1.method1974(5123);
                Class240.aBoolean2682 = false;
                return;
            }
            if (i == 5426) {
                anInt613 -= 2;
                Node_Sub8_Sub20.anInt9102 = anIntArray601[anInt613];
                Class182.anInt2123 = anIntArray601[anInt613 + 1];
                return;
            }
            if (i == 5427) {
                anInt613 -= 2;
                Class340_Sub5.anInt8142 = anIntArray601[anInt613 + 1];
                return;
            }
            if (i == 5428) {
                anInt613 -= 2;
                int i_119_ = anIntArray601[anInt613];
                int i_120_ = anIntArray601[anInt613 + 1];
                anIntArray601[anInt613++] = (Class346_Sub7_Sub4.method3678(-12599, i_119_, i_120_) ? 1 : 0);
                return;
            }
            if (i == 5429) {
                Node_Sub38.method2596(false, false, false, aStringArray624[--anInt605]);
                return;
            }
            if (i == 5430) {
                try {
                    Class78.method571("accountcreated", -8364, Class158.anApplet1881);
                } catch (Throwable throwable) {
                    /* empty */
                }
                return;
            }
            if (i == 5431) {
                try {
                    Class78.method571("accountcreatestarted", -8364, Class158.anApplet1881);
                } catch (Throwable throwable) {
                    /* empty */
                }
                return;
            }
            if (i == 5432) {
                String string = "";
                if (Class106.aClipboard1346 != null) {
                    Transferable transferable = Class106.aClipboard1346.getContents(null);
                    if (transferable != null) {
                        try {
                            string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
                            if (string == null)
                                string = "";
                        } catch (Exception exception) {
                            /* empty */
                        }
                    }
                }
                aStringArray624[anInt605++] = string;
                return;
            }
            if (i == 5433) {
                Class205.anInt2387 = anIntArray601[--anInt613];
                return;
            }
            if (i == 5435) {
                anIntArray601[anInt613++] = Class176.aBoolean2058 ? 1 : 0;
                return;
            }
        } else if (i < 5600) {
            if (i == 5500) {
                anInt613 -= 4;
                int i_121_ = anIntArray601[anInt613];
                int i_122_ = anIntArray601[anInt613 + 1];
                int i_123_ = anIntArray601[anInt613 + 2];
                int i_124_ = anIntArray601[anInt613 + 3];
                Class43.method310(false, (byte) -118, i_123_, (i_121_ & 0x3fff) - Class368.baseY, i_124_, i_122_ << 2, (i_121_ >> 14 & 0x3fff) - Class67.baseX);
                return;
            }
            if (i == 5501) {
                anInt613 -= 4;
                int i_125_ = anIntArray601[anInt613];
                int i_126_ = anIntArray601[anInt613 + 1];
                int i_127_ = anIntArray601[anInt613 + 2];
                int i_128_ = anIntArray601[anInt613 + 3];
                Class124.updateCamera(i_127_, i_126_ << 2, i_128_, (i_125_ & 0x3fff) - Class368.baseY, (i_125_ >> 14 & 0x3fff) - Class67.baseX, 124);
                return;
            }
            if (i == 5502) {
                anInt613 -= 6;
                int i_129_ = anIntArray601[anInt613];
                if (i_129_ >= 2)
                    throw new RuntimeException();
                Class271.anInt3142 = i_129_;
                int i_130_ = anIntArray601[anInt613 + 1];
                if (i_130_ + 1 >= (Class59.anIntArrayArrayArray808[Class271.anInt3142]).length >> 1)
                    throw new RuntimeException();
                Class346_Sub7_Sub2_Sub4.anInt10104 = i_130_;
                Class361.anInt4453 = 0;
                Class114.anInt1425 = anIntArray601[anInt613 + 2];
                Class304.anInt3531 = anIntArray601[anInt613 + 3];
                int i_131_ = anIntArray601[anInt613 + 4];
                if (i_131_ >= 2)
                    throw new RuntimeException();
                Class133.anInt5045 = i_131_;
                int i_132_ = anIntArray601[anInt613 + 5];
                if (i_132_ + 1 >= (Class59.anIntArrayArrayArray808[Class133.anInt5045]).length >> 1)
                    throw new RuntimeException();
                Class37.anInt409 = i_132_;
                Node_Sub45.anInt7343 = 3;
                Node_Sub14_Sub21.anInt9379 = Class359.anInt4436 = -1;
                return;
            }
            if (i == 5503) {
                Class282_Sub16.method2990((byte) 77);
                return;
            }
            if (i == 5504) {
                anInt613 -= 2;
                Class282_Sub25.method3022(anIntArray601[anInt613 + 1], anIntArray601[anInt613], false, 0);
                return;
            }
            if (i == 5505) {
                anIntArray601[anInt613++] = (int) Node_Sub8_Sub13.aFloat9030 >> 3;
                return;
            }
            if (i == 5506) {
                anIntArray601[anInt613++] = (int) Class282_Sub7.aFloat7661 >> 3;
                return;
            }
            if (i == 5507) {
                Class282_Sub12.method2966((byte) -90);
                return;
            }
            if (i == 5508) {
                Node_Sub14_Sub20.method2338((byte) 125);
                return;
            }
            if (i == 5509) {
                Class283.method3059((byte) 3);
                return;
            }
            if (i == 5510) {
                Class361.method3818(110);
                return;
            }
            if (i == 5511) {
                int i_133_ = anIntArray601[--anInt613];
                int i_134_ = i_133_ >> 14 & 0x3fff;
                int i_135_ = i_133_ & 0x3fff;
                i_134_ -= Class67.baseX;
                if (i_134_ < 0)
                    i_134_ = 0;
                else if (i_134_ >= Node_Sub8_Sub4.anInt8360)
                    i_134_ = Node_Sub8_Sub4.anInt8360;
                i_135_ -= Class368.baseY;
                if (i_135_ < 0)
                    i_135_ = 0;
                else if (i_135_ >= Node_Sub22.anInt7074)
                    i_135_ = Node_Sub22.anInt7074;
                Class61.anInt831 = (i_134_ << 9) + 256;
                Node_Sub32.anInt7198 = (i_135_ << 9) + 256;
                Node_Sub45.anInt7343 = 4;
                Node_Sub14_Sub21.anInt9379 = Class359.anInt4436 = -1;
                return;
            }
            if (i == 5512) {
                Class340_Sub6.method3464(-1);
                return;
            }
            if (i == 5514) {
                ObjectDefinition.anInt3041 = anIntArray601[--anInt613];
                return;
            }
            if (i == 5516) {
                anIntArray601[anInt613++] = ObjectDefinition.anInt3041;
                return;
            }
            if (i == 5517) {
                int i_136_ = anIntArray601[--anInt613];
                if (i_136_ == -1) {
                    int i_137_ = i_136_ >> 14 & 0x3fff;
                    int i_138_ = i_136_ & 0x3fff;
                    i_137_ -= Class67.baseX;
                    if (i_137_ < 0)
                        i_137_ = 0;
                    else if (i_137_ >= Node_Sub8_Sub4.anInt8360)
                        i_137_ = Node_Sub8_Sub4.anInt8360;
                    i_138_ -= Class368.baseY;
                    if (i_138_ < 0)
                        i_138_ = 0;
                    else if (i_138_ >= Node_Sub22.anInt7074)
                        i_138_ = Node_Sub22.anInt7074;
                    Node_Sub14_Sub21.anInt9379 = (i_137_ << 9) + 256;
                    Class359.anInt4436 = (i_138_ << 9) + 256;
                } else {
                    Node_Sub14_Sub21.anInt9379 = -1;
                    Class359.anInt4436 = -1;
                    return;
                }
                return;
            }
        } else if (i < 5700) {
            if (i == 5600) {
                anInt605 -= 2;
                String string = aStringArray624[anInt605];
                String string_139_ = aStringArray624[anInt605 + 1];
                int i_140_ = anIntArray601[--anInt613];
                if (string.length() <= 320 && Class273.anInt5008 == 3 && (Class321.loginStage == 0 && Node_Sub42_Sub1.anInt9782 == 0)) {
                    Class212.aString2453 = string;
                    Node_Sub8.aString6862 = string_139_;
                    Class312.anInt3627 = i_140_;
                    Node_Sub14_Sub15.method2318(6, -21035);
                    return;
                }
                return;
            }
            if (i == 5601) {
                Node_Sub14_Sub15.method2320(881726188);
                return;
            }
            if (i == 5602) {
                if (Class321.loginStage == 0) {
                    Class254.anInt5124 = -2;
                    Class282_Sub19.anInt7785 = -2;
                }
                return;
            }
            if (i == 5604) {
                anInt605--;
                if (Class273.anInt5008 == 3 && (Class321.loginStage == 0 && Node_Sub42_Sub1.anInt9782 == 0)) {
                    Node_Sub2_Sub2.method1993(aStringArray624[anInt605], 0);
                    return;
                }
                return;
            }
            if (i == 5605) {
                anInt605 -= 2;
                anInt613 -= 2;
                if (Class273.anInt5008 == 3 && (Class321.loginStage == 0 && Node_Sub42_Sub1.anInt9782 == 0)) {
                    Node_Sub22.method2535(aStringArray624[anInt605 + 1], -27314, aStringArray624[anInt605], anIntArray601[anInt613 + 1] == 1, anIntArray601[anInt613]);
                    return;
                }
                return;
            }
            if (i == 5606) {
                if (Node_Sub42_Sub1.anInt9782 == 0)
                    Node_Sub4.anInt6833 = -2;
                return;
            }
            if (i == 5607) {
                anIntArray601[anInt613++] = Class282_Sub19.anInt7785;
                return;
            }
            if (i == 5608) {
                anIntArray601[anInt613++] = Node_Sub8_Sub19.anInt9082;
                return;
            }
            if (i == 5609) {
                anIntArray601[anInt613++] = Node_Sub4.anInt6833;
                return;
            }
            if (i == 5611) {
                anIntArray601[anInt613++] = Class81.anInt4908;
                return;
            }
            if (i == 5612) {
                int i_141_ = anIntArray601[--anInt613];
                if (Class273.anInt5008 == 7 && (Class321.loginStage == 0 && Node_Sub42_Sub1.anInt9782 == 0)) {
                    if (Class289.aClass111_3398 != null) {
                        Class289.aClass111_3398.method774(-1);
                        Class289.aClass111_3398 = null;
                    }
                    Class312.anInt3627 = i_141_;
                    Node_Sub14_Sub15.method2318(9, -21035);
                    return;
                }
                return;
            }
            if (i == 5613) {
                anIntArray601[anInt613++] = Class282_Sub19.anInt7785;
                return;
            }
            if (i == 5615) {
                anInt605 -= 2;
                String string = aStringArray624[anInt605];
                String string_142_ = aStringArray624[anInt605 + 1];
                if (string.length() <= 320 && Class273.anInt5008 == 3 && (Class321.loginStage == 0 && Node_Sub42_Sub1.anInt9782 == 0)) {
                    if (Class289.aClass111_3398 != null) {
                        Class289.aClass111_3398.method774(-1);
                        Class289.aClass111_3398 = null;
                    }
                    Class212.aString2453 = string;
                    Node_Sub8.aString6862 = string_142_;
                    Node_Sub14_Sub15.method2318(5, -21035);
                    return;
                }
                return;
            }
            if (i == 5616) {
                Class340_Sub5.method3455(121, false);
                return;
            }
            if (i == 5617) {
                anIntArray601[anInt613++] = Class254.anInt5124;
                return;
            }
            if (i == 5618) {
                anInt613--;
                return;
            }
            if (i == 5619) {
                anInt613--;
                return;
            }
            if (i == 5620) {
                anIntArray601[anInt613++] = 0;
                return;
            }
            if (i == 5621) {
                anInt605 -= 2;
                anInt613 -= 2;
                return;
            }
            if (i == 5622)
                return;
            if (i == 5623) {
                if (ByteStream.aString6879 != null)
                    anIntArray601[anInt613++] = 1;
                else {
                    anIntArray601[anInt613++] = 0;
                    return;
                }
                return;
            }
            if (i == 5624) {
                anIntArray601[anInt613++] = (int) (Class54_Sub2.aLong5343 >> 32);
                anIntArray601[anInt613++] = (int) (Class54_Sub2.aLong5343 & 0xffffffffffffffffL);
                return;
            }
            if (i == 5625) {
                anIntArray601[anInt613++] = Class45.aBoolean560 ? 1 : 0;
                return;
            }
            if (i == 5626) {
                Class45.aBoolean560 = true;
                Class61.method476(-3);
                return;
            }
        } else if (i < 6100) {
            if (i == 6001) {
                int i_143_ = anIntArray601[--anInt613];
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub2_7338), (byte) -71, i_143_);
                Node_Sub14_Sub32.method2371((byte) 122);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6002) {
                boolean bool_144_ = anIntArray601[--anInt613] == 1;
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7353), (byte) -71, bool_144_ ? 1 : 0);
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335), (byte) -71, bool_144_ ? 1 : 0);
                Node_Sub14_Sub32.method2371((byte) 125);
                Class166.method1534(-1);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6003) {
                boolean bool_145_ = anIntArray601[--anInt613] == 1;
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7327), (byte) -71, bool_145_ ? 2 : 1);
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7333), (byte) -71, bool_145_ ? 2 : 1);
                Class166.method1534(-1);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6005) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub16_7349), (byte) -71, anIntArray601[--anInt613] == 1 ? 1 : 0);
                Node_Sub14_Sub32.method2371((byte) 123);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6007) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub5_7324), (byte) -71, anIntArray601[--anInt613]);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6008) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub13_7314), (byte) -71, anIntArray601[--anInt613] == 1 ? 1 : 0);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6010) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub26_7363), (byte) -71, anIntArray601[--anInt613] == 1 ? 1 : 0);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6011) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342), (byte) -71, anIntArray601[--anInt613]);
                Node_Sub14_Sub32.method2371((byte) 125);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6012) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub11_7347), (byte) -71, anIntArray601[--anInt613] == 1 ? 1 : 0);
                Node_Sub20.method2521((byte) 125);
                Class332.method3400(1);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6014) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub23_7360), (byte) -71, anIntArray601[--anInt613] == 1 ? 2 : 0);
                Node_Sub14_Sub32.method2371((byte) 122);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6015) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub28_7329), (byte) -71, anIntArray601[--anInt613] == 1 ? 1 : 0);
                Node_Sub14_Sub32.method2371((byte) 127);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6016) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7357), (byte) -71, anIntArray601[--anInt613]);
                Node_Sub15_Sub5.method2495(false, 79, ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub15_7358.method2984(true));
                Class293.method3113(17458);
                return;
            }
            if (i == 6017) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub22_7320), (byte) -71, anIntArray601[--anInt613] == 1 ? 1 : 0);
                Class58.method459((byte) -117);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6018) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7332), (byte) -71, anIntArray601[--anInt613]);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6019) {
                int i_146_ = anIntArray601[--anInt613];
                int i_147_ = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7344.method2993(true);
                if (i_146_ != i_147_) {
                    if (Class45.method328((byte) 13, Class273.anInt5008)) {
                        if (i_147_ == 0 && Node_Sub8_Sub3.anInt8927 != -1) {
                            Class132.method1216(false, 101, Node_Sub8_Sub3.anInt8927, 0, i_146_, Class116_Sub1.aClass381_6281);
                            Class253_Sub1.method2728(false);
                            ha_Sub3_Sub1.aBoolean8709 = false;
                        } else if (i_146_ == 0) {
                            Node_Sub21.method2527(1);
                            ha_Sub3_Sub1.aBoolean8709 = false;
                        } else
                            Class225_Sub2.method1794(i_146_, 16);
                    }
                    Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7344), (byte) -71, i_146_);
                    Class293.method3113(17458);
                    Class37.aBoolean408 = false;
                }
                return;
            }
            if (i == 6020) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7325), (byte) -71, anIntArray601[--anInt613]);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6021) {
                int i_148_ = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7327.method2952(true);
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7333), (byte) -71, anIntArray601[--anInt613] == 1 ? 0 : i_148_);
                Class166.method1534(-1);
                return;
            }
            if (i == 6023) {
                int i_149_ = anIntArray601[--anInt613];
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub4_7356), (byte) -71, i_149_);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6024) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7340), (byte) -71, anIntArray601[--anInt613]);
                Class293.method3113(17458);
                return;
            }
            if (i == 6025) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub20_7336), (byte) -71, anIntArray601[--anInt613]);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6027) {
                int i_150_ = anIntArray601[--anInt613];
                if (i_150_ < 0 || i_150_ > 1)
                    i_150_ = 0;
                Class310.method3241(86, i_150_ == 1);
                return;
            }
            if (i == 6028) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub9_7317), (byte) -71, anIntArray601[--anInt613] != 0 ? 1 : 0);
                Class293.method3113(17458);
                return;
            }
            if (i == 6029) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub5_7324), (byte) -71, anIntArray601[--anInt613]);
                Class293.method3113(17458);
                return;
            }
            if (i == 6030) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub25_7345), (byte) -71, anIntArray601[--anInt613] != 0 ? 1 : 0);
                Class293.method3113(17458);
                Node_Sub14_Sub32.method2371((byte) 127);
                return;
            }
            if (i == 6031) {
                int i_151_ = anIntArray601[--anInt613];
                if (i_151_ < 0 || i_151_ > 5)
                    i_151_ = 2;
                Node_Sub15_Sub5.method2495(false, -45, i_151_);
                return;
            }
            if (i == 6032) {
                anInt613 -= 2;
                int i_152_ = anIntArray601[anInt613];
                boolean bool_153_ = anIntArray601[anInt613 + 1] == 1;
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322), (byte) -71, i_152_);
                if (!bool_153_)
                    Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub24_7348), (byte) -71, 0);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6033) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub18_7318), (byte) -71, anIntArray601[--anInt613]);
                Class293.method3113(17458);
                return;
            }
            if (i == 6034) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub29_7313), (byte) -71, anIntArray601[--anInt613] == 1 ? 1 : 0);
                Class293.method3113(17458);
                Node_Sub20.method2521((byte) 121);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6035) {
                int i_154_ = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7353.method2961(true);
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335), (byte) -71, anIntArray601[--anInt613] == 1 ? 1 : i_154_);
                Node_Sub14_Sub32.method2371((byte) 123);
                Class166.method1534(-1);
                return;
            }
            if (i == 6036) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub19_7319), (byte) -71, anIntArray601[--anInt613]);
                Class293.method3113(17458);
                Class5.aBoolean149 = true;
                return;
            }
            if (i == 6037) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7339), (byte) -71, anIntArray601[--anInt613]);
                Class293.method3113(17458);
                Class37.aBoolean408 = false;
                return;
            }
            if (i == 6038) {
                int i_155_ = anIntArray601[--anInt613];
                int i_156_ = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7362.method2993(true);
                if (i_155_ != i_156_ && Node_Sub8_Sub3.anInt8927 == Class282.anInt3319) {
                    if (!Class45.method328((byte) 13, Class273.anInt5008)) {
                        if (i_156_ == 0) {
                            Class132.method1216(false, 74, Node_Sub8_Sub3.anInt8927, 0, i_155_, Class116_Sub1.aClass381_6281);
                            Class253_Sub1.method2728(false);
                            ha_Sub3_Sub1.aBoolean8709 = false;
                        } else if (i_155_ == 0) {
                            Node_Sub21.method2527(1);
                            ha_Sub3_Sub1.aBoolean8709 = false;
                        } else
                            Class225_Sub2.method1794(i_155_, 16);
                    }
                    Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7362), (byte) -71, i_155_);
                    Class293.method3113(17458);
                    Class37.aBoolean408 = false;
                }
                return;
            }
            if (i == 6039) {
                int i_157_ = anIntArray601[--anInt613];
                if (i_157_ > 255 || i_157_ < 0)
                    i_157_ = 0;
                if (i_157_ != ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub7_7334.method2949(true)) {
                    Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub7_7334), (byte) -71, i_157_);
                    Class293.method3113(17458);
                    Class37.aBoolean408 = false;
                }
                return;
            }
            if (i == 6040) {
                int i_158_ = anIntArray601[--anInt613];
                if (i_158_ != ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub21_7315.method3010(true)) {
                    Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub21_7315), (byte) -71, i_158_);
                    Class293.method3113(17458);
                    Class37.aBoolean408 = false;
                    Node_Sub8_Sub15.method2130((byte) -114);
                }
                return;
            }
        } else if (i < 6200) {
            if (i == 6101) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub2_7338.method2927(true);
                return;
            }
            if (i == 6102) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7353.method2961(true) == 1 ? 1 : 0;
                return;
            }
            if (i == 6103) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7327.method2952(true) == 2 ? 1 : 0;
                return;
            }
            if (i == 6105) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub16_7349.method2988(true) == 1 ? 1 : 0;
                return;
            }
            if (i == 6107) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub5_7324.method2940(true);
                return;
            }
            if (i == 6108) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub13_7314.method2969(true) == 1 ? 1 : 0;
                return;
            }
            if (i == 6110) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub26_7363.method3031(true) == 1 ? 1 : 0;
                return;
            }
            if (i == 6111) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342.method2976(true);
                return;
            }
            if (i == 6112) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub11_7347.method2963(true) == 1 ? 1 : 0;
                return;
            }
            if (i == 6114) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub23_7360.method3018(true) == 2 ? 1 : 0;
                return;
            }
            if (i == 6115) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub28_7329.method3040(true) == 1 ? 1 : 0;
                return;
            }
            if (i == 6116) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7357.method2946(true);
                return;
            }
            if (i == 6117) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub22_7320.method3014(true) == 1 ? 1 : 0;
                return;
            }
            if (i == 6118) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7332.method2993(true);
                return;
            }
            if (i == 6119) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7344.method2993(true);
                return;
            }
            if (i == 6120) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7325.method2993(true);
                return;
            }
            if (i == 6123) {
                anIntArray601[anInt613++] = Class279_Sub1_Sub2.method2892(2);
                return;
            }
            if (i == 6124) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7340.method2946(true);
                return;
            }
            if (i == 6125) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub20_7336.method3003(true);
                return;
            }
            if (i == 6127) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub27_7321.method3034(true) == 1 ? 1 : 0;
                return;
            }
            if (i == 6128) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub9_7317.method2955(true) == 1 ? 1 : 0;
                return;
            }
            if (i == 6129) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub5_7324.method2940(true);
                return;
            }
            if (i == 6130) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub25_7345.method3026(true) == 1 ? 1 : 0;
                return;
            }
            if (i == 6131) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true);
                return;
            }
            if (i == 6132) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322.method2984(true);
                return;
            }
            if (i == 6133) {
                anIntArray601[anInt613++] = ((((Class174) Node_Sub14_Sub15.aClass174_9328).aBoolean2039) && !(((Class174) Node_Sub14_Sub15.aClass174_9328).aBoolean2047)) ? 1 : 0;
                return;
            }
            if (i == 6135) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub18_7318.method2997(true);
                return;
            }
            if (i == 6136) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub29_7313.method3047(true) == 1 ? 1 : 0;
                return;
            }
            if (i == 6138) {
                anIntArray601[anInt613++] = Class330.method3378(((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub15_7358.method2984(true), true, 200);
                return;
            }
            if (i == 6139) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub19_7319.method2998(true);
                return;
            }
            if (i == 6142) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7339.method2993(true);
                return;
            }
            if (i == 6143) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7362.method2993(true);
                return;
            }
            if (i == 6144) {
                anIntArray601[anInt613++] = Class279.aBoolean3255 ? 1 : 0;
                return;
            }
            if (i == 6145) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub7_7334.method2949(true);
                return;
            }
            if (i == 6146) {
                anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub21_7315.method3010(true);
                return;
            }
            if (i == 6147) {
                anIntArray601[anInt613++] = ((((Node_Sub24) InputStream_Sub2.aClass248_Sub24_78).anInt7126) < 512 || Class279.aBoolean3255 || Node_Sub15_Sub5.aBoolean9720) ? 1 : 0;
                return;
            }
            if (i == 6148) {
                anIntArray601[anInt613++] = Class211.aBoolean2438 ? 1 : 0;
                return;
            }
        } else if (i < 6300) {
            if (i == 6200) {
                anInt613 -= 2;
                Class310.aShort3598 = (short) anIntArray601[anInt613];
                if (Class310.aShort3598 <= 0)
                    Class310.aShort3598 = (short) 256;
                Class226_Sub3.aShort6674 = (short) anIntArray601[anInt613 + 1];
                if (Class226_Sub3.aShort6674 <= 0)
                    Class226_Sub3.aShort6674 = (short) 205;
                return;
            }
            if (i == 6201) {
                anInt613 -= 2;
                Class296.aShort3455 = (short) anIntArray601[anInt613];
                if (Class296.aShort3455 <= 0)
                    Class296.aShort3455 = (short) 256;
                Node_Sub14_Sub5.aShort9206 = (short) anIntArray601[anInt613 + 1];
                if (Node_Sub14_Sub5.aShort9206 <= 0)
                    Node_Sub14_Sub5.aShort9206 = (short) 320;
                return;
            }
            if (i == 6202) {
                anInt613 -= 4;
                Class352.aShort4182 = (short) anIntArray601[anInt613];
                if (Class352.aShort4182 <= 0)
                    Class352.aShort4182 = (short) 1;
                Class135.aShort1635 = (short) anIntArray601[anInt613 + 1];
                if (Class135.aShort1635 <= 0)
                    Class135.aShort1635 = (short) 32767;
                else if (Class135.aShort1635 < Class352.aShort4182)
                    Class135.aShort1635 = Class352.aShort4182;
                Class65.aShort885 = (short) anIntArray601[anInt613 + 2];
                if (Class65.aShort885 <= 0)
                    Class65.aShort885 = (short) 1;
                Node_Sub8_Sub18.aShort9073 = (short) anIntArray601[anInt613 + 3];
                if (Node_Sub8_Sub18.aShort9073 <= 0)
                    Node_Sub8_Sub18.aShort9073 = (short) 32767;
                else {
                    if (Node_Sub8_Sub18.aShort9073 < Class65.aShort885)
                        Node_Sub8_Sub18.aShort9073 = Class65.aShort885;
                    return;
                }
                return;
            }
            if (i == 6203) {
                Class106.method748((((RSInterface2) Class341.aClass354_3973).anInt4332), 0, (((RSInterface2) Class341.aClass354_3973).anInt4223), 0, false, (byte) -72);
                anIntArray601[anInt613++] = Class317.anInt3666;
                anIntArray601[anInt613++] = Class155.anInt1830;
                return;
            }
            if (i == 6204) {
                anIntArray601[anInt613++] = Class296.aShort3455;
                anIntArray601[anInt613++] = Node_Sub14_Sub5.aShort9206;
                return;
            }
            if (i == 6205) {
                anIntArray601[anInt613++] = Class310.aShort3598;
                anIntArray601[anInt613++] = Class226_Sub3.aShort6674;
                return;
            }
        } else if (i < 6400) {
            if (i == 6300) {
                anIntArray601[anInt613++] = (int) (Class118.method1112(116) / 60000L);
                return;
            }
            if (i == 6301) {
                anIntArray601[anInt613++] = (int) (Class118.method1112(116) / 86400000L) - 11745;
                return;
            }
            if (i == 6302) {
                anInt613 -= 3;
                int i_159_ = anIntArray601[anInt613];
                int i_160_ = anIntArray601[anInt613 + 1];
                int i_161_ = anIntArray601[anInt613 + 2];
                long l = Node_Sub14_Sub35.method2382(0, (byte) 109, i_161_, 0, i_160_, i_159_, 12);
                int i_162_ = Class19.method228(l, 114);
                if (i_161_ < 1970)
                    i_162_--;
                anIntArray601[anInt613++] = i_162_;
                return;
            }
            if (i == 6303) {
                anIntArray601[anInt613++] = Node_Sub14_Sub23.method2345(Class118.method1112(116), 79);
                return;
            }
            if (i == 6304) {
                int i_163_ = anIntArray601[--anInt613];
                boolean bool_164_ = true;
                if (i_163_ < 0)
                    bool_164_ = (i_163_ + 1) % 4 == 0;
                else if (i_163_ < 1582)
                    bool_164_ = i_163_ % 4 == 0;
                else if (i_163_ % 4 != 0)
                    bool_164_ = false;
                else if (i_163_ % 100 != 0)
                    bool_164_ = true;
                else if (i_163_ % 400 != 0)
                    bool_164_ = false;
                anIntArray601[anInt613++] = bool_164_ ? 1 : 0;
                return;
            }
        } else if (i < 6500) {
            if (i == 6405) {
                anIntArray601[anInt613++] = Class44.method315((byte) -60) ? 1 : 0;
                return;
            }
            if (i == 6406) {
                anIntArray601[anInt613++] = Class130.method1202(1) ? 1 : 0;
                return;
            }
        } else if (i < 6600) {
            if (i == 6500) {
                if (Class273.anInt5008 != 7 || Class321.loginStage != 0 || Node_Sub42_Sub1.anInt9782 != 0)
                    anIntArray601[anInt613++] = 1;
                else {
                    if (Node_Sub14_Sub7.aBoolean9218)
                        anIntArray601[anInt613++] = 0;
                    else {
                        if (Class349_Sub1.aLong4789 > Class118.method1112(116) - 1000L)
                            anIntArray601[anInt613++] = 1;
                        else {
                            Node_Sub14_Sub7.aBoolean9218 = true;
                            Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Exception_Sub1.aOutgoingOpcode_95));
                            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, Node_Sub14_Sub30.anInt9474);
                            Class226_Sub3.method1814(class248_sub36, 0);
                            anIntArray601[anInt613++] = 0;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 6501) {
                Class147_Sub1 class147_sub1 = Class229.method1831(-109);
                if (class147_sub1 != null) {
                    anIntArray601[anInt613++] = ((Class147_Sub1) class147_sub1).anInt6285;
                    anIntArray601[anInt613++] = ((Class147) class147_sub1).anInt1733;
                    aStringArray624[anInt605++] = ((Class147_Sub1) class147_sub1).aString6283;
                    Class55 class55 = class147_sub1.method1319(3);
                    anIntArray601[anInt613++] = ((Class55) class55).anInt729;
                    aStringArray624[anInt605++] = ((Class55) class55).aString732;
                    anIntArray601[anInt613++] = ((Class147) class147_sub1).anInt1742;
                    anIntArray601[anInt613++] = ((Class147_Sub1) class147_sub1).anInt6288;
                    aStringArray624[anInt605++] = ((Class147_Sub1) class147_sub1).aString6284;
                } else {
                    anIntArray601[anInt613++] = -1;
                    anIntArray601[anInt613++] = 0;
                    aStringArray624[anInt605++] = "";
                    anIntArray601[anInt613++] = 0;
                    aStringArray624[anInt605++] = "";
                    anIntArray601[anInt613++] = 0;
                    anIntArray601[anInt613++] = 0;
                    aStringArray624[anInt605++] = "";
                    return;
                }
                return;
            }
            if (i == 6502) {
                Class147_Sub1 class147_sub1 = Class26.method252(-144254536);
                if (class147_sub1 != null) {
                    anIntArray601[anInt613++] = ((Class147_Sub1) class147_sub1).anInt6285;
                    anIntArray601[anInt613++] = ((Class147) class147_sub1).anInt1733;
                    aStringArray624[anInt605++] = ((Class147_Sub1) class147_sub1).aString6283;
                    Class55 class55 = class147_sub1.method1319(3);
                    anIntArray601[anInt613++] = ((Class55) class55).anInt729;
                    aStringArray624[anInt605++] = ((Class55) class55).aString732;
                    anIntArray601[anInt613++] = ((Class147) class147_sub1).anInt1742;
                    anIntArray601[anInt613++] = ((Class147_Sub1) class147_sub1).anInt6288;
                    aStringArray624[anInt605++] = ((Class147_Sub1) class147_sub1).aString6284;
                } else {
                    anIntArray601[anInt613++] = -1;
                    anIntArray601[anInt613++] = 0;
                    aStringArray624[anInt605++] = "";
                    anIntArray601[anInt613++] = 0;
                    aStringArray624[anInt605++] = "";
                    anIntArray601[anInt613++] = 0;
                    anIntArray601[anInt613++] = 0;
                    aStringArray624[anInt605++] = "";
                    return;
                }
                return;
            }
            if (i == 6503) {
                int i_165_ = anIntArray601[--anInt613];
                String string = aStringArray624[--anInt605];
                if (Class273.anInt5008 != 7 || Class321.loginStage != 0 || Node_Sub42_Sub1.anInt9782 != 0)
                    anIntArray601[anInt613++] = 0;
                else {
                    anIntArray601[anInt613++] = Node_Sub14_Sub17.method2327((byte) 96, string, i_165_) ? 1 : 0;
                    return;
                }
                return;
            }
            if (i == 6506) {
                int i_166_ = anIntArray601[--anInt613];
                Class147_Sub1 class147_sub1 = Node_Sub14_Sub34.method2378(-3652, i_166_);
                if (class147_sub1 != null) {
                    anIntArray601[anInt613++] = ((Class147) class147_sub1).anInt1733;
                    aStringArray624[anInt605++] = ((Class147_Sub1) class147_sub1).aString6283;
                    Class55 class55 = class147_sub1.method1319(3);
                    anIntArray601[anInt613++] = ((Class55) class55).anInt729;
                    aStringArray624[anInt605++] = ((Class55) class55).aString732;
                    anIntArray601[anInt613++] = ((Class147) class147_sub1).anInt1742;
                    anIntArray601[anInt613++] = ((Class147_Sub1) class147_sub1).anInt6288;
                    aStringArray624[anInt605++] = ((Class147_Sub1) class147_sub1).aString6284;
                } else {
                    anIntArray601[anInt613++] = -1;
                    aStringArray624[anInt605++] = "";
                    anIntArray601[anInt613++] = 0;
                    aStringArray624[anInt605++] = "";
                    anIntArray601[anInt613++] = 0;
                    anIntArray601[anInt613++] = 0;
                    aStringArray624[anInt605++] = "";
                    return;
                }
                return;
            }
            if (i == 6507) {
                anInt613 -= 4;
                int i_167_ = anIntArray601[anInt613];
                boolean bool_168_ = anIntArray601[anInt613 + 1] == 1;
                int i_169_ = anIntArray601[anInt613 + 2];
                boolean bool_170_ = anIntArray601[anInt613 + 3] == 1;
                Class110.method770(bool_168_, i_169_, bool_170_, i_167_, (byte) 28);
                return;
            }
            if (i == 6508) {
                Node_Sub14_Sub22.method2344(4096);
                return;
            }
            if (i == 6509) {
                if (Class273.anInt5008 == 7) {
                    Class312.aBoolean3640 = anIntArray601[--anInt613] == 1;
                    return;
                }
                return;
            }
            if (i == 6510) {
                anIntArray601[anInt613++] = Class20.anInt309;
                return;
            }
        } else if (i >= 6700) {
            if (i < 6800 && Class346_Sub6.aClass79_8296 == Class260.aClass79_2965) {
                if (i == 6700) {
                    int i_171_ = Class109.aClass65_1375.method513((byte) 32);
                    if (Class179.anInt2084 != -1)
                        i_171_++;
                    anIntArray601[anInt613++] = i_171_;
                    return;
                }
                if (i == 6701) {
                    int i_172_ = anIntArray601[--anInt613];
                    if (Class179.anInt2084 != -1) {
                        if (i_172_ == 0) {
                            anIntArray601[anInt613++] = Class179.anInt2084;
                            return;
                        }
                        i_172_--;
                    }
                    Node_Sub12 class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method510(true));
                    while (i_172_-- > 0)
                        class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method512(false));
                    anIntArray601[anInt613++] = ((Node_Sub12) class248_sub12).anInt6964;
                    return;
                }
                if (i == 6702) {
                    int i_173_ = anIntArray601[--anInt613];
                    if ((Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_173_]) == null)
                        aStringArray624[anInt605++] = "";
                    else {
                        String string = (((RSInterface2) (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_173_][0])).aString4232);
                        if (string == null)
                            aStringArray624[anInt605++] = "";
                        else {
                            aStringArray624[anInt605++] = string.substring(0, string.indexOf(':'));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 6703) {
                    int i_174_ = anIntArray601[--anInt613];
                    if ((Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_174_]) == null)
                        anIntArray601[anInt613++] = 0;
                    else {
                        anIntArray601[anInt613++] = (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_174_]).length;
                        return;
                    }
                    return;
                }
                if (i == 6704) {
                    anInt613 -= 2;
                    int i_175_ = anIntArray601[anInt613];
                    int i_176_ = anIntArray601[anInt613 + 1];
                    if ((Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_175_]) == null)
                        aStringArray624[anInt605++] = "";
                    else {
                        String string = (((RSInterface2) (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_175_][i_176_])).aString4232);
                        if (string == null)
                            aStringArray624[anInt605++] = "";
                        else {
                            aStringArray624[anInt605++] = string;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 6705) {
                    anInt613 -= 2;
                    int i_177_ = anIntArray601[anInt613];
                    int i_178_ = anIntArray601[anInt613 + 1];
                    if ((Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_177_]) == null)
                        anIntArray601[anInt613++] = 0;
                    else {
                        anIntArray601[anInt613++] = ((RSInterface2) (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_177_][i_178_])).anInt4255;
                        return;
                    }
                    return;
                }
                if (i == 6706)
                    return;
                if (i == 6707) {
                    anInt613 -= 3;
                    int i_179_ = anIntArray601[anInt613];
                    int i_180_ = anIntArray601[anInt613 + 1];
                    int i_181_ = anIntArray601[anInt613 + 2];
                    Class5.sendClickedButtonPacket("", -1, i_181_, i_179_ << 16 | i_180_, 1);
                    return;
                }
                if (i == 6708) {
                    anInt613 -= 3;
                    int i_182_ = anIntArray601[anInt613];
                    int i_183_ = anIntArray601[anInt613 + 1];
                    int i_184_ = anIntArray601[anInt613 + 2];
                    Class5.sendClickedButtonPacket("", -1, i_184_, i_182_ << 16 | i_183_, 2);
                    return;
                }
                if (i == 6709) {
                    anInt613 -= 3;
                    int i_185_ = anIntArray601[anInt613];
                    int i_186_ = anIntArray601[anInt613 + 1];
                    int i_187_ = anIntArray601[anInt613 + 2];
                    Class5.sendClickedButtonPacket("", -1, i_187_, i_185_ << 16 | i_186_, 3);
                    return;
                }
                if (i == 6710) {
                    anInt613 -= 3;
                    int i_188_ = anIntArray601[anInt613];
                    int i_189_ = anIntArray601[anInt613 + 1];
                    int i_190_ = anIntArray601[anInt613 + 2];
                    Class5.sendClickedButtonPacket("", -1, i_190_, i_188_ << 16 | i_189_, 4);
                    return;
                }
                if (i == 6711) {
                    anInt613 -= 3;
                    int i_191_ = anIntArray601[anInt613];
                    int i_192_ = anIntArray601[anInt613 + 1];
                    int i_193_ = anIntArray601[anInt613 + 2];
                    Class5.sendClickedButtonPacket("", -1, i_193_, i_191_ << 16 | i_192_, 5);
                    return;
                }
                if (i == 6712) {
                    anInt613 -= 3;
                    int i_194_ = anIntArray601[anInt613];
                    int i_195_ = anIntArray601[anInt613 + 1];
                    int i_196_ = anIntArray601[anInt613 + 2];
                    Class5.sendClickedButtonPacket("", -1, i_196_, i_194_ << 16 | i_195_, 6);
                    return;
                }
                if (i == 6713) {
                    anInt613 -= 3;
                    int i_197_ = anIntArray601[anInt613];
                    int i_198_ = anIntArray601[anInt613 + 1];
                    int i_199_ = anIntArray601[anInt613 + 2];
                    Class5.sendClickedButtonPacket("", -1, i_199_, i_197_ << 16 | i_198_, 7);
                    return;
                }
                if (i == 6714) {
                    anInt613 -= 3;
                    int i_200_ = anIntArray601[anInt613];
                    int i_201_ = anIntArray601[anInt613 + 1];
                    int i_202_ = anIntArray601[anInt613 + 2];
                    Class5.sendClickedButtonPacket("", -1, i_202_, i_200_ << 16 | i_201_, 8);
                    return;
                }
                if (i == 6715) {
                    anInt613 -= 3;
                    int i_203_ = anIntArray601[anInt613];
                    int i_204_ = anIntArray601[anInt613 + 1];
                    int i_205_ = anIntArray601[anInt613 + 2];
                    Class5.sendClickedButtonPacket("", -1, i_205_, i_203_ << 16 | i_204_, 9);
                    return;
                }
                if (i == 6716) {
                    anInt613 -= 3;
                    int i_206_ = anIntArray601[anInt613];
                    int i_207_ = anIntArray601[anInt613 + 1];
                    int i_208_ = anIntArray601[anInt613 + 2];
                    Class5.sendClickedButtonPacket("", -1, i_208_, i_206_ << 16 | i_207_, 10);
                    return;
                }
                if (i == 6717) {
                    anInt613 -= 3;
                    int i_209_ = anIntArray601[anInt613];
                    int i_210_ = anIntArray601[anInt613 + 1];
                    int i_211_ = anIntArray601[anInt613 + 2];
                    RSInterface2 class354 = Class188.method1635(i_209_ << 16 | i_210_, i_211_, 0);
                    Class1.method168((byte) -113);
                    Node_Sub48 class248_sub48 = client.method113(class354);
                    Node_Sub14_Sub13.method2312(((Node_Sub48) class248_sub48).anInt7418, 1, class354, class248_sub48.method2673(2));
                    return;
                }
            } else if (i < 6900) {
                if (i == 6800) {
                    int i_212_ = anIntArray601[--anInt613];
                    Class56 class56 = Node_Sub3.aClass257_6827.method2750((byte) 126, i_212_);
                    if (((Class56) class56).aString786 == null)
                        aStringArray624[anInt605++] = "";
                    else {
                        aStringArray624[anInt605++] = ((Class56) class56).aString786;
                        return;
                    }
                    return;
                }
                if (i == 6801) {
                    int i_213_ = anIntArray601[--anInt613];
                    Class56 class56 = Node_Sub3.aClass257_6827.method2750((byte) 115, i_213_);
                    anIntArray601[anInt613++] = ((Class56) class56).anInt744;
                    return;
                }
                if (i == 6802) {
                    int i_214_ = anIntArray601[--anInt613];
                    Class56 class56 = Node_Sub3.aClass257_6827.method2750((byte) 113, i_214_);
                    anIntArray601[anInt613++] = ((Class56) class56).anInt763;
                    return;
                }
                if (i == 6803) {
                    int i_215_ = anIntArray601[--anInt613];
                    Class56 class56 = Node_Sub3.aClass257_6827.method2750((byte) 85, i_215_);
                    anIntArray601[anInt613++] = ((Class56) class56).anInt751;
                    return;
                }
                if (i == 6804) {
                    anInt613 -= 2;
                    int i_216_ = anIntArray601[anInt613];
                    int i_217_ = anIntArray601[anInt613 + 1];
                    Class210 class210 = Node_Sub20.aClass240_7045.method1923(-6119, i_217_);
                    if (class210.method1721(2147483647))
                        aStringArray624[anInt605++] = (Node_Sub3.aClass257_6827.method2750((byte) 67, i_216_).method444(((Class210) class210).aString2425, (byte) -83, i_217_));
                    else {
                        anIntArray601[anInt613++] = (Node_Sub3.aClass257_6827.method2750((byte) 91, i_216_).method447(i_217_, ((Class210) class210).anInt2430, 18551));
                        return;
                    }
                    return;
                }
            } else if (i < 7000) {
                if (i == 6900) {
                    anIntArray601[anInt613++] = (Class118.aBoolean1484 && !Class17.aBoolean287 ? 1 : 0);
                    return;
                }
                if (i == 6901) {
                    anIntArray601[anInt613++] = (int) (Class114.membershipEnd / 60000L);
                    anIntArray601[anInt613++] = Class101.aBoolean1290 ? 1 : 0;
                    return;
                }
                if (i == 6902) {
                    anIntArray601[anInt613++] = Node_Sub48.recoveryQuestionsSet;
                    return;
                }
                if (i == 6903) {
                    anIntArray601[anInt613++] = Canvas_Sub1.unreadMessages;
                    return;
                }
                if (i == 6904) {
                    anIntArray601[anInt613++] = Class132.lastLoggedInDate;
                    return;
                }
                if (i == 6905) {
                    String string = "";
                    if (za_Sub1.aClass322_9801 != null) {
                        if (za_Sub1.aClass322_9801.anObject3787 != null)
                            string = (String) za_Sub1.aClass322_9801.anObject3787;
                        else
                            string = Node_Sub29.method2557((byte) 119, (za_Sub1.aClass322_9801.anInt3784));
                    }
                    aStringArray624[anInt605++] = string;
                    return;
                }
                if (i == 6906) {
                    anIntArray601[anInt613++] = Class282_Sub14.emailStatus;
                    return;
                }
                if (i == 6907) {
                    anIntArray601[anInt613++] = Class317.anInt3677;
                    return;
                }
                if (i == 6908) {
                    anIntArray601[anInt613++] = Node_Sub8_Sub4.anInt8368;
                    return;
                }
                if (i == 6909) {
                    anIntArray601[anInt613++] = Node_Sub14_Sub20.aBoolean9375 ? 1 : 0;
                    return;
                }
                if (i == 6910) {
                    anIntArray601[anInt613++] = Class122.anInt1521;
                    return;
                }
                if (i == 6911) {
                    anIntArray601[anInt613++] = Node_Sub14_Sub25.anInt9418;
                    return;
                }
                if (i == 6912) {
                    anIntArray601[anInt613++] = Class325.loginInterfaceRemoval;
                    return;
                }
                if (i == 6913) {
                    anIntArray601[anInt613++] = Class282_Sub19.recoveryQuestionsSetDate;
                    return;
                }
            } else if (i < 7100) {
                if (i == 7000) {
                    int i_218_ = Class249_Sub2.method2704((byte) 51);
                    anIntArray601[anInt613++] = Class249.anInt2812 = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true);
                    anIntArray601[anInt613++] = i_218_;
                    Node_Sub14_Sub32.method2371((byte) 125);
                    Class293.method3113(17458);
                    Class37.aBoolean408 = false;
                    return;
                }
                if (i == 7001) {
                    Class311.method3265((byte) -95);
                    Node_Sub14_Sub32.method2371((byte) 5);
                    Class293.method3113(17458);
                    Class37.aBoolean408 = false;
                    return;
                }
                if (i == 7002) {
                    Node_Sub14_Sub12_Sub1.method2310(0);
                    Node_Sub14_Sub32.method2371((byte) 11);
                    Class293.method3113(17458);
                    Class37.aBoolean408 = false;
                    return;
                }
                if (i == 7003) {
                    Class238_Sub2.method1888((byte) -121);
                    Node_Sub14_Sub32.method2371((byte) 122);
                    Class293.method3113(17458);
                    Class37.aBoolean408 = false;
                    return;
                }
                if (i == 7004) {
                    Node.method1968(1, true);
                    Node_Sub14_Sub32.method2371((byte) -28);
                    Class293.method3113(17458);
                    Class37.aBoolean408 = false;
                    return;
                }
                if (i == 7005) {
                    Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub24_7348), (byte) -71, 0);
                    Class293.method3113(17458);
                    Class37.aBoolean408 = false;
                    return;
                }
                if (i == 7006) {
                    if (Class249.anInt2812 == 2)
                        Class316_Sub1_Sub2.aBoolean9864 = true;
                    else {
                        if (Class249.anInt2812 == 1)
                            RSInterface2.aBoolean4368 = true;
                        else {
                            if (Class249.anInt2812 == 3)
                                Class199.aBoolean2286 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 7007) {
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub24_7348.method3020(true);
                    return;
                }
            } else if (i < 7200) {
                if (i == 7100) {
                    anInt613 -= 2;
                    int i_219_ = anIntArray601[anInt613];
                    int i_220_ = anIntArray601[anInt613 + 1];
                    if (i_219_ != -1) {
                        if (i_220_ > 255)
                            i_220_ = 255;
                        else if (i_220_ < 0)
                            i_220_ = 0;
                        Class308.method3233(i_220_, 85, i_219_, false);
                    }
                    return;
                }
                if (i == 7101) {
                    int i_221_ = anIntArray601[--anInt613];
                    if (i_221_ != -1)
                        Class282_Sub4.method2933(8718, i_221_);
                    return;
                }
                if (i == 7102) {
                    int i_222_ = anIntArray601[--anInt613];
                    if (i_222_ != -1)
                        Class2.method170(false, i_222_);
                    return;
                }
                if (i == 7103) {
                    anIntArray601[anInt613++] = Class54_Sub1.method431("jagtheora", -22534) ? 1 : 0;
                    return;
                }
            } else if (i < 7300) {
                if (i == 7201) {
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub16_7349.method2991(260) ? 1 : 0;
                    return;
                }
                if (i == 7202) {
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub26_7363.method3029(260) ? 1 : 0;
                    return;
                }
                if (i == 7203) {
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342.method2978(260) ? 1 : 0;
                    return;
                }
                if (i == 7204) {
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub23_7360.method3019(260) ? 1 : 0;
                    return;
                }
                if (i == 7205) {
                    anIntArray601[anInt613++] = (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7340.method2943(260) && Class287.aHa3381.A()) ? 1 : 0;
                    return;
                }
                if (i == 7206) {
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub4_7356.method2935(260) ? 1 : 0;
                    return;
                }
                if (i == 7207) {
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub20_7336.method3002(260) ? 1 : 0;
                    return;
                }
                if (i == 7208) {
                    anIntArray601[anInt613++] = (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub27_7321.method3032(260) && Class287.aHa3381.a()) ? 1 : 0;
                    return;
                }
                if (i == 7209) {
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub25_7345.method3024(260) ? 1 : 0;
                    return;
                }
                if (i == 7210) {
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub29_7313.method3050(260) ? 1 : 0;
                    return;
                }
                if (i == 7211) {
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub19_7319.method3001(260) ? 1 : 0;
                    return;
                }
                if (i == 7212) {
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub28_7329.method3041(260) ? 1 : 0;
                    return;
                }
                if (i == 7213) {
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub21_7315.method3007(260) ? 1 : 0;
                    return;
                }
                if (i == 7214) {
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322.method2982(260) ? 1 : 0;
                    return;
                }
            } else if (i < 7400) {
                if (i == 7301) {
                    int i_223_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub16_7349.method2917(0, i_223_);
                    return;
                }
                if (i == 7302) {
                    int i_224_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub26_7363.method2917(0, i_224_);
                    return;
                }
                if (i == 7303) {
                    int i_225_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342.method2917(0, i_225_);
                    return;
                }
                if (i == 7304) {
                    int i_226_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub23_7360.method2917(0, i_226_);
                    return;
                }
                if (i == 7305) {
                    int i_227_ = anIntArray601[--anInt613];
                    if (!Class287.aHa3381.A())
                        anIntArray601[anInt613++] = 3;
                    else {
                        anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7340.method2917(0, i_227_);
                        return;
                    }
                    return;
                }
                if (i == 7306) {
                    int i_228_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub4_7356.method2917(0, i_228_);
                    return;
                }
                if (i == 7307) {
                    int i_229_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub20_7336.method2917(0, i_229_);
                    return;
                }
                if (i == 7308) {
                    int i_230_ = anIntArray601[--anInt613];
                    if (!Class287.aHa3381.a())
                        anIntArray601[anInt613++] = 3;
                    else {
                        anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub27_7321.method2917(0, i_230_);
                        return;
                    }
                    return;
                }
                if (i == 7309) {
                    int i_231_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub25_7345.method2917(0, i_231_);
                    return;
                }
                if (i == 7310) {
                    int i_232_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub29_7313.method2917(0, i_232_);
                    return;
                }
                if (i == 7311) {
                    int i_233_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub19_7319.method2917(0, i_233_);
                    return;
                }
                if (i == 7312) {
                    int i_234_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub28_7329.method2917(0, i_234_);
                    return;
                }
                if (i == 7313) {
                    int i_235_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub21_7315.method2917(0, i_235_);
                    return;
                }
                if (i == 7314) {
                    int i_236_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322.method2917(0, i_236_);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(i));
    }

    static final void method344(int i) {
        if (i != -1 && Class346_Sub7_Sub5_Sub2.method3699(i, (byte) -22)) {
            RSInterface2[] class354s = Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i];
            for (int i_237_ = 0; i_237_ < class354s.length; i_237_++) {
                RSInterface2 class354 = class354s[i_237_];
                if (((RSInterface2) class354).anObjectArray4304 != null) {
                    RSInterface class248_sub6 = new RSInterface();
                    ((RSInterface) class248_sub6).rsInter = class354;
                    ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4304;
                    executeInterfaceScript(class248_sub6, 2000000);
                }
            }
        }
    }

    private static final void method345(String string, int i) {
        if (Class226_Sub1_Sub1.anInt8801 != 0 || ((!Class118.aBoolean1484 || Class17.aBoolean287) && !Node_Sub8_Sub11.aBoolean8992)) {
            String string_238_ = string.toLowerCase();
            int i_239_ = 0;
            if (string_238_.startsWith(Class41.aClass41_513.method301(0, (byte) -108))) {
                i_239_ = 0;
                string = string.substring(Class41.aClass41_513.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_514.method301(0, (byte) -108))) {
                i_239_ = 1;
                string = string.substring(Class41.aClass41_514.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_515.method301(0, (byte) -108))) {
                i_239_ = 2;
                string = string.substring(Class41.aClass41_515.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_516.method301(0, (byte) -108))) {
                i_239_ = 3;
                string = string.substring(Class41.aClass41_516.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_517.method301(0, (byte) -108))) {
                i_239_ = 4;
                string = string.substring(Class41.aClass41_517.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_518.method301(0, (byte) -108))) {
                i_239_ = 5;
                string = string.substring(Class41.aClass41_518.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_519.method301(0, (byte) -108))) {
                i_239_ = 6;
                string = string.substring(Class41.aClass41_519.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_520.method301(0, (byte) -108))) {
                i_239_ = 7;
                string = string.substring(Class41.aClass41_520.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_521.method301(0, (byte) -108))) {
                i_239_ = 8;
                string = string.substring(Class41.aClass41_521.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_522.method301(0, (byte) -108))) {
                i_239_ = 9;
                string = string.substring(Class41.aClass41_522.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_523.method301(0, (byte) -108))) {
                i_239_ = 10;
                string = string.substring(Class41.aClass41_523.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_524.method301(0, (byte) -108))) {
                i_239_ = 11;
                string = string.substring(Class41.aClass41_524.method301(0, (byte) -108).length());
            } else if (Class191.anInt4822 != 0) {
                if (string_238_.startsWith(Class41.aClass41_513.method301(Class191.anInt4822, (byte) -108))) {
                    i_239_ = 0;
                    string = string.substring(Class41.aClass41_513.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_514.method301(Class191.anInt4822, (byte) -108))) {
                    i_239_ = 1;
                    string = string.substring(Class41.aClass41_514.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_515.method301(Class191.anInt4822, (byte) -108))) {
                    i_239_ = 2;
                    string = string.substring(Class41.aClass41_515.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_516.method301(Class191.anInt4822, (byte) -108))) {
                    i_239_ = 3;
                    string = string.substring(Class41.aClass41_516.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_517.method301(Class191.anInt4822, (byte) -108))) {
                    i_239_ = 4;
                    string = string.substring(Class41.aClass41_517.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_518.method301(Class191.anInt4822, (byte) -108))) {
                    i_239_ = 5;
                    string = string.substring(Class41.aClass41_518.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_519.method301(Class191.anInt4822, (byte) -108))) {
                    i_239_ = 6;
                    string = string.substring(Class41.aClass41_519.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_520.method301(Class191.anInt4822, (byte) -108))) {
                    i_239_ = 7;
                    string = string.substring(Class41.aClass41_520.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_521.method301(Class191.anInt4822, (byte) -108))) {
                    i_239_ = 8;
                    string = string.substring(Class41.aClass41_521.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_522.method301(Class191.anInt4822, (byte) -108))) {
                    i_239_ = 9;
                    string = string.substring(Class41.aClass41_522.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_523.method301(Class191.anInt4822, (byte) -108))) {
                    i_239_ = 10;
                    string = string.substring(Class41.aClass41_523.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_524.method301(Class191.anInt4822, (byte) -108))) {
                    i_239_ = 11;
                    string = string.substring(Class41.aClass41_524.method301(Class191.anInt4822, (byte) -108).length());
                }
            }
            string_238_ = string.toLowerCase();
            int i_240_ = 0;
            if (string_238_.startsWith(Class41.aClass41_525.method301(0, (byte) -108))) {
                i_240_ = 1;
                string = string.substring(Class41.aClass41_525.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_526.method301(0, (byte) -108))) {
                i_240_ = 2;
                string = string.substring(Class41.aClass41_526.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_527.method301(0, (byte) -108))) {
                i_240_ = 3;
                string = string.substring(Class41.aClass41_527.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_528.method301(0, (byte) -108))) {
                i_240_ = 4;
                string = string.substring(Class41.aClass41_528.method301(0, (byte) -108).length());
            } else if (string_238_.startsWith(Class41.aClass41_529.method301(0, (byte) -108))) {
                i_240_ = 5;
                string = string.substring(Class41.aClass41_529.method301(0, (byte) -108).length());
            } else if (Class191.anInt4822 != 0) {
                if (string_238_.startsWith(Class41.aClass41_525.method301(Class191.anInt4822, (byte) -108))) {
                    i_240_ = 1;
                    string = string.substring(Class41.aClass41_525.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_526.method301(Class191.anInt4822, (byte) -108))) {
                    i_240_ = 2;
                    string = string.substring(Class41.aClass41_526.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_527.method301(Class191.anInt4822, (byte) -108))) {
                    i_240_ = 3;
                    string = string.substring(Class41.aClass41_527.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_528.method301(Class191.anInt4822, (byte) -108))) {
                    i_240_ = 4;
                    string = string.substring(Class41.aClass41_528.method301(Class191.anInt4822, (byte) -108).length());
                } else if (string_238_.startsWith(Class41.aClass41_529.method301(Class191.anInt4822, (byte) -108))) {
                    i_240_ = 5;
                    string = string.substring(Class41.aClass41_529.method301(Class191.anInt4822, (byte) -108).length());
                }
            }
            anInt602++;
            Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, Class346_Sub5_Sub2.aISAACCypher_9889, Class48.aOutgoingOpcode_645);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-101, 0);
            int i_241_ = (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-117, i_239_);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-60, i_240_);
            Class166.method1537((byte) -98, (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257), string);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2216(-20198, (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset) - i_241_);
            Class226_Sub3.method1814(class248_sub36, 0);
        }
    }

    private static final void method346(int i) {
        RSInterface2 class354 = Class276.method2853(65535, i);
        if (class354 != null) {
            int i_242_ = i >>> 16;
            RSInterface2[] class354s = Node_Sub46.aClass354ArrayArray7379[i_242_];
            if (class354s == null) {
                RSInterface2[] class354s_243_ = (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_242_]);
                int i_244_ = class354s_243_.length;
                class354s = Node_Sub46.aClass354ArrayArray7379[i_242_] = new RSInterface2[i_244_];
                Class159.method1399(class354s_243_, 0, class354s, 0, class354s_243_.length);
            }
            int i_245_;
            for (i_245_ = 0; i_245_ < class354s.length; i_245_++) {
                if (class354s[i_245_] == class354)
                    break;
            }
            if (i_245_ < class354s.length) {
                Class159.method1399(class354s, i_245_ + 1, class354s, i_245_, class354s.length - i_245_ - 1);
                class354s[class354s.length - 1] = class354;
            }
        }
    }

    private static final void method347(Node_Sub8_Sub18 script, int i) {
        anInt613 = 0;
        anInt605 = 0;
        int opcodeIndex = -1;
        int[] opcodes = ((Node_Sub8_Sub18) script).opcodes;
        int[] values = ((Node_Sub8_Sub18) script).anIntArray9068;
//        for (int j = 0; j < opcodes.length; j++) {
//        	System.out.println("opcode[:" + j + "] " + opcodes[j]);
//        }
//        for (int j = 0; j < values.length; j++) {
//        	System.out.println("value[:" + j + "] " + opcodes[j]);
//        }
        int currentOpcode = -1;
        anInt625 = 0;
        try {
            int i_249_ = 0;
            for (; ; ) {
                if (++i_249_ > i)
                    throw new RuntimeException("slow");
                currentOpcode = opcodes[++opcodeIndex];
                if (currentOpcode < 100) {
                    if (currentOpcode == 0)
                        anIntArray601[anInt613++] = values[opcodeIndex];
                    else if (currentOpcode == 1) {
                        int i_250_ = values[opcodeIndex];
                        anIntArray601[anInt613++] = (((Class291) Node_Sub43.aClass291_7306).anIntArray4749[i_250_]);
                    } else if (currentOpcode == 2) {
                        int i_251_ = values[opcodeIndex];
                        Node_Sub43.aClass291_7306.method3103(anIntArray601[--anInt613], i_251_, 0);
                    } else if (currentOpcode == 3)
                        aStringArray624[anInt605++] = (((Node_Sub8_Sub18) script).aStringArray9070[opcodeIndex]);
                    else if (currentOpcode == 6)
                        opcodeIndex += values[opcodeIndex];
                    else if (currentOpcode == 7) {
                        anInt613 -= 2;
                        if (anIntArray601[anInt613] != anIntArray601[anInt613 + 1])
                            opcodeIndex += values[opcodeIndex];
                    } else if (currentOpcode == 8) {
                        anInt613 -= 2;
                        if (anIntArray601[anInt613] == anIntArray601[anInt613 + 1])
                            opcodeIndex += values[opcodeIndex];
                    } else if (currentOpcode == 9) {
                        anInt613 -= 2;
                        if (anIntArray601[anInt613] < anIntArray601[anInt613 + 1])
                            opcodeIndex += values[opcodeIndex];
                    } else if (currentOpcode == 10) {
                        anInt613 -= 2;
                        if (anIntArray601[anInt613] > anIntArray601[anInt613 + 1])
                            opcodeIndex += values[opcodeIndex];
                    } else if (currentOpcode == 21) {
                        if (anInt625 == 0)
                            return;
                        Class149 class149 = aClass149Array612[--anInt625];
                        script = ((Class149) class149).aClass248_Sub8_Sub18_1743;
                        opcodes = (((Node_Sub8_Sub18) script).opcodes);
                        values = (((Node_Sub8_Sub18) script).anIntArray9068);
                        opcodeIndex = ((Class149) class149).anInt1749;
                        integerOpcodes = ((Class149) class149).anIntArray1748;
                        stringOpcodes = ((Class149) class149).aStringArray1744;
                    } else if (currentOpcode == 25) {
                        int i_252_ = values[opcodeIndex];
                        anIntArray601[anInt613++] = Node_Sub43.aClass291_7306.method10(i_252_, (byte) -108);
                    } else if (currentOpcode == 27) {
                        int i_253_ = values[opcodeIndex];
                        Node_Sub43.aClass291_7306.method3100(anIntArray601[--anInt613], i_253_, (byte) 98);
                    } else if (currentOpcode == 31) {
                        anInt613 -= 2;
                        if (anIntArray601[anInt613] <= anIntArray601[anInt613 + 1])
                            opcodeIndex += values[opcodeIndex];
                    } else if (currentOpcode == 32) {
                        anInt613 -= 2;
                        if (anIntArray601[anInt613] >= anIntArray601[anInt613 + 1])
                            opcodeIndex += values[opcodeIndex];
                    } else if (currentOpcode == 33)
                        anIntArray601[anInt613++] = integerOpcodes[values[opcodeIndex]];
                    else if (currentOpcode == 34)
                        integerOpcodes[values[opcodeIndex]] = anIntArray601[--anInt613];
                    else if (currentOpcode == 35)
                        aStringArray624[anInt605++] = stringOpcodes[values[opcodeIndex]];
                    else if (currentOpcode == 36)
                        stringOpcodes[values[opcodeIndex]] = aStringArray624[--anInt605];
                    else if (currentOpcode == 37) {
                        int i_254_ = values[opcodeIndex];
                        anInt605 -= i_254_;
                        String string = Class332.method3402(-30907, aStringArray624, anInt605, i_254_);
                        aStringArray624[anInt605++] = string;
                    } else if (currentOpcode == 38)
                        anInt613--;
                    else if (currentOpcode == 39)
                        anInt605--;
                    else if (currentOpcode == 40) {
                        int i_255_ = values[opcodeIndex];
                        Node_Sub8_Sub18 class248_sub8_sub18_256_ = Class374.method3874(i_255_, -7550);
                        if (class248_sub8_sub18_256_ == null)
                            throw new RuntimeException();
                        int[] is_257_ = new int[((Node_Sub8_Sub18) class248_sub8_sub18_256_).integerInstructionsAmount];
                        String[] strings = new String[((Node_Sub8_Sub18) class248_sub8_sub18_256_).stringInstructionsAmount];
                        for (int i_258_ = 0; i_258_ < ((Node_Sub8_Sub18) class248_sub8_sub18_256_).anInt9078; i_258_++)
                            is_257_[i_258_] = (anIntArray601[anInt613 - (((Node_Sub8_Sub18) class248_sub8_sub18_256_).anInt9078) + i_258_]);
                        for (int i_259_ = 0; i_259_ < ((Node_Sub8_Sub18) class248_sub8_sub18_256_).anInt9066; i_259_++)
                            strings[i_259_] = (aStringArray624[anInt605 - (((Node_Sub8_Sub18) class248_sub8_sub18_256_).anInt9066) + i_259_]);
                        anInt613 -= ((Node_Sub8_Sub18) class248_sub8_sub18_256_).anInt9078;
                        anInt605 -= ((Node_Sub8_Sub18) class248_sub8_sub18_256_).anInt9066;
                        Class149 class149 = new Class149();
                        ((Class149) class149).aClass248_Sub8_Sub18_1743 = script;
                        ((Class149) class149).anInt1749 = opcodeIndex;
                        ((Class149) class149).anIntArray1748 = integerOpcodes;
                        ((Class149) class149).aStringArray1744 = stringOpcodes;
                        if (anInt625 >= aClass149Array612.length)
                            throw new RuntimeException();
                        aClass149Array612[anInt625++] = class149;
                        script = class248_sub8_sub18_256_;
                        opcodes = (((Node_Sub8_Sub18) script).opcodes);
                        values = (((Node_Sub8_Sub18) script).anIntArray9068);
                        opcodeIndex = -1;
                        integerOpcodes = is_257_;
                        stringOpcodes = strings;
                    } else if (currentOpcode == 42)
                        anIntArray601[anInt613++] = Class357.anIntArray4417[values[opcodeIndex]];
                    else if (currentOpcode == 43) {
                        int i_260_ = values[opcodeIndex];
                        Class357.anIntArray4417[i_260_] = anIntArray601[--anInt613];
                        aa_Sub2.method163(false, i_260_);
                        Class346_Sub7_Sub1_Sub1.aBoolean10133 |= Class215.aBooleanArray2477[i_260_];
                    } else if (currentOpcode == 44) {
                        int i_261_ = values[opcodeIndex] >> 16;
                        int i_262_ = values[opcodeIndex] & 0xffff;
                        int i_263_ = anIntArray601[--anInt613];
                        if (i_263_ < 0 || i_263_ > 5000)
                            throw new RuntimeException();
                        anIntArray623[i_261_] = i_263_;
                        int i_264_ = -1;
                        if (i_262_ == 105)
                            i_264_ = 0;
                        for (int i_265_ = 0; i_265_ < i_263_; i_265_++)
                            anIntArrayArray611[i_261_][i_265_] = i_264_;
                    } else if (currentOpcode == 45) {
                        int i_266_ = values[opcodeIndex];
                        int i_267_ = anIntArray601[--anInt613];
                        if (i_267_ < 0 || i_267_ >= anIntArray623[i_266_])
                            throw new RuntimeException();
                        anIntArray601[anInt613++] = anIntArrayArray611[i_266_][i_267_];
                    } else if (currentOpcode == 46) {
                        int i_268_ = values[opcodeIndex];
                        anInt613 -= 2;
                        int i_269_ = anIntArray601[anInt613];
                        if (i_269_ < 0 || i_269_ >= anIntArray623[i_268_])
                            throw new RuntimeException();
                        anIntArrayArray611[i_268_][i_269_] = anIntArray601[anInt613 + 1];
                    } else if (currentOpcode == 47) {
                        String string = Class282_Sub2.aStringArray7612[values[opcodeIndex]];
                        if (string == null)
                            string = "null";
                        aStringArray624[anInt605++] = string;
                    } else if (currentOpcode == 48) {
                        int i_270_ = values[opcodeIndex];
                        Class282_Sub2.aStringArray7612[i_270_] = aStringArray624[--anInt605];
                        Class346_Sub7_Sub4_Sub2.method3687(i_270_, (byte) 113);
                    } else if (currentOpcode == 51) {
                        Class65 class65 = (((Node_Sub8_Sub18) script).aClass65Array9069[values[opcodeIndex]]);
                        Node_Sub37 class248_sub37 = ((Node_Sub37) class65.method501((long) (anIntArray601[--anInt613]), (byte) 31));
                        if (class248_sub37 != null)
                            opcodeIndex += ((Node_Sub37) class248_sub37).anInt7261;
                    } else if (currentOpcode == 86) {
                        if (anIntArray601[--anInt613] == 1)
                            opcodeIndex += values[opcodeIndex];
                    } else if (currentOpcode == 87 && anIntArray601[--anInt613] == 0)
                        opcodeIndex += values[opcodeIndex];
                } else {
                    boolean bool;
                    if (values[opcodeIndex] == 1)
                        bool = true;
                    else
                        bool = false;
                    if (currentOpcode >= 100 && currentOpcode < 5000)
                        method352(currentOpcode, bool);
                    else {
                        if (currentOpcode < 5000 || currentOpcode >= 10000)
                            break;
                        method343(currentOpcode, bool);
                    }
                }
            }
            throw new IllegalStateException("Command: " + currentOpcode);
        } catch (Exception exception) {
            if (((Node_Sub8_Sub18) script).aString9067 != null) {
                Node_Sub14_Sub5.method2289(4, 31663, ("Clientscript error in: " + (((Node_Sub8_Sub18) script).aString9067)));
                StringBuffer stringbuffer = new StringBuffer(30);
                stringbuffer.append("Clientscript error in: ").append(((Node_Sub8_Sub18) script).aString9067).append("\n");
                for (int i_271_ = anInt625 - 1; i_271_ >= 0; i_271_--)
                    stringbuffer.append("via: ").append(((Node_Sub8_Sub18) (((Class149) aClass149Array612[i_271_]).aClass248_Sub8_Sub18_1743)).aString9067).append("\n");
                stringbuffer.append("Op: ").append(currentOpcode).append("\n");
                String string = exception.getMessage();
                if (string != null && string.length() > 0)
                    stringbuffer.append("Message: ").append(string).append("\n");
                Class282_Sub14.method2975(stringbuffer.toString(), exception, 1);
                Class106.method750(stringbuffer.toString(), (byte) 104);
            } else {
                StringBuffer stringbuffer = new StringBuffer(30);
                stringbuffer.append("CS2: ").append(((Node) script).id).append(" ");
                for (int i_272_ = anInt625 - 1; i_272_ >= 0; i_272_--)
                    stringbuffer.append("v: ").append(((Node) (((Class149) aClass149Array612[i_272_]).aClass248_Sub8_Sub18_1743)).id).append(" ");
                stringbuffer.append("op: ").append(currentOpcode);
                Class282_Sub14.method2975(stringbuffer.toString(), exception, 1);
            }
        }
    }

    private static final int method348(char c) {
        if (Class245.method1958(c, -161))
            return 1;
        return 0;
    }

    static final void method349() {
        /* empty */
    }

    public static void method350() {
        integerOpcodes = null;
        stringOpcodes = null;
        anIntArray623 = null;
        anIntArrayArray611 = null;
        anIntArray601 = null;
        aStringArray624 = null;
        aClass149Array612 = null;
        aClass354_608 = null;
        aClass354_615 = null;
        aClass1_618 = null;
        anIntArray616 = null;
        aClass278_607 = null;
    }

    static final void method351(Class58 class58, int i, int i_273_) {
        Node_Sub8_Sub18 class248_sub8_sub18 = Class101.method717(i, i_273_, class58, -22038);
        if (class248_sub8_sub18 != null) {
            integerOpcodes = (new int
                    [((Node_Sub8_Sub18) class248_sub8_sub18).integerInstructionsAmount]);
            stringOpcodes = (new String
                    [((Node_Sub8_Sub18) class248_sub8_sub18).stringInstructionsAmount]);
            if ((((Node_Sub8_Sub18) class248_sub8_sub18).aClass58_9076 == Class301_Sub2.aClass58_8432) || (((Node_Sub8_Sub18) class248_sub8_sub18).aClass58_9076 == aa_Sub1.aClass58_5254) || (((Node_Sub8_Sub18) class248_sub8_sub18).aClass58_9076 == Class122.aClass58_1517)) {
                int i_274_ = 0;
                int i_275_ = 0;
                if (WorldAddress.aClass354_1193 != null) {
                    i_274_ = ((RSInterface2) WorldAddress.aClass354_1193).anInt4257;
                    i_275_ = ((RSInterface2) WorldAddress.aClass354_1193).anInt4370;
                }
                integerOpcodes[0] = Class46.aClass269_600.method2817((byte) -92) - i_274_;
                integerOpcodes[1] = Class46.aClass269_600.method2809(92) - i_275_;
            }
            method347(class248_sub8_sub18, 200000);
        }
    }

    private static final void method352(int i, boolean bool) {
        if (i < 300) {
            if (i == 100) {
                anInt613 -= 3;
                int i_276_ = anIntArray601[anInt613];
                int i_277_ = anIntArray601[anInt613 + 1];
                int i_278_ = anIntArray601[anInt613 + 2];
                if (i_277_ == 0)
                    throw new RuntimeException();
                RSInterface2 class354 = Class276.method2853(65535, i_276_);
                if (((RSInterface2) class354).aClass354Array4285 == null)
                    ((RSInterface2) class354).aClass354Array4285 = new RSInterface2[i_278_ + 1];
                if (((RSInterface2) class354).aClass354Array4285.length <= i_278_) {
                    RSInterface2[] class354s = new RSInterface2[i_278_ + 1];
                    for (int i_279_ = 0; (i_279_ < ((RSInterface2) class354).aClass354Array4285.length); i_279_++)
                        class354s[i_279_] = ((RSInterface2) class354).aClass354Array4285[i_279_];
                    ((RSInterface2) class354).aClass354Array4285 = class354s;
                }
                if (i_278_ > 0 && (((RSInterface2) class354).aClass354Array4285[i_278_ - 1] == null))
                    throw new RuntimeException("Gap at:" + (i_278_ - 1));
                RSInterface2 class354_280_ = new RSInterface2();
                ((RSInterface2) class354_280_).anInt4284 = i_277_;
                ((RSInterface2) class354_280_).anInt4300 = ((RSInterface2) class354_280_).interfaceValues = ((RSInterface2) class354).interfaceValues;
                ((RSInterface2) class354_280_).index = i_278_;
                ((RSInterface2) class354).aClass354Array4285[i_278_] = class354_280_;
                if (bool)
                    aClass354_615 = class354_280_;
                else
                    aClass354_608 = class354_280_;
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 101) {
                RSInterface2 class354 = bool ? aClass354_615 : aClass354_608;
                if (((RSInterface2) class354).index == -1) {
                    if (bool)
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                RSInterface2 class354_281_ = Class276.method2853(65535, ((RSInterface2) class354).interfaceValues);
                ((RSInterface2) class354_281_).aClass354Array4285[((RSInterface2) class354).index] = null;
                Class376.method3882(class354_281_, 2260);
                return;
            }
            if (i == 102) {
                RSInterface2 class354 = Class276.method2853(65535, anIntArray601[--anInt613]);
                ((RSInterface2) class354).aClass354Array4285 = null;
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 200) {
                anInt613 -= 2;
                int i_282_ = anIntArray601[anInt613];
                int i_283_ = anIntArray601[anInt613 + 1];
                RSInterface2 class354 = Class188.method1635(i_282_, i_283_, 0);
                if (class354 != null && i_283_ != -1) {
                    anIntArray601[anInt613++] = 1;
                    if (bool)
                        aClass354_615 = class354;
                    else
                        aClass354_608 = class354;
                } else {
                    anIntArray601[anInt613++] = 0;
                    return;
                }
                return;
            }
            if (i == 201) {
                int i_284_ = anIntArray601[--anInt613];
                RSInterface2 class354 = Class276.method2853(65535, i_284_);
                if (class354 != null) {
                    anIntArray601[anInt613++] = 1;
                    if (bool)
                        aClass354_615 = class354;
                    else
                        aClass354_608 = class354;
                } else {
                    anIntArray601[anInt613++] = 0;
                    return;
                }
                return;
            }
            if (i == 202) {
                int i_285_ = anIntArray601[--anInt613];
                method346(i_285_);
                return;
            }
            if (i == 203) {
                int i_286_ = anIntArray601[--anInt613];
                method353(i_286_);
                return;
            }
        } else if (i < 500) {
            if (i == 403) {
                anInt613 -= 2;
                int lookId = anIntArray601[anInt613];
                int lookValue = anIntArray601[anInt613 + 1];
                //System.out.println("[403] i_287_: " + lookId + " i_288_: " + lookValue);
                if ((((Player) Class347.myPlayer).aClass332_10549) != null) {
                    for (int someLookId = 0; someLookId < Node_Sub48.lookIndices2.length; someLookId++) { // 7
                        if (Node_Sub48.lookIndices2[someLookId] == lookId) {
                            ((Player) Class347.myPlayer).aClass332_10549.setLooks2(lookValue, Class335.aClass172_3908, someLookId, 102);
                            return;
                        }
                    }
                    for (int i2 = 0; i2 < Class54_Sub4.lookIndices.length; i2++) { // 7
                        if (Class54_Sub4.lookIndices[i2] == lookId) {
                            ((Player) Class347.myPlayer).aClass332_10549.setLooks2(lookValue, Class335.aClass172_3908, i2, 96);
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (i == 404) {
                anInt613 -= 2;
                int colorIndex = anIntArray601[anInt613];
                int colorId = anIntArray601[anInt613 + 1];
                //System.out.println("[404] colorIndex: " + colorIndex + " colorId:" + colorId);
                if ((((Player) Class347.myPlayer).aClass332_10549) != null) {
                    ((Player) Class347.myPlayer).aClass332_10549.setColors(colorIndex, 0, colorId);
                    return;
                }
                return;
            }
            if (i == 410) {
                boolean bool_293_ = anIntArray601[--anInt613] != 0;
                if ((((Player) Class347.myPlayer).aClass332_10549) != null) {
                    ((Player) Class347.myPlayer).aClass332_10549.method3409(0, bool_293_);
                    return;
                }
                return;
            }
            if (i == 411) {
                anInt613 -= 2;
                int looksIndex = anIntArray601[anInt613];
                int lookValue = anIntArray601[anInt613 + 1];
                //System.out.println("[411] looksIndex: " + looksIndex + " someBitwiseANDValue: " + lookValue);
                if ((((Player) Class347.myPlayer).aClass332_10549) != null) {
                    ((Player) Class347.myPlayer).aClass332_10549.setLooks(lookValue, looksIndex, 15073, Class283.aClass342_3343);
                    return;
                }
                return;
            }
        } else if (i >= 1000 && i < 1100 || i >= 2000 && i < 2100) {
            RSInterface2 class354;
            if (i >= 2000) {
                i -= 1000;
                class354 = Class276.method2853(65535, anIntArray601[--anInt613]);
            } else
                class354 = bool ? aClass354_615 : aClass354_608;
            if (i == 1000) {
                anInt613 -= 4;
                ((RSInterface2) class354).anInt4331 = anIntArray601[anInt613];
                ((RSInterface2) class354).anInt4239 = anIntArray601[anInt613 + 1];
                int i_296_ = anIntArray601[anInt613 + 2];
                if (i_296_ < 0)
                    i_296_ = 0;
                else if (i_296_ > 5)
                    i_296_ = 5;
                int i_297_ = anIntArray601[anInt613 + 3];
                if (i_297_ < 0)
                    i_297_ = 0;
                else if (i_297_ > 5)
                    i_297_ = 5;
                ((RSInterface2) class354).aByte4298 = (byte) i_296_;
                ((RSInterface2) class354).aByte4243 = (byte) i_297_;
                Class376.method3882(class354, 2260);
                Node_Sub8_Sub5.method2053(class354, -1);
                if (((RSInterface2) class354).index == -1)
                    r_Sub2.method2115(((RSInterface2) class354).interfaceValues, 125);
                return;
            }
            if (i == 1001) {
                anInt613 -= 4;
                ((RSInterface2) class354).anInt4306 = anIntArray601[anInt613];
                ((RSInterface2) class354).anInt4218 = anIntArray601[anInt613 + 1];
                ((RSInterface2) class354).anInt4321 = 0;
                ((RSInterface2) class354).anInt4327 = 0;
                int i_298_ = anIntArray601[anInt613 + 2];
                if (i_298_ < 0)
                    i_298_ = 0;
                else if (i_298_ > 4)
                    i_298_ = 4;
                int i_299_ = anIntArray601[anInt613 + 3];
                if (i_299_ < 0)
                    i_299_ = 0;
                else if (i_299_ > 4)
                    i_299_ = 4;
                ((RSInterface2) class354).aByte4241 = (byte) i_298_;
                ((RSInterface2) class354).aByte4302 = (byte) i_299_;
                Class376.method3882(class354, 2260);
                Node_Sub8_Sub5.method2053(class354, -1);
                if (((RSInterface2) class354).anInt4284 == 0)
                    Class60.method471(false, (byte) 100, class354);
                return;
            }
            if (i == 1003) {
                boolean bool_300_ = anIntArray601[--anInt613] == 1;
                if (((RSInterface2) class354).aBoolean4293 != bool_300_) {
                    ((RSInterface2) class354).aBoolean4293 = bool_300_;
                    Class376.method3882(class354, 2260);
                }
                if (((RSInterface2) class354).index == -1)
                    Class54_Sub4.method436(15, ((RSInterface2) class354).interfaceValues);
                return;
            }
            if (i == 1004) {
                anInt613 -= 2;
                ((RSInterface2) class354).anInt4206 = anIntArray601[anInt613];
                ((RSInterface2) class354).anInt4216 = anIntArray601[anInt613 + 1];
                Class376.method3882(class354, 2260);
                Node_Sub8_Sub5.method2053(class354, -1);
                if (((RSInterface2) class354).anInt4284 == 0)
                    Class60.method471(false, (byte) 100, class354);
                return;
            }
            if (i == 1005) {
                ((RSInterface2) class354).aBoolean4259 = anIntArray601[--anInt613] == 1;
                return;
            }
        } else if (i >= 1100 && i < 1200 || i >= 2100 && i < 2200) {
            RSInterface2 class354;
            if (i >= 2000) {
                i -= 1000;
                class354 = Class276.method2853(65535, anIntArray601[--anInt613]);
            } else
                class354 = bool ? aClass354_615 : aClass354_608;
            if (i == 1100) {
                anInt613 -= 2;
                ((RSInterface2) class354).anInt4261 = anIntArray601[anInt613];
                if (((RSInterface2) class354).anInt4261 > (((RSInterface2) class354).anInt4374 - ((RSInterface2) class354).anInt4332))
                    ((RSInterface2) class354).anInt4261 = (((RSInterface2) class354).anInt4374 - ((RSInterface2) class354).anInt4332);
                if (((RSInterface2) class354).anInt4261 < 0)
                    ((RSInterface2) class354).anInt4261 = 0;
                ((RSInterface2) class354).anInt4271 = anIntArray601[anInt613 + 1];
                if (((RSInterface2) class354).anInt4271 > (((RSInterface2) class354).anInt4345 - ((RSInterface2) class354).anInt4223))
                    ((RSInterface2) class354).anInt4271 = (((RSInterface2) class354).anInt4345 - ((RSInterface2) class354).anInt4223);
                if (((RSInterface2) class354).anInt4271 < 0)
                    ((RSInterface2) class354).anInt4271 = 0;
                Class376.method3882(class354, 2260);
                if (((RSInterface2) class354).index == -1)
                    Class346_Sub7_Sub4.method3679(-1, ((RSInterface2) class354).interfaceValues);
                return;
            }
            if (i == 1101) {
                ((RSInterface2) class354).anInt4308 = anIntArray601[--anInt613];
                Class376.method3882(class354, 2260);
                if (((RSInterface2) class354).index == -1)
                    Class145.method1309(-25908, ((RSInterface2) class354).interfaceValues);
                return;
            }
            if (i == 1102) {
                ((RSInterface2) class354).aBoolean4219 = anIntArray601[--anInt613] == 1;
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1103) {
                ((RSInterface2) class354).anInt4344 = anIntArray601[--anInt613];
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1104) {
                ((RSInterface2) class354).anInt4208 = anIntArray601[--anInt613];
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1105) {
                int i_301_ = anIntArray601[--anInt613];
                if (((RSInterface2) class354).anInt4254 != i_301_) {
                    ((RSInterface2) class354).anInt4254 = i_301_;
                    Class376.method3882(class354, 2260);
                }
                if (((RSInterface2) class354).index == -1)
                    Class346_Sub7_Sub5_Sub1.method3694(-83, ((RSInterface2) class354).interfaceValues);
                return;
            }
            if (i == 1106) {
                ((RSInterface2) class354).anInt4253 = anIntArray601[--anInt613];
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1107) {
                ((RSInterface2) class354).aBoolean4360 = anIntArray601[--anInt613] == 1;
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1108) {
                ((RSInterface2) class354).anInt4222 = 1;
                ((RSInterface2) class354).anInt4269 = anIntArray601[--anInt613];
                Class376.method3882(class354, 2260);
                if (((RSInterface2) class354).index == -1)
                    Class340_Sub9.method3473(((RSInterface2) class354).interfaceValues, (byte) 117);
                return;
            }
            if (i == 1109) {
                anInt613 -= 6;
                ((RSInterface2) class354).anInt4280 = anIntArray601[anInt613];
                ((RSInterface2) class354).anInt4350 = anIntArray601[anInt613 + 1];
                ((RSInterface2) class354).anInt4328 = anIntArray601[anInt613 + 2];
                ((RSInterface2) class354).anInt4209 = anIntArray601[anInt613 + 3];
                ((RSInterface2) class354).anInt4289 = anIntArray601[anInt613 + 4];
                ((RSInterface2) class354).anInt4365 = anIntArray601[anInt613 + 5];
                Class376.method3882(class354, 2260);
                if (((RSInterface2) class354).index == -1) {
                    Node_Sub14_Sub2.method2282(false, ((RSInterface2) class354).interfaceValues);
                    Class377.method3883(((RSInterface2) class354).interfaceValues, (byte) 123);
                }
                return;
            }
            if (i == 1110) {
                int i_302_ = anIntArray601[--anInt613];
                if (((RSInterface2) class354).anInt4248 != i_302_) {
                    ((RSInterface2) class354).anInt4248 = i_302_;
                    ((RSInterface2) class354).anInt4237 = 0;
                    ((RSInterface2) class354).anInt4282 = 1;
                    ((RSInterface2) class354).anInt4234 = 0;
                    Class182 class182 = (((RSInterface2) class354).anInt4248 == -1 ? null : Class235.aClass356_2617.method3790((byte) -90, (((RSInterface2) class354).anInt4248)));
                    if (class182 != null)
                        aa_Sub1.method157(class182, false, ((RSInterface2) class354).anInt4237);
                    Class376.method3882(class354, 2260);
                }
                if (((RSInterface2) class354).index == -1)
                    Node_Sub48.method2669((byte) -101, ((RSInterface2) class354).interfaceValues);
                return;
            }
            if (i == 1111) {
                ((RSInterface2) class354).aBoolean4231 = anIntArray601[--anInt613] == 1;
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1112) {
                String string = aStringArray624[--anInt605];
                if (!string.equals(((RSInterface2) class354).aString4250)) {
                    ((RSInterface2) class354).aString4250 = string;
                    Class376.method3882(class354, 2260);
                }
                if (((RSInterface2) class354).index == -1)
                    Class275_Sub1.method2848(((RSInterface2) class354).interfaceValues, false);
                return;
            }
            if (i == 1113) {
                ((RSInterface2) class354).anInt4275 = anIntArray601[--anInt613];
                Class376.method3882(class354, 2260);
                if (((RSInterface2) class354).index == -1)
                    Class320.method3322((byte) 70, ((RSInterface2) class354).interfaceValues);
                return;
            }
            if (i == 1114) {
                anInt613 -= 3;
                ((RSInterface2) class354).anInt4334 = anIntArray601[anInt613];
                ((RSInterface2) class354).anInt4256 = anIntArray601[anInt613 + 1];
                ((RSInterface2) class354).anInt4353 = anIntArray601[anInt613 + 2];
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1115) {
                ((RSInterface2) class354).aBoolean4290 = anIntArray601[--anInt613] == 1;
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1116) {
                ((RSInterface2) class354).anInt4299 = anIntArray601[--anInt613];
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1117) {
                ((RSInterface2) class354).anInt4340 = anIntArray601[--anInt613];
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1118) {
                ((RSInterface2) class354).aBoolean4319 = anIntArray601[--anInt613] == 1;
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1119) {
                ((RSInterface2) class354).aBoolean4337 = anIntArray601[--anInt613] == 1;
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1120) {
                anInt613 -= 2;
                ((RSInterface2) class354).anInt4374 = anIntArray601[anInt613];
                ((RSInterface2) class354).anInt4345 = anIntArray601[anInt613 + 1];
                Class376.method3882(class354, 2260);
                if (((RSInterface2) class354).anInt4284 == 0)
                    Class60.method471(false, (byte) 100, class354);
                return;
            }
            if (i == 1122) {
                ((RSInterface2) class354).aBoolean4235 = anIntArray601[--anInt613] == 1;
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1123) {
                ((RSInterface2) class354).anInt4365 = anIntArray601[--anInt613];
                Class376.method3882(class354, 2260);
                if (((RSInterface2) class354).index == -1)
                    Node_Sub14_Sub2.method2282(false, ((RSInterface2) class354).interfaceValues);
                return;
            }
            if (i == 1124) {
                int i_303_ = anIntArray601[--anInt613];
                ((RSInterface2) class354).aBoolean4230 = i_303_ == 1;
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1125) {
                anInt613 -= 2;
                ((RSInterface2) class354).anInt4273 = anIntArray601[anInt613];
                ((RSInterface2) class354).anInt4270 = anIntArray601[anInt613 + 1];
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1126) {
                ((RSInterface2) class354).anInt4349 = anIntArray601[--anInt613];
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1127) {
                anInt613 -= 2;
                int i_304_ = anIntArray601[anInt613];
                int i_305_ = anIntArray601[anInt613 + 1];
                Class210 class210 = Node_Sub20.aClass240_7045.method1923(-6119, i_304_);
                if (i_305_ != ((Class210) class210).anInt2430)
                    class354.method3772(i_304_, i_305_, (byte) 117);
                else {
                    class354.method3773(i_304_, (byte) 26);
                    return;
                }
                return;
            }
            if (i == 1128) {
                int i_306_ = anIntArray601[--anInt613];
                String string = aStringArray624[--anInt605];
                Class210 class210 = Node_Sub20.aClass240_7045.method1923(-6119, i_306_);
                if (!((Class210) class210).aString2425.equals(string))
                    class354.method3778(i_306_, string, false);
                else {
                    class354.method3773(i_306_, (byte) 26);
                    return;
                }
                return;
            }
            if (i == 1129 || i == 1130) {
                int i_307_ = anIntArray601[--anInt613];
                if ((((RSInterface2) class354).anInt4284 == 5 || i != 1129) && (((RSInterface2) class354).anInt4284 == 4 || i != 1130)) {
                    if (((RSInterface2) class354).anInt4336 != i_307_) {
                        ((RSInterface2) class354).anInt4336 = i_307_;
                        Class376.method3882(class354, 2260);
                    }
                    if (((RSInterface2) class354).index == -1)
                        Class84_Sub5.method615(-127, ((RSInterface2) class354).interfaceValues);
                    return;
                }
                return;
            }
        } else if (i >= 1200 && i < 1300 || i >= 2200 && i < 2300) {
            RSInterface2 class354;
            if (i >= 2000) {
                i -= 1000;
                class354 = Class276.method2853(65535, anIntArray601[--anInt613]);
            } else
                class354 = bool ? aClass354_615 : aClass354_608;
            Class376.method3882(class354, 2260);
            if (i == 1200 || i == 1205 || i == 1208 || i == 1209 || i == 1212 || i == 1213) {
                anInt613 -= 2;
                int i_308_ = anIntArray601[anInt613];
                int i_309_ = anIntArray601[anInt613 + 1];
                if (((RSInterface2) class354).index == -1) {
                    Class297.method3135(((RSInterface2) class354).interfaceValues, -32204);
                    Node_Sub14_Sub2.method2282(false, ((RSInterface2) class354).interfaceValues);
                    Class377.method3883(((RSInterface2) class354).interfaceValues, (byte) 120);
                }
                if (i_308_ == -1) {
                    ((RSInterface2) class354).anInt4222 = 1;
                    ((RSInterface2) class354).anInt4269 = -1;
                    ((RSInterface2) class354).id = -1;
                } else {
                    ((RSInterface2) class354).id = i_308_;
                    ((RSInterface2) class354).anInt4263 = i_309_;
                    if (i == 1208 || i == 1209)
                        ((RSInterface2) class354).aBoolean4312 = true;
                    else
                        ((RSInterface2) class354).aBoolean4312 = false;
                    Class321 class321 = Class283.aClass342_3343.method3482((byte) 97, i_308_);
                    ((RSInterface2) class354).anInt4328 = ((Class321) class321).anInt3781;
                    ((RSInterface2) class354).anInt4209 = ((Class321) class321).anInt3742;
                    ((RSInterface2) class354).anInt4289 = ((Class321) class321).anInt3748;
                    ((RSInterface2) class354).anInt4280 = ((Class321) class321).anInt3711;
                    ((RSInterface2) class354).anInt4350 = ((Class321) class321).anInt3724;
                    ((RSInterface2) class354).anInt4365 = ((Class321) class321).anInt3707;
                    if (i == 1205 || i == 1209)
                        ((RSInterface2) class354).anInt4268 = 0;
                    else if (i == 1212 || i == 1213)
                        ((RSInterface2) class354).anInt4268 = 1;
                    else
                        ((RSInterface2) class354).anInt4268 = 2;
                    if (((RSInterface2) class354).anInt4321 > 0)
                        ((RSInterface2) class354).anInt4365 = (((RSInterface2) class354).anInt4365 * 32 / ((RSInterface2) class354).anInt4321);
                    else {
                        if (((RSInterface2) class354).anInt4306 > 0)
                            ((RSInterface2) class354).anInt4365 = (((RSInterface2) class354).anInt4365 * 32 / ((RSInterface2) class354).anInt4306);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 1201) {
                ((RSInterface2) class354).anInt4222 = 2;
                ((RSInterface2) class354).anInt4269 = anIntArray601[--anInt613];
                if (((RSInterface2) class354).index == -1)
                    Class340_Sub9.method3473(((RSInterface2) class354).interfaceValues, (byte) 117);
                return;
            }
            if (i == 1202) {
                ((RSInterface2) class354).anInt4222 = 3;
                ((RSInterface2) class354).anInt4269 = -1;
                if (((RSInterface2) class354).index == -1)
                    Class340_Sub9.method3473(((RSInterface2) class354).interfaceValues, (byte) 117);
                return;
            }
            if (i == 1203) {
                ((RSInterface2) class354).anInt4222 = 6;
                ((RSInterface2) class354).anInt4269 = anIntArray601[--anInt613];
                if (((RSInterface2) class354).index == -1)
                    Class340_Sub9.method3473(((RSInterface2) class354).interfaceValues, (byte) 117);
                return;
            }
            if (i == 1204) {
                ((RSInterface2) class354).anInt4222 = 5;
                ((RSInterface2) class354).anInt4269 = anIntArray601[--anInt613];
                if (((RSInterface2) class354).index == -1)
                    Class340_Sub9.method3473(((RSInterface2) class354).interfaceValues, (byte) 117);
                return;
            }
            if (i == 1206) {
                anInt613 -= 4;
                ((RSInterface2) class354).anInt4291 = anIntArray601[anInt613];
                ((RSInterface2) class354).anInt4279 = anIntArray601[anInt613 + 1];
                ((RSInterface2) class354).anInt4373 = anIntArray601[anInt613 + 2];
                ((RSInterface2) class354).anInt4378 = anIntArray601[anInt613 + 3];
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1207) {
                anInt613 -= 2;
                ((RSInterface2) class354).anInt4221 = anIntArray601[anInt613];
                ((RSInterface2) class354).anInt4329 = anIntArray601[anInt613 + 1];
                Class376.method3882(class354, 2260);
                return;
            }
            if (i == 1210) {
                anInt613 -= 4;
                ((RSInterface2) class354).anInt4269 = anIntArray601[anInt613];
                ((RSInterface2) class354).anInt4338 = anIntArray601[anInt613 + 1];
                if (anIntArray601[anInt613 + 2] == 1)
                    ((RSInterface2) class354).anInt4222 = 9;
                else
                    ((RSInterface2) class354).anInt4222 = 8;
                if (anIntArray601[anInt613 + 3] == 1)
                    ((RSInterface2) class354).aBoolean4312 = true;
                else
                    ((RSInterface2) class354).aBoolean4312 = false;
                if (((RSInterface2) class354).index == -1)
                    Class340_Sub9.method3473(((RSInterface2) class354).interfaceValues, (byte) 117);
                return;
            }
            if (i == 1211) {
                ((RSInterface2) class354).anInt4222 = 5;
                ((RSInterface2) class354).anInt4269 = Class282_Sub29.anInt7896;
                ((RSInterface2) class354).anInt4338 = 0;
                if (((RSInterface2) class354).index == -1)
                    Class340_Sub9.method3473(((RSInterface2) class354).interfaceValues, (byte) 117);
                return;
            }
        } else if (i >= 1300 && i < 1400 || i >= 2300 && i < 2400) {
            RSInterface2 class354;
            if (i >= 2000) {
                i -= 1000;
                class354 = Class276.method2853(65535, anIntArray601[--anInt613]);
            } else
                class354 = bool ? aClass354_615 : aClass354_608;
            if (i == 1300) {
                int i_310_ = anIntArray601[--anInt613] - 1;
                if (i_310_ < 0 || i_310_ > 9)
                    anInt605--;
                else {
                    class354.method3765(aStringArray624[--anInt605], true, i_310_);
                    return;
                }
                return;
            }
            if (i == 1301) {
                anInt613 -= 2;
                int i_311_ = anIntArray601[anInt613];
                int i_312_ = anIntArray601[anInt613 + 1];
                if (i_311_ == -1 && i_312_ == -1)
                    ((RSInterface2) class354).aClass354_4272 = null;
                else {
                    ((RSInterface2) class354).aClass354_4272 = Class188.method1635(i_311_, i_312_, 0);
                    return;
                }
                return;
            }
            if (i == 1302) {
                int i_313_ = anIntArray601[--anInt613];
                if (i_313_ == Class225_Sub1.anInt8457 || i_313_ == Class41.anInt530 || i_313_ == ha.anInt1407) {
                    ((RSInterface2) class354).anInt4346 = i_313_;
                    return;
                }
                return;
            }
            if (i == 1303) {
                ((RSInterface2) class354).anInt4247 = anIntArray601[--anInt613];
                return;
            }
            if (i == 1304) {
                ((RSInterface2) class354).anInt4211 = anIntArray601[--anInt613];
                return;
            }
            if (i == 1305) {
                ((RSInterface2) class354).aString4210 = aStringArray624[--anInt605];
                return;
            }
            if (i == 1306) {
                ((RSInterface2) class354).aString4283 = aStringArray624[--anInt605];
                return;
            }
            if (i == 1307) {
                ((RSInterface2) class354).aStringArray4375 = null;
                return;
            }
            if (i == 1308) {
                ((RSInterface2) class354).anInt4278 = anIntArray601[--anInt613];
                ((RSInterface2) class354).anInt4276 = anIntArray601[--anInt613];
                return;
            }
            if (i == 1309) {
                int i_314_ = anIntArray601[--anInt613];
                int i_315_ = anIntArray601[--anInt613];
                if (i_315_ >= 1 && i_315_ <= 10)
                    class354.method3759((byte) -53, i_315_ - 1, i_314_);
                return;
            }
            if (i == 1310) {
                ((RSInterface2) class354).aString4305 = aStringArray624[--anInt605];
                return;
            }
            if (i == 1311) {
                ((RSInterface2) class354).anInt4297 = anIntArray601[--anInt613];
                return;
            }
            if (i == 1312 || i == 1313) {
                int i_316_;
                int i_317_;
                int i_318_;
                if (i == 1312) {
                    anInt613 -= 3;
                    i_316_ = anIntArray601[anInt613] - 1;
                    i_317_ = anIntArray601[anInt613 + 1];
                    i_318_ = anIntArray601[anInt613 + 2];
                    if (i_316_ < 0 || i_316_ > 9)
                        throw new RuntimeException("IOR13121313");
                } else {
                    anInt613 -= 2;
                    i_316_ = 10;
                    i_317_ = anIntArray601[anInt613];
                    i_318_ = anIntArray601[anInt613 + 1];
                }
                if (((RSInterface2) class354).aByteArray4307 == null) {
                    if (i_317_ != 0) {
                        ((RSInterface2) class354).aByteArray4307 = new byte[11];
                        ((RSInterface2) class354).aByteArray4330 = new byte[11];
                        ((RSInterface2) class354).anIntArray4212 = new int[11];
                    } else
                        return;
                }
                ((RSInterface2) class354).aByteArray4307[i_316_] = (byte) i_317_;
                if (i_317_ != 0)
                    ((RSInterface2) class354).aBoolean4296 = true;
                else {
                    ((RSInterface2) class354).aBoolean4296 = false;
                    for (int i_319_ = 0; i_319_ < ((RSInterface2) class354).aByteArray4307.length; i_319_++) {
                        if (((RSInterface2) class354).aByteArray4307[i_319_] != 0) {
                            ((RSInterface2) class354).aBoolean4296 = true;
                            break;
                        }
                    }
                }
                ((RSInterface2) class354).aByteArray4330[i_316_] = (byte) i_318_;
                return;
            }
            if (i == 1314) {
                ((RSInterface2) class354).anInt4294 = anIntArray601[--anInt613];
                return;
            }
        } else {
            if (i >= 1400 && i < 1500 || i >= 2400 && i < 2500) {
                RSInterface2 class354;
                if (i >= 2000) {
                    i -= 1000;
                    class354 = Class276.method2853(65535, anIntArray601[--anInt613]);
                } else
                    class354 = bool ? aClass354_615 : aClass354_608;
                if (i == 1499)
                    class354.method3774(false);
                else {
                    String string = aStringArray624[--anInt605];
                    int[] is = null;
                    if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
                        int i_320_ = anIntArray601[--anInt613];
                        if (i_320_ > 0) {
                            is = new int[i_320_];
                            while (i_320_-- > 0)
                                is[i_320_] = anIntArray601[--anInt613];
                        }
                        string = string.substring(0, string.length() - 1);
                    }
                    Object[] objects = new Object[string.length() + 1];
                    for (int i_321_ = objects.length - 1; i_321_ >= 1; i_321_--) {
                        if (string.charAt(i_321_ - 1) == 's')
                            objects[i_321_] = aStringArray624[--anInt605];
                        else
                            objects[i_321_] = new Integer(anIntArray601[--anInt613]);
                    }
                    int i_322_ = anIntArray601[--anInt613];
                    if (i_322_ != -1)
                        objects[0] = new Integer(i_322_);
                    else
                        objects = null;
                    if (i == 1400)
                        ((RSInterface2) class354).anObjectArray4228 = objects;
                    else if (i == 1401)
                        ((RSInterface2) class354).anObjectArray4224 = objects;
                    else if (i == 1402)
                        ((RSInterface2) class354).anObjectArray4260 = objects;
                    else if (i == 1403)
                        ((RSInterface2) class354).anObjectArray4348 = objects;
                    else if (i == 1404)
                        ((RSInterface2) class354).anObjectArray4220 = objects;
                    else if (i == 1405)
                        ((RSInterface2) class354).anObjectArray4325 = objects;
                    else if (i == 1406)
                        ((RSInterface2) class354).anObjectArray4274 = objects;
                    else if (i == 1407) {
                        ((RSInterface2) class354).anObjectArray4358 = objects;
                        ((RSInterface2) class354).anIntArray4252 = is;
                    } else if (i == 1408)
                        ((RSInterface2) class354).anObjectArray4351 = objects;
                    else if (i == 1409)
                        ((RSInterface2) class354).onButton_Parameters = objects;
                    else if (i == 1410)
                        ((RSInterface2) class354).anObjectArray4359 = objects;
                    else if (i == 1411)
                        ((RSInterface2) class354).anObjectArray4316 = objects;
                    else if (i == 1412)
                        ((RSInterface2) class354).anObjectArray4207 = objects;
                    else if (i == 1414) {
                        ((RSInterface2) class354).anObjectArray4262 = objects;
                        ((RSInterface2) class354).anIntArray4324 = is;
                    } else if (i == 1415) {
                        ((RSInterface2) class354).anObjectArray4246 = objects;
                        ((RSInterface2) class354).anIntArray4227 = is;
                    } else if (i == 1416)
                        ((RSInterface2) class354).anObjectArray4333 = objects;
                    else if (i == 1417)
                        ((RSInterface2) class354).anObjectArray4204 = objects;
                    else if (i == 1418)
                        ((RSInterface2) class354).anObjectArray4313 = objects;
                    else if (i == 1419)
                        ((RSInterface2) class354).anObjectArray4355 = objects;
                    else if (i == 1420)
                        ((RSInterface2) class354).anObjectArray4258 = objects;
                    else if (i == 1421)
                        ((RSInterface2) class354).anObjectArray4376 = objects;
                    else if (i == 1422)
                        ((RSInterface2) class354).anObjectArray4214 = objects;
                    else if (i == 1423)
                        ((RSInterface2) class354).anObjectArray4229 = objects;
                    else if (i == 1424)
                        ((RSInterface2) class354).anObjectArray4265 = objects;
                    else if (i == 1425)
                        ((RSInterface2) class354).anObjectArray4226 = objects;
                    else if (i == 1426)
                        ((RSInterface2) class354).anObjectArray4371 = objects;
                    else if (i == 1427)
                        ((RSInterface2) class354).anObjectArray4233 = objects;
                    else if (i == 1428) {
                        ((RSInterface2) class354).anObjectArray4267 = objects;
                        ((RSInterface2) class354).anIntArray4277 = is;
                    } else if (i == 1429) {
                        ((RSInterface2) class354).anObjectArray4225 = objects;
                        ((RSInterface2) class354).anIntArray4242 = is;
                    } else if (i == 1430)
                        ((RSInterface2) class354).anObjectArray4287 = objects;
                    ((RSInterface2) class354).maybeHasScripts = true;
                    return;
                }
                return;
            }
            if (i < 1600) {
                RSInterface2 class354 = bool ? aClass354_615 : aClass354_608;
                if (i == 1500) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4257;
                    return;
                }
                if (i == 1501) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4370;
                    return;
                }
                if (i == 1502) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4332;
                    return;
                }
                if (i == 1503) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4223;
                    return;
                }
                if (i == 1504) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).aBoolean4293 ? 1 : 0;
                    return;
                }
                if (i == 1505) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4300;
                    return;
                }
                if (i == 1506) {
                    RSInterface2 class354_323_ = Class141.method1283(false, class354);
                    anIntArray601[anInt613++] = (class354_323_ == null ? -1 : ((RSInterface2) class354_323_).interfaceValues);
                    return;
                }
            } else if (i < 1700) {
                RSInterface2 class354 = bool ? aClass354_615 : aClass354_608;
                if (i == 1600) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4261;
                    return;
                }
                if (i == 1601) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4271;
                    return;
                }
                if (i == 1602) {
                    aStringArray624[anInt605++] = ((RSInterface2) class354).aString4250;
                    return;
                }
                if (i == 1603) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4374;
                    return;
                }
                if (i == 1604) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4345;
                    return;
                }
                if (i == 1605) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4365;
                    return;
                }
                if (i == 1606) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4328;
                    return;
                }
                if (i == 1607) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4289;
                    return;
                }
                if (i == 1608) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4209;
                    return;
                }
                if (i == 1609) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4344;
                    return;
                }
                if (i == 1610) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4280;
                    return;
                }
                if (i == 1611) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4350;
                    return;
                }
                if (i == 1612) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4254;
                    return;
                }
                if (i == 1613) {
                    int i_324_ = anIntArray601[--anInt613];
                    Class210 class210 = Node_Sub20.aClass240_7045.method1923(-6119, i_324_);
                    if (class210.method1721(2147483647))
                        aStringArray624[anInt605++] = class354.method3776((((Class210) class210).aString2425), -93, i_324_);
                    else {
                        anIntArray601[anInt613++] = class354.method3757(0, i_324_, (((Class210) class210).anInt2430));
                        return;
                    }
                    return;
                }
                if (i == 1614) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4253;
                    return;
                }
                if (i == 2614) {
                    anIntArray601[anInt613++] = (((RSInterface2) class354).anInt4222 == 1 ? ((RSInterface2) class354).anInt4269 : -1);
                    return;
                }
            } else if (i < 1800) {
                RSInterface2 class354 = bool ? aClass354_615 : aClass354_608;
                if (i == 1700) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).id;
                    return;
                }
                if (i == 1701) {
                    if (((RSInterface2) class354).id != -1)
                        anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4263;
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 1702) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).index;
                    return;
                }
            } else if (i < 1900) {
                RSInterface2 class354 = bool ? aClass354_615 : aClass354_608;
                if (i == 1800) {
                    anIntArray601[anInt613++] = client.method113(class354).method2673(2);
                    return;
                }
                if (i == 1801) {
                    int i_325_ = anIntArray601[--anInt613];
                    i_325_--;
                    if (((RSInterface2) class354).aStringArray4375 == null || (i_325_ >= ((RSInterface2) class354).aStringArray4375.length) || (((RSInterface2) class354).aStringArray4375[i_325_] == null))
                        aStringArray624[anInt605++] = "";
                    else {
                        aStringArray624[anInt605++] = ((RSInterface2) class354).aStringArray4375[i_325_];
                        return;
                    }
                    return;
                }
                if (i == 1802) {
                    if (((RSInterface2) class354).aString4210 == null)
                        aStringArray624[anInt605++] = "";
                    else {
                        aStringArray624[anInt605++] = ((RSInterface2) class354).aString4210;
                        return;
                    }
                    return;
                }
            } else if (i < 2000 || i >= 2900 && i < 3000) {
                RSInterface2 class354;
                if (i >= 2000) {
                    class354 = Class276.method2853(65535, anIntArray601[--anInt613]);
                    i -= 1000;
                } else
                    class354 = bool ? aClass354_615 : aClass354_608;
                if (anInt627 >= 10)
                    throw new RuntimeException("C29xx-1");
                if (i == 1927) {
                    if (((RSInterface2) class354).anObjectArray4233 != null) {
                        RSInterface class248_sub6 = new RSInterface();
                        ((RSInterface) class248_sub6).rsInter = class354;
                        ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4233;
                        ((RSInterface) class248_sub6).anInt6842 = anInt627 + 1;
                        Class176.aClass293_2065.method3109(class248_sub6, -91);
                        return;
                    }
                    return;
                }
            } else if (i < 2600) {
                RSInterface2 class354 = Class276.method2853(65535, anIntArray601[--anInt613]);
                if (i == 2500) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4257;
                    return;
                }
                if (i == 2501) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4370;
                    return;
                }
                if (i == 2502) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4332;
                    return;
                }
                if (i == 2503) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4223;
                    return;
                }
                if (i == 2504) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).aBoolean4293 ? 1 : 0;
                    return;
                }
                if (i == 2505) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4300;
                    return;
                }
                if (i == 1506) {
                    RSInterface2 class354_326_ = Class141.method1283(false, class354);
                    anIntArray601[anInt613++] = (class354_326_ == null ? -1 : ((RSInterface2) class354_326_).interfaceValues);
                    return;
                }
            } else if (i < 2700) {
                RSInterface2 class354 = Class276.method2853(65535, anIntArray601[--anInt613]);
                if (i == 2600) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4261;
                    return;
                }
                if (i == 2601) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4271;
                    return;
                }
                if (i == 2602) {
                    aStringArray624[anInt605++] = ((RSInterface2) class354).aString4250;
                    return;
                }
                if (i == 2603) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4374;
                    return;
                }
                if (i == 2604) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4345;
                    return;
                }
                if (i == 2605) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4365;
                    return;
                }
                if (i == 2606) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4328;
                    return;
                }
                if (i == 2607) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4289;
                    return;
                }
                if (i == 2608) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4209;
                    return;
                }
                if (i == 2609) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4344;
                    return;
                }
                if (i == 2610) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4280;
                    return;
                }
                if (i == 2611) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4350;
                    return;
                }
                if (i == 2612) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4254;
                    return;
                }
                if (i == 2613) {
                    anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4253;
                    return;
                }
                if (i == 2614) {
                    anIntArray601[anInt613++] = (((RSInterface2) class354).anInt4222 == 1 ? ((RSInterface2) class354).anInt4269 : -1);
                    return;
                }
            } else if (i < 2800) {
                if (i == 2700) {
                    RSInterface2 class354 = Class276.method2853(65535, anIntArray601[--anInt613]);
                    anIntArray601[anInt613++] = ((RSInterface2) class354).id;
                    return;
                }
                if (i == 2701) {
                    RSInterface2 class354 = Class276.method2853(65535, anIntArray601[--anInt613]);
                    if (((RSInterface2) class354).id != -1)
                        anIntArray601[anInt613++] = ((RSInterface2) class354).anInt4263;
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 2702) {
                    int i_327_ = anIntArray601[--anInt613];
                    Node_Sub12 class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method501((long) i_327_, (byte) 31));
                    if (class248_sub12 != null)
                        anIntArray601[anInt613++] = 1;
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 2703) {
                    RSInterface2 class354 = Class276.method2853(65535, anIntArray601[--anInt613]);
                    if (((RSInterface2) class354).aClass354Array4285 == null)
                        anIntArray601[anInt613++] = 0;
                    else {
                        int i_328_ = ((RSInterface2) class354).aClass354Array4285.length;
                        for (int i_329_ = 0; i_329_ < (((RSInterface2) class354).aClass354Array4285).length; i_329_++) {
                            if ((((RSInterface2) class354).aClass354Array4285[i_329_]) == null) {
                                i_328_ = i_329_;
                                break;
                            }
                        }
                        anIntArray601[anInt613++] = i_328_;
                        return;
                    }
                    return;
                }
                if (i == 2704 || i == 2705) {
                    anInt613 -= 2;
                    int i_330_ = anIntArray601[anInt613];
                    int i_331_ = anIntArray601[anInt613 + 1];
                    Node_Sub12 class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method501((long) i_330_, (byte) 31));
                    if (class248_sub12 != null && (((Node_Sub12) class248_sub12).anInt6964 == i_331_))
                        anIntArray601[anInt613++] = 1;
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
            } else if (i < 2900) {
                RSInterface2 class354 = Class276.method2853(65535, anIntArray601[--anInt613]);
                if (i == 2800) {
                    anIntArray601[anInt613++] = client.method113(class354).method2673(2);
                    return;
                }
                if (i == 2801) {
                    int i_332_ = anIntArray601[--anInt613];
                    i_332_--;
                    if (((RSInterface2) class354).aStringArray4375 == null || (i_332_ >= ((RSInterface2) class354).aStringArray4375.length) || (((RSInterface2) class354).aStringArray4375[i_332_] == null))
                        aStringArray624[anInt605++] = "";
                    else {
                        aStringArray624[anInt605++] = ((RSInterface2) class354).aStringArray4375[i_332_];
                        return;
                    }
                    return;
                }
                if (i == 2802) {
                    if (((RSInterface2) class354).aString4210 == null)
                        aStringArray624[anInt605++] = "";
                    else {
                        aStringArray624[anInt605++] = ((RSInterface2) class354).aString4210;
                        return;
                    }
                    return;
                }
            } else if (i < 3200) {
                if (i == 3100) {
                    String string = aStringArray624[--anInt605];
                    Class119.method1120(string, false);
                    return;
                }
                if (i == 3101) {
                    anInt613 -= 2;
                    Class282_Sub16.method2989(anIntArray601[anInt613], anIntArray601[anInt613 + 1], Class347.myPlayer, (byte) -83);
                    return;
                }
                if (i == 3103) {
                    Class27.method255(true, (byte) 34);
                    return;
                }
                if (i == 3104) {
                    String string = aStringArray624[--anInt605];
                    int i_333_ = 0;
                    if (Class303.method3204(string, 10))
                        i_333_ = Class282_Sub21.method3012((byte) -120, string);
                    anInt621++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub8_Sub4.aOutgoingOpcode_8376));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, i_333_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    return;
                }
                if (i == 3105) {
                    String string = aStringArray624[--anInt605];
                    anInt604++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class346_Sub7_Sub5_Sub2.aOutgoingOpcode_10223));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-98, string.length() + 1);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -119);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    return;
                }
                if (i == 3106) {
                    String string = aStringArray624[--anInt605];
                    anInt614++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class85.aOutgoingOpcode_1043);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-116, string.length() + 1);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -90);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    return;
                }
                if (i == 3107) {
                    int i_334_ = anIntArray601[--anInt613];
                    String string = aStringArray624[--anInt605];
                    Class380.method3895(i_334_, 12102, string);
                    return;
                }
                if (i == 3108) {
                    anInt613 -= 3;
                    int i_335_ = anIntArray601[anInt613];
                    int i_336_ = anIntArray601[anInt613 + 1];
                    int i_337_ = anIntArray601[anInt613 + 2];
                    RSInterface2 class354 = Class276.method2853(65535, i_337_);
                    Class130.method1203(class354, i_335_, i_336_, -105);
                    return;
                }
                if (i == 3109) {
                    anInt613 -= 2;
                    int i_338_ = anIntArray601[anInt613];
                    int i_339_ = anIntArray601[anInt613 + 1];
                    RSInterface2 class354 = bool ? aClass354_615 : aClass354_608;
                    Class130.method1203(class354, i_338_, i_339_, -107);
                    return;
                }
                if (i == 3110) {
                    int i_340_ = anIntArray601[--anInt613];
                    anInt606++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class301_Sub3.aOutgoingOpcode_8446));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, i_340_);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    return;
                }
                if (i == 3111) {
                    anInt613 -= 2;
                    int i_341_ = anIntArray601[anInt613];
                    int i_342_ = anIntArray601[anInt613 + 1];
                    Node_Sub12 class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method501((long) i_341_, (byte) 31));
                    if (class248_sub12 != null)
                        Class106.method749(false, true, (((Node_Sub12) class248_sub12).anInt6964) != i_342_, class248_sub12);
                    Node_Sub8.method2022(3, i_342_, i_341_, (byte) 122, true);
                    return;
                }
                if (i == 3112) {
                    anInt613--;
                    int i_343_ = anIntArray601[anInt613];
                    Node_Sub12 class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method501((long) i_343_, (byte) 31));
                    if (class248_sub12 != null && ((Node_Sub12) class248_sub12).anInt6960 == 3)
                        Class106.method749(false, true, true, class248_sub12);
                    return;
                }
                if (i == 3113) {
                    Node_Sub14_Sub8.method2298(aStringArray624[--anInt605], 0);
                    return;
                }
                if (i == 3114) {
                    anInt613 -= 2;
                    int i_344_ = anIntArray601[anInt613];
                    int i_345_ = anIntArray601[anInt613 + 1];
                    String string = aStringArray624[--anInt605];
                    Class216.method1740(i_345_, string, "", (byte) -15, "", "", i_344_);
                    return;
                }
                if (i == 3115) {
                    anInt613 -= 11;
                    Class186[] class186s = Class136_Sub2.method1259(-1);
                    Class272[] class272s = Class359.method3805(-12865);
                    Class214.method1736(anIntArray601[anInt613 + 8], anIntArray601[anInt613 + 2], anIntArray601[anInt613 + 9], anIntArray601[anInt613 + 5], class186s[anIntArray601[anInt613]], class272s[anIntArray601[anInt613 + 1]], anIntArray601[anInt613 + 10], anIntArray601[anInt613 + 4], anIntArray601[anInt613 + 3], anIntArray601[anInt613 + 6], (byte) 90, anIntArray601[anInt613 + 7]);
                    return;
                }
            } else if (i < 3300) {
                if (i == 3200) {
                    anInt613 -= 3;
                    Node_Sub42_Sub1.method2630(256, (byte) -76, anIntArray601[anInt613], anIntArray601[anInt613 + 2], 255, (anIntArray601[anInt613 + 1]));
                    return;
                }
                if (i == 3201) {
                    Class269.method2807(anIntArray601[--anInt613], 50, -92, 255);
                    return;
                }
                if (i == 3202) {
                    anInt613 -= 2;
                    Node_Sub27.method2555(64, anIntArray601[anInt613], 255, anIntArray601[anInt613 + 1]);
                    return;
                }
                if (i == 3203) {
                    anInt613 -= 4;
                    Node_Sub42_Sub1.method2630(256, (byte) 39, anIntArray601[anInt613], anIntArray601[anInt613 + 2], anIntArray601[anInt613 + 3], (anIntArray601[anInt613 + 1]));
                    return;
                }
                if (i == 3204) {
                    anInt613 -= 3;
                    Class269.method2807(anIntArray601[anInt613], anIntArray601[anInt613 + 2], -121, anIntArray601[anInt613 + 1]);
                    return;
                }
                if (i == 3205) {
                    anInt613 -= 3;
                    Node_Sub27.method2555(64, anIntArray601[anInt613], anIntArray601[anInt613 + 2], anIntArray601[anInt613 + 1]);
                    return;
                }
                if (i == 3206) {
                    anInt613 -= 4;
                    Node_Sub39_Sub2.method2609(false, anIntArray601[anInt613 + 3], anIntArray601[anInt613 + 1], anIntArray601[anInt613], 256, false, (anIntArray601[anInt613 + 2]));
                    return;
                }
                if (i == 3207) {
                    anInt613 -= 4;
                    Node_Sub39_Sub2.method2609(false, anIntArray601[anInt613 + 3], anIntArray601[anInt613 + 1], anIntArray601[anInt613], 256, true, (anIntArray601[anInt613 + 2]));
                    return;
                }
                if (i == 3208) {
                    anInt613 -= 5;
                    Node_Sub42_Sub1.method2630(anIntArray601[anInt613 + 4], (byte) -115, anIntArray601[anInt613], anIntArray601[anInt613 + 2], anIntArray601[anInt613 + 3], (anIntArray601[anInt613 + 1]));
                    return;
                }
                if (i == 3209) {
                    anInt613 -= 5;
                    Node_Sub39_Sub2.method2609(false, anIntArray601[anInt613 + 3], anIntArray601[anInt613 + 1], anIntArray601[anInt613], anIntArray601[anInt613 + 4], false, (anIntArray601[anInt613 + 2]));
                    return;
                }
            } else if (i < 3400) {
                if (i == 3300) {
                    anIntArray601[anInt613++] = Node_Sub18.anInt7027;
                    return;
                }
                if (i == 3301) {
                    anInt613 -= 2;
                    int i_346_ = anIntArray601[anInt613];
                    int i_347_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = Class279_Sub2.method2895(i_346_, (byte) -66, i_347_, false);
                    return;
                }
                if (i == 3302) {
                    anInt613 -= 2;
                    int i_348_ = anIntArray601[anInt613];
                    int i_349_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = Class194.method1664(false, (byte) 92, i_348_, i_349_);
                    return;
                }
                if (i == 3303) {
                    anInt613 -= 2;
                    int i_350_ = anIntArray601[anInt613];
                    int i_351_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = Class242.method1933(false, i_350_, i_351_, -52);
                    return;
                }
                if (i == 3304) {
                    int i_352_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = (((Node_Sub8_Sub3) r_Sub2.aClass315_10275.method3282(i_352_, -4)).anInt8923);
                    return;
                }
                if (i == 3305) {
                    int i_353_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = Node_Sub14_Sub16.anIntArray9337[i_353_];
                    return;
                }
                if (i == 3306) {
                    int i_354_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = r_Sub2.anIntArray10286[i_354_];
                    return;
                }
                if (i == 3307) {
                    int i_355_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = Class9.anIntArray224[i_355_];
                    return;
                }
                if (i == 3308) {
                    int i_356_ = (((Interactable) Class347.myPlayer).plane);
                    int i_357_ = (((((Interactable) Class347.myPlayer).x) >> 9) + Class67.baseX);
                    int i_358_ = (((((Interactable) Class347.myPlayer).y) >> 9) + Class368.baseY);
                    anIntArray601[anInt613++] = (i_356_ << 28) + (i_357_ << 14) + i_358_;
                    return;
                }
                if (i == 3309) {
                    int i_359_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = i_359_ >> 14 & 0x3fff;
                    return;
                }
                if (i == 3310) {
                    int i_360_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = i_360_ >> 28;
                    return;
                }
                if (i == 3311) {
                    int i_361_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = i_361_ & 0x3fff;
                    return;
                }
                if (i == 3312) {
                    anIntArray601[anInt613++] = Class115.aBoolean4950 ? 1 : 0;
                    return;
                }
                if (i == 3313) {
                    anInt613 -= 2;
                    int i_362_ = anIntArray601[anInt613];
                    int i_363_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = Class279_Sub2.method2895(i_362_, (byte) -101, i_363_, true);
                    return;
                }
                if (i == 3314) {
                    anInt613 -= 2;
                    int i_364_ = anIntArray601[anInt613];
                    int i_365_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = Class194.method1664(true, (byte) -59, i_364_, i_365_);
                    return;
                }
                if (i == 3315) {
                    anInt613 -= 2;
                    int i_366_ = anIntArray601[anInt613];
                    int i_367_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = Class242.method1933(true, i_366_, i_367_, -56);
                    return;
                }
                if (i == 3316) {
                    if (Class226_Sub1_Sub1.anInt8801 >= 2)
                        anIntArray601[anInt613++] = Class226_Sub1_Sub1.anInt8801;
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3317) {
                    anIntArray601[anInt613++] = Class282_Sub21.anInt7817;
                    return;
                }
                if (i == 3318) {
                    anIntArray601[anInt613++] = (((WorldAddress) Class346_Sub7_Sub2_Sub4.aWorldAddress_10119).worldId);
                    return;
                }
                if (i == 3321) {
                    anIntArray601[anInt613++] = Class84_Sub5.anInt5430;
                    return;
                }
                if (i == 3322) {
                    anIntArray601[anInt613++] = Class296.anInt3458;
                    return;
                }
                if (i == 3323) {
                    if (Class7.anInt162 >= 5 && Class7.anInt162 <= 9)
                        anIntArray601[anInt613++] = 1;
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3324) {
                    if (Class7.anInt162 >= 5 && Class7.anInt162 <= 9)
                        anIntArray601[anInt613++] = Class7.anInt162;
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3325) {
                    anIntArray601[anInt613++] = Class229.aBoolean2580 ? 1 : 0;
                    return;
                }
                if (i == 3326) {
                    anIntArray601[anInt613++] = (((Player) Class347.myPlayer).anInt10546);
                    return;
                }
                if (i == 3327) {
                    anIntArray601[anInt613++] = ((((Player) Class347.myPlayer).aClass332_10549) != null && ((Class332) (((Player) Class347.myPlayer).aClass332_10549)).aBoolean3881) ? 1 : 0;
                    return;
                }
                if (i == 3329) {
                    anIntArray601[anInt613++] = Node_Sub8_Sub11.aBoolean8992 ? 1 : 0;
                    return;
                }
                if (i == 3330) {
                    int i_368_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = Class79.method575((byte) 56, false, i_368_);
                    return;
                }
                if (i == 3331) {
                    anInt613 -= 2;
                    int i_369_ = anIntArray601[anInt613];
                    int i_370_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = Class299.method3173((byte) 122, false, false, i_369_, i_370_);
                    return;
                }
                if (i == 3332) {
                    anInt613 -= 2;
                    int i_371_ = anIntArray601[anInt613];
                    int i_372_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = Class299.method3173((byte) 124, true, false, i_371_, i_372_);
                    return;
                }
                if (i == 3333) {
                    anIntArray601[anInt613++] = Class312.anInt3627;
                    return;
                }
                if (i == 3335) {
                    anIntArray601[anInt613++] = Class191.anInt4822;
                    return;
                }
                if (i == 3336) {
                    anInt613 -= 4;
                    int i_373_ = anIntArray601[anInt613];
                    int i_374_ = anIntArray601[anInt613 + 1];
                    int i_375_ = anIntArray601[anInt613 + 2];
                    int i_376_ = anIntArray601[anInt613 + 3];
                    i_373_ += i_374_ << 14;
                    i_373_ += i_375_ << 28;
                    i_373_ += i_376_;
                    anIntArray601[anInt613++] = i_373_;
                    return;
                }
                if (i == 3337) {
                    anIntArray601[anInt613++] = Node_Sub8_Sub5.anInt8930;
                    return;
                }
                if (i == 3338) {
                    anIntArray601[anInt613++] = Interactable.method3565((byte) -109);
                    return;
                }
                if (i == 3339) {
                    anIntArray601[anInt613++] = 0;
                    return;
                }
                if (i == 3340) {
                    anIntArray601[anInt613++] = Class172.aBoolean1997 ? 1 : 0;
                    return;
                }
                if (i == 3341) {
                    anIntArray601[anInt613++] = Class345.aBoolean4105 ? 1 : 0;
                    return;
                }
                if (i == 3342) {
                    anIntArray601[anInt613++] = Class46.aClass269_600.method2817((byte) -89);
                    return;
                }
                if (i == 3343) {
                    anIntArray601[anInt613++] = Class46.aClass269_600.method2809(91);
                    return;
                }
                if (i == 3344) {
                    aStringArray624[anInt605++] = Class228.method1827(108);
                    return;
                }
                if (i == 3345) {
                    aStringArray624[anInt605++] = Class31.method269(-83);
                    return;
                }
                if (i == 3346) {
                    anIntArray601[anInt613++] = Class146.method1311((byte) -94);
                    return;
                }
                if (i == 3347) {
                    anIntArray601[anInt613++] = Class21.anInt314;
                    return;
                }
                if (i == 3349) {
                    anIntArray601[anInt613++] = ((Entity) Class347.myPlayer).aClass109_10471.method759((byte) -76) >> 3;
                    return;
                }
            } else if (i < 3500) {
                if (i == 3400) {
                    anInt613 -= 2;
                    int i_377_ = anIntArray601[anInt613];
                    int i_378_ = anIntArray601[anInt613 + 1];
                    Class218 class218 = Class346_Sub7_Sub1_Sub2.aClass259_10206.method2758(i_377_, (byte) -55);
                    aStringArray624[anInt605++] = class218.method1750(44, i_378_);
                    return;
                }
                if (i == 3408) {
                    anInt613 -= 4;
                    int i_379_ = anIntArray601[anInt613];
                    int i_380_ = anIntArray601[anInt613 + 1];
                    int i_381_ = anIntArray601[anInt613 + 2];
                    int i_382_ = anIntArray601[anInt613 + 3];
                    Class218 class218 = Class346_Sub7_Sub1_Sub2.aClass259_10206.method2758(i_381_, (byte) -128);
                    if (((Class218) class218).aChar2502 != i_379_ || ((Class218) class218).aChar2493 != i_380_)
                        throw new RuntimeException("C3408-1 " + i_381_ + "-" + i_382_);
                    if (i_380_ == 115)
                        aStringArray624[anInt605++] = class218.method1750(56, i_382_);
                    else {
                        anIntArray601[anInt613++] = class218.method1744((byte) -123, i_382_);
                        return;
                    }
                    return;
                }
                if (i == 3409) {
                    anInt613 -= 3;
                    int i_383_ = anIntArray601[anInt613];
                    int i_384_ = anIntArray601[anInt613 + 1];
                    int i_385_ = anIntArray601[anInt613 + 2];
                    if (i_384_ == -1)
                        throw new RuntimeException("C3409-2");
                    Class218 class218 = Class346_Sub7_Sub1_Sub2.aClass259_10206.method2758(i_384_, (byte) -72);
                    if (((Class218) class218).aChar2493 != i_383_)
                        throw new RuntimeException("C3409-1");
                    anIntArray601[anInt613++] = class218.method1751(i_385_, 78) ? 1 : 0;
                    return;
                }
                if (i == 3410) {
                    int i_386_ = anIntArray601[--anInt613];
                    String string = aStringArray624[--anInt605];
                    if (i_386_ == -1)
                        throw new RuntimeException("C3410-2");
                    Class218 class218 = Class346_Sub7_Sub1_Sub2.aClass259_10206.method2758(i_386_, (byte) -60);
                    if (((Class218) class218).aChar2493 != 's')
                        throw new RuntimeException("C3410-1");
                    anIntArray601[anInt613++] = class218.method1745(string, 5) ? 1 : 0;
                    return;
                }
                if (i == 3411) {
                    int i_387_ = anIntArray601[--anInt613];
                    Class218 class218 = Class346_Sub7_Sub1_Sub2.aClass259_10206.method2758(i_387_, (byte) -119);
                    anIntArray601[anInt613++] = ((Class218) class218).aClass65_2501.method513((byte) 32);
                    return;
                }
            } else if (i < 3700) {
                if (i == 3600) {
                    if (Node_Sub14_Sub25.anInt9424 == 0)
                        anIntArray601[anInt613++] = -2;
                    else {
                        if (Node_Sub14_Sub25.anInt9424 == 1)
                            anIntArray601[anInt613++] = -1;
                        else {
                            anIntArray601[anInt613++] = client.anInt5226;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 3601) {
                    int i_388_ = anIntArray601[--anInt613];
                    if (Node_Sub14_Sub25.anInt9424 == 2 && i_388_ < client.anInt5226) {
                        aStringArray624[anInt605++] = Class282_Sub11.aStringArray7703[i_388_];
                        if (Class132.aStringArray1618[i_388_] != null)
                            aStringArray624[anInt605++] = Class132.aStringArray1618[i_388_];
                        else
                            aStringArray624[anInt605++] = "";
                    } else {
                        aStringArray624[anInt605++] = "";
                        aStringArray624[anInt605++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3602) {
                    int i_389_ = anIntArray601[--anInt613];
                    if (Node_Sub14_Sub25.anInt9424 == 2 && i_389_ < client.anInt5226)
                        anIntArray601[anInt613++] = Class286.anIntArray3372[i_389_];
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3603) {
                    int i_390_ = anIntArray601[--anInt613];
                    if (Node_Sub14_Sub25.anInt9424 == 2 && i_390_ < client.anInt5226)
                        anIntArray601[anInt613++] = Class346_Sub2.anIntArray8262[i_390_];
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3604) {
                    String string = aStringArray624[--anInt605];
                    int i_391_ = anIntArray601[--anInt613];
                    Class103.method729(i_391_, 1, string);
                    return;
                }
                if (i == 3605) {
                    String string = aStringArray624[--anInt605];
                    Class324.method3358((byte) -128, string);
                    return;
                }
                if (i == 3606) {
                    String string = aStringArray624[--anInt605];
                    Class235.method1848(string, (byte) -105);
                    return;
                }
                if (i == 3607) {
                    String string = aStringArray624[--anInt605];
                    Node.method1964(string, 92, false);
                    return;
                }
                if (i == 3608) {
                    String string = aStringArray624[--anInt605];
                    Class340_Sub5.method3457(28678, string);
                    return;
                }
                if (i == 3609) {
                    String string = aStringArray624[--anInt605];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
                        string = string.substring(7);
                    anIntArray601[anInt613++] = Class310_Sub1.method3261(string, 124) ? 1 : 0;
                    return;
                }
                if (i == 3610) {
                    int i_392_ = anIntArray601[--anInt613];
                    if (Node_Sub14_Sub25.anInt9424 == 2 && i_392_ < client.anInt5226)
                        aStringArray624[anInt605++] = Node_Sub19.aStringArray7039[i_392_];
                    else {
                        aStringArray624[anInt605++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3611) {
                    if (Node_Sub4.aString6836 != null)
                        aStringArray624[anInt605++] = Class318.method3311(Node_Sub4.aString6836, -1);
                    else {
                        aStringArray624[anInt605++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3612) {
                    if (Node_Sub4.aString6836 != null)
                        anIntArray601[anInt613++] = Class74.anInt963;
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3613) {
                    int i_393_ = anIntArray601[--anInt613];
                    if (Node_Sub4.aString6836 != null && i_393_ < Class74.anInt963)
                        aStringArray624[anInt605++] = (((Class211) Class30.aClass211Array375[i_393_]).aString2440);
                    else {
                        aStringArray624[anInt605++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3614) {
                    int i_394_ = anIntArray601[--anInt613];
                    if (Node_Sub4.aString6836 != null && i_394_ < Class74.anInt963)
                        anIntArray601[anInt613++] = (((Class211) Class30.aClass211Array375[i_394_]).anInt2447);
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3615) {
                    int i_395_ = anIntArray601[--anInt613];
                    if (Node_Sub4.aString6836 != null && i_395_ < Class74.anInt963)
                        anIntArray601[anInt613++] = (((Class211) Class30.aClass211Array375[i_395_]).aByte2444);
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3616) {
                    anIntArray601[anInt613++] = Class27.aByte364;
                    return;
                }
                if (i == 3617) {
                    String string = aStringArray624[--anInt605];
                    Class100.method714(-76, string);
                    return;
                }
                if (i == 3618) {
                    anIntArray601[anInt613++] = Class54_Sub1.aByte5333;
                    return;
                }
                if (i == 3619) {
                    String string = aStringArray624[--anInt605];
                    Class71.method538(false, string);
                    return;
                }
                if (i == 3620) {
                    Class371.method3857((byte) 17);
                    return;
                }
                if (i == 3621) {
                    if (Node_Sub14_Sub25.anInt9424 == 0)
                        anIntArray601[anInt613++] = -1;
                    else {
                        anIntArray601[anInt613++] = Node_Sub2_Sub3.anInt8854;
                        return;
                    }
                    return;
                }
                if (i == 3622) {
                    int i_396_ = anIntArray601[--anInt613];
                    if (Node_Sub14_Sub25.anInt9424 != 0 && i_396_ < Node_Sub2_Sub3.anInt8854) {
                        aStringArray624[anInt605++] = Class340_Sub7.aStringArray8181[i_396_];
                        if (Node_Sub14_Sub9.aStringArray9242[i_396_] != null)
                            aStringArray624[anInt605++] = Node_Sub14_Sub9.aStringArray9242[i_396_];
                        else
                            aStringArray624[anInt605++] = "";
                    } else {
                        aStringArray624[anInt605++] = "";
                        aStringArray624[anInt605++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3623) {
                    String string = aStringArray624[--anInt605];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
                        string = string.substring(7);
                    anIntArray601[anInt613++] = Class20.method231(127, string) ? 1 : 0;
                    return;
                }
                if (i == 3624) {
                    int i_397_ = anIntArray601[--anInt613];
                    if (Class30.aClass211Array375 != null && i_397_ < Class74.anInt963 && (((Class211) Class30.aClass211Array375[i_397_]).aString2441.equalsIgnoreCase(((Player) Class347.myPlayer).aString10550)))
                        anIntArray601[anInt613++] = 1;
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3625) {
                    if (Class226_Sub2.aString6665 != null)
                        aStringArray624[anInt605++] = Class226_Sub2.aString6665;
                    else {
                        aStringArray624[anInt605++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3626) {
                    int i_398_ = anIntArray601[--anInt613];
                    if (Node_Sub4.aString6836 != null && i_398_ < Class74.anInt963)
                        aStringArray624[anInt605++] = (((Class211) Class30.aClass211Array375[i_398_]).aString2436);
                    else {
                        aStringArray624[anInt605++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3627) {
                    int i_399_ = anIntArray601[--anInt613];
                    if (Node_Sub14_Sub25.anInt9424 == 2 && i_399_ >= 0 && i_399_ < client.anInt5226)
                        anIntArray601[anInt613++] = Node_Sub27.aBooleanArray7150[i_399_] ? 1 : 0;
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3628) {
                    String string = aStringArray624[--anInt605];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
                        string = string.substring(7);
                    anIntArray601[anInt613++] = Class308.method3232((byte) -85, string);
                    return;
                }
                if (i == 3629) {
                    anIntArray601[anInt613++] = Class340_Sub2.anInt8109;
                    return;
                }
                if (i == 3630) {
                    String string = aStringArray624[--anInt605];
                    Node.method1964(string, 92, true);
                    return;
                }
                if (i == 3631) {
                    int i_400_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = Class292.aBooleanArray3422[i_400_] ? 1 : 0;
                    return;
                }
                if (i == 3632) {
                    int i_401_ = anIntArray601[--anInt613];
                    if (Node_Sub4.aString6836 != null && i_401_ < Class74.anInt963)
                        aStringArray624[anInt605++] = (((Class211) Class30.aClass211Array375[i_401_]).aString2441);
                    else {
                        aStringArray624[anInt605++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3633) {
                    int i_402_ = anIntArray601[--anInt613];
                    if (Node_Sub14_Sub25.anInt9424 != 0 && i_402_ < Node_Sub2_Sub3.anInt8854)
                        aStringArray624[anInt605++] = Class54_Sub2.aStringArray5334[i_402_];
                    else {
                        aStringArray624[anInt605++] = "";
                        return;
                    }
                    return;
                }
            } else if (i < 4000) {
                if (i == 3903) {
                    int i_403_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = Class275_Sub2.aClass187Array8602[i_403_].method1630(-101);
                    return;
                }
                if (i == 3904) {
                    int i_404_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Class187) Class275_Sub2.aClass187Array8602[i_404_]).anInt2175;
                    return;
                }
                if (i == 3905) {
                    int i_405_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Class187) Class275_Sub2.aClass187Array8602[i_405_]).anInt2170;
                    return;
                }
                if (i == 3906) {
                    int i_406_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Class187) Class275_Sub2.aClass187Array8602[i_406_]).anInt2180;
                    return;
                }
                if (i == 3907) {
                    int i_407_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Class187) Class275_Sub2.aClass187Array8602[i_407_]).anInt2179;
                    return;
                }
                if (i == 3908) {
                    int i_408_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = ((Class187) Class275_Sub2.aClass187Array8602[i_408_]).anInt2172;
                    return;
                }
                if (i == 3910) {
                    int i_409_ = anIntArray601[--anInt613];
                    int i_410_ = Class275_Sub2.aClass187Array8602[i_409_].method1631(-1);
                    anIntArray601[anInt613++] = i_410_ == 0 ? 1 : 0;
                    return;
                }
                if (i == 3911) {
                    int i_411_ = anIntArray601[--anInt613];
                    int i_412_ = Class275_Sub2.aClass187Array8602[i_411_].method1631(-1);
                    anIntArray601[anInt613++] = i_412_ == 2 ? 1 : 0;
                    return;
                }
                if (i == 3912) {
                    int i_413_ = anIntArray601[--anInt613];
                    int i_414_ = Class275_Sub2.aClass187Array8602[i_413_].method1631(-1);
                    anIntArray601[anInt613++] = i_414_ == 5 ? 1 : 0;
                    return;
                }
                if (i == 3913) {
                    int i_415_ = anIntArray601[--anInt613];
                    int i_416_ = Class275_Sub2.aClass187Array8602[i_415_].method1631(-1);
                    anIntArray601[anInt613++] = i_416_ == 1 ? 1 : 0;
                    return;
                }
            } else if (i < 4100) {
                if (i == 4000) {
                    anInt613 -= 2;
                    int i_417_ = anIntArray601[anInt613];
                    int i_418_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = i_417_ + i_418_;
                    return;
                }
                if (i == 4001) {
                    anInt613 -= 2;
                    int i_419_ = anIntArray601[anInt613];
                    int i_420_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = i_419_ - i_420_;
                    return;
                }
                if (i == 4002) {
                    anInt613 -= 2;
                    int i_421_ = anIntArray601[anInt613];
                    int i_422_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = i_421_ * i_422_;
                    return;
                }
                if (i == 4003) {
                    anInt613 -= 2;
                    int i_423_ = anIntArray601[anInt613];
                    int i_424_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = i_423_ / i_424_;
                    return;
                }
                if (i == 4004) {
                    int i_425_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = (int) (Math.random() * (double) i_425_);
                    return;
                }
                if (i == 4005) {
                    int i_426_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = (int) (Math.random() * (double) (i_426_ + 1));
                    return;
                }
                if (i == 4006) {
                    anInt613 -= 5;
                    int i_427_ = anIntArray601[anInt613];
                    int i_428_ = anIntArray601[anInt613 + 1];
                    int i_429_ = anIntArray601[anInt613 + 2];
                    int i_430_ = anIntArray601[anInt613 + 3];
                    int i_431_ = anIntArray601[anInt613 + 4];
                    anIntArray601[anInt613++] = i_427_ + ((i_428_ - i_427_) * (i_431_ - i_429_) / (i_430_ - i_429_));
                    return;
                }
                if (i == 4007) {
                    anInt613 -= 2;
                    long l = (long) anIntArray601[anInt613];
                    long l_432_ = (long) anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = (int) (l + l * l_432_ / 100L);
                    return;
                }
                if (i == 4008) {
                    anInt613 -= 2;
                    int i_433_ = anIntArray601[anInt613];
                    int i_434_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = i_433_ | 1 << i_434_;
                    return;
                }
                if (i == 4009) {
                    anInt613 -= 2;
                    int i_435_ = anIntArray601[anInt613];
                    int i_436_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = i_435_ & -1 - (1 << i_436_);
                    return;
                }
                if (i == 4010) {
                    anInt613 -= 2;
                    int i_437_ = anIntArray601[anInt613];
                    int i_438_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = (i_437_ & 1 << i_438_) != 0 ? 1 : 0;
                    return;
                }
                if (i == 4011) {
                    anInt613 -= 2;
                    int i_439_ = anIntArray601[anInt613];
                    int i_440_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = i_439_ % i_440_;
                    return;
                }
                if (i == 4012) {
                    anInt613 -= 2;
                    int i_441_ = anIntArray601[anInt613];
                    int i_442_ = anIntArray601[anInt613 + 1];
                    if (i_441_ == 0)
                        anIntArray601[anInt613++] = 0;
                    else {
                        anIntArray601[anInt613++] = (int) Math.pow((double) i_441_, (double) i_442_);
                        return;
                    }
                    return;
                }
                if (i == 4013) {
                    anInt613 -= 2;
                    int i_443_ = anIntArray601[anInt613];
                    int i_444_ = anIntArray601[anInt613 + 1];
                    if (i_443_ == 0)
                        anIntArray601[anInt613++] = 0;
                    else {
                        if (i_444_ == 0)
                            anIntArray601[anInt613++] = 2147483647;
                        else {
                            anIntArray601[anInt613++] = (int) Math.pow((double) i_443_, 1.0 / (double) i_444_);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 4014) {
                    anInt613 -= 2;
                    int i_445_ = anIntArray601[anInt613];
                    int i_446_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = i_445_ & i_446_;
                    return;
                }
                if (i == 4015) {
                    anInt613 -= 2;
                    int i_447_ = anIntArray601[anInt613];
                    int i_448_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = i_447_ | i_448_;
                    return;
                }
                if (i == 4016) {
                    anInt613 -= 2;
                    int i_449_ = anIntArray601[anInt613];
                    int i_450_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = i_449_ < i_450_ ? i_449_ : i_450_;
                    return;
                }
                if (i == 4017) {
                    anInt613 -= 2;
                    int i_451_ = anIntArray601[anInt613];
                    int i_452_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = i_451_ > i_452_ ? i_451_ : i_452_;
                    return;
                }
                if (i == 4018) {
                    anInt613 -= 3;
                    long l = (long) anIntArray601[anInt613];
                    long l_453_ = (long) anIntArray601[anInt613 + 1];
                    long l_454_ = (long) anIntArray601[anInt613 + 2];
                    anIntArray601[anInt613++] = (int) (l * l_454_ / l_453_);
                    return;
                }
                if (i == 4019) {
                    anInt613 -= 2;
                    int i_455_ = anIntArray601[anInt613];
                    int i_456_ = anIntArray601[anInt613 + 1];
                    if (i_455_ > 700 || i_456_ > 700)
                        anIntArray601[anInt613++] = 256;
                    double d = ((Math.random() * (double) (i_456_ + i_455_) - (double) i_455_ + 800.0) / 100.0);
                    anIntArray601[anInt613++] = (int) (Math.pow(2.0, d) + 0.5);
                    return;
                }
            } else if (i < 4200) {
                if (i == 4100) {
                    String string = aStringArray624[--anInt605];
                    int i_457_ = anIntArray601[--anInt613];
                    aStringArray624[anInt605++] = string + i_457_;
                    return;
                }
                if (i == 4101) {
                    anInt605 -= 2;
                    String string = aStringArray624[anInt605];
                    String string_458_ = aStringArray624[anInt605 + 1];
                    aStringArray624[anInt605++] = string + string_458_;
                    return;
                }
                if (i == 4102) {
                    String string = aStringArray624[--anInt605];
                    int i_459_ = anIntArray601[--anInt613];
                    aStringArray624[anInt605++] = string + Node_Sub14_Sub1.method2280(i_459_, true, (byte) 127);
                    return;
                }
                if (i == 4103) {
                    String string = aStringArray624[--anInt605];
                    aStringArray624[anInt605++] = string.toLowerCase();
                    return;
                }
                if (i == 4104) {
                    aStringArray624[anInt605++] = Class293.method3122(Class191.anInt4822, (byte) 91, (Node_Sub42_Sub1.method2631(anIntArray601[--anInt613], -9320)));
                    return;
                }
                if (i == 4105) {
                    anInt605 -= 2;
                    String string = aStringArray624[anInt605];
                    String string_460_ = aStringArray624[anInt605 + 1];
                    if ((((Player) Class347.myPlayer).aClass332_10549) != null && ((Class332) (((Player) Class347.myPlayer).aClass332_10549)).aBoolean3881)
                        aStringArray624[anInt605++] = string_460_;
                    else {
                        aStringArray624[anInt605++] = string;
                        return;
                    }
                    return;
                }
                if (i == 4106) {
                    int i_461_ = anIntArray601[--anInt613];
                    aStringArray624[anInt605++] = Integer.toString(i_461_);
                    return;
                }
                if (i == 4107) {
                    anInt605 -= 2;
                    anIntArray601[anInt613++] = Class225_Sub1_Sub1.method1790((aStringArray624[anInt605]), Class191.anInt4822, 0, (aStringArray624[anInt605 + 1]));
                    return;
                }
                if (i == 4108) {
                    String string = aStringArray624[--anInt605];
                    anInt613 -= 2;
                    int i_462_ = anIntArray601[anInt613];
                    int i_463_ = anIntArray601[anInt613 + 1];
                    Class285 class285 = Class32.method273(0, -128, i_463_, Class168.aClass381_1972);
                    anIntArray601[anInt613++] = class285.method3066(string, (byte) -46, (Node_Sub14_Sub13.aClass129Array9290), i_462_);
                    return;
                }
                if (i == 4109) {
                    String string = aStringArray624[--anInt605];
                    anInt613 -= 2;
                    int i_464_ = anIntArray601[anInt613];
                    int i_465_ = anIntArray601[anInt613 + 1];
                    Class285 class285 = Class32.method273(0, -128, i_465_, Class168.aClass381_1972);
                    anIntArray601[anInt613++] = class285.method3070(string, -123, (Node_Sub14_Sub13.aClass129Array9290), i_464_);
                    return;
                }
                if (i == 4110) {
                    anInt605 -= 2;
                    String string = aStringArray624[anInt605];
                    String string_466_ = aStringArray624[anInt605 + 1];
                    if (anIntArray601[--anInt613] == 1)
                        aStringArray624[anInt605++] = string;
                    else {
                        aStringArray624[anInt605++] = string_466_;
                        return;
                    }
                    return;
                }
                if (i == 4111) {
                    String string = aStringArray624[--anInt605];
                    aStringArray624[anInt605++] = Node_Sub8_Sub14_Sub1.method2127(-40, string);
                    return;
                }
                if (i == 4112) {
                    String string = aStringArray624[--anInt605];
                    int i_467_ = anIntArray601[--anInt613];
                    if (i_467_ == -1)
                        throw new RuntimeException("null char");
                    aStringArray624[anInt605++] = string + (char) i_467_;
                    return;
                }
                if (i == 4113) {
                    int i_468_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = method348((char) i_468_);
                    return;
                }
                if (i == 4114) {
                    int i_469_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = Class136.method1250(65, (char) i_469_) ? 1 : 0;
                    return;
                }
                if (i == 4115) {
                    int i_470_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = (Exception_Sub1.method132((byte) -7, (char) i_470_) ? 1 : 0);
                    return;
                }
                if (i == 4116) {
                    int i_471_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = (Class136_Sub4.method1270((char) i_471_, (byte) -79) ? 1 : 0);
                    return;
                }
                if (i == 4117) {
                    String string = aStringArray624[--anInt605];
                    if (string != null)
                        anIntArray601[anInt613++] = string.length();
                    else {
                        anIntArray601[anInt613++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 4118) {
                    String string = aStringArray624[--anInt605];
                    anInt613 -= 2;
                    int i_472_ = anIntArray601[anInt613];
                    int i_473_ = anIntArray601[anInt613 + 1];
                    aStringArray624[anInt605++] = string.substring(i_472_, i_473_);
                    return;
                }
                if (i == 4119) {
                    String string = aStringArray624[--anInt605];
                    StringBuffer stringbuffer = new StringBuffer(string.length());
                    boolean bool_474_ = false;
                    for (int i_475_ = 0; i_475_ < string.length(); i_475_++) {
                        char c = string.charAt(i_475_);
                        if (c == '<')
                            bool_474_ = true;
                        else if (c == '>')
                            bool_474_ = false;
                        else if (!bool_474_)
                            stringbuffer.append(c);
                    }
                    aStringArray624[anInt605++] = stringbuffer.toString();
                    return;
                }
                if (i == 4120) {
                    String string = aStringArray624[--anInt605];
                    anInt613 -= 2;
                    int i_476_ = anIntArray601[anInt613];
                    int i_477_ = anIntArray601[anInt613 + 1];
                    anIntArray601[anInt613++] = string.indexOf(i_476_, i_477_);
                    return;
                }
                if (i == 4121) {
                    anInt605 -= 2;
                    String string = aStringArray624[anInt605];
                    String string_478_ = aStringArray624[anInt605 + 1];
                    int i_479_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = string.indexOf(string_478_, i_479_);
                    return;
                }
                if (i == 4122) {
                    int i_480_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = Character.toLowerCase((char) i_480_);
                    return;
                }
                if (i == 4123) {
                    int i_481_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = Character.toUpperCase((char) i_481_);
                    return;
                }
                if (i == 4124) {
                    boolean bool_482_ = anIntArray601[--anInt613] != 0;
                    int i_483_ = anIntArray601[--anInt613];
                    aStringArray624[anInt605++] = Class84_Sub9.method630((byte) -121, 0, (long) i_483_, Class191.anInt4822, bool_482_);
                    return;
                }
                if (i == 4125) {
                    String string = aStringArray624[--anInt605];
                    int i_484_ = anIntArray601[--anInt613];
                    Class285 class285 = Class32.method273(0, -127, i_484_, Class168.aClass381_1972);
                    anIntArray601[anInt613++] = class285.method3071(215, string, (Node_Sub14_Sub13.aClass129Array9290));
                    return;
                }
                if (i == 4126) {
                    aStringArray624[anInt605++] = Class250.method2708(Class191.anInt4822, true, ((long) anIntArray601[--anInt613] * 60000L));
                    return;
                }
            } else if (i < 4300) {
                if (i == 4200) {
                    int i_485_ = anIntArray601[--anInt613];
                    aStringArray624[anInt605++] = (((Class321) Class283.aClass342_3343.method3482((byte) 66, i_485_)).aString3702);
                    return;
                }
                if (i == 4201) {
                    anInt613 -= 2;
                    int i_486_ = anIntArray601[anInt613];
                    int i_487_ = anIntArray601[anInt613 + 1];
                    Class321 class321 = Class283.aClass342_3343.method3482((byte) 70, i_486_);
                    if (i_487_ >= 1 && i_487_ <= 5 && (((Class321) class321).aStringArray3704[i_487_ - 1] != null))
                        aStringArray624[anInt605++] = (((Class321) class321).aStringArray3704[i_487_ - 1]);
                    else {
                        aStringArray624[anInt605++] = "";
                        return;
                    }
                    return;
                }
                if (i == 4202) {
                    anInt613 -= 2;
                    int i_488_ = anIntArray601[anInt613];
                    int i_489_ = anIntArray601[anInt613 + 1];
                    Class321 class321 = Class283.aClass342_3343.method3482((byte) 67, i_488_);
                    if (i_489_ >= 1 && i_489_ <= 5 && (((Class321) class321).aStringArray3701[i_489_ - 1] != null))
                        aStringArray624[anInt605++] = (((Class321) class321).aStringArray3701[i_489_ - 1]);
                    else {
                        aStringArray624[anInt605++] = "";
                        return;
                    }
                    return;
                }
                if (i == 4203) {
                    int i_490_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = (((Class321) Class283.aClass342_3343.method3482((byte) 99, i_490_)).anInt3753);
                    return;
                }
                if (i == 4204) {
                    int i_491_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = (((Class321) Class283.aClass342_3343.method3482((byte) 100, i_491_)).anInt3771) == 1 ? 1 : 0;
                    return;
                }
                if (i == 4205) {
                    int i_492_ = anIntArray601[--anInt613];
                    Class321 class321 = Class283.aClass342_3343.method3482((byte) 126, i_492_);
                    if (((Class321) class321).anInt3747 == -1 && ((Class321) class321).anInt3732 >= 0)
                        anIntArray601[anInt613++] = ((Class321) class321).anInt3732;
                    else {
                        anIntArray601[anInt613++] = i_492_;
                        return;
                    }
                    return;
                }
                if (i == 4206) {
                    int i_493_ = anIntArray601[--anInt613];
                    Class321 class321 = Class283.aClass342_3343.method3482((byte) 89, i_493_);
                    if (((Class321) class321).anInt3747 >= 0 && ((Class321) class321).anInt3732 >= 0)
                        anIntArray601[anInt613++] = ((Class321) class321).anInt3732;
                    else {
                        anIntArray601[anInt613++] = i_493_;
                        return;
                    }
                    return;
                }
                if (i == 4207) {
                    int i_494_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = (((Class321) Class283.aClass342_3343.method3482((byte) 115, i_494_)).aBoolean3738) ? 1 : 0;
                    return;
                }
                if (i == 4208) {
                    anInt613 -= 2;
                    int i_495_ = anIntArray601[anInt613];
                    int i_496_ = anIntArray601[anInt613 + 1];
                    Class210 class210 = Node_Sub20.aClass240_7045.method1923(-6119, i_496_);
                    if (class210.method1721(2147483647))
                        aStringArray624[anInt605++] = (Class283.aClass342_3343.method3482((byte) 126, i_495_).method3338(((Class210) class210).aString2425, i_496_, 5));
                    else {
                        anIntArray601[anInt613++] = (Class283.aClass342_3343.method3482((byte) 96, i_495_).method3341(((Class210) class210).anInt2430, -1, i_496_));
                        return;
                    }
                    return;
                }
                if (i == 4209) {
                    anInt613 -= 2;
                    int i_497_ = anIntArray601[anInt613];
                    int i_498_ = anIntArray601[anInt613 + 1] - 1;
                    Class321 class321 = Class283.aClass342_3343.method3482((byte) 71, i_497_);
                    if (((Class321) class321).anInt3699 == i_498_)
                        anIntArray601[anInt613++] = ((Class321) class321).anInt3730;
                    else {
                        if (((Class321) class321).anInt3729 == i_498_)
                            anIntArray601[anInt613++] = ((Class321) class321).anInt3770;
                        else {
                            anIntArray601[anInt613++] = -1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 4210) {
                    String string = aStringArray624[--anInt605];
                    int i_499_ = anIntArray601[--anInt613];
                    Class49.method388(i_499_ == 1, string, (byte) 38);
                    anIntArray601[anInt613++] = Class346_Sub7_Sub2_Sub4.anInt10111;
                    return;
                }
                if (i == 4211) {
                    if (Class19.aShortArray305 == null || (Node_Sub21.anInt7054 >= Class346_Sub7_Sub2_Sub4.anInt10111))
                        anIntArray601[anInt613++] = -1;
                    else {
                        anIntArray601[anInt613++] = (Class19.aShortArray305[Node_Sub21.anInt7054++]) & 0xffff;
                        return;
                    }
                    return;
                }
                if (i == 4212) {
                    Node_Sub21.anInt7054 = 0;
                    return;
                }
                if (i == 4213) {
                    int i_500_ = anIntArray601[--anInt613];
                    anIntArray601[anInt613++] = (((Class321) Class283.aClass342_3343.method3482((byte) 76, i_500_)).anInt3778);
                    return;
                }
                if (i == 4214) {
                    String string = aStringArray624[--anInt605];
                    anInt613 -= 3;
                    int i_501_ = anIntArray601[anInt613];
                    int i_502_ = anIntArray601[anInt613 + 1];
                    int i_503_ = anIntArray601[anInt613 + 2];
                    Class343.method3500(255, string, i_502_, i_503_, i_501_ == 1);
                    anIntArray601[anInt613++] = Class346_Sub7_Sub2_Sub4.anInt10111;
                    return;
                }
                if (i == 4215) {
                    anInt605 -= 2;
                    anInt613 -= 2;
                    String string = aStringArray624[anInt605];
                    int i_504_ = anIntArray601[anInt613];
                    int i_505_ = anIntArray601[anInt613 + 1];
                    String string_506_ = aStringArray624[anInt605 + 1];
                    Class137.method1273(string_506_, i_504_ == 1, 126, i_505_, string);
                    anIntArray601[anInt613++] = Class346_Sub7_Sub2_Sub4.anInt10111;
                    return;
                }
            } else if (i < 4400) {
                if (i == 4300) {
                    anInt613 -= 2;
                    int i_507_ = anIntArray601[anInt613];
                    int i_508_ = anIntArray601[anInt613 + 1];
                    Class210 class210 = Node_Sub20.aClass240_7045.method1923(-6119, i_508_);
                    if (class210.method1721(2147483647))
                        aStringArray624[anInt605++] = (Class148.aClass119_5096.method1123(i_507_, 8881).method2739(i_508_, 0, ((Class210) class210).aString2425));
                    else {
                        anIntArray601[anInt613++] = (Class148.aClass119_5096.method1123(i_507_, 8881).method2744(-156, ((Class210) class210).anInt2430, i_508_));
                        return;
                    }
                    return;
                }
            } else if (i < 4500) {
                if (i == 4400) {
                    anInt613 -= 2;
                    int i_509_ = anIntArray601[anInt613];
                    int i_510_ = anIntArray601[anInt613 + 1];
                    Class210 class210 = Node_Sub20.aClass240_7045.method1923(-6119, i_510_);
                    if (class210.method1721(2147483647))
                        aStringArray624[anInt605++] = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -91, i_509_).method2794(((Class210) class210).aString2425, -88, i_510_));
                    else {
                        anIntArray601[anInt613++] = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -63, i_509_).method2789(-86, ((Class210) class210).anInt2430, i_510_));
                        return;
                    }
                    return;
                }
            } else if (i < 4600) {
                if (i == 4500) {
                    anInt613 -= 2;
                    int i_511_ = anIntArray601[anInt613];
                    int i_512_ = anIntArray601[anInt613 + 1];
                    Class210 class210 = Node_Sub20.aClass240_7045.method1923(-6119, i_512_);
                    if (class210.method1721(2147483647))
                        aStringArray624[anInt605++] = (ISAACCypher.aClass113_2193.method807(i_511_, (byte) 105).method2067(i_512_, (byte) -100, ((Class210) class210).aString2425));
                    else {
                        anIntArray601[anInt613++] = (ISAACCypher.aClass113_2193.method807(i_511_, (byte) -74).method2071(((Class210) class210).anInt2430, 0, i_512_));
                        return;
                    }
                    return;
                }
            } else if (i < 4700) {
                if (i == 4600) {
                    int i_513_ = anIntArray601[--anInt613];
                    Class281 class281 = Class301_Sub3_Sub1.aClass131_9974.method1213(-20408, i_513_);
                    if (((Class281) class281).anIntArray3289 != null && ((Class281) class281).anIntArray3289.length > 0) {
                        int i_514_ = 0;
                        int i_515_ = ((Class281) class281).anIntArray3298[0];
                        for (int i_516_ = 1; (i_516_ < ((Class281) class281).anIntArray3289.length); i_516_++) {
                            if (((Class281) class281).anIntArray3298[i_516_] > i_515_) {
                                i_514_ = i_516_;
                                i_515_ = (((Class281) class281).anIntArray3298[i_516_]);
                            }
                        }
                        anIntArray601[anInt613++] = ((Class281) class281).anIntArray3289[i_514_];
                    } else {
                        anIntArray601[anInt613++] = ((Class281) class281).anInt3301;
                        return;
                    }
                    return;
                }
            } else if (i < 4800) {
                if (i == 4700) {
                    anIntArray601[anInt613++] = Node_Sub8_Sub17.aBoolean9055 ? 1 : 0;
                    return;
                }
                if (i == 4701) {
                    String string = aStringArray624[--anInt605];
                    if (Class273.anInt5008 != 7 || Class321.loginStage != 0)
                        Class116_Sub1.aByte6279 = (byte) -5;
                    else {
                        if (string.length() > 20)
                            Class116_Sub1.aByte6279 = (byte) -4;
                        else {
                            Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class332.aOutgoingOpcode_3867));
                            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -111);
                            Class226_Sub3.method1814(class248_sub36, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 4702) {
                    anIntArray601[anInt613++] = Class116_Sub1.aByte6279;
                    Class116_Sub1.aByte6279 = (byte) -1;
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(i));
    }

    private static final void method353(int i) {
        RSInterface2 class354 = Class276.method2853(65535, i);
        if (class354 != null) {
            int i_517_ = i >>> 16;
            RSInterface2[] class354s = Node_Sub46.aClass354ArrayArray7379[i_517_];
            if (class354s == null) {
                RSInterface2[] class354s_518_ = (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_517_]);
                int i_519_ = class354s_518_.length;
                class354s = Node_Sub46.aClass354ArrayArray7379[i_517_] = new RSInterface2[i_519_];
                Class159.method1399(class354s_518_, 0, class354s, 0, class354s_518_.length);
            }
            int i_520_;
            for (i_520_ = 0; i_520_ < class354s.length; i_520_++) {
                if (class354s[i_520_] == class354)
                    break;
            }
            if (i_520_ < class354s.length) {
                Class159.method1399(class354s, 0, class354s, 1, i_520_);
                class354s[0] = class354;
            }
        }
    }

    static {
        aClass149Array612 = new Class149[50];
        anIntArrayArray611 = new int[5][5000];
        anIntArray623 = new int[5];
        aStringArray624 = new String[1000];
        anInt613 = 0;
        anInt625 = 0;
        aClass278_607 = new Class278(4);
        anInt627 = 0;
    }
}
