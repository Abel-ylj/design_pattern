package com.ylj.factory.singlefactory;

/**
 * @author : ylj
 * create at:  2022/7/23
 */
public class AuthorRule implements Rule {

    @Override
    public boolean check(String str) {
        System.out.println("检查作者通过");
        return true;
    }
}