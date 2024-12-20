/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

final class OutgoingOpcode {
    static int anInt1911;
    static int anInt1912;
    static int anInt1913;
    static int anInt1914;
    int size;
    static IncommingOpcode aIncommingOpcode_1916 = new IncommingOpcode(97, 20);
    private int opcode;
    static IncommingOpcode aIncommingOpcode_1918;
    static int anInt1919 = 0;
    static int anInt1920;

    final int method1510(int i) {
        if (i != -1)
            aIncommingOpcode_1916 = null;
        anInt1911++;
        return opcode;
    }

    public final String toString() {
        anInt1913++;
        throw new IllegalStateException();
    }

    static final void method1511(int i) {
        if ((Class65.anInt894 ^ 0xffffffff) > -103)
            Class65.anInt894 += 6;
        anInt1920++;
        if (Class131.anInt1603 != -1 && (Class118.method1112(i + -8716) > Node_Sub14_Sub5.aLong9205)) {
            for (int i_0_ = Class131.anInt1603; ((i_0_ ^ 0xffffffff) > (Class188.aStringArray2190.length ^ 0xffffffff)); i_0_++) {
                if (Class188.aStringArray2190[i_0_].startsWith("pause")) {
                    int i_1_ = 5;
                    try {
                        i_1_ = Integer.parseInt(Class188.aStringArray2190[i_0_].substring(6));
                    } catch (Exception exception) {
                        /* empty */
                    }
                    Class106.method750("Pausing for " + i_1_ + " seconds...", (byte) 116);
                    Class131.anInt1603 = i_0_ - -1;
                    Node_Sub14_Sub5.aLong9205 = (long) (i_1_ * 1000) + Class118.method1112(116);
                    return;
                }
                aa.aString104 = Class188.aStringArray2190[i_0_];
                IncommingOpcode.method1106(1354797057, false);
            }
            Class131.anInt1603 = -1;
        }
        if (Class329.anInt3851 != 0) {
            Class32.anInt387 -= 5 * Class329.anInt3851;
            if ((Class291.anInt4742 ^ 0xffffffff) >= (Class32.anInt387 ^ 0xffffffff))
                Class32.anInt387 = Class291.anInt4742 - 1;
            Class329.anInt3851 = 0;
            if ((Class32.anInt387 ^ 0xffffffff) > -1)
                Class32.anInt387 = 0;
        }
        if (i != 8832)
            aIncommingOpcode_1918 = null;
        for (int i_2_ = 0; Class262.anInt2977 > i_2_; i_2_++) {
            Interface19 interface19 = Class262.anInterface19Array2974[i_2_];
            int i_3_ = interface19.method61(i ^ ~0x6a99);
            char c = interface19.method62((byte) -114);
            int i_4_ = interface19.method60(-22313);
            if ((i_3_ ^ 0xffffffff) == -85)
                IncommingOpcode.method1106(1354797057, false);
            if (i_3_ == 80)
                IncommingOpcode.method1106(1354797057, true);
            else if (i_3_ != 66 || (i_4_ & 0x4) == 0) {
                if ((i_3_ ^ 0xffffffff) != -68 || (0x4 & i_4_) == 0) {
                    if ((i_3_ ^ 0xffffffff) != -86 || (Node_Sub19.anInt7040 ^ 0xffffffff) >= -1) {
                        if (i_3_ != 101 || (Node_Sub19.anInt7040 >= aa.aString104.length())) {
                            if (i_3_ != 96 || Node_Sub19.anInt7040 <= 0) {
                                if (i_3_ != 97 || (Node_Sub19.anInt7040 >= aa.aString104.length())) {
                                    if (i_3_ != 102) {
                                        if ((i_3_ ^ 0xffffffff) == -104)
                                            Node_Sub19.anInt7040 = aa.aString104.length();
                                        else if (i_3_ == 104 && ((Node_Sub14_Sub15.anInt9324) < (Class162.aStringArray1909).length)) {
                                            Node_Sub14_Sub15.anInt9324++;
                                            Node_Sub38.method2595(i ^ 0x2280);
                                            Node_Sub19.anInt7040 = aa.aString104.length();
                                        } else if ((i_3_ ^ 0xffffffff) != -106 || (Node_Sub14_Sub15.anInt9324) <= 0) {
                                            if (Class136.method1250(65, c) || c == 92 || c == 47 || c == 46 || c == 58 || c == 44 || (c ^ 0xffffffff) == -33 || (c ^ 0xffffffff) == -96 || (c ^ 0xffffffff) == -46 || c == 43 || c == 91 || c == 93) {
                                                aa.aString104 = ((aa.aString104.substring(0, (Node_Sub19.anInt7040))) + (Class262.anInterface19Array2974[i_2_].method62((byte) -124)) + (aa.aString104.substring(Node_Sub19.anInt7040)));
                                                Node_Sub19.anInt7040++;
                                            }
                                        } else {
                                            Node_Sub14_Sub15.anInt9324--;
                                            Node_Sub38.method2595(i + -8832);
                                            Node_Sub19.anInt7040 = aa.aString104.length();
                                        }
                                    } else
                                        Node_Sub19.anInt7040 = 0;
                                } else
                                    Node_Sub19.anInt7040++;
                            } else
                                Node_Sub19.anInt7040--;
                        } else
                            aa.aString104 = (aa.aString104.substring(0, Node_Sub19.anInt7040) + aa.aString104.substring((Node_Sub19.anInt7040) + 1));
                    } else {
                        aa.aString104 = (aa.aString104.substring(0, -1 + Node_Sub19.anInt7040) + aa.aString104.substring(Node_Sub19.anInt7040));
                        Node_Sub19.anInt7040--;
                    }
                } else if (Class106.aClipboard1346 != null) {
                    Transferable transferable = Class106.aClipboard1346.getContents(null);
                    if (transferable != null) {
                        try {
                            String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
                            if (string != null) {
                                String[] strings = Class80.method583(i ^ 0x22fa, string, '\n');
                                Class118.method1110(117, strings);
                            }
                        } catch (Exception exception) {
                            /* empty */
                        }
                    }
                }
            } else if (Class106.aClipboard1346 != null) {
                String string = "";
                for (int i_5_ = Class162.aStringArray1909.length - 1; i_5_ >= 0; i_5_--) {
                    if (Class162.aStringArray1909[i_5_] != null && (Class162.aStringArray1909[i_5_].length() ^ 0xffffffff) < -1)
                        string += Class162.aStringArray1909[i_5_] + '\n';
                }
                Class106.aClipboard1346.setContents(new StringSelection(string), null);
            }
        }
        Class370.anInt4555 = 0;
        Class262.anInt2977 = 0;
        Class60.method472(-101);
    }

