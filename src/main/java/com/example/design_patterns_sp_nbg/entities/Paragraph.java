package com.example.design_patterns_sp_nbg.entities;

public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }

    public void add(Element element) {
    }

    public void remove(Element element) {

    }

    public Element getElement(int index) {
        return null;
    }
}
