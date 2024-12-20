/* Class373 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.reflect.Method;

final class Class373 {
    static int anInt4589;
    static int anInt4590;
    /*synthetic*/ static Class aClass4591;
    /*synthetic*/ static Class aClass4592;

    static final synchronized void method3870(int i) {
        anInt4590++;
        if (Class188.anObject2188 == null) {
            try {
                Class var_class = Class.forName("java.lang.management.ManagementFactory");
                Method method = var_class.getDeclaredMethod("getPlatformMBeanServer", null);
                Object object = method.invoke(null, null);
                if (i == 6143) {
                    Method method_0_ = (var_class.getMethod("newPlatformMXBeanProxy", (new Class[]{(Class.forName("javax.management.MBeanServerConnection")), (aClass4591 != null ? aClass4591 : (aClass4591 = method3872("java.lang.String"))), (aClass4592 != null ? aClass4592 : (aClass4592 = method3872("java.lang.Class")))})));
                    Class188.anObject2188 = (method_0_.invoke(null, (new Object[]{object, "com.sun.management:type=HotSpotDiagnostic", (Class.forName("com.sun.management.HotSpotDiagnosticMXBean"))})));
                }
            } catch (Exception exception) {
                System.out.println("HeapDump setup error:");
                exception.printStackTrace();
            }
        }
    }

    static final void method3871(int i, long l, int i_1_, int i_2_) {
        anInt4589++;
        int i_3_ = (int) l >> 1202885870 & 0x1f;
        if (i_2_ == 0) {
            int i_4_ = (0x3d9526 & (int) l) >> -1741588428;
            int i_5_ = (int) (l >>> 1104634080) & 0x7fffffff;
            if (i_3_ == 10 || (i_3_ ^ 0xffffffff) == -12 || i_3_ == 22) {
                ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -107, i_5_);
                int i_6_;
                int i_7_;
                if (i_4_ == 0 || i_4_ == 2) {
                    i_7_ = ((ObjectDefinition) class266).anInt3097;
                    i_6_ = ((ObjectDefinition) class266).anInt3065;
                } else {
                    i_6_ = ((ObjectDefinition) class266).anInt3097;
                    i_7_ = ((ObjectDefinition) class266).anInt3065;
                }
                int i_8_ = ((ObjectDefinition) class266).anInt3047;
                if (i_4_ != 0)
                    i_8_ = (0xf & i_8_ << i_4_) - -(i_8_ >> -i_4_ + 4);
                Class344.method3520(i_8_, i_1_, 0, i_7_, 0, i_6_, true, i, -1);
            } else
                Class344.method3520(0, i_1_, i_4_, 0, i_3_, 0, true, i, i_2_ + -1);
        }
    }

    /*synthetic*/
    static Class method3872(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
