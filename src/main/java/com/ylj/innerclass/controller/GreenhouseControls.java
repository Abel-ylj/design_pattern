package com.ylj.innerclass.controller;

/**
 * @author : ylj
 * create at:  2022/5/21
 */
public class GreenhouseControls extends Controller {
    // 灯泡控制字段
    private boolean light = false;
    // 亮灯事件
    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            // Put hardware control code to physically turn on the light
            light = true;
        }
        @Override
        public String toString() {
            return "Light is on";
        }
    }
    // 关灯事件
    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            light = false;
        }
    }

    // 浇水事件
    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            water = true;
        }
        @Override
        public String toString() {
            return "Greenhouse water is on";
        }
    }
    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            water = false;
        }
        @Override
        public String toString() {
            return "Greenhouse water is off";
        }
    }

    // 重启事件
    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event event : eventList) {
                addEvent(event);
            }
        }

        @Override
        public void action() {
            for (Event e : eventList) {
                e.start(); // rerun each event
                addEvent(e);
            }
        }
        @Override
        public String toString() {
            return "Restarting system";
        }
    }
}