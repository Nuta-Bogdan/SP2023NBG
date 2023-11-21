package com.example.design_patterns_sp_nbg.entities;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }

    }

    public String getImageName() {
        return imageName;
    }

    public void print() {
        System.out.println("Image: " + imageName);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element getElement(int index) {
        return null;
    }
}
