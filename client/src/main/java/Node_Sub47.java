/* Class248_Sub47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub47 extends Node {
    private int anInt7396;
    int anInt7397;
    static int anInt7398;
    private int anInt7399;
    private int anInt7400;
    int anInt7401;
    static int anInt7402;
    static IncommingOpcode aIncommingOpcode_7403;
    static int anInt7404;
    int anInt7405;
    private int anInt7406;
    static int anInt7407;
    static int anInt7408;
    static String aString7409 = null;
    int anInt7410;
    static int anInt7411;
    private int anInt7412;
    static int anInt7413;
    static int anInt7414;
    static IncommingOpcode aIncommingOpcode_7415;
    static int anInt7416;

    final void method2658(int i, int i_0_, int i_1_, int[] is) {
        is[1] = i_0_ - (((Node_Sub47) this).anInt7397 + -anInt7400);
        is[i_1_] = i - ((Node_Sub47) this).anInt7410 - -anInt7412;
        anInt7408++;
        is[0] = anInt7396;
    }

    final void method2659(int[] is, int i, int i_2_, int i_3_) {
        is[2] = ((Node_Sub47) this).anInt7410 - anInt7412 + i;
        anInt7404++;
        is[1] = -anInt7400 - (-((Node_Sub47) this).anInt7397 - i_2_);
        is[0] = 0;
        int i_4_ = 39 / ((i_3_ - -75) / 37);
    }

    public static void method2660(int i) {
        if (i == -375892824) {
            aIncommingOpcode_7403 = null;
            aString7409 = null;
            aIncommingOpcode_7415 = null;
        }
    }

    final boolean method2661(int i, int i_5_, byte i_6_, int i_7_) {
        anInt7411++;
        if (i_6_ != -71)
            return true;
        if (anInt7396 == i_7_ && (anInt7400 ^ 0xffffffff) >= (i_5_ ^ 0xffffffff) && anInt7406 >= i_5_ && (i ^ 0xffffffff) <= (anInt7412 ^ 0xffffffff) && i <= anInt7399)
            return true;
        return false;
    }

    final boolean method2662(int i, int i_8_, int i_9_) {
        if (i_8_ > -76)
            return false;
        anInt7407++;
        if (i_9_ < anInt7400 || i_9_ > anInt7406 || (anInt7412 ^ 0xffffffff) < (i ^ 0xffffffff) || i > anInt7399)
            return false;
        return true;
    }

    final boolean method2663(int i, int i_10_, int i_11_) {
        anInt7413++;
        if (i != -31819)
            return false;
        if ((((Node_Sub47) this).anInt7397 ^ 0xffffffff) < (i_10_ ^ 0xffffffff) || (i_10_ ^ 0xffffffff) < (((Node_Sub47) this).anInt7401 ^ 0xffffffff) || i_11_ < ((Node_Sub47) this).anInt7410 || (i_11_ ^ 0xffffffff) < (((Node_Sub47) this).anInt7405 ^ 0xffffffff))
            return false;
        return true;
    }

    static final int method2664(boolean bool, boolean bool_12_) {
        anInt7402++;
        if (bool_12_ != false)
            aString7409 = null;
        int i = Node_Sub15_Sub4.anInt9694;
        while_217_:
        do {
            do {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2)
                            break;
                        break while_217_;
                    }
                } else {
                    if (!bool)
                        return Class185_Sub1.anInt6654;
                    return 0;
                }
                return Class185_Sub1.anInt6654;
            } while (false);
            return 0;
        } while (false);
        return 0;
    }

    static final void method2665(int i, int i_13_, int i_14_, int i_15_, byte i_16_) {
        anInt7414++;
        for (Node_Sub51 class248_sub51 = (Node_Sub51) Class144.aClass293_1702.method3119(2); class248_sub51 != null; class248_sub51 = (Node_Sub51) Class144.aClass293_1702.method3107(-127))
            Class215.method1738(class248_sub51, i_15_, i_14_, -1, i, i_13_);
        if (i_16_ > -21)
            method2660(76);
        for (Node_Sub51 class248_sub51 = (Node_Sub51) Class333.aClass293_3901.method3119(2); class248_sub51 != null; class248_sub51 = (Node_Sub51) Class333.aClass293_3901.method3107(-128)) {
            int i_17_ = 1;
            Class281 class281 = ((Node_Sub51) class248_sub51).aNPC_7459.method3642(0);
            if ((((Entity) (((Node_Sub51) class248_sub51).aNPC_7459)).anInt10434 ^ 0xffffffff) != 0 && !((Entity) (((Node_Sub51) class248_sub51).aNPC_7459)).aBoolean10491) {
                if (((((Class281) class281).anInt3262 ^ 0xffffffff) != (((Entity) (((Node_Sub51) class248_sub51).aNPC_7459)).anInt10434 ^ 0xffffffff)) && ((((Class281) class281).anInt3265 ^ 0xffffffff) != (((Entity) (((Node_Sub51) class248_sub51).aNPC_7459)).anInt10434 ^ 0xffffffff)) && (((Entity) (((Node_Sub51) class248_sub51).aNPC_7459)).anInt10434 != ((Class281) class281).anInt3294) && ((((Class281) class281).anInt3278 ^ 0xffffffff) != (((Entity) (((Node_Sub51) class248_sub51).aNPC_7459)).anInt10434 ^ 0xffffffff))) {
                    if (((((Entity) (((Node_Sub51) class248_sub51).aNPC_7459)).anInt10434 ^ 0xffffffff) == (((Class281) class281).anInt3276 ^ 0xffffffff)) || (((Class281) class281).anInt3316 == (((Entity) (((Node_Sub51) class248_sub51).aNPC_7459)).anInt10434)) || (((Class281) class281).anInt3310 == (((Entity) (((Node_Sub51) class248_sub51).aNPC_7459)).anInt10434)) || (((Class281) class281).anInt3264 == (((Entity) (((Node_Sub51) class248_sub51).aNPC_7459)).anInt10434)))
                        i_17_ = 3;
                } else
                    i_17_ = 2;
            } else
                i_17_ = 0;
            if ((i_17_ ^ 0xffffffff) != (((Node_Sub51) class248_sub51).anInt7467 ^ 0xffffffff)) {
                int i_18_ = Class85.method637((((Node_Sub51) class248_sub51).aNPC_7459), (byte) 99);
                Class255 class255 = (((NPC) (((Node_Sub51) class248_sub51).aNPC_7459)).aClass255_10614);
                if (((Class255) class255).anIntArray2923 != null)
                    class255 = class255.method2737((byte) 46, Node_Sub43.aClass291_7306);
                if (class255 == null || (i_18_ ^ 0xffffffff) == 0) {
                    ((Node_Sub51) class248_sub51).anInt7467 = i_17_;
                    ((Node_Sub51) class248_sub51).aBoolean7481 = false;
                    ((Node_Sub51) class248_sub51).anInt7462 = -1;
                } else if (((Node_Sub51) class248_sub51).anInt7462 == i_18_ && (((Node_Sub51) class248_sub51).aBoolean7481 == ((Class255) class255).aBoolean2882)) {
                    ((Node_Sub51) class248_sub51).anInt7467 = i_17_;
                    ((Node_Sub51) class248_sub51).anInt7480 = ((Class255) class255).anInt2862;
                } else {
                    boolean bool = false;
                    if ((((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460) == null)
                        bool = true;
                    else {
                        ((Node_Sub51) class248_sub51).anInt7480 -= 512;
                        if ((((Node_Sub51) class248_sub51).anInt7480 ^ 0xffffffff) >= -1) {
                            Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460);
                            ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 = null;
                            bool = true;
                        }
                    }
                    if (bool) {
                        ((Node_Sub51) class248_sub51).aClass248_Sub34_7482 = null;
                        ((Node_Sub51) class248_sub51).anInt7480 = ((Class255) class255).anInt2862;
                        ((Node_Sub51) class248_sub51).anInt7467 = i_17_;
                        ((Node_Sub51) class248_sub51).aClass248_Sub31_Sub1_7483 = null;
                        ((Node_Sub51) class248_sub51).aBoolean7481 = ((Class255) class255).aBoolean2882;
                        ((Node_Sub51) class248_sub51).anInt7462 = i_18_;
                    }
                }
            }
            ((Node_Sub51) class248_sub51).anInt7466 = (((Interactable) (((Node_Sub51) class248_sub51).aNPC_7459)).x);
            ((Node_Sub51) class248_sub51).anInt7475 = ((((Interactable) (((Node_Sub51) class248_sub51).aNPC_7459)).x) + (((Node_Sub51) class248_sub51).aNPC_7459.method3632(-1) << -375892824));
            ((Node_Sub51) class248_sub51).anInt7461 = (((Interactable) (((Node_Sub51) class248_sub51).aNPC_7459)).y);
            ((Node_Sub51) class248_sub51).anInt7474 = ((((Interactable) (((Node_Sub51) class248_sub51).aNPC_7459)).y) + (((Node_Sub51) class248_sub51).aNPC_7459.method3632(-1) << -525693080));
            Class215.method1738(class248_sub51, i_15_, i_14_, -1, i, i_13_);
        }
        for (Node_Sub51 class248_sub51 = (Node_Sub51) Class363.aClass65_4475.method510(true); class248_sub51 != null; class248_sub51 = (Node_Sub51) Class363.aClass65_4475.method512(false)) {
            int i_19_ = 1;
            Class281 class281 = ((Node_Sub51) class248_sub51).aPlayer_7463.method3642(0);
            if ((((Entity) (((Node_Sub51) class248_sub51).aPlayer_7463)).anInt10434 ^ 0xffffffff) != 0 && !((Entity) (((Node_Sub51) class248_sub51).aPlayer_7463)).aBoolean10491) {
                if ((((Entity) (((Node_Sub51) class248_sub51).aPlayer_7463)).anInt10434 == ((Class281) class281).anInt3262) || ((((Entity) (((Node_Sub51) class248_sub51).aPlayer_7463)).anInt10434 ^ 0xffffffff) == (((Class281) class281).anInt3265 ^ 0xffffffff)) || ((((Class281) class281).anInt3294 ^ 0xffffffff) == (((Entity) (((Node_Sub51) class248_sub51).aPlayer_7463)).anInt10434 ^ 0xffffffff)) || (((Class281) class281).anInt3278 == ((Entity) (((Node_Sub51) class248_sub51).aPlayer_7463)).anInt10434))
                    i_19_ = 2;
                else if (((((Entity) (((Node_Sub51) class248_sub51).aPlayer_7463)).anInt10434 ^ 0xffffffff) == (((Class281) class281).anInt3276 ^ 0xffffffff)) || ((((Class281) class281).anInt3316 ^ 0xffffffff) == ((((Entity) (((Node_Sub51) class248_sub51).aPlayer_7463)).anInt10434) ^ 0xffffffff)) || (((Class281) class281).anInt3310 == (((Entity) (((Node_Sub51) class248_sub51).aPlayer_7463)).anInt10434)) || (((((Entity) (((Node_Sub51) class248_sub51).aPlayer_7463)).anInt10434) ^ 0xffffffff) == (((Class281) class281).anInt3264 ^ 0xffffffff)))
                    i_19_ = 3;
            } else
                i_19_ = 0;
            if (i_19_ != ((Node_Sub51) class248_sub51).anInt7467) {
                int i_20_ = (Node_Sub8.method2024((((Node_Sub51) class248_sub51).aPlayer_7463), (byte) 126));
                if (((i_20_ ^ 0xffffffff) == (((Node_Sub51) class248_sub51).anInt7462 ^ 0xffffffff)) && (((Player) (((Node_Sub51) class248_sub51).aPlayer_7463)).aBoolean10570 != !((Node_Sub51) class248_sub51).aBoolean7481)) {
                    ((Node_Sub51) class248_sub51).anInt7467 = i_19_;
                    ((Node_Sub51) class248_sub51).anInt7480 = ((Player) (((Node_Sub51) class248_sub51).aPlayer_7463)).anInt10566;
                } else {
                    boolean bool = false;
                    if ((((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460) != null) {
                        ((Node_Sub51) class248_sub51).anInt7480 -= 512;
                        if ((((Node_Sub51) class248_sub51).anInt7480 ^ 0xffffffff) >= -1) {
                            Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460);
                            ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 = null;
                            bool = true;
                        }
                    } else
                        bool = true;
                    if (bool) {
                        ((Node_Sub51) class248_sub51).aClass248_Sub31_Sub1_7483 = null;
                        ((Node_Sub51) class248_sub51).aClass248_Sub34_7482 = null;
                        ((Node_Sub51) class248_sub51).anInt7480 = (((Player) (((Node_Sub51) class248_sub51).aPlayer_7463)).anInt10566);
                        ((Node_Sub51) class248_sub51).anInt7467 = i_19_;
                        ((Node_Sub51) class248_sub51).aBoolean7481 = (((Player) (((Node_Sub51) class248_sub51).aPlayer_7463)).aBoolean10570);
                        ((Node_Sub51) class248_sub51).anInt7462 = i_20_;
                    }
                }
            }
            ((Node_Sub51) class248_sub51).anInt7466 = (((Interactable) (((Node_Sub51) class248_sub51).aPlayer_7463)).x);
            ((Node_Sub51) class248_sub51).anInt7475 = ((((Interactable) (((Node_Sub51) class248_sub51).aPlayer_7463)).x) + (((Node_Sub51) class248_sub51).aPlayer_7463.method3632(-1) << -928146776));
            ((Node_Sub51) class248_sub51).anInt7461 = (((Interactable) (((Node_Sub51) class248_sub51).aPlayer_7463)).y);
            ((Node_Sub51) class248_sub51).anInt7474 = ((((Interactable) (((Node_Sub51) class248_sub51).aPlayer_7463)).y) - -(((Node_Sub51) class248_sub51).aPlayer_7463.method3632(-1) << -1706207672));
            Class215.method1738(class248_sub51, i_15_, i_14_, -1, i, i_13_);
        }
    }

    Node_Sub47(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
        anInt7399 = i_24_;
        ((Node_Sub47) this).anInt7405 = i_28_;
        ((Node_Sub47) this).anInt7401 = i_27_;
        anInt7400 = i_21_;
        anInt7406 = i_23_;
        anInt7412 = i_22_;
        ((Node_Sub47) this).anInt7397 = i_25_;
        anInt7396 = i;
        ((Node_Sub47) this).anInt7410 = i_26_;
    }

    static {
        aIncommingOpcode_7403 = new IncommingOpcode(95, 6);
        aIncommingOpcode_7415 = new IncommingOpcode(79, 6);
    }
}
