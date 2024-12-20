/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Method;

final class Class364 {
    static final ha method3824(byte i, int i_0_, Canvas canvas, d var_d, Class381 class381) {
        ha var_ha;
        try {
            if (!Node_Sub42_Sub1.method2629(-51))
                throw new RuntimeException("");
            if (!Class111.method776(i ^ 0x18, "jagdx"))
                throw new RuntimeException("");
            if (i != 95)
                method3824((byte) 13, 20, null, null, null);
            Class var_class = Class.forName("ha_Sub3_Sub2");
            Method method = (var_class.getDeclaredMethod("createToolkit", new Class[]{Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("Class381"), Class.forName("java.lang.Integer")}));
            var_ha = (ha) method.invoke(null, new Object[]{canvas, var_d, class381, new Integer(i_0_)});
        } catch (Throwable throwable) {
            throw new RuntimeException("");
        }
        return var_ha;
    }
}
