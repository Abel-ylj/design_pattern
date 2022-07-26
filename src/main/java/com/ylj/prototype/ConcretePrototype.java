package com.ylj.prototype;

/**
 * @author : ylj
 * create at:  2022/7/25
 */
public class ConcretePrototype extends Prototype {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype protoObject = new ConcretePrototype();
        protoObject.setName("test");
        Prototype clone = protoObject.clone();
        System.out.println("done");
    }
}