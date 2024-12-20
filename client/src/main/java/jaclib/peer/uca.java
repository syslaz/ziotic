/* uca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

import java.lang.ref.ReferenceQueue;

public final class uca {
    private PeerReference a;
    ReferenceQueue b = new ReferenceQueue();
    private PeerReference c;

    public final void a(int i) {
        a((byte) -71);
        int i_0_ = -23 % ((0 - i) / 36);
    }

    private final void a(byte i) {
        for (; ; ) {
            java.lang.ref.Reference reference = b.poll();
            if (null == reference)
                break;
            PeerReference peerreference = (PeerReference) reference;
            a(peerreference, -9808);
        }
        if (i >= -61)
            c = null;
    }

    private final void a(PeerReference peerreference, int i) {
        peerreference.a((int) 0);
        if (i == -9808) {
            if (peerreference == c)
                c = peerreference.a;
            if (a == peerreference)
                a = peerreference.b;
            if (null != peerreference.b)
                peerreference.b.a = peerreference.a;
            if (peerreference.a != null)
                peerreference.a.b = peerreference.b;
        }
    }

    final void a(byte i, PeerReference peerreference) {
        if (i < 86)
            b = null;
        peerreference.a = c;
        peerreference.b = null;
        if (a == null)
            a = peerreference;
        else
            c.b = peerreference;
        c = peerreference;
    }

    public final void b(int i) {
        if (i != -13759)
            c = null;
        a((byte) -102);
        while (c != null)
            a(c, -9808);
        a((byte) -109);
    }
}
