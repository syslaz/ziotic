/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class180 {
    int anInt2091 = 0;
    static int anInt2092;
    static int anInt2093;
    static int anInt2094;

    final void method1599(byte i, ByteStream class248_sub9) {
        for (; ; ) {
            int i_0_ = class248_sub9.readUnsignedByte((byte) -80);
            if ((i_0_ ^ 0xffffffff) == -1)
                break;
            method1600(125, i_0_, class248_sub9);
        }
        int i_1_ = 115 / ((i - -72) / 41);
        anInt2094++;
    }

    private final void method1600(int i, int i_2_, ByteStream class248_sub9) {
        if (i < 73)
            anInt2093 = 88;
        if (i_2_ == 5)
            ((Class180) this).anInt2091 = class248_sub9.readShort(-1);
        anInt2092++;
    }

    public Class180() {
        /* empty */
    }

    static final void method1601(int i, int i_3_, int i_4_, Class346_Sub7_Sub1 class346_sub7_sub1, Class346_Sub7_Sub1 class346_sub7_sub1_5_) {
        Class137 class137 = Class296.method3130(i, i_3_, i_4_);
        if (class137 != null) {
            ((Class137) class137).aClass346_Sub7_Sub1_1644 = class346_sub7_sub1;
            ((Class137) class137).aClass346_Sub7_Sub1_1642 = class346_sub7_sub1_5_;
            int i_6_ = ((Class177.aSArray2070 == Node_Sub14_Sub12_Sub1.aSArray10306) ? 1 : 0);
            if (class346_sub7_sub1.method3574((byte) 99)) {
                if (class346_sub7_sub1.method3563(false)) {
                    ((Interactable) class346_sub7_sub1).aInteractable_8320 = Node_Sub12.aInteractableArray6965[i_6_];
                    Node_Sub12.aInteractableArray6965[i_6_] = class346_sub7_sub1;
                } else {
                    ((Interactable) class346_sub7_sub1).aInteractable_8320 = Class144.aInteractableArray1704[i_6_];
                    Class144.aInteractableArray1704[i_6_] = class346_sub7_sub1;
                    Node_Sub30.aBoolean7192 = true;
                }
            } else {
                ((Interactable) class346_sub7_sub1).aInteractable_8320 = Class273.aInteractableArray5007[i_6_];
                Class273.aInteractableArray5007[i_6_] = class346_sub7_sub1;
            }
            if (class346_sub7_sub1_5_ != null) {
                if (class346_sub7_sub1_5_.method3574((byte) 125)) {
                    if (class346_sub7_sub1_5_.method3563(false)) {
                        ((Interactable) class346_sub7_sub1_5_).aInteractable_8320 = Node_Sub12.aInteractableArray6965[i_6_];
                        Node_Sub12.aInteractableArray6965[i_6_] = class346_sub7_sub1_5_;
                    } else {
                        ((Interactable) class346_sub7_sub1_5_).aInteractable_8320 = Class144.aInteractableArray1704[i_6_];
                        Class144.aInteractableArray1704[i_6_] = class346_sub7_sub1_5_;
                        Node_Sub30.aBoolean7192 = true;
                    }
                } else {
                    ((Interactable) class346_sub7_sub1_5_).aInteractable_8320 = Class273.aInteractableArray5007[i_6_];
                    Class273.aInteractableArray5007[i_6_] = class346_sub7_sub1_5_;
                }
            }
        }
    }
}
