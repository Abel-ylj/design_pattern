package com.ylj.facade;

/**
 * @author : ylj
 * create at:  2022/7/30
 */
public class FacadeDesc {
    /**
     * facade 模式是 子系统对客户端系统屏蔽复杂性的
     *
     * 客户端依赖facade,  facade依赖具体子系统,
     *
     * 开发时候,约定一个稳定的facade的接口
     *
     * 具体的子系统无论怎么变化, 只要facade不变, 都不用告知客户端.
     */
    public static void main(String[] args) {
        System.out.println("Facade模式用来客户端 与 复杂的子系统之间解耦!!!");
    }
}