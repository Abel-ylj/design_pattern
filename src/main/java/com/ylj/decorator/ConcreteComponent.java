package com.ylj.decorator;

/**
 * 具体的组件
 *
 * @author : ylj
 * create at:  2022/7/30
 */
public class ConcreteComponent implements IComponent {

    @Override
    public void query() {
        System.out.println("[query]: 具体的组件执行!!!");
    }
}