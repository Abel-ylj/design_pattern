package com.ylj.innerclass;

/**
 * @author : ylj
 * create at:  2022/5/20
 */
interface A {}
interface B {}

class X implements  A, B {

}

class Y implements A {
    B makeB() {
        // Anonymous inner class; 匿名内部类
        return new B() {};
    }
}

public class MultiInterfaces {
    static void takesA(A a) {}
    static void takesB(B b) {}
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}