package com.ylj.factory.singlefactory;

/**
 * 简单工厂
 * @author : ylj
 * create at:  2022/7/23
 */
public class RuleFactory {

   public static Rule create(String ruleName) {
        if ("Author".equalsIgnoreCase(ruleName)) {
            return new AuthorRule();
        }
        if ("Content".equalsIgnoreCase(ruleName)) {
            return new ContentRule();
        }
        if ("Security".equalsIgnoreCase(ruleName)) {
            return new SecurityRule();
        }
        throw new RuntimeException("不存在该规则");
    }
}