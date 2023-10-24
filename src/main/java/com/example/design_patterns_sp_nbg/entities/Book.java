package com.example.design_patterns_sp_nbg.entities;

import java.util.ArrayList;

public class Book {
    private String Title;
    private ArrayList<Author> authors = new ArrayList<>();
    private ArrayList<Chapter> chapters = new ArrayList<>();
    private TableOfContents tableOfContents = new TableOfContents();

    public Book(String title) {
        Title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String name) {
        Chapter chapter = new Chapter(name);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public void print() {
        System.out.println("Book: " + Title);
        for (Author author : authors) {
            author.print();
        }
        tableOfContents.print();
        for (Chapter chapter : chapters) {
            chapter.print();
        }
    }


    public Chapter getChapter(int indexChapterOne) {
        return chapters.get(indexChapterOne);
    }
}
