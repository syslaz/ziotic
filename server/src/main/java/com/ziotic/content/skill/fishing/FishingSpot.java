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
package com.ziotic.content.skill.fishing;

import java.util.HashMap;
import java.util.Map;

import com.ziotic.logic.mask.Animation;

public enum FishingSpot {

    NET_NET_AND_BAIT(1, 316, new Animation(621), 303, -1, Fish.SHRIMP, Fish.ANCHOVIES),
    BAIT_NET_AND_BAIT(2, 316, new Animation(622), 307, 313, Fish.SARDINE, Fish.HERRING),
    LURE_LURE_AND_BAIT(1, 317, new Animation(622), 309, 314, Fish.TROUT, Fish.SALMON),
    BAIT_LURE_AND_BAIT(2, 317, new Animation(622), 307, 313, Fish.PIKE, Fish.CAVE_FISH),
    CAGE_CAGE_AND_HARPOON(1, 321, new Animation(619), 301, -1, Fish.LOBSTER),
    HARPOON_CAGE_AND_HARPOON(2, 321, new Animation(618), 311, -1, Fish.TUNA, Fish.SWORDFISH, Fish.MONKFISH),
    BIG_NET_NET_AND_HARPOON(1, 322, new Animation(621), 305, -1, Fish.MACKEREL, Fish.COD, Fish.BASS),
    HARPOON_NET_AND_HARPOON(2, 322, new Animation(618), 311, -1, Fish.SHARK);

    private static final Map<Integer, FishingSpot> fishingSpot = new HashMap<Integer, FishingSpot>();

    static {
        for (FishingSpot fishSpot : FishingSpot.values()) {
            fishingSpot.put(fishSpot.npcId | fishSpot.click << 24, fishSpot);
        }
    }

    public static FishingSpot forId(int object) {
        return fishingSpot.get(object);
    }

    private final int npcId;
    private final int item;
    private final int bait;
    private final int click;
    private final Animation fishAnimation;
    private final Fish[] fishies;

    private FishingSpot(int click, int npcId, Animation fishAnimation, int item, int bait, Fish... fish) {
        this.npcId = npcId;
        this.item = item;
        this.bait = bait;
        this.fishies = fish;
        this.fishAnimation = fishAnimation;
        this.click = click;
    }

    public int getNpcId() {
        return npcId;
    }

    public int getItem() {
        return item;
    }

    public int getBait() {
        return bait;
    }

    public Animation getFishAnimation() {
        return fishAnimation;
    }

    public Fish[] getFishies() {
        return fishies;
    }

}
