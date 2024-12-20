/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class1 {
    static int anInt105;
    Node_Sub8_Sub20 aClass248_Sub8_Sub20_106;
    int[] anIntArray107;
    static int cameraXMovement;
    static long aLong109 = (long) (Math.random() * 9.999999999E9);
    static boolean aBoolean110 = true;
    static int anInt111;
    int anInt112;

    static final void method168(byte i) {
        anInt111++;
        if (Class115.aBoolean4952) {
            RSInterface2 inter = Class188.method1635(Class346_Sub7_Sub5.anInt9963, InputStream_Sub2.anInt76, 0);
            if (inter != null && ((RSInterface2) inter).anObjectArray4274 != null) {
                RSInterface class248_sub6 = new RSInterface();
                ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) inter).anObjectArray4274;
                ((RSInterface) class248_sub6).rsInter = inter;
                Class47.executeScript(class248_sub6);
            }
            Class136_Sub4.anInt8413 = -1;
            int i_0_ = -43 / ((-45 - i) / 40);
            Class168.anInt1963 = -1;
            Class115.aBoolean4952 = false;
            if (inter != null)
                Class376.method3882(inter, 2260);
        }
    }

    static final int method169(int i, byte i_1_) {
        if (i_1_ != 95)
            method168((byte) 10);
        anInt105++;
        return i & 0xff;
    }

    public Class1() {
        /* empty */
    }
}
