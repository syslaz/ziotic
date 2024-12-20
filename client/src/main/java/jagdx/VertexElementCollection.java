/* VertexElementCollection - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.pr;
import jaclib.peer.uca;

public class VertexElementCollection extends pr {
    public final native void reset();

    public final native void finish();

    private final native void init();

    public final native void addElement(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_);

    public VertexElementCollection(uca var_uca) {
        super(var_uca);
        init();
    }
}
