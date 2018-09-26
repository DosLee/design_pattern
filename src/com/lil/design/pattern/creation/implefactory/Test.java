package com.lil.design.pattern.creation.implefactory;

/**
 * 描述:
 *
 * @author lil
 * @create 2018-09-26 22:17
 */
public class Test {
    public static void main(String[] args) {
        //Video video = new JavaVideo();
        //video.product();

        // v1.0
        //VideoFactory factory = new VideoFactory();
        //Video videos = factory.getVideo("java");
        //if (videos == null) {
        //    return;
        //}
        //videos.product();

        // 利用反射获取要加载的类
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo(JavaVideo.class);
        video.product();
    }
}
