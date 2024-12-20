/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;

abstract class Class35 {
    Class171 aClass171_396 = Class162.aClass171_1904;
    boolean aBoolean397;
    ha_Sub3_Sub2 aHa_Sub3_Sub2_398;
    Class228 aClass228_399;
    Class264 aClass264_400;

    void method78(int i, Class171 class171) {
        if (i != -9495)
            method280(-28);
        ((Class35) this).aClass171_396 = class171;
    }

    abstract IDirect3DBaseTexture method280(int i);

    Class35(ha_Sub3_Sub2 var_ha_Sub3_Sub2, Class264 class264, Class228 class228, boolean bool, int i) {
        ((Class35) this).aClass264_400 = class264;
        ((Class35) this).aBoolean397 = bool;
        ((Class35) this).aHa_Sub3_Sub2_398 = var_ha_Sub3_Sub2;
        ((Class35) this).aClass228_399 = class228;
    }
}
