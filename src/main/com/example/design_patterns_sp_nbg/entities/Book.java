package com.example.design_patterns_sp_nbg.entities;

import java.util.ArrayList;

public class Book {
    private String Title;
    private ArrayList<Author> authors = new ArrayList<>();

    private ArrayList<Element> content = new ArrayList<>();

    public Book(String title) {
        Title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void print() {
        System.out.println("Book: " + Title);
        for (Author author : authors) {
            author.print();
        }

        for (Element element : content) {
            element.print();
        }
    }

    public void addContent(Element element) {
        content.add(element);
    }

    public void removeContent(Element element) {
        content.remove(element);
    }

    public Element getElement(int index) {
        return content.get(index);
    }

}