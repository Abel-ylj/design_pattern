package com.ylj.flyweight;

/**
 * 演示String 的设计是系统内享元的
 *
 * 享元: 以一个共享类来替代 系统中大量创建具有相同内容的'小类'
 *
 * 一个事务的组成 = [内蕴] + [外蕴],  内蕴: 事务深层次部分   外蕴: 外部展现部分
 *
 *  ┌──────────┐          ┌─────────────┐
 *  │  client  │          │baseflyweight│
 *  └─────┬────┘          └──────▲──────┘
 *        │                      │
 *        │                      │
 *        │                      │
 *  ┌─────▼─────┐          ┌─────┴─────┐
 *  │ flyweight │          │ concrete  │
 *  │  Factory  ├──────────▶ Flyweight │
 *  └───────────┘          └───────────┘
 * @author : ylj
 * create at:  2022/7/30
 */
public class TestPattern {
    public static void main(String[] args) {
        String n = "I LOVE JAVA";
        String m = "I LOVE JAVA";
        System.out.println(n == m);  // 预期输出true
    }
}