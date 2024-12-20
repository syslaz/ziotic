/*
 * Copyright (c) 2024 Lazaro Brito
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.ziotic.updater.deob;

import com.ziotic.asm.tree.ClassNode;
import com.ziotic.asm.tree.LdcInsnNode;
import com.ziotic.asm.tree.MethodNode;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

/**
 * @author Lazaro
 */
public class CacheDirectoryChanger extends AbstractTransformer {
    private static Logger logger = Logging.log();

    @Override
    public void visitLdcInsn(ClassNode c, MethodNode m, LdcInsnNode n) {
        if (n.cst.equals(".jagex_cache_")) {
            n.cst = ".priv_jagex_cache";
            finished = true;
        }
    }

    @Override
    public void onFinish() {
        logger.debug("Successfully changed the cache directory!");
    }
}
