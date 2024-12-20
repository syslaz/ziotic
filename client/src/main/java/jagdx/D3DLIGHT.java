/* D3DLIGHT - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.pr;
import jaclib.peer.uca;

public class D3DLIGHT extends pr {
    public final native void SetDiffuse(float f, float f_0_, float f_1_, float f_2_);

    public final native void SetAttenuation(float f, float f_3_, float f_4_);

    public final native void SetPosition(float f, float f_5_, float f_6_);

    public final native void SetDirection(float f, float f_7_, float f_8_);

    public final native void SetAmbient(float f, float f_9_, float f_10_, float f_11_);

    public final native void SetRange(float f);

    public final native void SetType(int i);

    public final native void SetSpotParams(float f, float f_12_, float f_13_);

    private final native void Init();

    public final native void SetSpecular(float f, float f_14_, float f_15_, float f_16_);

    public D3DLIGHT(uca var_uca) {
        super(var_uca);
        Init();
    }
}
