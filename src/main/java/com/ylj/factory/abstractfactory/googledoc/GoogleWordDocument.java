package com.ylj.factory.abstractfactory.googledoc;

import com.ylj.factory.abstractfactory.WordDocument;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author : ylj
 * create at:  2022/7/23
 */
public class GoogleWordDocument implements WordDocument {

    @Override
    public void save(Path path) throws IOException {
        System.out.println("[WORD] google-昂贵可靠的输出word文本");
    }
}