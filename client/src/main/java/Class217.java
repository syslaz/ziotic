/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.raa;

final class Class217 implements Interface18_Impl2 {
    private boolean aBoolean8611 = false;
    private boolean aBoolean8612;
    private int anInt8613;
    IDirect3DIndexBuffer anIDirect3DIndexBuffer8614;
    private Class228 aClass228_8615;
    private int anInt8616;
    private ha_Sub3_Sub2 aHa_Sub3_Sub2_8617;

    public final void method48(int i, byte i_0_) {
        anInt8613 = ((Class228) aClass228_8615).anInt2570 * i;
        if (i_0_ != 102)
            method3(false);
        if ((anInt8616 ^ 0xffffffff) > (anInt8613 ^ 0xffffffff)) {
            int i_1_ = 8;
            int i_2_;
            if (!aBoolean8612)
                i_2_ = 1;
            else {
                i_1_ |= 0x200;
                i_2_ = 0;
            }
            if (((Class217) this).anIDirect3DIndexBuffer8614 != null)
                ((Class217) this).anIDirect3DIndexBuffer8614.a((byte) -111);
            ((Class217) this).anIDirect3DIndexBuffer8614 = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8617).anIDirect3DDevice8781.a(anInt8613, i_1_, aClass228_8615 != Class228.aClass228_2574 ? 102 : 101, i_2_, ((Class217) this).anIDirect3DIndexBuffer8614));
            anInt8616 = anInt8613;
        }
    }

    public final boolean method50(int i) {
        if (aBoolean8611 && raa.a(((Class217) this).anIDirect3DIndexBuffer8614.Unlock(), (byte) 98)) {
            aBoolean8611 = false;
            return true;
        }
        if (i != -17694)
            anInt8616 = 77;
        return false;
    }

    public final Buffer method47(int i, boolean bool) {
        if (((Class217) this).anIDirect3DIndexBuffer8614 == null)
            return null;
        bool &= aBoolean8612;
        if (i != 30907)
            method48(120, (byte) 79);
        if (!aBoolean8611 && raa.a((((Class217) this).anIDirect3DIndexBuffer8614.Lock(0, anInt8616, bool ? 8192 : 0, (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8617).aGeometryBuffer8778))), (byte) 122)) {
            aBoolean8611 = true;
            return ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8617).aGeometryBuffer8778;
        }
        return null;
    }

    public final void method3(boolean bool) {
        if (((Class217) this).anIDirect3DIndexBuffer8614 != null) {
            ((Class217) this).anIDirect3DIndexBuffer8614.a((byte) 109);
            ((Class217) this).anIDirect3DIndexBuffer8614 = null;
        }
        if (bool)
            method48(-116, (byte) 71);
        anInt8613 = 0;
        anInt8616 = 0;
    }

    public final Class228 method49(byte i) {
        if (i != 81)
            anInt8616 = -120;
        return aClass228_8615;
    }

    Class217(ha_Sub3_Sub2 var_ha_Sub3_Sub2, Class228 class228, boolean bool) {
        aHa_Sub3_Sub2_8617 = var_ha_Sub3_Sub2;
        aClass228_8615 = class228;
        aBoolean8612 = bool;
    }

    public final int method57(int i) {
        if (i != -1)
            method57(-118);
        return anInt8613;
    }
}
