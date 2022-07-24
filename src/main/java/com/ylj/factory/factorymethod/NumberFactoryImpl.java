package com.ylj.factory.factorymethod;

import java.math.BigDecimal;

/**
 * 具体的工厂
 *
 * @author : ylj
 * create at:  2022/7/23
 */
public class NumberFactoryImpl implements NumberFactory {
    public Number parse(String s) {
        return new BigDecimal(s);
    }
}