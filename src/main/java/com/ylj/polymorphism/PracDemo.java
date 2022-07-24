package com.ylj.polymorphism;

/**
 * @author : ylj
 * create at:  2022/5/13
 */
class Base {
    public void method1() {
        System.out.println("Base.method1()");
        method2();
    }
    public void method2() {
        System.out.println("Base.metho2()");
    }
}
class Son extends Base {
    @Override
    public void method2() {
        System.out.println("Son.method2()");
    }
}
public class PracDemo {
    public static void main(String[] args) {
        Son son = new Son();
        son.method1();
    }
}