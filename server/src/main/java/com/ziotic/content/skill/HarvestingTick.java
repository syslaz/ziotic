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
package com.ziotic.content.skill;

import com.ziotic.engine.tick.Tick;
import com.ziotic.logic.item.PossesedItem;
import com.ziotic.logic.map.Region;
import com.ziotic.logic.object.GameObject;
import com.ziotic.logic.player.Player;

/**
 * @author Lazaro
 */
public abstract class HarvestingTick extends Tick {
    protected final Player player;
    protected final GameObject obj;

    public HarvestingTick(Player player, GameObject obj) {
        super("event", 1, Tick.TickPolicy.STRICT);
        super.setInterval(getInterval());
        this.player = player;
        this.obj = obj;
    }

    @Override
    public boolean execute() {
        if (!player.isConnected() || player.getPathProcessor().moving()) {
            stop(true);
            return false;
        }
        if (Region.getObject(obj.getLocation()) != obj) {
            stop();
            return false;
        }
        if (isPeriodicRewards()) {
            final double random = Math.random(), factor = getRewardFactor();
            if (random <= factor) {
                if (!reward()) {
                    stop(true);
                    return false;
                }
            }
        }
        if (shouldExpire()) {
            expire();
            if (!isPeriodicRewards()) {
                reward();
            }
            stop(true);
            return false;
        } else {
            player.doAnimation(getAnimation());
        }
        return true;
    }

    public abstract void init();

    public abstract int getInterval();

    public abstract int getSkill();

    public abstract double getExperience();

    public abstract int getAnimation();

    public abstract boolean isPeriodicRewards();

    public abstract PossesedItem getReward();

    public abstract double getRewardFactor();

    public abstract void onReward();

    public abstract boolean shouldExpire();

    public abstract void expire();

    @Override
    public void onStart() {
        init();
    }

    private boolean reward() {
        PossesedItem reward = getReward();
        if (reward == null || player.getInventory().add(reward.getId(), reward.getAmount())) {
            player.getLevels().addXP(getSkill(), getExperience());
            player.updateXPCounter();
            onReward();
            return true;
        }
        return false;
    }

    @Override
    public void stop() {
        stop(false);
    }

    public void stop(boolean forceResetMasks) {
        super.stop();
        stopped(forceResetMasks);
    }

    public abstract void stopped(boolean forceResetMasks);
}
