package com.ylj.factory.abstractfactory.googledoc;

import com.ylj.factory.abstractfactory.AbstractFactory;
import com.ylj.factory.abstractfactory.HtmlDocument;
import com.ylj.factory.abstractfactory.WordDocument;

/**
 * @author : ylj
 * create at:  2022/7/23
 */
public class GoogleFactory implements AbstractFactory {

    public GoogleFactory() {
        init();
    }

    @Override
    public HtmlDocument createHtml(String md) {
        return new GoogleHtmlDocument();
    }

    @Override
    public WordDocument createWord(String md) {
        return new GoogleWordDocument();
    }
}