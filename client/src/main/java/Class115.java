/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class115 implements Interface11 {
    static int anInt4949;
    static boolean aBoolean4950 = false;
    static int anInt4951;
    static boolean aBoolean4952 = false;
    static int anInt4953;
    static int[] anIntArray4954;
    static int anInt4955;
    int anInt4956;

    public final Class208 method35(byte i) {
        if (i != 62)
            method1077((byte) 74);
        anInt4951++;
        return Class344.aClass208_4082;
    }

    static final void method1076(int i) {
        if (i > 5) {
            if (Class165.anObject4966 == null) {
                Class279_Sub2_Sub2 class279_sub2_sub2 = new Class279_Sub2_Sub2();
                byte[] is = class279_sub2_sub2.method2905(128, (byte) 114, 16, 128);
                Class165.anObject4966 = Class255.method2742(false, is, (byte) 117);
            }
            anInt4955++;
            if (Class317.anObject3676 == null) {
                Class279_Sub1_Sub2 class279_sub1_sub2 = new Class279_Sub1_Sub2();
                byte[] is = class279_sub1_sub2.method2890(128, 16, 128, 4096);
                Class317.anObject3676 = Class255.method2742(false, is, (byte) 117);
            }
        }
    }

    public static void method1077(byte i) {
        anIntArray4954 = null;
        if (i != 94)
            anInt4953 = -39;
    }

    Class115(int i) {
        ((Class115) this).anInt4956 = i;
    }

    static {
        anInt4949 = 0;
        anIntArray4954 = new int[50];
    }
}
