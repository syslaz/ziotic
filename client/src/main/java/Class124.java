/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class124 {
    int anInt1529;
    static int anInt1530;
    Class124 aClass124_1531;
    static int anInt1532;
    Viewport aViewport_1533;
    static IncommingOpcode aIncommingOpcode_1534 = new IncommingOpcode(119, 6);
    int anInt1535;
    int anInt1536;
    int anInt1537;
    static int anInt1538;
    static int anInt1539;
    static int anInt1540;
    static int anInt1541;
    int anInt1542;
    static int anInt1543;
    /*synthetic*/ static Class aClass1544;

    final Class124 method1137(int i, int i_0_) {
        anInt1532++;
        if (i_0_ <= 37)
            method1142(102);
        return new Class124(((Class124) this).anInt1537, i);
    }

    public static void method1138(int i) {
        int i_1_ = -6 / ((i - 12) / 49);
        aIncommingOpcode_1534 = null;
    }

    static final void updateCamera(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        Class282_Sub6.anInt7653 = i;
        Class84_Sub5.anInt5421 = i_3_;
        Class1.cameraXMovement = i_5_;
        int i_7_ = -3 / ((78 - i_6_) / 46);
        Class84_Sub2.cameraMovementY = i_2_;
        anInt1539++;
        Class281.cameraZMovement = i_4_;
        if (Class84_Sub5.anInt5421 >= 100) {
            int posNegX = 512 * Class1.cameraXMovement + 256;
            int posNegZ = 512 * Class281.cameraZMovement + 256;
            int posNegY = (Class353.method3753(posNegZ, posNegX, -30, Class177.anInt2074) - Class84_Sub2.cameraMovementY);
            int posXVar = posNegX - Class346_Sub7_Sub1.cameraPosX;
            int posYVar = posNegY - InputStream_Sub1.cameraPosY;
            int posZVar = posNegZ - Class316_Sub1_Sub2.cameraPosZ;
            int posXZVar = (int) Math.sqrt((double) (posXVar * posXVar + (posZVar * posZVar)));
            Class127.cameraPitch = 0x3fff & (int) (Math.atan2((double) posYVar, (double) posXZVar) * 2607.5945876176133);
            Class301_Sub3_Sub1.cameraYaw = 0x3fff & (int) (Math.atan2((double) posXVar, (double) posZVar) * -2607.5945876176133);
            Class346_Sub5_Sub1.anInt9886 = 0;
            if (Class127.cameraPitch < 1024)
                Class127.cameraPitch = 1024;
            if (Class127.cameraPitch > 3072)
                Class127.cameraPitch = 3072;
        }
        Node_Sub14_Sub21.anInt9379 = Class359.anInt4436 = -1;
        Node_Sub45.anInt7343 = 2;
    }

    static final void method1140(Node_Sub30 class248_sub30, boolean bool) {
        anInt1541++;
        if (Class311.aClass137ArrayArrayArray3620 != null) {
            Interface16 interface16 = null;
            if (((Node_Sub30) class248_sub30).anInt7185 == 0)
                interface16 = ((Interface16) RSInterface2.method3763((((Node_Sub30) class248_sub30).anInt7184), (((Node_Sub30) class248_sub30).anInt7187), (((Node_Sub30) class248_sub30).anInt7190)));
            if (bool != false)
                method1138(106);
            if (((Node_Sub30) class248_sub30).anInt7185 == 1)
                interface16 = ((Interface16) (Node_Sub19.method2517(((Node_Sub30) class248_sub30).anInt7184, ((Node_Sub30) class248_sub30).anInt7187, ((Node_Sub30) class248_sub30).anInt7190)));
            if ((((Node_Sub30) class248_sub30).anInt7185 ^ 0xffffffff) == -3)
                interface16 = ((Interface16) (aa.method154(((Node_Sub30) class248_sub30).anInt7184, ((Node_Sub30) class248_sub30).anInt7187, ((Node_Sub30) class248_sub30).anInt7190, (aClass1544 != null ? aClass1544 : (aClass1544 = method1145("Interface16"))))));
            if (((Node_Sub30) class248_sub30).anInt7185 == 3)
                interface16 = ((Interface16) (Class346_Sub7_Sub1.method3584(((Node_Sub30) class248_sub30).anInt7184, ((Node_Sub30) class248_sub30).anInt7187, ((Node_Sub30) class248_sub30).anInt7190)));
            if (interface16 != null) {
                ((Node_Sub30) class248_sub30).anInt7188 = interface16.method40((byte) 73);
                ((Node_Sub30) class248_sub30).anInt7177 = interface16.method46((byte) 43);
                ((Node_Sub30) class248_sub30).anInt7179 = interface16.method43((byte) -111);
            } else {
                ((Node_Sub30) class248_sub30).anInt7177 = 0;
                ((Node_Sub30) class248_sub30).anInt7188 = -1;
                ((Node_Sub30) class248_sub30).anInt7179 = 0;
            }
        }
    }

    static final boolean method1141(Interface16 interface16, byte i) {
        anInt1543++;
        ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -109, interface16.method40((byte) 97));
        if (i <= 33)
            aIncommingOpcode_1534 = null;
        if ((((ObjectDefinition) class266).anInt3036 ^ 0xffffffff) == 0)
            return true;
        Class61 class61 = Class19.aClass39_302.method293(((ObjectDefinition) class266).anInt3036, 118);
        if (((Class61) class61).anInt825 == -1)
            return true;
        return class61.method475((byte) 80);
    }

    final Class303 method1142(int i) {
        if (i != 0)
            return null;
        anInt1530++;
        return Node_Sub45.method2642(i ^ 0x77, ((Class124) this).anInt1537);
    }

    static final int method1143(boolean bool, Class145 class145, ha var_ha) {
        anInt1538++;
        if ((((Class145) class145).anInt1712 ^ 0xffffffff) != 0)
            return ((Class145) class145).anInt1712;
        if ((((Class145) class145).anInt1714 ^ 0xffffffff) != 0) {
            Class312 class312 = ((ha) var_ha).aD1414.method25(((Class145) class145).anInt1714, (byte) 124);
            if (!((Class312) class312).aBoolean3622)
                return ((Class312) class312).aShort3634;
        }
        if (bool != true)
            method1143(true, null, null);
        return ((Class145) class145).anInt1720;
    }

    static final void method1144(int i, ha var_ha) {
        for (Class346_Sub8 class346_sub8 = ((Class346_Sub8) Node_Sub2_Sub3.aClass360_8861.method3815((byte) 98)); class346_sub8 != null; class346_sub8 = (Class346_Sub8) Node_Sub2_Sub3.aClass360_8861.method3809(-24951)) {
            if (((Class346_Sub8) class346_sub8).aBoolean8341)
                class346_sub8.method3707(var_ha);
        }
        int i_15_ = -66 / ((59 - i) / 53);
        anInt1540++;
    }

    Class124(int i, int i_16_) {
        ((Class124) this).anInt1537 = i;
        ((Class124) this).anInt1529 = i_16_;
    }

    /*synthetic*/
    static Class method1145(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
