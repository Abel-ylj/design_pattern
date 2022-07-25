package com.ylj.builder;

import com.ylj.builder.builder.MediaBuilder;
import com.ylj.builder.comp.MediaItem;
import com.ylj.builder.media.Media;

import java.util.Iterator;
import java.util.List;

/**
 * 指导角色, 也叫上下文,
 * 向内依赖抽象层, 抽象层向下承接具体的拓展
 * 向外对外部客户端开放
 *
 * @author : ylj
 * create at:  2022/7/24
 */
public class MediaDirector {

    private MediaBuilder mb;

    public MediaDirector(MediaBuilder mb) {
        this.mb = mb;
    }

    // 指导者定制构建过程
    public Media produceMedia(List input) {
        // 获取半成品对象
        mb.buildBase();

        // 填充组件
        Iterator iterator = input.iterator();
        while (iterator.hasNext()) {
            MediaItem next = (MediaItem)iterator.next();
            mb.addMedaItem(next);
        }

        // 返回成品
        return mb.getFinishedMedia();
    }
}