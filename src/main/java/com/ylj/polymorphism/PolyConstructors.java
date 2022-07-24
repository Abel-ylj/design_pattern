package com.ylj.polymorphism;

/**
 * @author : ylj
 * create at:  2022/5/14
 */
class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    public Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    public RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}