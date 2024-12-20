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
package com.ziotic.engine.event;

import java.util.concurrent.ScheduledFuture;

import com.ziotic.Static;

/**
 * @author Lazaro
 */
public abstract class RecurringEvent extends Event {
    private int initialDelay;
    private int recurringDelay;
    private ExecutorType executor;
    private boolean running = true;
    protected ScheduledFuture<?> schedule = null;

    public RecurringEvent(int delay) {
        this(delay, delay);
    }

    public RecurringEvent(int initialDelay, int recurringDelay) {
        this(initialDelay, recurringDelay, ExecutorType.ASYNC_LOGIC);
    }

    public RecurringEvent(int delay, ExecutorType executor) {
        this(delay, delay, executor);
    }

    public RecurringEvent(int initialDelay, int recurringDelay, ExecutorType executor) {
        this.initialDelay = initialDelay;
        this.recurringDelay = recurringDelay;
        this.executor = executor;
    }

    public int initialDelay() {
        return initialDelay;
    }

    @Override
    public int delay() {
        return recurringDelay;
    }

    @Override
    public ExecutorType executor() {
        return executor;
    }

    @Override
    public boolean finished() {
        return !running;
    }

    public void changeDelay(int delay) {
        this.recurringDelay = delay;
        if (schedule != null) {
            schedule.cancel(false);
        }
        Static.engine.scheduleRecurringEvent(this);
    }

    public void stop() {
        running = false;
        if (schedule != null) {
            schedule.cancel(false);
        } else {
            Static.engine.submit(new DelayedEvent(30) {
                @Override
                public void run() {
                    stop();
                }
            });
        }
    }

    public void setSchedule(ScheduledFuture<?> schedule) {
        this.schedule = schedule;
    }
}
