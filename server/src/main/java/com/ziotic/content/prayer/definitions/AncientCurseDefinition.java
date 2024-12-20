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

import com.ziotic.content.prayer.PrayerManager.CurseType;

public class AncientCurseDefinition extends AbstractPrayerDefinition {

    protected float attackMultiplierOverTime;
    protected float strengthMultiplierOverTime;
    protected float defenceMultiplierOverTime;
    protected float magicMultiplierOverTime;
    protected float rangedMultiplierOverTime;

    protected boolean deflectMelee = false;
    protected boolean deflectRanged = false;
    protected boolean deflectMagic = false;
    protected boolean deflectSummoning = false;

    protected boolean drainEnemyAttack = false;

    protected float drainEnemyAttackPercentage;
    protected float drainEAttackPercentageOverTime;

    protected boolean drainEnemyStrength = false;
    protected float drainEnemyStrengthPercentage;
    protected float drainEStrengthPercentageOverTime;

    protected boolean drainEnemyDefence = false;
    protected float drainEnemyDefencePercentage;
    protected float drainEDefencePercentageOverTime;

    protected boolean drainEnemyMagic = false;
    protected boolean drainEnemyMagicPercentage;
    protected float drainEMagicPercentageOverTime;

    protected boolean drainEnemyRanged = false;
    protected boolean drainEnemyRangedPercentage;
    protected float drainERangedPercentageOverTime;

    protected boolean drainEnemyHP = false;

    protected boolean drainEnemySpecial = false;
    protected float drainEnemySpecialPercentage;

    protected boolean boostSpecial = false;

    protected boolean drainEnergy = false;
    protected boolean boostEnergy = false;

    protected boolean berserker = false;
    protected boolean wrath = false;
    protected boolean soulSplit = false;
    protected boolean turmoil = false;

    protected CurseType curseType;

    protected boolean useAnimation = false;
    protected int animationId;

    protected boolean useGraphic = false;
    protected int graphicId;

    protected boolean useActionAnimation = false;
    protected int actionAnimation;

    protected boolean useActionGraphics = false;
    protected int actionGraphic;

    protected boolean useActionProjectile = false;
    protected int actionProjectile;

    public final float getAttackMultiplierOverTime() {
        return attackMultiplierOverTime;
    }

    public final float getStrengthMultiplierOverTime() {
        return strengthMultiplierOverTime;
    }

    public final float getDefenceMultiplierOverTime() {
        return defenceMultiplierOverTime;
    }

    public final float getMagicMultiplierOverTime() {
        return magicMultiplierOverTime;
    }

    public final float getRangedMultiplierOverTime() {
        return rangedMultiplierOverTime;
    }

    public final boolean isDeflectMelee() {
        return deflectMelee;
    }

    public final boolean isDeflectRanged() {
        return deflectRanged;
    }

    public final boolean isDeflectMagic() {
        return deflectMagic;
    }

    public final boolean isDrainEnemyAttack() {
        return drainEnemyAttack;
    }

    public final float getDrainEnemyAttackPercentage() {
        return drainEnemyAttackPercentage;
    }

    public final float getDrainEAttackPercentageOverTime() {
        return drainEAttackPercentageOverTime;
    }

    public final boolean isDrainEnemyStrength() {
        return drainEnemyStrength;
    }

    public final float getDrainEnemyStrengthPercentage() {
        return drainEnemyStrengthPercentage;
    }

    public final float getDrainEStrengthPercentageOverTime() {
        return drainEStrengthPercentageOverTime;
    }

    public final boolean isDrainEnemyDefence() {
        return drainEnemyDefence;
    }

    public final float getDrainEnemyDefencePercentage() {
        return drainEnemyDefencePercentage;
    }

    public final float getDrainEDefencePercentageOverTime() {
        return drainEDefencePercentageOverTime;
    }

    public final boolean isDrainEnemyMagic() {
        return drainEnemyMagic;
    }

    public final boolean isDrainEnemyMagicPercentage() {
        return drainEnemyMagicPercentage;
    }

    public final float getDrainEMagicPercentageOverTime() {
        return drainEMagicPercentageOverTime;
    }

    public final boolean isDrainEnemyRanged() {
        return drainEnemyRanged;
    }

    public final boolean isDrainEnemyRangedPercentage() {
        return drainEnemyRangedPercentage;
    }

    public final float getDrainERangedPercentageOverTime() {
        return drainERangedPercentageOverTime;
    }

    public final boolean isDrainEnemyHP() {
        return drainEnemyHP;
    }

    public final boolean isDrainEnemySpecial() {
        return drainEnemySpecial;
    }

    public final float getDrainEnemySpecialPercentage() {
        return drainEnemySpecialPercentage;
    }

    public final boolean isBoostSpecial() {
        return boostSpecial;
    }

    public final boolean isBerserker() {
        return berserker;
    }

    public final boolean isWrath() {
        return wrath;
    }

    public final CurseType getType() {
        return curseType;
    }

    public final boolean isUseAnimation() {
        return useAnimation;
    }

    public final int getAnimationId() {
        return animationId;
    }

    public final boolean isUseGraphic() {
        return useGraphic;
    }

    public final int getGraphicId() {
        return graphicId;
    }

    public final boolean isUseActionAnimation() {
        return useActionAnimation;
    }

    public final int getActionAnimation() {
        return actionAnimation;
    }

    public final boolean isUseActionGraphics() {
        return useActionGraphics;
    }

    public final int getActionGraphic() {
        return actionGraphic;
    }

    public final boolean isUseActionProjectile() {
        return useActionProjectile;
    }

    public final int getActionProjectile() {
        return actionProjectile;
    }

    public final boolean isDrainEnergy() {
        return drainEnergy;
    }

    public final boolean isBoostEnergy() {
        return boostEnergy;
    }

    public final boolean isSoulSplit() {
        return soulSplit;
    }

    public final boolean isTurmoil() {
        return turmoil;
    }

    public final void setBoostSpecial(boolean boostSpecial) {
        this.boostSpecial = boostSpecial;
    }

    public final void setDrainEnergy(boolean drainEnergy) {
        this.drainEnergy = drainEnergy;
    }

    public final void setBoostEnergy(boolean boostEnergy) {
        this.boostEnergy = boostEnergy;
    }

    public final void setTurmoil(boolean turmoil) {
        this.turmoil = turmoil;
    }
}
