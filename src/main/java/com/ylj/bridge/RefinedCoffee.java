package com.ylj.bridge;

import java.util.Random;

/**
 * 柄的矫正
 *
 * @author : ylj
 * create at:  2022/7/26
 */
public abstract class RefinedCoffee extends Coffee {

    public RefinedCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    /**
     * 矫正抽象角色_ 添加了检查添加剂的方法
     */
    public void checkQuality() {
        Random ran = new Random();
        System.out.println(String.format("%s 添加%s", additives.getClass().getSimpleName(), ran.nextBoolean() ? "太多" : "正常"));
    }
}