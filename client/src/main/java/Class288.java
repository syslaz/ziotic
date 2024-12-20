/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class288 implements Runnable {
    private ha aHa3389;
    private volatile boolean aBoolean3390;
    private int[] anIntArray3391 = new int[3];
    private int anInt3392;
    private Class344 aClass344_3393;
    private volatile boolean aBoolean3394 = true;
    private volatile boolean aBoolean3395;
    private long aLong3396;
    private Node_Sub42[] aClass248_Sub42Array3397;

    final void method3079() {
        aBoolean3394 = true;
        synchronized (this) {
            this.notify();
        }
    }

    final void method3080(Class344 class344) {
        if (aClass344_3393 != null)
            aClass344_3393.method3519(null, true);
        aClass344_3393 = class344;
        if (aClass344_3393 != null)
            aClass344_3393.method3519(this, true);
    }

    private final void method3081() {
        aHa3389.h(anInt3392);
        while (!aBoolean3394 && aBoolean3390) {
            if (aClass344_3393 != null && !aClass344_3393.method3514((byte) -63)) {
                aBoolean3395 = true;
                Class346 class346 = aClass344_3393.method3517(-91);
                if (class346 instanceof Interactable) {
                    Interactable interactable = (Interactable) class346;
                    if (((Interactable) interactable).aBoolean8318)
                        interactable.method3573(r.aHa9032, (byte) 127);
                    else {
                        Node_Sub29.method2559(interactable, aClass248_Sub42Array3397);
                        if (Class90.aClass48_1132 != null)
                            Class90.aClass48_1132.method369(true, ((Interactable) interactable).anInt8307, ((Class344) aClass344_3393).aString4080, ((Interactable) interactable).anInt8314, -16777216, -256);
                    }
                } else {
                    int i = ((Class346_Sub4) (Class346_Sub4) class346).anInt8275;
                    if (i >= 1 && i <= 4) {
                        s var_s = Class177.aSArray2070[i - 1];
                        for (int i_0_ = 0; i_0_ < (Node_Sub47.anInt7416 + Node_Sub47.anInt7416); i_0_++) {
                            for (int i_1_ = 0; i_1_ < (Node_Sub47.anInt7416 + Node_Sub47.anInt7416); i_1_++) {
                                if (Class84_Sub7.aBooleanArrayArrayArray5461[i - 1][i_0_][i_1_]) {
                                    int i_2_ = (Class286.anInt3375 - Node_Sub47.anInt7416 + i_0_);
                                    int i_3_ = (Class152.anInt1808 - Node_Sub47.anInt7416 + i_1_);
                                    if (i_2_ >= 0 && i_2_ < ((s) var_s).anInt3468 && i_3_ >= 0 && i_3_ < ((s) var_s).anInt3472) {
                                        r.aHa9032.H(i_2_ << Class96.anInt1249, var_s.method3145(i_2_, 66, i_3_), i_3_ << Class96.anInt1249, anIntArray3391);
                                        if (Class126.method1153(anIntArray3391[0]) == anInt3392 - 1)
                                            var_s.method3148(i_2_, i_3_);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                aBoolean3395 = false;
                aLong3396 = Class282_Sub2.aClass161_7608.method1416(24111);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
        }
        aHa3389.e(anInt3392);
        while (aBoolean3394 && aBoolean3390) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException interruptedexception) {
                    /* empty */
                }
            }
        }
    }

    final void method3082() {
        aBoolean3394 = false;
        aBoolean3390 = false;
        synchronized (this) {
            this.notify();
        }
    }

    public final void run() {
        while (aBoolean3390)
            method3081();
    }

    final boolean method3083() {
        if (aClass344_3393 != null && (aBoolean3395 || !aClass344_3393.method3514((byte) -84)))
            return false;
        return true;
    }

    final long method3084() {
        return aLong3396;
    }

    final void method3085() {
        aBoolean3394 = false;
        synchronized (this) {
            this.notify();
        }
    }

    Class288(int i, ha var_ha) {
        aBoolean3390 = true;
        aBoolean3395 = false;
        aClass248_Sub42Array3397 = new Node_Sub42[8];
        anInt3392 = i;
        aHa3389 = var_ha;
    }
}
