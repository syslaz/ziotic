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
