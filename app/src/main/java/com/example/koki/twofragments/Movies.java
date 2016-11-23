package com.example.koki.twofragments;

/**
 * Created by koki on 19/11/2016.
 */

public class Movies {
    String title;
    String imageSrc;

    public Movies(String title, String imageSrc) {
        this.title = title;
        this.imageSrc = imageSrc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }
}