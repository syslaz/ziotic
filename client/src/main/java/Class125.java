/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class125 {
    static IncommingOpcode aIncommingOpcode_1545 = new IncommingOpcode(43, -1);
    static int anInt1546;

    static final void method1146(int i, boolean bool, int i_0_) {
        anInt1546++;
        if (i_0_ != 0)
            aIncommingOpcode_1545 = null;
        Node_Sub33 class248_sub33 = IOException_Sub1.method127(bool, i, (byte) -60);
        if (class248_sub33 != null)
            class248_sub33.remove(true);
    }

    public static void method1147(int i) {
        aIncommingOpcode_1545 = null;
        int i_1_ = -85 / (-i / 33);
    }

    static final void method1148(int i, int i_2_, int i_3_, Class346_Sub7_Sub4 class346_sub7_sub4) {
        Class137 class137 = Class296.method3130(i, i_2_, i_3_);
        if (class137 != null) {
            ((Class137) class137).aClass346_Sub7_Sub4_1645 = class346_sub7_sub4;
            int i_4_ = ((Class177.aSArray2070 == Node_Sub14_Sub12_Sub1.aSArray10306) ? 1 : 0);
            if (class346_sub7_sub4.method3574((byte) -59)) {
                if (class346_sub7_sub4.method3563(false)) {
                    ((Interactable) class346_sub7_sub4).aInteractable_8320 = Node_Sub12.aInteractableArray6965[i_4_];
                    Node_Sub12.aInteractableArray6965[i_4_] = class346_sub7_sub4;
                } else {
                    ((Interactable) class346_sub7_sub4).aInteractable_8320 = Class144.aInteractableArray1704[i_4_];
                    Class144.aInteractableArray1704[i_4_] = class346_sub7_sub4;
                    Node_Sub30.aBoolean7192 = true;
                }
            } else {
                ((Interactable) class346_sub7_sub4).aInteractable_8320 = Class273.aInteractableArray5007[i_4_];
                Class273.aInteractableArray5007[i_4_] = class346_sub7_sub4;
            }
        }
    }
}
