package com.ylj.factory.abstractfactory.fastdoc;

import com.ylj.factory.abstractfactory.WordDocument;

import java.io.IOException;
import java.nio.file.Path;

/**
 * fastdoc 公司word产品
 *
 * @author : ylj
 * create at:  2022/7/23
 */
public class FastDocWordDoucment implements WordDocument {

    @Override
    public void save(Path path) throws IOException {
        System.out.println("[word] fastdoc-廉价快捷的保存");
    }
}