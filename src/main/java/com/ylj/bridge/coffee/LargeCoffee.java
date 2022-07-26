package com.ylj.bridge.coffee;

import com.ylj.bridge.ICoffeeAdditives;
import com.ylj.bridge.RefinedCoffee;

/**
 * 大杯的咖啡
 *
 * @author : ylj
 * create at:  2022/7/26
 */
public class LargeCoffee extends RefinedCoffee {

    public LargeCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    @Override
    public void orderCoffee(int count) {
        System.out.println(String.format("[下单] 大杯咖啡 数量:%d", count));
    }
}