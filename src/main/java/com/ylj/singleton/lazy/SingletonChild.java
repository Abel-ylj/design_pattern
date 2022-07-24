package com.ylj.singleton.lazy;

/**
 * 调用了父类的静态方法, 从注册表中缓存单实例
 *
 * @author : ylj
 * create at:  2022/7/24
 */
public class SingletonChild extends SingletonParent {

    public SingletonChild() {}

    public static SingletonChild getInstance() {
        return (SingletonChild)SingletonParent.getInstance("SingletonChild");
    }

    @Override
    public void test() {
        System.out.println("get Class success111!");
    }
}