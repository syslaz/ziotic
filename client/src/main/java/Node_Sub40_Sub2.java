/* Class248_Sub40_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

final class Node_Sub40_Sub2 extends Node_Sub40 {
    private Shape aShape9774;
    private Image anImage9775;
    private Canvas aCanvas9776;
    private Rectangle aRectangle9777;

    final void method2612(int i, boolean bool, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, Graphics graphics) {
        aShape9774 = graphics.getClip();
        if (bool)
            method2611(null, -92, -7, 84);
        aRectangle9777.y = i_1_;
        aRectangle9777.height = i;
        aRectangle9777.x = i_2_;
        aRectangle9777.width = i_3_;
        graphics.setClip(aRectangle9777);
        graphics.drawImage(anImage9775, i_2_ + -i_0_, -i_4_ + i_1_, aCanvas9776);
        graphics.setClip(aShape9774);
    }

    final void method2611(Canvas canvas, int i, int i_5_, int i_6_) {
        aCanvas9776 = canvas;
        aRectangle9777 = new Rectangle();
        if (i_6_ != 2)
            aRectangle9777 = null;
        ((Node_Sub40_Sub2) this).anInt7281 = i_5_;
        ((Node_Sub40_Sub2) this).anInt7284 = i;
        ((Node_Sub40_Sub2) this).anIntArray7283 = new int[(((Node_Sub40_Sub2) this).anInt7284 * ((Node_Sub40_Sub2) this).anInt7281)];
        DataBufferInt databufferint = new DataBufferInt(((Node_Sub40_Sub2) this).anIntArray7283, (((Node_Sub40_Sub2) this).anIntArray7283).length);
        DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel((((Node_Sub40_Sub2) this).anInt7281), (((Node_Sub40_Sub2) this).anInt7284))), databufferint, null);
        anImage9775 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
    }
}
