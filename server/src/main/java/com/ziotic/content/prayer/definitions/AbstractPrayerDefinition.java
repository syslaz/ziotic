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
package com.ziotic.content.prayer.definitions;

public class AbstractPrayerDefinition {

    protected int id;

    protected float attackMultiplier;
    protected float strengthMultiplier;
    protected float defenceMultiplier;
    protected float magicMultiplier;
    protected float rangedMultiplier;

    protected boolean drainEnemyPrayer = false;
    protected int drainEnemyPrayerRate;

    protected float drainRate;

    protected boolean protectItem = false;

    protected String jsFunction = "";

    protected int configMaskValue;

    protected int requiredLevel;

    protected int overheadId;

    public final int getId() {
        return id;
    }

    public final float getAttackMultiplier() {
        return attackMultiplier;
    }

    public final float getStrengthMultiplier() {
        return strengthMultiplier;
    }

    public final float getDefenceMultiplier() {
        return defenceMultiplier;
    }

    public final float getMagicMultiplier() {
        return magicMultiplier;
    }

    public final float getRangedMultiplier() {
        return rangedMultiplier;
    }

    public final boolean isDrainEnemyPrayer() {
        return drainEnemyPrayer;
    }

    public final int getDrainEnemyPrayerRate() {
        return drainEnemyPrayerRate;
    }

    public final float getDrainrate() {
        return drainRate;
    }

    public final boolean isProtectItem() {
        return protectItem;
    }

    public final String getJsFunction() {
        return jsFunction;
    }

    public final int getConfigMaskValue() {
        return configMaskValue;
    }

    public final int getRequiredLevel() {
        return requiredLevel;
    }

    public final int getPrayerIcon() {
        return overheadId;
    }
}
