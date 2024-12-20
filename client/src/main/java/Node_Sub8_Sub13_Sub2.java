/* Class248_Sub8_Sub13_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub13_Sub2 extends Node_Sub8_Sub13 {
    static int anInt10252;
    byte[] aByteArray10253;
    Class209 aClass209_10254;
    static int anInt10255;
    int anInt10256;
    static int anInt10257;

    static final String method2104(int i, String string) {
        anInt10255++;
        if (i < 105)
            return null;
        if (!Class64.aString871.startsWith("win")) {
            if (!Class64.aString871.startsWith("linux")) {
                if (Class64.aString871.startsWith("mac"))
                    return "lib" + string + ".dylib";
            } else
                return "lib" + string + ".so";
        } else
            return string + ".dll";
        return null;
    }

    final byte[] method2097(int i) {
        anInt10257++;
        if (((Node_Sub8_Sub13) this).aBoolean9024)
            throw new RuntimeException();
        if (i != 0)
            ((Node_Sub8_Sub13_Sub2) this).aByteArray10253 = null;
        return ((Node_Sub8_Sub13_Sub2) this).aByteArray10253;
    }

    public Node_Sub8_Sub13_Sub2() {
        /* empty */
    }

    final int method2096(int i) {
        anInt10252++;
        if (((Node_Sub8_Sub13) this).aBoolean9024)
            return 0;
        if (i != 0)
            ((Node_Sub8_Sub13_Sub2) this).aByteArray10253 = null;
        return 100;
    }
}
