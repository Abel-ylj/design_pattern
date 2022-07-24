package com.ylj.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : ylj
 * create at:  2022/5/14
 */
public class CovariantDemo {
    public static void main(String[] args) {
        test3();
    }

    public static void test1() {
        Number[] nums;
        Integer[] ints = new Integer[5];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }

        nums = ints;
        nums[0] = 1.1;
    }

    public static void test2() {
        List<Integer> myInts = new ArrayList<Integer>();
        myInts.add(1);
        myInts.add(2);
//        List<Number> myNums = myInts; //compiler error
//        myNums.add(3.14); //heap polution
    }

    public static void test3() {
        Integer[] myInts = {1,2,3,4,5};
        Long[] myLongs = {1L, 2L, 3L, 4L, 5L};
        Double[] myDoubles = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println(sum(myInts));
        System.out.println(sum(myLongs));
        System.out.println(sum(myDoubles));
    }

    static long sum(Number[] numbers) {
        long summation = 0;
        for(Number number : numbers) {
            summation += number.longValue();
        }
        return summation;
    }
}