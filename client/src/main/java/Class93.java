/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Field;

public final class Class93 {
    private DisplayMode aDisplayMode1207;
    private GraphicsDevice aGraphicsDevice1208;

    public final void method685(Frame frame, int i, int i_0_, int i_1_, int i_2_) {
        aDisplayMode1207 = aGraphicsDevice1208.getDisplayMode();
        if (null == aDisplayMode1207)
            throw new NullPointerException();
        frame.setUndecorated(true);
        frame.enableInputMethods(false);
        method686(frame, 122);
        if (i_2_ == 0) {
            int i_3_ = aDisplayMode1207.getRefreshRate();
            DisplayMode[] displaymodes = aGraphicsDevice1208.getDisplayModes();
            boolean bool = false;
            for (int i_4_ = 0; (displaymodes.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
                if (i == displaymodes[i_4_].getWidth() && i_0_ == displaymodes[i_4_].getHeight() && displaymodes[i_4_].getBitDepth() == i_1_) {
                    int i_5_ = displaymodes[i_4_].getRefreshRate();
                    if (!bool || ((Math.abs(-i_3_ + i_5_) ^ 0xffffffff) > (Math.abs(-i_3_ + i_2_) ^ 0xffffffff))) {
                        i_2_ = i_5_;
                        bool = true;
                    }
                }
            }
            if (!bool)
                i_2_ = i_3_;
        }
        aGraphicsDevice1208.setDisplayMode(new DisplayMode(i, i_0_, i_1_, i_2_));
    }

    private final void method686(Frame frame, int i) {
        boolean bool = false;
        try {
            if (i <= 96)
                method687();
            Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            field.setAccessible(true);
            boolean bool_6_ = ((Boolean) field.get(aGraphicsDevice1208)).booleanValue();
            if (bool_6_) {
                bool = true;
                field.set(aGraphicsDevice1208, Boolean.FALSE);
            }
        } catch (Throwable throwable) {
            /* empty */
        }
        try {
            aGraphicsDevice1208.setFullScreenWindow(frame);
        } catch (Throwable t) {
            if (bool) {
                try {
                    Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    field.set(aGraphicsDevice1208, Boolean.TRUE);
                } catch (Throwable throwable) {
                    /* empty */
                }
            }
        }
        if (bool) {
            try {
                Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                field.set(aGraphicsDevice1208, Boolean.TRUE);
            } catch (Throwable throwable) {
                /* empty */
            }
        }
    }

    public final void method687() {
        if (null != aDisplayMode1207) {
            aGraphicsDevice1208.setDisplayMode(aDisplayMode1207);
            if (!aGraphicsDevice1208.getDisplayMode().equals(aDisplayMode1207))
                throw new RuntimeException("Did not return to correct resolution!");
            aDisplayMode1207 = null;
        }
        method686(null, 115);
    }

    public final int[] method688() {
        DisplayMode[] displaymodes = aGraphicsDevice1208.getDisplayModes();
        int[] is = new int[displaymodes.length << 547095682];
        for (int i = 0; displaymodes.length > i; i++) {
            is[i << -2075937950] = displaymodes[i].getWidth();
            is[(i << 2005549858) - -1] = displaymodes[i].getHeight();
            is[(i << 430292738) - -2] = displaymodes[i].getBitDepth();
            is[(i << -1481511262) + 3] = displaymodes[i].getRefreshRate();
        }
        return is;
    }

    public Class93() throws Exception {
        GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        aGraphicsDevice1208 = graphicsenvironment.getDefaultScreenDevice();
        if (!aGraphicsDevice1208.isFullScreenSupported()) {
            GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
            GraphicsDevice[] graphicsdevices_7_ = graphicsdevices;
            for (int i = 0; i < graphicsdevices_7_.length; i++) {
                GraphicsDevice graphicsdevice = graphicsdevices_7_[i];
                if (graphicsdevice != null && graphicsdevice.isFullScreenSupported()) {
                    aGraphicsDevice1208 = graphicsdevice;
                    return;
                }
            }
            throw new Exception();
        }
    }
}
