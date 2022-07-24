package com.ylj.innerclass;

/**
 * @author : ylj
 * create at:  2022/5/19
 */
public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination {
        private String label;

        public ParcelDestination(String whereTo) {
            this.label = whereTo;
        }

        public String readLabel() {
            return label;
        }
        // Nested classes can contain other static elements
        public static void f() {}

        static int x = 10;

        static class AnotherLevel {
            public static void f() {}
            static int x = 10;
        }
    }

    // 开放内部类接口
    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tesla");
    }

}