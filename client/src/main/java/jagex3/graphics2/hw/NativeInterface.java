/* NativeInterface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagex3.graphics2.hw;

public class NativeInterface {
    long peer;

    public final native void copyLighting(short[] is, byte[] is_0_, short[] is_1_, short[] is_2_, short[] is_3_, short[] is_4_, byte[] is_5_, int i, int i_6_, short[] is_7_, int i_8_, int i_9_, int i_10_, long l);

    public final native void copyColours(short[] is, byte[] is_11_, short[] is_12_, int i, short[] is_13_, int i_14_, int i_15_, int i_16_, long l);

    public final native void copyTexCoords(float[] fs, float[] fs_17_, int i, int i_18_, int i_19_, long l);

    public final native void copyNormals(short[] is, short[] is_20_, short[] is_21_, byte[] is_22_, float f, float f_23_, int i, int i_24_, int i_25_, long l);

    public final native void setAmbient(float f);

    public final native void release();

    public final native void initTextureMetrics(int i, byte i_26_, byte i_27_);

    public final native void setSunColour(float f, float f_28_, float f_29_, float f_30_, float f_31_);

    private final native void init(int i, int i_32_);

    public NativeInterface(int i, int i_33_) {
        init(i, i_33_);
    }

    public final native void copyPositions(int[] is, int[] is_34_, int[] is_35_, short[] is_36_, int i, int i_37_, int i_38_, long l);

    public final native void setSunDirection(float f, float f_39_, float f_40_);
}
