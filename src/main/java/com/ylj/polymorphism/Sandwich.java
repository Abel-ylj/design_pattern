package com.ylj.polymorphism;

/**
 * @author : ylj
 * create at:  2022/5/14
 */
class Meal {
    private String b = genString();

    static {
        System.out.println("Meal静态块初始化");
    }
    public Meal() {
        System.out.println("Meal() b=" + b);
    }

    private String genString() {
        System.out.println("Meal 成员对象初始化");
        return "hello Meal";
    }
}

class Bread {
    public Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    public Cheese() {
        System.out.println("Cheese");
    }
}

class Lettuce {
    public Lettuce() {
        System.out.println("Lettuce");
    }
}

class Lunch extends Meal {
    private String b = genString();
    static {
        System.out.println("Lunch静态代码块初始化");
    }
    public Lunch() {
        System.out.println("Lunch() b=" + b);
    }
    private String genString() {
        System.out.println("Lunch 成员对象初始化");
        return "hello Lunch";
    }
}

class PortableLunch extends Lunch {
    public PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}