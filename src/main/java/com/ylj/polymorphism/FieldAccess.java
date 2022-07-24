package com.ylj.polymorphism;

/**
 * @author : ylj
 * create at:  2022/5/14
 */
class Super {
    public int field = 11;
    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;
    @Override
    public int getField() {
        return field;
    }
    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();// upcast
        System.out.println("sup.field =" + sup.field); // 11
        System.out.println("sup.getField =" + sup.getField()); // 1

        Sub sub = new Sub();
        System.out.println("sub.getSuperField = " + sub.getSuperField()); // 11


    }
}