package com.ylj.bridge;

/**
 * 桥接模式(柄体模式_有两个维度的拓展点)
 * 柄层_柄来控制体, 两个维度各自拓展
 *
 * 运用: 将同一个继承体系拆开(如COFFEE体系中 大杯加奶, 中杯加奶, 小杯加奶, 大杯加糖, 中杯加糖, 小杯加糖)
 *
 * 维度一: 咖啡的尺寸  大/中/小....
 *
 * 维度二: 食品添加剂  奶/糖/巧克力...
 *
 * @author : ylj
 * create at:  2022/7/26
 */
public abstract class Coffee {

    protected ICoffeeAdditives additives;

    /**
     * 体层的组合, 初始化时组合
     */
    public Coffee(ICoffeeAdditives additives){
        this.additives = additives;
    }


    /**
     * 第一个拓展点
     *
     * @param count
     */
    public abstract void orderCoffee(int count);


    /**
     * 柄层(抽象层)控制体层(实现层)动作
     */
    public void make() {
        additives.addSomething();
    }
}