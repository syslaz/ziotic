/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.*;

final class Class234 {
    static int anInt2615;
    static int anInt2616;

    static final void method1844(File file, int i, byte[] is, int i_0_) throws IOException {
        anInt2615++;
        DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
        try {
            datainputstream.readFully(is, 0, i_0_);
        } catch (java.io.EOFException eofexception) {
            /* empty */
        }
        int i_1_ = -32 % ((41 - i) / 44);
        datainputstream.close();
    }

    static final void method1845(int i, int i_2_, int i_3_, Class346_Sub7_Sub5 class346_sub7_sub5, Class346_Sub7_Sub5 class346_sub7_sub5_4_) {
        Class137 class137 = Class296.method3130(i, i_2_, i_3_);
        if (class137 != null) {
            ((Class137) class137).aClass346_Sub7_Sub5_1636 = class346_sub7_sub5;
            ((Class137) class137).aClass346_Sub7_Sub5_1646 = class346_sub7_sub5_4_;
            int i_5_ = ((Class177.aSArray2070 == Node_Sub14_Sub12_Sub1.aSArray10306) ? 1 : 0);
            if (class346_sub7_sub5.method3574((byte) 94)) {
                if (class346_sub7_sub5.method3563(false)) {
                    ((Interactable) class346_sub7_sub5).aInteractable_8320 = Node_Sub12.aInteractableArray6965[i_5_];
                    Node_Sub12.aInteractableArray6965[i_5_] = class346_sub7_sub5;
                } else {
                    ((Interactable) class346_sub7_sub5).aInteractable_8320 = Class144.aInteractableArray1704[i_5_];
                    Class144.aInteractableArray1704[i_5_] = class346_sub7_sub5;
                    Node_Sub30.aBoolean7192 = true;
                }
            } else {
                ((Interactable) class346_sub7_sub5).aInteractable_8320 = Class273.aInteractableArray5007[i_5_];
                Class273.aInteractableArray5007[i_5_] = class346_sub7_sub5;
            }
            if (class346_sub7_sub5_4_ != null) {
                if (class346_sub7_sub5_4_.method3574((byte) 105)) {
                    if (class346_sub7_sub5_4_.method3563(false)) {
                        ((Interactable) class346_sub7_sub5_4_).aInteractable_8320 = Node_Sub12.aInteractableArray6965[i_5_];
                        Node_Sub12.aInteractableArray6965[i_5_] = class346_sub7_sub5_4_;
                    } else {
                        ((Interactable) class346_sub7_sub5_4_).aInteractable_8320 = Class144.aInteractableArray1704[i_5_];
                        Class144.aInteractableArray1704[i_5_] = class346_sub7_sub5_4_;
                        Node_Sub30.aBoolean7192 = true;
                    }
                } else {
                    ((Interactable) class346_sub7_sub5_4_).aInteractable_8320 = Class273.aInteractableArray5007[i_5_];
                    Class273.aInteractableArray5007[i_5_] = class346_sub7_sub5_4_;
                }
            }
        }
    }

    static final void method1846(int i, int i_6_, int i_7_, int i_8_, int i_9_, Class21 class21) {
        anInt2616++;
        Node_Sub30 class248_sub30 = null;
        for (Node_Sub30 class248_sub30_10_ = ((Node_Sub30) IOException_Sub1.aClass293_82.method3119(2)); class248_sub30_10_ != null; class248_sub30_10_ = ((Node_Sub30) IOException_Sub1.aClass293_82.method3107(-128))) {
            if (((((Node_Sub30) class248_sub30_10_).anInt7184 ^ 0xffffffff) == (i ^ 0xffffffff)) && (((Node_Sub30) class248_sub30_10_).anInt7187 ^ 0xffffffff) == (i_6_ ^ 0xffffffff) && i_9_ == ((Node_Sub30) class248_sub30_10_).anInt7190 && ((i_8_ ^ 0xffffffff) == (((Node_Sub30) class248_sub30_10_).anInt7185 ^ 0xffffffff))) {
                class248_sub30 = class248_sub30_10_;
                break;
            }
        }
        if (class248_sub30 == null) {
            class248_sub30 = new Node_Sub30();
            ((Node_Sub30) class248_sub30).anInt7187 = i_6_;
            ((Node_Sub30) class248_sub30).anInt7185 = i_8_;
            ((Node_Sub30) class248_sub30).anInt7184 = i;
            ((Node_Sub30) class248_sub30).anInt7190 = i_9_;
            IOException_Sub1.aClass293_82.method3109(class248_sub30, -110);
        }
        ((Node_Sub30) class248_sub30).aClass21_7183 = class21;
        ((Node_Sub30) class248_sub30).aBoolean7180 = true;
        if (i_7_ == 0)
            ((Node_Sub30) class248_sub30).aBoolean7189 = false;
    }
}
