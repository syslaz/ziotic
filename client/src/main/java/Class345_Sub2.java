/* Class345_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class345_Sub2 extends Class345 {
    private static Interface4 anInterface4_8241;
    private int anInt8242;

    final int method3523() {
        return anInterface4_8241.method14(anInt8242, 23707);
    }

    final void method3528(int i) throws Exception {
        if (i > 32768)
            throw new IllegalArgumentException();
        anInterface4_8241.method12((byte) 27, i, anInt8242);
    }

    public static void method3536() {
        anInterface4_8241 = null;
    }

    final void method3526(Component component) throws Exception {
        anInterface4_8241.method13(Class225_Sub3.aBoolean8472, component, Class54.anInt728, -122);
    }

    final void method3522() {
        anInterface4_8241.method15(anInt8242, (byte) -14);
    }

    final void method3531() {
        anInterface4_8241.method16(anInt8242, 16);
    }

    final void method3533() {
        anInterface4_8241.method17(anInt8242, ((Class345) this).anIntArray4089);
    }

    Class345_Sub2(Class174 class174, int i) {
        anInterface4_8241 = (Interface4) class174.method1582((byte) -46);
        anInt8242 = i;
    }
}
