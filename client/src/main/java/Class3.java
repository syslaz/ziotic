/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class3 {
    private static String aString130;
    private static Hashtable aHashtable131;
    private static String aString132;
    private static boolean aBoolean133 = false;
    private static int anInt134;

    public static void method171(int i, String string, int i_0_) {
        aString132 = string;
        anInt134 = i;
        try {
            aString130 = System.getProperty("user.home");
            if (aString130 != null)
                aString130 += "/";
        } catch (Exception exception) {
            /* empty */
        }
        if (aString130 == null)
            aString130 = "~/";
        aBoolean133 = true;
        if (i_0_ != 16)
            method172(-99, (byte) -2, null, null);
    }

    public static File method172(int i, byte i_1_, String string, String string_2_) {
        if (!aBoolean133)
            throw new RuntimeException("");
        File file = (File) aHashtable131.get(string_2_);
        if (file != null)
            return file;
        String[] strings = {"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString130, "/tmp/", ""};
        String[] strings_3_ = {".priv_jagex_cache" + i, ".file_store_" + i};
        int i_4_ = 22 % ((-87 - i_1_) / 35);
        for (int i_5_ = 0; i_5_ < 2; i_5_++) {
            for (int i_6_ = 0; i_6_ < strings_3_.length; i_6_++) {
                for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (strings.length ^ 0xffffffff); i_7_++) {
                    String string_8_ = (strings[i_7_] + strings_3_[i_6_] + "/" + (string != null ? string + "/" : "") + string_2_);
                    RandomAccessFile randomaccessfile = null;
                    try {
                        File file_9_ = new File(string_8_);
                        if ((i_5_ ^ 0xffffffff) != -1 || file_9_.exists()) {
                            String string_10_ = strings[i_7_];
                            if (i_5_ != 1 || (string_10_.length() ^ 0xffffffff) >= -1 || new File(string_10_).exists()) {
                                new File(strings[i_7_] + strings_3_[i_6_]).mkdir();
                                if (string != null)
                                    new File(strings[i_7_] + strings_3_[i_6_] + "/" + string).mkdir();
                                randomaccessfile = new RandomAccessFile(file_9_, "rw");
                                int i_11_ = randomaccessfile.read();
                                randomaccessfile.seek(0L);
                                randomaccessfile.write(i_11_);
                                randomaccessfile.seek(0L);
                                randomaccessfile.close();
                                aHashtable131.put(string_2_, file_9_);
                                return file_9_;
                            }
                        }
                    } catch (Exception exception) {
                        try {
                            if (randomaccessfile != null) {
                                randomaccessfile.close();
                                Object object = null;
                            }
                        } catch (Exception exception_12_) {
                            /* empty */
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    public static File method173(int i, String string) {
        if (i != -3251)
            aHashtable131 = null;
        return method172(anInt134, (byte) -128, aString132, string);
    }

    static {
        aHashtable131 = new Hashtable(16);
    }
}
