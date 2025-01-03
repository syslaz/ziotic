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
package com.ziotic.engine;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.ziotic.engine.event.Event;
import com.ziotic.engine.event.RecurringEvent;
import com.ziotic.engine.login.LoginEngine;
import com.ziotic.utility.ManipulativeThreadFactory;

/**
 * @author Lazaro
 */
public final class Engine {
    private static final double THREAD_MULTIPLIER = 2.0;

    private boolean running = false;

    private LoginEngine loginEngine = new LoginEngine();

    private ScheduledExecutorService asyncLogic = Executors.newSingleThreadScheduledExecutor(new ManipulativeThreadFactory("async-logic", Thread.MAX_PRIORITY));
    private ScheduledExecutorService parallelLogic = Executors.newScheduledThreadPool((int) (Runtime.getRuntime().availableProcessors() * THREAD_MULTIPLIER), new ManipulativeThreadFactory("parallel-logic", 9));

    private Executor worldWorker = Executors.newFixedThreadPool((int) (Runtime.getRuntime().availableProcessors() * THREAD_MULTIPLIER), new ManipulativeThreadFactory("world-worker", 8));

    private ScheduledExecutorService serviceWorker = Executors.newSingleThreadScheduledExecutor(new ManipulativeThreadFactory("service-worker", 3));

    private Executor mapWorker = Executors.newFixedThreadPool(4, new ManipulativeThreadFactory("map-worker", 4));

    private ExecutorService cacheWorker = Executors.newFixedThreadPool(2, new ManipulativeThreadFactory("cache-worker", Thread.NORM_PRIORITY));

    private Executor linkWorker = Executors.newSingleThreadExecutor(new ManipulativeThreadFactory("link-worker", Thread.NORM_PRIORITY));

    private Queue<Event> eventQueue = new ArrayDeque<Event>();

    public void start() {
        running = true;
        for (Event t : eventQueue) {
            execute(t);
        }
        eventQueue.clear();
    }

    public Executor newNetworkingBossExecutor() {
        return Executors.newCachedThreadPool(new ManipulativeThreadFactory("nio-boss", Thread.MAX_PRIORITY));
    }

    public Executor newNetworkingWorkerExecutor() {
        return Executors.newCachedThreadPool(new ManipulativeThreadFactory("nio-worker", 7));
    }

    /**
     * This is used in the Engine and in the Event class ONLY!
     * <p/>
     * To schedule an event, use {@link #submit(com.ziotic.engine.event.Event)}
     *
     * @param event The event to be scheduled.
     */
    public void scheduleRecurringEvent(RecurringEvent event) {
        switch (event.executor()) {
            case ASYNC_LOGIC:
                event.setSchedule(asyncLogic.scheduleAtFixedRate(event, event.initialDelay(), event.delay(),
                        TimeUnit.MILLISECONDS));
                break;
            case PARALLEL_LOGIC:
                event.setSchedule(parallelLogic.scheduleAtFixedRate(event, event.initialDelay(), event.delay(), TimeUnit.MILLISECONDS));
                break;
            default:
                event.setSchedule(serviceWorker.scheduleAtFixedRate(event, event.initialDelay(), event.delay(), TimeUnit.MILLISECONDS));
                break;
        }
    }

    private void scheduleEvent(Event event) {
        switch (event.executor()) {
            case ASYNC_LOGIC:
                asyncLogic.schedule(event, event.delay(), TimeUnit.MILLISECONDS);
                break;
            case PARALLEL_LOGIC:
                parallelLogic.schedule(event, event.delay(), TimeUnit.MILLISECONDS);
                break;
            default:
                serviceWorker.schedule(event, event.delay(), TimeUnit.MILLISECONDS);
                break;
        }
    }

    public void submit(Event event) {
        if (running) {
            execute(event);
        } else {
            eventQueue.offer(event);
        }
    }

    private void execute(Event event) {
        if (event instanceof RecurringEvent) {
            scheduleRecurringEvent((RecurringEvent) event);
        } else {
            scheduleEvent(event);
        }
    }

    public LoginEngine getLoginEngine() {
        return loginEngine;
    }

    public ScheduledExecutorService getAsyncLogicExecutor() {
        return asyncLogic;
    }

    public ExecutorService getCacheWorker() {
        return cacheWorker;
    }

    public Executor getLinkWorker() {
        return linkWorker;
    }

    public void dispatchToWorldWorker(Runnable r) {
        worldWorker.execute(r);
    }

    public void dispatchToMapWorker(Runnable r) {
        mapWorker.execute(r);
    }

    public void dispatchToLinkWorker(Runnable r) {
        linkWorker.execute(r);
    }
}
