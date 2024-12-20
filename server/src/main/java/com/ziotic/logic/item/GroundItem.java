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
package com.ziotic.logic.item;

import com.ziotic.logic.Locatable;
import com.ziotic.logic.map.Tile;

/**
 * @author Lazaro
 */
public final class GroundItem extends Locatable implements Item {
    private int amount;
    private boolean exists = true;
    private boolean modified = false;
    private String owner;
    private boolean public_;
    private boolean spawned;
    private long timeModified;
    private final int id;

    public GroundItem(int id, int amount, Tile location, String owner, boolean spawned) {
        this.id = id;
        this.amount = amount;
        this.owner = owner;
        this.spawned = spawned;
        this.public_ = owner == null;
        setLocation(location);
        resetTimeModified();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean exists() {
        return exists;
    }

    public String getOwner() {
        return owner;
    }

    public long getTimeModified() {
        return timeModified;
    }


    public boolean isModified() {
        return modified;
    }

    public boolean isPublic() {
        return public_;
    }

    public boolean isSpawned() {
        return spawned;
    }

    public void resetTimeModified() {
        timeModified = System.currentTimeMillis();
    }


    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPublic(boolean public_) {
        this.public_ = public_;
    }

    public ItemDefinition getDefinition() {
        return ItemDefinition.forId(id);
    }
}
