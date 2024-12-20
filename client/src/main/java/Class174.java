/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

final class Class174 implements Runnable {
    private Class322 aClass322_2021;
    private static String aString2022;
    private static String aString2023;
    private Object anObject2024;
    private static String aString2025;
    static String aString2026;
    EventQueue anEventQueue2027;
    static String aString2028;
    static Method aMethod2029;
    private Class322 aClass322_2030;
    private Thread aThread2031;
    private Object anObject2032;
    Class45[] aClass45Array2033;
    Class45 aClass45_2034 = null;
    private boolean aBoolean2035;
    Class45 aClass45_2036;
    private Object anObject2037;
    private static volatile long aLong2038 = 0L;
    boolean aBoolean2039 = false;
    private static int anInt2040;
    private Class88 aClass88_2041;
    Class45 aClass45_2042;
    static Method aMethod2043;
    static String aString2044;
    static String aString2045;
    static String aString2046;
    boolean aBoolean2047;
    private Callback_Sub1 aCallback_Sub1_2048;
    /*synthetic*/ static Class aClass2049;
    /*synthetic*/ static Class aClass2050;
    /*synthetic*/ static Class aClass2051;
    /*synthetic*/ static Class aClass2052;

    final Class322 method1564(int i, byte i_0_) {
        if (i_0_ > 0)
            aString2045 = null;
        return method1569(0, (byte) -124, i, 3, null);
    }

    final Class322 method1565(boolean bool) {
        if (bool != true)
            ((Class174) this).anEventQueue2027 = null;
        return method1569(0, (byte) -114, 0, 5, null);
    }

    final Class322 method1566(int i, boolean bool, byte i_1_, String string) {
        if (i_1_ < 75)
            method1583(null, true, -39, null, 113, null);
        return method1569(0, (byte) -125, i, bool ? 22 : 1, string);
    }

    final boolean method1567(int i) {
        if (i != 31625)
            method1564(38, (byte) 75);
        if (!((Class174) this).aBoolean2039)
            return false;
        if (!((Class174) this).aBoolean2047) {
            if (anObject2032 == null)
                return false;
            return true;
        }
        if (aClass88_2041 == null)
            return false;
        return true;
    }

