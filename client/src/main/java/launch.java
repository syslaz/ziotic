import javax.swing.*;
import java.applet.Applet;
import java.applet.AppletStub;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class launch extends Applet implements AppletStub {

    private static final long serialVersionUID = 1L;

    public static boolean rs = false;

    public static Properties clientParams = new Properties();
    public JFrame clientFrame = null;
    public client clientRef = null;

    public static void main(String[] arg0) {
        launch l = new launch();
        l.doFrame();
    }

    @Override
    public void init() {
        doApplet();
    }

    private void doApplet() {
        setParms();
        startClient();
    }

    private void doFrame() {
        setParms();
        openFrame();
        startClient();
    }

    private void setParms() {
        clientParams.put("cabbase", "ziotic.cab");
        clientParams.put("java_arguments", "-Xmx102m -Dsun.java2d.noddraw=true");
        clientParams.put("colourid", "0");
        clientParams.put("worldid", "1");
        clientParams.put("lobbyid", "3594");
        clientParams.put("lobbyaddress", rs ? "lobby17.runescape.com" : "127.0.0.1");
        clientParams.put("demoid", "0");
        clientParams.put("demoaddress", "");
        clientParams.put("modewhere", "1");
        clientParams.put("modewhat", "0");
        clientParams.put("lang", "0");
        clientParams.put("objecttag", "0");
        clientParams.put("js", "1");
        clientParams.put("game", "0");
        clientParams.put("affid", "0");
        clientParams.put("advert", "1");
        clientParams.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
        clientParams.put("country", "0");
        clientParams.put("haveie6", "0");
        clientParams.put("havefirefox", "1");
        clientParams.put("cookieprefix", "");
        clientParams.put("cookiehost", ".ziotic.com");
        clientParams.put("cachesubdirid", "0");
        clientParams.put("crashurl", "");
        clientParams.put("unsignedurl", "");
        clientParams.put("sitesettings_member", "1");
        clientParams.put("frombilling", "false");
        clientParams.put("sskey", "");
        clientParams.put("force64mb", "false");
        clientParams.put("worldflags", "8");
    }

    private void openFrame() {
        clientFrame = new JFrame("Ziotic");
        clientFrame.add(this);
        clientFrame.setVisible(true);
        clientFrame.setSize(800, 600);
    }

    private void startClient() {
        try {

            Applet_Sub1.provideLoaderApplet(this);
            client.loaderVersion = 9870;
            client var_client = new client();
            var_client.init();
            var_client.start();
            var_client.setStub(this);
            this.add(var_client);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getParameter(String arg0) {
        return (String) clientParams.get(arg0);
    }

    @Override
    public void appletResize(int arg0, int arg1) {
        clientRef.setSize(arg0, arg1);
    }

    @Override
    public URL getDocumentBase() {
        try {
            return new URL("http://127.0.0.1");
        } catch (MalformedURLException e) {
        }
        return null;
    }

    @Override
    public URL getCodeBase() {
        try {
            return new URL("http://127.0.0.1");
        } catch (MalformedURLException e) {
        }
        return null;
    }
}