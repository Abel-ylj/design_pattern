package com.ylj.singleton.villain;

/**
 * 单例工厂
 *
 * @author : ylj
 * create at:  2022/7/24
 */
public class SingletonFactory {

    // 关闭创建入口
    private SingletonFactory() {}

    // 强调使用的是单例模式
    private static class Singleton {
        private static final SingletonFactory INSTANCE = new SingletonFactory();
    }

    // 对外的接口
    public static SingletonFactory getInstance() {
        return SingletonFactory.Singleton.INSTANCE;
    }

}