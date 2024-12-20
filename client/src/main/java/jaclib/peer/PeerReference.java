/* PeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

import java.lang.ref.WeakReference;

abstract class PeerReference extends WeakReference {
    PeerReference a;
    PeerReference b;
    private long peer;

    PeerReference(Peer peer, uca var_uca) {
        super(peer, var_uca.b);
        var_uca.a((byte) 119, this);
    }

    final boolean a(byte i) {
        if (i != -54)
            peer = 113L;
        return -1L != (peer ^ 0xffffffffffffffffL);
    }

    final long a(int i) {
        if (i != 0)
            a((int) -96);
        long l;
        if (-1L == (peer ^ 0xffffffffffffffffL))
            l = 0L;
        else {
            l = releasePeer(peer);
            peer = 0L;
        }
        return l;
    }

    protected abstract long releasePeer(long l);

    final void setPeer(long l) {
        a((int) 0);
        peer = l;
    }
}
