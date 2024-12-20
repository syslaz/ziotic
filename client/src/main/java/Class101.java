/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101 {
    Class162 aClass162_1283;
    static int anInt1284;
    static Class360 aClass360_1285 = new Class360();
    static String[] aStringArray1286;
    static int anInt1287;
    static int anInt1288;
    r aR1289;
    static boolean aBoolean1290;
    static int anInt1291;
    static int anInt1292 = 0;

    static final Class346_Sub2 method715(boolean bool) {
        anInt1291++;
        Class346_Sub2 class346_sub2 = (Class346_Sub2) r_Sub1.aClass360_10268.method3814(bool);
        if (class346_sub2 != null) {
            OutputStream_Sub2.anInt93--;
            return class346_sub2;
        }
        return new Class346_Sub2();
    }

    static final void method716(byte i) {
        int i_0_ = -17 / ((i - 6) / 44);
        anInt1287++;
        Node_Sub2_Sub2.anInt8845++;
        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, Class346_Sub5_Sub2.aISAACCypher_9889, Node_Sub14_Sub13.aOutgoingOpcode_9299);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-82, Class346_Sub7_Sub3.method3672((byte) -112));
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, Class146.anInt1724);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, Class282_Sub20.anInt7800);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-21, ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7357.method2946(true));
        Class226_Sub3.method1814(class248_sub36, 0);
    }

    static final Node_Sub8_Sub18 method717(int i, int i_1_, Class58 class58, int i_2_) {
        anInt1284++;
        int i_3_ = i << 1832275562 | ((Class58) class58).anInt5077;
        Node_Sub8_Sub18 class248_sub8_sub18 = ((Node_Sub8_Sub18) Class340_Sub7.aClass365_8165.method3826((long) i_3_ << 1114794896, -1));
        if (class248_sub8_sub18 != null)
            return class248_sub8_sub18;
        byte[] is = (Class246.aClass381_2778.method3930(i_2_ + 22037, Class246.aClass381_2778.method3904(i_3_, (byte) 100)));
        if (i_2_ != -22038)
            method717(-128, -124, null, 72);
        if (is != null) {
            if ((is.length ^ 0xffffffff) >= -2)
                return null;
            try {
                class248_sub8_sub18 = Class241.method1926((byte) -43, is);
            } catch (Exception exception) {
                throw new RuntimeException(exception.getMessage() + " S: " + i_3_);
            }
            ((Node_Sub8_Sub18) class248_sub8_sub18).aClass58_9076 = class58;
            Class340_Sub7.aClass365_8165.method3825((long) i_3_ << 593070480, (byte) 92, class248_sub8_sub18);
            return class248_sub8_sub18;
        }
        i_3_ = i_1_ + 65536 << -1001115158 | ((Class58) class58).anInt5077;
        class248_sub8_sub18 = ((Node_Sub8_Sub18) Class340_Sub7.aClass365_8165.method3826((long) i_3_ << -1060113776, -1));
        if (class248_sub8_sub18 != null)
            return class248_sub8_sub18;
        is = (Class246.aClass381_2778.method3930(-1, Class246.aClass381_2778.method3904(i_3_, (byte) 105)));
        if (is != null) {
            if (is.length <= 1)
                return null;
            try {
                class248_sub8_sub18 = Class241.method1926((byte) -43, is);
            } catch (Exception exception) {
                throw new RuntimeException(exception.getMessage() + " S: " + i_3_);
            }
            ((Node_Sub8_Sub18) class248_sub8_sub18).aClass58_9076 = class58;
            Class340_Sub7.aClass365_8165.method3825((long) i_3_ << 339952400, (byte) 83, class248_sub8_sub18);
            return class248_sub8_sub18;
        }
        i_3_ = ((Class58) class58).anInt5077 | 0x3fffc00;
        class248_sub8_sub18 = ((Node_Sub8_Sub18) Class340_Sub7.aClass365_8165.method3826((long) i_3_ << 2077735568, -1));
        if (class248_sub8_sub18 != null)
            return class248_sub8_sub18;
        is = (Class246.aClass381_2778.method3930(-1, Class246.aClass381_2778.method3904(i_3_, (byte) 103)));
        if (is != null) {
            if ((is.length ^ 0xffffffff) >= -2)
                return null;
            try {
                class248_sub8_sub18 = Class241.method1926((byte) -43, is);
            } catch (Exception exception) {
                throw new RuntimeException(exception.getMessage() + " S: " + i_3_);
            }
            ((Node_Sub8_Sub18) class248_sub8_sub18).aClass58_9076 = class58;
            Class340_Sub7.aClass365_8165.method3825((long) i_3_ << -1489855472, (byte) 113, class248_sub8_sub18);
            return class248_sub8_sub18;
        }
        return null;
    }

    static final String method718(int i, Node_Sub8_Sub11 class248_sub8_sub11) {
        anInt1288++;
        if (i <= 74)
            method716((byte) -54);
        if (((Node_Sub8_Sub11) class248_sub8_sub11).aString8988 == null || ((Node_Sub8_Sub11) class248_sub8_sub11).aString8988.length() == 0) {
            if (((Node_Sub8_Sub11) class248_sub8_sub11).aString9001 != null && ((Node_Sub8_Sub11) class248_sub8_sub11).aString9001.length() > 0)
                return (((Node_Sub8_Sub11) class248_sub8_sub11).aString8996 + Class41.aClass41_498.method301(Class191.anInt4822, (byte) -108) + (((Node_Sub8_Sub11) class248_sub8_sub11).aString9001));
            return ((Node_Sub8_Sub11) class248_sub8_sub11).aString8996;
        }
        if (((Node_Sub8_Sub11) class248_sub8_sub11).aString9001 != null && (((Node_Sub8_Sub11) class248_sub8_sub11).aString9001.length() ^ 0xffffffff) < -1)
            return (((Node_Sub8_Sub11) class248_sub8_sub11).aString8996 + Class41.aClass41_498.method301(Class191.anInt4822, (byte) -108) + ((Node_Sub8_Sub11) class248_sub8_sub11).aString9001 + Class41.aClass41_498.method301(Class191.anInt4822, (byte) -108) + ((Node_Sub8_Sub11) class248_sub8_sub11).aString8988);
        return (((Node_Sub8_Sub11) class248_sub8_sub11).aString8996 + Class41.aClass41_498.method301(Class191.anInt4822, (byte) -108) + ((Node_Sub8_Sub11) class248_sub8_sub11).aString8988);
    }

    public static void method719(int i) {
        if (i == 2077735568) {
            aStringArray1286 = null;
            aClass360_1285 = null;
        }
    }

    public Class101() {
        /* empty */
    }
}
