/* Callback_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;

import java.awt.*;

final class Callback_Sub1 extends Callback {
    private volatile int anInt1;
    private volatile int anInt2;
    private boolean aBoolean3;
    private int anInt4;
    private volatile boolean aBoolean5 = true;

    final synchronized int method80(int i, int i_0_, int i_1_, int i_2_) {
        if ((i ^ 0xffffffff) != (anInt2 ^ 0xffffffff)) {
            int i_3_ = User32.GetWindowLong(i, -4);
            return User32.CallWindowProc(i_3_, i, i_0_, i_1_, i_2_);
        }
        if (i_0_ == 32) {
            int i_4_ = i_2_ & 0xffff;
            if (i_4_ == 1) {
                User32.SetCursor(!aBoolean5 ? 0 : anInt4);
                return 0;
            }
        }
        if (i_0_ == 101024) {
            User32.SetCursor(!aBoolean5 ? 0 : anInt4);
            return 0;
        }
        if (i_0_ == 1) {
            anInt2 = 0;
            aBoolean5 = true;
        }
        return User32.CallWindowProc(anInt1, i, i_0_, i_1_, i_2_);
    }

    final void method81(int i, Component component, boolean bool) {
        // WComponentPeer wcomponentpeer = (WComponentPeer) component.getPeer();
        // int i_5_ = wcomponentpeer.getTopHwnd();
        // if (i_5_ != anInt2 || aBoolean5 != bool) {
        //     if (!aBoolean3) {
        //         anInt4 = User32.LoadCursor(0, 32512);
        //         Root.alloc(this);
        //         aBoolean3 = true;
        //     }
        //     if ((i_5_ ^ 0xffffffff) != (anInt2 ^ 0xffffffff)) {
        //         if (anInt2 != 0) {
        //             aBoolean5 = true;
        //             User32.SendMessage(i_5_, 101024, 0, 0);
        //             synchronized (this) {
        //                 User32.SetWindowLong(anInt2, -4, anInt1);
        //             }
        //         }
        //         synchronized (this) {
        //             anInt2 = i_5_;
        //             anInt1 = User32.SetWindowLong(anInt2, -4, this);
        //         }
        //     }
        //     aBoolean5 = bool;
        //     int i_6_ = 4 % ((39 - i) / 54);
        //     User32.SendMessage(i_5_, 101024, 0, 0);
        // }
    }

    final void method82(int i, int i_7_, int i_8_) {
        if (i_7_ <= 59)
            method80(-74, 30, 25, 73);
        User32.SetCursorPos(i, i_8_);
    }
}
