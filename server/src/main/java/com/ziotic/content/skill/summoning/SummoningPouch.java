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
package com.ziotic.content.skill.summoning;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import com.ziotic.Static;
import com.ziotic.logic.npc.summoning.Familiar;
import com.ziotic.logic.player.Player;
import com.ziotic.utility.Logging;

/**
 * @author 'Mystic Flow
 */
public class SummoningPouch {

    private static Map<Integer, SummoningPouch> pouches;

    public static void load() throws IOException {
        pouches = Static.xml.readObject(Static.parseString("%WORK_DIR%/npcs/familiars.xml"));
        Logging.log().info("Loaded " + pouches.size() + " familiar(s)");
    }


    public static SummoningPouch get(int pouchId) {
        return pouches.get(pouchId);
    }

    public static SummoningPouch forInterfaceId(int id) {
        for (SummoningPouch pouch : pouches.values()) {
            if (pouch.interfacePouchId == id) {
                return pouch;
            }
        }
        return null;
    }

    public static Collection<SummoningPouch> getPouches() {
        return pouches.values();
    }

    private int pouchId;
    private int interfacePouchId;
    private double experience;
    private String familiarName;
    private int npcId;
    private int scrollId;
    private int summonCost;

    public int getScrollId() {
        return scrollId;
    }

    public int getPouchId() {
        return pouchId;
    }

    public double getExperience() {
        return experience;
    }

    public String getFamiliarName() {
        return familiarName;
    }

    public int getInterfacePouch() {
        return interfacePouchId;
    }

    public int getNPCId() {
        return npcId;
    }

    public int summonCost() {
        return summonCost;
    }

    public Familiar createFamiliar(Player player) {
        //TODO Check if this can create any bottlenecks ?
        try {
            return (Familiar) Class.forName("com.ziotic.logic.npc.summoning.impl." + familiarName).getConstructor(Player.class).newInstance(player);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
