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
package com.ziotic.logic.map;

public class Areas {

    public Areas() {
    }

    /**
     * Gamer's grotto
     */
    public static Area GROTTO = RSArea.forBounds(2981, 9666, 3004, 9693);

    public static final RSArea HIGH_LVL_WILD_STAIRS = RSArea.forBounds(3014, 10306, 3058, 10349);
    public static final RSArea WILDERNESS = RSArea.forBounds(2944, 3525, 3394, 3999).include(HIGH_LVL_WILD_STAIRS);

    public static final RSArea MULTI = RSArea.forBounds(2944, 3525, 3394, 3712).exclude(RSArea.forBounds(2944, 3525, 3005, 3643))
            .exclude(RSArea.forBounds(3005, 3525, 3071, 3597)).exclude(RSArea.forBounds(3071, 3525, 3135, 3605));

//    public static final RSArea MULTI2 = RSArea.forBounds(3135, 3525, 3394, 3605);

}
