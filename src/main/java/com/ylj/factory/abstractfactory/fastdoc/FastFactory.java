package com.ylj.factory.abstractfactory.fastdoc;

import com.ylj.factory.abstractfactory.AbstractFactory;
import com.ylj.factory.abstractfactory.HtmlDocument;
import com.ylj.factory.abstractfactory.WordDocument;

/**
 * fastdoc公司产品的工厂类
 *
 * @author : ylj
 * create at:  2022/7/23
 */
public class FastFactory implements AbstractFactory {

    public FastFactory() {
        init();
    }

    @Override
    public HtmlDocument createHtml(String md) {
        return new FastDocHtmlDocument();
    }

    @Override
    public WordDocument createWord(String md) {
        return new FastDocWordDoucment();
    }
}