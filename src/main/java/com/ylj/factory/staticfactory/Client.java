package com.ylj.factory.staticfactory;

/**
 * @author : ylj
 * create at:  2022/7/23
 */
public class Client {
    public static void main(String[] args) {
        Number concretProduct = NumberFactory.parse("123");
        System.out.println(concretProduct);
    }
}