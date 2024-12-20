/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream {
    private byte[] a;
    private int b;
    private Buffer c;
    private int d;
    private int e;

    private static final native byte getLSB(int i);

    public final void a(int i) {
        if (e - -3 >= a.length)
            a();
        a[e++] = (byte) i;
        a[e++] = (byte) (i >> -1317464344);
        a[e++] = (byte) (i >> 1276486000);
        a[e++] = (byte) (i >> -1794054120);
    }

    public final void a(float f) {
        if ((e - -3 ^ 0xffffffff) <= (a.length ^ 0xffffffff))
            a();
        int i = floatToRawIntBits(f);
        a[e++] = (byte) (i >> -1959008712);
        a[e++] = (byte) (i >> -439873584);
        a[e++] = (byte) (i >> 290177480);
        a[e++] = (byte) i;
    }

    public final void a() {
        if ((e ^ 0xffffffff) < -1) {
            if ((d ^ 0xffffffff) > (e + b ^ 0xffffffff))
                throw new RuntimeException();
            c.a(a, 0, b, e);
            b += e;
            e = 0;
        }
    }

    public static final native int floatToRawIntBits(float f);

    public final void b(int i) {
        if ((a.length ^ 0xffffffff) >= (1 + e ^ 0xffffffff))
            a();
        a[e++] = (byte) (i >> -1406746456);
        a[e++] = (byte) i;
    }

    public final void c(int i) {
        if (3 + e >= a.length)
            a();
        a[e++] = (byte) (i >> 2121253232);
        a[e++] = (byte) (i >> -232213016);
        a[e++] = (byte) i;
        a[e++] = (byte) (i >> 1953888248);
    }

    public final void d(int i) {
        if (1 + e >= a.length)
            a();
        a[e++] = (byte) i;
        a[e++] = (byte) (i >> -523758328);
    }

    public final void e(int i) {
        a();
        b = i;
    }

    public Stream(Buffer buffer) {
        this(buffer, 0, buffer.getSize());
    }

    public static final boolean b() {
        if (getLSB(-65536) != -1)
            return false;
        return true;
    }

    public final void a(int i, int i_0_, int i_1_, int i_2_) {
        if (e - -3 >= a.length)
            a();
        a[e++] = (byte) i;
        a[e++] = (byte) i_0_;
        a[e++] = (byte) i_1_;
        a[e++] = (byte) i_2_;
    }

    public final void b(float f) {
        if (a.length <= 3 + e)
            a();
        int i = floatToRawIntBits(f);
        a[e++] = (byte) i;
        a[e++] = (byte) (i >> -1942079992);
        a[e++] = (byte) (i >> -2045888080);
        a[e++] = (byte) (i >> 382561816);
    }

    private final void a(Buffer buffer, int i, int i_3_) {
        a();
        d = i_3_ + i;
        c = buffer;
        b = i;
        if (d > buffer.getSize())
            throw new RuntimeException();
    }

    public final void a(Buffer buffer) {
        a(buffer, 0, buffer.getSize());
    }

    public final void b(int i, int i_4_, int i_5_, int i_6_) {
        if (e + 3 >= a.length)
            a();
        a[e++] = (byte) i_5_;
        a[e++] = (byte) i_4_;
        a[e++] = (byte) i;
        a[e++] = (byte) i_6_;
    }

    public final void f(int i) {
        if (a.length <= e)
            a();
        a[e++] = (byte) i;
    }

    public Stream(Buffer buffer, int i, int i_7_) {
        this((buffer.getSize() ^ 0xffffffff) <= -4097 ? 4096 : buffer.getSize());
        a(buffer, i, i_7_);
    }

    public final int c() {
        return e + b;
    }

    private Stream(int i) {
        a = new byte[i];
    }

    public Stream() {
        this(4096);
    }
}
