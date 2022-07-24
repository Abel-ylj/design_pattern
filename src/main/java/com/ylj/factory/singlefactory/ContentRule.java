package com.ylj.factory.singlefactory;

/**
 * @author : ylj
 * create at:  2022/7/23
 */
public class ContentRule implements Rule {

    @Override
    public boolean check(String string) {
        System.out.println("检查内容通过");
        return true;
    }
}