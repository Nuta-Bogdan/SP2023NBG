package com.example.design_patterns_sp_nbg.entities;

import java.util.ArrayList;

public class SubChapter {
    private String name;
    private ArrayList<Image> images = new ArrayList<>();
    private ArrayList<Paragraph> paragraphs = new ArrayList<>();
    private ArrayList<Table> tables = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String paragraphText) {
        Paragraph paragraph = new Paragraph(paragraphText);
        paragraphs.add(paragraph);
    }

    public void createNewImage(String imageName) {
        Image image = new Image(imageName);
        images.add(image);
    }

    public void createNewTable(String title) {
        Table table = new Table(title);
        tables.add(table);
    }

    public void print() {
        System.out.println("Subchapter: " + name);
        for (Paragraph paragraph : paragraphs) {
            paragraph.print();
        }
        for (Image image : images) {
            image.print();
        }
        for (Table table : tables) {
            table.print();
        }
    }


}