    static final boolean handlePacket(byte i) {
        if (i != -7)
            handlePacket((byte) -92);
        anInt1914++;
        try {
            return Class192.readPacket(true);
        } catch (java.io.IOException ioexception) {
            Class282_Sub2.method2929(16384);
            return true;
        } catch (Exception exception) {
            String string = ("T2 - " + (Class51.currentIncommingOpcode != null ? Class51.currentIncommingOpcode.getOpcode() : -1) + "," + (Class61.aIncommingOpcode_832 == null ? -1 : Class61.aIncommingOpcode_832.getOpcode()) + "," + (Class226_Sub3.aIncommingOpcode_6669 == null ? -1 : Class226_Sub3.aIncommingOpcode_6669.getOpcode()) + " - " + Class30.currentPacketSize + "," + ((((Entity) Class347.myPlayer).posQueueX[0]) + Class67.baseX) + "," + ((((Entity) Class347.myPlayer).posQueueY[0]) + Class368.baseY) + " - ");
            for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (Class30.currentPacketSize ^ 0xffffffff) && (i_6_ ^ 0xffffffff) > -51); i_6_++)
                string += (((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).buffer[i_6_]) + ",";
            Class282_Sub14.method2975(string, exception, 1);
            Class340_Sub5.method3455(i + 32, false);
            return true;
        }
    }

    static final Class343 method1513(int i, Class381 class381, int i_7_, int i_8_) {
        anInt1912++;
        byte[] is = class381.method3922((byte) 116, i_8_, i);
        if (is == null)
            return null;
        if (i_7_ != -106)
            aIncommingOpcode_1916 = null;
        return new Class343(is);
    }

    public static void method1514(byte i) {
        aIncommingOpcode_1916 = null;
        int i_9_ = -46 % ((12 - i) / 52);
        aIncommingOpcode_1918 = null;
    }

    OutgoingOpcode(int i, int i_10_) {
        opcode = i;
        ((OutgoingOpcode) this).size = i_10_;
    }

    static {
        aIncommingOpcode_1918 = new IncommingOpcode(64, 6);
    }
}
