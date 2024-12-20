/* Class293 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class293 {
    static int anInt3424;
    static IncommingOpcode aIncommingOpcode_3425 = new IncommingOpcode(52, 6);
    static int anInt3426;
    static int anInt3427;
    static int anInt3428;
    static int anInt3429;
    static int anInt3430;
    static int anInt3431;
    static int anInt3432;
    static int anInt3433;
    Node aNode_3434 = new Node();
    static int anInt3435;
    static Class102 aClass102_3436;
    static int anInt3437;
    static int anInt3438;
    static int anInt3439;
    static int anInt3440;
    static int anInt3441;
    static int anInt3442;
    static boolean aBoolean3443 = false;
    private Node aNode_3444;
    static int anInt3445 = 0;

    final Node method3107(int i) {
        anInt3431++;
        if (i >= -126)
            return null;
        Node node = aNode_3444;
        if (node == ((Class293) this).aNode_3434) {
            aNode_3444 = null;
            return null;
        }
        aNode_3444 = ((Node) node).prev;
        return node;
    }

    final Node method3108(boolean bool) {
        if (bool != false)
            method3119(22);
        anInt3435++;
        Node node = ((Node) ((Class293) this).aNode_3434).prev;
        if (node == ((Class293) this).aNode_3434)
            return null;
        node.remove(!bool);
        return node;
    }

    final void method3109(Node node, int i) {
        anInt3430++;
        if (((Node) node).next != null)
            node.remove(true);
        if (i <= -87) {
            ((Node) node).prev = ((Class293) this).aNode_3434;
            ((Node) node).next = ((Node) ((Class293) this).aNode_3434).next;
            ((Node) ((Node) node).next).prev = node;
            ((Node) ((Node) node).prev).next = node;
        }
    }

    final Node method3110(int i) {
        anInt3424++;
        Node node = ((Node) ((Class293) this).aNode_3434).next;
        if (((Class293) this).aNode_3434 == node) {
            aNode_3444 = null;
            return null;
        }
        if (i != 0)
            aIncommingOpcode_3425 = null;
        aNode_3444 = ((Node) node).next;
        return node;
    }

    final void method3111(Node node, int i) {
        anInt3427++;
        if (((Node) node).next != null)
            node.remove(true);
        if (i != 593)
            method3112(91);
        ((Node) node).next = ((Class293) this).aNode_3434;
        ((Node) node).prev = ((Node) ((Class293) this).aNode_3434).prev;
        ((Node) ((Node) node).next).prev = node;
        ((Node) ((Node) node).prev).next = node;
    }

    final int method3112(int i) {
        anInt3433++;
        int i_0_ = i;
        for (Node node = (((Node) ((Class293) this).aNode_3434).prev); node != ((Class293) this).aNode_3434; node = ((Node) node).prev)
            i_0_++;
        return i_0_;
    }

    static final void method3113(int i) {
        anInt3439++;
        if (i != 17458)
            method3116(-99, 124, (byte) 2);
        Class45 class45 = null;
        try {
            Class322 class322 = Node_Sub14_Sub15.aClass174_9328.method1574(true, i + -17458, "");
            while ((class322.anInt3788 ^ 0xffffffff) == -1)
                Class279_Sub2.method2897((byte) -124, 1L);
            if ((class322.anInt3788 ^ 0xffffffff) == -2) {
                class45 = (Class45) class322.anObject3787;
                ByteStream class248_sub9 = Node_Sub14_Sub38.aClass248_Sub45_9584.method2646((byte) -112);
                class45.method327(3874, 0, ((ByteStream) class248_sub9).offset, (((ByteStream) class248_sub9).buffer));
            }
        } catch (Exception exception) {
            /* empty */
        }
        do {
            try {
                if (class45 == null)
                    break;
                class45.method323(-95);
            } catch (Exception exception) {
                break;
            }
            break;
        } while (false);
    }

    final void method3114(Class293 class293_1_, int i) {
        anInt3441++;
        method3117((((Node) ((Class293) this).aNode_3434).prev), 41, class293_1_);
        if (i != -2)
            aBoolean3443 = true;
    }

    final boolean method3115(boolean bool) {
        anInt3429++;
        if (bool != false)
            return true;
        if (((Class293) this).aNode_3434 != ((Node) ((Class293) this).aNode_3434).prev)
            return false;
        return true;
    }

    static final void method3116(int i, int i_2_, byte i_3_) {
        anInt3428++;
        int i_4_ = 63 % ((i_3_ - 78) / 37);
        if (Class346_Sub7_Sub5_Sub2.method3699(i_2_, (byte) -22))
            Class122.method1131(6409, (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_2_]), i);
    }

    private final void method3117(Node node, int i, Class293 class293_5_) {
        anInt3426++;
        Node node_6_ = ((Node) ((Class293) this).aNode_3434).next;
        if (i <= 27)
            aBoolean3443 = true;
        ((Node) ((Class293) this).aNode_3434).next = ((Node) node).next;
        ((Node) ((Node) node).next).prev = ((Class293) this).aNode_3434;
        if (node != ((Class293) this).aNode_3434) {
            ((Node) node).next = (((Node) ((Class293) class293_5_).aNode_3434).next);
            ((Node) ((Node) node).next).prev = node;
            ((Node) ((Class293) class293_5_).aNode_3434).next = node_6_;
            ((Node) node_6_).prev = ((Class293) class293_5_).aNode_3434;
        }
    }

    public static void method3118(byte i) {
        aIncommingOpcode_3425 = null;
        aClass102_3436 = null;
        if (i <= 33)
            method3122(69, (byte) -63, -7L);
    }

    final Node method3119(int i) {
        anInt3442++;
        if (i != 2)
            aNode_3444 = null;
        Node node = ((Node) ((Class293) this).aNode_3434).prev;
        if (node == ((Class293) this).aNode_3434) {
            aNode_3444 = null;
            return null;
        }
        aNode_3444 = ((Node) node).prev;
        return node;
    }

    final Node method3120(int i) {
        anInt3440++;
        if (i != 17833)
            return null;
        Node node = aNode_3444;
        if (((Class293) this).aNode_3434 == node) {
            aNode_3444 = null;
            return null;
        }
        aNode_3444 = ((Node) node).next;
        return node;
    }

    final void method3121(int i) {
        anInt3437++;
        if (i == 10) {
            for (; ; ) {
                Node node = (((Node) ((Class293) this).aNode_3434).prev);
                if (((Class293) this).aNode_3434 == node)
                    break;
                node.remove(true);
            }
            aNode_3444 = null;
        }
    }

    static final String method3122(int i, byte i_7_, long l) {
        Class99.method712(l, -8474);
        anInt3432++;
        if (i_7_ <= 26)
            method3122(-23, (byte) -10, 51L);
        int i_8_ = Node_Sub8_Sub9.aCalendar8968.get(5);
        int i_9_ = Node_Sub8_Sub9.aCalendar8968.get(2);
        int i_10_ = Node_Sub8_Sub9.aCalendar8968.get(1);
        if (i == 3)
            return Class144.method1304(64, i, l);
        return (Integer.toString(i_8_ / 10) + i_8_ % 10 + "-" + Class99.aStringArrayArray1277[i][i_9_] + "-" + i_10_);
    }

    public Class293() {
        ((Node) ((Class293) this).aNode_3434).next = ((Class293) this).aNode_3434;
        ((Node) ((Class293) this).aNode_3434).prev = ((Class293) this).aNode_3434;
    }
}
