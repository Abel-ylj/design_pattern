package com.ylj.decorator.client;

import com.ylj.decorator.ConcreteComponent;
import com.ylj.decorator.IComponent;
import com.ylj.decorator.decorator.ConcreteDecoratorA;
import com.ylj.decorator.decorator.ConcreteDecoratorB;

/**
 * @author : ylj
 * create at:  2022/7/30
 */
public class ConcreteClient {
    public static void main(String[] args) {
        methodB();
    }

    static void methodB() {
        // 创建未包装的本体, 依赖抽象, new的过程可以IoC
        IComponent component = new ConcreteComponent();

        // 包装A的本体, 客户端依赖抽象, new的组装对象可以IoC
        IComponent comp = new ConcreteDecoratorB(component);
        comp.query();
    }

    /**
     * A包装器测试
     */
    static void methodA() {
        // 创建未包装的本体, 依赖抽象, new的过程可以IoC
        IComponent component = new ConcreteComponent();

        // 包装A的本体, 客户端依赖抽象, new的组装对象可以IoC
        IComponent comp = new ConcreteDecoratorA(component);
        comp.query();
    }
}