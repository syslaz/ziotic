/* Class248_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

import java.io.File;
import java.io.FileOutputStream;

final class Node_Sub38 extends Node {
    static Interactable[] aInteractableArray7263;
    static int anInt7264;
    int[] anIntArray7265;
    static int anInt7266;
    Class322[] aClass322Array7267;
    Class322[] aClass322Array7268;
    static int anInt7269;
    static int anInt7270;
    int[] anIntArray7271;
    int anInt7272;
    int[] anIntArray7273;
    byte[][][] aByteArrayArrayArray7274;
    int anInt7275;

    static final void method2595(int i) {
        if (i == 0) {
            anInt7270++;
            if ((Node_Sub14_Sub15.anInt9324 ^ 0xffffffff) >= -1)
                aa.aString104 = "";
            else {
                int i_0_ = 0;
                for (int i_1_ = 0; ((Class162.aStringArray1909.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff)); i_1_++) {
                    if ((Class162.aStringArray1909[i_1_].indexOf("--> ") ^ 0xffffffff) != 0 && Node_Sub14_Sub15.anInt9324 == ++i_0_) {
                        aa.aString104 = (Class162.aStringArray1909[i_1_].substring(Class162.aStringArray1909[i_1_].indexOf(">") - -2));
                        break;
                    }
                }
            }
        }
    }

    static final void method2596(boolean bool, boolean bool_2_, boolean bool_3_, String string) {
        anInt7264++;
        try {
            if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
                Class106.method750("commands - This command", (byte) 76);
                Class106.method750("cls - Clear console", (byte) 98);
                Class106.method750("displayfps - Toggle FPS and other information", (byte) 105);
                Class106.method750("renderer - Print graphics renderer information", (byte) 111);
                Class106.method750("heap - Print java memory information", (byte) 111);
                return;
            }
            if (string.equalsIgnoreCase("cls")) {
                Class291.anInt4742 = 0;
                Class32.anInt387 = 0;
                return;
            }
            if (string.equalsIgnoreCase("displayfps")) {
                Class75.aBoolean978 = !Class75.aBoolean978;
                if (!Class75.aBoolean978)
                    Class106.method750("FPS off", (byte) 117);
                else {
                    Class106.method750("FPS on", (byte) 74);
                    return;
                }
                return;
            }
            if (string.equals("renderer")) {
                Class167 class167 = Class287.aHa3381.c();
                Class106.method750(("Vendor: " + ((Class167) class167).anInt1953), (byte) 115);
                Class106.method750(("Name: " + ((Class167) class167).aString1951), (byte) 92);
                Class106.method750(("Version: " + ((Class167) class167).anInt1952), (byte) 95);
                Class106.method750(("Device: " + ((Class167) class167).aString1954), (byte) 124);
                Class106.method750(("Driver Version: " + ((Class167) class167).aLong1957), (byte) 101);
                return;
            }
            if (string.equals("heap")) {
                Class106.method750("Heap: " + Class75.anInt977 + "MB", (byte) 111);
                return;
            }
        } catch (Exception exception) {
            Class106.method750(Class41.aClass41_467.method301(Class191.anInt4822, (byte) -108), (byte) 100);
            return;
        }
        if (bool != false)
            method2597(37, 49, (byte) 79);
        if (s_Sub2.aClass339_7951 != Class18.aClass339_295 || (Class226_Sub1_Sub1.anInt8801 ^ 0xffffffff) <= -3) {
            if (string.equalsIgnoreCase("errortest"))
                throw new RuntimeException();
            if (string.equals("nativememerror"))
                throw new OutOfMemoryError("native(MPR");
            try {
                if (string.equalsIgnoreCase("printfps")) {
                    Class106.method750("FPS: " + Class17.anInt291, (byte) 117);
                    return;
                }
                if (string.equalsIgnoreCase("occlude")) {
                    Class346.aBoolean4120 = !Class346.aBoolean4120;
                    if (!Class346.aBoolean4120)
                        Class106.method750("Occlsion now off!", (byte) 117);
                    else {
                        Class106.method750("Occlsion now on!", (byte) 115);
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("fpson")) {
                    Class75.aBoolean978 = true;
                    Class106.method750("fps debug enabled", (byte) 127);
                    return;
                }
                if (string.equalsIgnoreCase("fpsoff")) {
                    Class75.aBoolean978 = false;
                    Class106.method750("fps debug disabled", (byte) 87);
                    return;
                }
                if (string.equals("systemmem")) {
                    try {
                        Class106.method750(("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + ((Node_Sub24) InputStream_Sub2.aClass248_Sub24_78).anInt7126 + "Mb"), (byte) 110);
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                    return;
                }
                if (string.equalsIgnoreCase("cleartext")) {
                    Class20.aClass360_308.method3813(0);
                    Class106.method750("Text coords cleared", (byte) 123);
                    return;
                }
                if (string.equalsIgnoreCase("gc")) {
                    Class263.method2773(-32492);
                    for (int i = 0; (i ^ 0xffffffff) > -11; i++)
                        System.gc();
                    Runtime runtime = Runtime.getRuntime();
                    int i = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                    Class106.method750("mem=" + i + "k", (byte) 102);
                    return;
                }
                if (string.equalsIgnoreCase("compact")) {
                    Class263.method2773(-32492);
                    for (int i = 0; i < 10; i++)
                        System.gc();
                    Runtime runtime = Runtime.getRuntime();
                    int i = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                    Class106.method750("Memory before cleanup=" + i + "k", (byte) 99);
                    Class233.method1843((byte) 85);
                    Class263.method2773(-32492);
                    for (int i_4_ = 0; i_4_ < 10; i_4_++)
                        System.gc();
                    i = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                    Class106.method750("Memory after cleanup=" + i + "k", (byte) 117);
                    return;
                }
                if (string.equalsIgnoreCase("unloadnatives")) {
                    Class106.method750((!Class171.method1551(-25) ? "Library unloading failed!" : "Libraries unloaded"), (byte) 111);
                    return;
                }
                if (string.equalsIgnoreCase("clientdrop")) {
                    Class106.method750("Dropped client connection", (byte) 83);
                    if ((Class273.anInt5008 ^ 0xffffffff) != -11) {
                        if ((Class273.anInt5008 ^ 0xffffffff) == -12)
                            Player.aBoolean10544 = true;
                    } else
                        Class282_Sub2.method2929(16384);
                    return;
                }
                if (string.equalsIgnoreCase("rotateconnectmethods")) {
                    Class346_Sub7_Sub2_Sub4.aWorldAddress_10119.method679((byte) 67);
                    Class106.method750("Rotated connection methods", (byte) 102);
                    return;
                }
                if (string.equalsIgnoreCase("clientjs5drop")) {
                    Class282_Sub5.aClass323_7634.method3344((byte) -121);
                    Class106.method750("Dropped client js5 net queue", (byte) 107);
                    return;
                }
                if (string.equalsIgnoreCase("serverjs5drop")) {
                    Class282_Sub5.aClass323_7634.method3347(1);
                    Class106.method750("Dropped server js5 net queue", (byte) 100);
                    return;
                }
                if (string.equalsIgnoreCase("breakcon")) {
                    Node_Sub14_Sub15.aClass174_9328.method1577(-118);
                    Class289.aClass111_3398.method779(-3200);
                    Class282_Sub5.aClass323_7634.method3345((byte) 70);
                    Class106.method750("Breaking new connections for 5 seconds", (byte) 102);
                    return;
                }
                if (string.equalsIgnoreCase("rebuild")) {
                    Node_Sub14_Sub32.method2371((byte) -78);
                    Class131.method1215(-31736);
                    Class106.method750("Rebuilding map", (byte) 117);
                    return;
                }
                if (string.equalsIgnoreCase("rebuildprofile")) {
                    Class226_Sub1_Sub1.aLong8805 = Class118.method1112(116);
                    Class325.aBoolean3831 = true;
                    Node_Sub14_Sub32.method2371((byte) -113);
                    Class131.method1215(-31736);
                    Class106.method750("Rebuilding map (with profiling)", (byte) 79);
                    return;
                }
                if (string.equalsIgnoreCase("wm1")) {
                    Class138.method1274(false, 1, -1, -1, -1);
                    if (Class346_Sub7_Sub3.method3672((byte) -112) == 1)
                        Class106.method750("wm1 succeeded", (byte) 99);
                    else {
                        Class106.method750("wm1 failed", (byte) 96);
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("wm2")) {
                    Class138.method1274(false, 2, -1, -1, -1);
                    if (Class346_Sub7_Sub3.method3672((byte) -112) == 2)
                        Class106.method750("wm2 succeeded", (byte) 118);
                    else {
                        Class106.method750("wm2 failed", (byte) 125);
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("wm3")) {
                    Class138.method1274(false, 3, 768, 1024, -1);
                    if (Class346_Sub7_Sub3.method3672((byte) -112) == 3)
                        Class106.method750("wm3 succeeded", (byte) 100);
                    else {
                        Class106.method750("wm3 failed", (byte) 124);
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk0")) {
                    Node_Sub15_Sub5.method2495(false, 65, 0);
                    if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) != 0)
                        Class106.method750("Failed to enter tk0", (byte) 97);
                    else {
                        Class106.method750("Entered tk0", (byte) 125);
                        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322), (byte) -71, 0);
                        Class293.method3113(17458);
                        Class37.aBoolean408 = false;
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk1")) {
                    Node_Sub15_Sub5.method2495(false, 89, 1);
                    if ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) ^ 0xffffffff) == -2) {
                        Class106.method750("Entered tk1", (byte) 90);
                        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322), (byte) -71, 1);
                        Class293.method3113(17458);
                        Class37.aBoolean408 = false;
                    } else {
                        Class106.method750("Failed to enter tk1", (byte) 83);
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk2")) {
                    Node_Sub15_Sub5.method2495(false, 118, 2);
                    if ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) ^ 0xffffffff) == -3) {
                        Class106.method750("Entered tk2", (byte) 92);
                        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322), (byte) -71, 2);
                        Class293.method3113(17458);
                        Class37.aBoolean408 = false;
                    } else {
                        Class106.method750("Failed to enter tk2", (byte) 96);
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk3")) {
                    Node_Sub15_Sub5.method2495(false, -103, 3);
                    if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) != 3)
                        Class106.method750("Failed to enter tk3", (byte) 119);
                    else {
                        Class106.method750("Entered tk3", (byte) 79);
                        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322), (byte) -71, 3);
                        Class293.method3113(17458);
                        Class37.aBoolean408 = false;
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk5")) {
                    Node_Sub15_Sub5.method2495(false, 99, 5);
                    if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) != 5)
                        Class106.method750("Failed to enter tk5", (byte) 127);
                    else {
                        Class106.method750("Entered tk5", (byte) 91);
                        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322), (byte) -71, 5);
                        Class293.method3113(17458);
                        Class37.aBoolean408 = false;
                        return;
                    }
                    return;
                }
                if (string.startsWith("setba")) {
                    if ((string.length() ^ 0xffffffff) > -7)
                        Class106.method750("Invalid buildarea value", (byte) 126);
                    else {
                        int i = Class282_Sub21.method3012((byte) -113, string.substring(6));
                        if (i < 0 || i > Class58.method458(Class75.anInt977, 108))
                            Class106.method750("Invalid buildarea value", (byte) 110);
                        else {
                            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub20_7336), (byte) -71, i);
                            Class293.method3113(17458);
                            Class37.aBoolean408 = false;
                            Class106.method750(("maxbuildarea=" + ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub20_7336.method3003(!bool)), (byte) 124);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (string.startsWith("rect_debug")) {
                    if (string.length() < 10)
                        Class106.method750("Invalid rect_debug value", (byte) 113);
                    else {
                        Class339.anInt3947 = Class282_Sub21.method3012((byte) -122, string.substring(10).trim());
                        Class106.method750("rect_debug=" + Class339.anInt3947, (byte) 106);
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("qa_op_test")) {
                    Class332.aBoolean3874 = true;
                    Class106.method750("qa_op_test=" + Class332.aBoolean3874, (byte) 100);
                    return;
                }
                if (string.equalsIgnoreCase("clipcomponents")) {
                    za_Sub1.aBoolean9799 = !za_Sub1.aBoolean9799;
                    Class106.method750(("clipcomponents=" + za_Sub1.aBoolean9799), (byte) 106);
                    return;
                }
                if (string.startsWith("bloom")) {
                    boolean bool_5_ = Class287.aHa3381.q();
                    if (Class310.method3241(27, !bool_5_)) {
                        if (!bool_5_)
                            Class106.method750("Bloom enabled", (byte) 87);
                        else
                            Class106.method750("Bloom disabled", (byte) 85);
                    } else {
                        Class106.method750("Failed to enable bloom", (byte) 87);
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tween")) {
                    if (Node_Sub8_Sub2.aBoolean8918) {
                        Node_Sub8_Sub2.aBoolean8918 = false;
                        Class106.method750("Forced tweening disabled.", (byte) 98);
                    } else {
                        Node_Sub8_Sub2.aBoolean8918 = true;
                        Class106.method750("Forced tweening ENABLED!", (byte) 101);
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("shiftclick")) {
                    if (Class44_Sub1.aBoolean5292) {
                        Class106.method750("Shift-click disabled.", (byte) 112);
                        Class44_Sub1.aBoolean5292 = false;
                    } else {
                        Class106.method750("Shift-click ENABLED!", (byte) 90);
                        Class44_Sub1.aBoolean5292 = true;
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("getcgcoord")) {
                    Class106.method750(("x:" + ((((Interactable) Class347.myPlayer).x) >> -1634705495) + " z:" + ((((Interactable) Class347.myPlayer).y) >> 191132777)), (byte) 125);
                    return;
                }
                if (string.equalsIgnoreCase("getheight")) {
                    Class106.method750(("Height: " + (Class177.aSArray2070[(((Interactable) (Class347.myPlayer)).plane)].method3145((((Interactable) Class347.myPlayer).x) >> 869832457, 62, (((Interactable) Class347.myPlayer).y) >> -1979792599))), (byte) 125);
                    return;
                }
                if (string.equalsIgnoreCase("resetminimap")) {
                    Class290.aClass381_3417.method3905(0);
                    Class290.aClass381_3417.method3912(0);
                    Class19.aClass39_302.method291(3);
                    Node_Sub3.aClass257_6827.method2755(0);
                    Class131.method1215(-31736);
                    Class106.method750("Minimap reset", (byte) 107);
                    return;
                }
                if (string.startsWith("mc")) {
                    if (Class287.aHa3381.v()) {
                        int i = Integer.parseInt(string.substring(3));
                        if (i < 1)
                            i = 1;
                        else if ((i ^ 0xffffffff) < -5)
                            i = 4;
                        Class175.anInt2055 = i;
                        Node_Sub14_Sub32.method2371((byte) -31);
                        Class106.method750(("Render cores now: " + Class175.anInt2055), (byte) 107);
                    } else {
                        Class106.method750("Current toolkit doesn't support multiple cores", (byte) 105);
                        return;
                    }
                    return;
                }
                if (string.startsWith("cachespace")) {
                    Class106.method750(("I(s): " + Class141.aClass278_5052.method2868(-6) + "/" + Class141.aClass278_5052.method2870(bool)), (byte) 75);
                    Class106.method750(("I(m): " + Node_Sub14_Sub24.aClass278_9410.method2868(-40) + "/" + Node_Sub14_Sub24.aClass278_9410.method2870(bool)), (byte) 97);
                    Class106.method750(("O(s): " + ((Class342) Class283.aClass342_3343).aClass219_4005.method1762(2) + "/" + ((Class342) Class283.aClass342_3343).aClass219_4005.method1760(76)), (byte) 100);
                    return;
                }
                if (string.equalsIgnoreCase("getcamerapos")) {
                    Class106.method750(("Pos: " + (((Interactable) Class347.myPlayer).plane) + "," + (Class67.baseX + (Class346_Sub7_Sub1.cameraPosX >> -956742199) >> -57950842) + "," + (Class368.baseY + (Class316_Sub1_Sub2.cameraPosZ >> 1398303113) >> -126954170) + "," + (0x3f & Class67.baseX + (Class346_Sub7_Sub1.cameraPosX >> 2021224105)) + "," + (0x3f & (Class316_Sub1_Sub2.cameraPosZ >> 112354761) - -Class368.baseY) + " Height: " + ((Class353.method3753(Class316_Sub1_Sub2.cameraPosZ, Class346_Sub7_Sub1.cameraPosX, -68, (((Interactable) Class347.myPlayer).plane))) - InputStream_Sub1.cameraPosY)), (byte) 83);
                    Class106.method750(("Look: " + (((Interactable) Class347.myPlayer).plane) + "," + (Class1.cameraXMovement + Class67.baseX >> 1341002758) + "," + (Class281.cameraZMovement + Class368.baseY >> 1951917574) + "," + (Class67.baseX + Class1.cameraXMovement & 0x3f) + "," + (Class368.baseY + Class281.cameraZMovement & 0x3f) + " Height: " + ((Class353.method3753(Class281.cameraZMovement, Class1.cameraXMovement, 126, (((Interactable) Class347.myPlayer).plane))) - Class84_Sub2.cameraMovementY)), (byte) 76);
                    return;
                }
                if (string.equals("renderprofile") || string.equals("rp")) {
                    ha_Sub3_Sub1.aBoolean8718 = !ha_Sub3_Sub1.aBoolean8718;
                    Class287.aHa3381.a(ha_Sub3_Sub1.aBoolean8718);
                    Class282_Sub28.method3043(-124);
                    Class106.method750(("showprofiling=" + ha_Sub3_Sub1.aBoolean8718), (byte) 89);
                    return;
                }
                if (string.startsWith("performancetest")) {
                    int i = -1;
                    int i_6_ = 1000;
                    if ((string.length() ^ 0xffffffff) < -16) {
                        String[] strings = Class80.method583(31, string, ' ');
                        try {
                            if ((strings.length ^ 0xffffffff) < -2)
                                i_6_ = Integer.parseInt(strings[1]);
                        } catch (Throwable throwable) {
                            /* empty */
                        }
                        try {
                            if ((strings.length ^ 0xffffffff) < -3)
                                i = Integer.parseInt(strings[2]);
                        } catch (Throwable throwable) {
                            /* empty */
                        }
                    }
                    if ((i ^ 0xffffffff) != 0)
                        Class106.method750(("Performance: " + Class330.method3378(i, true, i_6_)), (byte) 107);
                    else {
                        Class106.method750(("Java toolkit: " + Class330.method3378(0, true, i_6_)), (byte) 94);
                        Class106.method750(("SSE toolkit:  " + Class330.method3378(2, !bool, i_6_)), (byte) 99);
                        Class106.method750(("D3D toolkit:  " + Class330.method3378(3, true, i_6_)), (byte) 110);
                        Class106.method750(("GL toolkit:   " + Class330.method3378(1, true, i_6_)), (byte) 86);
                        Class106.method750(("GLX toolkit:  " + Class330.method3378(5, !bool, i_6_)), (byte) 111);
                        return;
                    }
                    return;
                }
                if (string.equals("nonpcs")) {
                    r.aBoolean9031 = !r.aBoolean9031;
                    Class106.method750("nonpcs=" + r.aBoolean9031, (byte) 84);
                    return;
                }
                if (string.equals("autoworld")) {
                    Node_Sub14_Sub22.method2344(4096);
                    Class106.method750("auto world selected", (byte) 121);
                    return;
                }
                if (string.startsWith("switchworld")) {
                    int i = Integer.parseInt(string.substring(12));
                    Node_Sub14_Sub17.method2327((byte) -47, (((Class147_Sub1) Node_Sub14_Sub34.method2378(-3652, i)).aString6284), i);
                    Class106.method750("switched", (byte) 99);
                    return;
                }
                if (string.equals("getworld")) {
                    Class106.method750("w: " + ((WorldAddress) (Class346_Sub7_Sub2_Sub4.aWorldAddress_10119)).worldId, (byte) 97);
                    return;
                }
                if (string.startsWith("pc")) {
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub4.aOutgoingOpcode_6832));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-76, 0);
                    int i = (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
                    int i_7_ = string.indexOf(" ", 4);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string.substring(3, i_7_), (byte) -82);
                    Class166.method1537((byte) -98, (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257), string.substring(i_7_));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2216(-20198, (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset) - i);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    return;
                }
                if (string.equals("savevarcs")) {
                    Class94.method691((byte) -99);
                    Class106.method750("perm varcs saved", (byte) 87);
                    return;
                }
                if (string.equals("scramblevarcs")) {
                    for (int i = 0; i < Class357.anIntArray4417.length; i++) {
                        if (Class215.aBooleanArray2477[i]) {
                            Class357.anIntArray4417[i] = (int) (Math.random() * 99999.0);
                            if (Math.random() > 0.5)
                                Class357.anIntArray4417[i] *= -1;
                        }
                    }
                    Class94.method691((byte) -99);
                    Class106.method750("perm varcs scrambled", (byte) 122);
                    return;
                }
                if (string.equals("showcolmap")) {
                    Node_Sub14_Sub29.aBoolean9469 = true;
                    Class131.method1215(-31736);
                    Class106.method750("colmap is shown", (byte) 114);
                    return;
                }
                if (string.equals("hidecolmap")) {
                    Node_Sub14_Sub29.aBoolean9469 = false;
                    Class131.method1215(-31736);
                    Class106.method750("colmap is hidden", (byte) 110);
                    return;
                }
                if (string.equals("resetcache")) {
                    Node_Sub14_Sub35.method2379(true);
                    Class106.method750("Caches reset", (byte) 102);
                    return;
                }
                if (string.equals("profilecpu")) {
                    Class106.method750((String.valueOf(Interactable.method3565((byte) -117)) + "ms"), (byte) 114);
                    return;
                }
                if (string.startsWith("getclientvarpbit")) {
                    int i = Integer.parseInt(string.substring(17));
                    Class106.method750(("varpbit=" + Node_Sub43.aClass291_7306.method10(i, (byte) -127)), (byte) 109);
                    return;
                }
                if (string.startsWith("getclientvarp")) {
                    int i = Integer.parseInt(string.substring(14));
                    Class106.method750("varp=" + Node_Sub43.aClass291_7306.method11(i, (byte) 112), (byte) 91);
                    return;
                }
                if (string.startsWith("directlogin")) {
                    String[] strings = Class80.method583(26, string.substring(12), ' ');
                    if ((strings.length ^ 0xffffffff) <= -3) {
                        int i = ((strings.length ^ 0xffffffff) >= -3 ? 0 : Integer.parseInt(strings[2]));
                        Class112_Sub3.method803(strings[0], strings[1], 123, i);
                        return;
                    }
                }
                if (string.startsWith("csprofileclear")) {
                    Class47.method349();
                    return;
                }
                if (string.startsWith("csprofileoutputc")) {
                    Class47.method340(100, false);
                    return;
                }
                if (string.startsWith("csprofileoutputt")) {
                    Class47.method340(10, true);
                    return;
                }
                if (string.startsWith("texsize")) {
                    int i = Integer.parseInt(string.substring(8));
                    Class287.aHa3381.b(i);
                    return;
                }
                if (string.equals("soundstreamcount")) {
                    Class106.method750(("Active streams: " + Class282_Sub15.aClass248_Sub15_Sub3_7751.method2486()), (byte) 116);
                    return;
                }
                if (string.equals("autosetup")) {
                    Class249_Sub2.method2704((byte) 53);
                    Class106.method750(("Complete. Toolkit now: " + ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub15_7358.method2984(true)), (byte) 97);
                    return;
                }
                if (string.equals("errormessage")) {
                    Class106.method750(Node_Sub8_Sub16_Sub1.aClient10301.method95(75), (byte) 77);
                    return;
                }
                if (string.equals("heapdump")) {
                    if (!Class174.aString2044.startsWith("win"))
                        Class338.method3425(0, false, new File("/tmp/heap.dump"));
                    else
                        Class338.method3425(0, false, new File("C:\\Temp\\heap.dump"));
                    Class106.method750("Done", (byte) 97);
                    return;
                }
                if (string.equals("os")) {
                    Class106.method750("Name: " + Class174.aString2044, (byte) 123);
                    Class106.method750("Arch: " + Class174.aString2028, (byte) 84);
                    Class106.method750("Ver: " + Class174.aString2045, (byte) 120);
                    return;
                }
                if (string.startsWith("w2debug")) {
                    int i = Integer.parseInt(string.substring(8, 9));
                    Class366.anInt4495 = i;
                    Node_Sub14_Sub32.method2371((byte) 5);
                    Class106.method750("Toggled!", (byte) 89);
                    return;
                }
                if (string.startsWith("ortho ")) {
                    int i = string.indexOf(' ');
                    if (i < 0)
                        Class106.method750("Syntax: ortho <n>", (byte) 75);
                    else {
                        int i_8_ = Class282_Sub21.method3012((byte) -116, string.substring(1 + i));
                        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub21_7315), (byte) -71, i_8_);
                        Class293.method3113(17458);
                        Class37.aBoolean408 = false;
                        Node_Sub8_Sub15.method2130((byte) -114);
                        if (i_8_ == ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub21_7315.method3010(!bool))
                            Class106.method750("Successfully changed ortho mode", (byte) 99);
                        else {
                            Class106.method750("Failed to change ortho mode", (byte) 124);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (string.startsWith("orthozoom ")) {
                    if ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub21_7315.method3010(!bool) ^ 0xffffffff) == -1)
                        Class106.method750("enable ortho mode first (use 'ortho <n>')", (byte) 86);
                    else {
                        int i = (Class282_Sub21.method3012((byte) -119, string.substring(string.indexOf(' ') + 1)));
                        ObjectDefinition.anInt3041 = i;
                        Class106.method750("orthozoom=" + ObjectDefinition.anInt3041, (byte) 91);
                        return;
                    }
                    return;
                }
                if (string.startsWith("orthotilesize ")) {
                    int i = (Class282_Sub21.method3012((byte) -119, string.substring(1 + string.indexOf(' '))));
                    Class120.anInt1512 = Node_Sub35.anInt7251 = i;
                    Class106.method750("ortho tile size=" + i, (byte) 97);
                    Node_Sub8_Sub15.method2130((byte) -114);
                    return;
                }
                if (string.equals("orthocamlock")) {
                    Class98.aBoolean1261 = !Class98.aBoolean1261;
                    Class106.method750(("ortho camera lock is " + (!Class98.aBoolean1261 ? "off" : "on")), (byte) 91);
                    return;
                }
                if (string.startsWith("setoutput ")) {
                    File file = new File(string.substring(10));
                    if (file.exists()) {
                        file = new File(string.substring(10) + "." + Class118.method1112(116) + ".log");
                        if (file.exists()) {
                            Class106.method750("file already exists!", (byte) 107);
                            return;
                        }
                    }
                    if (Class252.aFileOutputStream2840 != null) {
                        Class252.aFileOutputStream2840.close();
                        Class252.aFileOutputStream2840 = null;
                    }
                    try {
                        Class252.aFileOutputStream2840 = new FileOutputStream(file);
                    } catch (java.io.FileNotFoundException filenotfoundexception) {
                        Class106.method750(("Could not create " + file.getName()), (byte) 98);
                    } catch (SecurityException securityexception) {
                        Class106.method750("Cannot write to " + file.getName(), (byte) 87);
                    }
                    return;
                }
                if (string.equals("closeoutput")) {
                    if (Class252.aFileOutputStream2840 != null)
                        Class252.aFileOutputStream2840.close();
                    Class252.aFileOutputStream2840 = null;
                    return;
                }
                if (string.startsWith("runscript ")) {
                    File file = new File(string.substring(10));
                    if (!file.exists()) {
                        Class106.method750("No such file", (byte) 116);
                        return;
                    }
                    byte[] is = Class282_Sub21.method3009(file, (byte) -112);
                    if (is == null) {
                        Class106.method750("Failed to read file", (byte) 90);
                        return;
                    }
                    String[] strings = Class80.method583(-103, (Node_Sub12.method2256(85, Node_Sub14_Sub28.method2360(!bool, is), '\r', "")), '\n');
                    Class118.method1110(117, strings);
                }
                if (string.startsWith("zoom ")) {
                    short i = (short) Class282_Sub21.method3012((byte) -126, string.substring(5));
                    if (i > 0)
                        Node_Sub14_Sub5.aShort9206 = i;
                    return;
                }
                if (Class273.anInt5008 == 10) {
                    s_Sub3.anInt8000++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class27.aOutgoingOpcode_360);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-36, 3 + string.length());
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-115, !bool_2_ ? 0 : 1);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-82, bool_3_ ? 1 : 0);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -89);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if (string.startsWith("fps ") && Class18.aClass339_295 != s_Sub2.aClass339_7951) {
                    Class17.method224(Class282_Sub21.method3012((byte) -122, string.substring(4)), -1);
                    return;
                }
            } catch (Exception exception) {
                Class106.method750(Class41.aClass41_467.method301((Class191.anInt4822), (byte) -108), (byte) 77);
                return;
            }
        }
        if ((Class273.anInt5008 ^ 0xffffffff) != -11)
            Class106.method750((Class41.aClass41_468.method301(Class191.anInt4822, (byte) -108) + string), (byte) 107);
    }

    static final byte method2597(int i, int i_9_, byte i_10_) {
        if (i_10_ != 55)
            method2596(true, true, true, null);
        anInt7266++;
        if ((i_9_ ^ 0xffffffff) != -10)
            return (byte) 0;
        if ((0x1 & i ^ 0xffffffff) != -1)
            return (byte) 2;
        return (byte) 1;
    }

    public static void method2598(int i) {
        if (i != 0)
            anInt7269 = -19;
        aInteractableArray7263 = null;
    }

    public Node_Sub38() {
        /* empty */
    }
}
