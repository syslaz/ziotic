/* aa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class aa {
    static int anInt97;
    static int anInt98;
    static int anInt99;
    static int[] anIntArray100 = new int[14];
    static Class278 aClass278_101 = new Class278(10);
    static int anInt102;
    static int anInt103;
    static String aString104 = "";

    static final void method149(int i, int i_0_, int i_1_, ha var_ha, int i_2_, int i_3_, byte i_4_, Node_Sub8_Sub11 class248_sub8_sub11, int i_5_, int i_6_, int i_7_, int i_8_) {
        if (i_1_ < i_7_ && (i_6_ + i_1_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff) && (-13 + i_0_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff) && i_0_ + 3 > i_5_ && ((Node_Sub8_Sub11) class248_sub8_sub11).aBoolean9005)
            i_2_ = i_3_;
        anInt98++;
        int[] is = null;
        if (Node_Sub3.method2007(((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999, 50))
            is = (((Class321) (Class283.aClass342_3343.method3482((byte) 120, (int) ((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006))).anIntArray3761);
        else if (((Node_Sub8_Sub11) class248_sub8_sub11).anInt9003 == -1) {
            if (Node_Sub15_Sub4.method2491(-90, (((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999))) {
                Node_Sub10 class248_sub10 = ((Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) (int) ((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006, (byte) 31)));
                if (class248_sub10 != null) {
                    NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                    Class255 class255 = (((NPC) NPC).aClass255_10614);
                    if (((Class255) class255).anIntArray2923 != null)
                        class255 = class255.method2737((byte) 84, (Node_Sub43.aClass291_7306));
                    if (class255 != null)
                        is = ((Class255) class255).anIntArray2905;
                }
            } else if (Class290.method3093(((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999, (byte) 105)) {
                Object object = null;
                ObjectDefinition class266;
                if ((((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999 ^ 0xffffffff) == -1010)
                    class266 = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -81, (int) (((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006)));
                else
                    class266 = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -8, (int) (0x7fffffffL & (((Node_Sub8_Sub11) class248_sub8_sub11).aLong9006) >>> 1592237664)));
                if (((ObjectDefinition) class266).anIntArray3049 != null)
                    class266 = class266.method2797(Node_Sub43.aClass291_7306, 125);
                if (class266 != null)
                    is = ((ObjectDefinition) class266).anIntArray3029;
            }
        } else
            is = (((Class321) Class283.aClass342_3343.method3482((byte) 122, (((Node_Sub8_Sub11) class248_sub8_sub11).anInt9003))).anIntArray3761);
        String string = Class101.method718(99, class248_sub8_sub11);
        if (is != null)
            string += Class357.method3792(26, is);
        if (i_4_ < 2)
            method149(-96, -6, -88, null, -7, 0, (byte) -3, null, -112, 109, 23, 112);
        Node_Sub14_Sub27.aClass48_9449.method374(Node_Sub14_Sub21.anIntArray9380, i_2_, false, string, 0, i_1_ - -3, i_0_, Node_Sub14_Sub11.aClass129Array9254);
        if (((Node_Sub8_Sub11) class248_sub8_sub11).aBoolean8995)
            Class238_Sub3.aClass129_6773.method1168(5 + i_1_ + Class264.aClass285_2996.method3068(-1, string), -12 + i_0_);
    }

    static final void method150(int i) {
        if (i != 21068)
            aClass278_101 = null;
        anInt97++;
        synchronized (Node_Sub14_Sub2.aClass278_9175) {
            Node_Sub14_Sub2.aClass278_9175.method2872((byte) -78);
        }
        synchronized (Node_Sub14_Sub15.aClass278_9325) {
            Node_Sub14_Sub15.aClass278_9325.method2872((byte) -78);
        }
    }

    static final void method151(Object[] objects, int i, long[] ls, int i_9_, byte i_10_) {
        if ((i_9_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
            int i_11_ = (i + i_9_) / 2;
            int i_12_ = i;
            long l = ls[i_11_];
            ls[i_11_] = ls[i_9_];
            ls[i_9_] = l;
            Object object = objects[i_11_];
            objects[i_11_] = objects[i_9_];
            objects[i_9_] = object;
            int i_13_ = (l ^ 0xffffffffffffffffL) == -9223372036854775808L ? 0 : 1;
            for (int i_14_ = i; i_9_ > i_14_; i_14_++) {
                if ((long) (i_14_ & i_13_) + l > ls[i_14_]) {
                    long l_15_ = ls[i_14_];
                    ls[i_14_] = ls[i_12_];
                    ls[i_12_] = l_15_;
                    Object object_16_ = objects[i_14_];
                    objects[i_14_] = objects[i_12_];
                    objects[i_12_++] = object_16_;
                }
            }
            ls[i_9_] = ls[i_12_];
            ls[i_12_] = l;
            objects[i_9_] = objects[i_12_];
            objects[i_12_] = object;
            method151(objects, i, ls, -1 + i_12_, (byte) -90);
            method151(objects, 1 + i_12_, ls, i_9_, (byte) -103);
        }
        anInt102++;
        if (i_10_ > -71)
            method152(24, 110, -26);
    }

    static final boolean method152(int i, int i_17_, int i_18_) {
        anInt99++;
        if (i_18_ != 24048)
            method154(41, -103, -104, null);
        if ((0x20 & i_17_ ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    public static void method153(int i) {
        aString104 = null;
        anIntArray100 = null;
        if (i > -60)
            anIntArray100 = null;
        aClass278_101 = null;
    }

    static final Animable method154(int i, int i_19_, int i_20_, Class var_class) {
        Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_19_][i_20_];
        if (class137 == null)
            return null;
        for (Class49 class49 = ((Class137) class137).aClass49_1649; class49 != null; class49 = ((Class49) class49).aClass49_660) {
            Animable animable = ((Class49) class49).aAnimable_656;
            if (var_class.isAssignableFrom(animable.getClass()) && (((Animable) animable).x1 == i_19_) && (((Animable) animable).y1 == i_20_))
                return animable;
        }
        return null;
    }

    public aa() {
        /* empty */
    }

    static final void method155(byte i) {
        anInt103++;
        if (i != 41)
            method152(42, 92, -77);
        if (Class122.aClass229ArrayArray1524 != null) {
            for (int i_21_ = 0; ((Class122.aClass229ArrayArray1524.length ^ 0xffffffff) < (i_21_ ^ 0xffffffff)); i_21_++) {
                for (int i_22_ = 0; ((Class122.aClass229ArrayArray1524[i_21_].length ^ 0xffffffff) < (i_22_ ^ 0xffffffff)); i_22_++)
                    Class122.aClass229ArrayArray1524[i_21_][i_22_] = Node_Sub18.aClass229_7016;
            }
        }
    }
}
