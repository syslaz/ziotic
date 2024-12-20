/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class277 {
    int anInt3210;
    private int[] anIntArray3211;
    int anInt3212;
    int anInt3213;
    private int anInt3214 = 2;
    private int[] anIntArray3215 = new int[2];
    private int anInt3216;
    private int anInt3217;
    private int anInt3218;
    private int anInt3219;
    private int anInt3220;

    final void method2857(ByteStream class248_sub9) {
        anInt3214 = class248_sub9.readUnsignedByte((byte) -94);
        anIntArray3215 = new int[anInt3214];
        anIntArray3211 = new int[anInt3214];
        for (int i = 0; i < anInt3214; i++) {
            anIntArray3215[i] = class248_sub9.readShort(-1);
            anIntArray3211[i] = class248_sub9.readShort(-1);
        }
    }

    final void method2858(ByteStream class248_sub9) {
        ((Class277) this).anInt3210 = class248_sub9.readUnsignedByte((byte) 79);
        ((Class277) this).anInt3212 = class248_sub9.readInt(false);
        ((Class277) this).anInt3213 = class248_sub9.readInt(false);
        method2857(class248_sub9);
    }

    final void method2859() {
        anInt3220 = 0;
        anInt3218 = 0;
        anInt3216 = 0;
        anInt3219 = 0;
        anInt3217 = 0;
    }

    final int method2860(int i) {
        if (anInt3217 >= anInt3220) {
            anInt3219 = anIntArray3211[anInt3218++] << 15;
            if (anInt3218 >= anInt3214)
                anInt3218 = anInt3214 - 1;
            anInt3220 = (int) ((double) anIntArray3215[anInt3218] / 65536.0 * (double) i);
            if (anInt3220 > anInt3217)
                anInt3216 = (((anIntArray3211[anInt3218] << 15) - anInt3219) / (anInt3220 - anInt3217));
        }
        anInt3219 += anInt3216;
        anInt3217++;
        return anInt3219 - anInt3216 >> 15;
    }

    public Class277() {
        anIntArray3211 = new int[2];
        anIntArray3215[0] = 0;
        anIntArray3215[1] = 65535;
        anIntArray3211[0] = 0;
        anIntArray3211[1] = 65535;
    }
}
