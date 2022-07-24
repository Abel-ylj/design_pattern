package com.ylj.polymorphism;

/**
 * 有继承层次的对象创建和销毁顺序说明
 * @author : ylj
 * create at:  2022/5/14
 */
class Characteristic {
    private String s;
    public Characteristic(String s) {
        this.s = s;
        System.out.println("Characteristic-创建 " + s);
    }

    protected void dispose() {
        System.out.println("Characteristic-释放资源 " + s);
    }
}

class Description {
    private String s;
    public Description(String s) {
        this.s = s;
        System.out.println("Description-创建 " + s);
    }
    protected void dispose() {
        System.out.println("Description-释放资源 " + s);
    }
}

class LivingCreature {
    private Characteristic p = new Characteristic("is alive");
    private Description t = new Description("Basic living Creature");

    public LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose() {
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("Animal not vegetable");

    public Animal() {
        System.out.println("Animal()");
    }
    @Override
    protected void dispose() {
        System.out.println("Animal dispose()");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");

    public Amphibian() {
        System.out.println("Amphibian()");
    }

    @Override
    protected void dispose() {
        System.out.println("Amphibian dispose()");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}


public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");

    public Frog() {
        System.out.println("Frog()");
    }
    @Override
    protected void dispose() {
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog f = new Frog();
        System.out.println("开始销毁frog");
        f.dispose();
    }
}