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
package com.ziotic.logic;

import com.ziotic.engine.tick.Tick;
import com.ziotic.logic.mask.SplatNode;

public abstract class HPHandlerTick extends Tick {

    int amount;
    Entity entity;
    SplatNode splatNode;

    public HPHandlerTick(Entity entity, int amount, int delay, final SplatNode splatNode) {
        super(null, delay, TickPolicy.PERSISTENT);
        this.entity = entity;
        this.amount = amount;
        this.splatNode = splatNode;
    }

    public static class HPRemoval extends HPHandlerTick {

        public HPRemoval(Entity entity, int amount, int delay, final SplatNode splatNode) {
            super(entity, amount, delay, splatNode);
        }

        @Override
        public boolean execute() {
            entity.removeHP(amount);
            if (splatNode != null)
                entity.getMasks().submitSplat(splatNode);
            return false;
        }

    }

    public static class HPAddition extends HPHandlerTick {

        int addition;

        public HPAddition(Entity entity, int amount, int delay, int addition, final SplatNode splatNode) {
            super(entity, amount, delay, splatNode);
            this.addition = addition;
        }

        @Override
        public boolean execute() {
            entity.addHP(amount, addition);
            if (splatNode != null)
                entity.getMasks().submitSplat(splatNode);
            return false;
        }

    }

}
