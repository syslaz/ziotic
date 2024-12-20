/* NativeHeapPeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class NativeHeapPeerReference extends PeerReference {
    NativeHeapPeerReference(pr var_pr, uca var_uca) {
        super((Peer) var_pr, var_uca);
    }

    protected final native long releasePeer(long l);
}
