package com.example.design_patterns_sp_nbg.entities;

import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String name) {
        SubChapter subChapter = new SubChapter(name);
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }

    public void print() {
        System.out.println("Chapter: " + name);
        for (SubChapter subChapter : subChapters) {
            subChapter.print();
        }
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return subChapters.get(indexSubChapterOneOne);
    }
}
