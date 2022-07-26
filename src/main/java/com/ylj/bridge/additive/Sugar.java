package com.ylj.bridge.additive;

import com.ylj.bridge.ICoffeeAdditives;

/**
 * @author : ylj
 * create at:  2022/7/26
 */
public class Sugar implements ICoffeeAdditives {

    @Override
    public void addSomething() {
        System.out.println("加糖");
    }
}