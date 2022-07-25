package com.ylj.builder;

import com.ylj.builder.builder.BookBuilder;
import com.ylj.builder.comp.MediaItem;
import com.ylj.builder.media.Media;

import java.util.Arrays;
import java.util.List;

/**
 * 测试类
 *
 * @author : ylj
 * create at:  2022/7/24
 */
public class ClientTest {

    private List input = Arrays.asList(new MediaItem[] {
            new MediaItem("item1"),
            new MediaItem("itme2"),
            new MediaItem("itme3"),
            new MediaItem("itme4"),
    });

    public static void main(String[] args) {
        ClientTest client = new ClientTest();
        client.testBook();
    }

    void testBook() {
        MediaDirector buildBook = new MediaDirector(new BookBuilder());
        Media book = buildBook.produceMedia(input);
        System.out.println("book: " + book);
    }
}