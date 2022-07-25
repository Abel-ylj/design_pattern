package com.ylj.builder.comp;

/**
 * 媒体的组成Item
 *
 * @author : ylj
 * create at:  2022/7/24
 */
public class MediaItem {

    private String s;
    public MediaItem(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "MediaItem{" +
                "s='" + s + '\'' +
                '}';
    }
}