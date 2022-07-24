package com.ylj.polymorphism;

/**
 * @author : ylj
 * create at:  2022/5/14
 */
class StaticSuper {
    public static String staticGet() {
        return "Base staticGet";
    }

    public String dynamicGet() {
        return "Base dynamicGet";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Derived staticGet";
    }

    @Override
    public String dynamicGet() {
        return "Derived dynamicGet";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper staticSuper = new StaticSub();
//        staticSuper.staticGet();
        System.out.println(staticSuper.dynamicGet());
    }
}