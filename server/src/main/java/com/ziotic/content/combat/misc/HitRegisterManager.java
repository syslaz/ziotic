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
package com.ziotic.content.combat.misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import com.ziotic.Static;
import com.ziotic.engine.tick.Tick;
import com.ziotic.logic.Entity;
import com.ziotic.logic.player.Player;

public class HitRegisterManager {

    private HashMap<Long, HitRegister> hitRegisters = new HashMap<Long, HitRegister>();

    public void registerHit(Player player, int damage) {
        HitRegister register = hitRegisters.get(player.getIdentifier());
        if (register == null) {
            register = new HitRegister(player);
            registerHitRegister(player);
        }
        register.registerHit(damage);
    }

    private void registerHitRegister(Player player) {
        hitRegisters.put(player.getIdentifier(), new HitRegister(player));
    }

    public HitRegister[] getSortedHitRegisters() {
        HitRegister[] registers = hitRegisters.values().toArray(new HitRegister[0]);
        Arrays.sort(registers);
        return registers;
    }

    public static class HitRegister implements Comparable<HitRegister> {

        public Player player;
        public int totalDamage = 0;
        public LinkedList<Hit> hits = new LinkedList<Hit>();

        public HitRegister(Player player) {
            this.player = player;
        }

        public void registerHit(int damage) {
            hits.add(new Hit(damage, Static.world.getTime()));
            totalDamage += damage;
        }

        public void unregisterHit(Hit hit) {
            hits.remove(hit);
            totalDamage -= hit.damage;
        }

        @Override
        public int compareTo(HitRegister register) {
            return register.totalDamage - totalDamage;
        }

        public void removeExpiredHits() {
            Iterator<Hit> it = hits.iterator();
            int worldTime = Static.world.getTime();
            Hit h;
            while (it.hasNext()) {
                h = it.next();
                if (h.tickTime + 100 < worldTime) {
                    it.remove();
                } else {
                    break;
                }
            }
        }

    }

    public static class Hit {

        public int damage;
        public int tickTime;

        public Hit(int damage, int tickTime) {
            this.damage = damage;
            this.tickTime = tickTime;
        }

    }

    public static class HitRegisterManagerTick extends Tick {

        private Entity entity;

        public HitRegisterManagerTick(Entity entity) {
            super("HitRegisterManager", 15, TickPolicy.PERSISTENT);
            this.entity = entity;
        }

        @Override
        public boolean execute() {
            HitRegisterManager manager = entity.hitRegisterManager;
            Iterator<HitRegister> it = manager.hitRegisters.values().iterator();
            while (it.hasNext()) {
                it.next().removeExpiredHits();
            }
            return true;
        }

    }

}
