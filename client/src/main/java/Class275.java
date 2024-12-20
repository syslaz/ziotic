/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;

abstract class Class275 implements Interface18 {
    private int anInt5135 = -1;
    private boolean aBoolean5136;
    static int anInt5137;
    static int anInt5138;
    private int anInt5139;
    static int anInt5140;
    private int anInt5141;
    static int anInt5142;
    static int anInt5143;
    static int anInt5144;
    private NativeHeapBuffer aNativeHeapBuffer5145;
    private int anInt5146 = 0;
    static int anInt5147;
    static int anInt5148;
    static int anInt5149;
    ha_Sub3_Sub1 aHa_Sub3_Sub1_5150;
    private int anInt5151;
    static int anInt5152;
    static int anInt5153;

    public int method57(int i) {
        if (i != -1)
            return -49;
        anInt5142++;
        return anInt5139;
    }

    final boolean method2841(int i, MapBuffer mapbuffer) {
        anInt5138++;
        boolean bool = true;
        int i_0_ = 8 % ((i - 45) / 58);
        if ((anInt5146 ^ 0xffffffff) != -1) {
            if ((anInt5135 ^ 0xffffffff) < -1) {
                OpenGL.glBindBufferARB(anInt5141, anInt5135);
                if (anInt5146 != 1)
                    bool = mapbuffer.a();
                else
                    OpenGL.glBufferSubDataARBa(anInt5141, 0, anInt5151, ((ha_Sub3) (((Class275) this).aHa_Sub3_Sub1_5150)).aNativeHeapBuffer6062.getAddress());
            }
            anInt5146 = 0;
        }
        return bool;
    }

    final long method2842(byte i) {
        if (i != -110)
            return 3L;
        anInt5149++;
        if (anInt5135 != 0)
            return 0L;
        return aNativeHeapBuffer5145.getAddress();
    }

    final Buffer method2843(MapBuffer mapbuffer, byte i, boolean bool) {
        if (i >= -64)
            anInt5139 = 23;
        anInt5147++;
        if ((anInt5146 ^ 0xffffffff) == -1) {
            method2845(-30906);
            if ((anInt5135 ^ 0xffffffff) >= -1) {
                anInt5146 = 2;
                return aNativeHeapBuffer5145;
            }
            OpenGL.glBindBufferARB(anInt5141, anInt5135);
            if (bool) {
                OpenGL.glBufferDataARBub(anInt5141, anInt5151, null, 0, !aBoolean5136 ? 35044 : 35040);
                if (((((ha_Sub3) ((Class275) this).aHa_Sub3_Sub1_5150).aNativeHeapBuffer6062.a) ^ 0xffffffff) <= (anInt5139 ^ 0xffffffff)) {
                    anInt5146 = 1;
                    return (((ha_Sub3) ((Class275) this).aHa_Sub3_Sub1_5150).aNativeHeapBuffer6062);
                }
            }
            if (!mapbuffer.b() && mapbuffer.a(anInt5141, anInt5139, 35001)) {
                anInt5146 = 2;
                return mapbuffer;
            }
        }
        return null;
    }

    static final int method2844(int i, boolean bool) {
        anInt5148++;
        if (i != -1)
            return 4;
        int i_1_ = Node_Sub15_Sub4.anInt9694;
        while_185_:
        do {
            do {
                if ((i_1_ ^ 0xffffffff) != -1) {
                    if ((i_1_ ^ 0xffffffff) != -2) {
                        if ((i_1_ ^ 0xffffffff) == -3)
                            break;
                        break while_185_;
                    }
                } else {
                    if (!bool)
                        return Class267.anInt4920;
                    return 0;
                }
                return Class267.anInt4920;
            } while (false);
            return 0;
        } while (false);
        return 0;
    }

    private final void method2845(int i) {
        anInt5140++;
        if ((anInt5135 ^ 0xffffffff) > -1) {
            if (!((ha_Sub3_Sub1) ((Class275) this).aHa_Sub3_Sub1_5150).aBoolean8760)
                anInt5135 = 0;
            else {
                OpenGL.glGenBuffersARB(1, Class210.anIntArray2427, 0);
                anInt5135 = Class210.anIntArray2427[0];
                OpenGL.glBindBufferARB(anInt5141, anInt5135);
            }
            if (i != -30906)
                anInt5139 = -107;
        }
    }

    protected final void finalize() throws Throwable {
        anInt5144++;
        method3(false);
        super.finalize();
    }

    final void method2846(byte i) {
        if (i == -67) {
            anInt5143++;
            if (((ha_Sub3_Sub1) ((Class275) this).aHa_Sub3_Sub1_5150).aBoolean8760)
                OpenGL.glBindBufferARB(anInt5141, anInt5135);
        }
    }

    void method48(int i, byte i_2_) {
        if (anInt5151 < i) {
            method2845(-30906);
            if (anInt5135 <= 0)
                aNativeHeapBuffer5145 = ((Class275) this).aHa_Sub3_Sub1_5150.method935(i, false, (byte) -35);
            else {
                OpenGL.glBindBufferARB(anInt5141, anInt5135);
                OpenGL.glBufferDataARBub(anInt5141, i, null, 0, aBoolean5136 ? 35040 : 35044);
                ((ha_Sub3) ((Class275) this).aHa_Sub3_Sub1_5150).anInt6143 += -anInt5151 + i;
            }
            anInt5151 = i;
        }
        if (i_2_ == 102) {
            anInt5152++;
            anInt5139 = i;
        }
    }

    void method3(boolean bool) {
        anInt5153++;
        if (anInt5135 > 0) {
            ((Class275) this).aHa_Sub3_Sub1_5150.method1056(anInt5135, anInt5139, 0);
            anInt5135 = -1;
        }
        if (bool != false)
            aBoolean5136 = false;
    }

    final boolean method2847(int i, Source source, byte i_3_) {
        anInt5137++;
        if (i_3_ != 31)
            aNativeHeapBuffer5145 = null;
        if ((i ^ 0xffffffff) >= (anInt5151 ^ 0xffffffff)) {
            if (anInt5135 <= 0)
                throw new RuntimeException("ARGH!");
            OpenGL.glBindBufferARB(anInt5141, anInt5135);
            OpenGL.glBufferSubDataARBa(anInt5141, 0, anInt5139, source.getAddress());
            ((ha_Sub3) ((Class275) this).aHa_Sub3_Sub1_5150).anInt6143 += -anInt5139 + i;
        } else {
            method2845(-30906);
            if (anInt5135 <= 0)
                throw new RuntimeException("ARGH!");
            OpenGL.glBindBufferARB(anInt5141, anInt5135);
            OpenGL.glBufferDataARBa(anInt5141, i, source.getAddress(), !aBoolean5136 ? 35044 : 35040);
            ((ha_Sub3) ((Class275) this).aHa_Sub3_Sub1_5150).anInt6143 += i - anInt5139;
            anInt5151 = i;
        }
        anInt5139 = i;
        return true;
    }

    Class275(ha_Sub3_Sub1 var_ha_Sub3_Sub1, int i, boolean bool) {
        anInt5141 = i;
        aBoolean5136 = bool;
        ((Class275) this).aHa_Sub3_Sub1_5150 = var_ha_Sub3_Sub1;
    }
}
