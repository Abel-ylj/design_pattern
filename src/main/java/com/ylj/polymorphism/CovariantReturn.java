package com.ylj.polymorphism;

/**
 * @author : ylj
 * create at:  2022/5/14
 */
class Grain {
    @Override
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    @Override
    Wheat process() {
        return new Wheat();
    }
}

public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        System.out.println("-----------------");
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }
}