package com.ylj.singleton.lazy;

import java.util.HashMap;

/**
 * @author : ylj
 * create at:  2022/7/24
 */
public class SingletonParent {

    // 注册表
    private static HashMap sinRegistry = new HashMap();
    static private SingletonParent s = new SingletonParent();

    // 受保护的构造方法, 允许被继承
    protected SingletonParent() {}

    public static SingletonParent getInstance(String name) {
        if (name == null) {
            name = "SingletonParent";
        }

        // 从内部注册表获取一个实例返回
        if (sinRegistry.get(name) == null) {
            try {
                sinRegistry.put(name, Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (SingletonParent)(sinRegistry.get(name));
    }

    public void test() {
        System.out.println("getClass success!");
    }
}