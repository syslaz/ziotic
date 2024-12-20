/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.raa;

final class Class314 implements Interface18_Impl1 {
    private boolean aBoolean8594;
    IDirect3DVertexBuffer anIDirect3DVertexBuffer8595;
    private int anInt8596;
    private boolean aBoolean8597 = false;
    private ha_Sub3_Sub2 aHa_Sub3_Sub2_8598;
    private byte aByte8599;
    private int anInt8600;

    public final Buffer method1(int i, boolean bool) {
        if (i != -4448)
            method4(81);
        if (null == ((Class314) this).anIDirect3DVertexBuffer8595)
            return null;
        bool &= aBoolean8594;
        if (!aBoolean8597 && raa.a((((Class314) this).anIDirect3DVertexBuffer8595.Lock(0, anInt8600, bool ? 8192 : 0, (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8598).aGeometryBuffer8778))), (byte) 98)) {
            aBoolean8597 = true;
            return ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8598).aGeometryBuffer8778;
        }
        return null;
    }

    public final boolean method5(int i, Source source, int i_0_, int i_1_) {
        if (method2(i_1_, i_0_ ^ ~0x197b, i))
            return ((Class314) this).anIDirect3DVertexBuffer8595.a(source, 0, 0, anInt8596, !aBoolean8594 ? 0 : 8192);
        if (i_0_ != 24689)
            return true;
        return false;
    }

    public final boolean method4(int i) {
        if (i != -13472)
            return true;
        if (aBoolean8597 && raa.a(((Class314) this).anIDirect3DVertexBuffer8595.Unlock(), (byte) 120)) {
            aBoolean8597 = false;
            return true;
        }
        return false;
    }

    public final int method57(int i) {
        if (i != -1)
            return -117;
        return anInt8596;
    }

    final int method3276(byte i) {
        if (i > -41)
            return 18;
        return aByte8599;
    }

    public final boolean method2(int i, int i_2_, int i_3_) {
        anInt8596 = i_3_;
        if (i_2_ != -30987)
            method3276((byte) 59);
        aByte8599 = (byte) i;
        if ((anInt8600 ^ 0xffffffff) > (anInt8596 ^ 0xffffffff)) {
            int i_4_ = 8;
            int i_5_;
            if (!aBoolean8594)
                i_5_ = 1;
            else {
                i_4_ |= 0x200;
                i_5_ = 0;
            }
            if (((Class314) this).anIDirect3DVertexBuffer8595 != null)
                ((Class314) this).anIDirect3DVertexBuffer8595.a((byte) 85);
            ((Class314) this).anIDirect3DVertexBuffer8595 = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8598).anIDirect3DDevice8781.a(anInt8596, i_4_, 0, i_5_, ((Class314) this).anIDirect3DVertexBuffer8595));
            anInt8600 = anInt8596;
        }
        return null != ((Class314) this).anIDirect3DVertexBuffer8595;
    }

    public final void method3(boolean bool) {
        if (!bool) {
            if (((Class314) this).anIDirect3DVertexBuffer8595 != null) {
                ((Class314) this).anIDirect3DVertexBuffer8595.a((byte) -70);
                ((Class314) this).anIDirect3DVertexBuffer8595 = null;
            }
            anInt8600 = 0;
            anInt8596 = 0;
        }
    }

    Class314(ha_Sub3_Sub2 var_ha_Sub3_Sub2, boolean bool) {
        aBoolean8594 = bool;
        aHa_Sub3_Sub2_8598 = var_ha_Sub3_Sub2;
    }
}
