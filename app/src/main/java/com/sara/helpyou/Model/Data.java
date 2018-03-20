package com.sara.helpyou.Model;

/**
 * Created by sara on 3/20/2018.
 */

public class Data {

    int image;
    String name;

    public Data(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public Data() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
