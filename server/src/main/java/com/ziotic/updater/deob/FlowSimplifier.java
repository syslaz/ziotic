package com.ziotic.updater.deob;

import com.ziotic.asm.tree.*;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.Utilities;
import com.ziotic.utility.Logging;
import org.apache.log4j.Logger;

import static com.ziotic.asm.Opcodes.GOTO;
import static com.ziotic.asm.Opcodes.RETURN;

/**
 * @author Lazaro
 */
public class FlowSimplifier extends AbstractTransformer {
    private static final Logger logger = Logging.log();

    private int rCount = 0, gCount = 0;

    public FlowSimplifier() {
        super(true);
    }

    @Override
    public void visitInsn(ClassNode c, MethodNode m, AbstractInsnNode n) {
        if (n.getOpcode() == RETURN) {
            AbstractInsnNode nx = Utilities.nextRealInsn(n.getNext());
            if (nx == null)
                return;
            if (nx.getOpcode() == RETURN) {
                m.instructions.remove(n);
                rCount++;
            }
        }
    }

    @Override
    public void visitJumpInsn(ClassNode c, MethodNode m, JumpInsnNode n) {
        AbstractInsnNode r = Utilities.nextRealInsn(n.label);
        if (r != null && r.getOpcode() == GOTO) {
            JumpInsnNode rj = (JumpInsnNode) r;

            LabelNode ol = n.label;
            n.label = rj.label;

            //if(!Utilities.hasTargeters(m, ol)) {
            //    m.instructions.remove(rj);
            //}

            gCount++;
        }
    }

    @Override
    public void onFinish() {
        logger.info("Removed " + rCount + " redundant returns and simplified " + gCount + " complex jumps!");
    }
}
