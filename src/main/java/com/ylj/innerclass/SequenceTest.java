package com.ylj.innerclass;

/**
 * @author : ylj
 * create at:  2022/5/21
 */
public class SequenceTest {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        Selector selector = sequence.sortedSelect();
        while (selector.hasNext()) {
            Object next = selector.next();
            System.out.println(next);
        }
    }
}