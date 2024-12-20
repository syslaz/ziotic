/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.URL;

final class Class308 implements Runnable {
    static int anInt3568;
    private Thread aThread3569;
    private volatile boolean aBoolean3570;
    static int anInt3571;
    private Class322 aClass322_3572;
    static int anInt3573;
    static int anInt3574;
    private Class311[] aClass311Array3575;
    static int anInt3576;

    final Class311 method3231(int i, int i_0_) {
        if (i <= 64)
            return null;
        anInt3573++;
        if (aClass311Array3575 == null || (i_0_ ^ 0xffffffff) > -1 || i_0_ >= aClass311Array3575.length)
            return null;
        return aClass311Array3575[i_0_];
    }

    static final int method3232(byte i, String string) {
        anInt3574++;
        if (i != -85)
            method3232((byte) -21, null);
        if (string == null)
            return -1;
        for (int i_1_ = 0; (client.anInt5226 ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
            if (string.equalsIgnoreCase(Class282_Sub11.aStringArray7703[i_1_]))
                return i_1_;
        }
        return -1;
    }

    static final void method3233(int i, int i_2_, int i_3_, boolean bool) {
        anInt3576++;
        if (Node_Sub14_Sub35.aClass65_9540.method501((long) i_3_, (byte) 31) == null) {
            if (!Class279_Sub1_Sub2.aBoolean9825)
                Class64.method498((byte) -105, i_3_, bool);
            else {
                Node_Sub22 class248_sub22 = new Node_Sub22(i_3_, new Class86_Sub1(4096, (Class346_Sub5.aClass381_8282), i_3_), i, bool);
                ((Node_Sub22) class248_sub22).aClass86_Sub1_7073.method656((byte) 83, (Class346_Sub7_Sub5_Sub1.aStringArray10037[Class191.anInt4822]));
                Node_Sub14_Sub35.aClass65_9540.method509(-1, class248_sub22, (long) i_3_);
            }
        }
        if (i_2_ >= 28) {
            /* empty */
        }
    }

    public final void run() {
        anInt3568++;
        try {
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader((DataInputStream) (aClass322_3572.anObject3787)));
            String string = bufferedreader.readLine();
            Class207 class207 = Animable.method3597(1);
            for (/**/; string != null; string = bufferedreader.readLine())
                class207.method1706(-17195, string);
            String[] strings = class207.method1708(96);
            if (strings.length % 3 != 0)
                return;
            aClass311Array3575 = new Class311[strings.length / 3];
            for (int i = 0; (i ^ 0xffffffff) > (strings.length ^ 0xffffffff); i += 3)
                aClass311Array3575[i / 3] = new Class311(strings[i], strings[i - -1], strings[i - -2]);
        } catch (java.io.IOException ioexception) {
            /* empty */
        }
        aBoolean3570 = true;
    }

    public Class308() {
        /* empty */
    }

    final boolean method3234(int i) {
        anInt3571++;
        if (aBoolean3570)
            return true;
        if (aClass322_3572 == null) {
            try {
                int i_4_ = (s_Sub2.aClass339_7951 != Class18.aClass339_295 ? (((WorldAddress) Class279_Sub2_Sub1.worldAddress).worldId) + 7000 : 80);
                aClass322_3572 = (Node_Sub14_Sub15.aClass174_9328.method1579(new URL("http://" + (((WorldAddress) Class279_Sub2_Sub1.worldAddress).address) + ":" + i_4_ + "/news.ws?game=" + (((Class215) Class12.aClass215_249).anInt2475)), (byte) 67));
            } catch (java.net.MalformedURLException malformedurlexception) {
                return true;
            }
        }
        if (aClass322_3572 == null || (aClass322_3572.anInt3788 ^ 0xffffffff) == -3)
            return true;
        if (i != -26756)
            method3233(-6, 32, -80, false);
        if ((aClass322_3572.anInt3788 ^ 0xffffffff) != -2)
            return false;
        if (aThread3569 == null) {
            aThread3569 = new Thread(this);
            aThread3569.start();
        }
        return aBoolean3570;
    }
}
