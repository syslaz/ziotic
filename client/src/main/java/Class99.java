/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Date;

final class Class99 {
    int anInt1264;
    int anInt1265;
    int anInt1266;
    static int anInt1267;
    int anInt1268;
    int anInt1269;
    int anInt1270;
    int anInt1271;
    int anInt1272;
    static int anInt1273;
    int anInt1274;
    static int anInt1275;
    int anInt1276;
    static String[][] aStringArrayArray1277 = {{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}};
    static int anInt1278;
    static int anInt1279 = 0;
    int anInt1280;
    int anInt1281;

    final boolean method709(Class99 class99_0_, int i) {
        anInt1267++;
        if (i != -15742)
            ((Class99) this).anInt1280 = -67;
        if (((Class99) class99_0_).anInt1271 == ((Class99) this).anInt1271 && ((Class99) class99_0_).anInt1266 == ((Class99) this).anInt1266 && ((((Class99) this).anInt1274 ^ 0xffffffff) == (((Class99) class99_0_).anInt1274 ^ 0xffffffff)))
            return true;
        return false;
    }

    static final void method710(String string, int i, boolean bool, Class174 class174, boolean bool_1_) {
        if (i != 0)
            anInt1279 = 110;
        anInt1275++;
        if (bool_1_) {
            if (Class174.aString2044.startsWith("win") && ((Class174) class174).aBoolean2039) {
                String string_2_ = null;
                if (Class158.anApplet1881 != null)
                    string_2_ = Class158.anApplet1881.getParameter("haveie6");
                if (string_2_ == null || !string_2_.equals("1")) {
                    Class322 class322 = Class351.method3744(0, class174, string, (byte) -128);
                    Class162_Sub2.aString6536 = string;
                    Node_Sub14_Sub38.aClass174_9582 = class174;
                    Class133.aClass322_5037 = class322;
                    return;
                }
            }
            if (Class174.aString2044.startsWith("mac")) {
                String string_3_ = null;
                if (Class158.anApplet1881 != null)
                    string_3_ = Class158.anApplet1881.getParameter("havefirefox");
                if (string_3_ != null && string_3_.equals("1") && bool) {
                    Class351.method3744(1, class174, string, (byte) -125);
                    return;
                }
            }
            Class351.method3744(2, class174, string, (byte) -126);
        } else
            Class351.method3744(3, class174, string, (byte) 61);
    }

    static final void method711(int i) {
        anInt1273++;
        if (i != 0)
            aStringArrayArray1277 = null;
        for (Node_Sub8_Sub9 class248_sub8_sub9 = ((Node_Sub8_Sub9) Node_Sub14_Sub27.aClass293_9440.method3119(2)); class248_sub8_sub9 != null; class248_sub8_sub9 = (Node_Sub8_Sub9) Node_Sub14_Sub27.aClass293_9440.method3107(i + -128)) {
            Class346_Sub7_Sub2_Sub2 class346_sub7_sub2_sub2 = (((Node_Sub8_Sub9) class248_sub8_sub9).aClass346_Sub7_Sub2_Sub2_8970);
            if ((((Class346_Sub7_Sub2_Sub2) class346_sub7_sub2_sub2).anInt10330 ^ 0xffffffff) <= (Node_Sub18.anInt7027 ^ 0xffffffff)) {
                if ((((Class346_Sub7_Sub2_Sub2) class346_sub7_sub2_sub2).anInt10368) <= Node_Sub18.anInt7027) {
                    class346_sub7_sub2_sub2.method3610(true);
                    if ((((Class346_Sub7_Sub2_Sub2) class346_sub7_sub2_sub2).anInt10349) > 0) {
                        Node_Sub10 class248_sub10 = ((Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) (-1 + (((Class346_Sub7_Sub2_Sub2) class346_sub7_sub2_sub2).anInt10349)), (byte) 31)));
                        if (class248_sub10 != null) {
                            NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                            if ((((Interactable) NPC).x ^ 0xffffffff) <= -1 && ((((Interactable) NPC).x ^ 0xffffffff) > (Node_Sub8_Sub4.anInt8360 * 512 ^ 0xffffffff)) && (((Interactable) NPC).y >= 0) && (((Interactable) NPC).y < 512 * Node_Sub22.anInt7074))
                                class346_sub7_sub2_sub2.method3609(((Interactable) NPC).x, ((Interactable) NPC).y, 0, ((Class353.method3753((((Interactable) NPC).y), (((Interactable) NPC).x), i ^ ~0x4f, ((Interactable) class346_sub7_sub2_sub2).plane)) - ((Class346_Sub7_Sub2_Sub2) class346_sub7_sub2_sub2).anInt10334), Node_Sub18.anInt7027);
                        }
                    }
                    if (((((Class346_Sub7_Sub2_Sub2) class346_sub7_sub2_sub2).anInt10349) ^ 0xffffffff) > -1) {
                        int i_4_ = (-((Class346_Sub7_Sub2_Sub2) class346_sub7_sub2_sub2).anInt10349 + -1);
                        Player player;
                        if (Class282_Sub29.anInt7896 != i_4_)
                            player = (Node_Sub32.aPlayerArray7197[i_4_]);
                        else
                            player = Class347.myPlayer;
                        if (player != null && (((Interactable) player).x) >= 0 && ((((Interactable) player).x) < 512 * Node_Sub8_Sub4.anInt8360) && (((Interactable) player).y) >= 0 && (Node_Sub22.anInt7074 * 512 > ((Interactable) player).y))
                            class346_sub7_sub2_sub2.method3609(((Interactable) player).x, ((Interactable) player).y, 0, ((Class353.method3753(((Interactable) player).y, ((Interactable) player).x, 127, (((Interactable) class346_sub7_sub2_sub2).plane))) + -((Class346_Sub7_Sub2_Sub2) class346_sub7_sub2_sub2).anInt10334), Node_Sub18.anInt7027);
                    }
                    class346_sub7_sub2_sub2.method3614(120, Class77.anInt998);
                    Class299.method3175(class346_sub7_sub2_sub2, true);
                }
            } else {
                class248_sub8_sub9.remove(true);
                class346_sub7_sub2_sub2.method3607(0);
            }
        }
    }

    static final void method712(long l, int i) {
        Node_Sub8_Sub9.aCalendar8968.setTime(new Date(l));
        if (i != -8474)
            method712(-108L, -127);
        anInt1278++;
    }

    public static void method713(boolean bool) {
        aStringArrayArray1277 = null;
        if (bool != true)
            aStringArrayArray1277 = null;
    }

    public Class99() {
        /* empty */
    }
}
