package com.example.design_patterns_sp_nbg.entities;

public class Image implements Element {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public void print() {
        System.out.println("Image: " + imageName);
    }
}
