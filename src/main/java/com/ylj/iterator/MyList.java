package com.ylj.iterator;

import java.util.NoSuchElementException;

/**
 * @author : ylj
 * create at:  2022/8/1
 */
public class MyList {

    private Object[] arr;

    public MyList(int size) {
        arr = new Object[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
    }

    public int size() {
        return arr.length;
    }

    public Object get(int idx) {
        return arr[idx];
    }


    // 内部迭代器, 持有了宿主对象的引用, 闭包
    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator {

        int cursor  = 0;
        int lastRet = -1;
//        int expectedModCount = modCount;

        @Override
        public boolean hasNext() {
            return cursor != size();
        }

        @Override
        public Object next() {
            try {
                Object next = get(cursor);
                lastRet = cursor++;
                return next;
            } catch (IndexOutOfBoundsException e) {
                throw new NoSuchElementException();
            }
        }

        @Override
        public void remove() {
            if (lastRet == -1) {
                throw new IllegalStateException();
            }
            if (lastRet < cursor) {
                cursor--;
            }
            lastRet = -1;
        }
    }
}