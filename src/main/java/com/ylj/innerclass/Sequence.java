package com.ylj.innerclass;

/**
 * @author : ylj
 * create at:  2022/5/21
 */
abstract class Selector {
    abstract Object next();
    abstract boolean hasNext();
}

public class Sequence {
    private char[] array = {'a','b','c'};
    private int len = array.length;

    private class SortedSelector extends Selector {
        private int cursor = -1;
        @Override
        Object next() {
            return array[cursor];
        }

        @Override
        boolean hasNext() {
            return ++cursor < len;
        }
    }

    Selector sortedSelect() {
        return new SortedSelector();
    }

}