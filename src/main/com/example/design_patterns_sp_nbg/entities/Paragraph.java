package com.example.design_patterns_sp_nbg.entities;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void print() {
        if (alignStrategy == null) {
            System.out.println("Paragraph: " + text);
            return;
        } else {
            System.out.println("Paragraph: " + alignStrategy.render(this));
        }
    }

    public void add(Element element) {
    }

    public void remove(Element element) {

    }

    public Element getElement(int index) {
        return null;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }
}
