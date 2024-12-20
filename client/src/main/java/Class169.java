/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class169 {
    static Class208 aClass208_1973 = new Class208(8, 1);
    private ha_Sub3_Sub1 aHa_Sub3_Sub1_1974;
    static int anInt1975;
    static int anInt1976;
    static int anInt1977;
    long aLong1978;
    static IncommingOpcode aIncommingOpcode_1979 = new IncommingOpcode(10, -1);

    static final void method1547(int i, ha var_ha) {
        anInt1976++;
        if (Class225_Sub3.aClass293_8475.method3112(i ^ i) != 0) {
            if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) == 0) {
                for (Node_Sub27 class248_sub27 = ((Node_Sub27) Class225_Sub3.aClass293_8475.method3119(2)); class248_sub27 != null; class248_sub27 = ((Node_Sub27) Class225_Sub3.aClass293_8475.method3107(-128))) {
                    Class283.aClass342_3343.method3486(false, (!((Node_Sub27) class248_sub27).aBoolean7153 ? null : (((Player) Class347.myPlayer).aClass332_10549)), var_ha, false, ((Node_Sub27) class248_sub27).anInt7152, var_ha, 43, ((Node_Sub27) class248_sub27).anInt7154, ((Node_Sub27) class248_sub27).anInt7155, Class168.aClass48_1968, ((Node_Sub27) class248_sub27).anInt7159, ((Node_Sub27) class248_sub27).anInt7157);
                    class248_sub27.remove(true);
                }
                Class60.method472(-101);
            } else {
                if (Class6.aHa154 == null) {
                    Canvas canvas = new Canvas();
                    canvas.setSize(36, 32);
                    Class6.aHa154 = Class32.method272(0, 0, 0, Node_Sub14_Sub18.aD9354, Node_Sub3.aClass381_6826, canvas);
                    s.aClass48_3471 = (Class6.aHa154.a(Class32.method273(0, -127, Class293.anInt3438, Class168.aClass381_1972), Class157.method1392(Class290.aClass381_3417, Class293.anInt3438, 0), true));
                }
                for (Node_Sub27 class248_sub27 = (Node_Sub27) Class225_Sub3.aClass293_8475.method3119(i + -26158); class248_sub27 != null; class248_sub27 = ((Node_Sub27) Class225_Sub3.aClass293_8475.method3107(-128))) {
                    Class283.aClass342_3343.method3486(false, (((Node_Sub27) class248_sub27).aBoolean7153 ? (((Player) Class347.myPlayer).aClass332_10549) : null), var_ha, false, ((Node_Sub27) class248_sub27).anInt7152, Class6.aHa154, 49, ((Node_Sub27) class248_sub27).anInt7154, ((Node_Sub27) class248_sub27).anInt7155, s.aClass48_3471, ((Node_Sub27) class248_sub27).anInt7159, ((Node_Sub27) class248_sub27).anInt7157);
                    class248_sub27.remove(true);
                }
            }
        }
    }

    public static void method1548(byte i) {
        aClass208_1973 = null;
        if (i != -85)
            method1548((byte) -70);
        aIncommingOpcode_1979 = null;
    }

    protected final void finalize() throws Throwable {
        anInt1975++;
        aHa_Sub3_Sub1_1974.method1058((byte) -93, ((Class169) this).aLong1978);
        super.finalize();
    }

    Class169(ha_Sub3_Sub1 var_ha_Sub3_Sub1, long l, Class188[] class188s) {
        aHa_Sub3_Sub1_1974 = var_ha_Sub3_Sub1;
        ((Class169) this).aLong1978 = l;
    }
}
