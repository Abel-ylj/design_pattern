package com.ylj.innerclass.controller;

/**
 * @author : ylj
 * create at:  2022/5/21
 */
public class GreenhouseController {
    // 面向顶层抽象进行编码
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        // instead of hard-writing 硬编码, you could parse
        // configuration info form a text file here
        gc.addEvent(gc.new LightOn(100));

        Event[] eventList = {
                gc.new LightOff(200),
                gc.new WaterOn(300),
                gc.new WaterOff(500)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        gc.run();
    }
}