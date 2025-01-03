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

public enum Fish {

    SHRIMP(317, 10, 1),
    SARDINE(327, 20, 5),
    HERRING(345, 30, 10),
    ANCHOVIES(321, 40, 15),
    MACKEREL(353, 20, 16),
    TROUT(335, 50, 20),
    COD(341, 45, 23),
    PIKE(349, 60, 25),
    SALMON(331, 70, 30),
    TUNA(359, 80, 35),
    LOBSTER(377, 90, 40),
    BASS(363, 100, 46),
    SWORDFISH(371, 100, 50),
    MONKFISH(7944, 120, 62),
    SHARK(383, 110, 76),
    SEA_TURTLE(395, 38, 79),
    MANTA_RAY(389, 46, 81),
    CAVE_FISH(15264, 300, 85);

    private final int id;
    private final int xp;
    private final int level;

    private Fish(int id, int xp, int level) {
        this.id = id;
        this.xp = xp;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public int getXp() {
        return xp;
    }

    public int getLevel() {
        return level;
    }

}