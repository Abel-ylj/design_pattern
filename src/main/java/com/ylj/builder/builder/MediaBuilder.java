package com.ylj.builder.builder;

import com.ylj.builder.comp.MediaItem;
import com.ylj.builder.media.Media;

/**
 * 抽象建造者, 规范了所有媒体Media构建的步骤
 *
 * @author : ylj
 * create at:  2022/7/24
 */
public abstract class MediaBuilder {

    /**
     * 拿到半成品对象
     */
    public abstract void buildBase();

    /**
     * 增加组件
     *
     * @param item
     */
    public abstract void addMedaItem(MediaItem item);

    /**
     * 交付成品
     *
     * @return
     */
    public abstract Media getFinishedMedia();

}