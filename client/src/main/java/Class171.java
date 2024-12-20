/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

final class Class171 {
    static long aLong1984 = -1L;
    static int anInt1985;
    static int anInt1986;
    static int anInt1987;
    static int[][] anIntArrayArray1988 = new int[6][];

    static final void method1550(boolean bool, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt1985++;
        if (bool != true)
            method1552(-64);
        int i_6_ = -334 + i_2_;
        if ((i_6_ ^ 0xffffffff) <= -1) {
            if ((i_6_ ^ 0xffffffff) < -101)
                i_6_ = 100;
        } else
            i_6_ = 0;
        int i_7_ = (i_6_ * (-Class296.aShort3455 + Node_Sub14_Sub5.aShort9206) / 100 + Class296.aShort3455);
        i_3_ = i_7_ * i_3_ >> -261787352;
        ObjectDefinition.anInt3100 = ObjectDefinition.anInt3041 * i_7_ >> -1863251416;
        int i_8_ = 0x3fff & -i_0_ + 16384;
        int i_9_ = 0x3fff & -i_5_ + 16384;
        int i_10_ = 0;
        int i_11_ = 0;
        int i_12_ = i_3_;
        if ((i_8_ ^ 0xffffffff) != -1) {
            i_11_ = (Node_Sub9_Sub1.anIntArray9106[i_8_] * -i_12_ >> 506320526);
            i_12_ = (Node_Sub9_Sub1.anIntArray9109[i_8_] * i_12_ >> 1608034638);
        }
        if (i_9_ != 0) {
            i_10_ = (i_12_ * Node_Sub9_Sub1.anIntArray9106[i_9_] >> 1188166158);
            i_12_ = (i_12_ * Node_Sub9_Sub1.anIntArray9109[i_9_] >> -1580329906);
        }
        Class127.cameraPitch = i_0_;
        Class346_Sub7_Sub1.cameraPosX = -i_10_ + i_1_;
        Class316_Sub1_Sub2.cameraPosZ = -i_12_ + i;
        Class346_Sub5_Sub1.anInt9886 = 0;
        InputStream_Sub1.cameraPosY = -i_11_ + i_4_;
        Class301_Sub3_Sub1.cameraYaw = i_5_;
    }

    static final boolean method1551(int i) {
        anInt1986++;
        Hashtable hashtable = new Hashtable();
        Enumeration enumeration = Class26.aHashtable355.keys();
        while (enumeration.hasMoreElements()) {
            Object object = enumeration.nextElement();
            hashtable.put(object, Class26.aHashtable355.get(object));
        }
        try {
            Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
            Class var_class_13_ = Class.forName("java.lang.ClassLoader");
            Field field = var_class_13_.getDeclaredField("nativeLibraries");
            Method method = var_class.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
            method.invoke(field, new Object[]{Boolean.TRUE});
            try {
                int i_14_ = 39 / ((i - 62) / 51);
                enumeration = Class26.aHashtable355.keys();
                while (enumeration.hasMoreElements()) {
                    String string = (String) enumeration.nextElement();
                    try {
                        File file = (File) IOException_Sub1.aHashtable84.get(string);
                        Class var_class_15_ = (Class) Class26.aHashtable355.get(string);
                        Vector vector = ((Vector) field.get(var_class_15_.getClassLoader()));
                        for (int i_16_ = 0; vector.size() > i_16_; i_16_++) {
                            try {
                                Object object = vector.elementAt(i_16_);
                                Field field_17_ = object.getClass().getDeclaredField("name");
                                method.invoke(field_17_, new Object[]{Boolean.TRUE});
                                try {
                                    String string_18_ = (String) field_17_.get(object);
                                    if (string_18_ != null && (string_18_.equalsIgnoreCase(file.getCanonicalPath()))) {
                                        Field field_19_ = object.getClass().getDeclaredField("handle");
                                        Method method_20_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
                                        method.invoke(field_19_, (new Object[]{Boolean.TRUE}));
                                        method.invoke(method_20_, (new Object[]{Boolean.TRUE}));
                                        try {
                                            method_20_.invoke(object, new Object[0]);
                                            field_19_.set(object, new Integer(0));
                                            hashtable.remove(string);
                                        } catch (Throwable throwable) {
                                            /* empty */
                                        }
                                        method.invoke(method_20_, (new Object[]{Boolean.FALSE}));
                                        method.invoke(field_19_, (new Object[]{Boolean.FALSE}));
                                    }
                                } catch (Throwable throwable) {
                                    /* empty */
                                }
                                method.invoke(field_17_, new Object[]{Boolean.FALSE});
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                        }
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                }
            } catch (Throwable throwable) {
                /* empty */
            }
            method.invoke(field, new Object[]{Boolean.FALSE});
        } catch (Throwable throwable) {
            /* empty */
        }
        Class26.aHashtable355 = hashtable;
        return Class26.aHashtable355.isEmpty();
    }

    public static void method1552(int i) {
        if (i < -70)
            anIntArrayArray1988 = null;
    }

    public final String toString() {
        anInt1987++;
        throw new IllegalStateException();
    }

    public Class171() {
        /* empty */
    }
}
