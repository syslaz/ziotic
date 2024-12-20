/* Class301_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class301_Sub1 extends Class301 {
    static int anInt8424;
    private Class129 aClass129_8425;
    static int anInt8426;
    static int anInt8427;
    static int anInt8428;
    static int anInt8429;
    static int anInt8430;

    Class301_Sub1(Class381 class381, Class381 class381_0_, Class225_Sub3 class225_sub3) {
        super(class381, class381_0_, (Class225) class225_sub3);
    }

    static final void method3188(int i, ByteStream class248_sub9) {
        anInt8426++;
        int i_1_ = class248_sub9.readSmart((byte) 22);
        Class21.aClass55Array313 = new Class55[i_1_];
        for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
            Class21.aClass55Array313[i_2_] = new Class55();
            ((Class55) Class21.aClass55Array313[i_2_]).anInt729 = class248_sub9.readSmart((byte) 22);
            ((Class55) Class21.aClass55Array313[i_2_]).aString732 = class248_sub9.readJagString2(-112);
        }
        if (i == -1) {
            RSInterface.anInt6848 = class248_sub9.readSmart((byte) 22);
            Class270.anInt3135 = class248_sub9.readSmart((byte) 22);
            Class41.anInt533 = class248_sub9.readSmart((byte) 22);
            Class84_Sub3.aClass147_Sub1Array5399 = (new Class147_Sub1
                    [Class270.anInt3135 + (-RSInterface.anInt6848 - -1)]);
            for (int i_3_ = 0; (Class41.anInt533 ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
                int i_4_ = class248_sub9.readSmart((byte) 22);
                Class147_Sub1 class147_sub1 = (Class84_Sub3.aClass147_Sub1Array5399[i_4_] = new Class147_Sub1());
                ((Class147) class147_sub1).anInt1737 = class248_sub9.readUnsignedByte((byte) -77);
                ((Class147) class147_sub1).anInt1733 = class248_sub9.readInt(false);
                ((Class147_Sub1) class147_sub1).anInt6285 = i_4_ + RSInterface.anInt6848;
                ((Class147_Sub1) class147_sub1).aString6283 = class248_sub9.readJagString2(i + -103);
                ((Class147_Sub1) class147_sub1).aString6284 = class248_sub9.readJagString2(-122);
            }
            Node_Sub14_Sub30.anInt9474 = class248_sub9.readInt(false);
            client.aBoolean5228 = true;
        }
    }

    static final Class221 method3189(ha_Sub2 var_ha_Sub2, Class29[] class29s, int i) {
        anInt8427++;
        for (int i_5_ = 0; i_5_ < class29s.length; i_5_++) {
            if (class29s[i_5_] == null || (((Class29) class29s[i_5_]).aLong368 ^ 0xffffffffffffffffL) >= -1L)
                return null;
        }
        if (i > -70)
            return null;
        long l = OpenGL.glCreateProgramObjectARB();
        for (int i_6_ = 0; i_6_ < class29s.length; i_6_++)
            OpenGL.glAttachObjectARB(l, ((Class29) class29s[i_6_]).aLong368);
        OpenGL.glLinkProgramARB(l);
        OpenGL.glGetObjectParameterivARB(l, 35714, Class368.anIntArray4521, 0);
        if (Class368.anIntArray4521[0] == 0) {
            if (Class368.anIntArray4521[0] == 0)
                System.out.println("Shader linking failed:");
            OpenGL.glGetObjectParameterivARB(l, 35716, Class368.anIntArray4521, 1);
            if (Class368.anIntArray4521[1] > 1) {
                byte[] is = new byte[Class368.anIntArray4521[1]];
                OpenGL.glGetInfoLogARB(l, Class368.anIntArray4521[1], Class368.anIntArray4521, 0, is, 0);
                System.out.println(new String(is));
            }
            if ((Class368.anIntArray4521[0] ^ 0xffffffff) == -1) {
                for (int i_7_ = 0; class29s.length > i_7_; i_7_++)
                    OpenGL.glDetachObjectARB(l, (((Class29) class29s[i_7_]).aLong368));
                OpenGL.glDeleteObjectARB(l);
                return null;
            }
        }
        return new Class221(var_ha_Sub2, l, class29s);
    }

    public final void method34(byte i) {
        if (i > 34) {
            anInt8430++;
            super.method34((byte) 121);
            aClass129_8425 = Node_Sub8_Sub3.method2043(((Class225_Sub3) (Class225_Sub3) (((Class301) this).aClass225_4932)).anInt8470, (((Class301) this).aClass381_4926), true);
        }
    }

    static final void method3190(Interactable[] interactables, int i, int i_8_) {
        if (i < i_8_) {
            int i_9_ = (i + i_8_) / 2;
            int i_10_ = i;
            Interactable interactable = interactables[i_9_];
            interactables[i_9_] = interactables[i_8_];
            interactables[i_8_] = interactable;
            int i_11_ = ((Interactable) interactable).anInt8316;
            for (int i_12_ = i; i_12_ < i_8_; i_12_++) {
                if (((Interactable) interactables[i_12_]).anInt8316 < i_11_ + (i_12_ & 0x1)) {
                    Interactable interactable_13_ = interactables[i_12_];
                    interactables[i_12_] = interactables[i_10_];
                    interactables[i_10_++] = interactable_13_;
                }
            }
            interactables[i_8_] = interactables[i_10_];
            interactables[i_10_] = interactable;
            method3190(interactables, i, i_10_ - 1);
            method3190(interactables, i_10_ + 1, i_8_);
        }
    }

    final void method3182(int i, int i_14_, int i_15_, boolean bool) {
        anInt8428++;
        int i_16_ = (this.method3184((byte) -36) * ((Class225) ((Class301) this).aClass225_4932).anInt5000 / 10000);
        int[] is = new int[4];
        Class287.aHa3381.K(is);
        Class287.aHa3381.KA(i, i_15_ + 2, i_16_ + i, (((Class225) ((Class301) this).aClass225_4932).anInt5002) + i_15_);
        aClass129_8425.method1182(i, i_15_ + i_14_, ((Class225) ((Class301) this).aClass225_4932).anInt5000, ((Class225) ((Class301) this).aClass225_4932).anInt5002);
        Class287.aHa3381.KA(is[0], is[1], is[2], is[3]);
    }

    final void method3185(int i, int i_17_, boolean bool, int i_18_) {
        Class287.aHa3381.c(-2 + i_18_, i, (((Class225) ((Class301) this).aClass225_4932).anInt5000) - -4, 2 + (((Class225) ((Class301) this).aClass225_4932).anInt5002), ((Class225_Sub3) (Class225_Sub3) ((Class301) this).aClass225_4932).anInt8473, 0);
        anInt8424++;
        Class287.aHa3381.c(i_18_ + -1, 1 + i, 2 + (((Class225) ((Class301) this).aClass225_4932).anInt5000), (((Class225) ((Class301) this).aClass225_4932).anInt5002), 0, 0);
        if (i_17_ >= -72)
            method33(-114);
    }

    public final boolean method33(int i) {
        anInt8429++;
        if (!super.method33(i))
            return false;
        return ((Class301) this).aClass381_4926.method3920((((Class225_Sub3) (Class225_Sub3) (((Class301) this).aClass225_4932)).anInt8470), -94);
    }
}
