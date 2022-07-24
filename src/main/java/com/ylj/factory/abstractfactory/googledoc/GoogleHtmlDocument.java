package com.ylj.factory.abstractfactory.googledoc;

import com.ylj.factory.abstractfactory.HtmlDocument;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author : ylj
 * create at:  2022/7/23
 */
public class GoogleHtmlDocument implements HtmlDocument {

    @Override
    public String toHtml() {
        return "优质的html文本";
    }

    @Override
    public void save(Path path) throws IOException {
        System.out.println("[HTML] google-昂贵可靠的输出html");
    }

    @Override
    public String toString() {
        return toHtml();
    }
}