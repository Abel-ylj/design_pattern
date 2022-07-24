package com.ylj.factory.abstractfactory.client;

import com.ylj.factory.abstractfactory.AbstractFactory;
import com.ylj.factory.abstractfactory.HtmlDocument;
import com.ylj.factory.abstractfactory.WordDocument;

import java.io.IOException;

/**
 * 该模块的客户端代码demo
 *
 * @author : ylj
 * create at:  2022/7/23
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        // 从配置中心拿配置
        String factoryName = trieveFactoryConf();

        // 根据配置取具体工厂
        AbstractFactory factory = AbstractFactory.createFactory(factoryName);

        // 具体工厂生成html文档
        HtmlDocument html = factory.createHtml("测试md");
        html.save(null);

        // 具体工厂生成word文档
        WordDocument word = factory.createWord("测试word");
        word.save(null);
    }

    /**
     * 从配置中心拿配置
     * @return
     */
    private static String trieveFactoryConf() {
        return "GOOGLE"; // GOOGLE
    }
}