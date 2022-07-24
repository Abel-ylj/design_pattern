package com.ylj.innerclass;

/**
 * @author : ylj
 * create at:  2022/5/20
 */
class D {}  // 具体类
abstract class E {} // 抽象类
class Z extends D {
    E makeE() {
        return new E() {}; // Z对象要提供E的视图,但是又没有多继承,用内部类比较合适
    }
}

public class MultiImplementation {
    static void takesD(D d) {}
    static void takesE(E e) {}
    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}