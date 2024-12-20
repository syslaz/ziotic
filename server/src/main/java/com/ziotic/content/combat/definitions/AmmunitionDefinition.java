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
package com.ziotic.content.combat.definitions;

public class AmmunitionDefinition {

    public static enum Type {
        ARROW, BOLT, THROWING_AXE, THROWING_KNIFE, CHINCHOMPA, OTHER;
    }

    public static enum Material {
        BRONZE, IRON, STEEL, BLACK, MITHRIL, ADAMANT, RUNE, DRAGON, OTHER;
    }

    public static enum Poison {
        POISON, POISON_PLUS, POISON_PP, NONE;
    }

    public static enum BoltTip {
        OPAL, SAPPHIRE, JADE, PEARL, EMERALD, RED_TOPAZ, RUBY, DIAMOND, DRAGON_STONE, ONYX, NONE;
    }

    public int id;
    public boolean inHand;
    public int[] requiredBows;
    public int requiredLevel;
    public int animationId;
    public int animationDelay;
    public int graphicsId;
    public int graphicsDelay;
    public int graphicsHeight;
    public int projectileId;
    public int projectileDelay;
    public int projectileSpeed;
    public int startHeight;
    public int middleHeight;
    public int endHeight;
    public String specialName;
    public Type ammunitionType;
    public Material ammunitionMaterial;
    public Poison ammunitionPoison;
    public BoltTip boltTip;
    public int speed;
    public boolean enchanted;
    public int enchantedGraphics;
    public int enchantedGraphicsHeight;

}
