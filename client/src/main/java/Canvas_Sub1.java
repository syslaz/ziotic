/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Canvas_Sub1 extends Canvas {
    static int anInt64;
    static int anInt65;
    static int anInt66;
    static int anInt67;
    static int anInt68;
    private Component aComponent69;
    static Class278 aClass278_70 = new Class278(64);
    static Class48 aClass48_71;
    static Object anObject72;
    static int unreadMessages;

    public static void method121(int i) {
        if (i > 112) {
            anObject72 = null;
            aClass48_71 = null;
            aClass278_70 = null;
        }
    }

    public final void update(Graphics graphics) {
        aComponent69.update(graphics);
        anInt68++;
    }

    public final void paint(Graphics graphics) {
        anInt64++;
        aComponent69.paint(graphics);
    }

    static final Class160 method122(byte i) {
        anInt66++;
        if (i <= 10)
            method121(94);
        try {
            return new Class160_Sub2();
        } catch (Throwable throwable) {
            try {
                return (Class160) Class.forName("Class160_Sub1").newInstance();
            } catch (Throwable throwable_0_) {
                return new Class160_Sub3();
            }
        }
    }

    static final void method123(Node_Sub8_Sub11 class248_sub8_sub11, int i) {
        anInt65++;
        if (class248_sub8_sub11 != null && i >= 46) {
            Class358.aClass293_4424.method3109(class248_sub8_sub11, -120);
            Class379.anInt4638++;
            Object object = null;
            Node_Sub8_Sub5 class248_sub8_sub5;
            if (!((Node_Sub8_Sub11) class248_sub8_sub11).aBoolean8991 && !"".equals(((Node_Sub8_Sub11) class248_sub8_sub11).aString9001)) {
                long l = ((Node_Sub8_Sub11) class248_sub8_sub11).aLong8994;
                for (class248_sub8_sub5 = ((Node_Sub8_Sub5) Class14.aClass65_267.method501(l, (byte) 31)); class248_sub8_sub5 != null; class248_sub8_sub5 = ((Node_Sub8_Sub5) Class14.aClass65_267.method507((byte) 88))) {
                    if (((Node_Sub8_Sub5) class248_sub8_sub5).aString8934.equals(((Node_Sub8_Sub11) class248_sub8_sub11).aString9001))
                        break;
                }
                if (class248_sub8_sub5 == null) {
                    class248_sub8_sub5 = ((Node_Sub8_Sub5) Class304.aClass278_3529.method2863(4, l));
                    if (class248_sub8_sub5 != null && !(((Node_Sub8_Sub5) class248_sub8_sub5).aString8934.equals(((Node_Sub8_Sub11) class248_sub8_sub11).aString9001)))
                        class248_sub8_sub5 = null;
                    if (class248_sub8_sub5 == null)
                        class248_sub8_sub5 = new Node_Sub8_Sub5(((Node_Sub8_Sub11) class248_sub8_sub11).aString9001);
                    Class14.aClass65_267.method509(-1, class248_sub8_sub5, l);
                    Class113.anInt1402++;
                }
            } else {
                class248_sub8_sub5 = new Node_Sub8_Sub5(((Node_Sub8_Sub11) class248_sub8_sub11).aString9001);
                Class113.anInt1402++;
            }
            if (class248_sub8_sub5.method2050(class248_sub8_sub11, (byte) 86))
                Node_Sub14_Sub10.method2302(true, class248_sub8_sub5);
        }
    }

    static final boolean method124(int i, byte i_1_, int i_2_) {
        anInt67++;
        if (i_1_ <= 31)
            aClass48_71 = null;
        if ((0x800 & i) == 0)
            return false;
        return true;
    }

    Canvas_Sub1(Component component) {
        aComponent69 = component;
    }
}
