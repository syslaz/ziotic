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
package com.ziotic.logic.player;

/**
 * @author Lazaro
 */
public enum DisplayMode {
    FIXED(1, 548), FULL_SCREEN(3, 746), RESIZABLE(2, 746);

    public static DisplayMode forValue(int value) {
        switch (value) {
            case 1:
                return FIXED;
            case 2:
                return RESIZABLE;
            case 3:
                return FULL_SCREEN;
        }
        return null;
    }

    private int value;
    private int interfaceId;

    private DisplayMode(int value, int interfaceId) {
        this.value = value;
        this.interfaceId = interfaceId;
    }

    public int getInterfaceId() {
        return interfaceId;
    }

    public int intValue() {
        return value;
    }
}
