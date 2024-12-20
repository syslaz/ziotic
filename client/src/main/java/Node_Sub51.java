/* Class248_Sub51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub51 extends Node {
    boolean aBoolean7453;
    Node_Sub15_Sub2 aClass248_Sub15_Sub2_7454;
    Node_Sub31_Sub1 aClass248_Sub31_Sub1_7455;
    ObjectDefinition aClass266_7456;
    static int anInt7457;
    boolean aBoolean7458;
    NPC aNPC_7459;
    Node_Sub15_Sub2 aClass248_Sub15_Sub2_7460;
    int anInt7461;
    int anInt7462;
    Player aPlayer_7463;
    int anInt7464;
    int anInt7465;
    int anInt7466;
    int anInt7467 = 0;
    static int anInt7468;
    int anInt7469;
    int anInt7470;
    static int anInt7471;
    int[] anIntArray7472;
    int anInt7473;
    int anInt7474;
    int anInt7475;
    int anInt7476;
    Node_Sub34 aClass248_Sub34_7477;
    int anInt7478;
    int anInt7479;
    int anInt7480;
    boolean aBoolean7481;
    Node_Sub34 aClass248_Sub34_7482;
    Node_Sub31_Sub1 aClass248_Sub31_Sub1_7483;

    static final int method2682(byte i) {
        anInt7457++;
        int i_0_;
        if ((Class75.anInt977 ^ 0xffffffff) > -97) {
            i_0_ = 1;
            Node.method1968(1, true);
        } else {
            int i_1_ = Interactable.method3565((byte) 63);
            if (i_1_ <= 100) {
                i_0_ = 4;
                Class311.method3265((byte) -95);
            } else if (i_1_ > 500) {
                if (i_1_ > 1000) {
                    i_0_ = 1;
                    Node.method1968(1, true);
                } else {
                    Class238_Sub2.method1888((byte) -118);
                    i_0_ = 2;
                }
            } else {
                Node_Sub14_Sub12_Sub1.method2310(0);
                i_0_ = 3;
            }
        }
        if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) != 0) {
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322), (byte) -71, 0);
            Node_Sub15_Sub5.method2495(false, -110, 0);
        }
        if (i != 62)
            return -18;
        Class293.method3113(17458);
        return i_0_;
    }

    final void method2683(int i) {
        anInt7471++;
        int i_2_ = ((Node_Sub51) this).anInt7462;
        boolean bool = ((Node_Sub51) this).aBoolean7481;
        if (((Node_Sub51) this).aClass266_7456 == null) {
            if (((Node_Sub51) this).aNPC_7459 == null) {
                if (((Node_Sub51) this).aPlayer_7463 != null) {
                    ((Node_Sub51) this).anInt7462 = (Node_Sub8.method2024((((Node_Sub51) this).aPlayer_7463), (byte) 23));
                    ((Node_Sub51) this).anInt7473 = 256;
                    ((Node_Sub51) this).anInt7480 = ((Player) (((Node_Sub51) this).aPlayer_7463)).anInt10566;
                    ((Node_Sub51) this).anInt7464 = (((Player) (((Node_Sub51) this).aPlayer_7463)).anInt10553 << 214139785);
                    ((Node_Sub51) this).aBoolean7481 = (((Player) (((Node_Sub51) this).aPlayer_7463)).aBoolean10570);
                    ((Node_Sub51) this).anInt7465 = 0;
                    ((Node_Sub51) this).anInt7478 = 256;
                }
            } else {
                int i_3_ = Class85.method637((((Node_Sub51) this).aNPC_7459), (byte) 116);
                if ((i_2_ ^ 0xffffffff) != (i_3_ ^ 0xffffffff)) {
                    ((Node_Sub51) this).anInt7462 = i_3_;
                    Class255 class255 = (((NPC) (((Node_Sub51) this).aNPC_7459)).aClass255_10614);
                    if (((Class255) class255).anIntArray2923 != null)
                        class255 = class255.method2737((byte) 121, (Node_Sub43.aClass291_7306));
                    if (class255 != null) {
                        ((Node_Sub51) this).anInt7473 = ((Class255) class255).anInt2901;
                        ((Node_Sub51) this).aBoolean7481 = ((Class255) class255).aBoolean2882;
                        ((Node_Sub51) this).anInt7465 = ((Class255) class255).anInt2874 << -922134263;
                        ((Node_Sub51) this).anInt7478 = ((Class255) class255).anInt2884;
                        ((Node_Sub51) this).anInt7464 = ((Class255) class255).anInt2891 << -1409991511;
                        ((Node_Sub51) this).anInt7480 = ((Class255) class255).anInt2862;
                    } else {
                        ((Node_Sub51) this).anInt7473 = 256;
                        ((Node_Sub51) this).anInt7480 = ((Node_Sub51) this).anInt7464 = ((Node_Sub51) this).anInt7465 = 0;
                        ((Node_Sub51) this).anInt7478 = 256;
                        ((Node_Sub51) this).aBoolean7481 = ((Class255) (((NPC) (((Node_Sub51) this).aNPC_7459)).aClass255_10614)).aBoolean2882;
                    }
                }
            }
        } else {
            ObjectDefinition class266 = ((Node_Sub51) this).aClass266_7456.method2797(Node_Sub43.aClass291_7306, 127);
            if (class266 != null) {
                ((Node_Sub51) this).anInt7480 = ((ObjectDefinition) class266).anInt3095;
                ((Node_Sub51) this).anInt7462 = ((ObjectDefinition) class266).anInt3092;
                ((Node_Sub51) this).anIntArray7472 = ((ObjectDefinition) class266).anIntArray3046;
                ((Node_Sub51) this).anInt7464 = ((ObjectDefinition) class266).anInt3028 << 631245833;
                ((Node_Sub51) this).anInt7473 = ((ObjectDefinition) class266).anInt3050;
                ((Node_Sub51) this).aBoolean7481 = ((ObjectDefinition) class266).aBoolean3079;
                ((Node_Sub51) this).anInt7470 = ((ObjectDefinition) class266).anInt3018;
                ((Node_Sub51) this).aBoolean7453 = ((ObjectDefinition) class266).aBoolean3104;
                ((Node_Sub51) this).anInt7478 = ((ObjectDefinition) class266).anInt3070;
                ((Node_Sub51) this).anInt7476 = ((ObjectDefinition) class266).anInt3078;
            } else {
                ((Node_Sub51) this).aBoolean7453 = false;
                ((Node_Sub51) this).anInt7480 = 0;
                ((Node_Sub51) this).anInt7478 = 256;
                ((Node_Sub51) this).anIntArray7472 = null;
                ((Node_Sub51) this).anInt7476 = 0;
                ((Node_Sub51) this).anInt7464 = 0;
                ((Node_Sub51) this).aBoolean7481 = false;
                ((Node_Sub51) this).anInt7465 = 0;
                ((Node_Sub51) this).anInt7470 = 0;
                ((Node_Sub51) this).anInt7473 = 256;
                ((Node_Sub51) this).anInt7462 = -1;
            }
        }
        if (i != 256)
            ((Node_Sub51) this).aClass248_Sub34_7482 = null;
        if (((i_2_ ^ 0xffffffff) != (((Node_Sub51) this).anInt7462 ^ 0xffffffff) || bool == !((Node_Sub51) this).aBoolean7481) && ((Node_Sub51) this).aClass248_Sub15_Sub2_7460 != null) {
            Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Node_Sub51) this).aClass248_Sub15_Sub2_7460);
            ((Node_Sub51) this).aClass248_Sub15_Sub2_7460 = null;
            ((Node_Sub51) this).aClass248_Sub31_Sub1_7483 = null;
            ((Node_Sub51) this).aClass248_Sub34_7482 = null;
        }
    }

    static final void method2684(int i) {
        if (Node_Sub8_Sub3.aClass345_8922 != null)
            Node_Sub8_Sub3.aClass345_8922.method3527(-127);
        anInt7468++;
        if (i == -1409991511) {
            if (Class177.aClass345_2069 != null)
                Class177.aClass345_2069.method3527(-120);
        }
    }

    public Node_Sub51() {
        /* empty */
    }
}
