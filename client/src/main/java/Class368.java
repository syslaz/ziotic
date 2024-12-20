/* Class368 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class368 {
    boolean aBoolean4514 = false;
    static int anInt4515;
    static int anInt4516;
    static int anInt4517;
    static int anInt4518;
    boolean aBoolean4519;
    private Class278 aClass278_4520 = new Class278(64);
    static int[] anIntArray4521 = new int[2];
    static int anInt4522;
    static int anInt4523;
    static Class293 aClass293_4524 = new Class293();
    Class381 aClass381_4525;
    static int anInt4526;
    static int anInt4527;
    static int anInt4528;
    static int anInt4529;
    private Class381 aClass381_4530;
    Class278 aClass278_4531 = new Class278(500);
    Class278 aClass278_4532 = new Class278(30);
    Class278 aClass278_4533 = new Class278(50);
    static int baseY;
    int anInt4535;

    public static void method3836(boolean bool) {
        if (bool == true) {
            aClass293_4524 = null;
            anIntArray4521 = null;
        }
    }

    final void method3837(int i, boolean bool) {
        anInt4515++;
        if (!((Class368) this).aBoolean4519 == bool) {
            ((Class368) this).aBoolean4519 = bool;
            if (i < 12)
                method3836(false);
            method3843(-12021);
        }
    }

    final ObjectDefinition method3838(byte i, int i_0_) {
        anInt4518++;
        ObjectDefinition class266;
        synchronized (aClass278_4520) {
            class266 = (ObjectDefinition) aClass278_4520.method2863(4, (long) i_0_);
        }
        if (class266 != null)
            return class266;
        byte[] is;
        synchronized (aClass381_4530) {
            is = aClass381_4530.method3922((byte) 115, Class330.method3381(i_0_, 10663), Node_Sub14_Sub28.method2358(-75, i_0_));
        }
        class266 = new ObjectDefinition();
        ((ObjectDefinition) class266).anInt3043 = i_0_;
        ((ObjectDefinition) class266).aClass368_3110 = this;
        if (is != null)
            class266.method2787(new ByteStream(is), -87);
        class266.method2784(false);
        if (((ObjectDefinition) class266).aBoolean3082) {
            ((ObjectDefinition) class266).anInt3093 = 0;
            ((ObjectDefinition) class266).aBoolean3111 = false;
        }
        if (!((Class368) this).aBoolean4519 && ((ObjectDefinition) class266).aBoolean3016) {
            ((ObjectDefinition) class266).aStringArray3075 = null;
            ((ObjectDefinition) class266).anIntArray3029 = null;
        }
        synchronized (aClass278_4520) {
            aClass278_4520.method2867((byte) 0, (long) i_0_, class266);
        }
        if (i > -6)
            anIntArray4521 = null;
        return class266;
    }

    final void method3839(int i, int i_1_) {
        anInt4522++;
        if (i != 64)
            method3836(true);
        synchronized (aClass278_4520) {
            aClass278_4520.method2864(i_1_, -15782);
        }
        synchronized (((Class368) this).aClass278_4531) {
            ((Class368) this).aClass278_4531.method2864(i_1_, i ^ ~0x3de5);
        }
        synchronized (((Class368) this).aClass278_4532) {
            ((Class368) this).aClass278_4532.method2864(i_1_, i ^ ~0x3de5);
        }
        synchronized (((Class368) this).aClass278_4533) {
            ((Class368) this).aClass278_4533.method2864(i_1_, -15782);
        }
    }

    final void method3840(int i, int i_2_) {
        ((Class368) this).anInt4535 = i;
        anInt4528++;
        int i_3_ = -11 / ((i_2_ - -70) / 48);
        synchronized (((Class368) this).aClass278_4531) {
            ((Class368) this).aClass278_4531.method2872((byte) -78);
        }
        synchronized (((Class368) this).aClass278_4532) {
            ((Class368) this).aClass278_4532.method2872((byte) -78);
        }
        synchronized (((Class368) this).aClass278_4533) {
            ((Class368) this).aClass278_4533.method2872((byte) -78);
        }
    }

    final void method3841(boolean bool) {
        anInt4523++;
        synchronized (aClass278_4520) {
            aClass278_4520.method2869(0);
        }
        if (bool != true)
            method3837(-19, false);
        synchronized (((Class368) this).aClass278_4531) {
            ((Class368) this).aClass278_4531.method2869(0);
        }
        synchronized (((Class368) this).aClass278_4532) {
            ((Class368) this).aClass278_4532.method2869(0);
        }
        synchronized (((Class368) this).aClass278_4533) {
            ((Class368) this).aClass278_4533.method2869(0);
        }
    }

    final void method3842(int i, boolean bool) {
        aClass278_4520 = new Class278(i);
        if (bool != true)
            ((Class368) this).aClass278_4533 = null;
        anInt4529++;
    }

    final void method3843(int i) {
        synchronized (aClass278_4520) {
            aClass278_4520.method2872((byte) -78);
        }
        anInt4516++;
        synchronized (((Class368) this).aClass278_4531) {
            ((Class368) this).aClass278_4531.method2872((byte) -78);
        }
        synchronized (((Class368) this).aClass278_4532) {
            ((Class368) this).aClass278_4532.method2872((byte) -78);
        }
        synchronized (((Class368) this).aClass278_4533) {
            ((Class368) this).aClass278_4533.method2872((byte) -78);
        }
        if (i != -12021)
            ((Class368) this).aClass278_4533 = null;
    }

    static final void method3844(boolean bool) {
        anInt4517++;
        synchronized (Class340.aClass278_3953) {
            Class340.aClass278_3953.method2869(0);
        }
        if (bool != false)
            method3844(true);
    }

    final void method3845(byte i, boolean bool) {
        anInt4526++;
        if (!((Class368) this).aBoolean4514 == bool && i < -40) {
            ((Class368) this).aBoolean4514 = bool;
            method3843(-12021);
        }
    }

    Class368(Class215 class215, int i, boolean bool, Class381 class381, Class381 class381_4_) {
        ((Class368) this).aClass381_4525 = class381_4_;
        ((Class368) this).aBoolean4519 = bool;
        aClass381_4530 = class381;
        if (aClass381_4530 != null) {
            int i_5_ = -1 + aClass381_4530.method3902(0);
            aClass381_4530.method3899(i_5_, 0);
        }
    }
}
