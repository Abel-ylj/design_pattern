package com.ylj.factory.factorymethod;

/**
 * 客户端的使用只依赖抽象, 具体的工厂可以在服务端代码(即创建产品的代码)中修改而不影响客户端[解耦]
 *
 * @author : ylj
 * create at:  2022/7/23
 */
public class Client {
    public static void main(String[] args) {
        // 1.获取到抽象工厂
        NumberFactory concretFactory = NumberFactory.getFactory();
        // 2.让抽象工厂生产抽象产品
        Number concretProduct = concretFactory.parse("123");

//        Class<NumberFactory> clazz = Class.forName("xxxxxx.xxx.xx");
//        clazz.newInstance();
    }
}