package com.example.design_patterns_sp_nbg.entities;

public class Paragraph {
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
}
