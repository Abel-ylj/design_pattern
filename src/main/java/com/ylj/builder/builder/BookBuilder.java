package com.ylj.builder.builder;

import com.ylj.builder.comp.MediaItem;
import com.ylj.builder.media.Book;
import com.ylj.builder.media.Media;

/**
 * @author : ylj
 * create at:  2022/7/24
 */
public class BookBuilder extends MediaBuilder {

    private Book b;

    @Override
    public void buildBase() {
        System.out.println("构建[book]框架 ");
        b = new Book();
    }

    @Override
    public void addMedaItem(MediaItem item) {
        System.out.println("增加[chapter] " + item);
        b.add(item);
    }

    @Override
    public Media getFinishedMedia() {
        return b;
    }
}