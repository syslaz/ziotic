/* OpenGL - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;

import java.awt.*;
import java.util.Hashtable;

public class OpenGL {
    private Hashtable a;
    long peer;
    private Thread b;
    private static Hashtable c = new Hashtable();

    public static final native void glOrtho(double d, double d_0_, double d_1_, double d_2_, double d_3_, double d_4_);

    public static final native void glColor3f(float f, float f_5_, float f_6_);

    public static final native void glLoadMatrixf(float[] fs, int i);

    public static final native void glGetInfoLogARB(long l, int i, int[] is, int i_7_, byte[] is_8_, int i_9_);

    public static final native void glProgramRawARB(int i, int i_10_, byte[] is);

    public static final native void glTexSubImage2Df(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, float[] fs, int i_18_);

    public static final native void glClearDepth(float f);

    public static final native void glPopMatrix();

    public static final native void glDisable(int i);

    public static final native void glBindFramebufferEXT(int i, int i_19_);

    public static final native void glMatrixMode(int i);

    public static final native void glShaderSourceRawARB(long l, byte[] is);

    public static final native void glUniformMatrix4fvARB(int i, int i_20_, boolean bool, float[] fs, int i_21_);

    public static final native void glPolygonMode(int i, int i_22_);

    public final synchronized boolean a() {
        if (b != Thread.currentThread())
            return false;
        detachPeer();
        c.remove(b);
        b = null;
        return true;
    }

    public static final native void glTexImage2Df(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, float[] fs, int i_30_);

    public final boolean a(String string) {
        if (a == null) {
            a = new Hashtable();
            String string_31_ = glGetString(7939);
            int i = 0;
            for (; ; ) {
                int i_32_ = string_31_.indexOf(' ', i);
                if ((i_32_ ^ 0xffffffff) == 0)
                    break;
                String string_33_ = string_31_.substring(i, i_32_).trim();
                if ((string_33_.length() ^ 0xffffffff) != -1)
                    a.put(string_33_, string_33_);
                i = i_32_ - -1;
            }
            String string_34_ = string_31_.substring(i).trim();
            if ((string_34_.length() ^ 0xffffffff) != -1)
                a.put(string_34_, string_34_);
        }
        return a.containsKey(string);
    }

    public static final native void glTexEnvfv(int i, int i_35_, float[] fs, int i_36_);

    public static final native void glUniform4fARB(int i, float f, float f_37_, float f_38_, float f_39_);

    static final native boolean glUnmapBufferARB(int i);

    public static final native void glBufferDataARBa(int i, int i_40_, long l, int i_41_);

    public static final native void glDeleteLists(int i, int i_42_);

    public static final native void glBegin(int i);

    public static final native void glTexParameteri(int i, int i_43_, int i_44_);

    public static final native void glTranslatef(float f, float f_45_, float f_46_);

    public final native void releasePbuffer(long l);

    public static final native void glEnd();

    public final native void swapBuffers();

    public static final native void glTexGeni(int i, int i_47_, int i_48_);

    public static final native void glCopyTexSubImage3D(int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_);

    public static final native void glFlush();

    public static final native int glGenLists(int i);

    public static final native void glScalef(float f, float f_57_, float f_58_);

    public static final native void glCompileShaderARB(long l);

    public static final native void glHint(int i, int i_59_);

    public static final native void glClear(int i);

    public static final native void glCopyTexSubImage2D(int i, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_);

    public static final native void glProgramStringARB(int i, int i_67_, String string);

    public static final native void glNormalPointer(int i, int i_68_, long l);

    public final native void surfaceResized(long l);

    public static final native void glColor4ub(byte i, byte i_69_, byte i_70_, byte i_71_);

    public static final native void glDetachObjectARB(long l, long l_72_);

    public static final native void glFramebufferTexture2DEXT(int i, int i_73_, int i_74_, int i_75_, int i_76_);

    public static final native void glRenderbufferStorageMultisampleEXT(int i, int i_77_, int i_78_, int i_79_, int i_80_);

    public static final native void glColorPointer(int i, int i_81_, int i_82_, long l);

    public static final native String glGetString(int i);

    public static final native void glMaterialfv(int i, int i_83_, float[] fs, int i_84_);

    public static final native void glGetFloatv(int i, float[] fs, int i_85_);

    public static final native void glTexImage2Di(int i, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_, int[] is, int i_93_);

    public static final native void glTexSubImage2Dub(int i, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, byte[] is, int i_101_);

    public static final native void glLightfv(int i, int i_102_, float[] fs, int i_103_);

    public static final native void glDrawPixelsub(int i, int i_104_, int i_105_, int i_106_, byte[] is, int i_107_);

    public static final native void glFramebufferRenderbufferEXT(int i, int i_108_, int i_109_, int i_110_);

    public static final native void glCullFace(int i);

    public static final native void glAttachObjectARB(long l, long l_111_);

    public final native boolean arePbuffersAvailable();

    public static final native void glTexCoord2f(float f, float f_112_);

    public static final native void glPixelStorei(int i, int i_113_);

    public static final native void glColor3ub(byte i, byte i_114_, byte i_115_);

    static final native long glMapBufferARB(int i, int i_116_);

    public static final native void glGetIntegerv(int i, int[] is, int i_117_);

    public static final native void glReadPixelsi(int i, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int[] is, int i_123_);

    public static final native void glDeleteBuffersARB(int i, int[] is, int i_124_);

    public static final native void glDrawElements(int i, int i_125_, int i_126_, long l);

    public static final native void glClearColor(float f, float f_127_, float f_128_, float f_129_);

    public static final native void glReadPixelsub(int i, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_, byte[] is, int i_135_);

    public static final native void glVertexPointer(int i, int i_136_, int i_137_, long l);

    public static final native void glTexEnvf(int i, int i_138_, float f);

    public static final native void glGetObjectParameterivARB(long l, int i, int[] is, int i_139_);

    public static final native long glCreateProgramObjectARB();

    public static final native void glUniform1fARB(int i, float f);

    public static final native void glBufferSubDataARBub(int i, int i_140_, int i_141_, byte[] is, int i_142_);

    public static final native void glLightf(int i, int i_143_, float f);

    public static final native void glMultiTexCoord2i(int i, int i_144_, int i_145_);

    public static final native long glCreateShaderObjectARB(int i);

    public static final native void glPopAttrib();

    public static final native void glDeleteFramebuffersEXT(int i, int[] is, int i_146_);

    public final native void setSwapInterval(int i);

    public static final native void glTexImage1Dub(int i, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, byte[] is, int i_153_);

    public static final native void glRasterPos2i(int i, int i_154_);

    public static final native void glStencilFunc(int i, int i_155_, int i_156_);

    public static final native void glNewList(int i, int i_157_);

    public static final native void glLightModelfv(int i, float[] fs, int i_158_);

    public static final native int glGetUniformLocationARB(long l, String string);

    public static final native void glMultiTexCoord3i(int i, int i_159_, int i_160_, int i_161_);

    public static final native void glTexGenfv(int i, int i_162_, float[] fs, int i_163_);

    private final native boolean attachPeer();

    public static final native void glTexCoord3f(float f, float f_164_, float f_165_);

    public static final native void glAlphaFunc(int i, float f);

    public static final native void glUseProgramObjectARB(long l);

    public static final native void glCopyPixels(int i, int i_166_, int i_167_, int i_168_, int i_169_);

    public static final native void glGenBuffersARB(int i, int[] is, int i_170_);

    public static final native int glCheckFramebufferStatusEXT(int i);

    public final native long init(Canvas canvas, int i, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_);

    public static final native void glLinkProgramARB(long l);

    public static final native void glPixelTransferf(int i, float f);

    public final synchronized boolean b() {
        Thread thread = Thread.currentThread();
        if (attachPeer()) {
            OpenGL opengl_176_ = (OpenGL) c.put(thread, this);
            if (opengl_176_ != null)
                opengl_176_.b = null;
            b = thread;
            return true;
        }
        return false;
    }

    public static final native void glColorMaterial(int i, int i_177_);

    public static final native void glDeleteRenderbuffersEXT(int i, int[] is, int i_178_);

    public static final native void glActiveTexture(int i);

    public static final native void glEnable(int i);

    public static final native void glBufferDataARBub(int i, int i_179_, byte[] is, int i_180_, int i_181_);

    public static final native void glGetProgramivARB(int i, int i_182_, int[] is, int i_183_);

    public final native void setPbuffer(long l);

    public static final native void glBufferSubDataARBa(int i, int i_184_, int i_185_, long l);

    public static final native void glShaderSourceARB(long l, String string);

    public static final native void glNormal3f(float f, float f_186_, float f_187_);

    public static final native void glGenFramebuffersEXT(int i, int[] is, int i_188_);

    public static final native void glDeleteObjectARB(long l);

    private final native void detachPeer();

    public static final native void glBindTexture(int i, int i_189_);

    public static final native void glTexImage2Dub(int i, int i_190_, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_, byte[] is, int i_197_);

    public static final native void glEnableClientState(int i);

    public final native long prepareSurface(Canvas canvas);

    public static final native void glUniform3fARB(int i, float f, float f_198_, float f_199_);

    public static final native void glStencilOp(int i, int i_200_, int i_201_);

    public static final native void glUniformMatrix3fvARB(int i, int i_202_, boolean bool, float[] fs, int i_203_);

    public static final native void glProgramLocalParameter4fARB(int i, int i_204_, float f, float f_205_, float f_206_, float f_207_);

    public static final native void glFramebufferTexture3DEXT(int i, int i_208_, int i_209_, int i_210_, int i_211_, int i_212_);

    public static final native void glProgramLocalParameter4fvARB(int i, int i_213_, float[] fs, int i_214_);

    public static final native void glDeleteTextures(int i, int[] is, int i_215_);

    public static final native void glClientActiveTexture(int i);

    public static final native void glPointSize(float f);

    public static final native int glGetError();

    public static final native void glTexSubImage2Di(int i, int i_216_, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_, int i_222_, int[] is, int i_223_);

    public final native void release();

    public static final native void glDrawBuffer(int i);

    public static final native void glDrawBuffersARB(int i, int[] is, int i_224_);

    public static final native void glReadBuffer(int i);

    public static final native void glColorMask(boolean bool, boolean bool_225_, boolean bool_226_, boolean bool_227_);

    public static final native void glEndList();

    public static final native void glColor4f(float f, float f_228_, float f_229_, float f_230_);

    public static final native void glGenerateMipmapEXT(int i);

    public static final native void glTexCoordPointer(int i, int i_231_, int i_232_, long l);

    public static final native void glVertex2i(int i, int i_233_);

    public static final native void glTexEnvi(int i, int i_234_, int i_235_);

    public static final native void glTexCoord3i(int i, int i_236_, int i_237_);

    public static final native void glShadeModel(int i);

    public final native long createPbuffer(int i, int i_238_);

    public static final native void glDeleteProgramARB(int i);

    public static final native void glFogfv(int i, float[] fs, int i_239_);

    public static final native void glUniform2fARB(int i, float f, float f_240_);

    public static final native void glCopyTexImage2D(int i, int i_241_, int i_242_, int i_243_, int i_244_, int i_245_, int i_246_, int i_247_);

    public static final native void glVertex3f(float f, float f_248_, float f_249_);

    public static final native void glCallList(int i);

    public static final native int glGenProgramARB();

    public static final native void glDepthFunc(int i);

    public static final native void glBindProgramARB(int i, int i_250_);

    public static final native void glBindBufferARB(int i, int i_251_);

    public final native void releaseSurface(Canvas canvas, long l);

    public static final native void glMultMatrixf(float[] fs, int i);

    public static final native void glFinish();

    public static final native void glVertex2f(float f, float f_252_);

    public static final native void glBindRenderbufferEXT(int i, int i_253_);

    public static final native void glBlendFunc(int i, int i_254_);

    public static final native void glUniform1iARB(int i, int i_255_);

    public static final native void glBlitFramebufferEXT(int i, int i_256_, int i_257_, int i_258_, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_, int i_264_);

    public static final native void glLineWidth(float f);

    public static final native void glViewport(int i, int i_265_, int i_266_, int i_267_);

    public static final native void glDepthMask(boolean bool);

    public static final native void glPushAttrib(int i);

    public static final native void glGetTexImageub(int i, int i_268_, int i_269_, int i_270_, byte[] is, int i_271_);

    public static final native void glTexImage3Dub(int i, int i_272_, int i_273_, int i_274_, int i_275_, int i_276_, int i_277_, int i_278_, int i_279_, byte[] is, int i_280_);

    public static final native void glRenderbufferStorageEXT(int i, int i_281_, int i_282_, int i_283_);

    public static final native void glLoadIdentity();

    public static final native void glGenTextures(int i, int[] is, int i_284_);

    public static final native void glFogf(int i, float f);

    public static final native void glGenRenderbuffersEXT(int i, int[] is, int i_285_);

    public static final native void glTexCoord2i(int i, int i_286_);

    public static final native void glDrawPixelsi(int i, int i_287_, int i_288_, int i_289_, int[] is, int i_290_);

    public static final native void glRotatef(float f, float f_291_, float f_292_, float f_293_);

    public static final native void glGetTexImagei(int i, int i_294_, int i_295_, int i_296_, int[] is, int i_297_);

    public static final native void glScissor(int i, int i_298_, int i_299_, int i_300_);

    public static final native void glPixelZoom(float f, float f_301_);

    public static final native void glUniformMatrix2fvARB(int i, int i_302_, boolean bool, float[] fs, int i_303_);

    public static final native void glFrustum(double d, double d_304_, double d_305_, double d_306_, double d_307_, double d_308_);

    public static final native void glMultiTexCoord2f(int i, float f, float f_309_);

    public static final native void glTexParameterf(int i, int i_310_, float f);

    public static final native void glPushMatrix();

    public static final native void glDisableClientState(int i);

    public static final native void glFogi(int i, int i_311_);

    public static final native void glDrawArrays(int i, int i_312_, int i_313_);

    public final native boolean setSurface(long l);
}
