/* Class346_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub4 extends Class346 {
    static Class5 aClass5_8272 = new Class5();
    static int anInt8273;
    static IncommingOpcode aIncommingOpcode_8274 = new IncommingOpcode(39, -1);
    int anInt8275;
    /*synthetic*/ static Class aClass8276;

    static final boolean method3543(int i, int i_0_, int i_1_, byte i_2_) {
        anInt8273++;
        Interface16 interface16 = (Interface16) RSInterface2.method3763(i, i_1_, i_0_);
        boolean bool = true;
        if (i_2_ != 12)
            method3544(-20);
        if (interface16 != null)
            bool &= Class124.method1141(interface16, (byte) 62);
        interface16 = (Interface16) aa.method154(i, i_1_, i_0_, (aClass8276 != null ? aClass8276 : (aClass8276 = method3545("Interface16"))));
        if (interface16 != null)
            bool &= Class124.method1141(interface16, (byte) 88);
        interface16 = (Interface16) Class346_Sub7_Sub1.method3584(i, i_1_, i_0_);
        if (interface16 != null)
            bool &= Class124.method1141(interface16, (byte) 124);
        return bool;
    }

    public static void method3544(int i) {
        aClass5_8272 = null;
        aIncommingOpcode_8274 = null;
        if (i >= -59)
            method3543(-3, -60, -91, (byte) 2);
    }

    Class346_Sub4(int i) {
        ((Class346_Sub4) this).anInt8275 = i;
    }

    /*synthetic*/
    static Class method3545(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
