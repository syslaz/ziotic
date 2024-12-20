/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class43 {
    static int anInt552;
    static int anInt553;
    static int anInt554;
    static int anInt555;

    static final int method309(int i, RSInterface2 class354, byte i_0_) {
        if (i_0_ != -26)
            return 55;
        anInt555++;
        if (!client.method113(class354).method2670(i, 3) && ((RSInterface2) class354).onButton_Parameters == null)
            return -1;
        if (((RSInterface2) class354).anIntArray4323 == null || (i ^ 0xffffffff) <= (((RSInterface2) class354).anIntArray4323.length ^ 0xffffffff))
            return -1;
        return ((RSInterface2) class354).anIntArray4323[i];
    }

    static final void method310(boolean bool, byte i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        Class346_Sub5.anInt8283 = i_2_;
        if (i == -118) {
            anInt554++;
            OutputStream_Sub2.anInt91 = i_1_;
            Class340_Sub2.anInt8112 = i_3_;
            Class301.anInt4931 = i_5_;
            Class375.anInt4606 = i_4_;
            if (bool && Class340_Sub2.anInt8112 >= 100) {
                Class316_Sub1_Sub2.cameraPosZ = 512 * Class346_Sub5.anInt8283 + 256;
                Class346_Sub7_Sub1.cameraPosX = 512 * Class301.anInt4931 - -256;
                InputStream_Sub1.cameraPosY = (Class353.method3753(Class316_Sub1_Sub2.cameraPosZ, Class346_Sub7_Sub1.cameraPosX, i ^ ~0xb, Class177.anInt2074) + -Class375.anInt4606);
            }
            Node_Sub14_Sub21.anInt9379 = Class359.anInt4436 = -1;
            Node_Sub45.anInt7343 = 2;
        }
    }

    static final int method311(int i, int i_6_) {
        int i_7_ = -91 % ((i_6_ - 52) / 37);
        anInt553++;
        if ((i ^ 0xffffffff) == -16711936)
            return -1;
        return Class363.method3823(i, (byte) 121);
    }

    static final void method312(Entity entity, int i, int i_8_) {
        if (i_8_ != 0)
            method310(true, (byte) 35, -99, 121, -35, 81, 36);
        anInt552++;
        if (((Entity) entity).anIntArray10414 != null) {
            int i_9_ = (((Entity) entity).anIntArray10414[i - -1]);
            if (i_9_ != (((Entity) entity).anInt10444)) {
                ((Entity) entity).anInt10420 = 0;
                ((Entity) entity).anInt10407 = 1;
                ((Entity) entity).anInt10505 = (((Entity) entity).anInt10503);
                ((Entity) entity).anInt10419 = 0;
                ((Entity) entity).anInt10466 = 0;
                ((Entity) entity).anInt10444 = i_9_;
                if (((((Entity) entity).anInt10444) ^ 0xffffffff) != 0)
                    Class158.method1396((Class235.aClass356_2617.method3790((byte) -90, (((Entity) entity).anInt10444))), ((Entity) entity).anInt10420, entity, true);
            }
        }
    }
}
