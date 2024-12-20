/* dxVertexLayout - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;

public class dxVertexLayout extends Class185 {
    IDirect3DVertexDeclaration anIDirect3DVertexDeclaration6649;

    dxVertexLayout(ha_Sub3_Sub2 var_ha_Sub3_Sub2, Class194[] class194s) {
        VertexElementCollection vertexelementcollection = new VertexElementCollection(((ha_Sub3_Sub2) var_ha_Sub3_Sub2).anUca8771);
        int i = 0;
        for (int i_0_ = 0; i_0_ < class194s.length; i_0_++) {
            int i_1_ = 0;
            Class194 class194 = class194s[i_0_];
            for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (class194.method1659((byte) -98) ^ 0xffffffff)); i_2_++) {
                Class89 class89 = class194.method1661(-24713, i_2_);
                if (class89 != Class89.aClass89_1097) {
                    if (Class89.aClass89_1098 != class89) {
                        if (class89 == Class89.aClass89_1099)
                            vertexelementcollection.addElement(i_0_, 4, 0, 10, 0, i_1_);
                        else if (class89 != Class89.aClass89_1100) {
                            if (Class89.aClass89_1101 != class89) {
                                if (Class89.aClass89_1102 == class89)
                                    vertexelementcollection.addElement(i_0_, 2, 0, 5, i++, i_1_);
                                else if (Class89.aClass89_1103 == class89)
                                    vertexelementcollection.addElement(i_0_, 3, 0, 5, i++, i_1_);
                            } else
                                vertexelementcollection.addElement(i_0_, 1, 0, 5, i++, i_1_);
                        } else
                            vertexelementcollection.addElement(i_0_, 0, 0, 5, i++, i_1_);
                    } else
                        vertexelementcollection.addElement(i_0_, 2, 0, 3, 0, i_1_);
                } else
                    vertexelementcollection.addElement(i_0_, 2, 0, 0, 0, i_1_);
                i_1_ += ((Class89) class89).anInt1093;
            }
        }
        vertexelementcollection.finish();
        ((dxVertexLayout) this).anIDirect3DVertexDeclaration6649 = ((ha_Sub3_Sub2) var_ha_Sub3_Sub2).anIDirect3DDevice8781.a(vertexelementcollection, null);
    }
}
