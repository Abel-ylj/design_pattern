package com.ylj.polymorphism;

/**
 * @author : ylj
 * create at:  2022/5/14
 */

class BaseC {
    private void f() {
        System.out.println("BaseC private f()");
    }
}

class DerivedC extends BaseC {
    public void f() {
        System.out.println("Derived public f()");
    }
}

public class PrivatePrac {
    public static void main(String[] args) {
        BaseC bc = new DerivedC();
    }
}