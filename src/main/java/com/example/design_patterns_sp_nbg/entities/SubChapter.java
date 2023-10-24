package com.example.design_patterns_sp_nbg.entities;

import java.util.ArrayList;

public class SubChapter {
    private String name;
    private ArrayList<element> elements = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String text) {
        Paragraph paragraph = new Paragraph(text);
        elements.add(paragraph);
    }

    public void createNewImage(String imageName) {
        Image image = new Image(imageName);
        elements.add(image);
    }

    public void createNewTable(String title) {
        Table table = new Table(title);
        elements.add(table);
    }

    public void print() {
        System.out.println("Subchapter: " + name);
        for (element element : elements) {
            element.print();
        }
    }

}
