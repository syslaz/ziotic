/* IUnknownReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class IUnknownReference extends PeerReference {
    IUnknownReference(IUnknown iunknown, uca var_uca) {
        super((Peer) iunknown, var_uca);
    }

    protected final native long releasePeer(long l);
}
