package com.ylj.polymorphism;

/**
 * @author : ylj
 * create at:  2022/5/13
 */
class Shape {
    public void draw() {}
    public void erase() {}
    public void info() {
        System.out.println("Shape.info()");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}

public class RandomShapeGenerator {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.erase();
        shape.info();
    }
}