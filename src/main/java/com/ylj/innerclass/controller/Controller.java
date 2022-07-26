package com.ylj.innerclass.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : ylj
 * create at:  2022/5/21
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        // Make a copy so you're not modifying the list
        // while you're selecting the elements in it
        while (eventList.size() > 0) {
            for (Event e : new ArrayList<Event>(eventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}