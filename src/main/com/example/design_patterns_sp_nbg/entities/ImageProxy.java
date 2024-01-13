package com.example.design_patterns_sp_nbg.entities;

public class ImageProxy implements Element {
    private String name;
    private Image image = null;

    public ImageProxy(String name) {
        this.name = name;
    }



    @Override
    public void print() {
        if (this.image == null) {
            this.image = new Image(this.name);
        }
        this.image.print();
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
