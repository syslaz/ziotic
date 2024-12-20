/* aa_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class aa_Sub2 extends aa {
    Class136_Sub4_Sub1 aClass136_Sub4_Sub1_5256;
    static int anInt5257;
    static int anInt5258;
    static int anInt5259 = -1;
    static OutgoingOpcode aOutgoingOpcode_5260 = new OutgoingOpcode(24, 2);
    static int anInt5261;
    static int anInt5262;

    public static void method160(int i) {
        if (i != -1)
            anInt5259 = 43;
        aOutgoingOpcode_5260 = null;
    }

    static final void method161(int i, int i_0_, int i_1_, byte i_2_, int i_3_, int i_4_) {
        if (i_2_ <= 51)
            aOutgoingOpcode_5260 = null;
        anInt5258++;
        int i_5_ = i + -i_4_;
        int i_6_ = -i_1_ + i_3_;
        if ((i_5_ ^ 0xffffffff) != -1) {
            if ((i_6_ ^ 0xffffffff) == -1) {
                Class374.method3876(0, i_4_, i_1_, i_0_, i);
                return;
            }
        } else {
            if ((i_6_ ^ 0xffffffff) != -1)
                Class316_Sub1.method3288(i_3_, i_4_, i_0_, (byte) -116, i_1_);
            return;
        }
        int i_7_ = (i_6_ << 646064428) / i_5_;
        int i_8_ = -(i_4_ * i_7_ >> -1278649716) + i_1_;
        int i_9_;
        int i_10_;
        if ((i ^ 0xffffffff) <= (Class302.anInt3500 ^ 0xffffffff)) {
            if ((i ^ 0xffffffff) < (Class289.anInt3399 ^ 0xffffffff)) {
                i_9_ = (i_7_ * Class289.anInt3399 >> 2118748556) + i_8_;
                i_10_ = Class289.anInt3399;
            } else {
                i_10_ = i;
                i_9_ = i_3_;
            }
        } else {
            i_9_ = (i_7_ * Class302.anInt3500 >> 351549420) + i_8_;
            i_10_ = Class302.anInt3500;
        }
        int i_11_;
        int i_12_;
        if (i_4_ < Class302.anInt3500) {
            i_12_ = (i_7_ * Class302.anInt3500 >> -1067278548) + i_8_;
            i_11_ = Class302.anInt3500;
        } else if ((Class289.anInt3399 ^ 0xffffffff) <= (i_4_ ^ 0xffffffff)) {
            i_11_ = i_4_;
            i_12_ = i_1_;
        } else {
            i_11_ = Class289.anInt3399;
            i_12_ = i_8_ + (i_7_ * Class289.anInt3399 >> -202031476);
        }
        if ((i_12_ ^ 0xffffffff) > (Class181.anInt2099 ^ 0xffffffff)) {
            i_11_ = (-i_8_ + Class181.anInt2099 << -770644212) / i_7_;
            i_12_ = Class181.anInt2099;
        } else if (aa_Sub3.anInt5270 < i_12_) {
            i_11_ = (aa_Sub3.anInt5270 + -i_8_ << -242715828) / i_7_;
            i_12_ = aa_Sub3.anInt5270;
        }
        if (i_9_ < Class181.anInt2099) {
            i_10_ = (-i_8_ + Class181.anInt2099 << -838737108) / i_7_;
            i_9_ = Class181.anInt2099;
        } else if (aa_Sub3.anInt5270 < i_9_) {
            i_10_ = (-i_8_ + aa_Sub3.anInt5270 << -1291219764) / i_7_;
            i_9_ = aa_Sub3.anInt5270;
        }
        Class90.method671(i_12_, i_10_, -21125, i_0_, i_9_, i_11_);
    }

    static final boolean method162(int i, int i_13_, int i_14_) {
        anInt5257++;
        if (i <= 90)
            aOutgoingOpcode_5260 = null;
        if ((i_14_ & 0x800 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    static final void method163(boolean bool, int i) {
        if (bool != false)
            aOutgoingOpcode_5260 = null;
        anInt5261++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i, -874792672, 1);
        class248_sub8_sub10.method2076(-78);
    }

    aa_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_15_, byte[] is) {
        ((aa_Sub2) this).aClass136_Sub4_Sub1_5256 = Class301_Sub2.method3192(false, is, var_ha_Sub2, 6406, 6406, i_15_, i, -18);
        ((aa_Sub2) this).aClass136_Sub4_Sub1_5256.method1266((byte) -60, false, false);
    }

    static final void method164(Interactable interactable) {
        if (interactable != null) {
            for (int i = 0; i < 2; i++) {
                Interactable interactable_16_ = null;
                for (Interactable interactable_17_ = Class144.aInteractableArray1704[i]; interactable_17_ != null; interactable_17_ = (((Interactable) interactable_17_).aInteractable_8320)) {
                    if (interactable_17_ == interactable) {
                        if (interactable_16_ != null)
                            ((Interactable) interactable_16_).aInteractable_8320 = (((Interactable) interactable_17_).aInteractable_8320);
                        else
                            Class144.aInteractableArray1704[i] = (((Interactable) interactable_17_).aInteractable_8320);
                        Node_Sub30.aBoolean7192 = true;
                        return;
                    }
                    interactable_16_ = interactable_17_;
                }
                interactable_16_ = null;
                for (Interactable interactable_18_ = Node_Sub12.aInteractableArray6965[i]; interactable_18_ != null; interactable_18_ = (((Interactable) interactable_18_).aInteractable_8320)) {
                    if (interactable_18_ == interactable) {
                        if (interactable_16_ != null)
                            ((Interactable) interactable_16_).aInteractable_8320 = (((Interactable) interactable_18_).aInteractable_8320);
                        else
                            Node_Sub12.aInteractableArray6965[i] = (((Interactable) interactable_18_).aInteractable_8320);
                        Node_Sub30.aBoolean7192 = true;
                        return;
                    }
                    interactable_16_ = interactable_18_;
                }
                interactable_16_ = null;
                for (Interactable interactable_19_ = Class273.aInteractableArray5007[i]; interactable_19_ != null; interactable_19_ = (((Interactable) interactable_19_).aInteractable_8320)) {
                    if (interactable_19_ == interactable) {
                        if (interactable_16_ != null)
                            ((Interactable) interactable_16_).aInteractable_8320 = (((Interactable) interactable_19_).aInteractable_8320);
                        else
                            Class273.aInteractableArray5007[i] = (((Interactable) interactable_19_).aInteractable_8320);
                        Node_Sub30.aBoolean7192 = true;
                        return;
                    }
                    interactable_16_ = interactable_19_;
                }
            }
        }
    }
}
