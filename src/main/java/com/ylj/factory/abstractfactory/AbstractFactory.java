package com.ylj.factory.abstractfactory;

import com.ylj.factory.abstractfactory.fastdoc.FastFactory;
import com.ylj.factory.abstractfactory.googledoc.GoogleFactory;

/**
 * 抽象工厂
 *
 * @author : ylj
 * create at:  2022/7/23
 */
public interface AbstractFactory {


    default void init() {
        System.out.println("[初始化]-AbstractFactory-" + this.getClass().getSimpleName());
    }

    // 维护单例
    public AbstractFactory fastFactory   =  new FastFactory();
    public AbstractFactory googleFactory =  new GoogleFactory();

    static AbstractFactory createFactory(String factoryName) {
        if ("FAST".equalsIgnoreCase(factoryName)) {
            return fastFactory;
        }

        if ("GOOGLE".equalsIgnoreCase(factoryName)) {
            return googleFactory;
        }
        return null;
    }

    // 创建Html文档:
    HtmlDocument createHtml(String md);

    // 创建Word文档:
    WordDocument createWord(String md);
}