package com.ylj.builder.builder;

import com.ylj.builder.comp.MediaItem;
import com.ylj.builder.media.Magazine;
import com.ylj.builder.media.Media;

/**
 * @author : ylj
 * create at:  2022/7/24
 */
public class MagazineBuilder extends MediaBuilder {
    private Magazine m;

    @Override
    public void buildBase() {
        System.out.println("构建[Magazine]框架");
        m = new Magazine();
    }

    @Override
    public void addMedaItem(MediaItem item) {
        System.out.println("添加[Article]");
        m.add(item);
    }

    @Override
    public Media getFinishedMedia() {
        return m;
    }
}