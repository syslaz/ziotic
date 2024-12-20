/* Peer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

abstract class Peer {
    protected PeerReference reference;
    /*synthetic*/ static Class a;

    private static final native void init(Class var_class);

    public final boolean a(int i) {
        if (i > -73)
            init(null);
        return reference.a((byte) -54);
    }

    protected long a() {
        return reference.a((int) 0);
    }

    protected Peer() {
        /* empty */
    }

    /*synthetic*/
    static Class a(String string) {
        Class var_class;
        try {
            var_class = Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
        return var_class;
    }

    static {
        init(a == null ? a = a("jaclib.peer.PeerReference") : a);
    }
}