    final void method1568(byte i) {
        synchronized (this) {
            aBoolean2035 = true;
            this.notifyAll();
        }
        try {
            int i_2_ = 114 / ((63 - i) / 60);
            aThread2031.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
        if (((Class174) this).aClass45_2042 != null) {
            try {
                ((Class174) this).aClass45_2042.method323(-113);
            } catch (IOException ioexception) {
                /* empty */
            }
        }
        if (((Class174) this).aClass45_2036 != null) {
            try {
                ((Class174) this).aClass45_2036.method323(-93);
            } catch (IOException ioexception) {
                /* empty */
            }
        }
        if (((Class174) this).aClass45Array2033 != null) {
            for (int i_3_ = 0; i_3_ < ((Class174) this).aClass45Array2033.length; i_3_++) {
                if (((Class174) this).aClass45Array2033[i_3_] != null) {
                    try {
                        ((Class174) this).aClass45Array2033[i_3_].method323(33);
                    } catch (IOException ioexception) {
                        /* empty */
                    }
                }
            }
        }
        do {
            if (((Class174) this).aClass45_2034 != null) {
                try {
                    ((Class174) this).aClass45_2034.method323(-62);
                } catch (IOException ioexception) {
                    break;
                }
                break;
            }
        } while (false);
    }

    public final void run() {
        for (; ; ) {
            Class322 class322;
            synchronized (this) {
                for (; ; ) {
                    if (aBoolean2035)
                        return;
                    if (aClass322_2021 != null) {
                        class322 = aClass322_2021;
                        aClass322_2021 = ((Class322) aClass322_2021).aClass322_3783;
                        if (aClass322_2021 == null)
                            aClass322_2030 = null;
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            try {
                int i = ((Class322) class322).anInt3786;
                if ((i ^ 0xffffffff) != -2) {
                    if (i == 22) {
                        if (aLong2038 > Class118.method1112(116))
                            throw new IOException();
                        try {
                            class322.anObject3787 = RSInterface.method2013(class322.anInt3784, 17509, ((String) ((Class322) class322).anObject3782)).method264(98);
                        } catch (IOException_Sub1 ioexception_sub1) {
                            class322.anObject3787 = ioexception_sub1.getMessage();
                            throw ioexception_sub1;
                        }
                    } else if (i != 2) {
                        if ((i ^ 0xffffffff) != -5) {
                            if ((i ^ 0xffffffff) == -9) {
                                Object[] objects = ((Object[]) ((Class322) class322).anObject3782);
                                if (((Class174) this).aBoolean2039 && (((Class) objects[0]).getClassLoader() == null))
                                    throw new SecurityException();
                                class322.anObject3787 = (((Class) objects[0]).getDeclaredMethod((String) objects[1], (Class[]) objects[2]));
                            } else if ((i ^ 0xffffffff) != -10) {
                                if ((i ^ 0xffffffff) == -19) {
                                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    class322.anObject3787 = clipboard.getContents(null);
                                } else if ((i ^ 0xffffffff) != -20) {
                                    if (((Class174) this).aBoolean2039) {
                                        if ((i ^ 0xffffffff) == -4) {
                                            if ((aLong2038 ^ 0xffffffffffffffffL) < (Class118.method1112(116) ^ 0xffffffffffffffffL))
                                                throw new IOException();
                                            String string = ((String.valueOf(0xff & (class322.anInt3784 >> -484532232))) + "." + ((class322.anInt3784 >> 1201999024) & 0xff) + "." + ((class322.anInt3784 >> -385282488) & 0xff) + "." + (class322.anInt3784 & 0xff));
                                            class322.anObject3787 = InetAddress.getByName(string).getHostName();
                                        } else if (i != 21) {
                                            if ((i ^ 0xffffffff) != -6) {
                                                if ((i ^ 0xffffffff) == -7) {
                                                    Frame frame = (new Frame("Jagex Full Screen"));
                                                    class322.anObject3787 = frame;
                                                    frame.setResizable(false);
                                                    if (!((Class174) this).aBoolean2047)
                                                        Class.forName("Class93").getMethod("method685", (new Class[]{((aClass2049 != null) ? aClass2049 : (aClass2049 = (method1584("java.awt.Frame")))), Integer.TYPE, Integer.TYPE, Integer.TYPE, (Integer.TYPE)})).invoke(anObject2032, (new Object[]{frame, (new Integer((class322.anInt3784) >>> -1445506192)), (new Integer(0xffff & (class322.anInt3784))), (new Integer((((Class322) class322).anInt3785) >> -2114483888)), (new Integer((((Class322) class322).anInt3785) & 0xffff))}));
                                                    else
                                                        aClass88_2041.method666(frame, ((((Class322) class322).anInt3785) >> 1404065264), ((((Class322) class322).anInt3785) & 0xffff), (0xffff & (class322.anInt3784)), ((class322.anInt3784) >>> -1298258384), 0);
                                                } else if (i == 7) {
                                                    if (((Class174) this).aBoolean2047)
                                                        aClass88_2041.method665(((Frame) (((Class322) class322).anObject3782)), (byte) 85);
                                                    else
                                                        Class.forName("Class93").getMethod("method687", new Class[0]).invoke(anObject2032, new Object[0]);
                                                } else if ((i ^ 0xffffffff) == -13) {
                                                    Class45 class45 = (method1575(aString2022, anInt2040, -1, ((String) (((Class322) class322).anObject3782))));
                                                    class322.anObject3787 = class45;
                                                } else if ((i ^ 0xffffffff) != -14) {
                                                    if ((((Class174) this).aBoolean2039) && ((i ^ 0xffffffff) == -15)) {
                                                        int i_4_ = (class322.anInt3784);
                                                        int i_5_ = (((Class322) class322).anInt3785);
                                                        if (((Class174) this).aBoolean2047)
                                                            aCallback_Sub1_2048.method82(i_4_, 67, i_5_);
                                                        else
                                                            Class.forName("Class197").getDeclaredMethod("method1671", (new Class[]{(Integer.TYPE), (Integer.TYPE)})).invoke(anObject2037, (new Object[]{(new Integer(i_4_)), (new Integer(i_5_))}));
                                                    } else if ((((Class174) this).aBoolean2039) && i == 15) {
                                                        boolean bool = (((class322.anInt3784) ^ 0xffffffff) != -1);
                                                        Component component = ((Component) (((Class322) class322).anObject3782));
                                                        if (!((Class174) this).aBoolean2047)
                                                            Class.forName("Class197").getDeclaredMethod("method1670", (new Class[]{((aClass2050 != null) ? aClass2050 : (aClass2050 = (method1584("java.awt.Component")))), (Boolean.TYPE)})).invoke(anObject2037, (new Object[]{component, (new Boolean(bool))}));
                                                        else
                                                            aCallback_Sub1_2048.method81(117, component, bool);
                                                    } else if (!(((Class174) this).aBoolean2047) && i == 17) {
                                                        Object[] objects = ((Object[]) (((Class322) class322).anObject3782));
                                                        Class.forName("Class197").getDeclaredMethod("method1669", (new Class[]{((aClass2050 != null) ? aClass2050 : (aClass2050 = (method1584("java.awt.Component")))), ((aClass2051 != null) ? aClass2051 : (aClass2051 = (method1584("[I")))), Integer.TYPE, Integer.TYPE, ((aClass2052 != null) ? aClass2052 : (aClass2052 = (method1584("java.awt.Point"))))})).invoke(anObject2037, (new Object[]{((Component) objects[0]), ((int[]) objects[1]), (new Integer(class322.anInt3784)), (new Integer(((Class322) class322).anInt3785)), ((Point) (objects[2]))}));
                                                    } else if ((i ^ 0xffffffff) == -17) {
                                                        try {
                                                            if (!aString2044.startsWith("win"))
                                                                throw new Exception();
                                                            String string = ((String) (((Class322) class322).anObject3782));
                                                            if (!(string.startsWith("http://")) && !(string.startsWith("https://")))
                                                                throw new Exception();
                                                            String string_6_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            for (int i_7_ = 0; (i_7_ < (string.length())); i_7_++) {
                                                                if ((string_6_.indexOf(string.charAt(i_7_))) == -1)
                                                                    throw new Exception();
                                                            }
                                                            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string + "\"");
                                                            class322.anObject3787 = null;
                                                        } catch (Exception exception) {
                                                            class322.anObject3787 = exception;
                                                            throw exception;
                                                        }
                                                    } else
                                                        throw new Exception("");
                                                } else {
                                                    Class45 class45 = (method1575("", anInt2040, -1, ((String) (((Class322) class322).anObject3782))));
                                                    class322.anObject3787 = class45;
                                                }
                                            } else if (((Class174) this).aBoolean2047)
                                                class322.anObject3787 = (aClass88_2041.method663((byte) -120));
                                            else
                                                class322.anObject3787 = (Class.forName("Class93").getMethod("method688", new Class[0]).invoke(anObject2032, new Object[0]));
                                        } else {
                                            if ((aLong2038 ^ 0xffffffffffffffffL) < (Class118.method1112(116) ^ 0xffffffffffffffffL))
                                                throw new IOException();
                                            class322.anObject3787 = InetAddress.getByName((String) (((Class322) class322).anObject3782)).getAddress();
                                        }
                                    } else
                                        throw new Exception("");
                                } else {
                                    Transferable transferable = ((Transferable) ((Class322) class322).anObject3782);
                                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    clipboard.setContents(transferable, null);
                                }
                            } else {
                                Object[] objects = ((Object[]) ((Class322) class322).anObject3782);
                                if (((Class174) this).aBoolean2039 && (((Class) objects[0]).getClassLoader() == null))
                                    throw new SecurityException();
                                class322.anObject3787 = (((Class) objects[0]).getDeclaredField((String) objects[1]));
                            }
                        } else {
                            if ((Class118.method1112(116) ^ 0xffffffffffffffffL) > (aLong2038 ^ 0xffffffffffffffffL))
                                throw new IOException();
                            class322.anObject3787 = new DataInputStream(((URL) (((Class322) class322).anObject3782)).openStream());
                        }
                    } else {
                        Thread thread = new Thread((Runnable) ((Class322) class322).anObject3782);
                        thread.setDaemon(true);
                        thread.start();
                        thread.setPriority(class322.anInt3784);
                        class322.anObject3787 = thread;
                    }
                } else {
                    if (Class118.method1112(116) < aLong2038)
                        throw new IOException();
                    class322.anObject3787 = new Socket(InetAddress.getByName((String) (((Class322) class322).anObject3782)), class322.anInt3784);
                }
                class322.anInt3788 = 1;
            } catch (ThreadDeath threaddeath) {
                throw threaddeath;
            } catch (Throwable throwable) {
                class322.anInt3788 = 2;
            }
            synchronized (class322) {
                class322.notify();
            }
        }
    }

    private final Class322 method1569(int i, byte i_8_, int i_9_, int i_10_, Object object) {
        int i_11_ = 10 / ((-76 - i_8_) / 38);
        Class322 class322 = new Class322();
        ((Class322) class322).anInt3785 = i;
        ((Class322) class322).anObject3782 = object;
        class322.anInt3784 = i_9_;
        ((Class322) class322).anInt3786 = i_10_;
        synchronized (this) {
            if (aClass322_2030 != null) {
                ((Class322) aClass322_2030).aClass322_3783 = class322;
                aClass322_2030 = class322;
            } else
                aClass322_2030 = aClass322_2021 = class322;
            this.notify();
        }
        return class322;
    }

    final boolean method1570(byte[] is, File file, int i) {
        try {
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            if (i != 29478)
                aString2025 = null;
            fileoutputstream.write(is, 0, is.length);
            fileoutputstream.close();
            return true;
        } catch (IOException ioexception) {
            throw new RuntimeException();
        }
    }

    final Class322 method1571(boolean bool, Class var_class, String string) {
        if (bool != true)
            method1574(true, 63, null);
        return method1569(0, (byte) 107, 0, 9, new Object[]{var_class, string});
    }

    static final Class45 method1572(byte i, String string) {
        if (i != -91)
            method1575(null, -72, -82, null);
        return method1575(aString2022, anInt2040, -1, string);
    }

    final Class322 method1573(String string, int i) {
        if (i != -12903)
            anObject2024 = null;
        return method1569(0, (byte) -116, 0, 16, string);
    }

    final Class322 method1574(boolean bool, int i, String string) {
        if (i != 0)
            method1576(null, -93, 69);
        if (bool)
            return method1569(0, (byte) -117, 0, 12, string);
        return method1569(0, (byte) 125, 0, 13, string);
    }

    private static final Class45 method1575(String string, int i, int i_12_, String string_13_) {
        String string_14_;
        if ((i ^ 0xffffffff) != -34) {
            if ((i ^ 0xffffffff) != -35)
                string_14_ = "jagex_" + string + "_preferences" + string_13_ + ".dat";
            else
                string_14_ = ("jagex_" + string + "_preferences" + string_13_ + "_wip.dat");
        } else
            string_14_ = "jagex_" + string + "_preferences" + string_13_ + "_rc.dat";
        String[] strings = {"c:/rscache/", "/rscache/", aString2025, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
        if (i_12_ != -1)
            return null;
        for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (strings.length ^ 0xffffffff); i_15_++) {
            String string_16_ = strings[i_15_];
            if ((string_16_.length() ^ 0xffffffff) >= -1 || new File(string_16_).exists()) {
                try {
                    Class45 class45 = new Class45(new File(string_16_, string_14_), "rw", 10000L);
                    return class45;
                } catch (Exception exception) {
                    /* empty */
                }
            }
        }
        return null;
    }

    final Class322 method1576(Runnable runnable, int i, int i_17_) {
        if (i_17_ != 0)
            return null;
        return method1569(0, (byte) -120, i, 2, runnable);
    }

    final void method1577(int i) {
        aLong2038 = 5000L + Class118.method1112(116);
        int i_18_ = -30 / ((i - -66) / 48);
    }

    final Class322 method1578(int i, int i_19_, int i_20_, int i_21_, int i_22_) {
        if (i_22_ != 209715200)
            ((Class174) this).aClass45_2034 = null;
        return method1569((i_20_ << 1685775568) + i_21_, (byte) -125, i_19_ + (i << 689601936), 6, null);
    }

    final Class322 method1579(URL url, byte i) {
        if (i != 67)
            method1566(28, false, (byte) -36, null);
        return method1569(0, (byte) -114, 0, 4, url);
    }

    final Class322 method1580(int i, Class var_class, String string, Class[] var_classes) {
        if (i != -17)
            return null;
        return method1569(0, (byte) -114, 0, 8, new Object[]{var_class, string, var_classes});
    }

    final Class322 method1581(int i, Frame frame) {
        if (i != 1404065264)
            method1583(null, false, -113, null, -116, null);
        return method1569(0, (byte) -125, 0, 7, frame);
    }

    final Object method1582(byte i) {
        int i_23_ = 64 / ((i - 2) / 36);
        return anObject2024;
    }

    final Class322 method1583(Component component, boolean bool, int i, Point point, int i_24_, int[] is) {
        if (bool != false)
            return null;
        return method1569(i, (byte) -121, i_24_, 17, new Object[]{component, is, point});
    }

    Class174(int i, String string, int i_25_, boolean bool) throws Exception {
        aBoolean2035 = false;
        ((Class174) this).aClass45_2036 = null;
        aClass322_2021 = null;
        ((Class174) this).aClass45_2042 = null;
        ((Class174) this).aBoolean2047 = false;
        aClass322_2030 = null;
        aString2026 = "1.1";
        anInt2040 = i;
        aString2022 = string;
        aString2046 = "Unknown";
        ((Class174) this).aBoolean2039 = bool;
        try {
            aString2046 = System.getProperty("java.vendor");
            aString2026 = System.getProperty("java.version");
        } catch (Exception exception) {
            /* empty */
        }
        if (aString2046.toLowerCase().indexOf("microsoft") != -1)
            ((Class174) this).aBoolean2047 = true;
        try {
            aString2023 = System.getProperty("os.name");
        } catch (Exception exception) {
            aString2023 = "Unknown";
        }
        aString2044 = aString2023.toLowerCase();
        try {
            aString2028 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
            aString2028 = "";
        }
        try {
            aString2045 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
            aString2045 = "";
        }
        try {
            aString2025 = System.getProperty("user.home");
            if (aString2025 != null)
                aString2025 += "/";
        } catch (Exception exception) {
            /* empty */
        }
        if (aString2025 == null)
            aString2025 = "~/";
        try {
            ((Class174) this).anEventQueue2027 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable throwable) {
            /* empty */
        }
        if (!((Class174) this).aBoolean2047) {
            try {
                aMethod2029 = (Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE}));
            } catch (Exception exception) {
                /* empty */
            }
            try {
                aMethod2043 = (Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE}));
            } catch (Exception exception) {
                /* empty */
            }
        }
        Class3.method171(anInt2040, aString2022, 16);
        if (((Class174) this).aBoolean2039) {
            ((Class174) this).aClass45_2034 = new Class45(Class3.method172(anInt2040, (byte) 43, null, "random.dat"), "rw", 25L);
            ((Class174) this).aClass45_2042 = new Class45(Class3.method173(-3251, "main_file_cache.dat2"), "rw", 209715200L);
            ((Class174) this).aClass45_2036 = new Class45(Class3.method173(-3251, "main_file_cache.idx255"), "rw", 1048576L);
            ((Class174) this).aClass45Array2033 = new Class45[i_25_];
            for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > (i_25_ ^ 0xffffffff); i_26_++)
                ((Class174) this).aClass45Array2033[i_26_] = new Class45(Class3.method173(-3251, ("main_file_cache.idx" + i_26_)), "rw", 1048576L);
            if (((Class174) this).aBoolean2047) {
                try {
                    anObject2024 = Class.forName("Class97").newInstance();
                } catch (Throwable throwable) {
                    /* empty */
                }
            }
            try {
                if (!((Class174) this).aBoolean2047)
                    anObject2032 = Class.forName("Class93").newInstance();
                else
                    aClass88_2041 = new Class88();
            } catch (Throwable throwable) {
                /* empty */
            }
            try {
                if (((Class174) this).aBoolean2047)
                    aCallback_Sub1_2048 = new Callback_Sub1();
                else
                    anObject2037 = Class.forName("Class197").newInstance();
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        if (((Class174) this).aBoolean2039 && !((Class174) this).aBoolean2047) {
            ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
            for (ThreadGroup threadgroup_27_ = threadgroup.getParent(); threadgroup_27_ != null; threadgroup_27_ = threadgroup.getParent())
                threadgroup = threadgroup_27_;
            Thread[] threads = new Thread[1000];
            threadgroup.enumerate(threads);
            for (int i_28_ = 0; i_28_ < threads.length; i_28_++) {
                if (threads[i_28_] != null && threads[i_28_].getName().startsWith("AWT"))
                    threads[i_28_].setPriority(1);
            }
        }
        aBoolean2035 = false;
        aThread2031 = new Thread(this);
        aThread2031.setPriority(10);
        aThread2031.setDaemon(true);
        aThread2031.start();
    }

    /*synthetic*/
    static Class method1584(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
