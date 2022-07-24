package com.ylj.factory.singlefactory;

/**
 * @author : ylj
 * create at:  2022/7/23
 */
public class SecurityRule implements Rule {

    @Override
    public boolean check(String string) {
        System.out.println("安全检查通过");
        return true;
    }
}