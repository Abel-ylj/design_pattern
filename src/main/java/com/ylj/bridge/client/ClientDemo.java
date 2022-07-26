package com.ylj.bridge.client;

import com.ylj.bridge.RefinedCoffee;
import com.ylj.bridge.additive.Milk;
import com.ylj.bridge.coffee.LargeCoffee;

/**
 * @author : ylj
 * create at:  2022/7/26
 */
public class ClientDemo {

    public static void main(String[] args) {
        // 只依赖抽象层
        RefinedCoffee largeWithMilk = new LargeCoffee(new Milk());
        largeWithMilk.orderCoffee(2);
        largeWithMilk.make();
        largeWithMilk.checkQuality();
    }
}