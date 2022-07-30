package com.ylj.decorator;

/**
 * 抽象的装饰器 聚合了被包装的本质主体
 *
 * @author : ylj
 * create at:  2022/7/30
 */
public abstract class AbstractDecorator implements IComponent {

    private IComponent component;

    public AbstractDecorator(IComponent component) {
        this.component = component;
    }

    @Override
    public void query() {
        System.out.println("[包装器] -----包装过程开始----");
        doQuery();
        System.out.println("[包装器] 本质开始执行");
        component.query();
        System.out.println("[包装器] 本质执行结束");
        System.out.println("[包装器] -----包装过程结束----");
    }

    protected abstract void doQuery();
}