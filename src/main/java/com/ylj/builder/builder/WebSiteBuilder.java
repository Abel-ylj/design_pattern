package com.ylj.builder.builder;

import com.ylj.builder.comp.MediaItem;
import com.ylj.builder.media.Media;
import com.ylj.builder.media.WebSite;

/**
 * @author : ylj
 * create at:  2022/7/24
 */
public class WebSiteBuilder extends MediaBuilder {

    private WebSite w;

    @Override
    public void buildBase() {
        System.out.println("构建[website]框架");
        w = new WebSite();
    }

    @Override
    public void addMedaItem(MediaItem item) {
        System.out.println("添加[webItem] " + item);
        w.add(item);
    }

    @Override
    public Media getFinishedMedia() {
        return w;
    }
}