package com.ylj.factory.abstractfactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * 抽象产品 word文档
 */
public interface WordDocument {
    void save(Path path) throws IOException;
}
