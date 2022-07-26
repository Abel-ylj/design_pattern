package com.ylj.prototype;

/**
 * 抽象原型
 *
 * @author : ylj
 * create at:  2022/7/25
 */
public abstract class Prototype implements Cloneable{

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}