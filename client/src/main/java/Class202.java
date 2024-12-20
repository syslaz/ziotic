/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class202 {
    int[] anIntArray2299;
    int anInt2300;
    int[] anIntArray2301;
    int anInt2302;

    Class202() {
        Node_Sub34.method2573(16);
        ((Class202) this).anInt2300 = (Node_Sub34.method2574() != 0 ? Node_Sub34.method2573(4) + 1 : 1);
        if (Node_Sub34.method2574() != 0)
            Node_Sub34.method2573(8);
        Node_Sub34.method2573(2);
        if (((Class202) this).anInt2300 > 1)
            ((Class202) this).anInt2302 = Node_Sub34.method2573(4);
        ((Class202) this).anIntArray2301 = new int[((Class202) this).anInt2300];
        ((Class202) this).anIntArray2299 = new int[((Class202) this).anInt2300];
        for (int i = 0; i < ((Class202) this).anInt2300; i++) {
            Node_Sub34.method2573(8);
            ((Class202) this).anIntArray2301[i] = Node_Sub34.method2573(8);
            ((Class202) this).anIntArray2299[i] = Node_Sub34.method2573(8);
        }
    }
}
