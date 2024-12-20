/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class181 {
    static OutgoingOpcode aOutgoingOpcode_2095 = new OutgoingOpcode(77, 3);
    static int anInt2096;
    static int anInt2097;
    static Class168 aClass168_2098 = new Class168(1, 2, 2, 0);
    static int anInt2099 = 0;

    public static void method1602(boolean bool) {
        aOutgoingOpcode_2095 = null;
        aClass168_2098 = null;
        if (bool != false)
            method1604(109);
    }

    public Class181() {
        /* empty */
    }

    public final String toString() {
        anInt2097++;
        throw new IllegalStateException();
    }

    static final Class29 method1603(int i, String string, int i_0_, ha_Sub2 var_ha_Sub2) {
        anInt2096++;
        long l = OpenGL.glCreateShaderObjectARB(i_0_);
        if (i != 4)
            method1602(true);
        OpenGL.glShaderSourceARB(l, string);
        OpenGL.glCompileShaderARB(l);
        OpenGL.glGetObjectParameterivARB(l, 35713, Node_Sub8_Sub19.anIntArray9085, 0);
        if ((Node_Sub8_Sub19.anIntArray9085[0] ^ 0xffffffff) == -1) {
            if ((Node_Sub8_Sub19.anIntArray9085[0] ^ 0xffffffff) == -1)
                System.out.println("Shader compile failed:");
            OpenGL.glGetObjectParameterivARB(l, 35716, (Node_Sub8_Sub19.anIntArray9085), 1);
            if ((Node_Sub8_Sub19.anIntArray9085[1] ^ 0xffffffff) < -2) {
                byte[] is = new byte[Node_Sub8_Sub19.anIntArray9085[1]];
                OpenGL.glGetInfoLogARB(l, Node_Sub8_Sub19.anIntArray9085[1], Node_Sub8_Sub19.anIntArray9085, 0, is, 0);
                System.out.println(new String(is));
            }
            if ((Node_Sub8_Sub19.anIntArray9085[0] ^ 0xffffffff) == -1) {
                OpenGL.glDeleteObjectARB(l);
                return null;
            }
        }
        return new Class29(var_ha_Sub2, l, i_0_);
    }

    static final void method1604(int i) {
        if (i == 0) {
            if (Node_Sub3.anInt6830 == 2) {
                Class183.aClass288Array2143[0].method3080(Class345.aClass344Array4093[0]);
                Class183.aClass288Array2143[1].method3080(Class345.aClass344Array4093[1]);
            } else if (Node_Sub3.anInt6830 == 3) {
                Class183.aClass288Array2143[0].method3080(Class345.aClass344Array4093[0]);
                Class183.aClass288Array2143[1].method3080(Class345.aClass344Array4093[1]);
                Class183.aClass288Array2143[2].method3080(Class345.aClass344Array4093[2]);
            } else {
                Class183.aClass288Array2143[0].method3080(Class345.aClass344Array4093[0]);
                Class183.aClass288Array2143[1].method3080(Class345.aClass344Array4093[1]);
                Class183.aClass288Array2143[2].method3080(Class345.aClass344Array4093[2]);
                Class183.aClass288Array2143[3].method3080(Class345.aClass344Array4093[3]);
            }
        } else if (i == 1) {
            if (Node_Sub3.anInt6830 == 2)
                Class183.aClass288Array2143[0].method3080(Class345.aClass344Array4093[2]);
            else if (Node_Sub3.anInt6830 == 3) {
                Class183.aClass288Array2143[0].method3080(Class345.aClass344Array4093[3]);
                Class183.aClass288Array2143[1].method3080(Class345.aClass344Array4093[4]);
            } else {
                Class183.aClass288Array2143[0].method3080(Class345.aClass344Array4093[4]);
                Class183.aClass288Array2143[1].method3080(Class345.aClass344Array4093[5]);
                Class183.aClass288Array2143[2].method3080(Class345.aClass344Array4093[6]);
            }
        } else if (i == 2) {
            if (Node_Sub3.anInt6830 == 2)
                Class183.aClass288Array2143[0].method3080(Class345.aClass344Array4093[3]);
            else if (Node_Sub3.anInt6830 == 3)
                Class183.aClass288Array2143[0].method3080(Class345.aClass344Array4093[5]);
            else
                Class183.aClass288Array2143[0].method3080(Class345.aClass344Array4093[7]);
        }
    }
}
