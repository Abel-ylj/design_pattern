package com.ylj.factory.singlefactory;

/**
 * 简单工厂模式(静态工厂方法)的客户端
 * 优点: 只依赖 [具体工厂] 和 [抽象产品], 产品是该模式的拓展点
 *
 * @author : ylj
 * create at:  2022/7/23
 */
public class ClientDemo {
    public static void main(String[] args) {
        // 待检查的文本
        String pendingContent = "这是一段需要检查的文本";

        // 从简单工厂拿对象
        Rule rule = RuleFactory.create("Content");

        // 检查内容
        rule.check(pendingContent);
    }
}