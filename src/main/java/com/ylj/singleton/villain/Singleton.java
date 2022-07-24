package com.ylj.singleton.villain;

/**
 * 恶汉式常规写法
 *
 * @author : ylj
 * create at:  2022/7/24
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    // 对外提供
    public static Singleton getInstance() {
        return instance;
    }
}