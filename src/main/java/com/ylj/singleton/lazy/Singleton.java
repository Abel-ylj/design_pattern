package com.ylj.singleton.lazy;

/**
 * 懒汉式
 *
 * @author : ylj
 * create at:  2022/7/24
 */
public class Singleton {

    private static Singleton instance = null;

    // 对外关闭直接创建
    private Singleton() {}

    // 对外接口, NOTE : 上锁
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}