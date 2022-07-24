package com.ylj.innerclass.controller;

/**
 * 描述事件的抽象结构
 * @author : ylj
 * create at:  2022/5/21
 */
public abstract class Event {
    // 事件的触发时间
    private long eventTime;
    // 事件触发的延迟时间
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() { // Allows restarting
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}