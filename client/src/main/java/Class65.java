/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class65 {
    static int anInt875;
    static int anInt876;
    static int anInt877;
    static int anInt878;
    static int anInt879;
    static int anInt880;
    static int anInt881;
    private long aLong882;
    static int anInt883;
    static int anInt884;
    static short aShort885 = 1;
    Node[] aNodeArray886;
    static int anInt887;
    static int anInt888;
    static int anInt889;
    private Node aNode_890;
    static int anInt891;
    static int anInt892;
    static int anInt893;
    static int anInt894;
    int anInt895;
    private Node aNode_896;
    private int anInt897 = 0;

    final Node method501(long l, byte i) {
        aLong882 = l;
        anInt880++;
        Node node = (((Class65) this).aNodeArray886[(int) (l & (long) (-1 + ((Class65) this).anInt895))]);
        for (aNode_890 = ((Node) node).prev; node != aNode_890; aNode_890 = ((Node) aNode_890).prev) {
            if ((l ^ 0xffffffffffffffffL) == (((Node) aNode_890).id ^ 0xffffffffffffffffL)) {
                Node node_0_ = aNode_890;
                aNode_890 = ((Node) aNode_890).prev;
                return node_0_;
            }
        }
        aNode_890 = null;
        if (i != 31)
            aShort885 = (short) 15;
        return null;
    }

    static final void method502(byte i) {
        Class154.loginType = 1;
        Class312.anInt3627 = -1;
        if (i <= -46) {
            anInt893++;
            long l = 0L;
            if (ByteStream.aString6879 != null) {
                ByteStream class248_sub9 = (new ByteStream(Class110.method767(1, (Node_Sub11_Sub1.method2251(256, ByteStream.aString6879)))));
                l = class248_sub9.readLong(1237129056);
                za_Sub1.aLong9803 = class248_sub9.readLong(1237129056);
            } else {
                Class84_Sub1.method605(35, (byte) -111);
                return;
            }
            Class42.method307(true, "", (byte) 16, Class230.method1837(l, 13754));
        }
    }

    static final int method503(byte i, int i_1_, int i_2_) {
        anInt887++;
        int i_3_ = (Class158.method1394(i_1_ - -91923, 45365 + i_2_, 4, false) + -128 - (-(Class158.method1394(i_1_ - -37821, 10294 + i_2_, 2, false) - 128 >> -1756507871) - (Class158.method1394(i_1_, i_2_, 1, false) - 128 >> 1340973314)));
        i_3_ = 35 + (int) (0.3 * (double) i_3_);
        if (i < 81)
            method514(null, 43, null, null, null);
        if ((i_3_ ^ 0xffffffff) <= -11) {
            if ((i_3_ ^ 0xffffffff) < -61)
                i_3_ = 60;
        } else
            i_3_ = 10;
        return i_3_;
    }

    final void method504(int i) {
        for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (((Class65) this).anInt895 ^ 0xffffffff); i_4_++) {
            Node node = ((Class65) this).aNodeArray886[i_4_];
            for (; ; ) {
                Node node_5_ = ((Node) node).prev;
                if (node == node_5_)
                    break;
                node_5_.remove(true);
            }
        }
        anInt876++;
        if (i == -1) {
            aNode_890 = null;
            aNode_896 = null;
        }
    }

    final int method505(int i) {
        if (i != -1)
            ((Class65) this).aNodeArray886 = null;
        anInt891++;
        return ((Class65) this).anInt895;
    }

    static final boolean method506(int i, int i_6_) {
        if (i_6_ != -3)
            return true;
        anInt881++;
        for (Node_Sub8_Sub11 class248_sub8_sub11 = (Node_Sub8_Sub11) Class358.aClass293_4424.method3119(2); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3107(i_6_ ^ 0x7c))) {
            if (Node_Sub15_Sub4.method2491(-38, ((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999) && (((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006 ^ 0xffffffffffffffffL) == ((long) i ^ 0xffffffffffffffffL))
                return true;
        }
        return false;
    }

    final Node method507(byte i) {
        anInt883++;
        if (aNode_890 == null)
            return null;
        Node node = (((Class65) this).aNodeArray886[(int) (aLong882 & (long) (((Class65) this).anInt895 - 1))]);
        int i_7_ = 78 % ((-10 - i) / 59);
        for (/**/; aNode_890 != node; aNode_890 = ((Node) aNode_890).prev) {
            if ((((Node) aNode_890).id ^ 0xffffffffffffffffL) == (aLong882 ^ 0xffffffffffffffffL)) {
                Node node_8_ = aNode_890;
                aNode_890 = ((Node) aNode_890).prev;
                return node_8_;
            }
        }
        aNode_890 = null;
        return null;
    }

    final int method508(Node[] nodes, boolean bool) {
        if (bool != true)
            method508(null, false);
        anInt879++;
        int i = 0;
        for (int i_9_ = 0; ((Class65) this).anInt895 > i_9_; i_9_++) {
            Node node = ((Class65) this).aNodeArray886[i_9_];
            for (Node node_10_ = ((Node) node).prev; node_10_ != node; node_10_ = ((Node) node_10_).prev)
                nodes[i++] = node_10_;
        }
        return i;
    }

    final void method509(int i, Node node, long configId) {
        if (((Node) node).next != null)
            node.remove(true);
        anInt889++;
        Node node_11_ = (((Class65) this).aNodeArray886[(int) (configId & (long) (i + ((Class65) this).anInt895))]);
        ((Node) node).prev = node_11_;
        ((Node) node).next = ((Node) node_11_).next;
        ((Node) ((Node) node).next).prev = node;
        ((Node) node).id = configId;
        ((Node) ((Node) node).prev).next = node;
    }

    final Node method510(boolean bool) {
        anInt897 = 0;
        anInt892++;
        if (bool != true)
            return null;
        return method512(false);
    }

    static final void method511(int i, Entity entity) {
        anInt875++;
        if ((((Entity) entity).anIntArray10430) != null || (((Entity) entity).anIntArray10425) != null) {
            boolean bool = true;
            for (int i_12_ = 0; i_12_ < (((Entity) entity).anIntArray10430).length; i_12_++) {
                int i_13_ = -1;
                if ((((Entity) entity).anIntArray10430) != null)
                    i_13_ = (((Entity) entity).anIntArray10430[i_12_]);
                if ((i_13_ ^ 0xffffffff) == 0) {
                    if (!entity.method3635(-1, i_12_, i ^ ~0x39b8))
                        bool = false;
                } else {
                    bool = false;
                    boolean bool_14_ = false;
                    boolean bool_15_ = false;
                    int i_16_;
                    int i_17_;
                    if ((~0x3fffffff & i_13_ ^ 0xffffffff) != 1073741823) {
                        if ((i_13_ & 0x8000) == 0) {
                            Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_13_, (byte) 31));
                            if (class248_sub10 == null) {
                                entity.method3635(-1, i_12_, 200);
                                continue;
                            }
                            NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                            i_17_ = ((((Interactable) entity).y) + -(((Interactable) NPC).y));
                            i_16_ = (-((Interactable) NPC).x + (((Interactable) entity).x));
                        } else {
                            int i_18_ = i_13_ & 0x7fff;
                            Player player = (Node_Sub32.aPlayerArray7197[i_18_]);
                            if (player != null) {
                                i_16_ = (((Interactable) entity).x + -(((Interactable) player).x));
                                i_17_ = (-(((Interactable) player).y) + ((Interactable) entity).y);
                            } else {
                                entity.method3635(-1, i_12_, 200);
                                continue;
                            }
                        }
                    } else {
                        int i_19_ = 0xfffffff & i_13_;
                        int i_20_ = i_19_ >> 2095052718;
                        i_16_ = ((((Interactable) entity).x) - 256 - (-Class67.baseX + i_20_) * 512);
                        int i_21_ = i_19_ & 0x3fff;
                        i_17_ = (-((i_21_ - Class368.baseY) * 512) + (-256 + (((Interactable) entity).y)));
                    }
                    if ((i_16_ ^ 0xffffffff) != -1 || i_17_ != 0)
                        entity.method3635(0x3fff & (int) (2607.5945876176133 * Math.atan2((double) i_16_, (double) i_17_)), i_12_, 200);
                }
            }
            if (i == -14705) {
                if (bool) {
                    ((Entity) entity).anIntArray10425 = null;
                    ((Entity) entity).anIntArray10430 = null;
                }
            }
        }
    }

    final Node method512(boolean bool) {
        anInt888++;
        if (anInt897 > 0 && (((Class65) this).aNodeArray886[-1 + anInt897] != aNode_896)) {
            Node node = aNode_896;
            aNode_896 = ((Node) node).prev;
            return node;
        }
        if (bool != false)
            aLong882 = -39L;
        while ((((Class65) this).anInt895 ^ 0xffffffff) < (anInt897 ^ 0xffffffff)) {
            Node node = (((Node) ((Class65) this).aNodeArray886[anInt897++]).prev);
            if (node != ((Class65) this).aNodeArray886[-1 + anInt897]) {
                aNode_896 = ((Node) node).prev;
                return node;
            }
        }
        return null;
    }

    final int method513(byte i) {
        anInt877++;
        int i_22_ = 0;
        if (i != 32)
            ((Class65) this).aNodeArray886 = null;
        for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (((Class65) this).anInt895 ^ 0xffffffff); i_23_++) {
            Node node = ((Class65) this).aNodeArray886[i_23_];
            Node node_24_ = ((Node) node).prev;
            while (node != node_24_) {
                node_24_ = ((Node) node_24_).prev;
                i_22_++;
            }
        }
        return i_22_;
    }

    static final void method514(int[] is, int i, int[] is_25_, Player player, int[] is_26_) {
        for (int i_27_ = i; i_27_ < is_26_.length; i_27_++) {
            int i_28_ = is_26_[i_27_];
            int i_29_ = is_25_[i_27_];
            int i_30_ = is[i_27_];
            for (int i_31_ = 0; ((i_29_ ^ 0xffffffff) != -1 && (i_31_ ^ 0xffffffff) > ((((Entity) player).aClass286Array10463).length ^ 0xffffffff)); i_31_++) {
                if ((0x1 & i_29_ ^ 0xffffffff) != -1) {
                    if ((i_28_ ^ 0xffffffff) == 0)
                        ((Entity) player).aClass286Array10463[i_31_] = null;
                    else {
                        Class182 class182 = Class235.aClass356_2617.method3790((byte) -90, i_28_);
                        int i_32_ = ((Class182) class182).anInt2102;
                        Class286 class286 = (((Entity) player).aClass286Array10463[i_31_]);
                        if (class286 != null) {
                            if (i_28_ == ((Class286) class286).anInt3379) {
                                if ((i_32_ ^ 0xffffffff) != -1) {
                                    if ((i_32_ ^ 0xffffffff) == -2) {
                                        ((Class286) class286).anInt3374 = 0;
                                        ((Class286) class286).anInt3378 = 1;
                                        ((Class286) class286).anInt3377 = 0;
                                        ((Class286) class286).anInt3376 = i_30_;
                                        ((Class286) class286).anInt3373 = 0;
                                        if (!((Entity) player).aBoolean10439)
                                            Class158.method1396(class182, 0, player, true);
                                    } else if ((i_32_ ^ 0xffffffff) == -3)
                                        ((Class286) class286).anInt3377 = 0;
                                } else
                                    class286 = ((Entity) player).aClass286Array10463[i_31_] = null;
                            } else if (((Class182) class182).anInt2101 >= (((Class182) (Class235.aClass356_2617.method3790((byte) -90, (((Class286) class286).anInt3379)))).anInt2101))
                                class286 = ((Entity) player).aClass286Array10463[i_31_] = null;
                        }
                        if (class286 == null) {
                            class286 = ((Entity) player).aClass286Array10463[i_31_] = new Class286();
                            ((Class286) class286).anInt3373 = 0;
                            ((Class286) class286).anInt3374 = 0;
                            ((Class286) class286).anInt3378 = 1;
                            ((Class286) class286).anInt3376 = i_30_;
                            ((Class286) class286).anInt3379 = i_28_;
                            ((Class286) class286).anInt3377 = 0;
                            if (!((Entity) player).aBoolean10439)
                                Class158.method1396(class182, 0, player, true);
                        }
                    }
                }
                i_29_ >>>= 1;
            }
        }
        anInt884++;
    }

    Class65(int i) {
        ((Class65) this).aNodeArray886 = new Node[i];
        ((Class65) this).anInt895 = i;
        for (int i_33_ = 0; (i ^ 0xffffffff) < (i_33_ ^ 0xffffffff); i_33_++) {
            Node node = ((Class65) this).aNodeArray886[i_33_] = new Node();
            ((Node) node).prev = node;
            ((Node) node).next = node;
        }
    }

    static {
        anInt878 = -1;
        anInt894 = 0;
    }
}
