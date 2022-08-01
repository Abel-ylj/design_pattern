package com.ylj.iterator;

/**
 * @author : ylj
 * create at:  2022/8/1
 */
public class Client {
    public static void main(String[] args) {
        // 客户端遍历容器时,不需要关心容器的细节.
        // 迭代器是自定义List的内部类, 持有了宿主对象的引用, (内部类是java实现的闭包)
        MyList myList = new MyList(10);
        Iterator it = myList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }
    }
}