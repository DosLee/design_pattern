package com.lil.design.pattern.creation.implefactory;

/**
 * 描述:
 *
 * @author lil
 * @create 2018-09-26 22:37
 */
public class VideoFactory {
    public Video getVideo(Class c) {
        // v1.0
        //if ("java".equalsIgnoreCase(type)) {
        //    return new JavaVideo();
        //} else if ("python".equalsIgnoreCase(type)) {
        //    return new PythonVideo();
        //} else {
        //    return null;
        //}

        // v2.0
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return video;
    }
}
