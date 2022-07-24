package com.ylj.factory.staticfactory;

import java.math.BigDecimal;

/**
 * 静态工厂
 * 这种简化的使用静态方法创建产品的方式称为静态工厂方法（Static Factory Method）,
 * 而没有抽出抽象工厂和抽象产品这层(有抽象代表要屏蔽变更--加入了拓展点)
 *
 * @author : ylj
 * create at:  2022/7/23
 */
public class NumberFactory {
    public static Number parse(String s) {
        return new BigDecimal(s);
    }
}