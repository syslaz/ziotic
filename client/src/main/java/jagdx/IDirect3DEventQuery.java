/* IDirect3DEventQuery - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.uca;

public class IDirect3DEventQuery extends IUnknown {
    IDirect3DEventQuery(uca var_uca) {
        super(var_uca);
    }

    public final native int Issue();

    public final native int IsSignaled();
}
