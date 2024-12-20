/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class84 {
    static int anInt1035;
    ha_Sub2 aHa_Sub2_1036;

    abstract void method597(boolean bool);

    static final void method598(byte i, RSInterface2 class354, ha var_ha) {
        anInt1035++;
        boolean bool = ((Class283.aClass342_3343.method3484(i + -5, ~0xffffff | ((RSInterface2) class354).anInt4340, ((RSInterface2) class354).id, var_ha, ((RSInterface2) class354).anInt4299, ((RSInterface2) class354).anInt4263, ((RSInterface2) class354).anInt4268, (!((RSInterface2) class354).aBoolean4312 ? null : (((Player) Class347.myPlayer).aClass332_10549)))) == null);
        if (bool) {
            Class225_Sub3.aClass293_8475.method3109(new Node_Sub27(((RSInterface2) class354).id, ((RSInterface2) class354).anInt4263, ((RSInterface2) class354).anInt4299, (((RSInterface2) class354).anInt4340 | ~0xffffff), ((RSInterface2) class354).anInt4268, ((RSInterface2) class354).aBoolean4312), -122);
            Class376.method3882(class354, 2260);
        }
        if (i == -117) {
            /* empty */
        }
    }

    abstract void method599(byte i, boolean bool);

    abstract boolean method600(int i);

    abstract void method601(int i, int i_0_, int i_1_);

    Class84(ha_Sub2 var_ha_Sub2) {
        ((Class84) this).aHa_Sub2_1036 = var_ha_Sub2;
    }

    abstract void method602(boolean bool, byte i);

    abstract void method603(byte i, int i_2_, Class136 class136);
}
