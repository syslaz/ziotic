/* IUnknown - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

public class IUnknown extends Peer {
    protected IUnknown(uca var_uca) {
        reference = new IUnknownReference(this, var_uca);
    }

    public final long a(byte i) {
        int i_0_ = -119 % ((16 - i) / 50);
        return super.a();
    }

    public final native long AddRef();
}
