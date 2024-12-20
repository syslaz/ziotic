/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.image.BufferedImage;

final class Class197 {
    private Robot aRobot2237;
    private Component aComponent2238;

    final void method1669(Component component, int[] is, int i, int i_0_, Point point) {
        if (is != null) {
            BufferedImage bufferedimage = new BufferedImage(i, i_0_, 2);
            bufferedimage.setRGB(0, 0, i, i_0_, is, 0, i);
            component.setCursor(component.getToolkit().createCustomCursor(bufferedimage, point, null));
        } else
            component.setCursor(null);
    }

    Class197() throws Exception {
        aRobot2237 = new Robot();
    }

    final void method1670(Component component, boolean bool) {
        if (bool)
            component = null;
        else if (component == null)
            throw new NullPointerException();
        if (component != aComponent2238) {
            if (null != aComponent2238) {
                aComponent2238.setCursor(null);
                aComponent2238 = null;
            }
            if (null != component) {
                component.setCursor(component.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
                aComponent2238 = component;
            }
        }
    }

    final void method1671(int i, int i_1_) {
        aRobot2237.mouseMove(i, i_1_);
    }
}
