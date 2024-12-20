/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;

import java.awt.*;

final class Class88 implements IEnumModesCallback {
    private static int anInt1086;
    private static int[] anIntArray1087;
    private DirectDraw aDirectDraw1088 = new DirectDraw();

    final int[] method663(byte i) {
        aDirectDraw1088.enumDisplayModes(0, null, null, this);
        anIntArray1087 = new int[anInt1086];
        anInt1086 = 0;
        aDirectDraw1088.enumDisplayModes(0, null, null, this);
        int[] is = anIntArray1087;
        anInt1086 = 0;
        int i_0_ = -100 % ((i - -68) / 41);
        anIntArray1087 = null;
        return is;
    }

    public final void method664(DDSurfaceDesc ddsurfacedesc, IUnknown iunknown) {
        if (anIntArray1087 != null) {
            anIntArray1087[anInt1086++] = ddsurfacedesc.width;
            anIntArray1087[anInt1086++] = ddsurfacedesc.height;
            anIntArray1087[anInt1086++] = ddsurfacedesc.rgbBitCount;
            anIntArray1087[anInt1086++] = ddsurfacedesc.refreshRate;
        } else
            anInt1086 += 4;
    }

    final void method665(Frame frame, byte i) {
        aDirectDraw1088.restoreDisplayMode();
        if (i == 85)
            aDirectDraw1088.setCooperativeLevel(frame, 8);
    }

    final void method666(Frame frame, int i, int i_1_, int i_2_, int i_3_, int i_4_) {
        frame.setVisible(true);
        // WComponentPeer wcomponentpeer = (WComponentPeer) frame.getPeer();
        // int i_5_ = wcomponentpeer.getHwnd();
        // User32.SetWindowLong(i_5_, -16, -2147483648);
        // User32.SetWindowLong(i_5_, -20, 8);
        aDirectDraw1088.setCooperativeLevel(frame, 17);
        aDirectDraw1088.setDisplayMode(i_3_, i_2_, i, i_1_, i_4_);
        frame.setBounds(0, 0, i_3_, i_2_);
        frame.toFront();
        frame.requestFocus();
    }

    public Class88() {
        aDirectDraw1088.initialize(null);
    }
}
