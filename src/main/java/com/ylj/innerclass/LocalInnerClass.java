package com.ylj.innerclass;

/**
 * @author : ylj
 * create at:  2022/5/21
 */
interface Counter {
    int next();
}
public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name) {
        // A local inner class; 局部内部类
        class LocalCounter implements Counter {
            public LocalCounter() {
                // 局部内部类可以有构造
                System.out.println("LocalCounter()");
            }

            public int next() {
                System.out.println(name); // access local final
                return count++;  // access outer field;
            }
        }
        return new LocalCounter(); // 返回了局部具名内部类
    }

    // The same thing with an anonymous inner class 和匿名内部类相同的是
    Counter getCounter2(final String name) {
        return new Counter() {
            {
                System.out.println("匿名内部类Counter()");
            }
            public int next() {
                System.out.println(name); // can access local final
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter c1 = lic.getCounter("局部具名内部类");
        Counter c2 = lic.getCounter2("匿名内部类");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        System.out.println("---------");
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }

}