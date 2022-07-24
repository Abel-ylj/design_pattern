package com.ylj.innerclass;

/**
 * @author : ylj
 * create at:  2022/5/21
 */
interface U {
    void m1();
    void m2();
    void m3();
}

class C {
    private String tag;

    public C(String tag) {
        this.tag = tag;
    }

    U gen() {
        return new U() {
            public void m1() {
                System.out.println(" C.m1() -- tag: " + tag);
            }
            public void m2() {
                System.out.println("C.m2()");
            }
            public void m3() {
                System.out.println("C.m3()");
            }
        };
    }
}

class F {
    private U[] array = new U[10];
    private int cursor = 0;
    void add(U f) {
        array[cursor++] = f;
    }

    void travel() {
        for (int i = 0; i < cursor; i++) {
            array[i].m1();
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {
        C c1 = new C("one");
        C c2 = new C("two");
        C c3 = new C("three");
        F f = new F();
        f.add(c1.gen());
        f.add(c2.gen());
        f.add(c3.gen());
        f.travel();
    }
}