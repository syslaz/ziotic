/* Class30_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.*;
import java.nio.charset.Charset;
import java.util.List;

public final class Class30_Sub2 extends Class30 {
    private ProxySelector aProxySelector5271 = ProxySelector.getDefault();
    static Class aClass5272;
    static Class aClass5273;

    private final Socket method265(String string, int i, String string_0_) throws IOException {
        Socket socket = new Socket(string, i);
        socket.setSoTimeout(10000);
        OutputStream outputstream = socket.getOutputStream();
        if (string_0_ != null)
            outputstream.write(("CONNECT " + ((Class30_Sub2) this).aString374 + ":" + ((Class30_Sub2) this).anInt373 + " HTTP/1.0\n" + string_0_ + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
        else
            outputstream.write(("CONNECT " + ((Class30_Sub2) this).aString374 + ":" + ((Class30_Sub2) this).anInt373 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        outputstream.flush();
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String string_1_ = bufferedreader.readLine();
        if (string_1_ != null) {
            if (string_1_.startsWith("HTTP/1.0 200") || string_1_.startsWith("HTTP/1.1 200"))
                return socket;
            if (string_1_.startsWith("HTTP/1.0 407") || string_1_.startsWith("HTTP/1.1 407")) {
                int i_2_ = 0;
                String string_3_ = "proxy-authenticate: ";
                for (string_1_ = bufferedreader.readLine(); null != string_1_ && (i_2_ ^ 0xffffffff) > -51; string_1_ = bufferedreader.readLine()) {
                    if (string_1_.toLowerCase().startsWith(string_3_)) {
                        string_1_ = string_1_.substring(string_3_.length()).trim();
                        int i_4_ = string_1_.indexOf(' ');
                        if (0 != (i_4_ ^ 0xffffffff))
                            string_1_ = string_1_.substring(0, i_4_);
                        throw new IOException_Sub1(string_1_);
                    }
                    i_2_++;
                }
                throw new IOException_Sub1("");
            }
        }
        outputstream.close();
        bufferedreader.close();
        socket.close();
        return null;
    }

    private final Socket method266(int i, Proxy proxy) throws IOException {
        if (proxy.type() == Proxy.Type.DIRECT)
            return method261(0);
        if (i != -32759)
            return null;
        java.net.SocketAddress socketaddress = proxy.address();
        if (!(socketaddress instanceof InetSocketAddress))
            return null;
        InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
        if (proxy.type() != Proxy.Type.HTTP) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                Socket socket = new Socket(proxy);
                socket.connect(new InetSocketAddress((((Class30_Sub2) this).aString374), (((Class30_Sub2) this).anInt373)));
                return socket;
            }
        } else {
            String string = null;
            try {
                Class var_class = (Class.forName("sun.net.www.protocol.http.AuthenticationInfo"));
                Method method = (var_class.getDeclaredMethod("getProxyAuth", (new Class[]{(aClass5272 == null ? aClass5272 = method267("java.lang.String") : aClass5272), Integer.TYPE})));
                method.setAccessible(true);
                Object object = method.invoke(null, (new Object[]{inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort())}));
                if (object != null) {
                    Method method_5_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
                    method_5_.setAccessible(true);
                    if (((Boolean) method_5_.invoke(object, new Object[0])).booleanValue()) {
                        Method method_6_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
                        method_6_.setAccessible(true);
                        Method method_7_ = (var_class.getDeclaredMethod("getHeaderValue", (new Class[]{(aClass5273 == null ? aClass5273 = method267("java.net.URL") : aClass5273), (aClass5272 == null ? (aClass5272 = method267("java.lang.String")) : aClass5272)})));
                        method_7_.setAccessible(true);
                        String string_8_ = (String) method_6_.invoke(object, new Object[0]);
                        String string_9_ = ((String) method_7_.invoke(object, (new Object[]{new URL("https://" + ((Class30_Sub2) this).aString374 + "/"), "https"})));
                        string = string_8_ + ": " + string_9_;
                    }
                }
            } catch (Exception exception) {
                /* empty */
            }
            return method265(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string);
        }
        return null;
    }

    final Socket method264(int i) throws IOException {
        if (i <= 74)
            aProxySelector5271 = null;
        boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
        if (!bool)
            System.setProperty("java.net.useSystemProxies", "true");
        boolean bool_10_ = 443 == ((Class30_Sub2) this).anInt373;
        List list;
        List list_11_;
        try {
            list = aProxySelector5271.select(new URI((!bool_10_ ? "http" : "https") + "://" + (((Class30_Sub2) this).aString374)));
            list_11_ = aProxySelector5271.select(new URI((!bool_10_ ? "https" : "http") + "://" + (((Class30_Sub2) this).aString374)));
        } catch (URISyntaxException urisyntaxexception) {
            return method261(0);
        }
        list.addAll(list_11_);
        Object[] objects = list.toArray();
        IOException_Sub1 ioexception_sub1 = null;
        Object[] objects_12_ = objects;
        for (int i_13_ = 0; objects_12_.length > i_13_; i_13_++) {
            Object object = objects_12_[i_13_];
            Proxy proxy = (Proxy) object;
            Socket socket;
            try {
                Socket socket_14_ = method266(-32759, proxy);
                if (null == socket_14_)
                    continue;
                socket = socket_14_;
            } catch (IOException_Sub1 ioexception_sub1_15_) {
                ioexception_sub1 = ioexception_sub1_15_;
                continue;
            } catch (IOException ioexception) {
                continue;
            }
            return socket;
        }
        if (null != ioexception_sub1)
            throw ioexception_sub1;
        return method261(0);
    }

    static Class method267(String string) {
        Class var_class = null;
        try {
            var_class = Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            try {
                throw new NoClassDefFoundError().initCause(classnotfoundexception);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        return var_class;
    }
}
