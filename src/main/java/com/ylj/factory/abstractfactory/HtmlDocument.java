package com.ylj.factory.abstractfactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * 抽象产品 html文档
 */
public interface HtmlDocument {
    String toHtml();
    void save(Path path) throws IOException;
}
