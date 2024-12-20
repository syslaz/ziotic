/* D3DPRESENT_PARAMETERS - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import java.awt.*;

public class D3DPRESENT_PARAMETERS {
    public int BackBufferFormat;
    public int MultiSampleQuality = 0;
    public Canvas DeviceWindow;
    public int BackBufferWidth = 0;
    public boolean EnableAutoDepthStencil;
    public int PresentationInterval = 0;
    public int FullScreen_RefreshRateInHz;
    public int Flags;
    public boolean Windowed;
    public int BackBufferCount;
    public int SwapEffect;
    public int AutoDepthStencilFormat;
    public int BackBufferHeight;
    public int MultiSampleType;

    public D3DPRESENT_PARAMETERS(Canvas canvas) {
        BackBufferFormat = 0;
        SwapEffect = 1;
        AutoDepthStencilFormat = 0;
        BackBufferHeight = 0;
        BackBufferCount = 0;
        MultiSampleType = 0;
        DeviceWindow = canvas;
    }
}
