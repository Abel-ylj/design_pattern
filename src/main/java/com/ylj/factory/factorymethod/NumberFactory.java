package com.ylj.factory.factorymethod;

/**
 * 抽象工厂的接口,这个例子的产品是Number
 * ┌─────────────┐      ┌─────────────┐
 * │   Product   │      │   Factory   │
 * └─────────────┘      └─────────────┘
 *        ▲                    ▲
 *        │                    │
 * ┌─────────────┐      ┌─────────────┐
 * │ ProductImpl │<─ ─ ─│ FactoryImpl │
 * └─────────────┘      └─────────────┘
 */
public interface NumberFactory {
    Number parse(String s);

    // 获取工厂实例:
    static NumberFactory getFactory() {
        return impl;
    }

    static NumberFactory impl = new NumberFactoryImpl();
}
