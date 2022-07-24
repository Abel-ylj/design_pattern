package com.ylj.factory.abstractfactory.fastdoc;

import com.ylj.factory.abstractfactory.HtmlDocument;

import java.io.IOException;
import java.nio.file.Path;

/**
 * fastdoc公司产品
 *
 * @author : ylj
 * create at:  2022/7/23
 */
public class FastDocHtmlDocument implements HtmlDocument {

    @Override
    public String toHtml() {
        return null;
    }

    @Override
    public void save(Path path) throws IOException {
        System.out.println("[html] fastdoc-廉价快捷的保存");
    }
}