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

import com.ziotic.content.prayer.PrayerManager.PrayerType;

public class PrayerDefinition extends AbstractPrayerDefinition {

    protected boolean protectFromMelee = false;
    protected boolean protectFromMagic = false;
    protected boolean protectFromRanged = false;

    protected boolean rapidRestore = false;
    protected boolean rapidHeal = false;
    protected boolean rapidRenewal = false;

    protected boolean retribution = false;
    protected boolean redemption = false;
    protected boolean smite = false;

    protected PrayerType prayerType;

    public final boolean isProtectFromMelee() {
        return protectFromMelee;
    }

    public final boolean isProtectFromMagic() {
        return protectFromMagic;
    }

    public final boolean isProtectFromRanged() {
        return protectFromRanged;
    }

    public final boolean isRapidRestore() {
        return rapidRestore;
    }

    public final boolean isRapidHeal() {
        return rapidHeal;
    }

    public final boolean isRapidRenewal() {
        return rapidRenewal;
    }

    public final boolean isRetribution() {
        return retribution;
    }

    public final boolean isRedemption() {
        return redemption;
    }

    public final boolean isSmite() {
        return smite;
    }

    public final PrayerType getType() {
        return prayerType;
    }
}
